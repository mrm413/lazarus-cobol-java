package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc093CobpreloadWithEntryPoints extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("12abc");
        CobolDisplay.display("11");
        CobolDisplay.display("xxxxx");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc093CobpreloadWithEntryPoints().run(); }
}
