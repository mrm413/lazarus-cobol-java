package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile012ValidKeyItems extends CobolProgram {
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
    private CobolString ws_rec = new CobolString(5); // Group: WS-REC
    private short ws_rec_test_p2 = (short) 0;
    private BigDecimal ws_rec_test_p3 = BigDecimal.ZERO;

    // FILE SECTION — TEST-SOME
    private CobolString some_rec = new CobolString(5); // Group: SOME-REC
    private short some_rec_test_p2 = (short) 0;
    private BigDecimal some_rec_test_p3 = BigDecimal.ZERO;

    // FILE SECTION — TEST-FILE
    private CobolString test_rec = new CobolString(12); // Group: TEST-REC
    private CobolString test_p1 = new CobolString(4);
    private CobolString filler_1 = new CobolString(4);
    private CobolString test_p4 = new CobolString(4);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(5);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_rec = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("WS-REC").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_p2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("TEST-P2").picDigits(4).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_p3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("TEST-P3").picDigits(5).signed(true).build();

    // FILE DESCRIPTORS
    private CobolFile test_some = new CobolFile("FILE-TEST", "INDEXED", "DYNAMIC", "TEST-SOME");
    {
        test_some.registerIndexedPrimaryKey("TEST-P2", 0, 4);
        test_some.registerIndexedAltKey("TEST-P3", 4, 5, false);
    }
    private CobolFile test_file = new CobolFile("FILE-TEST2", "INDEXED", "DYNAMIC", "TEST-FILE");
    {
        test_file.registerIndexedPrimaryKey("TEST-P1", 0, 4);
        test_file.registerIndexedAltKey("TEST-P4", 8, 4, false);
    }


    private void para_main() {
        test_file.open("INPUT");
        test_file.close();
        test_some.open("OUTPUT");
        { /* Build group WS-REC from children before group access */
            String _gbuf = ws_rec.get();
            StringBuilder _sb = new StringBuilder(5);
            _sb.append(CobolDisplay.formatPic(ws_rec_test_p2, 2, 0, false));
            _sb.append(CobolDisplay.formatPic(ws_rec_test_p3, 3, 0, false));
            ws_rec.set(_sb.toString());
        }
        some_rec_test_p2 = ws_rec_test_p2;
        some_rec_test_p3 = ws_rec_test_p3;
        some_rec.setRefMod(1, 2, CobolDisplay.formatPic(some_rec_test_p2, 2, 0, false));
        some_rec.setRefMod(3, 3, CobolDisplay.formatPic(some_rec_test_p3, 3, 0, false));
        test_some.write(some_rec);
        test_some.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynFile012ValidKeyItems");
            CobolProgram.registerCallAlias("prog", "SynFile012ValidKeyItems");
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
        new SynFile012ValidKeyItems().run();
    }
}
