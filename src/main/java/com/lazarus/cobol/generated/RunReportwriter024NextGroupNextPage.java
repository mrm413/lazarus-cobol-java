package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter024NextGroupNextPage extends CobolProgram {
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
    private CobolString ws_current_date = new CobolString(23);
    private CobolString ws_system_date_r = new CobolString(1); // Group: WS-SYSTEM-DATE-R
    private CobolString ws_date_yyyy = new CobolString(4);
    private CobolString ws_date_mm = new CobolString(2);
    private CobolString ws_date_dd = new CobolString(2);
    private CobolString ws_time = new CobolString(6);
    private CobolString ws_rest = new CobolString(9);
    private int temp_file_eof = 0;

    // FILE SECTION — REPORT-FILE

    // FILE SECTION — TEMP-FILE
    private CobolString temp_rec = new CobolString(1); // Group: TEMP-REC
    private CobolString temp_region = new CobolString(2);
    private CobolString temp_branch = new CobolString(7);
    private CobolString temp_invoice = new CobolString(8);
    private CobolString temp_date = new CobolString(8);
    private CobolString temp_order = new CobolString(8);
    private CobolString temp_line_no = new CobolString(3);
    private CobolString temp_item = new CobolString(20);
    private int temp_tx_qty = 0;
    private int temp_cost = 0;


    // FILE DESCRIPTORS
    private CobolFile report_file = new CobolFile("REPORTFILE", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile temp_file = new CobolFile("TEMPFILE", "LINE SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        temp_file.open("INPUT");
        report_file.open("OUTPUT");
        ws_current_date.set(String.valueOf("20150225153000000000000"));
        /* UNSUPPORTED: Report Writer — INITIATE */
        process_detail_level_report(); // THRU PDLR-EXIT
        pdlr_exit();
        /* UNSUPPORTED: Report Writer — TERMINATE */
        temp_file.close();
        report_file.close();
        System.exit(0);
    }

    private void process_detail_level_report() {
        read_next_temp_rec(); // THRU RNTR-EXIT
        if ((temp_file_eof != 0)) {
            /* RAW: EQUALS 1 */
            pdlr_exit();
            return;
        }
        /* UNSUPPORTED: Report Writer — GENERATE */
        process_detail_level_report();
        return;
    }

    private void pdlr_exit() {
        return;
    }

    private void read_next_temp_rec() {
        if (temp_file.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD AT END */
        temp_file_eof = new BigDecimal(String.valueOf(1).trim()).intValue();
        return;
    }

    private void rntr_exit() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunReportwriter024NextGroupNextPage().run();
    }
}
