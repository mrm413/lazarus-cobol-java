package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions048LargerRedefinesLengths extends CobolProgram {
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
    private int z = 0;
    private CobolString xmain = new CobolString(8);
    private CobolString xmainred = xmain; // Group REDEFINES: XMAINRED
    private CobolString filler_1 = new CobolString(4);
    private CobolString xmain03 = new CobolString(5); // Group: XMAIN03
    private CobolString xmain0501 = new CobolString(4);
    private CobolString xmain0502 = xmain0501;
    private CobolString use_vars = new CobolString(33212); // Group: USE-VARS
    private int use_value = 0;
    private CobolString use_first = new CobolString(33211); // Group: USE-FIRST
    private CobolString first_data = new CobolString(33); // Group: FIRST-DATA
    private CobolString first_data_var = new CobolString(33);
    private CobolString first_variant_a = first_data; // Group REDEFINES: FIRST-VARIANT-A
    private CobolString part_a_first = new CobolString(33211);
    private CobolString first_variant_b = first_data; // Group REDEFINES: FIRST-VARIANT-B
    private CobolString part_b_first = new CobolString(24561);
    private CobolString first_variant_c = first_data; // Group REDEFINES: FIRST-VARIANT-C
    private CobolString part_c_first = new CobolString(3421);
    private CobolString use_second = use_first; // Group REDEFINES: USE-SECOND
    private CobolString second_header = new CobolString(33); // Group: SECOND-HEADER
    private long second_data = 0L;
    private BigDecimal second_control_sum = BigDecimal.ZERO;
    private CobolString second_variant_a = second_header; // Group REDEFINES: SECOND-VARIANT-A
    private CobolString part_a_second = new CobolString(27241);
    private CobolString second_variant_b = second_header; // Group REDEFINES: SECOND-VARIANT-B
    private CobolString part_b_second = new CobolString(3879);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(33231);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_z = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("Z").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xmain = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("XMAIN").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xmainred = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("XMAINRED").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xmain03 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("XMAIN03").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xmain0501 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("XMAIN0501").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_xmain0502 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("XMAIN0502").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_use_vars = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 33212).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("USE-VARS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_use_value = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("USE-VALUE").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_use_first = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 33211).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("USE-FIRST").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_first_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 33).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FIRST-DATA").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_first_data_var = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 33).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FIRST-DATA-VAR").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_first_variant_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 33211).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FIRST-VARIANT-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_part_a_first = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 33211).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("PART-A-FIRST").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_first_variant_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 24561).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FIRST-VARIANT-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_part_b_first = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 24561).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("PART-B-FIRST").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_first_variant_c = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 3421).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FIRST-VARIANT-C").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_part_c_first = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 3421).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("PART-C-FIRST").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_use_second = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 27241).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("USE-SECOND").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_second_header = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 33).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("SECOND-HEADER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_second_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SECOND-DATA").picDigits(15).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_second_control_sum = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(35, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SECOND-CONTROL-SUM").picDigits(18).picScale(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_second_variant_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 27241).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("SECOND-VARIANT-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_part_a_second = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 27241).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("PART-A-SECOND").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_second_variant_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 3879).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("SECOND-VARIANT-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_part_b_second = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 3879).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("PART-B-SECOND").build();


    private void para_main() {
        z = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(8), 2));
        if (z != 8) {
            CobolDisplay.display("Test 1 " + CobolDisplay.formatPic(z, 2, 0, false));
        }
        z = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(9), 2));
        if (z != 9) {
            CobolDisplay.display("Test 2 " + CobolDisplay.formatPic(z, 2, 0, false));
        }
        z = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(5), 2));
        if (z != 5) {
            CobolDisplay.display("Test 3 " + CobolDisplay.formatPic(z, 2, 0, false));
        }
        z = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(4), 2));
        if (z != 4) {
            CobolDisplay.display("Test 4 " + CobolDisplay.formatPic(z, 2, 0, false));
        }
        z = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(5), 2));
        if (z != 5) {
            CobolDisplay.display("Test 5 " + CobolDisplay.formatPic(z, 2, 0, false));
        }
        if (33211 != 33211) {
            CobolDisplay.display(String.valueOf(33211));
        }
        if (27241 != 27241) {
            CobolDisplay.display(String.valueOf(27241));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunExtensions048LargerRedefinesLengths");
            CobolProgram.registerCallAlias("prog", "RunExtensions048LargerRedefinesLengths");
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
        new RunExtensions048LargerRedefinesLengths().run();
    }
}
