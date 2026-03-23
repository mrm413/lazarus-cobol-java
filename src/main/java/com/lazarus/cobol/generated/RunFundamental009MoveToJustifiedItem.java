package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental009MoveToJustifiedItem extends CobolProgram {
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
    private int src_1 = 0;
    private short src_2 = (short) 0;
    private short src_3 = (short) 0;
    private int src_4 = 0;
    private int src_5 = 0;
    private CobolString edt_fld = new CobolString(7);



    private void para_main() {
    }

    private void edt_fld() {
        CobolDisplay.display(">" + String.valueOf(edt_fld) + "<");
    }

    private void edt_fld_2() {
        CobolDisplay.display(">" + String.valueOf(edt_fld) + "<");
    }

    private void edt_fld_3() {
        CobolDisplay.display(">" + String.valueOf(edt_fld) + "<");
    }

    private void edt_fld_4() {
        CobolDisplay.display(">" + String.valueOf(edt_fld) + "<");
    }

    private void edt_fld_5() {
        CobolDisplay.display(">" + String.valueOf(edt_fld) + "<");
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental009MoveToJustifiedItem().run();
    }
}
