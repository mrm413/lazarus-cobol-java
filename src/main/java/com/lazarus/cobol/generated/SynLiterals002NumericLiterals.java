package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynLiterals002NumericLiterals extends CobolProgram {
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
    private int counter = 0;



    // SECTION: 00000000000000000000000000000000000000000000000000000000000
    private void _00000000000000000000000000000000000000000000000000000000000() {
        _000000000000000000000000000000000000000000000000000000000000();
    }

    private void _000000000000000000000000000000000000000000000000000000000000() {
        counter = new BigDecimal(String.valueOf(counter + 1).trim()).intValue();
        if (counter == 1) {
            _00000000000000000000000000000000000000000000000000000000000();
        } else if (counter == 2) {
            _000000000000000000000000000000000000000000000000000000000000();
        } else if (counter == 3) {
            counter = new BigDecimal(String.valueOf(0).trim()).intValue();
        }
    }

    // SECTION: 100000000000000000000000000000000000000000000000000000000001
    private void _100000000000000000000000000000000000000000000000000000000001() {
        _20000000000000000000000000000000000000000000000000000000002();
    }

    private void _20000000000000000000000000000000000000000000000000000000002() {
        counter = new BigDecimal(String.valueOf(counter + 1).trim()).intValue();
        if (counter == 1) {
            _100000000000000000000000000000000000000000000000000000000001();
        } else if (counter == 2) {
            _20000000000000000000000000000000000000000000000000000000002();
        } else if (counter == 3) {
            counter = new BigDecimal(String.valueOf(0).trim()).intValue();
        }
        System.exit(0);
    }

    @Override
    public void run() {
        _000000000000000000000000000000000000000000000000000000000000();
    }

    public static void main(String[] args) {
        new SynLiterals002NumericLiterals().run();
    }
}
