package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions103FunctionTestFormattedDatetimeWithDates extends CobolProgram {
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
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "16010101")).equals(String.valueOf(0))) {
            CobolDisplay.display("Test 1 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYY-MM-DD", "1601-01-01")).equals(String.valueOf(0))) {
            CobolDisplay.display("Test 2 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYDDD", "1601001")).equals(String.valueOf(0))) {
            CobolDisplay.display("Test 3 failed");
            if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYY-DDD", "1601-001")).equals(String.valueOf(0))) {
                CobolDisplay.display("Test 4 failed");
            }
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYWwwD", "1601W011")).equals(String.valueOf(0))) {
            CobolDisplay.display("Test 5 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYY-Www-D", "1601-W01-1")).equals(String.valueOf(0))) {
            CobolDisplay.display("Test 6 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "1")).equals(String.valueOf(2))) {
            CobolDisplay.display("Test 7 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "160A0101")).equals(String.valueOf(4))) {
            CobolDisplay.display("Test 8 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "00000101")).equals(String.valueOf(1))) {
            CobolDisplay.display("Test 9 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "16000101")).equals(String.valueOf(4))) {
            CobolDisplay.display("Test 10 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "16010001")).equals(String.valueOf(6))) {
            CobolDisplay.display("Test 11 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "16011301")).equals(String.valueOf(6))) {
            CobolDisplay.display("Test 12 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "16010190")).equals(String.valueOf(7))) {
            CobolDisplay.display("Test 13 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "18000229")).equals(String.valueOf(8))) {
            CobolDisplay.display("Test 14 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYY-MM-DD", "1601 01 01")).equals(String.valueOf(5))) {
            CobolDisplay.display("Test 15 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "160101010")).equals(String.valueOf(9))) {
            CobolDisplay.display("Test 16 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYWwwD", "1601A011")).equals(String.valueOf(5))) {
            CobolDisplay.display("Test 17 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYWwwD", "1601W531")).equals(String.valueOf(7))) {
            CobolDisplay.display("Test 18 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYWwwD", "1601W601")).equals(String.valueOf(6))) {
            CobolDisplay.display("Test 19 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYWwwD", "2009W531")).equals(String.valueOf(0))) {
            CobolDisplay.display("Test 20 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYWwwD", "1601W018")).equals(String.valueOf(8))) {
            CobolDisplay.display("Test 21 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYDDD", "1601366")).equals(String.valueOf(7))) {
            CobolDisplay.display("Test 22 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYDDD", "1601370")).equals(String.valueOf(6))) {
            CobolDisplay.display("Test 23 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYDDD", "1601400")).equals(String.valueOf(5))) {
            CobolDisplay.display("Test 24 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "01")).equals(String.valueOf(1))) {
            CobolDisplay.display("Test 25 failed");
        }
        if (!String.valueOf(CobolIntrinsics.test_formatted_datetime("YYYYMMDD", "1601010")).equals(String.valueOf(8))) {
            CobolDisplay.display("Test 26 failed");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions103FunctionTestFormattedDatetimeWithDates().run();
    }
}
