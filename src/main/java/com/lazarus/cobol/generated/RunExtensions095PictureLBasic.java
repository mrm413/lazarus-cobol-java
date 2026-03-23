package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions095PictureLBasic extends CobolProgram {
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
    private CobolString w_data = new CobolString(1); // Group: W-DATA
    private CobolString x_dat = new CobolString(10);
    private CobolString x_alpha = new CobolString(10);
    private CobolString y_dat = new CobolString(9);
    private CobolString y_alpha = new CobolString(9);
    private CobolString w_nested = new CobolString(1); // Group: W-NESTED
    private CobolString x_grp = new CobolString(1); // Group: X-GRP
    private CobolString x_0 = new CobolString(1);
    private CobolString x_v = new CobolString(10);
    private CobolString x_1 = new CobolString(1);
    private CobolString w_lgs = new CobolString(1); // Group: W-LGS
    private float lgx = 0.0f;
    private int lgy = 0;
    private CobolString w_late_lvar = new CobolString(1); // Group: W-LATE-LVAR
    private CobolString z_grp = new CobolString(1); // Group: Z-GRP
    private CobolString z_v = new CobolString(2);
    private CobolString unused_0 = new CobolString(1);
    private int lgz = 0;
    private float w_len = 0.0f;



    private void para_main() {
        w_data.set(String.valueOf(" "));
        x_v.set(String.valueOf(" "));
        if ((((!String.valueOf(x_dat).equals(String.valueOf("          ")) || !String.valueOf(x_alpha).equals(String.valueOf("          "))) || !String.valueOf(y_dat).equals(String.valueOf("         "))) || !String.valueOf(y_alpha).equals(String.valueOf("         ")))) {
            CobolDisplay.display("GROUP INITIALIZATION WITH SPACES FAILED");
            show_vars();
        }
        lgx = (float) Double.parseDouble(String.valueOf(5).trim());
        lgy = new BigDecimal(String.valueOf(1).trim()).intValue();
        if (!String.valueOf(w_data).equals(String.valueOf("                                      "))) {
            CobolDisplay.display("GROUP COMPARISON FAILED (W-DATA)");
            show_vars();
        }
        if (((!String.valueOf(w_nested).equals(String.valueOf("0          1")) || !String.valueOf(x_grp).equals(String.valueOf(w_nested))) || !String.valueOf(x_v).equals(String.valueOf("     ")))) {
            CobolDisplay.display("GROUP COMPARISON FAILED (W-NESTED)");
            show_vars();
        }
        x_dat.set(String.valueOf(".........."));
        x_alpha.set(String.valueOf("XXXXXXXXXX"));
        y_dat.set(String.valueOf("999999999"));
        y_alpha.set(String.valueOf("AAAAAAAAA"));
        if ((((!String.valueOf(x_dat).equals(String.valueOf(".....")) || !String.valueOf(x_alpha).equals(String.valueOf("XXXXX"))) || !String.valueOf(y_dat).equals(String.valueOf("9"))) || !String.valueOf(y_alpha).equals(String.valueOf("A")))) {
            CobolDisplay.display("MOVES FROM LITERALS FAILED");
            show_vars();
        }
        y_dat.set(String.valueOf(x_dat));
        x_alpha.set(String.valueOf(y_alpha));
        if ((((!String.valueOf(x_dat).equals(String.valueOf(".....")) || !String.valueOf(x_alpha).equals(String.valueOf("A    "))) || !String.valueOf(y_dat).equals(String.valueOf("."))) || !String.valueOf(y_alpha).equals(String.valueOf("A")))) {
            CobolDisplay.display("MOVES FROM/TO VARS FAILED");
            show_vars();
        }
        x_alpha.set(String.valueOf("AAAAA"));
        lgx = (float) Double.parseDouble(String.valueOf(1).trim());
        x_alpha.set("");
        lgx = (float) Double.parseDouble(String.valueOf(10).trim());
        if (!String.valueOf(x_alpha).equals(String.valueOf(" AAAA     "))) {
            CobolDisplay.display("DIRECT VAR INITIALIZATION FAILED");
            show_vars();
        }
        lgx = (float) Double.parseDouble(String.valueOf(1).trim());
        w_len = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.length(x_dat)).trim());
        if (w_len != 10) {
            CobolDisplay.display("UNEXPECTED RESULT FOR 'LENGTH OF X-DAT': " + String.valueOf(w_len));
            show_vars();
        }
        w_len = (float) Double.parseDouble(String.valueOf(CobolIntrinsics.length(x_alpha)).trim());
        if (w_len != 1) {
            CobolDisplay.display("UNEXPECTED RESULT FOR 'FUNCTION LENGTH " + "(X-ALPHA)': " + String.valueOf(w_len));
            show_vars();
        }
        lgy = new BigDecimal(String.valueOf(9).trim()).intValue();
        y_alpha.set(String.valueOf("A"));
        lgy = new BigDecimal(String.valueOf(5).trim()).intValue();
        y_alpha.set("");
        lgy = new BigDecimal(String.valueOf(9).trim()).intValue();
        if (!String.valueOf(y_alpha).equals(String.valueOf("     AAAA"))) {
            CobolDisplay.display("UNEXPECTED RESULT AFTER 'MOVE ALL/INITIALIZE': " + String.valueOf(y_alpha));
            show_vars();
        }
        check_late_lvar();
        System.exit(0);
    }

    private void show_vars() {
        CobolDisplay.display(String.valueOf(w_data) + "*");
        CobolDisplay.display(String.valueOf(x_dat) + "*" + String.valueOf(x_alpha) + "*" + String.valueOf(y_dat) + "*" + String.valueOf(y_alpha) + "*");
        CobolDisplay.display(String.valueOf(w_nested) + "*");
        CobolDisplay.display(String.valueOf(x_grp) + "*");
        CobolDisplay.display(String.valueOf(x_v) + "*");
    }

    private void check_late_lvar() {
        z_grp.setRefMod(1, 2, String.valueOf("aa"));
        lgz = new BigDecimal(String.valueOf(1).trim()).intValue();
        z_v.set(String.valueOf(" "));
        if (!String.valueOf(z_grp).equals(String.valueOf(" a1"))) {
            CobolDisplay.display("UNEXPECTED Z-GRP WITH NESTED LATE L-VAR: " + "*" + String.valueOf(z_grp) + "*");
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions095PictureLBasic().run();
    }
}
