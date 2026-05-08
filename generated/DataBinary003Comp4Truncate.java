package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataBinary003Comp4Truncate extends CobolProgram {
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
    private BigDecimal random_origin_b = BigDecimal.ZERO;
    private BigDecimal random_target_b = BigDecimal.ZERO;
    private BigDecimal random_origin_d = BigDecimal.ZERO;
    private BigDecimal random_target_d = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(8);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_random_origin_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("RANDOM-ORIGIN-B").picDigits(3).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_random_target_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("RANDOM-TARGET-B").picDigits(2).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_random_origin_d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("RANDOM-ORIGIN-D").picDigits(3).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_random_target_d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("RANDOM-TARGET-D").picDigits(2).picScale(2).build();


    private void para_main() {
        random_origin_d = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.12")), 3, 2, false);
        random_target_d = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(random_origin_d), 2, 2, false);
        random_origin_b = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.12")), 3, 2, false);
        random_target_b = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(random_origin_b), 2, 2, false);
        if (random_origin_d.compareTo(random_origin_b) != 0) {
            CobolDisplay.display("ORIGIN 0.12 WRONG");
            CobolDisplay.display("DISPLAY: " + CobolDisplay.formatPic(random_origin_d, 3, 2, false) + " !=  BINARY : " + CobolDisplay.formatPic(random_origin_b, 3, 2, false));
        }
        if (random_target_d.compareTo(random_target_b) != 0) {
            CobolDisplay.display("TARGET  .12 WRONG");
            CobolDisplay.display("DISPLAY: " + CobolDisplay.formatPic(random_target_d, 2, 2, false) + " !=  BINARY : " + CobolDisplay.formatPic(random_target_b, 2, 2, false));
        } else {
            CobolDisplay.display("Ok with " + CobolDisplay.formatPic(random_target_d, 2, 2, false) + " == " + CobolDisplay.formatPic(random_target_b, 2, 2, false));
        }
        random_origin_d = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("9.85")), 3, 2, false);
        random_target_d = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(random_origin_d), 2, 2, false);
        random_origin_b = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("9.85")), 3, 2, false);
        random_target_b = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(random_origin_b), 2, 2, false);
        if (random_origin_d.compareTo(random_origin_b) != 0) {
            CobolDisplay.display("ORIGIN 9.85 WRONG");
            CobolDisplay.display("DISPLAY: " + CobolDisplay.formatPic(random_origin_d, 3, 2, false) + " !=  BINARY : " + CobolDisplay.formatPic(random_origin_b, 3, 2, false));
        }
        if (random_target_d.compareTo(random_target_b) != 0) {
            CobolDisplay.display("TARGET  .85 WRONG");
            CobolDisplay.display("DISPLAY: " + CobolDisplay.formatPic(random_target_d, 2, 2, false) + " !=  BINARY : " + CobolDisplay.formatPic(random_target_b, 2, 2, false));
        } else {
            CobolDisplay.display("Ok with " + CobolDisplay.formatPic(random_target_d, 2, 2, false) + " == " + CobolDisplay.formatPic(random_target_b, 2, 2, false));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataBinary003Comp4Truncate");
            CobolProgram.registerCallAlias("prog", "DataBinary003Comp4Truncate");
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
        new DataBinary003Comp4Truncate().run();
    }
}
