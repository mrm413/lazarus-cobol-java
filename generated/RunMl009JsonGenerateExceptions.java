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

public class RunMl009JsonGenerateExceptions extends CobolProgram {
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
    private CobolString normal_str = new CobolString(200);
    private CobolString valid_rec = new CobolString(4, "aabb"); // Group: valid-rec
    private CobolString a = new CobolString(2, "aa");
    private CobolString b = new CobolString(2, "bb");
    private CobolString short_str = new CobolString(5);
    private int json_len = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(211);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_normal_str = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 200).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("normal-str").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_valid_rec = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(200, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("valid-rec").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(200, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("a").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(202, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("b").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_short_str = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(204, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("short-str").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_json_len = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(209, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("json-len").picDigits(2).build();


    private void para_main() {
        { String _json_tmp7 = "{\"valid-rec\":{" + "\"a\":" + CobolJson.valueLiteral(a) + "," + "\"b\":" + CobolJson.valueLiteral(b) + "}}";
            json_code = 0;
            if (_json_tmp7.length() > 5) { json_code = 1; }
            short_str.set(_json_tmp7);
            json_len = _json_tmp7.length();
        }
        if (((!CobolString.cobolEquals(String.valueOf(short_str), String.valueOf("{\"val")) || json_len != 33) || json_code != 1)) {
            CobolDisplay.display("Failed 1: " + String.valueOf(short_str) + " " + CobolDisplay.formatPic(json_len, 2, 0, false) + " " + String.valueOf(json_code));
        }
        { String _json_tmp8 = "{\"valid-rec\":{" + "\"a\":" + CobolJson.valueLiteral(a) + "," + "\"b\":" + CobolJson.valueLiteral(b) + "}}";
            json_code = 0;
            if (_json_tmp8.length() > 200) { json_code = 1; }
            normal_str.set(_json_tmp8);
        }
        if (json_code == 0) {
            if (json_code != 0) {
                CobolDisplay.display("Failed 2: NOT EXCEPTION " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(json_code));
            }
        } else {
            CobolDisplay.display("Failed 2: EXCEPTION " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(json_code));
        }
        { String _json_tmp9 = "{\"valid-rec\":{" + "\"a\":" + CobolJson.valueLiteral(a) + "," + "\"b\":" + CobolJson.valueLiteral(b) + "}}";
            json_code = 0;
            if (_json_tmp9.length() > 5) { json_code = 1; }
            short_str.set(_json_tmp9);
        }
        if (json_code == 0) {
            CobolDisplay.display("Failed 3: NOT EXCEPTION " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(json_code));
        } else {
            if (json_code != 1) {
                CobolDisplay.display("Failed 3: ON EXCEPTION " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(json_code));
            }
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMl009JsonGenerateExceptions");
            CobolProgram.registerCallAlias("prog", "RunMl009JsonGenerateExceptions");
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
        new RunMl009JsonGenerateExceptions().run();
    }
}
