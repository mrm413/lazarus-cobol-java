package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc173RuntimeChecksWithinConditions extends CobolProgram {
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
    private CobolString mytab = new CobolString(46, "0102                                          "); // Group: mytab
    private int cb_var = 1;
    private int var2 = 2;
    private CobolString[] t15_prgm = new CobolString[2];
    {
        for (int _d0 = 0; _d0 < 2; _d0++) {
            t15_prgm[_d0] = new CobolString(8);
        }
    }
    private CobolString[] t16_prgm = new CobolString[2];
    {
        for (int _d0 = 0; _d0 < 2; _d0++) {
            t16_prgm[_d0] = new CobolString(8);
        }
    }
    private int[] t15_nrgm = new int[2];
    private int[] t16_nrgm = new int[2];

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(46);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_mytab = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 46).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("mytab").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cb_var = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("VAR").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("VAR2").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 32).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t15_prgm = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("T15-PRGM").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t16_prgm = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("T16-PRGM").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(36, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t15_nrgm = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(36, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("T15-NRGM").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t16_nrgm = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(40, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("T16-NRGM").build();


    private CobolString[] filler_3 = new CobolString[80]; // filler fallback (inferred array)
    private CobolString[] filler_4 = new CobolString[80]; // filler fallback (inferred array)
    private CobolString[] filler_5 = new CobolString[80]; // filler fallback (inferred array)
    private void para_main() {
        CobolString.setRefMod(t16_prgm, cb_var - 1, var2, String.valueOf("TESTME"));
        CobolString.safeIndex(t15_prgm, cb_var, 8).set(String.valueOf(CobolString.refMod(CobolString.safeIndex(t16_prgm, cb_var, 8), 1, var2)));
        if (filler_3[cb_var - 1] != null) filler_3[cb_var - 1].setRefMod(1, 8, String.format("%-8s", t15_prgm[cb_var - 1] != null ? String.valueOf(t15_prgm[cb_var - 1]) : "").substring(0, 8));
        if (CobolString.cobolEquals(String.valueOf(CobolString.safeIndex(t16_prgm, cb_var, 8)), String.valueOf(CobolString.safeIndex(t15_prgm, var2, 8)))) {
            CobolDisplay.display("WRONG RESULT OCCURS");
        }
        { /* Build group MYTAB from children before group access */
            String _gbuf = mytab.get();
            StringBuilder _sb = new StringBuilder(46);
            _sb.append(CobolDisplay.formatPic(cb_var, 2, 0, false));
            _sb.append(CobolDisplay.formatPic(var2, 2, 0, false));
            for (int _bi = 0; _bi < 2; _bi++) {
                if (filler_4[_bi] != null) {
                    _sb.append(String.valueOf(filler_4[_bi]));
                } else {
                    _sb.append(String.format("%-8s", t15_prgm[_bi] != null ? String.valueOf(t15_prgm[_bi]) : "").substring(0, 8));
                    _sb.append(String.format("%-8s", t16_prgm[_bi] != null ? String.valueOf(t16_prgm[_bi]) : "").substring(0, 8));
                }
            }
            for (int _bi = 0; _bi < 2; _bi++) {
                if (filler_5[_bi] != null) {
                    _sb.append(String.valueOf(filler_5[_bi]));
                } else {
                    _sb.append(CobolDisplay.formatPic(t15_nrgm[_bi], 4, 0, false));
                    _sb.append(CobolDisplay.formatPic(t16_nrgm[_bi], 1, 0, false));
                }
            }
            mytab.set(_sb.toString());
        }
        if (CobolString.cobolEquals(String.valueOf(CobolString.refMod(mytab, cb_var, var2)), String.valueOf(CobolString.refMod(mytab, var2, cb_var)))) {
            CobolDisplay.display("WRONG RESULT REFMOD");
        }
        mytab.setRefMod(1, 2, "00");
        cb_var = 0;
        mytab.setRefMod(3, 2, "00");
        var2 = 0;
        for (int _ri = 0; _ri < 2; _ri++) {
            if (t15_prgm[_ri] != null) t15_prgm[_ri].set("");
            if (t16_prgm[_ri] != null) t16_prgm[_ri].set("");
        }
        for (int _ri = 0; _ri < 2; _ri++) {
            t15_nrgm[_ri] = 0;
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc173RuntimeChecksWithinConditions");
            CobolProgram.registerCallAlias("prog", "RunMisc173RuntimeChecksWithinConditions");
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
        new RunMisc173RuntimeChecksWithinConditions().run();
    }
}
