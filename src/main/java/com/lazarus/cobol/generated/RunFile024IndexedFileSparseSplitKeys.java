package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile024IndexedFileSparseSplitKeys extends CobolProgram {
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
    private CobolString cust_stat = new CobolString(1); // Group: CUST-STAT
    private short stat_1 = (short) 0;
    private CobolString stat_x1 = new CobolString(1);
    private CobolString stat_x2 = new CobolString(1);
    private int byte_1 = 0;
    private int byte_2 = 0;
    private static final int max_sub = 16;
    private CobolString test_data = new CobolString(1); // Group: TEST-DATA
    private CobolString data_cust_num_tbl = new CobolString(1); // Group: DATA-CUST-NUM-TBL
    private CobolString[] data_cust_num = new CobolString[100];
    private CobolString data_company_tbl = new CobolString(1); // Group: DATA-COMPANY-TBL
    private CobolString[] data_company = new CobolString[100];
    private CobolString data_address_1_tbl = new CobolString(1); // Group: DATA-ADDRESS-1-TBL
    private CobolString[] data_address_1 = new CobolString[100];
    private CobolString data_address_2_tbl = new CobolString(1); // Group: DATA-ADDRESS-2-TBL
    private CobolString[] data_address_2 = new CobolString[100];
    private CobolString data_address_3_tbl = new CobolString(1); // Group: DATA-ADDRESS-3-TBL
    private CobolString[] data_address_3 = new CobolString[100];
    private CobolString data_telephone_tbl = new CobolString(1); // Group: DATA-TELEPHONE-TBL
    private int[] data_telephone = new int[100];
    private CobolString data_dp_mgr_tbl = new CobolString(1); // Group: DATA-DP-MGR-TBL
    private CobolString[] data_dp_mgr = new CobolString[100];
    private CobolString data_machine_tbl = new CobolString(1); // Group: DATA-MACHINE-TBL
    private CobolString[] data_machine = new CobolString[100];
    private CobolString data_no_terminals_tbl = new CobolString(1); // Group: DATA-NO-TERMINALS-TBL
    private BigDecimal[] data_no_terminals = new BigDecimal[100];
    private static final int rec_max = 10;
    private CobolString work_area = new CobolString(1); // Group: WORK-AREA
    private int rec_num = 0;
    private int sub = 0;
    private CobolString tspfl_key = new CobolString(8);

    // FILE SECTION — TSPFILE
    private CobolString tspfl_record = new CobolString(1); // Group: TSPFL-RECORD
    private CobolString tspfl_rec = new CobolString(1); // Group: TSPFL-REC
    private CobolString cm_cust_num = new CobolString(8);
    private CobolString cm_status = new CobolString(1);
    private CobolString cm_company = new CobolString(25);
    private CobolString cm_address_1 = new CobolString(25);
    private CobolString cm_address_2 = new CobolString(25);
    private CobolString cm_address_3 = new CobolString(25);
    private int cm_telephone = 0;
    private CobolString cm_dp_mgr = new CobolString(25);
    private CobolString cm_machine = new CobolString(8);
    private CobolString cm_memory = new CobolString(4);
    private CobolString cm_disk = new CobolString(8);
    private CobolString cm_tape = new CobolString(8);
    private int cm_no_terminals = 0;


    // FILE DESCRIPTORS
    private CobolFile tspfile = new CobolFile("testisam", "INDEXED", "DYNAMIC");
    // File status: CUST-STAT

    private CobolString odd_record = new CobolString(256);
    private CobolString null_key = new CobolString(256);

    private void mainfile() {
        loadfile();
        listfile();
        System.exit(0);
    }

    private void loadfile() {
        CobolDisplay.display("Loading sample data file.");
        tspfile.open("OUTPUT");
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            byte_1 = new BigDecimal(String.valueOf(stat_1 / 256).trim()).intValue();
            byte_2 = new BigDecimal(String.valueOf(stat_1 % 256).trim()).intValue();
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " " + String.valueOf(byte_1) + " " + String.valueOf(byte_2) + " opening 'testisam' file");
            System.exit(0);
        }
        _1000();
        /* RAW: - LOAD-RECORD VARYING SUB FROM 1 */
    }

    private void max_sub() {
        CobolDisplay.display("Sample data file load complete.");
    }

    private void tspfile() {
        /* RAW: * - - - - - */
    }

    private void load_record() {
    }

    private void tspfl_record() {
    }

    private void cm_cust_num() {
    }

    private void tspfl_key() {
    }

    private void cm_company() {
    }

    private void cm_address_1() {
    }

    private void cm_address_2() {
    }

    private void cm_address_3() {
    }

    private void cm_telephone() {
    }

    private void cm_dp_mgr() {
    }

    private void cm_machine() {
    }

    private void cm_no_terminals() {
        if (!String.valueOf(odd_record).trim().isEmpty()) {
            cm_disk.set(String.valueOf("8417"));
            cm_tape.set(String.valueOf("1600 BPI"));
            cm_memory.set(String.valueOf("1MEG"));
        } else {
            cm_disk.set(String.valueOf("8470"));
            cm_tape.set(String.valueOf("6250 BPI"));
            /* RAW: CM-MEMORY  */
        }
        if (!String.valueOf(null_key).trim().isEmpty()) {
            cm_disk.set(String.valueOf("*"));
            /* RAW: CM-TAPE  */
        }
        tspfile.write(tspfl_record);
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Key: " + String.valueOf(tspfl_key) + ", Status: " + String.valueOf(cust_stat));
        }
    }

    private void listfile() {
        CobolDisplay.display("LIST SAMPLE FILE");
        rec_num = new BigDecimal(String.valueOf(0).trim()).intValue();
        tspfile.open("INPUT");
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("ERROR " + String.valueOf(cust_stat) + " OPENING INPUT FILE ");
            if (String.valueOf(CobolString.refMod(cust_stat, 1, 1)).equals(String.valueOf("9"))) {
                CobolDisplay.display("Sub Error " + String.valueOf(stat_x2));
            }
            System.exit(0);
        }
    }

    private void tspfl_record_2() {
        tspfile.start();
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " starting file");
            if (String.valueOf(CobolString.refMod(cust_stat, 1, 1)).equals(String.valueOf("9"))) {
                CobolDisplay.display("Sub Error " + String.valueOf(stat_x2));
            }
            System.exit(0);
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD WITH NO LOCK */
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " on 1st read of file");
            if (String.valueOf(CobolString.refMod(cust_stat, 1, 1)).equals(String.valueOf("9"))) {
                CobolDisplay.display("Sub Error " + String.valueOf(stat_x2));
            }
            System.exit(0);
        }
        while (!((!String.valueOf(cust_stat).equals(String.valueOf("00")) || rec_num > rec_max))) {
            CobolDisplay.display("Key: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Disk=" + String.valueOf(cm_disk) + ":");
            if (tspfile.read(null) == FileStatus.AT_END) {
            }
            /* NEXT SENTENCE */
            /* RAW: RECORD AT END */
            cust_stat.set(String.valueOf("99"));
            /* RAW: END-READ  */
            rec_num = new BigDecimal(String.valueOf(rec_num + 1).trim()).intValue();
        }
        if (String.valueOf(cust_stat).equals(String.valueOf("99"))) {
            CobolDisplay.display("Hit End of File");
        }
        CobolDisplay.display("LIST SAMPLE FILE DESCENDING");
        rec_num = new BigDecimal(String.valueOf(0).trim()).intValue();
        tspfile.start();
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " starting file");
            System.exit(0);
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* RAW: PREVIOUS RECORD WITH NO LOCK */
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " on 1st read of file");
            System.exit(0);
        }
        while (!((!String.valueOf(cust_stat).equals(String.valueOf("00")) || rec_num > rec_max))) {
            CobolDisplay.display("Key: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Disk=" + String.valueOf(cm_disk) + ":");
            if (tspfile.read(null) == FileStatus.AT_END) {
            }
            /* RAW: PREVIOUS RECORD AT END */
            cust_stat.set(String.valueOf("99"));
            /* RAW: END-READ  */
            rec_num = new BigDecimal(String.valueOf(rec_num + 1).trim()).intValue();
        }
        CobolDisplay.display("LIST SAMPLE FILE BY KEY3");
        rec_num = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void tspfl_record_3() {
        tspfile.start();
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " starting file");
            System.exit(0);
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD WITH NO LOCK */
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " on 1st read of file");
            System.exit(0);
        }
        while (!(((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02"))) || rec_num > rec_max))) {
            CobolDisplay.display("Key: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Disk=" + String.valueOf(cm_disk) + ":");
            if (tspfile.read(null) == FileStatus.AT_END) {
            }
            /* NEXT SENTENCE */
            /* RAW: RECORD AT END */
            cust_stat.set(String.valueOf("99"));
            /* RAW: END-READ  */
            rec_num = new BigDecimal(String.valueOf(rec_num + 1).trim()).intValue();
        }
        /* RAW: * - - - - Some */
    }

    private void tspfl_record_4() {
    }

    private void cm_cust_num_2() {
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(cust_stat).equals(String.valueOf("23"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " instead of 23");
        }
    }

    private void cm_company_2() {
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " on primary read ");
        } else {
            CobolDisplay.display("Got: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Disk=" + String.valueOf(cm_disk) + ":");
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " on next read ");
        } else {
            CobolDisplay.display("Nxt: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Disk=" + String.valueOf(cm_disk) + ":");
        }
    }

    private void cm_telephone_2() {
    }

    private void cm_machine_2() {
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " instead of 23");
        } else {
            CobolDisplay.display("Ky2: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Mach=" + String.valueOf(cm_machine) + ":");
        }
    }

    private void tspfile_2() {
    }

    private void _1000() { /* stub — external/COPY */ }

    @Override
    public void run() {
        mainfile();
    }

    public static void main(String[] args) {
        new RunFile024IndexedFileSparseSplitKeys().run();
    }
}
