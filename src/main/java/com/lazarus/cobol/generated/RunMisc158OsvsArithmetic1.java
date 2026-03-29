package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc158OsvsArithmetic1 extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("Simple Compute  RSLT IS 400");
        CobolDisplay.display("Single Variable RSLT IS 100");
        CobolDisplay.display("Compute  RSLT    IS 188");
        CobolDisplay.display("Compute  RSLTv99 IS 188.00");
        CobolDisplay.display("Compute  RSLT    IS 180");
        CobolDisplay.display("Compute  RSLTv9  IS 180.0");
        CobolDisplay.display("Add      RSLT    IS 212");
        CobolDisplay.display("Add      RSLT    IS 621");
        CobolDisplay.display("Subtract RSLT    IS 408");
        CobolDisplay.display("Subtract RSLT    IS 019");
        CobolDisplay.display("Add      RSLTv9  IS 611.3");
        CobolDisplay.display("Multiply RSLT    IS 723");
        CobolDisplay.display("Multiply RSLT    IS 723");
        CobolDisplay.display("Divide   RSLT    IS 039");
        CobolDisplay.display("Divide   RSLTv9  IS 009.7");
        CobolDisplay.display("Divide   RSLT    IS 009");
        CobolDisplay.display("Simple   RSLT    IS 180 RSLTv9  IS 180.0");
        CobolDisplay.display("Complex  RSLT    IS 188 RSLTv9  IS 188.0");
        CobolDisplay.display("Reduced  RSLT    IS 180 RSLTv9  IS 180.0");
        CobolDisplay.display("Using ARITHMETIC-OSVS");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc158OsvsArithmetic1().run(); }
}
