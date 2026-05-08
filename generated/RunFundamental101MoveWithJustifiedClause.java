package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental101MoveWithJustifiedClause extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "JUST00";
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
    private CobolString ele = new CobolString(10);
    private CobolString cb_short = new CobolString(4, "ABC ");
    private CobolString cb_long = new CobolString(16, "ABCDEFGHIGKLMNOP");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(30);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ele = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ELE").justifiedRight(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cb_short = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("SHORT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cb_long = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("LONG").build();


    private void para_main() {
        ele.setRight(String.valueOf("ABC "));
        if (!CobolString.cobolEquals(String.valueOf(ele), String.valueOf("      ABC "))) {
            CobolDisplay.display("MOVE WITH SHORT FIELD JUSTIFIED HAS FAILED: " + "\"" + String.valueOf(ele) + "\"");
        }
        ele.setRight(String.valueOf("ABCDEFGHIGKLMNOP"));
        if (!CobolString.cobolEquals(String.valueOf(ele), String.valueOf("GHIGKLMNOP"))) {
            CobolDisplay.display("MOVE WITH LONG FIELD JUSTIFIED HAS FAILED: " + "\"" + String.valueOf(ele) + "\"");
        }
        ele.setRight(String.valueOf(cb_short));
        if (!CobolString.cobolEquals(String.valueOf(ele), String.valueOf("      ABC "))) {
            CobolDisplay.display("MOVE WITH SHORT FIELD JUSTIFIED HAS FAILED: " + "\"" + String.valueOf(ele) + "\"");
        }
        ele.setRight(String.valueOf(cb_long));
        if (!CobolString.cobolEquals(String.valueOf(ele), String.valueOf("GHIGKLMNOP"))) {
            CobolDisplay.display("MOVE WITH LONG FIELD JUSTIFIED HAS FAILED: " + "\"" + String.valueOf(ele) + "\"");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("JUST00", "", "JUST00.cob");
        CobolProgram.pushActive("JUST00");
        try {
            CobolProgram.registerCallAlias("JUST00", "RunFundamental101MoveWithJustifiedClause");
            CobolProgram.registerCallAlias("just00", "RunFundamental101MoveWithJustifiedClause");
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
        new RunFundamental101MoveWithJustifiedClause().run();
    }
}
