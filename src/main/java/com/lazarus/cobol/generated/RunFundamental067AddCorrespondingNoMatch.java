package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental067AddCorrespondingNoMatch extends CobolProgram {
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
    private CobolString group_1 = new CobolString(1); // Group: GROUP-1
    private int field_a = 0;
    private int field_b = 0;
    private CobolString inner_group = new CobolString(1); // Group: INNER-GROUP
    private float field_c = 0.0f;
    private CobolString field_d = new CobolString(1);
    private CobolString group_2 = new CobolString(1); // Group: GROUP-2



    private void para_main() {
        group_1.set(new BigDecimal(String.valueOf(group_1).trim()).subtract(new BigDecimal(String.valueOf(group_2).trim())).toPlainString());
        if (field_a != 1) {
            CobolDisplay.display("BAD FIELD-A " + String.valueOf(field_a));
        }
        if (field_b != 2) {
            CobolDisplay.display("BAD FIELD-B " + String.valueOf(field_b));
        }
        if (field_c != 3) {
            CobolDisplay.display("BAD FIELD-C " + String.valueOf(field_c));
        }
        if (!String.valueOf(field_d).equals(String.valueOf("A"))) {
            CobolDisplay.display("BAD FIELD-D " + String.valueOf(field_d));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental067AddCorrespondingNoMatch().run();
    }
}
