package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunExtensions017OccursUnbounded2 extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("First allocation, using 00322 bytes.");
        CobolDisplay.display("VARTAB(12) = \"9999        0000\"");
        CobolDisplay.display("VARTAB(17) = \"0000HI MOM  0000\"");
        CobolDisplay.display("Re-allocation, using 00482 bytes.");
        CobolDisplay.display("VARTAB(12) = \"9999        0000\"");
        CobolDisplay.display("VARTAB(17) = \"0000HI MOM  0000\"");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunExtensions017OccursUnbounded2().run(); }
}
