package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc135PerformThruSyntaxChecks extends CobolProgram {
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


    // SECTION: MAIN
    private void para_main() {
        main_00();
        main_ex();
        sub1_00();
        sub1_01();
        sub1_02();
        sub1_ex();
        sub2_00();
        sub2_01();
        sub2_02();
        sub2_ex();
    }

    private void main_00() {
        sub1();
        sub1(); // THRU SUB1-EX
        sub1_00(); // THRU SUB1-EX
        sub1_01();
        sub1_02();
        sub1_ex();
        sub1(); // THRU SUB1
        sub1(); // THRU SUB2
        return;
    }

    private void main_ex() {
        return;
    }

    private void sub1_00() {
        sub1_01(); // THRU SUB1-02
        sub1_02();
    }

    private void sub1_01() {
        /* CONTINUE */
    }

    private void sub1_02() {
        /* CONTINUE */
    }

    private void sub1_ex() {
        return;
    }

    private void sub2_00() {
        sub1_02(); // THRU SUB1-01
    }

    private void sub2_01() {
        /* CONTINUE */
    }

    private void sub2_02() {
        /* CONTINUE */
    }

    private void sub2_ex() {
        return;
    }

    private void sub1() { /* stub — external/COPY */ }

    private void sub2() { /* stub — external/COPY */ }

    @Override
    public void run() {
        main_00();
    }

    public static void main(String[] args) {
        new SynMisc135PerformThruSyntaxChecks().run();
    }
}
