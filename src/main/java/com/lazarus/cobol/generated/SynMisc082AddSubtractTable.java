package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc082AddSubtractTable extends CobolProgram {
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
    private CobolString tab1 = new CobolString(1); // Group: tab1
    private int[] tab1_entry = new int[5];
    private CobolString tab2 = new CobolString(1); // Group: tab2
    private int[] tab2_entry = new int[7];
    private CobolString[] tab2b_entry = new CobolString[7]; // Group: tab2b-entry
    private int[] x = new int[7];
    private CobolString tab3 = new CobolString(1); // Group: tab3
    private CobolString[] sub_tab_3 = new CobolString[2]; // Group: sub-tab-3
    private int[][] tab3_entry = new int[2][5];


    private CobolString table = new CobolString(256); // fallback

    private void para_main() {
        // Method body requires runtime extensions
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc082AddSubtractTable().run();
    }
}
