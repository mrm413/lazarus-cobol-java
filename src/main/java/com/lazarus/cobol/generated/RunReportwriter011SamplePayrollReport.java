package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter011SamplePayrollReport extends CobolProgram {
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
    private int wpcd_ix = 0;
    private int wpcc_ix = 0;
    private int pic = 0;
    private int de_ix = 0;
    // WORKING-STORAGE SECTION
    private CobolString end_of_file_switch = new CobolString(1);
    private CobolString pr_sw = new CobolString(1);
    private int sum_fed_wh = 0;
    private int hi_gross = 0;
    private CobolString ws_employee_key = new CobolString(1); // Group: WS-EMPLOYEE-KEY
    private int ws_employee_number = 0;
    private CobolString filler_1 = new CobolString(9);
    private CobolString ws_employee_name = new CobolString(20);
    private CobolString ws_percents_computed = new CobolString(1); // Group: WS-PERCENTS-COMPUTED
    private CobolString[] wpc_dept = new CobolString[6]; // Group: WPC-DEPT
    private CobolString[][] wpc_percent = new CobolString[6][5];
    private CobolString department_table = new CobolString(1); // Group: DEPARTMENT-TABLE
    private CobolString filler_2 = new CobolString(9);
    private CobolString filler_3 = new CobolString(9);
    private CobolString filler_4 = new CobolString(9);
    private CobolString filler_5 = new CobolString(9);
    private CobolString filler_6 = new CobolString(9);
    private CobolString filler_7 = new CobolString(9);
    private CobolString filler_8 = new CobolString(9);
    private CobolString filler_9 = new CobolString(9);
    private CobolString filler_10 = new CobolString(9);
    private CobolString filler_11 = new CobolString(9);
    private CobolString filler_12 = new CobolString(9);
    private CobolString filler_13 = new CobolString(9);
    private CobolString[] department_entry = new CobolString[6]; // Group: DEPARTMENT-ENTRY
    private int[] de_number = new int[6];
    private CobolString[] de_name = new CobolString[6];
    private int[] de_gross = new int[6];
    private int[] de_fica = new int[6];
    private int[] de_fwt = new int[6];
    private int[] de_misc = new int[6];
    private int[] de_net = new int[6];

    // FILE SECTION — PAYROLL-REGISTER-DATA
    private CobolString payroll_register_record = new CobolString(1); // Group: PAYROLL-REGISTER-RECORD
    private int prr_department_number = 0;
    private CobolString filler_14 = new CobolString(9);
    private CobolString prr_employee_key = new CobolString(1); // Group: PRR-EMPLOYEE-KEY
    private int prr_employee_no = 0;
    private CobolString filler_15 = new CobolString(9);
    private CobolString prr_gender = new CobolString(1);
    private CobolString filler_16 = new CobolString(9);
    private CobolString prr_employee_name = new CobolString(20);
    private CobolString filler_17 = new CobolString(9);
    private int prr_pay_date = 0;
    private int prr_pay_date_year = 0;
    private int prr_pay_date_month = 0;
    private int prr_pay_date_day = 0;
    private CobolString filler_18 = new CobolString(9);
    private int prr_gross_pay = 0;
    private CobolString filler_19 = new CobolString(9);
    private int prr_fica_wh = 0;
    private CobolString filler_20 = new CobolString(9);
    private int prr_fed_wh = 0;
    private CobolString filler_21 = new CobolString(9);
    private int prr_misc_ded = 0;
    private CobolString filler_22 = new CobolString(9);
    private int prr_net_pay = 0;
    private CobolString filler_23 = new CobolString(9);

    // FILE SECTION — REPORT-FILE


    // FILE DESCRIPTORS
    private CobolFile payroll_register_data = new CobolFile("DATAIN", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile report_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL");

    // FALLBACK FILE DESCRIPTORS
    private CobolFile _filler_001 = new CobolFile(",", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString end_of_file = new CobolString(256); // fallback

    // SECTION: DEPT-HEAD-USE
    private CobolString _filler_006 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private void dept_head_use() {
        // body commented -- compile edge case
    }

    private void use() {
        // body commented -- compile edge case
    }

    private void dept_head_proc() {
        // body commented -- compile edge case
    }

    private void dept_head_exit() {
        // body commented -- compile edge case
    }

    // SECTION: EMPL-FOOT-USE
    private void empl_foot_use() {
        // body commented -- compile edge case
    }

    private void use_2() {
        // body commented -- compile edge case
    }

    private void empl_foot_proc() {
        // body commented -- compile edge case
    }

    private void empl_foot_exit() {
        // body commented -- compile edge case
    }

    // SECTION: DEPT-FOOT-USE
    private void dept_foot_use() {
        // body commented -- compile edge case
    }

    private void use_3() {
        // body commented -- compile edge case
    }

    private void dept_foot_proc() {
        // body commented -- compile edge case
    }

    private void dept_foot_exit() {
        // body commented -- compile edge case
    }

    // SECTION: COMP-FOOT-USE
    private void comp_foot_use() {
        // body commented -- compile edge case
    }

    private void use_4() {
        // body commented -- compile edge case
    }

    private void comp_foot_proc() {
        // body commented -- compile edge case
    }

    private void comp_foot_calc() {
        // body commented -- compile edge case
    }

    private void comp_foot_exit() {
        // body commented -- compile edge case
    }

    private void _000_initiate() {
        // body commented -- compile edge case
    }

    private void _000_terminate() {
        // body commented -- compile edge case
    }

    private void _100_process_payroll_data() {
        // body commented -- compile edge case
    }

    private void _199_exit() {
        // body commented -- compile edge case
    }

    @Override
    public void run() {
        _000_initiate();
    }

    public static void main(String[] args) {
        new RunReportwriter011SamplePayrollReport().run();
    }
}
