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

public class RunMisc082SortTableToplevel extends CobolProgram {
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
    private CobolString val = new CobolString(5, "43512");
    private CobolString[] tbl = new CobolString[5];

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(10);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_val = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("VAL").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tbl = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TBL").build();


    private void para_main() {
        { /* SORT TABLE TBL (tbl) — in-memory */
            /* Initialize TBL from REDEFINES target VAL */
            for (int _ri = 0; _ri < 5; _ri++) {
                if (tbl[_ri] == null) tbl[_ri] = new CobolString(1);
                int _off = _ri * 1;
                if (_off + 1 <= String.valueOf(val).length()) tbl[_ri].set(String.valueOf(val).substring(_off, _off + 1));
            }
            CobolTableSort.SortKey[] _keys = new CobolTableSort.SortKey[]{new CobolTableSort.SortKey(tbl, true)};
            Object[] _allArrays = new Object[]{tbl};
            CobolTableSort.sort(5, _keys, _allArrays);
            /* Rebuild REDEFINES target VAL from sorted TBL */
            {
                StringBuilder _rb = new StringBuilder();
                for (int _ri = 0; _ri < 5; _ri++) {
                    _rb.append(String.valueOf(tbl[_ri]));
                }
                val.set(String.format("%-5s", _rb.toString()).substring(0, 5));
            }
        }
        if (!CobolString.cobolEquals(String.valueOf(val), String.valueOf("12345"))) {
            CobolDisplay.display(String.valueOf(val));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc082SortTableToplevel");
            CobolProgram.registerCallAlias("prog", "RunMisc082SortTableToplevel");
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
        new RunMisc082SortTableToplevel().run();
    }
}
