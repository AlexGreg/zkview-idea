package com.zkview;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.zkview.psi.ZKTypes;
import com.intellij.psi.TokenType;

%%

%class ZKLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{   return;
%eof}

CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
FIRST_VALUE_CHARACTER=[^ \n\r\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\r\f\\] | "\\"{CRLF} | "\\".
COMMENT= "<!--".*?"-->"
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\r\t\f\\] | "\\"{CRLF} | "\\".

%state WAITING_VALUE

%%

<WAITING_VALUE> {COMMENT}                                                 { yybegin(WAITING_VALUE); return ZKTypes.COMMENT; }

<YYINITIAL> {COMMENT}                                                 { yybegin(YYINITIAL); return ZKTypes.COMMENT; }

<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return ZKTypes.KEY; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return ZKTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}                                     { yybegin(YYINITIAL); return ZKTypes.CRLF; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return ZKTypes.VALUE; }

{CRLF}                                                     { yybegin(YYINITIAL); return ZKTypes.CRLF; }

{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }