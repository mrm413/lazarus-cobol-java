package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMl000XmlGenerateGeneral extends CobolProgram {
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
    private CobolString namespace_str = new CobolString(100);
    private CobolString prefix_str = new CobolString(100);
    private CobolString out = new CobolString(200);
    private CobolString rec = new CobolString(1); // Group: rec
    private CobolString a = new CobolString(3);
    private CobolString b = new CobolString(3);
    private CobolString c = new CobolString(1); // Group: c
    private CobolString d = new CobolString(3);
    private CobolString filler_1 = new CobolString(3);
    private CobolString employee = new CobolString(1); // Group: employee
    private int id = 0;
    private CobolString name = new CobolString(10);
    private CobolString dept = new CobolString(10);


    private CobolString xml = new CobolString(256); // fallback
    private CobolString xml_code = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private void para_main() {
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        /* RAW: SPACES  */
        if (!String.valueOf(out).equals(String.valueOf("<?xml version=\"1.0\"?>"))) {
            /* RAW: & X'0A' & '<rec alpha="A"><b>BBB</b></rec>' */
            CobolDisplay.display("Test 1 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (!String.valueOf(out).equals(String.valueOf("<d> </d>"))) {
            CobolDisplay.display("Test 2 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (!String.valueOf(out).equals(String.valueOf("<c d=\" \"/>"))) {
            CobolDisplay.display("Test 3 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        a.set(String.valueOf("A"));
        c.set(String.valueOf("C"));
        xml.set(String.valueOf("C"));
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (!String.valueOf(out).equals(String.valueOf("<rec>AAABBB<c>CCC</c></rec>"))) {
            CobolDisplay.display("Test 4 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (!String.valueOf(out).equals(String.valueOf("<rec>AAA<b>BBB</b><c>CCC</c></rec>"))) {
            CobolDisplay.display("Test 5 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (!String.valueOf(out).equals(String.valueOf((0 /* non-numeric literal: <pre:c xmlns:pre="ht */ - 0 /* non-numeric literal: <pre:d>CCC</pre:d></ */)))) {
            CobolDisplay.display("Test 6 failed: " + String.valueOf(CobolIntrinsics.trim(out)) + " " + String.valueOf(xml_code));
        }
        namespace_str.set(String.valueOf(" "));
        _filler_002.set(String.valueOf(" "));
        prefix_str.set(String.valueOf(" "));
        xml.set(String.valueOf(" "));
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (!String.valueOf(out).equals(String.valueOf("<c><d>CCC</d></c>"))) {
            CobolDisplay.display("Test 7 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        d.set(String.valueOf("&"));
        xml.set(String.valueOf("&"));
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (!String.valueOf(out).equals(String.valueOf("<d>&amp;&amp;&amp;</d>"))) {
            CobolDisplay.display("Test 8 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (!String.valueOf(out).equals(String.valueOf("<_0SpecialTAGName>abc</_0SpecialTAGName>"))) {
            CobolDisplay.display("Test 9 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
        /* UNSUPPORTED: XML/JSON processing — XML */
        /* UNSUPPORTED: Report Writer — GENERATE */
        if (!String.valueOf(out).equals(String.valueOf((((0 /* non-numeric literal: <employee id="1"> */ - 0 /* non-numeric literal: <name>Someone</name> */) - 0 /* non-numeric literal: <dept>Marketing</dep */) - 0 /* non-numeric literal: </employee> */)))) {
            CobolDisplay.display("Test 10 failed: " + String.valueOf(CobolIntrinsics.trim(out)));
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMl000XmlGenerateGeneral().run();
    }
}
