package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter010SampleChargeReport4 extends CobolProgram {
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
    private int commission_ix = 0;
    // WORKING-STORAGE SECTION
    private CobolString end_of_file_switch = new CobolString(1);
    private CobolString commission_table = new CobolString(1); // Group: COMMISSION-TABLE
    private CobolString[] commission_entry = new CobolString[10]; // Group: COMMISSION-ENTRY
    private CobolString[] ce_district = new CobolString[10];
    private BigDecimal[] ce_rate = new BigDecimal[10];
    private CobolString calculated_fields = new CobolString(1); // Group: CALCULATED-FIELDS
    private int ws_commission = 0;

    // FILE SECTION — SALES-DATA
    private CobolString sales_record = new CobolString(1); // Group: SALES-RECORD
    private int sr_salesman_number = 0;
    private CobolString sr_district_code = new CobolString(1);
    private int sr_sale_amount = 0;

    // FILE SECTION — REPORT-FILE


    // FILE DESCRIPTORS
    private CobolFile sales_data = new CobolFile("DATAIN", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile report_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL");

    
    private CobolFile _unnamed = new CobolFile(",", "SEQUENTIAL", "SEQUENTIAL");


    // SECTION: USE-SALESMAN-TOTAL
    private CobolString st_sales_amt = new CobolString(256); // autofix
    private void use_salesman_total() {
        use();
        salesman_total();
        use_salesman_total_proc();
        use_salesman_total_exit();
    }

    private void use() {
        /* RAW: BEFORE REPORTING */
    }

    private void salesman_total() {
    }

    private void use_salesman_total_proc() {
        commission_ix = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* SEARCH COMMISSION-ENTRY */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < commission_entry.length && !_found; _idx++) {
                if (String.valueOf(ce_district[commission_ix - 1]).equals(String.valueOf(sr_district_code))) {
                    ws_commission = new BigDecimal(String.valueOf(ce_rate[commission_ix - 1].multiply(new BigDecimal(String.valueOf(st_sales_amt).trim()))).trim()).intValue();
                    _found = true;
                }
            }
            if (!_found) {
                ws_commission = new BigDecimal(String.valueOf(0).trim()).intValue();
            }
        }
    }

    private void use_salesman_total_exit() {
        return;
    }

    private void para_main() {
        /* RAW: 000 - */
    }

    private void initiate() {
        sales_data.open("INPUT");
        _unnamed.open("INPUT");
    }

    private void report_file() {
        /* RAW: INITIATE  */
    }

    private void district_sales_report() {
        if (sales_data.read(null) == FileStatus.AT_END) {
            end_of_file_switch.set(String.valueOf("Y"));
        }
        _100();
        /* RAW: - PROCESS-SALES-DATA THRU 199 - */
        return;
    }

    private void end_of_file() {
        /* RAW: 000 - */
    }

    private void terminate() {
        /* RAW: TERMINATE  */
    }

    private void district_sales_report_2() {
        sales_data.close();
        _unnamed.close();
    }

    private void report_file_2() {
        System.exit(0);
    }

    private void process_sales_data() {
        /* RAW: GENERATE  */
    }

    private void district_sales_report_3() {
        if (sales_data.read(null) == FileStatus.AT_END) {
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
        new RunReportwriter010SampleChargeReport4().run();
    }
}
