package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile027FileStatus extends CobolProgram {
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
    private CobolString fs = new CobolString(2);

    // LOCAL-STORAGE SECTION
    private int gs = 0;
    private CobolString js = new CobolString(2);
    private CobolString ks = new CobolString(2);
    private BigDecimal ls = BigDecimal.ZERO;
    private int ms = 0;
    private CobolString ns = new CobolString(3);
    private CobolString x = new CobolString(1); // Group: x
    private int y = 0;
    private CobolString[] z = new CobolString[10];
    private CobolString os = new CobolString(2);
    private CobolString[] z2 = new CobolString[10];
    private CobolString rs = new CobolString(1);

    // FILE SECTION — f
    private CobolString hs = new CobolString(2);

    // FILE SECTION — g
    private CobolString g_rec = new CobolString(1);

    // FILE SECTION — h
    private CobolString h_rec = new CobolString(1);

    // FILE SECTION — j
    private CobolString j_rec = new CobolString(1);

    // FILE SECTION — k
    private CobolString k_rec = new CobolString(1);

    // FILE SECTION — l
    private CobolString l_rec = new CobolString(1);

    // FILE SECTION — m
    private CobolString m_rec = new CobolString(1);

    // FILE SECTION — n
    private CobolString n_rec = new CobolString(1);

    // FILE SECTION — o
    private CobolString o_rec = new CobolString(1);

    // FILE SECTION — p
    private CobolString p_rec = new CobolString(1);

    // FILE SECTION — q
    private CobolString q_rec = new CobolString(1);

    // FILE SECTION — r
    private CobolString r_rec = new CobolString(1);


    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("f.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: fs
    private CobolFile g = new CobolFile("g.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: gs
    private CobolFile h = new CobolFile("h.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: hs
    private CobolFile j = new CobolFile("j.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: js
    private CobolFile k = new CobolFile("k.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: ks
    private CobolFile l = new CobolFile("l.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: ls
    private CobolFile m = new CobolFile("m.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: ms
    private CobolFile n = new CobolFile("n.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: ns
    private CobolFile o = new CobolFile("o.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: os
    private CobolFile p = new CobolFile("p.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: ps
    private CobolFile q = new CobolFile("q.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: non-existent
    private CobolFile r = new CobolFile("r.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: rs


    private void para_main() {
        /* CONTINUE */
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynFile027FileStatus().run();
    }
}
