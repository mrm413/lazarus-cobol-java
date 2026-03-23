package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter007SampleChargeReport extends CobolProgram {
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
    private int discount_ix = 0;
    private int pic = 0;
    // WORKING-STORAGE SECTION
    private CobolString end_of_file_switch = new CobolString(1);
    private CobolString discount_table = new CobolString(1); // Group: DISCOUNT-TABLE
    private CobolString[] discount = new CobolString[9];
    private CobolString calculated_fields = new CobolString(1); // Group: CALCULATED-FIELDS
    private int ws_discount_amt = 0;
    private int ws_charge_amt = 0;

    // FILE SECTION — TRANSACTION-DATA
    private CobolString transaction_record = new CobolString(1); // Group: TRANSACTION-RECORD
    private int tr_customer_number = 0;
    private CobolString tr_customer_name = new CobolString(16);
    private int tr_item_number = 0;
    private int tr_item_department = 0;
    private int tr_item_cost = 0;

    // FILE SECTION — REPORT-FILE


    // FILE DESCRIPTORS
    private CobolFile transaction_data = new CobolFile("DATAIN", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile report_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL");

    
    private CobolFile _unnamed = new CobolFile(",", "SEQUENTIAL", "SEQUENTIAL");


    private void para_main() {
        /* RAW: 000 - */
    }

    private void initiate() {
        transaction_data.open("INPUT");
        _unnamed.open("INPUT");
    }

    private void report_file() {
        /* RAW: INITIATE  */
    }

    private void customer_report() {
        if (transaction_data.read(null) == FileStatus.AT_END) {
            end_of_file_switch.set(String.valueOf("Y"));
        }
        _100();
        /* RAW: - PROCESS-TRANSACTION-DATA THRU 199 - */
        return;
    }

    private void end_of_file() {
        /* RAW: 000 - */
    }

    private void terminate() {
        /* RAW: TERMINATE  */
    }

    private void customer_report_2() {
        transaction_data.close();
        _unnamed.close();
    }

    private void report_file_2() {
        System.exit(0);
    }

    private void process_transaction_data() {
        discount_ix = new BigDecimal(String.valueOf(tr_item_department).trim()).intValue();
        ws_discount_amt = new BigDecimal(String.valueOf((tr_item_cost * Integer.parseInt(String.valueOf(discount[discount_ix - 1]).trim()))).trim()).intValue();
        ws_charge_amt = new BigDecimal(String.valueOf((tr_item_cost - ws_discount_amt)).trim()).intValue();
        /* RAW: GENERATE  */
    }

    private void charge_detail() {
        if (transaction_data.read(null) == FileStatus.AT_END) {
            end_of_file_switch.set(String.valueOf("Y"));
        }
        /* RAW: 199 - */
        return;
    }

    private void _100() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunReportwriter007SampleChargeReport().run();
    }
}
