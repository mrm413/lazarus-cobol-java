package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc010LocalStorage3 extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display(" 1212 2312 3412");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc010LocalStorage3().run(); }
}
