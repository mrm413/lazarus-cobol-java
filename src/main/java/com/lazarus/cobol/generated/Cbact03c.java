package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cbact03c extends CobolProgram {
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
    // FILE SECTION — XREFFILE-FILE
    private CobolString fd_xreffile_rec = new CobolString(1); // Group: FD-XREFFILE-REC
    private CobolString fd_xref_card_num = new CobolString(16);
    private CobolString fd_xref_data = new CobolString(34);


    // FILE DESCRIPTORS
    private CobolFile xreffile_file = new CobolFile("XREFFILE", "INDEXED", "SEQUENTIAL");
    // File status: XREFFILE-STATUS

    private CobolString end_of_file = new CobolString(256); // fallback
    private CobolString card_xref_record = new CobolString(256); // fallback
    private CobolString xreffile_status = new CobolString(256); // fallback
    private CobolString appl_result = new CobolString(256); // fallback
    private CobolString appl_aok = new CobolString(256); // fallback
    private CobolString appl_eof = new CobolString(256); // fallback
    private CobolString io_status = new CobolString(256); // fallback
    private CobolString zero = new CobolString(256); // fallback
    private CobolString cb_else = new CobolString(256); // fallback
    private CobolString timing = new CobolString(256); // fallback
    private CobolString abcode = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString io_stat1 = new CobolString(256); // fallback
    private CobolString io_status_04 = new CobolString(256); // fallback
    private CobolString two_bytes_binary = new CobolString(256); // fallback
    private CobolString io_stat2 = new CobolString(256); // fallback
    private CobolString two_bytes_right = new CobolString(256); // fallback
    private CobolString io_status_0403 = new CobolString(256); // fallback

    private void para_main() {
        CobolDisplay.display("START OF EXECUTION OF PROGRAM CBACT03C");
        _0000();
        /* RAW: -  */
    }

    private void xreffile_open() {
        while (!(String.valueOf(end_of_file).equals(String.valueOf("Y")))) {
            if (String.valueOf(end_of_file).equals(String.valueOf("N"))) {
                _1000();
                /* RAW: - XREFFILE-GET-NEXT */
                if (String.valueOf(end_of_file).equals(String.valueOf("N"))) {
                    CobolDisplay.display(String.valueOf(card_xref_record));
                }
            }
        }
        _9000();
        /* RAW: -  */
    }

    private void xreffile_close() {
        CobolDisplay.display("END OF EXECUTION OF PROGRAM CBACT03C");
        return;
    }

    private void xreffile_get_next() {
        if (xreffile_file.read(card_xref_record) == FileStatus.AT_END) {
        }
        if (String.valueOf(xreffile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
            CobolDisplay.display(String.valueOf(card_xref_record));
        } else {
            if (String.valueOf(xreffile_status).equals(String.valueOf("10"))) {
                appl_result.set(String.valueOf(16));
            } else {
                appl_result.set(String.valueOf(12));
            }
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            if (!String.valueOf(appl_eof).trim().isEmpty()) {
                end_of_file.set(String.valueOf("Y"));
            } else {
                CobolDisplay.display("ERROR READING XREFFILE");
                io_status.set(String.valueOf(xreffile_status));
                _9910();
                /* RAW: - DISPLAY-IO-STATUS */
                _9999();
                /* RAW: - ABEND-PROGRAM */
            }
        }
        return;
    }

    private void xreffile_open_2() {
    }

    private void appl_result() {
        xreffile_file.open("INPUT");
        if (String.valueOf(xreffile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING XREFFILE");
            io_status.set(String.valueOf(xreffile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void xreffile_close_2() {
        appl_result.set(String.valueOf(8));
        xreffile_file.close();
        if (String.valueOf(xreffile_status).equals(String.valueOf("00"))) {
            appl_result.set(new BigDecimal(String.valueOf(appl_result).trim()).subtract(new BigDecimal(String.valueOf(appl_result).trim())).toPlainString());
            cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).subtract(new BigDecimal(String.valueOf(appl_result).trim())).toPlainString());
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING XREFFILE");
            io_status.set(String.valueOf(xreffile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void abend_program() {
        CobolDisplay.display("ABENDING PROGRAM");
        timing.set(String.valueOf(0));
        abcode.set(String.valueOf(999));
        CobolProgram.call("CEE3ABD", abcode, _unnamed);
    }

    private void timing() {
        /* RAW: 9910 - */
    }

    private void display_io_status() {
        if ((!CobolIntrinsics.isNumeric(io_status) || String.valueOf(io_stat1).equals(String.valueOf("9")))) {
            io_status_04.setRefMod(1, 1, String.valueOf(io_stat1));
            two_bytes_binary.set(String.valueOf(0));
            two_bytes_right.set(String.valueOf(io_stat2));
            io_status_0403.set(String.valueOf(two_bytes_binary));
            CobolDisplay.display("FILE STATUS IS: NNNN" + String.valueOf(io_status_04));
        } else {
            io_status_04.set(String.valueOf("0000"));
            io_status_04.setRefMod(3, 2, String.valueOf(io_status));
            CobolDisplay.display("FILE STATUS IS: NNNN" + String.valueOf(io_status_04));
        }
        return;
    }

    private void _0000() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _9910() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cbact03c().run();
    }
}
