package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc131ConditionalDirectivesWithLvl781 extends CobolProgram {
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
    private static final String y = "a";


    private CobolString x = new CobolString(256);
    private CobolString defined = new CobolString(256);
    private CobolString elif = new CobolString(256);
    private CobolString not = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);
    private CobolString but = new CobolString(256);
    private CobolString via = new CobolString(256);
    private CobolString lvl = new CobolString(256);
    private CobolString end = new CobolString(256);

    private void para_main() {
        if (!String.valueOf(x).trim().isEmpty()) {
            /* RAW: DEFINED  */
            CobolDisplay.display(String.valueOf(x) + String.valueOf(defined) + String.valueOf(elif) + String.valueOf(y) + String.valueOf(defined));
            CobolDisplay.display(String.valueOf(x) + String.valueOf(not) + String.valueOf(defined) + String.valueOf(_unnamed) + String.valueOf(but) + String.valueOf(y) + String.valueOf(via) + String.valueOf(lvl) + String.valueOf(78));
        } else {
            CobolDisplay.display(String.valueOf(x) + String.valueOf(not) + String.valueOf(defined) + String.valueOf(end));
            /* CONTINUE */
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc131ConditionalDirectivesWithLvl781().run();
    }
}
