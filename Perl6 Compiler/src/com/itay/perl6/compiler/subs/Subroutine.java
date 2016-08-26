package com.itay.perl6.compiler.subs;

import java.util.HashMap;

import com.itay.perl6.compiler.vars.Type;

public class Subroutine {
	
	public Type returnType;
	public HashMap<String, Param> params = new HashMap<>();
	public int block;
	
}
