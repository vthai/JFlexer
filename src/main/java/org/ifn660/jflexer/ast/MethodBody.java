package org.ifn660.jflexer.ast;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import org.ifn660.jflexer.cil.CIL;
import org.ifn660.jflexer.cil.CILOption;

public class MethodBody extends Node {
	private List <Statement> statements;
	
	private LexicalScope scope;
	
	public MethodBody(List <Statement> localVarDec) {
		this.statements = localVarDec;
		this.scope = new LexicalScope();
	}
	
	@Override
	public void resolveNames(LexicalScope scope) {
	    // the scope from whom invoked this method is the parent scope
	    this.scope.parentScope = scope;
	    
	    // add all declaration statement to the symbol table of method scope
	    for(Statement statement : statements) {
	        // check if this is the statement belongs to declaration type
	        // currently there are only two candidiates : 
	        // LocalVariableDeclarationStatement and FieldDeclaration
	        if (statement instanceof Declaration) {
	            Declaration declaration = (Declaration) statement;
	            // if this is true, then record that declaration in the symbol table
	            this.scope.symbolTable.put(declaration.getName(), declaration);
	        }
	    }
	    
	    for(Statement statement : statements) {
	        statement.resolveNames(this.scope);
	    }
	}
	
	@Override
	public void codeGeneration(Path path, CILOption cilOption) throws IOException {
		StringBuilder msg = new StringBuilder(CIL.TWO_IDENT);
		msg.append(".entrypoint\r\n");
		msg.append(CIL.TWO_IDENT);
		 msg.append(".locals init (");
        Files.write(path, msg.toString().getBytes(), StandardOpenOption.APPEND);
        
        
        boolean firstOne = true;
		
        for (Statement statement : statements) {
			if (Declaration.class.isInstance(statement)){	           
		           if (firstOne)
		            {
		                firstOne = false;
		            } else {
		            	StringBuilder msg4 = new StringBuilder();
		                msg4.append(",\r\n");
		                msg4.append(CIL.THREE_IDENT);
		                Files.write(path, msg4.toString().getBytes(), StandardOpenOption.APPEND);
		            }
		           statement.codeGeneration(path, CILOption.INIT);
		       }
		
	    }
        StringBuilder msg2 = new StringBuilder();
		 msg2.append(")\r\n");
		 Files.write(path, msg2.toString().getBytes(), StandardOpenOption.APPEND);
		 
        for (Statement statement : statements) {
			if (Declaration.class.isInstance(statement)){	           
		           statement.codeGeneration(path, CILOption.DECLARE);
		       }
		
	    }
		
         
         
		for (Statement statement : statements) {
			if (!Declaration.class.isInstance(statement)){
		          
		   	        statement.codeGeneration(path, cilOption);
		      }
	    }
	    StringBuilder msg3 = new StringBuilder(CIL.TWO_IDENT);
        msg3.append("ret\r\n");
        Files.write(path, msg3.toString().getBytes(), StandardOpenOption.APPEND);
    
	}
}
