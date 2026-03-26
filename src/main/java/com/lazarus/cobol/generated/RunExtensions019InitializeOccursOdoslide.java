package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions019InitializeOccursOdoslide extends CobolProgram {
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
    private long p = 0L;
    private long p2 = 0L;
    private int dlen = 0;
    private CobolString grp_0 = new CobolString(1); // Group: grp-0
    private CobolString filler_1 = new CobolString(3);
    private CobolString fld_0 = new CobolString(1); // Group: FLD-0
    private CobolString[] fld_0_1 = new CobolString[8193]; // Group: FLD-0-1
    private CobolString[] fld_0_2 = new CobolString[8193];
    private int[] fld_0_3 = new int[8193];
    private CobolString[] fld_0_4 = new CobolString[8193];
    private CobolString filler_2 = new CobolString(3);
    private CobolString grp_1 = new CobolString(1); // Group: grp-1
    private CobolString filler_3 = new CobolString(3);
    private CobolString fld_1 = new CobolString(5);
    private CobolString filler_4 = new CobolString(3);
    private CobolString grp_2 = new CobolString(1); // Group: grp-2
    private CobolString filler_5 = new CobolString(3);
    private CobolString fld_2 = new CobolString(42);
    private CobolString filler_6 = new CobolString(3);
    private CobolString grp_2a = new CobolString(1); // Group: grp-2a
    private CobolString filler_7 = new CobolString(3);
    private CobolString fld_2a = new CobolString(8);
    private CobolString filler_8 = new CobolString(3);
    private CobolString grp_3 = new CobolString(1); // Group: grp-3
    private CobolString filler_9 = new CobolString(3);
    private CobolString[] fld_3 = new CobolString[3]; // Group: FLD-3
    private CobolString[] fld_3_2 = new CobolString[3];
    private int[] fld_3_3 = new int[3];
    private CobolString[] fld_3_4 = new CobolString[3];
    private CobolString filler_10 = new CobolString(3);
    private CobolString grp_4 = new CobolString(1); // Group: grp-4
    private CobolString filler_11 = new CobolString(3);
    private CobolString fld_4 = new CobolString(1); // Group: FLD-4
    private CobolString[] fld_4_1 = new CobolString[11]; // Group: FLD-4-1
    private CobolString[] fld_4_2 = new CobolString[11];
    private int[] fld_4_3 = new int[11];
    private CobolString[] fld_4_4 = new CobolString[11];
    private CobolString filler_12 = new CobolString(3);
    private int c5 = 0;
    private CobolString grp_5 = new CobolString(1); // Group: grp-5
    private CobolString filler_13 = new CobolString(3);
    private CobolString fld_5 = new CobolString(1); // Group: FLD-5
    private CobolString[] fld_5_1 = new CobolString[9]; // Group: FLD-5-1
    private CobolString[] fld_5_2 = new CobolString[9];
    private int[] fld_5_3 = new int[9];
    private CobolString[] fld_5_4 = new CobolString[9];
    private CobolString filler_14 = new CobolString(3);



    private void para_main() {
        grp_1.set(String.valueOf("*"));
        fld_1.set("");
        CobolDisplay.display("GRP-1:" + String.valueOf(grp_1));
        grp_2.set(String.valueOf("*"));
        fld_2.set("");
        CobolDisplay.display("GRP-2:" + String.valueOf(grp_2));
        grp_3.set(String.valueOf("*"));
        if (fld_3[1 - 1] == null) fld_3[1 - 1] = new CobolString(1);
        fld_3[1 - 1].set("");
        if (fld_3[2 - 1] == null) fld_3[2 - 1] = new CobolString(1);
        fld_3[2 - 1].set("");
        if (fld_3[3 - 1] == null) fld_3[3 - 1] = new CobolString(1);
        fld_3[3 - 1].set("");
        CobolDisplay.display("GRP-3:" + String.valueOf(grp_3));
        grp_4.set(String.valueOf("*"));
        fld_4.set("");
        CobolDisplay.display("GRP-4:" + String.valueOf(grp_4));
        c5 = new BigDecimal(String.valueOf(7).trim()).intValue();
        grp_5.set(String.valueOf("*"));
        fld_5.set("");
        CobolDisplay.display("GRP-5:" + String.valueOf(grp_5));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions019InitializeOccursOdoslide().run();
    }
}
