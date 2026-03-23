package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cotrn00c extends CobolProgram {
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
    private CobolString ws_err_flg = new CobolString(1);
    private CobolString ws_transact_eof = new CobolString(1);
    private CobolString ws_send_erase_flg = new CobolString(1);
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private short ws_rec_count = (short) 0;
    private short ws_idx = (short) 0;
    private short ws_page_num = (short) 0;
    private CobolString ws_tran_amt = new CobolString(1);
    private CobolString ws_tran_date = new CobolString(8);

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA
    private CobolString[] lk_commarea = new CobolString[32767];


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString err_flg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString transact_not_eof = new CobolString(256); // fallback
    private CobolString next_page_no = new CobolString(256); // fallback
    private CobolString send_erase_yes = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString trnidinl = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString cotrn0ao = new CobolString(256); // fallback
    private CobolString eibaid = new CobolString(256); // fallback
    private CobolString ccda_msg_invalid_key = new CobolString(256); // fallback
    private CobolString dfhenter = new CobolString(256); // fallback
    private CobolString dfhpf3 = new CobolString(256); // fallback
    private CobolString dfhpf7 = new CobolString(256); // fallback
    private CobolString dfhpf8 = new CobolString(256); // fallback
    private CobolString cdemo_ct00_trn_sel_flg = new CobolString(256); // fallback
    private CobolString cdemo_ct00_trn_selected = new CobolString(256); // fallback
    private CobolString sel0001i = new CobolString(256); // fallback
    private CobolString trnid01i = new CobolString(256); // fallback
    private CobolString sel0002i = new CobolString(256); // fallback
    private CobolString trnid02i = new CobolString(256); // fallback
    private CobolString sel0003i = new CobolString(256); // fallback
    private CobolString trnid03i = new CobolString(256); // fallback
    private CobolString sel0004i = new CobolString(256); // fallback
    private CobolString trnid04i = new CobolString(256); // fallback
    private CobolString sel0005i = new CobolString(256); // fallback
    private CobolString trnid05i = new CobolString(256); // fallback
    private CobolString sel0006i = new CobolString(256); // fallback
    private CobolString trnid06i = new CobolString(256); // fallback
    private CobolString sel0007i = new CobolString(256); // fallback
    private CobolString trnid07i = new CobolString(256); // fallback
    private CobolString sel0008i = new CobolString(256); // fallback
    private CobolString trnid08i = new CobolString(256); // fallback
    private CobolString sel0009i = new CobolString(256); // fallback
    private CobolString trnid09i = new CobolString(256); // fallback
    private CobolString sel0010i = new CobolString(256); // fallback
    private CobolString trnid10i = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString cdemo_pgm_context = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString xctl = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString end_exec = new CobolString(256); // fallback
    private CobolString trnidini = new CobolString(256); // fallback
    private CobolString tran_id = new CobolString(256); // fallback
    private CobolString cdemo_ct00_page_num = new CobolString(256); // fallback
    private CobolString err_flg_on = new CobolString(256); // fallback
    private CobolString trnidino = new CobolString(256); // fallback
    private CobolString cdemo_ct00_trnid_first = new CobolString(256); // fallback
    private CobolString next_page_yes = new CobolString(256); // fallback
    private CobolString send_erase_no = new CobolString(256); // fallback
    private CobolString cdemo_ct00_trnid_last = new CobolString(256); // fallback
    private CobolString transact_eof = new CobolString(256); // fallback
    private CobolString pagenumi = new CobolString(256); // fallback
    private CobolString cb_else = new CobolString(256); // fallback
    private CobolString tran_amt = new CobolString(256); // fallback
    private CobolString tran_orig_ts = new CobolString(256); // fallback
    private CobolString ws_timestamp = new CobolString(256); // fallback
    private CobolString ws_timestamp_dt_yyyy = new CobolString(256); // fallback
    private CobolString ws_curdate_yy = new CobolString(256); // fallback
    private CobolString ws_timestamp_dt_mm = new CobolString(256); // fallback
    private CobolString ws_curdate_mm = new CobolString(256); // fallback
    private CobolString ws_timestamp_dt_dd = new CobolString(256); // fallback
    private CobolString ws_curdate_dd = new CobolString(256); // fallback
    private CobolString ws_curdate_mm_dd_yy = new CobolString(256); // fallback
    private CobolString tdate01i = new CobolString(256); // fallback
    private CobolString tran_desc = new CobolString(256); // fallback
    private CobolString tdesc01i = new CobolString(256); // fallback
    private CobolString tamt001i = new CobolString(256); // fallback
    private CobolString tdate02i = new CobolString(256); // fallback
    private CobolString tdesc02i = new CobolString(256); // fallback
    private CobolString tamt002i = new CobolString(256); // fallback
    private CobolString tdate03i = new CobolString(256); // fallback
    private CobolString tdesc03i = new CobolString(256); // fallback
    private CobolString tamt003i = new CobolString(256); // fallback
    private CobolString tdate04i = new CobolString(256); // fallback
    private CobolString tdesc04i = new CobolString(256); // fallback
    private CobolString tamt004i = new CobolString(256); // fallback
    private CobolString tdate05i = new CobolString(256); // fallback
    private CobolString tdesc05i = new CobolString(256); // fallback
    private CobolString tamt005i = new CobolString(256); // fallback
    private CobolString tdate06i = new CobolString(256); // fallback
    private CobolString tdesc06i = new CobolString(256); // fallback
    private CobolString tamt006i = new CobolString(256); // fallback
    private CobolString tdate07i = new CobolString(256); // fallback
    private CobolString tdesc07i = new CobolString(256); // fallback
    private CobolString tamt007i = new CobolString(256); // fallback
    private CobolString tdate08i = new CobolString(256); // fallback
    private CobolString tdesc08i = new CobolString(256); // fallback
    private CobolString tamt008i = new CobolString(256); // fallback
    private CobolString tdate09i = new CobolString(256); // fallback
    private CobolString tdesc09i = new CobolString(256); // fallback
    private CobolString tamt009i = new CobolString(256); // fallback
    private CobolString tdate10i = new CobolString(256); // fallback
    private CobolString tdesc10i = new CobolString(256); // fallback
    private CobolString tamt010i = new CobolString(256); // fallback
    private CobolString ws_curdate_data = new CobolString(256); // fallback
    private CobolString ccda_title01 = new CobolString(256); // fallback
    private CobolString title01o = new CobolString(256); // fallback
    private CobolString ccda_title02 = new CobolString(256); // fallback
    private CobolString title02o = new CobolString(256); // fallback
    private CobolString trnnameo = new CobolString(256); // fallback
    private CobolString pgmnameo = new CobolString(256); // fallback
    private CobolString ws_curdate_month = new CobolString(256); // fallback
    private CobolString ws_curdate_day = new CobolString(256); // fallback
    private CobolString ws_curdate_year = new CobolString(256); // fallback
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

    private void main_para() {
        err_flg_off.set(String.valueOf(cb_true));
        transact_not_eof.set(String.valueOf(cb_true));
        next_page_no.set(String.valueOf(cb_true));
        send_erase_yes.set(String.valueOf(cb_true));
        ws_message.set(String.valueOf(" "));
        errmsgo.set(String.valueOf(" "));
        trnidinl.set(String.valueOf(-1));
        if (String.valueOf(eibcalen).equals(String.valueOf(0))) {
            cdemo_to_program.set(String.valueOf("COSGN00C"));
            return_to_prev_screen();
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, Integer.parseInt(String.valueOf(eibcalen).trim()))));
            if (!(!String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
                cdemo_pgm_reenter.set(String.valueOf(cb_true));
                cotrn0ao.set(String.valueOf("\u0000"));
                process_enter_key();
                send_trnlst_screen();
            } else {
                receive_trnlst_screen();
                if (String.valueOf(eibaid).equals(String.valueOf(dfhenter))) {
                    process_enter_key();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf3))) {
                    cdemo_to_program.set(String.valueOf("COMEN01C"));
                    return_to_prev_screen();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf7))) {
                    process_pf7_key();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf8))) {
                    process_pf8_key();
                } else {
                    ws_err_flg.set(String.valueOf("Y"));
                    trnidinl.set(String.valueOf(-1));
                    ws_message.set(String.valueOf(ccda_msg_invalid_key));
                    send_trnlst_screen();
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
        if (!String.valueOf(sel0001i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_ct00_trn_sel_flg.set(String.valueOf(sel0001i));
            cdemo_ct00_trn_selected.set(String.valueOf(trnid01i));
        } else if (!String.valueOf(sel0002i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_ct00_trn_sel_flg.set(String.valueOf(sel0002i));
            cdemo_ct00_trn_selected.set(String.valueOf(trnid02i));
        } else if (!String.valueOf(sel0003i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_ct00_trn_sel_flg.set(String.valueOf(sel0003i));
            cdemo_ct00_trn_selected.set(String.valueOf(trnid03i));
        } else if (!String.valueOf(sel0004i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_ct00_trn_sel_flg.set(String.valueOf(sel0004i));
            cdemo_ct00_trn_selected.set(String.valueOf(trnid04i));
        } else if (!String.valueOf(sel0005i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_ct00_trn_sel_flg.set(String.valueOf(sel0005i));
            cdemo_ct00_trn_selected.set(String.valueOf(trnid05i));
        } else if (!String.valueOf(sel0006i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_ct00_trn_sel_flg.set(String.valueOf(sel0006i));
            cdemo_ct00_trn_selected.set(String.valueOf(trnid06i));
        } else if (!String.valueOf(sel0007i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_ct00_trn_sel_flg.set(String.valueOf(sel0007i));
            cdemo_ct00_trn_selected.set(String.valueOf(trnid07i));
        } else if (!String.valueOf(sel0008i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_ct00_trn_sel_flg.set(String.valueOf(sel0008i));
            cdemo_ct00_trn_selected.set(String.valueOf(trnid08i));
        } else if (!String.valueOf(sel0009i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_ct00_trn_sel_flg.set(String.valueOf(sel0009i));
            cdemo_ct00_trn_selected.set(String.valueOf(trnid09i));
        } else if (!String.valueOf(sel0010i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_ct00_trn_sel_flg.set(String.valueOf(sel0010i));
            cdemo_ct00_trn_selected.set(String.valueOf(trnid10i));
        } else {
            cdemo_ct00_trn_sel_flg.set(String.valueOf(" "));
            cdemo_ct00_trn_selected.set(String.valueOf(" "));
        }
        if (((!String.valueOf(cdemo_ct00_trn_sel_flg).equals(String.valueOf(" ")) && true) && (!String.valueOf(cdemo_ct00_trn_selected).equals(String.valueOf(" ")) && true))) {
            if (String.valueOf(cdemo_ct00_trn_sel_flg).equals(String.valueOf("S"))) {
            } else if (String.valueOf(cdemo_ct00_trn_sel_flg).equals(String.valueOf("s"))) {
                cdemo_to_program.set(String.valueOf("COTRN01C"));
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
                end_exec.set(String.valueOf(0));
            } else {
                ws_message.set(String.valueOf("Invalid selection. Valid value is S"));
                trnidinl.set(String.valueOf(-1));
            }
        }
        if ((String.valueOf(trnidini).equals(String.valueOf(" ")) || true)) {
            tran_id.set(String.valueOf("\u0000"));
        } else {
            if (CobolIntrinsics.isNumeric(trnidini)) {
                tran_id.set(String.valueOf(trnidini));
            } else {
                ws_err_flg.set(String.valueOf("Y"));
                ws_message.set(String.valueOf("Tran ID must be Numeric ..."));
                trnidinl.set(String.valueOf(-1));
                send_trnlst_screen();
            }
        }
        trnidinl.set(String.valueOf(-1));
        cdemo_ct00_page_num.set(String.valueOf(0));
        process_page_forward();
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            trnidino.set(String.valueOf(" "));
        }
    }

    private void process_pf7_key() {
        if ((String.valueOf(cdemo_ct00_trnid_first).equals(String.valueOf(" ")) || true)) {
            tran_id.set(String.valueOf("\u0000"));
        } else {
            tran_id.set(String.valueOf(cdemo_ct00_trnid_first));
        }
        next_page_yes.set(String.valueOf(cb_true));
        trnidinl.set(String.valueOf(-1));
        if (Integer.parseInt(String.valueOf(cdemo_ct00_page_num).trim()) > 1) {
            process_page_backward();
        } else {
            ws_message.set(String.valueOf("You are already at the top of the page..."));
            send_erase_no.set(String.valueOf(cb_true));
            send_trnlst_screen();
        }
    }

    private void process_pf8_key() {
        if ((String.valueOf(cdemo_ct00_trnid_last).equals(String.valueOf(" ")) || true)) {
            tran_id.set(String.valueOf("\uFFFF"));
        } else {
            tran_id.set(String.valueOf(cdemo_ct00_trnid_last));
        }
        trnidinl.set(String.valueOf(-1));
        if (!String.valueOf(next_page_yes).trim().isEmpty()) {
            process_page_forward();
        } else {
            ws_message.set(String.valueOf("You are already at the bottom of the page..."));
            send_erase_no.set(String.valueOf(cb_true));
            send_trnlst_screen();
        }
    }

    private void process_page_forward() {
        startbr_transact_file();
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            if (((!String.valueOf(eibaid).equals(String.valueOf(dfhenter)) && !String.valueOf(dfhpf7).trim().isEmpty()) && !String.valueOf(dfhpf3).trim().isEmpty())) {
                readnext_transact_file();
            }
            if ((!String.valueOf(transact_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                for (ws_idx = 1; !(ws_idx > 10); ws_idx += 1) {
                    initialize_tran_data();
                }
            }
            ws_idx = new BigDecimal(String.valueOf(1).trim()).shortValue();
            while (!(((ws_idx >= 11 || !String.valueOf(transact_eof).trim().isEmpty()) || !String.valueOf(err_flg_on).trim().isEmpty()))) {
                readnext_transact_file();
                if ((!String.valueOf(transact_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                    populate_tran_data();
                    ws_idx = new BigDecimal(String.valueOf((ws_idx + 1)).trim()).shortValue();
                }
            }
            if ((!String.valueOf(transact_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                cdemo_ct00_page_num.set(String.valueOf((Integer.parseInt(String.valueOf(cdemo_ct00_page_num).trim()) + 1)));
                readnext_transact_file();
                if ((!String.valueOf(transact_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                    next_page_yes.set(String.valueOf(cb_true));
                } else {
                    next_page_no.set(String.valueOf(cb_true));
                }
            } else {
                next_page_no.set(String.valueOf(cb_true));
                if (ws_idx > 1) {
                    cdemo_ct00_page_num.set(String.valueOf((Integer.parseInt(String.valueOf(cdemo_ct00_page_num).trim()) + 1)));
                }
            }
            endbr_transact_file();
            pagenumi.set(String.valueOf(cdemo_ct00_page_num));
            trnidino.set(String.valueOf(" "));
            send_trnlst_screen();
        }
    }

    private void process_page_backward() {
        startbr_transact_file();
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            if ((!String.valueOf(eibaid).equals(String.valueOf(dfhenter)) && !String.valueOf(dfhpf8).trim().isEmpty())) {
                readprev_transact_file();
            }
            if ((!String.valueOf(transact_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                for (ws_idx = 1; !(ws_idx > 10); ws_idx += 1) {
                    initialize_tran_data();
                }
            }
            ws_idx = new BigDecimal(String.valueOf(10).trim()).shortValue();
            while (!(((ws_idx <= 0 || !String.valueOf(transact_eof).trim().isEmpty()) || !String.valueOf(err_flg_on).trim().isEmpty()))) {
                readprev_transact_file();
                if ((!String.valueOf(transact_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                    populate_tran_data();
                    ws_idx = new BigDecimal(String.valueOf((ws_idx - 1)).trim()).shortValue();
                }
            }
            if ((!String.valueOf(transact_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                readprev_transact_file();
                if (!String.valueOf(next_page_yes).trim().isEmpty()) {
                    if (((!String.valueOf(transact_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty()) && Integer.parseInt(String.valueOf(cdemo_ct00_page_num).trim()) > 1)) {
                        cdemo_ct00_page_num.set(new BigDecimal(String.valueOf(cdemo_ct00_page_num).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                        cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                        cdemo_ct00_page_num.set(String.valueOf(1));
                    }
                }
            }
            endbr_transact_file();
            pagenumi.set(String.valueOf(cdemo_ct00_page_num));
            send_trnlst_screen();
        }
    }

    private void populate_tran_data() {
        ws_tran_amt.set(String.valueOf(tran_amt));
        ws_timestamp.set(String.valueOf(tran_orig_ts));
        ws_curdate_yy.set(String.valueOf(CobolString.refMod(ws_timestamp_dt_yyyy, 3, 2)));
        ws_curdate_mm.set(String.valueOf(ws_timestamp_dt_mm));
        ws_curdate_dd.set(String.valueOf(ws_timestamp_dt_dd));
        ws_tran_date.set(String.valueOf(ws_curdate_mm_dd_yy));
        if (ws_idx == 1) {
            trnid01i.set(String.valueOf(tran_id));
            cdemo_ct00_trnid_first.set(String.valueOf(tran_id));
            tdate01i.set(String.valueOf(ws_tran_date));
            tdesc01i.set(String.valueOf(tran_desc));
            tamt001i.set(String.valueOf(ws_tran_amt));
        } else if (ws_idx == 2) {
            trnid02i.set(String.valueOf(tran_id));
            tdate02i.set(String.valueOf(ws_tran_date));
            tdesc02i.set(String.valueOf(tran_desc));
            tamt002i.set(String.valueOf(ws_tran_amt));
        } else if (ws_idx == 3) {
            trnid03i.set(String.valueOf(tran_id));
            tdate03i.set(String.valueOf(ws_tran_date));
            tdesc03i.set(String.valueOf(tran_desc));
            tamt003i.set(String.valueOf(ws_tran_amt));
        } else if (ws_idx == 4) {
            trnid04i.set(String.valueOf(tran_id));
            tdate04i.set(String.valueOf(ws_tran_date));
            tdesc04i.set(String.valueOf(tran_desc));
            tamt004i.set(String.valueOf(ws_tran_amt));
        } else if (ws_idx == 5) {
            trnid05i.set(String.valueOf(tran_id));
            tdate05i.set(String.valueOf(ws_tran_date));
            tdesc05i.set(String.valueOf(tran_desc));
            tamt005i.set(String.valueOf(ws_tran_amt));
        } else if (ws_idx == 6) {
            trnid06i.set(String.valueOf(tran_id));
            tdate06i.set(String.valueOf(ws_tran_date));
            tdesc06i.set(String.valueOf(tran_desc));
            tamt006i.set(String.valueOf(ws_tran_amt));
        } else if (ws_idx == 7) {
            trnid07i.set(String.valueOf(tran_id));
            tdate07i.set(String.valueOf(ws_tran_date));
            tdesc07i.set(String.valueOf(tran_desc));
            tamt007i.set(String.valueOf(ws_tran_amt));
        } else if (ws_idx == 8) {
            trnid08i.set(String.valueOf(tran_id));
            tdate08i.set(String.valueOf(ws_tran_date));
            tdesc08i.set(String.valueOf(tran_desc));
            tamt008i.set(String.valueOf(ws_tran_amt));
        } else if (ws_idx == 9) {
            trnid09i.set(String.valueOf(tran_id));
            tdate09i.set(String.valueOf(ws_tran_date));
            tdesc09i.set(String.valueOf(tran_desc));
            tamt009i.set(String.valueOf(ws_tran_amt));
        } else if (ws_idx == 10) {
            trnid10i.set(String.valueOf(tran_id));
            cdemo_ct00_trnid_last.set(String.valueOf(tran_id));
            tdate10i.set(String.valueOf(ws_tran_date));
            tdesc10i.set(String.valueOf(tran_desc));
            tamt010i.set(String.valueOf(ws_tran_amt));
        } else {
            /* CONTINUE */
        }
    }

    private void initialize_tran_data() {
        if (ws_idx == 1) {
            trnid01i.set(String.valueOf(" "));
            tdate01i.set(String.valueOf(" "));
            tdesc01i.set(String.valueOf(" "));
            tamt001i.set(String.valueOf(" "));
        } else if (ws_idx == 2) {
            trnid02i.set(String.valueOf(" "));
            tdate02i.set(String.valueOf(" "));
            tdesc02i.set(String.valueOf(" "));
            tamt002i.set(String.valueOf(" "));
        } else if (ws_idx == 3) {
            trnid03i.set(String.valueOf(" "));
            tdate03i.set(String.valueOf(" "));
            tdesc03i.set(String.valueOf(" "));
            tamt003i.set(String.valueOf(" "));
        } else if (ws_idx == 4) {
            trnid04i.set(String.valueOf(" "));
            tdate04i.set(String.valueOf(" "));
            tdesc04i.set(String.valueOf(" "));
            tamt004i.set(String.valueOf(" "));
        } else if (ws_idx == 5) {
            trnid05i.set(String.valueOf(" "));
            tdate05i.set(String.valueOf(" "));
            tdesc05i.set(String.valueOf(" "));
            tamt005i.set(String.valueOf(" "));
        } else if (ws_idx == 6) {
            trnid06i.set(String.valueOf(" "));
            tdate06i.set(String.valueOf(" "));
            tdesc06i.set(String.valueOf(" "));
            tamt006i.set(String.valueOf(" "));
        } else if (ws_idx == 7) {
            trnid07i.set(String.valueOf(" "));
            tdate07i.set(String.valueOf(" "));
            tdesc07i.set(String.valueOf(" "));
            tamt007i.set(String.valueOf(" "));
        } else if (ws_idx == 8) {
            trnid08i.set(String.valueOf(" "));
            tdate08i.set(String.valueOf(" "));
            tdesc08i.set(String.valueOf(" "));
            tamt008i.set(String.valueOf(" "));
        } else if (ws_idx == 9) {
            trnid09i.set(String.valueOf(" "));
            tdate09i.set(String.valueOf(" "));
            tdesc09i.set(String.valueOf(" "));
            tamt009i.set(String.valueOf(" "));
        } else if (ws_idx == 10) {
            trnid10i.set(String.valueOf(" "));
            tdate10i.set(String.valueOf(" "));
            tdesc10i.set(String.valueOf(" "));
            tamt010i.set(String.valueOf(" "));
        } else {
            /* CONTINUE */
        }
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

    private void send_trnlst_screen() {
        populate_header_info();
        errmsgo.set(String.valueOf(ws_message));
        if (!String.valueOf(send_erase_yes).trim().isEmpty()) {
            /* RAW: EXEC CICS SEND MAP ( 'COTRN0A' */
        } else {
            /* RAW: EXEC CICS SEND MAP ( 'COTRN0A' */
        }
    }

    private void receive_trnlst_screen() {
        /* RAW: EXEC CICS RECEIVE MAP ( 'COTRN0A' */
    }

    private void end_exec_3() {
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

    private void startbr_transact_file() {
        /* RAW: EXEC CICS STARTBR DATASET ( WS-TRANSACT-FILE */
    }

    private void end_exec_4() {
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            /* CONTINUE */
            transact_eof.set(String.valueOf(cb_true));
            ws_message.set(String.valueOf("You are at the top of the page..."));
            trnidinl.set(String.valueOf(-1));
            send_trnlst_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup transaction..."));
            trnidinl.set(String.valueOf(-1));
            send_trnlst_screen();
        }
    }

    private void readnext_transact_file() {
        /* RAW: EXEC CICS READNEXT DATASET ( WS-TRANSACT-FILE */
    }

    private void end_exec_5() {
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(endfile).trim()) - 1]))) {
            /* CONTINUE */
            transact_eof.set(String.valueOf(cb_true));
            ws_message.set(String.valueOf("You have reached the bottom of the page..."));
            trnidinl.set(String.valueOf(-1));
            send_trnlst_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup transaction..."));
            trnidinl.set(String.valueOf(-1));
            send_trnlst_screen();
        }
    }

    private void readprev_transact_file() {
        /* RAW: EXEC CICS READPREV DATASET ( WS-TRANSACT-FILE */
    }

    private void end_exec_6() {
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(endfile).trim()) - 1]))) {
            /* CONTINUE */
            transact_eof.set(String.valueOf(cb_true));
            ws_message.set(String.valueOf("You have reached the top of the page..."));
            trnidinl.set(String.valueOf(-1));
            send_trnlst_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup transaction..."));
            trnidinl.set(String.valueOf(-1));
            send_trnlst_screen();
        }
    }

    private void endbr_transact_file() {
        /* RAW: EXEC CICS ENDBR DATASET ( WS-TRANSACT-FILE */
    }

    private void end_exec_7() {
    }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Cotrn00c().run();
    }
}
