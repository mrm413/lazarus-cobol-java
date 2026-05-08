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

public class RunReportwriter016SampleInventoryReport extends CobolProgram {
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

    // FILE SECTION — INV-FILE
    private CobolString inv_rec = new CobolString(35); // Group: INV-REC
    private int dept_in = 0;
    private CobolString dept_nam_in = new CobolString(18);
    private int month_in = 0;
    private int item_no_in = 0;
    private BigDecimal inv_tot_in = BigDecimal.ZERO;

    // FILE SECTION — REPORT-FILE

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(3);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_indicators = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("INDICATORS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_are_there_more_records = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ARE-THERE-MORE-RECORDS").build();

    private ReportWriter _rpt_inv_report = new ReportWriter("INV-REPORT");
    private CobolString month_total = new CobolString(12); // RD field
    private CobolString dept_total = new CobolString(13); // RD field
    private CobolString final_total = new CobolString(14); // RD field

    // FILE DESCRIPTORS
    private CobolFile inv_file = new CobolFile("INVFILE", "LINE SEQUENTIAL", "SEQUENTIAL", "INV-FILE");
    private CobolFile report_file = new CobolFile("LINE", "SEQUENTIAL", "SEQUENTIAL", "REPORT-FILE");

    private CobolString invfile = new CobolString(256, "INVFILE"); // fallback (implicit ASSIGN — initialized to name)
    private CobolString line = new CobolString(256, "LINE"); // fallback (implicit ASSIGN — initialized to name)

    private void a000_mainline() {
        { String _en = System.getenv("INVFILE"); if (_en != null) inv_file.setFileName(_en); else inv_file.setFileName(""); }
        inv_file.open("INPUT");
        { String _en = System.getenv("LINE"); if (_en != null) report_file.setFileName(_en); else report_file.setFileName(""); }
        report_file.open("OUTPUT");
        _rpt_inv_report.initiate();
        if (inv_file.read(inv_rec) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO "));
        } else {
            try { dept_in = Integer.parseInt(CobolString.refMod(inv_rec, 1, 2).toString().trim()); } catch (NumberFormatException _nfe) {}
            dept_nam_in.set(CobolString.refMod(inv_rec, 3, 18));
            try { month_in = Integer.parseInt(CobolString.refMod(inv_rec, 21, 2).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { item_no_in = Integer.parseInt(CobolString.refMod(inv_rec, 23, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { inv_tot_in = new BigDecimal(CobolString.refMod(inv_rec, 28, 8).toString().trim()); } catch (NumberFormatException _nfe) {}
        }
        while (!CobolIntrinsics.performUntil(CobolString.cobolEquals(String.valueOf(are_there_more_records), String.valueOf("NO ")))) {
            a001_loop();
        }
        _rpt_inv_report.terminate();
        inv_file.close();
        report_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void a001_loop() {
        _rpt_inv_report.generate("INV-DETAIL");
        if (inv_file.read(inv_rec) == FileStatus.AT_END) {
            are_there_more_records.set(String.valueOf("NO "));
        } else {
            try { dept_in = Integer.parseInt(CobolString.refMod(inv_rec, 1, 2).toString().trim()); } catch (NumberFormatException _nfe) {}
            dept_nam_in.set(CobolString.refMod(inv_rec, 3, 18));
            try { month_in = Integer.parseInt(CobolString.refMod(inv_rec, 21, 2).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { item_no_in = Integer.parseInt(CobolString.refMod(inv_rec, 23, 5).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { inv_tot_in = new BigDecimal(CobolString.refMod(inv_rec, 28, 8).toString().trim()); } catch (NumberFormatException _nfe) {}
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunReportwriter016SampleInventoryReport");
            CobolProgram.registerCallAlias("prog", "RunReportwriter016SampleInventoryReport");
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
        new RunReportwriter016SampleInventoryReport().run();
    }
}
