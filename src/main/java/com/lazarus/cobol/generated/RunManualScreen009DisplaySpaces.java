package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunManualScreen009DisplaySpaces extends CobolProgram {
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


    private CobolString scr_1 = new CobolString(256);
    private CobolString at = new CobolString(256);
    private CobolString line = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);
    private CobolString col = new CobolString(256);
    private CobolString highlight = new CobolString(256);
    private CobolString success_field = new CobolString(256);
    private CobolString success = new CobolString(256);

    private void para_main() {
        CobolDisplay.display(String.valueOf(scr_1));
        CobolDisplay.display(" " + String.valueOf(at) + String.valueOf(line) + String.valueOf(6) + String.valueOf(_unnamed) + String.valueOf(col) + String.valueOf(8) + "foo" + String.valueOf(highlight));
        success_field.set(String.valueOf(CobolDisplay.accept()));
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
        new RunManualScreen009DisplaySpaces().run();
    }
}
