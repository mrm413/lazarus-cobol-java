package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunSubscripts007SearchAllWithOccursDependingOn extends CobolProgram {
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
    private int screen_idx = 1;
    // WORKING-STORAGE SECTION
    private int screen_akt = 0;
    private CobolString screen_tab = new CobolString(40); // Group: SCREEN-TAB
    private CobolString[] screen_entry = new CobolString[20]; // Group: SCREEN-ENTRY
    private CobolString[] screen_name = new CobolString[20];
    {
        for (int _d0 = 0; _d0 < 20; _d0++) {
            screen_name[_d0] = new CobolString(2);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(42);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_screen_akt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SCREEN-AKT").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_screen_tab = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 40).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("SCREEN-TAB").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_screen_entry = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 40).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("SCREEN-ENTRY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_screen_name = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("SCREEN-NAME").build();


    private void para_main() {
        /* SEARCH ALL SCREEN-ENTRY */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < screen_entry.length && !_found; _idx++) {
                screen_idx = _idx + 1;
                if (CobolString.cobolEquals(String.valueOf(CobolString.safeIndex(screen_name, screen_idx, 2)), String.valueOf("AB"))) {
                    CobolDisplay.display("FOUND");
                    _found = true;
                }
            }
            if (!_found) {
                CobolDisplay.display("END");
            }
        }
        screen_akt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 2));
        if (screen_name[1 - 1] == null) screen_name[1 - 1] = new CobolString(2);
        screen_name[1 - 1].set(String.valueOf("AB"));
        if (screen_entry[1 - 1] != null) screen_entry[1 - 1].setRefMod(1, 2, String.format("%-2s", screen_name[1 - 1] != null ? String.valueOf(screen_name[1 - 1]) : "").substring(0, 2));
        /* SEARCH ALL SCREEN-ENTRY */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < screen_entry.length && !_found; _idx++) {
                screen_idx = _idx + 1;
                if (CobolString.cobolEquals(String.valueOf(CobolString.safeIndex(screen_name, screen_idx, 2)), String.valueOf("AB"))) {
                    CobolDisplay.display("FOUND");
                    _found = true;
                }
            }
            if (!_found) {
                CobolDisplay.display("END");
            }
        }
        screen_akt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2), 2));
        if (screen_name[2 - 1] == null) screen_name[2 - 1] = new CobolString(2);
        screen_name[2 - 1].set(String.valueOf("CD"));
        if (screen_entry[2 - 1] != null) screen_entry[2 - 1].setRefMod(1, 2, String.format("%-2s", screen_name[2 - 1] != null ? String.valueOf(screen_name[2 - 1]) : "").substring(0, 2));
        /* SEARCH ALL SCREEN-ENTRY */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < screen_entry.length && !_found; _idx++) {
                screen_idx = _idx + 1;
                if (CobolString.cobolEquals(String.valueOf(CobolString.safeIndex(screen_name, screen_idx, 2)), String.valueOf("CD"))) {
                    CobolDisplay.display("FOUND");
                    _found = true;
                }
            }
            if (!_found) {
                CobolDisplay.display("END");
            }
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunSubscripts007SearchAllWithOccursDependingOn");
            CobolProgram.registerCallAlias("prog", "RunSubscripts007SearchAllWithOccursDependingOn");
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
        new RunSubscripts007SearchAllWithOccursDependingOn().run();
    }
}
