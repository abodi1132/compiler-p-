parser grammar FlaskParser;

options { tokenVocab=FlaskLexer; }
statement
    : simple_stmt       #SimpleStatement
    | compound_stmt     #CompoundStatement
    ;
file_input
    : (statement | NEWLINE)* EOF        #FileInput
    ;

stmt_list
    : INDENT (statement | NEWLINE)+ DEDENT       #StatementBlock
    ;



simple_stmt
    : small_stmt (SEMI small_stmt)* SEMI? NEWLINE       #SimpleStmtLine
    ;

small_stmt
    : import_stmt                       #ImportStmt
    | expr_stmt                         #ExprStmt
    | return_stmt                       #ReturnStmt
    | pass_stmt                         #PassStmt
    | del_stmt                          #DelStmt
    | global_stmt                       #GlobalStmt
    | nonlocal_stmt                     #NonlocalStmt
    ;

import_stmt
    : IMPORT dotted_as_names                    #ImportModule
    | FROM dotted_name IMPORT import_as_names   #ImportFrom
    ;

import_as_names
    : import_as_name (COMMA import_as_name)*    #ImportAsNames
    ;

import_as_name
    : NAME (AS NAME)?                           #ImportAsName
    ;

dotted_as_names
    : dotted_as_name (COMMA dotted_as_name)*
    ;

dotted_as_name
    : dotted_name (AS NAME)?
    ;

dotted_name
    : NAME (DOT NAME)*                          #DottedName
    ;

expr_stmt
    : testlist_star_expr (EQUAL testlist_star_expr)*    #AssignmentExpr
    ;

testlist_star_expr
    : test (COMMA test)* COMMA?
    ;

test
    : or_test (IF or_test ELSE test)?                    #ConditionalExpr
    ;

or_test
    : and_test (OR and_test)*       #OrTest
    ;

and_test
    : not_test (AND not_test)*      #AndTest
    ;

not_test
    : NOT not_test                  #NotTest
    | comparison                    #ComparisonTest
    ;

comparison
    : expr (comp_op expr)*
    ;

comp_op
    : LESS | GREATER | EQEQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | IN | NOT IN | IS | IS NOT
    ;

expr
    : xor_expr (VBAR xor_expr)*     #BitOrExpr
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
    : term ((PLUS | MINUS) term)*       #AddSubExpr
    ;

term
    : factor ((STAR | SLASH | DOUBLESLASH | PERCENT) factor)*       #MulDivExpr
    ;

factor
    : (PLUS | MINUS)? power
    ;

power
    : atom_expr (DOUBLESTAR factor)?
    ;

atom_expr
    : AWAIT? atom trailer*          #AtomExpression
    ;

trailer
    : LPAR arglist? RPAR                #CallTrailer
    | LSQB test RSQB                    #IndexTrailer
    | LSQB subscriptlist RSQB           #SliceTrailer
    | DOT NAME                          #AttrTrailer
    ;

arglist
    : argument (COMMA argument)* COMMA?
    ;

argument
    : NAME EQUAL test                  #KeywordArgument
    | test                             #PositionalArgument
    | STAR test                        #StarArgument
    | DOUBLESTAR test                  #KwStarArgument
    ;

atom
    : LPAR generator_expression RPAR        #GeneratorAtom
    | LPAR testlist_star_expr? RPAR         #ParenAtom
    | LSQB testlist_star_expr? RSQB         #ListAtom
    | LBRACE dictorsetmaker? RBRACE         #DictOrSetAtom
    | list_comp                             #ListCompAtom
    | NAME                                  #NameAtom
    | NUMBER                                #NumberAtom
    | STRING                                #StringAtom
    | TRUE                                  #TrueAtom
    | FALSE                                 #FalseAtom
    | NONE                                  #NoneAtom
    ;

list_comp
    : LSQB test (FOR NAME IN test (IF test)?)? (COMMA test)* RSQB
    ;

generator_expression
    : test FOR NAME IN test (IF test)?
    ;

dictorsetmaker
    : dict_entry (COMMA dict_entry)* COMMA?
    | test (COMMA test)* COMMA?
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
    : if_stmt                          #IfStmt
    | while_stmt                       #WhileStmt
    | for_stmt                         #ForStmt
    | funcdef                          #FunctionDef
    | classdef                         #ClassDef
    | with_stmt                        #WithStmt
    | try_stmt                         #TryStmt
    ;

if_stmt
    : IF test COLON stmt_list (ELIF test COLON stmt_list)* (ELSE COLON stmt_list)?      #IfStatement
    ;

while_stmt
    : WHILE test COLON stmt_list         #WhileStatement
    ;

for_stmt
    : FOR exprlist IN testlist_star_expr COLON stmt_list        #ForStatement
    ;

funcdef
    : decorators? DEF NAME LPAR parameters? RPAR (RARROW test)? COLON stmt_list         #FunctionDefinition
    ;

parameters
    : typedargslist?
    ;

typedargslist
    : tfpdef (EQUAL test)? (COMMA tfpdef (EQUAL test)?)*
    ;

tfpdef
    : NAME
    ;

classdef
    : CLASS NAME (LPAR (NAME (COMMA NAME)*)? RPAR)? COLON stmt_list         #ClassDefinition
    ;

with_stmt
    : WITH with_item (COMMA with_item)* COLON stmt_list
    ;

with_item
    : test (AS NAME)?
    ;

try_stmt
    : TRY COLON stmt_list (EXCEPT (NAME)? COLON stmt_list)* (FINALLY COLON stmt_list)?
    ;