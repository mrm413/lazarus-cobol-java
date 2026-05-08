package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile040SystemRoutinesForFilesFilenameMapping extends CobolProgram {
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
    private CobolString fname = new CobolString(256);
    private CobolString ret = new CobolString(2, CobolDisplay.formatEdited(0, "-9"));
    private int fhandle = 0;
    private long offset = 0L;
    private int nbytes = 0;
    private CobolString read_buffer = new CobolString(10);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(284);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fname = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 256).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FNAME").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ret = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(256, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("RET").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fhandle = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(258, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FHANDLE").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_offset = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(262, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("OFFSET").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_nbytes = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(270, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("NBYTES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_read_buffer = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(274, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("READ-BUFFER").build();


    private void para_main() {
        CobolDisplay.display("RUN WITH " + String.valueOf(CobolIntrinsics.trim(fname, "TRAILING")));
        CobolProgram.call("CBL_OPEN_FILE", fname, 1, 0, 0, fhandle);
        if (return_code != 0) {
            CobolDisplay.display("error opening file ...");
            return_code = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 9);
            CobolIntrinsics.programExit(CobolProgram.return_code);
        }
        CobolProgram.call("CBL_CLOSE_FILE", fhandle);
        if (return_code != 0) {
            CobolDisplay.display("error closing file ..." + CobolDisplay.formatPic(return_code, 9, 0, true, "LEADING"));
            return_code = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 9);
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile040SystemRoutinesForFilesFilenameMapping");
            CobolProgram.registerCallAlias("prog", "RunFile040SystemRoutinesForFilesFilenameMapping");
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
        RunFile040SystemRoutinesForFilesFilenameMapping _pgm = new RunFile040SystemRoutinesForFilesFilenameMapping();
        if (args.length > 0) _pgm.fname.set(args[0]);
        _pgm.run();
    }
}
