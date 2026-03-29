package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc134FigurativeConstantsToNumericField extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("NUM9 value SPACES is 000000.");
        CobolDisplay.display("9(6) Does NOT test OK for LOW-VALUES");
        CobolDisplay.display("9(6) tests as ZERO instead of LOW-VALUES");
        CobolDisplay.display("9(6) Does NOT test OK for HIGH-VALUES");
        CobolDisplay.display("9(6) tests as ZERO instead of HIGH-VALUES");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc134FigurativeConstantsToNumericField().run(); }
}
