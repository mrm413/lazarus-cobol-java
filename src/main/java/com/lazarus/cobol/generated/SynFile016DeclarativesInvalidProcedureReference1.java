package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynFile016DeclarativesInvalidProcedureReference1 extends CobolProgram {
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
    // FILE SECTION — GO-FILE
    private CobolString go_rec = new CobolString(4);

    // FILE SECTION — PERF-FILE
    private CobolString perf_rec = new CobolString(4);


    // FILE DESCRIPTORS
    private CobolFile go_file = new CobolFile("./TEST-FILE", "LINE SEQUENTIAL", "SEQUENTIAL");
    private CobolFile perf_file = new CobolFile("./TEST-FILE", "LINE SEQUENTIAL", "SEQUENTIAL");


    // SECTION: G01
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString _filler_002 = new CobolString(256); // fallback
    private void g01() {
        // Method body requires runtime extensions
    }

    private void use() {
        // Method body requires runtime extensions
    }

    private void g02() {
        // Method body requires runtime extensions
    }

    // SECTION: P01
    private void p01() {
        // Method body requires runtime extensions
    }

    private void use_2() {
        // Method body requires runtime extensions
    }

    private void p02() {
        // Method body requires runtime extensions
    }

    // SECTION: GG01
    private void gg01() {
        // Method body requires runtime extensions
    }

    private void gg02() {
        // Method body requires runtime extensions
    }

    // SECTION: PP01
    private void pp01() {
        // Method body requires runtime extensions
    }

    private void pp02() {
        // Method body requires runtime extensions
    }

    private void pp03() {
        // Method body requires runtime extensions
    }

    private void ppok() {
        // Method body requires runtime extensions
    }

    private void and() {
        // Method body requires runtime extensions
    }

    private void _filler_002() {
        // Method body requires runtime extensions
    }

    @Override
    public void run() {
        gg02();
    }

    public static void main(String[] args) {
        new SynFile016DeclarativesInvalidProcedureReference1().run();
    }
}
