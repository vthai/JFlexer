package org.ifn660.jflexer.ast;

import java.util.List;

public class ClassNode extends Node {
    private String name;
    
    private List<Integer> modifiers;
    
    public ClassNode(String name, int modifier) {
        this.name = name;
        this.modifiers.add(modifier);
    }

    @Override
    public void printNode(int depth) {
        StringBuilder str = new StringBuilder();
        str.append("Class:")
            .append("\n")
            .append("name:")
            .append(name);
        
        str.append("modifiers:");
        for(int modifier : modifiers) {
            str.append(modifier).append(",");
        }
        
        System.out.println(str.toString());
    }
}
