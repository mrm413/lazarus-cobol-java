package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cotrn02c extends CobolProgram {
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
    private CobolString ws_ccxref_file = new CobolString(8);
    private CobolString ws_cxacaix_file = new CobolString(8);
    private CobolString ws_err_flg = new CobolString(1);
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private CobolString ws_usr_modified = new CobolString(1);
    private CobolString ws_tran_amt = new CobolString(1);
    private CobolString ws_tran_date = new CobolString(8);
    private int ws_acct_id_n = 0;
    private int ws_card_num_n = 0;
    private int ws_tran_id_n = 0;
    private BigDecimal ws_tran_amt_n = BigDecimal.ZERO;
    private CobolString ws_tran_amt_e = new CobolString(1);
    private CobolString ws_date_format = new CobolString(10);
    private CobolString csutldtc_parm = new CobolString(1); // Group: CSUTLDTC-PARM
    private CobolString csutldtc_date = new CobolString(10);
    private CobolString csutldtc_date_format = new CobolString(10);
    private CobolString csutldtc_result = new CobolString(1); // Group: CSUTLDTC-RESULT
    private CobolString csutldtc_result_sev_cd = new CobolString(4);
    private CobolString csutldtc_result_msg_num = new CobolString(4);
    private CobolString csutldtc_result_msg = new CobolString(61);

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
    private CobolString cotrn2ao = new CobolString(256); // fallback
    private CobolString actidinl = new CobolString(256); // fallback
    private CobolString cdemo_ct02_trn_selected = new CobolString(256); // fallback
    private CobolString cardnini = new CobolString(256); // fallback
    private CobolString eibaid = new CobolString(256); // fallback
    private CobolString ccda_msg_invalid_key = new CobolString(256); // fallback
    private CobolString dfhenter = new CobolString(256); // fallback
    private CobolString dfhpf3 = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString dfhpf4 = new CobolString(256); // fallback
    private CobolString dfhpf5 = new CobolString(256); // fallback
    private CobolString confirmi = new CobolString(256); // fallback
    private CobolString confirml = new CobolString(256); // fallback
    private CobolString actidini = new CobolString(256); // fallback
    private CobolString xref_acct_id = new CobolString(256); // fallback
    private CobolString xref_card_num = new CobolString(256); // fallback
    private CobolString cardninl = new CobolString(256); // fallback
    private CobolString err_flg_on = new CobolString(256); // fallback
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
    private CobolString ttypcdl = new CobolString(256); // fallback
    private CobolString tcatcdl = new CobolString(256); // fallback
    private CobolString trnsrcl = new CobolString(256); // fallback
    private CobolString tdescl = new CobolString(256); // fallback
    private CobolString trnamtl = new CobolString(256); // fallback
    private CobolString torigdtl = new CobolString(256); // fallback
    private CobolString tprocdtl = new CobolString(256); // fallback
    private CobolString midl = new CobolString(256); // fallback
    private CobolString mnamel = new CobolString(256); // fallback
    private CobolString mcityl = new CobolString(256); // fallback
    private CobolString mzipl = new CobolString(256); // fallback
    private CobolString tran_id = new CobolString(256); // fallback
    private CobolString tran_record = new CobolString(256); // fallback
    private CobolString tran_type_cd = new CobolString(256); // fallback
    private CobolString tran_cat_cd = new CobolString(256); // fallback
    private CobolString tran_source = new CobolString(256); // fallback
    private CobolString tran_desc = new CobolString(256); // fallback
    private CobolString tran_amt = new CobolString(256); // fallback
    private CobolString tran_card_num = new CobolString(256); // fallback
    private CobolString tran_merchant_id = new CobolString(256); // fallback
    private CobolString tran_merchant_name = new CobolString(256); // fallback
    private CobolString tran_merchant_city = new CobolString(256); // fallback
    private CobolString tran_merchant_zip = new CobolString(256); // fallback
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
                cotrn2ao.set(String.valueOf("\u0000"));
                actidinl.set(String.valueOf(-1));
                if ((!String.valueOf(cdemo_ct02_trn_selected).equals(String.valueOf(" ")) && true)) {
                    cardnini.set(String.valueOf(cdemo_ct02_trn_selected));
                    process_enter_key();
                }
                send_trnadd_screen();
            } else {
                receive_trnadd_screen();
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
                    copy_last_tran_data();
                } else {
                    ws_err_flg.set(String.valueOf("Y"));
                    ws_message.set(String.valueOf(ccda_msg_invalid_key));
                    send_trnadd_screen();
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
        validate_input_key_fields();
        validate_input_data_fields();
        if (String.valueOf(confirmi).equals(String.valueOf("Y"))) {
        } else if (String.valueOf(confirmi).equals(String.valueOf("y"))) {
            add_transaction();
        } else if (String.valueOf(confirmi).equals(String.valueOf("N"))) {
        } else if (String.valueOf(confirmi).equals(String.valueOf("n"))) {
        } else if (String.valueOf(confirmi).equals(String.valueOf(" "))) {
        } else if (String.valueOf(confirmi).equals(String.valueOf("\u0000"))) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Confirm to add this transaction..."));
            confirml.set(String.valueOf(-1));
            send_trnadd_screen();
        } else {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Invalid value. Valid values are (Y/N)..."));
            confirml.set(String.valueOf(-1));
            send_trnadd_screen();
        }
    }

    private void validate_input_key_fields() {
        if (!String.valueOf(actidini).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            if (!CobolIntrinsics.isNumeric(actidini)) {
                ws_err_flg.set(String.valueOf("Y"));
                ws_message.set(String.valueOf("Account ID must be Numeric..."));
                actidinl.set(String.valueOf(-1));
                send_trnadd_screen();
            }
            ws_acct_id_n = new BigDecimal(String.valueOf(CobolIntrinsics.numval(actidini)).trim()).intValue();
            xref_acct_id.set(String.valueOf(ws_acct_id_n));
            actidini.set(String.valueOf(ws_acct_id_n));
            read_cxacaix_file();
            cardnini.set(String.valueOf(xref_card_num));
        } else if (!String.valueOf(cardnini).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            if (!CobolIntrinsics.isNumeric(cardnini)) {
                ws_err_flg.set(String.valueOf("Y"));
                ws_message.set(String.valueOf("Card Number must be Numeric..."));
                cardninl.set(String.valueOf(-1));
                send_trnadd_screen();
            }
            ws_card_num_n = new BigDecimal(String.valueOf(CobolIntrinsics.numval(cardnini)).trim()).intValue();
            xref_card_num.set(String.valueOf(ws_card_num_n));
            cardnini.set(String.valueOf(ws_card_num_n));
            read_ccxref_file();
            actidini.set(String.valueOf(xref_acct_id));
        } else {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Account or Card Number must be entered..."));
            actidinl.set(String.valueOf(-1));
            send_trnadd_screen();
        }
    }

    private void validate_input_data_fields() {
        if (!String.valueOf(err_flg_on).trim().isEmpty()) {
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
        if (!String.valueOf(ttypcdi).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Type CD can NOT be empty..."));
            ttypcdl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else if (!String.valueOf(tcatcdi).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Category CD can NOT be empty..."));
            tcatcdl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else if (!String.valueOf(trnsrci).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Source can NOT be empty..."));
            trnsrcl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else if (!String.valueOf(tdesci).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Description can NOT be empty..."));
            tdescl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else if (!String.valueOf(trnamti).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Amount can NOT be empty..."));
            trnamtl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else if (!String.valueOf(torigdti).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Orig Date can NOT be empty..."));
            torigdtl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else if (!String.valueOf(tprocdti).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Proc Date can NOT be empty..."));
            tprocdtl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else if (!String.valueOf(midi).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Merchant ID can NOT be empty..."));
            midl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else if (!String.valueOf(mnamei).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Merchant Name can NOT be empty..."));
            mnamel.set(String.valueOf(-1));
            send_trnadd_screen();
        } else if (!String.valueOf(mcityi).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Merchant City can NOT be empty..."));
            mcityl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else if (!String.valueOf(mzipi).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Merchant Zip can NOT be empty..."));
            mzipl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else {
            /* CONTINUE */
        }
        if (!String.valueOf(ttypcdi).trim().isEmpty()) {
            /* RAW: NOT NUMERIC */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Type CD must be Numeric..."));
            ttypcdl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else if (!String.valueOf(tcatcdi).trim().isEmpty()) {
            /* RAW: NOT NUMERIC */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Category CD must be Numeric..."));
            tcatcdl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else {
            /* CONTINUE */
        }
        if (!String.valueOf(CobolString.refMod(trnamti, 1, 1)).trim().isEmpty()) {
            /* RAW: NOT EQUAL '-' AND '+' */
        } else if (!String.valueOf(CobolString.refMod(trnamti, 2, 8)).trim().isEmpty()) {
            /* RAW: NOT NUMERIC */
        } else if (!String.valueOf(CobolString.refMod(trnamti, 10, 1)).trim().isEmpty()) {
            /* RAW: NOT = '.' */
        } else if (!String.valueOf(CobolString.refMod(trnamti, 11, 2)).trim().isEmpty()) {
            /* RAW: IS NOT NUMERIC */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Amount should be in format -99999999.99"));
            trnamtl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else {
            /* CONTINUE */
        }
        if (!String.valueOf(CobolString.refMod(torigdti, 1, 4)).trim().isEmpty()) {
            /* RAW: IS NOT NUMERIC */
        } else if (!String.valueOf(CobolString.refMod(torigdti, 5, 1)).trim().isEmpty()) {
            /* RAW: NOT EQUAL '-' */
        } else if (!String.valueOf(CobolString.refMod(torigdti, 6, 2)).trim().isEmpty()) {
            /* RAW: NOT NUMERIC */
        } else if (!String.valueOf(CobolString.refMod(torigdti, 8, 1)).trim().isEmpty()) {
            /* RAW: NOT EQUAL '-' */
        } else if (!String.valueOf(CobolString.refMod(torigdti, 9, 2)).trim().isEmpty()) {
            /* RAW: NOT NUMERIC */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Orig Date should be in format YYYY-MM-DD"));
            torigdtl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else {
            /* CONTINUE */
        }
        if (!String.valueOf(CobolString.refMod(tprocdti, 1, 4)).trim().isEmpty()) {
            /* RAW: IS NOT NUMERIC */
        } else if (!String.valueOf(CobolString.refMod(tprocdti, 5, 1)).trim().isEmpty()) {
            /* RAW: NOT EQUAL '-' */
        } else if (!String.valueOf(CobolString.refMod(tprocdti, 6, 2)).trim().isEmpty()) {
            /* RAW: NOT NUMERIC */
        } else if (!String.valueOf(CobolString.refMod(tprocdti, 8, 1)).trim().isEmpty()) {
            /* RAW: NOT EQUAL '-' */
        } else if (!String.valueOf(CobolString.refMod(tprocdti, 9, 2)).trim().isEmpty()) {
            /* RAW: NOT NUMERIC */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Proc Date should be in format YYYY-MM-DD"));
            tprocdtl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else {
            /* CONTINUE */
        }
        ws_tran_amt_n = new BigDecimal(String.valueOf(CobolIntrinsics.numval_c(trnamti)).trim());
        ws_tran_amt_e.set(String.valueOf(ws_tran_amt_n));
        trnamti.set(String.valueOf(ws_tran_amt_e));
        csutldtc_date.set(String.valueOf(torigdti));
        csutldtc_date_format.set(String.valueOf(ws_date_format));
        csutldtc_result.set(String.valueOf(" "));
        CobolProgram.call("CSUTLDTC", csutldtc_date, csutldtc_date_format, csutldtc_result);
        if (String.valueOf(csutldtc_result_sev_cd).equals(String.valueOf("0000"))) {
            /* CONTINUE */
        } else {
            if (!String.valueOf(csutldtc_result_msg_num).equals(String.valueOf("2513"))) {
                ws_message.set(String.valueOf("Orig Date - Not a valid date..."));
                ws_err_flg.set(String.valueOf("Y"));
                torigdtl.set(String.valueOf(-1));
                send_trnadd_screen();
            }
        }
        csutldtc_date.set(String.valueOf(tprocdti));
        csutldtc_date_format.set(String.valueOf(ws_date_format));
        csutldtc_result.set(String.valueOf(" "));
        CobolProgram.call("CSUTLDTC", csutldtc_date, csutldtc_date_format, csutldtc_result);
        if (String.valueOf(csutldtc_result_sev_cd).equals(String.valueOf("0000"))) {
            /* CONTINUE */
        } else {
            if (!String.valueOf(csutldtc_result_msg_num).equals(String.valueOf("2513"))) {
                ws_message.set(String.valueOf("Proc Date - Not a valid date..."));
                ws_err_flg.set(String.valueOf("Y"));
                tprocdtl.set(String.valueOf(-1));
                send_trnadd_screen();
            }
        }
        if (!CobolIntrinsics.isNumeric(midi)) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Merchant ID must be Numeric..."));
            midl.set(String.valueOf(-1));
            send_trnadd_screen();
        }
    }

    private void add_transaction() {
        tran_id.set(String.valueOf("\uFFFF"));
        startbr_transact_file();
        readprev_transact_file();
        endbr_transact_file();
        ws_tran_id_n = new BigDecimal(String.valueOf(tran_id).trim()).intValue();
        ws_tran_id_n = new BigDecimal(String.valueOf(ws_tran_id_n + 1).trim()).intValue();
        tran_record.set("");
        tran_id.set(String.valueOf(ws_tran_id_n));
        tran_type_cd.set(String.valueOf(ttypcdi));
        tran_cat_cd.set(String.valueOf(tcatcdi));
        tran_source.set(String.valueOf(trnsrci));
        tran_desc.set(String.valueOf(tdesci));
        ws_tran_amt_n = new BigDecimal(String.valueOf(CobolIntrinsics.numval_c(trnamti)).trim());
        tran_amt.set(String.valueOf(ws_tran_amt_n));
        tran_card_num.set(String.valueOf(cardnini));
        tran_merchant_id.set(String.valueOf(midi));
        tran_merchant_name.set(String.valueOf(mnamei));
        tran_merchant_city.set(String.valueOf(mcityi));
        tran_merchant_zip.set(String.valueOf(mzipi));
        tran_orig_ts.set(String.valueOf(torigdti));
        tran_proc_ts.set(String.valueOf(tprocdti));
        write_transact_file();
    }

    private void copy_last_tran_data() {
        validate_input_key_fields();
        tran_id.set(String.valueOf("\uFFFF"));
        startbr_transact_file();
        readprev_transact_file();
        endbr_transact_file();
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            ws_tran_amt_e.set(String.valueOf(tran_amt));
            ttypcdi.set(String.valueOf(tran_type_cd));
            tcatcdi.set(String.valueOf(tran_cat_cd));
            trnsrci.set(String.valueOf(tran_source));
            trnamti.set(String.valueOf(ws_tran_amt_e));
            tdesci.set(String.valueOf(tran_desc));
            torigdti.set(String.valueOf(tran_orig_ts));
            tprocdti.set(String.valueOf(tran_proc_ts));
            midi.set(String.valueOf(tran_merchant_id));
            mnamei.set(String.valueOf(tran_merchant_name));
            mcityi.set(String.valueOf(tran_merchant_city));
            mzipi.set(String.valueOf(tran_merchant_zip));
        }
        process_enter_key();
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

    private void send_trnadd_screen() {
        populate_header_info();
        errmsgo.set(String.valueOf(ws_message));
        exec.set(String.valueOf(ws_message));
        cics.set(String.valueOf(ws_message));
        send.set(String.valueOf(ws_message));
        if (map[0 /* non-numeric literal: COTRN2A */ - 1] == null) map[0 /* non-numeric literal: COTRN2A */ - 1] = new CobolString(256);
        map[0 /* non-numeric literal: COTRN2A */ - 1].set(String.valueOf(ws_message));
        if (mapset[0 /* non-numeric literal: COTRN02 */ - 1] == null) mapset[0 /* non-numeric literal: COTRN02 */ - 1] = new CobolString(256);
        mapset[0 /* non-numeric literal: COTRN02 */ - 1].set(String.valueOf(ws_message));
        if (from[Integer.parseInt(String.valueOf(cotrn2ao).trim()) - 1] == null) from[Integer.parseInt(String.valueOf(cotrn2ao).trim()) - 1] = new CobolString(256);
        from[Integer.parseInt(String.valueOf(cotrn2ao).trim()) - 1].set(String.valueOf(ws_message));
        erase.set(String.valueOf(ws_message));
        cursor.set(String.valueOf(ws_message));
    }

    private void end_exec_3() {
        /* RAW: EXEC CICS */
        /* RETURN TRANSID */
        /* RAW: ( WS-TRANID ) COMMAREA ( CARDDEMO-COMMAREA */
    }

    private void end_exec_4() {
    }

    private void receive_trnadd_screen() {
        /* RAW: EXEC CICS RECEIVE MAP ( 'COTRN2A' */
    }

    private void end_exec_5() {
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
            send_trnadd_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup Acct in XREF AIX file..."));
            actidinl.set(String.valueOf(-1));
            send_trnadd_screen();
        }
    }

    private void read_ccxref_file() {
        /* RAW: EXEC CICS */
        if (dataset.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( WS-CCXREF-FILE ) INTO ( CARD-XREF-RECORD */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Card Number NOT found..."));
            cardninl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup Card # in XREF file..."));
            cardninl.set(String.valueOf(-1));
            send_trnadd_screen();
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
            send_trnadd_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to lookup Transaction..."));
            actidinl.set(String.valueOf(-1));
            send_trnadd_screen();
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
            send_trnadd_screen();
        }
    }

    private void endbr_transact_file() {
        /* RAW: EXEC CICS ENDBR DATASET ( WS-TRANSACT-FILE */
    }

    private void end_exec_6() {
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
                _sb.append("Transaction added successfully. ");
                _sb.append(" Your Tran ID is ");
                _sb.append(CobolString.delimitedBy(String.valueOf(tran_id), " "));
                _sb.append(".");
                ws_message.set(_sb.toString());
            }
            send_trnadd_screen();
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(dupkey).trim()) - 1]))) {
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(duprec).trim()) - 1]))) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Tran ID already exist..."));
            actidinl.set(String.valueOf(-1));
            send_trnadd_screen();
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to Add Transaction..."));
            actidinl.set(String.valueOf(-1));
            send_trnadd_screen();
        }
    }

    private void clear_current_screen() {
        initialize_all_fields();
        send_trnadd_screen();
    }

    private void initialize_all_fields() {
        actidinl.set(String.valueOf(-1));
        actidini.set(String.valueOf(" "));
        cardnini.set(String.valueOf(" "));
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
        confirmi.set(String.valueOf(" "));
    }

    private void ws_message() {
    }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Cotrn02c().run();
    }
}
