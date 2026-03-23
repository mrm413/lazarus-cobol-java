package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc138TraceFeatureWithSubroutine extends CobolProgram {
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
    private short max_sub = (short) 0;
    private int call_num = 0;
    private CobolString test_data = new CobolString(1); // Group: TEST-DATA
    private CobolString data_cust_num_tbl = new CobolString(1); // Group: DATA-CUST-NUM-TBL
    private CobolString[] data_cust_num = new CobolString[16];
    private CobolString data_company_tbl = new CobolString(1); // Group: DATA-COMPANY-TBL
    private CobolString[] data_company = new CobolString[16];
    private CobolString data_address_1_tbl = new CobolString(1); // Group: DATA-ADDRESS-1-TBL
    private CobolString[] data_address_1 = new CobolString[16];
    private CobolString data_address_2_tbl = new CobolString(1); // Group: DATA-ADDRESS-2-TBL
    private CobolString[] data_address_2 = new CobolString[16];
    private CobolString data_address_3_tbl = new CobolString(1); // Group: DATA-ADDRESS-3-TBL
    private CobolString[] data_address_3 = new CobolString[16];
    private CobolString data_telephone_tbl = new CobolString(1); // Group: DATA-TELEPHONE-TBL
    private int[] data_telephone = new int[16];
    private CobolString data_dp_mgr_tbl = new CobolString(1); // Group: DATA-DP-MGR-TBL
    private CobolString[] data_dp_mgr = new CobolString[16];
    private CobolString data_machine_tbl = new CobolString(1); // Group: DATA-MACHINE-TBL
    private CobolString[] data_machine = new CobolString[16];
    private CobolString data_no_terminals_tbl = new CobolString(1); // Group: DATA-NO-TERMINALS-TBL
    private BigDecimal[] data_no_terminals = new BigDecimal[16];
    private CobolString work_area = new CobolString(1); // Group: WORK-AREA
    private int rec_num = 0;
    private int rec_max = 0;
    private short sub = (short) 0;
    private CobolString tspfl_key = new CobolString(8);

    // FILE SECTION — TSPFILE
    private CobolString tspfl_record = new CobolString(1); // Group: TSPFL-RECORD
    private CobolString tspfl_rec = new CobolString(1); // Group: TSPFL-REC
    private CobolString cm_cust_num = new CobolString(1); // Group: CM-CUST-NUM
    private CobolString cm_cust_pre = new CobolString(3);
    private CobolString cm_cust_nnn = new CobolString(5);
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

    // FILE SECTION — TSTFILE
    private CobolString tstfl_record = new CobolString(1); // Group: TSTFL-RECORD
    private CobolString tstfl_rec = new CobolString(1); // Group: TSTFL-REC
    private CobolString ts_cust_num = new CobolString(8);
    private CobolString ts_status = new CobolString(1);
    private CobolString ts_company = new CobolString(25);
    private CobolString ts_address_1 = new CobolString(25);
    private CobolString ts_address_2 = new CobolString(25);
    private CobolString ts_address_3 = new CobolString(25);
    private int ts_telephone = 0;
    private CobolString ts_dp_mgr = new CobolString(25);
    private CobolString ts_machine = new CobolString(8);
    private CobolString ts_memory = new CobolString(4);
    private CobolString ts_disk = new CobolString(8);
    private CobolString ts_tape = new CobolString(8);

    // FILE SECTION — FLATFILE
    private CobolString tsp2_record = new CobolString(1); // Group: TSP2-RECORD
    private CobolString c2_cust_num = new CobolString(8);
    private CobolString c2_company = new CobolString(25);
    private CobolString c2_disk = new CobolString(8);
    private short c2_no_terminals = (short) 0;
    private BigDecimal c2_pk_date = BigDecimal.ZERO;


    // FILE DESCRIPTORS
    private CobolFile tspfile = new CobolFile("testisam", "INDEXED", "DYNAMIC");
    // File status: CUST-STAT
    private CobolFile tstfile = new CobolFile("testisam", "INDEXED", "DYNAMIC");
    // File status: CUST-STAT
    private CobolFile flatfile = new CobolFile("RELFIX", "RELATIVE", "RANDOM");
    // File status: CUST-STAT

    private CobolString odd_record = new CobolString(256);

    private void mainfile() {
        tspfile.open("OUTPUT");
    }

    private void tspfile() {
        tspfile.open("I-O");
        cust_stat.set(String.valueOf("99"));
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD WITH NO LOCK */
        if (!String.valueOf(cust_stat).equals(String.valueOf("10"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " on read of empty file");
            System.exit(0);
        }
    }

    private void tspfl_record() {
        tspfile.start();
        if (!String.valueOf(cust_stat).equals(String.valueOf("23"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " starting empty file");
            System.exit(0);
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD WITH NO LOCK */
        if (!String.valueOf(cust_stat).equals(String.valueOf("46"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " start/read of empty file");
            System.exit(0);
        }
        CobolDisplay.display("OK: Operations on empty file");
    }

    private void tspfile_2() {
        loadfile();
        listfile();
        System.exit(0);
    }

    private void loadfile() {
        CobolDisplay.display("Loading sample data file.");
        tspfile.open("OUTPUT");
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " opening 'testisam' file");
            System.exit(0);
        }
        _1000();
        /* RAW: - LOAD-RECORD VARYING SUB FROM 1 */
    }

    private void max_sub() {
        CobolDisplay.display("Sample data file load complete.");
    }

    private void tspfile_3() {
        /* RAW: * - - - - - */
    }

    private void load_record() {
    }

    private void tspfl_record_2() {
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
        tspfile.write(tspfl_record);
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Load - Key: " + String.valueOf(tspfl_key) + ", Status: " + String.valueOf(cust_stat));
        }
    }

    private void listfile() {
        CobolDisplay.display("LIST SAMPLE FILE");
        tstfile.open("INPUT");
    }

    private void tstfl_record() {
    }

    private void cm_cust_num_2() {
        tstfile.start();
        if (tstfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        if (tstfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
    }

    private void tstfile() {
        rec_num = new BigDecimal(String.valueOf(0).trim()).intValue();
        tspfile.open("INPUT");
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("ERROR " + String.valueOf(cust_stat) + " OPENING INPUT FILE");
            System.exit(0);
        }
    }

    private void tspfl_record_3() {
    }

    private void cm_cust_num_3() {
        tspfile.start();
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
    }

    private void tspfl_record_4() {
    }

    private void cm_cust_num_4() {
        tspfile.start();
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " starting file");
            System.exit(0);
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD WITH NO LOCK */
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " on 1st read of file");
            System.exit(0);
        }
        while (!((!String.valueOf(cust_stat).equals(String.valueOf("00")) || rec_num > rec_max))) {
            CobolDisplay.display("Key: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Disk=" + String.valueOf(cm_disk) + ".");
            CobolProgram.call("callsub", call_num);
            if (tspfile.read(null) == FileStatus.AT_END) {
            }
            /* NEXT SENTENCE */
            /* RAW: RECORD AT END */
            cust_stat.set(String.valueOf("99"));
            /* RAW: END-READ  */
            rec_num = new BigDecimal(String.valueOf(rec_num + 1).trim()).intValue();
        }
        if (String.valueOf(cust_stat).equals(String.valueOf("99"))) {
            CobolDisplay.display("Hit End of File: " + String.valueOf(call_num));
        } else {
            CobolDisplay.display("Stop read after: " + String.valueOf(call_num));
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
        }
        CobolDisplay.display("Key: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Disk=" + String.valueOf(cm_disk) + ".");
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* RAW: PREVIOUS RECORD AT END */
        cust_stat.set(String.valueOf("99"));
        rec_num = new BigDecimal(String.valueOf(rec_num + 1).trim()).intValue();
    }

    private void tspfile_4() {
    }

    private void tspfile_5() {
    }

    private void tspfl_record_5() {
    }

    private void cm_cust_num_5() {
        cm_cust_num.setRefMod(5, 1, String.valueOf("X"));
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(cust_stat).equals(String.valueOf("23"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " instead of 23.");
        }
    }

    private void cm_cust_num_6() {
    }

    private void cm_company_2() {
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " on primary read .");
        } else {
            CobolDisplay.display("Got: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Disk=" + String.valueOf(cm_disk) + ".");
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " on next read");
        } else {
            CobolDisplay.display("Nxt: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Disk=" + String.valueOf(cm_disk) + ".");
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
            CobolDisplay.display("Ky2: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Mach=" + String.valueOf(cm_machine) + ".");
        }
        tspfile.write(tspfl_record);
        if (!String.valueOf(cust_stat).equals(String.valueOf("22"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " instead of 22");
        } else {
            CobolDisplay.display("  Write: " + String.valueOf(cm_cust_num) + " got 22 as expected");
        }
    }

    private void cm_cust_num_7() {
    }

    private void cm_company_3() {
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display("   Read: " + String.valueOf(cm_cust_num) + " got " + String.valueOf(cust_stat) + " as expected " + String.valueOf(cm_no_terminals) + " terminals");
        cm_no_terminals = new BigDecimal(String.valueOf(cm_no_terminals + 5).trim()).intValue();
        tspfile.rewrite(tspfl_record);
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " instead of 00");
        } else {
            CobolDisplay.display("ReWrite: " + String.valueOf(cm_cust_num) + " got " + String.valueOf(cust_stat) + " as expected " + String.valueOf(cm_no_terminals) + " terminals");
        }
    }

    private void cm_cust_num_8() {
    }

    private void cm_company_4() {
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display("   Read: " + String.valueOf(cm_cust_num) + " got " + String.valueOf(cust_stat) + " as expected " + String.valueOf(cm_no_terminals) + " terminals");
    }

    private void cm_cust_num_9() {
    }

    private void cm_company_5() {
        tspfile.rewrite(tspfl_record);
        if ((!String.valueOf(cust_stat).equals(String.valueOf("02")) && !String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " instead of 00/02");
        } else {
            CobolDisplay.display("ReWrite: " + String.valueOf(cm_cust_num) + " got " + "00/02 as expected");
        }
    }

    private void cm_cust_num_10() {
    }

    private void cm_company_6() {
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
    }

    private void cm_telephone_3() {
    }

    private void cm_machine_3() {
        tspfile.rewrite(tspfl_record);
        if ((!String.valueOf(cust_stat).equals(String.valueOf("02")) && !String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " instead of 00/02");
        } else {
            CobolDisplay.display("ReWrite: " + String.valueOf(cm_cust_num) + " got " + "00/02 as expected");
        }
        tspfile.delete();
    }

    private void tspfile_6() {
    }

    private void loadflat() {
    }

    private void flatfile() {
        for (sub = 1; !((sub > max_sub || sub > 5)); sub += 1) {
        }
    }

    private void flatfile_2() {
    }

    private void flatfile_3() {
        rec_num = new BigDecimal(String.valueOf(3).trim()).intValue();
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        rec_num = new BigDecimal(String.valueOf(999).trim()).intValue();
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
    }

    private void flatfile_4() {
    }

    private void flat_record() {
    }

    private void tsp2_record() {
    }

    private void rec_num() {
    }

    private void c2_cust_num() {
    }

    private void c2_company() {
    }

    private void c2_no_terminals() {
    }

    private void c2_pk_date() {
        if (!String.valueOf(odd_record).trim().isEmpty()) {
            c2_disk.set(String.valueOf("8417"));
        } else {
            /* RAW: C2-DISK  */
        }
        flatfile.write(tsp2_record);
    }

    private void _1000() { /* stub — external/COPY */ }

    @Override
    public void run() {
        mainfile();
    }

    public static void main(String[] args) {
        new RunMisc138TraceFeatureWithSubroutine().run();
    }
}
