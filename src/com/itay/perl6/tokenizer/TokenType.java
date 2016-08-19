package com.itay.perl6.tokenizer;

public enum TokenType {
	
	
	NAME("[a-zA-Z_][a-zA-Z0-9_]*"),
	NUMBER("[1-9][0-9]*"),
	SEMICOLON(";"),
	EQUALS("="),	
	DOLLAR("\\$"),
	RIGHT_BRACKET("\\("),
	LEFT_BRACKET("\\)"),
	COMMA(",");
	
	;
	
	private String regex;
	private TokenType(String regex) {
		this.regex = regex;
	}
	
	public String getRegex() {
		return regex;
	}
	
}
