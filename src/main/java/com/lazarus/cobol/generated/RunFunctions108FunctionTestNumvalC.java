package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions108FunctionTestNumvalC extends CobolProgram {
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
    private int result = 0;



    private void para_main() {
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("+ 1")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 1  fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c(" + 1")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 2  fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("- 1")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 3  fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c(" - 1")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 4  fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("+- 1")).trim()).intValue();
        if (result != 2) {
            CobolDisplay.display("Test 5  fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("1 +")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 6  fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("1 -")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 7  fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("1 +-")).trim()).intValue();
        if (result != 4) {
            CobolDisplay.display("Test 8  fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("1 -+")).trim()).intValue();
        if (result != 4) {
            CobolDisplay.display("Test 9  fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("+ 1.1")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 10 fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("- 1.1")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 11 fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("1.1 +")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 12 fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("1.1 -")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 13 fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("1.1 CR")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 14 fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("1.1 DB")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 15 fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("1.1 -CR")).trim()).intValue();
        if (result != 6) {
            CobolDisplay.display("Test 16 fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("+ $1.1 ")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 17 fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("- $1.1 ")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 18 fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("+ X1.1 ")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 19 fail: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval_c("- X1.1 ")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 20 fail: " + String.valueOf(result));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions108FunctionTestNumvalC().run();
    }
}
