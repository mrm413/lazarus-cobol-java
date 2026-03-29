package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunExtensions040Entry extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("Hello, COBOL!");
        CobolDisplay.display("Bye, COBOL-ENTRY!");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunExtensions040Entry().run(); }
}
