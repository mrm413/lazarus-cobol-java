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

    private CobolString bcl_b = new CobolString(256);
    private CobolString bcl_a = new CobolString(256);
    private CobolString bcl_res = new CobolString(256);
    private CobolString bc_b = new CobolString(256);
    private CobolString bc_a = new CobolString(256);
    private CobolString bc_res = new CobolString(256);
    private CobolString bd_b = new CobolString(256);
    private CobolString bd_a = new CobolString(256);
    private CobolString bd_res = new CobolString(256);
    private CobolString bl_b = new CobolString(256);
    private CobolString bl_a = new CobolString(256);
    private CobolString bl_res = new CobolString(256);
    private CobolString c_b = new CobolString(256);
    private CobolString c_a = new CobolString(256);
    private CobolString c_res = new CobolString(256);
    private CobolString c1_b = new CobolString(256);
    private CobolString c1_a = new CobolString(256);
    private CobolString c1_res = new CobolString(256);
    private CobolString c2_b = new CobolString(256);
    private CobolString c2_a = new CobolString(256);
    private CobolString c2_res = new CobolString(256);
    private CobolString c3_b = new CobolString(256);
    private CobolString c3_a = new CobolString(256);
    private CobolString c3_res = new CobolString(256);
    private CobolString c5_b = new CobolString(256);
    private CobolString c5_a = new CobolString(256);
    private CobolString c5_res = new CobolString(256);
    private CobolString c6_b = new CobolString(256);
    private CobolString c6_a = new CobolString(256);
    private CobolString c6_res = new CobolString(256);
    private CobolString cn9_b = new CobolString(256);
    private CobolString cn9_a = new CobolString(256);
    private CobolString cn9_res = new CobolString(256);
    private CobolString cnx_b = new CobolString(256);
    private CobolString cnx_a = new CobolString(256);
    private CobolString cnx_res = new CobolString(256);
    private CobolString cx9_b = new CobolString(256);
    private CobolString cx9_a = new CobolString(256);
    private CobolString cx9_res = new CobolString(256);
    private CobolString cxx_b = new CobolString(256);
    private CobolString cxx_a = new CobolString(256);
    private CobolString cxx_res = new CobolString(256);
    private CobolString d_b = new CobolString(256);
    private CobolString d_a = new CobolString(256);
    private CobolString d_res = new CobolString(256);
    private CobolString fd16_b = new CobolString(256);
    private CobolString fd16_a = new CobolString(256);
    private CobolString fd16_res = new CobolString(256);
    private CobolString fd34_b = new CobolString(256);
    private CobolString fd34_a = new CobolString(256);
    private CobolString fd34_res = new CobolString(256);
    private CobolString fl_b = new CobolString(256);
    private CobolString fl_a = new CobolString(256);
    private CobolString fl_res = new CobolString(256);
    private CobolString fs_b = new CobolString(256);
    private CobolString fs_a = new CobolString(256);
    private CobolString fs_res = new CobolString(256);

    private void para_main() {
        /* RAW: *  */
        bcl_a.set(new BigDecimal(String.valueOf(bcl_a).trim()).add(new BigDecimal(String.valueOf(bcl_b).trim())).toPlainString());
    }

    private void bcl_res() {
        if (!String.valueOf(bcl_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-C-LONG + BINARY-C-LONG");
        }
    }

    private void bcl_a() {
        bcl_a.set(new BigDecimal(String.valueOf(bcl_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void bcl_res_2() {
        if (!String.valueOf(bcl_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-C-LONG + NUM");
        }
    }

    private void bcl_a_2() {
        bcl_a.set(new BigDecimal(String.valueOf(bcl_a).trim()).subtract(new BigDecimal(String.valueOf(bcl_b).trim())).toPlainString());
    }

    private void bcl_res_3() {
        if (!String.valueOf(bcl_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-C-LONG - BINARY-C-LONG");
        }
    }

    private void bcl_a_3() {
        bcl_a.set(new BigDecimal(String.valueOf(bcl_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void bcl_res_4() {
        if (!String.valueOf(bcl_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-C-LONG - NUM");
        }
        /* RAW: *  */
        bc_a.set(new BigDecimal(String.valueOf(bc_a).trim()).add(new BigDecimal(String.valueOf(bc_b).trim())).toPlainString());
    }

    private void bc_res() {
        if (!String.valueOf(bc_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-CHAR + BINARY-CHAR");
        }
    }

    private void bc_a() {
        bc_a.set(new BigDecimal(String.valueOf(bc_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void bc_res_2() {
        if (!String.valueOf(bc_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-CHAR + NUM");
        }
    }

    private void bc_a_2() {
        bc_a.set(new BigDecimal(String.valueOf(bc_a).trim()).subtract(new BigDecimal(String.valueOf(bc_b).trim())).toPlainString());
    }

    private void bc_res_3() {
        if (!String.valueOf(bc_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-CHAR - BINARY-CHAR");
        }
    }

    private void bc_a_3() {
        bc_a.set(new BigDecimal(String.valueOf(bc_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void bc_res_4() {
        if (!String.valueOf(bc_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-CHAR - NUM");
        }
        /* RAW: *  */
        bd_a.set(new BigDecimal(String.valueOf(bd_a).trim()).add(new BigDecimal(String.valueOf(bd_b).trim())).toPlainString());
    }

    private void bd_res() {
        if (!String.valueOf(bd_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-DOUBLE + BINARY-DOUBLE");
        }
    }

    private void bd_a() {
        bd_a.set(new BigDecimal(String.valueOf(bd_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void bd_res_2() {
        if (!String.valueOf(bd_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-DOUBLE + NUM");
        }
    }

    private void bd_a_2() {
        bd_a.set(new BigDecimal(String.valueOf(bd_a).trim()).subtract(new BigDecimal(String.valueOf(bd_b).trim())).toPlainString());
    }

    private void bd_res_3() {
        if (!String.valueOf(bd_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-DOUBLE - BINARY-DOUBLE");
        }
    }

    private void bd_a_3() {
        bd_a.set(new BigDecimal(String.valueOf(bd_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void bd_res_4() {
        if (!String.valueOf(bd_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-DOUBLE - NUM");
        }
        /* RAW: *  */
        bl_a.set(new BigDecimal(String.valueOf(bl_a).trim()).add(new BigDecimal(String.valueOf(bl_b).trim())).toPlainString());
    }

    private void bl_res() {
        if (!String.valueOf(bl_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-LONG + BINARY-LONG");
        }
    }

    private void bl_a() {
        bl_a.set(new BigDecimal(String.valueOf(bl_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void bl_res_2() {
        if (!String.valueOf(bl_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR BINARY-LONG + NUM");
        }
    }

    private void bl_a_2() {
        bl_a.set(new BigDecimal(String.valueOf(bl_a).trim()).subtract(new BigDecimal(String.valueOf(bl_b).trim())).toPlainString());
    }

    private void bl_res_3() {
        if (!String.valueOf(bl_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-LONG - BINARY-LONG");
        }
    }

    private void bl_a_3() {
        bl_a.set(new BigDecimal(String.valueOf(bl_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void bl_res_4() {
        if (!String.valueOf(bl_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR BINARY-LONG - NUM");
        }
        /* RAW: *  */
        c_a.set(new BigDecimal(String.valueOf(c_a).trim()).add(new BigDecimal(String.valueOf(c_b).trim())).toPlainString());
    }

    private void c_res() {
        if (!String.valueOf(c_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP + COMP");
        }
    }

    private void c_a() {
        c_a.set(new BigDecimal(String.valueOf(c_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void c_res_2() {
        if (!String.valueOf(c_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP + NUM");
        }
    }

    private void c_a_2() {
        c_a.set(new BigDecimal(String.valueOf(c_a).trim()).subtract(new BigDecimal(String.valueOf(c_b).trim())).toPlainString());
    }

    private void c_res_3() {
        if (!String.valueOf(c_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP - COMP");
        }
    }

    private void c_a_3() {
        c_a.set(new BigDecimal(String.valueOf(c_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void c_res_4() {
        if (!String.valueOf(c_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP - NUM");
        }
        /* RAW: *  */
        c1_a.set(new BigDecimal(String.valueOf(c1_a).trim()).add(new BigDecimal(String.valueOf(c1_b).trim())).toPlainString());
    }

    private void c1_res() {
        if (!String.valueOf(c1_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-1 + COMP-1");
        }
    }

    private void c1_a() {
        c1_a.set(new BigDecimal(String.valueOf(c1_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void c1_res_2() {
        if (!String.valueOf(c1_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-1 + NUM");
        }
    }

    private void c1_a_2() {
        c1_a.set(new BigDecimal(String.valueOf(c1_a).trim()).subtract(new BigDecimal(String.valueOf(c1_b).trim())).toPlainString());
    }

    private void c1_res_3() {
        if (!String.valueOf(c1_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-1 - COMP-1");
        }
    }

    private void c1_a_3() {
        c1_a.set(new BigDecimal(String.valueOf(c1_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void c1_res_4() {
        if (!String.valueOf(c1_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-1 - NUM");
        }
        /* RAW: *  */
        c2_a.set(new BigDecimal(String.valueOf(c2_a).trim()).add(new BigDecimal(String.valueOf(c2_b).trim())).toPlainString());
    }

    private void c2_res() {
        if (!String.valueOf(c2_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-2 + COMP-2");
        }
    }

    private void c2_a() {
        c2_a.set(new BigDecimal(String.valueOf(c2_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void c2_res_2() {
        if (!String.valueOf(c2_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-2 + NUM");
        }
    }

    private void c2_a_2() {
        c2_a.set(new BigDecimal(String.valueOf(c2_a).trim()).subtract(new BigDecimal(String.valueOf(c2_b).trim())).toPlainString());
    }

    private void c2_res_3() {
        if (!String.valueOf(c2_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-2 - COMP-2");
        }
    }

    private void c2_a_3() {
        c2_a.set(new BigDecimal(String.valueOf(c2_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void c2_res_4() {
        if (!String.valueOf(c2_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-2 - NUM");
        }
        /* RAW: *  */
        c3_a.set(new BigDecimal(String.valueOf(c3_a).trim()).add(new BigDecimal(String.valueOf(c3_b).trim())).toPlainString());
    }

    private void c3_res() {
        if (!String.valueOf(c3_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-3 + COMP-3");
        }
    }

    private void c3_a() {
        c3_a.set(new BigDecimal(String.valueOf(c3_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void c3_res_2() {
        if (!String.valueOf(c3_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-3 + NUM");
        }
    }

    private void c3_a_2() {
        c3_a.set(new BigDecimal(String.valueOf(c3_a).trim()).subtract(new BigDecimal(String.valueOf(c3_b).trim())).toPlainString());
    }

    private void c3_res_3() {
        if (!String.valueOf(c3_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-3 - COMP-3");
        }
    }

    private void c3_a_3() {
        c3_a.set(new BigDecimal(String.valueOf(c3_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void c3_res_4() {
        if (!String.valueOf(c3_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-3 - NUM");
        }
        /* RAW: *  */
        c5_a.set(new BigDecimal(String.valueOf(c5_a).trim()).add(new BigDecimal(String.valueOf(c5_b).trim())).toPlainString());
    }

    private void c5_res() {
        if (!String.valueOf(c5_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-5 + COMP-5");
        }
    }

    private void c5_a() {
        c5_a.set(new BigDecimal(String.valueOf(c5_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void c5_res_2() {
        if (!String.valueOf(c5_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-5 + NUM");
        }
    }

    private void c5_a_2() {
        c5_a.set(new BigDecimal(String.valueOf(c5_a).trim()).subtract(new BigDecimal(String.valueOf(c5_b).trim())).toPlainString());
    }

    private void c5_res_3() {
        if (!String.valueOf(c5_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-5 - COMP-5");
        }
    }

    private void c5_a_3() {
        c5_a.set(new BigDecimal(String.valueOf(c5_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void c5_res_4() {
        if (!String.valueOf(c5_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-5 - NUM");
        }
        /* RAW: *  */
        c6_a.set(new BigDecimal(String.valueOf(c6_a).trim()).add(new BigDecimal(String.valueOf(c6_b).trim())).toPlainString());
    }

    private void c6_res() {
        if (!String.valueOf(c6_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-6 + COMP-6");
        }
    }

    private void c6_a() {
        c6_a.set(new BigDecimal(String.valueOf(c6_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void c6_res_2() {
        if (!String.valueOf(c6_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-6 + NUM");
        }
    }

    private void c6_a_2() {
        c6_a.set(new BigDecimal(String.valueOf(c6_a).trim()).subtract(new BigDecimal(String.valueOf(c6_b).trim())).toPlainString());
    }

    private void c6_res_3() {
        if (!String.valueOf(c6_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-6 - COMP-6");
        }
    }

    private void c6_a_3() {
        c6_a.set(new BigDecimal(String.valueOf(c6_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void c6_res_4() {
        if (!String.valueOf(c6_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-6 - NUM");
        }
        /* RAW: *  */
        cn9_a.set(new BigDecimal(String.valueOf(cn9_a).trim()).add(new BigDecimal(String.valueOf(cn9_b).trim())).toPlainString());
    }

    private void cn9_res() {
        if (!String.valueOf(cn9_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-N + COMP-N");
        }
    }

    private void cn9_a() {
        cn9_a.set(new BigDecimal(String.valueOf(cn9_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void cn9_res_2() {
        if (!String.valueOf(cn9_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-N + NUM");
        }
    }

    private void cn9_a_2() {
        cn9_a.set(new BigDecimal(String.valueOf(cn9_a).trim()).subtract(new BigDecimal(String.valueOf(cn9_b).trim())).toPlainString());
    }

    private void cn9_res_3() {
        if (!String.valueOf(cn9_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-N - COMP-N");
        }
    }

    private void cn9_a_3() {
        cn9_a.set(new BigDecimal(String.valueOf(cn9_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void cn9_res_4() {
        if (!String.valueOf(cn9_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-N - NUM");
        }
        /* RAW: *  */
        cnx_a.set(new BigDecimal(String.valueOf(cnx_a).trim()).add(new BigDecimal(String.valueOf(cnx_b).trim())).toPlainString());
    }

    private void cnx_res() {
        if (!String.valueOf(cnx_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-N + COMP-N");
        }
    }

    private void cnx_a() {
        cnx_a.set(new BigDecimal(String.valueOf(cnx_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void cnx_res_2() {
        if (!String.valueOf(cnx_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-N + NUM");
        }
    }

    private void cnx_a_2() {
        cnx_a.set(new BigDecimal(String.valueOf(cnx_a).trim()).subtract(new BigDecimal(String.valueOf(cnx_b).trim())).toPlainString());
    }

    private void cnx_res_3() {
        if (!String.valueOf(cnx_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-N - COMP-N");
        }
    }

    private void cnx_a_3() {
        cnx_a.set(new BigDecimal(String.valueOf(cnx_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void cnx_res_4() {
        if (!String.valueOf(cnx_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-N - NUM");
        }
        /* RAW: *  */
        cx9_a.set(new BigDecimal(String.valueOf(cx9_a).trim()).add(new BigDecimal(String.valueOf(cx9_b).trim())).toPlainString());
    }

    private void cx9_res() {
        if (!String.valueOf(cx9_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-X + COMP-X");
        }
    }

    private void cx9_a() {
        cx9_a.set(new BigDecimal(String.valueOf(cx9_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void cx9_res_2() {
        if (!String.valueOf(cx9_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-X + NUM");
        }
    }

    private void cx9_a_2() {
        cx9_a.set(new BigDecimal(String.valueOf(cx9_a).trim()).subtract(new BigDecimal(String.valueOf(cx9_b).trim())).toPlainString());
    }

    private void cx9_res_3() {
        if (!String.valueOf(cx9_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-X - COMP-X");
        }
    }

    private void cx9_a_3() {
        cx9_a.set(new BigDecimal(String.valueOf(cx9_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void cx9_res_4() {
        if (!String.valueOf(cx9_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-X - NUM");
        }
        /* RAW: *  */
        cxx_a.set(new BigDecimal(String.valueOf(cxx_a).trim()).add(new BigDecimal(String.valueOf(cxx_b).trim())).toPlainString());
    }

    private void cxx_res() {
        if (!String.valueOf(cxx_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-X + COMP-X");
        }
    }

    private void cxx_a() {
        cxx_a.set(new BigDecimal(String.valueOf(cxx_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void cxx_res_2() {
        if (!String.valueOf(cxx_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR COMP-X + NUM");
        }
    }

    private void cxx_a_2() {
        cxx_a.set(new BigDecimal(String.valueOf(cxx_a).trim()).subtract(new BigDecimal(String.valueOf(cxx_b).trim())).toPlainString());
    }

    private void cxx_res_3() {
        if (!String.valueOf(cxx_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-X - COMP-X");
        }
    }

    private void cxx_a_3() {
        cxx_a.set(new BigDecimal(String.valueOf(cxx_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void cxx_res_4() {
        if (!String.valueOf(cxx_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR COMP-X - NUM");
        }
        /* RAW: *  */
        d_a.set(new BigDecimal(String.valueOf(d_a).trim()).add(new BigDecimal(String.valueOf(d_b).trim())).toPlainString());
    }

    private void d_res() {
        if (!String.valueOf(d_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR DISPLAY + DISPLAY");
        }
    }

    private void d_a() {
        d_a.set(new BigDecimal(String.valueOf(d_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void d_res_2() {
        if (!String.valueOf(d_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR DISPLAY + NUM");
        }
    }

    private void d_a_2() {
        d_a.set(new BigDecimal(String.valueOf(d_a).trim()).subtract(new BigDecimal(String.valueOf(d_b).trim())).toPlainString());
    }

    private void d_res_3() {
        if (!String.valueOf(d_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR DISPLAY - DISPLAY");
        }
    }

    private void d_a_3() {
        d_a.set(new BigDecimal(String.valueOf(d_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void d_res_4() {
        if (!String.valueOf(d_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR DISPLAY - NUM");
        }
        /* RAW: *  */
        fd16_a.set(new BigDecimal(String.valueOf(fd16_a).trim()).add(new BigDecimal(String.valueOf(fd16_b).trim())).toPlainString());
    }

    private void fd16_res() {
        if (!String.valueOf(fd16_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-16 + FLOAT-DECIMAL-16");
        }
    }

    private void fd16_a() {
        fd16_a.set(new BigDecimal(String.valueOf(fd16_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void fd16_res_2() {
        if (!String.valueOf(fd16_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-16 + NUM");
        }
    }

    private void fd16_a_2() {
        fd16_a.set(new BigDecimal(String.valueOf(fd16_a).trim()).subtract(new BigDecimal(String.valueOf(fd16_b).trim())).toPlainString());
    }

    private void fd16_res_3() {
        if (!String.valueOf(fd16_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-16 - FLOAT-DECIMAL-16");
        }
    }

    private void fd16_a_3() {
        fd16_a.set(new BigDecimal(String.valueOf(fd16_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void fd16_res_4() {
        if (!String.valueOf(fd16_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-16 - NUM");
        }
        /* RAW: *  */
        fd34_a.set(new BigDecimal(String.valueOf(fd34_a).trim()).add(new BigDecimal(String.valueOf(fd34_b).trim())).toPlainString());
    }

    private void fd34_res() {
        if (!String.valueOf(fd34_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-34 + FLOAT-DECIMAL-34");
        }
    }

    private void fd34_a() {
        fd34_a.set(new BigDecimal(String.valueOf(fd34_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void fd34_res_2() {
        if (!String.valueOf(fd34_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-34 + NUM");
        }
    }

    private void fd34_a_2() {
        fd34_a.set(new BigDecimal(String.valueOf(fd34_a).trim()).subtract(new BigDecimal(String.valueOf(fd34_b).trim())).toPlainString());
    }

    private void fd34_res_3() {
        if (!String.valueOf(fd34_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-34 - FLOAT-DECIMAL-34");
        }
    }

    private void fd34_a_3() {
        fd34_a.set(new BigDecimal(String.valueOf(fd34_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void fd34_res_4() {
        if (!String.valueOf(fd34_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-DECIMAL-34 - NUM");
        }
        /* RAW: *  */
        fl_a.set(new BigDecimal(String.valueOf(fl_a).trim()).add(new BigDecimal(String.valueOf(fl_b).trim())).toPlainString());
    }

    private void fl_res() {
        if (!String.valueOf(fl_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-LONG + FLOAT-LONG");
        }
    }

    private void fl_a() {
        fl_a.set(new BigDecimal(String.valueOf(fl_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void fl_res_2() {
        if (!String.valueOf(fl_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-LONG + NUM");
        }
    }

    private void fl_a_2() {
        fl_a.set(new BigDecimal(String.valueOf(fl_a).trim()).subtract(new BigDecimal(String.valueOf(fl_b).trim())).toPlainString());
    }

    private void fl_res_3() {
        if (!String.valueOf(fl_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-LONG - FLOAT-LONG");
        }
    }

    private void fl_a_3() {
        fl_a.set(new BigDecimal(String.valueOf(fl_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void fl_res_4() {
        if (!String.valueOf(fl_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-LONG - NUM");
        }
        /* RAW: *  */
        fs_a.set(new BigDecimal(String.valueOf(fs_a).trim()).add(new BigDecimal(String.valueOf(fs_b).trim())).toPlainString());
    }

    private void fs_res() {
        if (!String.valueOf(fs_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-SHORT + FLOAT-SHORT");
        }
    }

    private void fs_a() {
        fs_a.set(new BigDecimal(String.valueOf(fs_a).trim()).add(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void fs_res_2() {
        if (!String.valueOf(fs_res).equals(String.valueOf(11))) {
            CobolDisplay.display("ERROR FLOAT-SHORT + NUM");
        }
    }

    private void fs_a_2() {
        fs_a.set(new BigDecimal(String.valueOf(fs_a).trim()).subtract(new BigDecimal(String.valueOf(fs_b).trim())).toPlainString());
    }

    private void fs_res_3() {
        if (!String.valueOf(fs_res).equals(String.valueOf(1))) {
            CobolDisplay.display("ERROR FLOAT-SHORT - FLOAT-SHORT");
        }
    }

    private void fs_a_3() {
        fs_a.set(new BigDecimal(String.valueOf(fs_a).trim()).subtract(new BigDecimal(String.valueOf(10).trim())).toPlainString());
    }

    private void fs_res_4() {
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
