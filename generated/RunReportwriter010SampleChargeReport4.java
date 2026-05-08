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

public class RunReportwriter010SampleChargeReport4 extends CobolProgram {
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
    private int commission_ix = 1;
    // WORKING-STORAGE SECTION
    private CobolString end_of_file_switch = new CobolString(1, "N");
    private CobolString commission_table = new CobolString(30, "A20B18C15D12E10F12G10H08J05K07"); // Group: COMMISSION-TABLE
    private CobolString filler_1 = new CobolString(3, "A20");
    private CobolString filler_2 = new CobolString(3, "B18");
    private CobolString filler_3 = new CobolString(3, "C15");
    private CobolString filler_4 = new CobolString(3, "D12");
    private CobolString filler_5 = new CobolString(3, "E10");
    private CobolString filler_6 = new CobolString(3, "F12");
    private CobolString filler_7 = new CobolString(3, "G10");
    private CobolString filler_8 = new CobolString(3, "H08");
    private CobolString filler_9 = new CobolString(3, "J05");
    private CobolString filler_10 = new CobolString(3, "K07");
    private CobolString[] commission_entry = new CobolString[10]; // Group: COMMISSION-ENTRY
    private CobolString[] ce_district = new CobolString[10];
    {
        for (int _d0 = 0; _d0 < 10; _d0++) {
            ce_district[_d0] = new CobolString(1);
        }
    }
    private BigDecimal[] ce_rate = new BigDecimal[10];
    private CobolString calculated_fields = new CobolString(7); // Group: CALCULATED-FIELDS
    private BigDecimal ws_commission = BigDecimal.ZERO;

    // FILE SECTION — SALES-DATA
    private CobolString sales_record = new CobolString(80); // Group: SALES-RECORD
    private int sr_salesman_number = 0;
    private CobolString filler_11 = new CobolString(1);
    private CobolString sr_district_code = new CobolString(1);
    private CobolString filler_12 = new CobolString(1);
    private BigDecimal sr_sale_amount = BigDecimal.ZERO;
    private CobolString filler_13 = new CobolString(69);

