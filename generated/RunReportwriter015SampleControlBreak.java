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

public class RunReportwriter015SampleControlBreak extends CobolProgram {
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
    private CobolString indicators = new CobolString(3, "YES"); // Group: INDICATORS
    private CobolString are_there_more_records = new CobolString(3, "YES");
    private CobolString constants = new CobolString(2, "01"); // Group: CONSTANTS
    private int num = 1;
    private CobolString student_area = new CobolString(60); // Group: STUDENT-AREA
    private CobolString student_name = new CobolString(20);
    private int course_pts = 0;
    private CobolString major = new CobolString(3);
    private CobolString advisor = new CobolString(20);
    private CobolString campus = new CobolString(15);

    // FILE SECTION — STUDENT-FILE
    private CobolString student_rec = new CobolString(60);

    // FILE SECTION — PRINT-FILE

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(65);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_indicators = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("INDICATORS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_are_there_more_records = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ARE-THERE-MORE-RECORDS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_constants = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("CONSTANTS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_num = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("NUM").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_student_area = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 60).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("STUDENT-AREA").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_student_name = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("STUDENT-NAME").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_course_pts = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(25, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("COURSE-PTS").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_major = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("MAJOR").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_advisor = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ADVISOR").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_campus = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(50, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("CAMPUS").build();

    private ReportWriter _rpt_control_break = new ReportWriter("CONTROL-BREAK");
    private CobolString adv_total = new CobolString(3); // RD field
    private CobolString maj_total = new CobolString(3); // RD field
    private CobolString stu_total = new CobolString(4); // RD field

    // FILE DESCRIPTORS
    private CobolFile student_file = new CobolFile("STUDREC", "LINE SEQUENTIAL", "SEQUENTIAL", "STUDENT-FILE");
    private CobolFile print_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL", "PRINT-FILE");

    private CobolString there_are_no_more_records = new CobolString(256); // fallback
    private CobolString studrec = new CobolString(256, "STUDREC"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString line = new CobolString(256, "LINE"); // fallback (implicit ASSIGN — initialized to name)

    private void a000_create_reports() {
        { String _en = System.getenv("STUDREC"); if (_en != null) student_file.setFileName(_en); else student_file.setFileName(""); }
        student_file.open("INPUT");
        { String _en = System.getenv("LINE"); if (_en != null) print_file.setFileName(_en); else print_file.setFileName(""); }
        print_file.open("OUTPUT");
        _rpt_control_break.initiate();
        if (student_file.read(student_area) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO "));
        } else {
        }
        while (!CobolIntrinsics.performUntil(CobolString.cobolEquals(String.valueOf(are_there_more_records), "NO"))) {
            a001_loop();
        }
        _rpt_control_break.terminate();
        student_file.close();
        print_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void a001_loop() {
        _rpt_control_break.generate("TRANS-LINE");
        if (student_file.read(student_area) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO "));
        } else {
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunReportwriter015SampleControlBreak");
            CobolProgram.registerCallAlias("prog", "RunReportwriter015SampleControlBreak");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            a000_create_reports();
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
        new RunReportwriter015SampleControlBreak().run();
    }
}
