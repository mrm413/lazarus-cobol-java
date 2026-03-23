package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SynMove017MoveFigurativeToNumeric extends CobolProgram {
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
    private int myfld = 0;
    private float bigflt = 0.0f;



    private void main_1() {
    }

    private void myfld() {
    }

    private void myfld_2() {
    }

    private void myfld_3() {
    }

    private void myfld_4() {
    }

    private void myfld_5() {
    }

    private void myfld_6() {
    }

    private void myfld_7() {
    }

    private void myfld_8() {
    }

    private void myfld_9() {
        myfld = new BigDecimal(String.valueOf("\uFFFF").trim()).intValue();
        myfld = new BigDecimal(String.valueOf(" ").trim()).intValue();
        { String _rs = String.valueOf(myfld); StringBuilder _rb = new StringBuilder(_rs); try { _rb.replace(1 - 1, _rb.length(), String.valueOf("\uFFFF")); myfld = Integer.parseInt(_rb.toString().trim()); } catch (Exception _e) {} }
    }

    private void bigflt() {
    }

    private void bigflt_2() {
    }

    private void bigflt_3() {
    }

    private void bigflt_4() {
        System.exit(0);
    }

    @Override
    public void run() {
        main_1();
    }

    public static void main(String[] args) {
        new SynMove017MoveFigurativeToNumeric().run();
    }
}
