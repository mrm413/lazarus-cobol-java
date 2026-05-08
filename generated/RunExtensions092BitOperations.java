package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions092BitOperations extends CobolProgram {
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
    private byte x1 = (byte) 0;
    private byte x2 = (byte) 0;
    private byte x3 = (byte) 0;
    private short xx1 = (short) 0;
    private short xx2 = (short) 0;
    private short xx3 = (short) 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(9);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xx1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("XX1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xx2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("XX2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xx3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("XX3").build();


    private void para_main() {
        xx2 = (short) CobolIntrinsics.toBigDecimal(2).shortValue();
        x2 = (byte) CobolIntrinsics.toBigDecimal(2).byteValue();
        xx3 = (short) CobolIntrinsics.toBigDecimal(4).shortValue();
        x3 = (byte) CobolIntrinsics.toBigDecimal(4).byteValue();
        CobolDisplay.display("Test using PIC XX COMP-X");
        xx1 = (short) CobolIntrinsics.toBigDecimal((((int)(xx2) | (int)(xx3)))).shortValue();
        CobolDisplay.display(CobolDisplay.formatPic(xx2, 5, 0, false) + " B-OR  " + CobolDisplay.formatPic(xx3, 5, 0, false) + " is " + CobolDisplay.formatPic(xx1, 5, 0, false));
        xx3 = (short) CobolIntrinsics.toBigDecimal(3).shortValue();
        xx1 = (short) CobolIntrinsics.toBigDecimal((((int)(xx2) ^ (int)(xx3)))).shortValue();
        CobolDisplay.display(CobolDisplay.formatPic(xx2, 5, 0, false) + " B-XOR " + CobolDisplay.formatPic(xx3, 5, 0, false) + " is " + CobolDisplay.formatPic(xx1, 5, 0, false));
        xx2 = (short) CobolIntrinsics.toBigDecimal(3).shortValue();
        xx1 = (short) CobolIntrinsics.toBigDecimal(1).shortValue();
        if ((((int)(xx2) & (int)(xx1))) == xx1) {
            CobolDisplay.display(CobolDisplay.formatPic(xx2, 5, 0, false) + " B-AND " + CobolDisplay.formatPic(xx1, 5, 0, false) + " = " + CobolDisplay.formatPic(xx1, 5, 0, false) + " TRUE");
        } else {
            CobolDisplay.display(CobolDisplay.formatPic(xx2, 5, 0, false) + " B-AND " + CobolDisplay.formatPic(xx1, 5, 0, false) + " = " + CobolDisplay.formatPic(xx1, 5, 0, false) + " FALSE");
        }
        xx1 = (short) CobolIntrinsics.toBigDecimal(((((int)(xx2) ^ (int)(xx3))) + 1)).shortValue();
        CobolDisplay.display("(" + CobolDisplay.formatPic(xx2, 5, 0, false) + " B-XOR " + CobolDisplay.formatPic(xx3, 5, 0, false) + ") + 1 is " + CobolDisplay.formatPic(xx1, 5, 0, false));
        xx1 = (short) CobolIntrinsics.toBigDecimal(((int)(xx2) ^ (int)(((xx3 + 1))))).shortValue();
        CobolDisplay.display(CobolDisplay.formatPic(xx2, 5, 0, false) + " B-XOR (" + CobolDisplay.formatPic(xx3, 5, 0, false) + " + 1) is " + CobolDisplay.formatPic(xx1, 5, 0, false));
        xx3 = (short) CobolIntrinsics.toBigDecimal(9).shortValue();
        xx2 = (short) CobolIntrinsics.toBigDecimal(14).shortValue();
        xx1 = (short) CobolIntrinsics.toBigDecimal(((int)(xx2) & (int)(xx3))).shortValue();
        CobolDisplay.display(CobolDisplay.formatPic(xx2, 5, 0, false) + " B-AND " + CobolDisplay.formatPic(xx3, 5, 0, false) + " is " + CobolDisplay.formatPic(xx1, 5, 0, false));
        xx1 = (short) CobolIntrinsics.toBigDecimal((((int)(5) | (int)(34)))).shortValue();
        CobolDisplay.display("x#05 B-OR x#22 is " + CobolDisplay.formatPic(xx1, 5, 0, false));
        xx1 = (short) CobolIntrinsics.toBigDecimal(~(int)(xx2)).shortValue();
        CobolDisplay.display("B-NOT " + CobolDisplay.formatPic(xx2, 5, 0, false) + " is " + CobolDisplay.formatPic(xx1, 5, 0, false));
        xx1 = (short) CobolIntrinsics.toBigDecimal(~(int)(34)).shortValue();
        CobolDisplay.display("B-NOT x#22 is " + CobolDisplay.formatPic(xx1, 5, 0, false));
        CobolDisplay.display("  -----");
        CobolDisplay.display("Test using PIC X COMP-X");
        x1 = (byte) CobolIntrinsics.toBigDecimal((((int)(x2) | (int)(x3)))).byteValue();
        CobolDisplay.display(CobolDisplay.formatPic(x2, 3, 0, false) + " B-OR  " + CobolDisplay.formatPic(x3, 3, 0, false) + " is " + CobolDisplay.formatPic(x1, 3, 0, false));
        x3 = (byte) CobolIntrinsics.toBigDecimal(3).byteValue();
        x1 = (byte) CobolIntrinsics.toBigDecimal((((int)(x2) ^ (int)(x3)))).byteValue();
        CobolDisplay.display(CobolDisplay.formatPic(x2, 3, 0, false) + " B-XOR " + CobolDisplay.formatPic(x3, 3, 0, false) + " is " + CobolDisplay.formatPic(x1, 3, 0, false));
        x2 = (byte) CobolIntrinsics.toBigDecimal(3).byteValue();
        x1 = (byte) CobolIntrinsics.toBigDecimal(1).byteValue();
        if ((((int)(x2) & (int)(x1))) == x1) {
            CobolDisplay.display(CobolDisplay.formatPic(x2, 3, 0, false) + " B-AND " + CobolDisplay.formatPic(x1, 3, 0, false) + " = " + CobolDisplay.formatPic(x1, 3, 0, false) + " TRUE");
        } else {
            CobolDisplay.display(CobolDisplay.formatPic(x2, 3, 0, false) + " B-AND " + CobolDisplay.formatPic(x1, 3, 0, false) + " = " + CobolDisplay.formatPic(x1, 3, 0, false) + " FALSE");
        }
        x1 = (byte) CobolIntrinsics.toBigDecimal(((((int)(x2) ^ (int)(x3))) + 1)).byteValue();
        CobolDisplay.display("(" + CobolDisplay.formatPic(x2, 3, 0, false) + " B-XOR " + CobolDisplay.formatPic(x3, 3, 0, false) + ") + 1 is " + CobolDisplay.formatPic(x1, 3, 0, false));
        x1 = (byte) CobolIntrinsics.toBigDecimal(((int)(x2) ^ (int)(((x3 + 1))))).byteValue();
        CobolDisplay.display(CobolDisplay.formatPic(x2, 3, 0, false) + " B-XOR (" + CobolDisplay.formatPic(x3, 3, 0, false) + " + 1) is " + CobolDisplay.formatPic(x1, 3, 0, false));
        x3 = (byte) CobolIntrinsics.toBigDecimal(9).byteValue();
        x2 = (byte) CobolIntrinsics.toBigDecimal(14).byteValue();
        x1 = (byte) CobolIntrinsics.toBigDecimal(((int)(x2) & (int)(x3))).byteValue();
        CobolDisplay.display(CobolDisplay.formatPic(x2, 3, 0, false) + " B-AND " + CobolDisplay.formatPic(x3, 3, 0, false) + " is " + CobolDisplay.formatPic(x1, 3, 0, false));
        x1 = (byte) CobolIntrinsics.toBigDecimal(~(int)(x2)).byteValue();
        CobolDisplay.display("B-NOT " + CobolDisplay.formatPic(x2, 3, 0, false) + " is " + CobolDisplay.formatPic(x1, 3, 0, false));
        x1 = (byte) CobolIntrinsics.toBigDecimal(~(int)(34)).byteValue();
        CobolDisplay.display("B-NOT x#22 is " + CobolDisplay.formatPic(x1, 3, 0, false));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunExtensions092BitOperations");
            CobolProgram.registerCallAlias("prog", "RunExtensions092BitOperations");
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
        new RunExtensions092BitOperations().run();
    }
}
