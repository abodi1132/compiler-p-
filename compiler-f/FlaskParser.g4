parser grammar FlaskParser;
options {tokenVocab = FlaskLexer; }
function : FUNCTION OPEN_BRACKET NUMBER CLOSE_BRACKET SEMICOLEN;