package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc086JustifiedAndValueClauses extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "PROG";
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
    private CobolString arr_array = new CobolString(840, "RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      "); // Group: ARR-ARRAY
    private CobolString[] arr_entry = new CobolString[6]; // Group: ARR-ENTRY
    private CobolString[] arr_fld1 = new CobolString[6];
    {
        for (int _d0 = 0; _d0 < 6; _d0++) {
            arr_fld1[_d0] = new CobolString(10, "     RIGHT");
        }
    }
    private CobolString[] arr_fld2 = new CobolString[6];
    {
        for (int _d0 = 0; _d0 < 6; _d0++) {
            arr_fld2[_d0] = new CobolString(10, "LEFT      ");
        }
    }
    private CobolString[][] arr_fld3 = new CobolString[6][6]; // Group: ARR-FLD3
    private CobolString[][] arr_fld4 = new CobolString[6][6];
    {
        for (int _d0 = 0; _d0 < 6; _d0++) {
            for (int _d1 = 0; _d1 < 6; _d1++) {
                arr_fld4[_d0][_d1] = new CobolString(10, "     RIGHT");
            }
        }
    }
    private CobolString[][] arr_fld5 = new CobolString[6][6];
    {
        for (int _d0 = 0; _d0 < 6; _d0++) {
            for (int _d1 = 0; _d1 < 6; _d1++) {
                arr_fld5[_d0][_d1] = new CobolString(10, "LEFT      ");
            }
        }
    }
    private short cntr = (short) 0;
    private short cntr2 = (short) 0;
    private CobolString ele = new CobolString(10, "     RIGHT");
    private CobolString ele2 = new CobolString(10, "         R");
    private CobolString ele3 = new CobolString(10, " RRRRRRRRR");
    private CobolString ele4 = new CobolString(10, "RRRRRRRRRR");
    private CobolString ele5 = new CobolString(1003, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        RRR");

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1887);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_arr_array = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 840).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("ARR-ARRAY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_arr_entry = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 840).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("ARR-ENTRY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_arr_fld1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ARR-FLD1").justifiedRight(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_arr_fld2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(10, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ARR-FLD2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_arr_fld3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 120).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("ARR-FLD3").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_arr_fld4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ARR-FLD4").justifiedRight(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_arr_fld5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(30, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ARR-FLD5").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cntr = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(840, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CNTR").picDigits(4).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cntr2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(842, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("CNTR2").picDigits(4).signed(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ele = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(844, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ELE").justifiedRight(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ele2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(854, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ELE2").justifiedRight(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ele3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(864, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ELE3").justifiedRight(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ele4 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(874, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ELE4").justifiedRight(true).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ele5 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(884, 1003).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("ELE5").justifiedRight(true).build();


    private void para_main() {
        _1000_justify_is_right(); // THRU 1000-EXIT
        _1000_exit();
        if (!CobolString.cobolEquals(String.valueOf(ele4), String.valueOf("RRRRRRRRRR"))) {
            CobolDisplay.display("ELE4 NOT INITIALIZED CORRECTLY" + String.valueOf(ele4));
        }
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void _1000_justify_is_right() {
        if (!CobolString.cobolEquals(String.valueOf(ele), String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ELE NOT INITIALIZED CORRECTLY " + String.valueOf(ele));
        }
        if (!CobolString.cobolEquals(String.valueOf(ele2), String.valueOf("         R"))) {
            CobolDisplay.display("ELE2 NOT INITIALIZED CORRECTLY " + String.valueOf(ele2));
        }
        if (!CobolString.cobolEquals(String.valueOf(ele3), String.valueOf(" RRRRRRRRR"))) {
            CobolDisplay.display("ELE3 NOT INITIALIZED CORRECTLY " + String.valueOf(ele3));
        }
        if ((!CobolString.cobolEquals(String.valueOf(CobolString.refMod(ele5, 1, 1000)), String.valueOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ")) || !CobolString.cobolEquals(String.valueOf(CobolString.refMod(ele5, 1001)), String.valueOf("RRR")))) {
            CobolDisplay.display("ELE5 NOT INITIALIZED CORRECTLY " + String.valueOf(ele5));
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld1[2 - 1]), String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD1 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld2[2 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld1[6 - 1]), String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD1 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld2[6 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld4[2 - 1][3 - 1]), String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD4 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld5[2 - 1][3 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld4[6 - 1][6 - 1]), String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD4 (6,6) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld5[6 - 1][6 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (6,6) NOT INITIALIZED CORRECTLY");
        }
        arr_array.set("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        { /* Sync OCCURS children of ARR-ARRAY after group MOVE */
            String _grp = arr_array.get();
            int _grpLen = _grp.length();
            for (int _gi = 0; _gi < 6; _gi++) {
                int _base = 0 + _gi * 140;
                if (_base + 0 < _grpLen) { if (arr_fld1[_gi] == null) arr_fld1[_gi] = new CobolString(10); arr_fld1[_gi].set(_grp.substring(_base + 0, Math.min(_base + 0 + 10, _grpLen))); }
                if (_base + 10 < _grpLen) { if (arr_fld2[_gi] == null) arr_fld2[_gi] = new CobolString(10); arr_fld2[_gi].set(_grp.substring(_base + 10, Math.min(_base + 10 + 10, _grpLen))); }
                for (int _gj = 0; _gj < 6; _gj++) {
                    if (_base + 20 + _gj * 20 + 0 < _grpLen) { if (arr_fld4[_gi][_gj] == null) arr_fld4[_gi][_gj] = new CobolString(10); arr_fld4[_gi][_gj].set(_grp.substring(_base + 20 + _gj * 20 + 0, Math.min(_base + 20 + _gj * 20 + 0 + 10, _grpLen))); }
                }
                for (int _gj = 0; _gj < 6; _gj++) {
                    if (_base + 20 + _gj * 20 + 10 < _grpLen) { if (arr_fld5[_gi][_gj] == null) arr_fld5[_gi][_gj] = new CobolString(10); arr_fld5[_gi][_gj].set(_grp.substring(_base + 20 + _gj * 20 + 10, Math.min(_base + 20 + _gj * 20 + 10 + 10, _grpLen))); }
                }
                { int _gstart = _base; int _gend = Math.min(_base + 140, _grpLen); if (arr_entry[_gi] == null) arr_entry[_gi] = new CobolString(140); arr_entry[_gi].set(_grp.substring(Math.min(_gstart, _grpLen), _gend)); }
            }
        }
        ele.set("XXXXXXXXXX");
        ele.setRight("RIGHT");
        arr_array.setRefMod(1, 840, "RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      ");
        for (int _iv0 = 0; _iv0 < 6; _iv0++) {
            if (arr_fld1[_iv0] == null) arr_fld1[_iv0] = new CobolString(10);
            arr_fld1[_iv0].setRight("RIGHT");
            if (arr_fld2[_iv0] == null) arr_fld2[_iv0] = new CobolString(10);
            arr_fld2[_iv0].set("LEFT");
            for (int _iv1 = 0; _iv1 < 6; _iv1++) {
                if (arr_fld4[_iv0][_iv1] == null) arr_fld4[_iv0][_iv1] = new CobolString(10);
                arr_fld4[_iv0][_iv1].setRight("RIGHT");
                if (arr_fld5[_iv0][_iv1] == null) arr_fld5[_iv0][_iv1] = new CobolString(10);
                arr_fld5[_iv0][_iv1].set("LEFT");
            }
            arr_entry[_iv0] = null;
        }
        if (!CobolString.cobolEquals(String.valueOf(ele), String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ELE NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld1[2 - 1]), String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD1 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld2[2 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld1[6 - 1]), String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD1 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld2[6 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld4[2 - 1][3 - 1]), String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD4 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld5[2 - 1][3 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld4[6 - 1][6 - 1]), String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD4 (6,6) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld5[6 - 1][6 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (6,6) NOT INITIALIZED CORRECTLY");
        }
    }

    private void _1000_exit() {
        return;
    }

    private void _2000_justify_is_off() {
        if (!CobolString.cobolEquals(String.valueOf(ele), String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ELE NOT INITIALIZED CORRECTLY " + String.valueOf(ele));
        }
        if (!CobolString.cobolEquals(String.valueOf(ele2), String.valueOf("R         "))) {
            CobolDisplay.display("ELE2 NOT INITIALIZED CORRECTLY " + String.valueOf(ele2));
        }
        if (!CobolString.cobolEquals(String.valueOf(ele3), String.valueOf("RRRRRRRRR "))) {
            CobolDisplay.display("ELE3 NOT INITIALIZED CORRECTLY " + String.valueOf(ele3));
        }
        if ((!CobolString.cobolEquals(String.valueOf(CobolString.refMod(ele5, 1, 3)), String.valueOf("RRR")) || !CobolString.cobolEquals(String.valueOf(CobolString.refMod(ele5, 4)), String.valueOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ")))) {
            CobolDisplay.display("ELE5 NOT INITIALIZED CORRECTLY " + String.valueOf(ele5));
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld1[2 - 1]), String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD1 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld2[2 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld1[6 - 1]), String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD1 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld2[6 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld4[2 - 1][3 - 1]), String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD4 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld5[2 - 1][3 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld4[6 - 1][6 - 1]), String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD4 (6,6) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld5[6 - 1][6 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (6,6) NOT INITIALIZED CORRECTLY");
        }
        arr_array.set("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        { /* Sync OCCURS children of ARR-ARRAY after group MOVE */
            String _grp = arr_array.get();
            int _grpLen = _grp.length();
            for (int _gi = 0; _gi < 6; _gi++) {
                int _base = 0 + _gi * 140;
                if (_base + 0 < _grpLen) { if (arr_fld1[_gi] == null) arr_fld1[_gi] = new CobolString(10); arr_fld1[_gi].set(_grp.substring(_base + 0, Math.min(_base + 0 + 10, _grpLen))); }
                if (_base + 10 < _grpLen) { if (arr_fld2[_gi] == null) arr_fld2[_gi] = new CobolString(10); arr_fld2[_gi].set(_grp.substring(_base + 10, Math.min(_base + 10 + 10, _grpLen))); }
                for (int _gj = 0; _gj < 6; _gj++) {
                    if (_base + 20 + _gj * 20 + 0 < _grpLen) { if (arr_fld4[_gi][_gj] == null) arr_fld4[_gi][_gj] = new CobolString(10); arr_fld4[_gi][_gj].set(_grp.substring(_base + 20 + _gj * 20 + 0, Math.min(_base + 20 + _gj * 20 + 0 + 10, _grpLen))); }
                }
                for (int _gj = 0; _gj < 6; _gj++) {
                    if (_base + 20 + _gj * 20 + 10 < _grpLen) { if (arr_fld5[_gi][_gj] == null) arr_fld5[_gi][_gj] = new CobolString(10); arr_fld5[_gi][_gj].set(_grp.substring(_base + 20 + _gj * 20 + 10, Math.min(_base + 20 + _gj * 20 + 10 + 10, _grpLen))); }
                }
                { int _gstart = _base; int _gend = Math.min(_base + 140, _grpLen); if (arr_entry[_gi] == null) arr_entry[_gi] = new CobolString(140); arr_entry[_gi].set(_grp.substring(Math.min(_gstart, _grpLen), _gend)); }
            }
        }
        ele.set("XXXXXXXXXX");
        ele.setRight("RIGHT");
        arr_array.setRefMod(1, 840, "RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      RIGHT     LEFT      ");
        for (int _iv2 = 0; _iv2 < 6; _iv2++) {
            if (arr_fld1[_iv2] == null) arr_fld1[_iv2] = new CobolString(10);
            arr_fld1[_iv2].setRight("RIGHT");
            if (arr_fld2[_iv2] == null) arr_fld2[_iv2] = new CobolString(10);
            arr_fld2[_iv2].set("LEFT");
            for (int _iv3 = 0; _iv3 < 6; _iv3++) {
                if (arr_fld4[_iv2][_iv3] == null) arr_fld4[_iv2][_iv3] = new CobolString(10);
                arr_fld4[_iv2][_iv3].setRight("RIGHT");
                if (arr_fld5[_iv2][_iv3] == null) arr_fld5[_iv2][_iv3] = new CobolString(10);
                arr_fld5[_iv2][_iv3].set("LEFT");
            }
            arr_entry[_iv2] = null;
        }
        if (!CobolString.cobolEquals(String.valueOf(ele), String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ELE NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld1[2 - 1]), String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD1 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld2[2 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld1[6 - 1]), String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD1 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld2[6 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld4[2 - 1][3 - 1]), String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD4 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld5[2 - 1][3 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld4[6 - 1][6 - 1]), String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD4 (6,6) NOT INITIALIZED CORRECTLY");
        }
        if (!CobolString.cobolEquals(String.valueOf(arr_fld5[6 - 1][6 - 1]), String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (6,6) NOT INITIALIZED CORRECTLY");
        }
    }

    private void _2000_exit() {
        return;
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("PROG", "", "PROG.cob");
        CobolProgram.pushActive("PROG");
        try {
            CobolProgram.registerCallAlias("PROG", "RunMisc086JustifiedAndValueClauses");
            CobolProgram.registerCallAlias("prog", "RunMisc086JustifiedAndValueClauses");
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
        new RunMisc086JustifiedAndValueClauses().run();
    }
}
