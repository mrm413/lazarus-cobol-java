package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataDisplay003DisplayUnsigned extends CobolProgram {
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
    private byte x_bcu = (byte) 0;
    private short x_bsu = (short) 0;
    private long x_biu = 0L;
    private long x_blu = 0L;
    private long x_bdu = 0L;
    private short x_us = (short) 0;
    private int x_ui = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(7);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_bcu = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X-BCU").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_bsu = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X-BSU").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_biu = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X-BIU").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_blu = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X-BLU").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_bdu = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X-BDU").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_us = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X-US").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_ui = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("X-UI").build();


    private void para_main() {
        x_bcu = (byte) CobolIntrinsics.toBigDecimal(127).byteValue();
        CobolDisplay.display(CobolDisplay.formatPic(x_bcu, 3, 0, false));
        x_bcu = (byte) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(x_bcu).add(CobolIntrinsics.toBigDecimal(1))).byteValue();
        CobolDisplay.display(CobolDisplay.formatPic(x_bcu, 3, 0, false));
        x_bsu = (short) CobolIntrinsics.toBigDecimal(32767).shortValue();
        CobolDisplay.display(CobolDisplay.formatPic(x_bsu, 5, 0, false));
        x_bsu = (short) CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(x_bsu).add(CobolIntrinsics.toBigDecimal(1))).shortValue();
        CobolDisplay.display(CobolDisplay.formatPic(x_bsu, 5, 0, false));
        x_biu = CobolIntrinsics.toBigDecimal(2147483647).longValue();
        CobolDisplay.display(CobolDisplay.formatPic(x_biu, 10, 0, false));
        x_biu = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(x_biu).add(CobolIntrinsics.toBigDecimal(1))).longValue();
        CobolDisplay.display(CobolDisplay.formatPic(x_biu, 10, 0, false));
        x_blu = CobolIntrinsics.toBigDecimal(2147483647).longValue();
        CobolDisplay.display(CobolDisplay.formatPic(x_blu, 10, 0, false));
        x_blu = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(x_blu).add(CobolIntrinsics.toBigDecimal(1))).longValue();
        CobolDisplay.display(CobolDisplay.formatPic(x_blu, 10, 0, false));
        x_bdu = CobolIntrinsics.toBigDecimal("9223372036854775807").longValue();
        CobolDisplay.display(CobolDisplay.formatPic(x_bdu, 20, 0, false));
        x_bdu = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(x_bdu).add(CobolIntrinsics.toBigDecimal(1))).longValue();
        CobolDisplay.display(CobolDisplay.formatPic(x_bdu, 20, 0, false));
        x_us = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(32767), 5));
        CobolDisplay.display(CobolDisplay.formatPic(x_us, 5, 0, false));
        x_us = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(x_us).add(CobolIntrinsics.toBigDecimal(1))), 5));
        CobolDisplay.display(CobolDisplay.formatPic(x_us, 5, 0, false));
        x_ui = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2147483647), 10));
        CobolDisplay.display(CobolDisplay.formatPic(x_ui, 10, 0, false));
        x_ui = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(x_ui).add(CobolIntrinsics.toBigDecimal(1))), 10));
        CobolDisplay.display(CobolDisplay.formatPic(x_ui, 10, 0, false));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "DataDisplay003DisplayUnsigned");
            CobolProgram.registerCallAlias("prog", "DataDisplay003DisplayUnsigned");
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
        new DataDisplay003DisplayUnsigned().run();
    }
}
