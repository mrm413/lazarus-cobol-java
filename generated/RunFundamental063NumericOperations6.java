package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental063NumericOperations6 extends CobolProgram {
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
    private BigDecimal p_field1 = BigDecimal.ZERO;
    private BigDecimal p_field2 = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(4);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_field1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P-FIELD1").picDigits(2).picScale(-3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p_field2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P-FIELD2").picDigits(2).picScale(3).build();


    private void para_main() {
        p_field1 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(5000), 2, 3, false).abs();
        p_field1 = CobolIntrinsics.truncateToScaledField(p_field1.add(CobolIntrinsics.toBigDecimal(5)), 2, 3, false);
        if (p_field1.compareTo(CobolIntrinsics.toBigDecimal(5000)) != 0) {
            CobolDisplay.display("Error: Add 5 to PIC 99PPP.");
        }
        p_field1 = CobolIntrinsics.truncateToScaledField(p_field1.add(CobolIntrinsics.toBigDecimal(5000)), 2, 3, false);
        if (p_field1.compareTo(CobolIntrinsics.toBigDecimal(10000)) != 0) {
            CobolDisplay.display("Error: Add 5000 to PIC 99PPP.");
        }
        p_field2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.00055")), 2, 3, true).abs();
        p_field2 = CobolIntrinsics.truncateToScaledField(p_field2.add(CobolIntrinsics.toBigDecimal(new BigDecimal("0.00033"))), 2, 3, true);
        if (p_field2.compareTo(new BigDecimal("0.00088")) != 0) {
            CobolDisplay.display("Error: Add 0.00033 to PIC PPP99.");
        }
        p_field2 = CobolIntrinsics.truncateToScaledField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.00055")), 2, 3, true).abs();
        p_field2 = CobolIntrinsics.truncateToScaledField(p_field2.add(CobolIntrinsics.toBigDecimal(new BigDecimal("0.00300"))), 2, 3, true);
        if (p_field2.compareTo(new BigDecimal("0.00055")) != 0) {
            CobolDisplay.display("Error: Add 0.00300 to PIC PPP99.");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental063NumericOperations6");
            CobolProgram.registerCallAlias("prog", "RunFundamental063NumericOperations6");
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
        new RunFundamental063NumericOperations6().run();
    }
}
