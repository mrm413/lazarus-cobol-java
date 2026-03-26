package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile091LineSequentialRewrite extends CobolProgram {
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
    private CobolString test_data = new CobolString(1); // Group: TEST-DATA
    private CobolString data_cust_num_tbl = new CobolString(1); // Group: DATA-CUST-NUM-TBL
    private int filler_1 = 0;
    private int filler_2 = 0;
    private int filler_3 = 0;
    private int filler_4 = 0;
    private int filler_5 = 0;
    private int filler_6 = 0;
    private CobolString[] data_cust_num = new CobolString[100];
    private CobolString data_company_tbl = new CobolString(1); // Group: DATA-COMPANY-TBL
    private int filler_7 = 0;
    private int filler_8 = 0;
    private int filler_9 = 0;
    private int filler_10 = 0;
    private int filler_11 = 0;
    private int filler_12 = 0;
    private CobolString[] data_company = new CobolString[100];
    private CobolString data_address_2_tbl = new CobolString(1); // Group: DATA-ADDRESS-2-TBL
    private int filler_13 = 0;
    private int filler_14 = 0;
    private int filler_15 = 0;
    private int filler_16 = 0;
    private int filler_17 = 0;
    private int filler_18 = 0;
    private CobolString[] data_address = new CobolString[100];
    private CobolString data_no_terminals_tbl = new CobolString(1); // Group: DATA-NO-TERMINALS-TBL
    private int filler_19 = 0;
    private int filler_20 = 0;
    private int filler_21 = 0;
    private int filler_22 = 0;
    private int filler_23 = 0;
    private int filler_24 = 0;
    private int[] data_no_terminals = new int[100];
    private CobolString work_area = new CobolString(1); // Group: WORK-AREA
    private int sub = 0;

    // FILE SECTION — FLATFILE
    private CobolString tspfl_record = new CobolString(1); // Group: TSPFL-RECORD
    private CobolString cm_cust_num = new CobolString(8);
    private CobolString cm_company = new CobolString(25);
    private CobolString cm_disk = new CobolString(8);
    private int cm_no_terminals = 0;
    private long cm_pk_date = 0L;
    private CobolString cm_trailer = new CobolString(52);


    // FILE DESCRIPTORS
    private CobolFile flatfile = new CobolFile("SEQFIX", "LINE SEQUENTIAL", "SEQUENTIAL");
    // File status: CUST-STAT

    private CobolString odd_record = new CobolString(256); // fallback

    private void para_main() {
        loadfile();
        flatfile.open("INPUT");
        CobolDisplay.display("Open Sts:" + String.valueOf(cust_stat));
        read_record();
        read_record();
        read_record();
        read_record();
        flatfile.close();
        flatfile.open("I-O");
        read_record();
        cm_no_terminals = new BigDecimal(String.valueOf(10).trim()).intValue();
        cm_trailer.set(String.valueOf("STUFF"));
        flatfile.rewrite(tspfl_record);
        CobolDisplay.display("REWRITE " + String.valueOf(cm_cust_num) + " Sts " + String.valueOf(cust_stat) + " Trms:" + String.valueOf(cm_no_terminals));
        flatfile.close();
        flatfile.open("I-O");
        read_record();
        read_record();
        cm_no_terminals = new BigDecimal(String.valueOf(cm_no_terminals + 1).trim()).intValue();
        flatfile.rewrite(tspfl_record);
        CobolDisplay.display("REWRITE " + String.valueOf(cm_cust_num) + " Sts " + String.valueOf(cust_stat) + " Trms:" + String.valueOf(cm_no_terminals));
        read_record();
        flatfile.close();
        flatfile.open("I-O");
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display("Read " + String.valueOf(cm_cust_num) + " Sts:" + String.valueOf(cust_stat));
        cm_no_terminals = new BigDecimal(String.valueOf(8240).trim()).intValue();
        flatfile.rewrite(tspfl_record);
        CobolDisplay.display("REWRITE " + String.valueOf(cm_cust_num) + " Sts " + String.valueOf(cust_stat) + " Trms:" + String.valueOf(cm_no_terminals));
        flatfile.close();
        flatfile.open("INPUT");
        CobolDisplay.display("List back Open Sts:" + String.valueOf(cust_stat));
        while (!(!String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            read_record();
        }
        flatfile.close();
        flatfile.open("EXTEND");
        for (sub = 1; !(sub > 2); sub += 1) {
        }
        flatfile.close();
        flatfile.open("INPUT");
        CobolDisplay.display("List after extend Open Sts:" + String.valueOf(cust_stat));
        while (!(!String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            read_record();
        }
        flatfile.close();
        System.exit(0);
    }

    private void read_record() {
        tspfl_record.set(String.valueOf(" "));
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Read Status: " + String.valueOf(cust_stat));
        } else {
            CobolDisplay.display("Read  " + String.valueOf(cm_cust_num) + " Trms:" + String.valueOf(cm_no_terminals));
        }
    }

    private void loadfile() {
        CobolDisplay.display("Loading sample program data file.");
        flatfile.open("OUTPUT");
        for (sub = 1; !(sub > max_sub); sub += 1) {
        }
        CobolDisplay.display("Sample program data file load complete.");
        flatfile.close();
    }

    private void load_record() {
        tspfl_record.set(String.valueOf(" "));
        cm_cust_num.set(String.valueOf(data_cust_num[sub - 1]));
        cm_company.set(String.valueOf(data_company[sub - 1]));
        cm_no_terminals = new BigDecimal(String.valueOf(data_no_terminals[sub - 1]).trim()).intValue();
        cm_pk_date = new BigDecimal(String.valueOf(20070319).trim()).longValue();
        if (sub == 5) {
            cm_trailer.set(String.valueOf("Freddy Kruger"));
        }
        if (((sub == 1 || sub == 4) || sub == 6)) {
            cm_pk_date = new BigDecimal(String.valueOf(-20070319).trim()).longValue();
        }
        if (!String.valueOf(odd_record).trim().isEmpty()) {
            cm_disk.set(String.valueOf("8417"));
        } else {
            cm_disk.set(String.valueOf("8470"));
        }
        flatfile.write(tspfl_record);
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Write Error " + String.valueOf(cust_stat));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile091LineSequentialRewrite().run();
    }
}
