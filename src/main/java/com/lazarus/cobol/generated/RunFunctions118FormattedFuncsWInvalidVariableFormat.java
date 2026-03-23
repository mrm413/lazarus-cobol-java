package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions118FormattedFuncsWInvalidVariableFormat extends CobolProgram {
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
    private CobolString invalid_date_format = new CobolString(10);
    private CobolString invalid_datetime_format = new CobolString(17);
    private CobolString invalid_time_format = new CobolString(6);



    private void para_main() {
        if (((!String.valueOf(CobolIntrinsics.formatted_current_date(invalid_date_format)).equals(String.valueOf(" ")) || !String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf("EC-ARGUMENT-FUNCTION"))) || !String.valueOf(CobolIntrinsics.exception_location()).equals(String.valueOf("prog; ; 11")))) {
            CobolDisplay.display("Test 1 failed");
        }
        if (((!String.valueOf(CobolIntrinsics.formatted_date(invalid_date_format, 1)).equals(String.valueOf(" ")) || !String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf("EC-ARGUMENT-FUNCTION"))) || !String.valueOf(CobolIntrinsics.exception_location()).equals(String.valueOf("prog; ; 18")))) {
            CobolDisplay.display("Test 2 failed");
        }
        if (((!String.valueOf(CobolIntrinsics.formatted_datetime(invalid_datetime_format, 1, 1)).equals(String.valueOf(" ")) || !String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf("EC-ARGUMENT-FUNCTION"))) || !String.valueOf(CobolIntrinsics.exception_location()).equals(String.valueOf("prog; ; 24")))) {
            CobolDisplay.display("Test 3 failed");
        }
        if (((!String.valueOf(CobolIntrinsics.formatted_time(invalid_time_format, 1)).equals(String.valueOf(" ")) || !String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf("EC-ARGUMENT-FUNCTION"))) || !String.valueOf(CobolIntrinsics.exception_location()).equals(String.valueOf("prog; ; 31")))) {
            CobolDisplay.display("Test 4 failed");
        }
        if (((!String.valueOf(CobolIntrinsics.integer_of_formatted_date(invalid_date_format, 1)).equals(String.valueOf(0)) || !String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf("EC-ARGUMENT-FUNCTION"))) || !String.valueOf(CobolIntrinsics.exception_location()).equals(String.valueOf("prog; ; 37")))) {
            CobolDisplay.display("Test 5 failed");
        }
        if (((!String.valueOf(CobolIntrinsics.seconds_from_formatted_time(invalid_time_format, 1)).equals(String.valueOf(0)) || !String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf("EC-ARGUMENT-FUNCTION"))) || !String.valueOf(CobolIntrinsics.exception_location()).equals(String.valueOf("prog; ; 44")))) {
            CobolDisplay.display("Test 6 failed");
        }
        if (((!String.valueOf(CobolIntrinsics.test_formatted_datetime(invalid_datetime_format, 1)).equals(String.valueOf(0)) || !String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf("EC-ARGUMENT-FUNCTION"))) || !String.valueOf(CobolIntrinsics.exception_location()).equals(String.valueOf("prog; ; 51")))) {
            CobolDisplay.display("Test 7 failed");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions118FormattedFuncsWInvalidVariableFormat().run();
    }
}
