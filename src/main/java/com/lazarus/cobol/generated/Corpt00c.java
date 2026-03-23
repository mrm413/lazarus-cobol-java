package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Corpt00c extends CobolProgram {
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
    private CobolString ws_end_loop = new CobolString(1);
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private short ws_rec_count = (short) 0;
    private short ws_idx = (short) 0;
    private CobolString ws_report_name = new CobolString(10);
    private CobolString ws_start_date = new CobolString(1); // Group: WS-START-DATE
    private CobolString ws_start_date_yyyy = new CobolString(4);
    private CobolString ws_start_date_mm = new CobolString(2);
    private CobolString ws_start_date_dd = new CobolString(2);
    private CobolString ws_end_date = new CobolString(1); // Group: WS-END-DATE
    private CobolString ws_end_date_yyyy = new CobolString(4);
    private CobolString ws_end_date_mm = new CobolString(2);
    private CobolString ws_end_date_dd = new CobolString(2);
    private CobolString ws_date_format = new CobolString(10);
    private int ws_num_99 = 0;
    private int ws_num_9999 = 0;
    private CobolString ws_tran_amt = new CobolString(1);
    private CobolString ws_tran_date = new CobolString(8);
    private CobolString jcl_record = new CobolString(80);
    private CobolString job_data = new CobolString(1); // Group: JOB-DATA
    private CobolString job_data_1 = new CobolString(1); // Group: JOB-DATA-1
    private CobolString filler_1 = new CobolString(1); // Group: FILLER-1
    private CobolString parm_start_date_1 = new CobolString(10);
    private CobolString filler_2 = new CobolString(1); // Group: FILLER-2
    private CobolString parm_end_date_1 = new CobolString(10);
    private CobolString filler_3 = new CobolString(1); // Group: FILLER-3
    private CobolString parm_start_date_2 = new CobolString(10);
    private CobolString parm_end_date_2 = new CobolString(10);
    private CobolString job_data_2 = new CobolString(1); // Group: JOB-DATA-2
    private CobolString[] job_lines = new CobolString[1000];
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

    private CobolString err_flg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString transact_not_eof = new CobolString(256); // fallback
    private CobolString send_erase_yes = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString corpt0ao = new CobolString(256); // fallback
    private CobolString monthlyl = new CobolString(256); // fallback
    private CobolString eibaid = new CobolString(256); // fallback
    private CobolString ccda_msg_invalid_key = new CobolString(256); // fallback
    private CobolString dfhenter = new CobolString(256); // fallback
    private CobolString dfhpf3 = new CobolString(256); // fallback
    private CobolString monthlyi = new CobolString(256); // fallback
    private CobolString ws_curdate_data = new CobolString(256); // fallback
    private CobolString ws_curdate_year = new CobolString(256); // fallback
    private CobolString ws_curdate_month = new CobolString(256); // fallback
    private CobolString ws_curdate_day = new CobolString(256); // fallback
    private CobolString ws_curdate_n = new CobolString(256); // fallback
    private CobolString yearlyi = new CobolString(256); // fallback
    private CobolString customi = new CobolString(256); // fallback
    private CobolString sdtmmi = new CobolString(256); // fallback
    private CobolString sdtmml = new CobolString(256); // fallback
    private CobolString sdtddi = new CobolString(256); // fallback
    private CobolString sdtddl = new CobolString(256); // fallback
    private CobolString sdtyyyyi = new CobolString(256); // fallback
    private CobolString sdtyyyyl = new CobolString(256); // fallback
    private CobolString edtmmi = new CobolString(256); // fallback
    private CobolString edtmml = new CobolString(256); // fallback
    private CobolString edtddi = new CobolString(256); // fallback
    private CobolString edtddl = new CobolString(256); // fallback
    private CobolString edtyyyyi = new CobolString(256); // fallback
    private CobolString edtyyyyl = new CobolString(256); // fallback
    private CobolString err_flg_on = new CobolString(256); // fallback
    private CobolString dfhgreen = new CobolString(256); // fallback
    private CobolString errmsgc = new CobolString(256); // fallback
    private CobolString confirmi = new CobolString(256); // fallback
    private CobolString confirml = new CobolString(256); // fallback
    private CobolString end_loop_no = new CobolString(256); // fallback
    private CobolString end_loop_yes = new CobolString(256); // fallback
    private CobolString[] dfhresp = new CobolString[100]; // fallback array
    private CobolString normal = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString cdemo_pgm_context = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString xctl = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString ccda_title01 = new CobolString(256); // fallback
    private CobolString title01o = new CobolString(256); // fallback
    private CobolString ccda_title02 = new CobolString(256); // fallback
    private CobolString title02o = new CobolString(256); // fallback
    private CobolString trnnameo = new CobolString(256); // fallback
    private CobolString pgmnameo = new CobolString(256); // fallback
    private CobolString ws_curdate_mm = new CobolString(256); // fallback
    private CobolString ws_curdate_dd = new CobolString(256); // fallback
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

    private void main_para() {
        err_flg_off.set(String.valueOf(cb_true));
        transact_not_eof.set(String.valueOf(cb_true));
        send_erase_yes.set(String.valueOf(cb_true));
        ws_message.set(String.valueOf(" "));
        errmsgo.set(String.valueOf(" "));
        if (String.valueOf(eibcalen).equals(String.valueOf(0))) {
            cdemo_to_program.set(String.valueOf("COSGN00C"));
            return_to_prev_screen();
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, Integer.parseInt(String.valueOf(eibcalen).trim()))));
            if (!(!String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
                cdemo_pgm_reenter.set(String.valueOf(cb_true));
                corpt0ao.set(String.valueOf("\u0000"));
                monthlyl.set(String.valueOf(-1));
                send_trnrpt_screen();
            } else {
                receive_trnrpt_screen();
                if (String.valueOf(eibaid).equals(String.valueOf(dfhenter))) {
                    process_enter_key();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf3))) {
                    cdemo_to_program.set(String.valueOf("COMEN01C"));
                    return_to_prev_screen();
                } else {
                    ws_err_flg.set(String.valueOf("Y"));
                    monthlyl.set(String.valueOf(-1));
                    ws_message.set(String.valueOf(ccda_msg_invalid_key));
                    send_trnrpt_screen();
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
        CobolDisplay.display("PROCESS ENTER KEY");
        if (!String.valueOf(monthlyi).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            ws_report_name.set(String.valueOf("Monthly"));
            ws_curdate_data.set(String.valueOf(CobolIntrinsics.current_date()));
            ws_start_date_yyyy.set(String.valueOf(ws_curdate_year));
            ws_start_date_mm.set(String.valueOf(ws_curdate_month));
            ws_start_date_dd.set(String.valueOf("01"));
            parm_start_date_1.set(String.valueOf(ws_start_date));
            parm_start_date_2.set(String.valueOf(ws_start_date));
            ws_curdate_day.set(String.valueOf(1));
            ws_curdate_month.set(new BigDecimal(String.valueOf(ws_curdate_month).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            if (Integer.parseInt(String.valueOf(ws_curdate_month).trim()) > 12) {
                ws_curdate_year.set(new BigDecimal(String.valueOf(ws_curdate_year).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
                ws_curdate_month.set(String.valueOf(1));
            }
    // ws_curdate_n.set(String.valueOf(CobolIntrinsics.date_of_integer((CobolIntrinsics.integer_of_date(ws_curdate_n) - 1))));
            ws_end_date_yyyy.set(String.valueOf(ws_curdate_year));
            ws_end_date_mm.set(String.valueOf(ws_curdate_month));
            ws_end_date_dd.set(String.valueOf(ws_curdate_day));
            parm_end_date_1.set(String.valueOf(ws_end_date));
            parm_end_date_2.set(String.valueOf(ws_end_date));
            submit_job_to_intrdr();
        } else if (!String.valueOf(yearlyi).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            ws_report_name.set(String.valueOf("Yearly"));
            ws_curdate_data.set(String.valueOf(CobolIntrinsics.current_date()));
            ws_start_date_yyyy.set(String.valueOf(ws_curdate_year));
            ws_end_date_yyyy.set(String.valueOf(ws_curdate_year));
            ws_start_date_mm.set(String.valueOf("01"));
            ws_start_date_dd.set(String.valueOf("01"));
            parm_start_date_1.set(String.valueOf(ws_start_date));
            parm_start_date_2.set(String.valueOf(ws_start_date));
            ws_end_date_mm.set(String.valueOf("12"));
            ws_end_date_dd.set(String.valueOf("31"));
            parm_end_date_1.set(String.valueOf(ws_end_date));
            parm_end_date_2.set(String.valueOf(ws_end_date));
            submit_job_to_intrdr();
        } else if (!String.valueOf(customi).trim().isEmpty()) {
            /* RAW: NOT = SPACES AND LOW-VALUES */
            if (!String.valueOf(sdtmmi).trim().isEmpty()) {
                /* RAW: = SPACES OR LOW-VALUES */
                ws_message.set(String.valueOf("Start Date - Month can NOT be empty..."));
                ws_err_flg.set(String.valueOf("Y"));
                sdtmml.set(String.valueOf(-1));
                send_trnrpt_screen();
            } else if (!String.valueOf(sdtddi).trim().isEmpty()) {
                /* RAW: = SPACES OR LOW-VALUES */
                ws_message.set(String.valueOf("Start Date - Day can NOT be empty..."));
                ws_err_flg.set(String.valueOf("Y"));
                sdtddl.set(String.valueOf(-1));
                send_trnrpt_screen();
            } else if (!String.valueOf(sdtyyyyi).trim().isEmpty()) {
                /* RAW: = SPACES OR LOW-VALUES */
                ws_message.set(String.valueOf("Start Date - Year can NOT be empty..."));
                ws_err_flg.set(String.valueOf("Y"));
                sdtyyyyl.set(String.valueOf(-1));
                send_trnrpt_screen();
            } else if (!String.valueOf(edtmmi).trim().isEmpty()) {
                /* RAW: = SPACES OR LOW-VALUES */
                ws_message.set(String.valueOf("End Date - Month can NOT be empty..."));
                ws_err_flg.set(String.valueOf("Y"));
                edtmml.set(String.valueOf(-1));
                send_trnrpt_screen();
            } else if (!String.valueOf(edtddi).trim().isEmpty()) {
                /* RAW: = SPACES OR LOW-VALUES */
                ws_message.set(String.valueOf("End Date - Day can NOT be empty..."));
                ws_err_flg.set(String.valueOf("Y"));
                edtddl.set(String.valueOf(-1));
                send_trnrpt_screen();
            } else if (!String.valueOf(edtyyyyi).trim().isEmpty()) {
                /* RAW: = SPACES OR LOW-VALUES */
                ws_message.set(String.valueOf("End Date - Year can NOT be empty..."));
                ws_err_flg.set(String.valueOf("Y"));
                edtyyyyl.set(String.valueOf(-1));
                send_trnrpt_screen();
            } else {
                /* CONTINUE */
            }
            ws_num_99 = new BigDecimal(String.valueOf(CobolIntrinsics.numval_c(sdtmmi)).trim()).intValue();
            sdtmmi.set(String.valueOf(ws_num_99));
            ws_num_99 = new BigDecimal(String.valueOf(CobolIntrinsics.numval_c(sdtddi)).trim()).intValue();
            sdtddi.set(String.valueOf(ws_num_99));
            ws_num_9999 = new BigDecimal(String.valueOf(CobolIntrinsics.numval_c(sdtyyyyi)).trim()).intValue();
            sdtyyyyi.set(String.valueOf(ws_num_9999));
            ws_num_99 = new BigDecimal(String.valueOf(CobolIntrinsics.numval_c(edtmmi)).trim()).intValue();
            edtmmi.set(String.valueOf(ws_num_99));
            ws_num_99 = new BigDecimal(String.valueOf(CobolIntrinsics.numval_c(edtddi)).trim()).intValue();
            edtddi.set(String.valueOf(ws_num_99));
            ws_num_9999 = new BigDecimal(String.valueOf(CobolIntrinsics.numval_c(edtyyyyi)).trim()).intValue();
            edtyyyyi.set(String.valueOf(ws_num_9999));
            if ((!CobolIntrinsics.isNumeric(sdtmmi) || String.valueOf(sdtmmi).compareTo(String.valueOf("12")) > 0)) {
                ws_message.set(String.valueOf("Start Date - Not a valid Month..."));
                ws_err_flg.set(String.valueOf("Y"));
                sdtmml.set(String.valueOf(-1));
                send_trnrpt_screen();
            }
            if ((!CobolIntrinsics.isNumeric(sdtddi) || String.valueOf(sdtddi).compareTo(String.valueOf("31")) > 0)) {
                ws_message.set(String.valueOf("Start Date - Not a valid Day..."));
                ws_err_flg.set(String.valueOf("Y"));
                sdtddl.set(String.valueOf(-1));
                send_trnrpt_screen();
            }
            if (!CobolIntrinsics.isNumeric(sdtyyyyi)) {
                ws_message.set(String.valueOf("Start Date - Not a valid Year..."));
                ws_err_flg.set(String.valueOf("Y"));
                sdtyyyyl.set(String.valueOf(-1));
                send_trnrpt_screen();
            }
            if ((!CobolIntrinsics.isNumeric(edtmmi) || String.valueOf(edtmmi).compareTo(String.valueOf("12")) > 0)) {
                ws_message.set(String.valueOf("End Date - Not a valid Month..."));
                ws_err_flg.set(String.valueOf("Y"));
                edtmml.set(String.valueOf(-1));
                send_trnrpt_screen();
            }
            if ((!CobolIntrinsics.isNumeric(edtddi) || String.valueOf(edtddi).compareTo(String.valueOf("31")) > 0)) {
                ws_message.set(String.valueOf("End Date - Not a valid Day..."));
                ws_err_flg.set(String.valueOf("Y"));
                edtddl.set(String.valueOf(-1));
                send_trnrpt_screen();
            }
            if (!CobolIntrinsics.isNumeric(edtyyyyi)) {
                ws_message.set(String.valueOf("End Date - Not a valid Year..."));
                ws_err_flg.set(String.valueOf("Y"));
                edtyyyyl.set(String.valueOf(-1));
                send_trnrpt_screen();
            }
            ws_start_date_yyyy.set(String.valueOf(sdtyyyyi));
            ws_start_date_mm.set(String.valueOf(sdtmmi));
            ws_start_date_dd.set(String.valueOf(sdtddi));
            ws_end_date_yyyy.set(String.valueOf(edtyyyyi));
            ws_end_date_mm.set(String.valueOf(edtmmi));
            ws_end_date_dd.set(String.valueOf(edtddi));
            csutldtc_date.set(String.valueOf(ws_start_date));
            csutldtc_date_format.set(String.valueOf(ws_date_format));
            csutldtc_result.set(String.valueOf(" "));
            CobolProgram.call("CSUTLDTC", csutldtc_date, csutldtc_date_format, csutldtc_result);
            if (String.valueOf(csutldtc_result_sev_cd).equals(String.valueOf("0000"))) {
                /* CONTINUE */
            } else {
                if (!String.valueOf(csutldtc_result_msg_num).equals(String.valueOf("2513"))) {
                    ws_message.set(String.valueOf("Start Date - Not a valid date..."));
                    ws_err_flg.set(String.valueOf("Y"));
                    sdtmml.set(String.valueOf(-1));
                    send_trnrpt_screen();
                }
            }
            csutldtc_date.set(String.valueOf(ws_end_date));
            csutldtc_date_format.set(String.valueOf(ws_date_format));
            csutldtc_result.set(String.valueOf(" "));
            CobolProgram.call("CSUTLDTC", csutldtc_date, csutldtc_date_format, csutldtc_result);
            if (String.valueOf(csutldtc_result_sev_cd).equals(String.valueOf("0000"))) {
                /* CONTINUE */
            } else {
                if (!String.valueOf(csutldtc_result_msg_num).equals(String.valueOf("2513"))) {
                    ws_message.set(String.valueOf("End Date - Not a valid date..."));
                    ws_err_flg.set(String.valueOf("Y"));
                    edtmml.set(String.valueOf(-1));
                    send_trnrpt_screen();
                }
            }
            parm_start_date_1.set(String.valueOf(ws_start_date));
            parm_start_date_2.set(String.valueOf(ws_start_date));
            parm_end_date_1.set(String.valueOf(ws_end_date));
            parm_end_date_2.set(String.valueOf(ws_end_date));
            ws_report_name.set(String.valueOf("Custom"));
            if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
                submit_job_to_intrdr();
            }
        } else {
            ws_message.set(String.valueOf("Select a report type to print report..."));
            ws_err_flg.set(String.valueOf("Y"));
            monthlyl.set(String.valueOf(-1));
            send_trnrpt_screen();
        }
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            initialize_all_fields();
            errmsgc.set(String.valueOf(dfhgreen));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append(CobolString.delimitedBy(String.valueOf(ws_report_name), " "));
                _sb.append(" report submitted for printing ...");
                ws_message.set(_sb.toString());
            }
            monthlyl.set(String.valueOf(-1));
            send_trnrpt_screen();
        }
    }

    private void submit_job_to_intrdr() {
        if ((String.valueOf(confirmi).equals(String.valueOf(" ")) || true)) {
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("Please confirm to print the ");
                _sb.append(CobolString.delimitedBy(String.valueOf(ws_report_name), " "));
                _sb.append(" report...");
                ws_message.set(_sb.toString());
            }
            ws_err_flg.set(String.valueOf("Y"));
            confirml.set(String.valueOf(-1));
            send_trnrpt_screen();
        }
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            if (!String.valueOf(confirmi).trim().isEmpty()) {
                /* RAW: = 'Y' OR 'y' */
                /* CONTINUE */
            } else if (!String.valueOf(confirmi).trim().isEmpty()) {
                /* RAW: = 'N' OR 'n' */
                initialize_all_fields();
                ws_err_flg.set(String.valueOf("Y"));
                send_trnrpt_screen();
            } else {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append("\"");
                    _sb.append(CobolString.delimitedBy(String.valueOf(confirmi), " "));
                    _sb.append("\" is not a valid value to confirm...");
                    ws_message.set(_sb.toString());
                }
                ws_err_flg.set(String.valueOf("Y"));
                confirml.set(String.valueOf(-1));
                send_trnrpt_screen();
            }
            end_loop_no.set(String.valueOf(cb_true));
            for (ws_idx = 1; !(((ws_idx > 1000 || !String.valueOf(end_loop_yes).trim().isEmpty()) || !String.valueOf(err_flg_on).trim().isEmpty())); ws_idx += 1) {
                jcl_record.set(String.valueOf(job_lines[ws_idx - 1]));
                if (((String.valueOf(jcl_record).equals(String.valueOf("/*EOF")) || String.valueOf(jcl_record).equals(String.valueOf(" "))) || true)) {
                    end_loop_yes.set(String.valueOf(cb_true));
                }
                wirte_jobsub_tdq();
            }
        }
    }

    private void wirte_jobsub_tdq() {
        /* RAW: EXEC CICS WRITEQ TD QUEUE ( */
    }

    private void end_exec_2() {
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("RESP:" + String.valueOf(ws_resp_cd) + "REAS:" + String.valueOf(ws_reas_cd));
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to Write TDQ (JOBS)..."));
            monthlyl.set(String.valueOf(-1));
            send_trnrpt_screen();
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

    private void end_exec_3() {
    }

    private void send_trnrpt_screen() {
        populate_header_info();
        errmsgo.set(String.valueOf(ws_message));
        if (!String.valueOf(send_erase_yes).trim().isEmpty()) {
            /* RAW: EXEC CICS SEND MAP ( 'CORPT0A' */
        } else {
            /* RAW: EXEC CICS SEND MAP ( 'CORPT0A' */
        }
        return_to_cics();
        return;
    }

    private void return_to_cics() {
        /* RAW: EXEC CICS */
        /* RETURN TRANSID */
        /* RAW: ( WS-TRANID ) COMMAREA ( CARDDEMO-COMMAREA */
    }

    private void end_exec_4() {
    }

    private void receive_trnrpt_screen() {
        /* RAW: EXEC CICS RECEIVE MAP ( 'CORPT0A' */
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

    private void initialize_all_fields() {
        monthlyl.set(String.valueOf(-1));
        monthlyi.set("");
        yearlyi.set("");
        customi.set("");
        sdtmmi.set("");
        sdtddi.set("");
        sdtyyyyi.set("");
        edtmmi.set("");
        edtddi.set("");
        edtyyyyi.set("");
        confirmi.set("");
    }

    private void ws_message() {
    }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Corpt00c().run();
    }
}
