package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter018ReportWithOccurs extends CobolProgram {
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
    // FILE SECTION — rp-file


    // FILE DESCRIPTORS
    private CobolFile rp_file = new CobolFile("PRINTOUT", "LINE SEQUENTIAL", "SEQUENTIAL");

    private CobolString[] nums = new CobolString[100]; // fallback array
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString mark = new CobolString(256); // fallback
    private CobolString[] grps = new CobolString[100]; // fallback array
    private CobolString[] tag1 = new CobolString[100]; // fallback array
    private CobolString[] tag2 = new CobolString[100]; // fallback array
    private CobolString[] nnns = new CobolString[100]; // fallback array
    private CobolString tagp = new CobolString(256); // fallback
    private CobolString num4a = new CobolString(256); // fallback
    private CobolString[] num4b = new CobolString[100]; // fallback array
    private CobolString mrk4 = new CobolString(256); // fallback

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
    private void para_main() {
        rp_file.open("OUTPUT");
        /* UNSUPPORTED: Report Writer — INITIATE */
        if (nums[1 - 1] == null) nums[1 - 1] = new CobolString(256);
        nums[1 - 1].set(String.valueOf(100));
        _filler_002.set(String.valueOf(100));
        if (nums[2 - 1] == null) nums[2 - 1] = new CobolString(256);
        nums[2 - 1].set(String.valueOf(100));
        _filler_003.set(String.valueOf(100));
        if (nums[3 - 1] == null) nums[3 - 1] = new CobolString(256);
        nums[3 - 1].set(String.valueOf(100));
        mark.set(String.valueOf("<1>"));
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (grps[1 - 1] == null) grps[1 - 1] = new CobolString(256);
        grps[1 - 1].set(String.valueOf("*"));
        _filler_004.set(String.valueOf("*"));
        if (grps[2 - 1] == null) grps[2 - 1] = new CobolString(256);
        grps[2 - 1].set(String.valueOf("*"));
        _filler_005.set(String.valueOf("*"));
        if (grps[3 - 1] == null) grps[3 - 1] = new CobolString(256);
        grps[3 - 1].set(String.valueOf("*"));
        if (tag1[1 - 1] == null) tag1[1 - 1] = new CobolString(256);
        tag1[1 - 1].set(String.valueOf("Tag1"));
        _filler_006.set(String.valueOf("Tag1"));
        if (tag1[2 - 1] == null) tag1[2 - 1] = new CobolString(256);
        tag1[2 - 1].set(String.valueOf("Tag1"));
        _filler_007.set(String.valueOf("Tag1"));
        if (tag1[3 - 1] == null) tag1[3 - 1] = new CobolString(256);
        tag1[3 - 1].set(String.valueOf("Tag1"));
        if (tag2[1 - 1] == null) tag2[1 - 1] = new CobolString(256);
        tag2[1 - 1].set(String.valueOf("Tag2"));
        _filler_008.set(String.valueOf("Tag2"));
        if (tag2[2 - 1] == null) tag2[2 - 1] = new CobolString(256);
        tag2[2 - 1].set(String.valueOf("Tag2"));
        _filler_009.set(String.valueOf("Tag2"));
        if (tag2[3 - 1] == null) tag2[3 - 1] = new CobolString(256);
        tag2[3 - 1].set(String.valueOf("Tag2"));
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (nnns[1 - 1] == null) nnns[1 - 1] = new CobolString(256);
        nnns[1 - 1].set(String.valueOf(200));
        _filler_010.set(String.valueOf(200));
        if (nnns[2 - 1] == null) nnns[2 - 1] = new CobolString(256);
        nnns[2 - 1].set(String.valueOf(200));
        _filler_011.set(String.valueOf(200));
        if (nnns[3 - 1] == null) nnns[3 - 1] = new CobolString(256);
        nnns[3 - 1].set(String.valueOf(200));
        if (nnns[4 - 1] == null) nnns[4 - 1] = new CobolString(256);
        nnns[4 - 1].set(String.valueOf(200));
        tagp.set(String.valueOf("<3>"));
        /* UNSUPPORTED: Report Writer — GENERATE */
        num4a.set(String.valueOf(400));
        if (num4b[1 - 1] == null) num4b[1 - 1] = new CobolString(256);
        num4b[1 - 1].set(String.valueOf(401));
        if (num4b[2 - 1] == null) num4b[2 - 1] = new CobolString(256);
        num4b[2 - 1].set(String.valueOf(402));
        if (num4b[3 - 1] == null) num4b[3 - 1] = new CobolString(256);
        num4b[3 - 1].set(String.valueOf(403));
        mrk4.set(String.valueOf("<4>"));
        /* UNSUPPORTED: Report Writer — GENERATE */
        /* UNSUPPORTED: Report Writer — TERMINATE */
        rp_file.close();
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunReportwriter018ReportWithOccurs().run();
    }
}
