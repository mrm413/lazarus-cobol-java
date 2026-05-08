package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions074FunctionNumvalC extends CobolProgram {
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
    private CobolString x1 = new CobolString(14, " % -9876.1234 ");
    private CobolString x2 = new CobolString(18, " % 19,876.1234 DB");
    private CobolString x2b = new CobolString(18, " % 19,876.1234 db");
    private CobolString x2c = new CobolString(18, " % 19,876.1234 Db");
    private CobolString x2d = new CobolString(18, " % 19,876.1234 dB");
    private CobolString x3 = new CobolString(12, "% -9876.1234");
    private CobolString x4 = new CobolString(12, "019,876.1234");
    private CobolString bad1 = new CobolString(18, " -19,876.1234 %");
    private CobolString bad2 = new CobolString(18, "19,87,56.12.34 ");
    private CobolString bad3 = new CobolString(18, "+19,8756CR1234");
    private BigDecimal n = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(177);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x2b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(32, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X2b").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x2c = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(50, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X2c").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x2d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(68, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X2d").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(86, 12).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(98, 12).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bad1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(110, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("BAD1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bad2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(128, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("BAD2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bad3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(146, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("BAD3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_n = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(164, 13).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("N").picDigits(13).picScale(1).signed(true).build();


    private void para_main() {
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval_c(x1, "%")), 13, 5, true);
        if (n.compareTo(new BigDecimal("-9876.1234")) != 0) {
            CobolDisplay.display("X1 '" + String.valueOf(x1) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval_c(x2, "%")), 13, 5, true);
        if (n.compareTo(new BigDecimal("-19876.1234")) != 0) {
            CobolDisplay.display("X2 '" + String.valueOf(x2) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        } else {
            if (((n.compareTo(CobolIntrinsics.numval(x2b)) != 0 || n.compareTo(CobolIntrinsics.numval(x2c)) != 0) || n.compareTo(CobolIntrinsics.numval(x2d)) != 0)) {
                CobolDisplay.display("NUMVAL not case-insensitive!");
            }
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval_c(x3, "%")), 13, 5, true);
        if (n.compareTo(new BigDecimal("-9876.1234")) != 0) {
            CobolDisplay.display("X3 '" + String.valueOf(x3) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval_c(x4, "%")), 13, 5, true);
        if (n.compareTo(new BigDecimal("19876.1234")) != 0) {
            CobolDisplay.display("X4 '" + String.valueOf(x4) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(bad1)), 13, 5, true);
        if ((n.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0 && n.compareTo(new BigDecimal("-19876.1234")) != 0)) {
            CobolDisplay.display("BAD1 '" + String.valueOf(bad1) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(bad2)), 13, 5, true);
        if ((n.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0 && n.compareTo(new BigDecimal("198756.1234")) != 0)) {
            CobolDisplay.display("BAD2 '" + String.valueOf(bad2) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(bad3)), 13, 5, true);
        if ((n.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0 && n.compareTo(CobolIntrinsics.toBigDecimal(-198756)) != 0)) {
            CobolDisplay.display("BAD3 '" + String.valueOf(bad3) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions074FunctionNumvalC");
            CobolProgram.registerCallAlias("prog", "RunFunctions074FunctionNumvalC");
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
        new RunFunctions074FunctionNumvalC().run();
    }
}
