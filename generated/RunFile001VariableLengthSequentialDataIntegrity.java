package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile001VariableLengthSequentialDataIntegrity extends CobolProgram {
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
    private CobolString st_test = new CobolString(2);
    private int w_type = 0;
    private int eof_test_xml = 0;
    private int count_pass = 0;

    // FILE SECTION — TEST-XML00
    private CobolString e_enr = new CobolString(500);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(10);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_st_test = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ST-TEST").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_w_type = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("W-TYPE").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_eof_test_xml = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("EOF-TEST-XML").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_count_pass = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("COUNT-PASS").picDigits(2).build();

    // FILE DESCRIPTORS
    private CobolFile test_xml00 = new CobolFile("DATA", "SEQUENTIAL", "SEQUENTIAL", "TEST-XML00", 5, 500);

    private CobolString not = new CobolString(256); // fallback
    private CobolString at = new CobolString(256); // fallback
    private CobolString end = new CobolString(256); // fallback

    private void debut() {
        test_xml00.open("INPUT");
        st_test.set(test_xml00.getFileStatus());
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refMod(st_test, 1)), String.valueOf("00"))) {
            CobolDisplay.displayNoAdvancing("OPEN ERROR: " + String.valueOf(st_test));
            return;
        }
        w_type = 0;
        e_enr.set("");
        while (!CobolIntrinsics.performUntil((eof_test_xml == 1 || (w_type == 1 || w_type == 2)))) {
            if (test_xml00.readNext(e_enr) == FileStatus.AT_END) {
                st_test.set(test_xml00.getFileStatus());
                eof_test_xml = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 3));
                not.set(String.valueOf(1));
                at.set(String.valueOf(1));
                end.set(String.valueOf(1));
                count_pass = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(count_pass).add(CobolIntrinsics.toBigDecimal(1))), 2));
            } else {
            }
        }
        test_xml00.close();
        st_test.set(test_xml00.getFileStatus());
        CobolDisplay.display(CobolDisplay.formatPic(count_pass, 2, 0, false));
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile001VariableLengthSequentialDataIntegrity");
            CobolProgram.registerCallAlias("prog", "RunFile001VariableLengthSequentialDataIntegrity");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            if (test_xml00 != null && st_test != null) test_xml00.setStatusField(st_test);
            debut();
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
        new RunFile001VariableLengthSequentialDataIntegrity().run();
    }
}
