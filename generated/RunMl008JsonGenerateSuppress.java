package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import com.lazarus.cobol.env.CobolJson;
import com.lazarus.cobol.env.CobolXml;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMl008JsonGenerateSuppress extends CobolProgram {
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
    private CobolString a = new CobolString(6, "      "); // Group: a
    private CobolString b = new CobolString(3);
    private CobolString c = new CobolString(3);
    private CobolString x = new CobolString(1, " "); // Group: x
    private CobolString y = new CobolString(1, " "); // Group: y
    private CobolString z = new CobolString(1);
    private CobolString out = new CobolString(100);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(107);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("a").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("b").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("c").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("x").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_y = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("y").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_z = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("z").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_out = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 100).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("out").build();


    private void para_main() {
        { String _json_tmp5 = "{\"a\":{" + "\"c\":" + CobolJson.valueLiteral(c) + "}}";
            json_code = 0;
            if (_json_tmp5.length() > 100) { json_code = 1; }
            out.set(_json_tmp5);
        }
        if (!CobolString.cobolEquals(String.valueOf(out), String.valueOf("{\"a\":{\"c\":\" \"}}"))) {
            CobolDisplay.display("Test 1 failed: " + String.valueOf(out));
        }
        { String _json_tmp6 = "{\"x\":{}}";
            json_code = 0;
            if (_json_tmp6.length() > 100) { json_code = 1; }
            out.set(_json_tmp6);
        }
        if (!CobolString.cobolEquals(String.valueOf(out), String.valueOf("{\"x\":{}}"))) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(out));
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMl008JsonGenerateSuppress");
            CobolProgram.registerCallAlias("prog", "RunMl008JsonGenerateSuppress");
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
        new RunMl008JsonGenerateSuppress().run();
    }
}
