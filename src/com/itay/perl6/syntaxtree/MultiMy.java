package com.itay.perl6.syntaxtree;

import java.util.ArrayList;
import java.util.List;

import com.itay.perl6.defines.VariableDefinition;

public class MultiMy extends SyntaxTree {
	
	private List<VariableDefinition> defs = new ArrayList<>();
	
	public MultiMy(SyntaxTree superNode, List<String> mys) {
		super(superNode);
		
		for(String my : mys) {
			VariableDefinition def = new VariableDefinition(my, null, getVariables().size());
			defs.add(def);
			superNode.addVariable(def);
		}
	}
	
	public String compile() {
		code += "	sub rsp, " + (defs.size() * 8) + "\n";
		for(VariableDefinition def : defs) {
			code += "	mov [rbp - " + (def.getIndex() * 8) + "], 0\n";
		}
		return code;
	}
	
}
