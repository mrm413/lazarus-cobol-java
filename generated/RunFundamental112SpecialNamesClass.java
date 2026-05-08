package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental112SpecialNamesClass extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "TSTCLASS";
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
    private CobolString alpha = new CobolString(1);
    private int num_1 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(2);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_alpha = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ALPHA").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_num_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("NUM-1").picDigits(1).build();


    private void para_main() {
        alpha.set(String.valueOf("3"));
        if (CobolIntrinsics.isHexa(alpha)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR 1");
        }
        if (CobolIntrinsics.isOdd(alpha)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR 2");
        }
        num_1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2), 1));
        if (CobolIntrinsics.isEven(num_1)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR 3");
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("TSTCLASS", "", "TSTCLASS.cob");
        CobolProgram.pushActive("TSTCLASS");
        try {
            CobolProgram.registerCallAlias("TSTCLASS", "RunFundamental112SpecialNamesClass");
            CobolProgram.registerCallAlias("tstclass", "RunFundamental112SpecialNamesClass");
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
        new RunFundamental112SpecialNamesClass().run();
    }
}
