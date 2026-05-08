package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions116FunctionWhenCompiled extends CobolProgram {
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
    private CobolString compiled_datetime = new CobolString(21); // Group: compiled-datetime
    private CobolString compiled_date = new CobolString(16); // Group: compiled-date
    private CobolString millennium = new CobolString(1);
    private CobolString filler_1 = new CobolString(15);
    private CobolString timezone = new CobolString(5);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(21);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_compiled_datetime = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 21).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("compiled-datetime").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_compiled_date = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("compiled-date").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_millennium = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("millennium").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_timezone = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 5).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("timezone").build();

    private CobolString _filler_001 = new CobolString(256); // fallback

    private void para_main() {
        compiled_datetime.set(String.valueOf(CobolIntrinsics.when_compiled()));
        if (compiled_date != null) compiled_date.set(CobolString.refMod(compiled_datetime, 1, 16));
        if (millennium != null) millennium.set(CobolString.refMod(compiled_datetime, 1, 1));
        if (timezone != null) timezone.set(CobolString.refMod(compiled_datetime, 17, 5));
        if (!CobolString.cobolEquals(String.valueOf(millennium), String.valueOf("2"))) {
            CobolDisplay.display("Millennium NOT OK: " + String.valueOf(millennium));
        }
        if (!CobolString.cobolEquals(String.valueOf(timezone), String.valueOf(CobolIntrinsics.current_date().substring(16, 21)))) {
            CobolDisplay.display("Timezone NOT OK: " + String.valueOf(timezone));
        }
        compiled_date.set(CobolIntrinsics.inspectConverting(String.valueOf(compiled_date), "0123456789", "9999999999"));
        if (!CobolString.cobolEquals(String.valueOf(compiled_date), String.valueOf("9999999999999999"))) {
            { /* Build group compiled-date from children before group access */
                String _gbuf = compiled_date.get();
                StringBuilder _sb = new StringBuilder(16);
                _sb.append(String.format("%-1s", String.valueOf(millennium)).substring(0, 1));
                _sb.append(_gbuf.substring(Math.min(1, _gbuf.length()), Math.min(16, _gbuf.length())));
                compiled_date.set(_sb.toString());
            }
            CobolDisplay.display("Date format NOT OK: " + String.valueOf(compiled_date));
        }
        if (!CobolString.cobolEquals(String.valueOf(timezone), String.valueOf("00000"))) {
            timezone.set(CobolIntrinsics.inspectConverting(String.valueOf(timezone), "0123456789", "9999999999"));
            if ((!CobolString.cobolEquals(String.valueOf(timezone), String.valueOf("+9999")) && !CobolString.cobolEquals(String.valueOf(timezone), String.valueOf("-9999")))) {
                CobolDisplay.display("Timezone format NOT OK: " + String.valueOf(timezone));
            }
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions116FunctionWhenCompiled");
            CobolProgram.registerCallAlias("prog", "RunFunctions116FunctionWhenCompiled");
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
        new RunFunctions116FunctionWhenCompiled().run();
    }
}
