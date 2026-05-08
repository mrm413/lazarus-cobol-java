package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile074IndexedUndeclaredKeys extends CobolProgram {
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
    private int ix = 0;

    // FILE SECTION — file1
    private CobolString file1_rec = new CobolString(12); // Group: file1-rec
    private int file1_key1 = 0;
    private int file1_key2 = 0;
    private int file1_key3 = 0;
    private int file1_data = 0;

    // FILE SECTION — file2
    private CobolString file2_rec = new CobolString(12); // Group: file2-rec
    private int file2_key1 = 0;
    private int file2_key2 = 0;
    private int file2_key3 = 0;
    private int file2_data = 0;

    // FILE SECTION — file3
    private CobolString file3_rec = new CobolString(12); // Group: file3-rec
    private int file3_key1 = 0;
    private int file3_key2 = 0;
    private int file3_key3 = 0;
    private int file3_data = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(6);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_ix = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("ix").picDigits(6).build();

    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("./fileX", "INDEXED", "RANDOM", "FILE1");
    {
        file1.registerIndexedPrimaryKey("FILE1-KEY1", 0, 3);
        file1.registerIndexedAltKey("FILE1-KEY2", 3, 3, false);
        file1.registerIndexedAltKey("FILE1-KEY3", 6, 3, false);
    }
    private CobolFile file2 = new CobolFile("./fileX", "INDEXED", "RANDOM", "FILE2");
    {
        file2.registerIndexedPrimaryKey("FILE2-KEY1", 0, 3);
        file2.registerIndexedAltKey("FILE2-KEY2", 3, 3, false);
    }
    private CobolFile file3 = new CobolFile("./fileX", "INDEXED", "RANDOM", "FILE3");
    {
        file3.registerIndexedPrimaryKey("FILE3-KEY1", 0, 3);
    }


    private void para_main() {
        file1.open("OUTPUT");
        for (ix = 1; !(ix > 10); ix += 1) {
            file1_key1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(ix), 3));
            file1_data = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(ix), 3));
            file1_key2 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(100 + ix), 3));
            file1_key3 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(200 + ix), 3));
            file1_rec.setRefMod(1, 3, CobolDisplay.formatPic(file1_key1, 3, 0, false));
            file1_rec.setRefMod(4, 3, CobolDisplay.formatPic(file1_key2, 3, 0, false));
            file1_rec.setRefMod(7, 3, CobolDisplay.formatPic(file1_key3, 3, 0, false));
            file1_rec.setRefMod(10, 3, CobolDisplay.formatPic(file1_data, 3, 0, false));
            file1.write(file1_rec);
        }
        file1.close();
        file1.open("INPUT");
        for (ix = 1; !(ix > 10); ix += 1) {
            file1_key1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(ix), 3));
            { /* Build group file1-rec from children before group access */
                String _gbuf = file1_rec.get();
                StringBuilder _sb = new StringBuilder(12);
                _sb.append(CobolDisplay.formatPic(file1_key1, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file1_key2, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file1_key3, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file1_data, 3, 0, false));
                file1_rec.set(_sb.toString());
            }
            file1.setReadKeyByName("FILE1-KEY1", file1_rec);
            file1.read(file1_rec);
            try { file1_key1 = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file1_key2 = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file1_key3 = Integer.parseInt(CobolString.refMod(file1_rec, 7, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 10, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            if (file1_data != ix) {
                CobolDisplay.display("FAILED 1-1");
            }
        }
        for (ix = 1; !(ix > 10); ix += 1) {
            file1_key2 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(100 + ix), 3));
            { /* Build group file1-rec from children before group access */
                String _gbuf = file1_rec.get();
                StringBuilder _sb = new StringBuilder(12);
                _sb.append(CobolDisplay.formatPic(file1_key1, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file1_key2, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file1_key3, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file1_data, 3, 0, false));
                file1_rec.set(_sb.toString());
            }
            file1.setReadKeyByName("FILE1-KEY2", file1_rec);
            file1.read(file1_rec);
            try { file1_key1 = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file1_key2 = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file1_key3 = Integer.parseInt(CobolString.refMod(file1_rec, 7, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 10, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            if (file1_data != ix) {
                CobolDisplay.display("FAILED 1-2");
            }
        }
        for (ix = 1; !(ix > 10); ix += 1) {
            file1_key3 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(200 + ix), 3));
            { /* Build group file1-rec from children before group access */
                String _gbuf = file1_rec.get();
                StringBuilder _sb = new StringBuilder(12);
                _sb.append(CobolDisplay.formatPic(file1_key1, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file1_key2, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file1_key3, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file1_data, 3, 0, false));
                file1_rec.set(_sb.toString());
            }
            file1.setReadKeyByName("FILE1-KEY3", file1_rec);
            file1.read(file1_rec);
            try { file1_key1 = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file1_key2 = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file1_key3 = Integer.parseInt(CobolString.refMod(file1_rec, 7, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 10, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            if (file1_data != ix) {
                CobolDisplay.display("FAILED 1-3");
            }
        }
        file1.close();
        file2.open("INPUT");
        for (ix = 1; !(ix > 10); ix += 1) {
            file2_key1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(ix), 3));
            { /* Build group file2-rec from children before group access */
                String _gbuf = file2_rec.get();
                StringBuilder _sb = new StringBuilder(12);
                _sb.append(CobolDisplay.formatPic(file2_key1, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file2_key2, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file2_key3, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file2_data, 3, 0, false));
                file2_rec.set(_sb.toString());
            }
            file2.setReadKeyByName("FILE2-KEY1", file2_rec);
            file2.read(file2_rec);
            try { file2_key1 = Integer.parseInt(CobolString.refMod(file2_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file2_key2 = Integer.parseInt(CobolString.refMod(file2_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file2_key3 = Integer.parseInt(CobolString.refMod(file2_rec, 7, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file2_data = Integer.parseInt(CobolString.refMod(file2_rec, 10, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            if (file2_data != ix) {
                CobolDisplay.display("FAILED 2-1");
            }
        }
        for (ix = 1; !(ix > 10); ix += 1) {
            file2_key2 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(100 + ix), 3));
            { /* Build group file2-rec from children before group access */
                String _gbuf = file2_rec.get();
                StringBuilder _sb = new StringBuilder(12);
                _sb.append(CobolDisplay.formatPic(file2_key1, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file2_key2, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file2_key3, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file2_data, 3, 0, false));
                file2_rec.set(_sb.toString());
            }
            file2.setReadKeyByName("FILE2-KEY2", file2_rec);
            file2.read(file2_rec);
            try { file2_key1 = Integer.parseInt(CobolString.refMod(file2_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file2_key2 = Integer.parseInt(CobolString.refMod(file2_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file2_key3 = Integer.parseInt(CobolString.refMod(file2_rec, 7, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file2_data = Integer.parseInt(CobolString.refMod(file2_rec, 10, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            if (file2_data != ix) {
                CobolDisplay.display("FAILED 2-2");
            }
        }
        file2.close();
        file3.open("INPUT");
        for (ix = 1; !(ix > 10); ix += 1) {
            file3_key1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(ix), 3));
            { /* Build group file3-rec from children before group access */
                String _gbuf = file3_rec.get();
                StringBuilder _sb = new StringBuilder(12);
                _sb.append(CobolDisplay.formatPic(file3_key1, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file3_key2, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file3_key3, 3, 0, false));
                _sb.append(CobolDisplay.formatPic(file3_data, 3, 0, false));
                file3_rec.set(_sb.toString());
            }
            file3.setReadKeyByName("FILE3-KEY1", file3_rec);
            file3.read(file3_rec);
            try { file3_key1 = Integer.parseInt(CobolString.refMod(file3_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file3_key2 = Integer.parseInt(CobolString.refMod(file3_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file3_key3 = Integer.parseInt(CobolString.refMod(file3_rec, 7, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            try { file3_data = Integer.parseInt(CobolString.refMod(file3_rec, 10, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
            if (file3_data != ix) {
                CobolDisplay.display("FAILED 3-1");
            }
        }
        file3.close();
        file3.open("I-O");
        ix = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(20), 6));
        file3_key1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(ix), 3));
        file3_data = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(ix), 3));
        file3_key2 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(100 + ix), 3));
        file3_key3 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(200 + ix), 3));
        file3_rec.setRefMod(1, 3, CobolDisplay.formatPic(file3_key1, 3, 0, false));
        file3_rec.setRefMod(4, 3, CobolDisplay.formatPic(file3_key2, 3, 0, false));
        file3_rec.setRefMod(7, 3, CobolDisplay.formatPic(file3_key3, 3, 0, false));
        file3_rec.setRefMod(10, 3, CobolDisplay.formatPic(file3_data, 3, 0, false));
        file3.write(file3_rec);
        file3.close();
        file1.open("INPUT");
        file1_key1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(10), 3));
        { /* Build group file1-rec from children before group access */
            String _gbuf = file1_rec.get();
            StringBuilder _sb = new StringBuilder(12);
            _sb.append(CobolDisplay.formatPic(file1_key1, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_key2, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_key3, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_data, 3, 0, false));
            file1_rec.set(_sb.toString());
        }
        file1.setReadKeyByName("FILE1-KEY1", file1_rec);
        file1.read(file1_rec);
        try { file1_key1 = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_key2 = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_key3 = Integer.parseInt(CobolString.refMod(file1_rec, 7, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 10, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        if (file1_data != 10) {
            CobolDisplay.display("FAILED 1-4");
        }
        file1_rec.set(String.valueOf(" "));
        try { file1_key1 = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).trim()); } catch (Exception _ge) {}
        try { file1_key2 = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).trim()); } catch (Exception _ge) {}
        try { file1_key3 = Integer.parseInt(CobolString.refMod(file1_rec, 7, 3).trim()); } catch (Exception _ge) {}
        try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 10, 3).trim()); } catch (Exception _ge) {}
        file1_key2 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(110), 3));
        { /* Build group file1-rec from children before group access */
            String _gbuf = file1_rec.get();
            StringBuilder _sb = new StringBuilder(12);
            _sb.append(CobolDisplay.formatPic(file1_key1, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_key2, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_key3, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_data, 3, 0, false));
            file1_rec.set(_sb.toString());
        }
        file1.setReadKeyByName("FILE1-KEY2", file1_rec);
        file1.read(file1_rec);
        try { file1_key1 = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_key2 = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_key3 = Integer.parseInt(CobolString.refMod(file1_rec, 7, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 10, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        if (file1_data != 10) {
            CobolDisplay.display("FAILED 1-5");
        }
        file1_rec.set(String.valueOf(" "));
        try { file1_key1 = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).trim()); } catch (Exception _ge) {}
        try { file1_key2 = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).trim()); } catch (Exception _ge) {}
        try { file1_key3 = Integer.parseInt(CobolString.refMod(file1_rec, 7, 3).trim()); } catch (Exception _ge) {}
        try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 10, 3).trim()); } catch (Exception _ge) {}
        file1_key3 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(210), 3));
        { /* Build group file1-rec from children before group access */
            String _gbuf = file1_rec.get();
            StringBuilder _sb = new StringBuilder(12);
            _sb.append(CobolDisplay.formatPic(file1_key1, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_key2, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_key3, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_data, 3, 0, false));
            file1_rec.set(_sb.toString());
        }
        file1.setReadKeyByName("FILE1-KEY3", file1_rec);
        file1.read(file1_rec);
        try { file1_key1 = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_key2 = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_key3 = Integer.parseInt(CobolString.refMod(file1_rec, 7, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 10, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        if (file1_data != 10) {
            CobolDisplay.display("FAILED 1-6");
        }
        file1.close();
        file2.open("INPUT");
        file2_key1 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(10), 3));
        { /* Build group file2-rec from children before group access */
            String _gbuf = file2_rec.get();
            StringBuilder _sb = new StringBuilder(12);
            _sb.append(CobolDisplay.formatPic(file2_key1, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file2_key2, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file2_key3, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file2_data, 3, 0, false));
            file2_rec.set(_sb.toString());
        }
        file2.setReadKeyByName("FILE2-KEY1", file2_rec);
        file2.read(file2_rec);
        try { file2_key1 = Integer.parseInt(CobolString.refMod(file2_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file2_key2 = Integer.parseInt(CobolString.refMod(file2_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file2_key3 = Integer.parseInt(CobolString.refMod(file2_rec, 7, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file2_data = Integer.parseInt(CobolString.refMod(file2_rec, 10, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        if (file2_data != 10) {
            CobolDisplay.display("FAILED 2-3");
        }
        file2_rec.set(String.valueOf(" "));
        try { file2_key1 = Integer.parseInt(CobolString.refMod(file2_rec, 1, 3).trim()); } catch (Exception _ge) {}
        try { file2_key2 = Integer.parseInt(CobolString.refMod(file2_rec, 4, 3).trim()); } catch (Exception _ge) {}
        try { file2_key3 = Integer.parseInt(CobolString.refMod(file2_rec, 7, 3).trim()); } catch (Exception _ge) {}
        try { file2_data = Integer.parseInt(CobolString.refMod(file2_rec, 10, 3).trim()); } catch (Exception _ge) {}
        file2_key2 = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(110), 3));
        { /* Build group file2-rec from children before group access */
            String _gbuf = file2_rec.get();
            StringBuilder _sb = new StringBuilder(12);
            _sb.append(CobolDisplay.formatPic(file2_key1, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file2_key2, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file2_key3, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file2_data, 3, 0, false));
            file2_rec.set(_sb.toString());
        }
        file2.setReadKeyByName("FILE2-KEY2", file2_rec);
        file2.read(file2_rec);
        try { file2_key1 = Integer.parseInt(CobolString.refMod(file2_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file2_key2 = Integer.parseInt(CobolString.refMod(file2_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file2_key3 = Integer.parseInt(CobolString.refMod(file2_rec, 7, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file2_data = Integer.parseInt(CobolString.refMod(file2_rec, 10, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        if (file2_data != 10) {
            CobolDisplay.display("FAILED 2-4");
        }
        file2.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile074IndexedUndeclaredKeys");
            CobolProgram.registerCallAlias("prog", "RunFile074IndexedUndeclaredKeys");
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
        new RunFile074IndexedUndeclaredKeys().run();
    }
}
