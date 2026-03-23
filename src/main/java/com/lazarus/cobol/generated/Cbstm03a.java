package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cbstm03a extends CobolProgram {
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
    private short align_psa = (short) 0;
    private CobolString psa_block = new CobolString(1); // Group: PSA-BLOCK
    private long tcb_point = 0L;
    private CobolString tcb_block = new CobolString(1); // Group: TCB-BLOCK
    private long tiot_point = 0L;
    private CobolString tiot_block = new CobolString(1); // Group: TIOT-BLOCK
    private CobolString tiotnjob = new CobolString(8);
    private CobolString tiotjstp = new CobolString(8);
    private CobolString tiotpstp = new CobolString(8);
    private CobolString tiot_entry = new CobolString(1); // Group: TIOT-ENTRY
    private CobolString tiot_seg = new CobolString(1); // Group: TIOT-SEG
    private CobolString tio_len = new CobolString(1);
    private CobolString tiocddnm = new CobolString(8);
    private CobolString ucb_addr = new CobolString(3);

    // FILE SECTION — STMT-FILE
    private CobolString fd_stmtfile_rec = new CobolString(80);

    // FILE SECTION — HTML-FILE
    private CobolString fd_htmlfile_rec = new CobolString(100);


    // FILE DESCRIPTORS
    private CobolFile stmt_file = new CobolFile("STMTFILE", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile html_file = new CobolFile("HTMLFILE", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString address = new CobolString(256); // fallback
    private CobolString psaptr = new CobolString(256); // fallback
    private CobolString tiot_index = new CobolString(256); // fallback
    private CobolString bump_tiot = new CobolString(256); // fallback
    private CobolString end_of_tiot = new CobolString(256); // fallback
    private CobolString null_ucb = new CobolString(256); // fallback
    private CobolString ws_trnx_table = new CobolString(256); // fallback
    private CobolString ws_fl_dd = new CobolString(256); // fallback
    private CobolString end_of_file = new CobolString(256); // fallback
    private CobolString cr_jmp = new CobolString(256); // fallback
    private CobolString ws_total_amt = new CobolString(256); // fallback
    private CobolString m03b_read = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString ws_m03b_rc = new CobolString(256); // fallback
    private CobolString ws_m03b_fldt = new CobolString(256); // fallback
    private CobolString m03b_read_k = new CobolString(256); // fallback
    private CobolString xref_cust_id = new CobolString(256); // fallback
    private CobolString ws_m03b_key_ln = new CobolString(256); // fallback
    private CobolString xref_acct_id = new CobolString(256); // fallback
    private CobolString cr_cnt = new CobolString(256); // fallback
    private CobolString[] ws_card_num = new CobolString[100]; // fallback array
    private CobolString xref_card_num = new CobolString(256); // fallback
    private CobolString trnx_card_num = new CobolString(256); // fallback
    private CobolString tr_jmp = new CobolString(256); // fallback
    private CobolString[] ws_trct = new CobolString[100]; // fallback array
    private CobolString[] ws_tran_num = new CobolString[100]; // fallback array
    private CobolString trnx_id = new CobolString(256); // fallback
    private CobolString[] ws_tran_rest = new CobolString[100]; // fallback array
    private CobolString trnx_rest = new CobolString(256); // fallback
    private CobolString trnx_amt = new CobolString(256); // fallback
    private CobolString ws_trn_amt = new CobolString(256); // fallback
    private CobolString st_line12 = new CobolString(256); // fallback
    private CobolString st_line14a = new CobolString(256); // fallback
    private CobolString st_line15 = new CobolString(256); // fallback
    private CobolString html_ltrs = new CobolString(256); // fallback
    private CobolString html_fixed_ln = new CobolString(256); // fallback
    private CobolString html_l10 = new CobolString(256); // fallback
    private CobolString html_l75 = new CobolString(256); // fallback
    private CobolString html_ltde = new CobolString(256); // fallback
    private CobolString html_ltre = new CobolString(256); // fallback
    private CobolString html_l78 = new CobolString(256); // fallback
    private CobolString html_l79 = new CobolString(256); // fallback
    private CobolString html_l80 = new CobolString(256); // fallback
    private CobolString st_line0 = new CobolString(256); // fallback
    private CobolString cust_first_name = new CobolString(256); // fallback
    private CobolString cust_middle_name = new CobolString(256); // fallback
    private CobolString cust_last_name = new CobolString(256); // fallback
    private CobolString st_name = new CobolString(256); // fallback
    private CobolString cust_addr_line_1 = new CobolString(256); // fallback
    private CobolString cust_addr_line_2 = new CobolString(256); // fallback
    private CobolString cust_addr_line_3 = new CobolString(256); // fallback
    private CobolString cust_addr_state_cd = new CobolString(256); // fallback
    private CobolString cust_addr_country_cd = new CobolString(256); // fallback
    private CobolString cust_addr_zip = new CobolString(256); // fallback
    private CobolString st_add3 = new CobolString(256); // fallback
    private CobolString acct_id = new CobolString(256); // fallback
    private CobolString acct_curr_bal = new CobolString(256); // fallback
    private CobolString cust_fico_credit_score = new CobolString(256); // fallback
    private CobolString st_line1 = new CobolString(256); // fallback
    private CobolString st_line2 = new CobolString(256); // fallback
    private CobolString st_line3 = new CobolString(256); // fallback
    private CobolString st_line4 = new CobolString(256); // fallback
    private CobolString st_line5 = new CobolString(256); // fallback
    private CobolString st_line6 = new CobolString(256); // fallback
    private CobolString st_line7 = new CobolString(256); // fallback
    private CobolString st_line8 = new CobolString(256); // fallback
    private CobolString st_line9 = new CobolString(256); // fallback
    private CobolString st_line10 = new CobolString(256); // fallback
    private CobolString st_line11 = new CobolString(256); // fallback
    private CobolString st_line13 = new CobolString(256); // fallback
    private CobolString html_l01 = new CobolString(256); // fallback
    private CobolString html_l02 = new CobolString(256); // fallback
    private CobolString html_l03 = new CobolString(256); // fallback
    private CobolString html_l04 = new CobolString(256); // fallback
    private CobolString html_l05 = new CobolString(256); // fallback
    private CobolString html_l06 = new CobolString(256); // fallback
    private CobolString html_l07 = new CobolString(256); // fallback
    private CobolString html_l08 = new CobolString(256); // fallback
    private CobolString html_l11 = new CobolString(256); // fallback
    private CobolString html_l15 = new CobolString(256); // fallback
    private CobolString html_l16 = new CobolString(256); // fallback
    private CobolString html_l17 = new CobolString(256); // fallback
    private CobolString html_l18 = new CobolString(256); // fallback
    private CobolString html_l22_35 = new CobolString(256); // fallback
    private CobolString l23_name = new CobolString(256); // fallback
    private CobolString st_add1 = new CobolString(256); // fallback
    private CobolString html_addr_ln = new CobolString(256); // fallback
    private CobolString st_add2 = new CobolString(256); // fallback
    private CobolString html_l30_42 = new CobolString(256); // fallback
    private CobolString html_l31 = new CobolString(256); // fallback
    private CobolString st_acct_id = new CobolString(256); // fallback
    private CobolString html_bsic_ln = new CobolString(256); // fallback
    private CobolString st_curr_bal = new CobolString(256); // fallback
    private CobolString st_fico_score = new CobolString(256); // fallback
    private CobolString html_l43 = new CobolString(256); // fallback
    private CobolString html_l47 = new CobolString(256); // fallback
    private CobolString html_l48 = new CobolString(256); // fallback
    private CobolString html_l50 = new CobolString(256); // fallback
    private CobolString html_l51 = new CobolString(256); // fallback
    private CobolString html_l53 = new CobolString(256); // fallback
    private CobolString html_l54 = new CobolString(256); // fallback
    private CobolString trnx_desc = new CobolString(256); // fallback
    private CobolString st_line14 = new CobolString(256); // fallback
    private CobolString html_l58 = new CobolString(256); // fallback
    private CobolString st_tranid = new CobolString(256); // fallback
    private CobolString html_tran_ln = new CobolString(256); // fallback
    private CobolString html_l61 = new CobolString(256); // fallback
    private CobolString st_trandt = new CobolString(256); // fallback
    private CobolString html_l64 = new CobolString(256); // fallback
    private CobolString st_tranamt = new CobolString(256); // fallback
    private CobolString m03b_open = new CobolString(256); // fallback
    private CobolString ws_save_card = new CobolString(256); // fallback
    private CobolString tr_cnt = new CobolString(256); // fallback
    private CobolString cb_else = new CobolString(256); // fallback
    private CobolString trnx_record = new CobolString(256); // fallback
    private CobolString m03b_close = new CobolString(256); // fallback

    private void para_main() {
        address.set(String.valueOf(psaptr));
        address.set(String.valueOf(tcb_point));
        address.set(String.valueOf(tiot_point));
        tiot_index.set(String.valueOf(tiot_point));
        CobolDisplay.display("Running JCL : " + String.valueOf(tiotnjob) + " Step ");
    }

    private void tiotjstp() {
        bump_tiot.set(String.valueOf((Integer.parseInt(String.valueOf(bump_tiot).trim()) + CobolIntrinsics.length(tiot_block))));
        address.set(String.valueOf(tiot_index));
        CobolDisplay.display("DD Names from TIOT: ");
        while (!((!String.valueOf(end_of_tiot).trim().isEmpty() || String.valueOf(tio_len).equals(String.valueOf("\u0000"))))) {
            if (!(!String.valueOf(null_ucb).trim().isEmpty())) {
                CobolDisplay.display(": " + String.valueOf(tiocddnm) + " -- valid UCB");
            } else {
                CobolDisplay.display(": " + String.valueOf(tiocddnm) + " --  null UCB");
            }
            bump_tiot.set(String.valueOf((Integer.parseInt(String.valueOf(bump_tiot).trim()) + CobolIntrinsics.length(tiot_seg))));
            address.set(String.valueOf(tiot_index));
        }
        if (!(!String.valueOf(null_ucb).trim().isEmpty())) {
            CobolDisplay.display(": " + String.valueOf(tiocddnm) + " -- valid UCB");
        } else {
            CobolDisplay.display(": " + String.valueOf(tiocddnm) + " -- null  UCB");
        }
        stmt_file.open("OUTPUT");
    }

    private void html_file() {
        ws_trnx_table.set("");
    }

    private void ws_trn_tbl_cntr() {
        /* RAW: 0000 - */
    }

    private void para_start() {
        if (String.valueOf(ws_fl_dd).equals(String.valueOf("TRNXFILE"))) {
            /* ALTER 8100 TO - — not supported */
            /* RAW: FILE-OPEN TO PROCEED TO 8100 - */
            _8100();
            return;
        } else if (String.valueOf(ws_fl_dd).equals(String.valueOf("XREFFILE"))) {
            /* ALTER 8100 TO - — not supported */
            /* RAW: FILE-OPEN TO PROCEED TO 8200 - */
            _8100();
            return;
        } else if (String.valueOf(ws_fl_dd).equals(String.valueOf("CUSTFILE"))) {
            /* ALTER 8100 TO - — not supported */
            /* RAW: FILE-OPEN TO PROCEED TO 8300 - */
            _8100();
            return;
        } else if (String.valueOf(ws_fl_dd).equals(String.valueOf("ACCTFILE"))) {
            /* ALTER 8100 TO - — not supported */
            /* RAW: FILE-OPEN TO PROCEED TO 8400 - */
            _8100();
            return;
        } else if (String.valueOf(ws_fl_dd).equals(String.valueOf("READTRNX"))) {
            _8500();
            return;
        } else {
            _9999();
            return;
        }
        /* RAW: 1000 - */
    }

    private void mainline() {
        while (!(String.valueOf(end_of_file).equals(String.valueOf("Y")))) {
            if (String.valueOf(end_of_file).equals(String.valueOf("N"))) {
                _1000();
                /* RAW: - XREFFILE-GET-NEXT */
                if (String.valueOf(end_of_file).equals(String.valueOf("N"))) {
                    _2000();
                    /* RAW: - CUSTFILE-GET */
                    _3000();
                    /* RAW: - ACCTFILE-GET */
                    _5000();
                    /* RAW: - CREATE-STATEMENT */
                    cr_jmp.set(String.valueOf(1));
                    ws_total_amt.set(String.valueOf(0));
                    _4000();
                    /* RAW: - TRNXFILE-GET */
                }
            }
        }
        _9100();
        /* RAW: -  */
    }

    private void trnxfile_close() {
        _9200();
        /* RAW: -  */
    }

    private void xreffile_close() {
        _9300();
        /* RAW: -  */
    }

    private void custfile_close() {
        _9400();
        /* RAW: -  */
    }

    private void acctfile_close() {
        stmt_file.close();
    }

    private void html_file_2() {
        /* RAW: 9999 - */
        return;
    }

    private void xreffile_get_next() {
    }

    private void ws_m03b_dd() {
        m03b_read.set(String.valueOf(cb_true));
    }

    private void ws_m03b_rc() {
    }

    private void ws_m03b_fldt() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area() {
        if (String.valueOf(ws_m03b_rc).equals(String.valueOf("00"))) {
            /* CONTINUE */
        } else if (String.valueOf(ws_m03b_rc).equals(String.valueOf("10"))) {
            end_of_file.set(String.valueOf("Y"));
        } else {
            CobolDisplay.display("ERROR READING XREFFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
    }

    private void card_xref_record() {
        return;
    }

    private void custfile_get() {
    }

    private void ws_m03b_dd_2() {
        m03b_read_k.set(String.valueOf(cb_true));
    }

    private void ws_m03b_key() {
    }

    private void ws_m03b_key_ln() {
        ws_m03b_key_ln.set(String.valueOf(CobolIntrinsics.length(xref_cust_id)));
    }

    private void ws_m03b_rc_2() {
    }

    private void ws_m03b_fldt_2() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area_2() {
        if (String.valueOf(ws_m03b_rc).equals(String.valueOf("00"))) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR READING CUSTFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
    }

    private void customer_record() {
        return;
    }

    private void acctfile_get() {
    }

    private void ws_m03b_dd_3() {
        m03b_read_k.set(String.valueOf(cb_true));
    }

    private void ws_m03b_key_2() {
    }

    private void ws_m03b_key_ln_2() {
        ws_m03b_key_ln.set(String.valueOf(CobolIntrinsics.length(xref_acct_id)));
    }

    private void ws_m03b_rc_3() {
    }

    private void ws_m03b_fldt_3() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area_3() {
        if (String.valueOf(ws_m03b_rc).equals(String.valueOf("00"))) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR READING ACCTFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
    }

    private void account_record() {
        return;
    }

    private void trnxfile_get() {
        for (int _v = 1; !((String.valueOf(cr_jmp).compareTo(String.valueOf(cr_cnt)) > 0 || String.valueOf(ws_card_num[Integer.parseInt(String.valueOf(cr_jmp).trim()) - 1]).compareTo(String.valueOf(xref_card_num)) > 0)); _v += 1) {
            cr_jmp.set(String.valueOf(_v));
            if (String.valueOf(xref_card_num).equals(String.valueOf(ws_card_num[Integer.parseInt(String.valueOf(cr_jmp).trim()) - 1]))) {
                trnx_card_num.set(String.valueOf(ws_card_num[Integer.parseInt(String.valueOf(cr_jmp).trim()) - 1]));
    // for (int _v = 1; !(String.valueOf(tr_jmp).compareTo(String.valueOf(ws_trct[Integer.parseInt(String.valueOf(cr_jmp).trim()) - 1])) > 0); _v += 1) {
    // tr_jmp.set(String.valueOf(_v));
    // trnx_id.set(String.valueOf(ws_tran_num[Integer.parseInt(String.valueOf(cr_jmp).trim()) - 1][Integer.parseInt(String.valueOf(tr_jmp).trim()) - 1]));
    // trnx_rest.set(String.valueOf(ws_tran_rest[Integer.parseInt(String.valueOf(cr_jmp).trim()) - 1][Integer.parseInt(String.valueOf(tr_jmp).trim()) - 1]));
    // _6000();
    // /* RAW: - WRITE-TRANS */
    // ws_total_amt.set(new BigDecimal(String.valueOf(ws_total_amt).trim()).add(new BigDecimal(String.valueOf(trnx_amt).trim())).toPlainString());
    // }
            }
        }
    }

    private void ws_trn_amt() {
    }

    private void st_total_tramt() {
        stmt_file.write(st_line12);
        stmt_file.write(st_line14a);
        stmt_file.write(st_line15);
        html_ltrs.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l10.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l75.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltre.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l78.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l79.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l80.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        return;
    }

    private void create_statement() {
    }

    private void statement_lines() {
        stmt_file.write(st_line0);
        _5100();
        /* RAW: - WRITE-HTML-HEADER THRU 5100 - */
        return;
    }

    private void st_add1() {
    }

    private void st_add2() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy(String.valueOf(cust_addr_line_3), " "));
            _sb.append(" ");
            _sb.append(CobolString.delimitedBy(String.valueOf(cust_addr_state_cd), " "));
            _sb.append(" ");
            _sb.append(CobolString.delimitedBy(String.valueOf(cust_addr_country_cd), " "));
            _sb.append(" ");
            _sb.append(CobolString.delimitedBy(String.valueOf(cust_addr_zip), " "));
            _sb.append(" ");
            st_add3.set(_sb.toString());
        }
    }

    private void st_acct_id() {
    }

    private void st_curr_bal() {
    }

    private void st_fico_score() {
        _5200();
        /* RAW: - WRITE-HTML-NMADBS THRU 5200 - */
        return;
    }

    private void write_html_header() {
        html_l01.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l02.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l03.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l04.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l05.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l06.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l07.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l08.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltrs.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l10.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
    }

    private void l11_acct() {
        html_file.write(html_l11);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltre.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltrs.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l15.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l16.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l17.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l18.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltre.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltrs.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l22_35.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        /* RAW: 5100 - */
        return;
    }

    private void write_html_nmadbs() {
    }

    private void l23_name() {
        fd_htmlfile_rec.set(String.valueOf(" "));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy("<p style=\"font-size:16px\">", "*"));
            _sb.append(CobolString.delimitedBy(String.valueOf(l23_name), "  "));
            _sb.append("  ");
            _sb.append(CobolString.delimitedBy("</p>", "*"));
            fd_htmlfile_rec.set(_sb.toString());
        }
        html_file.write(fd_htmlfile_rec);
    }

    private void html_addr_ln() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy("<p>", "*"));
            _sb.append(CobolString.delimitedBy(String.valueOf(st_add1), "  "));
            _sb.append("  ");
            _sb.append(CobolString.delimitedBy("</p>", "*"));
            html_addr_ln.set(_sb.toString());
        }
        html_file.write(html_addr_ln);
    }

    private void html_addr_ln_2() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy("<p>", "*"));
            _sb.append(CobolString.delimitedBy(String.valueOf(st_add2), "  "));
            _sb.append("  ");
            _sb.append(CobolString.delimitedBy("</p>", "*"));
            html_addr_ln.set(_sb.toString());
        }
        html_file.write(html_addr_ln);
    }

    private void html_addr_ln_3() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy("<p>", "*"));
            _sb.append(CobolString.delimitedBy(String.valueOf(st_add3), "  "));
            _sb.append("  ");
            _sb.append(CobolString.delimitedBy("</p>", "*"));
            html_addr_ln.set(_sb.toString());
        }
        html_file.write(html_addr_ln);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltre.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltrs.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l30_42.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l31.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltre.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltrs.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l22_35.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
    }

    private void html_bsic_ln() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy("<p>Account ID         : ", "*"));
            _sb.append(CobolString.delimitedBy(String.valueOf(st_acct_id), "*"));
            _sb.append(CobolString.delimitedBy("</p>", "*"));
            html_bsic_ln.set(_sb.toString());
        }
        html_file.write(html_bsic_ln);
    }

    private void html_bsic_ln_2() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy("<p>Current Balance    : ", "*"));
            _sb.append(CobolString.delimitedBy(String.valueOf(st_curr_bal), "*"));
            _sb.append(CobolString.delimitedBy("</p>", "*"));
            html_bsic_ln.set(_sb.toString());
        }
        html_file.write(html_bsic_ln);
    }

    private void html_bsic_ln_3() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy("<p>FICO Score         : ", "*"));
            _sb.append(CobolString.delimitedBy(String.valueOf(st_fico_score), "*"));
            _sb.append(CobolString.delimitedBy("</p>", "*"));
            html_bsic_ln.set(_sb.toString());
        }
        html_file.write(html_bsic_ln);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltre.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltrs.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l30_42.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l43.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltre.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltrs.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l47.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l48.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l50.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l51.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l53.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l54.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltre.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        /* RAW: 5200 - */
        return;
    }

    private void write_trans() {
    }

    private void st_tranid() {
    }

    private void st_trandt() {
    }

    private void st_tranamt() {
        stmt_file.write(st_line14);
        html_ltrs.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l58.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
    }

    private void html_tran_ln() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy("<p>", "*"));
            _sb.append(CobolString.delimitedBy(String.valueOf(st_tranid), "*"));
            _sb.append(CobolString.delimitedBy("</p>", "*"));
            html_tran_ln.set(_sb.toString());
        }
        html_file.write(html_tran_ln);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l61.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
    }

    private void html_tran_ln_2() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy("<p>", "*"));
            _sb.append(CobolString.delimitedBy(String.valueOf(st_trandt), "*"));
            _sb.append(CobolString.delimitedBy("</p>", "*"));
            html_tran_ln.set(_sb.toString());
        }
        html_file.write(html_tran_ln);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_l64.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
    }

    private void html_tran_ln_3() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(CobolString.delimitedBy("<p>", "*"));
            _sb.append(CobolString.delimitedBy(String.valueOf(st_tranamt), "*"));
            _sb.append(CobolString.delimitedBy("</p>", "*"));
            html_tran_ln.set(_sb.toString());
        }
        html_file.write(html_tran_ln);
        html_ltde.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        html_ltre.set(String.valueOf(cb_true));
        html_file.write(html_fixed_ln);
        return;
    }

    private void file_open() {
        _8100();
        return;
    }

    private void trnxfile_open() {
    }

    private void ws_m03b_dd_4() {
        m03b_open.set(String.valueOf(cb_true));
    }

    private void ws_m03b_rc_4() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area_4() {
        if ((String.valueOf(ws_m03b_rc).equals(String.valueOf("00")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING TRNXFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        m03b_read.set(String.valueOf(cb_true));
    }

    private void ws_m03b_fldt_4() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area_5() {
        if ((String.valueOf(ws_m03b_rc).equals(String.valueOf("00")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR READING TRNXFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
    }

    private void trnx_record() {
    }

    private void ws_save_card() {
    }

    private void cr_cnt() {
    }

    private void tr_cnt() {
    }

    private void ws_fl_dd() {
        _0000();
        return;
    }

    private void para_start_2() {
        return;
    }

    private void xreffile_open() {
    }

    private void ws_m03b_dd_5() {
        m03b_open.set(String.valueOf(cb_true));
    }

    private void ws_m03b_rc_5() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area_6() {
        if ((String.valueOf(ws_m03b_rc).equals(String.valueOf("00")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING XREFFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
    }

    private void ws_fl_dd_2() {
        _0000();
        return;
    }

    private void para_start_3() {
        return;
    }

    private void custfile_open() {
    }

    private void ws_m03b_dd_6() {
        m03b_open.set(String.valueOf(cb_true));
    }

    private void ws_m03b_rc_6() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area_7() {
        if ((String.valueOf(ws_m03b_rc).equals(String.valueOf("00")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING CUSTFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
    }

    private void ws_fl_dd_3() {
        _0000();
        return;
    }

    private void para_start_4() {
        return;
    }

    private void acctfile_open() {
    }

    private void ws_m03b_dd_7() {
        m03b_open.set(String.valueOf(cb_true));
    }

    private void ws_m03b_rc_7() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area_8() {
        if ((String.valueOf(ws_m03b_rc).equals(String.valueOf("00")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR OPENING ACCTFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        _1000();
        return;
    }

    private void readtrnx_read() {
        if (String.valueOf(ws_save_card).equals(String.valueOf(trnx_card_num))) {
            tr_cnt.set(new BigDecimal(String.valueOf(tr_cnt).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            cb_else.set(new BigDecimal(String.valueOf(cb_else).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            if (ws_trct[Integer.parseInt(String.valueOf(cr_cnt).trim()) - 1] == null) ws_trct[Integer.parseInt(String.valueOf(cr_cnt).trim()) - 1] = new CobolString(256);
            ws_trct[Integer.parseInt(String.valueOf(cr_cnt).trim()) - 1].set(String.valueOf(tr_cnt));
            cr_cnt.set(new BigDecimal(String.valueOf(cr_cnt).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
            tr_cnt.set(String.valueOf(1));
        }
        if (ws_card_num[Integer.parseInt(String.valueOf(cr_cnt).trim()) - 1] == null) ws_card_num[Integer.parseInt(String.valueOf(cr_cnt).trim()) - 1] = new CobolString(256);
        ws_card_num[Integer.parseInt(String.valueOf(cr_cnt).trim()) - 1].set(String.valueOf(trnx_card_num));
    // if (ws_tran_num[Integer.parseInt(String.valueOf(cr_cnt).trim()) - 1][Integer.parseInt(String.valueOf(tr_cnt).trim()) - 1] == null) ws_tran_num[Integer.parseInt(String.valueOf(cr_cnt).trim()) - 1][Integer.parseInt(String.valueOf(tr_cnt).trim()) - 1] = new CobolString(256);
    // ws_tran_num[Integer.parseInt(String.valueOf(cr_cnt).trim()) - 1][Integer.parseInt(String.valueOf(tr_cnt).trim()) - 1].set(String.valueOf(trnx_id));
    // if (ws_tran_rest[Integer.parseInt(String.valueOf(cr_cnt).trim()) - 1][Integer.parseInt(String.valueOf(tr_cnt).trim()) - 1] == null) ws_tran_rest[Integer.parseInt(String.valueOf(cr_cnt).trim()) - 1][Integer.parseInt(String.valueOf(tr_cnt).trim()) - 1] = new CobolString(256);
    // ws_tran_rest[Integer.parseInt(String.valueOf(cr_cnt).trim()) - 1][Integer.parseInt(String.valueOf(tr_cnt).trim()) - 1].set(String.valueOf(trnx_rest));
    }

    private void ws_save_card_2() {
    }

    private void ws_m03b_dd_8() {
        m03b_read.set(String.valueOf(cb_true));
    }

    private void ws_m03b_fldt_5() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area_9() {
        if (String.valueOf(ws_m03b_rc).equals(String.valueOf("00"))) {
            trnx_record.set(String.valueOf(ws_m03b_fldt));
            _8500();
            return;
        } else if (String.valueOf(ws_m03b_rc).equals(String.valueOf("10"))) {
            _8599();
            return;
        } else {
            CobolDisplay.display("ERROR READING TRNXFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        /* RAW: 8599 - */
        return;
    }

    private void ws_fl_dd_4() {
        _0000();
        return;
    }

    private void para_start_5() {
        return;
    }

    private void trnxfile_close_2() {
    }

    private void ws_m03b_dd_9() {
        m03b_close.set(String.valueOf(cb_true));
    }

    private void ws_m03b_rc_8() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area_10() {
        if ((String.valueOf(ws_m03b_rc).equals(String.valueOf("00")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING TRNXFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void xreffile_close_2() {
    }

    private void ws_m03b_dd_10() {
        m03b_close.set(String.valueOf(cb_true));
    }

    private void ws_m03b_rc_9() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area_11() {
        if ((String.valueOf(ws_m03b_rc).equals(String.valueOf("00")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING XREFFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void custfile_close_2() {
    }

    private void ws_m03b_dd_11() {
        m03b_close.set(String.valueOf(cb_true));
    }

    private void ws_m03b_rc_10() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area_12() {
        if ((String.valueOf(ws_m03b_rc).equals(String.valueOf("00")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING CUSTFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void acctfile_close_2() {
    }

    private void ws_m03b_dd_12() {
        m03b_close.set(String.valueOf(cb_true));
    }

    private void ws_m03b_rc_11() {
        CobolProgram.call("CBSTM03B");
    }

    private void ws_m03b_area_13() {
        if ((String.valueOf(ws_m03b_rc).equals(String.valueOf("00")) || true)) {
            /* CONTINUE */
        } else {
            CobolDisplay.display("ERROR CLOSING ACCTFILE");
            CobolDisplay.display("RETURN CODE: " + String.valueOf(ws_m03b_rc));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        return;
    }

    private void abend_program() {
        CobolDisplay.display("ABENDING PROGRAM");
        CobolProgram.call("CEE3ABD");
    }

    private void _8100() { /* stub — external/COPY */ }

    private void _8500() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _5000() { /* stub — external/COPY */ }

    private void _4000() { /* stub — external/COPY */ }

    private void _9100() { /* stub — external/COPY */ }

    private void _9200() { /* stub — external/COPY */ }

    private void _9300() { /* stub — external/COPY */ }

    private void _9400() { /* stub — external/COPY */ }

    private void _6000() { /* stub — external/COPY */ }

    private void _5100() { /* stub — external/COPY */ }

    private void _5200() { /* stub — external/COPY */ }

    private void _0000() { /* stub — external/COPY */ }

    private void _8599() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cbstm03a().run();
    }
}
