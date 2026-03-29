package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunFundamental098DisplayWithPFields extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("00=00; 001=001; 00=00;");
        CobolDisplay.display(".00=.00; .000=.000; .123=.123; .00=.00; .000=.000;");
        CobolDisplay.display("00=00; .02=.02; .003=.003;");
        CobolDisplay.display("10=10;");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunFundamental098DisplayWithPFields().run(); }
}
