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
    private int tally = 0;
    private int return_code = 0;
    private int sort_return = 0;
    private int number_of_call_parameters = 0;
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
    // WORKING-STORAGE SECTION
    private int rec_num = 0;
    private static final int max_rec = 3;
    private CobolString flat_stat = new CobolString(2);
    private CobolString the_file_name = new CobolString(48);

    // FILE SECTION — FLATFILE
    private CobolString flat_record = new CobolString(1); // Group: FLAT-RECORD
    private CobolString file_name = new CobolString(8);
    private CobolString flat_mark = new CobolString(6);
    private CobolString flat_recnum = new CobolString(6);
    private CobolString flat_num = new CobolString(2);
    private CobolString flat_filler = new CobolString(2);


    // FILE DESCRIPTORS
    private CobolFile flatfile = new CobolFile("THE-FILE-NAME", "LINE SEQUENTIAL", "SEQUENTIAL");
    // File status: FLAT-STAT

    private CobolString environment = new CobolString(256); // fallback
    private CobolString cob_seq_concat_sep = new CobolString(256); // fallback
    private CobolString cannot = new CobolString(256); // fallback

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
        System.exit(0);
    }

    private void listfile() {
        flatfile.open("INPUT");
        if (!String.valueOf(flat_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("OPEN INPUT: " + String.valueOf(the_file_name) + " Sts:" + String.valueOf(flat_stat));
        }
        while (!(!String.valueOf(flat_stat).equals(String.valueOf("00")))) {
            read_record();
        }
        flatfile.close();
    }

    private void updtfile() {
        flatfile.open("I-O");
        if (!String.valueOf(flat_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("OPEN I-O: " + String.valueOf(the_file_name) + " Sts:" + String.valueOf(flat_stat));
        }
        for (rec_num = 1; !(!String.valueOf(flat_stat).equals(String.valueOf("00"))); rec_num += 1) {
            flat_record.set(String.valueOf(" "));
            if (flatfile.read(null) == FileStatus.AT_END) {
            }
            if (rec_num == 5) {
                flat_mark.set(String.valueOf("Hello"));
                flatfile.rewrite(flat_record);
                if (!String.valueOf(flat_stat).equals(String.valueOf("00"))) {
                    CobolDisplay.display("REWRITE5: " + String.valueOf(the_file_name) + "Sts:" + String.valueOf(flat_stat));
                }
            }
            if (rec_num == 7) {
                flat_filler.set(String.valueOf("$$"));
                flatfile.rewrite(flat_record);
                if (!String.valueOf(flat_stat).equals(String.valueOf((0 /* non-numeric literal: 44 */ * Integer.parseInt(String.valueOf(cannot).trim()))))) {
                    /* RAW: change size of LINE SEQ record */
                    CobolDisplay.display("REWRITE7: " + String.valueOf(the_file_name) + "Sts:" + String.valueOf(flat_stat));
                }
            }
        }
        flatfile.close();
    }

    private void read_record() {
        /* RAW: *  */
        flat_record.set(String.valueOf(" "));
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(flat_stat).equals(String.valueOf("00"))) {
            if (!String.valueOf(flat_stat).equals(String.valueOf("10"))) {
                CobolDisplay.display("Read Status: " + String.valueOf(flat_stat));
            }
        } else {
            CobolDisplay.display(String.valueOf(flat_record) + ".");
        }
    }

    private void loadfile() {
        flatfile.open("OUTPUT");
        if (!String.valueOf(flat_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("OPEN OUTPUT: " + String.valueOf(the_file_name) + " Sts:" + String.valueOf(flat_stat));
        }
        for (rec_num = 1; !(rec_num > max_rec); rec_num += 1) {
        }
        flatfile.close();
    }

    private void load_record() {
        flat_record.set(String.valueOf(" "));
        flat_recnum.set(String.valueOf("Record"));
        file_name.set(String.valueOf(the_file_name));
        flat_num.set(String.valueOf(rec_num));
        flatfile.write(flat_record);
        if (!String.valueOf(flat_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Write: " + String.valueOf(file_name) + " Rec#" + String.valueOf(rec_num) + " Sts:" + String.valueOf(flat_stat));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile093ConcatenatedFiles().run();
    }
}
