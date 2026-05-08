package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions010ComplexOccursDependingOn1 extends CobolProgram {
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
    private int i = 0;
    private CobolString g_1 = new CobolString(9, "123456789"); // Group: G-1
    private CobolString g_2 = new CobolString(3); // Group: G-2
    private CobolString[] x = new CobolString[3];
    {
        for (int _d0 = 0; _d0 < 3; _d0++) {
            x[_d0] = new CobolString(1);
        }
    }
    private CobolString g_3 = new CobolString(6); // Group: G-3
    private CobolString g_4 = new CobolString(3); // Group: G-4
    private CobolString g_5 = new CobolString(3); // Group: G-5

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(10);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_i = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("I").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 9).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G-1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_x = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g_3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G-3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g_4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G-4").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_g_5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(7, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("G-5").build();


    private void para_main() {
        i = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(2), 1));
        String _odo0;
        { /* ODO-slide extract for G-1 */
            String _buf = g_1.get();
            int _len = (1) * i + (1) * i + (1) * i;
            _odo0 = _buf.substring(0, Math.min(_len, _buf.length()));
        }
        String _odo1;
        { /* ODO-slide extract for G-4 from G-1 */
            String _buf = g_1.get();
            int _off = (1) * i + 0;
            int _len = (1) * i;
            _odo1 = _buf.substring(Math.min(_off, _buf.length()), Math.min(_off + _len, _buf.length()));
        }
        String _odo2;
        { /* ODO-slide extract for G-5 from G-1 */
            String _buf = g_1.get();
            int _off = (1) * i + (1) * i;
            int _len = (1) * i;
            _odo2 = _buf.substring(Math.min(_off, _buf.length()), Math.min(_off + _len, _buf.length()));
        }
        CobolDisplay.displayNoAdvancing(_odo0 + ":" + _odo1 + ":" + _odo2);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunExtensions010ComplexOccursDependingOn1");
            CobolProgram.registerCallAlias("prog", "RunExtensions010ComplexOccursDependingOn1");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Initialize OCCURS children of G-1 from group VALUE
            {
                String _gv_g_1 = g_1.get();
                for (int _i = 0; _i < 3; _i++) {
                    int _off = 0 + _i * 1;
                    if (x[_i] == null) x[_i] = new CobolString(1);
                    if (_off + 1 <= _gv_g_1.length()) x[_i].set(_gv_g_1.substring(_off, _off + 1));
                }
                for (int _i = 0; _i < 3; _i++) {
                    int _off = 3 + _i * 1;
                    if (x[_i] == null) x[_i] = new CobolString(1);
                    if (_off + 1 <= _gv_g_1.length()) x[_i].set(_gv_g_1.substring(_off, _off + 1));
                }
                for (int _i = 0; _i < 3; _i++) {
                    int _off = 6 + _i * 1;
                    if (x[_i] == null) x[_i] = new CobolString(1);
                    if (_off + 1 <= _gv_g_1.length()) x[_i].set(_gv_g_1.substring(_off, _off + 1));
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
        new RunExtensions010ComplexOccursDependingOn1().run();
    }
}
