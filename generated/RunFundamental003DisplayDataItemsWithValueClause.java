package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental003DisplayDataItemsWithValueClause extends CobolProgram {
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
    private CobolString x_abc = new CobolString(3, "abc");
    private int x_123 = 123;
    private int x_p123 = 123;
    private int x_n123 = -123;
    private BigDecimal x_12_3 = new BigDecimal("12.3");
    private BigDecimal x_p12_3 = new BigDecimal("12.3");
    private BigDecimal x_n12_3 = new BigDecimal("-12.3");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(21);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_abc = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X-ABC").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_123 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X-123").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_p123 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X-P123").picDigits(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_n123 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X-N123").picDigits(3).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_12_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X-12-3").picDigits(3).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_p12_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X-P12-3").picDigits(3).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_n12_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("X-N12-3").picDigits(3).picScale(1).signed(true).build();


    private void para_main() {
        CobolDisplay.display(String.valueOf(x_abc));
        CobolDisplay.display(CobolDisplay.formatPic(x_123, 3, 0, false));
        CobolDisplay.display(CobolDisplay.formatPic(x_p123, 3, 0, true, "LEADING"));
        CobolDisplay.display(CobolDisplay.formatPic(x_n123, 3, 0, true, "LEADING"));
        CobolDisplay.display(CobolDisplay.formatPic(x_12_3, 3, 1, false));
        CobolDisplay.display(CobolDisplay.formatPic(x_p12_3, 3, 1, true, "LEADING"));
        CobolDisplay.display(CobolDisplay.formatPic(x_n12_3, 3, 1, true, "LEADING"));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental003DisplayDataItemsWithValueClause");
            CobolProgram.registerCallAlias("prog", "RunFundamental003DisplayDataItemsWithValueClause");
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
        new RunFundamental003DisplayDataItemsWithValueClause().run();
    }
}
