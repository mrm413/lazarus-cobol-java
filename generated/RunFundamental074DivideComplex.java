package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental074DivideComplex extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "DivideExtent";
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
    private CobolString w01_divides = new CobolString(12); // Group: W01-DIVIDES
    private int[] res_tab = new int[3];

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(12);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_w01_divides = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 12).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("W01-DIVIDES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_res_tab = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("RES-TAB").picDigits(9).signed(true).build();


    private void test_format_1() {
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(100).intValue();
        res_tab[2 - 1] = CobolIntrinsics.toBigDecimal(200).intValue();
        res_tab[3 - 1] = CobolIntrinsics.toBigDecimal(300).intValue();
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(res_tab[1 - 1]).divide(CobolIntrinsics.toBigDecimal(100), 18, RoundingMode.HALF_UP)).intValue();
        res_tab[2 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(res_tab[2 - 1]).divide(CobolIntrinsics.toBigDecimal(100), 18, RoundingMode.HALF_UP)).intValue();
        res_tab[3 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(res_tab[3 - 1]).divide(CobolIntrinsics.toBigDecimal(100), 18, RoundingMode.HALF_UP)).intValue();
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            CobolDisplay.display("1: Should not raised size error");
        }
        if (((res_tab[1 - 1] != 1 || res_tab[2 - 1] != 2) || res_tab[3 - 1] != 3)) {
            CobolDisplay.display("F1.1: result <" + CobolDisplay.formatPic(res_tab[1 - 1], 9, 0, true, "LEADING") + "> <" + CobolDisplay.formatPic(res_tab[2 - 1], 9, 0, true, "LEADING") + "> <" + CobolDisplay.formatPic(res_tab[3 - 1], 9, 0, true, "LEADING") + "> should be 1 2 3");
        }
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(0).intValue();
        res_tab[2 - 1] = CobolIntrinsics.toBigDecimal(100).intValue();
        res_tab[3 - 1] = CobolIntrinsics.toBigDecimal(200).intValue();
        res_tab[2 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(res_tab[2 - 1]).divide(CobolIntrinsics.toBigDecimal(res_tab[1 - 1]), 18, RoundingMode.HALF_UP)).intValue();
        res_tab[3 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(res_tab[3 - 1]).divide(CobolIntrinsics.toBigDecimal(res_tab[1 - 1]), 18, RoundingMode.HALF_UP)).intValue();
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
        } else {
            CobolDisplay.display("F1.2: Should raise size error");
        }
        if (((res_tab[1 - 1] != 0 || res_tab[2 - 1] != 100) || res_tab[3 - 1] != 200)) {
            CobolDisplay.display("F1.2: result <" + CobolDisplay.formatPic(res_tab[1 - 1], 9, 0, true, "LEADING") + "> <" + CobolDisplay.formatPic(res_tab[2 - 1], 9, 0, true, "LEADING") + "> <" + CobolDisplay.formatPic(res_tab[3 - 1], 9, 0, true, "LEADING") + "> should be 0 100 200");
        }
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(100).intValue();
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(res_tab[1 - 1]).divide(new BigDecimal("2.19"), 18, RoundingMode.HALF_UP)).intValue();
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            CobolDisplay.display("F1.3: Should not raise size error");
        }
        if (res_tab[1 - 1] != 45) {
            CobolDisplay.display("F1.3: result <" + CobolDisplay.formatPic(res_tab[1 - 1], 9, 0, true, "LEADING") + "> should be 45");
        }
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(100).intValue();
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(res_tab[1 - 1]).divide(new BigDecimal("2.19"), 18, RoundingMode.HALF_UP)).intValue();
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            CobolDisplay.display("F1.4: Should not raise size error");
        }
        if (res_tab[1 - 1] != 46) {
            CobolDisplay.display("F1.4: result <" + CobolDisplay.formatPic(res_tab[1 - 1], 9, 0, true, "LEADING") + "> should be 46");
        }
    }

    private void test_format_2() {
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(100).divide(new BigDecimal("10.2"), 18, RoundingMode.HALF_UP)).intValue();
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            CobolDisplay.display("F2.1: Should not raised size error");
        }
        if (res_tab[1 - 1] != 9) {
            CobolDisplay.display("F2.1: result <" + CobolDisplay.formatPic(res_tab[1 - 1], 9, 0, true, "LEADING") + "> should be 9");
        }
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(100).divide(new BigDecimal("10.5"), 18, RoundingMode.HALF_UP)).intValue();
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            CobolDisplay.display("F2.2: Should not raise size error");
        }
        if (res_tab[1 - 1] != 10) {
            CobolDisplay.display("F2.2: result <" + CobolDisplay.formatPic(res_tab[1 - 1], 9, 0, true, "LEADING") + "> should be 10");
        }
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(100).divide(new BigDecimal("10.6"), 18, RoundingMode.HALF_UP)).intValue();
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
            CobolDisplay.display("F2.3: Should not raise size error");
        }
        if (res_tab[1 - 1] != 9) {
            CobolDisplay.display("F2.3: result <" + CobolDisplay.formatPic(res_tab[1 - 1], 9, 0, true, "LEADING") + "> should be 9");
        }
    }

    private void test_format_4() {
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(100).divide(CobolIntrinsics.toBigDecimal(2), 18, RoundingMode.HALF_UP)).intValue();
        res_tab[2 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(100).remainder(CobolIntrinsics.toBigDecimal(2))).intValue();
        if ((res_tab[1 - 1] != 50 || res_tab[2 - 1] != 0)) {
            CobolDisplay.display("F4.1: result <" + CobolDisplay.formatPic(res_tab[1 - 1], 9, 0, true, "LEADING") + "> <" + CobolDisplay.formatPic(res_tab[2 - 1], 9, 0, true, "LEADING") + "> should be <50> <0>");
        }
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(100).divide(CobolIntrinsics.toBigDecimal(3), 18, RoundingMode.HALF_UP)).intValue();
        res_tab[2 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(100).remainder(CobolIntrinsics.toBigDecimal(3))).intValue();
        if ((res_tab[1 - 1] != 33 || res_tab[2 - 1] != 1)) {
            CobolDisplay.display("F4.1: result <" + CobolDisplay.formatPic(res_tab[1 - 1], 9, 0, true, "LEADING") + "> <" + CobolDisplay.formatPic(res_tab[2 - 1], 9, 0, true, "LEADING") + "> should be <33> <1>");
        }
        res_tab[1 - 1] = CobolIntrinsics.toBigDecimal(0).intValue();
        res_tab[2 - 1] = CobolIntrinsics.toBigDecimal(0).intValue();
        res_tab[3 - 1] = CobolIntrinsics.toBigDecimal(0).intValue();
        res_tab[2 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(100).divide(CobolIntrinsics.toBigDecimal(res_tab[1 - 1]), 18, RoundingMode.HALF_UP)).intValue();
        res_tab[3 - 1] = CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(100).remainder(CobolIntrinsics.toBigDecimal(res_tab[1 - 1]))).intValue();
        if (CobolIntrinsics.checkException("EC-SIZE-OVERFLOW") || CobolIntrinsics.checkException("EC-SIZE-ZERO-DIVIDE")) {
        } else {
            CobolDisplay.display("F4.3: Should  raised size error");
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("DivideExtent", "", "DivideExtent.cob");
        CobolProgram.pushActive("DivideExtent");
        try {
            CobolProgram.registerCallAlias("DivideExtent", "RunFundamental074DivideComplex");
            CobolProgram.registerCallAlias("divideextent", "RunFundamental074DivideComplex");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            test_format_1();
            test_format_2();
            test_format_4();
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
        new RunFundamental074DivideComplex().run();
    }
}
