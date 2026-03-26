package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc121ComputingOfDifferentUsagesWDecimalPoint extends CobolProgram {
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

    private CobolString bcl_b = new CobolString(256); // fallback
    private CobolString bcl_a = new CobolString(256); // fallback
    private CobolString bcl_res = new CobolString(256); // fallback
    private CobolString bc_b = new CobolString(256); // fallback
    private CobolString bc_a = new CobolString(256); // fallback
    private CobolString bc_res = new CobolString(256); // fallback
    private CobolString bd_b = new CobolString(256); // fallback
    private CobolString bd_a = new CobolString(256); // fallback
    private CobolString bd_res = new CobolString(256); // fallback
    private CobolString bl_b = new CobolString(256); // fallback
    private CobolString bl_a = new CobolString(256); // fallback
    private CobolString bl_res = new CobolString(256); // fallback
    private CobolString c_b = new CobolString(256); // fallback
    private CobolString c_a = new CobolString(256); // fallback
    private CobolString c_res = new CobolString(256); // fallback
    private CobolString c1_b = new CobolString(256); // fallback
    private CobolString c1_a = new CobolString(256); // fallback
    private CobolString c1_res = new CobolString(256); // fallback
    private CobolString c2_b = new CobolString(256); // fallback
    private CobolString c2_a = new CobolString(256); // fallback
    private CobolString c2_res = new CobolString(256); // fallback
    private CobolString c3_b = new CobolString(256); // fallback
    private CobolString c3_a = new CobolString(256); // fallback
    private CobolString c3_res = new CobolString(256); // fallback
    private CobolString c5_b = new CobolString(256); // fallback
    private CobolString c5_a = new CobolString(256); // fallback
    private CobolString c5_res = new CobolString(256); // fallback
    private CobolString c6_b = new CobolString(256); // fallback
    private CobolString c6_a = new CobolString(256); // fallback
    private CobolString c6_res = new CobolString(256); // fallback
    private CobolString cn9_b = new CobolString(256); // fallback
    private CobolString cn9_a = new CobolString(256); // fallback
    private CobolString cn9_res = new CobolString(256); // fallback
    private CobolString cnx_b = new CobolString(256); // fallback
    private CobolString cnx_a = new CobolString(256); // fallback
    private CobolString cnx_res = new CobolString(256); // fallback
    private CobolString cx9_b = new CobolString(256); // fallback
    private CobolString cx9_a = new CobolString(256); // fallback
    private CobolString cx9_res = new CobolString(256); // fallback
    private CobolString cxx_b = new CobolString(256); // fallback
    private CobolString cxx_a = new CobolString(256); // fallback
    private CobolString cxx_res = new CobolString(256); // fallback
    private CobolString d_b = new CobolString(256); // fallback
    private CobolString d_a = new CobolString(256); // fallback
    private CobolString d_res = new CobolString(256); // fallback
    private CobolString fd16_b = new CobolString(256); // fallback
    private CobolString fd16_a = new CobolString(256); // fallback
    private CobolString fd16_res = new CobolString(256); // fallback
    private CobolString fd34_b = new CobolString(256); // fallback
    private CobolString fd34_a = new CobolString(256); // fallback
    private CobolString fd34_res = new CobolString(256); // fallback
    private CobolString fl_b = new CobolString(256); // fallback
    private CobolString fl_a = new CobolString(256); // fallback
    private CobolString fl_res = new CobolString(256); // fallback
    private CobolString fs_b = new CobolString(256); // fallback
    private CobolString fs_a = new CobolString(256); // fallback
    private CobolString fs_res = new CobolString(256); // fallback

    private void para_main() {
        para_main_part0();
        para_main_part1();
    }
    private void para_main_part0() {
        /* RAW: *  */
        bcl_a.set(new BigDecimal(String.valueOf(bcl_a).trim()).add(new BigDecimal(String.valueOf(bcl_b).trim())).toPlainString());
        bcl_res.set(String.valueOf(bcl_a));
        if (!String.valueOf(bcl_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-C-LONG + BINARY-C-LONG");
        }
        bcl_a.set(String.valueOf(1));
        bcl_a.set(new BigDecimal(String.valueOf(bcl_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        bcl_res.set(String.valueOf(bcl_a));
        if (!String.valueOf(bcl_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-C-LONG + NUM");
        }
        bcl_a.set(String.valueOf(11));
        bcl_a.set(new BigDecimal(String.valueOf(bcl_a).trim()).subtract(new BigDecimal(String.valueOf(bcl_b).trim())).toPlainString());
        bcl_res.set(String.valueOf(bcl_a));
        if (!String.valueOf(bcl_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-C-LONG - BINARY-C-LONG");
        }
        bcl_a.set(String.valueOf(11));
        bcl_a.set(new BigDecimal(String.valueOf(bcl_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        bcl_res.set(String.valueOf(bcl_a));
        if (!String.valueOf(bcl_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-C-LONG - NUM");
        }
        /* RAW: *  */
        bc_a.set(new BigDecimal(String.valueOf(bc_a).trim()).add(new BigDecimal(String.valueOf(bc_b).trim())).toPlainString());
        bc_res.set(String.valueOf(bc_a));
        if (!String.valueOf(bc_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-CHAR + BINARY-CHAR");
        }
        bc_a.set(String.valueOf(1));
        bc_a.set(new BigDecimal(String.valueOf(bc_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        bc_res.set(String.valueOf(bc_a));
        if (!String.valueOf(bc_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-CHAR + NUM");
        }
        bc_a.set(String.valueOf(11));
        bc_a.set(new BigDecimal(String.valueOf(bc_a).trim()).subtract(new BigDecimal(String.valueOf(bc_b).trim())).toPlainString());
        bc_res.set(String.valueOf(bc_a));
        if (!String.valueOf(bc_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-CHAR - BINARY-CHAR");
        }
        bc_a.set(String.valueOf(11));
        bc_a.set(new BigDecimal(String.valueOf(bc_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        bc_res.set(String.valueOf(bc_a));
        if (!String.valueOf(bc_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-CHAR - NUM");
        }
        /* RAW: *  */
        bd_a.set(new BigDecimal(String.valueOf(bd_a).trim()).add(new BigDecimal(String.valueOf(bd_b).trim())).toPlainString());
        bd_res.set(String.valueOf(bd_a));
        if (!String.valueOf(bd_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-DOUBLE + BINARY-DOUBLE");
        }
        bd_a.set(String.valueOf(1));
        bd_a.set(new BigDecimal(String.valueOf(bd_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        bd_res.set(String.valueOf(bd_a));
        if (!String.valueOf(bd_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-DOUBLE + NUM");
        }
        bd_a.set(String.valueOf(11));
        bd_a.set(new BigDecimal(String.valueOf(bd_a).trim()).subtract(new BigDecimal(String.valueOf(bd_b).trim())).toPlainString());
        bd_res.set(String.valueOf(bd_a));
        if (!String.valueOf(bd_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-DOUBLE - BINARY-DOUBLE");
        }
        bd_a.set(String.valueOf(11));
        bd_a.set(new BigDecimal(String.valueOf(bd_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        bd_res.set(String.valueOf(bd_a));
        if (!String.valueOf(bd_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-DOUBLE - NUM");
        }
        /* RAW: *  */
        bl_a.set(new BigDecimal(String.valueOf(bl_a).trim()).add(new BigDecimal(String.valueOf(bl_b).trim())).toPlainString());
        bl_res.set(String.valueOf(bl_a));
        if (!String.valueOf(bl_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-LONG + BINARY-LONG");
        }
        bl_a.set(String.valueOf(1));
        bl_a.set(new BigDecimal(String.valueOf(bl_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        bl_res.set(String.valueOf(bl_a));
        if (!String.valueOf(bl_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-LONG + NUM");
        }
        bl_a.set(String.valueOf(11));
        bl_a.set(new BigDecimal(String.valueOf(bl_a).trim()).subtract(new BigDecimal(String.valueOf(bl_b).trim())).toPlainString());
        bl_res.set(String.valueOf(bl_a));
        if (!String.valueOf(bl_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-LONG - BINARY-LONG");
        }
        bl_a.set(String.valueOf(11));
        bl_a.set(new BigDecimal(String.valueOf(bl_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        bl_res.set(String.valueOf(bl_a));
        if (!String.valueOf(bl_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-LONG - NUM");
        }
        /* RAW: *  */
        c_a.set(new BigDecimal(String.valueOf(c_a).trim()).add(new BigDecimal(String.valueOf(c_b).trim())).toPlainString());
        c_res.set(String.valueOf(c_a));
        if (!String.valueOf(c_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP + COMP");
        }
        c_a.set(String.valueOf(1));
        c_a.set(new BigDecimal(String.valueOf(c_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        c_res.set(String.valueOf(c_a));
        if (!String.valueOf(c_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP + NUM");
        }
        c_a.set(String.valueOf(11));
        c_a.set(new BigDecimal(String.valueOf(c_a).trim()).subtract(new BigDecimal(String.valueOf(c_b).trim())).toPlainString());
        c_res.set(String.valueOf(c_a));
        if (!String.valueOf(c_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP - COMP");
        }
        c_a.set(String.valueOf(11));
        c_a.set(new BigDecimal(String.valueOf(c_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        c_res.set(String.valueOf(c_a));
        if (!String.valueOf(c_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP - NUM");
        }
        /* RAW: *  */
        c1_a.set(new BigDecimal(String.valueOf(c1_a).trim()).add(new BigDecimal(String.valueOf(c1_b).trim())).toPlainString());
        c1_res.set(String.valueOf(c1_a));
        if (!String.valueOf(c1_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-1 + COMP-1");
        }
        c1_a.set(String.valueOf(1));
        c1_a.set(new BigDecimal(String.valueOf(c1_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        c1_res.set(String.valueOf(c1_a));
        if (!String.valueOf(c1_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-1 + NUM");
        }
        c1_a.set(String.valueOf(11));
        c1_a.set(new BigDecimal(String.valueOf(c1_a).trim()).subtract(new BigDecimal(String.valueOf(c1_b).trim())).toPlainString());
        c1_res.set(String.valueOf(c1_a));
        if (!String.valueOf(c1_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-1 - COMP-1");
        }
        c1_a.set(String.valueOf(11));
        c1_a.set(new BigDecimal(String.valueOf(c1_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        c1_res.set(String.valueOf(c1_a));
        if (!String.valueOf(c1_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-1 - NUM");
        }
        /* RAW: *  */
        c2_a.set(new BigDecimal(String.valueOf(c2_a).trim()).add(new BigDecimal(String.valueOf(c2_b).trim())).toPlainString());
        c2_res.set(String.valueOf(c2_a));
        if (!String.valueOf(c2_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-2 + COMP-2");
        }
        c2_a.set(String.valueOf(1));
        c2_a.set(new BigDecimal(String.valueOf(c2_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        c2_res.set(String.valueOf(c2_a));
        if (!String.valueOf(c2_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-2 + NUM");
        }
        c2_a.set(String.valueOf(11));
        c2_a.set(new BigDecimal(String.valueOf(c2_a).trim()).subtract(new BigDecimal(String.valueOf(c2_b).trim())).toPlainString());
        c2_res.set(String.valueOf(c2_a));
        if (!String.valueOf(c2_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-2 - COMP-2");
        }
        c2_a.set(String.valueOf(11));
        c2_a.set(new BigDecimal(String.valueOf(c2_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        c2_res.set(String.valueOf(c2_a));
        if (!String.valueOf(c2_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-2 - NUM");
        }
        /* RAW: *  */
        c3_a.set(new BigDecimal(String.valueOf(c3_a).trim()).add(new BigDecimal(String.valueOf(c3_b).trim())).toPlainString());
        c3_res.set(String.valueOf(c3_a));
        if (!String.valueOf(c3_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-3 + COMP-3");
        }
        c3_a.set(String.valueOf(1));
        c3_a.set(new BigDecimal(String.valueOf(c3_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        c3_res.set(String.valueOf(c3_a));
        if (!String.valueOf(c3_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-3 + NUM");
        }
        c3_a.set(String.valueOf(11));
        c3_a.set(new BigDecimal(String.valueOf(c3_a).trim()).subtract(new BigDecimal(String.valueOf(c3_b).trim())).toPlainString());
        c3_res.set(String.valueOf(c3_a));
        if (!String.valueOf(c3_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-3 - COMP-3");
        }
        c3_a.set(String.valueOf(11));
        c3_a.set(new BigDecimal(String.valueOf(c3_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        c3_res.set(String.valueOf(c3_a));
        if (!String.valueOf(c3_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-3 - NUM");
        }
        /* RAW: *  */
        c5_a.set(new BigDecimal(String.valueOf(c5_a).trim()).add(new BigDecimal(String.valueOf(c5_b).trim())).toPlainString());
        c5_res.set(String.valueOf(c5_a));
        if (!String.valueOf(c5_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-5 + COMP-5");
        }
        c5_a.set(String.valueOf(1));
        c5_a.set(new BigDecimal(String.valueOf(c5_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        c5_res.set(String.valueOf(c5_a));
        if (!String.valueOf(c5_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-5 + NUM");
        }
        c5_a.set(String.valueOf(11));
        c5_a.set(new BigDecimal(String.valueOf(c5_a).trim()).subtract(new BigDecimal(String.valueOf(c5_b).trim())).toPlainString());
        c5_res.set(String.valueOf(c5_a));
        if (!String.valueOf(c5_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-5 - COMP-5");
        }
        c5_a.set(String.valueOf(11));
        c5_a.set(new BigDecimal(String.valueOf(c5_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        c5_res.set(String.valueOf(c5_a));
        if (!String.valueOf(c5_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-5 - NUM");
        }
        /* RAW: *  */
        c6_a.set(new BigDecimal(String.valueOf(c6_a).trim()).add(new BigDecimal(String.valueOf(c6_b).trim())).toPlainString());
        c6_res.set(String.valueOf(c6_a));
        if (!String.valueOf(c6_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-6 + COMP-6");
        }
        c6_a.set(String.valueOf(1));
        c6_a.set(new BigDecimal(String.valueOf(c6_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        c6_res.set(String.valueOf(c6_a));
        if (!String.valueOf(c6_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-6 + NUM");
        }
        c6_a.set(String.valueOf(11));
        c6_a.set(new BigDecimal(String.valueOf(c6_a).trim()).subtract(new BigDecimal(String.valueOf(c6_b).trim())).toPlainString());
        c6_res.set(String.valueOf(c6_a));
        if (!String.valueOf(c6_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-6 - COMP-6");
        }
        c6_a.set(String.valueOf(11));
        c6_a.set(new BigDecimal(String.valueOf(c6_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        c6_res.set(String.valueOf(c6_a));
        if (!String.valueOf(c6_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-6 - NUM");
        }
        /* RAW: *  */
        cn9_a.set(new BigDecimal(String.valueOf(cn9_a).trim()).add(new BigDecimal(String.valueOf(cn9_b).trim())).toPlainString());
        cn9_res.set(String.valueOf(cn9_a));
        if (!String.valueOf(cn9_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-N + COMP-N");
        }
        cn9_a.set(String.valueOf(1));
        cn9_a.set(new BigDecimal(String.valueOf(cn9_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        cn9_res.set(String.valueOf(cn9_a));
        if (!String.valueOf(cn9_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-N + NUM");
        }
        cn9_a.set(String.valueOf(11));
        cn9_a.set(new BigDecimal(String.valueOf(cn9_a).trim()).subtract(new BigDecimal(String.valueOf(cn9_b).trim())).toPlainString());
        cn9_res.set(String.valueOf(cn9_a));
        if (!String.valueOf(cn9_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-N - COMP-N");
        }
        cn9_a.set(String.valueOf(11));
        cn9_a.set(new BigDecimal(String.valueOf(cn9_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        cn9_res.set(String.valueOf(cn9_a));
        if (!String.valueOf(cn9_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-N - NUM");
        }
        /* RAW: *  */
        cnx_a.set(new BigDecimal(String.valueOf(cnx_a).trim()).add(new BigDecimal(String.valueOf(cnx_b).trim())).toPlainString());
        cnx_res.set(String.valueOf(cnx_a));
        if (!String.valueOf(cnx_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-N + COMP-N");
        }
        cnx_a.set(String.valueOf(1));
        cnx_a.set(new BigDecimal(String.valueOf(cnx_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        cnx_res.set(String.valueOf(cnx_a));
        if (!String.valueOf(cnx_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-N + NUM");
        }
        cnx_a.set(String.valueOf(11));
        cnx_a.set(new BigDecimal(String.valueOf(cnx_a).trim()).subtract(new BigDecimal(String.valueOf(cnx_b).trim())).toPlainString());
        cnx_res.set(String.valueOf(cnx_a));
        if (!String.valueOf(cnx_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-N - COMP-N");
        }
        cnx_a.set(String.valueOf(11));
        cnx_a.set(new BigDecimal(String.valueOf(cnx_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        cnx_res.set(String.valueOf(cnx_a));
        if (!String.valueOf(cnx_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-N - NUM");
        }
        /* RAW: *  */
        cx9_a.set(new BigDecimal(String.valueOf(cx9_a).trim()).add(new BigDecimal(String.valueOf(cx9_b).trim())).toPlainString());
        cx9_res.set(String.valueOf(cx9_a));
        if (!String.valueOf(cx9_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-X + COMP-X");
        }
        cx9_a.set(String.valueOf(1));
        cx9_a.set(new BigDecimal(String.valueOf(cx9_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        cx9_res.set(String.valueOf(cx9_a));
        if (!String.valueOf(cx9_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-X + NUM");
        }
        cx9_a.set(String.valueOf(11));
        cx9_a.set(new BigDecimal(String.valueOf(cx9_a).trim()).subtract(new BigDecimal(String.valueOf(cx9_b).trim())).toPlainString());
        cx9_res.set(String.valueOf(cx9_a));
        if (!String.valueOf(cx9_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-X - COMP-X");
        }
        cx9_a.set(String.valueOf(11));
        cx9_a.set(new BigDecimal(String.valueOf(cx9_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        cx9_res.set(String.valueOf(cx9_a));
        if (!String.valueOf(cx9_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-X - NUM");
        }
        /* RAW: *  */
        cxx_a.set(new BigDecimal(String.valueOf(cxx_a).trim()).add(new BigDecimal(String.valueOf(cxx_b).trim())).toPlainString());
        cxx_res.set(String.valueOf(cxx_a));
        if (!String.valueOf(cxx_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-X + COMP-X");
        }
        cxx_a.set(String.valueOf(1));
        cxx_a.set(new BigDecimal(String.valueOf(cxx_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        cxx_res.set(String.valueOf(cxx_a));
        if (!String.valueOf(cxx_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-X + NUM");
        }
        cxx_a.set(String.valueOf(11));
        cxx_a.set(new BigDecimal(String.valueOf(cxx_a).trim()).subtract(new BigDecimal(String.valueOf(cxx_b).trim())).toPlainString());
        cxx_res.set(String.valueOf(cxx_a));
        if (!String.valueOf(cxx_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-X - COMP-X");
        }
        cxx_a.set(String.valueOf(11));
        cxx_a.set(new BigDecimal(String.valueOf(cxx_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        cxx_res.set(String.valueOf(cxx_a));
        if (!String.valueOf(cxx_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-X - NUM");
        }
        /* RAW: *  */
        d_a.set(new BigDecimal(String.valueOf(d_a).trim()).add(new BigDecimal(String.valueOf(d_b).trim())).toPlainString());
        d_res.set(String.valueOf(d_a));
        if (!String.valueOf(d_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR DISPLAY + DISPLAY");
        }
        d_a.set(String.valueOf(1));
        d_a.set(new BigDecimal(String.valueOf(d_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        d_res.set(String.valueOf(d_a));
        if (!String.valueOf(d_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR DISPLAY + NUM");
        }
        d_a.set(String.valueOf(11));
        d_a.set(new BigDecimal(String.valueOf(d_a).trim()).subtract(new BigDecimal(String.valueOf(d_b).trim())).toPlainString());
        d_res.set(String.valueOf(d_a));
        if (!String.valueOf(d_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR DISPLAY - DISPLAY");
        }
        d_a.set(String.valueOf(11));
        d_a.set(new BigDecimal(String.valueOf(d_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        d_res.set(String.valueOf(d_a));
        if (!String.valueOf(d_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR DISPLAY - NUM");
        }
        /* RAW: *  */
        fd16_a.set(new BigDecimal(String.valueOf(fd16_a).trim()).add(new BigDecimal(String.valueOf(fd16_b).trim())).toPlainString());
        fd16_res.set(String.valueOf(fd16_a));
        if (!String.valueOf(fd16_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-16 + FLOAT-DECIMAL-16");
        }
        fd16_a.set(String.valueOf(1));
        fd16_a.set(new BigDecimal(String.valueOf(fd16_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        fd16_res.set(String.valueOf(fd16_a));
        if (!String.valueOf(fd16_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-16 + NUM");
        }
        fd16_a.set(String.valueOf(11));
        fd16_a.set(new BigDecimal(String.valueOf(fd16_a).trim()).subtract(new BigDecimal(String.valueOf(fd16_b).trim())).toPlainString());
        fd16_res.set(String.valueOf(fd16_a));
        if (!String.valueOf(fd16_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-16 - FLOAT-DECIMAL-16");
        }
        fd16_a.set(String.valueOf(11));
        fd16_a.set(new BigDecimal(String.valueOf(fd16_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        fd16_res.set(String.valueOf(fd16_a));
        if (!String.valueOf(fd16_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-16 - NUM");
        }
        /* RAW: *  */
        fd34_a.set(new BigDecimal(String.valueOf(fd34_a).trim()).add(new BigDecimal(String.valueOf(fd34_b).trim())).toPlainString());
        fd34_res.set(String.valueOf(fd34_a));
        if (!String.valueOf(fd34_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-34 + FLOAT-DECIMAL-34");
        }
        fd34_a.set(String.valueOf(1));
        fd34_a.set(new BigDecimal(String.valueOf(fd34_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        fd34_res.set(String.valueOf(fd34_a));
        if (!String.valueOf(fd34_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-34 + NUM");
        }
        fd34_a.set(String.valueOf(11));
        fd34_a.set(new BigDecimal(String.valueOf(fd34_a).trim()).subtract(new BigDecimal(String.valueOf(fd34_b).trim())).toPlainString());
        fd34_res.set(String.valueOf(fd34_a));
        if (!String.valueOf(fd34_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-34 - FLOAT-DECIMAL-34");
        }
    }
    private void para_main_part1() {
        fd34_a.set(String.valueOf(11));
        fd34_a.set(new BigDecimal(String.valueOf(fd34_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        fd34_res.set(String.valueOf(fd34_a));
        if (!String.valueOf(fd34_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-34 - NUM");
        }
        /* RAW: *  */
        fl_a.set(new BigDecimal(String.valueOf(fl_a).trim()).add(new BigDecimal(String.valueOf(fl_b).trim())).toPlainString());
        fl_res.set(String.valueOf(fl_a));
        if (!String.valueOf(fl_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-LONG + FLOAT-LONG");
        }
        fl_a.set(String.valueOf(1));
        fl_a.set(new BigDecimal(String.valueOf(fl_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        fl_res.set(String.valueOf(fl_a));
        if (!String.valueOf(fl_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-LONG + NUM");
        }
        fl_a.set(String.valueOf(11));
        fl_a.set(new BigDecimal(String.valueOf(fl_a).trim()).subtract(new BigDecimal(String.valueOf(fl_b).trim())).toPlainString());
        fl_res.set(String.valueOf(fl_a));
        if (!String.valueOf(fl_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-LONG - FLOAT-LONG");
        }
        fl_a.set(String.valueOf(11));
        fl_a.set(new BigDecimal(String.valueOf(fl_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        fl_res.set(String.valueOf(fl_a));
        if (!String.valueOf(fl_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-LONG - NUM");
        }
        /* RAW: *  */
        fs_a.set(new BigDecimal(String.valueOf(fs_a).trim()).add(new BigDecimal(String.valueOf(fs_b).trim())).toPlainString());
        fs_res.set(String.valueOf(fs_a));
        if (!String.valueOf(fs_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-SHORT + FLOAT-SHORT");
        }
        fs_a.set(String.valueOf(1));
        fs_a.set(new BigDecimal(String.valueOf(fs_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        fs_res.set(String.valueOf(fs_a));
        if (!String.valueOf(fs_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-SHORT + NUM");
        }
        fs_a.set(String.valueOf(11));
        fs_a.set(new BigDecimal(String.valueOf(fs_a).trim()).subtract(new BigDecimal(String.valueOf(fs_b).trim())).toPlainString());
        fs_res.set(String.valueOf(fs_a));
        if (!String.valueOf(fs_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-SHORT - FLOAT-SHORT");
        }
        fs_a.set(String.valueOf(11));
        fs_a.set(new BigDecimal(String.valueOf(fs_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
        fs_res.set(String.valueOf(fs_a));
        if (!String.valueOf(fs_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-SHORT - NUM");
        }
        /* RAW: *  */
        System.exit(0);
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc121ComputingOfDifferentUsagesWDecimalPoint().run();
    }
}
