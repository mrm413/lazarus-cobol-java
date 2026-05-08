package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile090TurnEcIO extends CobolProgram {
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
    private CobolString f_status = new CobolString(2);

    // FILE SECTION — f
    private CobolString f_rec = new CobolString(1);

    // FILE SECTION — g
    private CobolString g_rec = new CobolString(1);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(2);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_f_status = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("f-status").build();

    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("out.txt", "SEQUENTIAL", "SEQUENTIAL", "F", true);
    private CobolFile g = new CobolFile("out.txt", "SEQUENTIAL", "SEQUENTIAL", "G");


    private void para_main() {
        f.open("OUTPUT");
        f_status.set(f.getFileStatus());
        f.write("a");
        f_status.set(f.getFileStatus());
        f.close();
        f_status.set(f.getFileStatus());
        CobolIntrinsics.setLastExceptionOff();
        CobolFile.setEcIoCheck(true);
        f.open("INPUT");
        f_status.set(f.getFileStatus());
        for (int _i0 = 0; _i0 < 2; _i0++) {
            f.read(f_rec);
            f_status.set(f.getFileStatus());
            CobolDisplay.display(String.valueOf(f_rec));
        }
        CobolDisplay.display(String.valueOf(f_status));
        CobolDisplay.display(String.valueOf(CobolIntrinsics.trim(CobolIntrinsics.exception_status())));
        CobolIntrinsics.setLastExceptionOff();
        f.close();
        f_status.set(f.getFileStatus());
        CobolFile.setEcIoCheck(true);
        f.open("INPUT");
        f_status.set(f.getFileStatus());
        for (int _i1 = 0; _i1 < 2; _i1++) {
            f.read(f_rec);
            f_status.set(f.getFileStatus());
            CobolDisplay.display(String.valueOf(f_rec));
        }
        CobolDisplay.display(String.valueOf(f_status));
        CobolDisplay.display(String.valueOf(CobolIntrinsics.trim(CobolIntrinsics.exception_status())));
        CobolIntrinsics.setLastExceptionOff();
        f.close();
        f_status.set(f.getFileStatus());
        g.open("INPUT");
        for (int _i2 = 0; _i2 < 2; _i2++) {
            g.read(g_rec);
            CobolDisplay.display(String.valueOf(g_rec));
        }
        g.close();
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile090TurnEcIO");
            CobolProgram.registerCallAlias("prog", "RunFile090TurnEcIO");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            if (f != null && f_status != null) f.setStatusField(f_status);
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
        new RunFile090TurnEcIO().run();
    }
}
