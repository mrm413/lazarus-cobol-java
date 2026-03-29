package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunFundamental089UseForDebuggingReferenceWithOccurs extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("    20 DATA-FIELD                     +0004 +0002 +0001 \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunFundamental089UseForDebuggingReferenceWithOccurs().run(); }
}
