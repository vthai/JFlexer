
.assembly extern mscorlib
{}
.assembly XFile
{}

.class private XFile.Program
       extends [mscorlib]System.Object
{
  .method private hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       18 (0x12)
    .maxstack  1
    .locals init ([0] int32 x)
    IL_0001:  ldc.i4.s   42
    IL_0003:  stloc.0
    IL_0004:  ldloc.0
    IL_0005:  call       void [mscorlib]System.Console::WriteLine(int32)
    IL_000b:  call       valuetype [mscorlib]System.ConsoleKeyInfo [mscorlib]System.Console::ReadKey()
    IL_0010:  pop
    IL_0011:  ret
  } // end of method Program::Main
} // end of class XFile.Program

