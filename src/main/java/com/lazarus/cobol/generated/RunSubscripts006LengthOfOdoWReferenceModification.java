package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunSubscripts006LengthOfOdoWReferenceModification extends CobolProgram {
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
    private CobolString pline = new CobolString(1); // Group: PLINE
    private short pline_len = (short) 0;
    private CobolString pline_text = new CobolString(1); // Group: PLINE-TEXT
    private CobolString[] filler_1 = new CobolString[80];



    // SECTION: a-main
    private void a_main() {
        move();
    }

    private void move() {
        /* RAW: 5 TO PLINE-LEN */
        pline_text.set(String.valueOf("the first part in"));
        pline_len = new BigDecimal(String.valueOf(30).trim()).shortValue();
        if (!String.valueOf(pline_text).equals(String.valueOf("the f"))) {
            CobolDisplay.display("text1 wrong: " + String.valueOf(pline_text));
        }
        pline_text.set(String.valueOf("the first part in"));
        pline_len = new BigDecimal(String.valueOf(4).trim()).shortValue();
        pline_text.set(String.valueOf("second"));
        pline_len = new BigDecimal(String.valueOf(14).trim()).shortValue();
        if (!String.valueOf(pline_text).equals(String.valueOf("secofirst part"))) {
            CobolDisplay.display("text2 wrong: " + String.valueOf(pline_text));
        }
        pline_len = new BigDecimal(String.valueOf(80).trim()).shortValue();
        pline_text.set(String.valueOf(" "));
        pline_len = new BigDecimal(String.valueOf(5).trim()).shortValue();
        pline_text.setRefMod(2, String.valueOf("the first part in"));
        pline_len = new BigDecimal(String.valueOf(30).trim()).shortValue();
        if (!String.valueOf(pline_text).equals(String.valueOf(" the "))) {
            CobolDisplay.display("text3 wrong: " + String.valueOf(pline_text));
        }
        pline_text.setRefMod(2, String.valueOf("the first part in"));
        pline_len = new BigDecimal(String.valueOf(4).trim()).shortValue();
        pline_text.setRefMod(2, String.valueOf("second"));
        pline_len = new BigDecimal(String.valueOf(14).trim()).shortValue();
        if (!String.valueOf(pline_text).equals(String.valueOf(" sec first par"))) {
            CobolDisplay.display("text4 wrong: " + String.valueOf(pline_text));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        move();
    }

    public static void main(String[] args) {
        new RunSubscripts006LengthOfOdoWReferenceModification().run();
    }
}
