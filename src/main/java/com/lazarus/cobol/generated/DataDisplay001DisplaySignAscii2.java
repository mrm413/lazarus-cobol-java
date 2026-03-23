package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataDisplay001DisplaySignAscii2 extends CobolProgram {
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
    private CobolString x = new CobolString(10);
    private int x_s99 = 0;
    private int[] x_s9 = new int[10];



    private void para_main() {
        x_s9[1 - 1] = new BigDecimal(String.valueOf(0).trim()).intValue();
        x_s9[2 - 1] = new BigDecimal(String.valueOf(1).trim()).intValue();
        x_s9[3 - 1] = new BigDecimal(String.valueOf(2).trim()).intValue();
        x_s9[4 - 1] = new BigDecimal(String.valueOf(3).trim()).intValue();
        x_s9[5 - 1] = new BigDecimal(String.valueOf(4).trim()).intValue();
        x_s9[6 - 1] = new BigDecimal(String.valueOf(5).trim()).intValue();
        x_s9[7 - 1] = new BigDecimal(String.valueOf(6).trim()).intValue();
        x_s9[8 - 1] = new BigDecimal(String.valueOf(7).trim()).intValue();
        x_s9[9 - 1] = new BigDecimal(String.valueOf(8).trim()).intValue();
        x_s9[10 - 1] = new BigDecimal(String.valueOf(9).trim()).intValue();
        CobolDisplay.displayNoAdvancing(String.valueOf(x));
    }

    private void x_s99() {
        x.setRefMod(1, 1, String.valueOf(CobolString.refMod(x, 2, 1)));
        x_s9[2 - 1] = new BigDecimal(String.valueOf(-1).trim()).intValue();
        x_s9[3 - 1] = new BigDecimal(String.valueOf(-2).trim()).intValue();
        x_s9[4 - 1] = new BigDecimal(String.valueOf(-3).trim()).intValue();
        x_s9[5 - 1] = new BigDecimal(String.valueOf(-4).trim()).intValue();
        x_s9[6 - 1] = new BigDecimal(String.valueOf(-5).trim()).intValue();
        x_s9[7 - 1] = new BigDecimal(String.valueOf(-6).trim()).intValue();
        x_s9[8 - 1] = new BigDecimal(String.valueOf(-7).trim()).intValue();
        x_s9[9 - 1] = new BigDecimal(String.valueOf(-8).trim()).intValue();
        x_s9[10 - 1] = new BigDecimal(String.valueOf(-9).trim()).intValue();
        CobolDisplay.displayNoAdvancing(String.valueOf(x));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataDisplay001DisplaySignAscii2().run();
    }
}
