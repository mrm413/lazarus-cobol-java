package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Coadm01c extends CobolProgram {
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
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private CobolString ws_option_x = new CobolString(2);
    private int ws_option = 0;
    private short ws_idx = (short) 0;
    private CobolString ws_admin_opt_txt = new CobolString(40);

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA
    private CobolString[] lk_commarea = new CobolString[32767];


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString err_flg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString coadm1ao = new CobolString(256); // fallback
    private CobolString eibaid = new CobolString(256); // fallback
    private CobolString ccda_msg_invalid_key = new CobolString(256); // fallback
    private CobolString dfhenter = new CobolString(256); // fallback
    private CobolString dfhpf3 = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString optioni = new CobolString(256); // fallback
    private CobolString optiono = new CobolString(256); // fallback
    private CobolString cdemo_admin_opt_count = new CobolString(256); // fallback
    private CobolString err_flg_on = new CobolString(256); // fallback
    private CobolString[] cdemo_admin_opt_pgmname = new CobolString[100]; // fallback array
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_pgm_context = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString xctl = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString end_exec = new CobolString(256); // fallback
    private CobolString dfhgreen = new CobolString(256); // fallback
    private CobolString errmsgc = new CobolString(256); // fallback
    private CobolString send = new CobolString(256); // fallback
    private CobolString[] map = new CobolString[100]; // fallback array
    private CobolString[] mapset = new CobolString[100]; // fallback array
    private CobolString[] from = new CobolString[100]; // fallback array
    private CobolString erase = new CobolString(256); // fallback
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
    private CobolString[] cdemo_admin_opt_num = new CobolString[100]; // fallback array
    private CobolString[] cdemo_admin_opt_name = new CobolString[100]; // fallback array
    private CobolString optn001o = new CobolString(256); // fallback
    private CobolString optn002o = new CobolString(256); // fallback
    private CobolString optn003o = new CobolString(256); // fallback
    private CobolString optn004o = new CobolString(256); // fallback
    private CobolString optn005o = new CobolString(256); // fallback
    private CobolString optn006o = new CobolString(256); // fallback
    private CobolString optn007o = new CobolString(256); // fallback
    private CobolString optn008o = new CobolString(256); // fallback
    private CobolString optn009o = new CobolString(256); // fallback
    private CobolString optn010o = new CobolString(256); // fallback

    private void main_para() {
        /* RAW: EXEC CICS HANDLE CONDITION PGMIDERR ( */
        err_flg_off.set(String.valueOf(cb_true));
        ws_message.set(String.valueOf(" "));
        errmsgo.set(String.valueOf(" "));
        if (String.valueOf(eibcalen).equals(String.valueOf(0))) {
            cdemo_from_program.set(String.valueOf("COSGN00C"));
            return_to_signon_screen();
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, Integer.parseInt(String.valueOf(eibcalen).trim()))));
            if (!(!String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
                cdemo_pgm_reenter.set(String.valueOf(cb_true));
                coadm1ao.set(String.valueOf("\u0000"));
                send_menu_screen();
            } else {
                receive_menu_screen();
                if (String.valueOf(eibaid).equals(String.valueOf(dfhenter))) {
                    process_enter_key();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf3))) {
                    cdemo_to_program.set(String.valueOf("COSGN00C"));
                    return_to_signon_screen();
                } else {
                    ws_err_flg.set(String.valueOf("Y"));
                    ws_message.set(String.valueOf(ccda_msg_invalid_key));
                    send_menu_screen();
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
        for (ws_idx = (short) CobolIntrinsics.length(optioni); !((!String.valueOf(CobolString.refMod(optioni, ws_idx, 1)).equals(String.valueOf(" ")) || ws_idx == 1)); ws_idx += -1) {
        }
        ws_option_x.set(String.valueOf(CobolString.refMod(optioni, 1, ws_idx)));
        /* INSPECT WS-OPTION-X — 2 clause(s) */
        ws_option = new BigDecimal(String.valueOf(ws_option_x).trim()).intValue();
        optiono.set(String.valueOf(ws_option));
        if (((!CobolIntrinsics.isNumeric(ws_option) || ws_option > Integer.parseInt(String.valueOf(cdemo_admin_opt_count).trim())) || String.valueOf(ws_option).equals(String.valueOf(0)))) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Please enter a valid option number..."));
            send_menu_screen();
        }
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            if (!String.valueOf(CobolString.refMod(cdemo_admin_opt_pgmname[ws_option - 1], 1, 5)).equals(String.valueOf("DUMMY"))) {
                cdemo_from_tranid.set(String.valueOf(ws_tranid));
                cdemo_from_program.set(String.valueOf(ws_pgmname));
                cdemo_pgm_context.set(String.valueOf(0));
                exec.set(String.valueOf(0));
                cics.set(String.valueOf(0));
                xctl.set(String.valueOf(0));
                if (program[Integer.parseInt(String.valueOf(cdemo_admin_opt_pgmname[ws_option - 1]).trim()) - 1] == null) program[Integer.parseInt(String.valueOf(cdemo_admin_opt_pgmname[ws_option - 1]).trim()) - 1] = new CobolString(256);
                program[Integer.parseInt(String.valueOf(cdemo_admin_opt_pgmname[ws_option - 1]).trim()) - 1].set(String.valueOf(0));
                if (commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] == null) commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] = new CobolString(256);
                commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1].set(String.valueOf(0));
                end_exec.set(String.valueOf(0));
            }
            ws_message.set(String.valueOf(" "));
            errmsgc.set(String.valueOf(dfhgreen));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("This option ");
                _sb.append("is not installed ...");
                ws_message.set(_sb.toString());
            }
            send_menu_screen();
        }
    }

    private void return_to_signon_screen() {
        if ((String.valueOf(cdemo_to_program).equals(String.valueOf("\u0000")) || true)) {
            cdemo_to_program.set(String.valueOf("COSGN00C"));
        }
        /* RAW: EXEC CICS XCTL PROGRAM ( CDEMO-TO-PROGRAM */
    }

    private void end_exec_2() {
    }

    private void send_menu_screen() {
        populate_header_info();
        build_menu_options();
        errmsgo.set(String.valueOf(ws_message));
        exec.set(String.valueOf(ws_message));
        cics.set(String.valueOf(ws_message));
        send.set(String.valueOf(ws_message));
        if (map[0 /* non-numeric literal: COADM1A */ - 1] == null) map[0 /* non-numeric literal: COADM1A */ - 1] = new CobolString(256);
        map[0 /* non-numeric literal: COADM1A */ - 1].set(String.valueOf(ws_message));
        if (mapset[0 /* non-numeric literal: COADM01 */ - 1] == null) mapset[0 /* non-numeric literal: COADM01 */ - 1] = new CobolString(256);
        mapset[0 /* non-numeric literal: COADM01 */ - 1].set(String.valueOf(ws_message));
        if (from[Integer.parseInt(String.valueOf(coadm1ao).trim()) - 1] == null) from[Integer.parseInt(String.valueOf(coadm1ao).trim()) - 1] = new CobolString(256);
        from[Integer.parseInt(String.valueOf(coadm1ao).trim()) - 1].set(String.valueOf(ws_message));
        erase.set(String.valueOf(ws_message));
    }

    private void end_exec_3() {
    }

    private void receive_menu_screen() {
        /* RAW: EXEC CICS RECEIVE MAP ( 'COADM1A' */
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

    private void build_menu_options() {
        for (ws_idx = 1; !(ws_idx > Integer.parseInt(String.valueOf(cdemo_admin_opt_count).trim())); ws_idx += 1) {
            ws_admin_opt_txt.set(String.valueOf(" "));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append(String.valueOf(cdemo_admin_opt_num[ws_idx - 1]));
                _sb.append(". ");
                _sb.append(String.valueOf(cdemo_admin_opt_name[ws_idx - 1]));
                ws_admin_opt_txt.set(_sb.toString());
            }
            if (ws_idx == 1) {
                optn001o.set(String.valueOf(ws_admin_opt_txt));
            } else if (ws_idx == 2) {
                optn002o.set(String.valueOf(ws_admin_opt_txt));
            } else if (ws_idx == 3) {
                optn003o.set(String.valueOf(ws_admin_opt_txt));
            } else if (ws_idx == 4) {
                optn004o.set(String.valueOf(ws_admin_opt_txt));
            } else if (ws_idx == 5) {
                optn005o.set(String.valueOf(ws_admin_opt_txt));
            } else if (ws_idx == 6) {
                optn006o.set(String.valueOf(ws_admin_opt_txt));
            } else if (ws_idx == 7) {
                optn007o.set(String.valueOf(ws_admin_opt_txt));
            } else if (ws_idx == 8) {
                optn008o.set(String.valueOf(ws_admin_opt_txt));
            } else if (ws_idx == 9) {
                optn009o.set(String.valueOf(ws_admin_opt_txt));
            } else if (ws_idx == 10) {
                optn010o.set(String.valueOf(ws_admin_opt_txt));
            } else {
                /* CONTINUE */
            }
        }
    }

    private void pgmiderr_err_para() {
        ws_message.set(String.valueOf(" "));
        errmsgc.set(String.valueOf(dfhgreen));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("This option ");
            _sb.append("is not installed ...");
            ws_message.set(_sb.toString());
        }
        send_menu_screen();
        /* RAW: EXEC CICS */
        /* RETURN TRANSID */
        /* RAW: ( WS-TRANID ) COMMAREA ( CARDDEMO-COMMAREA */
    }

    private void end_exec_5() {
    }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Coadm01c().run();
    }
}
