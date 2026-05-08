package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental017AlphabeticUpperTest extends CobolProgram {
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
    private CobolString x = new CobolString(4, "AAAA");
    private CobolString xbyte = new CobolString(1);
    private CobolString filler_2 = new CobolString(3);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(8);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xbyte = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("XBYTE").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();


    private void para_main() {
        xbyte.set(String.valueOf("\r"));
        x.setRefMod(1, 1, String.format("%-1s", String.valueOf(xbyte)).substring(0, 1));
        if (CobolIntrinsics.isAlphabetic_upper(x)) {
            CobolDisplay.display("Fail - Not alphabetic upper");
        }
        xbyte.set(String.valueOf("A"));
        x.setRefMod(1, 1, String.format("%-1s", String.valueOf(xbyte)).substring(0, 1));
        if (!CobolIntrinsics.isAlphabetic_upper(x)) {
            CobolDisplay.display("Fail - Alphabetic upper");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental017AlphabeticUpperTest");
            CobolProgram.registerCallAlias("prog", "RunFundamental017AlphabeticUpperTest");
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
        new RunFundamental017AlphabeticUpperTest().run();
    }
}
