package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc16278Value extends CobolProgram {
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
    private static final String doggy = "Barky";
    private CobolString myrec = new CobolString(1); // Group: MYREC
    private int fld1 = 0;
    private CobolString fld2 = new CobolString(7);
    private CobolString[] fld3 = new CobolString[5];
    private CobolString fld4 = new CobolString(4);
    private CobolString fld5 = new CobolString(4);
    private CobolString picx = new CobolString(3);
    private static final int hun = 10;

    // LINKAGE SECTION
    private CobolString xmyrec = new CobolString(1); // Group: XMYREC
    private int xfld1 = 0;
    private CobolString xfld2 = new CobolString(7);
    private static final String xpos3 = "NEXT";
    private CobolString[] xfld3 = new CobolString[5];
    private static final String xpos4 = "NEXT";
    private CobolString xfld4 = new CobolString(4);
    private CobolString xfld5 = new CobolString(4);
    private static final String xstrt4 = "START";


    private CobolString num2 = new CobolString(256);
    private CobolString thedog = new CobolString(256);

    private void para_main() {
        CobolDisplay.display("DIV1 is ");
    }

    private void div1() {
        CobolDisplay.display("HUN  is ");
    }

    private void hun() {
        CobolDisplay.display("HUN2 is ");
    }

    private void hun2() {
        fld1 = new BigDecimal(String.valueOf(num2).trim()).intValue();
        if (fld1 == 9) {
            CobolDisplay.display("NUM2 is " + String.valueOf(num2) + " left to right precedence.");
        } else {
            CobolDisplay.display("NUM2 is " + String.valueOf(num2) + " normal precedence.");
        }
        CobolDisplay.display("XFLD3 starts at ");
    }

    private void xpos3() {
        CobolDisplay.display("XFLD4 starts at ");
    }

    private void xstrt4() {
        CobolDisplay.display("XFLD4 starts at ");
    }

    private void xpos4() {
        CobolDisplay.display("Your Dog's name is " + String.valueOf(doggy) + ";");
        CobolDisplay.display("The Dog's name is " + String.valueOf(thedog) + ";");
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc16278Value().run();
    }
}
