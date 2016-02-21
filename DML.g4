// Defines a grammar for the Data Manipulation Language (DML) 

grammar DML;

program : (command | query )+ ;

command : (opencmd | closecmd | writecmd | exitcmd | showcmd | createcmd | updatecmd | insertcmd | deletecmd) ';' ;

query : relationname '<-' expr ';' ;

relationname : IDENTIFIER ;

IDENTIFIER : ALPHA (ALPHA | DIGIT)* ;

fragment ALPHA : [a-zA-Z_\-:] ;

fragment DIGIT : [0-9] ;

expr : atomicexpr 
             | selection
             | projection
             | renaming
             | union
             | difference
             | product
             | naturaljoin 
			 ;

atomicexpr : relationname | '(' expr ')' ;

selection : 'select' '(' condition ')' atomicexpr ;

condition : conjunction ('||' conjunction)* ;

conjunction : comparison ('&&' comparison)* ;

comparison : operand OP operand
                     | '(' condition ')'
					 ;

OP : '==' | '!=' | '<' | '>' | '<=' | '>=' ;

operand : attributename | literal ;

attributename : IDENTIFIER ;

literal : ( STRING | INTEGER ) ; 

projection : 'project' '(' attributelist ')' atomicexpr ;

attributelist : attributename (',' attributename)* ; 

renaming : 'rename' '(' attributelist ')' atomicexpr ;

union : atomicexpr '+' atomicexpr ;

difference : atomicexpr '-' atomicexpr ;

product : atomicexpr '*' atomicexpr ; 

naturaljoin : atomicexpr '&' atomicexpr ;

opencmd : 'OPEN' relationname ;

closecmd : 'CLOSE' relationname ;

writecmd : 'WRITE' relationname ;

exitcmd : 'EXIT' ;

showcmd : 'SHOW' atomicexpr ;

createcmd : 'CREATE TABLE' relationname '(' typedattributelist ')' 'PRIMARY KEY' '(' attributelist ')' ;

updatecmd : 'UPDATE' relationname 'SET' attributename '=' literal (',' attributename '=' literal)* 'WHERE' condition ;

insertcmd : 'INSERT INTO' relationname 'VALUES FROM' '(' literal (',' literal)* ')'
				| 'INSERT INTO' relationname 'VALUES FROM RELATION' expr ;

deletecmd : 'DELETE FROM' relationname 'WHERE' condition ;

typedattributelist : attributename type (',' attributename type)* ;

type : 'VARCHAR' '(' INTEGER ')' | 'INTEGER' ;

STRING : '"'(ALPHA | DIGIT | [ \t\r\n])*'"' ; 

INTEGER : DIGIT+  ;

WS : [ \t\r\n]+ -> skip ;