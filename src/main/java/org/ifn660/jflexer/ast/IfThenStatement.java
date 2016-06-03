package org.ifn660.jflexer.ast;

import java.io.IOException;
import java.nio.file.Path;

import org.ifn660.jflexer.cil.CIL;
import org.ifn660.jflexer.cil.CILOption;

public class IfThenStatement extends Statement {
    private Expression ifExpression;
    private Statement ifStatement;
    
    private LexicalScope scope;
    
    public IfThenStatement(Expression ifExpression, Statement ifStatement) {
        this.ifExpression = ifExpression;
        this.ifStatement = ifStatement;
    }
    
    @Override
    public void resolveNames(LexicalScope scope) {
        ifExpression.resolveNames(scope);
        ifStatement.resolveNames(scope);
    }

    
    @Override
    public void codeGeneration(Path path, CILOption cilOption)
            throws IOException {
        // emit(path, CIL.ONE_IDENT);
        LabelIndex lIndex = new LabelIndex();
        String label = lIndex.generateLabel();
        ifExpression.codeGeneration(path, CILOption.INIT);
        emit(path, CIL.TWO_IDENT + CIL.CEQ + "\r\n");

        String localVarIndex = String.valueOf(INDEX_COUNT++);
        emit(path, CIL.TWO_IDENT + CIL.STLOC + localVarIndex + "\r\n");
        emit(path, CIL.TWO_IDENT + CIL.LDLOC + localVarIndex + "\r\n");
        emit(path, CIL.TWO_IDENT + CIL.BRTRUE + CIL.TWO_IDENT + label);
        ifStatement.codeGeneration(path, cilOption);
        emit(path, CIL.ONE_IDENT + "\r\n" + CIL.TWO_IDENT + label + ": ");
    }
}
