package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cbact04c extends CobolProgram {
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
    // LINKAGE SECTION
    private CobolString external_parms = new CobolString(1); // Group: EXTERNAL-PARMS
    private short parm_length = (short) 0;
    private CobolString parm_date = new CobolString(10);

    // FILE SECTION — TCATBAL-FILE
    private CobolString fd_tran_cat_bal_record = new CobolString(1); // Group: FD-TRAN-CAT-BAL-RECORD
    private CobolString fd_tran_cat_key = new CobolString(1); // Group: FD-TRAN-CAT-KEY
    private int fd_trancat_acct_id = 0;
    private CobolString fd_trancat_type_cd = new CobolString(2);
    private int fd_trancat_cd = 0;
    private CobolString fd_fd_tran_cat_data = new CobolString(33);

    // FILE SECTION — XREF-FILE
    private CobolString fd_xreffile_rec = new CobolString(1); // Group: FD-XREFFILE-REC
    private CobolString fd_xref_card_num = new CobolString(16);
    private int fd_xref_cust_num = 0;
    private int fd_xref_acct_id = 0;
    private CobolString fd_xref_filler = new CobolString(14);

    // FILE SECTION — DISCGRP-FILE
    private CobolString fd_discgrp_rec = new CobolString(1); // Group: FD-DISCGRP-REC
    private CobolString fd_discgrp_key = new CobolString(1); // Group: FD-DISCGRP-KEY
    private CobolString fd_dis_acct_group_id = new CobolString(10);
    private CobolString fd_dis_tran_type_cd = new CobolString(2);
    private int fd_dis_tran_cat_cd = 0;
    private CobolString fd_discgrp_data = new CobolString(34);

    // FILE SECTION — ACCOUNT-FILE
    private CobolString fd_acctfile_rec = new CobolString(1); // Group: FD-ACCTFILE-REC
    private int fd_acct_id = 0;
    private CobolString fd_acct_data = new CobolString(334);

    // FILE SECTION — TRANSACT-FILE
    private CobolString fd_tranfile_rec = new CobolString(1); // Group: FD-TRANFILE-REC
    private CobolString fd_trans_id = new CobolString(16);


    // FILE DESCRIPTORS
    private CobolFile tcatbal_file = new CobolFile("TCATBALF", "INDEXED", "SEQUENTIAL");
    // File status: TCATBALF-STATUS
    private CobolFile xref_file = new CobolFile("XREFFILE", "INDEXED", "RANDOM");
    // File status: XREFFILE-STATUS
    private CobolFile account_file = new CobolFile("ACCTFILE", "INDEXED", "RANDOM");
    // File status: ACCTFILE-STATUS
    private CobolFile discgrp_file = new CobolFile("DISCGRP", "INDEXED", "RANDOM");
    // File status: DISCGRP-STATUS
    private CobolFile transact_file = new CobolFile("TRANSACT", "SEQUENTIAL", "SEQUENTIAL");
    // File status: TRANFILE-STATUS

    private CobolString end_of_file = new CobolString(256); // fallback
    private CobolString ws_record_count = new CobolString(256); // fallback
    private CobolString tran_cat_bal_record = new CobolString(256); // fallback
    private CobolString trancat_acct_id = new CobolString(256); // fallback
    private CobolString ws_last_acct_num = new CobolString(256); // fallback
    private CobolString ws_first_time = new CobolString(256); // fallback
    private CobolString ws_total_int = new CobolString(256); // fallback
    private CobolString acct_group_id = new CobolString(256); // fallback
    private CobolString trancat_cd = new CobolString(256); // fallback
    private CobolString trancat_type_cd = new CobolString(256); // fallback
    private CobolString dis_int_rate = new CobolString(256); // fallback
    private CobolString tcatbalf_status = new CobolString(256); // fallback
    private CobolString appl_result = new CobolString(256); // fallback
    private CobolString appl_aok = new CobolString(256); // fallback
    private CobolString io_status = new CobolString(256); // fallback
    private CobolString xreffile_status = new CobolString(256); // fallback
    private CobolString discgrp_status = new CobolString(256); // fallback
    private CobolString acctfile_status = new CobolString(256); // fallback
    private CobolString tranfile_status = new CobolString(256); // fallback
    private CobolString appl_eof = new CobolString(256); // fallback
    private CobolString acct_curr_bal = new CobolString(256); // fallback
    private CobolString acct_curr_cyc_credit = new CobolString(256); // fallback
    private CobolString acct_curr_cyc_debit = new CobolString(256); // fallback
    private CobolString account_record = new CobolString(256); // fallback
    private CobolString card_xref_record = new CobolString(256); // fallback
    private CobolString dis_group_record = new CobolString(256); // fallback
    private CobolString ws_monthly_int = new CobolString(256); // fallback
    private CobolString tran_cat_bal = new CobolString(256); // fallback
    private CobolString ws_tranid_suffix = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString tran_id = new CobolString(256); // fallback
    private CobolString tran_type_cd = new CobolString(256); // fallback
    private CobolString tran_cat_cd = new CobolString(256); // fallback
    private CobolString tran_source = new CobolString(256); // fallback
    private CobolString acct_id = new CobolString(256); // fallback
    private CobolString tran_desc = new CobolString(256); // fallback
    private CobolString tran_amt = new CobolString(256); // fallback
    private CobolString tran_merchant_id = new CobolString(256); // fallback
    private CobolString tran_merchant_name = new CobolString(256); // fallback
    private CobolString tran_merchant_city = new CobolString(256); // fallback
    private CobolString tran_merchant_zip = new CobolString(256); // fallback
    private CobolString xref_card_num = new CobolString(256); // fallback
    private CobolString tran_card_num = new CobolString(256); // fallback
    private CobolString db2_format_ts = new CobolString(256); // fallback
    private CobolString tran_orig_ts = new CobolString(256); // fallback
    private CobolString tran_proc_ts = new CobolString(256); // fallback
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
    private CobolString io_stat1 = new CobolString(256); // fallback
    private CobolString io_status_04 = new CobolString(256); // fallback
    private CobolString two_bytes_binary = new CobolString(256); // fallback
    private CobolString io_stat2 = new CobolString(256); // fallback
    private CobolString two_bytes_right = new CobolString(256); // fallback
    private CobolString io_status_0403 = new CobolString(256); // fallback

    private void para_main() {
        CobolDisplay.display("START OF EXECUTION OF PROGRAM CBACT04C");
        _0000();
        /* RAW: -  */
    }

    private void tcatbalf_open() {
        _0100();
        /* RAW: -  */
    }

    private void xreffile_open() {
        _0200();
        /* RAW: -  */
    }

    private void discgrp_open() {
        _0300();
        /* RAW: -  */
    }

    private void acctfile_open() {
        _0400();
        /* RAW: -  */
    }

    private void tranfile_open() {
        while (!(String.valueOf(end_of_file).equals(String.valueOf("Y")))) {
            if (String.valueOf(end_of_file).equals(String.valueOf("N"))) {
                _1000();
                /* RAW: - TCATBALF-GET-NEXT */
                if (String.valueOf(end_of_file).equals(String.valueOf("N"))) {
                    ws_record_count.set(new BigDecimal(String.valueOf(ws_record_count).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                    CobolDisplay.display(String.valueOf(tran_cat_bal_record));
                    if (!String.valueOf(trancat_acct_id).equals(String.valueOf(ws_last_acct_num))) {
                        if (!String.valueOf(ws_first_time).equals(String.valueOf("Y"))) {
                            _1050();
                            /* RAW: - UPDATE-ACCOUNT */
                        } else {
                            ws_first_time.set(String.valueOf("N"));
                        }
                        ws_total_int.set(String.valueOf(0));
                        ws_last_acct_num.set(String.valueOf(trancat_acct_id));
                        fd_acct_id = new BigDecimal(String.valueOf(trancat_acct_id).trim()).intValue();
                        _1100();
                        /* RAW: - GET-ACCT-DATA */
                        fd_xref_acct_id = new BigDecimal(String.valueOf(trancat_acct_id).trim()).intValue();
                        _1110();
                        /* RAW: - GET-XREF-DATA */
                    }
                    fd_dis_acct_group_id.set(String.valueOf(acct_group_id));
                    fd_dis_tran_cat_cd = new BigDecimal(String.valueOf(trancat_cd).trim()).intValue();
                    fd_dis_tran_type_cd.set(String.valueOf(trancat_type_cd));
                    _1200();
                    /* RAW: - GET-INTEREST-RATE */
                    if (!String.valueOf(dis_int_rate).equals(String.valueOf(0))) {
                        _1300();
                        /* RAW: - COMPUTE-INTEREST */
                        _1400();
                        /* RAW: - COMPUTE-FEES */
                    }
                }
            } else {
                _1050();
                /* RAW: - UPDATE-ACCOUNT */
            }
        }
        _9000();
        /* RAW: -  */
    }

    private void tcatbalf_close() {
        _9100();
        /* RAW: -  */
    }

    private void xreffile_close() {
        _9200();
        /* RAW: -  */
    }

    private void discgrp_close() {
        _9300();
        /* RAW: -  */
    }

    private void acctfile_close() {
        _9400();
        /* RAW: -  */
    }

    private void tranfile_close() {
        CobolDisplay.display("END OF EXECUTION OF PROGRAM CBACT04C");
        return;
    }

    private void tcatbalf_open_2() {
    }

    private void appl_result() {
        tcatbal_file.open("INPUT");
        if (String.valueOf(tcatbalf_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING TRANSACTION CATEGORY BALANCE");
            io_status.set(String.valueOf(tcatbalf_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void xreffile_open_2() {
    }

    private void appl_result_2() {
        xref_file.open("INPUT");
        if (String.valueOf(xreffile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING CROSS REF FILE" + String.valueOf(xreffile_status));
            io_status.set(String.valueOf(xreffile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void discgrp_open_2() {
    }

    private void appl_result_3() {
        discgrp_file.open("INPUT");
        if (String.valueOf(discgrp_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING DALY REJECTS FILE");
            io_status.set(String.valueOf(discgrp_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void acctfile_open_2() {
    }

    private void appl_result_4() {
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

    private void tranfile_open_2() {
    }

    private void appl_result_5() {
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

    private void tcatbalf_get_next() {
        if (tcatbal_file.read(tran_cat_bal_record) == FileStatus.AT_END) {
        }
        if (String.valueOf(tcatbalf_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            if (String.valueOf(tcatbalf_status).equals(String.valueOf("10"))) {
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
                CobolDisplay.display("ERROR READING TRANSACTION CATEGORY FILE");
                io_status.set(String.valueOf(tcatbalf_status));
                _9910();
                /* RAW: - DISPLAY-IO-STATUS */
                _9999();
                /* RAW: - ABEND-PROGRAM */
            }
        }
        return;
    }

    private void update_account() {
        acct_curr_bal.set(new BigDecimal(String.valueOf(acct_curr_bal).trim()).add(new BigDecimal(String.valueOf(ws_total_int).trim())).toPlainString());
        acct_curr_cyc_credit.set(String.valueOf(0));
        acct_curr_cyc_debit.set(String.valueOf(0));
        account_file.rewrite(account_record);
        if (String.valueOf(acctfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR RE-WRITING ACCOUNT FILE");
            io_status.set(String.valueOf(acctfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void get_acct_data() {
        if (account_file.read(account_record) == FileStatus.AT_END) {
        }
        if (String.valueOf(acctfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR READING ACCOUNT FILE");
            io_status.set(String.valueOf(acctfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void get_xref_data() {
        if (xref_file.read(card_xref_record) == FileStatus.AT_END) {
        }
        if (String.valueOf(xreffile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR READING XREF FILE");
            io_status.set(String.valueOf(xreffile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void get_interest_rate() {
        if (discgrp_file.read(dis_group_record) == FileStatus.AT_END) {
        }
        if ((String.valueOf(discgrp_status).equals(String.valueOf("00")) || true)) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR READING DISCLOSURE GROUP FILE");
            io_status.set(String.valueOf(discgrp_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        if (String.valueOf(discgrp_status).equals(String.valueOf("23"))) {
            fd_dis_acct_group_id.set(String.valueOf("DEFAULT"));
            _1200();
            /* RAW: - A-GET-DEFAULT-INT-RATE */
        }
        return;
    }

    private void a_get_default_int_rate() {
        if (discgrp_file.read(dis_group_record) == FileStatus.AT_END) {
        }
        if (String.valueOf(discgrp_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR READING DEFAULT DISCLOSURE GROUP");
            io_status.set(String.valueOf(discgrp_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void compute_interest() {
        ws_monthly_int.set(String.valueOf((((Integer.parseInt(String.valueOf(tran_cat_bal).trim()) * Integer.parseInt(String.valueOf(dis_int_rate).trim()))) / 1200)));
        ws_total_int.set(new BigDecimal(String.valueOf(ws_total_int).trim()).add(new BigDecimal(String.valueOf(ws_monthly_int).trim())).toPlainString());
        _1300();
        /* RAW: -  */
    }

    private void b_write_tx() {
        return;
    }

    private void b_write_tx_2() {
        ws_tranid_suffix.set(new BigDecimal(String.valueOf(ws_tranid_suffix).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(parm_date));
            _sb.append(String.valueOf(_unnamed));
            _sb.append(String.valueOf(ws_tranid_suffix));
            tran_id.set(_sb.toString());
        }
        tran_type_cd.set(String.valueOf("01"));
        tran_cat_cd.set(String.valueOf("05"));
        tran_source.set(String.valueOf("System"));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("Int. for a/c ");
            _sb.append(String.valueOf(_unnamed));
            _sb.append(String.valueOf(acct_id));
            tran_desc.set(_sb.toString());
        }
        tran_amt.set(String.valueOf(ws_monthly_int));
        tran_merchant_id.set(String.valueOf(0));
        tran_merchant_name.set(String.valueOf(" "));
        tran_merchant_city.set(String.valueOf(" "));
        tran_merchant_zip.set(String.valueOf(" "));
        tran_card_num.set(String.valueOf(xref_card_num));
        z_get_db2_format_timestamp();
        tran_orig_ts.set(String.valueOf(db2_format_ts));
        tran_proc_ts.set(String.valueOf(db2_format_ts));
        transact_file.write(tran_record);
        if (String.valueOf(tranfile_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR WRITING TRANSACTION RECORD");
            io_status.set(String.valueOf(tranfile_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void compute_fees() {
        return;
    }

    private void tcatbalf_close_2() {
    }

    private void appl_result_6() {
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

    private void xreffile_close_2() {
    }

    private void appl_result_7() {
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

    private void discgrp_close_2() {
    }

    private void appl_result_8() {
        discgrp_file.close();
        if (String.valueOf(discgrp_status).equals(String.valueOf("00"))) {
            appl_result.set(String.valueOf(0));
        } else {
            appl_result.set(String.valueOf(12));
        }
        if (!String.valueOf(appl_aok).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING DISCLOSURE GROUP FILE");
            io_status.set(String.valueOf(discgrp_status));
            _9910();
            /* RAW: - DISPLAY-IO-STATUS */
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void acctfile_close_2() {
    }

    private void appl_result_9() {
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

    private void tranfile_close_2() {
    }

    private void appl_result_10() {
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

    private void _1000() { /* stub — external/COPY */ }

    private void _1050() { /* stub — external/COPY */ }

    private void _1100() { /* stub — external/COPY */ }

    private void _1110() { /* stub — external/COPY */ }

    private void _1200() { /* stub — external/COPY */ }

    private void _1300() { /* stub — external/COPY */ }

    private void _1400() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _9100() { /* stub — external/COPY */ }

    private void _9200() { /* stub — external/COPY */ }

    private void _9300() { /* stub — external/COPY */ }

    private void _9400() { /* stub — external/COPY */ }

    private void _9910() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cbact04c().run();
    }
}
