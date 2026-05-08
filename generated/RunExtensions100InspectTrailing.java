package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions100InspectTrailing extends CobolProgram {
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
    private CobolString w01_string = new CobolString(20, "0123456789");
    private short w01_index = (short) 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(22);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_w01_string = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 20).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("W01-STRING").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_w01_index = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("W01-INDEX").picDigits(4).build();


    private void para_main() {
        w01_index = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 4));
        w01_index += CobolIntrinsics.inspectTallyTrailing(String.valueOf(w01_string), " ");
        if (w01_index != 10) {
            CobolDisplay.display("Bad Result for Inspect Trailing Case 1");
        }
        w01_string.set(CobolIntrinsics.inspectReplaceTrailing(String.valueOf(w01_string), " ", "A"));
        if (!CobolString.cobolEquals(String.valueOf(w01_string), String.valueOf("0123456789AAAAAAAAAA"))) {
            CobolDisplay.display("Bad Result for Inspect Trailing Case 2");
        }
        w01_index = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 4));
        w01_index += CobolIntrinsics.inspectTallyTrailing(String.valueOf(w01_string), " ");
        w01_string.set(CobolIntrinsics.inspectReplaceTrailing(String.valueOf(w01_string), "A", "B"));
        if (!CobolString.cobolEquals(String.valueOf(w01_string), String.valueOf("0123456789BBBBBBBBBB"))) {
            CobolDisplay.display("Bad Result for Inspect Trailing Case 3");
        }
        w01_index = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 4));
        w01_string.set(String.valueOf(" "));
        w01_index += CobolIntrinsics.inspectTallyTrailing(String.valueOf(w01_string), "A");
        if (w01_index != 0) {
            CobolDisplay.display("Bad Result for Inspect Trailing Case 4" + CobolDisplay.formatPic(w01_index, 4, 0, false));
        }
        w01_index = (short) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 4));
        w01_string.set(String.valueOf(" "));
        w01_index += CobolIntrinsics.inspectTallyTrailing(String.valueOf(w01_string), " ");
        if (w01_index != 20) {
            CobolDisplay.display("Bad Result for Inspect Trailing Case 5" + CobolDisplay.formatPic(w01_index, 4, 0, false));
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunExtensions100InspectTrailing");
            CobolProgram.registerCallAlias("prog", "RunExtensions100InspectTrailing");
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
        new RunExtensions100InspectTrailing().run();
    }
}
