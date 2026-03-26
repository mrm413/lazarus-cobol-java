package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter025ReportPresentAfter extends CobolProgram {
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
    private CobolString ws_file_flags = new CobolString(1); // Group: WS-FILE-FLAGS
    private CobolString ws_input_status = new CobolString(2);
    private CobolString ws_output_status = new CobolString(2);

    // FILE SECTION — IN-FILE
    private CobolString in_rec = new CobolString(1); // Group: IN-REC
    private CobolString in_emp_name = new CobolString(25);
    private CobolString in_report_period = new CobolString(10);
    private CobolString in_emp_userid = new CobolString(10);
    private CobolString in_bill_days = new CobolString(3);
    private int in_salary = 0;
    private CobolString filler_1 = new CobolString(34);

    // FILE SECTION — OUT-FILE
    private CobolString rep_rec = new CobolString(100);


    // FILE DESCRIPTORS
    private CobolFile in_file = new CobolFile("INFILE", "LINE SEQUENTIAL", "SEQUENTIAL");
    // File status: WS-INPUT-STATUS
    private CobolFile out_file = new CobolFile("OREPORT", "LINE SEQUENTIAL", "SEQUENTIAL");
    // File status: WS-OUTPUT-STATUS

    private CobolString ws_date = new CobolString(256); // fallback
    private CobolString ws_time = new CobolString(256); // fallback
    private CobolString ws_input_ok = new CobolString(256); // fallback
    private CobolString ws_output_ok = new CobolString(256); // fallback
    private CobolString ws_input_eof = new CobolString(256); // fallback
    private CobolString ws_misc = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: *  */
        ws_date.set(String.valueOf(CobolIntrinsics.acceptFrom("DATE YYYYMMDD")));
        /* RAW: *  */
        ws_time.set(String.valueOf(CobolIntrinsics.acceptFrom("TIME")));
        /* UNSUPPORTED: Report Writer — INITIATE */
        /* UNSUPPORTED: Report Writer — GENERATE */
        _100_open_files();
        _200_main_process();
        /* UNSUPPORTED: Report Writer — TERMINATE */
        in_file.close();
        out_file.close();
        System.exit(0);
    }

    private void _100_open_files() {
        in_file.open("INPUT");
        if (!String.valueOf(ws_input_ok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING INFILE FILE.STATUS = " + String.valueOf(ws_input_status));
            System.exit(0);
        }
        out_file.open("OUTPUT");
        if (!String.valueOf(ws_output_ok).trim().isEmpty()) {
            rep_rec.set("");
        } else {
            CobolDisplay.display("ERROR OPENING OREPORT FILE.STATUS = " + String.valueOf(ws_output_status));
            System.exit(0);
        }
    }

    private void _200_main_process() {
        /* RAW: *  */
        /* UNSUPPORTED: Report Writer — GENERATE */
        while (!(!String.valueOf(ws_input_eof).trim().isEmpty())) {
            if (in_file.read(null) == FileStatus.AT_END) {
            }
            ws_misc.set(String.valueOf(in_rec));
            if (String.valueOf(ws_input_status).equals(String.valueOf("00"))) {
                /* UNSUPPORTED: Report Writer — GENERATE */
            } else if (String.valueOf(ws_input_status).equals(String.valueOf("10"))) {
                /* UNSUPPORTED: Report Writer — GENERATE */
            } else {
                CobolDisplay.display(":ERROR READING INFILE FILE.STATUS = " + String.valueOf(ws_input_status));
                System.exit(0);
            }
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunReportwriter025ReportPresentAfter().run();
    }
}
