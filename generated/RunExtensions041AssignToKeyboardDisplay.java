package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions041AssignToKeyboardDisplay extends CobolProgram {
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
    private int _gotoIdx = -1;
    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(80);

    // FILE SECTION — TEST-OUT
    private CobolString test_rec_out = new CobolString(80);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    // FILE DESCRIPTORS
    private CobolFile test_file = new CobolFile("ORGANIZATION", "LINE SEQUENTIAL", "SEQUENTIAL", "TEST-FILE");
    private CobolFile test_out = new CobolFile("ORGANIZATION", "LINE SEQUENTIAL", "SEQUENTIAL", "TEST-OUT");

    private CobolString organization = new CobolString(256, "ORGANIZATION"); // fallback (implicit ASSIGN — initialized to name)

    private void a00() {
        test_file.setFileName(String.valueOf(organization).trim());
        test_file.open("INPUT");
        test_out.setFileName(String.valueOf(organization).trim());
        test_out.open("OUTPUT");
    }

    private void a01() {
        if (test_file.read(test_rec) == FileStatus.AT_END) {
            _gotoIdx = 2; return;
        } else {
        }
        test_out.write(test_rec);
        _gotoIdx = 1; return;
    }

    private void z99() {
        test_file.close();
        test_out.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunExtensions041AssignToKeyboardDisplay");
            CobolProgram.registerCallAlias("prog", "RunExtensions041AssignToKeyboardDisplay");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            { int _p = 0;
                while (_p <= 2) {
                    _gotoIdx = -1;
                    switch (_p) {
                        case 0: a00(); break;
                        case 1: a01(); break;
                        case 2: z99(); break;
                    }
                    if (_gotoIdx >= 0) _p = _gotoIdx; else _p++;
                }
            }
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
        new RunExtensions041AssignToKeyboardDisplay().run();
    }
}
