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

public class RunMisc079SortTable extends CobolProgram {
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
    private CobolString g = new CobolString(10, "d4b2e1a3c5"); // Group: G
    private CobolString[] tbl = new CobolString[5]; // Group: TBL
    private CobolString[] x = new CobolString[5];
    {
        for (int _d0 = 0; _d0 < 5; _d0++) {
            x[_d0] = new CobolString(1);
        }
    }
    private int[] y = new int[5];

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(10);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tbl = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TBL").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_y = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("Y").picDigits(1).build();


    private void para_main() {
        { /* SORT TABLE TBL (tbl) — in-memory */
            CobolTableSort.SortKey[] _keys = new CobolTableSort.SortKey[]{new CobolTableSort.SortKey(x, true)};
            /* Build group elements from children before sort */
            for (int _ri = 0; _ri < 5; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(2);
                tbl[_ri].set(String.format("%-1s", x[_ri] != null ? String.valueOf(x[_ri]) : "").substring(0, 1) + CobolDisplay.formatPic(y[_ri], 1, 0, false));
            }
            Object[] _allArrays = new Object[]{tbl, x, y};
            CobolTableSort.sort(5, _keys, _allArrays);
            /* Reconstruct group elements from sorted children */
            for (int _ri = 0; _ri < 5; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(2);
                tbl[_ri].set(String.format("%-1s", x[_ri] != null ? String.valueOf(x[_ri]) : "").substring(0, 1) + CobolDisplay.formatPic(y[_ri], 1, 0, false));
            }
            /* Rebuild parent group G after sort */
            {
                StringBuilder _pg = new StringBuilder();
                for (int _pi = 0; _pi < 5; _pi++) {
                    _pg.append(String.valueOf(tbl[_pi]));
                }
                g.set(String.format("%-10s", _pg.toString()).substring(0, 10));
            }
        }
        { /* Build group G from children before group access */
            String _gbuf = g.get();
            StringBuilder _sb = new StringBuilder(10);
            for (int _bi = 0; _bi < 5; _bi++) {
                if (tbl[_bi] != null) {
                    _sb.append(String.valueOf(tbl[_bi]));
                } else {
                    _sb.append(String.format("%-1s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 1));
                    _sb.append(CobolDisplay.formatPic(y[_bi], 1, 0, false));
                }
            }
            g.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g), String.valueOf("a3b2c5d4e1"))) {
            { /* Build group G from children before group access */
                String _gbuf = g.get();
                StringBuilder _sb = new StringBuilder(10);
                for (int _bi = 0; _bi < 5; _bi++) {
                    if (tbl[_bi] != null) {
                        _sb.append(String.valueOf(tbl[_bi]));
                    } else {
                        _sb.append(String.format("%-1s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 1));
                        _sb.append(CobolDisplay.formatPic(y[_bi], 1, 0, false));
                    }
                }
                g.set(_sb.toString());
            }
            CobolDisplay.display(String.valueOf(g));
        }
        { /* SORT TABLE TBL (tbl) — in-memory */
            CobolTableSort.SortKey[] _keys = new CobolTableSort.SortKey[]{new CobolTableSort.SortKey(y, false)};
            /* Build group elements from children before sort */
            for (int _ri = 0; _ri < 5; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(2);
                tbl[_ri].set(String.format("%-1s", x[_ri] != null ? String.valueOf(x[_ri]) : "").substring(0, 1) + CobolDisplay.formatPic(y[_ri], 1, 0, false));
            }
            Object[] _allArrays = new Object[]{tbl, x, y};
            CobolTableSort.sort(5, _keys, _allArrays);
            /* Reconstruct group elements from sorted children */
            for (int _ri = 0; _ri < 5; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(2);
                tbl[_ri].set(String.format("%-1s", x[_ri] != null ? String.valueOf(x[_ri]) : "").substring(0, 1) + CobolDisplay.formatPic(y[_ri], 1, 0, false));
            }
            /* Rebuild parent group G after sort */
            {
                StringBuilder _pg = new StringBuilder();
                for (int _pi = 0; _pi < 5; _pi++) {
                    _pg.append(String.valueOf(tbl[_pi]));
                }
                g.set(String.format("%-10s", _pg.toString()).substring(0, 10));
            }
        }
        { /* Build group G from children before group access */
            String _gbuf = g.get();
            StringBuilder _sb = new StringBuilder(10);
            for (int _bi = 0; _bi < 5; _bi++) {
                if (tbl[_bi] != null) {
                    _sb.append(String.valueOf(tbl[_bi]));
                } else {
                    _sb.append(String.format("%-1s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 1));
                    _sb.append(CobolDisplay.formatPic(y[_bi], 1, 0, false));
                }
            }
            g.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g), String.valueOf("c5d4a3b2e1"))) {
            { /* Build group G from children before group access */
                String _gbuf = g.get();
                StringBuilder _sb = new StringBuilder(10);
                for (int _bi = 0; _bi < 5; _bi++) {
                    if (tbl[_bi] != null) {
                        _sb.append(String.valueOf(tbl[_bi]));
                    } else {
                        _sb.append(String.format("%-1s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 1));
                        _sb.append(CobolDisplay.formatPic(y[_bi], 1, 0, false));
                    }
                }
                g.set(_sb.toString());
            }
            CobolDisplay.display(String.valueOf(g));
        }
        { /* SORT TABLE TBL (tbl) — in-memory */
            CobolTableSort.SortKey[] _keys = new CobolTableSort.SortKey[]{new CobolTableSort.SortKey(tbl, true)};
            /* Build group elements from children before sort */
            for (int _ri = 0; _ri < 5; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(2);
                tbl[_ri].set(String.format("%-1s", x[_ri] != null ? String.valueOf(x[_ri]) : "").substring(0, 1) + CobolDisplay.formatPic(y[_ri], 1, 0, false));
            }
            Object[] _allArrays = new Object[]{tbl, x, y};
            CobolTableSort.sort(5, _keys, _allArrays);
            /* Reconstruct group elements from sorted children */
            for (int _ri = 0; _ri < 5; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(2);
                tbl[_ri].set(String.format("%-1s", x[_ri] != null ? String.valueOf(x[_ri]) : "").substring(0, 1) + CobolDisplay.formatPic(y[_ri], 1, 0, false));
            }
            /* Rebuild parent group G after sort */
            {
                StringBuilder _pg = new StringBuilder();
                for (int _pi = 0; _pi < 5; _pi++) {
                    _pg.append(String.valueOf(tbl[_pi]));
                }
                g.set(String.format("%-10s", _pg.toString()).substring(0, 10));
            }
        }
        { /* Build group G from children before group access */
            String _gbuf = g.get();
            StringBuilder _sb = new StringBuilder(10);
            for (int _bi = 0; _bi < 5; _bi++) {
                if (tbl[_bi] != null) {
                    _sb.append(String.valueOf(tbl[_bi]));
                } else {
                    _sb.append(String.format("%-1s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 1));
                    _sb.append(CobolDisplay.formatPic(y[_bi], 1, 0, false));
                }
            }
            g.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g), String.valueOf("a3b2c5d4e1"))) {
            { /* Build group G from children before group access */
                String _gbuf = g.get();
                StringBuilder _sb = new StringBuilder(10);
                for (int _bi = 0; _bi < 5; _bi++) {
                    if (tbl[_bi] != null) {
                        _sb.append(String.valueOf(tbl[_bi]));
                    } else {
                        _sb.append(String.format("%-1s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 1));
                        _sb.append(CobolDisplay.formatPic(y[_bi], 1, 0, false));
                    }
                }
                g.set(_sb.toString());
            }
            CobolDisplay.display(String.valueOf(g));
        }
        { /* SORT TABLE TBL (tbl) — in-memory */
            CobolTableSort.SortKey[] _keys = new CobolTableSort.SortKey[]{new CobolTableSort.SortKey(tbl, false)};
            /* Build group elements from children before sort */
            for (int _ri = 0; _ri < 5; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(2);
                tbl[_ri].set(String.format("%-1s", x[_ri] != null ? String.valueOf(x[_ri]) : "").substring(0, 1) + CobolDisplay.formatPic(y[_ri], 1, 0, false));
            }
            Object[] _allArrays = new Object[]{tbl, x, y};
            CobolTableSort.sort(5, _keys, _allArrays);
            /* Reconstruct group elements from sorted children */
            for (int _ri = 0; _ri < 5; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(2);
                tbl[_ri].set(String.format("%-1s", x[_ri] != null ? String.valueOf(x[_ri]) : "").substring(0, 1) + CobolDisplay.formatPic(y[_ri], 1, 0, false));
            }
            /* Rebuild parent group G after sort */
            {
                StringBuilder _pg = new StringBuilder();
                for (int _pi = 0; _pi < 5; _pi++) {
                    _pg.append(String.valueOf(tbl[_pi]));
                }
                g.set(String.format("%-10s", _pg.toString()).substring(0, 10));
            }
        }
        { /* Build group G from children before group access */
            String _gbuf = g.get();
            StringBuilder _sb = new StringBuilder(10);
            for (int _bi = 0; _bi < 5; _bi++) {
                if (tbl[_bi] != null) {
                    _sb.append(String.valueOf(tbl[_bi]));
                } else {
                    _sb.append(String.format("%-1s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 1));
                    _sb.append(CobolDisplay.formatPic(y[_bi], 1, 0, false));
                }
            }
            g.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g), String.valueOf("e1d4c5b2a3"))) {
            { /* Build group G from children before group access */
                String _gbuf = g.get();
                StringBuilder _sb = new StringBuilder(10);
                for (int _bi = 0; _bi < 5; _bi++) {
                    if (tbl[_bi] != null) {
                        _sb.append(String.valueOf(tbl[_bi]));
                    } else {
                        _sb.append(String.format("%-1s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 1));
                        _sb.append(CobolDisplay.formatPic(y[_bi], 1, 0, false));
                    }
                }
                g.set(_sb.toString());
            }
            CobolDisplay.display(String.valueOf(g));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc079SortTable");
            CobolProgram.registerCallAlias("prog", "RunMisc079SortTable");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Initialize OCCURS children of G from group VALUE
            {
                String _gv_g = g.get();
                for (int _i = 0; _i < 5; _i++) {
                    int _off = 0 + _i * 2 + 0;
                    if (x[_i] == null) x[_i] = new CobolString(1);
                    if (_off + 1 <= _gv_g.length()) x[_i].set(_gv_g.substring(_off, _off + 1));
                }
                for (int _i = 0; _i < 5; _i++) {
                    int _off = 0 + _i * 2 + 1;
                    if (_off + 1 <= _gv_g.length()) { try { y[_i] = Integer.parseInt(_gv_g.substring(_off, _off + 1).trim()); } catch (Exception _e) { y[_i] = 0; } }
                }
            }
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
        new RunMisc079SortTable().run();
    }
}
