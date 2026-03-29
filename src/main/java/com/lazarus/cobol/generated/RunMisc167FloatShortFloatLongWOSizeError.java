package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc167FloatShortFloatLongWOSizeError extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("--- COMP-1 ---");
        CobolDisplay.display("A: 9216587");
        CobolDisplay.display("B: 5305037");
        CobolDisplay.display("Z: 476.19049 IS OK");
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- COMP-2 ---");
        CobolDisplay.display("A ~ 9216586.86175115");
        CobolDisplay.display("B ~ 5305036.787798408");
        CobolDisplay.display("Z ~ 476.1904761904761 IS OK");
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- 99 + 1 / 3 ---");
        CobolDisplay.display("CMP1: 99.333336 IS OK");
        CobolDisplay.display("CMP2: 99.33333333333333 IS OK");
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- 99 ---");
        CobolDisplay.display("CMP1: 99 IS OK");
        CobolDisplay.display("CMP2: 99 IS OK");
        CobolDisplay.display("    ...");
        CobolDisplay.display("--- Test overflow ---");
        CobolDisplay.display("CMP1: after 9.8999983E+37 SIZE ERROR");
        CobolDisplay.display("CMP2: after ~ 9.899999999999781E+307 SIZE ERROR");
        CobolDisplay.display("CMP1: after 1.4012985E-45 SIZE ERROR");
        CobolDisplay.display("CMP2: after ~ 9.881312916824931E-324 SIZE ERROR");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc167FloatShortFloatLongWOSizeError().run(); }
}
