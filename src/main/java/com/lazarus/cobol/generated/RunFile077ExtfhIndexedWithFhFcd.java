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
    private BigDecimal filler_1 = BigDecimal.ZERO;
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
    private CobolString[] data_cust_num = new CobolString[100];
    private CobolString data_company_tbl = new CobolString(1); // Group: DATA-COMPANY-TBL
    private BigDecimal filler_17 = BigDecimal.ZERO;
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
    private CobolString[] data_company = new CobolString[100];
    private CobolString data_address_1_tbl = new CobolString(1); // Group: DATA-ADDRESS-1-TBL
    private BigDecimal filler_33 = BigDecimal.ZERO;
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
    private CobolString[] data_address_1 = new CobolString[100];
    private CobolString data_address_2_tbl = new CobolString(1); // Group: DATA-ADDRESS-2-TBL
    private BigDecimal filler_49 = BigDecimal.ZERO;
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
    private CobolString[] data_address_2 = new CobolString[100];
    private CobolString data_address_3_tbl = new CobolString(1); // Group: DATA-ADDRESS-3-TBL
    private BigDecimal filler_65 = BigDecimal.ZERO;
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
    private CobolString[] data_address_3 = new CobolString[100];
    private CobolString data_telephone_tbl = new CobolString(1); // Group: DATA-TELEPHONE-TBL
    private BigDecimal filler_81 = BigDecimal.ZERO;
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
    private int[] data_telephone = new int[100];
    private CobolString data_dp_mgr_tbl = new CobolString(1); // Group: DATA-DP-MGR-TBL
    private BigDecimal filler_97 = BigDecimal.ZERO;
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
    private CobolString[] data_dp_mgr = new CobolString[100];
    private CobolString data_machine_tbl = new CobolString(1); // Group: DATA-MACHINE-TBL
    private BigDecimal filler_113 = BigDecimal.ZERO;
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
    private CobolString[] data_machine = new CobolString[100];
    private CobolString data_no_terminals_tbl = new CobolString(1); // Group: DATA-NO-TERMINALS-TBL
    private BigDecimal filler_129 = BigDecimal.ZERO;
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

    private CobolString address = new CobolString(256); // fallback
    private CobolString fcd_other_flags = new CobolString(256); // fallback
    private CobolString key_nkeys = new CobolString(256); // fallback
    private CobolString kdb_len = new CobolString(256); // fallback
    private CobolString fcd_filename_address = new CobolString(256); // fallback
    private CobolString tsp_filename = new CobolString(256); // fallback
    private CobolString fcd_name_length = new CobolString(256); // fallback
    private CobolString[] key_flags = new CobolString[100]; // fallback array
    private CobolString[] key_sparse = new CobolString[100]; // fallback array
    private CobolString[] key_count = new CobolString[100]; // fallback array
    private CobolString[] key_offset = new CobolString[100]; // fallback array
    private CobolString[] key_compression = new CobolString[100]; // fallback array
    private CobolString kc_pos = new CobolString(256); // fallback
    private CobolString kc_len = new CobolString(256); // fallback
    private CobolString key_comp = new CobolString(256); // fallback
    private CobolString odd_record = new CobolString(256); // fallback
    private CobolString null_key = new CobolString(256); // fallback

    private void mainfile() {
        // body commented -- compile edge case
    }

    private void dump_fcd() {
        // body commented -- compile edge case
    }

    private void loadfile() {
        // body commented -- compile edge case
    }

    private void listfile() {
        // body commented -- compile edge case
    }

    @Override
    public void run() {
        mainfile();
    }

    public static void main(String[] args) {
        new RunFile077ExtfhIndexedWithFhFcd().run();
    }
}
