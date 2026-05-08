package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunAccept003AcceptDateDayAndIntrinsicFunctions1 extends CobolProgram {
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
    private int ws_yyyymmdd = 0;
    private int ws_yyyyddd = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(17);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_yyyymmdd = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-YYYYMMDD").picDigits(9).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_yyyyddd = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-YYYYDDD").picDigits(8).build();


    private void para_main() {
        ws_yyyymmdd = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.acceptFrom("DATE YYYYMMDD")), 9));
        ws_yyyyddd = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.acceptFrom("DAY YYYYDDD")), 8));
        if (!CobolString.cobolEquals(String.valueOf(CobolIntrinsics.integer_of_date(ws_yyyymmdd)), String.valueOf(CobolIntrinsics.integer_of_day(ws_yyyyddd)))) {
            CobolDisplay.display("DIFFERENCES FOUND!");
            CobolDisplay.display("YYYYMMDD = " + CobolDisplay.formatPic(ws_yyyymmdd, 9, 0, false) + ", " + "YYYYDDD = " + CobolDisplay.formatPic(ws_yyyyddd, 8, 0, false));
            CobolDisplay.display("INTEGER-OF-DATE = " + CobolDisplay.formatPic(CobolIntrinsics.integer_of_date(ws_yyyymmdd), 9, 0, false) + ", " + "INTEGER-OF-DAY = " + CobolDisplay.formatPic(CobolIntrinsics.integer_of_day(ws_yyyyddd), 9, 0, false));
            return_code = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 9);
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunAccept003AcceptDateDayAndIntrinsicFunctions1");
            CobolProgram.registerCallAlias("prog", "RunAccept003AcceptDateDayAndIntrinsicFunctions1");
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
        new RunAccept003AcceptDateDayAndIntrinsicFunctions1().run();
    }
}
