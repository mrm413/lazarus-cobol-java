package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile001VariableLengthSequentialDataIntegrity extends CobolProgram {
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
    private CobolString st_test = new CobolString(2);
    private int w_type = 0;
    private int eof_test_xml = 0;
    private int count_pass = 0;

    // FILE SECTION — TEST-XML00
    private CobolString e_enr = new CobolString(500);


    // FILE DESCRIPTORS
    private CobolFile test_xml00 = new CobolFile("DATA", "SEQUENTIAL", "SEQUENTIAL");
    // File status: ST-TEST

    private CobolString not = new CobolString(256); // fallback
    private CobolString at = new CobolString(256); // fallback
    private CobolString end = new CobolString(256); // fallback

    private void debut() {
        test_xml00.open("INPUT");
        if (!String.valueOf(CobolString.refMod(st_test, 1)).equals(String.valueOf("00"))) {
            CobolDisplay.displayNoAdvancing("OPEN ERROR: " + String.valueOf(st_test));
            return;
        }
        w_type = 0;
        e_enr.set("");
        while (!((eof_test_xml == 1 || (w_type == 1 || true)))) {
            if (test_xml00.read(null) == FileStatus.AT_END) {
            }
            /* NEXT SENTENCE */
            /* RAW: AT END */
            eof_test_xml = new BigDecimal(String.valueOf(1).trim()).intValue();
            not.set(String.valueOf(1));
            at.set(String.valueOf(1));
            end.set(String.valueOf(1));
            count_pass = new BigDecimal(String.valueOf(count_pass + 1).trim()).intValue();
            /* RAW: END-READ  */
        }
        test_xml00.close();
        CobolDisplay.display(String.valueOf(count_pass));
        System.exit(0);
    }

    @Override
    public void run() {
        debut();
    }

    public static void main(String[] args) {
        new RunFile001VariableLengthSequentialDataIntegrity().run();
    }
}
