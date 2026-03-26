package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc087UseForDebuggingSyntaxChecks2 extends CobolProgram {
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
    }

    private void use() {
        /* RAW: FOR DEBUGGING ON ALL REFERENCES OF */
        CobolDisplay.display(String.valueOf(debug_line));
        para_main();
        test_debug2();
        test_debug2();
        return;
    }

    // SECTION: test-DEBUG2
    private void test_debug2() {
        use();
    }

    private void use_2() {
        /* RAW: FOR DEBUGGING ON ALL OF I */
        CobolDisplay.display(String.valueOf(debug_line));
    }

    // SECTION: MAIN
    private void para_main() {
        move();
    }

    private void move() {
        /* RAW: 1 TO i , j */
        test_debug();
        System.exit(0);
    }

    @Override
    public void run() {
        move();
    }

    public static void main(String[] args) {
        new SynMisc087UseForDebuggingSyntaxChecks2().run();
    }
}
