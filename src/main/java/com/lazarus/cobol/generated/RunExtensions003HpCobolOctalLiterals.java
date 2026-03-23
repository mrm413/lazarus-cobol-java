package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions003HpCobolOctalLiterals extends CobolProgram {
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
    private CobolString item_alpha = new CobolString(2);
    private short item_numeric = (short) 0;
    private int item_num = 0;



    private void para_main() {
        CobolDisplay.display(String.valueOf(54131));
        if (!String.valueOf(item_alpha).equals(String.valueOf("AB"))) {
            CobolDisplay.display("VALUE %40502 is not \"AB\" (ASCII) but " + String.valueOf(item_alpha));
        }
        if (item_numeric != 39) {
            CobolDisplay.display("VALUE %47 BINARY is not 39 but " + String.valueOf(item_numeric));
        }
        if (item_num != 12) {
            CobolDisplay.display("VALUE %30462 is not 12 (ASCII) but " + String.valueOf(item_num));
        }
        item_num = new BigDecimal(String.valueOf(item_num + 23).trim()).intValue();
        if (item_num != 31) {
            CobolDisplay.display("12 + %23 (19) is not 31 but " + String.valueOf(item_num));
        }
        item_num = new BigDecimal(String.valueOf(30462).trim()).intValue();
        if (item_num != 12) {
            CobolDisplay.display("%30462 is not 12 (ASCII) but " + String.valueOf(item_num));
        }
        item_alpha.set(String.valueOf(101));
        if (!String.valueOf(item_alpha).equals(String.valueOf("4100"))) {
            CobolDisplay.display("%101 is not x\"4100\" = Anull (ASCII) but " + String.valueOf(item_alpha));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions003HpCobolOctalLiterals().run();
    }
}
