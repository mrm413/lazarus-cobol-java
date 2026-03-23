package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked000PackedDecimalUsedWithDisplay extends CobolProgram {
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
    private BigDecimal x_99 = BigDecimal.ZERO;
    private BigDecimal x_s99 = BigDecimal.ZERO;
    private BigDecimal x_999 = BigDecimal.ZERO;
    private BigDecimal x_s999 = BigDecimal.ZERO;
    private int b_p1234 = 0;
    private int b_n1234 = 0;



    private void para_main() {
        x_99 = new BigDecimal(String.valueOf(0).trim());
        CobolDisplay.display();
    }

    private void x_99() {
        x_99 = new BigDecimal(String.valueOf(99).trim());
        CobolDisplay.display();
    }

    private void x_99_2() {
        x_s99 = new BigDecimal(String.valueOf(0).trim());
        CobolDisplay.display();
    }

    private void x_s99() {
        x_s99 = new BigDecimal(String.valueOf(-1).trim());
        CobolDisplay.display();
    }

    private void x_s99_2() {
        x_999 = new BigDecimal(String.valueOf(0).trim());
        CobolDisplay.display();
    }

    private void x_999() {
        x_999 = new BigDecimal(String.valueOf(123).trim());
        CobolDisplay.display();
    }

    private void x_999_2() {
        x_s999 = new BigDecimal(String.valueOf(0).trim());
        CobolDisplay.display();
    }

    private void x_s999() {
        x_s999 = new BigDecimal(String.valueOf(-123).trim());
        CobolDisplay.display();
    }

    private void x_s999_2() {
        x_s999 = new BigDecimal(String.valueOf(b_p1234).trim());
        CobolDisplay.display();
    }

    private void x_s999_3() {
        x_s999 = new BigDecimal(String.valueOf(b_n1234).trim());
        CobolDisplay.display();
    }

    private void x_s999_4() {
        x_999 = new BigDecimal(String.valueOf(b_n1234).trim());
        CobolDisplay.display();
    }

    private void x_999_3() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked000PackedDecimalUsedWithDisplay().run();
    }
}
