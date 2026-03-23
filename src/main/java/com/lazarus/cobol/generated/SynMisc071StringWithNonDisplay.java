package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMisc071StringWithNonDisplay extends CobolProgram {
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
    private short i_x = (short) 0;
    private short i_b = (short) 0;
    private BigDecimal i_p = BigDecimal.ZERO;
    private int i_d = 0;
    private float i_f = 0.0f;
    private CobolString tstwrk = new CobolString(48);



    private void main_10() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(" ID:");
            _sb.append(String.valueOf(i_d));
            tstwrk.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(" IX:");
            _sb.append(String.valueOf(i_x));
            _sb.append(" IB:");
            _sb.append(String.valueOf(i_b));
            _sb.append(" ID:");
            _sb.append(String.valueOf(i_d));
            _sb.append(" IP:");
            _sb.append(String.valueOf(i_p));
            _sb.append(" IF:");
            _sb.append(String.valueOf(i_f));
            tstwrk.set(_sb.toString());
        }
        System.exit(0);
    }

    @Override
    public void run() {
        main_10();
    }

    public static void main(String[] args) {
        new SynMisc071StringWithNonDisplay().run();
    }
}
