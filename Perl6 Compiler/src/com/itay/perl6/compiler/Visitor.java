package com.itay.perl6.compiler;

import java.util.HashMap;
import java.util.Map.Entry;

import com.itay.perl6.compiler.vars.Type;
import com.itay.perl6.compiler.vars.Variable;
import com.itay.perl6.compiler.vars.VariableLookupTable;
import com.itay.perl6.parser.Perl6BaseVisitor;
import com.itay.perl6.parser.Perl6Parser.AssignVarContext;
import com.itay.perl6.parser.Perl6Parser.CodeBlockContext;
import com.itay.perl6.parser.Perl6Parser.CreateVarContext;
import com.itay.perl6.parser.Perl6Parser.LoadVarContext;
import com.itay.perl6.parser.Perl6Parser.NumberLiteralContext;
import com.itay.perl6.parser.Perl6Parser.ProgramContext;
import com.itay.perl6.parser.Perl6Parser.SayContext;
import com.itay.perl6.parser.Perl6Parser.StringLiteralContext;
import com.itay.perl6.util.Pair;

public class Visitor extends Perl6BaseVisitor<Pair<Type, String>> {
	
	private static HashMap<String, String> strings = new HashMap<>();
	private static int count = 0;
	
	public Pair<Type, String> visitProgram(ProgramContext ctx) {
		String code = "";
		code += "[extern printf]\n";
		code += "[section code]\n";
		code += "[global main]\n";
		code += "main:\n";
		code += "	push rbp\n";
		code += "	mov rbp, rsp\n";
		Pair<Type, String> pair = visitChildren(ctx);
		code += "	sub rsp, " + VariableLookupTable.getTotalSize() + "\n";
		if(pair != null) code += pair.getSecond();
		code += "	mov rsp, rbp\n";
		code += "	pop rbp\n";
		code += "	xor rax, rax\n";
		code += "	ret\n"; // TODO: Maybe call exit
		code += "[section rodata]\n";
		code += "num_fmt:\n";
		code += "	db \"%d\", 10, 0\n";
		code += "str_fmt:\n";
		code += "	db \"%s\", 10, 0\n";
		for(Entry<String, String> string : strings.entrySet()) {
			code += string.getKey() + ":\n";
			code += "	db \"" + escape(string.getValue()) + "\", 0\n";
		}
		return Pair.of(Type.NONE, code);
	}
	
	private String escape(String str) {
		return str	.replace("\n", "\", 10, \"")
					.replace("\\n", "\", 10, \"");
	}
	
	public Pair<Type, String> visitCreateVar(CreateVarContext ctx) {
		String code = "";
		String name = ctx.name.getText();
		String value = "	xor rax, rax\n";
		Type type = Type.ANY;
		if(ctx.type != null) {
			type = Type.valueOf(ctx.type.getText().toUpperCase());
			if(type == null || type == Type.NONE) {
				System.out.println("Visitor.visitCreateVar()");
				System.err.println("Unknown type " + ctx.type.getText());
				System.exit(1);
			}
		}
		if(ctx.value != null) {
			Pair<Type, String> pair = visit(ctx.value);
			if(type == Type.ANY) {
				type = pair.getFirst();
			}else {
				if(type != pair.getFirst()) {
					System.out.println("Visitor.visitCreateVar()");
					System.err.println("Can not assign value from type " + pair.getFirst() + " to variable of type " + type + "(" + name + ")");
					System.exit(1);
				}
			}
			value = pair.getSecond();	
		}
		Variable var = VariableLookupTable.add(name, type, 8);
		code += value;
		code += "	mov qword [rbp - " + var.position + "], rax\n";
		return Pair.of(type, code);
	}
	
	public Pair<Type, String> visitAssignVar(AssignVarContext ctx) {
		String code = "";
		String name = ctx.name.getText();
		Pair<Type, String> pair = visit(ctx.value);
		Variable var = VariableLookupTable.get(name);
		if(var.type != pair.getFirst() || var.type != Type.ANY) {
			System.out.println("Visitor.visitCreateVar()");
			System.err.println("Can not assign value from type " + pair.getFirst() + " to variable of type " + var.type + "(" + name + ")");
			System.exit(1);
		}
		code += "	mov qword [rbp - " + var.position + "], rax\n";
		return Pair.of(var.type, code);
	}
	
	public Pair<Type, String> visitLoadVar(LoadVarContext ctx) {
		String code = "";
		String name = ctx.name.getText();
		Variable var = VariableLookupTable.get(name);
		code += "	mov rax, [rbp - " + var.position + "]\n";
		return Pair.of(var.type, code);
	}
	
	public Pair<Type, String> visitCodeBlock(CodeBlockContext ctx) {
		String code = "";
		VariableLookupTable.pushBlock();
		Pair<Type, String> pair = visitChildren(ctx);
		int size = VariableLookupTable.getBlockSizes().get(VariableLookupTable.getBlock());
		code += "	sub rsp, " + size + "\n";
		code += pair.getSecond();
		code += "	add rsp, " + size + "\n";
		VariableLookupTable.popBlock();
		return Pair.of(Type.NONE, code);
	}
	
	public Pair<Type, String> visitNumberLiteral(NumberLiteralContext ctx) {
		String number = "0x" + Integer.toHexString(Integer.parseInt(ctx.num.getText()));
		
		return Pair.of(Type.INT, "	mov rax, " + number + "\n");
	}
	
	public Pair<Type, String> visitStringLiteral(StringLiteralContext ctx) {
		String str = ctx.str.getText().substring(1, ctx.str.getText().length() - 1);
		String label = "generated_string_" + count++;
		strings.put(label, str);
		String code = "	mov rax, " + label + "\n";
		return Pair.of(Type.STR, code);
	}
	
	public Pair<Type, String> visitSay(SayContext ctx) {
		String code = "";
		Pair<Type, String> pair = visit(ctx.value);
		code += pair.getSecond();
		code += "	mov rsi, rax\n";
		if(pair.getFirst() == Type.STR) {
			code += "	mov rdi, str_fmt\n";
		}else {
			code += "	mov rdi, num_fmt\n";
		}
		code += "	xor ax, ax\n";
		code += "	call printf\n";
		return Pair.of(Type.NONE, code);
	}

	protected Pair<Type, String> aggregateResult(Pair<Type, String> aggregate, Pair<Type, String> nextResult) {
		if(aggregate == null) {
			return nextResult;
		}
		if(nextResult == null) {
			return aggregate;
		}else {
			String code = aggregate.getSecond() + nextResult.getSecond();
			Type type = nextResult.getFirst();
			return Pair.of(type, code);
		}
	}
	
}
