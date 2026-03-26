package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter016SampleInventoryReport extends CobolProgram {
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

    // FILE SECTION — INV-FILE
    private CobolString inv_rec = new CobolString(1); // Group: INV-REC
    private int dept_in = 0;
    private CobolString dept_nam_in = new CobolString(18);
    private int month_in = 0;
    private int item_no_in = 0;
    private int inv_tot_in = 0;

    // FILE SECTION — REPORT-FILE


    // FILE DESCRIPTORS
    private CobolFile inv_file = new CobolFile("INVFILE", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile report_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL");


    private void a000_mainline() {
        inv_file.open("INPUT");
        report_file.open("OUTPUT");
        /* RAW: INITIATE INV-REPORT */
        if (inv_file.read(null) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO "));
        }
        while (!(String.valueOf(are_there_more_records).equals(String.valueOf("NO ")))) {
        }
        /* RAW: TERMINATE INV-REPORT */
        inv_file.close();
        report_file.close();
        System.exit(0);
    }

    private void a001_loop() {
        /* RAW: GENERATE INV-DETAIL */
        if (inv_file.read(null) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO "));
        }
    }

    @Override
    public void run() {
        a000_mainline();
    }

    public static void main(String[] args) {
        new RunReportwriter016SampleInventoryReport().run();
    }
}
