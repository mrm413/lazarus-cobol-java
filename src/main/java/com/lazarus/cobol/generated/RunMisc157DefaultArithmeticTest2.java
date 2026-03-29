package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc157DefaultArithmeticTest2 extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("RES = +0000680.95");
        CobolDisplay.display("RES ROUNDED = +0000680.95");
        CobolDisplay.display("RES MULT1 = +0000680.95");
        CobolDisplay.display("RES MULT2 = +0000680.95");
        CobolDisplay.display("RES 1 = +0022777.77");
        CobolDisplay.display("RES F = +0000680.94");
        CobolDisplay.display("RES ROUNDED AWAY = +0000680.96");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc157DefaultArithmeticTest2().run(); }
}
