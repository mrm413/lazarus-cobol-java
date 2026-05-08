package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc175RuntimeCheckWriteToInternalStorage2 extends CobolProgram {
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
    private CobolString dummy_storage = new CobolString(128);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(128);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dummy_storage = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 128).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DUMMY-STORAGE").build();


    private void para_main() {
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refMod(dummy_storage, 1, 1)), String.valueOf("                                                                                                                                "))) {
            dummy_storage.set("");
        }
        CobolProgram.callNested("progt");
        CobolProgram.callNested("dummy");
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc175RuntimeCheckWriteToInternalStorage2");
            CobolProgram.registerCallAlias("progt", "RunMisc175RuntimeCheckWriteToInternalStorage2_Progt");
            CobolProgram.registerCallAlias("dummy", "RunMisc175RuntimeCheckWriteToInternalStorage2_Dummy");
            CobolProgram.registerCallAlias("prog", "RunMisc175RuntimeCheckWriteToInternalStorage2");
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
        new RunMisc175RuntimeCheckWriteToInternalStorage2().run();
    }
}

class RunMisc175RuntimeCheckWriteToInternalStorage2_Progt extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "progt";
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
    private final com.lazarus.cobol.CobolExternal.IntRef _ext_pnt = com.lazarus.cobol.CobolExternal.sharedIntRef("PNT");
    private CobolString rec = new CobolString(2); // Group: REC
    private CobolString cb_var = new CobolString(1);
    private CobolString var2 = new CobolString(1);
    // LINKAGE SECTION
    private CobolString lrec = new CobolString(128); // Group: LREC
    private CobolString lvar = new CobolString(64);
    private CobolString lvar2 = new CobolString(64);
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(3);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_pnt = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.POINTER).name("PNT").pointer(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_rec = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("REC").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cb_var = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("VAR").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_var2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("VAR2").build();
    private CobolString address = new CobolString(256); // fallback
    private void para_main() {
        _ext_pnt.value = (int) Math.abs(CobolIntrinsics.toBigDecimal(var2).intValue());
        try {
            CobolProgram.callOrThrow("notthere", _ext_pnt.value);
        } catch (Exception _callEx0) {
            /* CONTINUE */
        }
        address.set(String.valueOf(_ext_pnt.value));
        lrec.set(String.valueOf(" "));
        if (lvar != null) lvar.set(CobolString.refMod(lrec, 1, 64));
        if (lvar2 != null) lvar2.set(CobolString.refMod(lrec, 65, 64));
        CobolProgram.call("broken");
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("progt", "", "progt.cob");
        CobolProgram.pushActive("progt");
        try {
            CobolProgram.registerCallAlias("progt", "RunMisc175RuntimeCheckWriteToInternalStorage2_Progt");
            CobolProgram.registerCallAlias("progt", "RunMisc175RuntimeCheckWriteToInternalStorage2_Progt");
            CobolProgram.registerCallAlias("dummy", "RunMisc175RuntimeCheckWriteToInternalStorage2_Dummy");
            CobolProgram.registerCallAlias("prog", "RunMisc175RuntimeCheckWriteToInternalStorage2");
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
        new RunMisc175RuntimeCheckWriteToInternalStorage2_Progt().run();
    }
}

class RunMisc175RuntimeCheckWriteToInternalStorage2_Dummy extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "dummy";
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
    private CobolString dummy_storage = new CobolString(128);
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(128);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dummy_storage = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 128).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DUMMY-STORAGE").build();
    private void para_main() {
        if (!CobolString.cobolEquals(String.valueOf(CobolString.refMod(dummy_storage, 1, 1)), String.valueOf("                                                                                                                                "))) {
            dummy_storage.set("");
        }
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("dummy", "", "dummy.cob");
        CobolProgram.pushActive("dummy");
        try {
            CobolProgram.registerCallAlias("dummy", "RunMisc175RuntimeCheckWriteToInternalStorage2_Dummy");
            CobolProgram.registerCallAlias("progt", "RunMisc175RuntimeCheckWriteToInternalStorage2_Progt");
            CobolProgram.registerCallAlias("dummy", "RunMisc175RuntimeCheckWriteToInternalStorage2_Dummy");
            CobolProgram.registerCallAlias("prog", "RunMisc175RuntimeCheckWriteToInternalStorage2");
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
        new RunMisc175RuntimeCheckWriteToInternalStorage2_Dummy().run();
    }
}
