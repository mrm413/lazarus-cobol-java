package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMove008MoveNationalToX extends CobolProgram {
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
    private CobolString x = new CobolString(2);
    private CobolString y_a = new CobolString(1);
    private CobolString y_x = new CobolString(1);
    private CobolString y_bx = new CobolString(2);
    private CobolString y_n = new CobolString(2);
    private CobolString y_0n = new CobolString(1);
    private int y_9 = 0;
    private CobolString y_09 = new CobolString(2);



    private void para_main() {
        y_a.set(String.valueOf(x));
        y_x.set(String.valueOf(x));
        y_bx.set(String.valueOf(x));
        y_n.set(String.valueOf(x));
        y_0n.set(String.valueOf(x));
        y_9 = new BigDecimal(String.valueOf(x).trim()).intValue();
        y_09.set(String.valueOf(x));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMove008MoveNationalToX().run();
    }
}
