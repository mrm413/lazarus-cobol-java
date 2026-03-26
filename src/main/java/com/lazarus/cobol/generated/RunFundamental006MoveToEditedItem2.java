package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental006MoveToEditedItem2 extends CobolProgram {
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
    private BigDecimal src_1 = BigDecimal.ZERO;
    private BigDecimal src_2 = BigDecimal.ZERO;
    private BigDecimal src_3 = BigDecimal.ZERO;
    private BigDecimal src_4 = BigDecimal.ZERO;
    private BigDecimal src_5 = BigDecimal.ZERO;
    private int edt_1 = 0;
    private int edt_2 = 0;
    private CobolString edt_3 = new CobolString(5);
    private int edt_4 = 0;
    private int edt_5 = 0;



    private void para_main() {
        edt_1 = new BigDecimal(String.valueOf(src_1).trim()).intValue();
        edt_2 = new BigDecimal(String.valueOf(src_2).trim()).intValue();
        edt_3.set(String.valueOf(src_3));
        edt_4 = new BigDecimal(String.valueOf(src_4).trim()).intValue();
        edt_5 = new BigDecimal(String.valueOf(src_5).trim()).intValue();
        CobolDisplay.display(">" + String.valueOf(edt_1) + "<");
        CobolDisplay.display(">" + String.valueOf(edt_2) + "<");
        CobolDisplay.display(">" + String.valueOf(edt_3) + "<");
        CobolDisplay.display(">" + String.valueOf(edt_4) + "<");
        CobolDisplay.display(">" + String.valueOf(edt_5) + "<");
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental006MoveToEditedItem2().run();
    }
}
