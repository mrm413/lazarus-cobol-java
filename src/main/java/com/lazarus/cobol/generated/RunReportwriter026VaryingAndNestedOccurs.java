package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunReportwriter026VaryingAndNestedOccurs extends CobolProgram {
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
    private int rpt = 0;
    private int num = 0;
    private CobolString tag1v = new CobolString(5);
    private CobolString tag2v = new CobolString(5);
    private CobolString markx = new CobolString(16);
    private CobolString[] markit = new CobolString[4];
    private CobolString digx = new CobolString(50);
    private CobolString[] digs = new CobolString[5];

    // FILE SECTION — RP-FILE


    // FILE DESCRIPTORS
    private CobolFile rp_file = new CobolFile("PRINTOUT", "LINE SEQUENTIAL", "SEQUENTIAL");

    private CobolString[] nnns = new CobolString[100];
    private CobolString _unnamed = new CobolString(256);
    private CobolString[] nums = new CobolString[100];
    private CobolString num4a = new CobolString(256);
    private CobolString[] num4b = new CobolString[100];
    private CobolString[] grps = new CobolString[100];
    private CobolString[] tag1 = new CobolString[100];
    private CobolString[] tag2 = new CobolString[100];

    // SECTION: BEFORE-DETAIL
    private CobolString dtl2 = new CobolString(256);
    private void before_detail() {
        use();
        rp_dtl2();
        doit_1();
    }

    private void use() {
        /* RAW: BEFORE REPORTING */
    }

    private void rp_dtl2() {
    }

    private void doit_1() {
        num = new BigDecimal(String.valueOf(num + 1).trim()).intValue();
        CobolDisplay.display("Hello World " + String.valueOf(num));
    // dtl2[2 - 1][2 - 1].set(String.valueOf("$"));
    }

    private void para_main() {
        rp_file.open("OUTPUT");
        /* RAW: INITIATE RP */
        if (nnns[1 - 1] == null) nnns[1 - 1] = new CobolString(256);
        nnns[1 - 1].set(String.valueOf(149));
        _unnamed.set(String.valueOf(149));
        if (nnns[2 - 1] == null) nnns[2 - 1] = new CobolString(256);
        nnns[2 - 1].set(String.valueOf(149));
        _unnamed.set(String.valueOf(149));
        if (nnns[3 - 1] == null) nnns[3 - 1] = new CobolString(256);
        nnns[3 - 1].set(String.valueOf(149));
        if (nnns[4 - 1] == null) nnns[4 - 1] = new CobolString(256);
        nnns[4 - 1].set(String.valueOf(149));
        if (nums[1 - 1] == null) nums[1 - 1] = new CobolString(256);
        nums[1 - 1].set(String.valueOf(100));
        _unnamed.set(String.valueOf(100));
        if (nums[2 - 1] == null) nums[2 - 1] = new CobolString(256);
        nums[2 - 1].set(String.valueOf(100));
        _unnamed.set(String.valueOf(100));
        if (nums[3 - 1] == null) nums[3 - 1] = new CobolString(256);
        nums[3 - 1].set(String.valueOf(100));
        for (rpt = 1; !(rpt > 4); rpt += 1) {
            /* RAW: GENERATE RP-DTL1 */
            doit_now();
            /* RAW: GENERATE RP-DTL2 */
            if (nnns[1 - 1] == null) nnns[1 - 1] = new CobolString(256);
            nnns[1 - 1].set(String.valueOf(200));
            _unnamed.set(String.valueOf(200));
            if (nnns[2 - 1] == null) nnns[2 - 1] = new CobolString(256);
            nnns[2 - 1].set(String.valueOf(200));
            _unnamed.set(String.valueOf(200));
            if (nnns[3 - 1] == null) nnns[3 - 1] = new CobolString(256);
            nnns[3 - 1].set(String.valueOf(200));
            if (nnns[4 - 1] == null) nnns[4 - 1] = new CobolString(256);
            nnns[4 - 1].set(String.valueOf(200));
            /* RAW: GENERATE RP-DTL3 */
            num4a.set(String.valueOf(400));
            if (num4b[1 - 1] == null) num4b[1 - 1] = new CobolString(256);
            num4b[1 - 1].set(String.valueOf(401));
            if (num4b[2 - 1] == null) num4b[2 - 1] = new CobolString(256);
            num4b[2 - 1].set(String.valueOf(402));
            if (num4b[3 - 1] == null) num4b[3 - 1] = new CobolString(256);
            num4b[3 - 1].set(String.valueOf(403));
            /* RAW: GENERATE RP-DTL4 */
        }
        /* RAW: TERMINATE  */
    }

    private void rp() {
    }

    private void rp_file() {
        System.exit(0);
    }

    private void doit_now() {
        if (grps[1 - 1] == null) grps[1 - 1] = new CobolString(256);
        grps[1 - 1].set(String.valueOf("*"));
        _unnamed.set(String.valueOf("*"));
        if (grps[2 - 1] == null) grps[2 - 1] = new CobolString(256);
        grps[2 - 1].set(String.valueOf("*"));
        _unnamed.set(String.valueOf("*"));
        if (grps[3 - 1] == null) grps[3 - 1] = new CobolString(256);
        grps[3 - 1].set(String.valueOf("*"));
        if (tag1[1 - 1] == null) tag1[1 - 1] = new CobolString(256);
        tag1[1 - 1].set(String.valueOf("WAG1"));
        _unnamed.set(String.valueOf("WAG1"));
        if (tag1[2 - 1] == null) tag1[2 - 1] = new CobolString(256);
        tag1[2 - 1].set(String.valueOf("WAG1"));
        _unnamed.set(String.valueOf("WAG1"));
        if (tag1[3 - 1] == null) tag1[3 - 1] = new CobolString(256);
        tag1[3 - 1].set(String.valueOf("WAG1"));
        if (tag2[1 - 1] == null) tag2[1 - 1] = new CobolString(256);
        tag2[1 - 1].set(String.valueOf("WAG2"));
        _unnamed.set(String.valueOf("WAG2"));
        if (tag2[2 - 1] == null) tag2[2 - 1] = new CobolString(256);
        tag2[2 - 1].set(String.valueOf("WAG2"));
        _unnamed.set(String.valueOf("WAG2"));
        if (tag2[3 - 1] == null) tag2[3 - 1] = new CobolString(256);
        tag2[3 - 1].set(String.valueOf("WAG2"));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunReportwriter026VaryingAndNestedOccurs().run();
    }
}
