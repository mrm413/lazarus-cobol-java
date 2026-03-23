package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynDefinition059ApplyCommitClause extends CobolProgram {
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
    private CobolString file_states = new CobolString(1); // Group: FILE-STATES
    private CobolString stck_file_status = new CobolString(2);
    private CobolString chng_file_status = new CobolString(2);
    private int update_count = 0;
    private CobolString based_stuff = new CobolString(1);
    private CobolString data_here = new CobolString(1); // Group: DATA-HERE
    private int some_data = 0;
    private CobolString red_data = new CobolString(1);

    // FILE SECTION — STCK-FILE
    private CobolString stck_rec = new CobolString(1); // Group: STCK-REC
    private CobolString apply = new CobolString(5);
    private int stck_qty = 0;

    // FILE SECTION — CHNG-FILE
    private CobolString chng_rec = new CobolString(1); // Group: CHNG-REC
    private CobolString chng_key = new CobolString(5);
    private int chng_qty = 0;
    private CobolString chng_action = new CobolString(1);
    private CobolString chng_state = new CobolString(1);


    // FILE DESCRIPTORS
    private CobolFile stck_file = new CobolFile("STOCK", "INDEXED", "RANDOM");
    // File status: STCK-FILE-STATUS
    private CobolFile chng_file = new CobolFile("CHANGE", "SEQUENTIAL", "SEQUENTIAL");
    // File status: CHNG-FILE-STATUS
    private CobolFile sort_file = new CobolFile("SORT", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString stck_file_ok = new CobolString(256);
    private CobolString chng_file_ok = new CobolString(256);

    // SECTION: MAIN
    private void para_main() {
        perform();
    }

    private void perform() {
        /* RAW: INITIALISATION  */
        termination();
        System.exit(0);
    }

    // SECTION: INITIALISATION
    private void initialisation() {
        para_open();
    }

    private void para_open() {
        /* RAW: I-O CHNG-FILE , STCK-FILE */
        if ((!(!String.valueOf(stck_file_ok).trim().isEmpty()) || !(!String.valueOf(chng_file_ok).trim().isEmpty()))) {
            fatal_error();
        }
    }

    // SECTION: TERMINATION
    private void termination() {
        commit();
    }

    private void commit() {
        if ((!(!String.valueOf(stck_file_ok).trim().isEmpty()) || !(!String.valueOf(chng_file_ok).trim().isEmpty()))) {
            fatal_error();
        }
    }

    // SECTION: FATAL-ERROR
    private void fatal_error() {
        rollback();
    }

    private void rollback() {
        System.exit(16);
    }

    @Override
    public void run() {
        perform();
    }

    public static void main(String[] args) {
        new SynDefinition059ApplyCommitClause().run();
    }
}
