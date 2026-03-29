package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc008LocalStorage1 extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("abcabc000abc");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc008LocalStorage1().run(); }
}
