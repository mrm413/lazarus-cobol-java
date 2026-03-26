package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter013StudentReportWithInitial extends CobolProgram {
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
    private CobolString are_there_more_records = new CobolString(3);

    // FILE SECTION — INPUT-FILE
    private CobolString input_rec = new CobolString(1); // Group: INPUT-REC
    private int student_id = 0;
    private CobolString student_name = new CobolString(20);
    private CobolString major = new CobolString(3);
    private int num_courses = 0;

    // FILE SECTION — PRINT-FILE


    // FILE DESCRIPTORS
    private CobolFile input_file = new CobolFile("STUDENT", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile print_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL");


    private void a000_mainline() {
        input_file.open("INPUT");
        print_file.open("OUTPUT");
        do_init();
        if (input_file.read(null) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO"));
        }
        while (!(String.valueOf(are_there_more_records).equals(String.valueOf("NO ")))) {
        }
        do_term();
        input_file.close();
        print_file.close();
        System.exit(0);
    }

    private void a001_loop() {
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (input_file.read(null) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO "));
        }
    }

    private void do_init() {
        /* UNSUPPORTED: Report Writer — INITIATE */
    }

    private void do_term() {
        /* UNSUPPORTED: Report Writer — TERMINATE */
    }

    @Override
    public void run() {
        a000_mainline();
    }

    public static void main(String[] args) {
        new RunReportwriter013StudentReportWithInitial().run();
    }
}
