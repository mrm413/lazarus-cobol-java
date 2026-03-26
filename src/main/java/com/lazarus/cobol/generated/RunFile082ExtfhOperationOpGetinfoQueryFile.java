package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile082ExtfhOperationOpGetinfoQueryFile extends CobolProgram {
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
    private int i = 0;
    private int k = 0;
    private CobolString cust_stat = new CobolString(2);
    private CobolString ws_fcd_ddname = new CobolString(8);
    private long ws_fcd_ptr = 0L;
    private CobolString action_code = new CobolString(2);
    private static final String op_open_input = "fa00";
    private static final String op_open_output = "fa01";
    private static final String op_open_i_o = "fa02";
    private static final String op_write = "faf3";
    private static final String op_release = "faf3";
    private static final String op_rewrite = "faf4";
    private static final String op_read_next = "faf5";
    private static final String op_start_equal = "fae9";
    private static final String op_close = "fa80";
    private static final String op_query_file = "0006";
    private CobolString fcd_filename = new CobolString(80);
    private CobolString fcd_record = new CobolString(512);
    private CobolString fcd_map = new CobolString(1);

    // LINKAGE SECTION
    private CobolString key_inf = new CobolString(1); // Group: KEY-INF
    private CobolString key_desc = new CobolString(1);
    private CobolString key_type = new CobolString(1);
    private CobolString key_pos = new CobolString(4);
    private CobolString key_len = new CobolString(4);

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
    private CobolFile tspfile = new CobolFile("FCD-FILENAME", "INDEXED", "DYNAMIC");
    // File status: CUST-STAT

    // FALLBACK FILE DESCRIPTORS
    private CobolFile file = new CobolFile("FILE", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString fcd_key_def_address = new CobolString(256); // fallback
    private CobolString address = new CobolString(256); // fallback
    private CobolString fcd_filename_address = new CobolString(256); // fallback
    private CobolString fcd_name_length = new CobolString(256); // fallback
    private CobolString key_def = new CobolString(256); // fallback
    private CobolString kdb_len = new CobolString(256); // fallback
    private CobolString fcd_record_address = new CobolString(256); // fallback
    private CobolString fcd_current_rec_len = new CobolString(256); // fallback
    private CobolString fcd_min_rec_length = new CobolString(256); // fallback
    private CobolString fcd_max_rec_length = new CobolString(256); // fallback
    private CobolString fcd_version = new CobolString(256); // fallback
    private CobolString fcd_organization = new CobolString(256); // fallback
    private CobolString fcd_file_status = new CobolString(256); // fallback
    private CobolString key_nkeys = new CobolString(256); // fallback
    private CobolString[] key_count = new CobolString[100]; // fallback array
    private CobolString[] key_offset = new CobolString[100]; // fallback array
    private CobolString[] key_flags = new CobolString[100]; // fallback array
    private CobolString[] key_compression = new CobolString[100]; // fallback array
    private CobolString[] key_sparse = new CobolString[100]; // fallback array
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString fcd_status_key_1 = new CobolString(256); // fallback
    private CobolString fcd_binary = new CobolString(256); // fallback

    private void para_main() {
        // Method body requires runtime extensions
    }

    private void tspfile() {
        // Method body requires runtime extensions
    }

    private void _800_call_extfh() {
        // Method body requires runtime extensions
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile082ExtfhOperationOpGetinfoQueryFile().run();
    }
}
