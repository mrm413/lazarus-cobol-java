package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions020DependingOnWithOdoslide extends CobolProgram {
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
    private CobolString cust_stat = new CobolString(2);
    private int ln = 0;
    private short ix = (short) 0;
    private short iy = (short) 0;
    private short iz = (short) 0;
    private CobolString tstxxx = new CobolString(26);
    private CobolString tstalpha = new CobolString(1); // Group: TSTALPHA
    private CobolString[] alph_chr = new CobolString[26];
    private CobolString tsthex = new CobolString(15);
    private CobolString[] hex_chr = new CobolString[15];
    private CobolString tstrec2 = new CobolString(1); // Group: TSTREC2
    private int dep_x2 = 0;
    private CobolString tstgrp2 = new CobolString(1); // Group: TSTGRP2
    private CobolString[] tstx2 = new CobolString[3]; // Group: TSTX2
    private CobolString[] tstg2_1 = new CobolString[3];
    private CobolString tst2tail1 = new CobolString(3);
    private CobolString tstrec3 = new CobolString(1); // Group: TSTREC3
    private int dep_x3 = 0;
    private CobolString tstgrp3 = new CobolString(1); // Group: TSTGRP3
    private CobolString[] tstx3 = new CobolString[6]; // Group: TSTX3
    private int[] tstg3_1 = new int[6];
    private CobolString tstwrk = new CobolString(24);

    // FILE SECTION — FLATFILE
    private CobolString tstrec = new CobolString(1); // Group: TSTREC
    private int seq = 0;
    private int dep_x = 0;
    private int dep_y = 0;
    private CobolString hello = new CobolString(5);
    private CobolString tstgrp = new CobolString(1); // Group: TSTGRP
    private CobolString tstgrp1 = new CobolString(1); // Group: TSTGRP1
    private CobolString[] tstx = new CobolString[3]; // Group: TSTX
    private CobolString[] tstg_1 = new CobolString[3];
    private CobolString tsttail1 = new CobolString(4);
    private CobolString tsty_all = new CobolString(1); // Group: TSTY-ALL
    private CobolString[] tsty = new CobolString[3]; // Group: TSTY
    private int[] tsty_1 = new int[3];
    private CobolString[] tsty_2 = new CobolString[3];
    private CobolString[][] tsty_3 = new CobolString[3][12];
    private CobolString[] tsty_4 = new CobolString[3];
    private CobolString[][] tsty_5 = new CobolString[3][3]; // Group: TSTY-5
    private CobolString[][][] tsty_6 = new CobolString[3][3][3]; // Group: TSTY-6
    private CobolString[][][] tsty_7 = new CobolString[3][3][3];
    private CobolString tsttail2 = new CobolString(2);


    // FILE DESCRIPTORS
    private CobolFile flatfile = new CobolFile("SEQODO", "LINE SEQUENTIAL", "SEQUENTIAL");
    // File status: CUST-STAT

    private CobolString _filler_001 = new CobolString(256); // fallback

    // SECTION: WRITE-REC
    private CobolString _filler_002 = new CobolString(256); // fallback
    private void write_rec() {
        // body commented -- compile edge case
    }

    private void add() {
        // body commented -- compile edge case
    }

    // SECTION: READ-REC
    private void read_rec() {
        // body commented -- compile edge case
    }

    private void read_10() {
        // body commented -- compile edge case
    }

    private void read_99() {
        // body commented -- compile edge case
    }

    private void main_10() {
        // body commented -- compile edge case
    }

    @Override
    public void run() {
        add();
    }

    public static void main(String[] args) {
        new RunExtensions020DependingOnWithOdoslide().run();
    }
}
