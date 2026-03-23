package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc120SearchAllChecks extends CobolProgram {
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
    private int tab_1_index = 0;
    private int tab_2_index = 0;
    // WORKING-STORAGE SECTION
    private CobolString tab_1 = new CobolString(1); // Group: TAB-1
    private CobolString[] tab_1_entry = new CobolString[50]; // Group: TAB-1-ENTRY
    private CobolString[] tab_1_key = new CobolString[50]; // Group: TAB-1-KEY
    private CobolString[] t1k_sub1 = new CobolString[50];
    private int[] t1k_sub2 = new int[50];
    private CobolString[] tab_1_data = new CobolString[50];
    private CobolString tab_2 = new CobolString(1); // Group: TAB-2
    private CobolString[] tab_2_entry = new CobolString[50]; // Group: TAB-2-ENTRY
    private CobolString[] tab_2_key = new CobolString[50]; // Group: TAB-2-KEY
    private CobolString[] t2k_sub1 = new CobolString[50];
    private int[] t2k_sub2 = new int[50];
    private CobolString[] tab_2_data = new CobolString[50];



    // SECTION: TESTING
    private void testing() {
        search();
        when();
        end_search();
        when();
        end_search();
    }

    private void search() {
        /* RAW: ALL TAB-1-ENTRY AT END */
        /* CONTINUE */
    }

    private void when() {
        /* RAW: TAB-1-KEY = ALL ZERO */
        /* CONTINUE */
    }

    private void end_search() {
        /* SEARCH ALL TAB-1-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                /* CONTINUE */
            }
        }
        /* SEARCH ALL TAB-1-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                /* CONTINUE */
            }
        }
        /* SEARCH ALL TAB-1-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                /* CONTINUE */
            }
        }
        /* SEARCH ALL TAB-1-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
        }
        /* SEARCH ALL TAB-1-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                /* CONTINUE */
            }
        }
    }

    private void when_2() {
        /* RAW: TAB-1-KEY ( TAB-1-INDEX ) = "ZZZ999" */
        /* CONTINUE */
    }

    private void end_search_2() {
        /* SEARCH ALL TAB-1-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                /* CONTINUE */
            }
        }
        /* SEARCH ALL TAB-1-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                /* CONTINUE */
            }
        }
        /* SEARCH ALL TAB-1-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                /* CONTINUE */
            }
        }
        /* SEARCH ALL TAB-1-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                /* CONTINUE */
            }
        }
        /* SEARCH ALL TAB-1-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                /* CONTINUE */
            }
        }
        /* SEARCH ALL TAB-2-ENTRY — binary search */
        {
            boolean _found = false;
            /* Binary search implementation needed */
            if (!_found) {
                /* CONTINUE */
            }
        }
    }

    @Override
    public void run() {
        search();
    }

    public static void main(String[] args) {
        new SynMisc120SearchAllChecks().run();
    }
}
