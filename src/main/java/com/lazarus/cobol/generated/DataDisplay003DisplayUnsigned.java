package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataDisplay003DisplayUnsigned extends CobolProgram {
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
    private int x_bcu = 0;
    private int x_bsu = 0;
    private int x_biu = 0;
    private int x_blu = 0;
    private int x_bdu = 0;
    private CobolString x_us = new CobolString(1);
    private CobolString x_ui = new CobolString(1);



    private void para_main() {
    }

    private void x_bcu() {
        CobolDisplay.display(String.valueOf(x_bcu));
        x_bcu = new BigDecimal(String.valueOf(x_bcu + 1).trim()).intValue();
        CobolDisplay.display(String.valueOf(x_bcu));
    }

    private void x_bsu() {
        CobolDisplay.display(String.valueOf(x_bsu));
        x_bsu = new BigDecimal(String.valueOf(x_bsu + 1).trim()).intValue();
        CobolDisplay.display(String.valueOf(x_bsu));
    }

    private void x_biu() {
        CobolDisplay.display(String.valueOf(x_biu));
        x_biu = new BigDecimal(String.valueOf(x_biu + 1).trim()).intValue();
        CobolDisplay.display(String.valueOf(x_biu));
    }

    private void x_blu() {
        CobolDisplay.display(String.valueOf(x_blu));
        x_blu = new BigDecimal(String.valueOf(x_blu + 1).trim()).intValue();
        CobolDisplay.display(String.valueOf(x_blu));
    }

    private void x_bdu() {
        CobolDisplay.display(String.valueOf(x_bdu));
        x_bdu = new BigDecimal(String.valueOf(x_bdu + 1).trim()).intValue();
        CobolDisplay.display(String.valueOf(x_bdu));
    }

    private void x_us() {
        CobolDisplay.display(String.valueOf(x_us));
        x_us.set(new BigDecimal(String.valueOf(x_us).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        CobolDisplay.display(String.valueOf(x_us));
    }

    private void x_ui() {
        CobolDisplay.display(String.valueOf(x_ui));
        x_ui.set(new BigDecimal(String.valueOf(x_ui).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        CobolDisplay.display(String.valueOf(x_ui));
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new DataDisplay003DisplayUnsigned().run();
    }
}
