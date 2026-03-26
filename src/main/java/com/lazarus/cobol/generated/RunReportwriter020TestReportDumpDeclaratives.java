package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter020TestReportDumpDeclaratives extends CobolProgram {
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
    private CobolString digx = new CobolString(50);
    private CobolString[] digs = new CobolString[5];
    private CobolString error_messages = new CobolString(1); // Group: error-messages
    private CobolString bad_ending = new CobolString(50);
    private CobolString bad_param = new CobolString(50);

    // FILE SECTION — RP-FILE


    // FILE DESCRIPTORS
    private CobolFile rp_file = new CobolFile("PRINTOUT", "LINE SEQUENTIAL", "SEQUENTIAL");

    private CobolString[] nnns = new CobolString[100]; // fallback array
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString tagp = new CobolString(256); // fallback
    private CobolString mrk4 = new CobolString(256); // fallback
    private CobolString[] nums = new CobolString[100]; // fallback array
    private CobolString mark = new CobolString(256); // fallback
    private CobolString[] grps = new CobolString[100]; // fallback array
    private CobolString[] tag1 = new CobolString[100]; // fallback array
    private CobolString[] tag2 = new CobolString[100]; // fallback array
    private CobolString mrk2 = new CobolString(256); // fallback
    private CobolString num4a = new CobolString(256); // fallback
    private CobolString[] num4b = new CobolString[100]; // fallback array

    // SECTION: BEFORE-DETAIL
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_009 = new CobolString(256); // fallback
    private CobolString _filler_010 = new CobolString(256); // fallback
    private CobolString _filler_011 = new CobolString(256); // fallback
    private CobolString _filler_012 = new CobolString(256); // fallback
    private CobolString _filler_013 = new CobolString(256); // fallback
    private void before_detail() {
        // body commented -- compile edge case
    }

    private void use() {
        // body commented -- compile edge case
    }

    private void doit_1() {
        // body commented -- compile edge case
    }

    private void para_main() {
        // body commented -- compile edge case
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunReportwriter020TestReportDumpDeclaratives().run();
    }
}
