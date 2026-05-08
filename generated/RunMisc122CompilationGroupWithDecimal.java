package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc122CompilationGroupWithDecimal extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "cbug";
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
    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);


    private void mainline() {
        CobolProgram.callNested("bug");
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("cbug", "", "cbug.cob");
        CobolProgram.pushActive("cbug");
        try {
            CobolProgram.registerCallAlias("cbug", "RunMisc122CompilationGroupWithDecimal");
            CobolProgram.registerCallAlias("bug", "RunMisc122CompilationGroupWithDecimal_Bug");
            CobolProgram.registerCallAlias("cbug", "RunMisc122CompilationGroupWithDecimal");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            mainline();
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
        new RunMisc122CompilationGroupWithDecimal().run();
    }
}

class RunMisc122CompilationGroupWithDecimal_Bug extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "bug";
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
    private int pw = 0;
    private CobolString px = new CobolString(1, "3");
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(3);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_pw = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("pw").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_px = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("px").build();
    private void mainline() {
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(px)).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("100")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        pw = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.numval(px)), 2));
        if (pw != 3) {
            CobolDisplay.display("bad calc: " + CobolDisplay.formatPic(pw, 2, 0, false));
        }
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("bug", "", "bug.cob");
        CobolProgram.pushActive("bug");
        try {
            CobolProgram.registerCallAlias("bug", "RunMisc122CompilationGroupWithDecimal_Bug");
            CobolProgram.registerCallAlias("bug", "RunMisc122CompilationGroupWithDecimal_Bug");
            CobolProgram.registerCallAlias("cbug", "RunMisc122CompilationGroupWithDecimal");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            mainline();
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
        new RunMisc122CompilationGroupWithDecimal_Bug().run();
    }
}
