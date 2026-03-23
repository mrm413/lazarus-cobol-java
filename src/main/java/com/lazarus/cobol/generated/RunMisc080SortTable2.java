package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc080SortTable2 extends CobolProgram {
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
    private CobolString tab2 = new CobolString(1); // Group: TAB2
    private short cnt2 = (short) 0;
    private CobolString[] row2 = new CobolString[4]; // Group: ROW2
    private int[] tab2_nr = new int[4];
    private CobolString tab3 = new CobolString(1); // Group: TAB3
    private short cnt3 = (short) 0;
    private CobolString[] row3 = new CobolString[10]; // Group: ROW3
    private int[] tab3_nr = new int[10];
    private CobolString[] tab3_data = new CobolString[10];
    private CobolString[] tab3_data2 = new CobolString[10];


    private CobolString _unnamed = new CobolString(256);

    private void a() {
        for (k = 1; !(k > 4); k += 1) {
            tab1_nr[k - 1] = new BigDecimal(String.valueOf(k).trim()).intValue();
            _unnamed.set(String.valueOf(k));
            tab2_nr[k - 1] = new BigDecimal(String.valueOf(k).trim()).intValue();
        }
        tab3_nr[1 - 1] = new BigDecimal(String.valueOf(1).trim()).intValue();
        tab3_nr[8 - 1] = new BigDecimal(String.valueOf(1).trim()).intValue();
        tab3_nr[4 - 1] = new BigDecimal(String.valueOf(1).trim()).intValue();
        tab3_nr[2 - 1] = new BigDecimal(String.valueOf(6).trim()).intValue();
        tab3_nr[3 - 1] = new BigDecimal(String.valueOf(5).trim()).intValue();
        tab3_nr[9 - 1] = new BigDecimal(String.valueOf(5).trim()).intValue();
        tab3_nr[5 - 1] = new BigDecimal(String.valueOf(2).trim()).intValue();
        tab3_nr[10 - 1] = new BigDecimal(String.valueOf(2).trim()).intValue();
        tab3_nr[6 - 1] = new BigDecimal(String.valueOf(4).trim()).intValue();
        tab3_nr[7 - 1] = new BigDecimal(String.valueOf(3).trim()).intValue();
        if (tab3_data[1 - 1] == null) tab3_data[1 - 1] = new CobolString(256);
        tab3_data[1 - 1].set(String.valueOf("abcde"));
        if (tab3_data[2 - 1] == null) tab3_data[2 - 1] = new CobolString(256);
        tab3_data[2 - 1].set(String.valueOf("AbCde"));
        if (tab3_data[3 - 1] == null) tab3_data[3 - 1] = new CobolString(256);
        tab3_data[3 - 1].set(String.valueOf("abcde"));
        if (tab3_data[4 - 1] == null) tab3_data[4 - 1] = new CobolString(256);
        tab3_data[4 - 1].set(String.valueOf("zyx"));
        if (tab3_data[5 - 1] == null) tab3_data[5 - 1] = new CobolString(256);
        tab3_data[5 - 1].set(String.valueOf("12345"));
        if (tab3_data[6 - 1] == null) tab3_data[6 - 1] = new CobolString(256);
        tab3_data[6 - 1].set(String.valueOf("zyx"));
        if (tab3_data[7 - 1] == null) tab3_data[7 - 1] = new CobolString(256);
        tab3_data[7 - 1].set(String.valueOf("abcde"));
        if (tab3_data[8 - 1] == null) tab3_data[8 - 1] = new CobolString(256);
        tab3_data[8 - 1].set(String.valueOf("AbCde"));
        if (tab3_data[9 - 1] == null) tab3_data[9 - 1] = new CobolString(256);
        tab3_data[9 - 1].set(String.valueOf("abc"));
        if (tab3_data[10 - 1] == null) tab3_data[10 - 1] = new CobolString(256);
        tab3_data[10 - 1].set(String.valueOf("12346"));
        if (tab3_data2[1 - 1] == null) tab3_data2[1 - 1] = new CobolString(256);
        tab3_data2[1 - 1].set(String.valueOf("day"));
        if (tab3_data2[2 - 1] == null) tab3_data2[2 - 1] = new CobolString(256);
        tab3_data2[2 - 1].set(String.valueOf("The"));
        if (tab3_data2[3 - 1] == null) tab3_data2[3 - 1] = new CobolString(256);
        tab3_data2[3 - 1].set(String.valueOf("eats"));
        if (tab3_data2[4 - 1] == null) tab3_data2[4 - 1] = new CobolString(256);
        tab3_data2[4 - 1].set(String.valueOf("."));
        if (tab3_data2[5 - 1] == null) tab3_data2[5 - 1] = new CobolString(256);
        tab3_data2[5 - 1].set(String.valueOf("mooos"));
        if (tab3_data2[6 - 1] == null) tab3_data2[6 - 1] = new CobolString(256);
        tab3_data2[6 - 1].set(String.valueOf("grass"));
        if (tab3_data2[7 - 1] == null) tab3_data2[7 - 1] = new CobolString(256);
        tab3_data2[7 - 1].set(String.valueOf("and"));
        if (tab3_data2[8 - 1] == null) tab3_data2[8 - 1] = new CobolString(256);
        tab3_data2[8 - 1].set(String.valueOf("whole"));
        if (tab3_data2[9 - 1] == null) tab3_data2[9 - 1] = new CobolString(256);
        tab3_data2[9 - 1].set(String.valueOf("cow"));
        if (tab3_data2[10 - 1] == null) tab3_data2[10 - 1] = new CobolString(256);
        tab3_data2[10 - 1].set(String.valueOf("the"));
        /* SORT ROW1 */
        /* SORT ROW2 */
        CobolDisplay.display("SINGLE TABLE");
        for (k = 1; !(k > 4); k += 1) {
            CobolDisplay.display(String.valueOf(CobolIntrinsics.trim(tab1_nr[k - 1])));
        }
        CobolDisplay.display("LOWER LEVEL TABLE");
        for (k = 1; !(k > 4); k += 1) {
            CobolDisplay.display(String.valueOf(CobolIntrinsics.trim(tab2_nr[k - 1])));
        }
        /* SORT ROW3 */
        CobolDisplay.display("MULTY KEY SORT");
        for (k = 1; !(k > 10); k += 1) {
            CobolDisplay.display(String.valueOf(CobolIntrinsics.trim(row3[k - 1])));
        }
        System.exit(0);
    }

    @Override
    public void run() {
        a();
    }

    public static void main(String[] args) {
        new RunMisc080SortTable2().run();
    }
}
