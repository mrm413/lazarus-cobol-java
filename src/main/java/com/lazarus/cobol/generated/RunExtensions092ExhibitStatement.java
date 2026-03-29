package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunExtensions092ExhibitStatement extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("         X");
        CobolDisplay.display("VAR-1 = 123XXXXX VAR-2 = 000 Y");
        CobolDisplay.display("VAR-2 = 000");
        CobolDisplay.display("SORT-RETURN = +000000000 TALLY = 00000");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunExtensions092ExhibitStatement().run(); }
}
