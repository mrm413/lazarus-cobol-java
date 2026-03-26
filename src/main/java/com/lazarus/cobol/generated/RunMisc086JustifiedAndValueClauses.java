package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc086JustifiedAndValueClauses extends CobolProgram {
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
    private CobolString arr_array = new CobolString(1); // Group: ARR-ARRAY
    private CobolString[] arr_entry = new CobolString[6]; // Group: ARR-ENTRY
    private CobolString[] arr_fld1 = new CobolString[6];
    private CobolString[] arr_fld2 = new CobolString[6];
    private CobolString[][] arr_fld3 = new CobolString[6][6]; // Group: ARR-FLD3
    private CobolString[][] arr_fld4 = new CobolString[6][6];
    private CobolString[][] arr_fld5 = new CobolString[6][6];
    private short cntr = (short) 0;
    private short cntr2 = (short) 0;
    private CobolString ele = new CobolString(10);
    private CobolString ele2 = new CobolString(10);
    private CobolString ele3 = new CobolString(10);
    private CobolString ele4 = new CobolString(10);
    private CobolString ele5 = new CobolString(1003);



    private void para_main() {
        _1000_justify_is_right(); // THRU 1000-EXIT
        _1000_exit();
        _2000_justify_is_off(); // THRU 2000-EXIT
        _2000_exit();
        if (!String.valueOf(ele4).equals(String.valueOf("RRRRRRRRRR"))) {
            CobolDisplay.display("ELE4 NOT INITIALIZED CORRECTLY" + String.valueOf(ele4));
        }
        System.exit(0);
    }

    private void _1000_justify_is_right() {
        if (!String.valueOf(ele).equals(String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ELE NOT INITIALIZED CORRECTLY " + String.valueOf(ele));
        }
        if (!String.valueOf(ele2).equals(String.valueOf("         R"))) {
            CobolDisplay.display("ELE2 NOT INITIALIZED CORRECTLY " + String.valueOf(ele2));
        }
        if (!String.valueOf(ele3).equals(String.valueOf(" RRRRRRRRR"))) {
            CobolDisplay.display("ELE3 NOT INITIALIZED CORRECTLY " + String.valueOf(ele3));
        }
        if ((!String.valueOf(CobolString.refMod(ele5, 1, 1000)).equals(String.valueOf(" ")) || !String.valueOf(CobolString.refMod(ele5, 1001)).equals(String.valueOf("RRR")))) {
            CobolDisplay.display("ELE5 NOT INITIALIZED CORRECTLY " + String.valueOf(ele5));
        }
        if (!String.valueOf(arr_fld1[2 - 1]).equals(String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD1 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld2[2 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld1[6 - 1]).equals(String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD1 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld2[6 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld4[2 - 1][3 - 1]).equals(String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD4 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld5[2 - 1][3 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld4[6 - 1][6 - 1]).equals(String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD4 (6,6) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld5[6 - 1][6 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (6,6) NOT INITIALIZED CORRECTLY");
        }
        arr_array.set(String.valueOf("X"));
        ele.set(String.valueOf("X"));
        ele.set("");
        arr_array.set("");
        if (!String.valueOf(ele).equals(String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ELE NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld1[2 - 1]).equals(String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD1 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld2[2 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld1[6 - 1]).equals(String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD1 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld2[6 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld4[2 - 1][3 - 1]).equals(String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD4 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld5[2 - 1][3 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld4[6 - 1][6 - 1]).equals(String.valueOf("     RIGHT"))) {
            CobolDisplay.display("ARR-FLD4 (6,6) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld5[6 - 1][6 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (6,6) NOT INITIALIZED CORRECTLY");
        }
    }

    private void _1000_exit() {
        return;
    }

    private void _2000_justify_is_off() {
        if (!String.valueOf(ele).equals(String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ELE NOT INITIALIZED CORRECTLY " + String.valueOf(ele));
        }
        if (!String.valueOf(ele2).equals(String.valueOf("R         "))) {
            CobolDisplay.display("ELE2 NOT INITIALIZED CORRECTLY " + String.valueOf(ele2));
        }
        if (!String.valueOf(ele3).equals(String.valueOf("RRRRRRRRR "))) {
            CobolDisplay.display("ELE3 NOT INITIALIZED CORRECTLY " + String.valueOf(ele3));
        }
        if ((!String.valueOf(CobolString.refMod(ele5, 1, 3)).equals(String.valueOf("RRR")) || !String.valueOf(CobolString.refMod(ele5, 4)).equals(String.valueOf(" ")))) {
            CobolDisplay.display("ELE5 NOT INITIALIZED CORRECTLY " + String.valueOf(ele5));
        }
        if (!String.valueOf(arr_fld1[2 - 1]).equals(String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD1 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld2[2 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld1[6 - 1]).equals(String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD1 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld2[6 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld4[2 - 1][3 - 1]).equals(String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD4 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld5[2 - 1][3 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld4[6 - 1][6 - 1]).equals(String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD4 (6,6) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld5[6 - 1][6 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (6,6) NOT INITIALIZED CORRECTLY");
        }
        arr_array.set(String.valueOf("X"));
        ele.set(String.valueOf("X"));
        ele.set("");
        arr_array.set("");
        if (!String.valueOf(ele).equals(String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ELE NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld1[2 - 1]).equals(String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD1 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld2[2 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (2) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld1[6 - 1]).equals(String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD1 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld2[6 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD2 (6) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld4[2 - 1][3 - 1]).equals(String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD4 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld5[2 - 1][3 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (2,3) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld4[6 - 1][6 - 1]).equals(String.valueOf("RIGHT     "))) {
            CobolDisplay.display("ARR-FLD4 (6,6) NOT INITIALIZED CORRECTLY");
        }
        if (!String.valueOf(arr_fld5[6 - 1][6 - 1]).equals(String.valueOf("LEFT      "))) {
            CobolDisplay.display("ARR-FLD5 (6,6) NOT INITIALIZED CORRECTLY");
        }
    }

    private void _2000_exit() {
        return;
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc086JustifiedAndValueClauses().run();
    }
}
