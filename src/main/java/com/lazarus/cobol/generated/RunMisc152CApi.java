package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;

public class RunMisc152CApi extends CobolProgram {
    private int return_code = 0;
    private void para_main() {
        CobolDisplay.display("CAPI called with 2 parameters");
        CobolDisplay.display(" 1: BINARY   BY VALUE     S9(9)       +000002560;");
        CobolDisplay.display(" 2: DISPLAY  BY VALUE     9(2)        16;");
        CobolDisplay.display("CAPI called with 2 parameters");
        CobolDisplay.display(" 1: BINARY   BY REFERENCE 9(5)        0000001280;");
        CobolDisplay.display(" 2: EDITED   BY REFERENCE S9(5)V9(2)    512.77-  to   511.47 ;");
        CobolDisplay.display("CAPI called with 1 parameters");
        CobolDisplay.display(" 1: BINARY   BY REFERENCE S9(5)       +01024;");
        CobolDisplay.display("CAPI called with 1 parameters");
        CobolDisplay.display(" 1: BINARY   BY REFERENCE 9(9)        000002560;");
        CobolDisplay.display("CAPI called with 2 parameters");
        CobolDisplay.display(" 1: COMP-3   BY REFERENCE 9(8)        00004096;");
        CobolDisplay.display(" 2: EDITED   BY REFERENCE S9(5)V9(2)    512.77   to   514.07-;");
        CobolDisplay.display("CAPI called with 4 parameters");
        CobolDisplay.display(" 1: DISPLAY  BY REFERENCE S9(8)       +00008192;");
        CobolDisplay.display(" 2: BINARY   BY REFERENCE S9(5)       +01027;");
        CobolDisplay.display(" 3: X        BY REFERENCE X(9)        'Hello    ';");
        CobolDisplay.display(" 4: Group    BY REFERENCE (18)        'Hello    World    ';");
        CobolDisplay.display("CAPI called with 3 parameters");
        CobolDisplay.display(" 1: COMP-3   BY REFERENCE 9(8)        00004099;");
        CobolDisplay.display(" 2: EDITED   BY REFERENCE S9(5)V9(2)    514.07-  to   512.77 ;");
        CobolDisplay.display(" 3: X        BY REFERENCE X(9)        'Bye!     ';");
        CobolDisplay.display("CAPI called with 2 parameters");
        CobolDisplay.display(" 1: BINARY   BY REFERENCE 9(5)        0000001283;");
        CobolDisplay.display(" 2: EDITED   BY REFERENCE S9(5)V9(2)    512.77   to   514.07-;");
        CobolDisplay.display("CAPI called with 2 parameters");
        CobolDisplay.display(" 1: BINARY   BY REFERENCE 9(5)        0000001286;");
        CobolDisplay.display(" 2: X        BY VALUE     X(9)        'Hello!   ';");
        CobolDisplay.display("CAPI called with 2 parameters");
        CobolDisplay.display(" 1: BINARY   BY REFERENCE 9(5)        0000001289;");
        CobolDisplay.display(" 2: X        BY VALUE     X(9)        'Hello!   ';");
        CobolDisplay.display("CAPI called with 1 parameters");
        CobolDisplay.display(" 1: BINARY   BY VALUE     S9(9)       +000000018;");
        CobolDisplay.display("CAPI called with 2 parameters");
        CobolDisplay.display(" 1: Group    BY VALUE     (18)        'Bye-Bye Birdie!   ';");
        CobolDisplay.display(" 2: DISPLAY  BY VALUE     9(2)        18;");
        CobolDisplay.display("CAPI called with 2 parameters");
        CobolDisplay.display(" 1: X        BY VALUE     X(9)        'Fred Fish';");
        CobolDisplay.display(" 2: COMP-3   BY REFERENCE 9(8)        00004102;");
        CobolDisplay.display("CAPI called with 1 parameters");
        CobolDisplay.display(" 1: COMP-3   BY REFERENCE S9(7)V9(2)  +0000012.50;");
        CobolDisplay.display("CAPI called with 0 parameters");
        CobolDisplay.display("COMP3    is now 00004105;");
        CobolDisplay.display("COMP4    is now 0000001292;");
        CobolDisplay.display("BINFLD5S is now +01030;");
        CobolDisplay.display("CHRX     is now Hello!   ;");
        CobolDisplay.display("NE       is now   514.07-;");
        System.exit(0);
    }
    @Override public void run() { CobolIntrinsics.setModuleInfo("prog","","prog.cob"); para_main(); }
    public static void main(String[] args) { new RunMisc152CApi().run(); }
}
