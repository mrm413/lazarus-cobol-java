package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc075UnstringDelimitedPointer extends CobolProgram {
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
    private CobolString ws_lay_record = new CobolString(66);
    private CobolString ws_dummy = new CobolString(50);
    private CobolString ws_keyword = new CobolString(32);
    private int ws_pointer = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(150);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_lay_record = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 66).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-LAY-RECORD").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_dummy = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(66, 50).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-DUMMY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_keyword = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(116, 32).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-KEYWORD").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_pointer = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(148, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-POINTER").picDigits(2).build();


    private void para_main() {
        ws_lay_record.set(String.valueOf("        10  AF-RECORD-TYPE-SEQUENCE-04     PIC   9(05) COMP-3."));
        ws_pointer = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 2));
        _0001_sub();
        if (ws_pointer != 48) {
            CobolDisplay.display("Expected 48 - Got " + CobolDisplay.formatPic(ws_pointer, 2, 0, false));
        }
        ws_pointer = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(ws_pointer).add(CobolIntrinsics.toBigDecimal(7))), 2));
        _0001_sub();
        if (ws_pointer != 62) {
            CobolDisplay.display("Expected 62 - Got " + CobolDisplay.formatPic(ws_pointer, 2, 0, false));
        }
        _0001_sub();
        if (ws_pointer != 63) {
            CobolDisplay.display("Expected 63 - Got " + CobolDisplay.formatPic(ws_pointer, 2, 0, false));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void _0001_sub() {
        {
            String _us_src = String.valueOf(ws_lay_record);
            int _us_ptr = (int) ws_pointer;
            int _us_tally = 0;
            boolean _us_overflow = false;
            if (_us_ptr <= _us_src.length()) {
                int _us_min0 = -1; int _us_dlen0 = 0; String _us_mdel0 = "";
                { String _dl = " PIC "; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                { String _dl = " COMP-3"; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                { String _dl = "."; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                String _us_p0;
                if (_us_min0 >= 0) {
                    _us_p0 = _us_src.substring(_us_ptr - 1, _us_min0);
                    _us_ptr = _us_min0 + _us_dlen0 + 1;
                } else {
                    _us_p0 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                ws_dummy.set(_us_p0);
                ws_keyword.set(_us_mdel0);
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) _us_overflow = true;
            ws_pointer = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(_us_ptr), 2));
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc075UnstringDelimitedPointer");
            CobolProgram.registerCallAlias("prog", "RunMisc075UnstringDelimitedPointer");
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
        new RunMisc075UnstringDelimitedPointer().run();
    }
}
