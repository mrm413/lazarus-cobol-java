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

public class RunReportwriter027BeforeReporting extends CobolProgram {
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
    private CobolString ws_in_rec = new CobolString(23); // Group: WS-IN-REC
    private CobolString ws_student_name = new CobolString(8);
    private BigDecimal ws_book_pay = BigDecimal.ZERO;
    private BigDecimal ws_tution_pay = BigDecimal.ZERO;
    private BigDecimal ws_transport_pay = BigDecimal.ZERO;

    // FILE SECTION — PRINT-FILE

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(23);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_in_rec = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 23).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("WS-IN-REC").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_student_name = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-STUDENT-NAME").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_book_pay = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-BOOK-PAY").picDigits(5).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_tution_pay = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-TUTION-PAY").picDigits(5).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_transport_pay = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-TRANSPORT-PAY").picDigits(5).picScale(2).build();

    private ReportWriter _rpt_report_1 = new ReportWriter("REPORT-1");
    private CobolString fsm_1 = new CobolString(8); // RD field
    private CobolString fsm_2 = new CobolString(8); // RD field
    private CobolString fsm_3 = new CobolString(8); // RD field

    // FILE DESCRIPTORS
    private CobolFile print_file = new CobolFile("SUM.TXT", "LINE SEQUENTIAL", "SEQUENTIAL", "PRINT-FILE");

    private CobolString _filler_001 = new CobolString(256); // fallback

    // SECTION: BEFORE-DETAIL1
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_013 = new CobolString(256); // fallback
    private CobolString _filler_018 = new CobolString(256); // fallback
    private void before_detail1() {
        _exitSection = false;
        use_before_detail1();
    }

    private void use_before_detail1() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_BEFORE-DETAIL1 OF BEFORE-DETAIL1");
        /* USE BEFORE REPORTING REPORT-LINE */
        CobolDisplay.display("BEFORE DETAIL - SHOULD DISPLAY");
        CobolDisplay.display("==============================");
    }

    // SECTION: BEFORE-FINAL1
    private void before_final1() {
        _exitSection = false;
        use_before_final1();
        if (_exitSection) return;
        calc_grand_sum_and_average();
    }

    private void use_before_final1() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_BEFORE-FINAL1 OF BEFORE-FINAL1");
        /* USE BEFORE REPORTING FINAL-FOOTING */
    }

    private void calc_grand_sum_and_average() {
        CobolIntrinsics.setCurrentLocation("prog; CALC-GRAND-SUM-AND-AVERAGE OF BEFORE-FINAL1");
        CobolDisplay.display("BEFORE FINAL - SHOULD DISPLAY");
    }

    private void para_main() {
        print_file.open("OUTPUT");
        _rpt_report_1.initiate();
        ws_transport_pay = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(105), 5, 2, false);
        _filler_003.set(String.valueOf(105));
        ws_book_pay = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(105), 5, 2, false);
        _filler_008.set(String.valueOf(105));
        ws_tution_pay = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(105), 5, 2, false);
        _rpt_report_1.generate("REPORT-LINE");
        ws_transport_pay = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(106), 5, 2, false);
        _filler_013.set(String.valueOf(106));
        ws_book_pay = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(106), 5, 2, false);
        _filler_018.set(String.valueOf(106));
        ws_tution_pay = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(106), 5, 2, false);
        _rpt_report_1.generate("REPORT-LINE");
        _rpt_report_1.terminate();
        print_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunReportwriter027BeforeReporting");
            CobolProgram.registerCallAlias("prog", "RunReportwriter027BeforeReporting");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            _rpt_report_1.beforeReporting("REPORT-LINE", () -> before_detail1());
            _rpt_report_1.beforeReporting("FINAL-FOOTING", () -> before_final1());
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
        new RunReportwriter027BeforeReporting().run();
    }
}
