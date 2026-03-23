package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cbexport extends CobolProgram {
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
    // FILE SECTION — CUSTOMER-INPUT

    // FILE SECTION — ACCOUNT-INPUT

    // FILE SECTION — XREF-INPUT

    // FILE SECTION — TRANSACTION-INPUT

    // FILE SECTION — CARD-INPUT

    // FILE SECTION — EXPORT-OUTPUT
    private CobolString export_output_record = new CobolString(500);


    // FILE DESCRIPTORS
    private CobolFile customer_input = new CobolFile("CUSTFILE", "INDEXED", "SEQUENTIAL");
    // File status: WS-CUSTOMER-STATUS
    private CobolFile account_input = new CobolFile("ACCTFILE", "INDEXED", "SEQUENTIAL");
    // File status: WS-ACCOUNT-STATUS
    private CobolFile xref_input = new CobolFile("XREFFILE", "INDEXED", "SEQUENTIAL");
    // File status: WS-XREF-STATUS
    private CobolFile transaction_input = new CobolFile("TRANSACT", "INDEXED", "SEQUENTIAL");
    // File status: WS-TRANSACTION-STATUS
    private CobolFile card_input = new CobolFile("CARDFILE", "INDEXED", "SEQUENTIAL");
    // File status: WS-CARD-STATUS
    private CobolFile export_output = new CobolFile("EXPFILE", "INDEXED", "SEQUENTIAL");
    // File status: WS-EXPORT-STATUS

    private CobolString ws_export_date = new CobolString(256); // fallback
    private CobolString ws_current_date = new CobolString(256); // fallback
    private CobolString ws_current_time = new CobolString(256); // fallback
    private CobolString ws_curr_year = new CobolString(256); // fallback
    private CobolString ws_curr_month = new CobolString(256); // fallback
    private CobolString ws_curr_day = new CobolString(256); // fallback
    private CobolString ws_curr_hour = new CobolString(256); // fallback
    private CobolString ws_curr_minute = new CobolString(256); // fallback
    private CobolString ws_curr_second = new CobolString(256); // fallback
    private CobolString ws_export_time = new CobolString(256); // fallback
    private CobolString ws_formatted_timestamp = new CobolString(256); // fallback
    private CobolString ws_customer_ok = new CobolString(256); // fallback
    private CobolString ws_customer_status = new CobolString(256); // fallback
    private CobolString ws_account_ok = new CobolString(256); // fallback
    private CobolString ws_account_status = new CobolString(256); // fallback
    private CobolString ws_xref_ok = new CobolString(256); // fallback
    private CobolString ws_xref_status = new CobolString(256); // fallback
    private CobolString ws_transaction_ok = new CobolString(256); // fallback
    private CobolString ws_transaction_status = new CobolString(256); // fallback
    private CobolString ws_card_ok = new CobolString(256); // fallback
    private CobolString ws_card_status = new CobolString(256); // fallback
    private CobolString ws_export_ok = new CobolString(256); // fallback
    private CobolString ws_export_status = new CobolString(256); // fallback
    private CobolString ws_customer_eof = new CobolString(256); // fallback
    private CobolString export_record = new CobolString(256); // fallback
    private CobolString export_rec_type = new CobolString(256); // fallback
    private CobolString export_timestamp = new CobolString(256); // fallback
    private CobolString ws_sequence_counter = new CobolString(256); // fallback
    private CobolString export_sequence_num = new CobolString(256); // fallback
    private CobolString export_branch_id = new CobolString(256); // fallback
    private CobolString export_region_code = new CobolString(256); // fallback
    private CobolString cust_id = new CobolString(256); // fallback
    private CobolString exp_cust_id = new CobolString(256); // fallback
    private CobolString cust_first_name = new CobolString(256); // fallback
    private CobolString exp_cust_first_name = new CobolString(256); // fallback
    private CobolString cust_middle_name = new CobolString(256); // fallback
    private CobolString exp_cust_middle_name = new CobolString(256); // fallback
    private CobolString cust_last_name = new CobolString(256); // fallback
    private CobolString exp_cust_last_name = new CobolString(256); // fallback
    private CobolString cust_addr_line_1 = new CobolString(256); // fallback
    private CobolString[] exp_cust_addr_line = new CobolString[100]; // fallback array
    private CobolString cust_addr_line_2 = new CobolString(256); // fallback
    private CobolString cust_addr_line_3 = new CobolString(256); // fallback
    private CobolString cust_addr_state_cd = new CobolString(256); // fallback
    private CobolString exp_cust_addr_state_cd = new CobolString(256); // fallback
    private CobolString cust_addr_country_cd = new CobolString(256); // fallback
    private CobolString exp_cust_addr_country_cd = new CobolString(256); // fallback
    private CobolString cust_addr_zip = new CobolString(256); // fallback
    private CobolString exp_cust_addr_zip = new CobolString(256); // fallback
    private CobolString cust_phone_num_1 = new CobolString(256); // fallback
    private CobolString[] exp_cust_phone_num = new CobolString[100]; // fallback array
    private CobolString cust_phone_num_2 = new CobolString(256); // fallback
    private CobolString cust_ssn = new CobolString(256); // fallback
    private CobolString exp_cust_ssn = new CobolString(256); // fallback
    private CobolString cust_govt_issued_id = new CobolString(256); // fallback
    private CobolString exp_cust_govt_issued_id = new CobolString(256); // fallback
    private CobolString cust_dob_yyyy_mm_dd = new CobolString(256); // fallback
    private CobolString exp_cust_dob_yyyy_mm_dd = new CobolString(256); // fallback
    private CobolString cust_eft_account_id = new CobolString(256); // fallback
    private CobolString exp_cust_eft_account_id = new CobolString(256); // fallback
    private CobolString cust_pri_card_holder_ind = new CobolString(256); // fallback
    private CobolString exp_cust_pri_card_holder_ind = new CobolString(256); // fallback
    private CobolString cust_fico_credit_score = new CobolString(256); // fallback
    private CobolString exp_cust_fico_credit_score = new CobolString(256); // fallback
    private CobolString ws_customer_records_exported = new CobolString(256); // fallback
    private CobolString ws_total_records_exported = new CobolString(256); // fallback
    private CobolString ws_account_eof = new CobolString(256); // fallback
    private CobolString acct_id = new CobolString(256); // fallback
    private CobolString exp_acct_id = new CobolString(256); // fallback
    private CobolString acct_active_status = new CobolString(256); // fallback
    private CobolString exp_acct_active_status = new CobolString(256); // fallback
    private CobolString acct_curr_bal = new CobolString(256); // fallback
    private CobolString exp_acct_curr_bal = new CobolString(256); // fallback
    private CobolString acct_credit_limit = new CobolString(256); // fallback
    private CobolString exp_acct_credit_limit = new CobolString(256); // fallback
    private CobolString acct_cash_credit_limit = new CobolString(256); // fallback
    private CobolString exp_acct_cash_credit_limit = new CobolString(256); // fallback
    private CobolString acct_open_date = new CobolString(256); // fallback
    private CobolString exp_acct_open_date = new CobolString(256); // fallback
    private CobolString acct_expiraion_date = new CobolString(256); // fallback
    private CobolString exp_acct_expiraion_date = new CobolString(256); // fallback
    private CobolString acct_reissue_date = new CobolString(256); // fallback
    private CobolString exp_acct_reissue_date = new CobolString(256); // fallback
    private CobolString acct_curr_cyc_credit = new CobolString(256); // fallback
    private CobolString exp_acct_curr_cyc_credit = new CobolString(256); // fallback
    private CobolString acct_curr_cyc_debit = new CobolString(256); // fallback
    private CobolString exp_acct_curr_cyc_debit = new CobolString(256); // fallback
    private CobolString acct_addr_zip = new CobolString(256); // fallback
    private CobolString exp_acct_addr_zip = new CobolString(256); // fallback
    private CobolString acct_group_id = new CobolString(256); // fallback
    private CobolString exp_acct_group_id = new CobolString(256); // fallback
    private CobolString ws_account_records_exported = new CobolString(256); // fallback
    private CobolString ws_xref_eof = new CobolString(256); // fallback
    private CobolString xref_card_num = new CobolString(256); // fallback
    private CobolString exp_xref_card_num = new CobolString(256); // fallback
    private CobolString xref_cust_id = new CobolString(256); // fallback
    private CobolString exp_xref_cust_id = new CobolString(256); // fallback
    private CobolString xref_acct_id = new CobolString(256); // fallback
    private CobolString exp_xref_acct_id = new CobolString(256); // fallback
    private CobolString ws_xref_records_exported = new CobolString(256); // fallback
    private CobolString ws_transaction_eof = new CobolString(256); // fallback
    private CobolString tran_id = new CobolString(256); // fallback
    private CobolString exp_tran_id = new CobolString(256); // fallback
    private CobolString tran_type_cd = new CobolString(256); // fallback
    private CobolString exp_tran_type_cd = new CobolString(256); // fallback
    private CobolString tran_cat_cd = new CobolString(256); // fallback
    private CobolString exp_tran_cat_cd = new CobolString(256); // fallback
    private CobolString tran_source = new CobolString(256); // fallback
    private CobolString exp_tran_source = new CobolString(256); // fallback
    private CobolString tran_desc = new CobolString(256); // fallback
    private CobolString exp_tran_desc = new CobolString(256); // fallback
    private CobolString tran_amt = new CobolString(256); // fallback
    private CobolString exp_tran_amt = new CobolString(256); // fallback
    private CobolString tran_merchant_id = new CobolString(256); // fallback
    private CobolString exp_tran_merchant_id = new CobolString(256); // fallback
    private CobolString tran_merchant_name = new CobolString(256); // fallback
    private CobolString exp_tran_merchant_name = new CobolString(256); // fallback
    private CobolString tran_merchant_city = new CobolString(256); // fallback
    private CobolString exp_tran_merchant_city = new CobolString(256); // fallback
    private CobolString tran_merchant_zip = new CobolString(256); // fallback
    private CobolString exp_tran_merchant_zip = new CobolString(256); // fallback
    private CobolString tran_card_num = new CobolString(256); // fallback
    private CobolString exp_tran_card_num = new CobolString(256); // fallback
    private CobolString tran_orig_ts = new CobolString(256); // fallback
    private CobolString exp_tran_orig_ts = new CobolString(256); // fallback
    private CobolString tran_proc_ts = new CobolString(256); // fallback
    private CobolString exp_tran_proc_ts = new CobolString(256); // fallback
    private CobolString ws_tran_records_exported = new CobolString(256); // fallback
    private CobolString ws_card_eof = new CobolString(256); // fallback
    private CobolString card_num = new CobolString(256); // fallback
    private CobolString exp_card_num = new CobolString(256); // fallback
    private CobolString card_acct_id = new CobolString(256); // fallback
    private CobolString exp_card_acct_id = new CobolString(256); // fallback
    private CobolString card_cvv_cd = new CobolString(256); // fallback
    private CobolString exp_card_cvv_cd = new CobolString(256); // fallback
    private CobolString card_embossed_name = new CobolString(256); // fallback
    private CobolString exp_card_embossed_name = new CobolString(256); // fallback
    private CobolString card_expiraion_date = new CobolString(256); // fallback
    private CobolString exp_card_expiraion_date = new CobolString(256); // fallback
    private CobolString card_active_status = new CobolString(256); // fallback
    private CobolString exp_card_active_status = new CobolString(256); // fallback
    private CobolString ws_card_records_exported = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void main_processing() {
        _1000();
        /* RAW: -  */
        _2000();
        /* RAW: - EXPORT-CUSTOMERS */
        _3000();
        /* RAW: - EXPORT-ACCOUNTS */
        _4000();
        /* RAW: - EXPORT-XREFS */
        _5000();
        /* RAW: - EXPORT-TRANSACTIONS */
        _5500();
        /* RAW: - EXPORT-CARDS */
        _6000();
        /* RAW: - FINALIZE */
        return;
    }

    private void initialize() {
        CobolDisplay.display("CBEXPORT: Starting Customer Data Export");
        _1050();
        /* RAW: - GENERATE-TIMESTAMP */
        _1100();
        /* RAW: - OPEN-FILES */
        CobolDisplay.display("CBEXPORT: Export Date: " + String.valueOf(ws_export_date));
        CobolDisplay.display("CBEXPORT: Export Time: ");
    }

    private void ws_export_time() {
        /* RAW: 1050 - */
    }

    private void generate_timestamp() {
        ws_current_date.set(String.valueOf(CobolIntrinsics.acceptFrom("DATE YYYYMMDD")));
        ws_current_time.set(String.valueOf(CobolIntrinsics.acceptFrom("TIME")));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(ws_curr_year));
            _sb.append("-");
            _sb.append(String.valueOf(ws_curr_month));
            _sb.append("-");
            _sb.append(String.valueOf(ws_curr_day));
            ws_export_date.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(ws_curr_hour));
            _sb.append(":");
            _sb.append(String.valueOf(ws_curr_minute));
            _sb.append(":");
            _sb.append(String.valueOf(ws_curr_second));
            ws_export_time.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(ws_export_date));
            _sb.append(" ");
            _sb.append(String.valueOf(ws_export_time));
            _sb.append(".00");
            ws_formatted_timestamp.set(_sb.toString());
        }
        /* RAW: 1100 - */
    }

    private void open_files() {
        customer_input.open("INPUT");
        if (!(!String.valueOf(ws_customer_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open CUSTOMER-INPUT, Status: " + String.valueOf(ws_customer_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        account_input.open("INPUT");
        if (!(!String.valueOf(ws_account_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open ACCOUNT-INPUT, Status: " + String.valueOf(ws_account_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        xref_input.open("INPUT");
        if (!(!String.valueOf(ws_xref_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open XREF-INPUT, Status: " + String.valueOf(ws_xref_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        transaction_input.open("INPUT");
        if (!(!String.valueOf(ws_transaction_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open TRANSACTION-INPUT, Status: " + String.valueOf(ws_transaction_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        card_input.open("INPUT");
        if (!(!String.valueOf(ws_card_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open CARD-INPUT, Status: " + String.valueOf(ws_card_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        export_output.open("OUTPUT");
        if (!(!String.valueOf(ws_export_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Cannot open EXPORT-OUTPUT, Status: " + String.valueOf(ws_export_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        /* RAW: 2000 - */
    }

    private void export_customers() {
        CobolDisplay.display("CBEXPORT: Processing customer records");
        _2100();
        /* RAW: - READ-CUSTOMER-RECORD */
        while (!(!String.valueOf(ws_customer_eof).trim().isEmpty())) {
            _2200();
            /* RAW: - CREATE-CUSTOMER-EXP-REC */
            _2100();
            /* RAW: - READ-CUSTOMER-RECORD */
        }
        CobolDisplay.display("CBEXPORT: Customers exported: ");
    }

    private void ws_customer_records_exported() {
        /* RAW: 2100 - */
    }

    private void read_customer_record() {
        if (customer_input.read(null) == FileStatus.AT_END) {
        }
        if ((!(!String.valueOf(ws_customer_ok).trim().isEmpty()) && !(!String.valueOf(ws_customer_eof).trim().isEmpty()))) {
            CobolDisplay.display("ERROR: Reading CUSTOMER-INPUT, Status: " + String.valueOf(ws_customer_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        /* RAW: 2200 - */
    }

    private void create_customer_exp_rec() {
        export_record.set("");
        export_rec_type.set(String.valueOf("C"));
        export_timestamp.set(String.valueOf(ws_formatted_timestamp));
        ws_sequence_counter.set(new BigDecimal(String.valueOf(ws_sequence_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        export_sequence_num.set(String.valueOf(ws_sequence_counter));
        export_branch_id.set(String.valueOf("0001"));
        export_region_code.set(String.valueOf("NORTH"));
        exp_cust_id.set(String.valueOf(cust_id));
        exp_cust_first_name.set(String.valueOf(cust_first_name));
        exp_cust_middle_name.set(String.valueOf(cust_middle_name));
        exp_cust_last_name.set(String.valueOf(cust_last_name));
        if (exp_cust_addr_line[1 - 1] == null) exp_cust_addr_line[1 - 1] = new CobolString(256);
        exp_cust_addr_line[1 - 1].set(String.valueOf(cust_addr_line_1));
        if (exp_cust_addr_line[2 - 1] == null) exp_cust_addr_line[2 - 1] = new CobolString(256);
        exp_cust_addr_line[2 - 1].set(String.valueOf(cust_addr_line_2));
        if (exp_cust_addr_line[3 - 1] == null) exp_cust_addr_line[3 - 1] = new CobolString(256);
        exp_cust_addr_line[3 - 1].set(String.valueOf(cust_addr_line_3));
        exp_cust_addr_state_cd.set(String.valueOf(cust_addr_state_cd));
        exp_cust_addr_country_cd.set(String.valueOf(cust_addr_country_cd));
        exp_cust_addr_zip.set(String.valueOf(cust_addr_zip));
        if (exp_cust_phone_num[1 - 1] == null) exp_cust_phone_num[1 - 1] = new CobolString(256);
        exp_cust_phone_num[1 - 1].set(String.valueOf(cust_phone_num_1));
        if (exp_cust_phone_num[2 - 1] == null) exp_cust_phone_num[2 - 1] = new CobolString(256);
        exp_cust_phone_num[2 - 1].set(String.valueOf(cust_phone_num_2));
        exp_cust_ssn.set(String.valueOf(cust_ssn));
        exp_cust_govt_issued_id.set(String.valueOf(cust_govt_issued_id));
        exp_cust_dob_yyyy_mm_dd.set(String.valueOf(cust_dob_yyyy_mm_dd));
        exp_cust_eft_account_id.set(String.valueOf(cust_eft_account_id));
        exp_cust_pri_card_holder_ind.set(String.valueOf(cust_pri_card_holder_ind));
        exp_cust_fico_credit_score.set(String.valueOf(cust_fico_credit_score));
        export_output.write(export_record);
        if (!(!String.valueOf(ws_export_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Writing export record, Status: " + String.valueOf(ws_export_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        ws_customer_records_exported.set(new BigDecimal(String.valueOf(ws_customer_records_exported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        ws_total_records_exported.set(new BigDecimal(String.valueOf(ws_total_records_exported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        /* RAW: 3000 - */
    }

    private void export_accounts() {
        CobolDisplay.display("CBEXPORT: Processing account records");
        _3100();
        /* RAW: - READ-ACCOUNT-RECORD */
        while (!(!String.valueOf(ws_account_eof).trim().isEmpty())) {
            _3200();
            /* RAW: - CREATE-ACCOUNT-EXP-REC */
            _3100();
            /* RAW: - READ-ACCOUNT-RECORD */
        }
        CobolDisplay.display("CBEXPORT: Accounts exported: ");
    }

    private void ws_account_records_exported() {
        /* RAW: 3100 - */
    }

    private void read_account_record() {
        if (account_input.read(null) == FileStatus.AT_END) {
        }
        if ((!(!String.valueOf(ws_account_ok).trim().isEmpty()) && !(!String.valueOf(ws_account_eof).trim().isEmpty()))) {
            CobolDisplay.display("ERROR: Reading ACCOUNT-INPUT, Status: " + String.valueOf(ws_account_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        /* RAW: 3200 - */
    }

    private void create_account_exp_rec() {
        export_record.set("");
        export_rec_type.set(String.valueOf("A"));
        export_timestamp.set(String.valueOf(ws_formatted_timestamp));
        ws_sequence_counter.set(new BigDecimal(String.valueOf(ws_sequence_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        export_sequence_num.set(String.valueOf(ws_sequence_counter));
        export_branch_id.set(String.valueOf("0001"));
        export_region_code.set(String.valueOf("NORTH"));
        exp_acct_id.set(String.valueOf(acct_id));
        exp_acct_active_status.set(String.valueOf(acct_active_status));
        exp_acct_curr_bal.set(String.valueOf(acct_curr_bal));
        exp_acct_credit_limit.set(String.valueOf(acct_credit_limit));
        exp_acct_cash_credit_limit.set(String.valueOf(acct_cash_credit_limit));
        exp_acct_open_date.set(String.valueOf(acct_open_date));
        exp_acct_expiraion_date.set(String.valueOf(acct_expiraion_date));
        exp_acct_reissue_date.set(String.valueOf(acct_reissue_date));
        exp_acct_curr_cyc_credit.set(String.valueOf(acct_curr_cyc_credit));
        exp_acct_curr_cyc_debit.set(String.valueOf(acct_curr_cyc_debit));
        exp_acct_addr_zip.set(String.valueOf(acct_addr_zip));
        exp_acct_group_id.set(String.valueOf(acct_group_id));
        export_output.write(export_record);
        if (!(!String.valueOf(ws_export_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Writing export record, Status: " + String.valueOf(ws_export_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        ws_account_records_exported.set(new BigDecimal(String.valueOf(ws_account_records_exported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        ws_total_records_exported.set(new BigDecimal(String.valueOf(ws_total_records_exported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        /* RAW: 4000 - */
    }

    private void export_xrefs() {
        CobolDisplay.display("CBEXPORT: Processing cross-reference records");
        _4100();
        /* RAW: - READ-XREF-RECORD */
        while (!(!String.valueOf(ws_xref_eof).trim().isEmpty())) {
            _4200();
            /* RAW: - CREATE-XREF-EXPORT-RECORD */
            _4100();
            /* RAW: - READ-XREF-RECORD */
        }
        CobolDisplay.display("CBEXPORT: Cross-references exported: ");
    }

    private void ws_xref_records_exported() {
        /* RAW: 4100 - */
    }

    private void read_xref_record() {
        if (xref_input.read(null) == FileStatus.AT_END) {
        }
        if ((!(!String.valueOf(ws_xref_ok).trim().isEmpty()) && !(!String.valueOf(ws_xref_eof).trim().isEmpty()))) {
            CobolDisplay.display("ERROR: Reading XREF-INPUT, Status: " + String.valueOf(ws_xref_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        /* RAW: 4200 - */
    }

    private void create_xref_export_record() {
        export_record.set("");
        export_rec_type.set(String.valueOf("X"));
        export_timestamp.set(String.valueOf(ws_formatted_timestamp));
        ws_sequence_counter.set(new BigDecimal(String.valueOf(ws_sequence_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        export_sequence_num.set(String.valueOf(ws_sequence_counter));
        export_branch_id.set(String.valueOf("0001"));
        export_region_code.set(String.valueOf("NORTH"));
        exp_xref_card_num.set(String.valueOf(xref_card_num));
        exp_xref_cust_id.set(String.valueOf(xref_cust_id));
        exp_xref_acct_id.set(String.valueOf(xref_acct_id));
        export_output.write(export_record);
        if (!(!String.valueOf(ws_export_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Writing export record, Status: " + String.valueOf(ws_export_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        ws_xref_records_exported.set(new BigDecimal(String.valueOf(ws_xref_records_exported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        ws_total_records_exported.set(new BigDecimal(String.valueOf(ws_total_records_exported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        /* RAW: 5000 - */
    }

    private void export_transactions() {
        CobolDisplay.display("CBEXPORT: Processing transaction records");
        _5100();
        /* RAW: - READ-TRANSACTION-RECORD */
        while (!(!String.valueOf(ws_transaction_eof).trim().isEmpty())) {
            _5200();
            /* RAW: - CREATE-TRAN-EXP-REC */
            _5100();
            /* RAW: - READ-TRANSACTION-RECORD */
        }
        CobolDisplay.display("CBEXPORT: Transactions exported: ");
    }

    private void ws_tran_records_exported() {
        /* RAW: 5100 - */
    }

    private void read_transaction_record() {
        if (transaction_input.read(null) == FileStatus.AT_END) {
        }
        if ((!(!String.valueOf(ws_transaction_ok).trim().isEmpty()) && !(!String.valueOf(ws_transaction_eof).trim().isEmpty()))) {
            CobolDisplay.display("ERROR: Reading TRANSACTION-INPUT, Status: " + String.valueOf(ws_transaction_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        /* RAW: 5200 - */
    }

    private void create_tran_exp_rec() {
        export_record.set("");
        export_rec_type.set(String.valueOf("T"));
        export_timestamp.set(String.valueOf(ws_formatted_timestamp));
        ws_sequence_counter.set(new BigDecimal(String.valueOf(ws_sequence_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        export_sequence_num.set(String.valueOf(ws_sequence_counter));
        export_branch_id.set(String.valueOf("0001"));
        export_region_code.set(String.valueOf("NORTH"));
        exp_tran_id.set(String.valueOf(tran_id));
        exp_tran_type_cd.set(String.valueOf(tran_type_cd));
        exp_tran_cat_cd.set(String.valueOf(tran_cat_cd));
        exp_tran_source.set(String.valueOf(tran_source));
        exp_tran_desc.set(String.valueOf(tran_desc));
        exp_tran_amt.set(String.valueOf(tran_amt));
        exp_tran_merchant_id.set(String.valueOf(tran_merchant_id));
        exp_tran_merchant_name.set(String.valueOf(tran_merchant_name));
        exp_tran_merchant_city.set(String.valueOf(tran_merchant_city));
        exp_tran_merchant_zip.set(String.valueOf(tran_merchant_zip));
        exp_tran_card_num.set(String.valueOf(tran_card_num));
        exp_tran_orig_ts.set(String.valueOf(tran_orig_ts));
        exp_tran_proc_ts.set(String.valueOf(tran_proc_ts));
        export_output.write(export_record);
        if (!(!String.valueOf(ws_export_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Writing export record, Status: " + String.valueOf(ws_export_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        ws_tran_records_exported.set(new BigDecimal(String.valueOf(ws_tran_records_exported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        ws_total_records_exported.set(new BigDecimal(String.valueOf(ws_total_records_exported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        /* RAW: 5500 - */
    }

    private void export_cards() {
        CobolDisplay.display("CBEXPORT: Processing card records");
        _5600();
        /* RAW: - READ-CARD-RECORD */
        while (!(!String.valueOf(ws_card_eof).trim().isEmpty())) {
            _5700();
            /* RAW: - CREATE-CARD-EXPORT-RECORD */
            _5600();
            /* RAW: - READ-CARD-RECORD */
        }
        CobolDisplay.display("CBEXPORT: Cards exported: ");
    }

    private void ws_card_records_exported() {
        /* RAW: 5600 - */
    }

    private void read_card_record() {
        if (card_input.read(null) == FileStatus.AT_END) {
        }
        if ((!(!String.valueOf(ws_card_ok).trim().isEmpty()) && !(!String.valueOf(ws_card_eof).trim().isEmpty()))) {
            CobolDisplay.display("ERROR: Reading CARD-INPUT, Status: " + String.valueOf(ws_card_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        /* RAW: 5700 - */
    }

    private void create_card_export_record() {
        export_record.set("");
        export_rec_type.set(String.valueOf("D"));
        export_timestamp.set(String.valueOf(ws_formatted_timestamp));
        ws_sequence_counter.set(new BigDecimal(String.valueOf(ws_sequence_counter).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        export_sequence_num.set(String.valueOf(ws_sequence_counter));
        export_branch_id.set(String.valueOf("0001"));
        export_region_code.set(String.valueOf("NORTH"));
        exp_card_num.set(String.valueOf(card_num));
        exp_card_acct_id.set(String.valueOf(card_acct_id));
        exp_card_cvv_cd.set(String.valueOf(card_cvv_cd));
        exp_card_embossed_name.set(String.valueOf(card_embossed_name));
        exp_card_expiraion_date.set(String.valueOf(card_expiraion_date));
        exp_card_active_status.set(String.valueOf(card_active_status));
        export_output.write(export_record);
        if (!(!String.valueOf(ws_export_ok).trim().isEmpty())) {
            CobolDisplay.display("ERROR: Writing export record, Status: " + String.valueOf(ws_export_status));
            _9999();
            /* RAW: - ABEND-PROGRAM */
        }
        ws_card_records_exported.set(new BigDecimal(String.valueOf(ws_card_records_exported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        ws_total_records_exported.set(new BigDecimal(String.valueOf(ws_total_records_exported).trim()).add(new BigDecimal(String.valueOf(1).trim())).toPlainString());
        /* RAW: 6000 - */
    }

    private void para_finalize() {
        customer_input.close();
        account_input.close();
        xref_input.close();
        transaction_input.close();
        card_input.close();
        export_output.close();
        CobolDisplay.display("CBEXPORT: Export completed");
        CobolDisplay.display("CBEXPORT: Customers Exported: " + String.valueOf(ws_customer_records_exported));
        CobolDisplay.display("CBEXPORT: Accounts Exported: " + String.valueOf(ws_account_records_exported));
        CobolDisplay.display("CBEXPORT: XRefs Exported: " + String.valueOf(ws_xref_records_exported));
        CobolDisplay.display("CBEXPORT: Transactions Exported: " + String.valueOf(ws_tran_records_exported));
        CobolDisplay.display("CBEXPORT: Cards Exported: " + String.valueOf(ws_card_records_exported));
        CobolDisplay.display("CBEXPORT: Total Records Exported: ");
    }

    private void ws_total_records_exported() {
        /* RAW: 9999 - */
    }

    private void abend_program() {
        CobolDisplay.display("CBEXPORT: ABENDING PROGRAM");
        CobolProgram.call("CEE3ABD");
    }

    private void _1000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _4000() { /* stub — external/COPY */ }

    private void _5000() { /* stub — external/COPY */ }

    private void _5500() { /* stub — external/COPY */ }

    private void _6000() { /* stub — external/COPY */ }

    private void _1050() { /* stub — external/COPY */ }

    private void _1100() { /* stub — external/COPY */ }

    private void _9999() { /* stub — external/COPY */ }

    private void _2100() { /* stub — external/COPY */ }

    private void _2200() { /* stub — external/COPY */ }

    private void _3100() { /* stub — external/COPY */ }

    private void _3200() { /* stub — external/COPY */ }

    private void _4100() { /* stub — external/COPY */ }

    private void _4200() { /* stub — external/COPY */ }

    private void _5100() { /* stub — external/COPY */ }

    private void _5200() { /* stub — external/COPY */ }

    private void _5600() { /* stub — external/COPY */ }

    private void _5700() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Cbexport().run();
    }
}
