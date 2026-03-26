package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter027BeforeReporting extends CobolProgram {
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
    private CobolString ws_in_rec = new CobolString(1); // Group: WS-IN-REC
    private CobolString ws_student_name = new CobolString(8);
    private int ws_book_pay = 0;
    private int ws_tution_pay = 0;
    private int ws_transport_pay = 0;

    // FILE SECTION — PRINT-FILE


    // FILE DESCRIPTORS
    private CobolFile print_file = new CobolFile("SUM.TXT", "LINE SEQUENTIAL", "SEQUENTIAL");

    private CobolString _filler_001 = new CobolString(256); // fallback

    // SECTION: BEFORE-DETAIL1
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private void before_detail1() {
        use();
    }

    private void use() {
        /* RAW: BEFORE REPORTING REPORT-LINE */
        CobolDisplay.display("BEFORE DETAIL - SHOULD DISPLAY");
        CobolDisplay.display("==============================");
    }

    // SECTION: BEFORE-FINAL1
    private void before_final1() {
        use();
        calc_grand_sum_and_average();
    }

    private void use_2() {
        /* RAW: BEFORE REPORTING FINAL-FOOTING */
    }

    private void calc_grand_sum_and_average() {
        CobolDisplay.display("BEFORE FINAL - SHOULD DISPLAY");
    }

    private void para_main() {
        print_file.open("OUTPUT");
        /* UNSUPPORTED: Report Writer — INITIATE */
        ws_transport_pay = new BigDecimal(String.valueOf(105).trim()).intValue();
        _filler_002.set(String.valueOf(105));
        ws_book_pay = new BigDecimal(String.valueOf(105).trim()).intValue();
        _filler_003.set(String.valueOf(105));
        ws_tution_pay = new BigDecimal(String.valueOf(105).trim()).intValue();
        /* UNSUPPORTED: Report Writer — GENERATE */
        ws_transport_pay = new BigDecimal(String.valueOf(106).trim()).intValue();
        _filler_004.set(String.valueOf(106));
        ws_book_pay = new BigDecimal(String.valueOf(106).trim()).intValue();
        _filler_005.set(String.valueOf(106));
        ws_tution_pay = new BigDecimal(String.valueOf(106).trim()).intValue();
        /* UNSUPPORTED: Report Writer — GENERATE */
        /* UNSUPPORTED: Report Writer — TERMINATE */
        print_file.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunReportwriter027BeforeReporting().run();
    }
}
