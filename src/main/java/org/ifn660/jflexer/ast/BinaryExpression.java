package org.ifn660.jflexer.ast;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.ifn660.jflexer.cil.CIL;
import org.ifn660.jflexer.cil.CILOption;

public class BinaryExpression extends Expression {
    private Expression leftHandSide;
    private BinaryOperator operator;
    private Expression rightHandSide;
    
    public BinaryExpression(Expression leftHandSide, Expression rightHandSide, BinaryOperator operator) {
        this.leftHandSide = leftHandSide;
        this.operator = operator;
        this.rightHandSide = rightHandSide;
    }
    
    @Override
    public void resolveNames(LexicalScope scope) {
        leftHandSide.resolveNames(scope);
        rightHandSide.resolveNames(scope);
    }
    
    @Override
    public void codeGeneration(Path path, CILOption cilOption) throws IOException {      
        leftHandSide.codeGeneration(path, cilOption);
        rightHandSide.codeGeneration(path, cilOption);
        
        emit(path, CIL.TWO_IDENT + CIL.getBinaryOperator(operator) + "\r\n");
    }
}
