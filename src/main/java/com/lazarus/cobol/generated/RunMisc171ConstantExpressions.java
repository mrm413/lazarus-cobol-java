package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc171ConstantExpressions extends CobolProgram {
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
    private CobolString cb_var = new CobolString(200);
    private CobolString othervar = new CobolString(115);
    private static final int var_len = 115;


    private CobolString equals = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);

    private void main_10() {
    }

    private void cb_var() {
        if (true) {
            /* RAW: ALSO VAR-LEN > 16 AND VAR-LEN */
            cb_var.setRefMod((16 - var_len), (var_len - 9), String.valueOf(CobolString.refMod(othervar, 1, (var_len - 9))));
            CobolDisplay.display("A: Should NOT be executed");
        } else if (true) {
            /* RAW: ALSO VAR-LEN < 16 ALSO TRUE */
            cb_var.set(String.valueOf(othervar));
            CobolDisplay.display("A: OK VAR-LEN > 16 AND VAR-LEN < 200");
        } else if (true) {
            /* RAW: ALSO VAR = SPACES ALSO TRUE */
            cb_var.set(String.valueOf(othervar));
            CobolDisplay.display("A: OK VAR IS SPACES");
        }
    }

    private void cb_var_2() {
        if (String.valueOf(3).equals(String.valueOf(cb_var))) {
            /* RAW: = SPACES */
            CobolDisplay.display("B: OK VAR IS NOT SPACES");
        } else if (String.valueOf(3).equals(String.valueOf(cb_var))) {
            /* RAW: NOT = SPACES */
            CobolDisplay.display("B: FALSE VAR IS SPACES");
        }
    }

    private void cb_var_3() {
        if (!(!String.valueOf(cb_var).trim().isEmpty())) {
            /* RAW: = SPACES */
            CobolDisplay.display("C: FALSE VAR IS SPACES");
        } else if (!(!String.valueOf(cb_var).trim().isEmpty())) {
            /* RAW: NOT = SPACES */
            CobolDisplay.display("C: OK VAR IS SPACES");
        }
    }

    private void cb_var_4() {
        if (!String.valueOf(cb_var).trim().isEmpty()) {
            /* RAW: = SPACES */
            CobolDisplay.display("D: BAD VAR IS SPACES");
        } else if (!String.valueOf(cb_var).trim().isEmpty()) {
            /* RAW: NOT = SPACES */
            CobolDisplay.display("D: OK VAR IS NOT SPACES");
        }
    }

    private void cb_var_5() {
        if (String.valueOf(var_len).equals(String.valueOf(_unnamed))) {
            /* RAW: 32 ALSO SPACES */
            CobolDisplay.display("E: OK VAR IS SPACES");
        } else if (String.valueOf(var_len).equals(String.valueOf(_unnamed))) {
            /* RAW: 16 ALSO NOT SPACES */
            CobolDisplay.display("E: BAD VAR IS NOT SPACES");
        } else {
            CobolDisplay.display("E: OK OTHER option taken");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        main_10();
    }

    public static void main(String[] args) {
        new RunMisc171ConstantExpressions().run();
    }
}
