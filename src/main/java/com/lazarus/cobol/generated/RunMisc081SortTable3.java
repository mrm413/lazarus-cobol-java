package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc081SortTable3 extends CobolProgram {
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
    private int k = 0;
    private short cnt1 = (short) 0;
    private CobolString tab1 = new CobolString(1); // Group: TAB1
    private CobolString[] row1 = new CobolString[4]; // Group: ROW1
    private int[] tab1_nr = new int[4];
    private CobolString[] tab_data = new CobolString[4];
    private CobolString tab2 = new CobolString(1); // Group: TAB2
    private CobolString[] row2 = new CobolString[4]; // Group: ROW2
    private int[] tab2_nr = new int[4];
    private CobolString[] tab2_data = new CobolString[4];



    private void a() {
        for (k = 1; !(k > 4); k += 1) {
            tab1_nr[k - 1] = new BigDecimal(String.valueOf(k).trim()).intValue();
            if (tab_data[k - 1] == null) tab_data[k - 1] = new CobolString(256);
            tab_data[k - 1].set(String.valueOf("BLA"));
        }
        /* SORT ROW1 */
        for (k = 1; !(k > 4); k += 1) {
            CobolDisplay.displayNoAdvancing(String.valueOf(tab1_nr[k - 1]));
        }
        tab2.set(String.valueOf(tab1));
        /* SORT ROW2 */
        for (k = 1; !(k > 4); k += 1) {
            CobolDisplay.displayNoAdvancing(String.valueOf(tab2_nr[k - 1]));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        a();
    }

    public static void main(String[] args) {
        new RunMisc081SortTable3().run();
    }
}
