package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions001FunctionAcos extends CobolProgram {
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
    private BigDecimal z = BigDecimal.ZERO;
    private BigDecimal p = BigDecimal.ZERO;
    private BigDecimal s = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(74);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_z = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 36).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("Z").picDigits(36).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(36, 19).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("P").picDigits(36).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_s = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(55, 19).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD_UNSIGNED).name("S").picDigits(36).picScale(1).build();


    private void para_main() {
        z = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.acos(new BigDecimal("-0.2345"))), 36, 35, true);
        if (z.compareTo(new BigDecimal("1.80750052110824343510150043852321026")) != 0) {
            CobolDisplay.display("DISPLAY: " + CobolDisplay.formatPic(z, 36, 35, true, "LEADING"));
        }
        p = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.acos(new BigDecimal("-0.2345"))), 36, 35, true);
        if (p.compareTo(new BigDecimal("1.80750052110824343510150043852321026")) != 0) {
            CobolDisplay.display("PACKED: " + CobolDisplay.formatPic(p, 36, 35, true, "LEADING"));
        }
        s = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.acos(new BigDecimal("-0.2345"))), 36, 35, false);
        if (s.compareTo(new BigDecimal("1.80750052110824343510150043852321026")) != 0) {
            CobolDisplay.display("COMP-6: " + CobolDisplay.formatPic(s, 36, 35, false));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions001FunctionAcos");
            CobolProgram.registerCallAlias("prog", "RunFunctions001FunctionAcos");
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
        new RunFunctions001FunctionAcos().run();
    }
}
