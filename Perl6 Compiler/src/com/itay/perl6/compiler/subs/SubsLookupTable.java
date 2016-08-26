package com.itay.perl6.compiler.subs;

import java.util.HashMap;

public class SubsLookupTable {
	
	private static HashMap<Integer, HashMap<String, Subroutine>> table = new HashMap<>();
	private static int block;
	
	static {
		table.put(0, new HashMap<>());
	}
	
	public static int pushBlock() {
		block++;
		table.put(block, new HashMap<>());
		return block;
	}
	
	public static void popBlock() {
		table.remove(block);
		block--;
	}
	
	public static int getBlock() {
		return block;
	}
	
	public static Subroutine get(String name) {
		return get(name, block);
	}
	
	private static Subroutine get(String name, int block) {
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
	
	public static HashMap<Integer, HashMap<String, Subroutine>> getTable() {
		return table;
	}
	
}
