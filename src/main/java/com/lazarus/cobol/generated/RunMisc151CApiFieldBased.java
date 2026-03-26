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


    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString grpx = new CobolString(256); // fallback
    private CobolString chrn = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_009 = new CobolString(256); // fallback
    private void para_main() {
        ne.set(String.valueOf(-512.77));
        CobolProgram.call("CAPI", 2560, 16);
        CobolProgram.call("CAPI", binfld5, _filler_002, ne);
        CobolProgram.call("CAPI", binfld5s);
        CobolProgram.call("CAPI", binfld9);
        ne.set(String.valueOf(512.77));
        CobolProgram.call("CAPI", comp3, _filler_003, ne);
        CobolProgram.call("CAPI", pic9, binfld5s, chrx, grpx);
        CobolProgram.call("CAPI", comp3, _filler_004, ne, _filler_005, chrx);
        CobolProgram.call("CAPI", binfld5, _filler_006, ne);
        chrx.set(String.valueOf("Hello!"));
        CobolProgram.call("CAPI", binfld5, _filler_007, chrx);
        CobolProgram.call("CAPI", binfld5, _filler_008, chrx);
        CobolProgram.call("CAPI", CobolIntrinsics.length(grpx));
        CobolProgram.call("CAPI", grpx, CobolIntrinsics.length(grpx));
        CobolProgram.call("CAPI", "Fred Fish", _filler_009, comp3);
        CobolProgram.call("CAPI", comp3v99);
        /* RAW: *  */
        CobolProgram.call("CAPI", chrn);
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
