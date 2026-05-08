package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import com.lazarus.cobol.env.ReportWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter024NextGroupNextPage extends CobolProgram {
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
    // WORKING-STORAGE SECTION
    private CobolString ws_current_date = new CobolString(23);
    private CobolString ws_system_date_r = ws_current_date; // Group REDEFINES: WS-SYSTEM-DATE-R
    private CobolString ws_date_yyyy = new CobolString(4);
    private CobolString ws_date_mm = new CobolString(2);
    private CobolString ws_date_dd = new CobolString(2);
    private CobolString ws_time = new CobolString(6);
    private CobolString ws_rest = new CobolString(9);
    private int temp_file_eof = 0;

    // FILE SECTION — REPORT-FILE

    // FILE SECTION — TEMP-FILE
    private CobolString temp_rec = new CobolString(72); // Group: TEMP-REC
    private CobolString temp_region = new CobolString(2);
    private CobolString temp_branch = new CobolString(7);
    private CobolString temp_invoice = new CobolString(8);
    private CobolString temp_date = new CobolString(8);
    private CobolString temp_order = new CobolString(8);
    private CobolString temp_line_no = new CobolString(3);
    private CobolString temp_item = new CobolString(20);
    private int temp_tx_qty = 0;
    private BigDecimal temp_cost = BigDecimal.ZERO;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(47);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_current_date = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 23).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-CURRENT-DATE").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_system_date_r = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(23, 23).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("WS-SYSTEM-DATE-R").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_date_yyyy = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(23, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-DATE-YYYY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_date_mm = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-DATE-MM").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_date_dd = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-DATE-DD").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_time = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(31, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-TIME").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_rest = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(37, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-REST").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_temp_file_eof = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(46, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TEMP-FILE-EOF").picDigits(1).build();

    private ReportWriter _rpt_rpta = new ReportWriter("RPTA");

    // FILE DESCRIPTORS
    private CobolFile report_file = new CobolFile("REPORTFILE", "LINE SEQUENTIAL", "SEQUENTIAL", "REPORT-FILE");
    private CobolFile temp_file = new CobolFile("TEMPFILE", "LINE SEQUENTIAL", "SEQUENTIAL", "TEMP-FILE");

    private CobolString reportfile = new CobolString(256, "REPORTFILE"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString tempfile = new CobolString(256, "TEMPFILE"); // fallback (implicit ASSIGN — initialized to name)

    private void para_main() {
        { String _en = System.getenv("TEMPFILE"); if (_en != null) temp_file.setFileName(_en); else temp_file.setFileName(""); }
        temp_file.open("INPUT");
        { String _en = System.getenv("REPORTFILE"); if (_en != null) report_file.setFileName(_en); else report_file.setFileName(""); }
        report_file.open("OUTPUT");
        ws_current_date.set(String.valueOf("20150225153000000000000"));
        { /* Sync REDEFINES children of WS-CURRENT-DATE */
            String _rv = ws_current_date.get();
            int _rl = _rv.length();
            if (0 < _rl) { ws_date_yyyy.set(_rv.substring(0, Math.min(4, _rl))); }
            if (4 < _rl) { ws_date_mm.set(_rv.substring(4, Math.min(6, _rl))); }
            if (6 < _rl) { ws_date_dd.set(_rv.substring(6, Math.min(8, _rl))); }
            if (8 < _rl) { ws_time.set(_rv.substring(8, Math.min(14, _rl))); }
            if (14 < _rl) { ws_rest.set(_rv.substring(14, Math.min(23, _rl))); }
        }
        _rpt_rpta.initiate();
        { int _pp = 1;
            while (_pp <= 2) {
                _gotoIdx = -1;
                switch (_pp) {
                    case 1: process_detail_level_report(); break;
                    case 2: pdlr_exit(); break;
                }
                if (_gotoIdx >= 0) _pp = _gotoIdx; else _pp++;
            }
        }
        _rpt_rpta.terminate();
        temp_file.close();
        report_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void process_detail_level_report() {
        { int _pp = 3;
            while (_pp <= 4) {
                _gotoIdx = -1;
                switch (_pp) {
                    case 3: read_next_temp_rec(); break;
                    case 4: rntr_exit(); break;
                }
                if (_gotoIdx >= 0) _pp = _gotoIdx; else _pp++;
            }
        }
        if (temp_file_eof == 1) {
            _gotoIdx = 2; return;
        }
        _rpt_rpta.generate("RPTA-DETAIL-LINE");
        _gotoIdx = 1; return;
    }

    private void pdlr_exit() {
        return;
    }

    private void read_next_temp_rec() {
        if (temp_file.readNext(temp_rec) == FileStatus.AT_END) {
            temp_file_eof = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 1));
        } else {
            temp_region.set(CobolString.refMod(temp_rec, 1, 2));
            temp_branch.set(CobolString.refMod(temp_rec, 3, 7));
            temp_invoice.set(CobolString.refMod(temp_rec, 10, 8));
            temp_date.set(CobolString.refMod(temp_rec, 18, 8));
            temp_order.set(CobolString.refMod(temp_rec, 26, 8));
            temp_line_no.set(CobolString.refMod(temp_rec, 34, 3));
            temp_item.set(CobolString.refMod(temp_rec, 37, 20));
            try { temp_tx_qty = Integer.parseInt(CobolString.refMod(temp_rec, 57, 8).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { temp_cost = new BigDecimal(CobolString.refMod(temp_rec, 65, 8).toString().trim()); } catch (NumberFormatException _nfe) {}
        }
    }

    private void rntr_exit() {
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunReportwriter024NextGroupNextPage");
            CobolProgram.registerCallAlias("prog", "RunReportwriter024NextGroupNextPage");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            { int _p = 0;
                while (_p <= 0) {
                    _gotoIdx = -1;
                    switch (_p) {
                        case 0: para_main(); break;
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
        new RunReportwriter024NextGroupNextPage().run();
    }
}
