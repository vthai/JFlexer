
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package org.ifn660.jflexer;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150326 (SVN rev 63) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\002\004\000\002\002\004\000\002\002" +
    "\004\000\002\002\004\000\002\002\004\000\002\002\004" +
    "\000\002\002\004\000\002\002\004\000\002\002\004\000" +
    "\002\002\004\000\002\002\004\000\002\002\004\000\002" +
    "\002\004\000\002\002\004\000\002\002\004\000\002\002" +
    "\004\000\002\002\004\000\002\002\004\000\002\002\004" +
    "\000\002\002\004\000\002\002\004\000\002\002\004\000" +
    "\002\002\004\000\002\002\004\000\002\002\003\000\002" +
    "\003\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\062\000\062\002\uffe8\004\021\005\031\006\024\007" +
    "\026\010\015\011\032\012\030\013\033\014\011\015\022" +
    "\016\034\017\016\020\017\021\013\022\020\023\012\024" +
    "\014\025\004\026\006\027\025\030\027\031\005\032\007" +
    "\001\002\000\062\002\uffe8\004\021\005\031\006\024\007" +
    "\026\010\015\011\032\012\030\013\033\014\011\015\022" +
    "\016\034\017\016\020\017\021\013\022\020\023\012\024" +
    "\014\025\004\026\006\027\025\030\027\031\005\032\007" +
    "\001\002\000\062\002\uffe8\004\021\005\031\006\024\007" +
    "\026\010\015\011\032\012\030\013\033\014\011\015\022" +
    "\016\034\017\016\020\017\021\013\022\020\023\012\024" +
    "\014\025\004\026\006\027\025\030\027\031\005\032\007" +
    "\001\002\000\062\002\uffe8\004\021\005\031\006\024\007" +
    "\026\010\015\011\032\012\030\013\033\014\011\015\022" +
    "\016\034\017\016\020\017\021\013\022\020\023\012\024" +
    "\014\025\004\026\006\027\025\030\027\031\005\032\007" +
    "\001\002\000\062\002\uffe8\004\021\005\031\006\024\007" +
    "\026\010\015\011\032\012\030\013\033\014\011\015\022" +
    "\016\034\017\016\020\017\021\013\022\020\023\012\024" +
    "\014\025\004\026\006\027\025\030\027\031\005\032\007" +
    "\001\002\000\004\002\060\001\002\000\062\002\uffe8\004" +
    "\021\005\031\006\024\007\026\010\015\011\032\012\030" +
    "\013\033\014\011\015\022\016\034\017\016\020\017\021" +
    "\013\022\020\023\012\024\014\025\004\026\006\027\025" +
    "\030\027\031\005\032\007\001\002\000\062\002\uffe8\004" +
    "\021\005\031\006\024\007\026\010\015\011\032\012\030" +
    "\013\033\014\011\015\022\016\034\017\016\020\017\021" +
    "\013\022\020\023\012\024\014\025\004\026\006\027\025" +
    "\030\027\031\005\032\007\001\002\000\062\002\uffe8\004" +
    "\021\005\031\006\024\007\026\010\015\011\032\012\030" +
    "\013\033\014\011\015\022\016\034\017\016\020\017\021" +
    "\013\022\020\023\012\024\014\025\004\026\006\027\025" +
    "\030\027\031\005\032\007\001\002\000\062\002\uffe8\004" +
    "\021\005\031\006\024\007\026\010\015\011\032\012\030" +
    "\013\033\014\011\015\022\016\034\017\016\020\017\021" +
    "\013\022\020\023\012\024\014\025\004\026\006\027\025" +
    "\030\027\031\005\032\007\001\002\000\062\002\uffe8\004" +
    "\021\005\031\006\024\007\026\010\015\011\032\012\030" +
    "\013\033\014\011\015\022\016\034\017\016\020\017\021" +
    "\013\022\020\023\012\024\014\025\004\026\006\027\025" +
    "\030\027\031\005\032\007\001\002\000\062\002\uffe8\004" +
    "\021\005\031\006\024\007\026\010\015\011\032\012\030" +
    "\013\033\014\011\015\022\016\034\017\016\020\017\021" +
    "\013\022\020\023\012\024\014\025\004\026\006\027\025" +
    "\030\027\031\005\032\007\001\002\000\062\002\uffe8\004" +
    "\021\005\031\006\024\007\026\010\015\011\032\012\030" +
    "\013\033\014\011\015\022\016\034\017\016\020\017\021" +
    "\013\022\020\023\012\024\014\025\004\026\006\027\025" +
    "\030\027\031\005\032\007\001\002\000\062\002\uffe8\004" +
    "\021\005\031\006\024\007\026\010\015\011\032\012\030" +
    "\013\033\014\011\015\022\016\034\017\016\020\017\021" +
    "\013\022\020\023\012\024\014\025\004\026\006\027\025" +
    "\030\027\031\005\032\007\001\002\000\062\002\uffe8\004" +
    "\021\005\031\006\024\007\026\010\015\011\032\012\030" +
    "\013\033\014\011\015\022\016\034\017\016\020\017\021" +
    "\013\022\020\023\012\024\014\025\004\026\006\027\025" +
    "\030\027\031\005\032\007\001\002\000\062\002\uffe8\004" +
    "\021\005\031\006\024\007\026\010\015\011\032\012\030" +
    "\013\033\014\011\015\022\016\034\017\016\020\017\021" +
    "\013\022\020\023\012\024\014\025\004\026\006\027\025" +
    "\030\027\031\005\032\007\001\002\000\004\002\uffe9\001" +
    "\002\000\062\002\uffe8\004\021\005\031\006\024\007\026" +
    "\010\015\011\032\012\030\013\033\014\011\015\022\016" +
    "\034\017\016\020\017\021\013\022\020\023\012\024\014" +
    "\025\004\026\006\027\025\030\027\031\005\032\007\001" +
    "\002\000\062\002\uffe8\004\021\005\031\006\024\007\026" +
    "\010\015\011\032\012\030\013\033\014\011\015\022\016" +
    "\034\017\016\020\017\021\013\022\020\023\012\024\014" +
    "\025\004\026\006\027\025\030\027\031\005\032\007\001" +
    "\002\000\062\002\uffe8\004\021\005\031\006\024\007\026" +
    "\010\015\011\032\012\030\013\033\014\011\015\022\016" +
    "\034\017\016\020\017\021\013\022\020\023\012\024\014" +
    "\025\004\026\006\027\025\030\027\031\005\032\007\001" +
    "\002\000\062\002\uffe8\004\021\005\031\006\024\007\026" +
    "\010\015\011\032\012\030\013\033\014\011\015\022\016" +
    "\034\017\016\020\017\021\013\022\020\023\012\024\014" +
    "\025\004\026\006\027\025\030\027\031\005\032\007\001" +
    "\002\000\062\002\uffe8\004\021\005\031\006\024\007\026" +
    "\010\015\011\032\012\030\013\033\014\011\015\022\016" +
    "\034\017\016\020\017\021\013\022\020\023\012\024\014" +
    "\025\004\026\006\027\025\030\027\031\005\032\007\001" +
    "\002\000\062\002\uffe8\004\021\005\031\006\024\007\026" +
    "\010\015\011\032\012\030\013\033\014\011\015\022\016" +
    "\034\017\016\020\017\021\013\022\020\023\012\024\014" +
    "\025\004\026\006\027\025\030\027\031\005\032\007\001" +
    "\002\000\062\002\uffe8\004\021\005\031\006\024\007\026" +
    "\010\015\011\032\012\030\013\033\014\011\015\022\016" +
    "\034\017\016\020\017\021\013\022\020\023\012\024\014" +
    "\025\004\026\006\027\025\030\027\031\005\032\007\001" +
    "\002\000\062\002\uffe8\004\021\005\031\006\024\007\026" +
    "\010\015\011\032\012\030\013\033\014\011\015\022\016" +
    "\034\017\016\020\017\021\013\022\020\023\012\024\014" +
    "\025\004\026\006\027\025\030\027\031\005\032\007\001" +
    "\002\000\062\002\uffe8\004\021\005\031\006\024\007\026" +
    "\010\015\011\032\012\030\013\033\014\011\015\022\016" +
    "\034\017\016\020\017\021\013\022\020\023\012\024\014" +
    "\025\004\026\006\027\025\030\027\031\005\032\007\001" +
    "\002\000\004\002\ufff6\001\002\000\004\002\ufff9\001\002" +
    "\000\004\002\ufffb\001\002\000\004\002\uffff\001\002\000" +
    "\004\002\ufffa\001\002\000\004\002\uffec\001\002\000\004" +
    "\002\ufffd\001\002\000\004\002\uffed\001\002\000\004\002" +
    "\ufffe\001\002\000\004\002\ufff7\001\002\000\004\002\001" +
    "\001\002\000\004\002\ufff2\001\002\000\004\002\ufff4\001" +
    "\002\000\004\002\ufff5\001\002\000\004\002\ufffc\001\002" +
    "\000\004\002\ufff0\001\002\000\004\002\ufff3\001\002\000" +
    "\004\002\ufff1\001\002\000\004\002\ufff8\001\002\000\004" +
    "\002\000\001\002\000\004\002\uffea\001\002\000\004\002" +
    "\uffee\001\002\000\004\002\uffeb\001\002\000\004\002\uffef" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\062\000\006\002\007\003\022\001\001\000\006\002" +
    "\063\003\022\001\001\000\006\002\062\003\022\001\001" +
    "\000\006\002\061\003\022\001\001\000\006\002\060\003" +
    "\022\001\001\000\002\001\001\000\006\002\056\003\022" +
    "\001\001\000\006\002\055\003\022\001\001\000\006\002" +
    "\054\003\022\001\001\000\006\002\053\003\022\001\001" +
    "\000\006\002\052\003\022\001\001\000\006\002\051\003" +
    "\022\001\001\000\006\002\050\003\022\001\001\000\006" +
    "\002\047\003\022\001\001\000\006\002\046\003\022\001" +
    "\001\000\006\002\045\003\022\001\001\000\002\001\001" +
    "\000\006\002\044\003\022\001\001\000\006\002\043\003" +
    "\022\001\001\000\006\002\042\003\022\001\001\000\006" +
    "\002\041\003\022\001\001\000\006\002\040\003\022\001" +
    "\001\000\006\002\037\003\022\001\001\000\006\002\036" +
    "\003\022\001\001\000\006\002\035\003\022\001\001\000" +
    "\006\002\034\003\022\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


 
  public void report_error(String message, Object info) {
    StringBuilder m = new StringBuilder("Error ");

    if (info instanceof java_cup.runtime.Symbol) 
      m.append( "("+info.toString()+")" );
     
    m.append(" : "+message);
   
    System.out.println(m);
  }
   
  public void report_fatal_error(String message, Object info) {
    report_error(message, info);
    throw new RuntimeException("Fatal Syntax Error");
  }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr ::= PUBLIC expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr ::= ABSTRACT expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= BOOLEAN expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= BREAK expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= IDENTIFIER expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= INTEGER_LITERAL expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= EQ expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= EQEQ expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= PLUS expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= STRING_LITERAL expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= UNKNOWN expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= IF expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= LPAREN expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= RPAREN expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= LBRACE expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= RBRACE expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= LBRACK expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= RBRACK expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= SEMICOLON expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= COMMA expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr ::= DOT expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr ::= ELSE expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expr ::= CLASS expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expr ::= eof 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // eof ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("eof",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
