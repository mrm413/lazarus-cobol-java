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
    private CobolString ws_employee_name = new CobolString(20);
    private CobolString ws_percents_computed = new CobolString(1); // Group: WS-PERCENTS-COMPUTED
    private CobolString[] wpc_dept = new CobolString[6]; // Group: WPC-DEPT
    private CobolString[][] wpc_percent = new CobolString[6][5];
    private CobolString department_table = new CobolString(1); // Group: DEPARTMENT-TABLE
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
    private CobolString prr_employee_key = new CobolString(1); // Group: PRR-EMPLOYEE-KEY
    private int prr_employee_no = 0;
    private CobolString prr_gender = new CobolString(1);
    private CobolString prr_employee_name = new CobolString(20);
    private int prr_pay_date = 0;
    private int prr_pay_date_year = 0;
    private int prr_pay_date_month = 0;
    private int prr_pay_date_day = 0;
    private int prr_gross_pay = 0;
    private int prr_fica_wh = 0;
    private int prr_fed_wh = 0;
    private int prr_misc_ded = 0;
    private int prr_net_pay = 0;

    // FILE SECTION — REPORT-FILE


    // FILE DESCRIPTORS
    private CobolFile payroll_register_data = new CobolFile("DATAIN", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile report_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL");

    
    private CobolFile _unnamed = new CobolFile(",", "SEQUENTIAL", "SEQUENTIAL");


    // SECTION: DEPT-HEAD-USE
    private CobolString dept_foot_gross = new CobolString(256); // autofix
    private CobolString dept_foot_fica = new CobolString(256); // autofix
    private CobolString dept_foot_fwt = new CobolString(256); // autofix
    private CobolString dept_foot_misc = new CobolString(256); // autofix
    private CobolString dept_foot_net = new CobolString(256); // autofix
    private CobolString co_gross = new CobolString(256); // autofix
    private CobolString co_fica = new CobolString(256); // autofix
    private CobolString co_fwt = new CobolString(256); // autofix
    private CobolString co_misc = new CobolString(256); // autofix
    private CobolString co_net = new CobolString(256); // autofix
    private void dept_head_use() {
        use();
        dept_head();
        dept_head_proc();
        dept_head_exit();
    }

    private void use() {
        /* RAW: BEFORE REPORTING */
    }

    private void dept_head() {
    }

    private void dept_head_proc() {
        de_ix = new BigDecimal(String.valueOf(1).trim()).intValue();
        /* SEARCH DEPARTMENT-ENTRY */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < department_entry.length && !_found; _idx++) {
                if (de_number[de_ix - 1] == prr_department_number) {
                    de_gross[de_ix - 1] = new BigDecimal(String.valueOf(0).trim()).intValue();
                    /* MOVE to file , — not applicable */
                    de_fica[de_ix - 1] = new BigDecimal(String.valueOf(0).trim()).intValue();
                    /* MOVE to file , — not applicable */
                    de_fwt[de_ix - 1] = new BigDecimal(String.valueOf(0).trim()).intValue();
                    /* MOVE to file , — not applicable */
                    de_misc[de_ix - 1] = new BigDecimal(String.valueOf(0).trim()).intValue();
                    /* MOVE to file , — not applicable */
                    de_net[de_ix - 1] = new BigDecimal(String.valueOf(0).trim()).intValue();
                    _found = true;
                }
            }
        }
    }

    private void dept_head_exit() {
        return;
    }

    // SECTION: EMPL-FOOT-USE
    private void empl_foot_use() {
        use();
        empl_foot();
        empl_foot_proc();
        ws_employee_key();
        pr_sw();
        empl_foot_exit();
    }

    private void use_2() {
        /* RAW: BEFORE REPORTING */
    }

    private void empl_foot() {
    }

    private void empl_foot_proc() {
    }

    private void ws_employee_key() {
    }

    private void pr_sw() {
    }

    private void empl_foot_exit() {
        return;
    }

    // SECTION: DEPT-FOOT-USE
    private void dept_foot_use() {
        use();
        dept_foot();
        dept_foot_proc();
        printing();
        dept_foot_exit();
    }

    private void use_3() {
        /* RAW: BEFORE REPORTING */
    }

    private void dept_foot() {
    }

    private void dept_foot_proc() {
        de_gross[de_ix - 1] = new BigDecimal(String.valueOf(dept_foot_gross).trim()).intValue();
        de_fica[de_ix - 1] = new BigDecimal(String.valueOf(dept_foot_fica).trim()).intValue();
        de_fwt[de_ix - 1] = new BigDecimal(String.valueOf(dept_foot_fwt).trim()).intValue();
        de_misc[de_ix - 1] = new BigDecimal(String.valueOf(dept_foot_misc).trim()).intValue();
        de_net[de_ix - 1] = new BigDecimal(String.valueOf(dept_foot_net).trim()).intValue();
        /* RAW: * SUPPRESS */
    }

    private void printing() {
    }

    private void dept_foot_exit() {
        return;
    }

    // SECTION: COMP-FOOT-USE
    private void comp_foot_use() {
        use();
        comp_foot();
        comp_foot_proc();
        comp_foot_calc();
        comp_foot_exit();
    }

    private void use_4() {
        /* RAW: BEFORE REPORTING */
    }

    private void comp_foot() {
    }

    private void comp_foot_proc() {
        for (wpcd_ix = 1; !(wpcd_ix > 6); wpcd_ix += 1) {
        }
        comp_foot_exit();
        return;
    }

    private void comp_foot_calc() {
        de_ix = new BigDecimal(String.valueOf(wpcd_ix).trim()).intValue();
        wpcc_ix = new BigDecimal(String.valueOf(1).trim()).intValue();
        if (wpc_percent[wpcd_ix - 1][wpcc_ix - 1] == null) wpc_percent[wpcd_ix - 1][wpcc_ix - 1] = new CobolString(256);
    // wpc_percent[wpcd_ix - 1][wpcc_ix - 1].set(String.valueOf((((((de_gross[de_ix - 1] / co_gross)) * 100)) + 0.5)));
        wpcc_ix = new BigDecimal(String.valueOf(2).trim()).intValue();
        if (wpc_percent[wpcd_ix - 1][wpcc_ix - 1] == null) wpc_percent[wpcd_ix - 1][wpcc_ix - 1] = new CobolString(256);
    // wpc_percent[wpcd_ix - 1][wpcc_ix - 1].set(String.valueOf((((((de_fica[de_ix - 1] / co_fica)) * 100)) + 0.5)));
        wpcc_ix = new BigDecimal(String.valueOf(3).trim()).intValue();
        if (wpc_percent[wpcd_ix - 1][wpcc_ix - 1] == null) wpc_percent[wpcd_ix - 1][wpcc_ix - 1] = new CobolString(256);
    // wpc_percent[wpcd_ix - 1][wpcc_ix - 1].set(String.valueOf((((((de_fwt[de_ix - 1] / co_fwt)) * 100)) + 0.5)));
        wpcc_ix = new BigDecimal(String.valueOf(4).trim()).intValue();
        if (wpc_percent[wpcd_ix - 1][wpcc_ix - 1] == null) wpc_percent[wpcd_ix - 1][wpcc_ix - 1] = new CobolString(256);
    // wpc_percent[wpcd_ix - 1][wpcc_ix - 1].set(String.valueOf((((((de_misc[de_ix - 1] / co_misc)) * 100)) + 0.5)));
        wpcc_ix = new BigDecimal(String.valueOf(5).trim()).intValue();
        if (wpc_percent[wpcd_ix - 1][wpcc_ix - 1] == null) wpc_percent[wpcd_ix - 1][wpcc_ix - 1] = new CobolString(256);
    // wpc_percent[wpcd_ix - 1][wpcc_ix - 1].set(String.valueOf((((((de_net[de_ix - 1] / co_net)) * 100)) + 0.5)));
    }

    private void comp_foot_exit() {
        return;
    }

    private void para_main() {
        /* RAW: 000 - */
    }

    private void initiate() {
        payroll_register_data.open("INPUT");
        _unnamed.open("INPUT");
    }

    private void report_file() {
        /* RAW: INITIATE  */
    }

    private void quarterly_pay_register() {
        if (payroll_register_data.read(null) == FileStatus.AT_END) {
            /* RAW: END-OF-FILE-SWITCH  */
        }
        _100();
        /* RAW: - PROCESS-PAYROLL-DATA THRU 199 - */
        return;
    }

    private void end_of_file() {
        /* RAW: 000 - */
    }

    private void terminate() {
        /* RAW: TERMINATE  */
    }

    private void quarterly_pay_register_2() {
        payroll_register_data.close();
        _unnamed.close();
    }

    private void report_file_2() {
        System.exit(0);
    }

    private void process_payroll_data() {
        sum_fed_wh = new BigDecimal(String.valueOf(sum_fed_wh + prr_fed_wh).trim()).intValue();
        /* RAW: GENERATE  */
    }

    private void quarterly_pay_register_3() {
        if (String.valueOf(pr_sw).equals(String.valueOf("Y"))) {
            pr_sw.set(String.valueOf("N"));
            /* RAW: SUM-FED-WH  */
        }
        if (payroll_register_data.read(null) == FileStatus.AT_END) {
            /* RAW: END-OF-FILE-SWITCH  */
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
        new RunReportwriter011SamplePayrollReport().run();
    }
}
