package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc16401Constant extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("CAT  is 'Cat '");
        CobolDisplay.display("Yard is 'Cat & Dog '");
        CobolDisplay.display("DIV1 is 33");
        CobolDisplay.display("HUN  is 143");
        CobolDisplay.display("HUN2 is 1855");
        CobolDisplay.display("78 VALUE has simple left to right precedence.");
        CobolDisplay.display("01 CONSTANT has normal operator precedence.");
        CobolDisplay.display("CON3 is 23");
        CobolDisplay.display("CON4 is 26 vs 3.141596 & -2.189 & +12");
        CobolDisplay.display("CON6 is 18.");
        CobolDisplay.display("My Dog's name is Piper;");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc16401Constant().run(); }
}
