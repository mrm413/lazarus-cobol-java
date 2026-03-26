package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile049LinageAndLinageCounterSample extends CobolProgram {
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
    private CobolString filler_1 = new CobolString(6);
    private CobolString filler_2 = new CobolString(6);
    private CobolString filler_3 = new CobolString(6);
    private CobolString filler_4 = new CobolString(6);
    private CobolString filler_5 = new CobolString(6);
    private CobolString report_line_data = new CobolString(1); // Group: report-line-data
    private int body_tag = 0;
    private CobolString line_3 = new CobolString(74);
    private CobolString report_line_header = new CobolString(1); // Group: report-line-header
    private CobolString filler_6 = new CobolString(6);
    private int page_no = 0;
    private CobolString filler_7 = new CobolString(6);
    private CobolString filler_8 = new CobolString(6);
    private int header_tag = 0;
    private CobolString filler_9 = new CobolString(6);
    private CobolString filler_10 = new CobolString(6);
    private CobolString page_date = new CobolString(6);
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

    private CobolString endofdata = new CobolString(256); // fallback
    private CobolString linage_counter = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback

    private void para_main() {
        data_file.open("INPUT");
        if (data_file.read(null) == FileStatus.AT_END) {
            CobolDisplay.display("File open error: " + String.valueOf(data_file_status));
            System.exit(0);
        }
        mini_report.open("OUTPUT");
        mini_report.write(report_line_blank);
        page_count = new BigDecimal(String.valueOf(1).trim()).intValue();
        page_date.set(String.valueOf(CobolIntrinsics.acceptFrom("date")));
        page_no = new BigDecimal(String.valueOf(page_count).trim()).intValue();
        mini_report.write(report_line_header);
        while (!(!String.valueOf(endofdata).trim().isEmpty())) {
        }
        CobolDisplay.display("Normal termination, ending status: " + String.valueOf(data_file_status));
        mini_report.close();
        data_file.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile049LinageAndLinageCounterSample().run();
    }
}
