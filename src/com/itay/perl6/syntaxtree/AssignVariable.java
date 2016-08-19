package com.itay.perl6.syntaxtree;

import com.itay.perl6.defines.VariableDefinition;

public class AssignVariable extends SyntaxTree {
	
	private VariableDefinition var;
	private SyntaxTree node;
	
	public AssignVariable(SyntaxTree superNode, VariableDefinition var, SyntaxTree node) {
		super(superNode);
		
		this.var = var;
		this.node = node;
	}
	
	public String compile() {
		code += node.compile();
		code += "	mov [rbp - " + (var.getIndex() * 8) + "], rax\n";
		return code;
	}

}
