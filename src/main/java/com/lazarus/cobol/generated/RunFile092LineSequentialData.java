package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile092LineSequentialData extends CobolProgram {
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
    private static final int max_sub = 4;
    private CobolString cust_stat = new CobolString(2);
    private CobolString test_data = new CobolString(1); // Group: TEST-DATA
    private CobolString data_cust_num_tbl = new CobolString(1); // Group: DATA-CUST-NUM-TBL
    private CobolString[] data_cust_num = new CobolString[100];
    private CobolString data_company_tbl = new CobolString(1); // Group: DATA-COMPANY-TBL
    private CobolString[] data_company = new CobolString[100];
    private CobolString data_address_2_tbl = new CobolString(1); // Group: DATA-ADDRESS-2-TBL
    private CobolString[] data_address = new CobolString[100];
    private CobolString data_no_terminals_tbl = new CobolString(1); // Group: DATA-NO-TERMINALS-TBL
    private int[] data_no_terminals = new int[100];
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


    // FILE DESCRIPTORS
    private CobolFile flatfile = new CobolFile("LS-TEST", "LINE SEQUENTIAL", "SEQUENTIAL");
    // File status: CUST-STAT

    
    private CobolFile file = new CobolFile("FILE", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString environment = new CobolString(256);
    private CobolString cob_ls_validate = new CobolString(256);
    private CobolString cob_ls_nulls = new CobolString(256);
    private CobolString odd_record = new CobolString(256);

    private void para_main() {
        /* RAW: * Load file using MF rules */
        environment.set(String.valueOf("FALSE"));
        cob_ls_validate.set(String.valueOf("FALSE"));
        environment.set(String.valueOf("TRUE"));
        cob_ls_nulls.set(String.valueOf("TRUE"));
        CobolDisplay.display("MF Load data");
        loadfile();
        /* RAW: *  */
        if (file.read(null) == FileStatus.AT_END) {
        }
        /* RAW: using MF rules */
    }

    private void flatfile() {
        CobolDisplay.display("MF Open Sts: " + String.valueOf(cust_stat));
        while (!(!String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            read_record();
        }
    }

    private void flatfile_2() {
        /* RAW: *  */
        if (file.read(null) == FileStatus.AT_END) {
        }
        /* RAW: using Std rules */
        environment.set(String.valueOf("true"));
        cob_ls_validate.set(String.valueOf("true"));
        environment.set(String.valueOf("false"));
        cob_ls_nulls.set(String.valueOf("false"));
    }

    private void flatfile_3() {
        CobolDisplay.display("Std Open Sts: " + String.valueOf(cust_stat));
        while (!(!String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            read_record();
        }
    }

    private void flatfile_4() {
        /* RAW: * Load file using Std rules */
        CobolDisplay.display("Std Load data");
        loadfile();
        System.exit(0);
    }

    private void read_record() {
        /* RAW: *  */
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
    }

    private void flatfile_5() {
        for (sub = 1; !((sub > max_sub || !String.valueOf(cust_stat).equals(String.valueOf("00")))); sub += 1) {
        }
    }

    private void flatfile_6() {
    }

    private void load_record() {
    }

    private void tspfl_record_2() {
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
        if (!String.valueOf(odd_record).trim().isEmpty()) {
            cm_disk.set(String.valueOf("8417"));
        } else {
            /* RAW: CM-DISK  */
        }
        flatfile.write(tspfl_record);
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error status " + String.valueOf(cust_stat) + " writing record " + String.valueOf(data_cust_num[sub - 1]));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile092LineSequentialData().run();
    }
}
