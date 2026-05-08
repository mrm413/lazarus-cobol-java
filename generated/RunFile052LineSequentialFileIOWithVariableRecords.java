package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile052LineSequentialFileIOWithVariableRecords extends CobolProgram {
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
    private int rec_size = 0;
    private int i = 0;
    private CobolString _1_template = new CobolString(20, "+12345678++12345678+"); // Group: 1-template
    private CobolString[] _1_x = new CobolString[20];
    {
        for (int _d0 = 0; _d0 < 20; _d0++) {
            _1_x[_d0] = new CobolString(1);
        }
    }

    // FILE SECTION — f
    private CobolString f_rec = new CobolString(20); // Group: f-rec
    private CobolString[] f_x = new CobolString[20];
    {
        for (int _d0 = 0; _d0 < 20; _d0++) {
            f_x[_d0] = new CobolString(1);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(24);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_rec_size = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("rec-size").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_i = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("i").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd__1_template = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("1-template").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd__1_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("1-x").build();

    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL", "F", 10, 20);

    private CobolString line = new CobolString(256, "LINE"); // fallback (implicit ASSIGN — initialized to name)

    private void para_main() {
        f.setFileName(String.valueOf(line).trim());
        f.open("OUTPUT");
        for (rec_size = 20; !(rec_size < 10); rec_size += -1) {
            f.writeWithLength(rec_size, _1_template);
        }
        f.close();
        f.setFileName(String.valueOf(line).trim());
        f.open("INPUT");
        rec_size = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(15), 2));
        for (i = 20; !(i < 10); i += -1) {
            if (f.read(f_rec) == FileStatus.AT_END) {
                CobolDisplay.display("Failed: EOF");
                CobolIntrinsics.programExit(1);
            } else {
                rec_size = f.getLastRecordLength();
                { /* Sync OCCURS children of f-rec after group MOVE */
                    String _grp = f_rec.get();
                    int _grpLen = _grp.length();
                    for (int _gi = 0; _gi < 20; _gi++) {
                        int _base = 0 + _gi * 1;
                        if (_base + 0 < _grpLen) { if (f_x[_gi] == null) f_x[_gi] = new CobolString(1); f_x[_gi].set(_grp.substring(_base + 0, Math.min(_base + 0 + 1, _grpLen))); }
                    }
                }
            }
            CobolDisplay.display(CobolDisplay.formatPic(rec_size, 2, 0, false) + ": >" + String.valueOf(CobolString.refMod(f_rec, 1, rec_size)) + "<");
            if (rec_size != i) {
                CobolDisplay.display("Failed: bad record size");
                CobolIntrinsics.programExit(1);
            }
            if (!CobolString.cobolEquals(String.valueOf(CobolString.safeIndex(f_x, rec_size, 1, f_rec, 0)), String.valueOf(CobolString.safeIndex(_1_x, rec_size, 1, _1_template, 0)))) {
                CobolDisplay.display("Failed: bad data");
                CobolIntrinsics.programExit(1);
            }
        }
        f.close();
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile052LineSequentialFileIOWithVariableRecords");
            CobolProgram.registerCallAlias("prog", "RunFile052LineSequentialFileIOWithVariableRecords");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Initialize OCCURS children of 1-template from group VALUE
            {
                String _gv__1_template = _1_template.get();
                for (int _i = 0; _i < 20; _i++) {
                    int _off = 0 + _i * 1;
                    if (_1_x[_i] == null) _1_x[_i] = new CobolString(1);
                    if (_off + 1 <= _gv__1_template.length()) _1_x[_i].set(_gv__1_template.substring(_off, _off + 1));
                }
            }
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
        new RunFile052LineSequentialFileIOWithVariableRecords().run();
    }
}
