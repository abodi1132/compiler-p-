lexer grammar FlaskLexer;

tokens { INDENT, DEDENT }

@header {
import java.util.*;
}

@members {
    private Deque<Token> tokenQueue = new ArrayDeque<>();
    private Stack<Integer> indentStack = new Stack<Integer>() {{ push(0); }};

    @Override
    public Token nextToken() {
//        emit manual tokens from queue if we have them
        if (!tokenQueue.isEmpty()) {
            return tokenQueue.poll();
        }

//        get the next real token from the source
        Token next = super.nextToken();

//       skip processing for EOF initially
        if (next.getType() == EOF) {
            while (indentStack.size() > 1) {
                indentStack.pop();
                tokenQueue.add(createToken(DEDENT, "", next));
            }
            tokenQueue.add(next);
            return tokenQueue.poll();
        }

        if (next.getType() == NEWLINE) {
            String text = next.getText();
            // Calculate indentation by counting spaces/tabs after the last newline character
            int lastNl = text.lastIndexOf('\n');
            if (lastNl == -1) {
                lastNl = text.lastIndexOf('\r');
            }
            int currentIndent = 0;
            if (lastNl >= 0 && lastNl < text.length() - 1) {
                currentIndent = text.length() - lastNl - 1;
            }

            int lastIndent = indentStack.peek();

            if (currentIndent > lastIndent) {
                // Indent: Push new level and emit INDENT
                indentStack.push(currentIndent);
                tokenQueue.add(next); // Add the NEWLINE first
                tokenQueue.add(createToken(INDENT, "", next));
                return tokenQueue.poll();
            } else if (currentIndent < lastIndent) {
                // Dedent: Pop levels until we match and emit DEDENT for each
                tokenQueue.add(next); // Add the NEWLINE first
                while (indentStack.size() > 1 && currentIndent < indentStack.peek()) {
                    indentStack.pop();
                    tokenQueue.add(createToken(DEDENT, "", next));
                }
                return tokenQueue.poll();
            }
        }

        return next;
    }

    private Token createToken(int type, String text, Token prototype) {
        CommonToken token = new CommonToken(_tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL,
                                            prototype.getStartIndex(), prototype.getStopIndex());
        token.setLine(prototype.getLine());
        token.setCharPositionInLine(prototype.getCharPositionInLine());
        token.setText(text);
        return token;
    }
}

LPAR     : '(';
RPAR     : ')';
LSQB     : '[';
RSQB     : ']';
LBRACE   : '{';
RBRACE   : '}';
DOT      : '.';
COLON    : ':';
COMMA    : ',';
SEMI     : ';';
PLUS     : '+';
MINUS    : '-';
STAR     : '*';
SLASH    : '/';
CIRCUMFLEX : '^';
LEFTSHIFT  : '<<';
RIGHTSHIFT : '>>';
VBAR     : '|';
AMPER    : '&';
LESS     : '<';
GREATER  : '>';
EQUAL    : '=';
EQEQUAL  : '==';
NOTEQUAL : '!=';
LESSEQUAL: '<=';
GREATEREQUAL: '>=';
PERCENT  : '%';
PLUSEQUAL: '+=';
MINEQUAL : '-=';
STAREQUAL: '*=';
SLASHEQUAL: '/=';
DOUBLESTAR: '**';
DOUBLESLASH: '//';
AT       : '@';
RARROW   : '->';
ELLIPSIS : '...';
EXCLAMATION : '!';

FALSE    : 'False';
TRUE     : 'True';
NONE     : 'None';
PASS     : 'pass';
BREAK    : 'break';
CONTINUE : 'continue';
IF       : 'if';
ELSE     : 'else';
ELIF     : 'elif';
FOR      : 'for';
IN       : 'in';
WHILE    : 'while';
DEF      : 'def';
RETURN   : 'return';
IMPORT   : 'import';
FROM     : 'from';
AS       : 'as';
WITH     : 'with';
TRY      : 'try';
EXCEPT   : 'except';
FINALLY  : 'finally';
CLASS    : 'class';
GLOBAL   : 'global';
NONLOCAL : 'nonlocal';
DEL      : 'del';
RAISE    : 'raise';
ASSERT   : 'assert';
LAMBDA   : 'lambda';
AWAIT    : 'await';
YIELD    : 'yield';
OR       : 'or';
AND      : 'and';
NOT      : 'not';
IS       : 'is';

NAME     : [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER   : [0-9]+ ('.' [0-9]+)?;
STRING   : '"' (~["\\] | '\\' .)* '"'
         | '\'' (~['\\] | '\\' .)* '\'';

NEWLINE  : ('\r'? '\n')+ [ \t]*;
COMMENT  : '#' ~[\r\n]* -> channel(HIDDEN);
WS       : [ \t]+ -> skip;