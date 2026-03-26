package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunManualScreen056AltLeftArrowKey extends CobolProgram {
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
    private CobolString ws_x_20 = new CobolString(20);


    private CobolString line = new CobolString(256); // fallback
    private CobolString column = new CobolString(256); // fallback
    private CobolString success = new CobolString(256); // fallback

    private void para_main() {
        CobolDisplay.display("Enter 'y' if pressing the ALT and LEFT-ARROW keys" + String.valueOf(line) + String.valueOf(1) + String.valueOf(column) + String.valueOf(1));
        CobolDisplay.display("at the first column does not exit the field." + String.valueOf(line) + String.valueOf(2) + String.valueOf(column) + String.valueOf(1));
        CobolDisplay.display("But the LEFT-ARROW without ALT does exit." + String.valueOf(line) + String.valueOf(3) + String.valueOf(column) + String.valueOf(1));
        ws_x_20.set(String.valueOf("ABCD      "));
        ws_x_20.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: LINE 5 COLUMN 1 WITH AUTO-SKIP */
        success_flag.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: LINE 7 COLUMN 1 WITH UPDATE */
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
        new RunManualScreen056AltLeftArrowKey().run();
    }
}
