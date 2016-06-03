package org.ifn660.jflexer.ast;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.ifn660.jflexer.cil.CIL;
import org.ifn660.jflexer.cil.CILOption;

public class IdentifierExpression extends Expression {
    private IdentifierNode identifier;
    
    private Declaration declaration;
    private Set coGe_scop;
    private Map<String,Declaration> getParentNode;
    private Collection<Declaration> parentDeclaration;
    private  String className;
    
    public IdentifierExpression(IdentifierNode identifierNode) {
        this.identifier = identifierNode;
    }
    
    @Override
    public void resolveNames(LexicalScope scope) {
        if (scope != null) {
            declaration = scope.resolve(identifier.value);
        }

        if (declaration == null) {
            System.err.println("Error: Undeclared identifier " + identifier.value);
            throw new RuntimeException("Name Resolution error");
        }
        
//        System.out.println(scope.parentScope.symbolTable.keySet());
//        
        coGe_scop=scope.parentScope.symbolTable.keySet();
        
        getParentNode=scope.parentScope.symbolTable;
        
        //System.out.println("0000000000000000000");
        parentDeclaration=scope.parentScope.symbolTable.values();
        
//        for(Declaration dec:parentDeclaration)
//        {
//            System.out.println(dec.toString());
//        }
//        
        className="34";
        System.out.println(className);
        
        System.out.println("&&&&&&****&&&&&");
    }
    
    @Override
    public String passVariables(String variable)  {
        className =variable;
        System.out.println(className);
        System.out.println("&&&&&&****&&&&&");
        return variable;
     }
    

    
    @Override
    public void codeGeneration(Path path, CILOption cilOption) throws IOException {
        emit(path, CIL.TWO_IDENT);
        

       System.out.println(getParentNode);
        System.out.println("*************");
       
        if (cilOption == CILOption.LEFT_HAND_SIDE) {

            
          for (Object key: getParentNode.keySet())//getParentNode is all the node initilize from classbody
          {
              if (identifier.value.equals(key))//if the value if from field
              {
                  for (Object fieldDecration: getParentNode.values())
                  {
                      if (fieldDecration.toString().equals("field"))
                       {
                    
                          FieldDeclaration f=(FieldDeclaration)fieldDecration;
                          System.out.println(f.getType());
                          emit(path, CIL.STSFLD +"  "+f.getType()+"32" +" "+ "Example.Example"+"::"+f.getName() +"\r\n");
                          //this is for y=x+3; "y"
                          emit(path, CIL.TWO_IDENT);

                       }
                      
                      
                  }
    
              }
              
              
          }

            
        }
        else if (cilOption == CILOption.LEFT_HAND_SIDE)
        {
            for (Object key: coGe_scop)
            {
                if (!identifier.value.equals(key))
                        {

                  emit(path, CIL.STLOC + declaration.getCilLocalVarIndex() + "\r\n");
                  //this is for y=x+3; "y"
                  emit(path, CIL.TWO_IDENT);
                    
                        }
               
            }
        }

        else if (cilOption != CILOption.LEFT_HAND_SIDE){
            
        
            for (Object key: getParentNode.keySet())
            {
                if (identifier.value.equals(key))
                {
                    for (Object fieldDecration: getParentNode.values())
                    {
                        if (fieldDecration.toString().equals("field"))
                         {
                      
                            FieldDeclaration f=(FieldDeclaration)fieldDecration;
                            System.out.println(f.getType());
                            emit(path, CIL.LDSFLD +"  "+f.getType()+"32" +" "+ "Example.Example"+"::"+f.getName() +"\r\n");
                            //this is for y=x+3; "y"
                            emit(path, CIL.TWO_IDENT);

                         }
                    }
                }
//                else if (!identifier.value.equals("main") )
//                {
//                    emit(path, CIL.LDLOC + declaration.getCilLocalVarIndex() + "\r\n");
//                }
                
            }
        }
        else if (cilOption != CILOption.LEFT_HAND_SIDE)
        {
            System.out.println("@@@@@@@@@@@@");
            emit(path, CIL.LDLOC + declaration.getCilLocalVarIndex() + "\r\n");
            
        }
        

        else{}
    }
    public IdentifierNode getIdentifierNode() {
        return identifier;
    }
}
