package com.itay.perl6.defines;

import com.itay.perl6.tokenizer.Token;

public abstract class Type {
	
	protected String type;
	
	public Type(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public abstract int getSize();
	
	public abstract boolean isMatching(Token token);

}
