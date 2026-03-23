package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental092ExpressionNumericVsDisplay extends CobolProgram {
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
    private CobolString fldx50 = new CobolString(50);
    private CobolString fldx10j = new CobolString(10);
    private int fldnumd = 0;
    private int fldnumd4 = 0;
    private BigDecimal fldnumb = BigDecimal.ZERO;


    private CobolString no_disp = new CobolString(256);
    private CobolString cb_true = new CobolString(256);

    private void main_line() {
        do_check();
        no_disp.set(String.valueOf(cb_true));
        for (int _i0 = 0; _i0 < 20000; _i0++) {
        }
        return;
    }

    private void do_check() {
        fldx50.set(String.valueOf("123"));
        if (String.valueOf(123).equals(String.valueOf(fldx50))) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! 123  <> \"123\"");
        }
        if (fldnumd == fldnumd4) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! 123  <> 0123");
        }
        if (String.valueOf(fldx50).equals(String.valueOf(fldnumd4))) {
            CobolDisplay.display("! \"123\" = 0123");
        } else {
            /* CONTINUE */
        }
        if (String.valueOf(fldnumd).equals(String.valueOf(fldx50))) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("!-123 DISP <> \"123\"");
        }
        if (new BigDecimal(String.valueOf(fldx50).trim()).compareTo(fldnumb) == 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("!-1.23 BIN  <> \"123\"");
        }
        if (String.valueOf(fldx10j).equals(String.valueOf(fldnumd4))) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"0123\" J  <> \"0123\"");
        }
    }

    @Override
    public void run() {
        main_line();
    }

    public static void main(String[] args) {
        new RunFundamental092ExpressionNumericVsDisplay().run();
    }
}
