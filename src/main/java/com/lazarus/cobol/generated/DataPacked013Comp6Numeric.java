package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked013Comp6Numeric extends CobolProgram {
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
    private CobolString g = new CobolString(1); // Group: G
    private CobolString x_2 = new CobolString(2);
    private BigDecimal n_3 = BigDecimal.ZERO;
    private BigDecimal n_4 = BigDecimal.ZERO;



    private void para_main() {
        x_2.set(String.valueOf("0000"));
        if (!CobolIntrinsics.isNumeric(n_3)) {
            CobolDisplay.display("3 0000 NG");
        }
        if (!CobolIntrinsics.isNumeric(n_4)) {
            CobolDisplay.display("4 0000 NG");
        }
        x_2.set(String.valueOf("000c"));
        if (CobolIntrinsics.isNumeric(n_3)) {
            CobolDisplay.display("3 000c NG");
        }
        if (CobolIntrinsics.isNumeric(n_4)) {
            CobolDisplay.display("4 000c NG");
        }
        x_2.set(String.valueOf("1234"));
        if (!CobolIntrinsics.isNumeric(n_3)) {
            CobolDisplay.display("3 1234 NG");
        }
        if (!CobolIntrinsics.isNumeric(n_4)) {
            CobolDisplay.display("4 1234 NG");
        }
        x_2.set(String.valueOf("ffff"));
        if (CobolIntrinsics.isNumeric(n_3)) {
            CobolDisplay.display("3 ffff NG");
        }
        if (CobolIntrinsics.isNumeric(n_4)) {
            CobolDisplay.display("4 ffff NG");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked013Comp6Numeric().run();
    }
}
