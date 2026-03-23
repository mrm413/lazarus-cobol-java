package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter017DuplicateDetailLine extends CobolProgram {
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
    private CobolString save_item = new CobolString(1);

    // FILE SECTION — REPORT-FILE


    // FILE DESCRIPTORS
    private CobolFile report_file = new CobolFile("SEQUENTIAL", "SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
    }

    private void report_file() {
        /* RAW: INITIATE  */
    }

    private void myreport() {
    }

    private void save_item() {
        /* RAW: GENERATE  */
    }

    private void detail_line() {
    }

    private void save_item_2() {
        /* RAW: GENERATE  */
    }

    private void detail_line_2() {
        /* RAW: GENERATE  */
    }

    private void snd_detail_line() {
        /* RAW: GENERATE  */
    }

    private void trd_detail_line() {
    }

    private void save_item_3() {
        /* RAW: GENERATE  */
    }

    private void trd_detail_line_2() {
        /* RAW: TERMINATE  */
    }

    private void myreport_2() {
    }

    private void report_file_2() {
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunReportwriter017DuplicateDetailLine().run();
    }
}
