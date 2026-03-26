package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynDefinition009ErrorHandlingInConditions extends CobolProgram {
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
    private CobolString testme = new CobolString(1);


    private CobolString broken = new CobolString(256); // fallback
    private CobolString not_defined = new CobolString(256); // fallback

    private void para_main() {
        if (!String.valueOf(testme).trim().isEmpty()) {
            /* RAW: IS NOT-DEFINED */
            /* CONTINUE */
        } else if (!String.valueOf(testme).trim().isEmpty()) {
            /* RAW: = 'A' */
            /* CONTINUE */
        } else {
            if (!(!String.valueOf(testme).trim().isEmpty())) {
                /* RAW: NOT-DEFINED THEN */
                /* CONTINUE */
            } else {
                /* CONTINUE */
            }
        }
        if (!String.valueOf(testme).trim().isEmpty()) {
            /* RAW: IS 'ABC' */
            /* CONTINUE */
        } else if (!String.valueOf(testme).trim().isEmpty()) {
            /* RAW: = 'B' */
            /* CONTINUE */
        }
        if (!String.valueOf(testme).trim().isEmpty()) {
            /* RAW: IS TESTME */
            /* CONTINUE */
        } else if (!String.valueOf(testme).trim().isEmpty()) {
            /* RAW: = 'C' */
            /* CONTINUE */
        }
        if (!String.valueOf(testme).trim().isEmpty()) {
            /* RAW: NOT = NOT-DEFINED */
            /* CONTINUE */
        } else if (!String.valueOf(testme).trim().isEmpty()) {
            /* RAW: = 'D' */
            /* CONTINUE */
        }
        if (!String.valueOf(testme).trim().isEmpty()) {
        }
        /* RAW: NOT-DEFINED  */
        /* CONTINUE */
        /* RAW: TESTME = 'E' */
        /* CONTINUE */
        if (String.valueOf(broken).equals(String.valueOf(not_defined))) {
            /* CONTINUE */
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynDefinition009ErrorHandlingInConditions().run();
    }
}
