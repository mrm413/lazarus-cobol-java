package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc124PictureWithEditMask extends CobolProgram {
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
    private CobolString tst = new CobolString(28, "018536.23218536.23          "); // Group: TST
    private BigDecimal dept_sub = new BigDecimal("18536.232");
    private BigDecimal dept_cost_ytd = new BigDecimal("18536.232");
    private CobolString dl_prod_cost = new CobolString(10, CobolDisplay.formatEdited(0, "$$$,$$9.99"));
    private CobolString wflt = new CobolString(10, CobolDisplay.formatEdited(0, "$$$,$$9.99"));

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(38);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tst = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 28).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TST").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dept_sub = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("DEPT-SUB").picDigits(10).picScale(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dept_cost_ytd = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("DEPT-COST-YTD").picDigits(8).picScale(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dl_prod_cost = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DL-PROD-COST").picDigits(8).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_wflt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("WFLT").picDigits(8).build();


    private void para_main() {
        wflt.set(CobolDisplay.formatEdited(new BigDecimal("18536.23"), "$$$,$$9.99"));
        CobolDisplay.display("WFLT IS " + String.valueOf(wflt));
        dl_prod_cost.set(CobolDisplay.formatEdited(dept_cost_ytd.multiply(CobolIntrinsics.toBigDecimal(1)), "$$$,$$9.99"));
        CobolDisplay.display("COST IS " + String.valueOf(dl_prod_cost));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc124PictureWithEditMask");
            CobolProgram.registerCallAlias("prog", "RunMisc124PictureWithEditMask");
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
        new RunMisc124PictureWithEditMask().run();
    }
}
