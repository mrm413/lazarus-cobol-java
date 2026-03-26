package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions016OccursUnbounded1 extends CobolProgram {
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
    private short n = (short) 0;
    private long p = 0L;
    private CobolString sav = new CobolString(8192);
    private CobolString w_table = new CobolString(1); // Group: W-TABLE
    private CobolString[] wrows = new CobolString[500]; // Group: WROWS
    private int[] wcol1 = new int[500];
    private CobolString[] wcol2 = new CobolString[500];

    // LINKAGE SECTION
    private CobolString a_table = new CobolString(1); // Group: A-TABLE
    private CobolString[] rows = new CobolString[100]; // Group: ROWS
    private CobolString[] col1 = new CobolString[100];
    private CobolString[] col2 = new CobolString[100];


    private CobolString address = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private void para_main() {
        if (!String.valueOf(CobolIntrinsics.length(w_table)).equals(String.valueOf(369))) {
            CobolDisplay.display("WRONG WS LENGTH: " + String.valueOf(CobolIntrinsics.length(a_table)));
        }
        if (!String.valueOf(CobolIntrinsics.length(a_table)).equals(String.valueOf(369))) {
            CobolDisplay.display("WRONG LS LENGTH: " + String.valueOf(CobolIntrinsics.length(a_table)));
        }
        /* ALLOCATE — dynamic memory, not typical in Java */
        address.set(String.valueOf(p));
        if (!String.valueOf(col2[1 - 1]).equals(String.valueOf("BC"))) {
            CobolDisplay.display("col2(1) wrong: " + String.valueOf(col2[1 - 1]));
        }
        if (!String.valueOf(rows[2 - 1]).equals(String.valueOf("DEA"))) {
            CobolDisplay.display("rows(2) wrong: " + String.valueOf(rows[2 - 1]));
        }
        /* RAW: *  */
        w_table.set("");
        _filler_002.set("");
        sav.set(String.valueOf(a_table));
        a_table.set("");
        _filler_003.set("");
        p = 0L; /* FREE */
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions016OccursUnbounded1().run();
    }
}
