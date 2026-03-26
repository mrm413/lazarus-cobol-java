package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc038WordLength extends CobolProgram {
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
    private int filler_1 = 0;


    private CobolString some_special_val_with_length30 = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString some_special_val_with_length_31 = new CobolString(256); // fallback
    private CobolString some_special_val_with_length_32c = new CobolString(256); // fallback
    private CobolString some_special_val_with_length_58c_who_needs_that_long_names = new CobolString(256); // fallback
    private CobolString some_special_val_with_length_90_chars_who_needs_that_long_names_i_cannot_think_of_someone = new CobolString(256); // fallback

    private void some_special_par_with_length30() {
        some_special_val_with_length30.set(String.valueOf(cb_true));
    }

    private void some_special_par_with_length_31() {
        some_special_val_with_length_31.set(String.valueOf(cb_true));
    }

    private void some_special_par_with_length_32c() {
        some_special_val_with_length_32c.set(String.valueOf(cb_true));
    }

    private void some_special_par_with_length_58c_who_needs_that_long_names() {
        some_special_val_with_length_58c_who_needs_that_long_names.set(String.valueOf(cb_true));
    }

    private void some_special_par_with_length_90_chars_who_needs_that_long_names_i_cannot_think_of_someone() {
        some_special_val_with_length_90_chars_who_needs_that_long_names_i_cannot_think_of_someone.set(String.valueOf(cb_true));
        System.exit(0);
    }

    @Override
    public void run() {
        some_special_par_with_length30();
    }

    public static void main(String[] args) {
        new SynMisc038WordLength().run();
    }
}
