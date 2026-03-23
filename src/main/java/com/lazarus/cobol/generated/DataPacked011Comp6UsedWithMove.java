package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataPacked011Comp6UsedWithMove extends CobolProgram {
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
    private BigDecimal x_999 = BigDecimal.ZERO;
    private int b_99 = 0;
    private int b_999 = 0;



    private void para_main() {
        b_99 = new BigDecimal(String.valueOf(0).trim()).intValue();
        x_99 = new BigDecimal(String.valueOf(b_99).trim());
        if (x_99.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("00 <" + String.valueOf(x_99) + ">");
        }
        b_99 = new BigDecimal(String.valueOf(99).trim()).intValue();
        x_99 = new BigDecimal(String.valueOf(b_99).trim());
        if (x_99.compareTo(new BigDecimal(String.valueOf(99).trim())) != 0) {
            CobolDisplay.display("99 <" + String.valueOf(x_99) + ">");
        }
        b_999 = new BigDecimal(String.valueOf(0).trim()).intValue();
        x_999 = new BigDecimal(String.valueOf(b_999).trim());
        if (x_999.compareTo(new BigDecimal(String.valueOf(0).trim())) != 0) {
            CobolDisplay.display("000 <" + String.valueOf(x_999) + ">");
        }
        b_999 = new BigDecimal(String.valueOf(123).trim()).intValue();
        x_999 = new BigDecimal(String.valueOf(b_999).trim());
        if (x_999.compareTo(new BigDecimal(String.valueOf(123).trim())) != 0) {
            CobolDisplay.display("123 <" + String.valueOf(x_999) + ">");
        }
        x_99 = new BigDecimal(String.valueOf(b_999).trim());
        if (x_99.compareTo(new BigDecimal(String.valueOf(23).trim())) != 0) {
            CobolDisplay.display("23 <" + String.valueOf(x_99) + ">");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataPacked011Comp6UsedWithMove().run();
    }
}
