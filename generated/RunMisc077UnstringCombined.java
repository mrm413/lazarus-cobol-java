package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc077UnstringCombined extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "UnstringTest";
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
    private CobolString inp_string = new CobolString(13, "ABC1|DEF--GHI");
    private int str_pointer = 0;
    private CobolString res_data = new CobolString(48); // Group: RES-DATA
    private CobolString res_trgt_1 = new CobolString(20);
    private CobolString res_delim_1 = new CobolString(1);
    private int res_count_1 = 0;
    private CobolString res_trgt_2 = new CobolString(20);
    private CobolString res_delim_2 = new CobolString(1);
    private int res_count_2 = 0;
    private int res_tally = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(63);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_inp_string = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 13).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("INP-STRING").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_str_pointer = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("STR-POINTER").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_res_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 48).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("RES-DATA").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_res_trgt_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("RES-TRGT-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_res_delim_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(35, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("RES-DELIM-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_res_count_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(36, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("RES-COUNT-1").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_res_trgt_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(38, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("RES-TRGT-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_res_delim_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(58, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("RES-DELIM-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_res_count_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(59, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("RES-COUNT-2").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_res_tally = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(61, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("RES-TALLY").picDigits(2).build();


    private void para_main() {
        res_data.setRefMod(1, 20, "                    ");
        res_trgt_1.set("                    ");
        res_data.setRefMod(21, 1, " ");
        res_delim_1.set(" ");
        res_data.setRefMod(22, 2, "00");
        res_count_1 = 0;
        res_data.setRefMod(24, 20, "                    ");
        res_trgt_2.set("                    ");
        res_data.setRefMod(44, 1, " ");
        res_delim_2.set(" ");
        res_data.setRefMod(45, 2, "00");
        res_count_2 = 0;
        res_data.setRefMod(47, 2, "00");
        res_tally = 0;
        str_pointer = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 2));
        {
            String _us_src = String.valueOf(inp_string);
            int _us_ptr = (int) str_pointer;
            int _us_tally = 0;
            boolean _us_overflow = false;
            if (_us_ptr <= _us_src.length()) {
                int _us_min0 = -1; int _us_dlen0 = 0; String _us_mdel0 = "";
                { String _dl = "|"; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                String _us_p0;
                if (_us_min0 >= 0) {
                    _us_p0 = _us_src.substring(_us_ptr - 1, _us_min0);
                    _us_ptr = _us_min0 + _us_dlen0 + 1;
                } else {
                    _us_p0 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                res_trgt_1.set(_us_p0);
                res_delim_1.set(_us_mdel0);
                res_count_1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(_us_p0.length()), 2));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min1 = -1; int _us_dlen1 = 0; String _us_mdel1 = "";
                { String _dl = "|"; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min1 < 0 || _dp < _us_min1)) { _us_min1 = _dp; _us_dlen1 = _dl.length(); _us_mdel1 = _dl; } }
                String _us_p1;
                if (_us_min1 >= 0) {
                    _us_p1 = _us_src.substring(_us_ptr - 1, _us_min1);
                    _us_ptr = _us_min1 + _us_dlen1 + 1;
                } else {
                    _us_p1 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                res_trgt_2.set(_us_p1);
                res_delim_2.set(_us_mdel1);
                res_count_2 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(_us_p1.length()), 2));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) _us_overflow = true;
            str_pointer = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(_us_ptr), 2));
            res_tally += _us_tally;
        }
        /* ON OVERFLOW handling */
        test_case_1_result();
        res_data.setRefMod(1, 20, "                    ");
        res_trgt_1.set("                    ");
        res_data.setRefMod(21, 1, " ");
        res_delim_1.set(" ");
        res_data.setRefMod(22, 2, "00");
        res_count_1 = 0;
        res_data.setRefMod(24, 20, "                    ");
        res_trgt_2.set("                    ");
        res_data.setRefMod(44, 1, " ");
        res_delim_2.set(" ");
        res_data.setRefMod(45, 2, "00");
        res_count_2 = 0;
        res_data.setRefMod(47, 2, "00");
        res_tally = 0;
        str_pointer = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 2));
        {
            String _us_src = String.valueOf(inp_string);
            int _us_ptr = (int) str_pointer;
            int _us_tally = 0;
            boolean _us_overflow = false;
            if (_us_ptr <= _us_src.length()) {
                int _us_min0 = -1; int _us_dlen0 = 0; String _us_mdel0 = "";
                { String _dl = "|"; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                { String _dl = "-"; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min0 < 0 || _dp < _us_min0)) { _us_min0 = _dp; _us_dlen0 = _dl.length(); _us_mdel0 = _dl; } }
                String _us_p0;
                if (_us_min0 >= 0) {
                    _us_p0 = _us_src.substring(_us_ptr - 1, _us_min0);
                    _us_ptr = _us_min0 + _us_dlen0 + 1;
                    { String _adl = "-"; while (_us_ptr <= _us_src.length() && _us_src.startsWith(_adl, _us_ptr - 1)) _us_ptr += _adl.length(); }
                } else {
                    _us_p0 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                res_trgt_1.set(_us_p0);
                res_delim_1.set(_us_mdel0);
                res_count_1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(_us_p0.length()), 2));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) {
                int _us_min1 = -1; int _us_dlen1 = 0; String _us_mdel1 = "";
                { String _dl = "|"; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min1 < 0 || _dp < _us_min1)) { _us_min1 = _dp; _us_dlen1 = _dl.length(); _us_mdel1 = _dl; } }
                { String _dl = "-"; int _dp = _us_src.indexOf(_dl, _us_ptr - 1); if (_dp >= 0 && (_us_min1 < 0 || _dp < _us_min1)) { _us_min1 = _dp; _us_dlen1 = _dl.length(); _us_mdel1 = _dl; } }
                String _us_p1;
                if (_us_min1 >= 0) {
                    _us_p1 = _us_src.substring(_us_ptr - 1, _us_min1);
                    _us_ptr = _us_min1 + _us_dlen1 + 1;
                    { String _adl = "-"; while (_us_ptr <= _us_src.length() && _us_src.startsWith(_adl, _us_ptr - 1)) _us_ptr += _adl.length(); }
                } else {
                    _us_p1 = _us_src.substring(_us_ptr - 1);
                    _us_ptr = _us_src.length() + 1;
                }
                res_trgt_2.set(_us_p1);
                res_delim_2.set(_us_mdel1);
                res_count_2 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(_us_p1.length()), 2));
                _us_tally++;
            }
            if (_us_ptr <= _us_src.length()) _us_overflow = true;
            str_pointer = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(_us_ptr), 2));
            res_tally += _us_tally;
        }
        /* ON OVERFLOW handling */
        test_case_2_result();
        return;
    }

    private void test_case_1_result() {
        if (!CobolString.cobolEquals(String.valueOf(res_trgt_1), String.valueOf("ABC1"))) {
            CobolDisplay.display("A: RES-TRGT-1 <" + String.valueOf(res_trgt_1) + "> != <ABC1>");
        }
        if (!CobolString.cobolEquals(String.valueOf(res_delim_1), String.valueOf("|"))) {
            CobolDisplay.display("A: RES-DELIM-1 <" + String.valueOf(res_delim_1) + "> != <|>");
        }
        if (res_count_1 != 4) {
            CobolDisplay.display("A: RES-COUNT-1 <" + CobolDisplay.formatPic(res_count_1, 2, 0, false) + "> != <4>");
        }
        if (!CobolString.cobolEquals(String.valueOf(res_trgt_2), String.valueOf("DEF--GHI"))) {
            CobolDisplay.display("A: RES-TRGT-2 <" + String.valueOf(res_trgt_2) + "> != <DEF--GHI>");
        }
        if (!CobolString.cobolEquals(String.valueOf(res_delim_2), String.valueOf(" "))) {
            CobolDisplay.display("A: RES-DELIM2 <" + String.valueOf(res_delim_2) + "> != SPACE");
        }
        if (res_count_2 != 8) {
            CobolDisplay.display("A: RES-COUNT-1 <" + CobolDisplay.formatPic(res_count_2, 2, 0, false) + "> != <8>");
        }
        if (str_pointer != 14) {
            CobolDisplay.display("A: STR-POINTER <" + CobolDisplay.formatPic(str_pointer, 2, 0, false) + "> != <14>");
        }
        if (res_tally != 2) {
            CobolDisplay.display("A: RES-TALLY <" + CobolDisplay.formatPic(res_tally, 2, 0, false) + "> != <2>");
        }
    }

    private void test_case_2_result() {
        if (!CobolString.cobolEquals(String.valueOf(res_trgt_1), String.valueOf("ABC1"))) {
            CobolDisplay.display("B: RES-TRGT-1 <" + String.valueOf(res_trgt_1) + "> != <ABC1>");
        }
        if (!CobolString.cobolEquals(String.valueOf(res_delim_1), String.valueOf("|"))) {
            CobolDisplay.display("B: RES-DELIM-1 <" + String.valueOf(res_delim_1) + "> != <|>");
        }
        if (res_count_1 != 4) {
            CobolDisplay.display("B: RES-COUNT-1 <" + CobolDisplay.formatPic(res_count_1, 2, 0, false) + "> != <4>");
        }
        if (!CobolString.cobolEquals(String.valueOf(res_trgt_2), String.valueOf("DEF"))) {
            CobolDisplay.display("B: RES-TRGT-2 <" + String.valueOf(res_trgt_2) + "> != <DEF>");
        }
        if (!CobolString.cobolEquals(String.valueOf(res_delim_2), String.valueOf("-"))) {
            CobolDisplay.display("B: RES-DELIM2 <" + String.valueOf(res_delim_2) + "> != <->");
        }
        if (res_count_2 != 3) {
            CobolDisplay.display("B: RES-COUNT-1 <" + CobolDisplay.formatPic(res_count_2, 2, 0, false) + "> != <3>");
        }
        if (str_pointer != 11) {
            CobolDisplay.display("B: STR-POINTER <" + CobolDisplay.formatPic(str_pointer, 2, 0, false) + "> != <11>");
        }
        if (res_tally != 2) {
            CobolDisplay.display("B: RES-TALLY <" + CobolDisplay.formatPic(res_tally, 2, 0, false) + "> != <2>");
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("UnstringTest", "", "UnstringTest.cob");
        CobolProgram.pushActive("UnstringTest");
        try {
            CobolProgram.registerCallAlias("UnstringTest", "RunMisc077UnstringCombined");
            CobolProgram.registerCallAlias("unstringtest", "RunMisc077UnstringCombined");
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
        new RunMisc077UnstringCombined().run();
    }
}
