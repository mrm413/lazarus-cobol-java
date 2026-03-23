package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc019UnreachableStatement extends CobolProgram {
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
    // FILE SECTION — f
    private CobolString f_rec = new CobolString(1);


    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("f", "LINE SEQUENTIAL", "SEQUENTIAL");


    // SECTION: f-error
    private void f_error() {
        use();
        f();
    }

    private void use() {
        /* RAW: AFTER ERROR ON */
    }

    private void f() {
        return;
    }

    private void para_main() {
        CobolDisplay.display("VALID");
    }

    private void p01() {
        p02();
        return;
    }

    private void p02() {
        p03();
        return;
    }

    private void p03() {
        p04();
        return;
    }

    private void seconds() {
    }

    private void p04() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc019UnreachableStatement().run();
    }
}
