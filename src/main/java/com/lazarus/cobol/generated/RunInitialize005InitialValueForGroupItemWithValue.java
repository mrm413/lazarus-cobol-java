package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunInitialize005InitialValueForGroupItemWithValue extends CobolProgram {
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
    private CobolString g = new CobolString(1); // Group: G
    private CobolString[] g2 = new CobolString[3]; // Group: G2
    private int[] x = new int[3];
    private CobolString[] y = new CobolString[3]; // Group: Y
    private CobolString[][] y_rec = new CobolString[3][5]; // Group: Y-REC
    private int[][] y1 = new int[3][5];
    private CobolString[][] y2 = new CobolString[3][5];
    private CobolString[] z = new CobolString[3];



    private void para_main() {
        if (!String.valueOf(g).equals(String.valueOf("09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ"))) {
            CobolDisplay.display("Test failed: " + String.valueOf(g) + ".");
            CobolDisplay.display("  should be: " + "09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ.");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunInitialize005InitialValueForGroupItemWithValue().run();
    }
}
