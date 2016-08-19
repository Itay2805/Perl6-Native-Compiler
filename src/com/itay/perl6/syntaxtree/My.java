package com.itay.perl6.syntaxtree;

import com.itay.perl6.defines.Type;
import com.itay.perl6.defines.VariableDefinition;

public class My extends SyntaxTree {
	
	private int index;
	private SyntaxTree node;
	
	public My(SyntaxTree superBlock, String name, Type type, SyntaxTree node) {
		super(superBlock);
		this.index = getVariables().size();
		this.node = node;

		superBlock.addVariable(new VariableDefinition(name, type, index));
	}

	public String compile() {
		if(node == null) {
			code += "	xor rax, rax\n";
		}else {
			code += node.compile();			
		}
		code += "	sub rsp, 8\n";
		code += "	mov [rbp - " + (index * 8) + "], rax\n";
		return code;
	}
	
}
