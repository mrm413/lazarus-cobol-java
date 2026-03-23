package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile028WriteRewriteFileName extends CobolProgram {
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
    private static final int max_sub = 6;
    private CobolString cust_stat = new CobolString(2);
    private int rec_num = 0;
    private CobolString test_data = new CobolString(1); // Group: TEST-DATA
    private CobolString data_cust_num_tbl = new CobolString(1); // Group: DATA-CUST-NUM-TBL
    private CobolString[] data_cust_num = new CobolString[100];
    private CobolString data_company_tbl = new CobolString(1); // Group: DATA-COMPANY-TBL
    private CobolString[] data_company = new CobolString[100];
    private CobolString data_address_2_tbl = new CobolString(1); // Group: DATA-ADDRESS-2-TBL
    private CobolString[] data_address = new CobolString[100];
    private CobolString data_no_terminals_tbl = new CobolString(1); // Group: DATA-NO-TERMINALS-TBL
    private BigDecimal[] data_no_terminals = new BigDecimal[100];
    private CobolString work_area = new CobolString(1); // Group: WORK-AREA
    private int sub = 0;

    // FILE SECTION — FLATFILE
    private CobolString tspfl_record = new CobolString(1); // Group: TSPFL-RECORD
    private CobolString cm_cust_num = new CobolString(8);
    private CobolString cm_company = new CobolString(25);
    private CobolString cm_disk = new CobolString(8);
    private int cm_no_terminals = 0;

    // FILE SECTION — FLATFILE2
    private CobolString tsp2_record = new CobolString(1); // Group: TSP2-RECORD
    private CobolString c2_cust_num = new CobolString(8);
    private CobolString c2_company = new CobolString(25);
    private CobolString c2_disk = new CobolString(8);
    private int c2_no_terminals = 0;


    // FILE DESCRIPTORS
    private CobolFile flatfile = new CobolFile("RELFIX", "RELATIVE", "SEQUENTIAL");
    // File status: CUST-STAT
    private CobolFile flatfile2 = new CobolFile("RELFIX", "RELATIVE", "RANDOM");
    // File status: CUST-STAT

    private CobolString odd_record = new CobolString(256);
    private CobolString file = new CobolString(256);

    private void para_main() {
        loadfile();
    }

    private void flatfile2() {
        rec_num = new BigDecimal(String.valueOf(2).trim()).intValue();
        if (flatfile2.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display("Read    " + String.valueOf(c2_cust_num) + " Sts:" + String.valueOf(cust_stat) + " Trms:");
    }

    private void c2_no_terminals() {
        c2_no_terminals = new BigDecimal(String.valueOf(c2_no_terminals + 1).trim()).intValue();
        /* REWRITE FILE — no file mapping */ // file.rewrite();
        /* RAW: FLATFILE2 FROM TSP2-RECORD */
        if (flatfile2.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display("REWROTE " + String.valueOf(c2_cust_num) + " Sts:" + String.valueOf(cust_stat) + " Trms:");
    }

    private void c2_no_terminals_2() {
    }

    private void flatfile2_2() {
        System.exit(0);
    }

    private void loadfile() {
        CobolDisplay.display("Loading sample program data file.");
    }

    private void flatfile() {
        for (sub = 1; !(sub > max_sub); sub += 1) {
        }
        CobolDisplay.display("Sample program data file load complete.");
    }

    private void flatfile_2() {
    }

    private void load_record() {
    }

    private void tspfl_record() {
    }

    private void cm_cust_num() {
    }

    private void cm_company() {
    }

    private void cm_no_terminals() {
        if (!String.valueOf(odd_record).trim().isEmpty()) {
            cm_disk.set(String.valueOf("8417"));
        } else {
            /* RAW: CM-DISK  */
        }
        /* WRITE FILE — no file mapping */ // file.write();
        /* RAW: FLATFILE FROM */
    }

    private void tspfl_record_2() {
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile028WriteRewriteFileName().run();
    }
}
