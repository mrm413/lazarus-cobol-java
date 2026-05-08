package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile006AssignToLsqDeviceName extends CobolProgram {
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
    // FILE SECTION — TST-FILE1
    private CobolString tst1_rec = new CobolString(4);

    // FILE SECTION — TST-FILE2
    private CobolString tst2_rec = new CobolString(4);

    // FILE SECTION — TST-FILE3
    private CobolString tst3_rec = new CobolString(4);

    // FILE SECTION — TST-FILE4
    private CobolString tst4_rec = new CobolString(4);

    // FILE SECTION — TST-FILE5
    private CobolString tst5_rec = new CobolString(4);

    // FILE SECTION — TST-FILE6
    private CobolString tst6_rec = new CobolString(4);

    // FILE SECTION — TST-FILE7
    private CobolString tst7_rec = new CobolString(4);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    // FILE DESCRIPTORS
    private CobolFile tst_file1 = new CobolFile("CARD-PUNCH", "SEQUENTIAL", "SEQUENTIAL", "TST-FILE1");
    private CobolFile tst_file2 = new CobolFile("CARD-READER", "SEQUENTIAL", "SEQUENTIAL", "TST-FILE2");
    private CobolFile tst_file3 = new CobolFile("CASSETTE", "SEQUENTIAL", "SEQUENTIAL", "TST-FILE3");
    private CobolFile tst_file4 = new CobolFile("F4", "SEQUENTIAL", "SEQUENTIAL", "TST-FILE4");
    private CobolFile tst_file5 = new CobolFile("INPUT-OUTPUT", "SEQUENTIAL", "SEQUENTIAL", "TST-FILE5");
    private CobolFile tst_file6 = new CobolFile("MAGNETIC-TAPE", "SEQUENTIAL", "SEQUENTIAL", "TST-FILE6");
    private CobolFile tst_file7 = new CobolFile("F7", "SEQUENTIAL", "SEQUENTIAL", "TST-FILE7");

    private CobolString card_punch = new CobolString(256, "CARD-PUNCH"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString card_reader = new CobolString(256, "CARD-READER"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString cassette = new CobolString(256, "CASSETTE"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString input_output = new CobolString(256, "INPUT-OUTPUT"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString magnetic_tape = new CobolString(256, "MAGNETIC-TAPE"); // fallback (implicit ASSIGN — initialized to name)

    private void para_main() {
        tst_file1.setFileName(String.valueOf(card_punch).trim());
        tst_file1.open("INPUT");
        tst_file1.close();
        tst_file2.setFileName(String.valueOf(card_reader).trim());
        tst_file2.open("INPUT");
        tst_file2.close();
        tst_file3.setFileName(String.valueOf(cassette).trim());
        tst_file3.open("INPUT");
        tst_file3.close();
        tst_file4.open("INPUT");
        tst_file4.close();
        tst_file5.setFileName(String.valueOf(input_output).trim());
        tst_file5.open("INPUT");
        tst_file5.close();
        tst_file6.setFileName(String.valueOf(magnetic_tape).trim());
        tst_file6.open("INPUT");
        tst_file6.close();
        tst_file7.open("INPUT");
        tst_file7.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynFile006AssignToLsqDeviceName");
            CobolProgram.registerCallAlias("prog", "SynFile006AssignToLsqDeviceName");
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
        new SynFile006AssignToLsqDeviceName().run();
    }
}
