package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cousr01c extends CobolProgram {
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

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA
    private CobolString[] lk_commarea = new CobolString[32767];


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString err_flg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString cousr1ao = new CobolString(256); // fallback
    private CobolString fnamel = new CobolString(256); // fallback
    private CobolString eibaid = new CobolString(256); // fallback
    private CobolString ccda_msg_invalid_key = new CobolString(256); // fallback
    private CobolString dfhenter = new CobolString(256); // fallback
    private CobolString dfhpf3 = new CobolString(256); // fallback
    private CobolString dfhpf4 = new CobolString(256); // fallback
    private CobolString fnamei = new CobolString(256); // fallback
    private CobolString lnamei = new CobolString(256); // fallback
    private CobolString lnamel = new CobolString(256); // fallback
    private CobolString useridi = new CobolString(256); // fallback
    private CobolString useridl = new CobolString(256); // fallback
    private CobolString passwdi = new CobolString(256); // fallback
    private CobolString passwdl = new CobolString(256); // fallback
    private CobolString usrtypei = new CobolString(256); // fallback
    private CobolString usrtypel = new CobolString(256); // fallback
    private CobolString err_flg_on = new CobolString(256); // fallback
    private CobolString sec_usr_id = new CobolString(256); // fallback
    private CobolString sec_usr_fname = new CobolString(256); // fallback
    private CobolString sec_usr_lname = new CobolString(256); // fallback
    private CobolString sec_usr_pwd = new CobolString(256); // fallback
    private CobolString sec_usr_type = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
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
    private CobolString[] dataset = new CobolString[100]; // fallback array
    private CobolString sec_user_data = new CobolString(256); // fallback
    private CobolString[] dfhresp = new CobolString[100]; // fallback array
    private CobolString normal = new CobolString(256); // fallback
    private CobolString dfhgreen = new CobolString(256); // fallback
    private CobolString errmsgc = new CobolString(256); // fallback
    private CobolString dupkey = new CobolString(256); // fallback
    private CobolString duprec = new CobolString(256); // fallback

    private void main_para() {
        err_flg_off.set(String.valueOf(cb_true));
        ws_message.set(String.valueOf(" "));
        errmsgo.set(String.valueOf(" "));
        if (String.valueOf(eibcalen).equals(String.valueOf(0))) {
            cdemo_to_program.set(String.valueOf("COSGN00C"));
            return_to_prev_screen();
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, Integer.parseInt(String.valueOf(eibcalen).trim()))));
            if (!(!String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
                cdemo_pgm_reenter.set(String.valueOf(cb_true));
                cousr1ao.set(String.valueOf("\u0000"));
                fnamel.set(String.valueOf(-1));
                send_usradd_screen();
            } else {
                receive_usradd_screen();
                if (String.valueOf(eibaid).equals(String.valueOf(dfhenter))) {
                    process_enter_key();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf3))) {
                    cdemo_to_program.set(String.valueOf("COADM01C"));
                    return_to_prev_screen();
                } else if (String.valueOf(eibaid).equals(String.valueOf(dfhpf4))) {
                    clear_current_screen();
                } else {
                    ws_err_flg.set(String.valueOf("Y"));
                    fnamel.set(String.valueOf(-1));
                    ws_message.set(String.valueOf(ccda_msg_invalid_key));
                    send_usradd_screen();
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
        if (!String.valueOf(fnamei).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("First Name can NOT be empty..."));
            fnamel.set(String.valueOf(-1));
            send_usradd_screen();
        } else if (!String.valueOf(lnamei).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Last Name can NOT be empty..."));
            lnamel.set(String.valueOf(-1));
            send_usradd_screen();
        } else if (!String.valueOf(useridi).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("User ID can NOT be empty..."));
            useridl.set(String.valueOf(-1));
            send_usradd_screen();
        } else if (!String.valueOf(passwdi).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Password can NOT be empty..."));
            passwdl.set(String.valueOf(-1));
            send_usradd_screen();
        } else if (!String.valueOf(usrtypei).trim().isEmpty()) {
            /* RAW: = SPACES OR LOW-VALUES */
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("User Type can NOT be empty..."));
            usrtypel.set(String.valueOf(-1));
            send_usradd_screen();
        } else {
            fnamel.set(String.valueOf(-1));
            /* CONTINUE */
        }
        if (!(!String.valueOf(err_flg_on).trim().isEmpty())) {
            sec_usr_id.set(String.valueOf(useridi));
            sec_usr_fname.set(String.valueOf(fnamei));
            sec_usr_lname.set(String.valueOf(lnamei));
            sec_usr_pwd.set(String.valueOf(passwdi));
            sec_usr_type.set(String.valueOf(usrtypei));
            write_user_sec_file();
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

    private void send_usradd_screen() {
        populate_header_info();
        errmsgo.set(String.valueOf(ws_message));
        exec.set(String.valueOf(ws_message));
        cics.set(String.valueOf(ws_message));
        send.set(String.valueOf(ws_message));
        if (map[0 /* non-numeric literal: COUSR1A */ - 1] == null) map[0 /* non-numeric literal: COUSR1A */ - 1] = new CobolString(256);
        map[0 /* non-numeric literal: COUSR1A */ - 1].set(String.valueOf(ws_message));
        if (mapset[0 /* non-numeric literal: COUSR01 */ - 1] == null) mapset[0 /* non-numeric literal: COUSR01 */ - 1] = new CobolString(256);
        mapset[0 /* non-numeric literal: COUSR01 */ - 1].set(String.valueOf(ws_message));
        if (from[Integer.parseInt(String.valueOf(cousr1ao).trim()) - 1] == null) from[Integer.parseInt(String.valueOf(cousr1ao).trim()) - 1] = new CobolString(256);
        from[Integer.parseInt(String.valueOf(cousr1ao).trim()) - 1].set(String.valueOf(ws_message));
        erase.set(String.valueOf(ws_message));
        cursor.set(String.valueOf(ws_message));
    }

    private void end_exec_3() {
    }

    private void receive_usradd_screen() {
        /* RAW: EXEC CICS RECEIVE MAP ( 'COUSR1A' */
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

    private void write_user_sec_file() {
        /* RAW: EXEC CICS */
        /* WRITE DATASET — no file mapping */ // dataset[Integer.parseInt(String.valueOf(ws_usrsec_file).trim()) - 1].write((sec_user_data));
        /* RAW: LENGTH ( LENGTH OF SEC-USER-DATA ) */
    }

    private void end_exec_5() {
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            initialize_all_fields();
            ws_message.set(String.valueOf(" "));
            errmsgc.set(String.valueOf(dfhgreen));
            {
                StringBuilder _sb = new StringBuilder();
                _sb.append("User ");
                _sb.append(CobolString.delimitedBy(String.valueOf(sec_usr_id), " "));
                _sb.append(" has been added ...");
                ws_message.set(_sb.toString());
            }
            send_usradd_screen();
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(dupkey).trim()) - 1]))) {
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(duprec).trim()) - 1]))) {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("User ID already exist..."));
            useridl.set(String.valueOf(-1));
            send_usradd_screen();
        } else {
            ws_err_flg.set(String.valueOf("Y"));
            ws_message.set(String.valueOf("Unable to Add User..."));
            fnamel.set(String.valueOf(-1));
            send_usradd_screen();
        }
    }

    private void clear_current_screen() {
        initialize_all_fields();
        send_usradd_screen();
    }

    private void initialize_all_fields() {
        fnamel.set(String.valueOf(-1));
        useridi.set(String.valueOf(" "));
        fnamei.set(String.valueOf(" "));
        lnamei.set(String.valueOf(" "));
        passwdi.set(String.valueOf(" "));
        usrtypei.set(String.valueOf(" "));
    }

    private void ws_message() {
    }

    @Override
    public void run() {
        main_para();
    }

    public static void main(String[] args) {
        new Cousr01c().run();
    }
}
