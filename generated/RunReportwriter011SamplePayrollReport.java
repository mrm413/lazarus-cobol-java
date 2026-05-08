package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import com.lazarus.cobol.env.ReportWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter011SamplePayrollReport extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "prog";
    private int sort_return = 0;
    private int json_code = 0;
    private int xml_code = 0;
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
    private CobolString stdin = new CobolString(256);
    private CobolString stdout = new CobolString(256);
    private CobolString stderr = new CobolString(256);
    private boolean _exitSection = false;
    private int wpcd_ix = 1;
    private int wpcc_ix = 1;
    private int pic = 1;
    private int de_ix = 1;
    // WORKING-STORAGE SECTION
    private CobolString end_of_file_switch = new CobolString(1, "N");
    private CobolString pr_sw = new CobolString(1, "N");
    private BigDecimal sum_fed_wh = new BigDecimal("0");
    private int hi_gross = 2000;
    private CobolString ws_employee_key = new CobolString(27); // Group: WS-EMPLOYEE-KEY
    private int ws_employee_number = 0;
    private CobolString filler_1 = new CobolString(3);
    private CobolString ws_employee_name = new CobolString(20);
    private CobolString ws_percents_computed = new CobolString(30); // Group: WS-PERCENTS-COMPUTED
    private CobolString[] wpc_dept = new CobolString[6]; // Group: WPC-DEPT
    private CobolString[][] wpc_percent = new CobolString[6][5];
    {
        for (int _d0 = 0; _d0 < 6; _d0++) {
            for (int _d1 = 0; _d1 < 5; _d1++) {
                wpc_percent[_d0][_d1] = new CobolString(1);
            }
        }
    }
    private CobolString department_table = new CobolString(402, "01MANAGEMENT     0000000000000000000000000000000000000000000000000005ADMINISTRATIVE 0000000000000000000000000000000000000000000000000010SKILLED NURSING0000000000000000000000000000000000000000000000000015PATIENT SUPPORT0000000000000000000000000000000000000000000000000020HOUSEKEEPING   0000000000000000000000000000000000000000000000000025MAINTENANCE    00000000000000000000000000000000000000000000000000"); // Group: DEPARTMENT-TABLE
    private CobolString filler_2 = new CobolString(17, "01MANAGEMENT     ");
    private CobolString filler_3 = new CobolString(50, "00000000000000000000000000000000000000000000000000");
    private CobolString filler_4 = new CobolString(17, "05ADMINISTRATIVE ");
    private CobolString filler_5 = new CobolString(50, "00000000000000000000000000000000000000000000000000");
    private CobolString filler_6 = new CobolString(17, "10SKILLED NURSING");
    private CobolString filler_7 = new CobolString(50, "00000000000000000000000000000000000000000000000000");
    private CobolString filler_8 = new CobolString(17, "15PATIENT SUPPORT");
    private CobolString filler_9 = new CobolString(50, "00000000000000000000000000000000000000000000000000");
    private CobolString filler_10 = new CobolString(17, "20HOUSEKEEPING   ");
    private CobolString filler_11 = new CobolString(50, "00000000000000000000000000000000000000000000000000");
    private CobolString filler_12 = new CobolString(17, "25MAINTENANCE    ");
    private CobolString filler_13 = new CobolString(50, "00000000000000000000000000000000000000000000000000");
    private CobolString[] department_entry = new CobolString[6]; // Group: DEPARTMENT-ENTRY
    private int[] de_number = new int[6];
    private CobolString[] de_name = new CobolString[6];
    {
        for (int _d0 = 0; _d0 < 6; _d0++) {
            de_name[_d0] = new CobolString(15);
        }
    }
    private BigDecimal[] de_gross = new BigDecimal[6];
    private BigDecimal[] de_fica = new BigDecimal[6];
    private BigDecimal[] de_fwt = new BigDecimal[6];
    private BigDecimal[] de_misc = new BigDecimal[6];
    private BigDecimal[] de_net = new BigDecimal[6];

    // FILE SECTION — PAYROLL-REGISTER-DATA
    private CobolString payroll_register_record = new CobolString(80); // Group: PAYROLL-REGISTER-RECORD
    private int prr_department_number = 0;
    private CobolString filler_14 = new CobolString(1);
    private CobolString prr_employee_key = new CobolString(27); // Group: PRR-EMPLOYEE-KEY
    private int prr_employee_no = 0;
    private CobolString filler_15 = new CobolString(1);
    private CobolString prr_gender = new CobolString(1);
    private CobolString filler_16 = new CobolString(1);
    private CobolString prr_employee_name = new CobolString(20);
    private CobolString filler_17 = new CobolString(1);
    private int prr_pay_date = 0;
    private int prr_pay_date_year = 0;
    private int prr_pay_date_month = 0;
    private int prr_pay_date_day = 0;
    private CobolString filler_18 = new CobolString(1);
    private BigDecimal prr_gross_pay = BigDecimal.ZERO;
    private CobolString filler_19 = new CobolString(1);
    private BigDecimal prr_fica_wh = BigDecimal.ZERO;
    private CobolString filler_20 = new CobolString(1);
    private BigDecimal prr_fed_wh = BigDecimal.ZERO;
    private CobolString filler_21 = new CobolString(1);
    private BigDecimal prr_misc_ded = BigDecimal.ZERO;
    private CobolString filler_22 = new CobolString(1);
    private BigDecimal prr_net_pay = BigDecimal.ZERO;
    private CobolString filler_23 = new CobolString(9);

    // FILE SECTION — REPORT-FILE

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(874);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_end_of_file_switch = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("END-OF-FILE-SWITCH").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_pr_sw = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("PR-SW").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_sum_fed_wh = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SUM-FED-WH").picDigits(6).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_hi_gross = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("HI-GROSS").picDigits(5).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_employee_key = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 27).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("WS-EMPLOYEE-KEY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_employee_number = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("WS-EMPLOYEE-NUMBER").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_24 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(17, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_employee_name = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-EMPLOYEE-NAME").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_percents_computed = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(40, 30).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("WS-PERCENTS-COMPUTED").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_wpc_dept = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(40, 30).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("WPC-DEPT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_wpc_percent = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(40, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WPC-PERCENT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_department_table = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(70, 402).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DEPARTMENT-TABLE").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_25 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(70, 17).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_26 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(87, 50).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_27 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(137, 17).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_28 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(154, 50).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_29 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(204, 17).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_30 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(221, 50).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_31 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(271, 17).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_32 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(288, 50).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_33 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(338, 17).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_34 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(355, 50).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_35 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(405, 17).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_36 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(422, 50).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_37 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(472, 402).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_department_entry = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(472, 402).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DEPARTMENT-ENTRY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_de_number = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(472, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DE-NUMBER").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_de_name = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(474, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DE-NAME").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_de_gross = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(489, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DE-GROSS").picDigits(10).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_de_fica = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(499, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DE-FICA").picDigits(10).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_de_fwt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(509, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DE-FWT").picDigits(10).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_de_misc = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(519, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DE-MISC").picDigits(10).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_de_net = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(529, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("DE-NET").picDigits(10).picScale(2).build();

    private ReportWriter _rpt_quarterly_pay_register = new ReportWriter("QUARTERLY-PAY-REGISTER");
    private CobolString dept_foot_gross = new CobolString(9); // RD field
    private CobolString dept_foot_fica = new CobolString(7); // RD field
    private CobolString dept_foot_fwt = new CobolString(7); // RD field
    private CobolString dept_foot_misc = new CobolString(7); // RD field
    private CobolString dept_foot_net = new CobolString(9); // RD field
    private CobolString co_gross = new CobolString(10); // RD field
    private CobolString co_fica = new CobolString(9); // RD field
    private CobolString co_fwt = new CobolString(9); // RD field
    private CobolString co_misc = new CobolString(9); // RD field
    private CobolString co_net = new CobolString(10); // RD field
    private CobolString filler_38 = new CobolString(256); // RD field
    private CobolString filler_39 = new CobolString(256); // RD field
    private CobolString filler_40 = new CobolString(256); // RD field
    private CobolString filler_41 = new CobolString(256); // RD field
    private CobolString filler_42 = new CobolString(256); // RD field
    private CobolString filler_43 = new CobolString(256); // RD field

    // FILE DESCRIPTORS
    private CobolFile payroll_register_data = new CobolFile("DATAIN", "LINE SEQUENTIAL", "SEQUENTIAL", "PAYROLL-REGISTER-DATA");
    private CobolFile report_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL", "REPORT-FILE");

    private CobolString end_of_file = new CobolString(256); // fallback
    private CobolString datain = new CobolString(256, "DATAIN"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString line = new CobolString(256, "LINE"); // fallback (implicit ASSIGN — initialized to name)

    // SECTION: DEPT-HEAD-USE
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private CobolString _filler_012 = new CobolString(256); // fallback
    private CobolString _filler_017 = new CobolString(256); // fallback
    private void dept_head_use() {
        _exitSection = false;
        use_dept_head_use();
        if (_exitSection) return;
        dept_head_proc();
        if (_exitSection) return;
        dept_head_exit();
    }

    private void use_dept_head_use() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_DEPT-HEAD-USE OF DEPT-HEAD-USE");
        /* USE BEFORE REPORTING DEPT-HEAD */
    }

    private void dept_head_proc() {
        CobolIntrinsics.setCurrentLocation("prog; DEPT-HEAD-PROC OF DEPT-HEAD-USE");
        de_ix = (int) Math.abs(CobolIntrinsics.toBigDecimal(1).intValue());
        /* SEARCH DEPARTMENT-ENTRY */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < department_entry.length && !_found; _idx++) {
                de_ix = _idx + 1;
                if (de_number[de_ix - 1] == prr_department_number) {
                    de_gross[de_ix - 1] = CobolIntrinsics.toBigDecimal(0);
                    if (department_entry[de_ix - 1] != null) department_entry[de_ix - 1].setRefMod(18, 10, CobolDisplay.formatPic(de_gross[de_ix - 1] != null ? de_gross[de_ix - 1] : java.math.BigDecimal.ZERO, 10, 2, false));
                    _filler_002.set(String.valueOf(0));
                    de_fica[de_ix - 1] = CobolIntrinsics.toBigDecimal(0);
                    if (department_entry[de_ix - 1] != null) department_entry[de_ix - 1].setRefMod(28, 10, CobolDisplay.formatPic(de_fica[de_ix - 1] != null ? de_fica[de_ix - 1] : java.math.BigDecimal.ZERO, 10, 2, false));
                    _filler_007.set(String.valueOf(0));
                    de_fwt[de_ix - 1] = CobolIntrinsics.toBigDecimal(0);
                    if (department_entry[de_ix - 1] != null) department_entry[de_ix - 1].setRefMod(38, 10, CobolDisplay.formatPic(de_fwt[de_ix - 1] != null ? de_fwt[de_ix - 1] : java.math.BigDecimal.ZERO, 10, 2, false));
                    _filler_012.set(String.valueOf(0));
                    de_misc[de_ix - 1] = CobolIntrinsics.toBigDecimal(0);
                    if (department_entry[de_ix - 1] != null) department_entry[de_ix - 1].setRefMod(48, 10, CobolDisplay.formatPic(de_misc[de_ix - 1] != null ? de_misc[de_ix - 1] : java.math.BigDecimal.ZERO, 10, 2, false));
                    _filler_017.set(String.valueOf(0));
                    de_net[de_ix - 1] = CobolIntrinsics.toBigDecimal(0);
                    if (department_entry[de_ix - 1] != null) department_entry[de_ix - 1].setRefMod(58, 10, CobolDisplay.formatPic(de_net[de_ix - 1] != null ? de_net[de_ix - 1] : java.math.BigDecimal.ZERO, 10, 2, false));
                    _found = true;
                }
            }
        }
    }

    private void dept_head_exit() {
        CobolIntrinsics.setCurrentLocation("prog; DEPT-HEAD-EXIT OF DEPT-HEAD-USE");
        return;
    }

    // SECTION: EMPL-FOOT-USE
    private void empl_foot_use() {
        _exitSection = false;
        use_empl_foot_use();
        if (_exitSection) return;
        empl_foot_proc();
        if (_exitSection) return;
        empl_foot_exit();
    }

    private void use_empl_foot_use() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_EMPL-FOOT-USE OF EMPL-FOOT-USE");
        /* USE BEFORE REPORTING EMPL-FOOT */
    }

    private void empl_foot_proc() {
        CobolIntrinsics.setCurrentLocation("prog; EMPL-FOOT-PROC OF EMPL-FOOT-USE");
        { /* Build group PRR-EMPLOYEE-KEY from children before group access */
            String _gbuf = prr_employee_key.get();
            StringBuilder _sb = new StringBuilder(27);
            _sb.append(CobolDisplay.formatPic(prr_employee_no, 4, 0, false));
            _sb.append(_gbuf.substring(Math.min(4, _gbuf.length()), Math.min(5, _gbuf.length())));
            _sb.append(String.format("%-1s", String.valueOf(prr_gender)).substring(0, 1));
            _sb.append(_gbuf.substring(Math.min(6, _gbuf.length()), Math.min(7, _gbuf.length())));
            _sb.append(String.format("%-20s", String.valueOf(prr_employee_name)).substring(0, 20));
            prr_employee_key.set(_sb.toString());
        }
        ws_employee_key.set(String.valueOf(prr_employee_key));
        try { ws_employee_number = Integer.parseInt(CobolString.refMod(ws_employee_key, 1, 4).trim()); } catch (Exception _ge) {}
        if (ws_employee_name != null) ws_employee_name.set(CobolString.refMod(ws_employee_key, 8, 20));
        pr_sw.set(String.valueOf("Y"));
    }

    private void empl_foot_exit() {
        CobolIntrinsics.setCurrentLocation("prog; EMPL-FOOT-EXIT OF EMPL-FOOT-USE");
        return;
    }

    // SECTION: DEPT-FOOT-USE
    private void dept_foot_use() {
        _exitSection = false;
        use_dept_foot_use();
        if (_exitSection) return;
        dept_foot_proc();
        if (_exitSection) return;
        dept_foot_exit();
    }

    private void use_dept_foot_use() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_DEPT-FOOT-USE OF DEPT-FOOT-USE");
        /* USE BEFORE REPORTING DEPT-FOOT */
    }

    private void dept_foot_proc() {
        CobolIntrinsics.setCurrentLocation("prog; DEPT-FOOT-PROC OF DEPT-FOOT-USE");
        de_gross[de_ix - 1] = CobolIntrinsics.toBigDecimal(dept_foot_gross);
        if (department_entry[de_ix - 1] != null) department_entry[de_ix - 1].setRefMod(18, 10, CobolDisplay.formatPic(de_gross[de_ix - 1] != null ? de_gross[de_ix - 1] : java.math.BigDecimal.ZERO, 10, 2, false));
        de_fica[de_ix - 1] = CobolIntrinsics.toBigDecimal(dept_foot_fica);
        if (department_entry[de_ix - 1] != null) department_entry[de_ix - 1].setRefMod(28, 10, CobolDisplay.formatPic(de_fica[de_ix - 1] != null ? de_fica[de_ix - 1] : java.math.BigDecimal.ZERO, 10, 2, false));
        de_fwt[de_ix - 1] = CobolIntrinsics.toBigDecimal(dept_foot_fwt);
        if (department_entry[de_ix - 1] != null) department_entry[de_ix - 1].setRefMod(38, 10, CobolDisplay.formatPic(de_fwt[de_ix - 1] != null ? de_fwt[de_ix - 1] : java.math.BigDecimal.ZERO, 10, 2, false));
        de_misc[de_ix - 1] = CobolIntrinsics.toBigDecimal(dept_foot_misc);
        if (department_entry[de_ix - 1] != null) department_entry[de_ix - 1].setRefMod(48, 10, CobolDisplay.formatPic(de_misc[de_ix - 1] != null ? de_misc[de_ix - 1] : java.math.BigDecimal.ZERO, 10, 2, false));
        de_net[de_ix - 1] = CobolIntrinsics.toBigDecimal(dept_foot_net);
        if (department_entry[de_ix - 1] != null) department_entry[de_ix - 1].setRefMod(58, 10, CobolDisplay.formatPic(de_net[de_ix - 1] != null ? de_net[de_ix - 1] : java.math.BigDecimal.ZERO, 10, 2, false));
    }

    private void dept_foot_exit() {
        CobolIntrinsics.setCurrentLocation("prog; DEPT-FOOT-EXIT OF DEPT-FOOT-USE");
        return;
    }

    // SECTION: COMP-FOOT-USE
    private void comp_foot_use() {
        _exitSection = false;
        use_comp_foot_use();
        if (_exitSection) return;
        comp_foot_proc();
        if (_exitSection) return;
        comp_foot_calc();
        if (_exitSection) return;
        comp_foot_exit();
    }

    private void use_comp_foot_use() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_COMP-FOOT-USE OF COMP-FOOT-USE");
        /* USE BEFORE REPORTING COMP-FOOT */
    }

    private void comp_foot_proc() {
        CobolIntrinsics.setCurrentLocation("prog; COMP-FOOT-PROC OF COMP-FOOT-USE");
        for (wpcd_ix = 1; !(wpcd_ix > 6); wpcd_ix += 1) {
            comp_foot_calc();
        }
        comp_foot_exit();
        return;
    }

    private void comp_foot_calc() {
        CobolIntrinsics.setCurrentLocation("prog; COMP-FOOT-CALC OF COMP-FOOT-USE");
        de_ix = (int) Math.abs(CobolIntrinsics.toBigDecimal(wpcd_ix).intValue());
        wpcc_ix = (int) Math.abs(CobolIntrinsics.toBigDecimal(1).intValue());
        if (wpc_percent[wpcd_ix - 1] == null) wpc_percent[wpcd_ix - 1] = new CobolString[5];
        if (wpc_percent[wpcd_ix - 1][wpcc_ix - 1] == null) wpc_percent[wpcd_ix - 1][wpcc_ix - 1] = new CobolString(1);
        wpc_percent[wpcd_ix - 1][wpcc_ix - 1].set(String.valueOf(((de_gross[de_ix - 1].divide(CobolIntrinsics.toBigDecimal(co_gross), 40, RoundingMode.HALF_UP)).multiply(CobolIntrinsics.toBigDecimal(100))).add(new BigDecimal(".5"))));
        wpcc_ix = (int) Math.abs(CobolIntrinsics.toBigDecimal(2).intValue());
        if (wpc_percent[wpcd_ix - 1] == null) wpc_percent[wpcd_ix - 1] = new CobolString[5];
        if (wpc_percent[wpcd_ix - 1][wpcc_ix - 1] == null) wpc_percent[wpcd_ix - 1][wpcc_ix - 1] = new CobolString(1);
        wpc_percent[wpcd_ix - 1][wpcc_ix - 1].set(String.valueOf(((de_fica[de_ix - 1].divide(CobolIntrinsics.toBigDecimal(co_fica), 40, RoundingMode.HALF_UP)).multiply(CobolIntrinsics.toBigDecimal(100))).add(new BigDecimal(".5"))));
        wpcc_ix = (int) Math.abs(CobolIntrinsics.toBigDecimal(3).intValue());
        if (wpc_percent[wpcd_ix - 1] == null) wpc_percent[wpcd_ix - 1] = new CobolString[5];
        if (wpc_percent[wpcd_ix - 1][wpcc_ix - 1] == null) wpc_percent[wpcd_ix - 1][wpcc_ix - 1] = new CobolString(1);
        wpc_percent[wpcd_ix - 1][wpcc_ix - 1].set(String.valueOf(((de_fwt[de_ix - 1].divide(CobolIntrinsics.toBigDecimal(co_fwt), 40, RoundingMode.HALF_UP)).multiply(CobolIntrinsics.toBigDecimal(100))).add(new BigDecimal(".5"))));
        wpcc_ix = (int) Math.abs(CobolIntrinsics.toBigDecimal(4).intValue());
        if (wpc_percent[wpcd_ix - 1] == null) wpc_percent[wpcd_ix - 1] = new CobolString[5];
        if (wpc_percent[wpcd_ix - 1][wpcc_ix - 1] == null) wpc_percent[wpcd_ix - 1][wpcc_ix - 1] = new CobolString(1);
        wpc_percent[wpcd_ix - 1][wpcc_ix - 1].set(String.valueOf(((de_misc[de_ix - 1].divide(CobolIntrinsics.toBigDecimal(co_misc), 40, RoundingMode.HALF_UP)).multiply(CobolIntrinsics.toBigDecimal(100))).add(new BigDecimal(".5"))));
        wpcc_ix = (int) Math.abs(CobolIntrinsics.toBigDecimal(5).intValue());
        if (wpc_percent[wpcd_ix - 1] == null) wpc_percent[wpcd_ix - 1] = new CobolString[5];
        if (wpc_percent[wpcd_ix - 1][wpcc_ix - 1] == null) wpc_percent[wpcd_ix - 1][wpcc_ix - 1] = new CobolString(1);
        wpc_percent[wpcd_ix - 1][wpcc_ix - 1].set(String.valueOf(((de_net[de_ix - 1].divide(CobolIntrinsics.toBigDecimal(co_net), 40, RoundingMode.HALF_UP)).multiply(CobolIntrinsics.toBigDecimal(100))).add(new BigDecimal(".5"))));
    }

    private void comp_foot_exit() {
        CobolIntrinsics.setCurrentLocation("prog; COMP-FOOT-EXIT OF COMP-FOOT-USE");
        return;
    }

    private void _000_initiate() {
        { String _en = System.getenv("DATAIN"); if (_en != null) payroll_register_data.setFileName(_en); else payroll_register_data.setFileName(""); }
        payroll_register_data.open("INPUT");
        { String _en = System.getenv("LINE"); if (_en != null) report_file.setFileName(_en); else report_file.setFileName(""); }
        report_file.open("OUTPUT");
        _rpt_quarterly_pay_register.initiate();
        if (payroll_register_data.read(payroll_register_record) == FileStatus.AT_END) {
            end_of_file_switch.set(String.valueOf("Y"));
        } else {
            try { prr_department_number = Integer.parseInt(CobolString.refMod(payroll_register_record, 1, 2).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_employee_no = Integer.parseInt(CobolString.refMod(payroll_register_record, 4, 4).toString().trim()); } catch (NumberFormatException _nfe) {}
            prr_gender.set(CobolString.refMod(payroll_register_record, 9, 1));
            prr_employee_name.set(CobolString.refMod(payroll_register_record, 11, 20));
            try { prr_pay_date = Integer.parseInt(CobolString.refMod(payroll_register_record, 32, 8).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_pay_date_year = Integer.parseInt(CobolString.refMod(payroll_register_record, 40, 4).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_pay_date_month = Integer.parseInt(CobolString.refMod(payroll_register_record, 44, 2).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_pay_date_day = Integer.parseInt(CobolString.refMod(payroll_register_record, 46, 2).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_gross_pay = new BigDecimal(CobolString.refMod(payroll_register_record, 49, 6).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_fica_wh = new BigDecimal(CobolString.refMod(payroll_register_record, 56, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_fed_wh = new BigDecimal(CobolString.refMod(payroll_register_record, 62, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_misc_ded = new BigDecimal(CobolString.refMod(payroll_register_record, 68, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_net_pay = new BigDecimal(CobolString.refMod(payroll_register_record, 74, 6).toString().trim()); } catch (NumberFormatException _nfe) {}
            prr_employee_key.set(CobolString.refMod(payroll_register_record, 4, 27));
        }
        while (!CobolIntrinsics.performUntil(CobolString.cobolEquals(String.valueOf(end_of_file_switch), "Y"))) {
            _100_process_payroll_data(); // THRU 199-EXIT
            _199_exit();
        }
    }

    private void _000_terminate() {
        _rpt_quarterly_pay_register.terminate();
        payroll_register_data.close();
        report_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void _100_process_payroll_data() {
        sum_fed_wh = CobolIntrinsics.truncateToField(sum_fed_wh.add(CobolIntrinsics.toBigDecimal(prr_fed_wh)), 6, 2, false);
        _rpt_quarterly_pay_register.generate("QUARTERLY-PAY-REGISTER");
        if (CobolString.cobolEquals(String.valueOf(pr_sw), String.valueOf("Y"))) {
            pr_sw.set(String.valueOf("N"));
            sum_fed_wh = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(0), 6, 2, false);
        }
        if (payroll_register_data.read(payroll_register_record) == FileStatus.AT_END) {
            end_of_file_switch.set(String.valueOf("Y"));
        } else {
            try { prr_department_number = Integer.parseInt(CobolString.refMod(payroll_register_record, 1, 2).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_employee_no = Integer.parseInt(CobolString.refMod(payroll_register_record, 4, 4).toString().trim()); } catch (NumberFormatException _nfe) {}
            prr_gender.set(CobolString.refMod(payroll_register_record, 9, 1));
            prr_employee_name.set(CobolString.refMod(payroll_register_record, 11, 20));
            try { prr_pay_date = Integer.parseInt(CobolString.refMod(payroll_register_record, 32, 8).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_pay_date_year = Integer.parseInt(CobolString.refMod(payroll_register_record, 40, 4).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_pay_date_month = Integer.parseInt(CobolString.refMod(payroll_register_record, 44, 2).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_pay_date_day = Integer.parseInt(CobolString.refMod(payroll_register_record, 46, 2).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_gross_pay = new BigDecimal(CobolString.refMod(payroll_register_record, 49, 6).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_fica_wh = new BigDecimal(CobolString.refMod(payroll_register_record, 56, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_fed_wh = new BigDecimal(CobolString.refMod(payroll_register_record, 62, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_misc_ded = new BigDecimal(CobolString.refMod(payroll_register_record, 68, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { prr_net_pay = new BigDecimal(CobolString.refMod(payroll_register_record, 74, 6).toString().trim()); } catch (NumberFormatException _nfe) {}
            prr_employee_key.set(CobolString.refMod(payroll_register_record, 4, 27));
        }
    }

    private void _199_exit() {
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunReportwriter011SamplePayrollReport");
            CobolProgram.registerCallAlias("prog", "RunReportwriter011SamplePayrollReport");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Initialize REDEFINES OCCURS children from DEPARTMENT-TABLE
            {
                String _redef_filler_44 = department_table.get();
                for (int _i = 0; _i < 6; _i++) {
                    int _off = _i * 67 + 0;
                    if (_off + 2 <= _redef_filler_44.length()) { try { de_number[_i] = Integer.parseInt(_redef_filler_44.substring(_off, _off + 2).trim()); } catch (Exception _e) { de_number[_i] = 0; } }
                }
                for (int _i = 0; _i < 6; _i++) {
                    int _off = _i * 67 + 2;
                    if (de_name[_i] == null) de_name[_i] = new CobolString(15);
                    if (_off + 15 <= _redef_filler_44.length()) de_name[_i].set(_redef_filler_44.substring(_off, _off + 15));
                }
                for (int _i = 0; _i < 6; _i++) {
                    int _off = _i * 67 + 17;
                    if (_off + 10 <= _redef_filler_44.length()) { try { de_gross[_i] = new BigDecimal(_redef_filler_44.substring(_off, _off + 10).trim()); } catch (Exception _e) { de_gross[_i] = BigDecimal.ZERO; } }
                }
                for (int _i = 0; _i < 6; _i++) {
                    int _off = _i * 67 + 27;
                    if (_off + 10 <= _redef_filler_44.length()) { try { de_fica[_i] = new BigDecimal(_redef_filler_44.substring(_off, _off + 10).trim()); } catch (Exception _e) { de_fica[_i] = BigDecimal.ZERO; } }
                }
                for (int _i = 0; _i < 6; _i++) {
                    int _off = _i * 67 + 37;
                    if (_off + 10 <= _redef_filler_44.length()) { try { de_fwt[_i] = new BigDecimal(_redef_filler_44.substring(_off, _off + 10).trim()); } catch (Exception _e) { de_fwt[_i] = BigDecimal.ZERO; } }
                }
                for (int _i = 0; _i < 6; _i++) {
                    int _off = _i * 67 + 47;
                    if (_off + 10 <= _redef_filler_44.length()) { try { de_misc[_i] = new BigDecimal(_redef_filler_44.substring(_off, _off + 10).trim()); } catch (Exception _e) { de_misc[_i] = BigDecimal.ZERO; } }
                }
                for (int _i = 0; _i < 6; _i++) {
                    int _off = _i * 67 + 57;
                    if (_off + 10 <= _redef_filler_44.length()) { try { de_net[_i] = new BigDecimal(_redef_filler_44.substring(_off, _off + 10).trim()); } catch (Exception _e) { de_net[_i] = BigDecimal.ZERO; } }
                }
            }
            _rpt_quarterly_pay_register.beforeReporting("DEPT-HEAD", () -> dept_head_use());
            _rpt_quarterly_pay_register.beforeReporting("EMPL-FOOT", () -> empl_foot_use());
            _rpt_quarterly_pay_register.beforeReporting("DEPT-FOOT", () -> dept_foot_use());
            _rpt_quarterly_pay_register.beforeReporting("COMP-FOOT", () -> comp_foot_use());
            _000_initiate();
            _000_terminate();
        } finally { CobolProgram.popActive(); }
    }

    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new RunReportwriter011SamplePayrollReport().run();
    }
}
