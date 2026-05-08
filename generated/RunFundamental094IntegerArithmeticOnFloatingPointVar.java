package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental094IntegerArithmeticOnFloatingPointVar extends CobolProgram {
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
    private float x = 123.456f;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("x").build();


    private void para_main() {
        x = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(x).add(CobolIntrinsics.toBigDecimal(360))).trim());
        if (CobolIntrinsics.toBigDecimal(x).compareTo(new BigDecimal("483.456")) != 0) {
            CobolDisplay.display("ADD wrong: " + CobolDisplay.formatFloatShort(x));
            x = (float) Double.parseDouble(String.valueOf(new BigDecimal("483.456")).trim());
        }
        x = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(x).subtract(CobolIntrinsics.toBigDecimal(360))).trim());
        if (CobolIntrinsics.toBigDecimal(x).compareTo(new BigDecimal("123.456")) != 0) {
            CobolDisplay.display("SUBTRACT wrong: " + CobolDisplay.formatFloatShort(x));
            x = (float) Double.parseDouble(String.valueOf(new BigDecimal("123.456")).trim());
        }
        x = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.toBigDecimal(x).divide(CobolIntrinsics.toBigDecimal(2), 18, RoundingMode.HALF_UP)).trim());
        if (CobolIntrinsics.toBigDecimal(x).compareTo(new BigDecimal("61.728")) != 0) {
            CobolDisplay.display("DIVIDE wrong: " + CobolDisplay.formatFloatShort(x));
            x = (float) Double.parseDouble(String.valueOf(new BigDecimal("61.728")).trim());
        }
        x = (float) Double.parseDouble(String.valueOf(2 * x).trim());
        if (CobolIntrinsics.toBigDecimal(x).compareTo(new BigDecimal("123.456")) != 0) {
            CobolDisplay.display("MULTIPLY wrong: " + CobolDisplay.formatFloatShort(x));
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental094IntegerArithmeticOnFloatingPointVar");
            CobolProgram.registerCallAlias("prog", "RunFundamental094IntegerArithmeticOnFloatingPointVar");
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
        new RunFundamental094IntegerArithmeticOnFloatingPointVar().run();
    }
}
