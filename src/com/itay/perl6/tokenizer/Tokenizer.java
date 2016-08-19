package com.itay.perl6.tokenizer;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer implements Cloneable {
	
	
	private ArrayList<TokenData> tokenDatas;
	
	private String str;
	private String originalStr;
	
	private Token lastToken;
	private boolean pushBack;
	
	public Tokenizer(String str) {
		this.tokenDatas = new ArrayList<>();
		this.str = str;
		this.originalStr = str;
		
		for(TokenType type : TokenType.values()) {
			tokenDatas.add(new TokenData(Pattern.compile("^(" + type.getRegex() + ")"), type));			
		}
	}
	
	public Token nextToken() {
		str = str.trim();
				
		if(pushBack) {
			pushBack = false;
			return lastToken;
		}
		
		for(TokenData data : tokenDatas) {
			Matcher matcher = data.getPattern().matcher(str);
			
			if(matcher.find()) {
				String token = matcher.group().trim();
				str = matcher.replaceFirst("");
				
				return (lastToken = new Token(token, data.getType()));
			}
		}
		
		throw new IllegalStateException("Could not parse '" + str + "'");
	}
	
	public boolean hasNextToken() {
		return !str.isEmpty() || pushBack;
	}
	
	public void pushBack() {
		if(lastToken != null)
			this.pushBack = true;
	}
	
	public String getStr() {
		return str;
	}
	
	public String getOriginalStr() {
		return originalStr;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
