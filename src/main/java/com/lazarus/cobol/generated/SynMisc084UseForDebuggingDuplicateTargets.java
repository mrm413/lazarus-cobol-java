package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc084UseForDebuggingDuplicateTargets extends CobolProgram {
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
    private int i = 0;
    private int j = 0;



    // SECTION: test-DEBUG
    private void test_debug() {
        use();
        para_main();
        debug_line();
    }

    private void use() {
        /* RAW: FOR DEBUGGING ON MAIN */
    }

    private void para_main() {
        CobolDisplay.display();
    }

    private void debug_line() {
    }

    // SECTION: test-DEBUG2
    private void test_debug2() {
        use();
        procedures();
        debug_line();
    }

    private void use_2() {
        /* RAW: FOR DEBUGGING ON ALL I ALL */
    }

    private void procedures() {
        CobolDisplay.display();
    }

    private void debug_line_2() {
    }

    // SECTION: test-DEBUG3
    private void test_debug3() {
        use();
        i();
        debug_line();
    }

    private void use_3() {
        /* RAW: FOR DEBUGGING ON ALL PROCEDURES J */
    }

    private void i() {
        CobolDisplay.display();
    }

    private void debug_line_3() {
    }

    // SECTION: MAIN
    private void para_main_2() {
        move();
    }

    private void move() {
        /* RAW: 1 TO i */
        System.exit(0);
    }

    @Override
    public void run() {
        move();
    }

    public static void main(String[] args) {
        new SynMisc084UseForDebuggingDuplicateTargets().run();
    }
}
