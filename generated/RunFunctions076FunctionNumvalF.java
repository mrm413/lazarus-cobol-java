package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions076FunctionNumvalF extends CobolProgram {
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
    private CobolString x1 = new CobolString(12, " -0.1234E+4 ");
    private CobolString x2 = new CobolString(12, " .1234e-2 ");
    private CobolString bad1 = new CobolString(18, " -000E-12");
    private BigDecimal n = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(60);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 12).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 12).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bad1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(24, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("BAD1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_n = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(42, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("N").picDigits(18).picScale(1).signed(true).build();


    private void para_main() {
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval_f(x1)), 18, 10, true);
        if (n.compareTo(CobolIntrinsics.toBigDecimal(-1234)) != 0) {
            CobolDisplay.display("X1 '" + String.valueOf(x1) + "' : " + CobolDisplay.formatPic(n, 18, 10, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval_f(x2)), 18, 10, true);
        if (n.compareTo(new BigDecimal(".001234")) != 0) {
            CobolDisplay.display("X2 '" + String.valueOf(x2) + "' : " + CobolDisplay.formatPic(n, 18, 10, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval_f(bad1)), 18, 10, true);
        if (n.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            CobolDisplay.display("BAD1 '" + String.valueOf(bad1) + "' : " + CobolDisplay.formatPic(n, 18, 10, true, "LEADING"));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions076FunctionNumvalF");
            CobolProgram.registerCallAlias("prog", "RunFunctions076FunctionNumvalF");
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
        new RunFunctions076FunctionNumvalF().run();
    }
}
