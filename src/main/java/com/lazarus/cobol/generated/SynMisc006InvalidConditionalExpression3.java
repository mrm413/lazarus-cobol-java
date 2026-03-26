package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc006InvalidConditionalExpression3 extends CobolProgram {
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

    private CobolString fld1 = new CobolString(256); // fallback
    private CobolString fldx = new CobolString(256); // fallback
    private CobolString fld2 = new CobolString(256); // fallback

    private void para_main() {
        if ((true && 2 > 1)) {
            CobolDisplay.display("Test 1 is WRONG");
        } else {
            CobolDisplay.display("Test 1 is OK");
        }
        if ((!String.valueOf(fld1).trim().isEmpty() && String.valueOf(fldx).compareTo(String.valueOf(fld2)) > 0)) {
            CobolDisplay.display("Test 2 is OK");
        } else {
            CobolDisplay.display("Test 2 is Wrong");
        }
        if ((!String.valueOf(fld1).trim().isEmpty() || String.valueOf(fldx).compareTo(String.valueOf(fld2)) > 0)) {
            CobolDisplay.display("Test 2 is OK");
        } else {
            CobolDisplay.display("Test 2 is Wrong");
        }
        if ((Integer.parseInt(String.valueOf(fld1).trim()) > 2 && String.valueOf(fldx).compareTo(String.valueOf(fld2)) > 0)) {
            CobolDisplay.display("Test 2 is OK");
        } else {
            CobolDisplay.display("Test 2 is Wrong");
        }
        if ((CobolIntrinsics.isNumeric(fld2) && !String.valueOf(fld1).trim().isEmpty())) {
            CobolDisplay.display("Test 2 is OK");
        } else {
            CobolDisplay.display("Test 2 is Wrong");
        }
        if (((String.valueOf(fldx).compareTo(String.valueOf(fld2)) > 0 && !String.valueOf(fld1).trim().isEmpty()) && true)) {
            CobolDisplay.display("Test 3 is OK " + String.valueOf(fldx) + " > " + String.valueOf(fld2) + " & " + String.valueOf(fld1));
        } else {
            CobolDisplay.display("Test 3 is Wrong");
        }
        if (((String.valueOf(fldx).compareTo(String.valueOf(fld2)) > 0 || !String.valueOf(fld1).trim().isEmpty()) || true)) {
            CobolDisplay.display("Test 3 is OK");
        } else {
            CobolDisplay.display("Test 3 is Wrong");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc006InvalidConditionalExpression3().run();
    }
}
