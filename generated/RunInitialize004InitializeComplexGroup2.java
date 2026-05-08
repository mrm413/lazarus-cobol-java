package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunInitialize004InitializeComplexGroup2 extends CobolProgram {
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
    private CobolString g1 = new CobolString(8); // Group: G1
    private CobolString[] g2 = new CobolString[2]; // Group: G2
    private int[] x = new int[2];
    private CobolString[][] y = new CobolString[2][2];
    {
        for (int _d0 = 0; _d0 < 2; _d0++) {
            for (int _d1 = 0; _d1 < 2; _d1++) {
                y[_d0][_d1] = new CobolString(1);
            }
        }
    }
    private CobolString[] z = new CobolString[2];
    {
        for (int _d0 = 0; _d0 < 2; _d0++) {
            z[_d0] = new CobolString(1);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(8);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_y = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("Y").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_z = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("Z").build();


    private void para_main() {
        g1.setRefMod(1, 8, "0   0   ");
        for (int _iv0 = 0; _iv0 < 2; _iv0++) {
            x[_iv0] = 0;
            for (int _iv1 = 0; _iv1 < 2; _iv1++) {
                if (y[_iv0][_iv1] == null) y[_iv0][_iv1] = new CobolString(1);
                y[_iv0][_iv1].set("");
            }
            if (z[_iv0] == null) z[_iv0] = new CobolString(1);
            z[_iv0].set("");
            g2[_iv0] = null;
        }
        for (int _ri = 0; _ri < 2; _ri++) {
            x[_ri] = 0;
            for (int _rj = 0; _rj < 2; _rj++) {
                if (y[_ri][_rj] != null) y[_ri][_rj].set("");
            }
            if (z[_ri] != null) z[_ri].set("");
        }
        { /* Build group G1 from children before group access */
            String _gbuf = g1.get();
            StringBuilder _sb = new StringBuilder(8);
            for (int _bi = 0; _bi < 2; _bi++) {
                if (g2[_bi] != null) {
                    _sb.append(String.valueOf(g2[_bi]));
                } else {
                    _sb.append(CobolDisplay.formatPic(x[_bi], 1, 0, false));
                    for (int _bj = 0; _bj < 2; _bj++) {
                        _sb.append(String.format("%-1s", y[_bi][_bj] != null ? String.valueOf(y[_bi][_bj]) : "").substring(0, 1));
                    }
                    _sb.append(String.format("%-1s", z[_bi] != null ? String.valueOf(z[_bi]) : "").substring(0, 1));
                }
            }
            g1.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g1), String.valueOf("0   0   "))) {
            { /* Build group G1 from children before group access */
                String _gbuf = g1.get();
                StringBuilder _sb = new StringBuilder(8);
                for (int _bi = 0; _bi < 2; _bi++) {
                    if (g2[_bi] != null) {
                        _sb.append(String.valueOf(g2[_bi]));
                    } else {
                        _sb.append(CobolDisplay.formatPic(x[_bi], 1, 0, false));
                        for (int _bj = 0; _bj < 2; _bj++) {
                            _sb.append(String.format("%-1s", y[_bi][_bj] != null ? String.valueOf(y[_bi][_bj]) : "").substring(0, 1));
                        }
                        _sb.append(String.format("%-1s", z[_bi] != null ? String.valueOf(z[_bi]) : "").substring(0, 1));
                    }
                }
                g1.set(_sb.toString());
            }
            CobolDisplay.display("Test failed: " + String.valueOf(g1) + ".");
            CobolDisplay.display("  should be: " + "0   0   .");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunInitialize004InitializeComplexGroup2");
            CobolProgram.registerCallAlias("prog", "RunInitialize004InitializeComplexGroup2");
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
        new RunInitialize004InitializeComplexGroup2().run();
    }
}
