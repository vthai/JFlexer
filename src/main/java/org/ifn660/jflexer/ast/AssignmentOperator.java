package org.ifn660.jflexer.ast;

public class AssignmentOperator extends Node {
    private String operator;

    public AssignmentOperator(String operator) {
        this.operator = operator;
    }
}
