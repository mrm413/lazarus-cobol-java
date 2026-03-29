package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunExtensions094BitShiftOperations extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("Using PIC XX COMP-X");
        CobolDisplay.display(" x#22 B-LEFT  x#05   is 01088");
        CobolDisplay.display(" x#22 B-RIGHT x#02   is 00008");
        CobolDisplay.display(" x#22 B-SHIFT-L x#05 is 01088");
        CobolDisplay.display(" x#22 B-SHIFT-R x#02 is 00008");
        CobolDisplay.display("00010 B-LEFT  x#05   is 00320");
        CobolDisplay.display("00010 B-RIGHT x#02   is 00002");
        CobolDisplay.display("30067 B-SHIFT-LC 4   is 22327");
        CobolDisplay.display("30067 B-SHIFT-RC 4   is 14167");
        CobolDisplay.display("Using PIC 9(4) COMP-5");
        CobolDisplay.display(" x#22 B-LEFT  x#05   is 01088");
        CobolDisplay.display(" x#22 B-RIGHT x#02   is 00008");
        CobolDisplay.display(" x#22 B-SHIFT-L x#05 is 01088");
        CobolDisplay.display(" x#22 B-SHIFT-R x#02 is 00008");
        CobolDisplay.display("00010 B-LEFT  x#05   is 00320");
        CobolDisplay.display("00010 B-RIGHT x#02   is 00002");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunExtensions094BitShiftOperations().run(); }
}
