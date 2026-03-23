package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc132ConditionalDirectivesWithLvl782 extends CobolProgram {
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
    private static final int y = 1;
    private static final int y2 = 1;
    private static final int x = 2;
    private static final int z = 354;


    private CobolString y2x = new CobolString(256);
    private CobolString correct = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);
    private CobolString bad = new CobolString(256);
    private CobolString should = new CobolString(256);
    private CobolString be = new CobolString(256);
    private CobolString end = new CobolString(256);
    private CobolString is = new CobolString(256);
    private CobolString not = new CobolString(256);
    private CobolString elif = new CobolString(256);
    private CobolString broken = new CobolString(256);

    private void para_main() {
        if (String.valueOf(y).equals(String.valueOf(y2x))) {
            CobolDisplay.display(String.valueOf(correct) + String.valueOf(y) + String.valueOf(_unnamed) + String.valueOf(y2));
        } else {
            CobolDisplay.display(String.valueOf(bad) + String.valueOf(_unnamed) + String.valueOf(y) + String.valueOf(should) + String.valueOf(be) + String.valueOf(_unnamed) + String.valueOf(y2) + String.valueOf(end));
            if (y > x) {
                CobolDisplay.display(String.valueOf((Integer.parseInt(String.valueOf(bad).trim()) - y)) + String.valueOf(is) + String.valueOf(not) + String.valueOf(_unnamed) + String.valueOf(x) + String.valueOf(elif) + String.valueOf(y) + String.valueOf(_unnamed) + String.valueOf(x));
                CobolDisplay.display(String.valueOf(correct) + String.valueOf(y) + String.valueOf(_unnamed) + String.valueOf(x));
            } else {
                CobolDisplay.display(String.valueOf(broken) + String.valueOf(end));
                if (x > y) {
                    CobolDisplay.display(String.valueOf(correct) + String.valueOf(x) + String.valueOf(_unnamed) + String.valueOf(y) + String.valueOf(elif) + String.valueOf(x) + String.valueOf(_unnamed) + String.valueOf(y));
                    CobolDisplay.display(String.valueOf((Integer.parseInt(String.valueOf(bad).trim()) - x)) + String.valueOf(is) + String.valueOf(not) + String.valueOf(_unnamed) + String.valueOf(y));
                } else {
                    CobolDisplay.display(String.valueOf(broken) + String.valueOf(end));
                    /* CONTINUE */
                }
            }
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc132ConditionalDirectivesWithLvl782().run();
    }
}
