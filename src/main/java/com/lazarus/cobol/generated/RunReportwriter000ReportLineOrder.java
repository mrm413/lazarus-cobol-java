package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter000ReportLineOrder extends CobolProgram {
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
    // FILE SECTION — REPORT-FILE


    // FILE DESCRIPTORS
    private CobolFile report_file = new CobolFile("PRINTOUT", "LINE SEQUENTIAL", "SEQUENTIAL");


    // SECTION: Main
    private void para_main() {
        _1();
        report_file();
    }

    private void _1() {
        report_file.open("OUTPUT");
        /* RAW: INITIATE RWCS-Report */
        /* RAW: GENERATE Detail-Line */
        /* RAW: GENERATE Detail-Line */
        /* RAW: GENERATE Detail-Line */
        /* RAW: GENERATE Detail-Line */
        /* RAW: GENERATE Detail-Line */
        /* RAW: GENERATE Detail-Line */
        /* RAW: GENERATE Detail-Line */
        /* RAW: GENERATE Detail-Line */
        /* RAW: TERMINATE RWCS-Report */
    }

    private void report_file() {
    }

    private void para_main_2() {
        /* RAW: 010 - */
    }

    @Override
    public void run() {
        _1();
    }

    public static void main(String[] args) {
        new RunReportwriter000ReportLineOrder().run();
    }
}
