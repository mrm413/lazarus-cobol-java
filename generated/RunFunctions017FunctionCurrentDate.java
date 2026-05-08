package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions017FunctionCurrentDate extends CobolProgram {
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
    private CobolString test_fld = new CobolString(22, "                     _"); // Group: TEST-FLD
    private int ws_year = 0;
    private int ws_month = 0;
    private int ws_day = 0;
    private int ws_hour = 0;
    private int ws_min = 0;
    private int ws_sevalidd = 0;
    private int ws_hundsec = 0;
    private CobolString ws_greenw = new CobolString(1);
    private int ws_offset = 0;
    private int ws_offset2 = 0;
    private CobolString ws_unset = new CobolString(1, "_");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(22);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_fld = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 22).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TEST-FLD").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_year = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("WS-YEAR").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_month = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("WS-MONTH").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_day = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("WS-DAY").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_hour = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("WS-HOUR").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_min = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("WS-MIN").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_sevalidd = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("WS-SEVALIDD").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_hundsec = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(14, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("WS-HUNDSEC").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_greenw = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-GREENW").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_offset = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(17, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("WS-OFFSET").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_offset2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(19, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("WS-OFFSET2").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_unset = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(21, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-UNSET").build();


    private void para_main() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.current_date()));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), test_fld.length()); test_fld.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
            try { ws_year = Integer.parseInt(CobolString.refMod(test_fld, 1, 4).trim()); } catch (Exception _ge) {}
            try { ws_month = Integer.parseInt(CobolString.refMod(test_fld, 5, 2).trim()); } catch (Exception _ge) {}
            try { ws_day = Integer.parseInt(CobolString.refMod(test_fld, 7, 2).trim()); } catch (Exception _ge) {}
            try { ws_hour = Integer.parseInt(CobolString.refMod(test_fld, 9, 2).trim()); } catch (Exception _ge) {}
            try { ws_min = Integer.parseInt(CobolString.refMod(test_fld, 11, 2).trim()); } catch (Exception _ge) {}
            try { ws_sevalidd = Integer.parseInt(CobolString.refMod(test_fld, 13, 2).trim()); } catch (Exception _ge) {}
            try { ws_hundsec = Integer.parseInt(CobolString.refMod(test_fld, 15, 2).trim()); } catch (Exception _ge) {}
            if (ws_greenw != null) ws_greenw.set(CobolString.refMod(test_fld, 17, 1));
            try { ws_offset = Integer.parseInt(CobolString.refMod(test_fld, 18, 2).trim()); } catch (Exception _ge) {}
            try { ws_offset2 = Integer.parseInt(CobolString.refMod(test_fld, 20, 2).trim()); } catch (Exception _ge) {}
            if (ws_unset != null) ws_unset.set(CobolString.refMod(test_fld, 22, 1));
        }
        if (!(CobolString.cobolEquals(String.valueOf(ws_unset), "_"))) {
            CobolDisplay.display("FUNCTION result too long");
        } else if (((((((((((((ws_year >= 1980 && ws_year <= 9999) && (ws_month >= 1 && ws_month <= 12)) && (ws_day >= 1 && ws_day <= 31)) && (ws_hour >= 0 && ws_hour <= 23)) && (ws_min >= 0 && ws_min <= 59)) && (ws_sevalidd >= 0 && ws_sevalidd <= 59)) && (ws_hundsec >= 0 && ws_hundsec <= 99)) && (CobolString.cobolEquals(String.valueOf(ws_greenw), "-") || CobolString.cobolEquals(String.valueOf(ws_greenw), "+") || CobolString.cobolEquals(String.valueOf(ws_greenw), "0"))) && (ws_offset >= 0 && ws_offset <= 13)) && (ws_offset2 >= 0 && ws_offset2 <= 59)) && CobolString.cobolEquals(String.valueOf(ws_unset), "_")) && (!(CobolString.cobolEquals(String.valueOf(ws_greenw), "0")) || (ws_offset == 0 && ws_offset2 == 0)))) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("CURRENT-DATE with wrong format: " + String.valueOf(CobolString.refMod(test_fld, 1, 21)));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions017FunctionCurrentDate");
            CobolProgram.registerCallAlias("prog", "RunFunctions017FunctionCurrentDate");
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
        new RunFunctions017FunctionCurrentDate().run();
    }
}
