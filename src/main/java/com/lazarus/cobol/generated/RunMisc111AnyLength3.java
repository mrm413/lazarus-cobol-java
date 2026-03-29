package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc111AnyLength3 extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("abcd");
        CobolDisplay.display("abcdabcd");
        CobolDisplay.display("aaaaaaaaaaaaaaaaaaaa");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc111AnyLength3().run(); }
}
