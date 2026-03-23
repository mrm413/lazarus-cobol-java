package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions105FunctionTestFormattedDatetimeWithDatetimes extends CobolProgram {
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
    private int result = 0;



    private void para_main() {
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDDThhmmss", "16010101T000000")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 1 failed: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYY-MM-DDThh:mm:ss.sssssssss+hh:mm", "1601-01-01T00:00:00.000000000+00:00")).trim()).intValue();
        if (result != 0) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDDThhmmss", "16010101 000000")).trim()).intValue();
        if (result != 9) {
            CobolDisplay.display("Test 3 failed: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDDThhmmss", " ")).trim()).intValue();
        if (result != 1) {
            CobolDisplay.display("Test 4 failed: " + String.valueOf(result));
        }
        result = new BigDecimal(String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDDThhmmss", "16010101T      ")).trim()).intValue();
        if (result != 10) {
            CobolDisplay.display("Test 5 failed: " + String.valueOf(result));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions105FunctionTestFormattedDatetimeWithDatetimes().run();
    }
}
