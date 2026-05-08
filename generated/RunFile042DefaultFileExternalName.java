package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile042DefaultFileExternalName extends CobolProgram {
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
    private int erc = 0;
    private int rec_size = 16;

    // FILE SECTION — file1
    private CobolString file1_rec = new CobolString(16); // Group: file1-rec
    private CobolString file1_date = new CobolString(8);
    private CobolString file1_time = new CobolString(8);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(2);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_erc = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("erc").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_rec_size = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("rec-size").build();

    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("FILE1", "SEQUENTIAL", "SEQUENTIAL", "FILE1");


    private void para_main() {
        file1_date.set(String.valueOf(CobolIntrinsics.acceptFrom("DATE YYYYMMDD")));
        file1_time.set(String.valueOf(CobolIntrinsics.acceptFrom("TIME")));
        file1.open("OUTPUT");
        file1_rec.setRefMod(1, 8, String.valueOf(file1_date));
        file1_rec.setRefMod(9, 8, String.valueOf(file1_time));
        file1.write(file1_rec);
        file1.close();
        { /* Pre-CALL: sync file1-rec from children */
            String _gp = String.valueOf(file1_rec);
            StringBuilder _sb = new StringBuilder(16);
            _sb.append(String.format("%-8s", String.valueOf(file1_date)).substring(0, 8));
            _sb.append(String.format("%-8s", String.valueOf(file1_time)).substring(0, 8));
            file1_rec.set(_sb.toString());
        }
        CobolProgram.call("fexists_signed", "./file1", file1_rec, rec_size);
        erc = CobolProgram.return_code;
        CobolProgram.return_code = 0;
        if (erc != 0) {
            CobolDisplay.display("FAILED file1");
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile042DefaultFileExternalName");
            CobolProgram.registerCallAlias("prog", "RunFile042DefaultFileExternalName");
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
        new RunFile042DefaultFileExternalName().run();
    }
}
