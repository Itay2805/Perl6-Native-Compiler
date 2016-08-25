package com.itay.perl6.compiler.vars;

public class Variable {
	
	public int position;
	public int size;
	public boolean pointer;
	public Type type;
	public boolean dynamicType = true;
	
	public Variable(Type type, int size, int position, boolean pointer) {
		this(type);
		this.position = position;
		this.pointer = pointer;
		this.size = size;
	}
	
	public Variable(Type type) {
		this.type = type;
	}
	
}
