package com.itay.perl6.defines;

public class VariableDefinition {
	
	private String name;
	private Type type;
	private int index;
	
	public VariableDefinition(String name, Type type, int index) {
		this.name = name;
		this.type = type;
		this.index = index;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIndex() {
		return index;
	}
	
	public Type getType() {
		return type;
	}
	
}
