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

public class RunReportwriter012SampleReportWithRightCenter extends CobolProgram {
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
    private CobolString are_there_more_records = new CobolString(3, "YES");

    // FILE SECTION — INPUT-FILE
    private CobolString input_rec = new CobolString(34); // Group: INPUT-REC
    private int student_id = 0;
    private CobolString student_name = new CobolString(20);
    private CobolString major = new CobolString(3);
    private int num_courses = 0;

    // FILE SECTION — PRINT-FILE
    private CobolString rw_rec = new CobolString(90);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(3);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_are_there_more_records = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ARE-THERE-MORE-RECORDS").build();

    private ReportWriter _rpt_student_report = new ReportWriter("STUDENT-REPORT");

    // FILE DESCRIPTORS
    private CobolFile input_file = new CobolFile("STUDENT", "LINE SEQUENTIAL", "SEQUENTIAL", "INPUT-FILE");
    private CobolFile print_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL", "PRINT-FILE");

    private CobolString student = new CobolString(256, "STUDENT"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString line = new CobolString(256, "LINE"); // fallback (implicit ASSIGN — initialized to name)

    private void a000_mainline() {
        { String _en = System.getenv("STUDENT"); if (_en != null) input_file.setFileName(_en); else input_file.setFileName(""); }
        input_file.open("INPUT");
        { String _en = System.getenv("LINE"); if (_en != null) print_file.setFileName(_en); else print_file.setFileName(""); }
        print_file.open("OUTPUT");
        do_init();
        if (input_file.read(input_rec) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO"));
        } else {
            try { student_id = Integer.parseInt(CobolString.refMod(input_rec, 1, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            student_name.set(CobolString.refMod(input_rec, 6, 20));
            major.set(CobolString.refMod(input_rec, 26, 3));
            try { num_courses = Integer.parseInt(CobolString.refMod(input_rec, 29, 6).toString().trim()); } catch (NumberFormatException _nfe) {}
        }
        while (!CobolIntrinsics.performUntil(CobolString.cobolEquals(String.valueOf(are_there_more_records), String.valueOf("NO ")))) {
            a001_loop();
        }
        do_term();
        input_file.close();
        print_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void a001_loop() {
        _rpt_student_report.generate("REPORT-LINE");
        if (input_file.read(input_rec) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO "));
        } else {
            try { student_id = Integer.parseInt(CobolString.refMod(input_rec, 1, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            student_name.set(CobolString.refMod(input_rec, 6, 20));
            major.set(CobolString.refMod(input_rec, 26, 3));
            try { num_courses = Integer.parseInt(CobolString.refMod(input_rec, 29, 6).toString().trim()); } catch (NumberFormatException _nfe) {}
        }
    }

    private void do_init() {
        _rpt_student_report.initiate();
    }

    private void do_term() {
        _rpt_student_report.terminate();
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunReportwriter012SampleReportWithRightCenter");
            CobolProgram.registerCallAlias("prog", "RunReportwriter012SampleReportWithRightCenter");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            a000_mainline();
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
        new RunReportwriter012SampleReportWithRightCenter().run();
    }
}
