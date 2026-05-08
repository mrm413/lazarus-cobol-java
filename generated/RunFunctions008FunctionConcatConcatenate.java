package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions008FunctionConcatConcatenate extends CobolProgram {
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
    private CobolString y = new CobolString(4);
    private CobolString test_fld = new CobolString(15, "              _"); // Group: TEST-FLD
    private CobolString test_data = new CobolString(14);
    private CobolString test_unset = new CobolString(1, "_");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(19);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_y = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("Y").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_fld = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 15).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TEST-FLD").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TEST-DATA").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_unset = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(18, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TEST-UNSET").build();


    private void para_main() {
        y.set(String.valueOf("defx"));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.concatenate(y, "abc", "zz", "55", "666")));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), test_fld.length()); test_fld.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
            if (test_data != null) test_data.set(CobolString.refMod(test_fld, 1, 14));
            if (test_unset != null) test_unset.set(CobolString.refMod(test_fld, 15, 1));
        }
        if (!(CobolString.cobolEquals(String.valueOf(test_unset), "_"))) {
            CobolDisplay.display("FUNCTION result too long");
        } else if (!CobolString.cobolEquals(String.valueOf(test_data), String.valueOf(CobolIntrinsics.concatenate(y, "abc", "zz", "55", "666")))) {
            CobolDisplay.display("CONCAT issue, '" + String.valueOf(test_data) + "' vs. '" + String.valueOf(CobolIntrinsics.concatenate(y, "abc", "zz", "55", "666")) + "'");
        } else if (CobolString.cobolEquals(String.valueOf(test_data), "defxabczz55666")) {
            /* CONTINUE */
        } else {
            CobolDisplay.display(String.valueOf(test_data));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions008FunctionConcatConcatenate");
            CobolProgram.registerCallAlias("prog", "RunFunctions008FunctionConcatConcatenate");
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
        new RunFunctions008FunctionConcatConcatenate().run();
    }
}
