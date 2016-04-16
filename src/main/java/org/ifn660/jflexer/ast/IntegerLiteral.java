package org.ifn660.jflexer.ast;

public class IntegerLiteral extends Expression {
    private int value;
    
    public IntegerLiteral(int value) {
        this.value = value;
    }
}
