package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc167FloatShortWithSizeError extends CobolProgram {
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
    private short counter = (short) 0;
    private float floatvalue = 2f;
    private float lastfloatvalue = 0.0f;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(4);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_counter = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("counter").picDigits(4).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_floatvalue = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("floatValue").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_lastfloatvalue = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.FLOAT_SHORT).name("lastFloatValue").build();


    // SECTION: main
    private void para_main() {
        _exitSection = false;
        use_main();
    }

    private void use_main() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_main OF main");
        for (counter = 1; !(counter > 130); counter += 1) {
            CobolIntrinsics.clearException();
            { double _fv = Double.parseDouble(String.valueOf((floatvalue * 2)).trim()); if (Double.isInfinite(_fv) || Double.isNaN(_fv)) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
            if (!CobolIntrinsics.checkException("EC-SIZE-OVERFLOW")) {
                floatvalue = (float) Double.parseDouble(String.valueOf((floatvalue * 2)).trim());
            }
            if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
                CobolDisplay.display("SIZE ERROR, last value = " + CobolDisplay.formatFloatShort(floatvalue));
                break;
            } else {
                if ((float)(floatvalue) > (float)(lastfloatvalue)) {
                    lastfloatvalue = (float) Double.parseDouble(String.valueOf(floatvalue).trim());
                } else {
                    CobolDisplay.display("math ERROR, last value > current: " + CobolDisplay.formatFloatShort(lastfloatvalue) + " > " + CobolDisplay.formatFloatShort(floatvalue));
                    break;
                }
            }
        }
        if (counter != 127) {
            CobolDisplay.display("counter is " + CobolDisplay.formatPic(counter, 4, 0, true, "LEADING"));
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc167FloatShortWithSizeError");
            CobolProgram.registerCallAlias("prog", "RunMisc167FloatShortWithSizeError");
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
        new RunMisc167FloatShortWithSizeError().run();
    }
}
