package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions107FunctionTestNumval extends CobolProgram {
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
    private CobolString empty = new CobolString(1); // Group: EMPTY



    private void para_main() {
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("+ 1")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 1  fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval(" + 1")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 2  fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("- 1")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 3  fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval(" - 1")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 4  fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("+- 1")).trim()).intValue();
        if (result != 2) {
            CobolDisplay.display("Test 5  fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("1 +")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 6  fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("1 -")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 7  fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("1 +-")).trim()).intValue();
        if (result != 4) {
            CobolDisplay.display("Test 8  fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("1 -+")).trim()).intValue();
        if (result != 4) {
            CobolDisplay.display("Test 9  fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("+ 1.1")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 10 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("- 1.1")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 11 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("1.1 +")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 12 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("1.1 -")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 13 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("1.1 CR")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 14 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("1.1 DB")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 15 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("1.1 -CR")).trim()).intValue();
        if (result != 6) {
            CobolDisplay.display("Test 16 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("1.1 +DB")).trim()).intValue();
        if (result != 6) {
            CobolDisplay.display("Test 17 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("1.1 CDB")).trim()).intValue();
        if (result != 6) {
            CobolDisplay.display("Test 18 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("+1.1 CR")).trim()).intValue();
        if (result != 6) {
            CobolDisplay.display("Test 19 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("+      ")).trim()).intValue();
        if (result != 8) {
            CobolDisplay.display("Test 20 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("  0.   ")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 21 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("  .0   ")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 22 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("  . 0")).trim()).intValue();
        if (result != 4) {
            CobolDisplay.display("Test 23 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("  0 .")).trim()).intValue();
        if (result != 5) {
            CobolDisplay.display("Test 24 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("   0+0")).trim()).intValue();
        if (result != 6) {
            CobolDisplay.display("Test 25 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("   0+  0")).trim()).intValue();
        if (result != 8) {
            CobolDisplay.display("Test 26 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("1.1 D")).trim()).intValue();
        if (result != 6) {
            CobolDisplay.display("Test 27 fail: ");
            /* RAW: RESULT  */
        }
        /* RAW: *  */
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("")).trim()).intValue();
        result = new BigDecimal(String.valueOf(0).trim()).intValue();
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval(empty)).trim()).intValue();
        if (result != 1) {
            CobolDisplay.display("Test 28 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("   ")).trim()).intValue();
        if (result != 4) {
            CobolDisplay.display("Test 29 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("  .")).trim()).intValue();
        if (result != 4) {
            CobolDisplay.display("Test 30 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval("    ")).trim()).intValue();
        if (result != 5) {
            CobolDisplay.display("Test 31 fail: ");
            /* RAW: RESULT  */
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_numval(" 1  T")).trim()).intValue();
        if (result != 5) {
            CobolDisplay.display("Test 32 fail: ");
            /* RAW: RESULT  */
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions107FunctionTestNumval().run();
    }
}
