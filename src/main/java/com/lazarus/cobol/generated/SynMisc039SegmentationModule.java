package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc039SegmentationModule extends CobolProgram {
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


    // SECTION: DEC-1
    private CobolString _filler_001 = new CobolString(256); // fallback
    private void dec_1() {
        _49();
    }

    private void _49() {
        /* CONTINUE */
    }

    // SECTION: DEC-2
    private void dec_2() {
        _50();
    }

    private void _50() {
        /* CONTINUE */
    }

    // SECTION: SEC-1
    private void sec_1() {
        _00();
    }

    private void _00() {
        /* CONTINUE */
    }

    // SECTION: SEC-2
    private void sec_2() {
        _01();
    }

    private void _01() {
        /* CONTINUE */
    }

    // SECTION: SEC-3
    private void sec_3() {
        _filler_001();
        _00();
    }

    private void _filler_001() {
    }

    private void _00_2() {
        /* CONTINUE */
    }

    // SECTION: SEC-4
    private void sec_4() {
        _100();
    }

    private void _100() {
        /* CONTINUE */
    }

    // SECTION: SEC-5
    private void sec_5() {
        _49();
    }

    private void _49_2() {
        /* CONTINUE */
    }

    // SECTION: SEC-6
    private void sec_6() {
        _50();
    }

    private void _50_2() {
        sec_1();
    }

    // SECTION: SEC-7
    private void sec_7() {
        _99();
    }

    private void _99() {
        sec_1();
        System.exit(0);
    }

    @Override
    public void run() {
        _00();
    }

    public static void main(String[] args) {
        new SynMisc039SegmentationModule().run();
    }
}
