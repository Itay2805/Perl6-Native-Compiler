package com.itay.perl6;

public class RegisterManager {
	
	private static int num;
	private static String[] regs = new String[] { "rsi", "rdi", "r8", "r9", "r10", "r11", "r12", "r13", "r14", "r15" };
	
	public static String getNextParamRegister() {
		return getRegisterName(num++);
	}
	
	public static String getRegisterName(int num) {
		return regs[num];
	}
	
	public static void clearRegisters() {
		num = 0;
	}
	
}
