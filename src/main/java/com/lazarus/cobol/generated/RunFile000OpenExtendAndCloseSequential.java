package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile000OpenExtendAndCloseSequential extends CobolProgram {
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
    private CobolString wsfs = new CobolString(2);

    // FILE SECTION — FILE0
    private CobolString f0rec = new CobolString(80);

    // FILE SECTION — FILE-OPT
    private CobolString forec = new CobolString(80);


    // FILE DESCRIPTORS
    private CobolFile file_opt = new CobolFile("testfile", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WSFS
    private CobolFile file0 = new CobolFile("testfile", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WSFS

    // FALLBACK FILE DESCRIPTORS
    private CobolFile _filler_001 = new CobolFile("*", "SEQUENTIAL", "SEQUENTIAL");


    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private void para_main() {
        /* RAW: *  */
        file_opt.open("EXTEND");
        if (!String.valueOf(wsfs).equals(String.valueOf("05"))) {
            CobolDisplay.display("STATUS EXTEND, missing optional file:" + String.valueOf(wsfs));
        }
        forec.set(String.valueOf("A"));
        file_opt.write(forec);
        if (!String.valueOf(wsfs).equals(String.valueOf("00"))) {
            CobolDisplay.display("STATUS WRITE A:" + String.valueOf(wsfs));
        }
        file_opt.close();
        if (!String.valueOf(wsfs).equals(String.valueOf("00"))) {
            CobolDisplay.display("STATUS CLOSE:" + String.valueOf(wsfs));
        }
        file0.open("EXTEND");
        if (!String.valueOf(wsfs).equals(String.valueOf("00"))) {
            CobolDisplay.display("STATUS EXTEND, empty file:" + String.valueOf(wsfs));
        }
        f0rec.set(String.valueOf("B"));
        file0.write(f0rec);
        if (!String.valueOf(wsfs).equals(String.valueOf("00"))) {
            CobolDisplay.display("STATUS WRITE B:" + String.valueOf(wsfs));
        }
        file0.close();
        // KNOWN_ISSUE: _filler_002.close();
        file_opt.open("INPUT");
        if (!String.valueOf(wsfs).equals(String.valueOf("00"))) {
            CobolDisplay.display("STATUS INPUT:" + String.valueOf(wsfs));
        }
        if (file_opt.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        if (!String.valueOf(wsfs).equals(String.valueOf("00"))) {
            CobolDisplay.display("STATUS READ A:" + String.valueOf(wsfs));
        }
        if (file_opt.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        if (!String.valueOf(wsfs).equals(String.valueOf("00"))) {
            CobolDisplay.display("STATUS READ B:" + String.valueOf(wsfs));
        }
        file_opt.close();
        // KNOWN_ISSUE: _filler_003.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile000OpenExtendAndCloseSequential().run();
    }
}
