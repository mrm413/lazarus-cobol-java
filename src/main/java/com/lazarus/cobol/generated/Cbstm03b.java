package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cbstm03b extends CobolProgram {
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
    private CobolString trnxfile_status = new CobolString(1); // Group: TRNXFILE-STATUS
    private CobolString trnxfile_stat1 = new CobolString(1);
    private CobolString trnxfile_stat2 = new CobolString(1);
    private CobolString xreffile_status = new CobolString(1); // Group: XREFFILE-STATUS
    private CobolString xreffile_stat1 = new CobolString(1);
    private CobolString xreffile_stat2 = new CobolString(1);
    private CobolString custfile_status = new CobolString(1); // Group: CUSTFILE-STATUS
    private CobolString custfile_stat1 = new CobolString(1);
    private CobolString custfile_stat2 = new CobolString(1);
    private CobolString acctfile_status = new CobolString(1); // Group: ACCTFILE-STATUS
    private CobolString acctfile_stat1 = new CobolString(1);
    private CobolString acctfile_stat2 = new CobolString(1);

    // LINKAGE SECTION
    private CobolString lk_m03b_area = new CobolString(1); // Group: LK-M03B-AREA
    private CobolString lk_m03b_dd = new CobolString(8);
    private CobolString lk_m03b_oper = new CobolString(1);
    private CobolString lk_m03b_rc = new CobolString(2);
    private CobolString lk_m03b_key = new CobolString(25);
    private int lk_m03b_key_ln = 0;
    private CobolString lk_m03b_fldt = new CobolString(1000);

    // FILE SECTION — TRNX-FILE
    private CobolString fd_trnxfile_rec = new CobolString(1); // Group: FD-TRNXFILE-REC
    private CobolString fd_trnxs_id = new CobolString(1); // Group: FD-TRNXS-ID
    private CobolString fd_trnx_card = new CobolString(16);
    private CobolString fd_trnx_id = new CobolString(16);
    private CobolString fd_acct_data = new CobolString(289);

    // FILE SECTION — XREF-FILE
    private CobolString fd_xreffile_rec = new CobolString(1); // Group: FD-XREFFILE-REC
    private CobolString fd_xref_card_num = new CobolString(16);
    private CobolString fd_xref_data = new CobolString(34);

    // FILE SECTION — CUST-FILE
    private CobolString fd_custfile_rec = new CobolString(1); // Group: FD-CUSTFILE-REC
    private CobolString fd_cust_id = new CobolString(9);
    private CobolString fd_cust_data = new CobolString(491);

    // FILE SECTION — ACCT-FILE
    private CobolString fd_acctfile_rec = new CobolString(1); // Group: FD-ACCTFILE-REC
    private int fd_acct_id = 0;


    // FILE DESCRIPTORS
    private CobolFile trnx_file = new CobolFile("TRNXFILE", "INDEXED", "SEQUENTIAL");
    // File status: TRNXFILE-STATUS
    private CobolFile xref_file = new CobolFile("XREFFILE", "INDEXED", "SEQUENTIAL");
    // File status: XREFFILE-STATUS
    private CobolFile cust_file = new CobolFile("CUSTFILE", "INDEXED", "RANDOM");
    // File status: CUSTFILE-STATUS
    private CobolFile acct_file = new CobolFile("ACCTFILE", "INDEXED", "RANDOM");
    // File status: ACCTFILE-STATUS

    private CobolString m03b_open = new CobolString(256); // fallback
    private CobolString m03b_read = new CobolString(256); // fallback
    private CobolString m03b_close = new CobolString(256); // fallback
    private CobolString m03b_read_k = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void para_start() {
        if (String.valueOf(lk_m03b_dd).equals(String.valueOf("TRNXFILE"))) {
            _1000();
            /* RAW: - TRNXFILE-PROC THRU 1999 - */
            return;
        } else if (String.valueOf(lk_m03b_dd).equals(String.valueOf("XREFFILE"))) {
            _2000();
            /* RAW: - XREFFILE-PROC THRU 2999 - */
            return;
        } else if (String.valueOf(lk_m03b_dd).equals(String.valueOf("CUSTFILE"))) {
            _3000();
            /* RAW: - CUSTFILE-PROC THRU 3999 - */
            return;
        } else if (String.valueOf(lk_m03b_dd).equals(String.valueOf("ACCTFILE"))) {
            _4000();
            /* RAW: - ACCTFILE-PROC THRU 4999 - */
            return;
        } else {
            _9999();
            return;
        }
        /* RAW: 9999 - */
    // return;
    }

    private void trnxfile_proc() {
        if (!String.valueOf(m03b_open).trim().isEmpty()) {
            trnx_file.open("INPUT");
            _1900();
            return;
        }
        if (!String.valueOf(m03b_read).trim().isEmpty()) {
            if (trnx_file.read(lk_m03b_fldt) == FileStatus.AT_END) {
            }
            _1900();
            return;
        }
        if (!String.valueOf(m03b_close).trim().isEmpty()) {
            trnx_file.close();
            _1900();
            return;
        }
        /* RAW: 1900 - */
        return;
    }

    private void lk_m03b_rc() {
        /* RAW: 1999 - */
        return;
    }

    private void xreffile_proc() {
        if (!String.valueOf(m03b_open).trim().isEmpty()) {
            xref_file.open("INPUT");
            _2900();
            return;
        }
        if (!String.valueOf(m03b_read).trim().isEmpty()) {
            if (xref_file.read(lk_m03b_fldt) == FileStatus.AT_END) {
            }
            _2900();
            return;
        }
        if (!String.valueOf(m03b_close).trim().isEmpty()) {
            xref_file.close();
            _2900();
            return;
        }
        /* RAW: 2900 - */
        return;
    }

    private void lk_m03b_rc_2() {
        /* RAW: 2999 - */
        return;
    }

    private void custfile_proc() {
        if (!String.valueOf(m03b_open).trim().isEmpty()) {
            cust_file.open("INPUT");
            _3900();
            return;
        }
        if (!String.valueOf(m03b_read_k).trim().isEmpty()) {
            fd_cust_id.set(String.valueOf(CobolString.refMod(lk_m03b_key, 1, lk_m03b_key_ln)));
            if (cust_file.read(lk_m03b_fldt) == FileStatus.AT_END) {
            }
            _3900();
            return;
        }
        if (!String.valueOf(m03b_close).trim().isEmpty()) {
            cust_file.close();
            _3900();
            return;
        }
        /* RAW: 3900 - */
        return;
    }

    private void lk_m03b_rc_3() {
        /* RAW: 3999 - */
        return;
    }

    private void acctfile_proc() {
        if (!String.valueOf(m03b_open).trim().isEmpty()) {
            acct_file.open("INPUT");
            _4900();
            return;
        }
        if (!String.valueOf(m03b_read_k).trim().isEmpty()) {
            fd_acct_id = new BigDecimal(String.valueOf(CobolString.refMod(lk_m03b_key, 1, lk_m03b_key_ln)).trim()).intValue();
            if (acct_file.read(lk_m03b_fldt) == FileStatus.AT_END) {
            }
            _4900();
            return;
        }
        if (!String.valueOf(m03b_close).trim().isEmpty()) {
            acct_file.close();
            _4900();
            return;
        }
        /* RAW: 4900 - */
        return;
    }

    private void lk_m03b_rc_4() {
        /* RAW: 4999 - */
        return;
    }

    private void _1000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _4000() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    private void _1900() { /* stub — external/COPY */ }

    private void _2900() { /* stub — external/COPY */ }

    private void _3900() { /* stub — external/COPY */ }

    private void _4900() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cbstm03b().run();
    }
}
