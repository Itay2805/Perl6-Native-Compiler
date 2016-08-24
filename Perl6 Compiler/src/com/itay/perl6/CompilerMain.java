package com.itay.perl6;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.itay.perl6.compiler.Visitor;
import com.itay.perl6.parser.Perl6Lexer;
import com.itay.perl6.parser.Perl6Parser;

public class CompilerMain {
	
	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRFileStream("perl6.pl6");
		Perl6Lexer lexer = new Perl6Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		Perl6Parser parser = new Perl6Parser(tokens);
		
		ParseTree tree = parser.program();
		System.out.println(new Visitor().visit(tree).getSecond());
	}
	
}
