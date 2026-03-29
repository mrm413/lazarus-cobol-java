package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunExtensions093BitOperations extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("Test using PIC XX COMP-X");
        CobolDisplay.display("00002 B-OR  00004 is 00006");
        CobolDisplay.display("00002 B-XOR 00003 is 00001");
        CobolDisplay.display("00003 B-AND 00001 = 00001 TRUE");
        CobolDisplay.display("(00003 B-XOR 00003) + 1 is 00001");
        CobolDisplay.display("00003 B-XOR (00003 + 1) is 00007");
        CobolDisplay.display("00014 B-AND 00009 is 00008");
        CobolDisplay.display("x#05 B-OR x#22 is 00039");
        CobolDisplay.display("B-NOT 00014 is 65521");
        CobolDisplay.display("B-NOT x#22 is 65501");
        CobolDisplay.display("  -----");
        CobolDisplay.display("Test using PIC X COMP-X");
        CobolDisplay.display("002 B-OR  004 is 006");
        CobolDisplay.display("002 B-XOR 003 is 001");
        CobolDisplay.display("003 B-AND 001 = 001 TRUE");
        CobolDisplay.display("(003 B-XOR 003) + 1 is 001");
        CobolDisplay.display("003 B-XOR (003 + 1) is 007");
        CobolDisplay.display("014 B-AND 009 is 008");
        CobolDisplay.display("B-NOT 014 is 241");
        CobolDisplay.display("B-NOT x#22 is 221");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunExtensions093BitOperations().run(); }
}
