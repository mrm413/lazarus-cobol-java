package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cbact01c extends CobolProgram {
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
    // FILE SECTION — ACCTFILE-FILE
    private CobolString fd_acctfile_rec = new CobolString(1); // Group: FD-ACCTFILE-REC
    private int fd_acct_id = 0;
    private CobolString fd_acct_data = new CobolString(289);

    // FILE SECTION — OUT-FILE
    private CobolString out_acct_rec = new CobolString(1); // Group: OUT-ACCT-REC
    private int out_acct_id = 0;
    private CobolString out_acct_active_status = new CobolString(1);
    private BigDecimal out_acct_curr_bal = BigDecimal.ZERO;
    private BigDecimal out_acct_credit_limit = BigDecimal.ZERO;
    private BigDecimal out_acct_cash_credit_limit = BigDecimal.ZERO;
    private CobolString out_acct_open_date = new CobolString(10);
    private CobolString out_acct_expiraion_date = new CobolString(10);
    private CobolString out_acct_reissue_date = new CobolString(10);
    private BigDecimal out_acct_curr_cyc_credit = BigDecimal.ZERO;
    private BigDecimal out_acct_curr_cyc_debit = BigDecimal.ZERO;
    private CobolString out_acct_group_id = new CobolString(10);

    // FILE SECTION — ARRY-FILE
    private CobolString arr_array_rec = new CobolString(1); // Group: ARR-ARRAY-REC
    private int arr_acct_id = 0;
    private CobolString[] arr_acct_bal = new CobolString[5]; // Group: ARR-ACCT-BAL
    private BigDecimal[] arr_acct_curr_bal = new BigDecimal[5];
    private BigDecimal[] arr_acct_curr_cyc_debit = new BigDecimal[5];
    private CobolString arr_filler = new CobolString(4);

    // FILE SECTION — VBRC-FILE
    private CobolString vbr_rec = new CobolString(80);


    // FILE DESCRIPTORS
    private CobolFile acctfile_file = new CobolFile("ACCTFILE", "INDEXED", "SEQUENTIAL");
    // File status: ACCTFILE-STATUS
    private CobolFile out_file = new CobolFile("OUTFILE", "SEQUENTIAL", "SEQUENTIAL");
    // File status: OUTFILE-STATUS
    private CobolFile arry_file = new CobolFile("ARRYFILE", "SEQUENTIAL", "SEQUENTIAL");
    // File status: ARRYFILE-STATUS
    private CobolFile vbrc_file = new CobolFile("VBRCFILE", "SEQUENTIAL", "SEQUENTIAL");
    // File status: VBRCFILE-STATUS

    private CobolString end_of_file = new CobolString(256); // fallback
    private CobolString account_record = new CobolString(256); // fallback
    private CobolString acctfile_status = new CobolString(256); // fallback
    private CobolString appl_result = new CobolString(256); // fallback
    private CobolString vbrc_rec1 = new CobolString(256); // fallback
    private CobolString appl_aok = new CobolString(256); // fallback
    private CobolString appl_eof = new CobolString(256); // fallback
    private CobolString io_status = new CobolString(256); // fallback
    private CobolString acct_id = new CobolString(256); // fallback
    private CobolString acct_active_status = new CobolString(256); // fallback
    private CobolString acct_curr_bal = new CobolString(256); // fallback
    private CobolString acct_credit_limit = new CobolString(256); // fallback
    private CobolString acct_cash_credit_limit = new CobolString(256); // fallback
    private CobolString acct_open_date = new CobolString(256); // fallback
    private CobolString acct_expiraion_date = new CobolString(256); // fallback
    private CobolString acct_reissue_date = new CobolString(256); // fallback
    private CobolString acct_curr_cyc_credit = new CobolString(256); // fallback
    private CobolString acct_curr_cyc_debit = new CobolString(256); // fallback
    private CobolString acct_group_id = new CobolString(256); // fallback
    private CobolString codatecn_inp_date = new CobolString(256); // fallback
    private CobolString codatecn_0ut_date = new CobolString(256); // fallback
    private CobolString outfile_status = new CobolString(256); // fallback
    private CobolString arryfile_status = new CobolString(256); // fallback
    private CobolString vb1_acct_id = new CobolString(256); // fallback
    private CobolString ws_acct_reissue_yyyy = new CobolString(256); // fallback
    private CobolString ws_recd_len = new CobolString(256); // fallback
    private CobolString vbrcfile_status = new CobolString(256); // fallback
    private CobolString vbrc_rec2 = new CobolString(256); // fallback
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
        CobolDisplay.display("START OF EXECUTION OF PROGRAM CBACT01C");
        _0000();
        /* RAW: -  */
    }

    private void acctfile_open() {
        _2000();
        /* RAW: -  */
    }

    private void outfile_open() {
        _3000();
        /* RAW: -  */
    }

    private void arrfile_open() {
        _4000();
        /* RAW: -  */
    }

    private void vbrfile_open() {
        while (!(String.valueOf(end_of_file).equals(String.valueOf("Y")))) {
            if (String.valueOf(end_of_file).equals(String.valueOf("N"))) {
                _1000();
                /* RAW: - ACCTFILE-GET-NEXT */
                if (String.valueOf(end_of_file).equals(String.valueOf("N"))) {
                    CobolDisplay.display(String.valueOf(account_record));
                }
            }
        }
        _9000();
        /* RAW: -  */
    }

    private void acctfile_close() {
        CobolDisplay.display("END OF EXECUTION OF PROGRAM CBACT01C");
        return;
    }

    private void acctfile_get_next() {
        if (acctfile_file.read(account_record) == FileStatus.AT_END) {
        }
        if (String.valueOf(acctfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
            arr_array_rec.set("");
            _1100();
            /* RAW: - DISPLAY-ACCT-RECORD */
            _1300();
            /* RAW: - POPUL-ACCT-RECORD */
            _1350();
            /* RAW: - WRITE-ACCT-RECORD */
            _1400();
            /* RAW: - POPUL-ARRAY-RECORD */
            _1450();
            /* RAW: - WRITE-ARRY-RECORD */
            vbrc_rec1.set("");
            _1500();
            /* RAW: - POPUL-VBRC-RECORD */
            _1550();
            /* RAW: - WRITE-VB1-RECORD */
            _1575();
            /* RAW: - WRITE-VB2-RECORD */
        } else {
            if (String.valueOf(acctfile_status).equals(String.valueOf("10"))) {
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
                CobolDisplay.display("ERROR READING ACCOUNT FILE");
                io_status.set(String.valueOf(acctfile_status));
                _9910();
                /* RAW: - DISPLAY-IO-STATUS */
                _9999();
                /* RAW: - ABEND-PROGRAM */
            }
        }
        return;
    }

    private void display_acct_record() {
        CobolDisplay.display("ACCT-ID                 :" + String.valueOf(acct_id));
        CobolDisplay.display("ACCT-ACTIVE-STATUS      :" + String.valueOf(acct_active_status));
        CobolDisplay.display("ACCT-CURR-BAL           :" + String.valueOf(acct_curr_bal));
        CobolDisplay.display("ACCT-CREDIT-LIMIT       :" + String.valueOf(acct_credit_limit));
        CobolDisplay.display("ACCT-CASH-CREDIT-LIMIT  :" + String.valueOf(acct_cash_credit_limit));
        CobolDisplay.display("ACCT-OPEN-DATE          :" + String.valueOf(acct_open_date));
        CobolDisplay.display("ACCT-EXPIRAION-DATE     :" + String.valueOf(acct_expiraion_date));
        CobolDisplay.display("ACCT-REISSUE-DATE       :" + String.valueOf(acct_reissue_date));
        CobolDisplay.display("ACCT-CURR-CYC-CREDIT    :" + String.valueOf(acct_curr_cyc_credit));
        CobolDisplay.display("ACCT-CURR-CYC-DEBIT     :" + String.valueOf(acct_curr_cyc_debit));
        CobolDisplay.display("ACCT-GROUP-ID           :" + String.valueOf(acct_group_id));
        CobolDisplay.display("-------------------------------------------------");
        return;
    }

    private void popul_acct_record() {
    }

    private void out_acct_id() {
    }

    private void out_acct_active_status() {
    }

    private void out_acct_curr_bal() {
    }

    private void out_acct_credit_limit() {
    }

    private void out_acct_cash_credit_limit() {
    }

    private void out_acct_open_date() {
    }

    private void out_acct_expiraion_date() {
        codatecn_inp_date.set(String.valueOf(acct_reissue_date));
    }

    private void ws_reissue_date() {
    }

    private void codatecn_type() {
    }

    private void codatecn_outtype() {
        CobolProgram.call("COBDATFT");
    }

    private void codatecn_rec() {
    }

    private void out_acct_reissue_date() {
    }

    private void out_acct_curr_cyc_credit() {
        if (String.valueOf(acct_curr_cyc_debit).equals(String.valueOf(0))) {
            out_acct_curr_cyc_debit = new BigDecimal(String.valueOf(2525).trim());
        }
    }

    private void out_acct_group_id() {
        return;
    }

    private void write_acct_record() {
        out_file.write(out_acct_rec);
        if ((!String.valueOf(outfile_status).equals(String.valueOf("00")) && !String.valueOf(outfile_status).equals(String.valueOf("10")))) {
            CobolDisplay.display("ACCOUNT FILE WRITE STATUS IS:" + String.valueOf(outfile_status));
            io_status.set(String.valueOf(outfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void popul_array_record() {
    }

    private void arr_acct_id() {
    // arr_acct_curr_bal[1 - 1] = acct_curr_bal;
    // arr_acct_curr_cyc_debit[1 - 1] = 1005;
    // arr_acct_curr_bal[2 - 1] = acct_curr_bal;
    // arr_acct_curr_cyc_debit[2 - 1] = 1525;
    // arr_acct_curr_bal[3 - 1] = -1025;
    // arr_acct_curr_cyc_debit[3 - 1] = -2500;
        return;
    }

    private void write_arry_record() {
        arry_file.write(arr_array_rec);
        if ((!String.valueOf(arryfile_status).equals(String.valueOf("00")) && !String.valueOf(arryfile_status).equals(String.valueOf("10")))) {
            CobolDisplay.display("ACCOUNT FILE WRITE STATUS IS:" + String.valueOf(arryfile_status));
            io_status.set(String.valueOf(arryfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void popul_vbrc_record() {
        vb1_acct_id.set(String.valueOf(acct_id));
    }

    private void vb2_acct_id() {
    }

    private void vb1_acct_active_status() {
    }

    private void vb2_acct_curr_bal() {
    }

    private void vb2_acct_credit_limit() {
    }

    private void vb2_acct_reissue_yyyy() {
        CobolDisplay.display("VBRC-REC1:");
    }

    private void vbrc_rec1() {
        CobolDisplay.display("VBRC-REC2:");
    }

    private void vbrc_rec2() {
        return;
    }

    private void write_vb1_record() {
    }

    private void ws_recd_len() {
    // vbr_rec.setRefMod(1, ws_recd_len, String.valueOf(vbrc_rec1));
        vbrc_file.write(vbr_rec);
        if ((!String.valueOf(vbrcfile_status).equals(String.valueOf("00")) && !String.valueOf(vbrcfile_status).equals(String.valueOf("10")))) {
            CobolDisplay.display("ACCOUNT FILE WRITE STATUS IS:" + String.valueOf(vbrcfile_status));
            io_status.set(String.valueOf(vbrcfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void write_vb2_record() {
    }

    private void ws_recd_len_2() {
    // vbr_rec.setRefMod(1, ws_recd_len, String.valueOf(vbrc_rec2));
        vbrc_file.write(vbr_rec);
        if ((!String.valueOf(vbrcfile_status).equals(String.valueOf("00")) && !String.valueOf(vbrcfile_status).equals(String.valueOf("10")))) {
            CobolDisplay.display("ACCOUNT FILE WRITE STATUS IS:" + String.valueOf(vbrcfile_status));
            io_status.set(String.valueOf(vbrcfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void acctfile_open_2() {
    }

    private void appl_result() {
        acctfile_file.open("INPUT");
        if (String.valueOf(acctfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING ACCTFILE");
            io_status.set(String.valueOf(acctfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void outfile_open_2() {
    }

    private void appl_result_2() {
        out_file.open("OUTPUT");
        if (String.valueOf(outfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING OUTFILE" + String.valueOf(outfile_status));
            io_status.set(String.valueOf(outfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void arrfile_open_2() {
    }

    private void appl_result_3() {
        arry_file.open("OUTPUT");
        if (String.valueOf(arryfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING ARRAYFILE" + String.valueOf(arryfile_status));
            io_status.set(String.valueOf(arryfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void vbrfile_open_2() {
    }

    private void appl_result_4() {
        vbrc_file.open("OUTPUT");
        if (String.valueOf(vbrcfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING VBRC FILE" + String.valueOf(vbrcfile_status));
            io_status.set(String.valueOf(vbrcfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void acctfile_close_2() {
        appl_result.set(String.valueOf(8));
        acctfile_file.close();
        if (String.valueOf(acctfile_status).equals(String.valueOf("00"))) {
            appl_result.set(new BigDecimal(String.valueOf(appl_result).trim()).subtract(new BigDecimal(String.valueOf(appl_result).trim())).toPlainString());
            cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).subtract(new BigDecimal(String.valueOf(appl_result).trim())).toPlainString());
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING ACCOUNT FILE");
            io_status.set(String.valueOf(acctfile_status));
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

    private void _2000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _4000() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _1100() { /* stub — external/COPY */ }

    private void _1300() { /* stub — external/COPY */ }

    private void _1350() { /* stub — external/COPY */ }

    private void _1400() { /* stub — external/COPY */ }

    private void _1450() { /* stub — external/COPY */ }

    private void _1500() { /* stub — external/COPY */ }

    private void _1550() { /* stub — external/COPY */ }

    private void _1575() { /* stub — external/COPY */ }

    private void _9910() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cbact01c().run();
    }
}
