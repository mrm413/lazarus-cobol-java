package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions031FunctionFormattedDate extends CobolProgram {
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
    private CobolString str = new CobolString(10);



    private void para_main() {
        str.set(String.valueOf(CobolIntrinsics.formatted_date("YYYYMMDD", 1)));
        if (!String.valueOf(str).equals(String.valueOf("16010101"))) {
            CobolDisplay.display("Test 1 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_date("YYYY-MM-DD", 1)));
        if (!String.valueOf(str).equals(String.valueOf("1601-01-01"))) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_date("YYYYDDD", 1)));
        if (!String.valueOf(str).equals(String.valueOf("1601001"))) {
            CobolDisplay.display("Test 3 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_date("YYYY-DDD", 1)));
        if (!String.valueOf(str).equals(String.valueOf("1601-001"))) {
            CobolDisplay.display("Test 4 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_date("YYYYWwwD", 1)));
        if (!String.valueOf(str).equals(String.valueOf("1601W011"))) {
            CobolDisplay.display("Test 5 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_date("YYYY-Www-D", 1)));
        if (!String.valueOf(str).equals(String.valueOf("1601-W01-1"))) {
            CobolDisplay.display("Test 6 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_date("YYYYWwwD", 150115)));
        if (!String.valueOf(str).equals(String.valueOf("2011W527"))) {
            CobolDisplay.display("Test 7 failed: " + String.valueOf(str));
        }
        str.set(String.valueOf(CobolIntrinsics.formatted_date("YYYYWwwD", 150844)));
        if (!String.valueOf(str).equals(String.valueOf("2014W011"))) {
            CobolDisplay.display("Test 8 failed: " + String.valueOf(str));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions031FunctionFormattedDate().run();
    }
}
