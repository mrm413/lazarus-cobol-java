package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter015SampleControlBreak extends CobolProgram {
    private int tally = 0;
    private int return_code = 0;
    private int sort_return = 0;
    private int number_of_call_parameters = 0;
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
    // WORKING-STORAGE SECTION
    private CobolString indicators = new CobolString(1); // Group: INDICATORS
    private CobolString are_there_more_records = new CobolString(3);
    private CobolString constants = new CobolString(1); // Group: CONSTANTS
    private int num = 0;
    private CobolString student_area = new CobolString(1); // Group: STUDENT-AREA
    private CobolString student_name = new CobolString(20);
    private int course_pts = 0;
    private CobolString major = new CobolString(3);
    private CobolString advisor = new CobolString(20);
    private CobolString campus = new CobolString(15);

    // FILE SECTION — STUDENT-FILE
    private CobolString student_rec = new CobolString(60);

    // FILE SECTION — PRINT-FILE


    // FILE DESCRIPTORS
    private CobolFile student_file = new CobolFile("STUDREC", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile print_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString there_are_no_more_records = new CobolString(256); // fallback

    private void a000_create_reports() {
        student_file.open("INPUT");
        print_file.open("OUTPUT");
        /* RAW: INITIATE CONTROL-BREAK */
        if (student_file.read(student_area) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO "));
        }
        while (!(!String.valueOf(there_are_no_more_records).trim().isEmpty())) {
        }
        /* RAW: TERMINATE CONTROL-BREAK */
        student_file.close();
        print_file.close();
        System.exit(0);
    }

    private void a001_loop() {
        /* RAW: GENERATE TRANS-LINE */
        if (student_file.read(student_area) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO "));
        }
    }

    @Override
    public void run() {
        a000_create_reports();
    }

    public static void main(String[] args) {
        new RunReportwriter015SampleControlBreak().run();
    }
}
