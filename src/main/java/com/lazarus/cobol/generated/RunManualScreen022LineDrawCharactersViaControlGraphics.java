package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunManualScreen022LineDrawCharactersViaControlGraphics extends CobolProgram {
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
    private CobolString success_flag = new CobolString(1);
    private short lin_start = (short) 0;
    private short lin = (short) 0;
    private CobolString scr1 = new CobolString(75);
    private CobolString scr2 = new CobolString(75);
    private CobolString graphcontrol = new CobolString(50);


    private CobolString at = new CobolString(256); // fallback
    private CobolString line = new CobolString(256); // fallback
    private CobolString col = new CobolString(256); // fallback
    private CobolString success = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString control = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_009 = new CobolString(256); // fallback
    private CobolString _filler_010 = new CobolString(256); // fallback
    private CobolString _filler_011 = new CobolString(256); // fallback
    private void testme() {
        lin = new BigDecimal(String.valueOf(2).trim()).shortValue();
        CobolDisplay.display(String.valueOf(scr1) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(2));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        CobolDisplay.display(String.valueOf(scr2) + String.valueOf(at) + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(2));
        lin_start = new BigDecimal(String.valueOf(5).trim()).shortValue();
        dspcol();
        lin_start = new BigDecimal(String.valueOf(12).trim()).shortValue();
        graphcontrol.set(String.valueOf("LOW BLINK FCOLOR=MAGENTA GRAPHICS"));
        dspcol();
        success_flag.set(String.valueOf(CobolDisplay.accept()));
        /* RAW: AT 1801 UPDATE REQUIRED */
        if ((!String.valueOf(success).trim().isEmpty() && cob_crt_status == 0)) {
            return;
        } else {
            return;
        }
    }

    private void dspcol() {
        lin = new BigDecimal(String.valueOf(lin_start).trim()).shortValue();
        CobolDisplay.display("lqqqqwqqqqk" + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(5) + String.valueOf(_filler_002) + String.valueOf(control) + String.valueOf(graphcontrol));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        CobolDisplay.display("x    x    x" + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(5) + String.valueOf(_filler_003) + String.valueOf(control) + String.valueOf(graphcontrol));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        CobolDisplay.display("tqqqqnqqqqu" + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(5) + String.valueOf(_filler_004) + String.valueOf(control) + String.valueOf(graphcontrol));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        CobolDisplay.display("x    x    x" + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(5) + String.valueOf(_filler_005) + String.valueOf(control) + String.valueOf(graphcontrol));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        CobolDisplay.display("mqqqqvqqqqj" + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(5) + String.valueOf(_filler_006) + String.valueOf(control) + String.valueOf(graphcontrol));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        lin = new BigDecimal(String.valueOf(lin_start).trim()).shortValue();
        CobolDisplay.display("LQQQQWQQQQK" + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(20) + String.valueOf(_filler_007) + String.valueOf(control) + String.valueOf(graphcontrol));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        CobolDisplay.display("X    X    X" + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(20) + String.valueOf(_filler_008) + String.valueOf(control) + String.valueOf(graphcontrol));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        CobolDisplay.display("TQQQQNQQQQU" + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(20) + String.valueOf(_filler_009) + String.valueOf(control) + String.valueOf(graphcontrol));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        CobolDisplay.display("X    X    X" + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(20) + String.valueOf(_filler_010) + String.valueOf(control) + String.valueOf(graphcontrol));
        lin = new BigDecimal(String.valueOf(lin + 1).trim()).shortValue();
        CobolDisplay.display("MQQQQVQQQQJ" + String.valueOf(line) + String.valueOf(lin) + String.valueOf(col) + String.valueOf(20) + String.valueOf(_filler_011) + String.valueOf(control) + String.valueOf(graphcontrol));
    }

    @Override
    public void run() {
        testme();
    }

    public static void main(String[] args) {
        new RunManualScreen022LineDrawCharactersViaControlGraphics().run();
    }
}
