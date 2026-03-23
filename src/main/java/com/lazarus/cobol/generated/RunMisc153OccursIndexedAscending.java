package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc153OccursIndexedAscending extends CobolProgram {
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
    private int rec_name_idx = 0;
    private int rec_name_dbx = 0;
    // WORKING-STORAGE SECTION
    private CobolString dbi_record_namest = new CobolString(1); // Group: DBI-RECORD-NAMEST
    private CobolString dbi_record_namesr = new CobolString(1); // Group: DBI-RECORD-NAMESR
    private CobolString[] dbi_record_names = new CobolString[7]; // Group: DBI-RECORD-NAMES
    private CobolString[] dbi_record_name = new CobolString[7];
    private int[] dbi_record_code = new int[7];
    private CobolString[] dbi_record_dir = new CobolString[7];
    private CobolString rec_name = new CobolString(30);
    private CobolString dbx_record_namest = new CobolString(1); // Group: DBX-RECORD-NAMEST
    private CobolString dbx_record_namesr = new CobolString(1); // Group: DBX-RECORD-NAMESR
    private CobolString[] dbx_record_names = new CobolString[7]; // Group: DBX-RECORD-NAMES
    private CobolString[] dbx_record_name = new CobolString[7];
    private int[] dbx_record_code = new int[7];
    private CobolString[] dbx_record_dir = new CobolString[7];



    private void para_main() {
        rec_name_idx = new BigDecimal(String.valueOf(1).trim()).intValue();
    }

    private void rec_name() {
        findit();
    }

    private void rec_name_2() {
        findit();
        System.exit(0);
    }

    private void findit() {
        /* SEARCH DBI-RECORD-NAMES */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < dbi_record_names.length && !_found; _idx++) {
                if (String.valueOf(rec_name).equals(String.valueOf(dbi_record_name[rec_name_idx - 1]))) {
                    CobolDisplay.display("A " + String.valueOf(rec_name) + " is code " + String.valueOf(dbi_record_code[rec_name_idx - 1]) + ".");
                    _found = true;
                }
            }
            if (!_found) {
                CobolDisplay.display("A " + String.valueOf(rec_name) + " is invalid.");
            }
        }
        /* SEARCH DBX-RECORD-NAMES */
        {
            boolean _found = false;
            for (int _idx = 0; _idx < dbx_record_names.length && !_found; _idx++) {
                if (String.valueOf(rec_name).equals(String.valueOf(dbx_record_name[rec_name_dbx - 1]))) {
                    CobolDisplay.display("B " + String.valueOf(rec_name) + " is code " + String.valueOf(dbx_record_code[rec_name_dbx - 1]) + ".");
                    _found = true;
                }
            }
            if (!_found) {
                CobolDisplay.display("B " + String.valueOf(rec_name) + " is invalid.");
            }
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc153OccursIndexedAscending().run();
    }
}
