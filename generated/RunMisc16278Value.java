package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc16278Value extends CobolProgram {
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
    private static final String doggy = "Barky";
    private CobolString myrec = new CobolString(27); // Group: MYREC
    private int fld1 = 0;
    private CobolString fld2 = new CobolString(7);
    private CobolString[] fld3 = new CobolString[5];
    {
        for (int _d0 = 0; _d0 < 5; _d0++) {
            fld3[_d0] = new CobolString(2);
        }
    }
    private CobolString fld4 = new CobolString(4);
    private CobolString fld5 = new CobolString(4);
    private CobolString picx = new CobolString(3, "Abc");
    private static final int hun = 143;
    private static final int hun2 = 1855;
    private CobolString thedog = new CobolString(6, "Barky");
    private static final int div1 = 33;
    private static final int num2 = 9;

    // LINKAGE SECTION
    private CobolString xmyrec = new CobolString(27); // Group: XMYREC
    private int xfld1 = 0;
    private CobolString xfld2 = new CobolString(7);
    private CobolString[] xfld3 = new CobolString[5];
    {
        for (int _d0 = 0; _d0 < 5; _d0++) {
            xfld3[_d0] = new CobolString(2);
        }
    }
    private CobolString xfld4 = new CobolString(4);
    private CobolString xfld5 = new CobolString(4);
    private static final int xpos3 = 9;
    private static final int xpos4 = 11;
    private static final int xstrt4 = 19;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(36);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_myrec = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 27).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("MYREC").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FLD1").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_fld5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(23, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLD5").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_picx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("PICX").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_thedog = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("THEDOG").build();


    private void para_main() {
        CobolDisplay.display("DIV1 is " + String.valueOf(div1));
        CobolDisplay.display("HUN  is " + String.valueOf(hun));
        CobolDisplay.display("HUN2 is " + String.valueOf(hun2));
        fld1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(num2), 2));
        if (fld1 == 9) {
            CobolDisplay.display("NUM2 is " + String.valueOf(num2) + " left to right precedence.");
        } else {
            CobolDisplay.display("NUM2 is " + String.valueOf(num2) + " normal precedence.");
        }
        CobolDisplay.display("XFLD3 starts at " + String.valueOf(xpos3));
        CobolDisplay.display("XFLD4 starts at " + String.valueOf(xstrt4));
        CobolDisplay.display("XFLD4 starts at " + String.valueOf(xpos4));
        CobolDisplay.display("Your Dog's name is " + String.valueOf(doggy) + ";");
        CobolDisplay.display("The Dog's name is " + String.valueOf(thedog) + ";");
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc16278Value");
            CobolProgram.registerCallAlias("prog", "RunMisc16278Value");
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
        new RunMisc16278Value().run();
    }
}
