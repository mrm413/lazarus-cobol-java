package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental006MoveToEditedItem2 extends CobolProgram {
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
    private BigDecimal src_1 = new BigDecimal("-0.06");
    private BigDecimal src_2 = new BigDecimal("-0.07");
    private BigDecimal src_3 = new BigDecimal("-0.08");
    private BigDecimal src_4 = new BigDecimal("-0.09");
    private BigDecimal src_5 = new BigDecimal("-1.10");
    private CobolString edt_1 = new CobolString(5, CobolDisplay.formatEdited(0, "9(04)-"));
    private CobolString edt_2 = new CobolString(5, CobolDisplay.formatEdited(0, "9(04)+"));
    private CobolString edt_3 = new CobolString(5, CobolDisplay.formatEdited(0, "Z(04)+"));
    private CobolString edt_4 = new CobolString(6, CobolDisplay.formatEdited(0, "9(04)DB"));
    private CobolString edt_5 = new CobolString(6, CobolDisplay.formatEdited(0, "9(04)DB"));

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(47);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("SRC-1").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("SRC-2").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("SRC-3").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("SRC-4").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_src_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("SRC-5").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edt_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("EDT-1").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edt_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(25, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("EDT-2").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edt_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EDT-3").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edt_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(35, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("EDT-4").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_edt_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(41, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("EDT-5").picDigits(4).build();


    private void para_main() {
        edt_1.set(CobolDisplay.formatEdited(src_1, "9(04)-"));
        edt_2.set(CobolDisplay.formatEdited(src_2, "9(04)+"));
        edt_3.set(CobolDisplay.formatEdited(src_3, "Z(04)+"));
        edt_4.set(CobolDisplay.formatEdited(src_4, "9(04)DB"));
        edt_5.set(CobolDisplay.formatEdited(src_5, "9(04)DB"));
        CobolDisplay.display(">" + String.valueOf(edt_1) + "<");
        CobolDisplay.display(">" + String.valueOf(edt_2) + "<");
        CobolDisplay.display(">" + String.valueOf(edt_3) + "<");
        CobolDisplay.display(">" + String.valueOf(edt_4) + "<");
        CobolDisplay.display(">" + String.valueOf(edt_5) + "<");
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental006MoveToEditedItem2");
            CobolProgram.registerCallAlias("prog", "RunFundamental006MoveToEditedItem2");
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
        new RunFundamental006MoveToEditedItem2().run();
    }
}
