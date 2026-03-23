package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions039FunctionHighestAlgebraic extends CobolProgram {
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
    private int f1 = 0;
    private short f2 = (short) 0;
    private int f3 = 0;
    private CobolString f4 = new CobolString(7);
    private CobolString f5 = new CobolString(7);
    private int f6 = 0;
    private int f7 = 0;
    private BigDecimal test_fld = BigDecimal.ZERO;



    private void para_main() {
    }

    private void test_fld() {
        if (test_fld.compareTo(new BigDecimal(String.valueOf(999).trim())) != 0) {
            CobolDisplay.display("Test 1 fail: " + String.valueOf(test_fld));
        }
    }

    private void test_fld_2() {
        if (test_fld.compareTo(new BigDecimal(String.valueOf(9999).trim())) != 0) {
            CobolDisplay.display("Test 2 fail: " + String.valueOf(test_fld));
        }
    }

    private void test_fld_3() {
        if (test_fld.compareTo(new BigDecimal(String.valueOf(99.999).trim())) != 0) {
            CobolDisplay.display("Test 3 fail: " + String.valueOf(test_fld));
        }
    }

    private void test_fld_4() {
        if (test_fld.compareTo(new BigDecimal(String.valueOf(99999.99).trim())) != 0) {
            CobolDisplay.display("Test 4 fail: " + String.valueOf(test_fld));
        }
    }

    private void test_fld_5() {
        if (test_fld.compareTo(new BigDecimal(String.valueOf(99999.99).trim())) != 0) {
            CobolDisplay.display("Test 5 fail: " + String.valueOf(test_fld));
        }
    }

    private void test_fld_6() {
        if (test_fld.compareTo(new BigDecimal(String.valueOf(127).trim())) != 0) {
            CobolDisplay.display("Test 6 fail: " + String.valueOf(test_fld));
        }
    }

    private void test_fld_7() {
        if (test_fld.compareTo(new BigDecimal(String.valueOf(255).trim())) != 0) {
            CobolDisplay.display("Test 7 fail: " + String.valueOf(test_fld));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions039FunctionHighestAlgebraic().run();
    }
}
