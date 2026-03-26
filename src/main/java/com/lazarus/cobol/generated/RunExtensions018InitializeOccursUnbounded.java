package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunExtensions018InitializeOccursUnbounded extends CobolProgram {
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
    private long p = 0L;
    private long p2 = 0L;
    private int dlen = 0;

    // LINKAGE SECTION
    private CobolString a_table = new CobolString(1); // Group: a-table
    private CobolString prefix = new CobolString(1); // Group: prefix
    private int n = 0;
    private CobolString table_data = new CobolString(1); // Group: table-data
    private CobolString[] rows = new CobolString[100]; // Group: rows
    private CobolString[] col1 = new CobolString[100];
    private CobolString[] col2 = new CobolString[100];


    private CobolString address = new CobolString(256); // fallback
    private CobolString to = new CobolString(256); // fallback
    private CobolString cb_default = new CobolString(256); // fallback

    private void para_main() {
        /* ALLOCATE — dynamic memory, not typical in Java */
        address.set(String.valueOf(p));
        prefix.set("");
        if (!String.valueOf(CobolIntrinsics.length(a_table)).equals(String.valueOf(372))) {
            CobolDisplay.display("WRONG LENGTH table: " + String.valueOf(CobolIntrinsics.length(a_table)));
        }
        /* ALLOCATE — dynamic memory, not typical in Java */
        address.set(String.valueOf(p2));
        p = 0L; /* FREE */
        prefix.set("");
        if (CobolIntrinsics.length(a_table) != 372) {
            dlen = new BigDecimal(String.valueOf(CobolIntrinsics.length(a_table)).trim()).intValue();
            CobolDisplay.display("BAD SIZE: " + String.valueOf(dlen));
        }
        table_data.setRefMod(1, (CobolIntrinsics.length(rows[1 - 1]) * n), "");
        if (!String.valueOf(col2[1 - 1]).equals(String.valueOf("BC"))) {
            CobolDisplay.display("col2(1) wrong: " + String.valueOf(col2[1 - 1]));
        }
        if (!String.valueOf(rows[2 - 1]).equals(String.valueOf("DEA"))) {
            CobolDisplay.display("rows(2) wrong: " + String.valueOf(rows[2 - 1]));
        }
        n = new BigDecimal(String.valueOf(2).trim()).intValue();
        a_table.setRefMod(1, (CobolIntrinsics.length(a_table)), String.valueOf("ZEROES"));
        n = new BigDecimal(String.valueOf(7).trim()).intValue();
        if (!String.valueOf(rows[2 - 1]).equals(String.valueOf("000"))) {
            CobolDisplay.display("rows(2) after ref-mod MOVE wrong: " + String.valueOf(rows[2 - 1]));
        }
        if (!String.valueOf(rows[3 - 1]).equals(String.valueOf("BCD"))) {
            CobolDisplay.display("rows(3) after ref-mod MOVE wrong: " + String.valueOf(rows[3 - 1]));
        }
        if (rows[5 - 1] == null) rows[5 - 1] = new CobolString(256);
        rows[5 - 1].set(String.valueOf("9"));
        if (rows[7 - 1] == null) rows[7 - 1] = new CobolString(256);
        rows[7 - 1].set(String.valueOf("9"));
        n = new BigDecimal(String.valueOf(4).trim()).intValue();
        table_data.set("");
        to.set("");
        cb_default.set("");
        n = new BigDecimal(String.valueOf(7).trim()).intValue();
        if ((!String.valueOf(rows[2 - 1]).equals(String.valueOf(" ")) || !String.valueOf(rows[4 - 1]).equals(String.valueOf(" ")))) {
            CobolDisplay.display("rows(2/4) after init default wrong: " + String.valueOf(rows[2 - 1]) + String.valueOf(rows[4 - 1]));
        }
        if (!String.valueOf(rows[5 - 1]).equals(String.valueOf("999"))) {
            CobolDisplay.display("rows(5) after init default wrong: " + String.valueOf(rows[5 - 1]));
        }
        n = new BigDecimal(String.valueOf(6).trim()).intValue();
        table_data.set("");
        n = new BigDecimal(String.valueOf(9).trim()).intValue();
        if (!String.valueOf(rows[5 - 1]).equals(String.valueOf("CDE"))) {
            CobolDisplay.display("rows(5) after init value wrong: " + String.valueOf(rows[5 - 1]));
        }
        if (!String.valueOf(rows[7 - 1]).equals(String.valueOf("999"))) {
            CobolDisplay.display("rows(7) after init value wrong: " + String.valueOf(rows[7 - 1]));
        }
        if (!String.valueOf(CobolString.refMod(a_table, 20, 10)).equals(String.valueOf("BC999BCDEA"))) {
            CobolDisplay.display("a-table / ref-mod wrong: " + String.valueOf(CobolString.refMod(a_table, 20, 10)));
        }
        n = new BigDecimal(String.valueOf(10).trim()).intValue();
        if (!String.valueOf(CobolString.refMod(a_table, 20, n)).equals(String.valueOf("BC999BCDEA"))) {
            CobolDisplay.display("a-table / ref-mod length wrong: " + String.valueOf(CobolString.refMod(a_table, 20, n)));
        }
        n = new BigDecimal(String.valueOf(20).trim()).intValue();
        if (!String.valueOf(CobolString.refMod(a_table, n, 10)).equals(String.valueOf("BC999BCDEA"))) {
            CobolDisplay.display("a-table / ref-mod offset wrong: " + String.valueOf(CobolString.refMod(a_table, n, 10)));
        }
        n = new BigDecimal(String.valueOf(8).trim()).intValue();
        table_data.setRefMod(1, CobolIntrinsics.length(table_data), "");
        CobolDisplay.display(String.valueOf(CobolString.refMod(a_table, 20, 10)));
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunExtensions018InitializeOccursUnbounded().run();
    }
}
