package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile089IndexedFileReadDeleteRead extends CobolProgram {
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
    private CobolString data_stat = new CobolString(2);
    private CobolString isam_stat = new CobolString(2);
    private int byte_1 = 0;
    private int byte_2 = 0;
    private static final int max_sub = 16;
    private CobolString sav_key = new CobolString(8);
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
    private static final String rec_max = "MAX-SUB";
    private CobolString work_area = new CobolString(1); // Group: WORK-AREA
    private int rec_num = 0;
    private int sub = 0;
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


    // FILE DESCRIPTORS
    private CobolFile tspfile = new CobolFile("TSPFILE", "INDEXED", "DYNAMIC");
    // File status: CUST-STAT

    private CobolString odd_record = new CobolString(256);
    private CobolString null_key = new CobolString(256);

    private void mainfile() {
        CobolDisplay.display("Loading sample data file.");
        loadfile();
        CobolDisplay.display("Sample data file load complete.");
        list_file();
        list_phone();
        delseq_file();
        list_phone();
        loadfile();
        list_phone();
        delprv_file();
        list_phone();
        /* RAW: *  */
        del_file();
        System.exit(0);
    }

    private void loadfile() {
        tspfile.open("OUTPUT");
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("05")))) {
            byte_1 = new BigDecimal(String.valueOf(stat_1 / 256).trim()).intValue();
            byte_2 = new BigDecimal(String.valueOf(stat_1 % 256).trim()).intValue();
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " " + String.valueOf(byte_1) + " " + String.valueOf(byte_2) + " opening 'testisam' file");
            System.exit(0);
        }
        _1000();
        /* RAW: - LOAD-RECORD VARYING SUB FROM 1 */
    }

    private void max_sub() {
    }

    private void tspfile() {
    }

    private void del_file() {
        CobolDisplay.display("Rewrite sample data file: " + String.valueOf(cust_stat));
        tspfile.open("I-O");
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("05")))) {
            byte_1 = new BigDecimal(String.valueOf(stat_1 / 256).trim()).intValue();
            byte_2 = new BigDecimal(String.valueOf(stat_1 % 256).trim()).intValue();
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " " + String.valueOf(byte_1) + " " + String.valueOf(byte_2) + " opening 'testisam' file");
            System.exit(0);
        }
        cm_cust_num.set(String.valueOf("DEL00000"));
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read lock " + String.valueOf(cm_cust_num));
        }
        tspfile.delete();
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " delete " + String.valueOf(cm_cust_num));
        }
        cm_cust_num.set(String.valueOf("INC00000"));
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read lock " + String.valueOf(cm_cust_num));
        }
        tspfile.delete();
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " delete " + String.valueOf(cm_cust_num));
        }
        CobolDisplay.display("Sample data file rewrite complete.");
    }

    private void tspfile_2() {
    }

    private void delseq_file() {
        CobolDisplay.display("Test Read/Delete");
    }

    private void cust_stat() {
        tspfile.open("I-O");
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("05")))) {
            byte_1 = new BigDecimal(String.valueOf(stat_1 / 256).trim()).intValue();
            byte_2 = new BigDecimal(String.valueOf(stat_1 % 256).trim()).intValue();
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " " + String.valueOf(byte_1) + " " + String.valueOf(byte_2) + " opening 'testisam' file");
            System.exit(0);
        }
        cm_cust_num.set(String.valueOf("INC00000"));
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        }
        tspfile.delete();
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " delete " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display(" Delete: " + String.valueOf(cm_cust_num) + " random");
        }
        cm_cust_num.set(String.valueOf("ALP00000"));
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        }
        tspfile.delete();
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " delete " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display(" Delete: " + String.valueOf(cm_cust_num) + " random");
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display("   Read: " + String.valueOf(cm_cust_num) + " " + String.valueOf(cm_telephone));
        }
        cm_cust_num.set(String.valueOf("PRE00000"));
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        }
        tspfile.delete();
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " delete " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display(" Delete: " + String.valueOf(cm_cust_num) + " random");
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Expected " + String.valueOf(cust_stat) + " after delete " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display("   Read: " + String.valueOf(cm_cust_num) + " " + String.valueOf(cm_telephone));
        }
        tspfl_record.set(String.valueOf(" "));
        cm_telephone = new BigDecimal(String.valueOf("4169898509").trim()).intValue();
        tspfile.start();
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        }
        for (int _i0 = 0; _i0 < 4; _i0++) {
            if (tspfile.read(null) == FileStatus.AT_END) {
            }
            /* NEXT SENTENCE */
            /* RAW: RECORD  */
            if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
                CobolDisplay.display("Error " + String.valueOf(cust_stat) + " start " + String.valueOf(cm_cust_num));
            } else {
                CobolDisplay.display("Initial: " + String.valueOf(cm_cust_num) + " " + String.valueOf(cm_telephone));
                if (String.valueOf(cm_telephone).equals(String.valueOf("4169898509"))) {
                    sav_key.set(String.valueOf(cm_cust_num));
                }
            }
        }
        tspfl_record.set(String.valueOf(" "));
        cm_telephone = new BigDecimal(String.valueOf("4169898509").trim()).intValue();
        tspfile.start();
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " start " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display("  Start: " + String.valueOf(cm_cust_num) + " " + String.valueOf(cm_telephone));
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display("   Next: " + String.valueOf(cm_cust_num) + " " + String.valueOf(cm_telephone));
        }
        tspfile.delete();
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " delete " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display(" Delete: " + String.valueOf(cm_cust_num) + " sequential");
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display("   Next: " + String.valueOf(cm_cust_num) + " " + String.valueOf(cm_telephone));
            if (!String.valueOf(cm_cust_num).equals(String.valueOf(sav_key))) {
                CobolDisplay.display("Problem! Expected:" + String.valueOf(sav_key));
            }
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display("   Next: " + String.valueOf(cm_cust_num) + " " + String.valueOf(cm_telephone));
        }
        tspfile.delete();
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " delete " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display(" Delete: " + String.valueOf(cm_cust_num) + " sequential");
        }
    }

    private void tspfile_3() {
    }

    private void delprv_file() {
        CobolDisplay.display("Read Prev/Delete");
    }

    private void cust_stat_2() {
        tspfile.open("I-O");
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("05")))) {
            byte_1 = new BigDecimal(String.valueOf(stat_1 / 256).trim()).intValue();
            byte_2 = new BigDecimal(String.valueOf(stat_1 % 256).trim()).intValue();
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " " + String.valueOf(byte_1) + " " + String.valueOf(byte_2) + " opening 'testisam' file");
            System.exit(0);
        }
        tspfl_record.set(String.valueOf(" "));
        cm_telephone = new BigDecimal(String.valueOf("5292398745").trim()).intValue();
        tspfile.start();
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        }
        for (rec_num = 1; !(rec_num > 4); rec_num += 1) {
            if (tspfile.read(null) == FileStatus.AT_END) {
            }
            /* RAW: PREVIOUS RECORD */
            if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
                CobolDisplay.display("Error " + String.valueOf(cust_stat) + " start " + String.valueOf(cm_cust_num));
            } else {
                CobolDisplay.display(String.valueOf(rec_num) + " Initial: " + String.valueOf(cm_cust_num) + " " + String.valueOf(cm_telephone));
                if (rec_num == 3) {
                    sav_key.set(String.valueOf(cm_cust_num));
                }
            }
        }
        tspfl_record.set(String.valueOf(" "));
        cm_telephone = new BigDecimal(String.valueOf("5292398745").trim()).intValue();
        tspfile.start();
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* RAW: PREVIOUS RECORD */
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " start " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display("  Start: " + String.valueOf(cm_cust_num) + " " + String.valueOf(cm_telephone));
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* RAW: PREVIOUS RECORD */
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display("   Prev: " + String.valueOf(cm_cust_num) + " " + String.valueOf(cm_telephone));
        }
        tspfile.delete();
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " delete " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display(" Delete: " + String.valueOf(cm_cust_num) + " sequential");
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* RAW: PREVIOUS RECORD */
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read prev " + String.valueOf(cm_cust_num));
            tspfile.close();
            System.exit(0);
        } else {
            CobolDisplay.display("   Prev: " + String.valueOf(cm_cust_num) + " " + String.valueOf(cm_telephone));
            if (!String.valueOf(cm_cust_num).equals(String.valueOf(sav_key))) {
                CobolDisplay.display("Problem! Expected:" + String.valueOf(sav_key));
                tspfile.close();
                System.exit(0);
            }
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* RAW: PREVIOUS RECORD */
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read prev " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display("   Prev: " + String.valueOf(cm_cust_num) + " " + String.valueOf(cm_telephone));
        }
        tspfile.delete();
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " delete " + String.valueOf(cm_cust_num));
        } else {
            CobolDisplay.display(" Delete: " + String.valueOf(cm_cust_num) + " sequential");
        }
    }

    private void tspfile_4() {
    }

    private void list_file() {
        CobolDisplay.display("List sample data file");
    }

    private void cust_stat_3() {
    }

    private void rec_num() {
        tspfile.open("I-O");
        cm_cust_num.set(String.valueOf("        "));
        tspfile.start();
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD AT END */
        cust_stat.set(String.valueOf("99"));
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " first read " + String.valueOf(cm_cust_num));
        }
        while (!((!String.valueOf(cust_stat).equals(String.valueOf("00")) || rec_num > Integer.parseInt(String.valueOf(rec_max).trim())))) {
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
            CobolDisplay.display("Hit End of File");
        }
    }

    private void tspfile_5() {
    }

    private void list_phone() {
        CobolDisplay.display("List sample data file by Phone");
    }

    private void cust_stat_4() {
    }

    private void rec_num_2() {
        tspfile.open("I-O");
        tspfl_record.set(String.valueOf(" "));
        tspfile.start();
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " read " + String.valueOf(cm_cust_num));
        }
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD AT END */
        cust_stat.set(String.valueOf("99"));
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " first read " + String.valueOf(cm_cust_num));
        }
        while (!((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02"))))) {
            CobolDisplay.display("Ph=" + String.valueOf(cm_telephone) + " Key: " + String.valueOf(cm_cust_num) + " is " + String.valueOf(cm_company) + ".");
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
    }

    private void tspfile_6() {
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
            CobolDisplay.display("WRITE: " + String.valueOf(tspfl_key) + ", Status: " + String.valueOf(cust_stat));
        }
    }

    private void _1000() { /* stub — external/COPY */ }

    @Override
    public void run() {
        mainfile();
    }

    public static void main(String[] args) {
        new RunFile089IndexedFileReadDeleteRead().run();
    }
}
