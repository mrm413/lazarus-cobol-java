package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunSubscripts005SubscriptByArithmeticExpression extends CobolProgram {
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
    private CobolString g = new CobolString(4, "1234"); // Group: G
    private CobolString[] x = new CobolString[4];
    {
        for (int _d0 = 0; _d0 < 4; _d0++) {
            x[_d0] = new CobolString(1);
        }
    }
    private CobolString z = new CobolString(1);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(5);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_z = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("Z").build();


    private void para_main() {
        z.set(String.valueOf(CobolString.safeIndex(x, CobolIntrinsics.toBigDecimal(((3 + 1))).divide(CobolIntrinsics.toBigDecimal(2), 40, RoundingMode.HALF_UP).intValue(), 1, g, 0)));
        if (!CobolString.cobolEquals(String.valueOf(z), String.valueOf("2"))) {
            CobolDisplay.display(String.valueOf(z));
        }
        z.set(String.valueOf(CobolString.safeIndex(x, (int)(Math.pow(2, 2)), 1, g, 0)));
        if (!CobolString.cobolEquals(String.valueOf(z), String.valueOf("4"))) {
            CobolDisplay.display(String.valueOf(z));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunSubscripts005SubscriptByArithmeticExpression");
            CobolProgram.registerCallAlias("prog", "RunSubscripts005SubscriptByArithmeticExpression");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Initialize OCCURS children of G from group VALUE
            {
                String _gv_g = g.get();
                for (int _i = 0; _i < 4; _i++) {
                    int _off = 0 + _i * 1;
                    if (x[_i] == null) x[_i] = new CobolString(1);
                    if (_off + 1 <= _gv_g.length()) x[_i].set(_gv_g.substring(_off, _off + 1));
                }
            }
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
        new RunSubscripts005SubscriptByArithmeticExpression().run();
    }
}
