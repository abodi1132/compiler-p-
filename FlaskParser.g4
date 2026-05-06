parser grammar FlaskParser;

options { tokenVocab=FlaskLexer; }


file_input
    : (statement | NEWLINE)* EOF
    ;

stmt_list
    : INDENT (statement | NEWLINE)+ DEDENT
    ;

statement
    : simple_stmt   # StmtSimple
    | compound_stmt # StmtCompound
    ;


simple_stmt
    : small_stmt (SEMI small_stmt)* SEMI? NEWLINE
    ;

small_stmt
    : import_stmt   # SmallImport
    | expr_stmt     # SmallExpr
    | return_stmt   # SmallReturn
    | pass_stmt     # SmallPass
    | del_stmt      # SmallDel
    | global_stmt   # SmallGlobal
    | nonlocal_stmt # SmallNonlocal
    ;

import_stmt
    : IMPORT dotted_as_names                        # ImportRegular
    | FROM dotted_name IMPORT import_as_names       # ImportFrom
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

expr_stmt
    : target=testlist_star_expr (EQUAL value=testlist_star_expr)+ # ExprAssign
    | testlist_star_expr                                           # ExprPlain
    ;

testlist_star_expr
    : test (COMMA test)* COMMA?
    ;

test
    : body=or_test IF cond=or_test ELSE alt=test  # TestTernary
    | or_test                                      # TestSimple
    ;

or_test
    : and_test (OR and_test)*
    ;

and_test
    : not_test (AND not_test)*
    ;

not_test
    : NOT not_test    # NotTestNot
    | comparison      # NotTestComp
    ;

comparison
    : expr (comp_op expr)*
    ;

comp_op
    : LESS
    | GREATER
    | EQEQUAL
    | NOTEQUAL
    | LESSEQUAL
    | GREATEREQUAL
    | IN
    | NOT IN
    | IS
    | IS NOT
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
    : op=(PLUS | MINUS) factor  # FactorUnary
    | power                     # FactorPower
    ;

power
    : atom_expr (DOUBLESTAR factor)?
    ;

atom_expr
    : AWAIT? atom trailer*
    ;

trailer
    : LPAR arglist? RPAR               # TrailerCall
    | LSQB subscriptlist RPAR          # TrailerSubscriptList
    | LSQB test RSQB                   # TrailerIndex
    | DOT NAME                         # TrailerAttr
    ;

arglist
    : argument (COMMA argument)* COMMA?
    ;

argument
    : NAME EQUAL test  # ArgKeyword
    | test             # ArgPositional
    | STAR test        # ArgStar
    | DOUBLESTAR test  # ArgDoubleStar
    ;

atom
    : LPAR generator_expression RPAR    # AtomGeneratorExpr
    | LPAR testlist_star_expr? RPAR     # AtomTuple
    | LSQB list_comp RSQB              # AtomListComp
    | LSQB testlist_star_expr? RSQB    # AtomList
    | LBRACE dictorsetmaker? RBRACE     # AtomDict
    | NAME                              # AtomName
    | NUMBER                            # AtomNumber
    | STRING                            # AtomString
    | TRUE                              # AtomTrue
    | FALSE                             # AtomFalse
    | NONE                              # AtomNone
    ;

list_comp
    : test (FOR NAME IN test (IF test)?)? (COMMA test)*
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

subscriptlist
    : subscript (COMMA subscript)* COMMA?
    ;

subscript
    : test (COLON test?)?
    ;

compound_stmt
    : if_stmt    # CompoundIf
    | while_stmt # CompoundWhile
    | for_stmt   # CompoundFor
    | funcdef    # CompoundFuncdef
    | classdef   # CompoundClass
    | with_stmt  # CompoundWith
    | try_stmt   # CompoundTry
    ;

if_stmt
    : IF test COLON stmt_list
      (ELIF test COLON stmt_list)*
      (ELSE COLON stmt_list)?
    ;

while_stmt
    : WHILE test COLON stmt_list
    ;

for_stmt
    : FOR targets=loop_vars IN iters=testlist_star_expr COLON body=stmt_list
    ;

loop_vars
    : NAME (COMMA NAME)* COMMA?
    ;

funcdef
    : decorators? DEF NAME LPAR parameters? RPAR (RARROW test)? COLON stmt_list
    ;

decorators
    : decorator+
    ;

decorator
    : AT dotted_name (LPAR arglist? RPAR)? NEWLINE
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
    : CLASS NAME (LPAR (NAME (COMMA NAME)*)? RPAR)? COLON stmt_list
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