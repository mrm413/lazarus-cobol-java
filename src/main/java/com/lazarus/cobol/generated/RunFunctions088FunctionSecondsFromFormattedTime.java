package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions088FunctionSecondsFromFormattedTime extends CobolProgram {
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
    private short result = (short) 0;



    private void para_main() {
        result = new BigDecimal(String.valueOf(CobolIntrinsics.seconds_from_formatted_time("hhmmss", "010203")).trim()).shortValue();
        if (result != 3723) {
            CobolDisplay.display("Test 1 failed: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.seconds_from_formatted_time("hh:mm:ss", "01:02:03")).trim()).shortValue();
        if (result != 3723) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.seconds_from_formatted_time("hhmmss.ssssssss", "010203.04050607")).trim()).shortValue();
        if (result != 3723.04050607) {
            CobolDisplay.display("Test 3 failed: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.seconds_from_formatted_time("hhmmssZ", "010203Z")).trim()).shortValue();
        if (result != 3723) {
            CobolDisplay.display("Test 4 failed: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.seconds_from_formatted_time("hhmmss+hhmm", "010203+0405")).trim()).shortValue();
        if (result != 3723) {
            CobolDisplay.display("Test 5 failed: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.seconds_from_formatted_time("YYYYMMDDThhmmss", "16010101T010203")).trim()).shortValue();
        if (result != 3723) {
            CobolDisplay.display("Test 6 failed: " + String.valueOf(result));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions088FunctionSecondsFromFormattedTime().run();
    }
}
