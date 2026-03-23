package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions106FunctionTestFormattedDatetimeDpComma extends CobolProgram {
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


    private void para_main() {
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("hhmmss,ss", "000000,00")).equals(String.valueOf(0))) {
            CobolDisplay.display("Test 1 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDDThhmmss,ss", "16010101T000000,00")).equals(String.valueOf(0))) {
            CobolDisplay.display("Test 2 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("hhmmss,ss", "000000.00")).equals(String.valueOf(7))) {
            CobolDisplay.display("Test 3 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDDThhmmss,ss", "16010101T000000.00")).equals(String.valueOf(16))) {
            CobolDisplay.display("Test 4 failed");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions106FunctionTestFormattedDatetimeDpComma().run();
    }
}
