package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile043SequentialBasicIO extends CobolProgram {
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
    // FILE SECTION — file1
    private CobolString file1_rec = new CobolString(1);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("ORGANIZATION", "SEQUENTIAL", "SEQUENTIAL", "FILE1");

    private CobolString organization = new CobolString(256, "ORGANIZATION"); // fallback (implicit ASSIGN — initialized to name)

    private void para_main() {
        file1.delete();
        file1.setFileName(String.valueOf(organization).trim());
        file1.open("OUTPUT");
        file1_rec.set(String.valueOf("A"));
        file1.write(file1_rec);
        file1.close();
        file1.setFileName(String.valueOf(organization).trim());
        file1.open("I-O");
        file1.read(file1_rec);
        if (!CobolString.cobolEquals(String.valueOf(file1_rec), String.valueOf("A"))) {
            CobolDisplay.display("FIRST READ FAILED");
        } else {
            file1_rec.set(String.valueOf("X"));
            file1.rewrite(file1_rec);
        }
        file1.close();
        if (!CobolString.cobolEquals(String.valueOf(file1_rec), String.valueOf("X"))) {
            CobolIntrinsics.programExit(CobolProgram.return_code);
        }
        file1.setFileName(String.valueOf(organization).trim());
        file1.open("INPUT");
        file1.read(file1_rec);
        if (!CobolString.cobolEquals(String.valueOf(file1_rec), String.valueOf("X"))) {
            CobolDisplay.display("SECOND READ FAILED");
        }
        file1.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile043SequentialBasicIO");
            CobolProgram.registerCallAlias("prog", "RunFile043SequentialBasicIO");
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
        new RunFile043SequentialBasicIO().run();
    }
}
