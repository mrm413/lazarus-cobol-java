package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc112InvalidUseOfConditionName extends CobolProgram {
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
    private CobolString val = new CobolString(10);
    private CobolString val2 = new CobolString(50);
    private CobolString target = new CobolString(50);
    private int vnum = 0;
    private CobolString[] tentry = new CobolString[6];


    private CobolString val_i1 = new CobolString(256); // fallback
    private CobolString val_i2 = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString vnum_9 = new CobolString(256); // fallback
    private CobolString vnum_1 = new CobolString(256); // fallback
    private CobolString vnum_2 = new CobolString(256); // fallback
    private CobolString address = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private void para_main() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(val_i1));
            target.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy(String.valueOf(val2), String.valueOf(val_i2)));
            target.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(val2));
            val_i1.set(_sb.toString());
        }
        /* UNSTRING — requires runtime implementation */
        target.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        target.set(String.valueOf(""));
        /* UNSTRING — requires runtime implementation */
        val_i1.set(String.valueOf(""));
        val_i2.set(String.valueOf(val_i1));
        _filler_002.set(String.valueOf(val_i1));
        if (tentry[Integer.parseInt(String.valueOf(vnum_9).trim()) - 1] == null) tentry[Integer.parseInt(String.valueOf(vnum_9).trim()) - 1] = new CobolString(256);
        tentry[Integer.parseInt(String.valueOf(vnum_9).trim()) - 1].set(String.valueOf(val_i1));
        vnum_1.set(String.valueOf(vnum));
        vnum = new BigDecimal(String.valueOf((Integer.parseInt(String.valueOf(vnum_1).trim()) / Integer.parseInt(String.valueOf(vnum_2).trim()))).trim()).intValue();
        val_i1();
        return;
    }

    private void val_i1() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new SynMisc112InvalidUseOfConditionName().run();
    }
}
