package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental099AbbreviatedConditionsWithMultipleWordsOperato extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "CHECKBOOL";
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
    private CobolString var1 = new CobolString(16, "#0001");
    private CobolString var2 = new CobolString(16, "#0002");
    private CobolString var3 = new CobolString(16, "#0003");
    private CobolString var4 = new CobolString(16, "#0004");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(64);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("VAR1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(16, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("VAR2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(32, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("VAR3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(48, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("VAR4").build();


    // SECTION: MAIN-PROGRAM
    private void main_program() {
        _exitSection = false;
        inizio();
    }

    private void inizio() {
        CobolIntrinsics.setCurrentLocation("CHECKBOOL; INIZIO OF MAIN-PROGRAM");
        if (((CobolString.cobolEquals(String.valueOf(var1), String.valueOf(var2)) && CobolString.cobolEquals(String.valueOf(var1), String.valueOf(var3))) && CobolString.cobolEquals(String.valueOf(var1), String.valueOf(var4)))) {
            CobolDisplay.display("TRUE 1");
        }
        if (((!CobolString.cobolEquals(String.valueOf(var1), String.valueOf(var2)) && !CobolString.cobolEquals(String.valueOf(var1), String.valueOf(var3))) && !CobolString.cobolEquals(String.valueOf(var1), String.valueOf(var4)))) {
            CobolDisplay.display("TRUE 2");
        }
        if (((CobolString.cobolCompare(String.valueOf(var1), String.valueOf(var2)) <= 0 && CobolString.cobolCompare(String.valueOf(var1), String.valueOf(var3)) <= 0) && CobolString.cobolCompare(String.valueOf(var1), String.valueOf(var4)) <= 0)) {
            CobolDisplay.display("TRUE 3");
        }
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("CHECKBOOL", "", "CHECKBOOL.cob");
        CobolProgram.pushActive("CHECKBOOL");
        try {
            CobolProgram.registerCallAlias("CHECKBOOL", "RunFundamental099AbbreviatedConditionsWithMultipleWordsOperato");
            CobolProgram.registerCallAlias("checkbool", "RunFundamental099AbbreviatedConditionsWithMultipleWordsOperato");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            main_program();
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
        new RunFundamental099AbbreviatedConditionsWithMultipleWordsOperato().run();
    }
}
