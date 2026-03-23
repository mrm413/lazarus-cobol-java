package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class OuterProgram extends CobolProgram {
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
    private CobolString locl_file_status = new CobolString(2);

    // FILE SECTION — STCK-FILE
    private CobolString stck_rec = new CobolString(1); // Group: STCK-REC
    private CobolString people_lastname = new CobolString(50);
    private CobolString people_firstname = new CobolString(50);
    private CobolString stck_rec_part = new CobolString(1); // Group: STCK-REC-PART
    private CobolString people_1stname = new CobolString(50);

    // FILE SECTION — LOCAL-FILE
    private CobolString local_rec = new CobolString(1); // Group: LOCAL-REC
    private CobolString lpeople_lastname = new CobolString(50);
    private CobolString lpeople_firstname = new CobolString(50);


    // FILE DESCRIPTORS
    private CobolFile stck_file = new CobolFile("STOCK", "INDEXED", "RANDOM");
    // File status: STCK-FILE-STATUS
    private CobolFile local_file = new CobolFile("LOCAL", "INDEXED", "RANDOM");
    // File status: LOCL-FILE-STATUS


    // SECTION: MAIN
    private void para_main() {
        para_open();
        program_id();
        inner_program();
        division();
    }

    private void para_open() {
        /* RAW: OUTPUT LOCAL-FILE */
        lpeople_firstname.set(String.valueOf("John"));
        lpeople_lastname.set(String.valueOf("Doe"));
        local_file.write(local_rec);
        local_file.close();
        stck_file.open("OUTPUT");
        people_firstname.set(String.valueOf("John"));
        people_lastname.set(String.valueOf("Doe"));
        stck_file.write(stck_rec);
        stck_file.close();
        CobolProgram.call("INNER-PROGRAM");
        return;
    }

    private void program_id() {
    }

    private void inner_program() {
        /* RAW: PROCEDURE  */
    }

    private void division() {
        stck_file.open("INPUT");
        people_firstname.set(String.valueOf("John"));
        people_lastname.set(String.valueOf("Doe"));
        if (stck_file.read(null) == FileStatus.AT_END) {
        }
        stck_rec.set("");
        people_1stname.set(String.valueOf("John"));
        if (stck_file.read(null) == FileStatus.AT_END) {
        }
        stck_file.close();
        local_file.open("INPUT");
        lpeople_firstname.set(String.valueOf("John"));
        lpeople_lastname.set(String.valueOf("Doe"));
        if (local_file.read(null) == FileStatus.AT_END) {
        }
        local_file.close();
        return;
    }

    @Override
    public void run() {
        para_open();
    }

    public static void main(String[] args) {
        new OuterProgram().run();
    }
}
