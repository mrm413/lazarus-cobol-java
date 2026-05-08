package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.CobolTableSort;
import com.lazarus.cobol.FileStatus;
import com.lazarus.cobol.jcl.batch.DfsortProgram;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile102SortWithInputOutputProcedures extends CobolProgram {
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
    private int ix_1 = 1;
    private DfsortProgram _sort;
    // WORKING-STORAGE SECTION
    private int w_eof = 0;
    private CobolString _1_values = new CobolString(364, "0001A--------A0002B--------B0003C--------C0004D--------D0005E--------E0006F--------F0007G--------G0008H--------H0009I--------I0010J--------J0011K--------K0012L--------L0013M--------M0014N--------N0015O--------O0016P--------P0017Q--------Q0018R--------R0019S--------S0020T--------T0021U--------U0022V--------V0023W--------W0024X--------X0025Y--------Y0026Z--------Z"); // Group: 1-values
    private CobolString filler_1 = new CobolString(14, "0001A--------A");
    private CobolString filler_2 = new CobolString(14, "0002B--------B");
    private CobolString filler_3 = new CobolString(14, "0003C--------C");
    private CobolString filler_4 = new CobolString(14, "0004D--------D");
    private CobolString filler_5 = new CobolString(14, "0005E--------E");
    private CobolString filler_6 = new CobolString(14, "0006F--------F");
    private CobolString filler_7 = new CobolString(14, "0007G--------G");
    private CobolString filler_8 = new CobolString(14, "0008H--------H");
    private CobolString filler_9 = new CobolString(14, "0009I--------I");
    private CobolString filler_10 = new CobolString(14, "0010J--------J");
    private CobolString filler_11 = new CobolString(14, "0011K--------K");
    private CobolString filler_12 = new CobolString(14, "0012L--------L");
    private CobolString filler_13 = new CobolString(14, "0013M--------M");
    private CobolString filler_14 = new CobolString(14, "0014N--------N");
    private CobolString filler_15 = new CobolString(14, "0015O--------O");
    private CobolString filler_16 = new CobolString(14, "0016P--------P");
    private CobolString filler_17 = new CobolString(14, "0017Q--------Q");
    private CobolString filler_18 = new CobolString(14, "0018R--------R");
    private CobolString filler_19 = new CobolString(14, "0019S--------S");
    private CobolString filler_20 = new CobolString(14, "0020T--------T");
    private CobolString filler_21 = new CobolString(14, "0021U--------U");
    private CobolString filler_22 = new CobolString(14, "0022V--------V");
    private CobolString filler_23 = new CobolString(14, "0023W--------W");
    private CobolString filler_24 = new CobolString(14, "0024X--------X");
    private CobolString filler_25 = new CobolString(14, "0025Y--------Y");
    private CobolString filler_26 = new CobolString(14, "0026Z--------Z");
    private CobolString[] _1_record = new CobolString[26]; // Group: 1-record
    private int[] _1_key = new int[26];
    private CobolString[] _1_data = new CobolString[26];
    {
        for (int _d0 = 0; _d0 < 26; _d0++) {
            _1_data[_d0] = new CobolString(10);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(729);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_w_eof = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("w-eof").picDigits(1).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd__1_values = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 364).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("1-values").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_27 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_28 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(15, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_29 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(29, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_30 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(43, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_31 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(57, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_32 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(71, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_33 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(85, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_34 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(99, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_35 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(113, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_36 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(127, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_37 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(141, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_38 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(155, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_39 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(169, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_40 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(183, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_41 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(197, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_42 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(211, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_43 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(225, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_44 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(239, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_45 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(253, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_46 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(267, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_47 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(281, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_48 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(295, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_49 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(309, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_50 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(323, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_51 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(337, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_52 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(351, 14).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_53 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(365, 364).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd__1_record = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(365, 364).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("1-record").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd__1_key = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(365, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("1-key").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd__1_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(369, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("1-data").build();

    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("FILE1", "SEQUENTIAL", "SEQUENTIAL", "FILE1");

    private CobolString file1_rec = new CobolString(256); // fallback

    private void a01_main() {
        _sort = new DfsortProgram(); /* SORT file1 (file1) */
        {
            _sort.setSortKeys(new String[]{"FILE1-KEY:A"});
            /* INPUT PROCEDURE a02-release-to-sort — records added via RELEASE */
            _sort.beginInputPhase();
            a02_release_to_sort();
            _sort.endInputPhase();
            _sort.execute();
            /* OUTPUT PROCEDURE a03-return-from-sort — records retrieved via RETURN */
            _sort.beginOutputPhase();
            a03_return_from_sort();
            _sort.endOutputPhase();
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void a02_release_to_sort() {
        for (ix_1 = 1; !(ix_1 > 26); ix_1 += 2) {
            _sort.releaseRecord(String.valueOf(String.valueOf(CobolString.safeIndex(_1_record, ix_1, 14))));
        }
        for (ix_1 = 2; !(ix_1 > 26); ix_1 += 2) {
            _sort.releaseRecord(String.valueOf(String.valueOf(CobolString.safeIndex(_1_record, ix_1, 14))));
        }
    }

    private void a03_return_from_sort() {
        for (ix_1 = 1; !((ix_1 > 26 || w_eof == 1)); ix_1 += 1) {
            {
                String _rec = _sort.returnRecord();
                if (_rec == null) {
                    w_eof = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 1));
                }
            }
            if (!CobolString.cobolEquals(String.valueOf(file1_rec), String.valueOf(CobolString.safeIndex(_1_record, ix_1, 14)))) {
                w_eof = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(1), 1));
            }
        }
        if (w_eof == 1) {
            CobolDisplay.display("FAILED: unexpected eof");
        } else {
            {
                String _rec = _sort.returnRecord();
                if (_rec == null) {
                    /* CONTINUE */
                }
                if (_rec != null) {
                    CobolDisplay.display("FAILED: expected eof");
                }
            }
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile102SortWithInputOutputProcedures");
            CobolProgram.registerCallAlias("prog", "RunFile102SortWithInputOutputProcedures");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Initialize REDEFINES OCCURS children from 1-values
            {
                String _redef_filler_54 = _1_values.get();
                for (int _i = 0; _i < 26; _i++) {
                    int _off = _i * 14 + 0;
                    if (_off + 4 <= _redef_filler_54.length()) { try { _1_key[_i] = Integer.parseInt(_redef_filler_54.substring(_off, _off + 4).trim()); } catch (Exception _e) { _1_key[_i] = 0; } }
                }
                for (int _i = 0; _i < 26; _i++) {
                    int _off = _i * 14 + 4;
                    if (_1_data[_i] == null) _1_data[_i] = new CobolString(10);
                    if (_off + 10 <= _redef_filler_54.length()) _1_data[_i].set(_redef_filler_54.substring(_off, _off + 10));
                }
            }
            a01_main();
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
        new RunFile102SortWithInputOutputProcedures().run();
    }
}
