package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc104VolatileClause extends CobolProgram {
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
    private CobolString data_collection = new CobolString(48); // Group: DATA-COLLECTION
    private CobolString data_items_a = new CobolString(8); // Group: DATA-ITEMS-A
    private int data_a1 = 0;
    private int data_a2 = 0;
    private CobolString cb_volatile = new CobolString(4); // Group: VOLATILE
    private int data_filler = 0;
    private CobolString data_items_b = new CobolString(18); // Group: DATA-ITEMS-B
    private int data_b1 = 0;
    private int data_b2 = 0;
    private CobolString data_items_c = new CobolString(18); // Group: DATA-ITEMS-C
    private int data_c1 = 0;
    private int data_c2 = 0;
    private final com.lazarus.cobol.CobolExternal.IntRef _ext_step = com.lazarus.cobol.CobolExternal.sharedIntRef("STEP");

    // LINKAGE SECTION
    private CobolString xmyrec = new CobolString(2); // Group: XMYREC
    private int xfld1 = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(52);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_collection = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 48).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DATA-COLLECTION").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_items_a = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DATA-ITEMS-A").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_a1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("DATA-A1").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_a2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("DATA-A2").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cb_volatile = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("VOLATILE").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_filler = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("DATA-FILLER").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_items_b = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DATA-ITEMS-B").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_b1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("DATA-B1").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_b2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(21, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("DATA-B2").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_items_c = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DATA-ITEMS-C").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_c1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("DATA-C1").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_c2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(39, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("DATA-C2").picDigits(9).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_step = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(48, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("STEP").picDigits(8).build();


    private void para_main() {
        { /* Build group DATA-ITEMS-B from children before group access */
            String _gbuf = data_items_b.get();
            StringBuilder _sb = new StringBuilder(18);
            _sb.append(CobolDisplay.formatPic(data_b1, 9, 0, false));
            _sb.append(CobolDisplay.formatPic(data_b2, 9, 0, false));
            data_items_b.set(_sb.toString());
        }
        data_items_c.set(String.valueOf(data_items_b));
        try { data_c1 = Integer.parseInt(CobolString.refMod(data_items_c, 1, 9).trim()); } catch (Exception _ge) {}
        try { data_c2 = Integer.parseInt(CobolString.refMod(data_items_c, 10, 9).trim()); } catch (Exception _ge) {}
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynMisc104VolatileClause");
            CobolProgram.registerCallAlias("prog", "SynMisc104VolatileClause");
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
        new SynMisc104VolatileClause().run();
    }
}
