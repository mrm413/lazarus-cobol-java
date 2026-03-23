package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions116FunctionWhenCompiled extends CobolProgram {
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
    private CobolString compiled_datetime = new CobolString(1); // Group: compiled-datetime
    private CobolString compiled_date = new CobolString(1); // Group: compiled-date
    private CobolString millennium = new CobolString(1);
    private CobolString timezone = new CobolString(5);


    private CobolString _unnamed = new CobolString(256);

    private void para_main() {
    }

    private void compiled_datetime() {
        if (!String.valueOf(millennium).equals(String.valueOf("2"))) {
            CobolDisplay.display("Millennium NOT OK: " + String.valueOf(millennium));
        }
        if (!String.valueOf(timezone).equals(String.valueOf(CobolIntrinsics.current_date()))) {
            CobolDisplay.display("Timezone NOT OK: " + String.valueOf(timezone));
        }
        /* INSPECT compiled-date — 2 clause(s) */
        if (!String.valueOf(compiled_date).equals(String.valueOf("9"))) {
            CobolDisplay.display("Date format NOT OK: " + String.valueOf(compiled_date));
        }
        if (!String.valueOf(timezone).equals(String.valueOf("00000"))) {
            /* INSPECT timezone — 2 clause(s) */
            if ((!String.valueOf(timezone).equals(String.valueOf("+9999")) && true)) {
                CobolDisplay.display("Timezone format NOT OK: " + String.valueOf(timezone));
            }
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions116FunctionWhenCompiled().run();
    }
}
