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

public class RunReportwriter026VaryingAndNestedOccurs extends CobolProgram {
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
    private int rpt = 1;
    private int num = 0;
    private CobolString tag1v = new CobolString(5, "Tag1");
    private CobolString tag2v = new CobolString(5, "Tag2");
    private CobolString markx = new CobolString(16, "<1> <2> <3> <4> ");
    private CobolString[] markit = new CobolString[4];
    {
        for (int _d0 = 0; _d0 < 4; _d0++) {
            markit[_d0] = new CobolString(4);
        }
    }
    private CobolString digx = new CobolString(50, "123456789b123456789c123456789d123456789e123456789f");
    private CobolString[] digs = new CobolString[5];
    {
        for (int _d0 = 0; _d0 < 5; _d0++) {
            digs[_d0] = new CobolString(10);
        }
    }

    // FILE SECTION — RP-FILE

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(145);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_rpt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("RPT").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_num = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("NUM").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tag1v = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TAG1V").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tag2v = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TAG2V").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_markx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(13, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("MARKX").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_markit = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("MARKIT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_digx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(45, 50).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DIGX").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(95, 50).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_digs = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(95, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DIGS").build();

    private ReportWriter _rpt_rp = new ReportWriter("RP");
    private CobolString h2_digs = new CobolString(5); // RD field
    private CobolString[] nums = new CobolString[256]; // RD field
    private CobolString mark = new CobolString(4); // RD field
    private CobolString[] grps = new CobolString[256]; // RD field
    private CobolString[] tag1 = new CobolString[256]; // RD field
    private CobolString filler_3 = new CobolString(1); // RD field
    private CobolString dtl2 = new CobolString(256); // RD field
    private CobolString dtl2x = new CobolString(1); // RD field
    private CobolString filler_4 = new CobolString(1); // RD field
    private CobolString[] tag2 = new CobolString[256]; // RD field
    private CobolString filler_5 = new CobolString(1); // RD field
    private CobolString mrk2 = new CobolString(4); // RD field
    private CobolString[] nnns = new CobolString[256]; // RD field
    private CobolString mrk3 = new CobolString(4); // RD field
    private CobolString num4a = new CobolString(3); // RD field
    private CobolString filler_6 = new CobolString(1); // RD field
    private CobolString[] num4b = new CobolString[256]; // RD field
    private CobolString mrk4 = new CobolString(4); // RD field

    // FILE DESCRIPTORS
    private CobolFile rp_file = new CobolFile("PRINTOUT", "LINE SEQUENTIAL", "SEQUENTIAL", "RP-FILE");

    private CobolString _filler_001 = new CobolString(256); // fallback

    // SECTION: BEFORE-DETAIL
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
    private CobolString _filler_053 = new CobolString(256); // fallback
    private CobolString _filler_058 = new CobolString(256); // fallback
    private void before_detail() {
        _exitSection = false;
        use_before_detail();
        if (_exitSection) return;
        doit_1();
    }

    private void use_before_detail() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_BEFORE-DETAIL OF BEFORE-DETAIL");
        /* USE BEFORE REPORTING RP-DTL2 */
    }

    private void doit_1() {
        CobolIntrinsics.setCurrentLocation("prog; DOIT-1 OF BEFORE-DETAIL");
        num = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(num).add(CobolIntrinsics.toBigDecimal(1))), 1));
        CobolDisplay.display("Hello World " + CobolDisplay.formatPic(num, 1, 0, false));
        dtl2.set(String.valueOf("$"));
    }

    private void para_main() {
        rp_file.open("OUTPUT");
        _rpt_rp.initiate();
        if (nnns[1 - 1] == null) nnns[1 - 1] = new CobolString(3);
        nnns[1 - 1].set(String.valueOf(149));
        _filler_003.set(String.valueOf(149));
        if (nnns[2 - 1] == null) nnns[2 - 1] = new CobolString(3);
        nnns[2 - 1].set(String.valueOf(149));
        _filler_008.set(String.valueOf(149));
        if (nnns[3 - 1] == null) nnns[3 - 1] = new CobolString(3);
        nnns[3 - 1].set(String.valueOf(149));
        if (nnns[4 - 1] == null) nnns[4 - 1] = new CobolString(3);
        nnns[4 - 1].set(String.valueOf(149));
        if (nums[1 - 1] == null) nums[1 - 1] = new CobolString(3);
        nums[1 - 1].set(String.valueOf(100));
        _filler_013.set(String.valueOf(100));
        if (nums[2 - 1] == null) nums[2 - 1] = new CobolString(3);
        nums[2 - 1].set(String.valueOf(100));
        _filler_018.set(String.valueOf(100));
        if (nums[3 - 1] == null) nums[3 - 1] = new CobolString(3);
        nums[3 - 1].set(String.valueOf(100));
        for (rpt = 1; !(rpt > 4); rpt += 1) {
            _rpt_rp.generate("RP-DTL1");
            doit_now();
            _rpt_rp.generate("RP-DTL2");
            if (nnns[1 - 1] == null) nnns[1 - 1] = new CobolString(3);
            nnns[1 - 1].set(String.valueOf(200));
            _filler_023.set(String.valueOf(200));
            if (nnns[2 - 1] == null) nnns[2 - 1] = new CobolString(3);
            nnns[2 - 1].set(String.valueOf(200));
            _filler_028.set(String.valueOf(200));
            if (nnns[3 - 1] == null) nnns[3 - 1] = new CobolString(3);
            nnns[3 - 1].set(String.valueOf(200));
            if (nnns[4 - 1] == null) nnns[4 - 1] = new CobolString(3);
            nnns[4 - 1].set(String.valueOf(200));
            _rpt_rp.generate("RP-DTL3");
            num4a.set(String.valueOf(400));
            if (num4b[1 - 1] == null) num4b[1 - 1] = new CobolString(3);
            num4b[1 - 1].set(String.valueOf(401));
            if (num4b[2 - 1] == null) num4b[2 - 1] = new CobolString(3);
            num4b[2 - 1].set(String.valueOf(402));
            if (num4b[3 - 1] == null) num4b[3 - 1] = new CobolString(3);
            num4b[3 - 1].set(String.valueOf(403));
            _rpt_rp.generate("RP-DTL4");
        }
        _rpt_rp.terminate();
        rp_file.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void doit_now() {
        if (grps[1 - 1] == null) grps[1 - 1] = new CobolString(256);
        grps[1 - 1].set("****************************************************************************************************************************************************************************************************************************************************************");
        _filler_033.set("*");
        if (grps[2 - 1] == null) grps[2 - 1] = new CobolString(256);
        grps[2 - 1].set("****************************************************************************************************************************************************************************************************************************************************************");
        _filler_038.set("*");
        if (grps[3 - 1] == null) grps[3 - 1] = new CobolString(256);
        grps[3 - 1].set("****************************************************************************************************************************************************************************************************************************************************************");
        if (tag1[1 - 1] == null) tag1[1 - 1] = new CobolString(4);
        tag1[1 - 1].set(String.valueOf("WAG1"));
        _filler_043.set(String.valueOf("WAG1"));
        if (tag1[2 - 1] == null) tag1[2 - 1] = new CobolString(4);
        tag1[2 - 1].set(String.valueOf("WAG1"));
        _filler_048.set(String.valueOf("WAG1"));
        if (tag1[3 - 1] == null) tag1[3 - 1] = new CobolString(4);
        tag1[3 - 1].set(String.valueOf("WAG1"));
        if (tag2[1 - 1] == null) tag2[1 - 1] = new CobolString(4);
        tag2[1 - 1].set(String.valueOf("WAG2"));
        _filler_053.set(String.valueOf("WAG2"));
        if (tag2[2 - 1] == null) tag2[2 - 1] = new CobolString(4);
        tag2[2 - 1].set(String.valueOf("WAG2"));
        _filler_058.set(String.valueOf("WAG2"));
        if (tag2[3 - 1] == null) tag2[3 - 1] = new CobolString(4);
        tag2[3 - 1].set(String.valueOf("WAG2"));
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunReportwriter026VaryingAndNestedOccurs");
            CobolProgram.registerCallAlias("prog", "RunReportwriter026VaryingAndNestedOccurs");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Initialize REDEFINES OCCURS children from MARKX
            {
                String _redef_filler_7 = markx.get();
                for (int _i = 0; _i < 4; _i++) {
                    int _off = _i * 4 + 0;
                    if (markit[_i] == null) markit[_i] = new CobolString(4);
                    if (_off + 4 <= _redef_filler_7.length()) markit[_i].set(_redef_filler_7.substring(_off, _off + 4));
                }
            }
            // Initialize REDEFINES OCCURS children from DIGX
            {
                String _redef_filler_8 = digx.get();
                for (int _i = 0; _i < 5; _i++) {
                    int _off = _i * 10 + 0;
                    if (digs[_i] == null) digs[_i] = new CobolString(10);
                    if (_off + 10 <= _redef_filler_8.length()) digs[_i].set(_redef_filler_8.substring(_off, _off + 10));
                }
            }
            _rpt_rp.beforeReporting("RP-DTL2", () -> before_detail());
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
        new RunReportwriter026VaryingAndNestedOccurs().run();
    }
}
