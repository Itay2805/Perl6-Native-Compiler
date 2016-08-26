grammar Perl6;

@lexer::header {
	package com.itay.perl6.parser;
}

@parser::header {
	package com.itay.perl6.parser;
}

program
	: stmt_list EOF
	;
			
stmt_list
	: stmt*
	;
	
stmt
	: expr ';'
	| expr
	// FIXME: From some reason it does not work when given newline
	;
			
expr
	: temp
	| varExpr
	| literalExpr
	//| subs
	| addingExpression
	;

temp
	: name=('print'|'say') '('? value1=expr (',' value2=expr)* ')'?		#say
	| block											#codeBlock
	| 'use' 'v6' ';'								#use
	;

literalExpr
	: ('\'' num=NUMBER '\'' | num=NUMBER) 			#numberLiteral
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
	//| subs
	| '(' addingExpression ')'
	;

// For right now w are limiting the number of parameters to 10 because we are using only registers and we have 10 which are able to be used for params	
/*subs
	: 'sub' name=ID '(' p1=ID? (',' p2=ID)? (',' p3=ID)? (',' p4=ID)? (',' p5=ID)? (',' p6=ID)? (',' p7=ID)? (',' p8=ID)? (',' p9=ID)? (',' p10=ID)? ')' code=block #subCreate
	| name=ID '('? p1=ID? (',' p2=ID)? (',' p3=ID)? (',' p4=ID)? (',' p5=ID)? (',' p6=ID)? (',' p7=ID)? (',' p8=ID)? (',' p9=ID)? (',' p10=ID)? ')'?				#subCall
	;*/
	
multiplyingExpression
	: mathExpr ('*' mathExpr)*						#mul
	| mathExpr ('/' mathExpr)*						#div
	;
	
addingExpression
	: multiplyingExpression ('+' multiplyingExpression)*	#add
	| multiplyingExpression ('-' multiplyingExpression)*	#sub
	;

block
	: '{' stmt_list '}'
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
	: DECIMAL_NUM
	| OCTA_NUMBER
	| HEX_NUMBER
	| BINARY_NUM
	;

fragment	
DECIMAL_NUM
	: (('0'..'9')('0'..'9'|'_')*)
	| '0' 'd' ('0'..'9'|'_')+
	;

fragment	
OCTA_NUMBER
	: '0' 'o' ('0'..'7'|'_')+
	;
	
fragment
HEX_NUMBER
	: '0' 'x' ('0'..'9'|'a'..'f'|'_')+
	;

fragment
BINARY_NUM
	: '0' 'b' ('0'..'1'|'_')+
	;

ID
	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	;
	
LINE_COMMENT
	: '#' ~('\n'|'\r')* { skip(); }
	;
	
SPACE
	: (' ' | '\t' | '\n' | '\r')+ { skip(); }
	;