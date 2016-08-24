package com.itay.perl6.compiler.vars;

import java.util.HashMap;

public class VariableLookupTable {
	
	private static HashMap<Integer, HashMap<String, Variable>> table = new HashMap<>();
	private static HashMap<Integer, Integer> blockSizes = new HashMap<>();
	private static int totalSize = 0;
	private static int block = 0;
	
	static {
		table.put(0, new HashMap<>());
	}
	
	public static int pushBlock() {
		blockSizes.put(block, totalSize);
		block++;
		table.put(block, new HashMap<>());
		return block;
	}
	
	public static void popBlock() {
		table.remove(block);
		block--;
		totalSize = blockSizes.get(block);
		blockSizes.remove(block);
	}
	
	public static int getBlock() {
		return block;
	}
	
	public static int getTotalSize() {
		return totalSize;
	}
	
	public static HashMap<Integer, Integer> getBlockSizes() {
		return blockSizes;
	}
	
	public static Variable add(String name, Type type, int size) {
		Variable var = new Variable(type);
		var.pointer = false;
		var.position = totalSize;
		var.size = size;
		totalSize += size;
		table.get(block).put(name, var);
		return var;
	}
	
	public static Variable get(String name) {
		return get(name, block);
	}
	
	private static Variable get(String name, int block) {
		if(!table.get(block).containsKey(name)) {
			if(block - 1 >= 0) {				
				return get(name, block - 1);
			}
			System.out.println("VariableLookupTable.get()");
			System.err.println("Could not find variable: " + name);
			System.exit(1);
		}
		return table.get(block).get(name);
	}
	
}
