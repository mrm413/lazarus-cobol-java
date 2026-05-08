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

public class RunReportwriter014OrderReportTestSubstring extends CobolProgram {
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
    // WORKING-STORAGE SECTION
    private CobolString indicators = new CobolString(3, "YES"); // Group: INDICATORS
    private CobolString are_there_more_records = new CobolString(3, "YES");
    private CobolString constants = new CobolString(3, "0.0"); // Group: CONSTANTS
    private BigDecimal sales_tax = new BigDecimal("0.05");
    private CobolString work_areas = new CobolString(29, "00000000000000000000014301275"); // Group: WORK-AREAS
    private BigDecimal amt_tax = new BigDecimal("0");
    private BigDecimal amt_order = new BigDecimal("0");
    private BigDecimal tot_order = new BigDecimal("0");
    private int current_time = 14301275;

    // FILE SECTION — CUST-ORDER-FILE
    private CobolString cust_order_rec = new CobolString(30); // Group: CUST-ORDER-REC
    private int cust_num = 0;
    private int item_num = 0;
    private int num_ord = 0;
    private BigDecimal price = BigDecimal.ZERO;
    private BigDecimal shipping = BigDecimal.ZERO;
    private CobolString filler_1 = new CobolString(7);

    // FILE SECTION — CUST-PRINT-FILE

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(35);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_indicators = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("INDICATORS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_are_there_more_records = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ARE-THERE-MORE-RECORDS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_constants = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("CONSTANTS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_sales_tax = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("SALES-TAX").picDigits(3).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_work_areas = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 29).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("WORK-AREAS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_amt_tax = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("AMT-TAX").picDigits(6).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_amt_order = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 7).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("AMT-ORDER").picDigits(7).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tot_order = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TOT-ORDER").picDigits(8).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_current_time = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("CURRENT-TIME").picDigits(8).build();

    private ReportWriter _rpt_order_report = new ReportWriter("ORDER-REPORT");

    // FILE DESCRIPTORS
    private CobolFile cust_order_file = new CobolFile("CUSTORD", "LINE SEQUENTIAL", "SEQUENTIAL", "CUST-ORDER-FILE");
    private CobolFile cust_print_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL", "CUST-PRINT-FILE");

    private CobolString there_are_no_more_records = new CobolString(256); // fallback
    private CobolString custord = new CobolString(256, "CUSTORD"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString line = new CobolString(256, "LINE"); // fallback (implicit ASSIGN — initialized to name)

    private void a000_mainline() {
        { String _en = System.getenv("CUSTORD"); if (_en != null) cust_order_file.setFileName(_en); else cust_order_file.setFileName(""); }
        cust_order_file.open("INPUT");
        { String _en = System.getenv("LINE"); if (_en != null) cust_print_file.setFileName(_en); else cust_print_file.setFileName(""); }
        cust_print_file.open("OUTPUT");
        _rpt_order_report.initiate();
        if (cust_order_file.read(cust_order_rec) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO"));
        } else {
            try { cust_num = Integer.parseInt(CobolString.refMod(cust_order_rec, 1, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { item_num = Integer.parseInt(CobolString.refMod(cust_order_rec, 6, 6).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { num_ord = Integer.parseInt(CobolString.refMod(cust_order_rec, 12, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { price = new BigDecimal(CobolString.refMod(cust_order_rec, 15, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { shipping = new BigDecimal(CobolString.refMod(cust_order_rec, 20, 4).toString().trim()); } catch (NumberFormatException _nfe) {}
        }
        while (!CobolIntrinsics.performUntil(CobolString.cobolEquals(String.valueOf(are_there_more_records), "NO "))) {
            a001_loop();
        }
        _rpt_order_report.terminate();
        cust_order_file.close();
        cust_print_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void a001_loop() {
        amt_order = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(num_ord).multiply(price)), 7, 2, false);
        amt_tax = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(amt_order.multiply(sales_tax)), 6, 2, false);
        tot_order = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(amt_order.add(shipping).add(amt_tax)), 8, 2, false);
        _rpt_order_report.generate("DETAIL-LINE");
        if (cust_order_file.read(cust_order_rec) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO"));
        } else {
            try { cust_num = Integer.parseInt(CobolString.refMod(cust_order_rec, 1, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { item_num = Integer.parseInt(CobolString.refMod(cust_order_rec, 6, 6).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { num_ord = Integer.parseInt(CobolString.refMod(cust_order_rec, 12, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { price = new BigDecimal(CobolString.refMod(cust_order_rec, 15, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { shipping = new BigDecimal(CobolString.refMod(cust_order_rec, 20, 4).toString().trim()); } catch (NumberFormatException _nfe) {}
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunReportwriter014OrderReportTestSubstring");
            CobolProgram.registerCallAlias("prog", "RunReportwriter014OrderReportTestSubstring");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            a000_mainline();
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
        new RunReportwriter014OrderReportTestSubstring().run();
    }
}
