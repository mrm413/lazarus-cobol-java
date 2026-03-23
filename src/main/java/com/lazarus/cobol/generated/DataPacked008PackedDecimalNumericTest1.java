package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked008PackedDecimalNumericTest1 extends CobolProgram {
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
    private BigDecimal n_2 = BigDecimal.ZERO;
    private BigDecimal n_s2 = BigDecimal.ZERO;



    private void para_main() {
    }

    private void x_2() {
        if (CobolIntrinsics.isNumeric(n_2)) {
            CobolDisplay.display(" 0000 NG");
        }
        if (CobolIntrinsics.isNumeric(n_s2)) {
            CobolDisplay.display("S0000 NG");
        }
    }

    private void x_2_2() {
        if (CobolIntrinsics.isNumeric(n_2)) {
            CobolDisplay.display(" 000c NG");
        }
        if (!CobolIntrinsics.isNumeric(n_s2)) {
            CobolDisplay.display("S000c NG");
        }
    }

    private void x_2_3() {
        if (CobolIntrinsics.isNumeric(n_2)) {
            CobolDisplay.display(" 000d NG");
        }
        if (!CobolIntrinsics.isNumeric(n_s2)) {
            CobolDisplay.display("S000d NG");
        }
    }

    private void x_2_4() {
        if (!CobolIntrinsics.isNumeric(n_2)) {
            CobolDisplay.display(" 000f NG");
        }
        if (CobolIntrinsics.isNumeric(n_s2)) {
            CobolDisplay.display("S000f NG");
        }
    }

    private void x_2_5() {
        if (CobolIntrinsics.isNumeric(n_2)) {
            CobolDisplay.display(" 1234 NG");
        }
        if (CobolIntrinsics.isNumeric(n_s2)) {
            CobolDisplay.display("S1234 NG");
        }
    }

    private void x_2_6() {
        if (!CobolIntrinsics.isNumeric(n_2)) {
            CobolDisplay.display(" 999f NG");
        }
        if (CobolIntrinsics.isNumeric(n_s2)) {
            CobolDisplay.display("S999f NG");
        }
    }

    private void x_2_7() {
        if (CobolIntrinsics.isNumeric(n_2)) {
            CobolDisplay.display(" ffff NG");
        }
        if (CobolIntrinsics.isNumeric(n_s2)) {
            CobolDisplay.display("Sffff NG");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked008PackedDecimalNumericTest1().run();
    }
}
