package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc078UnstringWithFunctionLiteral extends CobolProgram {
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
    private CobolString tstuns = new CobolString(479);
    private CobolString[] prm = new CobolString[4];


    private CobolString _filler_001 = new CobolString(256); // fallback

    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_005 = new CobolString(256); // fallback
    private CobolString _filler_006 = new CobolString(256); // fallback
    private CobolString _filler_007 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_009 = new CobolString(256); // fallback
    private CobolString _filler_010 = new CobolString(256); // fallback
    private CobolString _filler_011 = new CobolString(256); // fallback
    private CobolString _filler_012 = new CobolString(256); // fallback
    private CobolString _filler_013 = new CobolString(256); // fallback
    private void para_main() {
        tstuns.set(String.valueOf("The,Quick,Brown,Fox"));
        /* UNSTRING — requires runtime implementation */
        if (prm[1 - 1] == null) prm[1 - 1] = new CobolString(256);
        prm[1 - 1].set(String.valueOf(""));
        _filler_002.set(String.valueOf(""));
        if (prm[2 - 1] == null) prm[2 - 1] = new CobolString(256);
        prm[2 - 1].set(String.valueOf(""));
        _filler_003.set(String.valueOf(""));
        if (prm[3 - 1] == null) prm[3 - 1] = new CobolString(256);
        prm[3 - 1].set(String.valueOf(""));
        _filler_004.set(String.valueOf(""));
        if (prm[4 - 1] == null) prm[4 - 1] = new CobolString(256);
        prm[4 - 1].set(String.valueOf(""));
        CobolDisplay.display("PRM(1) is " + String.valueOf(prm[1 - 1]) + ":");
        CobolDisplay.display("PRM(2) is " + String.valueOf(prm[2 - 1]) + ":");
        CobolDisplay.display("PRM(3) is " + String.valueOf(prm[3 - 1]) + ":");
        CobolDisplay.display("PRM(4) is " + String.valueOf(prm[4 - 1]) + ":");
        /* UNSTRING — requires runtime implementation */
        if (prm[1 - 1] == null) prm[1 - 1] = new CobolString(256);
        prm[1 - 1].set(String.valueOf(""));
        _filler_005.set(String.valueOf(""));
        if (prm[2 - 1] == null) prm[2 - 1] = new CobolString(256);
        prm[2 - 1].set(String.valueOf(""));
        _filler_006.set(String.valueOf(""));
        if (prm[3 - 1] == null) prm[3 - 1] = new CobolString(256);
        prm[3 - 1].set(String.valueOf(""));
        _filler_007.set(String.valueOf(""));
        if (prm[4 - 1] == null) prm[4 - 1] = new CobolString(256);
        prm[4 - 1].set(String.valueOf(""));
        CobolDisplay.display("Now using UPPER-CASE");
        CobolDisplay.display("PRM(1) is " + String.valueOf(prm[1 - 1]) + ":");
        CobolDisplay.display("PRM(2) is " + String.valueOf(prm[2 - 1]) + ":");
        CobolDisplay.display("PRM(3) is " + String.valueOf(prm[3 - 1]) + ":");
        CobolDisplay.display("PRM(4) is " + String.valueOf(prm[4 - 1]) + ":");
        /* UNSTRING — requires runtime implementation */
        if (prm[1 - 1] == null) prm[1 - 1] = new CobolString(256);
        prm[1 - 1].set(String.valueOf(""));
        _filler_008.set(String.valueOf(""));
        if (prm[2 - 1] == null) prm[2 - 1] = new CobolString(256);
        prm[2 - 1].set(String.valueOf(""));
        _filler_009.set(String.valueOf(""));
        if (prm[3 - 1] == null) prm[3 - 1] = new CobolString(256);
        prm[3 - 1].set(String.valueOf(""));
        _filler_010.set(String.valueOf(""));
        if (prm[4 - 1] == null) prm[4 - 1] = new CobolString(256);
        prm[4 - 1].set(String.valueOf(""));
        CobolDisplay.display("Now using Literal");
        CobolDisplay.display("PRM(1) is " + String.valueOf(prm[1 - 1]) + ":");
        CobolDisplay.display("PRM(2) is " + String.valueOf(prm[2 - 1]) + ":");
        CobolDisplay.display("PRM(3) is " + String.valueOf(prm[3 - 1]) + ":");
        CobolDisplay.display("PRM(4) is " + String.valueOf(prm[4 - 1]) + ":");
        /* UNSTRING — requires runtime implementation */
        if (prm[1 - 1] == null) prm[1 - 1] = new CobolString(256);
        prm[1 - 1].set(String.valueOf(""));
        _filler_011.set(String.valueOf(""));
        if (prm[2 - 1] == null) prm[2 - 1] = new CobolString(256);
        prm[2 - 1].set(String.valueOf(""));
        _filler_012.set(String.valueOf(""));
        if (prm[3 - 1] == null) prm[3 - 1] = new CobolString(256);
        prm[3 - 1].set(String.valueOf(""));
        _filler_013.set(String.valueOf(""));
        if (prm[4 - 1] == null) prm[4 - 1] = new CobolString(256);
        prm[4 - 1].set(String.valueOf(""));
        CobolDisplay.display("Now using Literal + LOWER-CASE");
        CobolDisplay.display("PRM(1) is " + String.valueOf(prm[1 - 1]) + ":");
        CobolDisplay.display("PRM(2) is " + String.valueOf(prm[2 - 1]) + ":");
        CobolDisplay.display("PRM(3) is " + String.valueOf(prm[3 - 1]) + ":");
        CobolDisplay.display("PRM(4) is " + String.valueOf(prm[4 - 1]) + ":");
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc078UnstringWithFunctionLiteral().run();
    }
}
