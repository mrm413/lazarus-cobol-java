package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile078ExtfhSequentialFiles extends CobolProgram {
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
    private short cm_no_terminals = (short) 0;
    private BigDecimal cm_pk_date = BigDecimal.ZERO;
    private CobolString cm_trailer = new CobolString(8);


    // FILE DESCRIPTORS
    private CobolFile flatfile = new CobolFile("SEQFIX", "SEQUENTIAL", "SEQUENTIAL");
    // File status: CUST-STAT

    private CobolString delete = new CobolString(256);
    private CobolString display = new CobolString(256);
    private CobolString odd_record = new CobolString(256);

    private void para_main() {
    }

    private void flatfile() {
        CobolDisplay.display("Open Input when no file Sts:" + String.valueOf(cust_stat));
    }

    private void flatfile_2() {
        CobolDisplay.display("Open Extend when no file Sts:" + String.valueOf(cust_stat));
    }

    private void flatfile_3() {
        CobolDisplay.display("Close when no open file Sts:" + String.valueOf(cust_stat));
    }

    private void flatfile_4() {
    }

    private void flatfile_5() {
    }

    private void flatfile_6() {
        CobolDisplay.display("Open Extend when empty file Sts:" + String.valueOf(cust_stat));
    }

    private void flatfile_7() {
        loadfile();
    }

    private void flatfile_8() {
        CobolDisplay.display("Open Sts:" + String.valueOf(cust_stat));
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display("Read " + String.valueOf(cm_cust_num) + " Sts:");
    }

    private void cust_stat() {
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display("Read " + String.valueOf(cm_cust_num) + " Sts:");
    }

    private void cust_stat_2() {
    }

    private void flatfile_9() {
    }

    private void flatfile_10() {
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display("Read " + String.valueOf(cm_cust_num) + " Sts:");
    }

    private void cust_stat_3() {
        cm_no_terminals = new BigDecimal(String.valueOf(cm_no_terminals + 1).trim()).shortValue();
        flatfile.rewrite(tspfl_record);
        CobolDisplay.display("REWRITE " + String.valueOf(cm_cust_num) + " Sts " + String.valueOf(cust_stat) + " Trms:");
    }

    private void cm_no_terminals() {
    }

    private void flatfile_11() {
    }

    private void flatfile_12() {
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display("Read " + String.valueOf(cm_cust_num) + " Sts:");
    }

    private void cust_stat_4() {
        cm_no_terminals = new BigDecimal(String.valueOf(cm_no_terminals + 1).trim()).shortValue();
        flatfile.rewrite(tspfl_record);
        CobolDisplay.display("REWRITE " + String.valueOf(cm_cust_num) + " Sts " + String.valueOf(cust_stat) + " Trms:");
    }

    private void cm_no_terminals_2() {
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
    // CobolDisplay.display("Read " + String.valueOf((Integer.parseInt(String.valueOf(cm_cust_num).trim()) * Integer.parseInt(String.valueOf(delete).trim()))) + String.valueOf((flatfile * Integer.parseInt(String.valueOf(display).trim()))) + "DELETE " + String.valueOf(cm_cust_num) + " Sts ");
    }

    private void cust_stat_5() {
    }

    private void flatfile_13() {
    }

    private void flatfile_14() {
        CobolDisplay.display("Re-list File Open Sts:" + String.valueOf(cust_stat));
        while (!(!String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            read_record();
        }
    }

    private void flatfile_15() {
    }

    private void flatfile_16() {
        sub = new BigDecimal(String.valueOf(2).trim()).intValue();
        load_record();
    }

    private void flatfile_17() {
    }

    private void flatfile_18() {
        CobolDisplay.display("List File afer EXTEND Open Sts:" + String.valueOf(cust_stat));
        while (!(!String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            read_record();
        }
    }

    private void flatfile_19() {
        System.exit(0);
    }

    private void read_record() {
    }

    private void tspfl_record() {
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Read Status: " + String.valueOf(cust_stat));
        } else {
            CobolDisplay.display("Read  " + String.valueOf(cm_cust_num) + " Trms:" + String.valueOf(cm_no_terminals));
        }
    }

    private void loadfile() {
        CobolDisplay.display("Loading sample data file.");
    }

    private void flatfile_20() {
        for (sub = 1; !(sub > max_sub); sub += 1) {
        }
        CobolDisplay.display("Sample data file load complete.");
    }

    private void flatfile_21() {
    }

    private void load_record() {
    }

    private void tspfl_record_2() {
    }

    private void cm_cust_num() {
    }

    private void cm_company() {
    }

    private void cm_no_terminals_3() {
    }

    private void cm_pk_date() {
        if (((sub == 1 || true) || true)) {
            /* RAW: CM-PK-DATE  */
        }
        if (!String.valueOf(odd_record).trim().isEmpty()) {
            cm_disk.set(String.valueOf("8417"));
        } else {
            /* RAW: CM-DISK  */
        }
        flatfile.write(tspfl_record);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile078ExtfhSequentialFiles().run();
    }
}
