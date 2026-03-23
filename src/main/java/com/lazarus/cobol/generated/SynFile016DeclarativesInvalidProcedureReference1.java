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
    private void g01() {
        use();
        go_file();
        g02();
    }

    private void use() {
        /* RAW: AFTER ERROR PROCEDURE ON */
    }

    private void go_file() {
    }

    private void g02() {
        CobolDisplay.display("OK");
        /* RAW: * explicit check both */
        and();
        _unnamed();
        return;
    }

    // SECTION: P01
    private void p01() {
        use();
        perf_file();
        p02();
    }

    private void use_2() {
        /* RAW: AFTER ERROR PROCEDURE ON */
    }

    private void perf_file() {
    }

    private void p02() {
        CobolDisplay.display("OK");
        /* RAW: * programs may do this - */
        ppok();
        /* RAW: * programs should not do this */
        pp02();
    }

    // SECTION: GG01
    private void gg01() {
        gg02();
        go_file();
        go_file();
    }

    private void gg02() {
    }

    private void go_file_2() {
    }

    private void go_file_3() {
    }

    // SECTION: PP01
    private void pp01() {
        pp02();
        perf_file();
        perf_file();
        pp03();
        ppok();
    }

    private void pp02() {
    }

    private void perf_file_2() {
    }

    private void perf_file_3() {
    }

    private void pp03() {
        CobolDisplay.display("LOG OUTPUT HERE");
    }

    private void ppok() {
        System.exit(0);
    }

    private void and() { /* stub — external/COPY */ }

    private void _unnamed() { /* stub — external/COPY */ }

    @Override
    public void run() {
        gg02();
    }

    public static void main(String[] args) {
        new SynFile016DeclarativesInvalidProcedureReference1().run();
    }
}
