package org.ifn660.jflexer.ast;

public class ClassNode extends Node {
    private IdentifierNode className;
    
    private ClassBodyNode body;
    
    public ClassNode(Node className, Node body) {
        this.className = (IdentifierNode)className;
        this.body = (ClassBodyNode)body;
    }
}
