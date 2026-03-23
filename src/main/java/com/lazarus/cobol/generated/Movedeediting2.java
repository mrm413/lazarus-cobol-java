package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Movedeediting2 extends CobolProgram {
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
    private CobolString edit_1 = new CobolString(5);
    private BigDecimal disp_1 = BigDecimal.ZERO;
    private CobolString edit_2 = new CobolString(1);
    private BigDecimal disp_2 = BigDecimal.ZERO;


    private CobolString _unnamed = new CobolString(256);
    private CobolString _45 = new CobolString(256);
    private CobolString to = new CobolString(256);
    private CobolString _9876 = new CobolString(256);

    private void para_main() {
        _unnamed.set(String.valueOf(-123));
        _45.set(String.valueOf(-123));
        to.set(String.valueOf(-123));
    }

    private void edit_1() {
    }

    private void disp_1() {
        if (disp_1.compareTo(new BigDecimal(String.valueOf(-123).trim())) != 0) {
            /* RAW: , 45 THEN */
            CobolDisplay.display("Error 1: DISP-1 <" + String.valueOf(disp_1) + "> != -0123,45");
        }
        if (!String.valueOf(edit_1).equals(String.valueOf(" $123,45CR"))) {
            CobolDisplay.display("Error 2: EDIT-1 <" + String.valueOf(edit_1) + "> != < $123,45CR>");
        }
        _unnamed.set(String.valueOf(-42));
        _9876.set(String.valueOf(-42));
        to.set(String.valueOf(-42));
    }

    private void edit_2() {
    }

    private void disp_2() {
        if (disp_2.compareTo(new BigDecimal(String.valueOf(-42).trim())) != 0) {
            /* RAW: , 987600 THEN */
            CobolDisplay.display("Error 3: DISP-2 <" + String.valueOf(disp_2) + "> != <-42,987600>");
        }
        if (!String.valueOf(edit_2).equals(String.valueOf("-42 ,98 76/00"))) {
            CobolDisplay.display("Error 4: EDIT-2 <" + String.valueOf(edit_2) + "> != <-42 ,98 76/00>");
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Movedeediting2().run();
    }
}
