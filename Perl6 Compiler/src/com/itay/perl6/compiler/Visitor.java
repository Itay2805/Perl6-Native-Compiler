package com.itay.perl6.compiler;

import java.util.HashMap;
import java.util.Map.Entry;

import com.itay.perl6.compiler.subs.SubsLookupTable;
import com.itay.perl6.compiler.vars.Type;
import com.itay.perl6.compiler.vars.Variable;
import com.itay.perl6.compiler.vars.VariableLookupTable;
import com.itay.perl6.parser.Perl6BaseVisitor;
import com.itay.perl6.parser.Perl6Parser.AddContext;
import com.itay.perl6.parser.Perl6Parser.AssignVarContext;
import com.itay.perl6.parser.Perl6Parser.CodeBlockContext;
import com.itay.perl6.parser.Perl6Parser.CreateVarContext;
import com.itay.perl6.parser.Perl6Parser.DivContext;
import com.itay.perl6.parser.Perl6Parser.LoadVarContext;
import com.itay.perl6.parser.Perl6Parser.MathExprContext;
import com.itay.perl6.parser.Perl6Parser.MulContext;
import com.itay.perl6.parser.Perl6Parser.NumberLiteralContext;
import com.itay.perl6.parser.Perl6Parser.ProgramContext;
import com.itay.perl6.parser.Perl6Parser.SayContext;
import com.itay.perl6.parser.Perl6Parser.StringLiteralContext;
import com.itay.perl6.parser.Perl6Parser.SubContext;
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
		code += "num_fmt_line:\n";
		code += "	db \"%d\", 10, 0\n";
		code += "str_fmt_line:\n";
		code += "	db \"%s\", 10, 0\n";
		code += "num_fmt:\n";
		code += "	db \"%d\", 0\n";
		code += "str_fmt:\n";
		code += "	db \"%s\", 0\n";
		for(Entry<String, String> string : strings.entrySet()) {
			code += string.getKey() + ":\n";
			code += "	dq " + string.getValue().length() + "\n";
			code += "	db \"" + escape(string.getValue()) + "\", 0\n";
		}
		return Pair.of(Type.NONE, code);
	}
	
	private String escape(String str) {
		return str.replace(System.getProperty("line.separator"), "\", 10, \"").replace("\\n", "\", 10, \"");
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
		if(var.type != Type.ANY && !var.dynamicType) {
			if(var.type != pair.getFirst()) {
				System.out.println("Visitor.visitCreateVar()");
				System.err.println("Can not assign value from type " + pair.getFirst() + " to variable of type " + var.type + "(" + name + ")");
				System.exit(1);
			}
		}else {
			var.type = pair.getFirst();
		}
		code += pair.getSecond();
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
		SubsLookupTable.pushBlock();
		Pair<Type, String> pair = visitChildren(ctx);
		int size =  VariableLookupTable.getTotalSize() - VariableLookupTable.getBlockSizes().get(VariableLookupTable.getBlock() - 1);
		code += "	sub rsp, " + size + "\n";
		code += pair.getSecond();
		code += "	add rsp, " + size + "\n";
		SubsLookupTable.popBlock();
		VariableLookupTable.popBlock();
		return Pair.of(Type.NONE, code);
	}
	
	// TODO: rethink about subs and the memory usage
	/*public Pair<Type, String> visitSubCreate(SubCreateContext ctx) {
		String code = "";
		String start = "sub_" + SubsLookupTable.getBlock() + "_" + ctx.name.getText();
		String end = "sub_end_" + SubsLookupTable.getBlock() + "_" + ctx.name.getText();
		code += "	jmp " + end + "\n";
		code += start + ":\n";
		Pair<Type, String> pair = visit(ctx.code);
		code += pair.getSecond();
		code += "	mov rax, " + start + "\n";
		code += end + ":\n";
		Subroutine sub = new Subroutine();
		sub.block = SubsLookupTable.getBlock();
		sub.returnType = pair.getFirst();
		return Pair.of(Type.INT, code);
	}*/
	
	public Pair<Type, String> visitNumberLiteral(NumberLiteralContext ctx) {
		String num = ctx.num.getText().replace("_", "");
		num = attemptParseInt(num);
		return Pair.of(Type.INT, "	mov rax, " + num + "\n");
	}
	
	public Pair<Type, String> visitStringLiteral(StringLiteralContext ctx) {
		String str = ctx.str.getText();
		if(str.startsWith("'") || str.startsWith("\"")) {
			str = str.substring(1, ctx.str.getText().length() - 1);
		}else if(str.startsWith("q")) {
			str = str.substring(2, ctx.str.getText().length() - 1);
		}
		
		String possibleNumber = attemptParseInt(str);
		
		if(possibleNumber == null) {
			String label = "generated_string_" + count++;
			strings.put(label, str);
			String code = "	mov rax, " + label + "\n";
			return Pair.of(Type.STR, code);			
		}else {			
			String code = "	mov rax, " + possibleNumber + "\n";
			return Pair.of(Type.INT, code);
		}
	}
	
	public Pair<Type, String> visitSay(SayContext ctx) {
		String code = "";
		String name = ctx.name.getText();
		Pair<Type, String> pair = visit(ctx.value1);
		
		if(ctx.value2 != null) {
			code += pair.getSecond();
			if(pair.getFirst() == Type.STR) {
				code += "	lea rsi, [rax + 8]\n";
				code += "	mov rdi, str_fmt\n";
			}else {
				code += "	mov rsi, rax\n";
				code += "	mov rdi, num_fmt\n";
			}
			code += "	xor ax, ax\n";
			code += "	call printf\n";
			
			pair = visit(ctx.value2);
			code += pair.getSecond();
			if(pair.getFirst() == Type.STR) {
				code += "	lea rsi, [rax + 8]\n";
				code += "	mov rdi, " + (name.equals("say") ? "str_fmt_line" : "str_fmt") + "\n";
			}else {
				code += "	mov rsi, rax\n";
				code += "	mov rdi, " + (name.equals("say") ? "num_fmt_line" : "num_fmt") + "\n";
			}
		}else {			
			code += pair.getSecond();
			if(pair.getFirst() == Type.STR) {
				code += "	lea rsi, [rax + 8]\n";
				code += "	mov rdi, " + (name.equals("say") ? "str_fmt_line" : "str_fmt") + "\n";
			}else {
				code += "	mov rsi, rax\n";
				code += "	mov rdi, " + (name.equals("say") ? "num_fmt_line" : "num_fmt") + "\n";
			}
		}
		
		code += "	xor ax, ax\n";
		code += "	call printf\n";
		
		return Pair.of(Type.NONE, code);
	}
	
	public Pair<Type, String> visitMathExpr(MathExprContext ctx) {
		Pair<Type, String> pair = visitChildren(ctx);
		if(pair.getFirst() != Type.INT) {
			System.out.println("Visitor.visitMathExpr()");
			System.err.println("The expression: " + ctx.getText() + " does not return a INT but a " + pair.getFirst());
			System.exit(1);
		}
		return pair;
	}
	
	public Pair<Type, String> visitAdd(AddContext ctx) {
		String code = "";
		if(ctx.getChildCount() >= 3) {
			Pair<Type, String> first = visit(ctx.getChild(0));
			Pair<Type, String> second = visit(ctx.getChild(2));
			code += second.getSecond();
			code += "	mov rbx, rax\n";
			code += "	push rbx\n";
			code += first.getSecond();
			code += "	pop rbx\n";
			code += "	add rax, rbx\n";
			for(int i = 4; i < ctx.getChildCount(); i += 2) {
				code += "	mov rbx, rax\n";
				code += "	push rbx\n";
				second = visit(ctx.getChild(i));
				code += second.getSecond();
				code += "	pop rbx\n";
				code += "	add rbx, rax\n";
				if(i + 2 >= ctx.getChildCount()) code += "	mov rax, rbx\n";
			}
		}else {
			Pair<Type, String> first = visit(ctx.getChild(0));
			code += first.getSecond();
		}
		return Pair.of(Type.INT, code);
	}
	
	public Pair<Type, String> visitSub(SubContext ctx) {
		String code = "";
		if(ctx.getChildCount() >= 3) {
			Pair<Type, String> first = visit(ctx.getChild(0));
			Pair<Type, String> second = visit(ctx.getChild(2));
			code += second.getSecond();
			code += "	mov rbx, rax\n";
			code += "	push rbx\n";
			code += first.getSecond();
			code += "	pop rbx\n";
			code += "	sub rax, rbx\n";
			for(int i = 4; i < ctx.getChildCount(); i += 2) {
				code += "	mov rbx, rax\n";
				code += "	push rbx\n";
				second = visit(ctx.getChild(i));
				code += second.getSecond();
				code += "	pop rbx\n";
				code += "	sub rbx, rax\n";
				if(i + 2 >= ctx.getChildCount()) code += "	mov rax, rbx\n";
			}
		}else {
			Pair<Type, String> first = visit(ctx.getChild(0));
			code += first.getSecond();
		}
		return Pair.of(Type.INT, code);
	}
	
	public Pair<Type, String> visitMul(MulContext ctx) {
		String code = "";
		if(ctx.getChildCount() >= 3) {
			Pair<Type, String> first = visit(ctx.getChild(0));
			Pair<Type, String> second = visit(ctx.getChild(2));
			code += second.getSecond();
			code += "	mov rbx, rax\n";
			code += "	push rbx\n";
			code += first.getSecond();
			code += "	pop rbx\n";
			code += "	imul rax, rbx\n";
			for(int i = 4; i < ctx.getChildCount(); i += 2) {
				second = visit(ctx.getChild(i));
				code += "	mov rbx, rax\n";
				code += "	push rbx\n";
				code += second.getSecond();
				code += "	pop rbx\n";
				code += "	imul rbx, rax\n";
				if(i + 2 >= ctx.getChildCount()) code += "	mov rax, rbx\n";
			}
		}else {
			Pair<Type, String> first = visit(ctx.getChild(0));
			code += first.getSecond();
		}
		return Pair.of(Type.INT, code);
	}
	
	public Pair<Type, String> visitDiv(DivContext ctx) {
		String code = "";
		if(ctx.getChildCount() >= 3) {
			Pair<Type, String> first = visit(ctx.getChild(0));
			Pair<Type, String> second = visit(ctx.getChild(2));
			code += second.getSecond();
			code += "	mov rbx, rax\n";
			code += "	push rbx\n";
			code += first.getSecond();
			code += "	pop rbx\n";
			code += "	xor rdx, rdx\n";
			code += "	idiv rbx\n";
			for(int i = 4; i < ctx.getChildCount(); i += 2) {
				code += "	mov rbx, rax\n";
				code += "	push rbx\n";
				second = visit(ctx.getChild(i));
				code += second.getSecond();
				code += "	pop rbx\n";
				code += "	xchg rax, rbx\n";
				code += "	xor rdx, rdx\n";
				code += "	idiv rbx\n";
			}
		}else {
			Pair<Type, String> first = visit(ctx.getChild(0));
			code += first.getSecond();
		}
		return Pair.of(Type.INT, code);
	}

	protected Pair<Type, String> aggregateResult(Pair<Type, String> aggregate, Pair<Type, String> nextResult) {
		if(aggregate == null && nextResult == null) {
			return Pair.of(Type.NONE, "");
		}
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
	
	private String attemptParseInt(String num) {
		if(num.startsWith("'")) {
			num = num.substring(1, num.length() - 1);
		}
		num = num.replace("_", "");
		if(num.startsWith("0x")) {
			num = num.substring(2);
			num = Integer.toHexString(Integer.valueOf(num, 16));
			return "0x" + num;
		}else if(num.startsWith("0o")) {
			num = num.substring(2);
			num = Integer.toHexString(Integer.valueOf(num, 8));
			return "0x" + num;
		}else if(num.startsWith("0b")) {
			num = num.substring(2);
			num = Integer.toHexString(Integer.valueOf(num, 2));
			return "0x" + num;
		}else if(num.startsWith("0d")) {
			num = num.substring(2);
			num = Integer.toHexString(Integer.valueOf(num, 10));
			return "0x" + num;
		}else {
			try {
				num = Integer.toHexString(Integer.valueOf(num, 10));				
				return "0x" + num;
			}catch(Exception e) {
				return null;
			}
		}
	}
	
}
