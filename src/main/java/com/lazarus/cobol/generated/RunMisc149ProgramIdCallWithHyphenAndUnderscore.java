package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc149ProgramIdCallWithHyphenAndUnderscore extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("SUB GOT X");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc149ProgramIdCallWithHyphenAndUnderscore().run(); }
}
