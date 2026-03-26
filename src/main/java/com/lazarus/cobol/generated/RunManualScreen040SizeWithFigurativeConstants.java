package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunManualScreen040SizeWithFigurativeConstants extends CobolProgram {
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
    private CobolString success_flag = new CobolString(1);


    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString line = new CobolString(256); // fallback
    private CobolString col = new CobolString(256); // fallback
    private CobolString size = new CobolString(256); // fallback
    private CobolString success = new CobolString(256); // fallback

    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_009 = new CobolString(256); // fallback
    private void para_main() {
        CobolDisplay.display("Enter \"y\" if you see exactly three rows of quotes, " + String.valueOf(_filler_003) + "zeroes and 'abc'," + String.valueOf(_filler_004) + String.valueOf(line) + String.valueOf(1));
        CobolDisplay.display("8 characters long, all aligned." + String.valueOf(_filler_005) + String.valueOf(line) + String.valueOf(2));
        CobolDisplay.display("\"" + String.valueOf(line) + String.valueOf(4) + String.valueOf(col) + String.valueOf(3) + String.valueOf(_filler_006) + String.valueOf(size) + String.valueOf(8) + 0 + String.valueOf(line) + String.valueOf(5) + String.valueOf(col) + String.valueOf(3) + String.valueOf(_filler_007) + String.valueOf(size) + String.valueOf(8) + "abc" + String.valueOf(line) + String.valueOf(6) + String.valueOf(col) + String.valueOf(3) + String.valueOf(_filler_008) + String.valueOf(size) + String.valueOf(8));
        CobolDisplay.display("123456789" + String.valueOf(line) + String.valueOf(7) + String.valueOf(col) + String.valueOf(3));
        CobolDisplay.display(" " + String.valueOf(line) + String.valueOf(7) + String.valueOf(col) + String.valueOf(3) + String.valueOf(_filler_009) + String.valueOf(size) + String.valueOf(9));
        success_flag.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: LINE 8 , REQUIRED UPDATE */
        if ((!String.valueOf(success).trim().isEmpty() && cob_crt_status == 0)) {
            return;
        } else {
            return;
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunManualScreen040SizeWithFigurativeConstants().run();
    }
}
