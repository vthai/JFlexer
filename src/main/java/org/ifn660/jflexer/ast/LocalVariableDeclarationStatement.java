package org.ifn660.jflexer.ast;

public class LocalVariableDeclarationStatement extends Node {
    private VariableInitializer varInit;
    private Type type;
    
    public LocalVariableDeclarationStatement(Type type,  VariableInitializer varInit) {
        this.varInit = varInit;
        this.type = type;
    }
}
