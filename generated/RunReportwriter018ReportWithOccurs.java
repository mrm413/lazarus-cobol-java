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

public class RunReportwriter018ReportWithOccurs extends CobolProgram {
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
    // FILE SECTION — rp-file

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    private ReportWriter _rpt_rp = new ReportWriter("RP");
    private CobolString[] nums = new CobolString[256]; // RD field
    private CobolString mark = new CobolString(4); // RD field
    private CobolString[] grps = new CobolString[256]; // RD field
    private CobolString[] tag1 = new CobolString[256]; // RD field
    private CobolString filler_1 = new CobolString(1); // RD field
    private CobolString[] tag2 = new CobolString[256]; // RD field
    private CobolString filler_2 = new CobolString(2); // RD field
    private CobolString[] nnns = new CobolString[256]; // RD field
    private CobolString tagp = new CobolString(4); // RD field
    private CobolString num4a = new CobolString(3); // RD field
    private CobolString[] num4b = new CobolString[256]; // RD field
    private CobolString mrk4 = new CobolString(4); // RD field

    // FILE DESCRIPTORS
    private CobolFile rp_file = new CobolFile("PRINTOUT", "LINE SEQUENTIAL", "SEQUENTIAL", "RP-FILE");

    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString printout = new CobolString(256, "PRINTOUT"); // fallback (implicit ASSIGN — initialized to name)

    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_013 = new CobolString(256); // fallback
    private CobolString _filler_018 = new CobolString(256); // fallback
    private CobolString _filler_023 = new CobolString(256); // fallback
    private CobolString _filler_028 = new CobolString(256); // fallback
    private CobolString _filler_033 = new CobolString(256); // fallback
    private CobolString _filler_038 = new CobolString(256); // fallback
    private CobolString _filler_043 = new CobolString(256); // fallback
    private CobolString _filler_048 = new CobolString(256); // fallback
    private void para_main() {
        { String _en = System.getenv("PRINTOUT"); if (_en != null) rp_file.setFileName(_en); else rp_file.setFileName(""); }
        rp_file.open("OUTPUT");
        _rpt_rp.initiate();
        if (nums[1 - 1] == null) nums[1 - 1] = new CobolString(3);
        nums[1 - 1].set(String.valueOf(100));
        _filler_003.set(String.valueOf(100));
        if (nums[2 - 1] == null) nums[2 - 1] = new CobolString(3);
        nums[2 - 1].set(String.valueOf(100));
        _filler_008.set(String.valueOf(100));
        if (nums[3 - 1] == null) nums[3 - 1] = new CobolString(3);
        nums[3 - 1].set(String.valueOf(100));
        mark.set(String.valueOf("<1>"));
        _rpt_rp.generate("RP-DTL1");
        if (grps[1 - 1] == null) grps[1 - 1] = new CobolString(256);
        grps[1 - 1].set("****************************************************************************************************************************************************************************************************************************************************************");
        _filler_013.set("*");
        if (grps[2 - 1] == null) grps[2 - 1] = new CobolString(256);
        grps[2 - 1].set("****************************************************************************************************************************************************************************************************************************************************************");
        _filler_018.set("*");
        if (grps[3 - 1] == null) grps[3 - 1] = new CobolString(256);
        grps[3 - 1].set("****************************************************************************************************************************************************************************************************************************************************************");
        if (tag1[1 - 1] == null) tag1[1 - 1] = new CobolString(4);
        tag1[1 - 1].set(String.valueOf("Tag1"));
        _filler_023.set(String.valueOf("Tag1"));
        if (tag1[2 - 1] == null) tag1[2 - 1] = new CobolString(4);
        tag1[2 - 1].set(String.valueOf("Tag1"));
        _filler_028.set(String.valueOf("Tag1"));
        if (tag1[3 - 1] == null) tag1[3 - 1] = new CobolString(4);
        tag1[3 - 1].set(String.valueOf("Tag1"));
        if (tag2[1 - 1] == null) tag2[1 - 1] = new CobolString(4);
        tag2[1 - 1].set(String.valueOf("Tag2"));
        _filler_033.set(String.valueOf("Tag2"));
        if (tag2[2 - 1] == null) tag2[2 - 1] = new CobolString(4);
        tag2[2 - 1].set(String.valueOf("Tag2"));
        _filler_038.set(String.valueOf("Tag2"));
        if (tag2[3 - 1] == null) tag2[3 - 1] = new CobolString(4);
        tag2[3 - 1].set(String.valueOf("Tag2"));
        _rpt_rp.generate("RP-DTL2");
        if (nnns[1 - 1] == null) nnns[1 - 1] = new CobolString(3);
        nnns[1 - 1].set(String.valueOf(200));
        _filler_043.set(String.valueOf(200));
        if (nnns[2 - 1] == null) nnns[2 - 1] = new CobolString(3);
        nnns[2 - 1].set(String.valueOf(200));
        _filler_048.set(String.valueOf(200));
        if (nnns[3 - 1] == null) nnns[3 - 1] = new CobolString(3);
        nnns[3 - 1].set(String.valueOf(200));
        if (nnns[4 - 1] == null) nnns[4 - 1] = new CobolString(3);
        nnns[4 - 1].set(String.valueOf(200));
        tagp.set(String.valueOf("<3>"));
        _rpt_rp.generate("RP-DTL3");
        num4a.set(String.valueOf(400));
        if (num4b[1 - 1] == null) num4b[1 - 1] = new CobolString(3);
        num4b[1 - 1].set(String.valueOf(401));
        if (num4b[2 - 1] == null) num4b[2 - 1] = new CobolString(3);
        num4b[2 - 1].set(String.valueOf(402));
        if (num4b[3 - 1] == null) num4b[3 - 1] = new CobolString(3);
        num4b[3 - 1].set(String.valueOf(403));
        mrk4.set(String.valueOf("<4>"));
        _rpt_rp.generate("RP-DTL4");
        _rpt_rp.terminate();
        rp_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunReportwriter018ReportWithOccurs");
            CobolProgram.registerCallAlias("prog", "RunReportwriter018ReportWithOccurs");
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
        new RunReportwriter018ReportWithOccurs().run();
    }
}
