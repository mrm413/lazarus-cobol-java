package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc172EntryForGoToGoToEntry extends CobolProgram {
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
    private int jump_entry = 0;


    private CobolString entry = new CobolString(256); // fallback
    private CobolString cb_for = new CobolString(256); // fallback
    private CobolString ext_modus = new CobolString(256); // fallback

    private void para_main() {
        entry();
        return;
    }

    private void para_main_2() {
        if (jump_entry == 1) {
            entry();
            return;
        } else if (jump_entry == 2) {
            stmt01();
            return;
        } else if (jump_entry == 3) {
            stmt02();
            return;
        } else if (jump_entry == 4) {
            stmt03();
            return;
        } else if (jump_entry == 5) {
            stmt04();
            return;
        } else if (jump_entry == 6) {
            stmt05();
            return;
        }
        CobolDisplay.display("NOT JUMPED");
        return;
    }

    private void entry() { /* stub — external/COPY */ }

    private void stmt01() { /* stub — external/COPY */ }

    private void stmt02() { /* stub — external/COPY */ }

    private void stmt03() { /* stub — external/COPY */ }

    private void stmt04() { /* stub — external/COPY */ }

    private void stmt05() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc172EntryForGoToGoToEntry().run();
    }
}
