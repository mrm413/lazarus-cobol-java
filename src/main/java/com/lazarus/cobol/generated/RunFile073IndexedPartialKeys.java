package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile073IndexedPartialKeys extends CobolProgram {
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
    private CobolString f_status = new CobolString(2);
    private int w_serial = 0;

    // FILE SECTION — f
    private CobolString f_rec = new CobolString(1); // Group: f-rec
    private CobolString f_key1 = new CobolString(1); // Group: f-key1
    private CobolString f_key1_1 = new CobolString(3);
    private CobolString f_key1_2 = new CobolString(3);
    private CobolString f_key2 = new CobolString(1); // Group: f-key2
    private CobolString f_key2_1 = new CobolString(3);
    private CobolString f_key2_2 = new CobolString(3);
    private CobolString f_key3 = new CobolString(1); // Group: f-key3
    private CobolString f_key3_1 = new CobolString(3);
    private CobolString f_key3_2 = new CobolString(3);
    private int file1_serial = 0;


    // FILE DESCRIPTORS
    private CobolFile f = new CobolFile("fileX", "INDEXED", "DYNAMIC");
    // File status: f-status

    
    private CobolFile file = new CobolFile("FILE", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile file_status = new CobolFile("FILE-STATUS", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString duplicates = new CobolString(256);
    private CobolString depends = new CobolString(256);

    private void para_main() {
        file.delete();
        /* RAW: f  */
        f.open("I-O");
        f_rec.set(String.valueOf("AAAAAAaaaaaaXX----"));
        write_f();
        f_rec.set(String.valueOf("AAAAABaaaaabXX----"));
        write_f();
        f_rec.set(String.valueOf("AAAABBaaaabbXX----"));
        write_f();
        f_rec.set(String.valueOf("AAABBBaaabbbXXX---"));
        write_f();
        f_rec.set(String.valueOf("AABBBBaabbbbXXX---"));
        write_f();
        f_rec.set(String.valueOf("ABBBBBabbbbbXXX---"));
        write_f();
        f_rec.set(String.valueOf("BBBBBBbbbbbbXXX---"));
        write_f();
        f_key1_1.set(String.valueOf("AAB"));
        f_key1_2.set(String.valueOf("~~~"));
        f.start();
        if (f.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        if ((!String.valueOf(f_status).equals(String.valueOf("00")) || file1_serial != 4)) {
            CobolDisplay.display("FAILED 1: status " + String.valueOf(f_status) + "-" + "serial: " + String.valueOf(file1_serial));
        }
        f_key1_1.set(String.valueOf("AAB"));
        f_key1_2.set(String.valueOf("~~~"));
        f.start();
        if (f.read(null) == FileStatus.AT_END) {
        }
        /* RAW: PREVIOUS  */
        if ((!String.valueOf(f_status).equals(String.valueOf("00")) || file1_serial != 3)) {
            CobolDisplay.display("FAILED 2: status " + String.valueOf(f_status) + "-" + "serial: " + String.valueOf(file1_serial));
        }
        f_key1_1.set(String.valueOf("AAA"));
        f_key1_2.set(String.valueOf("~~~"));
        f.start();
        if (f.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        if ((!String.valueOf(f_status).equals(String.valueOf("00")) || file1_serial != 4)) {
            CobolDisplay.display("FAILED 3: status " + String.valueOf(f_status) + "-" + "serial: " + String.valueOf(file1_serial));
        }
        f_key2_1.set(String.valueOf("aab"));
        f_key2_2.set(String.valueOf("~~~"));
        f.start();
        if (f.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        if ((!String.valueOf(f_status).equals(String.valueOf("00")) || file1_serial != 4)) {
            CobolDisplay.display("FAILED 4: status " + String.valueOf(f_status) + "-" + "serial: " + String.valueOf(file1_serial));
        }
        f_key2_1.set(String.valueOf("aab"));
        f_key2_2.set(String.valueOf("~~~"));
        f.start();
        if (f.read(null) == FileStatus.AT_END) {
        }
        /* RAW: PREVIOUS  */
        if ((!String.valueOf(f_status).equals(String.valueOf("00")) || file1_serial != 3)) {
            CobolDisplay.display("FAILED 5: status " + String.valueOf(f_status) + "-" + "serial: " + String.valueOf(file1_serial));
        }
        f_key2_1.set(String.valueOf("aaa"));
        f_key2_2.set(String.valueOf("~~~"));
        f.start();
        if (f.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        if ((!String.valueOf(f_status).equals(String.valueOf("00")) || file1_serial != 4)) {
            CobolDisplay.display("FAILED 6: status " + String.valueOf(f_status) + "-" + "serial: " + String.valueOf(file1_serial));
        }
        f_key3_1.set(String.valueOf("XX-"));
        f.start();
        if (f.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: * CHECK : */
        /* RETURN file-status */
        /* RAW: "02"  */
        if (!String.valueOf(duplicates).trim().isEmpty()) {
            /* RAW: exist  */
            if (!String.valueOf(f_status).equals(String.valueOf((0 /* non-numeric literal: 02 */ * Integer.parseInt(String.valueOf(depends).trim()))))) {
                /* RAW: on xISAM implementation and the way */
            }
        }
        /* RAW: x ) AND f-status <> "00" */
        CobolDisplay.display("FAILED 7: status " + String.valueOf(f_status) + "-");
        f.close();
        System.exit(0);
    }

    private void write_f() {
        file1_serial = new BigDecimal(String.valueOf(w_serial).trim()).intValue();
        f.write(f_rec);
        w_serial = new BigDecimal(String.valueOf(w_serial + 1).trim()).intValue();
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile073IndexedPartialKeys().run();
    }
}
