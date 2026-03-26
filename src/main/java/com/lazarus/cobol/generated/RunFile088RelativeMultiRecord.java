package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile088RelativeMultiRecord extends CobolProgram {
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
    private BigDecimal filler_1 = BigDecimal.ZERO;
    private BigDecimal filler_2 = BigDecimal.ZERO;
    private BigDecimal filler_3 = BigDecimal.ZERO;
    private BigDecimal filler_4 = BigDecimal.ZERO;
    private BigDecimal filler_5 = BigDecimal.ZERO;
    private BigDecimal filler_6 = BigDecimal.ZERO;
    private CobolString[] data_cust_num = new CobolString[100];
    private CobolString data_company_tbl = new CobolString(1); // Group: DATA-COMPANY-TBL
    private BigDecimal filler_7 = BigDecimal.ZERO;
    private BigDecimal filler_8 = BigDecimal.ZERO;
    private BigDecimal filler_9 = BigDecimal.ZERO;
    private BigDecimal filler_10 = BigDecimal.ZERO;
    private BigDecimal filler_11 = BigDecimal.ZERO;
    private BigDecimal filler_12 = BigDecimal.ZERO;
    private CobolString[] data_company = new CobolString[100];
    private CobolString data_address_2_tbl = new CobolString(1); // Group: DATA-ADDRESS-2-TBL
    private BigDecimal filler_13 = BigDecimal.ZERO;
    private BigDecimal filler_14 = BigDecimal.ZERO;
    private BigDecimal filler_15 = BigDecimal.ZERO;
    private BigDecimal filler_16 = BigDecimal.ZERO;
    private BigDecimal filler_17 = BigDecimal.ZERO;
    private BigDecimal filler_18 = BigDecimal.ZERO;
    private CobolString[] data_address = new CobolString[100];
    private CobolString data_no_terminals_tbl = new CobolString(1); // Group: DATA-NO-TERMINALS-TBL
    private BigDecimal filler_19 = BigDecimal.ZERO;
    private BigDecimal filler_20 = BigDecimal.ZERO;
    private BigDecimal filler_21 = BigDecimal.ZERO;
    private BigDecimal filler_22 = BigDecimal.ZERO;
    private BigDecimal filler_23 = BigDecimal.ZERO;
    private BigDecimal filler_24 = BigDecimal.ZERO;
    private BigDecimal[] data_no_terminals = new BigDecimal[100];
    private CobolString work_area = new CobolString(1); // Group: WORK-AREA
    private int sub = 0;

    // FILE SECTION — FLATFILE
    private CobolString tspfl_record = new CobolString(1); // Group: TSPFL-RECORD
    private CobolString cm_cust_num = new CobolString(8);
    private CobolString cm_type = new CobolString(1);
    private CobolString cm_company = new CobolString(25);
    private CobolString cm_disk = new CobolString(8);
    private short cm_no_terminals = (short) 0;
    private BigDecimal cm_pk_date = BigDecimal.ZERO;
    private CobolString cm_trailer = new CobolString(251);
    private CobolString tsp2_record = new CobolString(1); // Group: TSP2-RECORD
    private CobolString c2_cust_num = new CobolString(8);
    private CobolString c2_type = new CobolString(1);
    private CobolString c2_company = new CobolString(25);
    private CobolString c2_address = new CobolString(25);
    private CobolString c2_disk = new CobolString(8);
    private short c2_no_terminals = (short) 0;
    private BigDecimal c2_pk_date = BigDecimal.ZERO;


    // FILE DESCRIPTORS
    private CobolFile flatfile = new CobolFile("RELVAR", "RELATIVE", "SEQUENTIAL");
    // File status: CUST-STAT

    private CobolString odd_record = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private void para_main() {
        loadfile();
        flatfile.open("INPUT");
        CobolDisplay.display("Initial Re-Read Open Sts:" + String.valueOf(cust_stat));
        while (!(!String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            read_record();
        }
        if (String.valueOf(cust_stat).equals(String.valueOf("30"))) {
            flatfile.close();
            System.exit(0);
        }
        flatfile.close();
        flatfile.open("I-O");
        CobolDisplay.display("For Rewrite Open I-O Sts:" + String.valueOf(cust_stat));
        read_record();
        c2_no_terminals = new BigDecimal(String.valueOf(c2_no_terminals + 1).trim()).shortValue();
        flatfile.rewrite(tsp2_record);
        CobolDisplay.display("REWRITE " + String.valueOf(cm_cust_num) + " Sts " + String.valueOf(cust_stat) + " Trms:" + String.valueOf(c2_no_terminals));
        flatfile.close();
        flatfile.open("I-O");
        CobolDisplay.display("For Rewrite/Delete Open I-O Sts:" + String.valueOf(cust_stat));
        read_record();
        c2_no_terminals = new BigDecimal(String.valueOf(c2_no_terminals + 1).trim()).shortValue();
        flatfile.rewrite(tsp2_record);
        CobolDisplay.display("REWRITE " + String.valueOf(cm_cust_num) + " Sts " + String.valueOf(cust_stat) + " Trms:" + String.valueOf(c2_no_terminals));
        read_record();
        flatfile.delete();
        CobolDisplay.display("DELETE " + String.valueOf(cm_cust_num) + " Sts " + String.valueOf(cust_stat));
        flatfile.close();
        flatfile.open("INPUT");
        CobolDisplay.display("Re-list Open Sts:" + String.valueOf(cust_stat));
        while (!(!String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            read_record();
        }
        flatfile.close();
        flatfile.open("EXTEND");
        for (sub = 1; !(sub > 2); sub += 1) {
        }
        flatfile.close();
        flatfile.open("INPUT");
        CobolDisplay.display("Re-list afer Extend Open Sts:" + String.valueOf(cust_stat));
        while (!(!String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            read_record();
        }
        flatfile.close();
        System.exit(0);
    }

    private void loadfile() {
        CobolDisplay.display("Loading sample program data file.");
        flatfile.open("OUTPUT");
        for (sub = 1; !(sub > max_sub); sub += 1) {
        }
        CobolDisplay.display("Sample program data file load complete.");
        flatfile.close();
    }

    private void read_record() {
        tspfl_record.set(String.valueOf(" "));
        tsp2_record.set(String.valueOf(" "));
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Read Status: " + String.valueOf(cust_stat));
        } else {
            if (String.valueOf(cm_type).equals(String.valueOf(" "))) {
                CobolDisplay.display("Read  " + String.valueOf(cm_cust_num) + " #:" + String.valueOf(rec_num) + " Trms:" + String.valueOf(cm_no_terminals));
            } else {
                CobolDisplay.display("Read2 " + String.valueOf(c2_cust_num) + " #:" + String.valueOf(rec_num) + " Trms:" + String.valueOf(c2_no_terminals));
            }
        }
        /* RAW: * LOAD-RECORD */
        tspfl_record.set(String.valueOf(" "));
        tsp2_record.set(String.valueOf(" "));
        cm_cust_num.set(String.valueOf(data_cust_num[sub - 1]));
        cm_company.set(String.valueOf(data_company[sub - 1]));
        cm_no_terminals = new BigDecimal(String.valueOf(data_no_terminals[sub - 1]).trim()).shortValue();
        cm_pk_date = new BigDecimal(String.valueOf(20070319).trim());
        if (((sub == 1 || sub == 4) || sub == 6)) {
            cm_pk_date = new BigDecimal(String.valueOf(-20070319).trim());
        }
        /* RAW: *  */
        if (!String.valueOf(odd_record).trim().isEmpty()) {
            c2_disk.set(String.valueOf("8417"));
            _filler_002.set(String.valueOf("8417"));
            c2_cust_num.set(String.valueOf(cm_cust_num));
            c2_type.set(String.valueOf("2"));
            _filler_003.set(String.valueOf("2"));
            c2_company.set(String.valueOf(cm_company));
            c2_pk_date = new BigDecimal(String.valueOf(cm_pk_date).trim());
            c2_no_terminals = new BigDecimal(String.valueOf(cm_no_terminals).trim()).shortValue();
            c2_address.set(String.valueOf(data_address[sub - 1]));
            flatfile.write(tsp2_record);
        } else {
            cm_disk.set(String.valueOf("8470"));
            cm_type.set(String.valueOf(" "));
            flatfile.write(tspfl_record);
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile088RelativeMultiRecord().run();
    }
}
