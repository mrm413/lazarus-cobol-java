package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc153OccursIndexedAscending extends CobolProgram {
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
    private int rec_name_idx = 1;
    private int rec_name_dbx = 1;
    // WORKING-STORAGE SECTION
    private CobolString dbi_record_namest = new CobolString(245, "A-F-GEN-LEDGER-ACM            0315 A-F-GEN-LEDGER-MGL            0303 A-F-GEN-LEDGER-ZBL            0304 A-F-GEN-LEDGER-ZCC            0308 A-F-GEN-LEDGER-ZGL            0305 A-F-GEN-LEDGER-ZOO            0306 A-F-GEN-LEDGER-ZTR            0307 "); // Group: DBI-RECORD-NAMEST
    private CobolString filler_1 = new CobolString(35, "A-F-GEN-LEDGER-ACM            0315 ");
    private CobolString filler_2 = new CobolString(35, "A-F-GEN-LEDGER-MGL            0303 ");
    private CobolString filler_3 = new CobolString(35, "A-F-GEN-LEDGER-ZBL            0304 ");
    private CobolString filler_4 = new CobolString(35, "A-F-GEN-LEDGER-ZCC            0308 ");
    private CobolString filler_5 = new CobolString(35, "A-F-GEN-LEDGER-ZGL            0305 ");
    private CobolString filler_6 = new CobolString(35, "A-F-GEN-LEDGER-ZOO            0306 ");
    private CobolString filler_7 = new CobolString(35, "A-F-GEN-LEDGER-ZTR            0307 ");
    private CobolString dbi_record_namesr = dbi_record_namest; // Group REDEFINES: DBI-RECORD-NAMESR
    private CobolString[] dbi_record_names = new CobolString[7]; // Group: DBI-RECORD-NAMES
    private CobolString[] dbi_record_name = new CobolString[7];
    {
        for (int _d0 = 0; _d0 < 7; _d0++) {
            dbi_record_name[_d0] = new CobolString(30);
        }
    }
    private int[] dbi_record_code = new int[7];
    private CobolString[] dbi_record_dir = new CobolString[7];
    {
        for (int _d0 = 0; _d0 < 7; _d0++) {
            dbi_record_dir[_d0] = new CobolString(1);
        }
    }
    private CobolString rec_name = new CobolString(30);
    private CobolString dbx_record_namest = new CobolString(245, "A-F-GEN-LEDGER-ACM            0315 A-F-GEN-LEDGER-MGL            0303 A-F-GEN-LEDGER-ZBL            0304 A-F-GEN-LEDGER-ZCC            0308 A-F-GEN-LEDGER-ZGL            0305 A-F-GEN-LEDGER-ZOO            0306 A-F-GEN-LEDGER-ZTR            0307 "); // Group: DBX-RECORD-NAMEST
    private CobolString filler_8 = new CobolString(35, "A-F-GEN-LEDGER-ACM            0315 ");
    private CobolString filler_9 = new CobolString(35, "A-F-GEN-LEDGER-MGL            0303 ");
    private CobolString filler_10 = new CobolString(35, "A-F-GEN-LEDGER-ZBL            0304 ");
    private CobolString filler_11 = new CobolString(35, "A-F-GEN-LEDGER-ZCC            0308 ");
    private CobolString filler_12 = new CobolString(35, "A-F-GEN-LEDGER-ZGL            0305 ");
    private CobolString filler_13 = new CobolString(35, "A-F-GEN-LEDGER-ZOO            0306 ");
    private CobolString filler_14 = new CobolString(35, "A-F-GEN-LEDGER-ZTR            0307 ");
    private CobolString dbx_record_namesr = dbx_record_namest; // Group REDEFINES: DBX-RECORD-NAMESR
    private CobolString[] dbx_record_names = new CobolString[7]; // Group: DBX-RECORD-NAMES
    private CobolString[] dbx_record_name = new CobolString[7];
    {
        for (int _d0 = 0; _d0 < 7; _d0++) {
            dbx_record_name[_d0] = new CobolString(30);
        }
    }
    private int[] dbx_record_code = new int[7];
    private CobolString[] dbx_record_dir = new CobolString[7];
    {
        for (int _d0 = 0; _d0 < 7; _d0++) {
            dbx_record_dir[_d0] = new CobolString(1);
        }
    }

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1010);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbi_record_namest = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 245).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DBI-RECORD-NAMEST").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_15 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 245).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_16 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_17 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(35, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_18 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(70, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_19 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(105, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_20 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(140, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_21 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(175, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_22 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(210, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbi_record_namesr = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(245, 245).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DBI-RECORD-NAMESR").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbi_record_names = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(245, 245).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DBI-RECORD-NAMES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbi_record_name = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(245, 30).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DBI-RECORD-NAME").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbi_record_code = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(275, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("DBI-RECORD-CODE").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbi_record_dir = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(279, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DBI-RECORD-DIR").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_rec_name = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(490, 30).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("REC-NAME").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbx_record_namest = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(520, 245).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DBX-RECORD-NAMEST").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_23 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(520, 245).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_24 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(520, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_25 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(555, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_26 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(590, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_27 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(625, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_28 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(660, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_29 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(695, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_30 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(730, 35).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbx_record_namesr = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(765, 245).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DBX-RECORD-NAMESR").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbx_record_names = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(765, 245).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DBX-RECORD-NAMES").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbx_record_name = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(765, 30).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DBX-RECORD-NAME").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbx_record_code = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(795, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("DBX-RECORD-CODE").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_dbx_record_dir = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(799, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DBX-RECORD-DIR").build();


    private void para_main() {
        rec_name_idx = (int) Math.abs(CobolIntrinsics.toBigDecimal(1).intValue());
        rec_name.set(String.valueOf("A-F-GEN-LEDGER-ZGL"));
        findit();
        rec_name.set(String.valueOf("JUNK"));
        findit();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void findit() {
        /* SEARCH DBI-RECORD-NAMES */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < dbi_record_names.length && !_found; _idx++) {
                rec_name_idx = _idx + 1;
                if (CobolString.cobolEquals(String.valueOf(rec_name), String.valueOf(CobolString.safeIndex(dbi_record_name, rec_name_idx, 30)))) {
                    CobolDisplay.display("A " + String.valueOf(rec_name) + " is code " + CobolDisplay.formatPic(dbi_record_code[rec_name_idx - 1], 4, 0, false) + ".");
                    _found = true;
                }
            }
            if (!_found) {
                CobolDisplay.display("A " + String.valueOf(rec_name) + " is invalid.");
            }
        }
        /* SEARCH DBX-RECORD-NAMES */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < dbx_record_names.length && !_found; _idx++) {
                rec_name_dbx = _idx + 1;
                if (CobolString.cobolEquals(String.valueOf(rec_name), String.valueOf(CobolString.safeIndex(dbx_record_name, rec_name_dbx, 30)))) {
                    CobolDisplay.display("B " + String.valueOf(rec_name) + " is code " + CobolDisplay.formatPic(dbx_record_code[rec_name_dbx - 1], 4, 0, false) + ".");
                    _found = true;
                }
            }
            if (!_found) {
                CobolDisplay.display("B " + String.valueOf(rec_name) + " is invalid.");
            }
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc153OccursIndexedAscending");
            CobolProgram.registerCallAlias("prog", "RunMisc153OccursIndexedAscending");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            // Initialize REDEFINES OCCURS children from DBI-RECORD-NAMEST
            {
                String _redef_dbi_record_namesr = dbi_record_namest.get();
                for (int _i = 0; _i < 7; _i++) {
                    int _off = _i * 35 + 0;
                    if (dbi_record_name[_i] == null) dbi_record_name[_i] = new CobolString(30);
                    if (_off + 30 <= _redef_dbi_record_namesr.length()) dbi_record_name[_i].set(_redef_dbi_record_namesr.substring(_off, _off + 30));
                }
                for (int _i = 0; _i < 7; _i++) {
                    int _off = _i * 35 + 30;
                    if (_off + 4 <= _redef_dbi_record_namesr.length()) { try { dbi_record_code[_i] = Integer.parseInt(_redef_dbi_record_namesr.substring(_off, _off + 4).trim()); } catch (Exception _e) { dbi_record_code[_i] = 0; } }
                }
                for (int _i = 0; _i < 7; _i++) {
                    int _off = _i * 35 + 34;
                    if (dbi_record_dir[_i] == null) dbi_record_dir[_i] = new CobolString(1);
                    if (_off + 1 <= _redef_dbi_record_namesr.length()) dbi_record_dir[_i].set(_redef_dbi_record_namesr.substring(_off, _off + 1));
                }
            }
            // Initialize REDEFINES OCCURS children from DBX-RECORD-NAMEST
            {
                String _redef_dbx_record_namesr = dbx_record_namest.get();
                for (int _i = 0; _i < 7; _i++) {
                    int _off = _i * 35 + 0;
                    if (dbx_record_name[_i] == null) dbx_record_name[_i] = new CobolString(30);
                    if (_off + 30 <= _redef_dbx_record_namesr.length()) dbx_record_name[_i].set(_redef_dbx_record_namesr.substring(_off, _off + 30));
                }
                for (int _i = 0; _i < 7; _i++) {
                    int _off = _i * 35 + 30;
                    if (_off + 4 <= _redef_dbx_record_namesr.length()) { try { dbx_record_code[_i] = Integer.parseInt(_redef_dbx_record_namesr.substring(_off, _off + 4).trim()); } catch (Exception _e) { dbx_record_code[_i] = 0; } }
                }
                for (int _i = 0; _i < 7; _i++) {
                    int _off = _i * 35 + 34;
                    if (dbx_record_dir[_i] == null) dbx_record_dir[_i] = new CobolString(1);
                    if (_off + 1 <= _redef_dbx_record_namesr.length()) dbx_record_dir[_i].set(_redef_dbx_record_namesr.substring(_off, _off + 1));
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
        new RunMisc153OccursIndexedAscending().run();
    }
}
