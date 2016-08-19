package com.itay.perl6.syntaxtree;

public class NumberLiteral extends SyntaxTree {
	
	private String str;
	
	public NumberLiteral(SyntaxTree superNode, String str) {
		super(superNode);
		this.str = str;
	}
	
	public String compile() {
		return "	mov rax, " + str + "\n";
	}

}
