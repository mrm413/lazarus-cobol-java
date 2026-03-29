package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc168FloatShortWithSizeError extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("SIZE ERROR, last value = 1.7014118E+38");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc168FloatShortWithSizeError().run(); }
}
