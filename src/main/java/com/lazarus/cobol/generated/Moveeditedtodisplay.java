package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Moveeditedtodisplay extends CobolProgram {
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
    private CobolString edited_field = new CobolString(1); // Group: EDITED-FIELD
    private CobolString src_field_100 = new CobolString(1);
    private CobolString src_field_101 = new CobolString(1);
    private CobolString src_field_102 = new CobolString(13);
    private CobolString src_field_103 = new CobolString(14);
    private CobolString src_field_400 = new CobolString(1);
    private CobolString src_field_401 = new CobolString(1);
    private CobolString src_field_402 = new CobolString(13);
    private CobolString src_field_403 = new CobolString(14);


    private CobolString dst_field_1 = new CobolString(256);
    private CobolString dst_field_2 = new CobolString(256);

    private void para_main() {
    }

    private void src_field_100() {
    }

    private void dst_field_1() {
        if (!String.valueOf(dst_field_1).equals(String.valueOf(1234005))) {
            CobolDisplay.display("1: DST-FIELD-1 <" + String.valueOf(dst_field_1) + "> != 1234005");
        }
    }

    private void src_field_101() {
    }

    private void dst_field_1_2() {
        if (!String.valueOf(dst_field_1).equals(String.valueOf(2345006))) {
            CobolDisplay.display("2: DST-FIELD-1 <" + String.valueOf(dst_field_1) + "> != 2345006");
        }
    }

    private void src_field_102() {
    }

    private void dst_field_1_3() {
        if (!String.valueOf(dst_field_1).equals(String.valueOf(3456007))) {
            CobolDisplay.display("3: DST-FIELD-1 <" + String.valueOf(dst_field_1) + "> != 3456007");
        }
    }

    private void src_field_103() {
    }

    private void dst_field_1_4() {
        if (!String.valueOf(dst_field_1).equals(String.valueOf(4567008))) {
            CobolDisplay.display("4: DST-FIELD-1 <" + String.valueOf(dst_field_1) + "> != 4567008");
        }
    }

    private void src_field_100_2() {
    }

    private void dst_field_2() {
        if (!String.valueOf(dst_field_2).equals(String.valueOf(1234005))) {
            CobolDisplay.display("5: DST-FIELD-2 <" + String.valueOf(dst_field_2) + "> != 1234005");
        }
    }

    private void src_field_101_2() {
    }

    private void dst_field_2_2() {
        if (!String.valueOf(dst_field_2).equals(String.valueOf(-2345006))) {
            CobolDisplay.display("6: DST-FIELD-2 <" + String.valueOf(dst_field_2) + "> != -2345006");
        }
    }

    private void src_field_102_2() {
    }

    private void dst_field_2_3() {
        if (!String.valueOf(dst_field_2).equals(String.valueOf(-3456007))) {
            CobolDisplay.display("7: DST-FIELD-2 <" + String.valueOf(dst_field_2) + "> != -3456007");
        }
    }

    private void src_field_103_2() {
    }

    private void dst_field_2_4() {
        if (!String.valueOf(dst_field_2).equals(String.valueOf(4567008))) {
            CobolDisplay.display("8: DST-FIELD-2 <" + String.valueOf(dst_field_2) + "> != 45676008");
        }
    }

    private void src_field_400() {
    }

    private void dst_field_1_5() {
        if (!String.valueOf(dst_field_1).equals(String.valueOf(1234005))) {
            CobolDisplay.display("9: DST-FIELD-1 <" + String.valueOf(dst_field_1) + "> != 1234005");
        }
    }

    private void src_field_401() {
    }

    private void dst_field_1_6() {
        if (!String.valueOf(dst_field_1).equals(String.valueOf(2345006))) {
            CobolDisplay.display("10: DST-FIELD-1 <" + String.valueOf(dst_field_1) + "> != 2345006");
        }
    }

    private void src_field_402() {
    }

    private void dst_field_1_7() {
        if (!String.valueOf(dst_field_1).equals(String.valueOf(3456007))) {
            CobolDisplay.display("11: DST-FIELD-1 <" + String.valueOf(dst_field_1) + "> != 3456007");
        }
    }

    private void src_field_403() {
    }

    private void dst_field_1_8() {
        if (!String.valueOf(dst_field_1).equals(String.valueOf(4567008))) {
            CobolDisplay.display("12: DST-FIELD-1 <" + String.valueOf(dst_field_1) + "1 != 45676008");
        }
    }

    private void src_field_400_2() {
    }

    private void dst_field_2_5() {
        if (!String.valueOf(dst_field_2).equals(String.valueOf(1234005))) {
            CobolDisplay.display("13: DST-FIELD-2 <" + String.valueOf(dst_field_2) + "> != 1234005");
        }
    }

    private void src_field_401_2() {
    }

    private void dst_field_2_6() {
        if (!String.valueOf(dst_field_2).equals(String.valueOf(-2345006))) {
            CobolDisplay.display("14: DST-FIELD-2 <" + String.valueOf(dst_field_2) + "> != -2345006");
        }
    }

    private void src_field_402_2() {
    }

    private void dst_field_2_7() {
        if (!String.valueOf(dst_field_2).equals(String.valueOf(-3456007))) {
            CobolDisplay.display("15: DST-FIELD-2 <" + String.valueOf(dst_field_2) + "> != -3456007");
        }
    }

    private void src_field_403_2() {
    }

    private void dst_field_2_8() {
        if (!String.valueOf(dst_field_2).equals(String.valueOf(4567008))) {
            CobolDisplay.display("16: DST-FIELD-2 <" + String.valueOf(dst_field_2) + "> != 4567008");
        }
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Moveeditedtodisplay().run();
    }
}
