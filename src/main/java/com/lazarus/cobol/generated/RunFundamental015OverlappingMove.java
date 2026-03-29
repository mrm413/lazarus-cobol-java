package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunFundamental015OverlappingMove extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("  OK with MOVE: 1234567899");
        CobolDisplay.display("IBM style MOVE: 0000000009");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunFundamental015OverlappingMove().run(); }
}
