package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMl004XmlGenerateTrimming extends CobolProgram {
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
    private CobolString str = new CobolString(3);
    private CobolString num_edited = new CobolString(5);
    private int leading_zeroes = 0;
    private BigDecimal decimal_num = BigDecimal.ZERO;
    private short signed_decimal_num = (short) 0;
    private short comp_5_item = (short) 0;
    private int index_item = 0;
    private float float_short_item = 0.0f;
    private double float_long_item = 0.0;
    private CobolString just_item = new CobolString(10);
    private int integer_with_p = 0;
    private BigDecimal decimal_with_p = BigDecimal.ZERO;
    private CobolString out = new CobolString(300);


    private CobolString xml = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: XML  */
        /* RAW: GENERATE out FROM str */
        if (!String.valueOf(out).equals(String.valueOf("<str>ab</str>"))) {
            CobolDisplay.display("Failed 1: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* RAW: XML  */
        /* RAW: GENERATE out FROM num-edited */
        if (!String.valueOf(out).equals(String.valueOf("<num-edited>01.00</num-edited>"))) {
            CobolDisplay.display("Failed 2: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* RAW: XML  */
        /* RAW: GENERATE out FROM leading-zeroes */
        if (!String.valueOf(out).equals(String.valueOf("<leading-zeroes>5</leading-zeroes>"))) {
            CobolDisplay.display("Failed 3: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* RAW: XML  */
        /* RAW: GENERATE out FROM decimal-num */
        if (!String.valueOf(out).equals(String.valueOf("<decimal-num>0.120</decimal-num>"))) {
            CobolDisplay.display("Failed 4: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* RAW: XML  */
        /* RAW: GENERATE out FROM signed-decimal-num */
        if (!String.valueOf(out).equals(String.valueOf("<signed-decimal-num>-1</signed-decimal-num>"))) {
            CobolDisplay.display("Failed 5: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* RAW: XML  */
        /* RAW: GENERATE out FROM comp-5-item */
        if (!String.valueOf(out).equals(String.valueOf("<comp-5-item>5</comp-5-item>"))) {
            CobolDisplay.display("Failed 6: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        index_item = new BigDecimal(String.valueOf(500).trim()).intValue();
        /* RAW: XML  */
        /* RAW: GENERATE out FROM index-item */
        if (!String.valueOf(out).equals(String.valueOf("<index-item>500</index-item>"))) {
            CobolDisplay.display("Failed 7: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        just_item.set(String.valueOf("blah "));
        xml.set(String.valueOf("blah "));
        /* RAW: GENERATE out FROM just-item */
        if (!String.valueOf(out).equals(String.valueOf("<just-item>blah </just-item>"))) {
            CobolDisplay.display("Failed 10: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* RAW: XML  */
        /* RAW: GENERATE out FROM integer-with-p */
        if (!String.valueOf(out).equals(String.valueOf("<integer-with-p>10000</integer-with-p>"))) {
            CobolDisplay.display("Failed 11: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* RAW: XML  */
        /* RAW: GENERATE out FROM decimal-with-p */
        if (!String.valueOf(out).equals(String.valueOf("<decimal-with-p>0.0004</decimal-with-p>"))) {
            CobolDisplay.display("Failed 12: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMl004XmlGenerateTrimming().run();
    }
}
