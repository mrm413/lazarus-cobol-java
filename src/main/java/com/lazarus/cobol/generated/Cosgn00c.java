package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cosgn00c extends CobolProgram {
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
    private CobolString ws_user_id = new CobolString(8);
    private CobolString ws_user_pwd = new CobolString(8);

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA
    private CobolString[] lk_commarea = new CobolString[32767];


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile dataset = new CobolFile("DATASET", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString err_flg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString cosgn0ao = new CobolString(256); // fallback
    private CobolString useridl = new CobolString(256); // fallback
    private CobolString eibaid = new CobolString(256); // fallback
    private CobolString ccda_msg_invalid_key = new CobolString(256); // fallback
    private CobolString dfhenter = new CobolString(256); // fallback
    private CobolString dfhpf3 = new CobolString(256); // fallback
    private CobolString ccda_msg_thank_you = new CobolString(256); // fallback
    private CobolString useridi = new CobolString(256); // fallback
    private CobolString passwdi = new CobolString(256); // fallback
    private CobolString passwdl = new CobolString(256); // fallback
    private CobolString cdemo_user_id = new CobolString(256); // fallback
    private CobolString err_flg_on = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
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
    private CobolString assign = new CobolString(256); // fallback
    private CobolString[] applid = new CobolString[100]; // fallback array
    private CobolString applido = new CobolString(256); // fallback
    private CobolString end_exec = new CobolString(256); // fallback
    private CobolString[] sysid = new CobolString[100]; // fallback array
    private CobolString sysido = new CobolString(256); // fallback
    private CobolString sec_usr_pwd = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString sec_usr_type = new CobolString(256); // fallback
    private CobolString cdemo_user_type = new CobolString(256); // fallback
    private CobolString cdemo_pgm_context = new CobolString(256); // fallback
    private CobolString cdemo_usrtyp_admin = new CobolString(256); // fallback

    private void main_para() {
        err_flg_off.set(String.valueOf(cb_true));
        ws_message.set(String.valueOf(" "));
        errmsgo.set(String.valueOf(" "));
        if (String.valueOf(eibcalen).equals(String.valueOf(0))) {
            cosgn0ao.set(String.valueOf("\u0000"));
            useridl.set(String.valueOf(-1));
            send_signon_screen();
        } else {
            if (String.valueOf(eibaid).equals(String.valueOf(dfhenter))) {
                process_enter_key();
            } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf3))) {
                ws_message.set(String.valueOf(ccda_msg_thank_you));
                send_plain_text();
            } else {
                ws_err_flg.set(String.valueOf("Y"));
                ws_message.set(String.valueOf(ccda_msg_invalid_key));
                send_signon_screen();
            }
        }
        /* RAW: EXEC CICS */
        /* RETURN TRANSID */
        /* RAW: ( WS-TRANID ) COMMAREA ( CARDDEMO-COMMAREA */
    }

    private void end_exec() {
    }

    private void process_enter_key() {
        /* RAW: EXEC CICS RECEIVE MAP ( 'COSGN0A' */
    }

    private void end_exec_2() {
        if (!String.valueOf(useridi).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Please enter User ID ..."));
            useridl.set(String.valueOf(-1));
            send_signon_screen();
        } else if (!String.valueOf(passwdi).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Please enter Password ..."));
            passwdl.set(String.valueOf(-1));
            send_signon_screen();
        } else {
            /* CONTINUE */
        }
        ws_user_id.set(String.valueOf(CobolIntrinsics.upper_case(useridi)));
        cdemo_user_id.set(String.valueOf(CobolIntrinsics.upper_case(useridi)));
        ws_user_pwd.set(String.valueOf(CobolIntrinsics.upper_case(passwdi)));
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            read_user_sec_file();
        }
    }

    private void send_signon_screen() {
        populate_header_info();
        errmsgo.set(String.valueOf(ws_message));
        exec.set(String.valueOf(ws_message));
        cics.set(String.valueOf(ws_message));
        send.set(String.valueOf(ws_message));
        if (map[0 /* non-numeric literal: COSGN0A */ - 1] == null) map[0 /* non-numeric literal: COSGN0A */ - 1] = new CobolString(256);
        map[0 /* non-numeric literal: COSGN0A */ - 1].set(String.valueOf(ws_message));
        if (mapset[0 /* non-numeric literal: COSGN00 */ - 1] == null) mapset[0 /* non-numeric literal: COSGN00 */ - 1] = new CobolString(256);
        mapset[0 /* non-numeric literal: COSGN00 */ - 1].set(String.valueOf(ws_message));
        if (from[Integer.parseInt(String.valueOf(cosgn0ao).trim()) - 1] == null) from[Integer.parseInt(String.valueOf(cosgn0ao).trim()) - 1] = new CobolString(256);
        from[Integer.parseInt(String.valueOf(cosgn0ao).trim()) - 1].set(String.valueOf(ws_message));
        erase.set(String.valueOf(ws_message));
        cursor.set(String.valueOf(ws_message));
    }

    private void end_exec_3() {
    }

    private void send_plain_text() {
        /* RAW: EXEC CICS SEND TEXT FROM ( */
    }

    private void end_exec_4() {
        /* RAW: EXEC CICS */
        /* RETURN END-EXEC */
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
        exec.set(String.valueOf(ws_curtime_hh_mm_ss));
        cics.set(String.valueOf(ws_curtime_hh_mm_ss));
        assign.set(String.valueOf(ws_curtime_hh_mm_ss));
        if (applid[Integer.parseInt(String.valueOf(applido).trim()) - 1] == null) applid[Integer.parseInt(String.valueOf(applido).trim()) - 1] = new CobolString(256);
        applid[Integer.parseInt(String.valueOf(applido).trim()) - 1].set(String.valueOf(ws_curtime_hh_mm_ss));
        end_exec.set(String.valueOf(ws_curtime_hh_mm_ss));
        exec.set(String.valueOf(ws_curtime_hh_mm_ss));
        cics.set(String.valueOf(ws_curtime_hh_mm_ss));
        assign.set(String.valueOf(ws_curtime_hh_mm_ss));
        if (sysid[Integer.parseInt(String.valueOf(sysido).trim()) - 1] == null) sysid[Integer.parseInt(String.valueOf(sysido).trim()) - 1] = new CobolString(256);
        sysid[Integer.parseInt(String.valueOf(sysido).trim()) - 1].set(String.valueOf(ws_curtime_hh_mm_ss));
    }

    private void end_exec_5() {
    }

    private void read_user_sec_file() {
        /* RAW: EXEC CICS */
        if (dataset.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( WS-USRSEC-FILE ) INTO ( SEC-USER-DATA */
    }

    private void end_exec_6() {
        if (ws_resp_cd == 0) {
            if (String.valueOf(sec_usr_pwd).equals(String.valueOf(ws_user_pwd))) {
                cdemo_from_tranid.set(String.valueOf(ws_tranid));
                cdemo_from_program.set(String.valueOf(ws_pgmname));
                cdemo_user_id.set(String.valueOf(ws_user_id));
                cdemo_user_type.set(String.valueOf(sec_usr_type));
                cdemo_pgm_context.set(String.valueOf(0));
                if (!String.valueOf(cdemo_usrtyp_admin).trim().isEmpty()) {
                    /* RAW: EXEC CICS XCTL PROGRAM ( 'COADM01C' */
                } else {
                    /* RAW: EXEC CICS XCTL PROGRAM ( 'COMEN01C' */
                }
            } else {
                ws_message.set(String.valueOf("Wrong Password. Try again ..."));
                passwdl.set(String.valueOf(-1));
                send_signon_screen();
            }
        } else if (ws_resp_cd == 13) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("User not found. Try again ..."));
            useridl.set(String.valueOf(-1));
            send_signon_screen();
        } else {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to verify the User ..."));
            useridl.set(String.valueOf(-1));
            send_signon_screen();
        }
    }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Cosgn00c().run();
    }
}
