package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynValue010NumericEditedItem extends CobolProgram {
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
    private CobolString x_space = new CobolString(7);
    private CobolString x_123 = new CobolString(8, "123");
    private CobolString x_abc = new CobolString(7, "abc");
    private CobolString x_match = new CobolString(7, "*123.00");
    private CobolString x_overflow = new CobolString(7, "*123.000");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(36);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_space = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("X-SPACE").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_123 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("X-123").picDigits(5).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_abc = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("X-ABC").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_match = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(22, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("X-MATCH").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_overflow = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("X-OVERFLOW").picDigits(4).build();


    private void para_main() {
        x_123.set(CobolDisplay.formatEdited(320, "**999.00"));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynValue010NumericEditedItem");
            CobolProgram.registerCallAlias("prog", "SynValue010NumericEditedItem");
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
        new SynValue010NumericEditedItem().run();
    }
}
