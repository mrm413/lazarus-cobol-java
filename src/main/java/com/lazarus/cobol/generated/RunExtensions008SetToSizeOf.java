package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions008SetToSizeOf extends CobolProgram {
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
    private CobolString tst = new CobolString(10);
    private CobolString tst2 = new CobolString(1); // Group: TST2
    private CobolString[] t2_1 = new CobolString[5000];
    private CobolString[] t2_2 = new CobolString[5000];
    private int ln = 0;


    private CobolString size = new CobolString(256);

    private void para_main() {
        ln = new BigDecimal(String.valueOf(size).trim()).intValue();
        if (ln != 10) {
            CobolDisplay.display("SIZE OF TST is " + String.valueOf(ln));
        }
        ln = new BigDecimal(String.valueOf(size).trim()).intValue();
        if (ln != 165000) {
            CobolDisplay.display("SIZE OF TST2 is " + String.valueOf(ln));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions008SetToSizeOf().run();
    }
}
