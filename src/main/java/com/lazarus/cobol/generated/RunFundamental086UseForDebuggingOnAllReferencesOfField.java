package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunFundamental086UseForDebuggingOnAllReferencesOfField extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("    25 MY-DATA-FIELD-2                                  6                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  1                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  1                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-2                                  6                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  2                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  2                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-2                                  6                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  3                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  3                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-2                                  6                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  4                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  4                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-2                                  6                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  5                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  5                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-2                                  6                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  6                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  6                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-2                                  6                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  7                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-1                                  7                                       |");
        CobolDisplay.display("    27 MY-DATA-FIELD-2                                  6                                       |");
        CobolDisplay.display("    32 MY-DATA-FIELD-B                                  99                                      |");
        CobolDisplay.display("    34 MY-DATA-FIELD-3 OF MDF OF MY-D                   X                                       |");
        CobolDisplay.display("    37 MY-DATA-FIELD-3 OF MDF-TOO-LON                   -                                       |");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunFundamental086UseForDebuggingOnAllReferencesOfField().run(); }
}
