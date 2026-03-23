package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions007LengthOf extends CobolProgram {
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
    private CobolString x = new CobolString(2);
    private CobolString g = new CobolString(1); // Group: G
    private CobolString[] y = new CobolString[10];
    private CobolString g_group = new CobolString(1); // Group: G-GROUP
    private CobolString g_sgroup = new CobolString(1); // Group: G-SGROUP
    private CobolString g1 = new CobolString(5);
    private CobolString g2 = new CobolString(6);
    private CobolString g3 = new CobolString(22);
    private BigDecimal l = BigDecimal.ZERO;
    private int i = 0;
    private static final String i_len = "LENGTH";


    private CobolString var_length_l = new CobolString(256);
    private CobolString var_length_x = new CobolString(256);
    private CobolString var_length_z = new CobolString(256);
    private CobolString length = new CobolString(256);
    private CobolString to = new CobolString(256);
    private CobolString rename_std_sg = new CobolString(256);
    private CobolString rename_std_g = new CobolString(256);
    private CobolString rename_std = new CobolString(256);
    private CobolString rename_g = new CobolString(256);
    private CobolString tstdisp = new CobolString(256);

    private void para_main() {
        l = new BigDecimal(String.valueOf(var_length_l).trim());
        if (l.compareTo(new BigDecimal(String.valueOf(5).trim())) != 0) {
            CobolDisplay.display("Length '00128'" + String.valueOf(l));
        }
        l = new BigDecimal(String.valueOf(var_length_x).trim());
        if (l.compareTo(new BigDecimal(String.valueOf(1).trim())) != 0) {
            CobolDisplay.display("Length x'a0'" + String.valueOf(l));
        }
        l = new BigDecimal(String.valueOf(var_length_z).trim());
        if (l.compareTo(new BigDecimal(String.valueOf(3).trim())) != 0) {
            CobolDisplay.display("Length z'a0'" + String.valueOf(l));
        }
        /* RAW: * What does MF reports here */
        l = new BigDecimal(String.valueOf(CobolIntrinsics.length(x)).trim());
        if (l.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("Length 1 " + String.valueOf(l));
        }
        l = new BigDecimal(String.valueOf(CobolIntrinsics.length(x)).trim());
        if (l.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("Length 1a " + String.valueOf(l) + String.valueOf(length) + String.valueOf(x));
        }
        l = new BigDecimal(String.valueOf(CobolIntrinsics.length(y)).trim());
        if (l.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("Length 2 " + String.valueOf(l));
        }
        if (l.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("Length 2a " + String.valueOf(l) + String.valueOf(CobolIntrinsics.length(y)));
        }
        l = new BigDecimal(String.valueOf(CobolIntrinsics.length(y[1 - 1])).trim());
        if (l.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("Length 3 " + String.valueOf(l));
        }
        if (y[1 - 1] == null) y[1 - 1] = new CobolString(256);
        y[1 - 1].set(String.valueOf(length));
        to.set(String.valueOf(length));
        l = new BigDecimal(String.valueOf(length).trim());
        if (l.compareTo(new BigDecimal(String.valueOf(2).trim())) != 0) {
            CobolDisplay.display("Length 3a " + String.valueOf(l) + String.valueOf(CobolIntrinsics.length(y[1 - 1])));
        }
        if (!String.valueOf(i_len).equals(String.valueOf(2))) {
            CobolDisplay.display("Length 4 " + String.valueOf(i_len));
        }
        if ((CobolIntrinsics.length(l) + 2) != 8) {
            l = new BigDecimal(String.valueOf(2).trim());
            CobolDisplay.display("Length 5 + 2" + String.valueOf(l));
        }
        if (!String.valueOf(length).trim().isEmpty()) {
            /* RAW: L + 2 NOT = 8 */
            l = new BigDecimal(String.valueOf(2).trim());
            CobolDisplay.display("Length 5a + 2 " + String.valueOf(l));
        }
        l = new BigDecimal(String.valueOf(0).trim());
        for (int _i0 = 0; _i0 < CobolIntrinsics.length(l); _i0++) {
            l = l.add(new BigDecimal(String.valueOf(1).trim()));
        }
        for (int _i0 = 0; _i0 < l.intValue(); _i0++) {
        }
        l = l.add(new BigDecimal(String.valueOf(1).trim()));
        if (l.compareTo(new BigDecimal(String.valueOf(12).trim())) != 0) {
            CobolDisplay.display("Length 6 " + String.valueOf(l));
        }
        l = new BigDecimal(String.valueOf(0).trim());
        for (i = CobolIntrinsics.length(i); !(i > CobolIntrinsics.length(l)); i += CobolIntrinsics.length(x)) {
        }
        if ((l.compareTo(new BigDecimal(String.valueOf(3).trim())) != 0 || i != 8)) {
            CobolDisplay.display("Length 7 " + String.valueOf(l) + " - " + String.valueOf(i));
        }
        l = new BigDecimal(String.valueOf(0).trim());
    // for (i = length; !((i != 0)); i += 1) {
    // }
        /* RAW: BY LENGTH X UNTIL I > */
        if ((l.compareTo(new BigDecimal(String.valueOf(3).trim())) != 0 || i != 8)) {
            CobolDisplay.display("Length 7a " + String.valueOf(l) + " - " + String.valueOf(i));
        }
        l = new BigDecimal(String.valueOf(CobolIntrinsics.length(rename_std_sg)).trim());
        if (l.compareTo(new BigDecimal(String.valueOf(33).trim())) != 0) {
            CobolDisplay.display("Length 8a " + String.valueOf(l));
        }
        l = new BigDecimal(String.valueOf(CobolIntrinsics.length(rename_std_g)).trim());
        if (l.compareTo(new BigDecimal(String.valueOf(43).trim())) != 0) {
            CobolDisplay.display("Length 8b " + String.valueOf(l));
        }
        l = new BigDecimal(String.valueOf(CobolIntrinsics.length(rename_std)).trim());
        if (l.compareTo(new BigDecimal(String.valueOf(33).trim())) != 0) {
            CobolDisplay.display("Length 8c " + String.valueOf(l));
        }
        l = new BigDecimal(String.valueOf(CobolIntrinsics.length(rename_g)).trim());
        if (l.compareTo(new BigDecimal(String.valueOf(63).trim())) != 0) {
            CobolDisplay.display("Length 8d " + String.valueOf(l));
        }
        CobolDisplay.displayNoAdvancing(String.valueOf(CobolIntrinsics.length(tstdisp)));
        System.exit(0);
    }

    private void varme() {
        l = l.add(new BigDecimal(String.valueOf(1).trim()));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions007LengthOf().run();
    }
}
