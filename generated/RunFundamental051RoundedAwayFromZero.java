package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental051RoundedAwayFromZero extends CobolProgram {
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
    private int m = 0;
    private int n = 0;
    private int o = 0;
    private int p = 0;
    private int q = 0;
    private int r = 0;
    private int s = 0;
    private int t = 0;
    private int u = 0;
    private int v = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(10);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_m = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("M").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_n = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("N").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_o = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("O").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_p = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("P").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_q = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("Q").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_r = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("R").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_s = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("S").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_t = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("T").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_u = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("U").picDigits(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_v = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("V").picDigits(1).signed(true).build();


    private void para_main() {
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(new BigDecimal("2.49")).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        m = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(new BigDecimal("2.49")).setScale(0, RoundingMode.UP), 1);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(new BigDecimal("-2.49")).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        n = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(new BigDecimal("-2.49")).setScale(0, RoundingMode.UP), 1);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(new BigDecimal("2.50")).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        o = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(new BigDecimal("2.50")).setScale(0, RoundingMode.UP), 1);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(new BigDecimal("-2.50")).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        p = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(new BigDecimal("-2.50")).setScale(0, RoundingMode.UP), 1);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(new BigDecimal("3.49")).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        q = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(new BigDecimal("3.49")).setScale(0, RoundingMode.UP), 1);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(new BigDecimal("-3.49")).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        r = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(new BigDecimal("-3.49")).setScale(0, RoundingMode.UP), 1);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(new BigDecimal("3.50")).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        s = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(new BigDecimal("3.50")).setScale(0, RoundingMode.UP), 1);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(new BigDecimal("-3.50")).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        t = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(new BigDecimal("-3.50")).setScale(0, RoundingMode.UP), 1);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(new BigDecimal("3.510")).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        u = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(new BigDecimal("3.510")).setScale(0, RoundingMode.UP), 1);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(new BigDecimal("-3.510")).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("10")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        v = (int) CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(new BigDecimal("-3.510")).setScale(0, RoundingMode.UP), 1);
        CobolDisplay.displayNoAdvancing(CobolDisplay.formatPic(m, 1, 0, true, "LEADING") + " " + CobolDisplay.formatPic(n, 1, 0, true, "LEADING") + " " + CobolDisplay.formatPic(o, 1, 0, true, "LEADING") + " " + CobolDisplay.formatPic(p, 1, 0, true, "LEADING") + " " + CobolDisplay.formatPic(q, 1, 0, true, "LEADING") + " " + CobolDisplay.formatPic(r, 1, 0, true, "LEADING") + " " + CobolDisplay.formatPic(s, 1, 0, true, "LEADING") + " " + CobolDisplay.formatPic(t, 1, 0, true, "LEADING") + " " + CobolDisplay.formatPic(u, 1, 0, true, "LEADING") + " " + CobolDisplay.formatPic(v, 1, 0, true, "LEADING"));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental051RoundedAwayFromZero");
            CobolProgram.registerCallAlias("prog", "RunFundamental051RoundedAwayFromZero");
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
        new RunFundamental051RoundedAwayFromZero().run();
    }
}
