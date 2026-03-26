package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc030NonNumericDataInNumericItems extends CobolProgram {
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
    private CobolString x = new CobolString(1); // Group: X
    private int x_num = 0;
    private int num = 0;


    private CobolString goback = new CobolString(256); // fallback

    private void para_main() {
        x.setRefMod(2, 2, String.valueOf("0000"));
        if (CobolIntrinsics.isNumeric(x_num)) {
            CobolDisplay.display("low-value is numeric");
        }
        x.setRefMod(3, 1, String.valueOf("01"));
        if (CobolIntrinsics.isNumeric(x_num)) {
            CobolDisplay.display("SOH is numeric");
        }
        num = new BigDecimal(String.valueOf(x_num).trim()).intValue();
        CobolDisplay.display(String.valueOf((0 /* non-numeric literal: test over */ * Integer.parseInt(String.valueOf(goback).trim()))));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc030NonNumericDataInNumericItems().run();
    }
}