    // FILE SECTION — REPORT-FILE

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(68);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_end_of_file_switch = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("END-OF-FILE-SWITCH").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_commission_table = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 30).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("COMMISSION-TABLE").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_14 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_15 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_16 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_17 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_18 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_19 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_20 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_21 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(22, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_22 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(25, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_23 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_24 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(31, 30).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_commission_entry = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(31, 30).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("COMMISSION-ENTRY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ce_district = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(31, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("CE-DISTRICT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ce_rate = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(32, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("CE-RATE").picDigits(2).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_calculated_fields = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(61, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("CALCULATED-FIELDS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_commission = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(61, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-COMMISSION").picDigits(7).picScale(2).build();

    private ReportWriter _rpt_district_sales_report = new ReportWriter("DISTRICT-SALES-REPORT");
    private CobolString st_sales_amt = new CobolString(10); // RD field

    // FILE DESCRIPTORS
    private CobolFile sales_data = new CobolFile("DATAIN", "LINE SEQUENTIAL", "SEQUENTIAL", "SALES-DATA");
    private CobolFile report_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL", "REPORT-FILE");

    private CobolString end_of_file = new CobolString(256); // fallback
    private CobolString datain = new CobolString(256, "DATAIN"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString line = new CobolString(256, "LINE"); // fallback (implicit ASSIGN — initialized to name)

    // SECTION: USE-SALESMAN-TOTAL
    private void use_salesman_total() {
        _exitSection = false;
        use_use_salesman_total();
        if (_exitSection) return;
        use_salesman_total_proc();
        if (_exitSection) return;
        use_salesman_total_exit();
    }

    private void use_use_salesman_total() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_USE-SALESMAN-TOTAL OF USE-SALESMAN-TOTAL");
        /* USE BEFORE REPORTING SALESMAN-TOTAL */
    }

    private void use_salesman_total_proc() {
        CobolIntrinsics.setCurrentLocation("prog; USE-SALESMAN-TOTAL-PROC OF USE-SALESMAN-TOTAL");
        commission_ix = (int) Math.abs(CobolIntrinsics.toBigDecimal(1).intValue());
        /* SEARCH COMMISSION-ENTRY */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < commission_entry.length && !_found; _idx++) {
                commission_ix = _idx + 1;
                if (CobolString.cobolEquals(String.valueOf(CobolString.safeIndex(ce_district, commission_ix, 1)), String.valueOf(sr_district_code))) {
                    { BigDecimal _cv = CobolIntrinsics.toBigDecimal(ce_rate[commission_ix - 1].multiply(CobolIntrinsics.toBigDecimal(st_sales_amt))).setScale(2, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("10000000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
                    ws_commission = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(ce_rate[commission_ix - 1].multiply(CobolIntrinsics.toBigDecimal(st_sales_amt))), 7, 2, false, RoundingMode.HALF_UP);
                    _found = true;
                }
            }
            if (!_found) {
                ws_commission = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(0), 7, 2, false);
            }
        }
    }

    private void use_salesman_total_exit() {
        CobolIntrinsics.setCurrentLocation("prog; USE-SALESMAN-TOTAL-EXIT OF USE-SALESMAN-TOTAL");
        return;
    }

    private void _000_initiate() {
        { String _en = System.getenv("DATAIN"); if (_en != null) sales_data.setFileName(_en); else sales_data.setFileName(""); }
        sales_data.open("INPUT");
        { String _en = System.getenv("LINE"); if (_en != null) report_file.setFileName(_en); else report_file.setFileName(""); }
        report_file.open("OUTPUT");
        _rpt_district_sales_report.initiate();
        if (sales_data.read(sales_record) == FileStatus.AT_END) {
            end_of_file_switch.set(String.valueOf("Y"));
        } else {
            try { sr_salesman_number = Integer.parseInt(CobolString.refMod(sales_record, 1, 2).toString().trim()); } catch (NumberFormatException _nfe) {}
            sr_district_code.set(CobolString.refMod(sales_record, 4, 1));
            try { sr_sale_amount = new BigDecimal(CobolString.refMod(sales_record, 6, 6).toString().trim()); } catch (NumberFormatException _nfe) {}
        }
        while (!CobolIntrinsics.performUntil(CobolString.cobolEquals(String.valueOf(end_of_file_switch), "Y"))) {
            _100_process_sales_data(); // THRU 199-EXIT
            _199_exit();
        }
    }

    private void _000_terminate() {
        _rpt_district_sales_report.terminate();
        sales_data.close();
        report_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void _100_process_sales_data() {
        _rpt_district_sales_report.generate("DISTRICT-SALES-REPORT");
        if (sales_data.read(sales_record) == FileStatus.AT_END) {
            end_of_file_switch.set(String.valueOf("Y"));
        } else {
            try { sr_salesman_number = Integer.parseInt(CobolString.refMod(sales_record, 1, 2).toString().trim()); } catch (NumberFormatException _nfe) {}
            sr_district_code.set(CobolString.refMod(sales_record, 4, 1));
            try { sr_sale_amount = new BigDecimal(CobolString.refMod(sales_record, 6, 6).toString().trim()); } catch (NumberFormatException _nfe) {}
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
            CobolProgram.registerCallAlias("prog", "RunReportwriter010SampleChargeReport4");
            CobolProgram.registerCallAlias("prog", "RunReportwriter010SampleChargeReport4");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Initialize REDEFINES OCCURS children from COMMISSION-TABLE
            {
                String _redef_filler_25 = commission_table.get();
                for (int _i = 0; _i < 10; _i++) {
                    int _off = _i * 3 + 0;
                    if (ce_district[_i] == null) ce_district[_i] = new CobolString(1);
                    if (_off + 1 <= _redef_filler_25.length()) ce_district[_i].set(_redef_filler_25.substring(_off, _off + 1));
                }
                for (int _i = 0; _i < 10; _i++) {
                    int _off = _i * 3 + 1;
                    if (_off + 2 <= _redef_filler_25.length()) { try { ce_rate[_i] = new BigDecimal(_redef_filler_25.substring(_off, _off + 2).trim()); } catch (Exception _e) { ce_rate[_i] = BigDecimal.ZERO; } }
                }
            }
            _rpt_district_sales_report.beforeReporting("SALESMAN-TOTAL", () -> use_salesman_total());
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
        new RunReportwriter010SampleChargeReport4().run();
    }
}
