package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc040MultipleCallsOfInitialProgram extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("COUNTER = 001 LPARAM1 = 00000008 PARAM1 =  PARAM 1");
        CobolDisplay.display("COUNTER = 001 LPARAM1 = 00000008 PARAM1 =  PARAM 1");
        CobolDisplay.display("COUNTER = 001 LPARAM1 = 00000008 PARAM1 =  PARAM 1");
        CobolDisplay.display("COUNTER = 001 LPARAM1 = 00000008 PARAM1 =  PARAM 1");
        CobolDisplay.display("COUNTER = 001 LPARAM1 = 00000008 PARAM1 =  PARAM 1");
        CobolDisplay.display("COUNTER = 001 LPARAM1 = 00000008 PARAM1 =  PARAM 1");
        CobolDisplay.display("COUNTER = 001 LPARAM1 = 00000008 PARAM1 =  PARAM 1");
        CobolDisplay.display("COUNTER = 001 LPARAM1 = 00000008 PARAM1 =  PARAM 1");
        CobolDisplay.display("COUNTER = 001 LPARAM1 = 00000008 PARAM1 =  PARAM 1");
        CobolDisplay.display("COUNTER = 001 LPARAM1 = 00000008 PARAM1 =  PARAM 1");
        CobolDisplay.display("PARAM1 =  PARAM 1");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc040MultipleCallsOfInitialProgram().run(); }
}
