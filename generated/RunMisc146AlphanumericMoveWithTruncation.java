package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc146AlphanumericMoveWithTruncation extends CobolProgram {
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
    private CobolString x_left = new CobolString(3);
    private CobolString x_right = new CobolString(3);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(6);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_left = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("x-left").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_right = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("x-right").justifiedRight(true).build();

    private CobolString _filler_001 = new CobolString(256); // fallback

    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_013 = new CobolString(256); // fallback
    private void para_main() {
        x_left.set(String.valueOf("1234"));
        _filler_003.set(String.valueOf("1234"));
        x_right.setRight(String.valueOf("1234"));
        if ((!CobolString.cobolEquals(String.valueOf(x_left), String.valueOf("123")) || !CobolString.cobolEquals(String.valueOf(x_right), String.valueOf("234")))) {
            CobolDisplay.display("error with \"1234\":");
            CobolDisplay.display(String.valueOf(x_left));
            CobolDisplay.display(String.valueOf(x_right));
        }
        x_left.set(String.valueOf("   3"));
        _filler_008.set(String.valueOf("   3"));
        x_right.setRight(String.valueOf("   3"));
        if ((!CobolString.cobolEquals(String.valueOf(x_left), String.valueOf("   ")) || !CobolString.cobolEquals(String.valueOf(x_right), String.valueOf("  3")))) {
            CobolDisplay.display("error with \"   3\":");
            CobolDisplay.display(String.valueOf(x_left));
            CobolDisplay.display(String.valueOf(x_right));
        }
        x_left.set(String.valueOf("3   "));
        _filler_013.set(String.valueOf("3   "));
        x_right.setRight(String.valueOf("3   "));
        if ((!CobolString.cobolEquals(String.valueOf(x_left), String.valueOf("3")) || !CobolString.cobolEquals(String.valueOf(x_right), String.valueOf("   ")))) {
            CobolDisplay.display("error with \"3   \":");
            CobolDisplay.display(String.valueOf(x_left));
            CobolDisplay.display(String.valueOf(x_right));
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc146AlphanumericMoveWithTruncation");
            CobolProgram.registerCallAlias("prog", "RunMisc146AlphanumericMoveWithTruncation");
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
        new RunMisc146AlphanumericMoveWithTruncation().run();
    }
}
