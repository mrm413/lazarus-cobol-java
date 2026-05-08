package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFundamental032CallProgramPointer extends CobolProgram {
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
    private String prog_ptr = null;
    private int num = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(2);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_prog_ptr = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.POINTER).name("prog-ptr").pointer(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_num = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("num").picDigits(1).build();


    private void para_main() {
        prog_ptr = "RunFundamental032CallProgramPointer_RecursionTest";
        CobolProgram.call(prog_ptr, num);
        CobolDisplay.display("<");
        prog_ptr = "RunFundamental032CallProgramPointer_CancelTest";
        CobolProgram.call(prog_ptr);
        CobolProgram.call(prog_ptr);
        CobolProgram.cancel("cancel-test");
        prog_ptr = "RunFundamental032CallProgramPointer_CancelTest";
        CobolProgram.call(prog_ptr);
        CobolDisplay.display("<");
        prog_ptr = "RunFundamental032CallProgramPointer_DummyCall";
        CobolProgram.call(prog_ptr);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFundamental032CallProgramPointer");
            CobolProgram.registerCallAlias("recursion-test", "RunFundamental032CallProgramPointer_RecursionTest");
            CobolProgram.registerCallAlias("cancel-test", "RunFundamental032CallProgramPointer_CancelTest");
            CobolProgram.registerCallAlias("dummy-call", "RunFundamental032CallProgramPointer_DummyCall");
            CobolProgram.registerCallAlias("prog", "RunFundamental032CallProgramPointer");
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
        new RunFundamental032CallProgramPointer().run();
    }
}

class RunFundamental032CallProgramPointer_RecursionTest extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "recursion-test";
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
    private int x = 0;
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    private void para_main() {
        x = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(x).add(CobolIntrinsics.toBigDecimal(1))), 1));
        CobolDisplay.displayNoAdvancing(CobolDisplay.formatPic(x, 1, 0, false));
        if (x == 1) {
            CobolProgram.callNested("recursion-test", x);
        }
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("recursion-test", "", "recursion-test.cob");
        CobolProgram.pushActive("recursion-test");
        try {
            CobolProgram.registerCallAlias("recursion-test", "RunFundamental032CallProgramPointer_RecursionTest");
            CobolProgram.registerCallAlias("recursion-test", "RunFundamental032CallProgramPointer_RecursionTest");
            CobolProgram.registerCallAlias("cancel-test", "RunFundamental032CallProgramPointer_CancelTest");
            CobolProgram.registerCallAlias("dummy-call", "RunFundamental032CallProgramPointer_DummyCall");
            CobolProgram.registerCallAlias("prog", "RunFundamental032CallProgramPointer");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            para_main();
        } finally { CobolProgram.popActive(); }
    }
    public void setLinkageArgs(Object[] args) {
        if (args.length > 0 && args[0] != null) {
            x = CobolIntrinsics.toBigDecimal(args[0]).intValue();
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
        new RunFundamental032CallProgramPointer_RecursionTest().run();
    }
}

class RunFundamental032CallProgramPointer_CancelTest extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "cancel-test";
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
    private String self_ptr = null;
    private int x = 1;
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(2);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_self_ptr = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.POINTER).name("self-ptr").pointer(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("x").picDigits(1).build();
    private void para_main() {
        self_ptr = "RunFundamental032CallProgramPointer_CancelTest";
        if (self_ptr == null) {
            System.err.println("self-address not set");
        }
        CobolDisplay.displayNoAdvancing(CobolDisplay.formatPic(x, 1, 0, false));
        x = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(x).add(CobolIntrinsics.toBigDecimal(1))), 1));
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("cancel-test", "", "cancel-test.cob");
        CobolProgram.pushActive("cancel-test");
        try {
            CobolProgram.registerCallAlias("cancel-test", "RunFundamental032CallProgramPointer_CancelTest");
            CobolProgram.registerCallAlias("recursion-test", "RunFundamental032CallProgramPointer_RecursionTest");
            CobolProgram.registerCallAlias("cancel-test", "RunFundamental032CallProgramPointer_CancelTest");
            CobolProgram.registerCallAlias("dummy-call", "RunFundamental032CallProgramPointer_DummyCall");
            CobolProgram.registerCallAlias("prog", "RunFundamental032CallProgramPointer");
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
        new RunFundamental032CallProgramPointer_CancelTest().run();
    }
}

class RunFundamental032CallProgramPointer_DummyCall extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "dummy-call";
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
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);
    private void para_main() {
        /* CONTINUE */
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("dummy-call", "", "dummy-call.cob");
        CobolProgram.pushActive("dummy-call");
        try {
            CobolProgram.registerCallAlias("dummy-call", "RunFundamental032CallProgramPointer_DummyCall");
            CobolProgram.registerCallAlias("recursion-test", "RunFundamental032CallProgramPointer_RecursionTest");
            CobolProgram.registerCallAlias("cancel-test", "RunFundamental032CallProgramPointer_CancelTest");
            CobolProgram.registerCallAlias("dummy-call", "RunFundamental032CallProgramPointer_DummyCall");
            CobolProgram.registerCallAlias("prog", "RunFundamental032CallProgramPointer");
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
        new RunFundamental032CallProgramPointer_DummyCall().run();
    }
}
