package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cbtrn02c extends CobolProgram {
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
    // FILE SECTION — DALYTRAN-FILE
    private CobolString fd_tran_record = new CobolString(1); // Group: FD-TRAN-RECORD
    private CobolString fd_tran_id = new CobolString(16);
    private CobolString fd_cust_data = new CobolString(334);

    // FILE SECTION — TRANSACT-FILE
    private CobolString fd_tranfile_rec = new CobolString(1); // Group: FD-TRANFILE-REC
    private CobolString fd_trans_id = new CobolString(16);
    private CobolString fd_acct_data = new CobolString(289);

    // FILE SECTION — XREF-FILE
    private CobolString fd_xreffile_rec = new CobolString(1); // Group: FD-XREFFILE-REC
    private CobolString fd_xref_card_num = new CobolString(16);
    private CobolString fd_xref_data = new CobolString(34);

    // FILE SECTION — DALYREJS-FILE
    private CobolString fd_rejs_record = new CobolString(1); // Group: FD-REJS-RECORD
    private CobolString fd_reject_record = new CobolString(350);
    private CobolString fd_validation_trailer = new CobolString(80);

    // FILE SECTION — ACCOUNT-FILE
    private CobolString fd_acctfile_rec = new CobolString(1); // Group: FD-ACCTFILE-REC
    private int fd_acct_id = 0;

    // FILE SECTION — TCATBAL-FILE
    private CobolString fd_tran_cat_bal_record = new CobolString(1); // Group: FD-TRAN-CAT-BAL-RECORD
    private CobolString fd_tran_cat_key = new CobolString(1); // Group: FD-TRAN-CAT-KEY
    private int fd_trancat_acct_id = 0;
    private CobolString fd_trancat_type_cd = new CobolString(2);
    private int fd_trancat_cd = 0;
    private CobolString fd_fd_tran_cat_data = new CobolString(33);


    // FILE DESCRIPTORS
    private CobolFile dalytran_file = new CobolFile("DALYTRAN", "SEQUENTIAL", "SEQUENTIAL");
    // File status: DALYTRAN-STATUS
    private CobolFile transact_file = new CobolFile("TRANFILE", "INDEXED", "RANDOM");
    // File status: TRANFILE-STATUS
    private CobolFile xref_file = new CobolFile("XREFFILE", "INDEXED", "RANDOM");
    // File status: XREFFILE-STATUS
    private CobolFile dalyrejs_file = new CobolFile("DALYREJS", "SEQUENTIAL", "SEQUENTIAL");
    // File status: DALYREJS-STATUS
    private CobolFile account_file = new CobolFile("ACCTFILE", "INDEXED", "RANDOM");
    // File status: ACCTFILE-STATUS
    private CobolFile tcatbal_file = new CobolFile("TCATBALF", "INDEXED", "RANDOM");
    // File status: TCATBALF-STATUS

    private CobolString end_of_file = new CobolString(256); // fallback
    private CobolString ws_transaction_count = new CobolString(256); // fallback
    private CobolString ws_validation_fail_reason = new CobolString(256); // fallback
    private CobolString ws_validation_fail_reason_desc = new CobolString(256); // fallback
    private CobolString ws_reject_count = new CobolString(256); // fallback
    private CobolString dalytran_status = new CobolString(256); // fallback
    private CobolString appl_result = new CobolString(256); // fallback
    private CobolString appl_aok = new CobolString(256); // fallback
    private CobolString io_status = new CobolString(256); // fallback
    private CobolString tranfile_status = new CobolString(256); // fallback
    private CobolString xreffile_status = new CobolString(256); // fallback
    private CobolString dalyrejs_status = new CobolString(256); // fallback
    private CobolString acctfile_status = new CobolString(256); // fallback
    private CobolString tcatbalf_status = new CobolString(256); // fallback
    private CobolString dalytran_record = new CobolString(256); // fallback
    private CobolString appl_eof = new CobolString(256); // fallback
    private CobolString dalytran_card_num = new CobolString(256); // fallback
    private CobolString card_xref_record = new CobolString(256); // fallback
    private CobolString xref_acct_id = new CobolString(256); // fallback
    private CobolString account_record = new CobolString(256); // fallback
    private CobolString dalytran_id = new CobolString(256); // fallback
    private CobolString tran_id = new CobolString(256); // fallback
    private CobolString dalytran_type_cd = new CobolString(256); // fallback
    private CobolString tran_type_cd = new CobolString(256); // fallback
    private CobolString dalytran_cat_cd = new CobolString(256); // fallback
    private CobolString tran_cat_cd = new CobolString(256); // fallback
    private CobolString dalytran_source = new CobolString(256); // fallback
    private CobolString tran_source = new CobolString(256); // fallback
    private CobolString dalytran_desc = new CobolString(256); // fallback
    private CobolString tran_desc = new CobolString(256); // fallback
    private CobolString dalytran_amt = new CobolString(256); // fallback
    private CobolString tran_amt = new CobolString(256); // fallback
    private CobolString dalytran_merchant_id = new CobolString(256); // fallback
    private CobolString tran_merchant_id = new CobolString(256); // fallback
    private CobolString dalytran_merchant_name = new CobolString(256); // fallback
    private CobolString tran_merchant_name = new CobolString(256); // fallback
    private CobolString dalytran_merchant_city = new CobolString(256); // fallback
    private CobolString tran_merchant_city = new CobolString(256); // fallback
    private CobolString dalytran_merchant_zip = new CobolString(256); // fallback
    private CobolString tran_merchant_zip = new CobolString(256); // fallback
    private CobolString tran_card_num = new CobolString(256); // fallback
    private CobolString dalytran_orig_ts = new CobolString(256); // fallback
    private CobolString tran_orig_ts = new CobolString(256); // fallback
    private CobolString db2_format_ts = new CobolString(256); // fallback
    private CobolString tran_proc_ts = new CobolString(256); // fallback
    private CobolString reject_tran_data = new CobolString(256); // fallback
    private CobolString ws_validation_trailer = new CobolString(256); // fallback
    private CobolString validation_trailer = new CobolString(256); // fallback
    private CobolString reject_record = new CobolString(256); // fallback
    private CobolString ws_create_trancat_rec = new CobolString(256); // fallback
    private CobolString tran_cat_bal_record = new CobolString(256); // fallback
    private CobolString trancat_acct_id = new CobolString(256); // fallback
    private CobolString trancat_type_cd = new CobolString(256); // fallback
    private CobolString trancat_cd = new CobolString(256); // fallback
    private CobolString tran_cat_bal = new CobolString(256); // fallback
    private CobolString acct_curr_bal = new CobolString(256); // fallback
    private CobolString acct_curr_cyc_credit = new CobolString(256); // fallback
    private CobolString cb_else = new CobolString(256); // fallback
    private CobolString acct_curr_cyc_debit = new CobolString(256); // fallback
    private CobolString tran_record = new CobolString(256); // fallback
    private CobolString cobol_ts = new CobolString(256); // fallback
    private CobolString cob_yyyy = new CobolString(256); // fallback
    private CobolString db2_yyyy = new CobolString(256); // fallback
    private CobolString cob_mm = new CobolString(256); // fallback
    private CobolString db2_mm = new CobolString(256); // fallback
    private CobolString cob_dd = new CobolString(256); // fallback
    private CobolString db2_dd = new CobolString(256); // fallback
    private CobolString cob_hh = new CobolString(256); // fallback
    private CobolString db2_hh = new CobolString(256); // fallback
    private CobolString cob_min = new CobolString(256); // fallback
    private CobolString db2_min = new CobolString(256); // fallback
    private CobolString cob_ss = new CobolString(256); // fallback
    private CobolString db2_ss = new CobolString(256); // fallback
    private CobolString cob_mil = new CobolString(256); // fallback
    private CobolString db2_mil = new CobolString(256); // fallback
    private CobolString db2_rest = new CobolString(256); // fallback
    private CobolString db2_streep_1 = new CobolString(256); // fallback
    private CobolString db2_streep_2 = new CobolString(256); // fallback
    private CobolString db2_streep_3 = new CobolString(256); // fallback
    private CobolString db2_dot_1 = new CobolString(256); // fallback
    private CobolString db2_dot_2 = new CobolString(256); // fallback
    private CobolString db2_dot_3 = new CobolString(256); // fallback
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
        CobolDisplay.display("START OF EXECUTION OF PROGRAM CBTRN02C");
        _0000();
        /* RAW: -  */
    }

    private void dalytran_open() {
        _0100();
        /* RAW: -  */
    }

    private void tranfile_open() {
        _0200();
        /* RAW: -  */
    }

    private void xreffile_open() {
        _0300();
        /* RAW: -  */
    }

    private void dalyrejs_open() {
        _0400();
        /* RAW: -  */
    }

    private void acctfile_open() {
        _0500();
        /* RAW: -  */
    }

    private void tcatbalf_open() {
        while (!(String.valueOf(end_of_file).equals(String.valueOf("Y")))) {
            if (String.valueOf(end_of_file).equals(String.valueOf("N"))) {
                _1000();
                /* RAW: - DALYTRAN-GET-NEXT */
                if (String.valueOf(end_of_file).equals(String.valueOf("N"))) {
                    ws_transaction_count.set(new BigDecimal(String.valueOf(ws_transaction_count).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                    ws_validation_fail_reason.set(String.valueOf(0));
                    ws_validation_fail_reason_desc.set(String.valueOf(" "));
                    _1500();
                    /* RAW: - VALIDATE-TRAN */
                    if (String.valueOf(ws_validation_fail_reason).equals(String.valueOf(0))) {
                        _2000();
                        /* RAW: - POST-TRANSACTION */
                    } else {
                        ws_reject_count.set(new BigDecimal(String.valueOf(ws_reject_count).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                        _2500();
                        /* RAW: - WRITE-REJECT-REC */
                    }
                }
            }
        }
        _9000();
        /* RAW: -  */
    }

    private void dalytran_close() {
        _9100();
        /* RAW: -  */
    }

    private void tranfile_close() {
        _9200();
        /* RAW: -  */
    }

    private void xreffile_close() {
        _9300();
        /* RAW: -  */
    }

    private void dalyrejs_close() {
        _9400();
        /* RAW: -  */
    }

    private void acctfile_close() {
        _9500();
        /* RAW: -  */
    }

    private void tcatbalf_close() {
        CobolDisplay.display("TRANSACTIONS PROCESSED :" + String.valueOf(ws_transaction_count));
        CobolDisplay.display("TRANSACTIONS REJECTED  :" + String.valueOf(ws_reject_count));
        if (Integer.parseInt(String.valueOf(ws_reject_count).trim()) > 0) {
            return_code = new BigDecimal(String.valueOf(4).trim()).intValue();
        }
        CobolDisplay.display("END OF EXECUTION OF PROGRAM CBTRN02C");
        return;
    }

    private void dalytran_open_2() {
    }

    private void appl_result() {
        dalytran_file.open("INPUT");
        if (String.valueOf(dalytran_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING DALYTRAN");
            io_status.set(String.valueOf(dalytran_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void tranfile_open_2() {
    }

    private void appl_result_2() {
        transact_file.open("OUTPUT");
        if (String.valueOf(tranfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING TRANSACTION FILE");
            io_status.set(String.valueOf(tranfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void xreffile_open_2() {
    }

    private void appl_result_3() {
        xref_file.open("INPUT");
        if (String.valueOf(xreffile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING CROSS REF FILE");
            io_status.set(String.valueOf(xreffile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void dalyrejs_open_2() {
    }

    private void appl_result_4() {
        dalyrejs_file.open("OUTPUT");
        if (String.valueOf(dalyrejs_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING DALY REJECTS FILE");
            io_status.set(String.valueOf(dalyrejs_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void acctfile_open_2() {
    }

    private void appl_result_5() {
        account_file.open("I-O");
        if (String.valueOf(acctfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING ACCOUNT MASTER FILE");
            io_status.set(String.valueOf(acctfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void tcatbalf_open_2() {
    }

    private void appl_result_6() {
        tcatbal_file.open("I-O");
        if (String.valueOf(tcatbalf_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING TRANSACTION BALANCE FILE");
            io_status.set(String.valueOf(tcatbalf_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void dalytran_get_next() {
        if (dalytran_file.read(dalytran_record) == FileStatus.AT_END) {
        }
        if (String.valueOf(dalytran_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            if (String.valueOf(dalytran_status).equals(String.valueOf("10"))) {
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
                CobolDisplay.display("ERROR READING DALYTRAN FILE");
                io_status.set(String.valueOf(dalytran_status));
                _9910();
                /* RAW: - DISPLAY-IO-STATUS */
                _9999();
                /* RAW: - ABEND-PROGRAM */
            }
        }
        return;
    }

    private void validate_tran() {
        _1500();
        /* RAW: -  */
    }

    private void a_lookup_xref() {
        if (String.valueOf(ws_validation_fail_reason).equals(String.valueOf(0))) {
            _1500();
            /* RAW: - B-LOOKUP-ACCT */
        } else {
            /* CONTINUE */
        }
        return;
    }

    private void a_lookup_xref_2() {
        fd_xref_card_num.set(String.valueOf(dalytran_card_num));
        if (xref_file.read(card_xref_record) == FileStatus.AT_END) {
        }
        return;
    }

    private void b_lookup_acct() {
        fd_acct_id = new BigDecimal(String.valueOf(xref_acct_id).trim()).intValue();
        if (account_file.read(account_record) == FileStatus.AT_END) {
        }
        return;
    }

    private void post_transaction() {
        tran_id.set(String.valueOf(dalytran_id));
        tran_type_cd.set(String.valueOf(dalytran_type_cd));
        tran_cat_cd.set(String.valueOf(dalytran_cat_cd));
        tran_source.set(String.valueOf(dalytran_source));
        tran_desc.set(String.valueOf(dalytran_desc));
        tran_amt.set(String.valueOf(dalytran_amt));
        tran_merchant_id.set(String.valueOf(dalytran_merchant_id));
        tran_merchant_name.set(String.valueOf(dalytran_merchant_name));
        tran_merchant_city.set(String.valueOf(dalytran_merchant_city));
        tran_merchant_zip.set(String.valueOf(dalytran_merchant_zip));
        tran_card_num.set(String.valueOf(dalytran_card_num));
        tran_orig_ts.set(String.valueOf(dalytran_orig_ts));
        z_get_db2_format_timestamp();
        tran_proc_ts.set(String.valueOf(db2_format_ts));
        _2700();
        /* RAW: - UPDATE-TCATBAL */
        _2800();
        /* RAW: - UPDATE-ACCOUNT-REC */
        _2900();
        /* RAW: - WRITE-TRANSACTION-FILE */
        return;
    }

    private void write_reject_rec() {
        reject_tran_data.set(String.valueOf(dalytran_record));
        validation_trailer.set(String.valueOf(ws_validation_trailer));
        appl_result.set(String.valueOf(8));
        dalyrejs_file.write(reject_record);
        if (String.valueOf(dalyrejs_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR WRITING TO REJECTS FILE");
            io_status.set(String.valueOf(dalyrejs_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void update_tcatbal() {
        fd_trancat_acct_id = new BigDecimal(String.valueOf(xref_acct_id).trim()).intValue();
        fd_trancat_type_cd.set(String.valueOf(dalytran_type_cd));
        fd_trancat_cd = new BigDecimal(String.valueOf(dalytran_cat_cd).trim()).intValue();
        ws_create_trancat_rec.set(String.valueOf("N"));
        if (tcatbal_file.read(tran_cat_bal_record) == FileStatus.AT_END) {
        }
        if ((String.valueOf(tcatbalf_status).equals(String.valueOf("00")) || true)) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR READING TRANSACTION BALANCE FILE");
            io_status.set(String.valueOf(tcatbalf_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        if (String.valueOf(ws_create_trancat_rec).equals(String.valueOf("Y"))) {
            _2700();
            /* RAW: - A-CREATE-TCATBAL-REC */
        } else {
            _2700();
            /* RAW: - B-UPDATE-TCATBAL-REC */
        }
        return;
    }

    private void a_create_tcatbal_rec() {
        tran_cat_bal_record.set("");
        trancat_acct_id.set(String.valueOf(xref_acct_id));
        trancat_type_cd.set(String.valueOf(dalytran_type_cd));
        trancat_cd.set(String.valueOf(dalytran_cat_cd));
        tran_cat_bal.set(new BigDecimal(String.valueOf(tran_cat_bal).trim()).add(new BigDecimal(String.valueOf(dalytran_amt).trim())).toPlainString());
        tcatbal_file.write(tran_cat_bal_record);
        if (String.valueOf(tcatbalf_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR WRITING TRANSACTION BALANCE FILE");
            io_status.set(String.valueOf(tcatbalf_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        /* RAW: 2700 - */
    }

    private void b_update_tcatbal_rec() {
        tran_cat_bal.set(new BigDecimal(String.valueOf(tran_cat_bal).trim()).add(new BigDecimal(String.valueOf(dalytran_amt).trim())).toPlainString());
        tcatbal_file.rewrite(tran_cat_bal_record);
        if (String.valueOf(tcatbalf_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR REWRITING TRANSACTION BALANCE FILE");
            io_status.set(String.valueOf(tcatbalf_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        /* RAW: 2800 - */
    }

    private void update_account_rec() {
        acct_curr_bal.set(new BigDecimal(String.valueOf(acct_curr_bal).trim()).add(new BigDecimal(String.valueOf(dalytran_amt).trim())).toPlainString());
        if (Integer.parseInt(String.valueOf(dalytran_amt).trim()) >= 0) {
            acct_curr_cyc_credit.set(new BigDecimal(String.valueOf(acct_curr_cyc_credit).trim()).add(new BigDecimal(String.valueOf(dalytran_amt).trim())).toPlainString());
            cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).add(new BigDecimal(String.valueOf(dalytran_amt).trim())).toPlainString());
            acct_curr_cyc_debit.set(new BigDecimal(String.valueOf(acct_curr_cyc_debit).trim()).add(new BigDecimal(String.valueOf(dalytran_amt).trim())).toPlainString());
        }
        account_file.rewrite(account_record);
        /* INVALID KEY handling — needs file status check */
        return;
    }

    private void write_transaction_file() {
    }

    private void appl_result_7() {
        transact_file.write(tran_record);
        if (String.valueOf(tranfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR WRITING TO TRANSACTION FILE");
            io_status.set(String.valueOf(tranfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void dalytran_close_2() {
    }

    private void appl_result_8() {
        dalytran_file.close();
        if (String.valueOf(dalytran_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING DALYTRAN FILE");
            io_status.set(String.valueOf(dalytran_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void tranfile_close_2() {
    }

    private void appl_result_9() {
        transact_file.close();
        if (String.valueOf(tranfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING TRANSACTION FILE");
            io_status.set(String.valueOf(tranfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void xreffile_close_2() {
    }

    private void appl_result_10() {
        xref_file.close();
        if (String.valueOf(xreffile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING CROSS REF FILE");
            io_status.set(String.valueOf(xreffile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void dalyrejs_close_2() {
    }

    private void appl_result_11() {
        dalyrejs_file.close();
        if (String.valueOf(dalyrejs_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING DAILY REJECTS FILE");
            io_status.set(String.valueOf(xreffile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void acctfile_close_2() {
    }

    private void appl_result_12() {
        account_file.close();
        if (String.valueOf(acctfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
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

    private void tcatbalf_close_2() {
    }

    private void appl_result_13() {
        tcatbal_file.close();
        if (String.valueOf(tcatbalf_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING TRANSACTION BALANCE FILE");
            io_status.set(String.valueOf(tcatbalf_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void z_get_db2_format_timestamp() {
        cobol_ts.set(String.valueOf(CobolIntrinsics.current_date()));
        db2_yyyy.set(String.valueOf(cob_yyyy));
        db2_mm.set(String.valueOf(cob_mm));
        db2_dd.set(String.valueOf(cob_dd));
        db2_hh.set(String.valueOf(cob_hh));
        db2_min.set(String.valueOf(cob_min));
        db2_ss.set(String.valueOf(cob_ss));
        db2_mil.set(String.valueOf(cob_mil));
        db2_rest.set(String.valueOf("0000"));
        db2_streep_1.set(String.valueOf("-"));
        db2_streep_2.set(String.valueOf("-"));
        db2_streep_3.set(String.valueOf("-"));
        db2_dot_1.set(String.valueOf("."));
        db2_dot_2.set(String.valueOf("."));
        db2_dot_3.set(String.valueOf("."));
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

    private void _0100() { /* stub — external/COPY */ }

    private void _0200() { /* stub — external/COPY */ }

    private void _0300() { /* stub — external/COPY */ }

    private void _0400() { /* stub — external/COPY */ }

    private void _0500() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _1500() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _2500() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _9100() { /* stub — external/COPY */ }

    private void _9200() { /* stub — external/COPY */ }

    private void _9300() { /* stub — external/COPY */ }

    private void _9400() { /* stub — external/COPY */ }

    private void _9500() { /* stub — external/COPY */ }

    private void _9910() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    private void _2700() { /* stub — external/COPY */ }

    private void _2800() { /* stub — external/COPY */ }

    private void _2900() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cbtrn02c().run();
    }
}
