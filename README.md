# Perl6 Native Compiler

This is a work in progress Compiler to compile Perl6 into Assembly code. Right now it is lacking allot of stuff  but I hope in the future we can compile the whole language (including all of the built in classes)!

## How to use:
Currently to compile your own programs you have to modify the program.

To compile the generated ASM file I use the build file (shell)

	$ ./build [file-name].asm 

This will generate the .O file and the excuteable

There are some test files (from rakudo compiler tests and one called random for some random testings I do for debugging)!
they are located in `Perl6 Compiler/tests/*.t` and the compiled ASM files are located in `Perl6 Compiler/compiled/*.asm`

## Supports:
- Variables (including compiler type checking)
- The say and print subroutine(works both with and without '(' / ')') (currently accepts only one param)
- 3 Basic types, 
    * Any (Variables with unknown type are set to it automatically)
    * int (integer) -> Supports normal numbers(0, 457), decimals (0d457), octa (0o75), hex (0x5F), binary (0b1001). (all of them can have '_'). Also strings wich has a number definition are compiled as a number (In the future this will be dynamic in runtime so strings which are created in runtime that can represent a number can be used as a number)
    * str (string)
- Math (addition, subtraction, multiplication and division)
- Code blocks
	``` perl6
	my $a = 5;
	
	{
		my $a = 6;
		say $a;
	};
	
	say $a;
	
	#output:
	#6
	#5
	```

## In Progress:
- Subroutines (Already have a basic grammar but have to rethink the implementation)
- Bool and all the comparation operands (>, >=, ==, <=, <, etc...)
- Loops and If/Unless blocks