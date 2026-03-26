package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc134MfFigurativeToNumeric extends CobolProgram {
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
        CobolDisplay.display("Initial value");
        show_it();
        CobolDisplay.display("MOVE BIGFLT");
        myfld = new BigDecimal(String.valueOf(bigflt).trim()).intValue();
        show_it();
        CobolDisplay.display("MOVE SPACES");
        myfld = new BigDecimal(String.valueOf(" ").trim()).intValue();
        show_it();
        CobolDisplay.display("MOVE LOW-VALUES");
        myfld = new BigDecimal(String.valueOf("\u0000").trim()).intValue();
        show_it();
        CobolDisplay.display("MOVE HIGH-VALUES");
        myfld = new BigDecimal(String.valueOf("\uFFFF").trim()).intValue();
        show_it();
        CobolDisplay.display("MOVE QUOTE");
        myfld = new BigDecimal(String.valueOf("\"").trim()).intValue();
        show_it();
        CobolDisplay.display("MOVE ALL *");
        myfld = new BigDecimal(String.valueOf("*").trim()).intValue();
        show_it();
        CobolDisplay.display("MOVE ALL 0");
        myfld = new BigDecimal(String.valueOf("0").trim()).intValue();
        show_it();
        CobolDisplay.display("MOVE ALL 'A1'");
        myfld = new BigDecimal(String.valueOf("A1").trim()).intValue();
        show_it();
        CobolDisplay.display("MOVE ALL '21'");
        myfld = new BigDecimal(String.valueOf("21").trim()).intValue();
        show_it();
        CobolDisplay.display("MOVE HIGH-VALUES TO (1:)");
        { String _rs = String.valueOf(myfld); StringBuilder _rb = new StringBuilder(_rs); try { _rb.replace(1 - 1, _rb.length(), String.valueOf("\uFFFF")); myfld = Integer.parseInt(_rb.toString().trim()); } catch (Exception _e) {} }
        show_it();
        CobolDisplay.display("MOVE HIGH-VALUES TO BIGFLT");
        bigflt = (float) Double.parseDouble(String.valueOf("\uFFFF").trim());
        show_big();
        CobolProgram.call("dump", bigflt);
        CobolDisplay.display("MOVE QUOTE TO BIGFLT");
        bigflt = (float) Double.parseDouble(String.valueOf("\"").trim());
        show_big();
        CobolProgram.call("dump", bigflt);
        CobolDisplay.display("MOVE ALL * TO BIGFLT");
        bigflt = (float) Double.parseDouble(String.valueOf("*").trim());
        show_big();
        CobolDisplay.display("MOVE ALL '21' TO BIGFLT");
        bigflt = (float) Double.parseDouble(String.valueOf("21").trim());
        show_big();
        System.exit(0);
    }

    private void show_it() {
        CobolProgram.call("dump", myfld);
    }

    private void show_big() {
        CobolDisplay.display("BIGFLT is " + String.valueOf(bigflt));
    }

    @Override
    public void run() {
        main_1();
    }

    public static void main(String[] args) {
        new RunMisc134MfFigurativeToNumeric().run();
    }
}
