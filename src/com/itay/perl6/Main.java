package com.itay.perl6;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.itay.perl6.syntaxtree.SyntaxTree;

public class Main {
	
	public static void main(String[] args) throws Exception {		
		doTest("test.pl6");
	}
	
	public static void doTest(String path) throws Exception {
		String code = new String(Files.readAllBytes(Paths.get(path)));
		
		Parser c = new Parser(code);
		SyntaxTree tree = c.parse();
		System.out.println(tree.compile());
	}
	
}
