package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc139StackAndDumpFeature extends CobolProgram {
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
    private short max_sub = (short) 0;
    private CobolString cust_stat = new CobolString(2);
    private int rec_num = 0;
    private short bin = (short) 0;
    private CobolString test_data = new CobolString(1); // Group: TEST-DATA
    private CobolString data_cust_num_tbl = new CobolString(1); // Group: DATA-CUST-NUM-TBL
    private BigDecimal filler_1 = BigDecimal.ZERO;
    private BigDecimal filler_2 = BigDecimal.ZERO;
    private BigDecimal filler_3 = BigDecimal.ZERO;
    private BigDecimal filler_4 = BigDecimal.ZERO;
    private BigDecimal filler_5 = BigDecimal.ZERO;
    private BigDecimal filler_6 = BigDecimal.ZERO;
    private CobolString[] data_cust_num = new CobolString[6];
    private CobolString data_company_tbl = new CobolString(1); // Group: DATA-COMPANY-TBL
    private BigDecimal filler_7 = BigDecimal.ZERO;
    private BigDecimal filler_8 = BigDecimal.ZERO;
    private BigDecimal filler_9 = BigDecimal.ZERO;
    private BigDecimal filler_10 = BigDecimal.ZERO;
    private BigDecimal filler_11 = BigDecimal.ZERO;
    private BigDecimal filler_12 = BigDecimal.ZERO;
    private CobolString[] data_company = new CobolString[6];
    private CobolString data_address_2_tbl = new CobolString(1); // Group: DATA-ADDRESS-2-TBL
    private BigDecimal filler_13 = BigDecimal.ZERO;
    private BigDecimal filler_14 = BigDecimal.ZERO;
    private BigDecimal filler_15 = BigDecimal.ZERO;
    private BigDecimal filler_16 = BigDecimal.ZERO;
    private BigDecimal filler_17 = BigDecimal.ZERO;
    private BigDecimal filler_18 = BigDecimal.ZERO;
    private CobolString[] data_address = new CobolString[6];
    private CobolString data_no_terminals_tbl = new CobolString(1); // Group: DATA-NO-TERMINALS-TBL
    private BigDecimal filler_19 = BigDecimal.ZERO;
    private BigDecimal filler_20 = BigDecimal.ZERO;
    private BigDecimal filler_21 = BigDecimal.ZERO;
    private BigDecimal filler_22 = BigDecimal.ZERO;
    private BigDecimal filler_23 = BigDecimal.ZERO;
    private BigDecimal filler_24 = BigDecimal.ZERO;
    private BigDecimal[] data_no_terminals = new BigDecimal[6];
    private CobolString work_area = new CobolString(1); // Group: WORK-AREA
    private short sub = (short) 0;
    private BigDecimal[] sums_non_std_occurs = new BigDecimal[8];

    // FILE SECTION — FLATFILE
    private CobolString tspfl_record = new CobolString(1); // Group: TSPFL-RECORD
    private CobolString cm_cust_num = new CobolString(8);
    private CobolString cm_company = new CobolString(25);
    private CobolString cm_disk = new CobolString(8);
    private int cm_no_terminals = 0;


    // FILE DESCRIPTORS
    private CobolFile flatfile = new CobolFile("RELFIX", "RELATIVE", "SEQUENTIAL");
    // File status: CUST-STAT

    private CobolString odd_record = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback

    // SECTION: CALL-SUB-1
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private void call_sub_1() {
        call();
    }

    private void call() {
        /* RAW: "sub1" USING bin , TSPFL-RECORD */
    }

    // SECTION: CALL-SUB-2
    private void call_sub_2() {
        move();
    }

    private void move() {
        /* RAW: 4096 TO bin , SUMS-NON-STD-OCCURS ( */
        CobolProgram.call("sub2", bin, _filler_002, tspfl_record);
    }

    // SECTION: CALL-IT-OMIT
    private void call_it_omit() {
        move();
    }

    private void move_2() {
        /* RAW: 5440 TO bin , SUMS-NON-STD-OCCURS ( */
        CobolProgram.call("sub2", bin, _filler_003, tspfl_record);
    }

    private void para_main() {
        loadfile();
        flatfile.open("INPUT");
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
    }

    private void main_100() {
        call_sub_1();
        call_sub_2();
        call_it_omit();
        System.exit(0);
    }

    private void loadfile() {
        flatfile.open("OUTPUT");
        for (sub = 1; !(sub > max_sub); sub += 1) {
        }
        flatfile.close();
    }

    private void load_record() {
        tspfl_record.set(String.valueOf(" "));
        cm_cust_num.set(String.valueOf(data_cust_num[sub - 1]));
        cm_company.set(String.valueOf(data_company[sub - 1]));
        cm_no_terminals = new BigDecimal(String.valueOf(data_no_terminals[sub - 1]).trim()).intValue();
        if (!String.valueOf(odd_record).trim().isEmpty()) {
            cm_disk.set(String.valueOf("8417"));
        } else {
            cm_disk.set(String.valueOf("8470"));
        }
        flatfile.write(tspfl_record);
    }

    @Override
    public void run() {
        call();
    }

    public static void main(String[] args) {
        new RunMisc139StackAndDumpFeature().run();
    }
}
