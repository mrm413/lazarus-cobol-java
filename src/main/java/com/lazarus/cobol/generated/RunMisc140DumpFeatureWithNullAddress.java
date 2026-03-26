package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc140DumpFeatureWithNullAddress extends CobolProgram {
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
    private int tab_adr_ind = 0;
    // WORKING-STORAGE SECTION
    private long p2 = 0L;
    private int tab_adr_count = 0;
    private CobolString[] tab_adr = new CobolString[1000]; // Group: TAB-ADR
    private CobolString[] tab_adr_element = new CobolString[1000]; // Group: TAB-ADR-ELEMENT
    private CobolString[] tab_adr_prgm = new CobolString[1000];
    private CobolString[] tab_adr_id = new CobolString[1000];
    private long[] tab_adr_adr_64 = new long[1000];
    private long[] tab_adr_last_adr_64 = new long[1000];
    private CobolString grp_x = new CobolString(1); // Group: GRP-X
    private CobolString filler_1 = new CobolString(3);
    private CobolString[] fld_x = new CobolString[10]; // Group: FLD-X
    private int[] fld_x_y = new int[10];
    private int[] fld_x_m = new int[10];
    private CobolString[] fld_x_x = new CobolString[10];
    private CobolString filler_2 = new CobolString(3);
    private CobolString grp_1 = new CobolString(1); // Group: GRP-1
    private CobolString filler_3 = new CobolString(3);
    private CobolString[] fld_1 = new CobolString[10]; // Group: FLD-1
    private int[] fld_1_y = new int[10];
    private int[] fld_1_m = new int[10];
    private CobolString[] fld_1_x = new CobolString[10];
    private CobolString filler_4 = new CobolString(3);
    private CobolString grp_2 = new CobolString(1); // Group: GRP-2
    private CobolString filler_5 = new CobolString(3);
    private CobolString fld_2 = new CobolString(42);
    private CobolString filler_6 = new CobolString(3);
    private CobolString grp_2a = new CobolString(1); // Group: GRP-2A
    private CobolString filler_7 = new CobolString(3);
    private CobolString fld_2a = new CobolString(8);
    private CobolString filler_8 = new CobolString(3);
    private CobolString grp_3 = new CobolString(1); // Group: GRP-3
    private CobolString filler_9 = new CobolString(3);
    private CobolString[] fld_3 = new CobolString[3]; // Group: FLD-3
    private CobolString[] fld_3_2 = new CobolString[3];
    private int[] fld_3_3 = new int[3];
    private CobolString[][] fld_3o_1 = new CobolString[3][4];
    private int[][] fld_3o_2 = new int[3][4];
    private CobolString[] fld_3_4 = new CobolString[3];
    private CobolString filler_10 = new CobolString(3);
    private int c5 = 0;
    private CobolString grp_5 = new CobolString(1); // Group: GRP-5
    private CobolString filler_11 = new CobolString(3);
    private CobolString fld_5 = new CobolString(1); // Group: FLD-5
    private CobolString[] fld_5_1 = new CobolString[9]; // Group: FLD-5-1
    private CobolString[] fld_5_2 = new CobolString[9];
    private int[] fld_5_3 = new int[9];
    private CobolString[] fld_5_4 = new CobolString[9];

    // LINKAGE SECTION
    private CobolString a_table = new CobolString(1); // Group: A-TABLE
    private CobolString prefix = new CobolString(1); // Group: prefix
    private int n = 0;
    private CobolString table_data = new CobolString(1); // Group: table-data
    private CobolString[] rows = new CobolString[100]; // Group: rows
    private CobolString[] col1 = new CobolString[100];
    private CobolString[] col2 = new CobolString[100];


    private CobolString numeric = new CobolString(256); // fallback
    private CobolString to = new CobolString(256); // fallback
    private CobolString value = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString address = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private void para_main() {
        grp_2.set(String.valueOf("*"));
        fld_2.set("");
        CobolDisplay.display("GRP-2:" + String.valueOf(grp_2));
        /* RAW: *  */
        grp_3.set(String.valueOf("*"));
        grp_3.set("");
        numeric.set("");
        to.set("");
        value.set("");
        if (fld_3[1 - 1] == null) fld_3[1 - 1] = new CobolString(1);
        fld_3[1 - 1].set("");
        if (fld_3[2 - 1] == null) fld_3[2 - 1] = new CobolString(1);
        fld_3[2 - 1].set("");
        if (fld_3[3 - 1] == null) fld_3[3 - 1] = new CobolString(1);
        fld_3[3 - 1].set("");
        if (fld_3o_1[3 - 1][2 - 1] == null) fld_3o_1[3 - 1][2 - 1] = new CobolString(1);
        fld_3o_1[3 - 1][2 - 1].set("");
        _filler_002.set("");
        fld_3o_2[3 - 1][2 - 1] = 0;
        CobolDisplay.display("GRP-3:" + String.valueOf(grp_3));
        /* RAW: *  */
        c5 = new BigDecimal(String.valueOf(7).trim()).intValue();
        grp_5.set(String.valueOf("*"));
        fld_5.set("");
        CobolDisplay.display("GRP-5:" + String.valueOf(grp_5));
        /* RAW: *  */
        grp_2a.set(String.valueOf(" "));
        grp_2a.setRefMod(510, 4, String.valueOf("Peek"));
        grp_2a.setRefMod(910, 3, String.valueOf("Boo"));
        grp_2a.setRefMod(910, 2, String.valueOf("FE99"));
        grp_2a.setRefMod(1010, 3, String.valueOf("You"));
        if (fld_5_4[5 - 1] == null) fld_5_4[5 - 1] = new CobolString(256);
        fld_5_4[5 - 1].set(String.valueOf("$$"));
        if (fld_1_x[5 - 1] == null) fld_1_x[5 - 1] = new CobolString(256);
        fld_1_x[5 - 1].set(String.valueOf("Something else!"));
        /* RAW: * * "the initial value of an index-name at runtime is undefined" * Old OpenCOBOL */
        tab_adr_ind = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* RAW: *  */
        p2 = new BigDecimal(String.valueOf(0).trim()).longValue();
        address.set(String.valueOf(0));
        a_table.setRefMod(1, (CobolIntrinsics.length(a_table)), String.valueOf("ZEROES"));
        /* RAW: *  */
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc140DumpFeatureWithNullAddress().run();
    }
}
