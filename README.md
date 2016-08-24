# Perl6 Native Compiler

Currently this is very basics and supports only basic variables.

## How to use:
Currently the file name is built into the program and the output is printed into the console.
To compile the generated ASM file I use the build file (shell)

	$ ./build [file-name].asm 

This will generate the .O file and the excuteable

## Supports:
	- Variables (including compiler type checking)
	- The say subroutine(works both with and without '(' / ')')
	- 3 Basic types, 
		    * Any (Variables with unknown type are set to it automatically)
		    * int (integer)
		    * str (string)
		
## Under Development:
    * Subroutines
    * Math
    * classes (Object Oriented Perl)
    