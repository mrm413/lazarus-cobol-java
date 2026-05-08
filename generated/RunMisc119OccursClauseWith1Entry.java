package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc119OccursClauseWith1Entry extends CobolProgram {
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
    private CobolString d1 = new CobolString(3, "123"); // Group: D1
    private CobolString[] d1_entry = new CobolString[1];
    {
        for (int _d0 = 0; _d0 < 1; _d0++) {
            d1_entry[_d0] = new CobolString(3, "123");
        }
    }
    private CobolString d2 = new CobolString(3, "ABC"); // Group: D2
    private CobolString[] d2_entry = new CobolString[1];
    {
        for (int _d0 = 0; _d0 < 1; _d0++) {
            d2_entry[_d0] = new CobolString(3, "ABC");
        }
    }
    private CobolString d1tor = new CobolString(3, "456"); // Group: D1TOR
    private CobolString filler_1 = new CobolString(3, "456");
    private CobolString d1_r = d1tor; // Group REDEFINES: D1-R
    private CobolString[] d1_r_entry = new CobolString[1];
    {
        for (int _d0 = 0; _d0 < 1; _d0++) {
            d1_r_entry[_d0] = new CobolString(3);
        }
    }
    private CobolString d2tor = new CobolString(3, "DEF"); // Group: D2TOR
    private CobolString filler_4 = new CobolString(3, "DEF");
    private CobolString d2_r = d2tor; // Group REDEFINES: D2-R
    private CobolString[] d2_r_entry = new CobolString[1];
    {
        for (int _d0 = 0; _d0 < 1; _d0++) {
            d2_r_entry[_d0] = new CobolString(3);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(18);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("D1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d1_entry = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("D1-ENTRY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("D2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d2_entry = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("D2-ENTRY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d1tor = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("D1TOR").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_6 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d1_r = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("D1-R").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_7 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d1_r_entry = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("D1-R-ENTRY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d2tor = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("D2TOR").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_8 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d2_r = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("D2-R").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d2_r_entry = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("D2-R-ENTRY").build();


    private void para_main() {
        if (!CobolString.cobolEquals(String.valueOf(d1_entry[1 - 1]), String.valueOf("123"))) {
            CobolDisplay.display(String.valueOf(d1_entry[1 - 1]));
        }
        if (!CobolString.cobolEquals(String.valueOf(d2_entry[1 - 1]), String.valueOf("ABC"))) {
            CobolDisplay.display(String.valueOf(d2_entry[1 - 1]));
        }
        if (!CobolString.cobolEquals(String.valueOf(d1_r_entry[1 - 1]), String.valueOf("456"))) {
            CobolDisplay.display(String.valueOf(d1_r_entry[1 - 1]));
        }
        if (!CobolString.cobolEquals(String.valueOf(d2_r_entry[1 - 1]), String.valueOf("DEF"))) {
            CobolDisplay.display(String.valueOf(d2_r_entry[1 - 1]));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc119OccursClauseWith1Entry");
            CobolProgram.registerCallAlias("prog", "RunMisc119OccursClauseWith1Entry");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Initialize REDEFINES OCCURS children from D1TOR
            {
                String _redef_d1_r = d1tor.get();
                for (int _i = 0; _i < 1; _i++) {
                    int _off = _i * 3 + 0;
                    if (d1_r_entry[_i] == null) d1_r_entry[_i] = new CobolString(3);
                    if (_off + 3 <= _redef_d1_r.length()) d1_r_entry[_i].set(_redef_d1_r.substring(_off, _off + 3));
                }
            }
            // Initialize REDEFINES OCCURS children from D2TOR
            {
                String _redef_d2_r = d2tor.get();
                for (int _i = 0; _i < 1; _i++) {
                    int _off = _i * 3 + 0;
                    if (d2_r_entry[_i] == null) d2_r_entry[_i] = new CobolString(3);
                    if (_off + 3 <= _redef_d2_r.length()) d2_r_entry[_i].set(_redef_d2_r.substring(_off, _off + 3));
                }
            }
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
        new RunMisc119OccursClauseWith1Entry().run();
    }
}
