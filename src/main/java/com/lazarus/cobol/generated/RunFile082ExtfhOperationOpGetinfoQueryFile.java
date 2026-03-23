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

    
    private CobolFile file = new CobolFile("FILE", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString fcd_key_def_address = new CobolString(256);
    private CobolString address = new CobolString(256);
    private CobolString fcd_filename_address = new CobolString(256);
    private CobolString fcd_name_length = new CobolString(256);
    private CobolString key_def = new CobolString(256);
    private CobolString fcd_record_address = new CobolString(256);
    private CobolString fcd_current_rec_len = new CobolString(256);
    private CobolString fcd_min_rec_length = new CobolString(256);
    private CobolString fcd_max_rec_length = new CobolString(256);
    private CobolString fcd_version = new CobolString(256);
    private CobolString fcd_organization = new CobolString(256);
    private CobolString fcd_file_status = new CobolString(256);
    private CobolString key_nkeys = new CobolString(256);
    private CobolString[] key_count = new CobolString[100];
    private CobolString[] key_offset = new CobolString[100];
    private CobolString[] key_flags = new CobolString[100];
    private CobolString[] key_compression = new CobolString[100];
    private CobolString[] key_sparse = new CobolString[100];
    private CobolString _unnamed = new CobolString(256);
    private CobolString fcd_status_key_1 = new CobolString(256);
    private CobolString fcd_binary = new CobolString(256);

    private void para_main() {
        /* RAW: * - - - - - */
    }

    private void para_main_2() {
        file.delete();
    }

    private void tspfile() {
    }

    private void tspfile_2() {
        tspfile.write(tspfl_record);
    }

    private void tspfile_3() {
        fcd_key_def_address.set(String.valueOf(address));
        fcd_filename_address.set(String.valueOf(address));
        fcd_name_length.set(String.valueOf(64));
    }

    private void kdb_len() {
        fcd_record_address.set(String.valueOf(address));
        fcd_current_rec_len.set(String.valueOf(512));
        fcd_min_rec_length.set(String.valueOf(512));
        fcd_max_rec_length.set(String.valueOf(512));
        fcd_version.set(String.valueOf(1));
        fcd_organization.set(String.valueOf(255));
        action_code.set(String.valueOf(op_query_file));
        _800();
        /* RAW: -  */
    }

    private void call_extfh() {
        CobolDisplay.display("Status: " + String.valueOf(fcd_file_status) + " File: " + String.valueOf(CobolString.refMod(fcd_filename, 1, 20)) + ".");
        CobolDisplay.display(" Nkeys: " + String.valueOf(key_nkeys) + " Recsz: ");
    }

    private void fcd_max_rec_length() {
        CobolDisplay.display("kdblen: ");
    }

    private void kdb_len_2() {
        for (i = 1; !(i > Integer.parseInt(String.valueOf(key_nkeys).trim())); i += 1) {
            CobolDisplay.display(" Index: " + String.valueOf(i) + " Parts: " + String.valueOf(key_count[i - 1]) + " Offset: " + String.valueOf(key_offset[i - 1]) + " Flags: " + String.valueOf(key_flags[i - 1]) + " Comp: " + String.valueOf(key_compression[i - 1]) + " Sparse: " + String.valueOf(key_sparse[i - 1]));
            ws_fcd_ptr = new BigDecimal(String.valueOf(address).trim()).longValue();
    // ws_fcd_ptr += key_offset[i - 1];
            address.set(String.valueOf(ws_fcd_ptr));
            for (k = 1; !(k > Integer.parseInt(String.valueOf(key_count[i - 1]).trim())); k += 1) {
                CobolDisplay.display("   Pos: " + String.valueOf(key_pos) + "   Len: " + String.valueOf(key_len) + "   Desc: " + String.valueOf(key_desc) + " Type: " + String.valueOf(key_type));
                ws_fcd_ptr += CobolIntrinsics.length(key_inf);
                address.set(String.valueOf(ws_fcd_ptr));
            }
        }
        System.exit(0);
    }

    private void call_extfh_2() {
        CobolProgram.call("EXTFH", action_code, _unnamed, fcd_map);
        if ((String.valueOf(fcd_status_key_1).equals(String.valueOf("9")) && String.valueOf(fcd_binary).equals(String.valueOf(199)))) {
            fcd_file_status.set(String.valueOf("10"));
        }
    }

    private void _800() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile082ExtfhOperationOpGetinfoQueryFile().run();
    }
}
