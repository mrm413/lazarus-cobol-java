package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions015ComplexOccursDependingOn6 extends CobolProgram {
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
    private int n = 0;
    private int m = 0;
    private CobolString a_table = new CobolString(1); // Group: a-table
    private CobolString[] rows = new CobolString[2]; // Group: rows
    private CobolString[][] chars = new CobolString[2][5];
    private CobolString vals = new CobolString(3);



    private void para_main() {
        vals.setRefMod(1, 1, String.valueOf(chars[1 - 1][2 - 1]));
        vals.setRefMod(2, 1, String.valueOf(chars[2 - 1][1 - 1]));
        vals.setRefMod(3, 1, String.valueOf(chars[2 - 1][3 - 1]));
        if (!String.valueOf(vals).equals(String.valueOf("BDF"))) {
            CobolDisplay.display("Vals (slided) wrong: " + String.valueOf(vals));
        }
        if (!String.valueOf(a_table).equals(String.valueOf("ABCDEF"))) {
            CobolDisplay.display("Table (slided) wrong: " + String.valueOf(a_table));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions015ComplexOccursDependingOn6().run();
    }
}
