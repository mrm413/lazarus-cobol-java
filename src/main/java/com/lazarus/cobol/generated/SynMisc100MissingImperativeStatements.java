package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc100MissingImperativeStatements extends CobolProgram {
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
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private static final int var_len = 115;



    private void para_main() {
        if (var_len < 16) {
        } else {
            cb_var.set(String.valueOf(othervar));
        }
        if (var_len > 16) {
        } else {
            cb_var.set(String.valueOf(othervar));
        }
        if (2 == 3) {
        } else {
            if (1 == 1) {
            } else {
                if (1 == 1) {
                    othervar.set(String.valueOf(cb_var));
                }
            }
        }
        if ((a != 0)) {
            /* RAW: = B */
            othervar.set(String.valueOf(cb_var));
        }
    // while (!(1 != 3)) {
    // }
        if (!((a != 0))) {
            /* RAW: = B */
        } else if (!((b != 0))) {
            /* RAW: = A */
        }
        if ((a != 0)) {
            /* RAW: = B */
            othervar.set(String.valueOf(cb_var));
        }
        if ((a != 0)) {
            /* RAW: = B */
        } else if ((b != 0)) {
            /* RAW: =  */
            /* RAW: A  */
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc100MissingImperativeStatements().run();
    }
}
