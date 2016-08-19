package com.itay.perl6;

public class LabelManager {
	
	private static int count = 0;
	
	public static String generate() {
		return "generated_" + count++;
	}
	
}
