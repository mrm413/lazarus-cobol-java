package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc045DisplayMessageBox extends CobolProgram {
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
    private CobolString my_text = new CobolString(10);
    private static final int mb_ok = 1;
    private static final int mb_yes_no = 2;
    private static final int mb_ok_cancel = 3;
    private static final int mb_yes_no_cancel = 4;
    private static final int mb_yes = 1;
    private static final int mb_no = 2;
    private static final int mb_cancel = 3;
    private static final int mb_default_icon = 1;
    private static final int mb_warning_icon = 2;
    private static final int mb_error_icon = 3;


    private CobolString message = new CobolString(256);
    private CobolString title = new CobolString(256);
    private CobolString type = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);
    private CobolString icon = new CobolString(256);
    private CobolString is = new CobolString(256);
    private CobolString box = new CobolString(256);
    private CobolString cb_default = new CobolString(256);
    private CobolString returning = new CobolString(256);
    private CobolString stop = new CobolString(256);

    private void para_main() {
        CobolDisplay.display(String.valueOf(message) + "Important" + String.valueOf(title) + "Very important" + String.valueOf(type) + String.valueOf(_unnamed) + String.valueOf(mb_ok) + String.valueOf(icon) + String.valueOf(is) + String.valueOf(mb_warning_icon));
        CobolDisplay.display(String.valueOf(message) + "This is" + " " + "my" + " " + String.valueOf(my_text));
        CobolDisplay.display(String.valueOf(message) + String.valueOf(box) + "More messages?" + String.valueOf(type) + String.valueOf(mb_yes_no) + String.valueOf(title) + String.valueOf(_unnamed) + "box title" + String.valueOf(cb_default) + String.valueOf(is) + String.valueOf(mb_yes) + String.valueOf(returning) + String.valueOf((return_code * Integer.parseInt(String.valueOf(stop).trim()))));
    }

    private void para_run() {
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc045DisplayMessageBox().run();
    }
}
