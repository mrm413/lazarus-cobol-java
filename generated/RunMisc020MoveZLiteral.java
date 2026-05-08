package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc020MoveZLiteral extends CobolProgram {
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
    private CobolString x = new CobolString(4);
    private CobolString xred = x; // Group REDEFINES: XRED
    private CobolString xbyte1 = new CobolString(1);
    private CobolString xbyte2 = new CobolString(1);
    private CobolString xbyte3 = new CobolString(1);
    private CobolString xbyte4 = new CobolString(1);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(8);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xred = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("XRED").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xbyte1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("XBYTE1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xbyte2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("XBYTE2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xbyte3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("XBYTE3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xbyte4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("XBYTE4").build();


    private void para_main() {
        x.set(String.valueOf("012\u0000"));
        { /* Sync REDEFINES children of X */
            String _rv = x.get();
            int _rl = _rv.length();
            if (0 < _rl) { xbyte1.set(_rv.substring(0, Math.min(1, _rl))); }
            if (1 < _rl) { xbyte2.set(_rv.substring(1, Math.min(2, _rl))); }
            if (2 < _rl) { xbyte3.set(_rv.substring(2, Math.min(3, _rl))); }
            if (3 < _rl) { xbyte4.set(_rv.substring(3, Math.min(4, _rl))); }
        }
        if ((((CobolString.cobolEquals(String.valueOf(xbyte1), String.valueOf("0")) && CobolString.cobolEquals(String.valueOf(xbyte2), String.valueOf("1"))) && CobolString.cobolEquals(String.valueOf(xbyte3), String.valueOf("2"))) && CobolString.cobolEquals(String.valueOf(xbyte4), String.valueOf("\u0000")))) {
            CobolDisplay.displayNoAdvancing("OK");
        } else {
            CobolDisplay.displayNoAdvancing("X = " + String.valueOf(CobolString.refMod(x, 1, 3)));
            if (CobolString.cobolEquals(String.valueOf(xbyte4), String.valueOf("\u0000"))) {
                CobolDisplay.display(" WITH LOW-VALUE");
            } else {
                CobolDisplay.display(" WITHOUT LOW-VALUE BUT '" + String.valueOf(xbyte4) + "'");
            }
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc020MoveZLiteral");
            CobolProgram.registerCallAlias("prog", "RunMisc020MoveZLiteral");
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
        new RunMisc020MoveZLiteral().run();
    }
}
