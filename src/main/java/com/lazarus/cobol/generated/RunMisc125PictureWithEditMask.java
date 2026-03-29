package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc125PictureWithEditMask extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("WFLT IS $18,536.23");
        CobolDisplay.display("COST IS $18,536.23");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc125PictureWithEditMask().run(); }
}
