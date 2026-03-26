package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFunctions013FunctionContentOf extends CobolProgram {
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
    private long p = 0L;
    private CobolString x = new CobolString(4);
    private CobolString b = new CobolString(10);


    private CobolString address = new CobolString(256); // fallback

    private void para_main() {
        p = new BigDecimal(String.valueOf(address).trim()).longValue();
        if (!String.valueOf(CobolIntrinsics.content_of(p)).equals(String.valueOf("ABC"))) {
            CobolDisplay.display("CONTENT-OF(ptr) wrong");
        }
        if (!String.valueOf(CobolIntrinsics.content_of(p, 2)).equals(String.valueOf("AB"))) {
            CobolDisplay.display("CONTENT-OF(ptr, len) wrong");
        }
        if (!String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf(" "))) {
            CobolDisplay.display("unexpected exception (1): " + String.valueOf(CobolIntrinsics.exception_status()));
        }
        p = new BigDecimal(String.valueOf(0).trim()).longValue();
        x.set(String.valueOf("PPPP"));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.content_of(p)));
            x.set(_sb.toString());
        }
        if (!String.valueOf(x).equals(String.valueOf("PPPP"))) {
            CobolDisplay.display("CONTENT-OF empty POINTER wrong: \"" + String.valueOf(x) + "'");
        }
        if (!String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf("EC-DATA-PTR-NULL"))) {
            CobolDisplay.display("missing exception (1)");
        }
        /* ALLOCATE — dynamic memory, not typical in Java */
        p = new BigDecimal(String.valueOf(address).trim()).longValue();
        if (!String.valueOf(CobolIntrinsics.content_of(p, 1)).equals(String.valueOf(" "))) {
            CobolDisplay.display("CONTENT-OF allocated BASED item wrong");
        }
        if (!String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf(" "))) {
            CobolDisplay.display("unexpected exception (2): " + String.valueOf(CobolIntrinsics.exception_status()));
        }
        b.set(""); /* FREE */
        p = new BigDecimal(String.valueOf(address).trim()).longValue();
        x.set(String.valueOf("BBBB"));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(CobolIntrinsics.content_of(p)));
            x.set(_sb.toString());
        }
        if (!String.valueOf(x).equals(String.valueOf("BBBB"))) {
            CobolDisplay.display("CONTENT-OF unallocated BASED item wrong: \"" + String.valueOf(x) + "\"");
        }
        if (!String.valueOf(CobolIntrinsics.exception_status()).equals(String.valueOf("EC-DATA-PTR-NULL"))) {
            CobolDisplay.display("missing exception (2)");
        }
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFunctions013FunctionContentOf().run();
    }
}
