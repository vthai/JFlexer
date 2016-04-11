package org.ifn660.jflexer.ast;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
    private List<Node> children = new ArrayList<>();
    
    public abstract void printNode(int depth);
    
    public void addChild(Node child) {
        children.add(child);
    }
}
