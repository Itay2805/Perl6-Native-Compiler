package com.itay.perl6.defines;

import com.itay.perl6.tokenizer.Token;
import com.itay.perl6.tokenizer.TokenType;

public class NativeInt extends Type {

	public NativeInt() {
		super("int");
	}
	
	public int getSize() {
		return 8;
	}

	public boolean isMatching(Token token) {
		return token.getType() == TokenType.NUMBER;
	}

}
