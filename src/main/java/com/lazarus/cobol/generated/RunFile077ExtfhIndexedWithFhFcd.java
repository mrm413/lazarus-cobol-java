package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile077ExtfhIndexedWithFhFcd extends CobolProgram {
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
    private int idx = 0;
    private int idx2 = 0;
    private CobolString out_file_name = new CobolString(9);
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
    private CobolString work_area = new CobolString(1); // Group: WORK-AREA
    private int rec_num = 0;
    private int sub = 0;
    private CobolString tspfl_key = new CobolString(8);
    private long kc_ptr = 0L;

    // LINKAGE SECTION
    private CobolString tsp_fcd = new CobolString(1);

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


    // FILE DESCRIPTORS
    private CobolFile tspfile = new CobolFile("mytstisam", "INDEXED", "DYNAMIC");
    // File status: CUST-STAT

    private CobolString address = new CobolString(256);
    private CobolString fcd_other_flags = new CobolString(256);
    private CobolString key_nkeys = new CobolString(256);
    private CobolString kdb_len = new CobolString(256);
    private CobolString fcd_filename_address = new CobolString(256);
    private CobolString tsp_filename = new CobolString(256);
    private CobolString[] key_flags = new CobolString[100];
    private CobolString[] key_sparse = new CobolString[100];
    private CobolString[] key_count = new CobolString[100];
    private CobolString[] key_offset = new CobolString[100];
    private CobolString[] key_compression = new CobolString[100];
    private CobolString kc_pos = new CobolString(256);
    private CobolString kc_len = new CobolString(256);
    private CobolString key_comp = new CobolString(256);
    private CobolString odd_record = new CobolString(256);
    private CobolString null_key = new CobolString(256);

    private CobolString fcd_name_length = new CobolString(256);
    private void mainfile() {
        address.set(String.valueOf(address));
        address.set(String.valueOf(address));
        CobolDisplay.display("Other Flags " + String.valueOf(fcd_other_flags) + ".");
        CobolDisplay.display("File has " + String.valueOf(key_nkeys) + " keys.");
        CobolDisplay.display("Key def  " + String.valueOf(kdb_len) + " bytes.");
        address.set(String.valueOf(fcd_filename_address));
    // CobolDisplay.display("File assigned is '" + String.valueOf(CobolString.refMod(tsp_filename, 1, fcd_name_length)) + "'");
        fcd_filename_address.set(String.valueOf(address));
    }

    private void fcd_name_length() {
        CobolDisplay.display("*** Dump FCD before changes");
        dump_fcd();
        if (key_flags[2 - 1] == null) key_flags[2 - 1] = new CobolString(256);
        key_flags[2 - 1].set(String.valueOf(64));
        if (key_flags[3 - 1] == null) key_flags[3 - 1] = new CobolString(256);
        key_flags[3 - 1].set(String.valueOf(66));
        if (key_sparse[3 - 1] == null) key_sparse[3 - 1] = new CobolString(256);
        key_sparse[3 - 1].set(String.valueOf("*"));
        CobolDisplay.display("*** Dump FCD after changes");
        dump_fcd();
        loadfile();
        listfile();
        System.exit(0);
    }

    private void dump_fcd() {
        for (idx = 1; !(idx > Integer.parseInt(String.valueOf(key_nkeys).trim())); idx += 1) {
            if (String.valueOf(key_sparse[idx - 1]).compareTo(String.valueOf(" ")) < 0) {
                if (key_sparse[idx - 1] == null) key_sparse[idx - 1] = new CobolString(256);
                key_sparse[idx - 1].set(String.valueOf(" "));
            }
            CobolDisplay.display("Key" + String.valueOf(idx) + " has " + String.valueOf(key_count[idx - 1]) + " parts," + " Offset " + String.valueOf(key_offset[idx - 1]) + " Flags " + String.valueOf(key_flags[idx - 1]) + " Comp " + String.valueOf(key_compression[idx - 1]) + " Sparse " + String.valueOf(key_sparse[idx - 1]) + ".");
    // kc_ptr = new BigDecimal(String.valueOf(address).trim()).longValue();
    // kc_ptr += key_offset[idx - 1];
            for (idx2 = 1; !(idx2 > Integer.parseInt(String.valueOf(key_count[idx - 1]).trim())); idx2 += 1) {
                address.set(String.valueOf(kc_ptr));
                CobolDisplay.display("      Pos " + String.valueOf(kc_pos) + " Len " + String.valueOf(kc_len));
                kc_ptr += CobolIntrinsics.length(key_comp);
            }
        }
    }

    private void loadfile() {
        tspfile.open("OUTPUT");
        address.set(String.valueOf(fcd_filename_address));
    // CobolDisplay.display("Loading sample file '" + String.valueOf(CobolString.refMod(tsp_filename, 1, fcd_name_length)) + "'");
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("05")))) {
    // CobolDisplay.display("Error " + String.valueOf(cust_stat) + " opening '" + String.valueOf(CobolString.refMod(tsp_filename, 1, fcd_name_length)) + "' file");
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
        if ((sub == 1 || true)) {
            cm_disk.set(String.valueOf("2417"));
            /* RAW: CM-TAPE  */
        }
        tspfile.write(tspfl_record);
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("WRITE: " + String.valueOf(tspfl_key) + ", Status: " + String.valueOf(cust_stat));
        }
    }

    private void listfile() {
        rec_num = new BigDecimal(String.valueOf(0).trim()).intValue();
        tspfile.open("INPUT");
        address.set(String.valueOf(fcd_filename_address));
    // CobolDisplay.display("List sample file '" + String.valueOf(CobolString.refMod(tsp_filename, 1, fcd_name_length)) + "'");
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("ERROR " + String.valueOf(cust_stat) + " OPENING INPUT FILE");
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
        while (!((!String.valueOf(cust_stat).equals(String.valueOf("00")) || rec_num > max_sub))) {
            CobolDisplay.display("Key: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Disk=" + String.valueOf(cm_disk) + ".");
            if (tspfile.read(null) == FileStatus.AT_END) {
            }
            /* NEXT SENTENCE */
            /* RAW: RECORD AT END */
            cust_stat.set(String.valueOf("99"));
            /* RAW: END-READ  */
            rec_num = new BigDecimal(String.valueOf(rec_num + 1).trim()).intValue();
        }
        if (String.valueOf(cust_stat).equals(String.valueOf("99"))) {
            CobolDisplay.display("Hit End of File after " + String.valueOf(rec_num));
        }
        CobolDisplay.display("LIST SAMPLE FILE DESCENDING");
        rec_num = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void tspfl_record_3() {
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
        while (!((!String.valueOf(cust_stat).equals(String.valueOf("00")) || rec_num > max_sub))) {
            CobolDisplay.display("Key: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Disk=" + String.valueOf(cm_disk) + ".");
            if (tspfile.read(null) == FileStatus.AT_END) {
            }
            /* RAW: PREVIOUS RECORD AT END */
            cust_stat.set(String.valueOf("99"));
            /* RAW: END-READ  */
            rec_num = new BigDecimal(String.valueOf(rec_num + 1).trim()).intValue();
        }
        if (String.valueOf(cust_stat).equals(String.valueOf("99"))) {
            CobolDisplay.display("Hit End of File after " + String.valueOf(rec_num));
        }
        CobolDisplay.display("LIST SAMPLE FILE BY KEY3");
        rec_num = new BigDecimal(String.valueOf(0).trim()).intValue();
    }

    private void tspfl_record_4() {
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
        while (!(((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02"))) || rec_num > max_sub))) {
            CobolDisplay.display("Key: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + " Disk=" + String.valueOf(cm_disk) + ".");
            if (tspfile.read(null) == FileStatus.AT_END) {
            }
            /* NEXT SENTENCE */
            /* RAW: RECORD AT END */
            cust_stat.set(String.valueOf("99"));
            /* RAW: END-READ  */
            rec_num = new BigDecimal(String.valueOf(rec_num + 1).trim()).intValue();
        }
        if (String.valueOf(cust_stat).equals(String.valueOf("99"))) {
            CobolDisplay.display("Hit End of File after " + String.valueOf(rec_num));
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
        new RunFile077ExtfhIndexedWithFhFcd().run();
    }
}
