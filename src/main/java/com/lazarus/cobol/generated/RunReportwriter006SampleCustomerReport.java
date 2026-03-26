package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter006SampleCustomerReport extends CobolProgram {
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
    private CobolString end_of_file_switch = new CobolString(1);

    // FILE SECTION — TRANSACTION-DATA
    private CobolString transaction_record = new CobolString(1); // Group: TRANSACTION-RECORD
    private int tr_customer_number = 0;
    private CobolString filler_1 = new CobolString(47);
    private CobolString tr_customer_name = new CobolString(16);
    private CobolString filler_2 = new CobolString(47);
    private int tr_item_number = 0;
    private int tr_item_department = 0;
    private CobolString filler_3 = new CobolString(47);
    private CobolString filler_4 = new CobolString(47);
    private int tr_item_cost = 0;
    private CobolString filler_5 = new CobolString(47);

    // FILE SECTION — REPORT-FILE


    // FILE DESCRIPTORS
    private CobolFile transaction_data = new CobolFile("DATAIN", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile report_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL");

    // FALLBACK FILE DESCRIPTORS
    private CobolFile _filler_001 = new CobolFile(",", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString end_of_file = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private void _000_initiate() {
        // body commented -- compile edge case
    }

    private void _000_terminate() {
        // body commented -- compile edge case
    }

    private void _100_process_transaction_data() {
        // body commented -- compile edge case
    }

    @Override
    public void run() {
        _000_initiate();
    }

    public static void main(String[] args) {
        new RunReportwriter006SampleCustomerReport().run();
    }
}
