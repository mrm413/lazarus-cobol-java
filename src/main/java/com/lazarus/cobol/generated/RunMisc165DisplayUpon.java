package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc165DisplayUpon extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("This is sent to CONSOLE PLAIN");
        CobolDisplay.display("This is sent to PRINTER PLAIN");
        CobolDisplay.display("This is also sent to CONSOLE PLAIN");
        CobolDisplay.display("This is also sent to PRINTER PLAIN");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc165DisplayUpon().run(); }
}
