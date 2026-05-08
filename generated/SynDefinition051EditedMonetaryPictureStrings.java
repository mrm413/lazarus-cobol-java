package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynDefinition051EditedMonetaryPictureStrings extends CobolProgram {
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
    private CobolString dollars = new CobolString(110); // Group: DOLLARS
    private CobolString report_line = new CobolString(107); // Group: REPORT-LINE
    private CobolString report_items = new CobolString(15, CobolDisplay.formatEdited(0, "ZZ,ZZZ,ZZZ,ZZ9-"));
    private CobolString report_fica_wages = new CobolString(23, CobolDisplay.formatEdited(0, "$$$,$$$,$$$,$$$,$$$.99-"));
    private CobolString report_fica_tips = new CobolString(23, CobolDisplay.formatEdited(0, "$$$,$$$,$$$,$$$,$$$.99-"));
    private CobolString report_total_comp = new CobolString(23, CobolDisplay.formatEdited(0, "$$$,$$$,$$$,$$$,$$$.99-"));
    private CobolString report_medicare = new CobolString(23, CobolDisplay.formatEdited(0, "$$$,$$$,$$$,$$$,$$$.99-"));
    private CobolString acct_report_total_line = new CobolString(3);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(110);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dollars = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 110).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DOLLARS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_report_line = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 107).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("REPORT-LINE").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_report_items = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("REPORT-ITEMS").picDigits(11).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_report_fica_wages = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 23).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("REPORT-FICA-WAGES").picDigits(17).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_report_fica_tips = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(38, 23).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("REPORT-FICA-TIPS").picDigits(17).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_report_total_comp = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(61, 23).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("REPORT-TOTAL-COMP").picDigits(17).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_report_medicare = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(84, 23).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("REPORT-MEDICARE").picDigits(17).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_acct_report_total_line = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(107, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ACCT-REPORT-TOTAL-LINE").build();


    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynDefinition051EditedMonetaryPictureStrings");
            CobolProgram.registerCallAlias("prog", "SynDefinition051EditedMonetaryPictureStrings");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
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
        new SynDefinition051EditedMonetaryPictureStrings().run();
    }
}
