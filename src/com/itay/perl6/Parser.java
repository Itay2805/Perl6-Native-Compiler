package com.itay.perl6;

import java.util.ArrayList;
import java.util.List;

import com.itay.perl6.defines.NativeInt;
import com.itay.perl6.defines.Type;
import com.itay.perl6.syntaxtree.AssignVariable;
import com.itay.perl6.syntaxtree.GlobalNode;
import com.itay.perl6.syntaxtree.LoadVariable;
import com.itay.perl6.syntaxtree.MultiMy;
import com.itay.perl6.syntaxtree.My;
import com.itay.perl6.syntaxtree.NumberLiteral;
import com.itay.perl6.syntaxtree.SyntaxTree;
import com.itay.perl6.tokenizer.Token;
import com.itay.perl6.tokenizer.TokenType;
import com.itay.perl6.tokenizer.Tokenizer;

public class Parser {

	private Tokenizer tokenizer;
	private Token token;
	
	private SyntaxTree currentNode;
		
	public Parser(String code) {
		tokenizer = new Tokenizer(code);
		currentNode = new GlobalNode();
		currentNode.addKnownType(new NativeInt());
	}
		
	public SyntaxTree parse() throws Exception {
		while(tokenizer.hasNextToken()) {
			SyntaxTree node = nextStatement();
			if(!accept(TokenType.SEMICOLON)) {
				throw new Error("Syntax error! missing semi colon!");
			}
			if(node == null) {
				throw new Error("Could not continue parsing... (" + tokenizer.getOriginalStr() + ")");
				// TODO: something else
			}
			currentNode.add(node);
		}
		return currentNode;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	
	private SyntaxTree nextStatement() throws Exception {
		SyntaxTree temp;
		if((temp = my()) != null) {
			return temp;
		}else if((temp = number()) != null) {
			return temp;
		}else if((temp = assignVariable()) != null) {
			return temp;
		}else if((temp = loadVariable()) != null) {
			return temp;
		} 
		
		
		return null;
	}
	
	private SyntaxTree loadVariable() throws Exception {
		Tokenizer tokenizer = (Tokenizer) this.tokenizer.clone();
		if(accept(TokenType.DOLLAR) && accept(TokenType.NAME)) {
			String name = token.getToken();
			return new LoadVariable(currentNode, currentNode.getVariable(name));
		}
		this.tokenizer = tokenizer;
		return null;
	}
	
	private SyntaxTree assignVariable() throws Exception {
		Tokenizer tokenizer = (Tokenizer) this.tokenizer.clone();
		if(accept(TokenType.DOLLAR) && accept(TokenType.NAME)) {
			String name = token.getToken();
			if(accept(TokenType.EQUALS)) {
				SyntaxTree node = nextStatement();
				return new AssignVariable(currentNode, currentNode.getVariable(name), node);
			}
		}
		this.tokenizer = tokenizer;
		return null;
	}
	
	private NumberLiteral number() throws Exception {
		Tokenizer tokenizer = (Tokenizer) this.tokenizer.clone();
		if(accept(TokenType.NUMBER)) {
			return new NumberLiteral(currentNode, token.getToken());
		}
		this.tokenizer = tokenizer;
		return null;
	}
	
	private SyntaxTree my() throws Exception {
		Tokenizer tokenizer = (Tokenizer) this.tokenizer.clone();
		if(accept(TokenType.NAME, "my")) {
			next();
			if(token.getType() == TokenType.NAME) {
				Token tok = token;
				if(accept(TokenType.DOLLAR)) {
					next();
					if(token.getType() == TokenType.NAME) {
						String name = token.getToken();
						String type = tok.getToken();
						Type t = null;
						for(Type temp : currentNode.getKnownTypes()) {
							if(type.equals(temp.getType())) {
								t = temp;
							}
						}
						if(t == null) {
							throw new Error("The type '" + t + "' is not defined!");
						}
						
						next();
						
						if(token.getType() == TokenType.EQUALS) {
							SyntaxTree node = nextStatement();
							return new My(this.currentNode, name, t, node);
						}else if(token.getType() == TokenType.SEMICOLON) {
							this.tokenizer.pushBack();
							return new My(this.currentNode, name, t, null);			
						}
					}
				}
			}else if(token.getType() == TokenType.DOLLAR) {
				next();
				if(token.getType() == TokenType.NAME) {
					String name = token.getToken();
					next();				
					if(token.getType() == TokenType.EQUALS) {
						SyntaxTree node = nextStatement();
						return new My(this.currentNode, name, null, node);
					}else if(token.getType() == TokenType.SEMICOLON) {
						this.tokenizer.pushBack();
						return new My(this.currentNode, name, null, null);			
					}
				}
			}else if(token.getType() == TokenType.RIGHT_BRACKET) {
				List<String> mys = new ArrayList<>();
				while(!accept(TokenType.LEFT_BRACKET)) {
					this.tokenizer.pushBack();
					if(accept(TokenType.DOLLAR) && accept(TokenType.NAME)) {
						String name = token.getToken();
						next();
						if(token.getType() == TokenType.COMMA) {							
							mys.add(name);
						}else if(token.getType() == TokenType.LEFT_BRACKET) {
							mys.add(name);
							break;
						}
					}
				}
				return new MultiMy(currentNode, mys);
			}
		}
		this.tokenizer = tokenizer;
		return null;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private boolean accept(TokenType type) {
		next();
		if(token.getType() == type) {
			return true;
		}
		return false;
	}
	
	private boolean accept(TokenType type, String str) {
		next();
		if(token.getType() == type && token.getToken().equals(str)) {
			return true;
		}
		return false;
	}
	
	private void next() {
		testHasNext();
		token = tokenizer.nextToken();
	}
	
	private void testHasNext() {
		if(!tokenizer.hasNextToken()) {
			System.err.println("Unexpected EOF");
			System.exit(1);
		}
	}
	
}
