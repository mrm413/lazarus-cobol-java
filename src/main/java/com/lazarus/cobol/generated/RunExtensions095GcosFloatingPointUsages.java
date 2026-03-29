package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunExtensions095GcosFloatingPointUsages extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("-42");
        CobolDisplay.display("0");
        CobolDisplay.display("9.899999999998999E+304");
        CobolDisplay.display("9.888888888888887E+304");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunExtensions095GcosFloatingPointUsages().run(); }
}
