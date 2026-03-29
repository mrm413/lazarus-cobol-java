package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunFundamental088UseForDebuggingTimeOfExecution extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("    18 DATA-FIELD                                       \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
        CobolDisplay.display("    19 DATA-FIELD                                       ABCD                                    |");
        CobolDisplay.display("DEBUG");
        CobolDisplay.display("    23 DATA-FIELD                                                                               |");
        CobolDisplay.display("    24 DATA-FIELD                                       ABCD                                    |");
        CobolDisplay.display("THIS IS FINE");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunFundamental088UseForDebuggingTimeOfExecution().run(); }
}
