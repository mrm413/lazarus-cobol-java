package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Moveothercases extends CobolProgram {
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
    }

    private void src_bin() {
    }

    private void dst_bin() {
        if (dst_bin != 12345678) {
            CobolDisplay.display("1: DST-BIN <" + String.valueOf(dst_bin) + ">!= <12345678>");
        }
    }

    private void src_edit() {
    }

    private void dst_disp() {
        if (!String.valueOf(src_edit).equals(String.valueOf("      $300-"))) {
            CobolDisplay.display("2: SRC-EDIT <" + String.valueOf(src_edit) + "> != <      $300->");
        }
        if (dst_disp != 3) {
            CobolDisplay.display("2.1: DST-DISP <" + String.valueOf(dst_disp) + "> != <3>");
        }
    }

    private void src_edit_2() {
    }

    private void dst_field_1() {
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
        new Moveothercases().run();
    }
}
