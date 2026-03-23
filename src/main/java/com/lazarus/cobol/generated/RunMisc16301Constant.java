package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc16301Constant extends CobolProgram {
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
    private CobolString myrec = new CobolString(1); // Group: MYREC
    private int fld1 = 0;
    private CobolString fld2 = new CobolString(7);
    private CobolString[] fld3 = new CobolString[5];
    private CobolString fld4 = new CobolString(4);
    private CobolString fld5 = new CobolString(4);
    private CobolString picx = new CobolString(3);
    private CobolString cat = new CobolString(1);
    private CobolString dog = new CobolString(1);
    private CobolString yard = new CobolString(1);
    private static final int hun = 10;


    private CobolString num2 = new CobolString(256);
    private CobolString con5 = new CobolString(256);
    private CobolString con4 = new CobolString(256);
    private CobolString con6 = new CobolString(256);
    private CobolString dogname = new CobolString(256);

    private void para_main() {
        CobolDisplay.display("CAT  is '" + String.valueOf(cat) + "'");
        CobolDisplay.display("Yard is '" + String.valueOf(yard) + "'");
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
            CobolDisplay.display("78 VALUE has simple left to right precedence.");
        } else {
            CobolDisplay.display("78 VALUE is " + String.valueOf(num2) + " normal precedence.");
        }
        fld1 = new BigDecimal(String.valueOf(con5).trim()).intValue();
        if (fld1 == 7) {
            CobolDisplay.display("01 CONSTANT has normal operator precedence.");
        } else {
            CobolDisplay.display("01 CONSTANT is " + String.valueOf(con5) + " left to right precedence.");
        }
        CobolDisplay.display("CON3 is ");
    }

    private void con3() {
        CobolDisplay.display("CON4 is " + String.valueOf(con4) + " vs " + String.valueOf(3.141596) + String.valueOf((0 /* non-numeric literal:  &  */ - 2.189)) + String.valueOf((0 /* non-numeric literal:  &  */ + 12)));
        CobolDisplay.display("CON6 is " + String.valueOf(con6) + ".");
        CobolDisplay.display("My Dog's name is " + String.valueOf(dogname) + ";");
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc16301Constant().run();
    }
}
