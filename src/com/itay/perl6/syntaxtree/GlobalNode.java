package com.itay.perl6.syntaxtree;

public class GlobalNode extends SyntaxTree {
	
	public GlobalNode() {
		super(null);
	}
	
	public String compile() {
		code += "[section code]\n";
		code += "[global main]\n";
		code += "main:\n";
		code += "	push rbp\n";
		code += "	mov rbp, rsp\n";
		for(SyntaxTree node : children) {
			code += node.compile();
		}
		code += "	mov rsp, rbp\n";
		code += "	pop rbp\n";
		code += "	ret\n";
		return code;
	}
	
}
