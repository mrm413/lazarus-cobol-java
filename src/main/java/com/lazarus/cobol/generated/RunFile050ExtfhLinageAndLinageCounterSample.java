package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile050ExtfhLinageAndLinageCounterSample extends CobolProgram {
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
    private CobolString command_arguments = new CobolString(1024);
    private CobolString file_name = new CobolString(160);
    private CobolString data_file_status = new CobolString(2);
    private int lc = 0;
    private CobolString report_line_blank = new CobolString(1); // Group: report-line-blank
    private CobolString report_line_data = new CobolString(1); // Group: report-line-data
    private int body_tag = 0;
    private CobolString line_3 = new CobolString(74);
    private CobolString report_line_header = new CobolString(1); // Group: report-line-header
    private int page_no = 0;
    private int header_tag = 0;
    private int page_count = 0;

    // FILE SECTION — data-file
    private CobolString data_record = new CobolString(1); // Group: data-record
    private CobolString data_line = new CobolString(80);

    // FILE SECTION — mini-report
    private CobolString report_line = new CobolString(80);


    // FILE DESCRIPTORS
    private CobolFile data_file = new CobolFile("prog.cob", "LINE SEQUENTIAL", "SEQUENTIAL");
    // File status: data-file-status
    private CobolFile mini_report = new CobolFile("mini-report", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString endofdata = new CobolString(256);
    private CobolString linage_counter = new CobolString(256);
    private CobolString cb_true = new CobolString(256);

    private void para_main() {
    }

    private void data_file() {
        if (data_file.read(null) == FileStatus.AT_END) {
            CobolDisplay.display("File open error: " + String.valueOf(data_file_status));
            System.exit(0);
        }
    }

    private void mini_report() {
        mini_report.write(report_line_blank);
    }

    private void page_count() {
    }

    private void page_no() {
        mini_report.write(report_line_header);
        while (!(!String.valueOf(endofdata).trim().isEmpty())) {
        }
        CobolDisplay.display("Normal termination, ending status: " + String.valueOf(data_file_status));
    }

    private void mini_report_2() {
    }

    private void data_file_2() {
        System.exit(0);
    }

    private void readwrite_loop() {
        report_line_data.set(String.valueOf(data_record));
        body_tag = new BigDecimal(String.valueOf(linage_counter).trim()).intValue();
        mini_report.write(report_line_data);
        /* RAW: end-of-page  */
        page_count = new BigDecimal(String.valueOf(page_count + 1).trim()).intValue();
        page_no = new BigDecimal(String.valueOf(page_count).trim()).intValue();
        header_tag = new BigDecimal(String.valueOf(linage_counter).trim()).intValue();
        mini_report.write(report_line_header);
        if (data_file.read(null) == FileStatus.AT_END) {
            endofdata.set(String.valueOf(cb_true));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile050ExtfhLinageAndLinageCounterSample().run();
    }
}
