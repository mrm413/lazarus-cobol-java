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
    public static final String COBOL_PROGRAM_ID = "prog";
    private int sort_return = 0;
    private int json_code = 0;
    private int xml_code = 0;
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
    private CobolString stdin = new CobolString(256);
    private CobolString stdout = new CobolString(256);
    private CobolString stderr = new CobolString(256);
    private boolean _exitSection = false;
    private int tab_adr_ind = 1;
    // WORKING-STORAGE SECTION
    private int p2 = 0;
    private int tab_adr_count = 8;
    private CobolString[] tab_adr = new CobolString[1000]; // Group: TAB-ADR
    private CobolString[] tab_adr_element = new CobolString[1000]; // Group: TAB-ADR-ELEMENT
    private CobolString[] tab_adr_prgm = new CobolString[1000];
    {
        for (int _d0 = 0; _d0 < 1000; _d0++) {
            tab_adr_prgm[_d0] = new CobolString(8);
        }
    }
    private CobolString[] tab_adr_id = new CobolString[1000];
    {
        for (int _d0 = 0; _d0 < 1000; _d0++) {
            tab_adr_id[_d0] = new CobolString(2);
        }
    }
    private long[] tab_adr_adr_64 = new long[1000];
    private long[] tab_adr_last_adr_64 = new long[1000];
    private CobolString grp_x = new CobolString(1346, "   202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                                  "); // Group: GRP-X
    private CobolString filler_1 = new CobolString(3);
    private CobolString[] fld_x = new CobolString[10]; // Group: FLD-X
    private int[] fld_x_y = new int[10];
    {
        java.util.Arrays.fill(fld_x_y, (int)2020);
    }
    private int[] fld_x_m = new int[10];
    {
        java.util.Arrays.fill(fld_x_m, (int)11);
    }
    private CobolString[] fld_x_x = new CobolString[10];
    {
        for (int _d0 = 0; _d0 < 10; _d0++) {
            fld_x_x[_d0] = new CobolString(128, "This is something                                                                                                               ");
        }
    }
    private CobolString filler_2 = new CobolString(3);
    private CobolString grp_1 = new CobolString(1346, "   202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                               202011This is something                                                                                                                  "); // Group: GRP-1
    private CobolString filler_3 = new CobolString(3);
    private CobolString[] fld_1 = new CobolString[10]; // Group: FLD-1
    private int[] fld_1_y = new int[10];
    {
        java.util.Arrays.fill(fld_1_y, (int)2020);
    }
    private int[] fld_1_m = new int[10];
    {
        java.util.Arrays.fill(fld_1_m, (int)11);
    }
    private CobolString[] fld_1_x = new CobolString[10];
    {
        for (int _d0 = 0; _d0 < 10; _d0++) {
            fld_1_x[_d0] = new CobolString(128, "This is something                                                                                                               ");
        }
    }
    private CobolString filler_4 = new CobolString(3);
    private CobolString grp_2 = new CobolString(48, "   ABCD ABCD ABCD ABCD ABCD ABCD ABCD ABCD AB   "); // Group: GRP-2
    private CobolString filler_5 = new CobolString(3);
    private CobolString fld_2 = new CobolString(42, "ABCD ABCD ABCD ABCD ABCD ABCD ABCD ABCD AB");
    private CobolString filler_6 = new CobolString(3);
    private CobolString grp_2a = new CobolString(1210, "  ABCABCABX                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               "); // Group: GRP-2A
    private CobolString filler_7 = new CobolString(2);
    private CobolString fld_2a = new CobolString(8, "ABCABCAB");
    private CobolString filler_8 = new CobolString(1200, "X");
    private CobolString grp_3 = new CobolString(63, "   ABC00D99D99D99D99XXABC00D99D99D99D99XXABC00D99D99D99D99XX   "); // Group: GRP-3
    private CobolString filler_9 = new CobolString(3);
    private CobolString[] fld_3 = new CobolString[3]; // Group: FLD-3
    private CobolString[] fld_3_2 = new CobolString[3];
    {
        for (int _d0 = 0; _d0 < 3; _d0++) {
            fld_3_2[_d0] = new CobolString(3, "ABC");
        }
    }
    private int[] fld_3_3 = new int[3];
    {
    }
    private CobolString[][] fld_3o_1 = new CobolString[3][4];
    {
        for (int _d0 = 0; _d0 < 3; _d0++) {
            for (int _d1 = 0; _d1 < 4; _d1++) {
                fld_3o_1[_d0][_d1] = new CobolString(1, "D");
            }
        }
    }
    private int[][] fld_3o_2 = new int[3][4];
    {
        for (int _d0 = 0; _d0 < 3; _d0++) {
            for (int _d1 = 0; _d1 < 4; _d1++) {
                fld_3o_2[_d0][_d1] = (int)99;
            }
        }
    }
    private CobolString[] fld_3_4 = new CobolString[3];
    {
        for (int _d0 = 0; _d0 < 3; _d0++) {
            fld_3_4[_d0] = new CobolString(2, "XX");
        }
    }
    private CobolString filler_10 = new CobolString(3);
    private int c5 = 6;
    private CobolString grp_5 = new CobolString(66, "   Mon49eyMon49eyMon49eyMon49eyMon49eyMon49eyMon49eyMon49eyMon49ey"); // Group: GRP-5
    private CobolString filler_11 = new CobolString(3);
    private CobolString fld_5 = new CobolString(63, "Mon49eyMon49eyMon49eyMon49eyMon49eyMon49eyMon49eyMon49eyMon49ey"); // Group: FLD-5
    private CobolString[] fld_5_1 = new CobolString[9]; // Group: FLD-5-1
    private CobolString[] fld_5_2 = new CobolString[9];
    {
        for (int _d0 = 0; _d0 < 9; _d0++) {
            fld_5_2[_d0] = new CobolString(3, "Mon");
        }
    }
    private int[] fld_5_3 = new int[9];
    {
        java.util.Arrays.fill(fld_5_3, (int)49);
    }
    private CobolString[] fld_5_4 = new CobolString[9];
    {
        for (int _d0 = 0; _d0 < 9; _d0++) {
            fld_5_4[_d0] = new CobolString(2, "ey");
        }
    }

    // LINKAGE SECTION
    private CobolString a_table = new CobolString(6, "123ABC"); // Group: A-TABLE
    private CobolString prefix = new CobolString(3, "123"); // Group: prefix
    private int n = 123;
    private CobolString table_data = new CobolString(3, "ALL"); // Group: table-data
    private CobolString[] rows = new CobolString[100]; // Group: rows
    private CobolString[] col1 = new CobolString[100];
    {
        for (int _d0 = 0; _d0 < 100; _d0++) {
            col1[_d0] = new CobolString(1);
        }
    }
    private CobolString[] col2 = new CobolString[100];
    {
        for (int _d0 = 0; _d0 < 100; _d0++) {
            col2[_d0] = new CobolString(2);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(30087);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.POINTER).name("P2").pointer(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab_adr_count = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TAB-ADR-COUNT").picDigits(4).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab_adr = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 26000).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TAB-ADR").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab_adr_element = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 26).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TAB-ADR-ELEMENT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab_adr_prgm = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TAB-ADR-PRGM").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab_adr_id = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TAB-ADR-ID").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab_adr_adr_64 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("TAB-ADR-ADR-64").picDigits(16).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab_adr_last_adr_64 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(23, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("TAB-ADR-LAST-ADR-64").picDigits(16).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26005, 1346).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("GRP-X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_12 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26005, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26008, 1340).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FLD-X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_x_y = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26008, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD-X-Y").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_x_m = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26012, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD-X-M").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_x_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26014, 128).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-X-X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_13 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27348, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27351, 1346).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("GRP-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_14 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27351, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27354, 1340).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FLD-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_1_y = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27354, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD-1-Y").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_1_m = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27358, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD-1-M").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_1_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27360, 128).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-1-X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_15 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28694, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28697, 48).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("GRP-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_16 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28697, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28700, 42).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_17 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28742, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_2a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28745, 1210).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("GRP-2A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_18 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28745, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_2a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28747, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-2A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_19 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28755, 1200).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29955, 63).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("GRP-3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_20 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29955, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29958, 57).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FLD-3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_3_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29958, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-3-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_3_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29961, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD-3-3").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_21 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29963, 12).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_3o_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29963, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-3O-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_3o_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29964, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD-3O-2").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_3_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29975, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-3-4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_22 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30015, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30018, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("C5").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30021, 66).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("GRP-5").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_23 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30021, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30024, 63).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FLD-5").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_5_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30024, 63).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FLD-5-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_5_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30024, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-5-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_5_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30027, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD-5-3").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_5_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30029, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-5-4").build();

    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString address = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString filler_24 = new CobolString(256); // filler fallback
    private CobolString filler_25 = new CobolString(256); // filler fallback
    private CobolString filler_26 = new CobolString(256); // filler fallback
    private void para_main() {
        grp_2.set("************************************************");
        if (fld_2 != null) fld_2.set(CobolString.refMod(grp_2, 4, 42));
        fld_2.set("ABCD ABCD ABCD ABCD ABCD ABCD ABCD ABCD AB");
        grp_2.setRefMod(4, 42, String.valueOf(fld_2));
        { /* Build group GRP-2 from children before group access */
            String _gbuf = grp_2.get();
            StringBuilder _sb = new StringBuilder(48);
            _sb.append(_gbuf.substring(Math.min(0, _gbuf.length()), Math.min(3, _gbuf.length())));
            _sb.append(String.format("%-42s", String.valueOf(fld_2)).substring(0, 42));
            _sb.append(_gbuf.substring(Math.min(45, _gbuf.length()), Math.min(48, _gbuf.length())));
            grp_2.set(_sb.toString());
        }
        CobolDisplay.display("GRP-2:" + String.valueOf(grp_2));
        grp_3.set("***************************************************************");
        { /* Sync OCCURS children of GRP-3 after group MOVE */
            String _grp = grp_3.get();
            int _grpLen = _grp.length();
            for (int _gi = 0; _gi < 3; _gi++) {
                int _base = 3 + _gi * 19;
                if (_base + 0 < _grpLen) { if (fld_3_2[_gi] == null) fld_3_2[_gi] = new CobolString(3); fld_3_2[_gi].set(_grp.substring(_base + 0, Math.min(_base + 0 + 3, _grpLen))); }
                if (_base + 3 < _grpLen) { try { fld_3_3[_gi] = Integer.parseInt(_grp.substring(_base + 3, Math.min(_base + 3 + 2, _grpLen)).trim()); } catch (Exception _e) { fld_3_3[_gi] = 0; } }
                if (_base + 8 < _grpLen) { if (fld_3_4[_gi] == null) fld_3_4[_gi] = new CobolString(2); fld_3_4[_gi].set(_grp.substring(_base + 8, Math.min(_base + 8 + 2, _grpLen))); }
                { int _gstart = _base; int _gend = Math.min(_base + 19, _grpLen); if (fld_3[_gi] == null) fld_3[_gi] = new CobolString(19); fld_3[_gi].set(_grp.substring(Math.min(_gstart, _grpLen), _gend)); }
            }
        }
        for (int _cat0 = 0; _cat0 < 3; _cat0++) {
            fld_3_3[_cat0] = 0;
        }
        if (fld_3_2[1 - 1] == null) fld_3_2[1 - 1] = new CobolString(3);
        fld_3_2[1 - 1].set("ABC");
        fld_3_3[1 - 1] = 0;
        filler_24.set("D99");
        if (fld_3_4[1 - 1] == null) fld_3_4[1 - 1] = new CobolString(2);
        fld_3_4[1 - 1].set("XX");
        fld_3[1 - 1] = null; // force DISPLAY rebuild from child arrays
        { /* Sync FLD-3(1) back to GRP-3 after INITIALIZE ALL TO VALUE */
            int _syncOff = 3 + ((1) - 1) * 19;
            StringBuilder _sb = new StringBuilder(19);
            _sb.append(String.format("%-3s", fld_3_2[1 - 1] != null ? String.valueOf(fld_3_2[1 - 1]) : "").substring(0, 3));
            _sb.append(CobolDisplay.formatPic(fld_3_3[1 - 1], 2, 0, false));
            { String _grpBuf = grp_3.get(); _sb.append(_grpBuf.substring(Math.min(_syncOff + _sb.length(), _grpBuf.length()), Math.min(_syncOff + _sb.length() + 12, _grpBuf.length()))); }
            _sb.append(String.format("%-2s", fld_3_4[1 - 1] != null ? String.valueOf(fld_3_4[1 - 1]) : "").substring(0, 2));
            String _val = _sb.toString();
            grp_3.setRefMod(_syncOff + 1, Math.min(_val.length(), 19), _val);
        }
        if (fld_3_2[2 - 1] == null) fld_3_2[2 - 1] = new CobolString(3);
        fld_3_2[2 - 1].set("ABC");
        fld_3_3[2 - 1] = 0;
        filler_25.set("D99");
        if (fld_3_4[2 - 1] == null) fld_3_4[2 - 1] = new CobolString(2);
        fld_3_4[2 - 1].set("XX");
        fld_3[2 - 1] = null; // force DISPLAY rebuild from child arrays
        { /* Sync FLD-3(2) back to GRP-3 after INITIALIZE ALL TO VALUE */
            int _syncOff = 3 + ((2) - 1) * 19;
            StringBuilder _sb = new StringBuilder(19);
            _sb.append(String.format("%-3s", fld_3_2[2 - 1] != null ? String.valueOf(fld_3_2[2 - 1]) : "").substring(0, 3));
            _sb.append(CobolDisplay.formatPic(fld_3_3[2 - 1], 2, 0, false));
            { String _grpBuf = grp_3.get(); _sb.append(_grpBuf.substring(Math.min(_syncOff + _sb.length(), _grpBuf.length()), Math.min(_syncOff + _sb.length() + 12, _grpBuf.length()))); }
            _sb.append(String.format("%-2s", fld_3_4[2 - 1] != null ? String.valueOf(fld_3_4[2 - 1]) : "").substring(0, 2));
            String _val = _sb.toString();
            grp_3.setRefMod(_syncOff + 1, Math.min(_val.length(), 19), _val);
        }
        if (fld_3_2[3 - 1] == null) fld_3_2[3 - 1] = new CobolString(3);
        fld_3_2[3 - 1].set("ABC");
        fld_3_3[3 - 1] = 0;
        filler_26.set("D99");
        if (fld_3_4[3 - 1] == null) fld_3_4[3 - 1] = new CobolString(2);
        fld_3_4[3 - 1].set("XX");
        fld_3[3 - 1] = null; // force DISPLAY rebuild from child arrays
        { /* Sync FLD-3(3) back to GRP-3 after INITIALIZE ALL TO VALUE */
            int _syncOff = 3 + ((3) - 1) * 19;
            StringBuilder _sb = new StringBuilder(19);
            _sb.append(String.format("%-3s", fld_3_2[3 - 1] != null ? String.valueOf(fld_3_2[3 - 1]) : "").substring(0, 3));
            _sb.append(CobolDisplay.formatPic(fld_3_3[3 - 1], 2, 0, false));
            { String _grpBuf = grp_3.get(); _sb.append(_grpBuf.substring(Math.min(_syncOff + _sb.length(), _grpBuf.length()), Math.min(_syncOff + _sb.length() + 12, _grpBuf.length()))); }
            _sb.append(String.format("%-2s", fld_3_4[3 - 1] != null ? String.valueOf(fld_3_4[3 - 1]) : "").substring(0, 2));
            String _val = _sb.toString();
            grp_3.setRefMod(_syncOff + 1, Math.min(_val.length(), 19), _val);
        }
        if (fld_3o_1[3 - 1][2 - 1] == null) fld_3o_1[3 - 1][2 - 1] = new CobolString(1);
        fld_3o_1[3 - 1][2 - 1].set("");
        _filler_002.set("");
        fld_3o_2[3 - 1][2 - 1] = 0;
        { /* Build group GRP-3 from children before group access */
            String _gbuf = grp_3.get();
            StringBuilder _sb = new StringBuilder(63);
            _sb.append(_gbuf.substring(Math.min(0, _gbuf.length()), Math.min(3, _gbuf.length())));
            for (int _bi = 0; _bi < 3; _bi++) {
                if (fld_3[_bi] != null) {
                    _sb.append(String.valueOf(fld_3[_bi]));
                } else {
                    _sb.append(String.format("%-3s", fld_3_2[_bi] != null ? String.valueOf(fld_3_2[_bi]) : "").substring(0, 3));
                    _sb.append(CobolDisplay.formatPic(fld_3_3[_bi], 2, 0, false));
                    for (int _bj = 0; _bj < 4; _bj++) {
                        _sb.append(String.format("%-1s", fld_3o_1[_bi][_bj] != null ? String.valueOf(fld_3o_1[_bi][_bj]) : "").substring(0, 1));
                        _sb.append(CobolDisplay.formatPic(fld_3o_2[_bi][_bj], 2, 0, false));
                    }
                    _sb.append(String.format("%-2s", fld_3_4[_bi] != null ? String.valueOf(fld_3_4[_bi]) : "").substring(0, 2));
                }
            }
            _sb.append(_gbuf.substring(Math.min(60, _gbuf.length()), Math.min(63, _gbuf.length())));
            grp_3.set(_sb.toString());
        }
        CobolDisplay.display("GRP-3:" + String.valueOf(grp_3));
        c5 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(7), 3));
        grp_5.set("******************************************************************");
        { /* Sync OCCURS children of GRP-5 after group MOVE */
            String _grp = grp_5.get();
            int _grpLen = _grp.length();
            for (int _gi = 0; _gi < c5; _gi++) {
                int _base = 3 + _gi * 7;
                if (_base + 0 < _grpLen) { if (fld_5_2[_gi] == null) fld_5_2[_gi] = new CobolString(3); fld_5_2[_gi].set(_grp.substring(_base + 0, Math.min(_base + 0 + 3, _grpLen))); }
                if (_base + 3 < _grpLen) { try { fld_5_3[_gi] = Integer.parseInt(_grp.substring(_base + 3, Math.min(_base + 3 + 2, _grpLen)).trim()); } catch (Exception _e) { fld_5_3[_gi] = 0; } }
                if (_base + 5 < _grpLen) { if (fld_5_4[_gi] == null) fld_5_4[_gi] = new CobolString(2); fld_5_4[_gi].set(_grp.substring(_base + 5, Math.min(_base + 5 + 2, _grpLen))); }
                { int _gstart = _base; int _gend = Math.min(_base + 7, _grpLen); if (fld_5_1[_gi] == null) fld_5_1[_gi] = new CobolString(7); fld_5_1[_gi].set(_grp.substring(Math.min(_gstart, _grpLen), _gend)); }
            }
        }
        if (fld_5 != null) fld_5.set(CobolString.refMod(grp_5, 4, 63));
        {
            int _odo_size_fld_5_1 = ((int)CobolIntrinsics.toBigDecimal(c5).longValue()) * 7;
            if (_odo_size_fld_5_1 < 0) _odo_size_fld_5_1 = 0;
            if (_odo_size_fld_5_1 > 0) fld_5.setRefMod(1, _odo_size_fld_5_1, "Mon49eyMon49eyMon49eyMon49eyMon49eyMon49eyMon49eyMon49eyMon49ey".substring(0, Math.min(_odo_size_fld_5_1, 63)));
            for (int _iv1 = 0; _iv1 < c5; _iv1++) {
                if (fld_5_2[_iv1] == null) fld_5_2[_iv1] = new CobolString(3);
                fld_5_2[_iv1].set("Mon");
                fld_5_3[_iv1] = 49;
                if (fld_5_4[_iv1] == null) fld_5_4[_iv1] = new CobolString(2);
                fld_5_4[_iv1].set("ey");
                fld_5_1[_iv1] = null;
            }
        }
        { /* Sync FLD-5 back to GRP-5 after INITIALIZE ALL TO VALUE */
            StringBuilder _sb = new StringBuilder(63);
            for (int _bi = 0; _bi < c5; _bi++) {
                if (fld_5_1[_bi] != null) {
                    _sb.append(String.valueOf(fld_5_1[_bi]));
                } else {
                    _sb.append(String.format("%-3s", fld_5_2[_bi] != null ? String.valueOf(fld_5_2[_bi]) : "").substring(0, 3));
                    _sb.append(CobolDisplay.formatPic(fld_5_3[_bi], 2, 0, false));
                    _sb.append(String.format("%-2s", fld_5_4[_bi] != null ? String.valueOf(fld_5_4[_bi]) : "").substring(0, 2));
                }
            }
            String _val = _sb.toString();
            grp_5.setRefMod(4, Math.min(_val.length(), 63), _val);
        }
        String _odo2;
        { /* ODO-slide build for GRP-5 */
            String _gbuf = grp_5.get();
            StringBuilder _sb = new StringBuilder(66);
            _sb.append(_gbuf.substring(Math.min(0, _gbuf.length()), Math.min(3, _gbuf.length())));
            for (int _bi = 0; _bi < c5; _bi++) {
                if (fld_5_1[_bi] != null) {
                    _sb.append(String.valueOf(fld_5_1[_bi]));
                } else {
                    _sb.append(String.format("%-3s", fld_5_2[_bi] != null ? String.valueOf(fld_5_2[_bi]) : "").substring(0, 3));
                    _sb.append(CobolDisplay.formatPic(fld_5_3[_bi], 2, 0, false));
                    _sb.append(String.format("%-2s", fld_5_4[_bi] != null ? String.valueOf(fld_5_4[_bi]) : "").substring(0, 2));
                }
            }
            String _built = _sb.toString();
            int _len = (int)(3 + (7) * c5);
            _odo2 = _built.substring(0, Math.min(_len, _built.length()));
        }
        CobolDisplay.display("GRP-5:" + _odo2);
        grp_2a.set(String.valueOf(" "));
        if (fld_2a != null) fld_2a.set(CobolString.refMod(grp_2a, 3, 8));
        grp_2a.setRefMod(510, 4, String.valueOf("Peek"));
        grp_2a.setRefMod(910, 3, String.valueOf("Boo"));
        grp_2a.setRefMod(910, 2, String.valueOf("\u00fe\u0099"));
        grp_2a.setRefMod(1010, 3, String.valueOf("You"));
        if (fld_5_4[5 - 1] == null) fld_5_4[5 - 1] = new CobolString(2);
        fld_5_4[5 - 1].set(String.valueOf("$$"));
        if (fld_5_1[5 - 1] != null) fld_5_1[5 - 1].setRefMod(6, 2, String.format("%-2s", fld_5_4[5 - 1] != null ? String.valueOf(fld_5_4[5 - 1]) : "").substring(0, 2));
        if (fld_1_x[5 - 1] == null) fld_1_x[5 - 1] = new CobolString(128);
        fld_1_x[5 - 1].set(String.valueOf("Something else!"));
        if (fld_1[5 - 1] != null) fld_1[5 - 1].setRefMod(7, 128, String.format("%-128s", fld_1_x[5 - 1] != null ? String.valueOf(fld_1_x[5 - 1]) : "").substring(0, 128));
        tab_adr_ind = (int) Math.abs(CobolIntrinsics.toBigDecimal(1).intValue());
        p2 = (int) Math.abs(CobolIntrinsics.toBigDecimal(0).intValue());
        address.set(String.valueOf(0));
        a_table.setRefMod(1, ((3 + (3) * n)), String.valueOf("0"));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc140DumpFeatureWithNullAddress");
            CobolProgram.registerCallAlias("prog", "RunMisc140DumpFeatureWithNullAddress");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
        } finally { CobolProgram.popActive(); }
    }

    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new RunMisc140DumpFeatureWithNullAddress().run();
    }
}
