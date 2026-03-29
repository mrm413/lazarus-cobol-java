package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc143RedefinesValuesOnFillerAndInitialize extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("The date is 2015*08*21 Compiled");
        CobolDisplay.display("The date is 0000*08*21 INITIALIZE");
        CobolDisplay.display("The date is 0000 08 21 WITH FILLER");
        CobolDisplay.display("The date is 2017-08-21 ALL TO VALUE");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc143RedefinesValuesOnFillerAndInitialize().run(); }
}
