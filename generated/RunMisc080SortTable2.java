package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.CobolTableSort;
import com.lazarus.cobol.FileStatus;
import com.lazarus.cobol.jcl.batch.DfsortProgram;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc080SortTable2 extends CobolProgram {
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
    private int k = 0;
    private int cnt1 = 4;
    private CobolString tab1 = new CobolString(8); // Group: TAB1
    private CobolString[] row1 = new CobolString[4]; // Group: ROW1
    private int[] tab1_nr = new int[4];
    private CobolString tab2 = new CobolString(12, "000000004        "); // Group: TAB2
    private int cnt2 = 4;
    private CobolString[] row2 = new CobolString[4]; // Group: ROW2
    private int[] tab2_nr = new int[4];
    private CobolString tab3 = new CobolString(164, "000000010                                                                                                                                                                "); // Group: TAB3
    private int cnt3 = 10;
    private CobolString[] row3 = new CobolString[10]; // Group: ROW3
    private int[] tab3_nr = new int[10];
    private CobolString filler_1 = new CobolString(2);
    private CobolString[] tab3_data = new CobolString[10];
    {
        for (int _d0 = 0; _d0 < 10; _d0++) {
            tab3_data[_d0] = new CobolString(5);
        }
    }
    private CobolString filler_2 = new CobolString(2);
    private CobolString[] tab3_data2 = new CobolString[10];
    {
        for (int _d0 = 0; _d0 < 10; _d0++) {
            tab3_data2[_d0] = new CobolString(5);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(190);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_k = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("K").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cnt1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CNT1").picDigits(9).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TAB1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_row1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("ROW1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab1_nr = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TAB1-NR").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 12).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TAB2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cnt2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CNT2").picDigits(9).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_row2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("ROW2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab2_nr = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TAB2-NR").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26, 164).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TAB3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cnt3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CNT3").picDigits(9).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_row3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 160).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("ROW3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab3_nr = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TAB3-NR").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(32, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab3_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(34, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TAB3-DATA").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(39, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab3_data2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(41, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TAB3-DATA2").build();

    private CobolString _filler_001 = new CobolString(256); // fallback

    private CobolString _filler_003 = new CobolString(256); // fallback
    private void a() {
        for (k = 1; !(k > 4); k += 1) {
            tab1_nr[k - 1] = CobolIntrinsics.toBigDecimal(k).intValue();
            if (row1[k - 1] != null) row1[k - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab1_nr[k - 1], 2, 0, false));
            _filler_003.set(CobolDisplay.moveNumericToAlpha(k, 2, 0));
            tab2_nr[k - 1] = CobolIntrinsics.toBigDecimal(k).intValue();
            if (row2[k - 1] != null) row2[k - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab2_nr[k - 1], 2, 0, false));
        }
        tab3_nr[1 - 1] = CobolIntrinsics.toBigDecimal(1).intValue();
        if (row3[1 - 1] != null) row3[1 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab3_nr[1 - 1], 2, 0, false));
        tab3_nr[8 - 1] = CobolIntrinsics.toBigDecimal(1).intValue();
        if (row3[8 - 1] != null) row3[8 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab3_nr[8 - 1], 2, 0, false));
        tab3_nr[4 - 1] = CobolIntrinsics.toBigDecimal(1).intValue();
        if (row3[4 - 1] != null) row3[4 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab3_nr[4 - 1], 2, 0, false));
        tab3_nr[2 - 1] = CobolIntrinsics.toBigDecimal(6).intValue();
        if (row3[2 - 1] != null) row3[2 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab3_nr[2 - 1], 2, 0, false));
        tab3_nr[3 - 1] = CobolIntrinsics.toBigDecimal(5).intValue();
        if (row3[3 - 1] != null) row3[3 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab3_nr[3 - 1], 2, 0, false));
        tab3_nr[9 - 1] = CobolIntrinsics.toBigDecimal(5).intValue();
        if (row3[9 - 1] != null) row3[9 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab3_nr[9 - 1], 2, 0, false));
        tab3_nr[5 - 1] = CobolIntrinsics.toBigDecimal(2).intValue();
        if (row3[5 - 1] != null) row3[5 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab3_nr[5 - 1], 2, 0, false));
        tab3_nr[10 - 1] = CobolIntrinsics.toBigDecimal(2).intValue();
        if (row3[10 - 1] != null) row3[10 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab3_nr[10 - 1], 2, 0, false));
        tab3_nr[6 - 1] = CobolIntrinsics.toBigDecimal(4).intValue();
        if (row3[6 - 1] != null) row3[6 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab3_nr[6 - 1], 2, 0, false));
        tab3_nr[7 - 1] = CobolIntrinsics.toBigDecimal(3).intValue();
        if (row3[7 - 1] != null) row3[7 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab3_nr[7 - 1], 2, 0, false));
        if (tab3_data[1 - 1] == null) tab3_data[1 - 1] = new CobolString(5);
        tab3_data[1 - 1].set(String.valueOf("abcde"));
        if (row3[1 - 1] != null) row3[1 - 1].setRefMod(5, 5, String.format("%-5s", tab3_data[1 - 1] != null ? String.valueOf(tab3_data[1 - 1]) : "").substring(0, 5));
        if (tab3_data[2 - 1] == null) tab3_data[2 - 1] = new CobolString(5);
        tab3_data[2 - 1].set(String.valueOf("AbCde"));
        if (row3[2 - 1] != null) row3[2 - 1].setRefMod(5, 5, String.format("%-5s", tab3_data[2 - 1] != null ? String.valueOf(tab3_data[2 - 1]) : "").substring(0, 5));
        if (tab3_data[3 - 1] == null) tab3_data[3 - 1] = new CobolString(5);
        tab3_data[3 - 1].set(String.valueOf("abcde"));
        if (row3[3 - 1] != null) row3[3 - 1].setRefMod(5, 5, String.format("%-5s", tab3_data[3 - 1] != null ? String.valueOf(tab3_data[3 - 1]) : "").substring(0, 5));
        if (tab3_data[4 - 1] == null) tab3_data[4 - 1] = new CobolString(5);
        tab3_data[4 - 1].set(String.valueOf("zyx"));
        if (row3[4 - 1] != null) row3[4 - 1].setRefMod(5, 5, String.format("%-5s", tab3_data[4 - 1] != null ? String.valueOf(tab3_data[4 - 1]) : "").substring(0, 5));
        if (tab3_data[5 - 1] == null) tab3_data[5 - 1] = new CobolString(5);
        tab3_data[5 - 1].set(String.valueOf("12345"));
        if (row3[5 - 1] != null) row3[5 - 1].setRefMod(5, 5, String.format("%-5s", tab3_data[5 - 1] != null ? String.valueOf(tab3_data[5 - 1]) : "").substring(0, 5));
        if (tab3_data[6 - 1] == null) tab3_data[6 - 1] = new CobolString(5);
        tab3_data[6 - 1].set(String.valueOf("zyx"));
        if (row3[6 - 1] != null) row3[6 - 1].setRefMod(5, 5, String.format("%-5s", tab3_data[6 - 1] != null ? String.valueOf(tab3_data[6 - 1]) : "").substring(0, 5));
        if (tab3_data[7 - 1] == null) tab3_data[7 - 1] = new CobolString(5);
        tab3_data[7 - 1].set(String.valueOf("abcde"));
        if (row3[7 - 1] != null) row3[7 - 1].setRefMod(5, 5, String.format("%-5s", tab3_data[7 - 1] != null ? String.valueOf(tab3_data[7 - 1]) : "").substring(0, 5));
        if (tab3_data[8 - 1] == null) tab3_data[8 - 1] = new CobolString(5);
        tab3_data[8 - 1].set(String.valueOf("AbCde"));
        if (row3[8 - 1] != null) row3[8 - 1].setRefMod(5, 5, String.format("%-5s", tab3_data[8 - 1] != null ? String.valueOf(tab3_data[8 - 1]) : "").substring(0, 5));
        if (tab3_data[9 - 1] == null) tab3_data[9 - 1] = new CobolString(5);
        tab3_data[9 - 1].set(String.valueOf("abc"));
        if (row3[9 - 1] != null) row3[9 - 1].setRefMod(5, 5, String.format("%-5s", tab3_data[9 - 1] != null ? String.valueOf(tab3_data[9 - 1]) : "").substring(0, 5));
        if (tab3_data[10 - 1] == null) tab3_data[10 - 1] = new CobolString(5);
        tab3_data[10 - 1].set(String.valueOf("12346"));
        if (row3[10 - 1] != null) row3[10 - 1].setRefMod(5, 5, String.format("%-5s", tab3_data[10 - 1] != null ? String.valueOf(tab3_data[10 - 1]) : "").substring(0, 5));
        if (tab3_data2[1 - 1] == null) tab3_data2[1 - 1] = new CobolString(5);
        tab3_data2[1 - 1].set(String.valueOf("day"));
        if (row3[1 - 1] != null) row3[1 - 1].setRefMod(12, 5, String.format("%-5s", tab3_data2[1 - 1] != null ? String.valueOf(tab3_data2[1 - 1]) : "").substring(0, 5));
        if (tab3_data2[2 - 1] == null) tab3_data2[2 - 1] = new CobolString(5);
        tab3_data2[2 - 1].set(String.valueOf("The"));
        if (row3[2 - 1] != null) row3[2 - 1].setRefMod(12, 5, String.format("%-5s", tab3_data2[2 - 1] != null ? String.valueOf(tab3_data2[2 - 1]) : "").substring(0, 5));
        if (tab3_data2[3 - 1] == null) tab3_data2[3 - 1] = new CobolString(5);
        tab3_data2[3 - 1].set(String.valueOf("eats"));
        if (row3[3 - 1] != null) row3[3 - 1].setRefMod(12, 5, String.format("%-5s", tab3_data2[3 - 1] != null ? String.valueOf(tab3_data2[3 - 1]) : "").substring(0, 5));
        if (tab3_data2[4 - 1] == null) tab3_data2[4 - 1] = new CobolString(5);
        tab3_data2[4 - 1].set(String.valueOf("."));
        if (row3[4 - 1] != null) row3[4 - 1].setRefMod(12, 5, String.format("%-5s", tab3_data2[4 - 1] != null ? String.valueOf(tab3_data2[4 - 1]) : "").substring(0, 5));
        if (tab3_data2[5 - 1] == null) tab3_data2[5 - 1] = new CobolString(5);
        tab3_data2[5 - 1].set(String.valueOf("mooos"));
        if (row3[5 - 1] != null) row3[5 - 1].setRefMod(12, 5, String.format("%-5s", tab3_data2[5 - 1] != null ? String.valueOf(tab3_data2[5 - 1]) : "").substring(0, 5));
        if (tab3_data2[6 - 1] == null) tab3_data2[6 - 1] = new CobolString(5);
        tab3_data2[6 - 1].set(String.valueOf("grass"));
        if (row3[6 - 1] != null) row3[6 - 1].setRefMod(12, 5, String.format("%-5s", tab3_data2[6 - 1] != null ? String.valueOf(tab3_data2[6 - 1]) : "").substring(0, 5));
        if (tab3_data2[7 - 1] == null) tab3_data2[7 - 1] = new CobolString(5);
        tab3_data2[7 - 1].set(String.valueOf("and"));
        if (row3[7 - 1] != null) row3[7 - 1].setRefMod(12, 5, String.format("%-5s", tab3_data2[7 - 1] != null ? String.valueOf(tab3_data2[7 - 1]) : "").substring(0, 5));
        if (tab3_data2[8 - 1] == null) tab3_data2[8 - 1] = new CobolString(5);
        tab3_data2[8 - 1].set(String.valueOf("whole"));
        if (row3[8 - 1] != null) row3[8 - 1].setRefMod(12, 5, String.format("%-5s", tab3_data2[8 - 1] != null ? String.valueOf(tab3_data2[8 - 1]) : "").substring(0, 5));
        if (tab3_data2[9 - 1] == null) tab3_data2[9 - 1] = new CobolString(5);
        tab3_data2[9 - 1].set(String.valueOf("cow"));
        if (row3[9 - 1] != null) row3[9 - 1].setRefMod(12, 5, String.format("%-5s", tab3_data2[9 - 1] != null ? String.valueOf(tab3_data2[9 - 1]) : "").substring(0, 5));
        if (tab3_data2[10 - 1] == null) tab3_data2[10 - 1] = new CobolString(5);
        tab3_data2[10 - 1].set(String.valueOf("the"));
        if (row3[10 - 1] != null) row3[10 - 1].setRefMod(12, 5, String.format("%-5s", tab3_data2[10 - 1] != null ? String.valueOf(tab3_data2[10 - 1]) : "").substring(0, 5));
        { /* SORT TABLE ROW1 (row1) — in-memory */
            CobolTableSort.SortKey[] _keys = new CobolTableSort.SortKey[]{new CobolTableSort.SortKey(tab1_nr, false)};
            /* Build group elements from children before sort */
            for (int _ri = 0; _ri < cnt1; _ri++) {
                if (row1[_ri] == null) row1[_ri] = new CobolString(2);
                row1[_ri].set(CobolDisplay.formatPic(tab1_nr[_ri], 2, 0, false));
            }
            Object[] _allArrays = new Object[]{row1, tab1_nr};
            CobolTableSort.sort(cnt1, _keys, _allArrays);
            /* Reconstruct group elements from sorted children */
            for (int _ri = 0; _ri < cnt1; _ri++) {
                if (row1[_ri] == null) row1[_ri] = new CobolString(2);
                row1[_ri].set(CobolDisplay.formatPic(tab1_nr[_ri], 2, 0, false));
            }
            /* Rebuild parent group TAB1 after sort */
            {
                StringBuilder _pg = new StringBuilder();
                for (int _pi = 0; _pi < cnt1; _pi++) {
                    _pg.append(String.valueOf(row1[_pi]));
                }
                tab1.set(String.format("%-8s", _pg.toString()).substring(0, 8));
            }
        }
        { /* SORT TABLE ROW2 (row2) — in-memory */
            CobolTableSort.SortKey[] _keys = new CobolTableSort.SortKey[]{new CobolTableSort.SortKey(tab2_nr, false)};
            /* Build group elements from children before sort */
            for (int _ri = 0; _ri < cnt2; _ri++) {
                if (row2[_ri] == null) row2[_ri] = new CobolString(2);
                row2[_ri].set(CobolDisplay.formatPic(tab2_nr[_ri], 2, 0, false));
            }
            Object[] _allArrays = new Object[]{row2, tab2_nr};
            CobolTableSort.sort(cnt2, _keys, _allArrays);
            /* Reconstruct group elements from sorted children */
            for (int _ri = 0; _ri < cnt2; _ri++) {
                if (row2[_ri] == null) row2[_ri] = new CobolString(2);
                row2[_ri].set(CobolDisplay.formatPic(tab2_nr[_ri], 2, 0, false));
            }
            /* Rebuild parent group TAB2 after sort */
            {
                StringBuilder _pg = new StringBuilder();
                for (int _pi = 0; _pi < cnt2; _pi++) {
                    _pg.append(String.valueOf(row2[_pi]));
                }
                tab2.set(String.format("%-12s", _pg.toString()).substring(0, 12));
            }
        }
        CobolDisplay.display("SINGLE TABLE");
        for (k = 1; !(k > 4); k += 1) {
            CobolDisplay.display(CobolDisplay.formatPic(CobolIntrinsics.trim(tab1_nr[k - 1]), 2, 0, false));
        }
        CobolDisplay.display("LOWER LEVEL TABLE");
        for (k = 1; !(k > 4); k += 1) {
            CobolDisplay.display(CobolDisplay.formatPic(CobolIntrinsics.trim(tab2_nr[k - 1]), 2, 0, false));
        }
        { /* SORT TABLE ROW3 (row3) — in-memory */
            CobolTableSort.SortKey[] _keys = new CobolTableSort.SortKey[]{new CobolTableSort.SortKey(tab3_nr, false), new CobolTableSort.SortKey(tab3_data, true)};
            /* Build group elements from children before sort */
            for (int _ri = 0; _ri < cnt3; _ri++) {
                if (row3[_ri] == null) row3[_ri] = new CobolString(16);
                row3[_ri].set(CobolDisplay.formatPic(tab3_nr[_ri], 2, 0, false) + String.format("%-2s", "") + String.format("%-5s", tab3_data[_ri] != null ? String.valueOf(tab3_data[_ri]) : "").substring(0, 5) + String.format("%-2s", "") + String.format("%-5s", tab3_data2[_ri] != null ? String.valueOf(tab3_data2[_ri]) : "").substring(0, 5));
            }
            Object[] _allArrays = new Object[]{row3, tab3_nr, tab3_data, tab3_data2};
            CobolTableSort.sort(cnt3, _keys, _allArrays);
            /* Reconstruct group elements from sorted children */
            for (int _ri = 0; _ri < cnt3; _ri++) {
                if (row3[_ri] == null) row3[_ri] = new CobolString(16);
                row3[_ri].set(CobolDisplay.formatPic(tab3_nr[_ri], 2, 0, false) + String.format("%-2s", "") + String.format("%-5s", tab3_data[_ri] != null ? String.valueOf(tab3_data[_ri]) : "").substring(0, 5) + String.format("%-2s", "") + String.format("%-5s", tab3_data2[_ri] != null ? String.valueOf(tab3_data2[_ri]) : "").substring(0, 5));
            }
            /* Rebuild parent group TAB3 after sort */
            {
                StringBuilder _pg = new StringBuilder();
                for (int _pi = 0; _pi < cnt3; _pi++) {
                    _pg.append(String.valueOf(row3[_pi]));
                }
                tab3.set(String.format("%-164s", _pg.toString()).substring(0, 164));
            }
        }
        CobolDisplay.display("MULTY KEY SORT");
        for (k = 1; !(k > 10); k += 1) {
            CobolDisplay.display(String.valueOf(CobolIntrinsics.trim(CobolString.safeIndex(row3, k, 16, tab3, 4))));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc080SortTable2");
            CobolProgram.registerCallAlias("prog", "RunMisc080SortTable2");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            a();
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
        new RunMisc080SortTable2().run();
    }
}
