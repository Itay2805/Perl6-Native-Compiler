package com.itay.perl6.syntaxtree;

import java.util.ArrayList;
import java.util.List;

import com.itay.perl6.defines.Type;
import com.itay.perl6.defines.VariableDefinition;

public abstract class SyntaxTree {
	
	protected List<Type> knownTypes = new ArrayList<>();
	protected List<SyntaxTree> children = new ArrayList<>();
	protected String code = "";
	
	protected SyntaxTree superNode;
	protected List<VariableDefinition> variables = new ArrayList<>();
	
	public SyntaxTree(SyntaxTree superNode) {
		this.superNode = superNode;
	}
	
	public void add(SyntaxTree node) {
		if(node != null) children.add(node);
	}
	
	public void addVariable(VariableDefinition var) {
		for(VariableDefinition vari : variables) {
			if(vari.getName().equals(var.getName()))
				throw new Error("Variable already exists in this block (" + var.getName() + ")!"); 
		}
		variables.add(var);
	}
	
	public VariableDefinition getVariable(String name) {
		for(VariableDefinition var : variables) {
			if(var.getName().equals(name))
				return var;
		}
		if(superNode != null)
			return superNode.getVariable(name);
		
		throw new Error("Variable does not exists in this block (" + name + ")!"); 
	}
	
	
	
	public List<Type> getKnownTypes() {
		List<Type> type;
		if(superNode != null) {
			type = superNode.getKnownTypes();
		}else {
			type = new ArrayList<>();
		}
		for(Type t : knownTypes) {
			type.add(t);
		}
		return type;
	}
	
	public SyntaxTree getSuperNode() {
		return superNode;
	}
	
	public void addKnownType(Type type) {
		knownTypes.add(type);
	}
	
	public List<VariableDefinition> getVariables() {
		List<VariableDefinition> def;
		if(superNode == null) {
			def = new ArrayList<>();
		}else {
			def = superNode.getVariables();
		}
		for(int i = 0; i < variables.size(); i++) {
			def.add(variables.get(i));
		}
		return def;
	}
	
	/** Generate Assembly code */
	public abstract String compile();
	
}
