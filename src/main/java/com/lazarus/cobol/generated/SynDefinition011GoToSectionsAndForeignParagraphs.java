package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynDefinition011GoToSectionsAndForeignParagraphs extends CobolProgram {
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


    // SECTION: S-1
    private void s_1() {
        go();
        e_1();
    }

    private void go() {
        /* RAW: TO S-2 */
    }

    private void e_1() {
        if (String.valueOf(CobolIntrinsics.seconds_past_midnight()).equals(String.valueOf(10))) {
            s_1();
            return;
        }
    }

    // SECTION: S-2
    private void s_2() {
        go();
        e_2();
    }

    private void go_2() {
        /* RAW: TO E-3 */
    }

    private void e_2() {
    }

    // SECTION: S-3
    private void s_3() {
        e_3();
    }

    private void e_3() {
    }

    @Override
    public void run() {
        go();
    }

    public static void main(String[] args) {
        new SynDefinition011GoToSectionsAndForeignParagraphs().run();
    }
}
