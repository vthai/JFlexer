package org.ifn660.jflexer.ast;

/**
 * 
 * Class that should implement this interface:
 * 
 * LocalVariableDeclaration     DONE  (for fields in method body)
 * FieldDeclaration             TODO  (for class level fields)
 *
 */
public interface Declaration {
    String getName();
    
    int getCilLocalVarIndex();
    
    public String passVariables(String variable);
}
