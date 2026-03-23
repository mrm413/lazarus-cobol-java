package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMl002XmlGenerateExceptions extends CobolProgram {
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
    private CobolString normal_str = new CobolString(200);
    private CobolString valid_rec = new CobolString(1); // Group: valid-rec
    private CobolString a = new CobolString(2);
    private CobolString b = new CobolString(2);
    private CobolString short_str = new CobolString(5);
    private CobolString short_str2 = new CobolString(22);
    private int xml_len = 0;
    private CobolString valid_namespace = new CobolString(1);
    private CobolString invalid_namespace = new CobolString(1);
    private CobolString invalid_prefix = new CobolString(3);
    private CobolString invalid_content = new CobolString(3);
    private int count_in_too_small = 0;


    private CobolString xml = new CobolString(256);
    private CobolString xml_code = new CobolString(256);

    private void para_main() {
        short_str.set(String.valueOf("A"));
        xml.set(String.valueOf("A"));
        /* RAW: GENERATE short-str FROM valid-rec COUNT IN */
        if (((!String.valueOf(xml_code).equals(String.valueOf(400)) || !String.valueOf(short_str).equals(String.valueOf("<vali"))) || xml_len != 42)) {
            CobolDisplay.display("Failed 1a: " + String.valueOf(short_str) + " " + String.valueOf(xml_len) + " " + String.valueOf(xml_code));
        }
        short_str2.set(String.valueOf("B"));
        xml.set(String.valueOf("B"));
        /* RAW: GENERATE short-str2 FROM valid-rec COUNT IN */
        if (((!String.valueOf(xml_code).equals(String.valueOf(400)) || !String.valueOf(short_str2).equals(String.valueOf("<valid-rec><a>aa</a><b"))) || xml_len != 42)) {
            CobolDisplay.display("Failed 1b: " + String.valueOf(short_str2) + " " + String.valueOf(xml_len) + " " + String.valueOf(xml_code));
        }
        /* RAW: XML  */
        /* RAW: GENERATE normal-str FROM valid-rec NAMESPACE invalid-namespace */
        if (!String.valueOf(xml_code).equals(String.valueOf(416))) {
            CobolDisplay.display("Failed 2: " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(xml_code));
        }
        /* RAW: XML  */
        /* RAW: GENERATE normal-str FROM invalid-content */
        if ((!String.valueOf(xml_code).equals(String.valueOf(417)) || !String.valueOf(normal_str).equals(String.valueOf((0 /* non-numeric literal: <hex.invalid-content */ - 0 /* non-numeric literal: invalid-content> */))))) {
            CobolDisplay.display("Failed 3: " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(xml_code));
        }
        /* RAW: XML  */
        /* RAW: GENERATE normal-str FROM valid-rec NAMESPACE "http://www.w3.org/1999/xhtml" */
        if (!String.valueOf(xml_code).equals(String.valueOf(419))) {
            CobolDisplay.display("Failed 4: " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(xml_code));
        }
        /* RAW: XML  */
        /* RAW: GENERATE normal-str FROM valid-rec ON EXCEPTION */
        CobolDisplay.display("Failed 5: EXCEPTION " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(xml_code));
        /* RAW: ON EXCEPTION */
        if (!String.valueOf(xml_code).equals(String.valueOf(0))) {
            CobolDisplay.display("Failed 5: NOT EXCEPTION " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(xml_code));
        }
        /* RAW: END-XML XML */
        /* RAW: GENERATE short-str FROM valid-rec NOT EXCEPTION */
        CobolDisplay.display("Failed 6: NOT EXCEPTION " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(xml_code));
        /* RAW: EXCEPTION  */
        if (!String.valueOf(xml_code).equals(String.valueOf(400))) {
            CobolDisplay.display("Failed 6: ON EXCEPTION " + String.valueOf(CobolIntrinsics.trim(normal_str)) + " " + String.valueOf(xml_code));
        }
    }

    private void end_xml() {
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMl002XmlGenerateExceptions().run();
    }
}
