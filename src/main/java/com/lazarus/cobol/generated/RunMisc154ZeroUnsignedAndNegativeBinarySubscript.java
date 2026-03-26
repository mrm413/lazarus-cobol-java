package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc154ZeroUnsignedAndNegativeBinarySubscript extends CobolProgram {
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
    private short ubin = (short) 0;
    private int sbin = 0;
    private int unup = 0;
    private int snup = 0;
    private int uchr = 0;
    private int schr = 0;
    private CobolString tstrec = new CobolString(1); // Group: TSTREC
    private CobolString[] filler_1 = new CobolString[300];
    private CobolString[] tstx = new CobolString[3];
    private CobolString[] tsty = new CobolString[300];



    private void para_main() {
        if (tstx[1 - 1] == null) tstx[1 - 1] = new CobolString(256);
        tstx[1 - 1].set(String.valueOf("A"));
        if (tstx[2 - 1] == null) tstx[2 - 1] = new CobolString(256);
        tstx[2 - 1].set(String.valueOf("B"));
        if (tstx[3 - 1] == null) tstx[3 - 1] = new CobolString(256);
        tstx[3 - 1].set(String.valueOf("C"));
        if (tsty[1 - 1] == null) tsty[1 - 1] = new CobolString(256);
        tsty[1 - 1].set(String.valueOf("1"));
        if (tsty[2 - 1] == null) tsty[2 - 1] = new CobolString(256);
        tsty[2 - 1].set(String.valueOf("2"));
        if (tsty[3 - 1] == null) tsty[3 - 1] = new CobolString(256);
        tsty[3 - 1].set(String.valueOf("3"));
        unup = new BigDecimal(String.valueOf(0).trim()).intValue();
        CobolDisplay.display("UNUP: " + String.valueOf(unup) + " is :" + String.valueOf(tsty[unup - 1]) + ":");
        snup = new BigDecimal(String.valueOf(0).trim()).intValue();
        CobolDisplay.display("SNUP: " + String.valueOf(snup) + " is :" + String.valueOf(tsty[snup - 1]) + ":");
        sbin = new BigDecimal(String.valueOf(0).trim()).intValue();
        CobolDisplay.display("SBIN: " + String.valueOf(sbin) + " is :" + String.valueOf(tsty[sbin - 1]) + ":");
        sbin = new BigDecimal(String.valueOf(-1).trim()).intValue();
        CobolDisplay.display("SBIN: " + String.valueOf(sbin) + " is :" + String.valueOf(tsty[sbin - 1]) + ":");
        if (tsty[sbin - 1] == null) tsty[sbin - 1] = new CobolString(256);
        tsty[sbin - 1].set(String.valueOf("xxx"));
        CobolDisplay.display("SBIN: " + String.valueOf(sbin) + " is :" + String.valueOf(tsty[sbin - 1]) + ":");
        /* RAW: * The following would often core */
        ubin = new BigDecimal(String.valueOf(0).trim()).shortValue();
        CobolDisplay.display("UBIN: " + String.valueOf(ubin) + " is :" + String.valueOf(tsty[ubin - 1]) + ":");
        if (tsty[ubin - 1] == null) tsty[ubin - 1] = new CobolString(256);
        tsty[ubin - 1].set(String.valueOf("yyy"));
        ubin = new BigDecimal(String.valueOf(1).trim()).shortValue();
        CobolDisplay.display("UBIN: " + String.valueOf(ubin) + " is :" + String.valueOf(tsty[ubin - 1]) + ":");
        uchr = new BigDecimal(String.valueOf(0).trim()).intValue();
        CobolDisplay.display("UCHR: " + String.valueOf(uchr) + " is :" + String.valueOf(tsty[uchr - 1]) + ":");
        schr = new BigDecimal(String.valueOf(-1).trim()).intValue();
        CobolDisplay.display("SCHR: " + String.valueOf(schr) + " is :" + String.valueOf(tsty[schr - 1]) + ":");
        if (tsty[129 - 1] == null) tsty[129 - 1] = new CobolString(256);
        tsty[129 - 1].set(String.valueOf("zzz"));
        uchr = new BigDecimal(String.valueOf(129).trim()).intValue();
        CobolDisplay.display("UCHR: " + String.valueOf(uchr) + " is :" + String.valueOf(tsty[uchr - 1]) + ":");
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc154ZeroUnsignedAndNegativeBinarySubscript().run();
    }
}
