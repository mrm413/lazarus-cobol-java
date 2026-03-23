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
        _1000();
        /* RAW: - JUSTIFY-IS-RIGHT THRU 1000 - */
        return;
    }

    private void justify_is_right() {
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
    }

    private void arr_array() {
    }

    private void ele() {
        ele.set("");
    }

    private void value() {
        arr_array.set("");
    }

    private void value_2() {
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
        /* RAW: 1000 - */
        return;
    }

    private void justify_is_off() {
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
    }

    private void arr_array_2() {
    }

    private void ele_2() {
        ele.set("");
    }

    private void value_3() {
        arr_array.set("");
    }

    private void value_4() {
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
        /* RAW: 2000 - */
        return;
    }

    private void _1000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunMisc086JustifiedAndValueClauses().run();
    }
}
