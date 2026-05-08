package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc071StringWithSubscriptReference extends CobolProgram {
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
    private CobolString g = new CobolString(9); // Group: G
    private CobolString[] x = new CobolString[3];
    {
        for (int _d0 = 0; _d0 < 3; _d0++) {
            x[_d0] = new CobolString(3);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(9);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();


    private void para_main() {
        g.set(String.valueOf(" "));
        { /* Sync OCCURS children of G after group MOVE */
            String _grp = g.get();
            int _grpLen = _grp.length();
            for (int _gi = 0; _gi < 3; _gi++) {
                int _base = 0 + _gi * 3;
                if (_base + 0 < _grpLen) { if (x[_gi] == null) x[_gi] = new CobolString(3); x[_gi].set(_grp.substring(_base + 0, Math.min(_base + 0 + 3, _grpLen))); }
            }
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("abc");
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), x[2 - 1].length()); x[2 - 1].setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        { /* Build group G from children before group access */
            String _gbuf = g.get();
            StringBuilder _sb = new StringBuilder(9);
            for (int _bi = 0; _bi < 3; _bi++) {
                _sb.append(String.format("%-3s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 3));
            }
            g.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g), String.valueOf("   abc   "))) {
            CobolDisplay.display(String.valueOf(x[1 - 1]));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc071StringWithSubscriptReference");
            CobolProgram.registerCallAlias("prog", "RunMisc071StringWithSubscriptReference");
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
        new RunMisc071StringWithSubscriptReference().run();
    }
}
