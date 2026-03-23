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

    private CobolString odd_record = new CobolString(256);
    private CobolString _unnamed = new CobolString(256);

    private void para_main() {
        loadfile();
    }

    private void flatfile() {
        CobolDisplay.display("Initial Re-Read Open Sts:" + String.valueOf(cust_stat));
        while (!(!String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            read_record();
        }
        if (String.valueOf(cust_stat).equals(String.valueOf("30"))) {
            flatfile.close();
            System.exit(0);
        }
    }

    private void flatfile_2() {
    }

    private void flatfile_3() {
        CobolDisplay.display("For Rewrite Open I-O Sts:" + String.valueOf(cust_stat));
        read_record();
        c2_no_terminals = new BigDecimal(String.valueOf(c2_no_terminals + 1).trim()).shortValue();
        flatfile.rewrite(tsp2_record);
        CobolDisplay.display("REWRITE " + String.valueOf(cm_cust_num) + " Sts " + String.valueOf(cust_stat) + " Trms:");
    }

    private void c2_no_terminals() {
    }

    private void flatfile_4() {
    }

    private void flatfile_5() {
        CobolDisplay.display("For Rewrite/Delete Open I-O Sts:" + String.valueOf(cust_stat));
        read_record();
        c2_no_terminals = new BigDecimal(String.valueOf(c2_no_terminals + 1).trim()).shortValue();
        flatfile.rewrite(tsp2_record);
        CobolDisplay.display("REWRITE " + String.valueOf(cm_cust_num) + " Sts " + String.valueOf(cust_stat) + " Trms:");
    }

    private void c2_no_terminals_2() {
        read_record();
        flatfile.delete();
        CobolDisplay.display("DELETE " + String.valueOf(cm_cust_num) + " Sts ");
    }

    private void cust_stat() {
    }

    private void flatfile_6() {
    }

    private void flatfile_7() {
        CobolDisplay.display("Re-list Open Sts:" + String.valueOf(cust_stat));
        while (!(!String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            read_record();
        }
    }

    private void flatfile_8() {
    }

    private void flatfile_9() {
        for (sub = 1; !(sub > 2); sub += 1) {
        }
    }

    private void flatfile_10() {
    }

    private void flatfile_11() {
        CobolDisplay.display("Re-list afer Extend Open Sts:" + String.valueOf(cust_stat));
        while (!(!String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            read_record();
        }
    }

    private void flatfile_12() {
        System.exit(0);
    }

    private void loadfile() {
        CobolDisplay.display("Loading sample program data file.");
    }

    private void flatfile_13() {
        for (sub = 1; !(sub > max_sub); sub += 1) {
        }
        CobolDisplay.display("Sample program data file load complete.");
    }

    private void flatfile_14() {
    }

    private void read_record() {
    }

    private void tspfl_record() {
    }

    private void tsp2_record() {
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
        /* RAW: *  */
    }

    private void load_record() {
    }

    private void tspfl_record_2() {
    }

    private void tsp2_record_2() {
    }

    private void cm_cust_num() {
    }

    private void cm_company() {
    }

    private void cm_no_terminals() {
    }

    private void cm_pk_date() {
        if (((sub == 1 || true) || true)) {
            /* RAW: CM-PK-DATE  */
        }
        /* RAW: *  */
        if (!String.valueOf(odd_record).trim().isEmpty()) {
            c2_disk.set(String.valueOf("8417"));
            _unnamed.set(String.valueOf("8417"));
            c2_cust_num.set(String.valueOf(cm_cust_num));
            c2_type.set(String.valueOf("2"));
            _unnamed.set(String.valueOf("2"));
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
