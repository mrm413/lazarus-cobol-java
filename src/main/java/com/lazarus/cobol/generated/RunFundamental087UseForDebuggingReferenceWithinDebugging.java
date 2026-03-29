package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunFundamental087UseForDebuggingReferenceWithinDebugging extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("    19 DATA-FIELD                                       \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
        CobolDisplay.display("    19 DATA-FIELD                                       \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
        CobolDisplay.display("    20 DATA-FIELD                                       ABCD                                    |");
        CobolDisplay.display("    20 DATA-FIELD                                       ABCD                                    |");
        CobolDisplay.display("DEBUG");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunFundamental087UseForDebuggingReferenceWithinDebugging().run(); }
}
