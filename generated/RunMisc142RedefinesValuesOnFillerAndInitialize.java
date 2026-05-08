package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc142RedefinesValuesOnFillerAndInitialize extends CobolProgram {
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
    private CobolString tsrdf = new CobolString(10, "**********"); // Group: TSRDF
    private CobolString ws_ask_id_date = new CobolString(10, "**********");
    private CobolString ws_ask_id_date_r = ws_ask_id_date; // Group REDEFINES: WS-ASK-ID-DATE-R
    private int ws_ask_id_date_yyyy = 2017;
    private CobolString filler_1 = new CobolString(1, "-");
    private int ws_ask_id_date_mm = 0;
    private CobolString filler_2 = new CobolString(1, "-");
    private int ws_ask_id_date_dd = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(10);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tsrdf = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TSRDF").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_ask_id_date = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("WS-ASK-ID-DATE").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_ask_id_date_r = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("WS-ASK-ID-DATE-R").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_ask_id_date_yyyy = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-ASK-ID-DATE-YYYY").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_7 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_ask_id_date_mm = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-ASK-ID-DATE-MM").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_8 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ws_ask_id_date_dd = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("WS-ASK-ID-DATE-DD").picDigits(2).build();


    private void para_main() {
        ws_ask_id_date_yyyy = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2015), 4));
        ws_ask_id_date_r.setRefMod(1, 4, CobolDisplay.formatPic(ws_ask_id_date_yyyy, 4, 0, false));
        ws_ask_id_date_mm = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(8), 2));
        ws_ask_id_date_r.setRefMod(6, 2, CobolDisplay.formatPic(ws_ask_id_date_mm, 2, 0, false));
        ws_ask_id_date_dd = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(21), 2));
        ws_ask_id_date_r.setRefMod(9, 2, CobolDisplay.formatPic(ws_ask_id_date_dd, 2, 0, false));
        CobolDisplay.display("The date is " + String.valueOf(ws_ask_id_date) + " Compiled");
        ws_ask_id_date_r.setRefMod(1, 4, "0000");
        ws_ask_id_date_yyyy = 0;
        ws_ask_id_date_r.setRefMod(6, 2, "00");
        ws_ask_id_date_mm = 0;
        ws_ask_id_date_r.setRefMod(9, 2, "00");
        ws_ask_id_date_dd = 0;
        ws_ask_id_date_mm = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(8), 2));
        ws_ask_id_date_r.setRefMod(6, 2, CobolDisplay.formatPic(ws_ask_id_date_mm, 2, 0, false));
        ws_ask_id_date_dd = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(21), 2));
        ws_ask_id_date_r.setRefMod(9, 2, CobolDisplay.formatPic(ws_ask_id_date_dd, 2, 0, false));
        CobolDisplay.display("The date is " + String.valueOf(ws_ask_id_date) + " INITIALIZE");
        ws_ask_id_date_r.setRefMod(1, 4, "0000");
        ws_ask_id_date_yyyy = 0;
        ws_ask_id_date_r.setRefMod(5, 1, " ");
        ws_ask_id_date_r.setRefMod(6, 2, "00");
        ws_ask_id_date_mm = 0;
        ws_ask_id_date_r.setRefMod(8, 1, " ");
        ws_ask_id_date_r.setRefMod(9, 2, "00");
        ws_ask_id_date_dd = 0;
        ws_ask_id_date_mm = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(8), 2));
        ws_ask_id_date_r.setRefMod(6, 2, CobolDisplay.formatPic(ws_ask_id_date_mm, 2, 0, false));
        ws_ask_id_date_dd = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(21), 2));
        ws_ask_id_date_r.setRefMod(9, 2, CobolDisplay.formatPic(ws_ask_id_date_dd, 2, 0, false));
        CobolDisplay.display("The date is " + String.valueOf(ws_ask_id_date) + " WITH FILLER");
        ws_ask_id_date_r.setRefMod(1, 4, "2017");
        ws_ask_id_date_yyyy = 2017;
        ws_ask_id_date_r.setRefMod(5, 1, "-");
        ws_ask_id_date_r.setRefMod(6, 2, "00");
        ws_ask_id_date_mm = 0;
        ws_ask_id_date_r.setRefMod(8, 1, "-");
        ws_ask_id_date_r.setRefMod(9, 2, "00");
        ws_ask_id_date_dd = 0;
        { /* Sync WS-ASK-ID-DATE-R back to TSRDF after INITIALIZE ALL TO VALUE */
            StringBuilder _sb = new StringBuilder(10);
            _sb.append(CobolDisplay.formatPic(ws_ask_id_date_yyyy, 4, 0, false));
            _sb.append(String.format("%-1s", ""));
            _sb.append(CobolDisplay.formatPic(ws_ask_id_date_mm, 2, 0, false));
            _sb.append(String.format("%-1s", ""));
            _sb.append(CobolDisplay.formatPic(ws_ask_id_date_dd, 2, 0, false));
            String _val = _sb.toString();
            tsrdf.setRefMod(11, Math.min(_val.length(), 10), _val);
        }
        ws_ask_id_date_mm = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(8), 2));
        ws_ask_id_date_r.setRefMod(6, 2, CobolDisplay.formatPic(ws_ask_id_date_mm, 2, 0, false));
        ws_ask_id_date_dd = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(21), 2));
        ws_ask_id_date_r.setRefMod(9, 2, CobolDisplay.formatPic(ws_ask_id_date_dd, 2, 0, false));
        CobolDisplay.display("The date is " + String.valueOf(ws_ask_id_date) + " ALL TO VALUE");
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc142RedefinesValuesOnFillerAndInitialize");
            CobolProgram.registerCallAlias("prog", "RunMisc142RedefinesValuesOnFillerAndInitialize");
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
        new RunMisc142RedefinesValuesOnFillerAndInitialize().run();
    }
}
