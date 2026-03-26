package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc003WarnLiteralSizeInConstantExprLevel88 extends CobolProgram {
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
    private int x = 0;
    private int y = 0;
    private CobolString xx = new CobolString(1);


    private CobolString never_true = new CobolString(256); // fallback
    private CobolString never_truen = new CobolString(256); // fallback
    private CobolString some_not_s = new CobolString(256); // fallback
    private CobolString some_not = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback

    private void para_main() {
        if (!String.valueOf(never_true).trim().isEmpty()) {
            /* CONTINUE */
        }
        if (!String.valueOf(never_truen).trim().isEmpty()) {
            /* CONTINUE */
        }
        if (!String.valueOf(some_not_s).trim().isEmpty()) {
            some_not.set(String.valueOf(cb_true));
            some_not_s.set(String.valueOf(cb_true));
        }
        never_true.set(String.valueOf(cb_true));
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc003WarnLiteralSizeInConstantExprLevel88().run();
    }
}
