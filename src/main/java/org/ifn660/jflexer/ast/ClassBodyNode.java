package org.ifn660.jflexer.ast;

public class ClassBodyNode extends Node {
    private DummyNode terminate;

    public ClassBodyNode(Node terminate) {
        this.terminate = (DummyNode)terminate;
    }
}
