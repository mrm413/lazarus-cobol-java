package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental064NumericOperations7 extends CobolProgram {
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
    private BigDecimal field = BigDecimal.ZERO;
    private BigDecimal field_disp = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(10);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FIELD").picDigits(6).picScale(1).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_disp = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FIELD-DISP").picDigits(6).picScale(1).signed(true).build();


    private void para_main() {
        field = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(new BigDecimal("0.2")), 6, 2, true);
        field = CobolIntrinsics.truncateToField(field.add(CobolIntrinsics.toBigDecimal(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20 + 21 + 22 + 23 + 24 + 25 + 26 + 27 + 28 + 29 + 30 + 31 + 32 + 33 + 34 + 35 + 36 + 37 + 38 + 39 + 40 + 41 + 42 + 43 + 44 + 45 + 46 + 47 + 48 + 49 + 50 + 51 + 52 + 53 + 54 + 55 + 56 + 57 + 58 + 59 + 60 + 61 + 62 + 63 + 64 + 65 + 66 + 67 + 68 + 69 + 70 + 71 + 72 + 73 + 74 + 75 + 76 + 77 + 78 + 79 + 80 + 81 + 82 + 83 + 84 + 85 + 86 + 87 + 88 + 89 + 90 + 91 + 92 + 93 + 94 + 95 + 96 + 97 + 98 + 99 + 100 + 101 + 102 + 103 + 104 + 105 + 106 + 107 + 108 + 109 + 110 + 111 + 112 + 113 + 114 + 115 + 116 + 117 + 118 + 119 + 120 + 121 + 122 + 123 + 124 + 125 + 126 + 127 + 128 + 129)), 6, 2, true);
        if (field.compareTo(new BigDecimal("8385.2")) != 0) {
            field_disp = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(field), 6, 2, true);
            CobolDisplay.display("ADD with wrong result: " + CobolDisplay.formatPic(field_disp, 6, 2, true, "LEADING"));
        }
        field = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal((new BigDecimal("0.2").add(CobolIntrinsics.toBigDecimal(2)).add(CobolIntrinsics.toBigDecimal(3)).add(CobolIntrinsics.toBigDecimal(4)).add(CobolIntrinsics.toBigDecimal(5)).add(CobolIntrinsics.toBigDecimal(6)).add(CobolIntrinsics.toBigDecimal(7)).add(CobolIntrinsics.toBigDecimal(8)).add(CobolIntrinsics.toBigDecimal(9)).add(CobolIntrinsics.toBigDecimal(10)).add(CobolIntrinsics.toBigDecimal(11)).add(CobolIntrinsics.toBigDecimal(12)).add(CobolIntrinsics.toBigDecimal(13)).add(CobolIntrinsics.toBigDecimal(14)).add(CobolIntrinsics.toBigDecimal(15)).add(CobolIntrinsics.toBigDecimal(16)).add(CobolIntrinsics.toBigDecimal(17)).add(CobolIntrinsics.toBigDecimal(18)).add(CobolIntrinsics.toBigDecimal(19)).add(CobolIntrinsics.toBigDecimal(20)).add(CobolIntrinsics.toBigDecimal(21)).add(CobolIntrinsics.toBigDecimal(22)).add(CobolIntrinsics.toBigDecimal(23)).add(CobolIntrinsics.toBigDecimal(24)).add(CobolIntrinsics.toBigDecimal(25)).add(CobolIntrinsics.toBigDecimal(26)).add(CobolIntrinsics.toBigDecimal(27)).add(CobolIntrinsics.toBigDecimal(28)).add(CobolIntrinsics.toBigDecimal(29)).add(CobolIntrinsics.toBigDecimal(30)).add(CobolIntrinsics.toBigDecimal(31)).add(CobolIntrinsics.toBigDecimal(32)).add(CobolIntrinsics.toBigDecimal(33)).add(CobolIntrinsics.toBigDecimal(34)).add(CobolIntrinsics.toBigDecimal(35)).add(CobolIntrinsics.toBigDecimal(36)).add(CobolIntrinsics.toBigDecimal(37)).add(CobolIntrinsics.toBigDecimal(38)).add(CobolIntrinsics.toBigDecimal(39)).add(CobolIntrinsics.toBigDecimal(40)).add(CobolIntrinsics.toBigDecimal(41)).add(CobolIntrinsics.toBigDecimal(42)).add(CobolIntrinsics.toBigDecimal(43)).add(CobolIntrinsics.toBigDecimal(44)).add(CobolIntrinsics.toBigDecimal(45)).add(CobolIntrinsics.toBigDecimal(46)).add(CobolIntrinsics.toBigDecimal(47)).add(CobolIntrinsics.toBigDecimal(48)).add(CobolIntrinsics.toBigDecimal(49)).add(CobolIntrinsics.toBigDecimal(50)).add(CobolIntrinsics.toBigDecimal(51)).add(CobolIntrinsics.toBigDecimal(52)).add(CobolIntrinsics.toBigDecimal(53)).add(CobolIntrinsics.toBigDecimal(54)).add(CobolIntrinsics.toBigDecimal(55)).add(CobolIntrinsics.toBigDecimal(56)).add(CobolIntrinsics.toBigDecimal(57)).add(CobolIntrinsics.toBigDecimal(58)).subtract(CobolIntrinsics.toBigDecimal(59)).subtract(CobolIntrinsics.toBigDecimal(60)).subtract(CobolIntrinsics.toBigDecimal(61)).subtract(CobolIntrinsics.toBigDecimal(62)).subtract(CobolIntrinsics.toBigDecimal(63)).subtract(CobolIntrinsics.toBigDecimal(64)).subtract(CobolIntrinsics.toBigDecimal(65)).subtract(CobolIntrinsics.toBigDecimal(66)).subtract(CobolIntrinsics.toBigDecimal(67)).subtract(CobolIntrinsics.toBigDecimal(68)).subtract(CobolIntrinsics.toBigDecimal(69)).subtract(CobolIntrinsics.toBigDecimal(70)).subtract(CobolIntrinsics.toBigDecimal(71)).subtract(CobolIntrinsics.toBigDecimal(72)).subtract(CobolIntrinsics.toBigDecimal(73)).subtract(CobolIntrinsics.toBigDecimal(74)).subtract(CobolIntrinsics.toBigDecimal(75)).subtract(CobolIntrinsics.toBigDecimal(76)).subtract(CobolIntrinsics.toBigDecimal(77)).subtract(CobolIntrinsics.toBigDecimal(78)).subtract(CobolIntrinsics.toBigDecimal(79)).subtract(CobolIntrinsics.toBigDecimal(80)).subtract(CobolIntrinsics.toBigDecimal(81)).subtract(CobolIntrinsics.toBigDecimal(82)).subtract(CobolIntrinsics.toBigDecimal(83)).subtract(CobolIntrinsics.toBigDecimal(84)).subtract(CobolIntrinsics.toBigDecimal(85)).subtract(CobolIntrinsics.toBigDecimal(86)).subtract(CobolIntrinsics.toBigDecimal(87)).subtract(CobolIntrinsics.toBigDecimal(88)).subtract(CobolIntrinsics.toBigDecimal(89)).subtract(CobolIntrinsics.toBigDecimal(90)).subtract(CobolIntrinsics.toBigDecimal(91)).subtract(CobolIntrinsics.toBigDecimal(92)).subtract(CobolIntrinsics.toBigDecimal(93)).subtract(CobolIntrinsics.toBigDecimal(94)).subtract(CobolIntrinsics.toBigDecimal(95)).subtract(CobolIntrinsics.toBigDecimal(96)).subtract(CobolIntrinsics.toBigDecimal(97)).subtract(CobolIntrinsics.toBigDecimal(98)).subtract(CobolIntrinsics.toBigDecimal(99)).subtract(CobolIntrinsics.toBigDecimal(100)).subtract(CobolIntrinsics.toBigDecimal(101)).subtract(CobolIntrinsics.toBigDecimal(102)).subtract(CobolIntrinsics.toBigDecimal(103)).subtract(CobolIntrinsics.toBigDecimal(104)).subtract(CobolIntrinsics.toBigDecimal(105)).subtract(CobolIntrinsics.toBigDecimal(106)).subtract(CobolIntrinsics.toBigDecimal(107)).subtract(CobolIntrinsics.toBigDecimal(108)).subtract(CobolIntrinsics.toBigDecimal(109)).subtract(CobolIntrinsics.toBigDecimal(110)).subtract(CobolIntrinsics.toBigDecimal(111)).subtract(CobolIntrinsics.toBigDecimal(112)).subtract(CobolIntrinsics.toBigDecimal(113)).subtract(CobolIntrinsics.toBigDecimal(114)).subtract(CobolIntrinsics.toBigDecimal(115)).subtract(CobolIntrinsics.toBigDecimal(116)).subtract(CobolIntrinsics.toBigDecimal(117)).subtract(CobolIntrinsics.toBigDecimal(118)).subtract(CobolIntrinsics.toBigDecimal(119)).subtract(CobolIntrinsics.toBigDecimal(120)).subtract(CobolIntrinsics.toBigDecimal(121)).subtract(CobolIntrinsics.toBigDecimal(122)).subtract(CobolIntrinsics.toBigDecimal(123)).subtract(CobolIntrinsics.toBigDecimal(124)).subtract(CobolIntrinsics.toBigDecimal(125)).subtract(CobolIntrinsics.toBigDecimal(126)).subtract(CobolIntrinsics.toBigDecimal(127))).multiply(CobolIntrinsics.toBigDecimal(12800000000L)).divide(CobolIntrinsics.toBigDecimal(12900000000L), 40, RoundingMode.HALF_UP)), 6, 2, true);
        if (field.compareTo(new BigDecimal("-4670.31")) != 0) {
            field_disp = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(field), 6, 2, true);
            CobolDisplay.display("COMPUTE with wrong result: " + CobolDisplay.formatPic(field_disp, 6, 2, true, "LEADING"));
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental064NumericOperations7");
            CobolProgram.registerCallAlias("prog", "RunFundamental064NumericOperations7");
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
        new RunFundamental064NumericOperations7().run();
    }
}
