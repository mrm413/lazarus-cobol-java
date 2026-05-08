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

public class RunReportwriter008SampleChargeReport2 extends CobolProgram {
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
    private int discount_ix = 1;
    private int pic = 1;
    // WORKING-STORAGE SECTION
    private CobolString end_of_file_switch = new CobolString(1, "N");
    private CobolString discount_table = new CobolString(18, "050710150622120920"); // Group: DISCOUNT-TABLE
    private int filler_1 = 5;
    private int filler_2 = 7;
    private int filler_3 = 10;
    private int filler_4 = 15;
    private int filler_5 = 6;
    private int filler_6 = 22;
    private int filler_7 = 12;
    private int filler_8 = 9;
    private int filler_9 = 20;
    private CobolString[] discount = new CobolString[9];
    {
        for (int _d0 = 0; _d0 < 9; _d0++) {
            discount[_d0] = new CobolString(1);
        }
    }
    private CobolString calculated_fields = new CobolString(10); // Group: CALCULATED-FIELDS
    private BigDecimal ws_discount_amt = BigDecimal.ZERO;
    private BigDecimal ws_charge_amt = BigDecimal.ZERO;

    // FILE SECTION — TRANSACTION-DATA
    private CobolString transaction_record = new CobolString(80); // Group: TRANSACTION-RECORD
    private int tr_customer_number = 0;
    private CobolString filler_10 = new CobolString(1);
    private CobolString tr_customer_name = new CobolString(16);
    private CobolString filler_11 = new CobolString(1);
    private int tr_item_number = 0;
    private int tr_item_department = 0;
    private int filler_13 = 0;
    private CobolString filler_14 = new CobolString(1);
    private BigDecimal tr_item_cost = BigDecimal.ZERO;
    private CobolString filler_15 = new CobolString(47);

    // FILE SECTION — REPORT-FILE

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(38);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_end_of_file_switch = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("END-OF-FILE-SWITCH").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_discount_table = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DISCOUNT-TABLE").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_16 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FILLER").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_17 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FILLER").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_18 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FILLER").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_19 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FILLER").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_20 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(9, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FILLER").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_21 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(11, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FILLER").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_22 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FILLER").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_23 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FILLER").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_24 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(17, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FILLER").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_25 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_discount = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DISCOUNT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_calculated_fields = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("CALCULATED-FIELDS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_discount_amt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-DISCOUNT-AMT").picDigits(5).picScale(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_charge_amt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(33, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-CHARGE-AMT").picDigits(5).picScale(2).build();

    private ReportWriter _rpt_customer_report = new ReportWriter("CUSTOMER-REPORT");

    // FILE DESCRIPTORS
    private CobolFile transaction_data = new CobolFile("DATAIN", "LINE SEQUENTIAL", "SEQUENTIAL", "TRANSACTION-DATA");
    private CobolFile report_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL", "REPORT-FILE");

    private CobolString end_of_file = new CobolString(256); // fallback
    private CobolString datain = new CobolString(256, "DATAIN"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString line = new CobolString(256, "LINE"); // fallback (implicit ASSIGN — initialized to name)

    private void _000_initiate() {
        { String _en = System.getenv("DATAIN"); if (_en != null) transaction_data.setFileName(_en); else transaction_data.setFileName(""); }
        transaction_data.open("INPUT");
        { String _en = System.getenv("LINE"); if (_en != null) report_file.setFileName(_en); else report_file.setFileName(""); }
        report_file.open("OUTPUT");
        _rpt_customer_report.initiate();
        if (transaction_data.read(transaction_record) == FileStatus.AT_END) {
            end_of_file_switch.set(String.valueOf("Y"));
        } else {
            try { tr_customer_number = Integer.parseInt(CobolString.refMod(transaction_record, 1, 4).toString().trim()); } catch (NumberFormatException _nfe) {}
            tr_customer_name.set(CobolString.refMod(transaction_record, 6, 16));
            try { tr_item_number = Integer.parseInt(CobolString.refMod(transaction_record, 23, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { tr_item_department = Integer.parseInt(CobolString.refMod(transaction_record, 28, 1).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { tr_item_cost = new BigDecimal(CobolString.refMod(transaction_record, 34, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
        }
        while (!CobolIntrinsics.performUntil(CobolString.cobolEquals(String.valueOf(end_of_file_switch), "Y"))) {
            _100_process_transaction_data(); // THRU 199-EXIT
            _199_exit();
        }
    }

    private void _000_terminate() {
        _rpt_customer_report.terminate();
        transaction_data.close();
        report_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void _100_process_transaction_data() {
        discount_ix = (int) Math.abs(CobolIntrinsics.toBigDecimal(tr_item_department).intValue());
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(tr_item_cost.multiply(CobolIntrinsics.toBigDecimal(CobolString.safeIndex(discount, discount_ix, 1)))).setScale(2, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        ws_discount_amt = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(tr_item_cost.multiply(CobolIntrinsics.toBigDecimal(CobolString.safeIndex(discount, discount_ix, 1)))), 5, 2, false, RoundingMode.HALF_UP);
        { BigDecimal _cv = CobolIntrinsics.toBigDecimal(tr_item_cost.subtract(ws_discount_amt)).setScale(2, RoundingMode.DOWN).abs(); if (_cv.compareTo(new BigDecimal("100000")) >= 0) { CobolIntrinsics.setException("EC-SIZE-OVERFLOW"); } }
        ws_charge_amt = CobolIntrinsics.truncateToField(CobolIntrinsics.toBigDecimal(tr_item_cost.subtract(ws_discount_amt)), 5, 2, false);
        _rpt_customer_report.generate("CHARGE-DETAIL");
        if (transaction_data.read(transaction_record) == FileStatus.AT_END) {
            end_of_file_switch.set(String.valueOf("Y"));
        } else {
            try { tr_customer_number = Integer.parseInt(CobolString.refMod(transaction_record, 1, 4).toString().trim()); } catch (NumberFormatException _nfe) {}
            tr_customer_name.set(CobolString.refMod(transaction_record, 6, 16));
            try { tr_item_number = Integer.parseInt(CobolString.refMod(transaction_record, 23, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { tr_item_department = Integer.parseInt(CobolString.refMod(transaction_record, 28, 1).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { tr_item_cost = new BigDecimal(CobolString.refMod(transaction_record, 34, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
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
            CobolProgram.registerCallAlias("prog", "RunReportwriter008SampleChargeReport2");
            CobolProgram.registerCallAlias("prog", "RunReportwriter008SampleChargeReport2");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
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
        new RunReportwriter008SampleChargeReport2().run();
    }
}
