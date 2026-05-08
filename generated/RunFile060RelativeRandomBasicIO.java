package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile060RelativeRandomBasicIO extends CobolProgram {
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
    private int file1_key = 0;

    // FILE SECTION — file1
    private CobolString file1_rec = new CobolString(1);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(2);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_file1_key = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("file1-key").picDigits(2).build();

    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("ORGANIZATION", "RELATIVE", "RANDOM", "FILE1");

    private CobolString organization = new CobolString(256, "ORGANIZATION"); // fallback (implicit ASSIGN — initialized to name)

    private void para_main() {
        file1.delete();
        file1.setFileName(String.valueOf(organization).trim());
        file1.open("OUTPUT");
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 2));
        file1_rec.set(String.valueOf("A"));
        file1.setRelativeKey((int) file1_key);
        file1.write(file1_rec);
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2), 2));
        file1_rec.set(String.valueOf("B"));
        file1.setRelativeKey((int) file1_key);
        file1.write(file1_rec);
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(3), 2));
        file1_rec.set(String.valueOf("C"));
        file1.setRelativeKey((int) file1_key);
        file1.write(file1_rec);
        file1.close();
        file1.setFileName(String.valueOf(organization).trim());
        file1.open("INPUT");
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2), 2));
        file1.setRelativeKey((int) file1_key);
        file1.read(file1_rec);
        if (!CobolString.cobolEquals(String.valueOf(file1_rec), String.valueOf("B"))) {
            CobolDisplay.display("FAILED");
        }
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 2));
        file1.setRelativeKey((int) file1_key);
        file1.read(file1_rec);
        if (!CobolString.cobolEquals(String.valueOf(file1_rec), String.valueOf("A"))) {
            CobolDisplay.display("FAILED");
        }
        file1.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile060RelativeRandomBasicIO");
            CobolProgram.registerCallAlias("prog", "RunFile060RelativeRandomBasicIO");
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
        new RunFile060RelativeRandomBasicIO().run();
    }
}
