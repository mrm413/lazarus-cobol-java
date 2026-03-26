package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental109MoveMiscEdited extends CobolProgram {
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
    private int src_bin = 0;
    private short dst_bin = (short) 0;
    private CobolString src_edit = new CobolString(11);
    private int dst_disp = 0;
    private CobolString dst_field_1 = new CobolString(9);



    private void para_main() {
        src_bin = new BigDecimal(String.valueOf(-12345678).trim()).intValue();
        dst_bin = new BigDecimal(String.valueOf(src_bin).trim()).shortValue();
        if (dst_bin != 12345678) {
            CobolDisplay.display("1: DST-BIN <" + String.valueOf(dst_bin) + ">!= <12345678>");
        }
        src_edit.set(String.valueOf(-3));
        dst_disp = new BigDecimal(String.valueOf(src_edit).trim()).intValue();
        if (!String.valueOf(src_edit).equals(String.valueOf("      $300-"))) {
            CobolDisplay.display("2: SRC-EDIT <" + String.valueOf(src_edit) + "> != <      $300->");
        }
        if (dst_disp != 3) {
            CobolDisplay.display("2.1: DST-DISP <" + String.valueOf(dst_disp) + "> != <3>");
        }
        src_edit.set(String.valueOf(3));
        dst_field_1.set(String.valueOf(src_edit));
        if (!String.valueOf(dst_field_1).equals(String.valueOf("  0  0  /"))) {
            CobolDisplay.display("3: DST-FIELD-1 <" + String.valueOf(dst_field_1) + "> != <  0  0  />");
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental109MoveMiscEdited().run();
    }
}
