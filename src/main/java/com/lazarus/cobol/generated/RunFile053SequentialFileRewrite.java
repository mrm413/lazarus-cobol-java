package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunFile053SequentialFileRewrite extends CobolProgram {
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
    private int w_count = 0;
    private int w_eof = 0;
    private int w_abort = 0;

    // FILE SECTION — file1
    private CobolString file1_rec = new CobolString(1); // Group: file1-rec
    private int file1_serial_1 = 0;
    private int file1_xseen = 0;
    private int file1_serial_2 = 0;


    // FILE DESCRIPTORS
    private CobolFile file1 = new CobolFile("FILE1", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString eof = new CobolString(256); // fallback
    private CobolString cb_false = new CobolString(256); // fallback
    private CobolString abort = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback

    private void para_main() {
        file1.open("OUTPUT");
        for (w_count = 1; !(w_count > 20); w_count += 1) {
            file1_serial_1 = new BigDecimal(String.valueOf(w_count).trim()).intValue();
            file1_xseen = new BigDecimal(String.valueOf(0).trim()).intValue();
            file1_serial_2 = new BigDecimal(String.valueOf(100 + w_count).trim()).intValue();
            file1.write(file1_rec);
        }
        file1.close();
        file1.open("I-O");
        eof.set(String.valueOf(cb_false));
        for (w_count = 1; !((!String.valueOf(eof).trim().isEmpty() || !String.valueOf(abort).trim().isEmpty())); w_count += 1) {
            if (file1.read(null) == FileStatus.AT_END) {
                eof.set(String.valueOf(cb_true));
            } else {
                if (file1_serial_1 != w_count) {
                    CobolDisplay.display("FAIL 1: " + String.valueOf(w_count) + " :: " + String.valueOf(file1_serial_1));
                    abort.set(String.valueOf(cb_true));
                } else {
                    if (file1_serial_2 != ((100 + w_count))) {
                        CobolDisplay.display("FAIL 2: " + String.valueOf(w_count) + " :: " + String.valueOf(file1_serial_2));
                        abort.set(String.valueOf(cb_true));
                    } else {
                        if (file1_xseen != 0) {
                            CobolDisplay.display("FAIL 3: " + String.valueOf(w_count) + " :: " + String.valueOf(file1_xseen));
                            abort.set(String.valueOf(cb_true));
                        } else {
                            if ((((w_count == 5 || true) || true) || true)) {
                                file1_serial_2 = new BigDecimal(String.valueOf(1000 + w_count).trim()).intValue();
                                file1_xseen = new BigDecimal(String.valueOf(file1_xseen + 1).trim()).intValue();
                                file1.rewrite(file1_rec);
                            }
                            /* RAW: END-READ  */
                            /* RAW: END-PERFORM  */
                            if (!((w_count == 22 && !String.valueOf(eof).trim().isEmpty()))) {
                                CobolDisplay.display("FAIL 4");
                            }
                            file1.close();
                            file1.open("INPUT");
                            eof.set(String.valueOf(cb_false));
                            abort.set(String.valueOf(cb_false));
                            for (w_count = 1; !((!String.valueOf(eof).trim().isEmpty() || !String.valueOf(abort).trim().isEmpty())); w_count += 1) {
                                if (file1.read(null) == FileStatus.AT_END) {
                                    eof.set(String.valueOf(cb_true));
                                } else {
                                    if (file1_serial_1 != w_count) {
                                        CobolDisplay.display("FAIL 5");
                                        abort.set(String.valueOf(cb_true));
                                    } else {
                                        if ((((w_count == 5 || true) || true) || true)) {
                                            if (!((file1_serial_2 == ((1000 + w_count)) && file1_xseen == 1))) {
                                                CobolDisplay.display("FAIL 6");
                                                abort.set(String.valueOf(cb_true));
                                            }
                                        } else {
                                            if (!((file1_serial_2 == ((100 + w_count)) && file1_xseen == 0))) {
                                                CobolDisplay.display("FAIL 7");
                                                abort.set(String.valueOf(cb_true));
                                            }
                                        }
                                        /* RAW: END-READ  */
                                        /* RAW: END-PERFORM  */
                                        file1.close();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new RunFile053SequentialFileRewrite().run();
    }
}
