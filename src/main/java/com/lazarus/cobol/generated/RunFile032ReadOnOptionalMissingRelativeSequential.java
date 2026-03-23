package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile032ReadOnOptionalMissingRelativeSequential extends CobolProgram {
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
    private CobolString wsinrec = new CobolString(80);

    // FILE SECTION — INFILE
    private CobolString inrec = new CobolString(80);

    // FILE SECTION — INFILES
    private CobolString inrecs = new CobolString(80);


    // FILE DESCRIPTORS
    private CobolFile infile = new CobolFile("missing.txt", "RELATIVE", "SEQUENTIAL");
    // File status: WSFS
    private CobolFile infiles = new CobolFile("missings.txt", "SEQUENTIAL", "SEQUENTIAL");
    // File status: WSFS

    
    private CobolFile _unnamed = new CobolFile(",", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile after = new CobolFile("AFTER", "SEQUENTIAL", "SEQUENTIAL");


    private void main_procedure() {
        /* RAW: *  */
        /* RAW: missing file */
        infile.open("INPUT");
        CobolDisplay.displayNoAdvancing("R: OPEN INPUT on missing optional file = " + String.valueOf(wsfs) + " ");
        if (String.valueOf(wsfs).equals(String.valueOf("05"))) {
            CobolDisplay.display("OK");
        } else {
            CobolDisplay.display("Bad");
        }
        infiles.open("INPUT");
        CobolDisplay.displayNoAdvancing("S: OPEN INPUT on missing optional file = " + String.valueOf(wsfs) + " ");
        if (String.valueOf(wsfs).equals(String.valueOf("05"))) {
            CobolDisplay.display("OK");
        } else {
            CobolDisplay.display("Bad");
        }
        /* RAW: * First */
        if (_unnamed.read(null) == FileStatus.AT_END) {
        }
        /* RAW: RAISE a FS 10 ( AT */
        if (infile.read(wsinrec) == FileStatus.AT_END) {
        }
        CobolDisplay.displayNoAdvancing("R: 1st READ on missing optional file = " + String.valueOf(wsfs) + " ");
        if (String.valueOf(wsfs).equals(String.valueOf("10"))) {
            CobolDisplay.display("OK");
        } else {
            CobolDisplay.display("Bad");
        }
        if (infiles.read(wsinrec) == FileStatus.AT_END) {
        }
        CobolDisplay.displayNoAdvancing("S: 1st READ on missing optional file = " + String.valueOf(wsfs) + " ");
        if (String.valueOf(wsfs).equals(String.valueOf("10"))) {
            CobolDisplay.display("OK");
        } else {
            CobolDisplay.display("Bad");
        }
        /* RAW: * Second */
        if (_unnamed.read(null) == FileStatus.AT_END) {
        }
        /* RAW: should  */
        /* RAW: RAISE a FS 46 ( */
        if (after.read(null) == FileStatus.AT_END) {
            /* RAW: )  */
        }
        if (infile.read(wsinrec) == FileStatus.AT_END) {
        }
        CobolDisplay.displayNoAdvancing("R: 2nd READ on missing optional file = " + String.valueOf(wsfs) + " ");
        if (String.valueOf(wsfs).equals(String.valueOf("46"))) {
            CobolDisplay.display("OK");
        } else {
            CobolDisplay.display("Bad");
        }
        if (infiles.read(wsinrec) == FileStatus.AT_END) {
        }
        CobolDisplay.displayNoAdvancing("S: 2nd READ on missing optional file = " + String.valueOf(wsfs) + " ");
        if (String.valueOf(wsfs).equals(String.valueOf("46"))) {
            CobolDisplay.display("OK");
        } else {
            CobolDisplay.display("Bad");
        }
        if (infile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.displayNoAdvancing("R: 3rd READ on missing optional file = " + String.valueOf(wsfs) + " ");
        if (String.valueOf(wsfs).equals(String.valueOf("46"))) {
            CobolDisplay.display("OK");
        } else {
            CobolDisplay.display("Bad");
        }
        if (infiles.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.displayNoAdvancing("S: 3rd READ on missing optional file = " + String.valueOf(wsfs) + " ");
        if (String.valueOf(wsfs).equals(String.valueOf("46"))) {
            CobolDisplay.display("OK");
        } else {
            CobolDisplay.display("Bad");
        }
        infile.close();
        infiles.close();
        System.exit(0);
    }

    @Override
    public void run() {
        main_procedure();
    }

    public static void main(String[] args) {
        new RunFile032ReadOnOptionalMissingRelativeSequential().run();
    }
}
