package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile007AssignToVariable extends CobolProgram {
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
    private CobolString var_1 = new CobolString(255);
    private CobolString var_2 = new CobolString(255);
    private CobolString var_3 = new CobolString(255);
    private CobolString var_4 = new CobolString(255);
    private CobolString var_5 = new CobolString(255);
    private CobolString var_6 = new CobolString(255);

    // FILE SECTION — test-file-1
    private CobolString test_rec_1 = new CobolString(4);

    // FILE SECTION — test-file-2
    private CobolString test_rec_2 = new CobolString(4);

    // FILE SECTION — test-file-3
    private CobolString test_rec_3 = new CobolString(4);

    // FILE SECTION — test-file-4
    private CobolString test_rec_4 = new CobolString(4);

    // FILE SECTION — test-file-5
    private CobolString test_rec_5 = new CobolString(4);

    // FILE SECTION — test-file-6
    private CobolString test_rec_6 = new CobolString(4);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1530);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 255).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("var-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(255, 255).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("var-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(510, 255).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("var-3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(765, 255).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("var-4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1020, 255).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("var-5").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var_6 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1275, 255).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("var-6").build();

    // FILE DESCRIPTORS
    private CobolFile test_file_1 = new CobolFile("var-1", "SEQUENTIAL", "SEQUENTIAL", "TEST-FILE-1");
    private CobolFile test_file_2 = new CobolFile("USING", "SEQUENTIAL", "SEQUENTIAL", "TEST-FILE-2");
    private CobolFile test_file_3 = new CobolFile("VARYING", "SEQUENTIAL", "SEQUENTIAL", "TEST-FILE-3");
    private CobolFile test_file_4 = new CobolFile("USING", "SEQUENTIAL", "SEQUENTIAL", "TEST-FILE-4");
    private CobolFile test_file_5 = new CobolFile("DISK", "SEQUENTIAL", "SEQUENTIAL", "TEST-FILE-5");
    private CobolFile test_file_6 = new CobolFile("FROM", "SEQUENTIAL", "SEQUENTIAL", "TEST-FILE-6");

    private CobolString using = new CobolString(256, "USING"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString varying = new CobolString(256, "VARYING"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString disk = new CobolString(256, "DISK"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString from = new CobolString(256, "FROM"); // fallback (implicit ASSIGN — initialized to name)

    private void para_main() {
        test_file_1.setFileName(String.valueOf(var_1).trim());
        test_file_1.open("INPUT");
        test_file_1.close();
        test_file_2.setFileName(String.valueOf(using).trim());
        test_file_2.open("INPUT");
        test_file_2.close();
        test_file_3.setFileName(String.valueOf(varying).trim());
        test_file_3.open("INPUT");
        test_file_3.close();
        test_file_4.setFileName(String.valueOf(using).trim());
        test_file_4.open("INPUT");
        test_file_4.close();
        test_file_5.setFileName(String.valueOf(disk).trim());
        test_file_5.open("INPUT");
        test_file_5.close();
        test_file_6.setFileName(String.valueOf(from).trim());
        test_file_6.open("INPUT");
        test_file_6.close();
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynFile007AssignToVariable");
            CobolProgram.registerCallAlias("prog", "SynFile007AssignToVariable");
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
        new SynFile007AssignToVariable().run();
    }
}
