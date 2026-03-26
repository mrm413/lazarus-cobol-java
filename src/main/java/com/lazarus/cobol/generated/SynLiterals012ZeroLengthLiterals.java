package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynLiterals012ZeroLengthLiterals extends CobolProgram {
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
    private CobolString x = new CobolString(1);
    private CobolString nat = new CobolString(2);
    private int n = 0;


    private CobolString h = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString to = new CobolString(256); // fallback
    private CobolString l = new CobolString(256); // fallback
    private CobolString nx = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private void para_main() {
        x.set(String.valueOf(""));
        _filler_002.set(String.valueOf(h));
        to.set(String.valueOf(h));
        n = new BigDecimal(String.valueOf(h).trim()).intValue();
        x.set(String.valueOf(""));
        _filler_003.set(String.valueOf(l));
        to.set(String.valueOf(l));
        x.set(String.valueOf(l));
        nat.set(String.valueOf(""));
        _filler_004.set(String.valueOf(nx));
        to.set(String.valueOf(nx));
        nat.set(String.valueOf(nx));
        n = new BigDecimal(String.valueOf("").trim()).intValue();
        n = new BigDecimal(String.valueOf("").trim()).intValue();
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynLiterals012ZeroLengthLiterals().run();
    }
}
