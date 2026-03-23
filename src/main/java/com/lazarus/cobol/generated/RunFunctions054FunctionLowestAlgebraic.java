package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions054FunctionLowestAlgebraic extends CobolProgram {
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
    private int f1 = 0;
    private short f2 = (short) 0;
    private int f3 = 0;
    private CobolString f4 = new CobolString(7);
    private CobolString f5 = new CobolString(7);
    private int f6 = 0;
    private int f7 = 0;



    private void para_main() {
        if (!String.valueOf(CobolIntrinsics.lowest_algebraic(f1)).equals(String.valueOf(-999))) {
            CobolDisplay.display("Test 1 fail");
        }
        if (!String.valueOf(CobolIntrinsics.lowest_algebraic(f2)).equals(String.valueOf(-9999))) {
            CobolDisplay.display("Test 2 fail");
        }
        if (!String.valueOf(CobolIntrinsics.lowest_algebraic(f3)).equals(String.valueOf(0))) {
            CobolDisplay.display("Test 3 fail");
        }
        if (!String.valueOf(CobolIntrinsics.lowest_algebraic(f4)).equals(String.valueOf(-99999.99))) {
            CobolDisplay.display("Test 4 fail");
        }
        if (!String.valueOf(CobolIntrinsics.lowest_algebraic(f5)).equals(String.valueOf(0))) {
            CobolDisplay.display("Test 5 fail");
        }
        if (!String.valueOf(CobolIntrinsics.lowest_algebraic(f6)).equals(String.valueOf(-128))) {
            CobolDisplay.display("Test 6 fail");
        }
        if (!String.valueOf(CobolIntrinsics.lowest_algebraic(f7)).equals(String.valueOf(0))) {
            CobolDisplay.display("Test 7 fail");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions054FunctionLowestAlgebraic().run();
    }
}
