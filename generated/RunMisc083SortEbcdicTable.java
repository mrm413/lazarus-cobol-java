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

public class RunMisc083SortEbcdicTable extends CobolProgram {
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
    private CobolString z = new CobolString(10, "d4b2e1a3c5");
    private CobolString g = new CobolString(10); // Group: G
    private CobolString[] tbl = new CobolString[10]; // Group: TBL
    private CobolString[] x = new CobolString[10];
    {
        for (int _d0 = 0; _d0 < 10; _d0++) {
            x[_d0] = new CobolString(1);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(20);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_z = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("Z").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tbl = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TBL").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();


    private void para_main() {
        g.set(String.valueOf(z));
        { /* Sync OCCURS children of G after group MOVE */
            String _grp = g.get();
            int _grpLen = _grp.length();
            for (int _gi = 0; _gi < 10; _gi++) {
                int _base = 0 + _gi * 1;
                if (_base + 0 < _grpLen) { if (x[_gi] == null) x[_gi] = new CobolString(1); x[_gi].set(_grp.substring(_base + 0, Math.min(_base + 0 + 1, _grpLen))); }
                { int _gstart = _base; int _gend = Math.min(_base + 1, _grpLen); if (tbl[_gi] == null) tbl[_gi] = new CobolString(1); tbl[_gi].set(_grp.substring(Math.min(_gstart, _grpLen), _gend)); }
            }
        }
        { /* SORT TABLE TBL (tbl) — in-memory */
            CobolTableSort.SortKey[] _keys = new CobolTableSort.SortKey[]{new CobolTableSort.SortKey(x, true)};
            /* Build group elements from children before sort */
            for (int _ri = 0; _ri < 10; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(1);
                tbl[_ri].set(String.format("%-1s", x[_ri] != null ? String.valueOf(x[_ri]) : "").substring(0, 1));
            }
            Object[] _allArrays = new Object[]{tbl, x};
            CobolTableSort.sort(10, _keys, _allArrays, "EBCDIC");
            /* Reconstruct group elements from sorted children */
            for (int _ri = 0; _ri < 10; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(1);
                tbl[_ri].set(String.format("%-1s", x[_ri] != null ? String.valueOf(x[_ri]) : "").substring(0, 1));
            }
            /* Rebuild parent group G after sort */
            {
                StringBuilder _pg = new StringBuilder();
                for (int _pi = 0; _pi < 10; _pi++) {
                    _pg.append(String.valueOf(tbl[_pi]));
                }
                g.set(String.format("%-10s", _pg.toString()).substring(0, 10));
            }
        }
        { /* Build group G from children before group access */
            String _gbuf = g.get();
            StringBuilder _sb = new StringBuilder(10);
            for (int _bi = 0; _bi < 10; _bi++) {
                if (tbl[_bi] != null) {
                    _sb.append(String.valueOf(tbl[_bi]));
                } else {
                    _sb.append(String.format("%-1s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 1));
                }
            }
            g.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g), String.valueOf("abcde12345"))) {
            { /* Build group G from children before group access */
                String _gbuf = g.get();
                StringBuilder _sb = new StringBuilder(10);
                for (int _bi = 0; _bi < 10; _bi++) {
                    if (tbl[_bi] != null) {
                        _sb.append(String.valueOf(tbl[_bi]));
                    } else {
                        _sb.append(String.format("%-1s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 1));
                    }
                }
                g.set(_sb.toString());
            }
            CobolDisplay.display(String.valueOf(g));
        }
        g.set(String.valueOf(z));
        { /* Sync OCCURS children of G after group MOVE */
            String _grp = g.get();
            int _grpLen = _grp.length();
            for (int _gi = 0; _gi < 10; _gi++) {
                int _base = 0 + _gi * 1;
                if (_base + 0 < _grpLen) { if (x[_gi] == null) x[_gi] = new CobolString(1); x[_gi].set(_grp.substring(_base + 0, Math.min(_base + 0 + 1, _grpLen))); }
                { int _gstart = _base; int _gend = Math.min(_base + 1, _grpLen); if (tbl[_gi] == null) tbl[_gi] = new CobolString(1); tbl[_gi].set(_grp.substring(Math.min(_gstart, _grpLen), _gend)); }
            }
        }
        { /* SORT TABLE TBL (tbl) — in-memory */
            CobolTableSort.SortKey[] _keys = new CobolTableSort.SortKey[]{new CobolTableSort.SortKey(x, false)};
            /* Build group elements from children before sort */
            for (int _ri = 0; _ri < 10; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(1);
                tbl[_ri].set(String.format("%-1s", x[_ri] != null ? String.valueOf(x[_ri]) : "").substring(0, 1));
            }
            Object[] _allArrays = new Object[]{tbl, x};
            CobolTableSort.sort(10, _keys, _allArrays, "EBCDIC");
            /* Reconstruct group elements from sorted children */
            for (int _ri = 0; _ri < 10; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(1);
                tbl[_ri].set(String.format("%-1s", x[_ri] != null ? String.valueOf(x[_ri]) : "").substring(0, 1));
            }
            /* Rebuild parent group G after sort */
            {
                StringBuilder _pg = new StringBuilder();
                for (int _pi = 0; _pi < 10; _pi++) {
                    _pg.append(String.valueOf(tbl[_pi]));
                }
                g.set(String.format("%-10s", _pg.toString()).substring(0, 10));
            }
        }
        { /* Build group G from children before group access */
            String _gbuf = g.get();
            StringBuilder _sb = new StringBuilder(10);
            for (int _bi = 0; _bi < 10; _bi++) {
                if (tbl[_bi] != null) {
                    _sb.append(String.valueOf(tbl[_bi]));
                } else {
                    _sb.append(String.format("%-1s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 1));
                }
            }
            g.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g), String.valueOf("54321edcba"))) {
            { /* Build group G from children before group access */
                String _gbuf = g.get();
                StringBuilder _sb = new StringBuilder(10);
                for (int _bi = 0; _bi < 10; _bi++) {
                    if (tbl[_bi] != null) {
                        _sb.append(String.valueOf(tbl[_bi]));
                    } else {
                        _sb.append(String.format("%-1s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 1));
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
            CobolProgram.registerCallAlias("prog", "RunMisc083SortEbcdicTable");
            CobolProgram.registerCallAlias("prog", "RunMisc083SortEbcdicTable");
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
        new RunMisc083SortEbcdicTable().run();
    }
}
