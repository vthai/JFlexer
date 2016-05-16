.class private ConsoleApplication3.Program extends [mscorlib]System.Object
{
  .method private static void Main(string[] args)
  {
    .entrypoint
    
    .locals init ([0] int32 x,
             [1] int32 y,
             [2] int32 z,
             [3] int32 f)

    ldc.i4.s   22    
    stloc.0          
    ldc.i4.s   33    
    stloc.1          
    ldc.i4.s   44    
    stloc.2          
    ldloc.0          
    ldloc.1          
    ldloc.2          
    mul              
    add              
    stloc.3          
    ldloc.3          
    call     void [mscorlib]System.Console::WriteLine(int32)
    pop
    ret
  }
} 

