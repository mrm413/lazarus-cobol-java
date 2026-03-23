package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunManualScreen052InsertKey extends CobolProgram {
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


    private CobolString line = new CobolString(256);
    private CobolString column = new CobolString(256);
    private CobolString success = new CobolString(256);

    private void para_main() {
        CobolDisplay.display("Enter 'y' if multiple presses of the INSERT key" + String.valueOf(line) + String.valueOf(1) + String.valueOf(column) + String.valueOf(1));
        CobolDisplay.display("go back and forth between" + String.valueOf(line) + String.valueOf(2) + String.valueOf(column) + String.valueOf(1));
        CobolDisplay.display("Insert Mode ON (characters move to the right)" + String.valueOf(line) + String.valueOf(3) + String.valueOf(column) + String.valueOf(1));
        CobolDisplay.display("and Insert Mode OFF (characters type over)." + String.valueOf(line) + String.valueOf(4) + String.valueOf(column) + String.valueOf(1));
    }

    private void ws_x_20() {
        ws_x_20.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: LINE 6 COLUMN 1 WITH AUTO-SKIP */
    }

    private void update() {
        success_flag.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: LINE 8 COLUMN 1 WITH */
    }

    private void update_2() {
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
        new RunManualScreen052InsertKey().run();
    }
}
