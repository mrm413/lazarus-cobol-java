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

public class Listings033ReportWriter extends CobolProgram {
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
    private CobolString end_of_file_switch = new CobolString(1, "N");

    // FILE SECTION — TRANSACTION-DATA
    private CobolString transaction_record = new CobolString(80); // Group: TRANSACTION-RECORD
    private int tr_customer_number = 0;
    private CobolString filler_1 = new CobolString(1);
    private CobolString tr_customer_name = new CobolString(16);
    private CobolString filler_2 = new CobolString(1);
    private int tr_item_number = 0;
    private int tr_item_department = 0;
    private int filler_4 = 0;
    private CobolString filler_5 = new CobolString(1);
    private BigDecimal tr_item_cost = BigDecimal.ZERO;
    private CobolString filler_6 = new CobolString(47);

    // FILE SECTION — REPORT-FILE

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_end_of_file_switch = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("END-OF-FILE-SWITCH").build();

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
            CobolProgram.registerCallAlias("prog", "Listings033ReportWriter");
            CobolProgram.registerCallAlias("prog", "Listings033ReportWriter");
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
        new Listings033ReportWriter().run();
    }
}
