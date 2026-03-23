package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc151CApiFieldBased extends CobolProgram {
    private int tally = 0;
    private int return_code = 0;
    private int sort_return = 0;
    private int number_of_call_parameters = 0;
    private int cob_crt_status = 0;
    private int length_an = 0;
    private CobolString when_compiled = new CobolString(21);
    private CobolString debug_item = new CobolString(256);
    private CobolString debug_line = new CobolString(6);
    private CobolString debug_name = new CobolString(30);
    private CobolString debug_sub_1 = new CobolString(4);
    private CobolString debug_sub_2 = new CobolString(4);
    private CobolString debug_sub_3 = new CobolString(4);
    private CobolString debug_contents = new CobolString(256);
    // WORKING-STORAGE SECTION
    private short binfld5 = (short) 0;
    private int binfld5s = 0;
    private short binfld9 = (short) 0;
    private BigDecimal comp3 = BigDecimal.ZERO;
    private BigDecimal comp3v99 = BigDecimal.ZERO;
    private int pic9 = 0;
    private CobolString ne = new CobolString(5);
    private CobolString chrx = new CobolString(9);


    private CobolString _unnamed = new CobolString(256);
    private CobolString grpx = new CobolString(256);

    private void para_main() {
    }

    private void ne() {
        CobolProgram.call("CAPI", 2560, 16);
        CobolProgram.call("CAPI", binfld5, _unnamed);
    }

    private void ne_2() {
        CobolProgram.call("CAPI");
    }

    private void binfld5s() {
        CobolProgram.call("CAPI");
    }

    private void binfld9() {
    }

    private void ne_3() {
        CobolProgram.call("CAPI", comp3, _unnamed);
    }

    private void ne_4() {
        CobolProgram.call("CAPI", pic9, binfld5s, chrx);
    }

    private void grpx() {
        CobolProgram.call("CAPI", comp3, _unnamed, ne, _unnamed);
    }

    private void chrx() {
        CobolProgram.call("CAPI", binfld5, _unnamed);
    }

    private void ne_5() {
    }

    private void chrx_2() {
        CobolProgram.call("CAPI", binfld5, _unnamed);
    }

    private void chrx_3() {
        CobolProgram.call("CAPI", binfld5, _unnamed);
    }

    private void chrx_4() {
        CobolProgram.call("CAPI", CobolIntrinsics.length(grpx));
        CobolProgram.call("CAPI", grpx, CobolIntrinsics.length(grpx));
        CobolProgram.call("CAPI", "Fred Fish", _unnamed);
    }

    private void comp3() {
        CobolProgram.call("CAPI");
    }

    private void comp3v99() {
        /* RAW: *  */
        CobolProgram.call("CAPI");
    }

    private void chrn() {
        CobolProgram.call("CAPI");
        CobolDisplay.display("COMP3    is now " + String.valueOf(comp3) + ";");
        CobolDisplay.display("COMP4    is now " + String.valueOf(binfld5) + ";");
        CobolDisplay.display("BINFLD5S is now " + String.valueOf(binfld5s) + ";");
        CobolDisplay.display("CHRX     is now " + String.valueOf(chrx) + ";");
        CobolDisplay.display("NE       is now " + String.valueOf(ne) + ";");
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc151CApiFieldBased().run();
    }
}
