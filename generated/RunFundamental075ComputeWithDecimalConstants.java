package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental075ComputeWithDecimalConstants extends CobolProgram {
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
    private int cnt = 0;
    private BigDecimal calcer = BigDecimal.ZERO;
    private int dummy_res = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(8);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cnt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("CNT").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_calcer = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("CALCER").picDigits(4).picScale(2).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dummy_res = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("DUMMY-RES").picDigits(2).build();


    private void para_main() {
        calcer = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("3.5")), 4, 2, true);
        for (int _i0 = 0; _i0 < 42; _i0++) {
            cnt = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(cnt).add(CobolIntrinsics.toBigDecimal(1))), 2));
            { BigDecimal _cv = CobolIntrinsics.toBigDecimal((calcer.add(CobolIntrinsics.toBigDecimal(2))).multiply(CobolIntrinsics.toBigDecimal(2)).add(CobolIntrinsics.toBigDecimal(2))).setScale(0, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("100")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
            dummy_res = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal((calcer.add(CobolIntrinsics.toBigDecimal(2))).multiply(CobolIntrinsics.toBigDecimal(2)).add(CobolIntrinsics.toBigDecimal(2))), 2));
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental075ComputeWithDecimalConstants");
            CobolProgram.registerCallAlias("prog", "RunFundamental075ComputeWithDecimalConstants");
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
        new RunFundamental075ComputeWithDecimalConstants().run();
    }
}
