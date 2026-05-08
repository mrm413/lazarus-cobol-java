package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc073UnstringDelimitedAllLowValue extends CobolProgram {
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
    private CobolString g = new CobolString(8, "ABC\u0000\u0000DEF"); // Group: G
    private CobolString filler_1 = new CobolString(3, "ABC");
    private CobolString filler_2 = new CobolString(2, "\u0000\u0000");
    private CobolString filler_3 = new CobolString(3, "DEF");
    private CobolString a = new CobolString(3);
    private CobolString b = new CobolString(3);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(14);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_6 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(11, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("B").build();


    private void para_main() {
        {
            String _us_src = String.valueOf(g);
            int _us_ptr = 1;
            int _us_tally = 0;
            boolean _us_overflow = false;
            if (_us_ptr <= _us_src.length()) {
                int _us_min0 = -1; int _us_dlen0 = 0; String _us_mdel0 = "";
                { String _dl = "\u0000"; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                String _us_p0;
                if (_us_min0 >= 0) {
                    _us_p0 = _us_src.substring(_us_ptr - 1, _us_min0);
                    _us_ptr = _us_min0 + _us_dlen0 + 1;
                    { String _adl = "\u0000"; while (_us_ptr <= _us_src.length() && _us_src.startsWith(_adl, _us_ptr - 1)) _us_ptr += _adl.length(); }
                } else {
                    _us_p0 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                a.set(_us_p0);
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min1 = -1; int _us_dlen1 = 0; String _us_mdel1 = "";
                { String _dl = "\u0000"; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min1 < 0 || _dp < _us_min1)) { _us_min1 = _dp; _us_dlen1 = _dl.length(); _us_mdel1 = _dl; } }
                String _us_p1;
                if (_us_min1 >= 0) {
                    _us_p1 = _us_src.substring(_us_ptr - 1, _us_min1);
                    _us_ptr = _us_min1 + _us_dlen1 + 1;
                    { String _adl = "\u0000"; while (_us_ptr <= _us_src.length() && _us_src.startsWith(_adl, _us_ptr - 1)) _us_ptr += _adl.length(); }
                } else {
                    _us_p1 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                b.set(_us_p1);
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) _us_overflow = true;
        }
        if (!CobolString.cobolEquals(String.valueOf(a), String.valueOf("ABC"))) {
            CobolDisplay.display(String.valueOf(a));
        }
        if (!CobolString.cobolEquals(String.valueOf(b), String.valueOf("DEF"))) {
            CobolDisplay.display(String.valueOf(b));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc073UnstringDelimitedAllLowValue");
            CobolProgram.registerCallAlias("prog", "RunMisc073UnstringDelimitedAllLowValue");
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
        new RunMisc073UnstringDelimitedAllLowValue().run();
    }
}
