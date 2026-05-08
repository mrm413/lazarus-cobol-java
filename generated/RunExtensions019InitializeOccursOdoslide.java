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
    // WORKING-STORAGE SECTION
    private int p = 0;
    private int p2 = 0;
    private int dlen = 0;
    private CobolString grp_0 = new CobolString(57357); // Group: grp-0
    private CobolString filler_1 = new CobolString(3);
    private CobolString fld_0 = new CobolString(57351); // Group: FLD-0
    private CobolString[] fld_0_1 = new CobolString[8193]; // Group: FLD-0-1
    private CobolString[] fld_0_2 = new CobolString[8193];
    {
        for (int _d0 = 0; _d0 < 8193; _d0++) {
            fld_0_2[_d0] = new CobolString(3, "XYZ");
        }
    }
    private int[] fld_0_3 = new int[8193];
    {
        java.util.Arrays.fill(fld_0_3, (int)12);
    }
    private CobolString[] fld_0_4 = new CobolString[8193];
    {
        for (int _d0 = 0; _d0 < 8193; _d0++) {
            fld_0_4[_d0] = new CobolString(2, "QQ");
        }
    }
    private CobolString filler_2 = new CobolString(3);
    private CobolString grp_1 = new CobolString(11, "   ABCDE   "); // Group: grp-1
    private CobolString filler_3 = new CobolString(3);
    private CobolString fld_1 = new CobolString(5, "ABCDE");
    private CobolString filler_4 = new CobolString(3);
    private CobolString grp_2 = new CobolString(48, "   ABCD ABCD ABCD ABCD ABCD ABCD ABCD ABCD AB   "); // Group: grp-2
    private CobolString filler_5 = new CobolString(3);
    private CobolString fld_2 = new CobolString(42, "ABCD ABCD ABCD ABCD ABCD ABCD ABCD ABCD AB");
    private CobolString filler_6 = new CobolString(3);
    private CobolString grp_2a = new CobolString(14, "   ABCABCAB   "); // Group: grp-2a
    private CobolString filler_7 = new CobolString(3);
    private CobolString fld_2a = new CobolString(8, "ABCABCAB");
    private CobolString filler_8 = new CobolString(3);
    private CobolString grp_3 = new CobolString(27, "   ABC00XXABC00XXABC00XX   "); // Group: grp-3
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
        for (int _d0 = 0; _d0 < 3; _d0++) {
            fld_3_3[_d0] = (int)0;
        }
    }
    private CobolString[] fld_3_4 = new CobolString[3];
    {
        for (int _d0 = 0; _d0 < 3; _d0++) {
            fld_3_4[_d0] = new CobolString(2, "XX");
        }
    }
    private CobolString filler_10 = new CobolString(3);
    private CobolString grp_4 = new CobolString(72, "   AB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZ   "); // Group: grp-4
    private CobolString filler_11 = new CobolString(3);
    private CobolString fld_4 = new CobolString(66, "AB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZ"); // Group: FLD-4
    private CobolString[] fld_4_1 = new CobolString[11]; // Group: FLD-4-1
    private CobolString[] fld_4_2 = new CobolString[11];
    {
        for (int _d0 = 0; _d0 < 11; _d0++) {
            fld_4_2[_d0] = new CobolString(2, "AB");
        }
    }
    private int[] fld_4_3 = new int[11];
    {
        java.util.Arrays.fill(fld_4_3, (int)12);
    }
    private CobolString[] fld_4_4 = new CobolString[11];
    {
        for (int _d0 = 0; _d0 < 11; _d0++) {
            fld_4_4[_d0] = new CobolString(2, "YZ");
        }
    }
    private CobolString filler_12 = new CobolString(3);
    private int c5 = 6;
    private CobolString grp_5 = new CobolString(69, "   Mon49eyMon49eyMon49eyMon49eyMon49eyMon49eyMon49eyMon49eyMon49ey   "); // Group: grp-5
    private CobolString filler_13 = new CobolString(3);
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
    private CobolString filler_14 = new CobolString(3);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(57610);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.POINTER).name("p").pointer(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.POINTER).name("p2").pointer(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dlen = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("dlen").picDigits(7).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_0 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 57357).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("grp-0").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_15 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_0 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 57351).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FLD-0").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_0_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 57351).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FLD-0-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_0_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-0-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_0_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD-0-3").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_0_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(17, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-0-4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_16 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57363, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57366, 11).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("grp-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_17 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57366, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57369, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_18 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57374, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57377, 48).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("grp-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_19 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57377, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57380, 42).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_20 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57422, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_2a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57425, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("grp-2a").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_21 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57425, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_2a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57428, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-2A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_22 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57436, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57439, 27).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("grp-3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_23 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57439, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57442, 21).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FLD-3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_3_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57442, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-3-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_3_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57445, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD-3-3").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_3_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57447, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-3-4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_24 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57463, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57466, 72).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("grp-4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_25 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57466, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57469, 66).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FLD-4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_4_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57469, 66).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FLD-4-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_4_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57469, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-4-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_4_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57471, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD-4-3").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_4_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57473, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-4-4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_26 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57535, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57538, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("C5").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_grp_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57541, 69).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("grp-5").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_27 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57541, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57544, 63).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FLD-5").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_5_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57544, 63).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FLD-5-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_5_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57544, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-5-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_5_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57547, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD-5-3").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld_5_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57549, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD-5-4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_28 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57607, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();


    private void para_main() {
        grp_1.set("***********");
        if (fld_1 != null) fld_1.set(CobolString.refMod(grp_1, 4, 5));
        fld_1.set("ABCDE");
        grp_1.setRefMod(4, 5, String.valueOf(fld_1));
        { /* Build group grp-1 from children before group access */
            String _gbuf = grp_1.get();
            StringBuilder _sb = new StringBuilder(11);
            _sb.append(_gbuf.substring(Math.min(0, _gbuf.length()), Math.min(3, _gbuf.length())));
            _sb.append(String.format("%-5s", String.valueOf(fld_1)).substring(0, 5));
            _sb.append(_gbuf.substring(Math.min(8, _gbuf.length()), Math.min(11, _gbuf.length())));
            grp_1.set(_sb.toString());
        }
        CobolDisplay.display("GRP-1:" + String.valueOf(grp_1));
        grp_2.set("************************************************");
        if (fld_2 != null) fld_2.set(CobolString.refMod(grp_2, 4, 42));
        fld_2.set("ABCD ABCD ABCD ABCD ABCD ABCD ABCD ABCD AB");
        grp_2.setRefMod(4, 42, String.valueOf(fld_2));
        { /* Build group grp-2 from children before group access */
            String _gbuf = grp_2.get();
            StringBuilder _sb = new StringBuilder(48);
            _sb.append(_gbuf.substring(Math.min(0, _gbuf.length()), Math.min(3, _gbuf.length())));
            _sb.append(String.format("%-42s", String.valueOf(fld_2)).substring(0, 42));
            _sb.append(_gbuf.substring(Math.min(45, _gbuf.length()), Math.min(48, _gbuf.length())));
            grp_2.set(_sb.toString());
        }
        CobolDisplay.display("GRP-2:" + String.valueOf(grp_2));
        grp_3.set("***************************");
        { /* Sync OCCURS children of grp-3 after group MOVE */
            String _grp = grp_3.get();
            int _grpLen = _grp.length();
            for (int _gi = 0; _gi < 3; _gi++) {
                int _base = 3 + _gi * 7;
                if (_base + 0 < _grpLen) { if (fld_3_2[_gi] == null) fld_3_2[_gi] = new CobolString(3); fld_3_2[_gi].set(_grp.substring(_base + 0, Math.min(_base + 0 + 3, _grpLen))); }
                if (_base + 3 < _grpLen) { try { fld_3_3[_gi] = Integer.parseInt(_grp.substring(_base + 3, Math.min(_base + 3 + 2, _grpLen)).trim()); } catch (Exception _e) { fld_3_3[_gi] = 0; } }
                if (_base + 5 < _grpLen) { if (fld_3_4[_gi] == null) fld_3_4[_gi] = new CobolString(2); fld_3_4[_gi].set(_grp.substring(_base + 5, Math.min(_base + 5 + 2, _grpLen))); }
                { int _gstart = _base; int _gend = Math.min(_base + 7, _grpLen); if (fld_3[_gi] == null) fld_3[_gi] = new CobolString(7); fld_3[_gi].set(_grp.substring(Math.min(_gstart, _grpLen), _gend)); }
            }
        }
        if (fld_3[1 - 1] == null) fld_3[1 - 1] = new CobolString(7);
        fld_3[1 - 1].set("ABC00XX");
        if (fld_3_2[1 - 1] == null) fld_3_2[1 - 1] = new CobolString(3);
        fld_3_2[1 - 1].set("ABC");
        fld_3_3[1 - 1] = 0;
        if (fld_3_4[1 - 1] == null) fld_3_4[1 - 1] = new CobolString(2);
        fld_3_4[1 - 1].set("XX");
        { /* Sync FLD-3(1) back to grp-3 after INITIALIZE ALL TO VALUE */
            int _syncOff = 3 + ((1) - 1) * 7;
            StringBuilder _sb = new StringBuilder(7);
            _sb.append(String.format("%-3s", fld_3_2[1 - 1] != null ? String.valueOf(fld_3_2[1 - 1]) : "").substring(0, 3));
            _sb.append(CobolDisplay.formatPic(fld_3_3[1 - 1], 2, 0, false));
            _sb.append(String.format("%-2s", fld_3_4[1 - 1] != null ? String.valueOf(fld_3_4[1 - 1]) : "").substring(0, 2));
            String _val = _sb.toString();
            grp_3.setRefMod(_syncOff + 1, Math.min(_val.length(), 7), _val);
        }
        if (fld_3[2 - 1] == null) fld_3[2 - 1] = new CobolString(7);
        fld_3[2 - 1].set("ABC00XX");
        if (fld_3_2[2 - 1] == null) fld_3_2[2 - 1] = new CobolString(3);
        fld_3_2[2 - 1].set("ABC");
        fld_3_3[2 - 1] = 0;
        if (fld_3_4[2 - 1] == null) fld_3_4[2 - 1] = new CobolString(2);
        fld_3_4[2 - 1].set("XX");
        { /* Sync FLD-3(2) back to grp-3 after INITIALIZE ALL TO VALUE */
            int _syncOff = 3 + ((2) - 1) * 7;
            StringBuilder _sb = new StringBuilder(7);
            _sb.append(String.format("%-3s", fld_3_2[2 - 1] != null ? String.valueOf(fld_3_2[2 - 1]) : "").substring(0, 3));
            _sb.append(CobolDisplay.formatPic(fld_3_3[2 - 1], 2, 0, false));
            _sb.append(String.format("%-2s", fld_3_4[2 - 1] != null ? String.valueOf(fld_3_4[2 - 1]) : "").substring(0, 2));
            String _val = _sb.toString();
            grp_3.setRefMod(_syncOff + 1, Math.min(_val.length(), 7), _val);
        }
        if (fld_3[3 - 1] == null) fld_3[3 - 1] = new CobolString(7);
        fld_3[3 - 1].set("ABC00XX");
        if (fld_3_2[3 - 1] == null) fld_3_2[3 - 1] = new CobolString(3);
        fld_3_2[3 - 1].set("ABC");
        fld_3_3[3 - 1] = 0;
        if (fld_3_4[3 - 1] == null) fld_3_4[3 - 1] = new CobolString(2);
        fld_3_4[3 - 1].set("XX");
        { /* Sync FLD-3(3) back to grp-3 after INITIALIZE ALL TO VALUE */
            int _syncOff = 3 + ((3) - 1) * 7;
            StringBuilder _sb = new StringBuilder(7);
            _sb.append(String.format("%-3s", fld_3_2[3 - 1] != null ? String.valueOf(fld_3_2[3 - 1]) : "").substring(0, 3));
            _sb.append(CobolDisplay.formatPic(fld_3_3[3 - 1], 2, 0, false));
            _sb.append(String.format("%-2s", fld_3_4[3 - 1] != null ? String.valueOf(fld_3_4[3 - 1]) : "").substring(0, 2));
            String _val = _sb.toString();
            grp_3.setRefMod(_syncOff + 1, Math.min(_val.length(), 7), _val);
        }
        { /* Build group grp-3 from children before group access */
            String _gbuf = grp_3.get();
            StringBuilder _sb = new StringBuilder(27);
            _sb.append(_gbuf.substring(Math.min(0, _gbuf.length()), Math.min(3, _gbuf.length())));
            for (int _bi = 0; _bi < 3; _bi++) {
                if (fld_3[_bi] != null) {
                    _sb.append(String.valueOf(fld_3[_bi]));
                } else {
                    _sb.append(String.format("%-3s", fld_3_2[_bi] != null ? String.valueOf(fld_3_2[_bi]) : "").substring(0, 3));
                    _sb.append(CobolDisplay.formatPic(fld_3_3[_bi], 2, 0, false));
                    _sb.append(String.format("%-2s", fld_3_4[_bi] != null ? String.valueOf(fld_3_4[_bi]) : "").substring(0, 2));
                }
            }
            _sb.append(_gbuf.substring(Math.min(24, _gbuf.length()), Math.min(27, _gbuf.length())));
            grp_3.set(_sb.toString());
        }
        CobolDisplay.display("GRP-3:" + String.valueOf(grp_3));
        grp_4.set("************************************************************************");
        { /* Sync OCCURS children of grp-4 after group MOVE */
            String _grp = grp_4.get();
            int _grpLen = _grp.length();
            for (int _gi = 0; _gi < 11; _gi++) {
                int _base = 3 + _gi * 6;
                if (_base + 0 < _grpLen) { if (fld_4_2[_gi] == null) fld_4_2[_gi] = new CobolString(2); fld_4_2[_gi].set(_grp.substring(_base + 0, Math.min(_base + 0 + 2, _grpLen))); }
                if (_base + 2 < _grpLen) { try { fld_4_3[_gi] = Integer.parseInt(_grp.substring(_base + 2, Math.min(_base + 2 + 2, _grpLen)).trim()); } catch (Exception _e) { fld_4_3[_gi] = 0; } }
                if (_base + 4 < _grpLen) { if (fld_4_4[_gi] == null) fld_4_4[_gi] = new CobolString(2); fld_4_4[_gi].set(_grp.substring(_base + 4, Math.min(_base + 4 + 2, _grpLen))); }
                { int _gstart = _base; int _gend = Math.min(_base + 6, _grpLen); if (fld_4_1[_gi] == null) fld_4_1[_gi] = new CobolString(6); fld_4_1[_gi].set(_grp.substring(Math.min(_gstart, _grpLen), _gend)); }
            }
        }
        if (fld_4 != null) fld_4.set(CobolString.refMod(grp_4, 4, 66));
        fld_4.setRefMod(1, 66, "AB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZAB12YZ");
        for (int _iv0 = 0; _iv0 < 11; _iv0++) {
            if (fld_4_2[_iv0] == null) fld_4_2[_iv0] = new CobolString(2);
            fld_4_2[_iv0].set("AB");
            fld_4_3[_iv0] = 12;
            if (fld_4_4[_iv0] == null) fld_4_4[_iv0] = new CobolString(2);
            fld_4_4[_iv0].set("YZ");
            fld_4_1[_iv0] = null;
        }
        { /* Sync FLD-4 back to grp-4 after INITIALIZE ALL TO VALUE */
            StringBuilder _sb = new StringBuilder(66);
            for (int _bi = 0; _bi < 11; _bi++) {
                if (fld_4_1[_bi] != null) {
                    _sb.append(String.valueOf(fld_4_1[_bi]));
                } else {
                    _sb.append(String.format("%-2s", fld_4_2[_bi] != null ? String.valueOf(fld_4_2[_bi]) : "").substring(0, 2));
                    _sb.append(CobolDisplay.formatPic(fld_4_3[_bi], 2, 0, false));
                    _sb.append(String.format("%-2s", fld_4_4[_bi] != null ? String.valueOf(fld_4_4[_bi]) : "").substring(0, 2));
                }
            }
            String _val = _sb.toString();
            grp_4.setRefMod(4, Math.min(_val.length(), 66), _val);
        }
        { /* Build group grp-4 from children before group access */
            String _gbuf = grp_4.get();
            StringBuilder _sb = new StringBuilder(72);
            _sb.append(_gbuf.substring(Math.min(0, _gbuf.length()), Math.min(3, _gbuf.length())));
            for (int _bi = 0; _bi < 11; _bi++) {
                if (fld_4_1[_bi] != null) {
                    _sb.append(String.valueOf(fld_4_1[_bi]));
                } else {
                    _sb.append(String.format("%-2s", fld_4_2[_bi] != null ? String.valueOf(fld_4_2[_bi]) : "").substring(0, 2));
                    _sb.append(CobolDisplay.formatPic(fld_4_3[_bi], 2, 0, false));
                    _sb.append(String.format("%-2s", fld_4_4[_bi] != null ? String.valueOf(fld_4_4[_bi]) : "").substring(0, 2));
                }
            }
            _sb.append(_gbuf.substring(Math.min(69, _gbuf.length()), Math.min(72, _gbuf.length())));
            grp_4.set(_sb.toString());
        }
        CobolDisplay.display("GRP-4:" + String.valueOf(grp_4));
        c5 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(7), 3));
        grp_5.set("*********************************************************************");
        { /* Sync OCCURS children of grp-5 after group MOVE */
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
        { /* Sync FLD-5 back to grp-5 after INITIALIZE ALL TO VALUE */
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
        { /* ODO-slide build for grp-5 */
            String _gbuf = grp_5.get();
            StringBuilder _sb = new StringBuilder(69);
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
            _sb.append(_gbuf.substring(Math.min(66, _gbuf.length()), Math.min(69, _gbuf.length())));
            String _built = _sb.toString();
            int _len = (int)(3 + (7) * c5 + 3);
            _odo2 = _built.substring(0, Math.min(_len, _built.length()));
        }
        CobolDisplay.display("GRP-5:" + _odo2);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunExtensions019InitializeOccursOdoslide");
            CobolProgram.registerCallAlias("prog", "RunExtensions019InitializeOccursOdoslide");
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
        new RunExtensions019InitializeOccursOdoslide().run();
    }
}
