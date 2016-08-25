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
	// Temp EXPR
	: temp
	| varExpr
	| literalExpr
	| addingExpression
	;

temp
	: name=('print'|'say') '('? value=expr ')'?		#say
	| block											#codeBlock
	| 'use' 'v6'									#use
	;

literalExpr
	: num=NUMBER									#numberLiteral
	| 	( str=CHARSEQUENSE
		| str=CHARSEQUENSE_Q
		| str=CHARSEQUENSE_2
		)											#stringLiteral
	;
	
varExpr
	: 'my' '$' name=ID 								#createVar
	| 'my' '$' name=ID '=' value=expr 				#createVar
	| 'my' type=ID '$' name=ID 						#createVar
	| 'my' type=ID '$' name=ID '=' value=expr 		#createVar
	| '$' name=ID '=' value=expr 					#assignVar
	| '$' name=ID									#loadVar
	;

mathExpr
	: temp
	| varExpr
	| literalExpr
	| '(' addingExpression ')'
	;

multiplyingExpression
	: mathExpr ('*' mathExpr)*						#mul
	| mathExpr ('/' mathExpr)*						#div
	;
	
addingExpression
	: multiplyingExpression ('+' multiplyingExpression)*	#add
	| multiplyingExpression ('-' multiplyingExpression)*	#sub
	;

block
	: '{' expr_list '}'
	;

CHARSEQUENSE
	: '\'' ~[\'\r\n]* '\'' 
	;
	
CHARSEQUENSE_2
	: '"' ~[\"\r\n]* '"' 
	;
	
CHARSEQUENSE_Q
	: 'q' '{' ~['}']* '}'
	;

NUMBER
	: ('0') | (('1'..'9')('0'..'9')*)
	;

ID
	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	;
	
LINE_COMMENT
	: '#' ~('\n'|'\r')* { skip(); }
	;
	
SPACE
	: (' ' | '\t' | '\r' | '\n')+ { skip(); }
	;