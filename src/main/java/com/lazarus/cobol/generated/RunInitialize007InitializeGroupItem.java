package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunInitialize007InitializeGroupItem extends CobolProgram {
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
        if (g2[1 - 1] == null) g2[1 - 1] = new CobolString(256);
        g2[1 - 1].set(String.valueOf("A"));
        if (g2[2 - 1] == null) g2[2 - 1] = new CobolString(256);
        g2[2 - 1].set(String.valueOf("B"));
        if (g2[3 - 1] == null) g2[3 - 1] = new CobolString(256);
        g2[3 - 1].set(String.valueOf("C"));
        if (y[2 - 1] == null) y[2 - 1] = new CobolString(1);
        y[2 - 1].set("");
        if (!String.valueOf(g).equals(String.valueOf("AAAAAAAAAAAAB0 0 0 0 0 BCCCCCCCCCCCC"))) {
            CobolDisplay.display("Test 1 failed: " + String.valueOf(g) + ".");
            CobolDisplay.display("    should be: " + "AAAAAAAAAAAAB0 0 0 0 0 BCCCCCCCCCCCC.");
        }
        if (g2[1 - 1] == null) g2[1 - 1] = new CobolString(256);
        g2[1 - 1].set(String.valueOf("A"));
        if (g2[2 - 1] == null) g2[2 - 1] = new CobolString(256);
        g2[2 - 1].set(String.valueOf("B"));
        if (g2[3 - 1] == null) g2[3 - 1] = new CobolString(256);
        g2[3 - 1].set(String.valueOf("C"));
        x[1 - 1] = new BigDecimal(String.valueOf(2).trim()).intValue();
        if (y[x[1 - 1] - 1] == null) y[x[1 - 1] - 1] = new CobolString(1);
        y[x[1 - 1] - 1].set("");
        if (!String.valueOf(g).equals(String.valueOf("2AAAAAAAAAAAB0 0 0 0 0 BCCCCCCCCCCCC"))) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(g) + ".");
            CobolDisplay.display("    should be: " + "2AAAAAAAAAAAB0 0 0 0 0 BCCCCCCCCCCCC.");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunInitialize007InitializeGroupItem().run();
    }
}
