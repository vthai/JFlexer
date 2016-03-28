
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package org.ifn660.jflexer;

/** CUP generated interface containing symbol constants. */
public interface sym {
  /* terminals */
  public static final int SHORT = 9;
  public static final int IDENTIFIER = 53;
  public static final int IMPLEMENTS = 15;
  public static final int OP_MINUS_AND = 81;
  public static final int OP_MODULUS_AND = 87;
  public static final int CONST = 5;
  public static final int OP_L_SHIFT_AND = 88;
  public static final int STRICTFP = 44;
  public static final int OP_MINUS = 70;
  public static final int OP_TERNARY = 59;
  public static final int ENUM = 35;
  public static final int RBRACK = 96;
  public static final int COMMA = 98;
  public static final int CATCH = 49;
  public static final int RBRACE = 94;
  public static final int THROW = 51;
  public static final int RPAREN = 92;
  public static final int LBRACK = 95;
  public static final int OP_ADD_AND = 80;
  public static final int DOUBLE = 6;
  public static final int LBRACE = 93;
  public static final int TRANSIENT = 47;
  public static final int OP_GT = 55;
  public static final int LPAREN = 91;
  public static final int PROTECTED = 30;
  public static final int INTEGER_LITERAL = 100;
  public static final int OP_LOOP_IN = 60;
  public static final int OP_LOGIC_OR = 66;
  public static final int FINAL = 36;
  public static final int OP_NOT_EQ = 57;
  public static final int FLOAT = 7;
  public static final int GOTO = 38;
  public static final int PACKAGE = 43;
  public static final int OP_MULTIPLY_AND = 82;
  public static final int OP_MULTIPLY = 71;
  public static final int CLASS = 11;
  public static final int SUPER = 12;
  public static final int ABSTRACT = 10;
  public static final int OP_LT = 56;
  public static final int OP_NEG_INCR = 68;
  public static final int OP_POS_INCR = 67;
  public static final int OP_R_SHIFT_AND = 89;
  public static final int NATIVE = 41;
  public static final int LONG = 8;
  public static final int WHILE = 22;
  public static final int EXTENDS = 14;
  public static final int INTERFACE = 13;
  public static final int CHAR = 4;
  public static final int BOOLEAN = 3;
  public static final int OP_BIT_INCL_OR = 85;
  public static final int SWITCH = 25;
  public static final int DO = 21;
  public static final int FOR = 23;
  public static final int VOID = 16;
  public static final int OP_UNSIGN_R_SHIFT = 79;
  public static final int PUBLIC = 28;
  public static final int RETURN = 27;
  public static final int OP_BIT_R_SHIFT = 78;
  public static final int ELSE = 20;
  public static final int TRY = 50;
  public static final int OP_BIT_L_SHIFT = 77;
  public static final int OP_EQ = 54;
  public static final int BREAK = 26;
  public static final int DOT = 99;
  public static final int INT = 2;
  public static final int THROWS = 52;
  public static final int OP_UNARY = 58;
  public static final int OP_LAMBDA = 61;
  public static final int OP_GT_EQ = 63;
  public static final int STRING_LITERAL = 101;
  public static final int NULL = 17;
  public static final int SEMICOLON = 97;
  public static final int OP_AND = 73;
  public static final int EOF = 0;
  public static final int THIS = 46;
  public static final int DEFAULT = 34;
  public static final int OP_DIVIDE_AND = 83;
  public static final int OP_XOR = 75;
  public static final int OP_LT_EQ = 64;
  public static final int IMPORT = 39;
  public static final int OP_BIT_EXCL_OR = 86;
  public static final int OP_UNSIGN_R_SHIFT_AND = 90;
  public static final int error = 1;
  public static final int OP_LOGIC_AND = 65;
  public static final int SYNCHRONIZED = 45;
  public static final int FINALLY = 37;
  public static final int CONTINUE = 33;
  public static final int IF = 19;
  public static final int INSTANCEOF = 40;
  public static final int ASSERT = 31;
  public static final int OP_DIVIDE = 72;
  public static final int VOLATILE = 48;
  public static final int UNKNOWN = 102;
  public static final int OP_BIT_AND = 84;
  public static final int CASE = 24;
  public static final int NEW = 42;
  public static final int OP_EQ_EQ = 62;
  public static final int BYTE = 32;
  public static final int PRIVATE = 29;
  public static final int STATIC = 18;
  public static final int OP_OR = 74;
  public static final int OP_MODULUS = 76;
  public static final int OP_PLUS = 69;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "INT",
  "BOOLEAN",
  "CHAR",
  "CONST",
  "DOUBLE",
  "FLOAT",
  "LONG",
  "SHORT",
  "ABSTRACT",
  "CLASS",
  "SUPER",
  "INTERFACE",
  "EXTENDS",
  "IMPLEMENTS",
  "VOID",
  "NULL",
  "STATIC",
  "IF",
  "ELSE",
  "DO",
  "WHILE",
  "FOR",
  "CASE",
  "SWITCH",
  "BREAK",
  "RETURN",
  "PUBLIC",
  "PRIVATE",
  "PROTECTED",
  "ASSERT",
  "BYTE",
  "CONTINUE",
  "DEFAULT",
  "ENUM",
  "FINAL",
  "FINALLY",
  "GOTO",
  "IMPORT",
  "INSTANCEOF",
  "NATIVE",
  "NEW",
  "PACKAGE",
  "STRICTFP",
  "SYNCHRONIZED",
  "THIS",
  "TRANSIENT",
  "VOLATILE",
  "CATCH",
  "TRY",
  "THROW",
  "THROWS",
  "IDENTIFIER",
  "OP_EQ",
  "OP_GT",
  "OP_LT",
  "OP_NOT_EQ",
  "OP_UNARY",
  "OP_TERNARY",
  "OP_LOOP_IN",
  "OP_LAMBDA",
  "OP_EQ_EQ",
  "OP_GT_EQ",
  "OP_LT_EQ",
  "OP_LOGIC_AND",
  "OP_LOGIC_OR",
  "OP_POS_INCR",
  "OP_NEG_INCR",
  "OP_PLUS",
  "OP_MINUS",
  "OP_MULTIPLY",
  "OP_DIVIDE",
  "OP_AND",
  "OP_OR",
  "OP_XOR",
  "OP_MODULUS",
  "OP_BIT_L_SHIFT",
  "OP_BIT_R_SHIFT",
  "OP_UNSIGN_R_SHIFT",
  "OP_ADD_AND",
  "OP_MINUS_AND",
  "OP_MULTIPLY_AND",
  "OP_DIVIDE_AND",
  "OP_BIT_AND",
  "OP_BIT_INCL_OR",
  "OP_BIT_EXCL_OR",
  "OP_MODULUS_AND",
  "OP_L_SHIFT_AND",
  "OP_R_SHIFT_AND",
  "OP_UNSIGN_R_SHIFT_AND",
  "LPAREN",
  "RPAREN",
  "LBRACE",
  "RBRACE",
  "LBRACK",
  "RBRACK",
  "SEMICOLON",
  "COMMA",
  "DOT",
  "INTEGER_LITERAL",
  "STRING_LITERAL",
  "UNKNOWN"
  };
}

