package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynOccurs000OccursWithLevel01And77 extends CobolProgram {
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
    private CobolString[] x_01 = new CobolString[10];
    private CobolString[] g = new CobolString[10]; // Group: G
    private CobolString[][] x_02 = new CobolString[10][10];
    {
        for (int _d0 = 0; _d0 < 10; _d0++) {
            for (int _d1 = 0; _d1 < 10; _d1++) {
                x_02[_d0][_d1] = new CobolString(1);
            }
        }
    }
    private CobolString g2 = new CobolString(10); // Group: G2
    private CobolString[] x2_02 = new CobolString[10];
    {
        for (int _d0 = 0; _d0 < 10; _d0++) {
            x2_02[_d0] = new CobolString(1);
        }
    }
    private CobolString[] x_77 = new CobolString[10];
    {
        for (int _d0 = 0; _d0 < 10; _d0++) {
            x_77[_d0] = new CobolString(1);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(130);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_01 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X-01").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 100).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_02 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X-02").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(110, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x2_02 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(110, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X2-02").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x_77 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(120, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X-77").build();


    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "SynOccurs000OccursWithLevel01And77");
            CobolProgram.registerCallAlias("prog", "SynOccurs000OccursWithLevel01And77");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
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
        new SynOccurs000OccursWithLevel01And77().run();
    }
}
