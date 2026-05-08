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

public class RunMisc081SortTable3 extends CobolProgram {
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
    private CobolString tab1 = new CobolString(28); // Group: TAB1
    private CobolString[] row1 = new CobolString[4]; // Group: ROW1
    private int[] tab1_nr = new int[4];
    private CobolString[] tab_data = new CobolString[4];
    {
        for (int _d0 = 0; _d0 < 4; _d0++) {
            tab_data[_d0] = new CobolString(5);
        }
    }
    private CobolString tab2 = new CobolString(28); // Group: TAB2
    private CobolString[] row2 = new CobolString[4]; // Group: ROW2
    private int[] tab2_nr = new int[4];
    private CobolString[] tab2_data = new CobolString[4];
    {
        for (int _d0 = 0; _d0 < 4; _d0++) {
            tab2_data[_d0] = new CobolString(5);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(62);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_k = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("K").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cnt1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CNT1").picDigits(9).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 28).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TAB1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_row1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 28).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("ROW1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab1_nr = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TAB1-NR").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TAB-DATA").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(34, 28).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TAB2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_row2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(34, 28).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("ROW2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab2_nr = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(34, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TAB2-NR").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tab2_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(36, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TAB2-DATA").build();


    private void a() {
        for (k = 1; !(k > 4); k += 1) {
            tab1_nr[k - 1] = CobolIntrinsics.toBigDecimal(k).intValue();
            if (row1[k - 1] != null) row1[k - 1].setRefMod(1, 2, CobolDisplay.formatPic(tab1_nr[k - 1], 2, 0, false));
            CobolString.safeIndex(tab_data, k, 5).set(String.valueOf("BLA"));
            if (row1[k - 1] != null) row1[k - 1].setRefMod(3, 5, String.format("%-5s", tab_data[k - 1] != null ? String.valueOf(tab_data[k - 1]) : "").substring(0, 5));
        }
        { /* SORT TABLE ROW1 (row1) — in-memory */
            CobolTableSort.SortKey[] _keys = new CobolTableSort.SortKey[]{new CobolTableSort.SortKey(tab1_nr, false)};
            /* Build group elements from children before sort */
            for (int _ri = 0; _ri < cnt1; _ri++) {
                if (row1[_ri] == null) row1[_ri] = new CobolString(7);
                row1[_ri].set(CobolDisplay.formatPic(tab1_nr[_ri], 2, 0, false) + String.format("%-5s", tab_data[_ri] != null ? String.valueOf(tab_data[_ri]) : "").substring(0, 5));
            }
            Object[] _allArrays = new Object[]{row1, tab1_nr, tab_data};
            CobolTableSort.sort(cnt1, _keys, _allArrays);
            /* Reconstruct group elements from sorted children */
            for (int _ri = 0; _ri < cnt1; _ri++) {
                if (row1[_ri] == null) row1[_ri] = new CobolString(7);
                row1[_ri].set(CobolDisplay.formatPic(tab1_nr[_ri], 2, 0, false) + String.format("%-5s", tab_data[_ri] != null ? String.valueOf(tab_data[_ri]) : "").substring(0, 5));
            }
            /* Rebuild parent group TAB1 after sort */
            {
                StringBuilder _pg = new StringBuilder();
                for (int _pi = 0; _pi < cnt1; _pi++) {
                    _pg.append(String.valueOf(row1[_pi]));
                }
                tab1.set(String.format("%-28s", _pg.toString()).substring(0, 28));
            }
        }
        for (k = 1; !(k > 4); k += 1) {
            CobolDisplay.displayNoAdvancing(CobolDisplay.formatPic(tab1_nr[k - 1], 2, 0, false));
        }
        { /* Build group TAB1 from children before group access */
            String _gbuf = tab1.get();
            StringBuilder _sb = new StringBuilder(28);
            for (int _bi = 0; _bi < cnt1; _bi++) {
                if (row1[_bi] != null) {
                    _sb.append(String.valueOf(row1[_bi]));
                } else {
                    _sb.append(CobolDisplay.formatPic(tab1_nr[_bi], 2, 0, false));
                    _sb.append(String.format("%-5s", tab_data[_bi] != null ? String.valueOf(tab_data[_bi]) : "").substring(0, 5));
                }
            }
            tab1.set(_sb.toString());
        }
        tab2.set(String.valueOf(tab1));
        { /* Sync OCCURS children of TAB2 after group MOVE */
            String _grp = tab2.get();
            int _grpLen = _grp.length();
            for (int _gi = 0; _gi < cnt1; _gi++) {
                int _base = 0 + _gi * 7;
                if (_base + 0 < _grpLen) { try { tab2_nr[_gi] = Integer.parseInt(_grp.substring(_base + 0, Math.min(_base + 0 + 2, _grpLen)).trim()); } catch (Exception _e) { tab2_nr[_gi] = 0; } }
                if (_base + 2 < _grpLen) { if (tab2_data[_gi] == null) tab2_data[_gi] = new CobolString(5); tab2_data[_gi].set(_grp.substring(_base + 2, Math.min(_base + 2 + 5, _grpLen))); }
                { int _gstart = _base; int _gend = Math.min(_base + 7, _grpLen); if (row2[_gi] == null) row2[_gi] = new CobolString(7); row2[_gi].set(_grp.substring(Math.min(_gstart, _grpLen), _gend)); }
            }
        }
        { /* SORT TABLE ROW2 (row2) — in-memory */
            CobolTableSort.SortKey[] _keys = new CobolTableSort.SortKey[]{new CobolTableSort.SortKey(row2, true)};
            /* Build group elements from children before sort */
            for (int _ri = 0; _ri < cnt1; _ri++) {
                if (row2[_ri] == null) row2[_ri] = new CobolString(7);
                row2[_ri].set(CobolDisplay.formatPic(tab2_nr[_ri], 2, 0, false) + String.format("%-5s", tab2_data[_ri] != null ? String.valueOf(tab2_data[_ri]) : "").substring(0, 5));
            }
            Object[] _allArrays = new Object[]{row2, tab2_nr, tab2_data};
            CobolTableSort.sort(cnt1, _keys, _allArrays);
            /* Reconstruct group elements from sorted children */
            for (int _ri = 0; _ri < cnt1; _ri++) {
                if (row2[_ri] == null) row2[_ri] = new CobolString(7);
                row2[_ri].set(CobolDisplay.formatPic(tab2_nr[_ri], 2, 0, false) + String.format("%-5s", tab2_data[_ri] != null ? String.valueOf(tab2_data[_ri]) : "").substring(0, 5));
            }
            /* Rebuild parent group TAB2 after sort */
            {
                StringBuilder _pg = new StringBuilder();
                for (int _pi = 0; _pi < cnt1; _pi++) {
                    _pg.append(String.valueOf(row2[_pi]));
                }
                tab2.set(String.format("%-28s", _pg.toString()).substring(0, 28));
            }
        }
        for (k = 1; !(k > 4); k += 1) {
            CobolDisplay.displayNoAdvancing(CobolDisplay.formatPic(tab2_nr[k - 1], 2, 0, false));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc081SortTable3");
            CobolProgram.registerCallAlias("prog", "RunMisc081SortTable3");
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
        new RunMisc081SortTable3().run();
    }
}
