package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions010FunctionBitOfAndBitToChar extends CobolProgram {
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
    private BigDecimal pac = new BigDecimal("12");
    private CobolString txt = new CobolString(4, "HI.");
    private CobolString bitx = new CobolString(34);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(41);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_pac = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("PAC").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_txt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TXT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bitx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 34).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("BITX").build();

    private CobolString bitx_filler = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback

    private void para_main() {
        bitx.set("-".repeat(bitx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.bit_of(_vmgfd_pac, pac)));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), bitx.length()); bitx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!CobolString.cobolEquals(String.valueOf(bitx), String.valueOf("000000000000000100101111----------"))) {
            CobolDisplay.display("UNEXPECTED BIT-VALUE OF PAC 0012: " + String.valueOf(bitx));
        }
        bitx.set("-".repeat(bitx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.bit_of(_vmgfd_txt, txt)));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), bitx.length()); bitx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!CobolString.cobolEquals(String.valueOf(bitx), String.valueOf("01001000010010010010111000100000--"))) {
            if (!CobolString.cobolEquals(String.valueOf(bitx), String.valueOf("11001000110010010100101101000000--"))) {
                CobolDisplay.display("UNEXPECTED BIT-VALUE OF 'HI. ': " + String.valueOf(bitx));
            }
        }
        bitx.set("-".repeat(bitx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.bit_of("01\u0000")));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), bitx.length()); bitx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!CobolString.cobolEquals(String.valueOf(bitx), String.valueOf("001100000011000100000000----------"))) {
            if (!CobolString.cobolEquals(String.valueOf(CobolIntrinsics.bit_to_char(CobolString.refMod(bitx, 1, 24))), String.valueOf("01\u0000"))) {
                CobolDisplay.display("UNEXPECTED CHAR VALUE, does not match z'01': " + String.valueOf(CobolString.refMod(bitx, 1, 24)));
            }
        }
        bitx.set("-".repeat(bitx.length()));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.bit_to_char("0011000100110010")));
            { String _strv = _sb.toString(); int _strlen = Math.min(_strv.length(), bitx.length()); bitx.setRefMod(1, _strlen, _strv.substring(0, _strlen)); }
        }
        if (!((CobolString.cobolEquals(String.valueOf(CobolString.refMod(bitx, 1, 2)), String.valueOf("12")) && CobolString.cobolEquals(String.valueOf(CobolString.refMod(bitx, 3)), String.valueOf("--------------------------------"))))) {
            CobolDisplay.display("UNEXPECTED CHAR VALUE, expected 12-* got: " + String.valueOf(bitx));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFunctions010FunctionBitOfAndBitToChar");
            CobolProgram.registerCallAlias("prog", "RunFunctions010FunctionBitOfAndBitToChar");
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
        new RunFunctions010FunctionBitOfAndBitToChar().run();
    }
}
