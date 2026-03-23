package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunManualScreen043SpecialNamesCursorPhrase6DigitWithField extends CobolProgram {
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
    private int cur_pos = 0;
    private CobolString success_flag = new CobolString(1);
    private CobolString ws_x_20 = new CobolString(20);


    private CobolString environment = new CobolString(256);
    private CobolString cob_screen_exceptions = new CobolString(256);
    private CobolString cob_screen_esc = new CobolString(256);
    private CobolString line = new CobolString(256);
    private CobolString column = new CobolString(256);

    private void testme() {
        environment.set(String.valueOf("TRUE"));
        cob_screen_exceptions.set(String.valueOf("TRUE"));
        environment.set(String.valueOf("TRUE"));
        cob_screen_esc.set(String.valueOf("TRUE"));
        CobolDisplay.display("If the cursor below is positioned at the 'C'" + String.valueOf(line) + String.valueOf(1) + String.valueOf(column) + String.valueOf(1));
        CobolDisplay.display("(third column) below, then position it at the" + String.valueOf(line) + String.valueOf(2) + String.valueOf(column) + String.valueOf(1));
        CobolDisplay.display("'E' (fifth column) and press ENTER." + String.valueOf(line) + String.valueOf(3) + String.valueOf(column) + String.valueOf(1));
    }

    private void ws_x_20() {
    }

    private void cur_pos() {
        ws_x_20.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: LINE 5 COLUMN 1 WITH AUTO-SKIP */
    }

    private void update() {
        if ((cur_pos == 5005 && cob_crt_status == 0)) {
            return;
        } else {
            return;
        }
    }

    @Override
    public void run() {
        testme();
    }

    public static void main(String[] args) {
        new RunManualScreen043SpecialNamesCursorPhrase6DigitWithField().run();
    }
}
