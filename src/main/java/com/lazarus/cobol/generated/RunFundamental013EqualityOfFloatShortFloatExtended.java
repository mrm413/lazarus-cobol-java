package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental013EqualityOfFloatShortFloatExtended extends CobolProgram {
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
    private double src1 = 0.0;
    private float dst1 = 0.0f;
    private float src2 = 0.0f;
    private double dst2 = 0.0;


    private CobolString end_display = new CobolString(256);
    private CobolString end_if = new CobolString(256);

    private void para_main() {
    }

    private void dst1() {
        if (dst1 != 11.55) {
            CobolDisplay.display(String.valueOf((0 /* non-numeric literal: error 1: move/compar */ - 0 /* non-numeric literal: ORT failed  */)) + String.valueOf(dst1));
        }
    }

    private void dst2() {
        if (dst1 != 11.55) {
            CobolDisplay.display(String.valueOf((0 /* non-numeric literal: error 2: move/compar */ - 0 /* non-numeric literal: ORT failed  */)) + String.valueOf(dst2));
        }
    }

    private void dst1_2() {
    }

    private void dst2_2() {
    }

    private void dst1_3() {
        if (dst1 != 11.55) {
            CobolDisplay.display(String.valueOf((0 /* non-numeric literal: error 3: move/compar */ - 0 /* non-numeric literal: ORT failed  */)) + String.valueOf(dst1));
        }
    }

    private void dst2_3() {
        if (dst2 != 11.55) {
            CobolDisplay.display(String.valueOf((0 /* non-numeric literal: error 4: move/compar */ - 0 /* non-numeric literal: T failed  */)) + String.valueOf(dst2));
        }
    }

    private void dst1_4() {
        if (!((dst1 == 0 && true))) {
            CobolDisplay.display("Zero compare failed: " + String.valueOf(dst1));
        }
    }

    private void dst1_5() {
        if (!((dst1 == 0 && true))) {
            CobolDisplay.display("Negative Zero compare failed: " + String.valueOf(dst1));
        }
    }

    private void dst1_6() {
    }

    private void dst2_4() {
        if (dst2 != 1.1234567) {
            CobolDisplay.display("move/compare number to FLOAT to DOUBLE failed: " + String.valueOf(dst1) + " - " + String.valueOf(dst2));
        }
        /* RAW: * Check for Tolerance */
    }

    private void dst1_7() {
    }

    private void dst2_5() {
        if (dst1 != dst2) {
            CobolDisplay.display(String.valueOf((0 /* non-numeric literal: move/compare of very */ - 0 /* non-numeric literal: entical):  */)) + String.valueOf(dst1) + " - " + String.valueOf(dst2));
        }
    }

    private void dst1_8() {
    }

    private void dst2_6() {
        dst2 = Double.parseDouble(String.valueOf(dst2 + 1).trim());
        if (dst1 != dst2) {
            CobolDisplay.display(String.valueOf((0 /* non-numeric literal: move/compare of very */ - 0 /* non-numeric literal: entical after ADD):  */)) + String.valueOf(dst1) + " - " + String.valueOf(dst2));
        }
        /* RAW: * Within tolerance by definition , */
        /* MULTIPLY without GIVING — needs runtime */
        /* RAW: DST2  */
        /* RAW: *  */
        if (dst1 == dst2) {
            /* RAW: *  */
    // CobolDisplay.display(String.valueOf((0 /* non-numeric literal: compare of very near */ * -"entical): ")) + String.valueOf(dst1) + " - " + String.valueOf(((dst2 * Integer.parseInt(String.valueOf(end_display).trim())) * Integer.parseInt(String.valueOf(end_if).trim()))));
        }
    }

    private void dst1_9() {
    }

    private void dst2_7() {
        if (dst1 == dst2) {
            CobolDisplay.display(String.valueOf((0 /* non-numeric literal: move/compare of near */ - 0 /* non-numeric literal: ical):  */)) + String.valueOf(dst1) + " - " + String.valueOf(dst2));
        }
    }

    private void dst1_10() {
    }

    private void dst2_8() {
        if (dst1 == dst2) {
            CobolDisplay.display(String.valueOf((0 /* non-numeric literal: move/compare of near */ - 0 /* non-numeric literal: failed  (identical): */)) + String.valueOf(dst1) + " - " + String.valueOf(dst2));
        }
    }

    private void dst1_11() {
    }

    private void dst2_9() {
        if (dst1 == dst2) {
            CobolDisplay.display(String.valueOf((0 /* non-numeric literal: move/compare of near */ - 0 /* non-numeric literal: (identical):  */)) + String.valueOf(dst1) + " - " + String.valueOf(dst2));
        }
        /* RAW: * Within tolerance by definition , */
    }

    private void dst1_12() {
        /* RAW: *  */
    }

    private void dst2_10() {
        /* RAW: *  */
        if (dst1 == dst2) {
            /* RAW: *  */
    // CobolDisplay.display(String.valueOf((0 /* non-numeric literal: move/compare of near */ * -"iled (identical): ")) + String.valueOf(dst1) + " - " + String.valueOf(((dst2 * Integer.parseInt(String.valueOf(end_display).trim())) * Integer.parseInt(String.valueOf(end_if).trim()))));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFundamental013EqualityOfFloatShortFloatExtended().run();
    }
}
