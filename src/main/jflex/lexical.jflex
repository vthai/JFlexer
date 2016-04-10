/* JFlex example: partial Java language lexer specification */
package org.ifn660.jflexer;

import java_cup.runtime.*;

/**
 * This class is a simple example lexer.
 */
 
%%

%public
%class Lexer
%cup    // switches to CUP compatibility mode to interface with a CUP generated parser.
%line   //switches line counting on (the current line number can be accessed via the variable yyline)
%column //switches column counting on (the current column is accessed via yycolumn)
%state STRING, CHARLITERAL

%{
  StringBuilder string = new StringBuilder();
  
  private Symbol symbol(int type) {
    return new JavaSymbol(type, yyline+1, yycolumn+1);
  }

  private Symbol symbol(int type, Object value) {
    return new JavaSymbol(type, yyline+1, yycolumn+1, value);
  }

  /** 
   * assumes correct representation of a long value for 
   * specified radix in scanner buffer from <code>start</code> 
   * to <code>end</code> 
   */
  private long parseLong(int start, int end, int radix) {
    long result = 0;
    long digit;

    for (int i = start; i < end; i++) {
      digit  = Character.digit(yycharat(i),radix);
      result*= radix;
      result+= digit;
    }

    return result;
  }
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

Identifier = [:jletter:] [:jletterdigit:]*

DecIntegerLiteral = 0 | [1-9][0-9]*

StringCharacter = [^\r\n\"\\]
SingleCharacter = [^\r\n\'\\]


%%


/* keywords */
<YYINITIAL> "abstract"           { return symbol(sym.ABSTRACT); }
<YYINITIAL> "assert"             { return symbol(sym.ASSERT); }
<YYINITIAL> "boolean"            { return symbol(sym.BOOLEAN); }
<YYINITIAL> "break"              { return symbol(sym.BREAK); }
<YYINITIAL> "byte"               { return symbol(sym.BYTE); }
<YYINITIAL> "case"               { return symbol(sym.CASE); }
<YYINITIAL> "catch"              { return symbol(sym.CATCH); }
<YYINITIAL> "char"               { return symbol(sym.CHAR); }
<YYINITIAL> "class"              { return symbol(sym.CLASS); }
<YYINITIAL> "const"              { return symbol(sym.CONST); }
<YYINITIAL> "continue"           { return symbol(sym.CONTINUE); }
<YYINITIAL> "default"            { return symbol(sym.DEFAULT); }
<YYINITIAL> "do"                 { return symbol(sym.DO); }
<YYINITIAL> "double"             { return symbol(sym.DOUBLE); }
<YYINITIAL> "else"               { return symbol(sym.ELSE); }
<YYINITIAL> "enum"               { return symbol(sym.ENUM); }
<YYINITIAL> "extends"            { return symbol(sym.EXTENDS); }
<YYINITIAL> "final"              { return symbol(sym.FINAL); }
<YYINITIAL> "finally"            { return symbol(sym.FINALLY); }
<YYINITIAL> "float"              { return symbol(sym.FLOAT); }
<YYINITIAL> "for"                { return symbol(sym.FOR); }
<YYINITIAL> "goto"               { return symbol(sym.GOTO); }
<YYINITIAL> "if"                 { return symbol(sym.IF); }
<YYINITIAL> "implements"         { return symbol(sym.IMPLEMENTS); }
<YYINITIAL> "import"             { return symbol(sym.IMPORT); }
<YYINITIAL> "instanceof"         { return symbol(sym.INSTANCEOF); }
<YYINITIAL> "int"                { return symbol(sym.INT); }
<YYINITIAL> "interface"          { return symbol(sym.INTERFACE); }
<YYINITIAL> "long"               { return symbol(sym.LONG); }
<YYINITIAL> "native"             { return symbol(sym.NATIVE); }
<YYINITIAL> "new"                { return symbol(sym.NEW); }
<YYINITIAL> "package"            { return symbol(sym.PACKAGE); }
<YYINITIAL> "private"            { return symbol(sym.PRIVATE); }
<YYINITIAL> "protected"          { return symbol(sym.PROTECTED); }
<YYINITIAL> "public"             { return symbol(sym.PUBLIC); }
<YYINITIAL> "return"             { return symbol(sym.RETURN); }
<YYINITIAL> "short"              { return symbol(sym.SHORT); }
<YYINITIAL> "static"             { return symbol(sym.STATIC); }
<YYINITIAL> "strictfp"           { return symbol(sym.STRICTFP); }
<YYINITIAL> "super"              { return symbol(sym.SUPER); }
<YYINITIAL> "switch"             { return symbol(sym.SWITCH); }
<YYINITIAL> "synchronized"       { return symbol(sym.SYNCHRONIZED); }
<YYINITIAL> "this"               { return symbol(sym.THIS); }
<YYINITIAL> "throw"              { return symbol(sym.THROW); }
<YYINITIAL> "throws"             { return symbol(sym.THROWS); }
<YYINITIAL> "transient"          { return symbol(sym.TRANSIENT); }
<YYINITIAL> "try"                { return symbol(sym.TRY); }
<YYINITIAL> "void"               { return symbol(sym.VOID); }
<YYINITIAL> "volatile"           { return symbol(sym.VOLATILE); }
<YYINITIAL> "while"              { return symbol(sym.WHILE); }


<YYINITIAL> {

/* identifiers */ 
  {Identifier}                   { return symbol(sym.IDENTIFIER); }
 
 
/* literals */
  {DecIntegerLiteral}            { return symbol(sym.INTEGER_LITERAL,new Integer(yytext())); }
  \"                             { string.setLength(0); yybegin(STRING); }


/* separators */
  "("                            { return symbol(sym.LPAREN); }
  ")"                            { return symbol(sym.RPAREN); }
  "{"                            { return symbol(sym.LBRACE); }
  "}"                            { return symbol(sym.RBRACE); }
  "["                            { return symbol(sym.LBRACK); }
  "]"                            { return symbol(sym.RBRACK); }
  ";"                            { return symbol(sym.SEMICOLON); }
  ","                            { return symbol(sym.COMMA); }
  "."                            { return symbol(sym.DOT); }


  /* operators */
  "="                            { return symbol(sym.OP_EQ); }
  ">"                            { return symbol(sym.OP_GT); }
  "<"                            { return symbol(sym.OP_LT); }
  "!"                            { return symbol(sym.OP_NOT_EQ); }
  "~"                            { return symbol(sym.OP_UNARY); } //INVERTS BITS
  "?"                            { return symbol(sym.OP_TERNARY); } // BOOLEAN STATEMENT EVALUATION
  ":"                            { return symbol(sym.OP_LOOP_IN); } // FOR LOOP OPERATOR, i.e. FOR EACH ELEMENT E "IN" ELEMENTS
  "->"                           { return symbol(sym.OP_LAMBDA); }
  "=="                           { return symbol(sym.OP_EQ_EQ); }
  ">="                           { return symbol(sym.OP_GT_EQ); }
  "<="                           { return symbol(sym.OP_LT_EQ); }
  "!="                           { return symbol(sym.OP_NOT_EQ); }
  "&&"                           { return symbol(sym.OP_LOGIC_AND); }
  "||"                           { return symbol(sym.OP_LOGIC_OR); }
  "++"                           { return symbol(sym.OP_POS_INCR); }
  "--"                           { return symbol(sym.OP_NEG_INCR); }
  "+"                            { return symbol(sym.OP_PLUS); }
  "-"                            { return symbol(sym.OP_MINUS); } // note: this will need to be differentiated from a negative value
  "*"                            { return symbol(sym.OP_MULTIPLY); }
  "/"                            { return symbol(sym.OP_DIVIDE); }
  "&"                            { return symbol(sym.OP_AND); }
  "|"                            { return symbol(sym.OP_OR); }
  "^"                            { return symbol(sym.OP_XOR); }
  "%"                            { return symbol(sym.OP_MODULUS); }
  "<<"                           { return symbol(sym.OP_BIT_L_SHIFT); }
  ">>"                           { return symbol(sym.OP_BIT_R_SHIFT); }
  ">>>"                          { return symbol(sym.OP_UNSIGN_R_SHIFT); }
  "+="                           { return symbol(sym.OP_ADD_AND); }
  "-="                           { return symbol(sym.OP_MINUS_AND); }
  "*="                           { return symbol(sym.OP_MULTIPLY_AND); }
  "/="                           { return symbol(sym.OP_DIVIDE_AND); }
  "&="                           { return symbol(sym.OP_BIT_AND); }
  "|="                           { return symbol(sym.OP_BIT_INCL_OR); } // BITWISE INCLUSIVE OR
  "^="                           { return symbol(sym.OP_BIT_EXCL_OR); }
  "%="                           { return symbol(sym.OP_MODULUS_AND); }
  "<<="                          { return symbol(sym.OP_L_SHIFT_AND); }
  ">>="                          { return symbol(sym.OP_R_SHIFT_AND); }
  ">>>="                         { return symbol(sym.OP_UNSIGN_R_SHIFT_AND); }

  /* comments */
  {Comment}                      { /* ignore */ }
 
 
  /* whitespace */
  {WhiteSpace}                   { /* ignore */ }
  
}


<STRING> {
  \"                             { yybegin(YYINITIAL); return symbol(STRING_LITERAL, string.toString()); }
  
  {StringCharacter}+             { string.append( yytext() ); }
  
  /* escape sequences */
  "\\b"                          { string.append( '\b' ); }
  "\\t"                          { string.append( '\t' ); }
  "\\n"                          { string.append( '\n' ); }
  "\\f"                          { string.append( '\f' ); }
  "\\r"                          { string.append( '\r' ); }
  "\\\""                         { string.append( '\"' ); }
  "\\'"                          { string.append( '\'' ); }
  "\\\\"                         { string.append( '\\' ); }
  //\\[0-3]?{OctDigit}?{OctDigit}  { char val = (char) Integer.parseInt(yytext().substring(1),8);
                        				   string.append( val ); }


/* character literal */
  \'                             { yybegin(CHARLITERAL); }
  
<CHARLITERAL> {
  {SingleCharacter}\'            { yybegin(YYINITIAL); return symbol(CHARACTER_LITERAL, yytext().charAt(0)); }
  
  /* escape sequences */
  "\\b"\'                        { yybegin(YYINITIAL); return symbol(CHARACTER_LITERAL, '\b');}
  "\\t"\'                        { yybegin(YYINITIAL); return symbol(CHARACTER_LITERAL, '\t');}
  "\\n"\'                        { yybegin(YYINITIAL); return symbol(CHARACTER_LITERAL, '\n');}
  "\\f"\'                        { yybegin(YYINITIAL); return symbol(CHARACTER_LITERAL, '\f');}
  "\\r"\'                        { yybegin(YYINITIAL); return symbol(CHARACTER_LITERAL, '\r');}
  "\\\""\'                       { yybegin(YYINITIAL); return symbol(CHARACTER_LITERAL, '\"');}
  "\\'"\'                        { yybegin(YYINITIAL); return symbol(CHARACTER_LITERAL, '\'');}
  "\\\\"\'                       { yybegin(YYINITIAL); return symbol(CHARACTER_LITERAL, '\\'); }
  //\\[0-3]?{OctDigit}?{OctDigit}\' { yybegin(YYINITIAL); 
			                              int val = Integer.parseInt(yytext().substring(1,yylength()-1),8);
			                            return symbol(CHARACTER_LITERAL, (char)val); }


<<EOF>> {return symbol(sym.EOF);}
/* error fallback */
[^]                              { return symbol(sym.UNKNOWN); }