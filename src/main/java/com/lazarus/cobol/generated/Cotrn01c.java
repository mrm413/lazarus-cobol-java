package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cotrn01c extends CobolProgram {
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
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private CobolString ws_usr_modified = new CobolString(1);
    private CobolString ws_tran_amt = new CobolString(1);
    private CobolString ws_tran_date = new CobolString(8);

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
    private CobolString cotrn1ao = new CobolString(256); // fallback
    private CobolString trnidinl = new CobolString(256); // fallback
    private CobolString cdemo_ct01_trn_selected = new CobolString(256); // fallback
    private CobolString trnidini = new CobolString(256); // fallback
    private CobolString eibaid = new CobolString(256); // fallback
    private CobolString ccda_msg_invalid_key = new CobolString(256); // fallback
    private CobolString dfhenter = new CobolString(256); // fallback
    private CobolString dfhpf3 = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString dfhpf4 = new CobolString(256); // fallback
    private CobolString dfhpf5 = new CobolString(256); // fallback
    private CobolString err_flg_on = new CobolString(256); // fallback
    private CobolString trnidi = new CobolString(256); // fallback
    private CobolString cardnumi = new CobolString(256); // fallback
    private CobolString ttypcdi = new CobolString(256); // fallback
    private CobolString tcatcdi = new CobolString(256); // fallback
    private CobolString trnsrci = new CobolString(256); // fallback
    private CobolString trnamti = new CobolString(256); // fallback
    private CobolString tdesci = new CobolString(256); // fallback
    private CobolString torigdti = new CobolString(256); // fallback
    private CobolString tprocdti = new CobolString(256); // fallback
    private CobolString midi = new CobolString(256); // fallback
    private CobolString mnamei = new CobolString(256); // fallback
    private CobolString mcityi = new CobolString(256); // fallback
    private CobolString mzipi = new CobolString(256); // fallback
    private CobolString tran_id = new CobolString(256); // fallback
    private CobolString tran_amt = new CobolString(256); // fallback
    private CobolString tran_card_num = new CobolString(256); // fallback
    private CobolString tran_type_cd = new CobolString(256); // fallback
    private CobolString tran_cat_cd = new CobolString(256); // fallback
    private CobolString tran_source = new CobolString(256); // fallback
    private CobolString tran_desc = new CobolString(256); // fallback
    private CobolString tran_orig_ts = new CobolString(256); // fallback
    private CobolString tran_proc_ts = new CobolString(256); // fallback
    private CobolString tran_merchant_id = new CobolString(256); // fallback
    private CobolString tran_merchant_name = new CobolString(256); // fallback
    private CobolString tran_merchant_city = new CobolString(256); // fallback
    private CobolString tran_merchant_zip = new CobolString(256); // fallback
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
                cotrn1ao.set(String.valueOf("\u0000"));
                trnidinl.set(String.valueOf(-1));
                if ((!String.valueOf(cdemo_ct01_trn_selected).equals(String.valueOf(" ")) && true)) {
                    trnidini.set(String.valueOf(cdemo_ct01_trn_selected));
                    process_enter_key();
                }
                send_trnview_screen();
            } else {
                receive_trnview_screen();
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
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf5))) {
                    cdemo_to_program.set(String.valueOf("COTRN00C"));
                    return_to_prev_screen();
                } else {
                    ws_err_flg.set(String.valueOf("Y"));
                    ws_message.set(String.valueOf(ccda_msg_invalid_key));
                    send_trnview_screen();
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
        if (!String.valueOf(trnidini).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Tran ID can NOT be empty..."));
            trnidinl.set(String.valueOf(-1));
            send_trnview_screen();
        } else {
            trnidinl.set(String.valueOf(-1));
            /* CONTINUE */
        }
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            trnidi.set(String.valueOf(" "));
            cardnumi.set(String.valueOf(" "));
            ttypcdi.set(String.valueOf(" "));
            tcatcdi.set(String.valueOf(" "));
            trnsrci.set(String.valueOf(" "));
            trnamti.set(String.valueOf(" "));
            tdesci.set(String.valueOf(" "));
            torigdti.set(String.valueOf(" "));
            tprocdti.set(String.valueOf(" "));
            midi.set(String.valueOf(" "));
            mnamei.set(String.valueOf(" "));
            mcityi.set(String.valueOf(" "));
            mzipi.set(String.valueOf(" "));
            tran_id.set(String.valueOf(trnidini));
            read_transact_file();
        }
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            ws_tran_amt.set(String.valueOf(tran_amt));
            trnidi.set(String.valueOf(tran_id));
            cardnumi.set(String.valueOf(tran_card_num));
            ttypcdi.set(String.valueOf(tran_type_cd));
            tcatcdi.set(String.valueOf(tran_cat_cd));
            trnsrci.set(String.valueOf(tran_source));
            trnamti.set(String.valueOf(ws_tran_amt));
            tdesci.set(String.valueOf(tran_desc));
            torigdti.set(String.valueOf(tran_orig_ts));
            tprocdti.set(String.valueOf(tran_proc_ts));
            midi.set(String.valueOf(tran_merchant_id));
            mnamei.set(String.valueOf(tran_merchant_name));
            mcityi.set(String.valueOf(tran_merchant_city));
            mzipi.set(String.valueOf(tran_merchant_zip));
            send_trnview_screen();
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

    private void send_trnview_screen() {
        populate_header_info();
        errmsgo.set(String.valueOf(ws_message));
        exec.set(String.valueOf(ws_message));
        cics.set(String.valueOf(ws_message));
        send.set(String.valueOf(ws_message));
        if (map[0 /* non-numeric literal: COTRN1A */ - 1] == null) map[0 /* non-numeric literal: COTRN1A */ - 1] = new CobolString(256);
        map[0 /* non-numeric literal: COTRN1A */ - 1].set(String.valueOf(ws_message));
        if (mapset[0 /* non-numeric literal: COTRN01 */ - 1] == null) mapset[0 /* non-numeric literal: COTRN01 */ - 1] = new CobolString(256);
        mapset[0 /* non-numeric literal: COTRN01 */ - 1].set(String.valueOf(ws_message));
        if (from[Integer.parseInt(String.valueOf(cotrn1ao).trim()) - 1] == null) from[Integer.parseInt(String.valueOf(cotrn1ao).trim()) - 1] = new CobolString(256);
        from[Integer.parseInt(String.valueOf(cotrn1ao).trim()) - 1].set(String.valueOf(ws_message));
        erase.set(String.valueOf(ws_message));
        cursor.set(String.valueOf(ws_message));
    }

    private void end_exec_3() {
    }

    private void receive_trnview_screen() {
        /* RAW: EXEC CICS RECEIVE MAP ( 'COTRN1A' */
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

    private void read_transact_file() {
        /* RAW: EXEC CICS */
        if (dataset.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( WS-TRANSACT-FILE ) INTO ( TRAN-RECORD */
    }

    private void end_exec_5() {
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Transaction ID NOT found..."));
            trnidinl.set(String.valueOf(-1));
            send_trnview_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup Transaction..."));
            trnidinl.set(String.valueOf(-1));
            send_trnview_screen();
        }
    }

    private void clear_current_screen() {
        initialize_all_fields();
        send_trnview_screen();
    }

    private void initialize_all_fields() {
        trnidinl.set(String.valueOf(-1));
        trnidini.set(String.valueOf(" "));
        trnidi.set(String.valueOf(" "));
        cardnumi.set(String.valueOf(" "));
        ttypcdi.set(String.valueOf(" "));
        tcatcdi.set(String.valueOf(" "));
        trnsrci.set(String.valueOf(" "));
        trnamti.set(String.valueOf(" "));
        tdesci.set(String.valueOf(" "));
        torigdti.set(String.valueOf(" "));
        tprocdti.set(String.valueOf(" "));
        midi.set(String.valueOf(" "));
        mnamei.set(String.valueOf(" "));
        mcityi.set(String.valueOf(" "));
        mzipi.set(String.valueOf(" "));
    }

    private void ws_message() {
    }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Cotrn01c().run();
    }
}
