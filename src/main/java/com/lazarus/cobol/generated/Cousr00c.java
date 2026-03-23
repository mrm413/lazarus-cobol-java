package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cousr00c extends CobolProgram {
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
    private CobolString ws_usrsec_file = new CobolString(8);
    private CobolString ws_err_flg = new CobolString(1);
    private CobolString ws_user_sec_eof = new CobolString(1);
    private CobolString ws_send_erase_flg = new CobolString(1);
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private short ws_rec_count = (short) 0;
    private short ws_idx = (short) 0;
    private short ws_page_num = (short) 0;
    private CobolString ws_user_data = new CobolString(1); // Group: WS-USER-DATA
    private CobolString[] user_rec = new CobolString[10]; // Group: USER-REC
    private CobolString[] user_sel = new CobolString[10];
    private CobolString[] user_id = new CobolString[10];
    private CobolString[] user_name = new CobolString[10];
    private CobolString[] user_type = new CobolString[10];

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA
    private CobolString[] lk_commarea = new CobolString[32767];


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString err_flg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString user_sec_not_eof = new CobolString(256); // fallback
    private CobolString next_page_no = new CobolString(256); // fallback
    private CobolString send_erase_yes = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString usridinl = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString cousr0ao = new CobolString(256); // fallback
    private CobolString eibaid = new CobolString(256); // fallback
    private CobolString ccda_msg_invalid_key = new CobolString(256); // fallback
    private CobolString dfhenter = new CobolString(256); // fallback
    private CobolString dfhpf3 = new CobolString(256); // fallback
    private CobolString dfhpf7 = new CobolString(256); // fallback
    private CobolString dfhpf8 = new CobolString(256); // fallback
    private CobolString cdemo_cu00_usr_sel_flg = new CobolString(256); // fallback
    private CobolString cdemo_cu00_usr_selected = new CobolString(256); // fallback
    private CobolString sel0001i = new CobolString(256); // fallback
    private CobolString usrid01i = new CobolString(256); // fallback
    private CobolString sel0002i = new CobolString(256); // fallback
    private CobolString usrid02i = new CobolString(256); // fallback
    private CobolString sel0003i = new CobolString(256); // fallback
    private CobolString usrid03i = new CobolString(256); // fallback
    private CobolString sel0004i = new CobolString(256); // fallback
    private CobolString usrid04i = new CobolString(256); // fallback
    private CobolString sel0005i = new CobolString(256); // fallback
    private CobolString usrid05i = new CobolString(256); // fallback
    private CobolString sel0006i = new CobolString(256); // fallback
    private CobolString usrid06i = new CobolString(256); // fallback
    private CobolString sel0007i = new CobolString(256); // fallback
    private CobolString usrid07i = new CobolString(256); // fallback
    private CobolString sel0008i = new CobolString(256); // fallback
    private CobolString usrid08i = new CobolString(256); // fallback
    private CobolString sel0009i = new CobolString(256); // fallback
    private CobolString usrid09i = new CobolString(256); // fallback
    private CobolString sel0010i = new CobolString(256); // fallback
    private CobolString usrid10i = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString cdemo_pgm_context = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString xctl = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString end_exec = new CobolString(256); // fallback
    private CobolString usridini = new CobolString(256); // fallback
    private CobolString sec_usr_id = new CobolString(256); // fallback
    private CobolString cdemo_cu00_page_num = new CobolString(256); // fallback
    private CobolString err_flg_on = new CobolString(256); // fallback
    private CobolString usridino = new CobolString(256); // fallback
    private CobolString cdemo_cu00_usrid_first = new CobolString(256); // fallback
    private CobolString next_page_yes = new CobolString(256); // fallback
    private CobolString send_erase_no = new CobolString(256); // fallback
    private CobolString cdemo_cu00_usrid_last = new CobolString(256); // fallback
    private CobolString user_sec_eof = new CobolString(256); // fallback
    private CobolString pagenumi = new CobolString(256); // fallback
    private CobolString cb_else = new CobolString(256); // fallback
    private CobolString sec_usr_fname = new CobolString(256); // fallback
    private CobolString fname01i = new CobolString(256); // fallback
    private CobolString sec_usr_lname = new CobolString(256); // fallback
    private CobolString lname01i = new CobolString(256); // fallback
    private CobolString sec_usr_type = new CobolString(256); // fallback
    private CobolString utype01i = new CobolString(256); // fallback
    private CobolString fname02i = new CobolString(256); // fallback
    private CobolString lname02i = new CobolString(256); // fallback
    private CobolString utype02i = new CobolString(256); // fallback
    private CobolString fname03i = new CobolString(256); // fallback
    private CobolString lname03i = new CobolString(256); // fallback
    private CobolString utype03i = new CobolString(256); // fallback
    private CobolString fname04i = new CobolString(256); // fallback
    private CobolString lname04i = new CobolString(256); // fallback
    private CobolString utype04i = new CobolString(256); // fallback
    private CobolString fname05i = new CobolString(256); // fallback
    private CobolString lname05i = new CobolString(256); // fallback
    private CobolString utype05i = new CobolString(256); // fallback
    private CobolString fname06i = new CobolString(256); // fallback
    private CobolString lname06i = new CobolString(256); // fallback
    private CobolString utype06i = new CobolString(256); // fallback
    private CobolString fname07i = new CobolString(256); // fallback
    private CobolString lname07i = new CobolString(256); // fallback
    private CobolString utype07i = new CobolString(256); // fallback
    private CobolString fname08i = new CobolString(256); // fallback
    private CobolString lname08i = new CobolString(256); // fallback
    private CobolString utype08i = new CobolString(256); // fallback
    private CobolString fname09i = new CobolString(256); // fallback
    private CobolString lname09i = new CobolString(256); // fallback
    private CobolString utype09i = new CobolString(256); // fallback
    private CobolString fname10i = new CobolString(256); // fallback
    private CobolString lname10i = new CobolString(256); // fallback
    private CobolString utype10i = new CobolString(256); // fallback
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

    private void main_para() {
        err_flg_off.set(String.valueOf(cb_true));
        user_sec_not_eof.set(String.valueOf(cb_true));
        next_page_no.set(String.valueOf(cb_true));
        send_erase_yes.set(String.valueOf(cb_true));
        ws_message.set(String.valueOf(" "));
        errmsgo.set(String.valueOf(" "));
        usridinl.set(String.valueOf(-1));
        if (String.valueOf(eibcalen).equals(String.valueOf(0))) {
            cdemo_to_program.set(String.valueOf("COSGN00C"));
            return_to_prev_screen();
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, Integer.parseInt(String.valueOf(eibcalen).trim()))));
            if (!(!String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
                cdemo_pgm_reenter.set(String.valueOf(cb_true));
                cousr0ao.set(String.valueOf("\u0000"));
                process_enter_key();
                send_usrlst_screen();
            } else {
                receive_usrlst_screen();
                if (String.valueOf(eibaid).equals(String.valueOf(dfhenter))) {
                    process_enter_key();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf3))) {
                    cdemo_to_program.set(String.valueOf("COADM01C"));
                    return_to_prev_screen();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf7))) {
                    process_pf7_key();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf8))) {
                    process_pf8_key();
                } else {
                    ws_err_flg.set(String.valueOf("Y"));
                    usridinl.set(String.valueOf(-1));
                    ws_message.set(String.valueOf(ccda_msg_invalid_key));
                    send_usrlst_screen();
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
            cdemo_cu00_usr_sel_flg.set(String.valueOf(sel0001i));
            cdemo_cu00_usr_selected.set(String.valueOf(usrid01i));
        } else if (!String.valueOf(sel0002i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_cu00_usr_sel_flg.set(String.valueOf(sel0002i));
            cdemo_cu00_usr_selected.set(String.valueOf(usrid02i));
        } else if (!String.valueOf(sel0003i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_cu00_usr_sel_flg.set(String.valueOf(sel0003i));
            cdemo_cu00_usr_selected.set(String.valueOf(usrid03i));
        } else if (!String.valueOf(sel0004i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_cu00_usr_sel_flg.set(String.valueOf(sel0004i));
            cdemo_cu00_usr_selected.set(String.valueOf(usrid04i));
        } else if (!String.valueOf(sel0005i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_cu00_usr_sel_flg.set(String.valueOf(sel0005i));
            cdemo_cu00_usr_selected.set(String.valueOf(usrid05i));
        } else if (!String.valueOf(sel0006i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_cu00_usr_sel_flg.set(String.valueOf(sel0006i));
            cdemo_cu00_usr_selected.set(String.valueOf(usrid06i));
        } else if (!String.valueOf(sel0007i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_cu00_usr_sel_flg.set(String.valueOf(sel0007i));
            cdemo_cu00_usr_selected.set(String.valueOf(usrid07i));
        } else if (!String.valueOf(sel0008i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_cu00_usr_sel_flg.set(String.valueOf(sel0008i));
            cdemo_cu00_usr_selected.set(String.valueOf(usrid08i));
        } else if (!String.valueOf(sel0009i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_cu00_usr_sel_flg.set(String.valueOf(sel0009i));
            cdemo_cu00_usr_selected.set(String.valueOf(usrid09i));
        } else if (!String.valueOf(sel0010i).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            cdemo_cu00_usr_sel_flg.set(String.valueOf(sel0010i));
            cdemo_cu00_usr_selected.set(String.valueOf(usrid10i));
        } else {
            cdemo_cu00_usr_sel_flg.set(String.valueOf(" "));
            cdemo_cu00_usr_selected.set(String.valueOf(" "));
        }
        if (((!String.valueOf(cdemo_cu00_usr_sel_flg).equals(String.valueOf(" ")) && true) && (!String.valueOf(cdemo_cu00_usr_selected).equals(String.valueOf(" ")) && true))) {
            if (String.valueOf(cdemo_cu00_usr_sel_flg).equals(String.valueOf("U"))) {
            } else if (String.valueOf(cdemo_cu00_usr_sel_flg).equals(String.valueOf("u"))) {
                cdemo_to_program.set(String.valueOf("COUSR02C"));
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
            } else if (String.valueOf(cdemo_cu00_usr_sel_flg).equals(String.valueOf("D"))) {
            } else if (String.valueOf(cdemo_cu00_usr_sel_flg).equals(String.valueOf("d"))) {
                cdemo_to_program.set(String.valueOf("COUSR03C"));
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
                ws_message.set(String.valueOf("Invalid selection. Valid values are U and D"));
                usridinl.set(String.valueOf(-1));
            }
        }
        if ((String.valueOf(usridini).equals(String.valueOf(" ")) || true)) {
            sec_usr_id.set(String.valueOf("\u0000"));
        } else {
            sec_usr_id.set(String.valueOf(usridini));
        }
        usridinl.set(String.valueOf(-1));
        cdemo_cu00_page_num.set(String.valueOf(0));
        process_page_forward();
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            usridino.set(String.valueOf(" "));
        }
    }

    private void process_pf7_key() {
        if ((String.valueOf(cdemo_cu00_usrid_first).equals(String.valueOf(" ")) || true)) {
            sec_usr_id.set(String.valueOf("\u0000"));
        } else {
            sec_usr_id.set(String.valueOf(cdemo_cu00_usrid_first));
        }
        next_page_yes.set(String.valueOf(cb_true));
        usridinl.set(String.valueOf(-1));
        if (Integer.parseInt(String.valueOf(cdemo_cu00_page_num).trim()) > 1) {
            process_page_backward();
        } else {
            ws_message.set(String.valueOf("You are already at the top of the page..."));
            send_erase_no.set(String.valueOf(cb_true));
            send_usrlst_screen();
        }
    }

    private void process_pf8_key() {
        if ((String.valueOf(cdemo_cu00_usrid_last).equals(String.valueOf(" ")) || true)) {
            sec_usr_id.set(String.valueOf("\uFFFF"));
        } else {
            sec_usr_id.set(String.valueOf(cdemo_cu00_usrid_last));
        }
        usridinl.set(String.valueOf(-1));
        if (!String.valueOf(next_page_yes).trim().isEmpty()) {
            process_page_forward();
        } else {
            ws_message.set(String.valueOf("You are already at the bottom of the page..."));
            send_erase_no.set(String.valueOf(cb_true));
            send_usrlst_screen();
        }
    }

    private void process_page_forward() {
        startbr_user_sec_file();
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            if (((!String.valueOf(eibaid).equals(String.valueOf(dfhenter)) && !String.valueOf(dfhpf7).trim().isEmpty()) && !String.valueOf(dfhpf3).trim().isEmpty())) {
                readnext_user_sec_file();
            }
            if ((!String.valueOf(user_sec_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                for (ws_idx = 1; !(ws_idx > 10); ws_idx += 1) {
                    initialize_user_data();
                }
            }
            ws_idx = new BigDecimal(String.valueOf(1).trim()).shortValue();
            while (!(((ws_idx >= 11 || !String.valueOf(user_sec_eof).trim().isEmpty()) || !String.valueOf(err_flg_on).trim().isEmpty()))) {
                readnext_user_sec_file();
                if ((!String.valueOf(user_sec_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                    populate_user_data();
                    ws_idx = new BigDecimal(String.valueOf((ws_idx + 1)).trim()).shortValue();
                }
            }
            if ((!String.valueOf(user_sec_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                cdemo_cu00_page_num.set(String.valueOf((Integer.parseInt(String.valueOf(cdemo_cu00_page_num).trim()) + 1)));
                readnext_user_sec_file();
                if ((!String.valueOf(user_sec_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                    next_page_yes.set(String.valueOf(cb_true));
                } else {
                    next_page_no.set(String.valueOf(cb_true));
                }
            } else {
                next_page_no.set(String.valueOf(cb_true));
                if (ws_idx > 1) {
                    cdemo_cu00_page_num.set(String.valueOf((Integer.parseInt(String.valueOf(cdemo_cu00_page_num).trim()) + 1)));
                }
            }
            endbr_user_sec_file();
            pagenumi.set(String.valueOf(cdemo_cu00_page_num));
            usridino.set(String.valueOf(" "));
            send_usrlst_screen();
        }
    }

    private void process_page_backward() {
        startbr_user_sec_file();
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            if ((!String.valueOf(eibaid).equals(String.valueOf(dfhenter)) && !String.valueOf(dfhpf8).trim().isEmpty())) {
                readprev_user_sec_file();
            }
            if ((!String.valueOf(user_sec_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                for (ws_idx = 1; !(ws_idx > 10); ws_idx += 1) {
                    initialize_user_data();
                }
            }
            ws_idx = new BigDecimal(String.valueOf(10).trim()).shortValue();
            while (!(((ws_idx <= 0 || !String.valueOf(user_sec_eof).trim().isEmpty()) || !String.valueOf(err_flg_on).trim().isEmpty()))) {
                readprev_user_sec_file();
                if ((!String.valueOf(user_sec_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                    populate_user_data();
                    ws_idx = new BigDecimal(String.valueOf((ws_idx - 1)).trim()).shortValue();
                }
            }
            if ((!String.valueOf(user_sec_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty())) {
                readprev_user_sec_file();
                if (!String.valueOf(next_page_yes).trim().isEmpty()) {
                    if (((!String.valueOf(user_sec_not_eof).trim().isEmpty() && !String.valueOf(err_flg_off).trim().isEmpty()) && Integer.parseInt(String.valueOf(cdemo_cu00_page_num).trim()) > 1)) {
                        cdemo_cu00_page_num.set(new BigDecimal(String.valueOf(cdemo_cu00_page_num).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                        cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).subtract(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                        cdemo_cu00_page_num.set(String.valueOf(1));
                    }
                }
            }
            endbr_user_sec_file();
            pagenumi.set(String.valueOf(cdemo_cu00_page_num));
            send_usrlst_screen();
        }
    }

    private void populate_user_data() {
        if (ws_idx == 1) {
            usrid01i.set(String.valueOf(sec_usr_id));
            cdemo_cu00_usrid_first.set(String.valueOf(sec_usr_id));
            fname01i.set(String.valueOf(sec_usr_fname));
            lname01i.set(String.valueOf(sec_usr_lname));
            utype01i.set(String.valueOf(sec_usr_type));
        } else if (ws_idx == 2) {
            usrid02i.set(String.valueOf(sec_usr_id));
            fname02i.set(String.valueOf(sec_usr_fname));
            lname02i.set(String.valueOf(sec_usr_lname));
            utype02i.set(String.valueOf(sec_usr_type));
        } else if (ws_idx == 3) {
            usrid03i.set(String.valueOf(sec_usr_id));
            fname03i.set(String.valueOf(sec_usr_fname));
            lname03i.set(String.valueOf(sec_usr_lname));
            utype03i.set(String.valueOf(sec_usr_type));
        } else if (ws_idx == 4) {
            usrid04i.set(String.valueOf(sec_usr_id));
            fname04i.set(String.valueOf(sec_usr_fname));
            lname04i.set(String.valueOf(sec_usr_lname));
            utype04i.set(String.valueOf(sec_usr_type));
        } else if (ws_idx == 5) {
            usrid05i.set(String.valueOf(sec_usr_id));
            fname05i.set(String.valueOf(sec_usr_fname));
            lname05i.set(String.valueOf(sec_usr_lname));
            utype05i.set(String.valueOf(sec_usr_type));
        } else if (ws_idx == 6) {
            usrid06i.set(String.valueOf(sec_usr_id));
            fname06i.set(String.valueOf(sec_usr_fname));
            lname06i.set(String.valueOf(sec_usr_lname));
            utype06i.set(String.valueOf(sec_usr_type));
        } else if (ws_idx == 7) {
            usrid07i.set(String.valueOf(sec_usr_id));
            fname07i.set(String.valueOf(sec_usr_fname));
            lname07i.set(String.valueOf(sec_usr_lname));
            utype07i.set(String.valueOf(sec_usr_type));
        } else if (ws_idx == 8) {
            usrid08i.set(String.valueOf(sec_usr_id));
            fname08i.set(String.valueOf(sec_usr_fname));
            lname08i.set(String.valueOf(sec_usr_lname));
            utype08i.set(String.valueOf(sec_usr_type));
        } else if (ws_idx == 9) {
            usrid09i.set(String.valueOf(sec_usr_id));
            fname09i.set(String.valueOf(sec_usr_fname));
            lname09i.set(String.valueOf(sec_usr_lname));
            utype09i.set(String.valueOf(sec_usr_type));
        } else if (ws_idx == 10) {
            usrid10i.set(String.valueOf(sec_usr_id));
            cdemo_cu00_usrid_last.set(String.valueOf(sec_usr_id));
            fname10i.set(String.valueOf(sec_usr_fname));
            lname10i.set(String.valueOf(sec_usr_lname));
            utype10i.set(String.valueOf(sec_usr_type));
        } else {
            /* CONTINUE */
        }
    }

    private void initialize_user_data() {
        if (ws_idx == 1) {
            usrid01i.set(String.valueOf(" "));
            fname01i.set(String.valueOf(" "));
            lname01i.set(String.valueOf(" "));
            utype01i.set(String.valueOf(" "));
        } else if (ws_idx == 2) {
            usrid02i.set(String.valueOf(" "));
            fname02i.set(String.valueOf(" "));
            lname02i.set(String.valueOf(" "));
            utype02i.set(String.valueOf(" "));
        } else if (ws_idx == 3) {
            usrid03i.set(String.valueOf(" "));
            fname03i.set(String.valueOf(" "));
            lname03i.set(String.valueOf(" "));
            utype03i.set(String.valueOf(" "));
        } else if (ws_idx == 4) {
            usrid04i.set(String.valueOf(" "));
            fname04i.set(String.valueOf(" "));
            lname04i.set(String.valueOf(" "));
            utype04i.set(String.valueOf(" "));
        } else if (ws_idx == 5) {
            usrid05i.set(String.valueOf(" "));
            fname05i.set(String.valueOf(" "));
            lname05i.set(String.valueOf(" "));
            utype05i.set(String.valueOf(" "));
        } else if (ws_idx == 6) {
            usrid06i.set(String.valueOf(" "));
            fname06i.set(String.valueOf(" "));
            lname06i.set(String.valueOf(" "));
            utype06i.set(String.valueOf(" "));
        } else if (ws_idx == 7) {
            usrid07i.set(String.valueOf(" "));
            fname07i.set(String.valueOf(" "));
            lname07i.set(String.valueOf(" "));
            utype07i.set(String.valueOf(" "));
        } else if (ws_idx == 8) {
            usrid08i.set(String.valueOf(" "));
            fname08i.set(String.valueOf(" "));
            lname08i.set(String.valueOf(" "));
            utype08i.set(String.valueOf(" "));
        } else if (ws_idx == 9) {
            usrid09i.set(String.valueOf(" "));
            fname09i.set(String.valueOf(" "));
            lname09i.set(String.valueOf(" "));
            utype09i.set(String.valueOf(" "));
        } else if (ws_idx == 10) {
            usrid10i.set(String.valueOf(" "));
            fname10i.set(String.valueOf(" "));
            lname10i.set(String.valueOf(" "));
            utype10i.set(String.valueOf(" "));
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

    private void send_usrlst_screen() {
        populate_header_info();
        errmsgo.set(String.valueOf(ws_message));
        if (!String.valueOf(send_erase_yes).trim().isEmpty()) {
            /* RAW: EXEC CICS SEND MAP ( 'COUSR0A' */
        } else {
            /* RAW: EXEC CICS SEND MAP ( 'COUSR0A' */
        }
    }

    private void receive_usrlst_screen() {
        /* RAW: EXEC CICS RECEIVE MAP ( 'COUSR0A' */
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

    private void startbr_user_sec_file() {
        /* RAW: EXEC CICS STARTBR DATASET ( WS-USRSEC-FILE */
    }

    private void end_exec_4() {
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            /* CONTINUE */
            user_sec_eof.set(String.valueOf(cb_true));
            ws_message.set(String.valueOf("You are at the top of the page..."));
            usridinl.set(String.valueOf(-1));
            send_usrlst_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup User..."));
            usridinl.set(String.valueOf(-1));
            send_usrlst_screen();
        }
    }

    private void readnext_user_sec_file() {
        /* RAW: EXEC CICS READNEXT DATASET ( WS-USRSEC-FILE */
    }

    private void end_exec_5() {
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(endfile).trim()) - 1]))) {
            /* CONTINUE */
            user_sec_eof.set(String.valueOf(cb_true));
            ws_message.set(String.valueOf("You have reached the bottom of the page..."));
            usridinl.set(String.valueOf(-1));
            send_usrlst_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup User..."));
            usridinl.set(String.valueOf(-1));
            send_usrlst_screen();
        }
    }

    private void readprev_user_sec_file() {
        /* RAW: EXEC CICS READPREV DATASET ( WS-USRSEC-FILE */
    }

    private void end_exec_6() {
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(endfile).trim()) - 1]))) {
            /* CONTINUE */
            user_sec_eof.set(String.valueOf(cb_true));
            ws_message.set(String.valueOf("You have reached the top of the page..."));
            usridinl.set(String.valueOf(-1));
            send_usrlst_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup User..."));
            usridinl.set(String.valueOf(-1));
            send_usrlst_screen();
        }
    }

    private void endbr_user_sec_file() {
        /* RAW: EXEC CICS ENDBR DATASET ( WS-USRSEC-FILE */
    }

    private void end_exec_7() {
    }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Cousr00c().run();
    }
}
