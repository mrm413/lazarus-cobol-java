package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions043FunctionIntegerOfFormattedDate extends CobolProgram {
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
    private int day_int = 0;



    private void para_main() {
        day_int = new BigDecimal(String.valueOf(CobolIntrinsics.integer_of_formatted_date("YYYY-MM-DD", "2013-12-30")).trim()).intValue();
        if (day_int != 150844) {
            CobolDisplay.display("Test 1 failed: " + String.valueOf(day_int));
        }
        day_int = new BigDecimal(String.valueOf(CobolIntrinsics.integer_of_formatted_date("YYYY-DDD", "2013-364")).trim()).intValue();
        if (day_int != 150844) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(day_int));
        }
        day_int = new BigDecimal(String.valueOf(CobolIntrinsics.integer_of_formatted_date("YYYY-Www-D", "2014-W01-1")).trim()).intValue();
        if (day_int != 150844) {
            CobolDisplay.display("Test 3 failed: " + String.valueOf(day_int));
        }
        day_int = new BigDecimal(String.valueOf(CobolIntrinsics.integer_of_formatted_date("YYYY-MM-DDThh:mm:ss", "2013-12-30T12:34:56")).trim()).intValue();
        if (day_int != 150844) {
            CobolDisplay.display("Test 4 failed: " + String.valueOf(day_int));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions043FunctionIntegerOfFormattedDate().run();
    }
}
