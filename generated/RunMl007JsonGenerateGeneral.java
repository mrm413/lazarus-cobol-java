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

public class RunMl007JsonGenerateGeneral extends CobolProgram {
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
    private CobolString out = new CobolString(200);
    private CobolString rec = new CobolString(9, "A  BBB   "); // Group: rec
    private CobolString a = new CobolString(3, "A");
    private CobolString b = new CobolString(3, "BBB");
    private CobolString c = new CobolString(3, "   "); // Group: c
    private CobolString d = new CobolString(3);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(209);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_out = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 200).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("out").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_rec = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(200, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("rec").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(200, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("a").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(203, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("b").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_c = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(206, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("c").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_d = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(206, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("d").build();


    private void para_main() {
        { String _json_tmp0 = "{\"rec\":{" + "\"alpha\":" + CobolJson.valueLiteral(a) + "," + "\"b\":" + CobolJson.valueLiteral(b) + "}}";
            json_code = 0;
            if (_json_tmp0.length() > 200) { json_code = 1; }
            out.set(_json_tmp0);
        }
        if (!CobolString.cobolEquals(String.valueOf(out), String.valueOf("{\"rec\":{\"alpha\":\"A\",\"b\":\"BBB\"}}"))) {
            CobolDisplay.display("Test 1 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        { String _json_tmp1 = "{" + "\"alpha\":" + CobolJson.valueLiteral(a) + "," + "\"b\":" + CobolJson.valueLiteral(b) + "}";
            json_code = 0;
            if (_json_tmp1.length() > 200) { json_code = 1; }
            out.set(_json_tmp1);
        }
        if (!CobolString.cobolEquals(String.valueOf(out), String.valueOf("{\"alpha\":\"A\",\"b\":\"BBB\"}"))) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        { String _json_tmp2 = "{\"d\":" + CobolJson.valueLiteral(d) + "}";
            json_code = 0;
            if (_json_tmp2.length() > 200) { json_code = 1; }
            out.set(_json_tmp2);
        }
        if (!CobolString.cobolEquals(String.valueOf(out), String.valueOf("{\"d\":\" \"}"))) {
            CobolDisplay.display("Test 3 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        { String _json_tmp3 = "{\"c\":{" + "\"d\":" + CobolJson.valueLiteral(d) + "}}";
            json_code = 0;
            if (_json_tmp3.length() > 200) { json_code = 1; }
            out.set(_json_tmp3);
        }
        if (!CobolString.cobolEquals(String.valueOf(out), String.valueOf("{\"c\":{\"d\":\" \"}}"))) {
            CobolDisplay.display("Test 4 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        d.set("\"\"\"");
        { String _json_tmp4 = "{\"d\":" + CobolJson.valueLiteral(d) + "}";
            json_code = 0;
            if (_json_tmp4.length() > 200) { json_code = 1; }
            out.set(_json_tmp4);
        }
        if (!CobolString.cobolEquals(String.valueOf(out), String.valueOf("{\"d\":\"\\\"\\\"\\\"\"}"))) {
            CobolDisplay.display("Test 5 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMl007JsonGenerateGeneral");
            CobolProgram.registerCallAlias("prog", "RunMl007JsonGenerateGeneral");
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
        new RunMl007JsonGenerateGeneral().run();
    }
}
