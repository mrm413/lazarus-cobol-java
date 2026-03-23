package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc007ValidConditionalExpression extends CobolProgram {
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
    private int cb_var = 0;


    private CobolString _unnamed = new CobolString(256);

    private void para_main() {
        if ((cb_var == 83 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 1 + 1 */
            /* CONTINUE */
        }
        if ((cb_var == 83 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* RAW: 2  */
            /* CONTINUE */
        }
        if ((cb_var == 83 && !String.valueOf(_unnamed).trim().isEmpty())) {
            /* CONTINUE */
        }
        if ((cb_var != 1 || cb_var != 2)) {
            /* CONTINUE */
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc007ValidConditionalExpression().run();
    }
}
