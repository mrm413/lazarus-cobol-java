package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions045FunctionLength extends CobolProgram {
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
    private BigDecimal x = BigDecimal.ZERO;
    private CobolString n = new CobolString(18);
    private BigDecimal test_fld = BigDecimal.ZERO;
    private CobolString test_tab = new CobolString(1); // Group: TEST-TAB
    private int t_entries = 0;
    private CobolString[] test_entry = new CobolString[10];



    private void para_main() {
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.length(x)).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(8).trim())) != 0) {
            CobolDisplay.display("LENGTH \"00128\" wrong: " + String.valueOf(test_fld));
        }
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.length(n)).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(9).trim())) != 0) {
            CobolDisplay.display("LENGTH N(9) wrong: " + String.valueOf(test_fld));
        }
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.length("00128")).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(5).trim())) != 0) {
            CobolDisplay.display("LENGTH \"00128\" wrong: " + String.valueOf(test_fld));
        }
        /* RAW: * note : we currently do */
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.length("a0")).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("LENGTH x\"a0\" wrong: " + String.valueOf(test_fld));
        }
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.length("a0")).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(3).trim())) != 0) {
            CobolDisplay.display("LENGTH z\"a0\" wrong: " + String.valueOf(test_fld));
        }
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.length("a0")).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("LENGTH n\"a0\" wrong: " + String.valueOf(test_fld));
        }
        t_entries = new BigDecimal(String.valueOf(10).trim()).intValue();
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.length(test_tab)).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("LENGTH TEST-TAB (10 entries): " + String.valueOf(test_fld));
        }
        t_entries = new BigDecimal(String.valueOf(1).trim()).intValue();
        test_fld = new BigDecimal(String.valueOf(CobolIntrinsics.length(test_tab)).trim());
        if (test_fld.compareTo(new BigDecimal(String.valueOf(3).trim())) != 0) {
            CobolDisplay.display("LENGTH TEST-TAB (1 entry): " + String.valueOf(test_fld));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions045FunctionLength().run();
    }
}
