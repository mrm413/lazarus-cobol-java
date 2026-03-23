package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc095ConstantExpressions1 extends CobolProgram {
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
            cb_var.setRefMod((17 - var_len), (var_len - 8), String.valueOf(CobolString.refMod(othervar, 1, (var_len - 8))));
        } else {
            cb_var.set(String.valueOf(othervar));
        }
        if (2 == 3) {
            cb_var.set(String.valueOf(othervar));
        } else {
            if (1 == 1) {
                othervar.set(String.valueOf(cb_var));
            } else {
                cb_var.setRefMod((17 - var_len), (var_len - 8), String.valueOf(CobolString.refMod(othervar, 1, (var_len - 8))));
                if (1 == 1) {
                    othervar.set(String.valueOf(cb_var));
                }
            }
            b = new BigDecimal(String.valueOf(a).trim()).intValue();
            if (1 == 1) {
                if (2 == 1) {
                    cb_var.setRefMod((17 - var_len), (var_len - 8), String.valueOf(CobolString.refMod(othervar, 1, (var_len - 8))));
                }
            }
        }
        while (!(1 == 3)) {
        }
    // cb_var.set(String.valueOf(othervar));
    // while (!(1 == 1)) {
    // }
    // cb_var.setRefMod((17 - var_len), (var_len - 8), String.valueOf(CobolString.refMod(othervar, 1, (var_len - 8))));
    // while (!(1 == 3)) {
    // }
    // cb_var.set(String.valueOf(othervar));
    // while (!(1 == 1)) {
    // }
    // cb_var.set(String.valueOf(othervar));
    // if ((var_len != 0)) {
            /* RAW: < 16 */
    // cb_var.setRefMod((17 - var_len), (var_len - 8), String.valueOf(CobolString.refMod(othervar, 1, (var_len - 8))));
    // } else if ((var_len != 0)) {
            /* RAW: > 16 */
    // cb_var.set(String.valueOf(othervar));
    // } else if ((a != 0)) {
            /* RAW: = B */
    // othervar.set(String.valueOf(cb_var));
    // } else {
            /* CONTINUE */
    // }
    // if (!((var_len != 0))) {
            /* RAW: < 16 */
    // cb_var.setRefMod((16 - var_len), (var_len - 9), String.valueOf(CobolString.refMod(othervar, 1, (var_len - 9))));
    // } else if (!((var_len != 0))) {
            /* RAW: > 16 */
    // cb_var.set(String.valueOf(othervar));
    // } else if (!((a != 0))) {
            /* RAW: = B */
    // othervar.set(String.valueOf(cb_var));
    // } else {
            /* CONTINUE */
    // }
    // if (15 == var_len) {
            /* RAW: var  */
    // }
    // if (var_len == 15) {
            /* RAW: othervar  */
    // }
    // System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc095ConstantExpressions1().run();
    }
}
