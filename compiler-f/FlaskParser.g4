parser grammar FlaskParser;

options { tokenVocab=FlaskLexer; }

file_input
    : stmt_list EOF;

stmt_list
    : (statement | NEWLINE)*;

statement
    : simple_stmt
    | compound_stmt
    ;

simple_stmt
    : small_stmt (SEMI small_stmt)* SEMI? NEWLINE
    ;

small_stmt
    : import_stmt
    | expr_stmt
    | return_stmt
    | pass_stmt
    | del_stmt
    | global_stmt
    | nonlocal_stmt
    ;
//////////////////import///////////////////////////
import_stmt
    : IMPORT dotted_as_names
    | FROM dotted_name IMPORT import_as_names
    ;

import_as_names
    : import_as_name (COMMA import_as_name)*
    ;

import_as_name
    : NAME (AS NAME)?
    ;

dotted_as_names
    : dotted_as_name (COMMA dotted_as_name)*
    ;

dotted_as_name
    : dotted_name (AS NAME)?
    ;

dotted_name
    : NAME (DOT NAME)*
    ;

//////////////////////////////////////////////////
expr_stmt
    : testlist_star_expr (EQUAL testlist_star_expr)*
    ;

testlist_star_expr
    : test (COMMA  NEWLINE* test)* COMMA? NEWLINE?
    ;

test
    : or_test (IF or_test ELSE test)?
    ;

or_test
    : and_test (OR and_test)*
    ;

and_test
    : not_test (AND not_test)*
    ;

not_test
    : NOT not_test
    | comparison
    ;
//////////////////////////////////////////////////
comparison
    : expr (comp_op expr)*
    ;

comp_op
    : LESS | GREATER | EQEQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | IN | NOT IN | IS | IS NOT
    ;

expr
    : xor_expr (VBAR xor_expr)*
    ;

xor_expr
    : and_expr (CIRCUMFLEX and_expr)*
    ;

and_expr
    : shift_expr (AMPER shift_expr)*
    ;

shift_expr
    : arith_expr ((LEFTSHIFT | RIGHTSHIFT) arith_expr)*
    ;

arith_expr
    : term ((PLUS | MINUS) term)*
    ;

term
    : factor ((STAR | SLASH | DOUBLESLASH | PERCENT) factor)*
    ;

factor
    : (PLUS | MINUS)? power
    ;

power
    : atom_expr (DOUBLESTAR factor)?
    ;

atom_expr
    : AWAIT? atom trailer*
    ;

trailer
    : LPAR arglist? RPAR
    | LSQB test RSQB
    | LSQB subscriptlist RSQB
    | DOT NAME
    ;
arglist
    : argument (COMMA argument)* COMMA?
    ;


argument
    : NAME EQUAL test
    | test
    | STAR test
    | DOUBLESTAR test
    ;


atom
    : LPAR NEWLINE* generator_expression NEWLINE* RPAR
    | LPAR NEWLINE* testlist_star_expr? NEWLINE* RPAR
    | LSQB NEWLINE* testlist_star_expr? NEWLINE* RSQB
    | LBRACE NEWLINE* dictorsetmaker? NEWLINE* RBRACE
    | list_comp
    | NAME
    | NUMBER
    | STRING
    | TRUE
    | FALSE
    | NONE
    ;

list_comp
    : LSQB test (FOR NAME IN test (IF test)?)? (COMMA NEWLINE* test)* RSQB
    ;

generator_expression
    : test FOR NAME IN test (IF test)?
    ;

dictorsetmaker
    : dict_entry (COMMA NEWLINE* dict_entry)* COMMA? NEWLINE?
    | test (COMMA NEWLINE* test)* COMMA? NEWLINE?
    ;


dict_entry
    : test COLON test
    ;

decorators
    : decorator+
    ;

decorator

    : AT dotted_name (LPAR arglist? RPAR)? NEWLINE
    ;
subscriptlist
    : subscript (COMMA subscript)* COMMA?
    ;

subscript
    : test (COLON test?)?
    ;

return_stmt
    : RETURN testlist_star_expr?
    ;

pass_stmt
    : PASS
    ;

del_stmt
    : DEL exprlist
    ;

exprlist
    : test (COMMA test)* COMMA?
    ;

global_stmt
    : GLOBAL NAME (COMMA NAME)*
    ;

nonlocal_stmt
    : NONLOCAL NAME (COMMA NAME)*
    ;


compound_stmt
    : if_stmt
    | while_stmt
    | for_stmt
    | funcdef
    | classdef
    | with_stmt
    | try_stmt
    ;

if_stmt
    : IF test COLON stmt_list (ELIF test COLON stmt_list)* (ELSE COLON stmt_list)?
    ;

while_stmt
    : WHILE test COLON stmt_list
    ;

for_stmt
    : FOR exprlist IN testlist_star_expr COLON stmt_list
    ;

funcdef
    : decorators? DEF NAME LPAR parameters? RPAR (RARROW test)? COLON stmt_list
    ;


parameters
    : (typedargslist)?
    ;

typedargslist
    : tfpdef (COMMA tfpdef (EQUAL test)?)*
    ;

tfpdef
    : NAME
    ;

classdef
    : CLASS NAME LPAR? (NAME (COMMA NAME)*)? RPAR? COLON stmt_list
    ;

with_stmt
    : WITH with_item (COMMA with_item)* COLON stmt_list
    ;

with_item
    : test (AS NAME)?
    | atom_expr (AS NAME)?
    ;

try_stmt
    : TRY COLON stmt_list (EXCEPT (NAME)? COLON stmt_list)* (FINALLY COLON stmt_list)?
    ;