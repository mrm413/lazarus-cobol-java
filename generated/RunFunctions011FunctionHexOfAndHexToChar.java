package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions011FunctionHexOfAndHexToChar extends CobolProgram {
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
    private CobolString x = new CobolString(4, " 012"); // Group: X
    private CobolString filler_1 = new CobolString(1);
    private int filler_2 = 12;
    private CobolString y = new CobolString(4, "HI.");
    private int bin = 12;
    private BigDecimal pac = new BigDecimal("1234");
    private int n9 = 12;
    private CobolString nx = new CobolString(4, "!");
    private CobolString hexx = new CobolString(10);
    private int filler_3 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(32);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("FILLER").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_y = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("Y").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bin = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BIN").picDigits(9).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_pac = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("PAC").picDigits(5).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_n9 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("N9").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_nx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(17, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("NX").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_hexx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(21, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("HEXX").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_6 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(31, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("FILLER").build();

    private CobolString hexx_filler = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString do_disp = new CobolString(256); // fallback

    private void para_main() {
        do_check();
        return;
    }

    private void do_check() {
        hexx.set("-".repeat(hexx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of(_vmgfd_x, x)));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), hexx.length()); hexx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!CobolString.cobolEquals(String.valueOf(hexx), String.valueOf("20303132--"))) {
            if (!CobolString.cobolEquals(String.valueOf(hexx), String.valueOf("40F0F1F2--"))) {
                if (filler_3 == 0) {
                    CobolDisplay.display("UNEXPECTED HEX-VALUE OF '0012': " + String.valueOf(hexx));
                }
            }
        }
        hexx.set("-".repeat(hexx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of(_vmgfd_y, y)));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), hexx.length()); hexx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!CobolString.cobolEquals(String.valueOf(hexx), String.valueOf("48492E20--"))) {
            if (!CobolString.cobolEquals(String.valueOf(hexx), String.valueOf("C8C94B40--"))) {
                if (filler_3 == 0) {
                    CobolDisplay.display("UNEXPECTED HEX-VALUE OF 'HI! ': " + String.valueOf(hexx));
                }
            }
        }
        hexx.set("-".repeat(hexx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of(_vmgfd_bin, bin)));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), hexx.length()); hexx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!CobolString.cobolEquals(String.valueOf(hexx), String.valueOf("0000000C--"))) {
            if (filler_3 == 0) {
                CobolDisplay.display("UNEXPECTED HEX-VALUE OF BIN 12: " + String.valueOf(hexx));
            }
        }
        hexx.set("-".repeat(hexx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of(_vmgfd_pac, pac)));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), hexx.length()); hexx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!CobolString.cobolEquals(String.valueOf(hexx), String.valueOf("01234F----"))) {
            if (filler_3 == 0) {
                CobolDisplay.display("UNEXPECTED HEX-VALUE OF PACKED 1234: " + String.valueOf(hexx));
            }
        }
        hexx.set("-".repeat(hexx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of("01\u0000")));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), hexx.length()); hexx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!CobolString.cobolEquals(String.valueOf(hexx), String.valueOf("303100----"))) {
            if (!CobolString.cobolEquals(String.valueOf(hexx), String.valueOf("F0F100----"))) {
                if (filler_3 == 0) {
                    CobolDisplay.display("UNEXPECTED HEX-VALUE OF z'01': " + String.valueOf(hexx));
                }
            }
        }
        hexx.set("-".repeat(hexx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of(" ")));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), hexx.length()); hexx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!CobolString.cobolEquals(String.valueOf(hexx), String.valueOf("20--------"))) {
            if (!CobolString.cobolEquals(String.valueOf(hexx), String.valueOf("40--------"))) {
                if (filler_3 == 0) {
                    CobolDisplay.display("UNEXPECTED HEX-VALUE OF ' ': " + String.valueOf(hexx));
                }
            }
        }
        hexx.set("-".repeat(hexx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of("\u0000 ")));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), hexx.length()); hexx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!CobolString.cobolEquals(String.valueOf(hexx), String.valueOf("0020------"))) {
            if (filler_3 == 0) {
                CobolDisplay.display("UNEXPECTED HEX-VALUE OF n' ': " + String.valueOf(hexx));
            }
        }
        hexx.set("-".repeat(hexx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_of("01\u0000")));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), hexx.length()); hexx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!CobolString.cobolEquals(String.valueOf(CobolIntrinsics.hex_to_char(CobolString.refMod(hexx, 1, 6))), String.valueOf("01\u0000"))) {
            if (filler_3 == 0) {
                CobolDisplay.display("UNEXPECTED CHAR VALUE, does not match z'01': " + String.valueOf(CobolString.refMod(hexx, 1, 6)));
            }
        }
        hexx.set("-".repeat(hexx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_to_char("3132")));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), hexx.length()); hexx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!((CobolString.cobolEquals(String.valueOf(CobolString.refMod(hexx, 1, 2)), String.valueOf("12")) && CobolString.cobolEquals(String.valueOf(CobolString.refMod(hexx, 3)), String.valueOf("--------"))))) {
            if (filler_3 == 0) {
                CobolDisplay.display("UNEXPECTED CHAR VALUE, expected 12-* got: " + String.valueOf(hexx));
            }
        }
        hexx.set("-".repeat(hexx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.hex_to_char("3132")));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), hexx.length()); hexx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!((CobolString.cobolEquals(String.valueOf(CobolString.refMod(hexx, 1, 2)), String.valueOf("12")) && CobolString.cobolEquals(String.valueOf(CobolString.refMod(hexx, 3)), String.valueOf("--------"))))) {
            if (filler_3 == 0) {
                CobolDisplay.display("UNEXPECTED CHAR VALUE, expected 12-* got: " + String.valueOf(hexx));
            }
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions011FunctionHexOfAndHexToChar");
            CobolProgram.registerCallAlias("prog", "RunFunctions011FunctionHexOfAndHexToChar");
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
        new RunFunctions011FunctionHexOfAndHexToChar().run();
    }
}
