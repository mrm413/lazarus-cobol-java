package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunInitialize006ValueForGroupItemWithValue extends CobolProgram {
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
    private CobolString g = new CobolString(36, "09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ"); // Group: G
    private CobolString[] g2 = new CobolString[3]; // Group: G2
    private int[] x = new int[3];
    {
    }
    private CobolString[] y = new CobolString[3]; // Group: Y
    private CobolString[][] y_rec = new CobolString[3][5]; // Group: Y-REC
    private int[][] y1 = new int[3][5];
    {
        for (int _d0 = 0; _d0 < 3; _d0++) {
            for (int _d1 = 0; _d1 < 5; _d1++) {
                y1[_d0][_d1] = (int)9;
            }
        }
    }
    private CobolString[][] y2 = new CobolString[3][5];
    {
        for (int _d0 = 0; _d0 < 3; _d0++) {
            for (int _d1 = 0; _d1 < 5; _d1++) {
                y2[_d0][_d1] = new CobolString(1, "Y");
            }
        }
    }
    private CobolString[] z = new CobolString[3];
    {
        for (int _d0 = 0; _d0 < 3; _d0++) {
            z[_d0] = new CobolString(1, "Z");
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(36);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 36).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 36).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_y = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("Y").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_y_rec = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("Y-REC").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_y1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("Y1").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_y2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("Y2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_z = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(11, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("Z").build();


    private void para_main() {
        { /* Build group G from children before group access */
            String _gbuf = g.get();
            StringBuilder _sb = new StringBuilder(36);
            for (int _bi = 0; _bi < 3; _bi++) {
                if (g2[_bi] != null) {
                    _sb.append(String.valueOf(g2[_bi]));
                } else {
                    _sb.append(CobolDisplay.formatPic(x[_bi], 1, 0, false));
                    for (int _bj = 0; _bj < 5; _bj++) {
                        _sb.append(CobolDisplay.formatPic(y1[_bi][_bj], 1, 0, false));
                        _sb.append(String.format("%-1s", y2[_bi][_bj] != null ? String.valueOf(y2[_bi][_bj]) : "").substring(0, 1));
                    }
                    _sb.append(String.format("%-1s", z[_bi] != null ? String.valueOf(z[_bi]) : "").substring(0, 1));
                }
            }
            g.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g), String.valueOf("09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ"))) {
            { /* Build group G from children before group access */
                String _gbuf = g.get();
                StringBuilder _sb = new StringBuilder(36);
                for (int _bi = 0; _bi < 3; _bi++) {
                    if (g2[_bi] != null) {
                        _sb.append(String.valueOf(g2[_bi]));
                    } else {
                        _sb.append(CobolDisplay.formatPic(x[_bi], 1, 0, false));
                        for (int _bj = 0; _bj < 5; _bj++) {
                            _sb.append(CobolDisplay.formatPic(y1[_bi][_bj], 1, 0, false));
                            _sb.append(String.format("%-1s", y2[_bi][_bj] != null ? String.valueOf(y2[_bi][_bj]) : "").substring(0, 1));
                        }
                        _sb.append(String.format("%-1s", z[_bi] != null ? String.valueOf(z[_bi]) : "").substring(0, 1));
                    }
                }
                g.set(_sb.toString());
            }
            CobolDisplay.display("Compile failed: " + String.valueOf(g) + ".");
            CobolDisplay.display("     should be: " + "09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ.");
        }
        g.setRefMod(1, 36, "00 0 0 0 0  00 0 0 0 0  00 0 0 0 0  ");
        for (int _iv0 = 0; _iv0 < 3; _iv0++) {
            x[_iv0] = 0;
            for (int _iv1 = 0; _iv1 < 5; _iv1++) {
                y1[_iv0][_iv1] = 9;
                if (y2[_iv0][_iv1] == null) y2[_iv0][_iv1] = new CobolString(1);
                y2[_iv0][_iv1].set("Y");
            }
            if (z[_iv0] == null) z[_iv0] = new CobolString(1);
            z[_iv0].set("Z");
            g2[_iv0] = null;
        }
        for (int _ri = 0; _ri < 3; _ri++) {
            x[_ri] = 0;
            for (int _rj = 0; _rj < 5; _rj++) {
                y1[_ri][_rj] = 0;
            }
            for (int _rj = 0; _rj < 5; _rj++) {
                if (y2[_ri][_rj] != null) y2[_ri][_rj].set("");
            }
            if (z[_ri] != null) z[_ri].set("");
        }
        { /* Build group G from children before group access */
            String _gbuf = g.get();
            StringBuilder _sb = new StringBuilder(36);
            for (int _bi = 0; _bi < 3; _bi++) {
                if (g2[_bi] != null) {
                    _sb.append(String.valueOf(g2[_bi]));
                } else {
                    _sb.append(CobolDisplay.formatPic(x[_bi], 1, 0, false));
                    for (int _bj = 0; _bj < 5; _bj++) {
                        _sb.append(CobolDisplay.formatPic(y1[_bi][_bj], 1, 0, false));
                        _sb.append(String.format("%-1s", y2[_bi][_bj] != null ? String.valueOf(y2[_bi][_bj]) : "").substring(0, 1));
                    }
                    _sb.append(String.format("%-1s", z[_bi] != null ? String.valueOf(z[_bi]) : "").substring(0, 1));
                }
            }
            g.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g), String.valueOf("00 0 0 0 0  00 0 0 0 0  00 0 0 0 0  "))) {
            { /* Build group G from children before group access */
                String _gbuf = g.get();
                StringBuilder _sb = new StringBuilder(36);
                for (int _bi = 0; _bi < 3; _bi++) {
                    if (g2[_bi] != null) {
                        _sb.append(String.valueOf(g2[_bi]));
                    } else {
                        _sb.append(CobolDisplay.formatPic(x[_bi], 1, 0, false));
                        for (int _bj = 0; _bj < 5; _bj++) {
                            _sb.append(CobolDisplay.formatPic(y1[_bi][_bj], 1, 0, false));
                            _sb.append(String.format("%-1s", y2[_bi][_bj] != null ? String.valueOf(y2[_bi][_bj]) : "").substring(0, 1));
                        }
                        _sb.append(String.format("%-1s", z[_bi] != null ? String.valueOf(z[_bi]) : "").substring(0, 1));
                    }
                }
                g.set(_sb.toString());
            }
            CobolDisplay.display("INITIALIZE failed: " + String.valueOf(g) + ".");
            CobolDisplay.display("        should be: " + "00 0 0 0 0  00 0 0 0 0  00 0 0 0 0  .");
        }
        g.setRefMod(1, 36, "Z9Y9Y9Y9Y9YZZ9Y9Y9Y9Y9YZZ9Y9Y9Y9Y9YZ");
        for (int _iv2 = 0; _iv2 < 3; _iv2++) {
            x[_iv2] = 0;
            for (int _iv3 = 0; _iv3 < 5; _iv3++) {
                y1[_iv2][_iv3] = 9;
                if (y2[_iv2][_iv3] == null) y2[_iv2][_iv3] = new CobolString(1);
                y2[_iv2][_iv3].set("Y");
            }
            if (z[_iv2] == null) z[_iv2] = new CobolString(1);
            z[_iv2].set("Z");
            g2[_iv2] = null;
        }
        { /* Build group G from children before group access */
            String _gbuf = g.get();
            StringBuilder _sb = new StringBuilder(36);
            for (int _bi = 0; _bi < 3; _bi++) {
                if (g2[_bi] != null) {
                    _sb.append(String.valueOf(g2[_bi]));
                } else {
                    _sb.append(CobolDisplay.formatPic(x[_bi], 1, 0, false));
                    for (int _bj = 0; _bj < 5; _bj++) {
                        _sb.append(CobolDisplay.formatPic(y1[_bi][_bj], 1, 0, false));
                        _sb.append(String.format("%-1s", y2[_bi][_bj] != null ? String.valueOf(y2[_bi][_bj]) : "").substring(0, 1));
                    }
                    _sb.append(String.format("%-1s", z[_bi] != null ? String.valueOf(z[_bi]) : "").substring(0, 1));
                }
            }
            g.set(_sb.toString());
        }
        if (!CobolString.cobolEquals(String.valueOf(g), String.valueOf("09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ"))) {
            { /* Build group G from children before group access */
                String _gbuf = g.get();
                StringBuilder _sb = new StringBuilder(36);
                for (int _bi = 0; _bi < 3; _bi++) {
                    if (g2[_bi] != null) {
                        _sb.append(String.valueOf(g2[_bi]));
                    } else {
                        _sb.append(CobolDisplay.formatPic(x[_bi], 1, 0, false));
                        for (int _bj = 0; _bj < 5; _bj++) {
                            _sb.append(CobolDisplay.formatPic(y1[_bi][_bj], 1, 0, false));
                            _sb.append(String.format("%-1s", y2[_bi][_bj] != null ? String.valueOf(y2[_bi][_bj]) : "").substring(0, 1));
                        }
                        _sb.append(String.format("%-1s", z[_bi] != null ? String.valueOf(z[_bi]) : "").substring(0, 1));
                    }
                }
                g.set(_sb.toString());
            }
            CobolDisplay.display("INIT VALUE failed: " + String.valueOf(g) + ".");
            CobolDisplay.display("        should be: " + "09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ09Y9Y9Y9Y9YZ.");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunInitialize006ValueForGroupItemWithValue");
            CobolProgram.registerCallAlias("prog", "RunInitialize006ValueForGroupItemWithValue");
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
        new RunInitialize006ValueForGroupItemWithValue().run();
    }
}
