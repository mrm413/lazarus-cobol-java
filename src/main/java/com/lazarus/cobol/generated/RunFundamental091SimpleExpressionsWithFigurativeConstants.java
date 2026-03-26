package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental091SimpleExpressionsWithFigurativeConstants extends CobolProgram {
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
    private CobolString fldx = new CobolString(1);
    private CobolString fldxx = new CobolString(2);
    private CobolString fldx50 = new CobolString(50);
    private CobolString fldx500 = new CobolString(500);
    private CobolString fldx32k = new CobolString(9999);
    private CobolString fld1 = new CobolString(1);
    private CobolString fld1x = new CobolString(9999);
    private int filler_1 = 0;


    private CobolString no_disp = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback

    private void main_line() {
        do_check();
        no_disp.set(String.valueOf(cb_true));
        for (int _i0 = 0; _i0 < 20000; _i0++) {
        }
        return;
    }

    private void do_check() {
        do_check_part0();
        do_check_part1();
    }
    private void do_check_part0() {
        if (String.valueOf(fldx).compareTo(String.valueOf(" ")) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" > SPACE");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf(" ")) < 0) {
            CobolDisplay.display("  \"X\" < SPACE!");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf(" ")) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" >= SPACE");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf(" ")) <= 0) {
            CobolDisplay.display("  \"X\" <= SPACE!");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! SPACE < \"X\"");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx)) > 0) {
            CobolDisplay.display("  SPACE > \"X\"!");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! SPACE <= \"X\"");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx)) >= 0) {
            CobolDisplay.display("  SPACE >= \"X\"!");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf(" ")) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" > \" \"");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf(" ")) < 0) {
            CobolDisplay.display("  \"X\" < \" \"!");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf(" ")) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" >= \" \"");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf(" ")) <= 0) {
            CobolDisplay.display("  \"X\" <= \" \"!");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \" \" < \"X\"");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx)) > 0) {
            CobolDisplay.display("  \" \" > \"X\"!");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \" \" <= \"X\"");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx)) >= 0) {
            CobolDisplay.display("  \" \" >= \"X\"!");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("\u0000")) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" > LOW-VALUE");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("\u0000")) < 0) {
            CobolDisplay.display("  \"X\" < LOW-VALUE!");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("\u0000")) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" >= LOW-VALUE");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("\u0000")) <= 0) {
            CobolDisplay.display("  \"X\" <= LOW-VALUE!");
        }
        if (String.valueOf("\u0000").compareTo(String.valueOf(fldx)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! LOW-VALUE < \"X\"");
        }
        if (String.valueOf("\u0000").compareTo(String.valueOf(fldx)) > 0) {
            CobolDisplay.display("  LOW-VALUE > \"X\"!");
        }
        if (String.valueOf("\u0000").compareTo(String.valueOf(fldx)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! LOW-VALUE <= \"X\"");
        }
        if (String.valueOf("\u0000").compareTo(String.valueOf(fldx)) >= 0) {
            CobolDisplay.display("  LOW-VALUE >= \"X\"!");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("00")) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" > x\"00\"");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("00")) < 0) {
            CobolDisplay.display("  \"X\" < x\"00\"!");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("00")) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" >= x\"00\"");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("00")) <= 0) {
            CobolDisplay.display("  \"X\" <= x\"00\"!");
        }
        if (String.valueOf("00").compareTo(String.valueOf(fldx)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! x\"00\" < \"X\"");
        }
        if (String.valueOf("00").compareTo(String.valueOf(fldx)) > 0) {
            CobolDisplay.display("  x\"00\" > \"X\"!");
        }
        if (String.valueOf("00").compareTo(String.valueOf(fldx)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! x\"00\" <= \"X\"");
        }
        if (String.valueOf("00").compareTo(String.valueOf(fldx)) >= 0) {
            CobolDisplay.display("  x\"00\" >= \"X\"!");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("\uFFFF")) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" < HIGH-VALUE");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("\uFFFF")) > 0) {
            CobolDisplay.display("  \"X\" > HIGH-VALUE!");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("\uFFFF")) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" <= HIGH-VALUE");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("\uFFFF")) >= 0) {
            CobolDisplay.display("  \"X\" >= HIGH-VALUE!");
        }
        if (String.valueOf("\uFFFF").compareTo(String.valueOf(fldx)) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! HIGH-VALUE > \"X\"");
        }
        if (String.valueOf("\uFFFF").compareTo(String.valueOf(fldx)) < 0) {
            CobolDisplay.display("  HIGH-VALUE < \"X\"!");
        }
        if (String.valueOf("\uFFFF").compareTo(String.valueOf(fldx)) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! HIGH-VALUE >= \"X\"");
        }
        if (String.valueOf("\uFFFF").compareTo(String.valueOf(fldx)) <= 0) {
            CobolDisplay.display("  HIGH-VALUE <= \"X\"!");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("FF")) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" < x\"FF\"");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("FF")) > 0) {
            CobolDisplay.display("  \"X\" > x\"FF\"!");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("FF")) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" <= x\"FF\"");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("FF")) >= 0) {
            CobolDisplay.display("  \"X\" >= x\"FF\"!");
        }
        if (String.valueOf("FF").compareTo(String.valueOf(fldx)) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! x\"FF\" > \"X\"");
        }
        if (String.valueOf("FF").compareTo(String.valueOf(fldx)) < 0) {
            CobolDisplay.display("  x\"FF\" < \"X\"!");
        }
        if (String.valueOf("FF").compareTo(String.valueOf(fldx)) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! x\"FF\" >= \"X\"");
        }
        if (String.valueOf("FF").compareTo(String.valueOf(fldx)) <= 0) {
            CobolDisplay.display("  x\"FF\" <= \"X\"!");
        }
        if (String.valueOf(fld1).compareTo(String.valueOf(0)) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"1\" > ZERO");
        }
        if (String.valueOf(fld1).compareTo(String.valueOf(0)) < 0) {
            CobolDisplay.display("  \"1\" < ZERO!");
        }
        if (String.valueOf(fld1).compareTo(String.valueOf(0)) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"1\" >= ZERO");
        }
        if (String.valueOf(fld1).compareTo(String.valueOf(0)) <= 0) {
            CobolDisplay.display("  \"1\" <= ZERO!");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fld1)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! ZERO < \"1\"");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fld1)) > 0) {
            CobolDisplay.display("  ZERO > \"1\"!");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fld1)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! ZERO <= \"1\"");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fld1)) >= 0) {
            CobolDisplay.display("  ZERO >= \"1\"!");
        }
        if (String.valueOf(fld1).compareTo(String.valueOf("0")) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"1\" > \"0\"");
        }
        if (String.valueOf(fld1).compareTo(String.valueOf("0")) < 0) {
            CobolDisplay.display("  \"1\" < \"0\"!");
        }
        if (String.valueOf(fld1).compareTo(String.valueOf("0")) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"1\" >= \"0\"");
        }
        if (String.valueOf(fld1).compareTo(String.valueOf("0")) <= 0) {
            CobolDisplay.display("  \"1\" <= \"0\"!");
        }
        if (String.valueOf("0").compareTo(String.valueOf(fld1)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"0\" < \"1\"");
        }
        if (String.valueOf("0").compareTo(String.valueOf(fld1)) > 0) {
            CobolDisplay.display("  \"0\" > \"1\"!");
        }
        if (String.valueOf("0").compareTo(String.valueOf(fld1)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"0\" <= \"1\"");
        }
        if (String.valueOf("0").compareTo(String.valueOf(fld1)) >= 0) {
            CobolDisplay.display("  \"0\" >= \"1\"!");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf(" ")) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X \" > SPACE");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf(" ")) < 0) {
            CobolDisplay.display("  \"X \" < SPACE!");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf(" ")) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X \" >= SPACE");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf(" ")) <= 0) {
            CobolDisplay.display("  \"X \" <= SPACE!");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx32k)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! SPACE < \"X \"");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx32k)) > 0) {
            CobolDisplay.display("  SPACE > \"X \"!");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx32k)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! SPACE <= \"X \"");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx32k)) >= 0) {
            CobolDisplay.display("  SPACE >= \"X \"!");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("  ")) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X \" > \" \"");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("  ")) < 0) {
            CobolDisplay.display("  \"X \" < \" \"!");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("  ")) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X \" >= \" \"");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("  ")) <= 0) {
            CobolDisplay.display("  \"X \" <= \" \"!");
        }
        if (String.valueOf("  ").compareTo(String.valueOf(fldx32k)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"  \" < \"X \"");
        }
        if (String.valueOf("  ").compareTo(String.valueOf(fldx32k)) > 0) {
            CobolDisplay.display("  \"  \" > \"X \"!");
        }
        if (String.valueOf("  ").compareTo(String.valueOf(fldx32k)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"  \" <= \"X \"");
        }
        if (String.valueOf("  ").compareTo(String.valueOf(fldx32k)) >= 0) {
            CobolDisplay.display("  \"  \" >= \"X \"!");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("\u0000")) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" > LOW-VALUE");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("\u0000")) < 0) {
            CobolDisplay.display("  \"X\" < LOW-VALUE!");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("\u0000")) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" >= LOW-VALUE");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("\u0000")) <= 0) {
            CobolDisplay.display("  \"X\" <= LOW-VALUE!");
        }
        if (String.valueOf("\u0000").compareTo(String.valueOf(fldx32k)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! LOW-VALUE < \"X\"");
        }
        if (String.valueOf("\u0000").compareTo(String.valueOf(fldx32k)) > 0) {
            CobolDisplay.display("  LOW-VALUE > \"X\"!");
        }
        if (String.valueOf("\u0000").compareTo(String.valueOf(fldx32k)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! LOW-VALUE <= \"X\"");
        }
        if (String.valueOf("\u0000").compareTo(String.valueOf(fldx32k)) >= 0) {
            CobolDisplay.display("  LOW-VALUE >= \"X\"!");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("00")) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X \" > x\"00\"");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("00")) < 0) {
            CobolDisplay.display("  \"X \" < x\"00\"!");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("00")) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X \" >= x\"00\"");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("00")) <= 0) {
            CobolDisplay.display("  \"X \" <= x\"00\"!");
        }
        if (String.valueOf("00").compareTo(String.valueOf(fldx32k)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! x\"00\" < \"X \"");
        }
        if (String.valueOf("00").compareTo(String.valueOf(fldx32k)) > 0) {
            CobolDisplay.display("  x\"00\" > \"X \"!");
        }
        if (String.valueOf("00").compareTo(String.valueOf(fldx32k)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! x\"00\" <= \"X \"");
        }
        if (String.valueOf("00").compareTo(String.valueOf(fldx32k)) >= 0) {
            CobolDisplay.display("  x\"00\" >= \"X \"!");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("\uFFFF")) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X \" < HIGH-VALUE");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("\uFFFF")) > 0) {
            CobolDisplay.display("  \"X \" > HIGH-VALUE!");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("\uFFFF")) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X \" <= HIGH-VALUE");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("\uFFFF")) >= 0) {
            CobolDisplay.display("  \"X \" >= HIGH-VALUE!");
        }
    }
    private void do_check_part1() {
        if (String.valueOf("\uFFFF").compareTo(String.valueOf(fldx32k)) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! HIGH-VALUE > \"X \"");
        }
        if (String.valueOf("\uFFFF").compareTo(String.valueOf(fldx32k)) < 0) {
            CobolDisplay.display("  HIGH-VALUE < \"X \"!");
        }
        if (String.valueOf("\uFFFF").compareTo(String.valueOf(fldx32k)) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! HIGH-VALUE >= \"X \"");
        }
        if (String.valueOf("\uFFFF").compareTo(String.valueOf(fldx32k)) <= 0) {
            CobolDisplay.display("  HIGH-VALUE <= \"X \"!");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("FF")) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X \" < x\"FF\"");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("FF")) > 0) {
            CobolDisplay.display("  \"X \" > x\"FF\"!");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("FF")) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X \" <= x\"FF\"");
        }
        if (String.valueOf(fldx32k).compareTo(String.valueOf("FF")) >= 0) {
            CobolDisplay.display("  \"X \" >= x\"FF\"!");
        }
        if (String.valueOf("FF").compareTo(String.valueOf(fldx32k)) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! x\"FF\" > \"X \"");
        }
        if (String.valueOf("FF").compareTo(String.valueOf(fldx32k)) < 0) {
            CobolDisplay.display("  x\"FF\" < \"X \"!");
        }
        if (String.valueOf("FF").compareTo(String.valueOf(fldx32k)) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! x\"FF\" >= \"X \"");
        }
        if (String.valueOf("FF").compareTo(String.valueOf(fldx32k)) <= 0) {
            CobolDisplay.display("  x\"FF\" <= \"X \"!");
        }
        if (String.valueOf(fld1x).compareTo(String.valueOf(0)) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"1 \" > ZERO");
        }
        if (String.valueOf(fld1x).compareTo(String.valueOf(0)) < 0) {
            CobolDisplay.display("  \"1 \" < ZERO!");
        }
        if (String.valueOf(fld1x).compareTo(String.valueOf(0)) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"1 \" >= ZERO");
        }
        if (String.valueOf(fld1x).compareTo(String.valueOf(0)) <= 0) {
            CobolDisplay.display("  \"1 \" <= ZERO!");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fld1x)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! ZERO < \"1 \"");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fld1x)) > 0) {
            CobolDisplay.display("  ZERO > \"1 \"!");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fld1x)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! ZERO <= \"1 \"");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fld1x)) >= 0) {
            CobolDisplay.display("  ZERO >= \"1 \"!");
        }
        if (String.valueOf(fld1x).compareTo(String.valueOf("0")) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"1 \" > \"0\"");
        }
        if (String.valueOf(fld1x).compareTo(String.valueOf("0")) < 0) {
            CobolDisplay.display("  \"1 \" < \"0\"!");
        }
        if (String.valueOf(fld1x).compareTo(String.valueOf("0")) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"1 \" >= \"0\"");
        }
        if (String.valueOf(fld1x).compareTo(String.valueOf("0")) <= 0) {
            CobolDisplay.display("  \"1 \" <= \"0\"!");
        }
        if (String.valueOf("0").compareTo(String.valueOf(fld1x)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"0\" < \"1 \"");
        }
        if (String.valueOf("0").compareTo(String.valueOf(fld1x)) > 0) {
            CobolDisplay.display("  \"0\" > \"1 \"!");
        }
        if (String.valueOf("0").compareTo(String.valueOf(fld1x)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"0\" <= \"1 \"");
        }
        if (String.valueOf("0").compareTo(String.valueOf(fld1x)) >= 0) {
            CobolDisplay.display("  \"0\" >= \"1 \"!");
        }
        if (String.valueOf(fldx500).compareTo(String.valueOf(" ")) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X5\" > SPACE");
        }
        if (String.valueOf(fldx500).compareTo(String.valueOf(" ")) < 0) {
            CobolDisplay.display("  \"X5\" < SPACE!");
        }
        if (String.valueOf(fldx500).compareTo(String.valueOf(" ")) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X5\" >= SPACE");
        }
        if (String.valueOf(fldx500).compareTo(String.valueOf(" ")) <= 0) {
            CobolDisplay.display("  \"X5\" <= SPACE!");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx500)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! SPACE < \"X5\"");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx500)) > 0) {
            CobolDisplay.display("  SPACE > \"X5\"!");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx500)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! SPACE <= \"X5\"");
        }
        if (String.valueOf(" ").compareTo(String.valueOf(fldx500)) >= 0) {
            CobolDisplay.display("  SPACE >= \"X5\"!");
        }
        fldxx.set(String.valueOf(" "));
        if (String.valueOf(fldxx).equals(String.valueOf("    "))) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"XX\" <> \"     \"");
        }
        fldxx.set(String.valueOf("A"));
        if (String.valueOf(fldxx).equals(String.valueOf("AA  "))) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"AA\" <> \"AA  \"");
        }
        if (String.valueOf(fldxx).equals(String.valueOf("AAA"))) {
            CobolDisplay.display("! \"AA\" = \"AAA \"");
        }
        if (String.valueOf(fldxx).equals(String.valueOf("A"))) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"AA\" <> ALL \"A\"");
        }
        fldxx.setRefMod(2, 1, String.valueOf("B"));
        if (String.valueOf(fldxx).equals(String.valueOf("AB"))) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"AB\" <> ALL \"AB\"");
        }
        if (String.valueOf(fldx).compareTo(String.valueOf("XX")) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"X\" > ALL \"XX\"");
        }
        if (String.valueOf("XX").compareTo(String.valueOf(fldx)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! ALL \"XX\" <= \"X\"");
        }
        fldx500.set(String.valueOf("ZERO"));
        fldx50.set(String.valueOf("ZERO"));
        fldx500.setRefMod(500, 1, String.valueOf("1"));
        fldx50.setRefMod(50, 1, String.valueOf("1"));
        if (String.valueOf(fldx50).compareTo(String.valueOf(0)) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"000...01\" > ZERO");
        }
        if (String.valueOf(fldx50).compareTo(String.valueOf(0)) < 0) {
            CobolDisplay.display("  \"000...01\" < ZERO!");
        }
        if (String.valueOf(fldx50).compareTo(String.valueOf(0)) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"000...01\" >= ZERO");
        }
        if (String.valueOf(fldx50).compareTo(String.valueOf(0)) <= 0) {
            CobolDisplay.display("  \"000...01\" <= ZERO!");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fldx50)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! ZERO < \"000...01\"");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fldx50)) > 0) {
            CobolDisplay.display("  ZERO > \"000...01\"!");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fldx50)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! ZERO <= \"000...01\"");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fldx50)) >= 0) {
            CobolDisplay.display("  ZERO >= \"000...01\"!");
        }
        if (String.valueOf(fldx500).compareTo(String.valueOf(0)) > 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"000...01\" > ZERO");
        }
        if (String.valueOf(fldx500).compareTo(String.valueOf(0)) < 0) {
            CobolDisplay.display("  \"000...01\" < ZERO!");
        }
        if (String.valueOf(fldx500).compareTo(String.valueOf(0)) >= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! \"000...01\" >= ZERO");
        }
        if (String.valueOf(fldx500).compareTo(String.valueOf(0)) <= 0) {
            CobolDisplay.display("  \"000...01\" <= ZERO!");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fldx500)) < 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! ZERO < \"000...01\"");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fldx500)) > 0) {
            CobolDisplay.display("  ZERO > \"000...01\"!");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fldx500)) <= 0) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("! ZERO <= \"000...01\"");
        }
        if (String.valueOf(0).compareTo(String.valueOf(fldx500)) >= 0) {
            CobolDisplay.display("  ZERO >= \"000...01\"!");
        }
    }

    @Override
    public void run() {
        main_line();
    }

    public static void main(String[] args) {
        new RunFundamental091SimpleExpressionsWithFigurativeConstants().run();
    }
}
