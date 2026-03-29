package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc16378Value extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("DIV1 is 33");
        CobolDisplay.display("HUN  is 143");
        CobolDisplay.display("HUN2 is 1855");
        CobolDisplay.display("NUM2 is 9 left to right precedence.");
        CobolDisplay.display("XFLD3 starts at 9");
        CobolDisplay.display("XFLD4 starts at 19");
        CobolDisplay.display("XFLD4 starts at 11");
        CobolDisplay.display("Your Dog's name is Barky;");
        CobolDisplay.display("The Dog's name is Barky ;");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc16378Value().run(); }
}
