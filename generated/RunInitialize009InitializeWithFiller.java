package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunInitialize009InitializeWithFiller extends CobolProgram {
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
    private CobolString g1 = new CobolString(5); // Group: G1
    private int x = 0;
    private CobolString filler_1 = new CobolString(1);
    private int z = 0;
    private CobolString my_filler = new CobolString(6, "012345"); // Group: MY-FILLER
    private int filler_2 = 12345;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(11);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_z = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("Z").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_my_filler = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("MY-FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FILLER").picDigits(6).build();


    private void para_main() {
        g1.set("AAAAA");
        try { x = Integer.parseInt(CobolString.refMod(g1, 1, 2).trim()); } catch (Exception _ge) {}
        try { z = Integer.parseInt(CobolString.refMod(g1, 4, 2).trim()); } catch (Exception _ge) {}
        g1.setRefMod(1, 2, "00");
        x = 0;
        g1.setRefMod(4, 2, "00");
        z = 0;
        if (!CobolString.cobolEquals(String.valueOf(g1), String.valueOf("00A00"))) {
            { /* Build group G1 from children before group access */
                String _gbuf = g1.get();
                StringBuilder _sb = new StringBuilder(5);
                _sb.append(CobolDisplay.formatPic(x, 2, 0, false));
                _sb.append(_gbuf.substring(Math.min(2, _gbuf.length()), Math.min(3, _gbuf.length())));
                _sb.append(CobolDisplay.formatPic(z, 2, 0, false));
                g1.set(_sb.toString());
            }
            CobolDisplay.display("G1 (INIT): " + String.valueOf(g1));
        }
        g1.set("AAAAA");
        try { x = Integer.parseInt(CobolString.refMod(g1, 1, 2).trim()); } catch (Exception _ge) {}
        try { z = Integer.parseInt(CobolString.refMod(g1, 4, 2).trim()); } catch (Exception _ge) {}
        g1.setRefMod(1, 2, "00");
        x = 0;
        g1.setRefMod(3, 1, " ");
        g1.setRefMod(4, 2, "00");
        z = 0;
        if (!CobolString.cobolEquals(String.valueOf(g1), String.valueOf("00 00"))) {
            { /* Build group G1 from children before group access */
                String _gbuf = g1.get();
                StringBuilder _sb = new StringBuilder(5);
                _sb.append(CobolDisplay.formatPic(x, 2, 0, false));
                _sb.append(_gbuf.substring(Math.min(2, _gbuf.length()), Math.min(3, _gbuf.length())));
                _sb.append(CobolDisplay.formatPic(z, 2, 0, false));
                g1.set(_sb.toString());
            }
            CobolDisplay.display("G1 (INIT FILLER):" + String.valueOf(g1));
        }
        if (!CobolString.cobolEquals(String.valueOf(my_filler), String.valueOf("012345"))) {
            { /* Build group MY-FILLER from children before group access */
                String _gbuf = my_filler.get();
                StringBuilder _sb = new StringBuilder(6);
                _sb.append(_gbuf.substring(Math.min(0, _gbuf.length()), Math.min(6, _gbuf.length())));
                my_filler.set(_sb.toString());
            }
            CobolDisplay.display("MY-FILLER (INIT): " + String.valueOf(my_filler));
        }
        my_filler.setRefMod(1, 6, "000000");
        if (!CobolString.cobolEquals(String.valueOf(my_filler), String.valueOf("000000"))) {
            { /* Build group MY-FILLER from children before group access */
                String _gbuf = my_filler.get();
                StringBuilder _sb = new StringBuilder(6);
                _sb.append(_gbuf.substring(Math.min(0, _gbuf.length()), Math.min(6, _gbuf.length())));
                my_filler.set(_sb.toString());
            }
            CobolDisplay.display("MY-FILLER (INIT FILLER): " + String.valueOf(my_filler));
        }
        if (!CobolString.cobolEquals(String.valueOf(my_filler), String.valueOf("000000"))) {
            { /* Build group MY-FILLER from children before group access */
                String _gbuf = my_filler.get();
                StringBuilder _sb = new StringBuilder(6);
                _sb.append(_gbuf.substring(Math.min(0, _gbuf.length()), Math.min(6, _gbuf.length())));
                my_filler.set(_sb.toString());
            }
            CobolDisplay.display("MY-FILLER (INIT TO VAL): " + String.valueOf(my_filler));
        }
        my_filler.setRefMod(1, 6, "012345");
        if (!CobolString.cobolEquals(String.valueOf(my_filler), String.valueOf("012345"))) {
            { /* Build group MY-FILLER from children before group access */
                String _gbuf = my_filler.get();
                StringBuilder _sb = new StringBuilder(6);
                _sb.append(_gbuf.substring(Math.min(0, _gbuf.length()), Math.min(6, _gbuf.length())));
                my_filler.set(_sb.toString());
            }
            CobolDisplay.display("MY-FILLER (INIT FILLER TO VAL): " + String.valueOf(my_filler));
        }
        { StringBuilder _is = new StringBuilder(); int _il = (int)(3); for (int _i = 0; _i < _il; _i++) _is.append(' '); my_filler.setRefMod(2, _il, _is.toString()); }
        if (!CobolString.cobolEquals(String.valueOf(my_filler), String.valueOf("0   45"))) {
            { /* Build group MY-FILLER from children before group access */
                String _gbuf = my_filler.get();
                StringBuilder _sb = new StringBuilder(6);
                _sb.append(_gbuf.substring(Math.min(0, _gbuf.length()), Math.min(6, _gbuf.length())));
                my_filler.set(_sb.toString());
            }
            CobolDisplay.display("MY-FILLER (REF-MOD): " + String.valueOf(my_filler));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunInitialize009InitializeWithFiller");
            CobolProgram.registerCallAlias("prog", "RunInitialize009InitializeWithFiller");
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
        new RunInitialize009InitializeWithFiller().run();
    }
}
