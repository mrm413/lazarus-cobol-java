package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunInitialize001InitializeOccursWithNumericEdited extends CobolProgram {
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
    private CobolString g1 = new CobolString(10); // Group: G1
    private CobolString[] g2 = new CobolString[5]; // Group: G2
    private CobolString[] x = new CobolString[5];
    {
        for (int _d0 = 0; _d0 < 5; _d0++) {
            x[_d0] = new CobolString(2);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(10);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("X").picDigits(2).build();


    private void para_main() {
        g1.setRefMod(1, 10, "0000000000");
        for (int _iv0 = 0; _iv0 < 5; _iv0++) {
            if (x[_iv0] == null) x[_iv0] = new CobolString(2);
            x[_iv0].set(CobolDisplay.formatEdited(0, "Z9"));
            g2[_iv0] = null;
        }
        for (int _ri = 0; _ri < 5; _ri++) {
            if (x[_ri] != null) x[_ri].set(CobolDisplay.formatEdited(0, "Z9"));
        }
        x[1 - 1].set(CobolDisplay.formatEdited(5, "Z9"));
        if (g2[1 - 1] != null) g2[1 - 1].setRefMod(1, 2, String.format("%-2s", x[1 - 1] != null ? String.valueOf(x[1 - 1]) : "").substring(0, 2));
        x[3 - 1].set(CobolDisplay.formatEdited(99, "Z9"));
        if (g2[3 - 1] != null) g2[3 - 1].setRefMod(1, 2, String.format("%-2s", x[3 - 1] != null ? String.valueOf(x[3 - 1]) : "").substring(0, 2));
        { /* Build group G1 from children before group access */
            String _gbuf = g1.get();
            StringBuilder _sb = new StringBuilder(10);
            for (int _bi = 0; _bi < 5; _bi++) {
                if (g2[_bi] != null) {
                    _sb.append(String.valueOf(g2[_bi]));
                } else {
                    _sb.append(String.format("%-2s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 2));
                }
            }
            g1.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g1), String.valueOf(" 5 099 0 0"))) {
            { /* Build group G1 from children before group access */
                String _gbuf = g1.get();
                StringBuilder _sb = new StringBuilder(10);
                for (int _bi = 0; _bi < 5; _bi++) {
                    if (g2[_bi] != null) {
                        _sb.append(String.valueOf(g2[_bi]));
                    } else {
                        _sb.append(String.format("%-2s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 2));
                    }
                }
                g1.set(_sb.toString());
            }
            CobolDisplay.display("MOVE \"" + String.valueOf(g1) + "\"");
        }
        g1.setRefMod(1, 10, "0000000000");
        for (int _iv1 = 0; _iv1 < 5; _iv1++) {
            if (x[_iv1] == null) x[_iv1] = new CobolString(2);
            x[_iv1].set(CobolDisplay.formatEdited(0, "Z9"));
            g2[_iv1] = null;
        }
        for (int _ri = 0; _ri < 5; _ri++) {
            if (x[_ri] != null) x[_ri].set(CobolDisplay.formatEdited(0, "Z9"));
        }
        { /* Build group G1 from children before group access */
            String _gbuf = g1.get();
            StringBuilder _sb = new StringBuilder(10);
            for (int _bi = 0; _bi < 5; _bi++) {
                if (g2[_bi] != null) {
                    _sb.append(String.valueOf(g2[_bi]));
                } else {
                    _sb.append(String.format("%-2s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 2));
                }
            }
            g1.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g1), String.valueOf(" 0 0 0 0 0"))) {
            { /* Build group G1 from children before group access */
                String _gbuf = g1.get();
                StringBuilder _sb = new StringBuilder(10);
                for (int _bi = 0; _bi < 5; _bi++) {
                    if (g2[_bi] != null) {
                        _sb.append(String.valueOf(g2[_bi]));
                    } else {
                        _sb.append(String.format("%-2s", x[_bi] != null ? String.valueOf(x[_bi]) : "").substring(0, 2));
                    }
                }
                g1.set(_sb.toString());
            }
            CobolDisplay.display("INIT \"" + String.valueOf(g1) + "\"");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunInitialize001InitializeOccursWithNumericEdited");
            CobolProgram.registerCallAlias("prog", "RunInitialize001InitializeOccursWithNumericEdited");
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
        new RunInitialize001InitializeOccursWithNumericEdited().run();
    }
}
