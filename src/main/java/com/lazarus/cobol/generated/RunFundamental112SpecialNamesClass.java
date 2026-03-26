package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental112SpecialNamesClass extends CobolProgram {
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
    private CobolString alpha = new CobolString(1);
    private int num_1 = 0;



    private void para_main() {
        alpha.set(String.valueOf("3"));
        if (!String.valueOf(alpha).trim().isEmpty()) {
            /* RAW: HEXA THEN */
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR 1");
        }
        if (!String.valueOf(alpha).trim().isEmpty()) {
            /* RAW: ODD THEN */
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR 2");
        }
        num_1 = new BigDecimal(String.valueOf(2).trim()).intValue();
        if ((num_1 != 0)) {
            /* RAW: EVEN THEN */
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR 3");
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental112SpecialNamesClass().run();
    }
}
