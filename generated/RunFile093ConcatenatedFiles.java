package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile093ConcatenatedFiles extends CobolProgram {
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
    private short rec_num = (short) 0;
    private static final int max_rec = 3;
    private CobolString flat_stat = new CobolString(2);
    private CobolString the_file_name = new CobolString(48);

    // FILE SECTION — FLATFILE
    private CobolString flat_record = new CobolString(24); // Group: FLAT-RECORD
    private CobolString file_name = new CobolString(8);
    private CobolString flat_mark = new CobolString(6);
    private CobolString flat_recnum = new CobolString(6);
    private CobolString flat_num = new CobolString(2, CobolDisplay.formatEdited(0, "Z9"));
    private CobolString flat_filler = new CobolString(2);

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(51);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_rec_num = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("REC-NUM").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_flat_stat = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(1, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FLAT-STAT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_the_file_name = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(3, 48).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("THE-FILE-NAME").build();

    // FILE DESCRIPTORS
    private CobolFile flatfile = new CobolFile("THE-FILE-NAME", "LINE SEQUENTIAL", "SEQUENTIAL", "FLATFILE");

    private CobolString environment = new CobolString(256); // fallback
    private CobolString cob_seq_concat_sep = new CobolString(256); // fallback

    private void para_main() {
        the_file_name.set(String.valueOf("file1"));
        loadfile();
        the_file_name.set(String.valueOf("file2"));
        loadfile();
        the_file_name.set(String.valueOf("file3"));
        loadfile();
        the_file_name.set(String.valueOf("file1+file2+file3"));
        updtfile();
        environment.set(String.valueOf("&"));
        cob_seq_concat_sep.set(String.valueOf("&"));
        the_file_name.set(String.valueOf("file1&file2&file3"));
        listfile();
        CobolIntrinsics.programExit(0);
    }

    private void listfile() {
        flatfile.setFileName(String.valueOf(the_file_name).trim());
        flatfile.open("INPUT");
        flat_stat.set(flatfile.getFileStatus());
        if (!CobolString.cobolEquals(String.valueOf(flat_stat), String.valueOf("00"))) {
            CobolDisplay.display("OPEN INPUT: " + String.valueOf(the_file_name) + " Sts:" + String.valueOf(flat_stat));
        }
        while (!CobolIntrinsics.performUntil(!CobolString.cobolEquals(String.valueOf(flat_stat), String.valueOf("00")))) {
            read_record();
        }
        flatfile.close();
        flat_stat.set(flatfile.getFileStatus());
    }

    private void updtfile() {
        flatfile.setFileName(String.valueOf(the_file_name).trim());
        flatfile.open("I-O");
        flat_stat.set(flatfile.getFileStatus());
        if (!CobolString.cobolEquals(String.valueOf(flat_stat), String.valueOf("00"))) {
            CobolDisplay.display("OPEN I-O: " + String.valueOf(the_file_name) + " Sts:" + String.valueOf(flat_stat));
        }
        for (rec_num = 1; !(!CobolString.cobolEquals(String.valueOf(flat_stat), String.valueOf("00"))); rec_num += 1) {
            flat_record.set(String.valueOf(" "));
            if (file_name != null) file_name.set(CobolString.refMod(flat_record, 1, 8));
            if (flat_mark != null) flat_mark.set(CobolString.refMod(flat_record, 9, 6));
            if (flat_recnum != null) flat_recnum.set(CobolString.refMod(flat_record, 15, 6));
            if (flat_num != null) flat_num.set(CobolString.refMod(flat_record, 21, 2));
            if (flat_filler != null) flat_filler.set(CobolString.refMod(flat_record, 23, 2));
            flatfile.read(flat_record);
            flat_stat.set(flatfile.getFileStatus());
            file_name.set(CobolString.refMod(flat_record, 1, 8));
            flat_mark.set(CobolString.refMod(flat_record, 9, 6));
            flat_recnum.set(CobolString.refMod(flat_record, 15, 6));
            flat_num.set(CobolString.refMod(flat_record, 21, 2));
            flat_filler.set(CobolString.refMod(flat_record, 23, 2));
            if (rec_num == 5) {
                flat_mark.set(String.valueOf("Hello"));
                flatfile.rewrite(flat_record);
                flat_stat.set(flatfile.getFileStatus());
                if (!CobolString.cobolEquals(String.valueOf(flat_stat), String.valueOf("00"))) {
                    CobolDisplay.display("REWRITE5: " + String.valueOf(the_file_name) + "Sts:" + String.valueOf(flat_stat));
                }
            }
            if (rec_num == 7) {
                flat_filler.set(String.valueOf("$$"));
                flatfile.rewrite(flat_record);
                flat_stat.set(flatfile.getFileStatus());
                if (!CobolString.cobolEquals(String.valueOf(flat_stat), String.valueOf("44"))) {
                    CobolDisplay.display("REWRITE7: " + String.valueOf(the_file_name) + "Sts:" + String.valueOf(flat_stat));
                }
            }
        }
        flatfile.close();
        flat_stat.set(flatfile.getFileStatus());
    }

    private void read_record() {
        flatfile.read(flat_record);
        flat_stat.set(flatfile.getFileStatus());
        file_name.set(CobolString.refMod(flat_record, 1, 8));
        flat_mark.set(CobolString.refMod(flat_record, 9, 6));
        flat_recnum.set(CobolString.refMod(flat_record, 15, 6));
        flat_num.set(CobolString.refMod(flat_record, 21, 2));
        flat_filler.set(CobolString.refMod(flat_record, 23, 2));
        if (!CobolString.cobolEquals(String.valueOf(flat_stat), String.valueOf("00"))) {
            if (!CobolString.cobolEquals(String.valueOf(flat_stat), String.valueOf("10"))) {
                CobolDisplay.display("Read Status: " + String.valueOf(flat_stat));
            }
        } else {
            { /* Build group FLAT-RECORD from children before group access */
                String _gbuf = flat_record.get();
                StringBuilder _sb = new StringBuilder(24);
                _sb.append(String.format("%-8s", String.valueOf(file_name)).substring(0, 8));
                _sb.append(String.format("%-6s", String.valueOf(flat_mark)).substring(0, 6));
                _sb.append(String.format("%-6s", String.valueOf(flat_recnum)).substring(0, 6));
                _sb.append(String.format("%-2s", String.valueOf(flat_num)).substring(0, 2));
                _sb.append(String.format("%-2s", String.valueOf(flat_filler)).substring(0, 2));
                flat_record.set(_sb.toString());
            }
            if (flat_record != null) flat_record.set(String.format("%-8s", String.valueOf(file_name)).substring(0, 8) + String.format("%-6s", String.valueOf(flat_mark)).substring(0, 6) + String.format("%-6s", String.valueOf(flat_recnum)).substring(0, 6) + String.format("%-2s", String.valueOf(flat_num)).substring(0, 2) + String.format("%-2s", String.valueOf(flat_filler)).substring(0, 2));
            CobolDisplay.display(String.valueOf(flat_record) + ".");
        }
    }

    private void loadfile() {
        flatfile.setFileName(String.valueOf(the_file_name).trim());
        flatfile.open("OUTPUT");
        flat_stat.set(flatfile.getFileStatus());
        if (!CobolString.cobolEquals(String.valueOf(flat_stat), String.valueOf("00"))) {
            CobolDisplay.display("OPEN OUTPUT: " + String.valueOf(the_file_name) + " Sts:" + String.valueOf(flat_stat));
        }
        for (rec_num = 1; !(rec_num > max_rec); rec_num += 1) {
            load_record();
        }
        flatfile.close();
        flat_stat.set(flatfile.getFileStatus());
    }

    private void load_record() {
        flat_record.set(String.valueOf(" "));
        if (file_name != null) file_name.set(CobolString.refMod(flat_record, 1, 8));
        if (flat_mark != null) flat_mark.set(CobolString.refMod(flat_record, 9, 6));
        if (flat_recnum != null) flat_recnum.set(CobolString.refMod(flat_record, 15, 6));
        if (flat_num != null) flat_num.set(CobolString.refMod(flat_record, 21, 2));
        if (flat_filler != null) flat_filler.set(CobolString.refMod(flat_record, 23, 2));
        flat_recnum.set(String.valueOf("Record"));
        file_name.set(String.valueOf(the_file_name));
        flat_num.set(CobolDisplay.formatEdited(rec_num, "Z9"));
        flat_record.setRefMod(1, 8, String.valueOf(file_name));
        flat_record.setRefMod(9, 6, String.valueOf(flat_mark));
        flat_record.setRefMod(15, 6, String.valueOf(flat_recnum));
        flat_record.setRefMod(21, 2, String.valueOf(flat_num));
        flat_record.setRefMod(23, 2, String.valueOf(flat_filler));
        flatfile.write(flat_record);
        flat_stat.set(flatfile.getFileStatus());
        if (!CobolString.cobolEquals(String.valueOf(flat_stat), String.valueOf("00"))) {
            CobolDisplay.display("Write: " + String.valueOf(file_name) + " Rec#" + CobolDisplay.formatPic(rec_num, 5, 0, false) + " Sts:" + String.valueOf(flat_stat));
        }
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunFile093ConcatenatedFiles");
            CobolProgram.registerCallAlias("prog", "RunFile093ConcatenatedFiles");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            if (flatfile != null && flat_stat != null) flatfile.setStatusField(flat_stat);
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
        new RunFile093ConcatenatedFiles().run();
    }
}
