package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc020MoveZLiteral extends CobolProgram {
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
    private CobolString x = new CobolString(4);
    private CobolString xred = new CobolString(1); // Group: XRED
    private CobolString xbyte1 = new CobolString(1);
    private CobolString xbyte2 = new CobolString(1);
    private CobolString xbyte3 = new CobolString(1);
    private CobolString xbyte4 = new CobolString(1);



    private void para_main() {
    }

    private void x() {
        if ((((String.valueOf(xbyte1).equals(String.valueOf("0")) && String.valueOf(xbyte2).equals(String.valueOf("1"))) && String.valueOf(xbyte3).equals(String.valueOf("2"))) && String.valueOf(xbyte4).equals(String.valueOf("\u0000")))) {
            CobolDisplay.displayNoAdvancing("OK");
        } else {
            CobolDisplay.displayNoAdvancing("X = " + String.valueOf(CobolString.refMod(x, 1, 3)));
            if (String.valueOf(xbyte4).equals(String.valueOf("\u0000"))) {
                CobolDisplay.display(" WITH LOW-VALUE");
            } else {
                CobolDisplay.display(" WITHOUT LOW-VALUE BUT '" + String.valueOf(xbyte4) + "'");
            }
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc020MoveZLiteral().run();
    }
}
