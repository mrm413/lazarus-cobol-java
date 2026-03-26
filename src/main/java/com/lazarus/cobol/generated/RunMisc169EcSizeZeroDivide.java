package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc169EcSizeZeroDivide extends CobolProgram {
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
    private int x = 0;
    private int y = 0;


    private CobolString last = new CobolString(256); // fallback
    private CobolString off = new CobolString(256); // fallback
    private CobolString exception = new CobolString(256); // fallback

    private void para_main() {
        y = new BigDecimal(String.valueOf(x / y).trim()).intValue();
        if (!String.valueOf(CobolIntrinsics.trim(CobolIntrinsics.exception_status())).equals(String.valueOf("EC-SIZE-ZERO-DIVIDE"))) {
            CobolDisplay.display("Wrong/missing exception: " + String.valueOf(CobolIntrinsics.exception_status()));
        }
        last.set(String.valueOf(off));
        exception.set(String.valueOf(off));
        if (!String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf(" "))) {
            CobolDisplay.display("Exception is not empty after reset: " + String.valueOf(CobolIntrinsics.exception_status()));
        }
        y = new BigDecimal(String.valueOf(0).trim()).intValue();
        y = new BigDecimal(String.valueOf(((x - (1 / y)) + 6.5)).trim()).intValue();
        if (!String.valueOf(CobolIntrinsics.trim(CobolIntrinsics.exception_status())).equals(String.valueOf("EC-SIZE-ZERO-DIVIDE"))) {
            CobolDisplay.display("Wrong/missing exception: " + String.valueOf(CobolIntrinsics.exception_status()));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc169EcSizeZeroDivide().run();
    }
}
