grammar Perl6;

@lexer::header {
	package com.itay.perl6.parser;
}

@parser::header {
	package com.itay.perl6.parser;
}

program
	: expr_list EOF
	;
			
expr_list
	: (expr ';')*
	;
			
expr
	: 'my' '$' name=ID 								#createVar
	| 'my' '$' name=ID '=' value=expr 				#createVar
	| 'my' type=ID '$' name=ID 						#createVar
	| 'my' type=ID '$' name=ID '=' value=expr 		#createVar
	| '$' name=ID '=' value=expr 					#assignVar
	| '$' name=ID									#loadVar
	| 'say' '('? value=expr ')'?					#say
	| block											#codeBlock
	| num=NUMBER									#numberLiteral
	| str=CHARSEQUENSE_Q?							#stringLiteral
	;

block
	: '{' expr_list '}'
	;

CHARSEQUENSE_Q
	: '\'' ~[\'\r\n]* '\'' 
	;

NUMBER
	: ('1'..'9')('0'..'9')*
	;

ID
	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	;
	
SPACE
	: (' ' | '\t' | '\r' | '\n')+ { skip(); }
	;