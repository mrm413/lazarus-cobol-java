package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc093Level78NextStartOf extends CobolProgram {
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
    private static final String pos0 = "NEXT";
    private CobolString myrec = new CobolString(1); // Group: MYREC
    private int fld1 = 0;
    private CobolString fld2 = new CobolString(7);
    private static final String pos3 = "NEXT";
    private CobolString[] fld3 = new CobolString[5];
    private static final String pos4 = "NEXT";
    private CobolString fld4 = new CobolString(4);
    private static final String pos_next = "NEXT";
    private CobolString myrec2 = new CobolString(1);
    private CobolString myrec3 = new CobolString(1); // Group: MYREC3
    private CobolString fld5 = new CobolString(4);
    private static final String pos5 = "NEXT";
    private CobolString fld6 = new CobolString(4);
    private CobolString picx = new CobolString(3);
    private static final int hun = 10;

    // LINKAGE SECTION
    private CobolString xmyrec = new CobolString(1); // Group: XMYREC
    private int xfld1 = 0;
    private CobolString xfld2 = new CobolString(7);
    private static final String xpos3 = "NEXT";
    private CobolString[] xfld3 = new CobolString[5];
    private static final String xpos4 = "NEXT";
    private CobolString xfld4 = new CobolString(4);
    private CobolString xfld5 = new CobolString(4);
    private static final String xstrt4 = "START";



    private void para_main() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc093Level78NextStartOf().run();
    }
}
