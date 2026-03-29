package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunFundamental091UseForDebuggingFile extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("    21 TEST-FILE                                                                                |");
        CobolDisplay.display("    23 TEST-FILE                                                                                |");
        CobolDisplay.display("    24 TEST-FILE                                                                                |");
        CobolDisplay.display("    25 TEST-FILE                                        DEF                                     |");
        CobolDisplay.display("    26 TEST-FILE                                                                                |");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunFundamental091UseForDebuggingFile().run(); }
}
