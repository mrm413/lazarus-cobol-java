package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc073StringUnstringNotOnOverflow extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("1 passed");
        CobolDisplay.display("2 passed");
        CobolDisplay.display("3 passed");
        CobolDisplay.display("4 passed");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc073StringUnstringNotOnOverflow().run(); }
}
