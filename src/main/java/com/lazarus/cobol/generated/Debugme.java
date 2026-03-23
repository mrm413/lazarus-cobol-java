package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Debugme extends CobolProgram {
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
    private CobolString numeric_data = new CobolString(1); // Group: numeric-data
    private BigDecimal disp = BigDecimal.ZERO;
    private int disp_u = 0;
    private int dispp = 0;
    private int dispp_u = 0;
    private int disppp = 0;
    private int disppp_u = 0;
    private BigDecimal bin = BigDecimal.ZERO;
    private short bin_u = (short) 0;
    private BigDecimal cmp3 = BigDecimal.ZERO;
    private BigDecimal cmp3_u = BigDecimal.ZERO;
    private BigDecimal cmp5 = BigDecimal.ZERO;
    private short cmp5_u = (short) 0;
    private BigDecimal cmp6 = BigDecimal.ZERO;
    private BigDecimal cmpx = BigDecimal.ZERO;
    private short cmpx_u = (short) 0;
    private BigDecimal cmpn = BigDecimal.ZERO;
    private int cmpn_u = 0;
    private int chr = 0;
    private int chr_u = 0;
    private int shrt = 0;
    private int shrt_u = 0;
    private int cb_long = 0;
    private int long_u = 0;
    private int dble = 0;
    private int dble_u = 0;

    // LOCAL-STORAGE SECTION
    private CobolString var1 = new CobolString(1);
    private CobolString var2 = new CobolString(1); // Group: var2
    private CobolString var2a = new CobolString(1);
    private int var2b = 0;



    @Override
    public void run() {
    }

    public static void main(String[] args) {
        new Debugme().run();
    }
}
