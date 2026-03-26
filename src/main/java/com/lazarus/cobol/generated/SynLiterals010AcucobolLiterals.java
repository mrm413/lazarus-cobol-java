package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynLiterals010AcucobolLiterals extends CobolProgram {
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

    private CobolString b = new CobolString(256); // fallback
    private CobolString o = new CobolString(256); // fallback
    private CobolString x = new CobolString(256); // fallback
    private CobolString h = new CobolString(256); // fallback
    private CobolString abcdef = new CobolString(256); // fallback
    private CobolString gg = new CobolString(256); // fallback
    private CobolString hh = new CobolString(256); // fallback

    private void para_main() {
        CobolDisplay.display(String.valueOf(b) + String.valueOf(10) + String.valueOf(o) + String.valueOf(12345670123L) + String.valueOf(x) + String.valueOf(12345678) + String.valueOf(h) + String.valueOf(90) + String.valueOf(abcdef));
        CobolDisplay.display(String.valueOf(b) + String.valueOf(new BigDecimal("1.1111111111111111e+64")) + String.valueOf(o) + String.valueOf(new BigDecimal("1.1111111111111111e+22")) + String.valueOf(x) + String.valueOf(new BigDecimal("11111111111111112")) + String.valueOf(h) + String.valueOf(new BigDecimal("22222222222222224")));
        CobolDisplay.display(String.valueOf(b) + String.valueOf(23) + String.valueOf(o) + String.valueOf(89) + String.valueOf(x) + String.valueOf(gg) + String.valueOf(h) + String.valueOf(hh));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynLiterals010AcucobolLiterals().run();
    }
}
