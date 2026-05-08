package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions093BitShiftOperations extends CobolProgram {
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
    private short x1 = (short) 0;
    private short x2 = (short) 0;
    private short n1 = (short) 0;
    private short n2 = (short) 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(8);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_n1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("N1").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_n2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("N2").picDigits(4).build();


    private void para_main() {
        x2 = (short) CobolIntrinsics.toBigDecimal(10).shortValue();
        CobolDisplay.display("Using PIC XX COMP-X");
        x1 = (short) CobolIntrinsics.toBigDecimal((((int)(34) << (int)(5)))).shortValue();
        CobolDisplay.display(" x#22 B-LEFT  x#05   is " + CobolDisplay.formatPic(x1, 5, 0, false));
        x1 = (short) CobolIntrinsics.toBigDecimal((((int)(34) >> (int)(2)))).shortValue();
        CobolDisplay.display(" x#22 B-RIGHT x#02   is " + CobolDisplay.formatPic(x1, 5, 0, false));
        x1 = (short) CobolIntrinsics.toBigDecimal((((int)(34) << (int)(5)))).shortValue();
        CobolDisplay.display(" x#22 B-SHIFT-L x#05 is " + CobolDisplay.formatPic(x1, 5, 0, false));
        x1 = (short) CobolIntrinsics.toBigDecimal((((int)(34) >> (int)(2)))).shortValue();
        CobolDisplay.display(" x#22 B-SHIFT-R x#02 is " + CobolDisplay.formatPic(x1, 5, 0, false));
        x1 = (short) CobolIntrinsics.toBigDecimal((((int)(x2) << (int)(5)))).shortValue();
        CobolDisplay.display(CobolDisplay.formatPic(x2, 5, 0, false) + " B-LEFT  x#05   is " + CobolDisplay.formatPic(x1, 5, 0, false));
        x1 = (short) CobolIntrinsics.toBigDecimal((((int)(x2) >> (int)(2)))).shortValue();
        CobolDisplay.display(CobolDisplay.formatPic(x2, 5, 0, false) + " B-RIGHT x#02   is " + CobolDisplay.formatPic(x1, 5, 0, false));
        x2 = (short) CobolIntrinsics.toBigDecimal(30067).shortValue();
        x1 = (short) CobolIntrinsics.toBigDecimal((((((int)(x2) & 65535) << ((int)(4) % 16)) | (((int)(x2) & 65535) >>> (16 - (int)(4) % 16))) & 65535)).shortValue();
        CobolDisplay.display(CobolDisplay.formatPic(x2, 5, 0, false) + " B-SHIFT-LC 4   is " + CobolDisplay.formatPic(x1, 5, 0, false));
        x1 = (short) CobolIntrinsics.toBigDecimal((((((int)(x2) & 65535) >>> ((int)(4) % 16)) | (((int)(x2) & 65535) << (16 - (int)(4) % 16))) & 65535)).shortValue();
        CobolDisplay.display(CobolDisplay.formatPic(x2, 5, 0, false) + " B-SHIFT-RC 4   is " + CobolDisplay.formatPic(x1, 5, 0, false));
        n2 = (short) CobolIntrinsics.toBigDecimal(10).shortValue();
        CobolDisplay.display("Using PIC 9(4) COMP-5");
        n1 = (short) CobolIntrinsics.toBigDecimal((((int)(34) << (int)(5)))).shortValue();
        CobolDisplay.display(" x#22 B-LEFT  x#05   is " + CobolDisplay.formatPic(n1, 5, 0, false));
        n1 = (short) CobolIntrinsics.toBigDecimal((((int)(34) >> (int)(2)))).shortValue();
        CobolDisplay.display(" x#22 B-RIGHT x#02   is " + CobolDisplay.formatPic(n1, 5, 0, false));
        n1 = (short) CobolIntrinsics.toBigDecimal((((int)(34) << (int)(5)))).shortValue();
        CobolDisplay.display(" x#22 B-SHIFT-L x#05 is " + CobolDisplay.formatPic(n1, 5, 0, false));
        n1 = (short) CobolIntrinsics.toBigDecimal((((int)(34) >> (int)(2)))).shortValue();
        CobolDisplay.display(" x#22 B-SHIFT-R x#02 is " + CobolDisplay.formatPic(n1, 5, 0, false));
        n1 = (short) CobolIntrinsics.toBigDecimal((((int)(n2) << (int)(5)))).shortValue();
        CobolDisplay.display(CobolDisplay.formatPic(n2, 5, 0, false) + " B-LEFT  x#05   is " + CobolDisplay.formatPic(n1, 5, 0, false));
        n1 = (short) CobolIntrinsics.toBigDecimal((((int)(n2) >> (int)(2)))).shortValue();
        CobolDisplay.display(CobolDisplay.formatPic(n2, 5, 0, false) + " B-RIGHT x#02   is " + CobolDisplay.formatPic(n1, 5, 0, false));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunExtensions093BitShiftOperations");
            CobolProgram.registerCallAlias("prog", "RunExtensions093BitShiftOperations");
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
        new RunExtensions093BitShiftOperations().run();
    }
}
