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

public class RunReportwriter017DuplicateDetailLine extends CobolProgram {
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
    private CobolString save_item = new CobolString(1);

    // FILE SECTION — REPORT-FILE

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_save_item = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("SAVE-ITEM").build();

    private ReportWriter _rpt_myreport = new ReportWriter("MYREPORT");

    // FILE DESCRIPTORS
    private CobolFile report_file = new CobolFile("SEQUENTIAL", "SEQUENTIAL", "SEQUENTIAL", "REPORT-FILE");

    private CobolString sequential = new CobolString(256, "SEQUENTIAL"); // fallback (implicit ASSIGN — initialized to name)

    private void para_main() {
        report_file.setFileName(String.valueOf(sequential).trim());
        report_file.open("OUTPUT");
        _rpt_myreport.initiate();
        save_item.set(String.valueOf("A"));
        _rpt_myreport.generate("DETAIL-LINE");
        save_item.set(String.valueOf("B"));
        _rpt_myreport.generate("DETAIL-LINE");
        _rpt_myreport.generate("SND-DETAIL-LINE");
        _rpt_myreport.generate("TRD-DETAIL-LINE");
        save_item.set(String.valueOf("C"));
        _rpt_myreport.generate("TRD-DETAIL-LINE");
        _rpt_myreport.terminate();
        report_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunReportwriter017DuplicateDetailLine");
            CobolProgram.registerCallAlias("prog", "RunReportwriter017DuplicateDetailLine");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
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
        new RunReportwriter017DuplicateDetailLine().run();
    }
}
