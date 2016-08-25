package com.itay.perl6;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.itay.perl6.compiler.Visitor;
import com.itay.perl6.parser.Perl6Lexer;
import com.itay.perl6.parser.Perl6Parser;

public class CompilerMain {
	
	public static void main(String[] args) throws Exception {
		
		// FIXME: say should be able to print multiple stuff
		
		String[] tests = 	{ "random", "01-literals", "02-op-math", "05-var" };
		
		for(String test : tests) {
			compile("tests/" + test + ".t", "compiled/" + test + ".asm");
		}
	}
	
	public static void compile(String inputName, String output) throws Exception {
		System.out.println("Compiling " + inputName);
		ANTLRInputStream input = new ANTLRFileStream(inputName);
		Perl6Lexer lexer = new Perl6Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Perl6Parser parser = new Perl6Parser(tokens);
		
		ParseTree tree = parser.program();
		
		Files.write(Paths.get(output), new Visitor().visit(tree).getSecond().getBytes());
	}
	
}
