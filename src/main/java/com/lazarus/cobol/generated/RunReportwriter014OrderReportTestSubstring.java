package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter014OrderReportTestSubstring extends CobolProgram {
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
    private int sales_tax = 0;
    private CobolString work_areas = new CobolString(1); // Group: WORK-AREAS
    private int amt_tax = 0;
    private int amt_order = 0;
    private int tot_order = 0;
    private int current_time = 0;

    // FILE SECTION — CUST-ORDER-FILE
    private CobolString cust_order_rec = new CobolString(1); // Group: CUST-ORDER-REC
    private int cust_num = 0;
    private int item_num = 0;
    private int num_ord = 0;
    private int price = 0;
    private int shipping = 0;
    private CobolString filler_1 = new CobolString(7);

    // FILE SECTION — CUST-PRINT-FILE


    // FILE DESCRIPTORS
    private CobolFile cust_order_file = new CobolFile("CUSTORD", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile cust_print_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString there_are_no_more_records = new CobolString(256); // fallback

    private void a000_mainline() {
        /* RAW: *  */
        /* UNKNOWN: useForDebugging */
        cust_order_file.open("INPUT");
        cust_print_file.open("OUTPUT");
        /* UNSUPPORTED: Report Writer — INITIATE */
        if (cust_order_file.read(null) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO"));
        }
        while (!(!String.valueOf(there_are_no_more_records).trim().isEmpty())) {
        }
        /* UNSUPPORTED: Report Writer — TERMINATE */
        cust_order_file.close();
        cust_print_file.close();
        System.exit(0);
    }

    private void a001_loop() {
        amt_order = new BigDecimal(String.valueOf(num_ord * price).trim()).intValue();
        amt_tax = new BigDecimal(String.valueOf(amt_order * sales_tax).trim()).intValue();
        tot_order = new BigDecimal(String.valueOf(amt_order + shipping + amt_tax).trim()).intValue();
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (cust_order_file.read(null) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO"));
        }
    }

    @Override
    public void run() {
        a000_mainline();
    }

    public static void main(String[] args) {
        new RunReportwriter014OrderReportTestSubstring().run();
    }
}
