package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMove013OverlappingMove extends CobolProgram {
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
    private CobolString structure1 = new CobolString(15); // Group: STRUCTURE1
    private CobolString field1_1 = new CobolString(5);
    private CobolString field1_2 = new CobolString(10);
    private CobolString structure2 = structure1; // Group REDEFINES: STRUCTURE2
    private CobolString field2_1 = new CobolString(10);
    private CobolString field2_2 = new CobolString(5);
    private CobolString filler_2 = new CobolString(1);
    private CobolString[] field = new CobolString[7];
    {
        for (int _d0 = 0; _d0 < 7; _d0++) {
            field[_d0] = new CobolString(2);
        }
    }
    private CobolString[] fieldo = new CobolString[7];
    {
        for (int _d0 = 0; _d0 < 7; _d0++) {
            fieldo[_d0] = new CobolString(2);
        }
    }
    private int numvar = 1;
    private static final int const4 = 4;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(61);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_structure1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("STRUCTURE1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field1_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD1-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field1_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD1-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_structure2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("STRUCTURE2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field2_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD2-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field2_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(25, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD2-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(31, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(45, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fieldo = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(45, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELDO").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_numvar = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(59, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("NUMVAR").picDigits(2).build();

    private CobolString _filler_001 = new CobolString(256); // fallback

    private CobolString _filler_003 = new CobolString(256); // fallback
    private void para_main() {
        structure1.set(String.valueOf(field1_2));
        { /* Sync REDEFINES children of STRUCTURE1 */
            String _rv = structure1.get();
            int _rl = _rv.length();
            if (0 < _rl) { field2_1.set(_rv.substring(0, Math.min(10, _rl))); }
            if (10 < _rl) { field2_2.set(_rv.substring(10, Math.min(15, _rl))); }
        }
        if (field1_1 != null) field1_1.set(CobolString.refMod(structure1, 1, 5));
        if (field1_2 != null) field1_2.set(CobolString.refMod(structure1, 6, 10));
        field1_1.set(String.valueOf(field1_2));
        field1_2.set(String.valueOf(field1_1));
        _filler_003.set(String.valueOf(field1_1));
        field2_2.set(String.valueOf(field1_1));
        structure2.setRefMod(11, 5, String.format("%-5s", String.valueOf(field2_2)).substring(0, 5));
        field2_1.set(String.valueOf(field1_2));
        structure2.setRefMod(1, 10, String.format("%-10s", String.valueOf(field2_1)).substring(0, 10));
        field2_2.set(String.valueOf(field2_1));
        structure2.setRefMod(11, 5, String.format("%-5s", String.valueOf(field2_2)).substring(0, 5));
        field1_2.set(String.valueOf(CobolString.refMod(field2_1, 2, 5, structure2, 0)));
        structure1.setRefMod(5, 4, String.valueOf(CobolString.refMod(structure1, 2, 4)));
        structure1.setRefMod(6, 4, String.valueOf(CobolString.refMod(structure1, 2, 4)));
        structure1.setRefMod(3, 13, String.valueOf(CobolString.refMod(structure1, 1, numvar)));
        structure1.setRefMod(3, 13, String.valueOf(CobolString.refMod(structure1, numvar, 1)));
        structure1.setRefMod(1, numvar, String.valueOf(CobolString.refMod(structure1, 3, 13)));
        structure1.setRefMod(numvar, 1, String.valueOf(CobolString.refMod(structure1, 3, 13)));
        structure1.setRefMod(3, 2, String.valueOf(CobolString.refMod(structure1, const4, 2)));
        structure1.setRefMod(2, 4, String.valueOf(CobolString.refMod(structure1, 6, 4)));
        structure1.setRefMod(2, String.valueOf(CobolString.refMod(structure1, 6, 4)));
        structure1.setRefMod(13, 2, String.valueOf(field[6 - 1]));
        structure1.setRefMod(13, 2, String.valueOf(field[5 - 1]));
        structure1.setRefMod(13, 2, String.valueOf(CobolString.safeIndex(field, numvar, 2)));
        structure1.setRefMod(13, 2, String.valueOf(CobolString.safeIndex(field, const4, 2)));
        if (fieldo[1 - 1] == null) fieldo[1 - 1] = new CobolString(2);
        fieldo[1 - 1].set(String.valueOf(fieldo[1 - 1]));
        CobolString.safeIndex(fieldo, const4, 2).set(String.valueOf(CobolString.safeIndex(fieldo, const4, 2)));
        if (fieldo[2 - 1] == null) fieldo[2 - 1] = new CobolString(2);
        fieldo[2 - 1].set(String.valueOf(fieldo[1 - 1]));
        CobolString.safeIndex(fieldo, const4, 2).set(String.valueOf(fieldo[4 - 1]));
        if (fieldo[4 - 1] == null) fieldo[4 - 1] = new CobolString(2);
        fieldo[4 - 1].set(String.valueOf(CobolString.safeIndex(fieldo, const4, 2)));
        CobolString.safeIndex(fieldo, numvar, 2).set(String.valueOf(fieldo[4 - 1]));
        if (fieldo[4 - 1] == null) fieldo[4 - 1] = new CobolString(2);
        fieldo[4 - 1].set(String.valueOf(CobolString.safeIndex(fieldo, numvar, 2)));
        CobolString.safeIndex(fieldo, numvar, 2).set(String.valueOf(CobolString.safeIndex(fieldo, numvar, 2)));
        CobolString.setRefMod(fieldo, numvar - 1, 2, 1, String.valueOf(CobolString.refMod(CobolString.safeIndex(fieldo, numvar, 2), 1, 1)));
        CobolString.safeIndex(fieldo, numvar, 2).set(String.valueOf(CobolString.refMod(CobolString.safeIndex(fieldo, numvar, 2), 2, 1)));
        CobolString.safeIndex(fieldo, const4, 2).set(String.valueOf(CobolString.refMod(fieldo[4 - 1], 2, 1)));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynMove013OverlappingMove");
            CobolProgram.registerCallAlias("prog", "SynMove013OverlappingMove");
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
        new SynMove013OverlappingMove().run();
    }
}
