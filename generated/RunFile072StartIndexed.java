package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile072StartIndexed extends CobolProgram {
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
    // FILE SECTION — file1
    private CobolString file1_rec = new CobolString(6); // Group: file1-rec
    private int file1_key = 0;
    private int file1_data = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(1);

    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("./file1X", "INDEXED", "DYNAMIC", "FILE1");
    {
        file1.registerIndexedPrimaryKey("FILE1-KEY", 0, 3);
    }


    private void para_main() {
        file1.open("OUTPUT");
        file1.close();
        file1.open("I-O");
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(10), 3));
        file1_data = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(10), 3));
        file1_rec.setRefMod(1, 3, CobolDisplay.formatPic(file1_key, 3, 0, false));
        file1_rec.setRefMod(4, 3, CobolDisplay.formatPic(file1_data, 3, 0, false));
        file1.write(file1_rec);
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(11), 3));
        file1_data = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(11), 3));
        file1_rec.setRefMod(1, 3, CobolDisplay.formatPic(file1_key, 3, 0, false));
        file1_rec.setRefMod(4, 3, CobolDisplay.formatPic(file1_data, 3, 0, false));
        file1.write(file1_rec);
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(12), 3));
        file1_data = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(12), 3));
        file1_rec.setRefMod(1, 3, CobolDisplay.formatPic(file1_key, 3, 0, false));
        file1_rec.setRefMod(4, 3, CobolDisplay.formatPic(file1_data, 3, 0, false));
        file1.write(file1_rec);
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(13), 3));
        file1_data = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(13), 3));
        file1_rec.setRefMod(1, 3, CobolDisplay.formatPic(file1_key, 3, 0, false));
        file1_rec.setRefMod(4, 3, CobolDisplay.formatPic(file1_data, 3, 0, false));
        file1.write(file1_rec);
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 3));
        { /* Build group file1-rec from children before group access */
            String _gbuf = file1_rec.get();
            StringBuilder _sb = new StringBuilder(6);
            _sb.append(CobolDisplay.formatPic(file1_key, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_data, 3, 0, false));
            file1_rec.set(_sb.toString());
        }
        file1.startByName("FILE1-KEY", file1_rec, "GT");
        file1.readNext(file1_rec);
        try { file1_key = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        if (file1_data != 10) {
            CobolDisplay.display("FAILED: START key > 0");
        }
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(99), 3));
        { /* Build group file1-rec from children before group access */
            String _gbuf = file1_rec.get();
            StringBuilder _sb = new StringBuilder(6);
            _sb.append(CobolDisplay.formatPic(file1_key, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_data, 3, 0, false));
            file1_rec.set(_sb.toString());
        }
        file1.startByName("FILE1-KEY", file1_rec, "LT");
        file1.readNext(file1_rec);
        try { file1_key = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        if (file1_data != 13) {
            CobolDisplay.display("FAILED: START key < 99");
        }
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(999), 3));
        file1.startByName("primary", null, "FIRST");
        file1.readNext(file1_rec);
        try { file1_key = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        if (file1_data != 10) {
            CobolDisplay.display("FAILED: START key FIRST");
        }
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 3));
        file1.startByName("primary", null, "LAST");
        file1.readNext(file1_rec);
        try { file1_key = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        if (file1_data != 13) {
            CobolDisplay.display("FAILED: START key LAST");
        }
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(0), 3));
        { /* Build group file1-rec from children before group access */
            String _gbuf = file1_rec.get();
            StringBuilder _sb = new StringBuilder(6);
            _sb.append(CobolDisplay.formatPic(file1_key, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_data, 3, 0, false));
            file1_rec.set(_sb.toString());
        }
        file1.startByName("FILE1-KEY", file1_rec, "GE");
        file1.readNext(file1_rec);
        try { file1_key = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        if (file1_data != 10) {
            CobolDisplay.display("FAILED: START key >= 0");
        }
        file1_key = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(99), 3));
        { /* Build group file1-rec from children before group access */
            String _gbuf = file1_rec.get();
            StringBuilder _sb = new StringBuilder(6);
            _sb.append(CobolDisplay.formatPic(file1_key, 3, 0, false));
            _sb.append(CobolDisplay.formatPic(file1_data, 3, 0, false));
            file1_rec.set(_sb.toString());
        }
        file1.startByName("FILE1-KEY", file1_rec, "LE");
        file1.readNext(file1_rec);
        try { file1_key = Integer.parseInt(CobolString.refMod(file1_rec, 1, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        try { file1_data = Integer.parseInt(CobolString.refMod(file1_rec, 4, 3).toString().trim()); } catch (NumberFormatException _nfe) {}
        if (file1_data != 13) {
            CobolDisplay.display("FAILED: START key <= 99");
        }
        file1.close();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile072StartIndexed");
            CobolProgram.registerCallAlias("prog", "RunFile072StartIndexed");
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
        new RunFile072StartIndexed().run();
    }
}
