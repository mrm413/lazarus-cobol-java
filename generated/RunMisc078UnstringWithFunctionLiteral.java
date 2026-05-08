package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc078UnstringWithFunctionLiteral extends CobolProgram {
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
    private CobolString tstuns = new CobolString(479);
    private CobolString[] prm = new CobolString[4];
    {
        for (int _d0 = 0; _d0 < 4; _d0++) {
            prm[_d0] = new CobolString(16);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(543);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 543).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tstuns = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 479).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TSTUNS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_prm = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(479, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("PRM").build();


    private void para_main() {
        tstuns.set(String.valueOf("The,Quick,Brown,Fox"));
        {
            String _us_src = String.valueOf(tstuns);
            int _us_ptr = 1;
            int _us_tally = 0;
            boolean _us_overflow = false;
            if (_us_ptr <= _us_src.length()) {
                int _us_min0 = -1; int _us_dlen0 = 0; String _us_mdel0 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                String _us_p0;
                if (_us_min0 >= 0) {
                    _us_p0 = _us_src.substring(_us_ptr - 1, _us_min0);
                    _us_ptr = _us_min0 + _us_dlen0 + 1;
                } else {
                    _us_p0 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[1 - 1] == null) prm[1 - 1] = new CobolString(16);
                prm[1 - 1].set(String.valueOf(_us_p0));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min1 = -1; int _us_dlen1 = 0; String _us_mdel1 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min1 < 0 || _dp < _us_min1)) { _us_min1 = _dp; _us_dlen1 = _dl.length(); _us_mdel1 = _dl; } }
                String _us_p1;
                if (_us_min1 >= 0) {
                    _us_p1 = _us_src.substring(_us_ptr - 1, _us_min1);
                    _us_ptr = _us_min1 + _us_dlen1 + 1;
                } else {
                    _us_p1 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[2 - 1] == null) prm[2 - 1] = new CobolString(16);
                prm[2 - 1].set(String.valueOf(_us_p1));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min2 = -1; int _us_dlen2 = 0; String _us_mdel2 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min2 < 0 || _dp < _us_min2)) { _us_min2 = _dp; _us_dlen2 = _dl.length(); _us_mdel2 = _dl; } }
                String _us_p2;
                if (_us_min2 >= 0) {
                    _us_p2 = _us_src.substring(_us_ptr - 1, _us_min2);
                    _us_ptr = _us_min2 + _us_dlen2 + 1;
                } else {
                    _us_p2 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[3 - 1] == null) prm[3 - 1] = new CobolString(16);
                prm[3 - 1].set(String.valueOf(_us_p2));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min3 = -1; int _us_dlen3 = 0; String _us_mdel3 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min3 < 0 || _dp < _us_min3)) { _us_min3 = _dp; _us_dlen3 = _dl.length(); _us_mdel3 = _dl; } }
                String _us_p3;
                if (_us_min3 >= 0) {
                    _us_p3 = _us_src.substring(_us_ptr - 1, _us_min3);
                    _us_ptr = _us_min3 + _us_dlen3 + 1;
                } else {
                    _us_p3 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[4 - 1] == null) prm[4 - 1] = new CobolString(16);
                prm[4 - 1].set(String.valueOf(_us_p3));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) _us_overflow = true;
        }
        CobolDisplay.display("PRM(1) is " + String.valueOf(prm[1 - 1]) + ":");
        CobolDisplay.display("PRM(2) is " + String.valueOf(prm[2 - 1]) + ":");
        CobolDisplay.display("PRM(3) is " + String.valueOf(prm[3 - 1]) + ":");
        CobolDisplay.display("PRM(4) is " + String.valueOf(prm[4 - 1]) + ":");
        {
            String _us_src = String.valueOf(CobolIntrinsics.upper_case(tstuns));
            int _us_ptr = 1;
            int _us_tally = 0;
            boolean _us_overflow = false;
            if (_us_ptr <= _us_src.length()) {
                int _us_min0 = -1; int _us_dlen0 = 0; String _us_mdel0 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                String _us_p0;
                if (_us_min0 >= 0) {
                    _us_p0 = _us_src.substring(_us_ptr - 1, _us_min0);
                    _us_ptr = _us_min0 + _us_dlen0 + 1;
                } else {
                    _us_p0 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[1 - 1] == null) prm[1 - 1] = new CobolString(16);
                prm[1 - 1].set(String.valueOf(_us_p0));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min1 = -1; int _us_dlen1 = 0; String _us_mdel1 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min1 < 0 || _dp < _us_min1)) { _us_min1 = _dp; _us_dlen1 = _dl.length(); _us_mdel1 = _dl; } }
                String _us_p1;
                if (_us_min1 >= 0) {
                    _us_p1 = _us_src.substring(_us_ptr - 1, _us_min1);
                    _us_ptr = _us_min1 + _us_dlen1 + 1;
                } else {
                    _us_p1 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[2 - 1] == null) prm[2 - 1] = new CobolString(16);
                prm[2 - 1].set(String.valueOf(_us_p1));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min2 = -1; int _us_dlen2 = 0; String _us_mdel2 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min2 < 0 || _dp < _us_min2)) { _us_min2 = _dp; _us_dlen2 = _dl.length(); _us_mdel2 = _dl; } }
                String _us_p2;
                if (_us_min2 >= 0) {
                    _us_p2 = _us_src.substring(_us_ptr - 1, _us_min2);
                    _us_ptr = _us_min2 + _us_dlen2 + 1;
                } else {
                    _us_p2 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[3 - 1] == null) prm[3 - 1] = new CobolString(16);
                prm[3 - 1].set(String.valueOf(_us_p2));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min3 = -1; int _us_dlen3 = 0; String _us_mdel3 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min3 < 0 || _dp < _us_min3)) { _us_min3 = _dp; _us_dlen3 = _dl.length(); _us_mdel3 = _dl; } }
                String _us_p3;
                if (_us_min3 >= 0) {
                    _us_p3 = _us_src.substring(_us_ptr - 1, _us_min3);
                    _us_ptr = _us_min3 + _us_dlen3 + 1;
                } else {
                    _us_p3 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[4 - 1] == null) prm[4 - 1] = new CobolString(16);
                prm[4 - 1].set(String.valueOf(_us_p3));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) _us_overflow = true;
        }
        CobolDisplay.display("Now using UPPER-CASE");
        CobolDisplay.display("PRM(1) is " + String.valueOf(prm[1 - 1]) + ":");
        CobolDisplay.display("PRM(2) is " + String.valueOf(prm[2 - 1]) + ":");
        CobolDisplay.display("PRM(3) is " + String.valueOf(prm[3 - 1]) + ":");
        CobolDisplay.display("PRM(4) is " + String.valueOf(prm[4 - 1]) + ":");
        {
            String _us_src = "Daddy,was,a,Rolling stone";
            int _us_ptr = 1;
            int _us_tally = 0;
            boolean _us_overflow = false;
            if (_us_ptr <= _us_src.length()) {
                int _us_min0 = -1; int _us_dlen0 = 0; String _us_mdel0 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                String _us_p0;
                if (_us_min0 >= 0) {
                    _us_p0 = _us_src.substring(_us_ptr - 1, _us_min0);
                    _us_ptr = _us_min0 + _us_dlen0 + 1;
                } else {
                    _us_p0 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[1 - 1] == null) prm[1 - 1] = new CobolString(16);
                prm[1 - 1].set(String.valueOf(_us_p0));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min1 = -1; int _us_dlen1 = 0; String _us_mdel1 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min1 < 0 || _dp < _us_min1)) { _us_min1 = _dp; _us_dlen1 = _dl.length(); _us_mdel1 = _dl; } }
                String _us_p1;
                if (_us_min1 >= 0) {
                    _us_p1 = _us_src.substring(_us_ptr - 1, _us_min1);
                    _us_ptr = _us_min1 + _us_dlen1 + 1;
                } else {
                    _us_p1 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[2 - 1] == null) prm[2 - 1] = new CobolString(16);
                prm[2 - 1].set(String.valueOf(_us_p1));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min2 = -1; int _us_dlen2 = 0; String _us_mdel2 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min2 < 0 || _dp < _us_min2)) { _us_min2 = _dp; _us_dlen2 = _dl.length(); _us_mdel2 = _dl; } }
                String _us_p2;
                if (_us_min2 >= 0) {
                    _us_p2 = _us_src.substring(_us_ptr - 1, _us_min2);
                    _us_ptr = _us_min2 + _us_dlen2 + 1;
                } else {
                    _us_p2 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[3 - 1] == null) prm[3 - 1] = new CobolString(16);
                prm[3 - 1].set(String.valueOf(_us_p2));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min3 = -1; int _us_dlen3 = 0; String _us_mdel3 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min3 < 0 || _dp < _us_min3)) { _us_min3 = _dp; _us_dlen3 = _dl.length(); _us_mdel3 = _dl; } }
                String _us_p3;
                if (_us_min3 >= 0) {
                    _us_p3 = _us_src.substring(_us_ptr - 1, _us_min3);
                    _us_ptr = _us_min3 + _us_dlen3 + 1;
                } else {
                    _us_p3 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[4 - 1] == null) prm[4 - 1] = new CobolString(16);
                prm[4 - 1].set(String.valueOf(_us_p3));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) _us_overflow = true;
        }
        CobolDisplay.display("Now using Literal");
        CobolDisplay.display("PRM(1) is " + String.valueOf(prm[1 - 1]) + ":");
        CobolDisplay.display("PRM(2) is " + String.valueOf(prm[2 - 1]) + ":");
        CobolDisplay.display("PRM(3) is " + String.valueOf(prm[3 - 1]) + ":");
        CobolDisplay.display("PRM(4) is " + String.valueOf(prm[4 - 1]) + ":");
        {
            String _us_src = String.valueOf(CobolIntrinsics.lower_case("Daddy,was,a,Rolling stone"));
            int _us_ptr = 1;
            int _us_tally = 0;
            boolean _us_overflow = false;
            if (_us_ptr <= _us_src.length()) {
                int _us_min0 = -1; int _us_dlen0 = 0; String _us_mdel0 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                String _us_p0;
                if (_us_min0 >= 0) {
                    _us_p0 = _us_src.substring(_us_ptr - 1, _us_min0);
                    _us_ptr = _us_min0 + _us_dlen0 + 1;
                } else {
                    _us_p0 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[1 - 1] == null) prm[1 - 1] = new CobolString(16);
                prm[1 - 1].set(String.valueOf(_us_p0));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min1 = -1; int _us_dlen1 = 0; String _us_mdel1 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min1 < 0 || _dp < _us_min1)) { _us_min1 = _dp; _us_dlen1 = _dl.length(); _us_mdel1 = _dl; } }
                String _us_p1;
                if (_us_min1 >= 0) {
                    _us_p1 = _us_src.substring(_us_ptr - 1, _us_min1);
                    _us_ptr = _us_min1 + _us_dlen1 + 1;
                } else {
                    _us_p1 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[2 - 1] == null) prm[2 - 1] = new CobolString(16);
                prm[2 - 1].set(String.valueOf(_us_p1));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min2 = -1; int _us_dlen2 = 0; String _us_mdel2 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min2 < 0 || _dp < _us_min2)) { _us_min2 = _dp; _us_dlen2 = _dl.length(); _us_mdel2 = _dl; } }
                String _us_p2;
                if (_us_min2 >= 0) {
                    _us_p2 = _us_src.substring(_us_ptr - 1, _us_min2);
                    _us_ptr = _us_min2 + _us_dlen2 + 1;
                } else {
                    _us_p2 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[3 - 1] == null) prm[3 - 1] = new CobolString(16);
                prm[3 - 1].set(String.valueOf(_us_p2));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min3 = -1; int _us_dlen3 = 0; String _us_mdel3 = "";
                { String _dl = ","; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min3 < 0 || _dp < _us_min3)) { _us_min3 = _dp; _us_dlen3 = _dl.length(); _us_mdel3 = _dl; } }
                String _us_p3;
                if (_us_min3 >= 0) {
                    _us_p3 = _us_src.substring(_us_ptr - 1, _us_min3);
                    _us_ptr = _us_min3 + _us_dlen3 + 1;
                } else {
                    _us_p3 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                if (prm[4 - 1] == null) prm[4 - 1] = new CobolString(16);
                prm[4 - 1].set(String.valueOf(_us_p3));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) _us_overflow = true;
        }
        CobolDisplay.display("Now using Literal + LOWER-CASE");
        CobolDisplay.display("PRM(1) is " + String.valueOf(prm[1 - 1]) + ":");
        CobolDisplay.display("PRM(2) is " + String.valueOf(prm[2 - 1]) + ":");
        CobolDisplay.display("PRM(3) is " + String.valueOf(prm[3 - 1]) + ":");
        CobolDisplay.display("PRM(4) is " + String.valueOf(prm[4 - 1]) + ":");
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc078UnstringWithFunctionLiteral");
            CobolProgram.registerCallAlias("prog", "RunMisc078UnstringWithFunctionLiteral");
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
        new RunMisc078UnstringWithFunctionLiteral().run();
    }
}
