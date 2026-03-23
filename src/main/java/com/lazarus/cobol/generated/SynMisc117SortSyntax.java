package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc117SortSyntax extends CobolProgram {
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
    private CobolString g = new CobolString(1); // Group: G
    private CobolString[] tbl = new CobolString[5]; // Group: TBL
    private CobolString[] x = new CobolString[5];
    private int[] y = new int[5];
    private CobolString[] tbl_ord = new CobolString[5]; // Group: TBL-ORD
    private CobolString[] xo = new CobolString[5];
    private int[] yo = new int[5];

    // FILE SECTION — SRTFIL
    private CobolString srtrec = new CobolString(256);


    // FILE DESCRIPTORS
    private CobolFile srtfil = new CobolFile("SRTFIL", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile stfile = new CobolFile("STFILE", "LINE SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        /* SORT TBL */
    }

    private void x() {
        /* SORT TBL */
    }

    private void descending() {
        /* SORT TBL */
        /* SORT TBL-ORD */
    }

    private void ascending() {
        /* SORT TBL-ORD */
        /* SORT STFILE */
    }

    private void srtrec() {
        /* SORT STFILE */
    }

    private void srtfil() {
        /* SORT STFILE */
    }

    private void ascending_2() {
        /* SORT STFILE */
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc117SortSyntax().run();
    }
}
