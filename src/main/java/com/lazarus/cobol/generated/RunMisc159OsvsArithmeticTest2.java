package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc159OsvsArithmeticTest2 extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("RES = +000068094");
        CobolDisplay.display("RES ROUNDED = +000068095");
        CobolDisplay.display("RES MULT1 = +000068094");
        CobolDisplay.display("RES MULT2 = +000068095");
        CobolDisplay.display("RES 1 = +002277777");
        CobolDisplay.display("RES F = +000068094");
        CobolDisplay.display("RES ROUNDED AWAY = +000068095");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc159OsvsArithmeticTest2().run(); }
}
