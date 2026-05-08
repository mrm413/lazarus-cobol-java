package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc076UnstringDelimiterIn extends CobolProgram {
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
    private CobolString wk_cmd = new CobolString(8, "WWADDBCC");
    private CobolString wk_signs = new CobolString(2, "AB");
    private CobolString wks = wk_signs; // Group REDEFINES: WKS
    private CobolString[] wk_sign = new CobolString[2];
    {
        for (int _d0 = 0; _d0 < 2; _d0++) {
            wk_sign[_d0] = new CobolString(1);
        }
    }
    private CobolString[] wk_delim = new CobolString[2];
    private CobolString[] wk_data = new CobolString[3];

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(20);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_wk_cmd = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WK-CMD").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_wk_signs = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WK-SIGNS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_wks = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("WKS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_wk_sign = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WK-SIGN").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_wk_delim = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WK-DELIM").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_wk_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WK-DATA").build();


    private void para_main() {
        {
            String _us_src = String.valueOf(wk_cmd);
            int _us_ptr = 1;
            int _us_tally = 0;
            boolean _us_overflow = false;
            if (_us_ptr <= _us_src.length()) {
                int _us_min0 = -1; int _us_dlen0 = 0; String _us_mdel0 = "";
                { String _dl = String.valueOf(wk_sign[1 - 1]); int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                { String _dl = String.valueOf(wk_sign[2 - 1]); int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                String _us_p0;
                if (_us_min0 >= 0) {
                    _us_p0 = _us_src.substring(_us_ptr - 1, _us_min0);
                    _us_ptr = _us_min0 + _us_dlen0 + 1;
                } else {
                    _us_p0 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (wk_data[1 - 1] == null) wk_data[1 - 1] = new CobolString(2);
                wk_data[1 - 1].set(String.valueOf(_us_p0));
                wk_delim[1 - 1].set(_us_mdel0);
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min1 = -1; int _us_dlen1 = 0; String _us_mdel1 = "";
                { String _dl = String.valueOf(wk_sign[1 - 1]); int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min1 < 0 || _dp < _us_min1)) { _us_min1 = _dp; _us_dlen1 = _dl.length(); _us_mdel1 = _dl; } }
                { String _dl = String.valueOf(wk_sign[2 - 1]); int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min1 < 0 || _dp < _us_min1)) { _us_min1 = _dp; _us_dlen1 = _dl.length(); _us_mdel1 = _dl; } }
                String _us_p1;
                if (_us_min1 >= 0) {
                    _us_p1 = _us_src.substring(_us_ptr - 1, _us_min1);
                    _us_ptr = _us_min1 + _us_dlen1 + 1;
                } else {
                    _us_p1 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (wk_data[2 - 1] == null) wk_data[2 - 1] = new CobolString(2);
                wk_data[2 - 1].set(String.valueOf(_us_p1));
                wk_delim[2 - 1].set(_us_mdel1);
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min2 = -1; int _us_dlen2 = 0; String _us_mdel2 = "";
                { String _dl = String.valueOf(wk_sign[1 - 1]); int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min2 < 0 || _dp < _us_min2)) { _us_min2 = _dp; _us_dlen2 = _dl.length(); _us_mdel2 = _dl; } }
                { String _dl = String.valueOf(wk_sign[2 - 1]); int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min2 < 0 || _dp < _us_min2)) { _us_min2 = _dp; _us_dlen2 = _dl.length(); _us_mdel2 = _dl; } }
                String _us_p2;
                if (_us_min2 >= 0) {
                    _us_p2 = _us_src.substring(_us_ptr - 1, _us_min2);
                    _us_ptr = _us_min2 + _us_dlen2 + 1;
                } else {
                    _us_p2 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (wk_data[3 - 1] == null) wk_data[3 - 1] = new CobolString(2);
                wk_data[3 - 1].set(String.valueOf(_us_p2));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) _us_overflow = true;
        }
        if (((((!CobolString.cobolEquals(String.valueOf(wk_data[1 - 1]), String.valueOf("WW")) || !CobolString.cobolEquals(String.valueOf(wk_data[2 - 1]), String.valueOf("DD"))) || !CobolString.cobolEquals(String.valueOf(wk_data[3 - 1]), String.valueOf("CC"))) || !CobolString.cobolEquals(String.valueOf(wk_delim[1 - 1]), String.valueOf("A"))) || !CobolString.cobolEquals(String.valueOf(wk_delim[2 - 1]), String.valueOf("B")))) {
            CobolDisplay.display(String.valueOf(wk_data[1 - 1]) + String.valueOf(wk_data[2 - 1]) + String.valueOf(wk_data[3 - 1]) + String.valueOf(wk_delim[1 - 1]) + String.valueOf(wk_delim[2 - 1]));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc076UnstringDelimiterIn");
            CobolProgram.registerCallAlias("prog", "RunMisc076UnstringDelimiterIn");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Initialize REDEFINES OCCURS children from WK-SIGNS
            {
                String _redef_wks = wk_signs.get();
                for (int _i = 0; _i < 2; _i++) {
                    int _off = _i * 1 + 0;
                    if (wk_sign[_i] == null) wk_sign[_i] = new CobolString(1);
                    if (_off + 1 <= _redef_wks.length()) wk_sign[_i].set(_redef_wks.substring(_off, _off + 1));
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
        new RunMisc076UnstringDelimiterIn().run();
    }
}
