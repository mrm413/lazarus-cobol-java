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

public class RunReportwriter000ReportLineOrder extends CobolProgram {
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
    // FILE SECTION — REPORT-FILE

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    private ReportWriter _rpt_rwcs_report = new ReportWriter("RWCS-Report");

    // FILE DESCRIPTORS
    private CobolFile report_file = new CobolFile("PRINTOUT", "LINE SEQUENTIAL", "SEQUENTIAL", "REPORT-FILE");

    private CobolString printout = new CobolString(256, "PRINTOUT"); // fallback (implicit ASSIGN — initialized to name)

    // SECTION: 010-Main
    private void _010_main() {
        _exitSection = false;
        _1();
    }

    private void _1() {
        CobolIntrinsics.setCurrentLocation("prog; 1 OF 010-Main");
        { String _en = System.getenv("PRINTOUT"); if (_en != null) report_file.setFileName(_en); else report_file.setFileName(""); }
        report_file.open("OUTPUT");
        _rpt_rwcs_report.initiate();
        _rpt_rwcs_report.generate("DETAIL-LINE");
        _rpt_rwcs_report.generate("DETAIL-LINE");
        _rpt_rwcs_report.generate("DETAIL-LINE");
        _rpt_rwcs_report.generate("DETAIL-LINE");
        _rpt_rwcs_report.generate("DETAIL-LINE");
        _rpt_rwcs_report.generate("DETAIL-LINE");
        _rpt_rwcs_report.generate("DETAIL-LINE");
        _rpt_rwcs_report.generate("DETAIL-LINE");
        _rpt_rwcs_report.terminate();
        report_file.close();
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunReportwriter000ReportLineOrder");
            CobolProgram.registerCallAlias("prog", "RunReportwriter000ReportLineOrder");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            _010_main();
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
        new RunReportwriter000ReportLineOrder().run();
    }
}
