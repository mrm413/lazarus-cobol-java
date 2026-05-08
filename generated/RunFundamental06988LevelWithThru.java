package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental06988LevelWithThru extends CobolProgram {
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
    private CobolString var_x = new CobolString(1);
    private int var_9 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(2);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("VAR-X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var_9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("VAR-9").picDigits(1).build();

    private CobolString x = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString t_y = new CobolString(256); // fallback
    private CobolString v9 = new CobolString(256); // fallback
    private CobolString v2_4 = new CobolString(256); // fallback

    private void para_main() {
        if (CobolString.cobolEquals(String.valueOf(var_x), "X")) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS X");
        }
        var_x.set("X");
        if (!(CobolString.cobolEquals(String.valueOf(var_x), "X"))) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS NOT X");
        }
        if (!((CobolString.cobolCompare(String.valueOf(var_x), "T") >= 0 && CobolString.cobolCompare(String.valueOf(var_x), "Y") <= 0))) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS NOT T-Y");
        }
        var_x.set("T");
        if (!((CobolString.cobolCompare(String.valueOf(var_x), "T") >= 0 && CobolString.cobolCompare(String.valueOf(var_x), "Y") <= 0))) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS NOT T-Y");
        }
        var_x.set(String.valueOf("Y"));
        if (!((CobolString.cobolCompare(String.valueOf(var_x), "T") >= 0 && CobolString.cobolCompare(String.valueOf(var_x), "Y") <= 0))) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS NOT T-Y");
        }
        var_x.set(String.valueOf("Z"));
        if ((CobolString.cobolCompare(String.valueOf(var_x), "T") >= 0 && CobolString.cobolCompare(String.valueOf(var_x), "Y") <= 0)) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS T-Y");
        }
        var_x.set(String.valueOf("A"));
        if ((CobolString.cobolCompare(String.valueOf(var_x), "T") >= 0 && CobolString.cobolCompare(String.valueOf(var_x), "Y") <= 0)) {
            CobolDisplay.display("NOT OK '" + String.valueOf(var_x) + "' IS T-Y");
        }
        if (var_9 == 9) {
            CobolDisplay.display("NOT OK '" + CobolDisplay.formatPic(var_9, 1, 0, false) + "' IS V9");
        }
        var_9 = 9;
        if (!(var_9 == 9)) {
            CobolDisplay.display("NOT OK '" + CobolDisplay.formatPic(var_9, 1, 0, false) + "' IS NOT V9");
        }
        var_9 = 2;
        if (var_9 == 9) {
            CobolDisplay.display("NOT OK '" + CobolDisplay.formatPic(var_9, 1, 0, false) + "' IS V9");
        }
        if (!((var_9 >= 2 && var_9 <= 4))) {
            CobolDisplay.display("NOT OK '" + CobolDisplay.formatPic(var_9, 1, 0, false) + "' IS NOT V2-4");
        }
        var_9 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(3), 1));
        if (!((var_9 >= 2 && var_9 <= 4))) {
            CobolDisplay.display("NOT OK '" + CobolDisplay.formatPic(var_9, 1, 0, false) + "' IS NOT V2-4");
        }
        var_9 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(4), 1));
        if (!((var_9 >= 2 && var_9 <= 4))) {
            CobolDisplay.display("NOT OK '" + CobolDisplay.formatPic(var_9, 1, 0, false) + "' IS NOT V2-4");
        }
        var_9 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(5), 1));
        if ((var_9 >= 2 && var_9 <= 4)) {
            CobolDisplay.display("NOT OK '" + CobolDisplay.formatPic(var_9, 1, 0, false) + "' IS V2-4");
        }
        var_9 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 1));
        if ((var_9 >= 2 && var_9 <= 4)) {
            CobolDisplay.display("NOT OK '" + CobolDisplay.formatPic(var_9, 1, 0, false) + "' IS V2-4");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental06988LevelWithThru");
            CobolProgram.registerCallAlias("prog", "RunFundamental06988LevelWithThru");
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
        new RunFundamental06988LevelWithThru().run();
    }
}
