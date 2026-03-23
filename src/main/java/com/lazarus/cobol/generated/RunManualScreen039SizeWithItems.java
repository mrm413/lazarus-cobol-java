package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunManualScreen039SizeWithItems extends CobolProgram {
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
    private int num_1 = 0;
    private CobolString num_2 = new CobolString(10);
    private int num_3 = 0;
    private int four = 0;


    private CobolString _unnamed = new CobolString(256);
    private CobolString line = new CobolString(256);
    private CobolString col = new CobolString(256);
    private CobolString size = new CobolString(256);
    private CobolString success = new CobolString(256);

    private void para_main() {
        CobolDisplay.display("Enter \"y\" if you see exactly four rows of 1234, all" + String.valueOf(_unnamed) + " aligned." + String.valueOf(line) + String.valueOf(1));
        CobolDisplay.display(String.valueOf(num_1) + String.valueOf(line) + String.valueOf(3) + String.valueOf(col) + String.valueOf(3) + String.valueOf(_unnamed) + String.valueOf(size) + String.valueOf(4) + String.valueOf(num_2) + String.valueOf(line) + String.valueOf(4) + String.valueOf(col) + String.valueOf(3) + String.valueOf(_unnamed) + String.valueOf(size) + String.valueOf(four) + String.valueOf(num_3) + String.valueOf(line) + String.valueOf(5) + String.valueOf(col) + String.valueOf(3) + String.valueOf(_unnamed) + String.valueOf(size) + String.valueOf(8) + "1234" + String.valueOf(line) + String.valueOf(6) + String.valueOf(col) + String.valueOf(3) + String.valueOf(_unnamed) + String.valueOf(size) + 0);
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
        new RunManualScreen039SizeWithItems().run();
    }
}
