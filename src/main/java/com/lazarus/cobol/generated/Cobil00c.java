package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cobil00c extends CobolProgram {
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
    private CobolString ws_variables = new CobolString(1); // Group: WS-VARIABLES
    private CobolString ws_pgmname = new CobolString(8);
    private CobolString ws_tranid = new CobolString(4);
    private CobolString ws_message = new CobolString(80);
    private CobolString ws_transact_file = new CobolString(8);
    private CobolString ws_acctdat_file = new CobolString(8);
    private CobolString ws_cxacaix_file = new CobolString(8);
    private CobolString ws_err_flg = new CobolString(1);
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private CobolString ws_usr_modified = new CobolString(1);
    private CobolString ws_conf_pay_flg = new CobolString(1);
    private CobolString ws_tran_amt = new CobolString(1);
    private CobolString ws_curr_bal = new CobolString(1);
    private int ws_tran_id_num = 0;
    private CobolString ws_tran_date = new CobolString(8);
    private BigDecimal ws_abs_time = BigDecimal.ZERO;
    private CobolString ws_cur_date_x10 = new CobolString(10);
    private CobolString ws_cur_time_x08 = new CobolString(8);

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA
    private CobolString[] lk_commarea = new CobolString[32767];


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile dataset = new CobolFile("DATASET", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString err_flg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString usr_modified_no = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString cobil0ao = new CobolString(256); // fallback
    private CobolString actidinl = new CobolString(256); // fallback
    private CobolString cdemo_cb00_trn_selected = new CobolString(256); // fallback
    private CobolString actidini = new CobolString(256); // fallback
    private CobolString eibaid = new CobolString(256); // fallback
    private CobolString ccda_msg_invalid_key = new CobolString(256); // fallback
    private CobolString dfhenter = new CobolString(256); // fallback
    private CobolString dfhpf3 = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString dfhpf4 = new CobolString(256); // fallback
    private CobolString conf_pay_no = new CobolString(256); // fallback
    private CobolString err_flg_on = new CobolString(256); // fallback
    private CobolString acct_id = new CobolString(256); // fallback
    private CobolString xref_acct_id = new CobolString(256); // fallback
    private CobolString confirmi = new CobolString(256); // fallback
    private CobolString confirml = new CobolString(256); // fallback
    private CobolString conf_pay_yes = new CobolString(256); // fallback
    private CobolString acct_curr_bal = new CobolString(256); // fallback
    private CobolString curbali = new CobolString(256); // fallback
    private CobolString tran_id = new CobolString(256); // fallback
    private CobolString tran_record = new CobolString(256); // fallback
    private CobolString tran_type_cd = new CobolString(256); // fallback
    private CobolString tran_cat_cd = new CobolString(256); // fallback
    private CobolString tran_source = new CobolString(256); // fallback
    private CobolString tran_desc = new CobolString(256); // fallback
    private CobolString tran_amt = new CobolString(256); // fallback
    private CobolString xref_card_num = new CobolString(256); // fallback
    private CobolString tran_card_num = new CobolString(256); // fallback
    private CobolString tran_merchant_id = new CobolString(256); // fallback
    private CobolString tran_merchant_name = new CobolString(256); // fallback
    private CobolString tran_merchant_city = new CobolString(256); // fallback
    private CobolString tran_merchant_zip = new CobolString(256); // fallback
    private CobolString ws_timestamp = new CobolString(256); // fallback
    private CobolString tran_orig_ts = new CobolString(256); // fallback
    private CobolString tran_proc_ts = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_pgm_context = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString xctl = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString send = new CobolString(256); // fallback
    private CobolString[] map = new CobolString[100]; // fallback array
    private CobolString[] mapset = new CobolString[100]; // fallback array
    private CobolString[] from = new CobolString[100]; // fallback array
    private CobolString erase = new CobolString(256); // fallback
    private CobolString cursor = new CobolString(256); // fallback
    private CobolString ws_curdate_data = new CobolString(256); // fallback
    private CobolString ccda_title01 = new CobolString(256); // fallback
    private CobolString title01o = new CobolString(256); // fallback
    private CobolString ccda_title02 = new CobolString(256); // fallback
    private CobolString title02o = new CobolString(256); // fallback
    private CobolString trnnameo = new CobolString(256); // fallback
    private CobolString pgmnameo = new CobolString(256); // fallback
    private CobolString ws_curdate_month = new CobolString(256); // fallback
    private CobolString ws_curdate_mm = new CobolString(256); // fallback
    private CobolString ws_curdate_day = new CobolString(256); // fallback
    private CobolString ws_curdate_dd = new CobolString(256); // fallback
    private CobolString ws_curdate_year = new CobolString(256); // fallback
    private CobolString ws_curdate_yy = new CobolString(256); // fallback
    private CobolString ws_curdate_mm_dd_yy = new CobolString(256); // fallback
    private CobolString curdateo = new CobolString(256); // fallback
    private CobolString ws_curtime_hours = new CobolString(256); // fallback
    private CobolString ws_curtime_hh = new CobolString(256); // fallback
    private CobolString ws_curtime_minute = new CobolString(256); // fallback
    private CobolString ws_curtime_mm = new CobolString(256); // fallback
    private CobolString ws_curtime_second = new CobolString(256); // fallback
    private CobolString ws_curtime_ss = new CobolString(256); // fallback
    private CobolString ws_curtime_hh_mm_ss = new CobolString(256); // fallback
    private CobolString curtimeo = new CobolString(256); // fallback
    private CobolString[] dfhresp = new CobolString[100]; // fallback array
    private CobolString normal = new CobolString(256); // fallback
    private CobolString notfnd = new CobolString(256); // fallback
    private CobolString endfile = new CobolString(256); // fallback
    private CobolString dfhgreen = new CobolString(256); // fallback
    private CobolString errmsgc = new CobolString(256); // fallback
    private CobolString dupkey = new CobolString(256); // fallback
    private CobolString duprec = new CobolString(256); // fallback

    private void main_para() {
        err_flg_off.set(String.valueOf(cb_true));
        usr_modified_no.set(String.valueOf(cb_true));
        ws_message.set(String.valueOf(" "));
        errmsgo.set(String.valueOf(" "));
        if (String.valueOf(eibcalen).equals(String.valueOf(0))) {
            cdemo_to_program.set(String.valueOf("COSGN00C"));
            return_to_prev_screen();
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, Integer.parseInt(String.valueOf(eibcalen).trim()))));
            if (!(!String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
                cdemo_pgm_reenter.set(String.valueOf(cb_true));
                cobil0ao.set(String.valueOf("\u0000"));
                actidinl.set(String.valueOf(-1));
                if ((!String.valueOf(cdemo_cb00_trn_selected).equals(String.valueOf(" ")) && true)) {
                    actidini.set(String.valueOf(cdemo_cb00_trn_selected));
                    process_enter_key();
                }
                send_billpay_screen();
            } else {
                receive_billpay_screen();
                if (String.valueOf(eibaid).equals(String.valueOf(dfhenter))) {
                    process_enter_key();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf3))) {
                    if ((String.valueOf(cdemo_from_program).equals(String.valueOf(" ")) || true)) {
                        cdemo_to_program.set(String.valueOf("COMEN01C"));
                    } else {
                        cdemo_to_program.set(String.valueOf(cdemo_from_program));
                    }
                    return_to_prev_screen();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf4))) {
                    clear_current_screen();
                } else {
                    ws_err_flg.set(String.valueOf("Y"));
                    ws_message.set(String.valueOf(ccda_msg_invalid_key));
                    send_billpay_screen();
                }
            }
        }
        /* RAW: EXEC CICS */
        /* RETURN TRANSID */
        /* RAW: ( WS-TRANID ) COMMAREA ( CARDDEMO-COMMAREA */
    }

    private void end_exec() {
    }

    private void process_enter_key() {
        conf_pay_no.set(String.valueOf(cb_true));
        if (!String.valueOf(actidini).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Acct ID can NOT be empty..."));
            actidinl.set(String.valueOf(-1));
            send_billpay_screen();
        } else {
            /* CONTINUE */
        }
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            acct_id.set(String.valueOf(actidini));
            xref_acct_id.set(String.valueOf(actidini));
            if (String.valueOf(confirmi).equals(String.valueOf("Y"))) {
            } else if (String.valueOf(confirmi).equals(String.valueOf("y"))) {
                conf_pay_yes.set(String.valueOf(cb_true));
                read_acctdat_file();
            } else if (String.valueOf(confirmi).equals(String.valueOf("N"))) {
            } else if (String.valueOf(confirmi).equals(String.valueOf("n"))) {
                clear_current_screen();
                ws_err_flg.set(String.valueOf("Y"));
            } else if (String.valueOf(confirmi).equals(String.valueOf(" "))) {
            } else if (String.valueOf(confirmi).equals(String.valueOf("\u0000"))) {
                read_acctdat_file();
            } else {
                ws_err_flg.set(String.valueOf("Y"));
                ws_message.set(String.valueOf("Invalid value. Valid values are (Y/N)..."));
                confirml.set(String.valueOf(-1));
                send_billpay_screen();
            }
            ws_curr_bal.set(String.valueOf(acct_curr_bal));
            curbali.set(String.valueOf(ws_curr_bal));
        }
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            if (((String.valueOf(acct_curr_bal).compareTo(String.valueOf(0)) <= 0 && !String.valueOf(actidini).equals(String.valueOf(" "))) && true)) {
                ws_err_flg.set(String.valueOf("Y"));
                ws_message.set(String.valueOf("You have nothing to pay..."));
                actidinl.set(String.valueOf(-1));
                send_billpay_screen();
            }
        }
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            if (!String.valueOf(conf_pay_yes).trim().isEmpty()) {
                read_cxacaix_file();
                tran_id.set(String.valueOf("\uFFFF"));
                startbr_transact_file();
                readprev_transact_file();
                endbr_transact_file();
                ws_tran_id_num = new BigDecimal(String.valueOf(tran_id).trim()).intValue();
                ws_tran_id_num = new BigDecimal(String.valueOf(ws_tran_id_num + 1).trim()).intValue();
                tran_record.set("");
                tran_id.set(String.valueOf(ws_tran_id_num));
                tran_type_cd.set(String.valueOf("02"));
                tran_cat_cd.set(String.valueOf(2));
                tran_source.set(String.valueOf("POS TERM"));
                tran_desc.set(String.valueOf("BILL PAYMENT - ONLINE"));
                tran_amt.set(String.valueOf(acct_curr_bal));
                tran_card_num.set(String.valueOf(xref_card_num));
                tran_merchant_id.set(String.valueOf(999999999));
                tran_merchant_name.set(String.valueOf("BILL PAYMENT"));
                tran_merchant_city.set(String.valueOf("N/A"));
                tran_merchant_zip.set(String.valueOf("N/A"));
                get_current_timestamp();
                tran_orig_ts.set(String.valueOf(ws_timestamp));
                tran_proc_ts.set(String.valueOf(ws_timestamp));
                write_transact_file();
                acct_curr_bal.set(String.valueOf((Integer.parseInt(String.valueOf(acct_curr_bal).trim()) - Integer.parseInt(String.valueOf(tran_amt).trim()))));
                update_acctdat_file();
            } else {
                ws_message.set(String.valueOf("Confirm to make a bill payment..."));
                confirml.set(String.valueOf(-1));
            }
            send_billpay_screen();
        }
    }

    private void get_current_timestamp() {
        /* RAW: EXEC CICS ASKTIME ABSTIME ( WS-ABS-TIME */
        ws_timestamp.set("");
        ws_timestamp.setRefMod(1, 10, String.valueOf(ws_cur_date_x10));
        ws_timestamp.setRefMod(12, 8, String.valueOf(ws_cur_time_x08));
    }

    private void ws_timestamp_tm_ms6() {
    }

    private void return_to_prev_screen() {
        if ((String.valueOf(cdemo_to_program).equals(String.valueOf("\u0000")) || true)) {
            cdemo_to_program.set(String.valueOf("COSGN00C"));
        }
        cdemo_from_tranid.set(String.valueOf(ws_tranid));
        cdemo_from_program.set(String.valueOf(ws_pgmname));
        cdemo_pgm_context.set(String.valueOf(0));
        exec.set(String.valueOf(0));
        cics.set(String.valueOf(0));
        xctl.set(String.valueOf(0));
        if (program[Integer.parseInt(String.valueOf(cdemo_to_program).trim()) - 1] == null) program[Integer.parseInt(String.valueOf(cdemo_to_program).trim()) - 1] = new CobolString(256);
        program[Integer.parseInt(String.valueOf(cdemo_to_program).trim()) - 1].set(String.valueOf(0));
        if (commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] == null) commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] = new CobolString(256);
        commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1].set(String.valueOf(0));
    }

    private void end_exec_2() {
    }

    private void send_billpay_screen() {
        populate_header_info();
        errmsgo.set(String.valueOf(ws_message));
        exec.set(String.valueOf(ws_message));
        cics.set(String.valueOf(ws_message));
        send.set(String.valueOf(ws_message));
        if (map[0 /* non-numeric literal: COBIL0A */ - 1] == null) map[0 /* non-numeric literal: COBIL0A */ - 1] = new CobolString(256);
        map[0 /* non-numeric literal: COBIL0A */ - 1].set(String.valueOf(ws_message));
        if (mapset[0 /* non-numeric literal: COBIL00 */ - 1] == null) mapset[0 /* non-numeric literal: COBIL00 */ - 1] = new CobolString(256);
        mapset[0 /* non-numeric literal: COBIL00 */ - 1].set(String.valueOf(ws_message));
        if (from[Integer.parseInt(String.valueOf(cobil0ao).trim()) - 1] == null) from[Integer.parseInt(String.valueOf(cobil0ao).trim()) - 1] = new CobolString(256);
        from[Integer.parseInt(String.valueOf(cobil0ao).trim()) - 1].set(String.valueOf(ws_message));
        erase.set(String.valueOf(ws_message));
        cursor.set(String.valueOf(ws_message));
    }

    private void end_exec_3() {
    }

    private void receive_billpay_screen() {
        /* RAW: EXEC CICS RECEIVE MAP ( 'COBIL0A' */
    }

    private void end_exec_4() {
    }

    private void populate_header_info() {
        ws_curdate_data.set(String.valueOf(CobolIntrinsics.current_date()));
        title01o.set(String.valueOf(ccda_title01));
        title02o.set(String.valueOf(ccda_title02));
        trnnameo.set(String.valueOf(ws_tranid));
        pgmnameo.set(String.valueOf(ws_pgmname));
        ws_curdate_mm.set(String.valueOf(ws_curdate_month));
        ws_curdate_dd.set(String.valueOf(ws_curdate_day));
        ws_curdate_yy.set(String.valueOf(CobolString.refMod(ws_curdate_year, 3, 2)));
        curdateo.set(String.valueOf(ws_curdate_mm_dd_yy));
        ws_curtime_hh.set(String.valueOf(ws_curtime_hours));
        ws_curtime_mm.set(String.valueOf(ws_curtime_minute));
        ws_curtime_ss.set(String.valueOf(ws_curtime_second));
        curtimeo.set(String.valueOf(ws_curtime_hh_mm_ss));
    }

    private void read_acctdat_file() {
        /* RAW: EXEC CICS */
        if (dataset.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( WS-ACCTDAT-FILE ) INTO ( ACCOUNT-RECORD */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Account ID NOT found..."));
            actidinl.set(String.valueOf(-1));
            send_billpay_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup Account..."));
            actidinl.set(String.valueOf(-1));
            send_billpay_screen();
        }
    }

    private void update_acctdat_file() {
        /* RAW: EXEC CICS */
    // dataset.rewrite((account_record));
        /* RAW: LENGTH ( LENGTH OF ACCOUNT-RECORD ) */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Account ID NOT found..."));
            actidinl.set(String.valueOf(-1));
            send_billpay_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to Update Account..."));
            actidinl.set(String.valueOf(-1));
            send_billpay_screen();
        }
    }

    private void read_cxacaix_file() {
        /* RAW: EXEC CICS */
        if (dataset.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( WS-CXACAIX-FILE ) INTO ( CARD-XREF-RECORD */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Account ID NOT found..."));
            actidinl.set(String.valueOf(-1));
            send_billpay_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup XREF AIX file..."));
            actidinl.set(String.valueOf(-1));
            send_billpay_screen();
        }
    }

    private void startbr_transact_file() {
        /* RAW: EXEC CICS STARTBR DATASET ( WS-TRANSACT-FILE */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Transaction ID NOT found..."));
            actidinl.set(String.valueOf(-1));
            send_billpay_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup Transaction..."));
            actidinl.set(String.valueOf(-1));
            send_billpay_screen();
        }
    }

    private void readprev_transact_file() {
        /* RAW: EXEC CICS READPREV DATASET ( WS-TRANSACT-FILE */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(endfile).trim()) - 1]))) {
            tran_id.set(String.valueOf(0));
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup Transaction..."));
            actidinl.set(String.valueOf(-1));
            send_billpay_screen();
        }
    }

    private void endbr_transact_file() {
        /* RAW: EXEC CICS ENDBR DATASET ( WS-TRANSACT-FILE */
    }

    private void end_exec_5() {
    }

    private void write_transact_file() {
        /* RAW: EXEC CICS */
        dataset.write((tran_record));
        /* RAW: LENGTH ( LENGTH OF TRAN-RECORD ) */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            initialize_all_fields();
            ws_message.set(String.valueOf(" "));
            errmsgc.set(String.valueOf(dfhgreen));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Payment successful. ");
                _sb.append(" Your Transaction ID is ");
                _sb.append(CobolString.delimitedBy(String.valueOf(tran_id), " "));
                _sb.append(".");
                ws_message.set(_sb.toString());
            }
            send_billpay_screen();
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(dupkey).trim()) - 1]))) {
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(duprec).trim()) - 1]))) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Tran ID already exist..."));
            actidinl.set(String.valueOf(-1));
            send_billpay_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to Add Bill pay Transaction..."));
            actidinl.set(String.valueOf(-1));
            send_billpay_screen();
        }
    }

    private void clear_current_screen() {
        initialize_all_fields();
        send_billpay_screen();
    }

    private void initialize_all_fields() {
        actidinl.set(String.valueOf(-1));
        actidini.set(String.valueOf(" "));
        curbali.set(String.valueOf(" "));
        confirmi.set(String.valueOf(" "));
    }

    private void ws_message() {
    }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Cobil00c().run();
    }
}
