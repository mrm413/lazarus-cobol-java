package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc026OccursOnLevel01 extends CobolProgram {
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
    private CobolString[] x = new CobolString[10];

    // LINKAGE SECTION
    private CobolString x_all = new CobolString(10);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(10);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();

    private CobolString address = new CobolString(256); // fallback

    private void para_main() {
        if (x[1 - 1] == null) x[1 - 1] = new CobolString(1);
        x[1 - 1].set("");
        if (x[3 - 1] == null) x[3 - 1] = new CobolString(1);
        x[3 - 1].set("");
        if (x[5 - 1] == null) x[5 - 1] = new CobolString(1);
        x[5 - 1].set("");
        if (x[7 - 1] == null) x[7 - 1] = new CobolString(1);
        x[7 - 1].set("");
        if (x[2 - 1] == null) x[2 - 1] = new CobolString(1);
        x[2 - 1].set(String.valueOf(0));
        if (x[4 - 1] == null) x[4 - 1] = new CobolString(1);
        x[4 - 1].set(String.valueOf(0));
        if (x[6 - 1] == null) x[6 - 1] = new CobolString(1);
        x[6 - 1].set(String.valueOf(0));
        if (x[8 - 1] == null) x[8 - 1] = new CobolString(1);
        x[8 - 1].set(String.valueOf(0));
        address.set(String.valueOf(x[1 - 1]));
        if (!CobolString.cobolEquals(String.valueOf(x_all), String.valueOf(" 0 0 0 0AA"))) {
            System.err.println(String.valueOf(x_all));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc026OccursOnLevel01");
            CobolProgram.registerCallAlias("prog", "RunMisc026OccursOnLevel01");
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
        new RunMisc026OccursOnLevel01().run();
    }
}
