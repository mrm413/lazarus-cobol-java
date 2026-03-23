package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions035FunctionFormattedTime extends CobolProgram {
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
    private CobolString str = new CobolString(20);



    private void para_main() {
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss", 45296)));
        if (!String.valueOf(str).equals(String.valueOf("123456"))) {
            CobolDisplay.display("Test 1 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hh:mm:ss", 45296)));
        if (!String.valueOf(str).equals(String.valueOf("12:34:56"))) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmssZ", 86399, -1)));
        if (!String.valueOf(str).equals(String.valueOf("000059Z"))) {
            CobolDisplay.display("Test 3 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hh:mm:ssZ", 45296)));
        if (!String.valueOf(str).equals(String.valueOf("12:34:56Z"))) {
            CobolDisplay.display("Test 4 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss.ss", 45296.78)));
        if (!String.valueOf(str).equals(String.valueOf("123456.78"))) {
            CobolDisplay.display("Test 5 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hh:mm:ss.ssZ", 0, 120)));
        if (!String.valueOf(str).equals(String.valueOf("22:00:00.00Z"))) {
            CobolDisplay.display("Test 6 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss+hhmm", 45296)));
        if (!String.valueOf(str).equals(String.valueOf("123456+0000"))) {
            CobolDisplay.display("Test 7 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hh:mm:ss+hh:mm", 45296, 0)));
        if (!String.valueOf(str).equals(String.valueOf("12:34:56+00:00"))) {
            CobolDisplay.display("Test 8 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss+hhmm", 45296, -754)));
        if (!String.valueOf(str).equals(String.valueOf("123456-1234"))) {
            CobolDisplay.display("Test 9 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss+hhmm", 1, 3000)));
        if (((!String.valueOf(str).equals(String.valueOf(" ")) || !String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf("EC-ARGUMENT-FUNCTION"))) || !String.valueOf(CobolIntrinsics.exception_location()).equals(String.valueOf("prog; ; 60")))) {
            CobolDisplay.display("Test 10 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_time("hhmmss+hhmm", 1, -3000)));
        if (((!String.valueOf(str).equals(String.valueOf(" ")) || !String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf("EC-ARGUMENT-FUNCTION"))) || !String.valueOf(CobolIntrinsics.exception_location()).equals(String.valueOf("prog; ; 68")))) {
            CobolDisplay.display("Test 11 failed: " + String.valueOf(str));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions035FunctionFormattedTime().run();
    }
}
