package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile027IndexedSample extends CobolProgram {
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
    private CobolString indexing_status_code = new CobolString(2);
    private int indexing_status = 0;
    private static final String line_separator = "-----------------------------------------";
    private CobolString display_record = new CobolString(1); // Group: display-record
    private CobolString filler_1 = new CobolString(1);
    private CobolString keyfield = new CobolString(8);
    private CobolString filler_2 = new CobolString(1);
    private CobolString altkey = new CobolString(1); // Group: altkey
    private int first_part = 0;
    private CobolString filler_3 = new CobolString(1);
    private CobolString middle_part = new CobolString(1);
    private CobolString filler_4 = new CobolString(1);
    private int last_part = 0;
    private CobolString filler_5 = new CobolString(1);
    private CobolString data_part = new CobolString(18);
    private int safety_net = 0;
    private int oldkey = 0;
    private CobolString duplicate_flag = new CobolString(1);
    private CobolString record_flag = new CobolString(1);

    // FILE SECTION — indexed-file
    private CobolString indexing_record = new CobolString(1); // Group: indexing-record
    private CobolString filler_6 = new CobolString(1);
    private CobolString filler_7 = new CobolString(1);


    // FILE DESCRIPTORS
    private CobolFile indexed_file = new CobolFile("indexed-file.dat", "INDEXED", "DYNAMIC");
    // File status: indexing-status-code

    private CobolString indexing_ok = new CobolString(256); // fallback
    private CobolString no_more_duplicates = new CobolString(256); // fallback
    private CobolString cb_false = new CobolString(256); // fallback
    private CobolString no_more_records = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback

    private void para_main() {
        populate_sample();
        indexing_record.set(String.valueOf(" "));
        indexed_file.open("I-O");
        indexing_check();
        if (!(!String.valueOf(indexing_ok).trim().isEmpty())) {
            System.exit(0);
        }
        first_part = new BigDecimal(String.valueOf(0).trim()).intValue();
        middle_part.set(String.valueOf("b"));
        last_part = new BigDecimal(String.valueOf(2).trim()).intValue();
        no_more_duplicates.set(String.valueOf(cb_false));
        CobolDisplay.display("Read all 00b02 keys sequentially");
        read_indexing_record();
        for (safety_net = 1; !((!String.valueOf(no_more_duplicates).trim().isEmpty() || safety_net > 40)); safety_net += 1) {
        }
        if (safety_net > 40) {
            CobolDisplay.display("Safety kicked in!");
        }
        CobolDisplay.display(String.valueOf(line_separator));
        first_part = new BigDecimal(String.valueOf(0).trim()).intValue();
        middle_part.set(String.valueOf("a"));
        last_part = new BigDecimal(String.valueOf(2).trim()).intValue();
        no_more_records.set(String.valueOf(cb_false));
        CobolDisplay.display("Read all alternate keys greater than 00a02");
        start_at_key();
        for (safety_net = 1; !((!String.valueOf(no_more_records).trim().isEmpty() || safety_net > 40)); safety_net += 1) {
        }
        if (safety_net > 40) {
            CobolDisplay.display("Safety kicked in!");
        }
        CobolDisplay.display(String.valueOf(line_separator));
        keyfield.set(String.valueOf("87654321"));
        no_more_records.set(String.valueOf(cb_false));
        CobolDisplay.display("Read all primary keys less than " + String.valueOf(CobolIntrinsics.trim(keyfield)));
        start_prime_key();
        for (safety_net = 1; !((!String.valueOf(no_more_records).trim().isEmpty() || safety_net > 40)); safety_net += 1) {
        }
        if (safety_net > 40) {
            CobolDisplay.display("Safety kicked in!");
        }
        CobolDisplay.display(String.valueOf(line_separator));
        /* RAW: unlock indexed-file */
        indexed_file.close();
        return;
    }

    private void read_indexing_record() {
        CobolDisplay.display("Reading: " + String.valueOf(altkey));
        if (indexed_file.read(null) == FileStatus.AT_END) {
        }
        indexing_check();
    }

    private void read_next_record() {
        /* MOVE CORRESPONDING indexing-record TO display-record — requires runtime */
        CobolDisplay.display(String.valueOf(display_record));
        oldkey = new BigDecimal(String.valueOf(altkey).trim()).intValue();
        if (indexed_file.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: record at end */
        no_more_duplicates.set(String.valueOf(cb_true));
        /* RAW: not at end */
        if (!String.valueOf(oldkey).equals(String.valueOf(altkey))) {
            no_more_duplicates.set(String.valueOf(cb_true));
        }
        indexing_check();
    }

    private void start_prime_key() {
        CobolDisplay.display("Prime < " + String.valueOf(keyfield));
        indexed_file.start();
        /* INVALID KEY handling — needs file status check */
        indexing_check();
    }

    private void read_previous_by_key() {
        /* MOVE CORRESPONDING indexing-record TO display-record — requires runtime */
        CobolDisplay.display(String.valueOf(display_record));
        if (indexed_file.read(null) == FileStatus.AT_END) {
        }
        /* RAW: previous record at end */
        no_more_records.set(String.valueOf(cb_true));
        indexing_check();
    }

    private void start_at_key() {
        CobolDisplay.display("Seeking >= " + String.valueOf(altkey));
        indexed_file.start();
        /* INVALID KEY handling — needs file status check */
        indexing_check();
    }

    private void read_next_by_key() {
        /* MOVE CORRESPONDING indexing-record TO display-record — requires runtime */
        CobolDisplay.display(String.valueOf(display_record));
        if (indexed_file.read(null) == FileStatus.AT_END) {
        }
        /* NEXT SENTENCE */
        /* RAW: record at end */
        no_more_records.set(String.valueOf(cb_true));
        indexing_check();
    }

    private void populate_sample() {
        indexed_file.open("I-O");
        indexing_check();
        indexing_record.set(String.valueOf("12345678 00a01 some 12345678 data"));
        write_indexing_record();
        indexing_record.set(String.valueOf("87654321 00a01 some 87654321 data"));
        write_indexing_record();
        indexing_record.set(String.valueOf("12348765 00a01 some 12348765 data"));
        write_indexing_record();
        indexing_record.set(String.valueOf("87651234 00a01 some 87651234 data"));
        write_indexing_record();
        indexing_record.set(String.valueOf("12345679 00b02 some 12345679 data"));
        write_indexing_record();
        indexing_record.set(String.valueOf("97654321 00b02 some 97654321 data"));
        write_indexing_record();
        indexing_record.set(String.valueOf("12349765 00b02 some 12349765 data"));
        write_indexing_record();
        indexing_record.set(String.valueOf("97651234 00b02 some 97651234 data"));
        write_indexing_record();
        indexing_record.set(String.valueOf("12345689 00c13 some 12345689 data"));
        write_indexing_record();
        indexing_record.set(String.valueOf("98654321 00c13 some 98654321 data"));
        write_indexing_record();
        indexing_record.set(String.valueOf("12349865 00c13 some 12349865 data"));
        write_indexing_record();
        indexing_record.set(String.valueOf("98651234 00c13 some 98651234 data"));
        write_indexing_record();
        indexed_file.close();
        indexing_check();
    }

    private void write_indexing_record() {
        indexed_file.write(indexing_record);
        /* INVALID KEY handling — needs file status check */
    }

    private void indexing_check() {
        if (!(!String.valueOf(indexing_ok).trim().isEmpty())) {
            CobolDisplay.display("isam file io problem: " + String.valueOf(indexing_status));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile027IndexedSample().run();
    }
}
