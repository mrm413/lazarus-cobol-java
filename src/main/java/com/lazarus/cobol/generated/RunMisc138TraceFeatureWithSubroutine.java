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
    private BigDecimal filler_1 = BigDecimal.ZERO;
    private short max_sub = (short) 0;
    private int call_num = 0;
    private CobolString test_data = new CobolString(1); // Group: TEST-DATA
    private CobolString data_cust_num_tbl = new CobolString(1); // Group: DATA-CUST-NUM-TBL
    private BigDecimal filler_2 = BigDecimal.ZERO;
    private BigDecimal filler_3 = BigDecimal.ZERO;
    private BigDecimal filler_4 = BigDecimal.ZERO;
    private BigDecimal filler_5 = BigDecimal.ZERO;
    private BigDecimal filler_6 = BigDecimal.ZERO;
    private BigDecimal filler_7 = BigDecimal.ZERO;
    private BigDecimal filler_8 = BigDecimal.ZERO;
    private BigDecimal filler_9 = BigDecimal.ZERO;
    private BigDecimal filler_10 = BigDecimal.ZERO;
    private BigDecimal filler_11 = BigDecimal.ZERO;
    private BigDecimal filler_12 = BigDecimal.ZERO;
    private BigDecimal filler_13 = BigDecimal.ZERO;
    private BigDecimal filler_14 = BigDecimal.ZERO;
    private BigDecimal filler_15 = BigDecimal.ZERO;
    private BigDecimal filler_16 = BigDecimal.ZERO;
    private BigDecimal filler_17 = BigDecimal.ZERO;
    private CobolString[] data_cust_num = new CobolString[16];
    private CobolString data_company_tbl = new CobolString(1); // Group: DATA-COMPANY-TBL
    private BigDecimal filler_18 = BigDecimal.ZERO;
    private BigDecimal filler_19 = BigDecimal.ZERO;
    private BigDecimal filler_20 = BigDecimal.ZERO;
    private BigDecimal filler_21 = BigDecimal.ZERO;
    private BigDecimal filler_22 = BigDecimal.ZERO;
    private BigDecimal filler_23 = BigDecimal.ZERO;
    private BigDecimal filler_24 = BigDecimal.ZERO;
    private BigDecimal filler_25 = BigDecimal.ZERO;
    private BigDecimal filler_26 = BigDecimal.ZERO;
    private BigDecimal filler_27 = BigDecimal.ZERO;
    private BigDecimal filler_28 = BigDecimal.ZERO;
    private BigDecimal filler_29 = BigDecimal.ZERO;
    private BigDecimal filler_30 = BigDecimal.ZERO;
    private BigDecimal filler_31 = BigDecimal.ZERO;
    private BigDecimal filler_32 = BigDecimal.ZERO;
    private BigDecimal filler_33 = BigDecimal.ZERO;
    private CobolString[] data_company = new CobolString[16];
    private CobolString data_address_1_tbl = new CobolString(1); // Group: DATA-ADDRESS-1-TBL
    private BigDecimal filler_34 = BigDecimal.ZERO;
    private BigDecimal filler_35 = BigDecimal.ZERO;
    private BigDecimal filler_36 = BigDecimal.ZERO;
    private BigDecimal filler_37 = BigDecimal.ZERO;
    private BigDecimal filler_38 = BigDecimal.ZERO;
    private BigDecimal filler_39 = BigDecimal.ZERO;
    private BigDecimal filler_40 = BigDecimal.ZERO;
    private BigDecimal filler_41 = BigDecimal.ZERO;
    private BigDecimal filler_42 = BigDecimal.ZERO;
    private BigDecimal filler_43 = BigDecimal.ZERO;
    private BigDecimal filler_44 = BigDecimal.ZERO;
    private BigDecimal filler_45 = BigDecimal.ZERO;
    private BigDecimal filler_46 = BigDecimal.ZERO;
    private BigDecimal filler_47 = BigDecimal.ZERO;
    private BigDecimal filler_48 = BigDecimal.ZERO;
    private BigDecimal filler_49 = BigDecimal.ZERO;
    private CobolString[] data_address_1 = new CobolString[16];
    private CobolString data_address_2_tbl = new CobolString(1); // Group: DATA-ADDRESS-2-TBL
    private BigDecimal filler_50 = BigDecimal.ZERO;
    private BigDecimal filler_51 = BigDecimal.ZERO;
    private BigDecimal filler_52 = BigDecimal.ZERO;
    private BigDecimal filler_53 = BigDecimal.ZERO;
    private BigDecimal filler_54 = BigDecimal.ZERO;
    private BigDecimal filler_55 = BigDecimal.ZERO;
    private BigDecimal filler_56 = BigDecimal.ZERO;
    private BigDecimal filler_57 = BigDecimal.ZERO;
    private BigDecimal filler_58 = BigDecimal.ZERO;
    private BigDecimal filler_59 = BigDecimal.ZERO;
    private BigDecimal filler_60 = BigDecimal.ZERO;
    private BigDecimal filler_61 = BigDecimal.ZERO;
    private BigDecimal filler_62 = BigDecimal.ZERO;
    private BigDecimal filler_63 = BigDecimal.ZERO;
    private BigDecimal filler_64 = BigDecimal.ZERO;
    private BigDecimal filler_65 = BigDecimal.ZERO;
    private CobolString[] data_address_2 = new CobolString[16];
    private CobolString data_address_3_tbl = new CobolString(1); // Group: DATA-ADDRESS-3-TBL
    private BigDecimal filler_66 = BigDecimal.ZERO;
    private BigDecimal filler_67 = BigDecimal.ZERO;
    private BigDecimal filler_68 = BigDecimal.ZERO;
    private BigDecimal filler_69 = BigDecimal.ZERO;
    private BigDecimal filler_70 = BigDecimal.ZERO;
    private BigDecimal filler_71 = BigDecimal.ZERO;
    private BigDecimal filler_72 = BigDecimal.ZERO;
    private BigDecimal filler_73 = BigDecimal.ZERO;
    private BigDecimal filler_74 = BigDecimal.ZERO;
    private BigDecimal filler_75 = BigDecimal.ZERO;
    private BigDecimal filler_76 = BigDecimal.ZERO;
    private BigDecimal filler_77 = BigDecimal.ZERO;
    private BigDecimal filler_78 = BigDecimal.ZERO;
    private BigDecimal filler_79 = BigDecimal.ZERO;
    private BigDecimal filler_80 = BigDecimal.ZERO;
    private BigDecimal filler_81 = BigDecimal.ZERO;
    private CobolString[] data_address_3 = new CobolString[16];
    private CobolString data_telephone_tbl = new CobolString(1); // Group: DATA-TELEPHONE-TBL
    private BigDecimal filler_82 = BigDecimal.ZERO;
    private BigDecimal filler_83 = BigDecimal.ZERO;
    private BigDecimal filler_84 = BigDecimal.ZERO;
    private BigDecimal filler_85 = BigDecimal.ZERO;
    private BigDecimal filler_86 = BigDecimal.ZERO;
    private BigDecimal filler_87 = BigDecimal.ZERO;
    private BigDecimal filler_88 = BigDecimal.ZERO;
    private BigDecimal filler_89 = BigDecimal.ZERO;
    private BigDecimal filler_90 = BigDecimal.ZERO;
    private BigDecimal filler_91 = BigDecimal.ZERO;
    private BigDecimal filler_92 = BigDecimal.ZERO;
    private BigDecimal filler_93 = BigDecimal.ZERO;
    private BigDecimal filler_94 = BigDecimal.ZERO;
    private BigDecimal filler_95 = BigDecimal.ZERO;
    private BigDecimal filler_96 = BigDecimal.ZERO;
    private BigDecimal filler_97 = BigDecimal.ZERO;
    private int[] data_telephone = new int[16];
    private CobolString data_dp_mgr_tbl = new CobolString(1); // Group: DATA-DP-MGR-TBL
    private BigDecimal filler_98 = BigDecimal.ZERO;
    private BigDecimal filler_99 = BigDecimal.ZERO;
    private BigDecimal filler_100 = BigDecimal.ZERO;
    private BigDecimal filler_101 = BigDecimal.ZERO;
    private BigDecimal filler_102 = BigDecimal.ZERO;
    private BigDecimal filler_103 = BigDecimal.ZERO;
    private BigDecimal filler_104 = BigDecimal.ZERO;
    private BigDecimal filler_105 = BigDecimal.ZERO;
    private BigDecimal filler_106 = BigDecimal.ZERO;
    private BigDecimal filler_107 = BigDecimal.ZERO;
    private BigDecimal filler_108 = BigDecimal.ZERO;
    private BigDecimal filler_109 = BigDecimal.ZERO;
    private BigDecimal filler_110 = BigDecimal.ZERO;
    private BigDecimal filler_111 = BigDecimal.ZERO;
    private BigDecimal filler_112 = BigDecimal.ZERO;
    private BigDecimal filler_113 = BigDecimal.ZERO;
    private CobolString[] data_dp_mgr = new CobolString[16];
    private CobolString data_machine_tbl = new CobolString(1); // Group: DATA-MACHINE-TBL
    private BigDecimal filler_114 = BigDecimal.ZERO;
    private BigDecimal filler_115 = BigDecimal.ZERO;
    private BigDecimal filler_116 = BigDecimal.ZERO;
    private BigDecimal filler_117 = BigDecimal.ZERO;
    private BigDecimal filler_118 = BigDecimal.ZERO;
    private BigDecimal filler_119 = BigDecimal.ZERO;
    private BigDecimal filler_120 = BigDecimal.ZERO;
    private BigDecimal filler_121 = BigDecimal.ZERO;
    private BigDecimal filler_122 = BigDecimal.ZERO;
    private BigDecimal filler_123 = BigDecimal.ZERO;
    private BigDecimal filler_124 = BigDecimal.ZERO;
    private BigDecimal filler_125 = BigDecimal.ZERO;
    private BigDecimal filler_126 = BigDecimal.ZERO;
    private BigDecimal filler_127 = BigDecimal.ZERO;
    private BigDecimal filler_128 = BigDecimal.ZERO;
    private BigDecimal filler_129 = BigDecimal.ZERO;
    private CobolString[] data_machine = new CobolString[16];
    private CobolString data_no_terminals_tbl = new CobolString(1); // Group: DATA-NO-TERMINALS-TBL
    private BigDecimal filler_130 = BigDecimal.ZERO;
    private BigDecimal filler_131 = BigDecimal.ZERO;
    private BigDecimal filler_132 = BigDecimal.ZERO;
    private BigDecimal filler_133 = BigDecimal.ZERO;
    private BigDecimal filler_134 = BigDecimal.ZERO;
    private BigDecimal filler_135 = BigDecimal.ZERO;
    private BigDecimal filler_136 = BigDecimal.ZERO;
    private BigDecimal filler_137 = BigDecimal.ZERO;
    private BigDecimal filler_138 = BigDecimal.ZERO;
    private BigDecimal filler_139 = BigDecimal.ZERO;
    private BigDecimal filler_140 = BigDecimal.ZERO;
    private BigDecimal filler_141 = BigDecimal.ZERO;
    private BigDecimal filler_142 = BigDecimal.ZERO;
    private BigDecimal filler_143 = BigDecimal.ZERO;
    private BigDecimal filler_144 = BigDecimal.ZERO;
    private BigDecimal filler_145 = BigDecimal.ZERO;
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

    private CobolString odd_record = new CobolString(256); // fallback

    private void mainfile() {
        tspfile.open("OUTPUT");
        tspfile.close();
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
        tspfl_record.set(String.valueOf("\u0000"));
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
        tspfile.close();
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
        for (sub = 1; !(sub > max_sub); sub += 1) {
        }
        CobolDisplay.display("Sample data file load complete.");
        tspfile.close();
        /* RAW: * - - - - - */
        tspfl_record.set(String.valueOf(" "));
        cm_cust_num.set(String.valueOf(data_cust_num[sub - 1]));
        tspfl_key.set(String.valueOf(cm_cust_num));
        cm_company.set(String.valueOf(data_company[sub - 1]));
        cm_address_1.set(String.valueOf(data_address_1[sub - 1]));
        cm_address_2.set(String.valueOf(data_address_2[sub - 1]));
        cm_address_3.set(String.valueOf(data_address_3[sub - 1]));
        cm_telephone = new BigDecimal(String.valueOf(data_telephone[sub - 1]).trim()).intValue();
        cm_dp_mgr.set(String.valueOf(data_dp_mgr[sub - 1]));
        cm_machine.set(String.valueOf(data_machine[sub - 1]));
        cm_no_terminals = new BigDecimal(String.valueOf(data_no_terminals[sub - 1]).trim()).intValue();
        if (!String.valueOf(odd_record).trim().isEmpty()) {
            cm_disk.set(String.valueOf("8417"));
            cm_tape.set(String.valueOf("1600 BPI"));
            cm_memory.set(String.valueOf("1MEG"));
        } else {
            cm_disk.set(String.valueOf("8470"));
            cm_tape.set(String.valueOf("6250 BPI"));
            cm_memory.set(String.valueOf("3MEG"));
        }
        tspfile.write(tspfl_record);
        if ((!String.valueOf(cust_stat).equals(String.valueOf("00")) && !String.valueOf(cust_stat).equals(String.valueOf("02")))) {
            CobolDisplay.display("Load - Key: " + String.valueOf(tspfl_key) + ", Status: " + String.valueOf(cust_stat));
        }
    }

    private void listfile() {
        CobolDisplay.display("LIST SAMPLE FILE");
        tstfile.open("INPUT");
        tstfl_record.set(String.valueOf(" "));
        cm_cust_num.set(String.valueOf("PRE00000"));
        tstfile.start();
        if (tstfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        if (tstfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        tstfile.close();
        rec_num = new BigDecimal(String.valueOf(0).trim()).intValue();
        tspfile.open("INPUT");
        if (!String.valueOf(cust_stat).equals(String.valueOf("00"))) {
            CobolDisplay.display("ERROR " + String.valueOf(cust_stat) + " OPENING INPUT FILE");
            System.exit(0);
        }
        tspfl_record.set(String.valueOf(" "));
        cm_cust_num.set(String.valueOf("PRE00000"));
        tspfile.start();
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: RECORD  */
        tspfl_record.set(String.valueOf(" "));
        cm_cust_num.set(String.valueOf("DEL00000"));
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
        tspfile.close();
        tspfile.open("I-O");
        tspfl_record.set(String.valueOf(" "));
        cm_cust_num.set(String.valueOf(data_cust_num[2 - 1]));
        cm_cust_num.setRefMod(5, 1, String.valueOf("X"));
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        if (!String.valueOf(cust_stat).equals(String.valueOf("23"))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " instead of 23.");
        }
        cm_cust_num.set(String.valueOf(data_cust_num[2 - 1]));
        cm_company.set(String.valueOf(data_company[2 - 1]));
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
        cm_telephone = new BigDecimal(String.valueOf(data_telephone[7 - 1]).trim()).intValue();
        cm_machine.set(String.valueOf(data_machine[7 - 1]));
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
        cm_cust_num.set(String.valueOf(data_cust_num[3 - 1]));
        cm_company.set(String.valueOf(data_company[3 - 1]));
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
        cm_cust_num.set(String.valueOf(data_cust_num[2 - 1]));
        cm_company.set(String.valueOf(data_company[2 - 1]));
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        CobolDisplay.display("   Read: " + String.valueOf(cm_cust_num) + " got " + String.valueOf(cust_stat) + " as expected " + String.valueOf(cm_no_terminals) + " terminals");
        cm_cust_num.set(String.valueOf(data_cust_num[3 - 1]));
        cm_company.set(String.valueOf(data_company[3 - 1]));
        tspfile.rewrite(tspfl_record);
        if ((!String.valueOf(cust_stat).equals(String.valueOf("02")) && !String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " instead of 00/02");
        } else {
            CobolDisplay.display("ReWrite: " + String.valueOf(cm_cust_num) + " got " + "00/02 as expected");
        }
        cm_cust_num.set(String.valueOf(data_cust_num[6 - 1]));
        cm_company.set(String.valueOf(data_company[6 - 1]));
        if (tspfile.read(null) == FileStatus.AT_END) {
        }
        cm_telephone = new BigDecimal(String.valueOf(data_telephone[7 - 1]).trim()).intValue();
        cm_machine.set(String.valueOf(data_machine[7 - 1]));
        tspfile.rewrite(tspfl_record);
        if ((!String.valueOf(cust_stat).equals(String.valueOf("02")) && !String.valueOf(cust_stat).equals(String.valueOf("00")))) {
            CobolDisplay.display("Error " + String.valueOf(cust_stat) + " instead of 00/02");
        } else {
            CobolDisplay.display("ReWrite: " + String.valueOf(cm_cust_num) + " got " + "00/02 as expected");
        }
        tspfile.delete();
        tspfile.close();
    }

    private void loadflat() {
        flatfile.open("OUTPUT");
        for (sub = 1; !((sub > max_sub || sub > 5)); sub += 1) {
        }
        flatfile.close();
        flatfile.open("INPUT");
        rec_num = new BigDecimal(String.valueOf(3).trim()).intValue();
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        rec_num = new BigDecimal(String.valueOf(999).trim()).intValue();
        if (flatfile.read(null) == FileStatus.AT_END) {
        }
        flatfile.close();
    }

    private void flat_record() {
        tsp2_record.set(String.valueOf(" "));
        rec_num = new BigDecimal(String.valueOf(sub).trim()).intValue();
        c2_cust_num.set(String.valueOf(data_cust_num[sub - 1]));
        c2_company.set(String.valueOf(data_company[sub - 1]));
        c2_no_terminals = new BigDecimal(String.valueOf(data_no_terminals[sub - 1]).trim()).shortValue();
        c2_pk_date = new BigDecimal(String.valueOf(20070319).trim());
        if (!String.valueOf(odd_record).trim().isEmpty()) {
            c2_disk.set(String.valueOf("8417"));
        } else {
            c2_disk.set(String.valueOf("8470"));
        }
        flatfile.write(tsp2_record);
    }

    @Override
    public void run() {
        mainfile();
    }

    public static void main(String[] args) {
        new RunMisc138TraceFeatureWithSubroutine().run();
    }
}
