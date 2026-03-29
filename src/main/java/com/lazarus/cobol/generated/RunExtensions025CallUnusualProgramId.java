package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunExtensions025CallUnusualProgramId extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("P1P2P3P4");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunExtensions025CallUnusualProgramId().run(); }
}
