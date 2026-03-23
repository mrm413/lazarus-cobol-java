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

    private CobolString _unnamed = new CobolString(256);

    // SECTION: WRITE-REC
    private void write_rec() {
        add();
        seq();
        ln();
        ln();
        tstgrp();
        tsttail2();
        ln();
        ln();
        tstgrp2();
        dep_x2();
        tst2tail1();
        ln();
        ln();
    }

    private void add() {
        /* RAW: 1 TO */
    }

    private void seq() {
    }

    private void ln() {
        CobolDisplay.display("Write SEQ " + String.valueOf(seq) + ", DEP-X = " + String.valueOf(dep_x) + " & DEP-Y = " + String.valueOf(dep_y) + ", TSTREC len:");
    }

    private void ln_2() {
    }

    private void tstgrp() {
        tsttail1.set(String.valueOf("<>"));
        _unnamed.set(String.valueOf("<>"));
    }

    private void tsttail2() {
        for (ix = 1; !(ix > dep_x); ix += 1) {
            if (tstg_1[ix - 1] == null) tstg_1[ix - 1] = new CobolString(256);
            tstg_1[ix - 1].set(String.valueOf(ix));
        }
    }

    private void ln_3() {
        CobolDisplay.display("Group1: '" + String.valueOf(tstgrp1) + "' len:");
    }

    private void ln_4() {
        for (ix = 1; !(ix > dep_x); ix += 1) {
            tsty_1[ix - 1] = new BigDecimal(String.valueOf(ix).trim()).intValue();
            if (tsty_4[ix - 1] == null) tsty_4[ix - 1] = new CobolString(256);
            tsty_4[ix - 1].set(String.valueOf("."));
            for (iy = 1; !(iy > dep_y); iy += 1) {
                if (tsty_3[ix - 1][iy - 1] == null) tsty_3[ix - 1][iy - 1] = new CobolString(256);
                tsty_3[ix - 1][iy - 1].set(String.valueOf(alph_chr[iy - 1]));
            }
        }
        for (ix = 1; !(ix > dep_x); ix += 1) {
            for (iy = 1; !(iy > dep_x); iy += 1) {
                for (iz = 1; !(iz > dep_x); iz += 1) {
                    if (tsty_7[ix - 1][iy - 1][iz - 1] == null) tsty_7[ix - 1][iy - 1][iz - 1] = new CobolString(256);
                    tsty_7[ix - 1][iy - 1][iz - 1].set(String.valueOf(hex_chr[((ix + iy) + iz) - 1]));
                }
            }
        }
        CobolDisplay.display("  Data: '" + String.valueOf(tstgrp) + "'");
    }

    private void tstgrp2() {
    }

    private void dep_x2() {
        for (ix = 1; !(ix > dep_x2); ix += 1) {
            if (tstg2_1[ix - 1] == null) tstg2_1[ix - 1] = new CobolString(256);
            tstg2_1[ix - 1].set(String.valueOf(ix));
        }
    }

    private void tst2tail1() {
    }

    private void ln_5() {
        CobolDisplay.display("Group2: '" + String.valueOf(tstgrp2) + "' len:");
    }

    private void ln_6() {
        flatfile.write(tstrec);
    }

    // SECTION: READ-REC
    private void read_rec() {
        read_10();
        ln();
        ln();
        read_99();
    }

    private void read_10() {
        if (flatfile.read(null) == FileStatus.AT_END) {
            read_99();
            return;
        }
    }

    private void ln_7() {
        CobolDisplay.display("Read SEQ " + String.valueOf(seq) + ", DEP-X = " + String.valueOf(dep_x) + " & DEP-Y = " + String.valueOf(dep_y) + ", TSTREC len:");
    }

    private void ln_8() {
        CobolDisplay.display("  Data: '" + String.valueOf(tstgrp) + "'");
        read_10();
        return;
    }

    private void read_99() {
        return;
    }

    private void main_10() {
    }

    private void dep_x3() {
        tstg3_1[1 - 1] = new BigDecimal(String.valueOf(1).trim()).intValue();
        tstg3_1[2 - 1] = new BigDecimal(String.valueOf(2).trim()).intValue();
        tstg3_1[3 - 1] = new BigDecimal(String.valueOf(3).trim()).intValue();
        tstg3_1[4 - 1] = new BigDecimal(String.valueOf(4).trim()).intValue();
        tstg3_1[5 - 1] = new BigDecimal(String.valueOf(5).trim()).intValue();
        tstg3_1[6 - 1] = new BigDecimal(String.valueOf(6).trim()).intValue();
    }

    private void dep_x3_2() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(tstgrp3));
            _sb.append("-TRAILER");
            tstwrk.set(_sb.toString());
        }
        CobolDisplay.display("'" + String.valueOf(tstwrk) + "'");
    }

    private void flatfile() {
    }

    private void hello() {
    }

    private void seq_2() {
    }

    private void dep_x() {
    }

    private void dep_y() {
        write_rec();
    }

    private void dep_x_2() {
    }

    private void dep_y_2() {
        write_rec();
    }

    private void dep_x_3() {
    }

    private void dep_y_3() {
        write_rec();
    }

    private void dep_x_4() {
    }

    private void dep_y_4() {
        write_rec();
    }

    private void flatfile_2() {
    }

    private void flatfile_3() {
        read_rec();
    }

    private void flatfile_4() {
        System.exit(0);
    }

    @Override
    public void run() {
        add();
    }

    public static void main(String[] args) {
        new RunExtensions020DependingOnWithOdoslide().run();
    }
}
