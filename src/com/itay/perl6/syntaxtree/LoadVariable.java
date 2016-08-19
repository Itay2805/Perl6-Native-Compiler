package com.itay.perl6.syntaxtree;

import com.itay.perl6.defines.VariableDefinition;

public class LoadVariable extends SyntaxTree {
	
	private VariableDefinition var;
	
	public LoadVariable(SyntaxTree superNode, VariableDefinition var) {
		super(superNode);
		
		this.var = var;
	}

	public String compile() {
		code += "	mov rax, [rbp - " + (var.getIndex() * 8) + "]\n";
		return code;
	}
	
}
