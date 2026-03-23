package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demounstring extends CobolProgram {
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
    private CobolString full_name = new CobolString(40);
    private int sub1 = 0;


    private CobolString[] length = new CobolString[100];

    private CobolString sub2 = new CobolString(256); // autofix
    private void para_main() {
        sub1 = new BigDecimal(String.valueOf(1).trim()).intValue();
        for (int _i0 = 0; _i0 < Integer.parseInt(String.valueOf(length[Integer.parseInt(String.valueOf(full_name).trim()) - 1]).trim()); _i0++) {
    // if (String.valueOf(CobolString.refMod(full_name, sub2, 1)).equals(String.valueOf(" "))) {
    // if (String.valueOf(CobolString.refMod(full_name, (sub2 + 1), 1)).equals(String.valueOf(" "))) {
    // CobolDisplay.display("IN");
    // continue;
    // }
    // }
            sub1 = new BigDecimal(String.valueOf(sub1 + 1).trim()).intValue();
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Demounstring().run();
    }
}
