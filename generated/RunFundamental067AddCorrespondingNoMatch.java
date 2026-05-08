package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental067AddCorrespondingNoMatch extends CobolProgram {
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
    private CobolString group_1 = new CobolString(5); // Group: GROUP-1
    private CobolString group_1_field_a = new CobolString(1);
    private CobolString group_1_field_b = new CobolString(2, CobolDisplay.formatEdited(0, "Z9"));
    private CobolString group_1_inner_group = new CobolString(1); // Group: INNER-GROUP
    private CobolString group_1_field_c = new CobolString(1);
    private int group_1_field_d = 0;
    private CobolString group_2 = new CobolString(4, "1 A"); // Group: GROUP-2
    private int group_2_field_a = 1;
    private byte group_2_field_b = (byte) 2;
    private CobolString group_2_inner_group = new CobolString(1); // Group: INNER-GROUP
    private float group_2_field_c = 3f;
    private CobolString group_2_field_d = new CobolString(1, "A");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(9);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_group_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("GROUP-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("FIELD-B").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_inner_group = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("INNER-GROUP").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_c = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIELD-C").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_field_d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FIELD-D").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_group_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("GROUP-2").build();


    private void para_main() {
        if (group_2_field_a != 1) {
            CobolDisplay.display("BAD FIELD-A " + CobolDisplay.formatPic(group_2_field_a, 1, 0, false));
        }
        if (group_2_field_b != 2) {
            CobolDisplay.display("BAD FIELD-B " + CobolDisplay.formatPic(group_2_field_b, 3, 0, true, "LEADING"));
        }
        if ((float)(group_2_field_c) != (float)(3)) {
            CobolDisplay.display("BAD FIELD-C " + CobolDisplay.formatFloatShort(group_2_field_c));
        }
        if (!CobolString.cobolEquals(String.valueOf(group_2_field_d), String.valueOf("A"))) {
            CobolDisplay.display("BAD FIELD-D " + String.valueOf(group_2_field_d));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental067AddCorrespondingNoMatch");
            CobolProgram.registerCallAlias("prog", "RunFundamental067AddCorrespondingNoMatch");
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
        new RunFundamental067AddCorrespondingNoMatch().run();
    }
}
