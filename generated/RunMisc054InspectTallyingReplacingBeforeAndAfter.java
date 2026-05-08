package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc054InspectTallyingReplacingBeforeAndAfter extends CobolProgram {
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
    private CobolString insp_string = new CobolString(26, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    private static final String exptd_result = "A22222111111111122222222YZ";
    private short res_idx = (short) 100;
    private short res_idx_1 = (short) 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(31);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_insp_string = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 26).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("INSP-STRING").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_exptd_result = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(26, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("EXPTD-RESULT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_res_idx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(27, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("RES-IDX").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_res_idx_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("RES-IDX-1").picDigits(4).build();


    private void para_main() {
        {
            int[] _tc = CobolIntrinsics.inspectTallyCharactersMulti(String.valueOf(insp_string), new String[]{null, "B"}, new String[]{"H", null});
            res_idx += _tc[0];
            res_idx_1 += _tc[1];
        }
        insp_string.set(CobolIntrinsics.inspectReplaceCharactersMulti(String.valueOf(insp_string), new String[]{"1", "2"}, new String[]{"F", "A"}, new String[]{"Q", "Y"}));
        if (!CobolString.cobolEquals(String.valueOf(insp_string), String.valueOf(exptd_result))) {
            CobolDisplay.display("Failed <" + String.valueOf(insp_string) + "> != <" + String.valueOf(exptd_result) + ">");
        }
        if (res_idx != 107) {
            CobolDisplay.display("Failed <" + CobolDisplay.formatPic(res_idx, 4, 0, false) + "> != <107>");
        }
        if (res_idx_1 != 19) {
            CobolDisplay.display("Failed <" + CobolDisplay.formatPic(res_idx_1, 4, 0, false) + "> != <19>");
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc054InspectTallyingReplacingBeforeAndAfter");
            CobolProgram.registerCallAlias("prog", "RunMisc054InspectTallyingReplacingBeforeAndAfter");
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
        new RunMisc054InspectTallyingReplacingBeforeAndAfter().run();
    }
}
