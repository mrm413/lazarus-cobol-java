package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc147ProgramIdCallLiteralVariableWithSpaces extends CobolProgram {
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
    private CobolString myrtn = new CobolString(9, " SUB  ");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(9);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_myrtn = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("MYRTN").build();


    private void para_main() {
        CobolProgram.call(" SUB ", "X");
        myrtn.setRefMod(6, 1, String.valueOf("\u0000"));
        CobolProgram.call(String.valueOf(myrtn), "Y");
        CobolProgram.callNested("SUB", "Z");
        CobolProgram.callNested("S U B", "A");
        myrtn.set(String.valueOf(" S U B"));
        CobolProgram.call(String.valueOf(myrtn), "B");
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc147ProgramIdCallLiteralVariableWithSpaces");
            CobolProgram.registerCallAlias("sub ", "RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub");
            CobolProgram.registerCallAlias("sub", "RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub");
            CobolProgram.registerCallAlias("s u b", "RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub2");
            CobolProgram.registerCallAlias("prog", "RunMisc147ProgramIdCallLiteralVariableWithSpaces");
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
        new RunMisc147ProgramIdCallLiteralVariableWithSpaces().run();
    }
}

class RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "SUB ";
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
    // LINKAGE SECTION
    private CobolString x = new CobolString(1);
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    private void para_main() {
        CobolDisplay.display("SUB GOT " + String.valueOf(x));
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("SUB ", "", "SUB .cob");
        CobolProgram.pushActive("SUB ");
        try {
            CobolProgram.registerCallAlias("SUB ", "RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub");
            CobolProgram.registerCallAlias("sub ", "RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub");
            CobolProgram.registerCallAlias("sub", "RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub");
            CobolProgram.registerCallAlias("s u b", "RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub2");
            CobolProgram.registerCallAlias("prog", "RunMisc147ProgramIdCallLiteralVariableWithSpaces");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
        } finally { CobolProgram.popActive(); }
    }
    public void setLinkageArgs(Object[] args) {
        if (args.length > 0 && args[0] != null) {
            if (args[0] instanceof CobolString) x = (CobolString) args[0]; else x.set(String.valueOf(args[0]));
        }
    }
    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub().run();
    }
}

class RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub2 extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "S U B";
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
    // LINKAGE SECTION
    private CobolString x = new CobolString(1);
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    private void para_main() {
        CobolDisplay.display("S U B  GOT " + String.valueOf(x));
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("S U B", "", "S U B.cob");
        CobolProgram.pushActive("S U B");
        try {
            CobolProgram.registerCallAlias("S U B", "RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub2");
            CobolProgram.registerCallAlias("sub ", "RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub");
            CobolProgram.registerCallAlias("sub", "RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub");
            CobolProgram.registerCallAlias("s u b", "RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub2");
            CobolProgram.registerCallAlias("prog", "RunMisc147ProgramIdCallLiteralVariableWithSpaces");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
        } finally { CobolProgram.popActive(); }
    }
    public void setLinkageArgs(Object[] args) {
        if (args.length > 0 && args[0] != null) {
            if (args[0] instanceof CobolString) x = (CobolString) args[0]; else x.set(String.valueOf(args[0]));
        }
    }
    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new RunMisc147ProgramIdCallLiteralVariableWithSpaces_Sub2().run();
    }
}
