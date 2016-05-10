
.assembly extern mscorlib
{}
.assembly XFile
{}







// =============== CLASS MEMBERS DECLARATION ===================

.class private auto ansi beforefieldinit XFile.Program
       extends [mscorlib]System.Object
{
  .method private hidebysig static void  Main(string[] args) cil managed
  {
    .entrypoint
    // Code size       18 (0x12)
    .maxstack  1
    .locals init ([0] int32 x)
    IL_0000:  nop
    IL_0001:  ldc.i4.s   42
    IL_0003:  stloc.0
    IL_0004:  ldloc.0
    IL_0005:  call       void [mscorlib]System.Console::WriteLine(int32)
    IL_000a:  nop
    IL_000b:  call       valuetype [mscorlib]System.ConsoleKeyInfo [mscorlib]System.Console::ReadKey()
    IL_0010:  pop
    IL_0011:  ret
  } // end of method Program::Main

  .method public hidebysig specialname rtspecialname 
          instance void  .ctor() cil managed
  {
    // Code size       8 (0x8)
    .maxstack  8
    IL_0000:  ldarg.0
    IL_0001:  call       instance void [mscorlib]System.Object::.ctor()
    IL_0006:  nop
    IL_0007:  ret
  } // end of method Program::.ctor

} // end of class XFile.Program


// =============================================================

// *********** DISASSEMBLY COMPLETE ***********************
// WARNING: Created Win32 resource file C:\Users\Tracey Wright\Documents\Visual Studio 2015\Projects\XFile\XFile\bin\Debug\XFile.res
