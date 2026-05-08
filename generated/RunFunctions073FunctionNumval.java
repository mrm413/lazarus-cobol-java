package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions073FunctionNumval extends CobolProgram {
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
    private CobolString x1 = new CobolString(12, " -9876.1234 ");
    private CobolString x2 = new CobolString(18, " 19876.1234 CR");
    private CobolString x2b = new CobolString(18, " 19876.1234 cR");
    private CobolString x2c = new CobolString(18, " 19876.1234 cr");
    private CobolString x2d = new CobolString(18, " 19876.1234 Cr");
    private CobolString x3 = new CobolString(9, "-042.3240");
    private CobolString x4 = new CobolString(9, "+04232400");
    private CobolString x5 = new CobolString(9, " 00.00430");
    private CobolString bad1 = new CobolString(18, " 1. A-0B4.5");
    private CobolString bad2 = new CobolString(20, "+0@0%0=0*0!0&0^0)10-");
    private CobolString empt = new CobolString(20);
    private int csze = 0;
    private CobolString vsized = new CobolString(10); // Group: VSIZED
    private CobolString[] filler_1 = new CobolString[10];
    {
        for (int _d0 = 0; _d0 < 10; _d0++) {
            filler_1[_d0] = new CobolString(1);
        }
    }
    private BigDecimal n = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(193);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 12).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x2b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X2b").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x2c = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(48, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X2c").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x2d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(66, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X2d").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(84, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("X3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(93, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("X4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(102, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("X5").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bad1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(111, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("BAD1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bad2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(129, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("BAD2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_empt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(149, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EMPT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_csze = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(169, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("CSZE").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_vsized = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(170, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("VSIZED").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(170, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_n = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(180, 13).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("N").picDigits(13).picScale(1).signed(true).build();


    private void para_main() {
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(x1)), 13, 5, true);
        if (n.compareTo(new BigDecimal("-9876.1234")) != 0) {
            CobolDisplay.display("X1 '" + String.valueOf(x1) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(x2)), 13, 5, true);
        if (n.compareTo(new BigDecimal("-19876.1234")) != 0) {
            CobolDisplay.display("X2 '" + String.valueOf(x2) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        } else {
            if (((n.compareTo(CobolIntrinsics.numval(x2b)) != 0 || n.compareTo(CobolIntrinsics.numval(x2c)) != 0) || n.compareTo(CobolIntrinsics.numval(x2d)) != 0)) {
                CobolDisplay.display("NUMVAL not case-insensitive!");
            }
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(x3)), 13, 5, true);
        if (n.compareTo(new BigDecimal("-42.324")) != 0) {
            CobolDisplay.display("X3 '" + String.valueOf(x3) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(x4)), 13, 5, true);
        if (n.compareTo(CobolIntrinsics.toBigDecimal(4232400)) != 0) {
            CobolDisplay.display("X4 '" + String.valueOf(x4) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(x5)), 13, 5, true);
        if (n.compareTo(new BigDecimal(".0043")) != 0) {
            CobolDisplay.display("X5 '" + String.valueOf(x5) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(empt)), 13, 5, true);
        if (n.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            CobolDisplay.display("EMPT '" + String.valueOf(empt) + "' :  " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(vsized)), 13, 5, true);
        if (n.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0) {
            String _odo0;
            { /* ODO-slide build for VSIZED */
                String _gbuf = vsized.get();
                StringBuilder _sb = new StringBuilder(10);
                for (int _bi = 0; _bi < csze; _bi++) {
                    _sb.append(String.format("%-1s", ""));
                }
                String _built = _sb.toString();
                int _len = (int)((1) * csze);
                _odo0 = _built.substring(0, Math.min(_len, _built.length()));
            }
            CobolDisplay.display("VSIZED '" + _odo0 + "' :  " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(bad1)), 13, 5, true);
        if ((n.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0 && n.compareTo(new BigDecimal("-1.045")) != 0)) {
            CobolDisplay.display("BAD1 '" + String.valueOf(bad1) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        n = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(bad2)), 13, 5, true);
        if ((n.compareTo(CobolIntrinsics.toBigDecimal(0)) != 0 && n.compareTo(CobolIntrinsics.toBigDecimal(10)) != 0)) {
            CobolDisplay.display("BAD2 '" + String.valueOf(bad2) + "' : " + CobolDisplay.formatPic(n, 13, 5, true, "LEADING"));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions073FunctionNumval");
            CobolProgram.registerCallAlias("prog", "RunFunctions073FunctionNumval");
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
        new RunFunctions073FunctionNumval().run();
    }
}
