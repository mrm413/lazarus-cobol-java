package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc119OccursClauseWith1Entry extends CobolProgram {
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
    private CobolString d1 = new CobolString(1); // Group: D1
    private CobolString[] d1_entry = new CobolString[1];
    private CobolString d2 = new CobolString(1); // Group: D2
    private CobolString[] d2_entry = new CobolString[1];
    private CobolString d1tor = new CobolString(1); // Group: D1TOR
    private CobolString d1_r = new CobolString(1); // Group: D1-R
    private CobolString[] d1_r_entry = new CobolString[1];
    private CobolString d2tor = new CobolString(1); // Group: D2TOR
    private CobolString d2_r = new CobolString(1); // Group: D2-R
    private CobolString[] d2_r_entry = new CobolString[1];



    private void para_main() {
        if (!String.valueOf(d1_entry[1 - 1]).equals(String.valueOf("123"))) {
            CobolDisplay.display(String.valueOf(d1_entry[1 - 1]));
        }
        if (!String.valueOf(d2_entry[1 - 1]).equals(String.valueOf("ABC"))) {
            CobolDisplay.display(String.valueOf(d2_entry[1 - 1]));
        }
        if (!String.valueOf(d1_r_entry[1 - 1]).equals(String.valueOf("456"))) {
            CobolDisplay.display(String.valueOf(d1_r_entry[1 - 1]));
        }
        if (!String.valueOf(d2_r_entry[1 - 1]).equals(String.valueOf("DEF"))) {
            CobolDisplay.display(String.valueOf(d2_r_entry[1 - 1]));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc119OccursClauseWith1Entry().run();
    }
}
