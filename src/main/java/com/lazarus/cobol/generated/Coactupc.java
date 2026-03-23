package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Coactupc extends CobolProgram {
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
    private CobolString ws_misc_storage = new CobolString(1); // Group: WS-MISC-STORAGE
    private CobolString ws_cics_processng_vars = new CobolString(1); // Group: WS-CICS-PROCESSNG-VARS
    private int ws_resp_cd = 0;
    private int ws_reas_cd = 0;
    private CobolString ws_tranid = new CobolString(4);
    private CobolString ws_uctrans = new CobolString(4);
    private CobolString ws_generic_edits = new CobolString(1); // Group: WS-GENERIC-EDITS
    private CobolString ws_edit_variable_name = new CobolString(25);
    private CobolString ws_edit_signed_number_9v2_x = new CobolString(15);
    private CobolString ws_flg_signed_number_edit = new CobolString(1);
    private CobolString ws_edit_alphanum_only = new CobolString(256);
    private BigDecimal ws_edit_alphanum_length = BigDecimal.ZERO;
    private CobolString ws_edit_alpha_only_flags = new CobolString(1);
    private CobolString ws_edit_alphanum_only_flags = new CobolString(1);
    private CobolString ws_edit_mandatory_flags = new CobolString(1);
    private CobolString ws_edit_yes_no = new CobolString(1);
    private CobolString ws_edit_us_phone_num = new CobolString(15);
    private CobolString ws_edit_us_phone_num_x = new CobolString(1); // Group: WS-EDIT-US-PHONE-NUM-X
    private CobolString ws_edit_us_phone_numa = new CobolString(3);
    private int ws_edit_us_phone_numa_n = 0;
    private CobolString ws_edit_us_phone_numb = new CobolString(3);
    private int ws_edit_us_phone_numb_n = 0;
    private CobolString ws_edit_us_phone_numc = new CobolString(4);
    private int ws_edit_us_phone_numc_n = 0;
    private CobolString ws_edit_us_phone_num_flgs = new CobolString(1); // Group: WS-EDIT-US-PHONE-NUM-FLGS
    private CobolString ws_edit_us_phonea_flg = new CobolString(1);
    private CobolString ws_edit_edit_us_phoneb = new CobolString(1);
    private CobolString ws_edit_edit_phonec = new CobolString(1);
    private CobolString ws_edit_us_ssn = new CobolString(1); // Group: WS-EDIT-US-SSN
    private CobolString ws_edit_us_ssn_part1 = new CobolString(3);
    private int ws_edit_us_ssn_part1_n = 0;
    private CobolString ws_edit_us_ssn_part2 = new CobolString(2);
    private int ws_edit_us_ssn_part2_n = 0;
    private CobolString ws_edit_us_ssn_part3 = new CobolString(4);
    private int ws_edit_us_ssn_part3_n = 0;
    private int ws_edit_us_ssn_n = 0;
    private CobolString ws_edit_us_ssn_flgs = new CobolString(1); // Group: WS-EDIT-US-SSN-FLGS
    private CobolString ws_edit_us_ssn_part1_flgs = new CobolString(1);
    private CobolString ws_edit_us_ssn_part2_flgs = new CobolString(1);
    private CobolString ws_edit_us_ssn_part3_flgs = new CobolString(1);
    private CobolString ws_calculation_vars = new CobolString(1); // Group: WS-CALCULATION-VARS
    private BigDecimal ws_div_by = BigDecimal.ZERO;
    private BigDecimal ws_dividend = BigDecimal.ZERO;
    private BigDecimal ws_remainder = BigDecimal.ZERO;
    private CobolString ws_curr_date = new CobolString(21);

    // LINKAGE SECTION
    private CobolString dfhcommarea = new CobolString(1); // Group: DFHCOMMAREA


    // FALLBACK FILE DESCRIPTORS
    private CobolFile transid = new CobolFile("TRANSID", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile dataset = new CobolFile("DATASET", "SEQUENTIAL", "SEQUENTIAL");
    private CobolFile file = new CobolFile("FILE", "SEQUENTIAL", "SEQUENTIAL");

    private CobolString cc_work_area = new CobolString(256); // fallback
    private CobolString ws_commarea = new CobolString(256); // fallback
    private CobolString lit_thistranid = new CobolString(256); // fallback
    private CobolString ws_return_msg_off = new CobolString(256); // fallback
    private CobolString cb_true = new CobolString(256); // fallback
    private CobolString eibcalen = new CobolString(256); // fallback
    private CobolString cdemo_from_program = new CobolString(256); // fallback
    private CobolString lit_menupgm = new CobolString(256); // fallback
    private CobolString cdemo_pgm_reenter = new CobolString(256); // fallback
    private CobolString carddemo_commarea = new CobolString(256); // fallback
    private CobolString ws_this_progcommarea = new CobolString(256); // fallback
    private CobolString cdemo_pgm_enter = new CobolString(256); // fallback
    private CobolString acup_details_not_fetched = new CobolString(256); // fallback
    private CobolString pfk_invalid = new CobolString(256); // fallback
    private CobolString ccard_aid_enter = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk03 = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk05 = new CobolString(256); // fallback
    private CobolString acup_changes_ok_not_confirmed = new CobolString(256); // fallback
    private CobolString ccard_aid_pfk12 = new CobolString(256); // fallback
    private CobolString pfk_valid = new CobolString(256); // fallback
    private CobolString cdemo_from_tranid = new CobolString(256); // fallback
    private CobolString lit_menutranid = new CobolString(256); // fallback
    private CobolString cdemo_to_tranid = new CobolString(256); // fallback
    private CobolString cdemo_to_program = new CobolString(256); // fallback
    private CobolString lit_thispgm = new CobolString(256); // fallback
    private CobolString cdemo_usrtyp_user = new CobolString(256); // fallback
    private CobolString lit_thismapset = new CobolString(256); // fallback
    private CobolString cdemo_last_mapset = new CobolString(256); // fallback
    private CobolString lit_thismap = new CobolString(256); // fallback
    private CobolString cdemo_last_map = new CobolString(256); // fallback
    private CobolString exec = new CobolString(256); // fallback
    private CobolString cics = new CobolString(256); // fallback
    private CobolString syncpoint = new CobolString(256); // fallback
    private CobolString end_exec = new CobolString(256); // fallback
    private CobolString xctl = new CobolString(256); // fallback
    private CobolString[] program = new CobolString[100]; // fallback array
    private CobolString[] commarea = new CobolString[100]; // fallback array
    private CobolString acup_changes_okayed_and_done = new CobolString(256); // fallback
    private CobolString acup_changes_failed = new CobolString(256); // fallback
    private CobolString cdemo_acct_id = new CobolString(256); // fallback
    private CobolString ws_return_msg = new CobolString(256); // fallback
    private CobolString ccard_error_msg = new CobolString(256); // fallback
    private CobolString ccard_next_prog = new CobolString(256); // fallback
    private CobolString ccard_next_mapset = new CobolString(256); // fallback
    private CobolString acup_new_details = new CobolString(256); // fallback
    private CobolString acctsidi = new CobolString(256); // fallback
    private CobolString cc_acct_id = new CobolString(256); // fallback
    private CobolString acup_new_acct_id_x = new CobolString(256); // fallback
    private CobolString acsttusi = new CobolString(256); // fallback
    private CobolString acup_new_active_status = new CobolString(256); // fallback
    private CobolString acrdlimi = new CobolString(256); // fallback
    private CobolString acup_new_credit_limit_x = new CobolString(256); // fallback
    private CobolString acup_new_credit_limit_n = new CobolString(256); // fallback
    private CobolString acshlimi = new CobolString(256); // fallback
    private CobolString acup_new_cash_credit_limit_x = new CobolString(256); // fallback
    private CobolString acup_new_cash_credit_limit_n = new CobolString(256); // fallback
    private CobolString acurbali = new CobolString(256); // fallback
    private CobolString acup_new_curr_bal_x = new CobolString(256); // fallback
    private CobolString acup_new_curr_bal_n = new CobolString(256); // fallback
    private CobolString acrcycri = new CobolString(256); // fallback
    private CobolString acup_new_curr_cyc_credit_x = new CobolString(256); // fallback
    private CobolString acup_new_curr_cyc_credit_n = new CobolString(256); // fallback
    private CobolString acrcydbi = new CobolString(256); // fallback
    private CobolString acup_new_curr_cyc_debit_x = new CobolString(256); // fallback
    private CobolString acup_new_curr_cyc_debit_n = new CobolString(256); // fallback
    private CobolString opnyeari = new CobolString(256); // fallback
    private CobolString acup_new_open_year = new CobolString(256); // fallback
    private CobolString opnmoni = new CobolString(256); // fallback
    private CobolString acup_new_open_mon = new CobolString(256); // fallback
    private CobolString opndayi = new CobolString(256); // fallback
    private CobolString acup_new_open_day = new CobolString(256); // fallback
    private CobolString expyeari = new CobolString(256); // fallback
    private CobolString acup_new_exp_year = new CobolString(256); // fallback
    private CobolString expmoni = new CobolString(256); // fallback
    private CobolString acup_new_exp_mon = new CobolString(256); // fallback
    private CobolString expdayi = new CobolString(256); // fallback
    private CobolString acup_new_exp_day = new CobolString(256); // fallback
    private CobolString risyeari = new CobolString(256); // fallback
    private CobolString acup_new_reissue_year = new CobolString(256); // fallback
    private CobolString rismoni = new CobolString(256); // fallback
    private CobolString acup_new_reissue_mon = new CobolString(256); // fallback
    private CobolString risdayi = new CobolString(256); // fallback
    private CobolString acup_new_reissue_day = new CobolString(256); // fallback
    private CobolString aaddgrpi = new CobolString(256); // fallback
    private CobolString acup_new_group_id = new CobolString(256); // fallback
    private CobolString acstnumi = new CobolString(256); // fallback
    private CobolString acup_new_cust_id_x = new CobolString(256); // fallback
    private CobolString actssn1i = new CobolString(256); // fallback
    private CobolString acup_new_cust_ssn_1 = new CobolString(256); // fallback
    private CobolString actssn2i = new CobolString(256); // fallback
    private CobolString acup_new_cust_ssn_2 = new CobolString(256); // fallback
    private CobolString actssn3i = new CobolString(256); // fallback
    private CobolString acup_new_cust_ssn_3 = new CobolString(256); // fallback
    private CobolString dobyeari = new CobolString(256); // fallback
    private CobolString acup_new_cust_dob_year = new CobolString(256); // fallback
    private CobolString dobmoni = new CobolString(256); // fallback
    private CobolString acup_new_cust_dob_mon = new CobolString(256); // fallback
    private CobolString dobdayi = new CobolString(256); // fallback
    private CobolString acup_new_cust_dob_day = new CobolString(256); // fallback
    private CobolString acstfcoi = new CobolString(256); // fallback
    private CobolString acup_new_cust_fico_score_x = new CobolString(256); // fallback
    private CobolString acsfnami = new CobolString(256); // fallback
    private CobolString acup_new_cust_first_name = new CobolString(256); // fallback
    private CobolString acsmnami = new CobolString(256); // fallback
    private CobolString acup_new_cust_middle_name = new CobolString(256); // fallback
    private CobolString acslnami = new CobolString(256); // fallback
    private CobolString acup_new_cust_last_name = new CobolString(256); // fallback
    private CobolString acsadl1i = new CobolString(256); // fallback
    private CobolString acup_new_cust_addr_line_1 = new CobolString(256); // fallback
    private CobolString acsadl2i = new CobolString(256); // fallback
    private CobolString acup_new_cust_addr_line_2 = new CobolString(256); // fallback
    private CobolString acscityi = new CobolString(256); // fallback
    private CobolString acup_new_cust_addr_line_3 = new CobolString(256); // fallback
    private CobolString acssttei = new CobolString(256); // fallback
    private CobolString acup_new_cust_addr_state_cd = new CobolString(256); // fallback
    private CobolString acsctryi = new CobolString(256); // fallback
    private CobolString acup_new_cust_addr_country_cd = new CobolString(256); // fallback
    private CobolString acszipci = new CobolString(256); // fallback
    private CobolString acup_new_cust_addr_zip = new CobolString(256); // fallback
    private CobolString acsph1ai = new CobolString(256); // fallback
    private CobolString acup_new_cust_phone_num_1a = new CobolString(256); // fallback
    private CobolString acsph1bi = new CobolString(256); // fallback
    private CobolString acup_new_cust_phone_num_1b = new CobolString(256); // fallback
    private CobolString acsph1ci = new CobolString(256); // fallback
    private CobolString acup_new_cust_phone_num_1c = new CobolString(256); // fallback
    private CobolString acsph2ai = new CobolString(256); // fallback
    private CobolString acup_new_cust_phone_num_2a = new CobolString(256); // fallback
    private CobolString acsph2bi = new CobolString(256); // fallback
    private CobolString acup_new_cust_phone_num_2b = new CobolString(256); // fallback
    private CobolString acsph2ci = new CobolString(256); // fallback
    private CobolString acup_new_cust_phone_num_2c = new CobolString(256); // fallback
    private CobolString acsgovti = new CobolString(256); // fallback
    private CobolString acup_new_cust_govt_issued_id = new CobolString(256); // fallback
    private CobolString acseftci = new CobolString(256); // fallback
    private CobolString acup_new_cust_eft_account_id = new CobolString(256); // fallback
    private CobolString acspflgi = new CobolString(256); // fallback
    private CobolString acup_new_cust_pri_holder_ind = new CobolString(256); // fallback
    private CobolString input_ok = new CobolString(256); // fallback
    private CobolString acup_old_acct_data = new CobolString(256); // fallback
    private CobolString flg_acctfilter_blank = new CobolString(256); // fallback
    private CobolString no_search_criteria_received = new CobolString(256); // fallback
    private CobolString found_account_data = new CobolString(256); // fallback
    private CobolString found_acct_in_master = new CobolString(256); // fallback
    private CobolString flg_acctfilter_isvalid = new CobolString(256); // fallback
    private CobolString found_cust_in_master = new CobolString(256); // fallback
    private CobolString flg_custfilter_isvalid = new CobolString(256); // fallback
    private CobolString no_changes_found = new CobolString(256); // fallback
    private CobolString ws_non_key_flags = new CobolString(256); // fallback
    private CobolString acup_changes_not_ok = new CobolString(256); // fallback
    private CobolString ws_edit_acct_status = new CobolString(256); // fallback
    private CobolString acup_new_open_date = new CobolString(256); // fallback
    private CobolString ws_edit_date_ccyymmdd = new CobolString(256); // fallback
    private CobolString ws_edit_date_flgs = new CobolString(256); // fallback
    private CobolString ws_edit_open_date_flgs = new CobolString(256); // fallback
    private CobolString ws_edit_credit_limit = new CobolString(256); // fallback
    private CobolString acup_new_expiraion_date = new CobolString(256); // fallback
    private CobolString ws_expiry_date_flgs = new CobolString(256); // fallback
    private CobolString ws_edit_cash_credit_limit = new CobolString(256); // fallback
    private CobolString acup_new_reissue_date = new CobolString(256); // fallback
    private CobolString ws_edit_reissue_date_flgs = new CobolString(256); // fallback
    private CobolString ws_edit_curr_bal = new CobolString(256); // fallback
    private CobolString ws_edit_curr_cyc_credit = new CobolString(256); // fallback
    private CobolString ws_edit_curr_cyc_debit = new CobolString(256); // fallback
    private CobolString acup_new_cust_dob_yyyy_mm_dd = new CobolString(256); // fallback
    private CobolString ws_edit_dt_of_birth_flgs = new CobolString(256); // fallback
    private CobolString ws_edit_dt_of_birth_isvalid = new CobolString(256); // fallback
    private CobolString ws_edit_fico_score_flgs = new CobolString(256); // fallback
    private CobolString flg_fico_score_isvalid = new CobolString(256); // fallback
    private CobolString ws_edit_first_name_flgs = new CobolString(256); // fallback
    private CobolString ws_edit_middle_name_flgs = new CobolString(256); // fallback
    private CobolString ws_edit_last_name_flgs = new CobolString(256); // fallback
    private CobolString ws_edit_address_line_1_flgs = new CobolString(256); // fallback
    private CobolString ws_edit_state_flgs = new CobolString(256); // fallback
    private CobolString flg_alpha_isvalid = new CobolString(256); // fallback
    private CobolString ws_edit_zipcode_flgs = new CobolString(256); // fallback
    private CobolString ws_edit_city_flgs = new CobolString(256); // fallback
    private CobolString ws_edit_country_flgs = new CobolString(256); // fallback
    private CobolString acup_new_cust_phone_num_1 = new CobolString(256); // fallback
    private CobolString ws_edit_phone_num_1_flgs = new CobolString(256); // fallback
    private CobolString acup_new_cust_phone_num_2 = new CobolString(256); // fallback
    private CobolString ws_edit_phone_num_2_flgs = new CobolString(256); // fallback
    private CobolString ws_eft_account_id_flgs = new CobolString(256); // fallback
    private CobolString ws_edit_pri_cardholder = new CobolString(256); // fallback
    private CobolString flg_state_isvalid = new CobolString(256); // fallback
    private CobolString flg_zipcode_isvalid = new CobolString(256); // fallback
    private CobolString input_error = new CobolString(256); // fallback
    private CobolString acup_old_acct_id_x = new CobolString(256); // fallback
    private CobolString acup_old_active_status = new CobolString(256); // fallback
    private CobolString acup_new_curr_bal = new CobolString(256); // fallback
    private CobolString acup_old_curr_bal = new CobolString(256); // fallback
    private CobolString acup_new_credit_limit = new CobolString(256); // fallback
    private CobolString acup_old_credit_limit = new CobolString(256); // fallback
    private CobolString acup_new_cash_credit_limit = new CobolString(256); // fallback
    private CobolString acup_old_cash_credit_limit = new CobolString(256); // fallback
    private CobolString acup_old_open_date = new CobolString(256); // fallback
    private CobolString acup_old_expiraion_date = new CobolString(256); // fallback
    private CobolString acup_old_reissue_date = new CobolString(256); // fallback
    private CobolString acup_new_curr_cyc_credit = new CobolString(256); // fallback
    private CobolString acup_old_curr_cyc_credit = new CobolString(256); // fallback
    private CobolString acup_new_curr_cyc_debit = new CobolString(256); // fallback
    private CobolString acup_old_curr_cyc_debit = new CobolString(256); // fallback
    private CobolString acup_old_group_id = new CobolString(256); // fallback
    private CobolString change_has_occurred = new CobolString(256); // fallback
    private CobolString acup_old_cust_id_x = new CobolString(256); // fallback
    private CobolString acup_old_cust_first_name = new CobolString(256); // fallback
    private CobolString acup_old_cust_middle_name = new CobolString(256); // fallback
    private CobolString acup_old_cust_last_name = new CobolString(256); // fallback
    private CobolString acup_old_cust_addr_line_1 = new CobolString(256); // fallback
    private CobolString acup_old_cust_addr_line_2 = new CobolString(256); // fallback
    private CobolString acup_old_cust_addr_line_3 = new CobolString(256); // fallback
    private CobolString acup_old_cust_addr_state_cd = new CobolString(256); // fallback
    private CobolString acup_old_cust_addr_country_cd = new CobolString(256); // fallback
    private CobolString acup_old_cust_addr_zip = new CobolString(256); // fallback
    private CobolString acup_old_cust_phone_num_1a = new CobolString(256); // fallback
    private CobolString acup_old_cust_phone_num_1b = new CobolString(256); // fallback
    private CobolString acup_old_cust_phone_num_1c = new CobolString(256); // fallback
    private CobolString acup_old_cust_phone_num_2a = new CobolString(256); // fallback
    private CobolString acup_old_cust_phone_num_2b = new CobolString(256); // fallback
    private CobolString acup_old_cust_phone_num_2c = new CobolString(256); // fallback
    private CobolString acup_new_cust_ssn_x = new CobolString(256); // fallback
    private CobolString acup_old_cust_ssn_x = new CobolString(256); // fallback
    private CobolString acup_old_cust_govt_issued_id = new CobolString(256); // fallback
    private CobolString acup_old_cust_dob_yyyy_mm_dd = new CobolString(256); // fallback
    private CobolString acup_old_cust_eft_account_id = new CobolString(256); // fallback
    private CobolString acup_old_cust_pri_holder_ind = new CobolString(256); // fallback
    private CobolString acup_old_cust_fico_score_x = new CobolString(256); // fallback
    private CobolString no_changes_detected = new CobolString(256); // fallback
    private CobolString flg_acctfilter_not_ok = new CobolString(256); // fallback
    private CobolString ws_prompt_for_acct = new CobolString(256); // fallback
    private CobolString acup_new_acct_id = new CobolString(256); // fallback
    private CobolString cc_acct_id_n = new CobolString(256); // fallback
    private CobolString flg_mandatory_not_ok = new CobolString(256); // fallback
    private CobolString flg_mandatory_blank = new CobolString(256); // fallback
    private CobolString flg_mandatory_isvalid = new CobolString(256); // fallback
    private CobolString flg_yes_no_blank = new CobolString(256); // fallback
    private CobolString flg_yes_no_isvalid = new CobolString(256); // fallback
    private CobolString flg_yes_no_not_ok = new CobolString(256); // fallback
    private CobolString flg_alpha_not_ok = new CobolString(256); // fallback
    private CobolString flg_alpha_blank = new CobolString(256); // fallback
    private CobolString lit_all_alpha_from_x = new CobolString(256); // fallback
    private CobolString lit_all_alpha_from = new CobolString(256); // fallback
    private CobolString flg_alphnanum_not_ok = new CobolString(256); // fallback
    private CobolString flg_alphnanum_blank = new CobolString(256); // fallback
    private CobolString lit_all_alphanum_from_x = new CobolString(256); // fallback
    private CobolString lit_all_alphanum_from = new CobolString(256); // fallback
    private CobolString flg_alphnanum_isvalid = new CobolString(256); // fallback
    private CobolString flg_signed_number_not_ok = new CobolString(256); // fallback
    private CobolString flg_signed_number_blank = new CobolString(256); // fallback
    private CobolString flg_signed_number_isvalid = new CobolString(256); // fallback
    private CobolString ws_edit_us_phone_is_invalid = new CobolString(256); // fallback
    private CobolString ws_edit_us_phone_is_valid = new CobolString(256); // fallback
    private CobolString flg_edit_us_phonea_blank = new CobolString(256); // fallback
    private CobolString flg_edit_us_phonea_not_ok = new CobolString(256); // fallback
    private CobolString ws_us_phone_area_code_to_edit = new CobolString(256); // fallback
    private CobolString valid_general_purp_code = new CobolString(256); // fallback
    private CobolString flg_edit_us_phonea_isvalid = new CobolString(256); // fallback
    private CobolString flg_edit_us_phoneb_blank = new CobolString(256); // fallback
    private CobolString flg_edit_us_phoneb_not_ok = new CobolString(256); // fallback
    private CobolString flg_edit_us_phoneb_isvalid = new CobolString(256); // fallback
    private CobolString flg_edit_us_phonec_blank = new CobolString(256); // fallback
    private CobolString flg_edit_us_phonec_not_ok = new CobolString(256); // fallback
    private CobolString flg_edit_us_phonec_isvalid = new CobolString(256); // fallback
    private CobolString flg_edit_us_ssn_part1_isvalid = new CobolString(256); // fallback
    private CobolString invalid_ssn_part1 = new CobolString(256); // fallback
    private CobolString flg_edit_us_ssn_part1_not_ok = new CobolString(256); // fallback
    private CobolString us_state_code_to_edit = new CobolString(256); // fallback
    private CobolString valid_us_state_code = new CobolString(256); // fallback
    private CobolString flg_state_not_ok = new CobolString(256); // fallback
    private CobolString fico_range_is_valid = new CobolString(256); // fallback
    private CobolString flg_fico_score_not_ok = new CobolString(256); // fallback
    private CobolString us_state_and_first_zip2 = new CobolString(256); // fallback
    private CobolString valid_us_state_zip_cd2_combo = new CobolString(256); // fallback
    private CobolString flg_zipcode_not_ok = new CobolString(256); // fallback
    private CobolString abend_culprit = new CobolString(256); // fallback
    private CobolString abend_code = new CobolString(256); // fallback
    private CobolString abend_reason = new CobolString(256); // fallback
    private CobolString abend_msg = new CobolString(256); // fallback
    private CobolString acup_show_details = new CobolString(256); // fallback
    private CobolString could_not_lock_acct_for_update = new CobolString(256); // fallback
    private CobolString acup_changes_okayed_lock_error = new CobolString(256); // fallback
    private CobolString locked_but_update_failed = new CobolString(256); // fallback
    private CobolString acup_changes_okayed_but_failed = new CobolString(256); // fallback
    private CobolString data_was_changed_before_update = new CobolString(256); // fallback
    private CobolString cdemo_card_num = new CobolString(256); // fallback
    private CobolString cdemo_acct_status = new CobolString(256); // fallback
    private CobolString cactupao = new CobolString(256); // fallback
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
    private CobolString acctsido = new CobolString(256); // fallback
    private CobolString acup_changes_made = new CobolString(256); // fallback
    private CobolString acsttuso = new CobolString(256); // fallback
    private CobolString acrdlimo = new CobolString(256); // fallback
    private CobolString acurbalo = new CobolString(256); // fallback
    private CobolString acshlimo = new CobolString(256); // fallback
    private CobolString acrcycro = new CobolString(256); // fallback
    private CobolString acrcydbo = new CobolString(256); // fallback
    private CobolString opnyearo = new CobolString(256); // fallback
    private CobolString opnmono = new CobolString(256); // fallback
    private CobolString opndayo = new CobolString(256); // fallback
    private CobolString expyearo = new CobolString(256); // fallback
    private CobolString expmono = new CobolString(256); // fallback
    private CobolString expdayo = new CobolString(256); // fallback
    private CobolString risyearo = new CobolString(256); // fallback
    private CobolString rismono = new CobolString(256); // fallback
    private CobolString risdayo = new CobolString(256); // fallback
    private CobolString aaddgrpo = new CobolString(256); // fallback
    private CobolString acstnumo = new CobolString(256); // fallback
    private CobolString actssn1o = new CobolString(256); // fallback
    private CobolString actssn2o = new CobolString(256); // fallback
    private CobolString actssn3o = new CobolString(256); // fallback
    private CobolString acstfcoo = new CobolString(256); // fallback
    private CobolString dobyearo = new CobolString(256); // fallback
    private CobolString dobmono = new CobolString(256); // fallback
    private CobolString dobdayo = new CobolString(256); // fallback
    private CobolString acsfnamo = new CobolString(256); // fallback
    private CobolString acsmnamo = new CobolString(256); // fallback
    private CobolString acslnamo = new CobolString(256); // fallback
    private CobolString acsadl1o = new CobolString(256); // fallback
    private CobolString acsadl2o = new CobolString(256); // fallback
    private CobolString acscityo = new CobolString(256); // fallback
    private CobolString acsstteo = new CobolString(256); // fallback
    private CobolString acszipco = new CobolString(256); // fallback
    private CobolString acsctryo = new CobolString(256); // fallback
    private CobolString acsph1ao = new CobolString(256); // fallback
    private CobolString acsph1bo = new CobolString(256); // fallback
    private CobolString acsph1co = new CobolString(256); // fallback
    private CobolString acsph2ao = new CobolString(256); // fallback
    private CobolString acsph2bo = new CobolString(256); // fallback
    private CobolString acsph2co = new CobolString(256); // fallback
    private CobolString acsgovto = new CobolString(256); // fallback
    private CobolString acseftco = new CobolString(256); // fallback
    private CobolString acspflgo = new CobolString(256); // fallback
    private CobolString prompt_for_changes = new CobolString(256); // fallback
    private CobolString acup_old_curr_bal_n = new CobolString(256); // fallback
    private CobolString ws_edit_currency_9_2_f = new CobolString(256); // fallback
    private CobolString acup_old_credit_limit_n = new CobolString(256); // fallback
    private CobolString acup_old_cash_credit_limit_n = new CobolString(256); // fallback
    private CobolString acup_old_curr_cyc_credit_n = new CobolString(256); // fallback
    private CobolString acup_old_curr_cyc_debit_n = new CobolString(256); // fallback
    private CobolString acup_old_open_year = new CobolString(256); // fallback
    private CobolString acup_old_open_mon = new CobolString(256); // fallback
    private CobolString acup_old_open_day = new CobolString(256); // fallback
    private CobolString acup_old_exp_year = new CobolString(256); // fallback
    private CobolString acup_old_exp_mon = new CobolString(256); // fallback
    private CobolString acup_old_exp_day = new CobolString(256); // fallback
    private CobolString acup_old_reissue_year = new CobolString(256); // fallback
    private CobolString acup_old_reissue_mon = new CobolString(256); // fallback
    private CobolString acup_old_reissue_day = new CobolString(256); // fallback
    private CobolString acup_old_cust_dob_year = new CobolString(256); // fallback
    private CobolString acup_old_cust_dob_mon = new CobolString(256); // fallback
    private CobolString acup_old_cust_dob_day = new CobolString(256); // fallback
    private CobolString acup_old_cust_phone_num_1 = new CobolString(256); // fallback
    private CobolString acup_old_cust_phone_num_2 = new CobolString(256); // fallback
    private CobolString flg_cred_limit_isvalid = new CobolString(256); // fallback
    private CobolString flg_cash_credit_limit_isvalid = new CobolString(256); // fallback
    private CobolString flg_curr_bal_isvalid = new CobolString(256); // fallback
    private CobolString flg_curr_cyc_credit_isvalid = new CobolString(256); // fallback
    private CobolString flg_curr_cyc_debit_isvalid = new CobolString(256); // fallback
    private CobolString prompt_for_search_keys = new CobolString(256); // fallback
    private CobolString prompt_for_confirmation = new CobolString(256); // fallback
    private CobolString confirm_update_success = new CobolString(256); // fallback
    private CobolString inform_failure = new CobolString(256); // fallback
    private CobolString ws_no_info_message = new CobolString(256); // fallback
    private CobolString ws_info_msg = new CobolString(256); // fallback
    private CobolString infomsgo = new CobolString(256); // fallback
    private CobolString errmsgo = new CobolString(256); // fallback
    private CobolString dfhbmfse = new CobolString(256); // fallback
    private CobolString acctsida = new CobolString(256); // fallback
    private CobolString acctsidl = new CobolString(256); // fallback
    private CobolString acsttusl = new CobolString(256); // fallback
    private CobolString flg_acct_status_not_ok = new CobolString(256); // fallback
    private CobolString flg_acct_status_blank = new CobolString(256); // fallback
    private CobolString flg_open_year_not_ok = new CobolString(256); // fallback
    private CobolString flg_open_year_blank = new CobolString(256); // fallback
    private CobolString opnyearl = new CobolString(256); // fallback
    private CobolString flg_open_month_not_ok = new CobolString(256); // fallback
    private CobolString flg_open_month_blank = new CobolString(256); // fallback
    private CobolString opnmonl = new CobolString(256); // fallback
    private CobolString flg_open_day_not_ok = new CobolString(256); // fallback
    private CobolString flg_open_day_blank = new CobolString(256); // fallback
    private CobolString opndayl = new CobolString(256); // fallback
    private CobolString flg_cred_limit_not_ok = new CobolString(256); // fallback
    private CobolString flg_cred_limit_blank = new CobolString(256); // fallback
    private CobolString acrdliml = new CobolString(256); // fallback
    private CobolString flg_expiry_year_not_ok = new CobolString(256); // fallback
    private CobolString flg_expiry_year_blank = new CobolString(256); // fallback
    private CobolString expyearl = new CobolString(256); // fallback
    private CobolString flg_expiry_month_not_ok = new CobolString(256); // fallback
    private CobolString flg_expiry_month_blank = new CobolString(256); // fallback
    private CobolString expmonl = new CobolString(256); // fallback
    private CobolString flg_expiry_day_not_ok = new CobolString(256); // fallback
    private CobolString flg_expiry_day_blank = new CobolString(256); // fallback
    private CobolString expdayl = new CobolString(256); // fallback
    private CobolString flg_cash_credit_limit_not_ok = new CobolString(256); // fallback
    private CobolString flg_cash_credit_limit_blank = new CobolString(256); // fallback
    private CobolString acshliml = new CobolString(256); // fallback
    private CobolString flg_reissue_year_not_ok = new CobolString(256); // fallback
    private CobolString flg_reissue_year_blank = new CobolString(256); // fallback
    private CobolString risyearl = new CobolString(256); // fallback
    private CobolString flg_reissue_month_not_ok = new CobolString(256); // fallback
    private CobolString flg_reissue_month_blank = new CobolString(256); // fallback
    private CobolString rismonl = new CobolString(256); // fallback
    private CobolString flg_reissue_day_not_ok = new CobolString(256); // fallback
    private CobolString flg_reissue_day_blank = new CobolString(256); // fallback
    private CobolString risdayl = new CobolString(256); // fallback
    private CobolString flg_curr_bal_not_ok = new CobolString(256); // fallback
    private CobolString flg_curr_bal_blank = new CobolString(256); // fallback
    private CobolString acurball = new CobolString(256); // fallback
    private CobolString flg_curr_cyc_credit_not_ok = new CobolString(256); // fallback
    private CobolString flg_curr_cyc_credit_blank = new CobolString(256); // fallback
    private CobolString acrcycrl = new CobolString(256); // fallback
    private CobolString flg_curr_cyc_debit_not_ok = new CobolString(256); // fallback
    private CobolString flg_curr_cyc_debit_blank = new CobolString(256); // fallback
    private CobolString acrcydbl = new CobolString(256); // fallback
    private CobolString flg_edit_us_ssn_part1_blank = new CobolString(256); // fallback
    private CobolString actssn1l = new CobolString(256); // fallback
    private CobolString flg_edit_us_ssn_part2_not_ok = new CobolString(256); // fallback
    private CobolString flg_edit_us_ssn_part2_blank = new CobolString(256); // fallback
    private CobolString actssn2l = new CobolString(256); // fallback
    private CobolString flg_edit_us_ssn_part3_not_ok = new CobolString(256); // fallback
    private CobolString flg_edit_us_ssn_part3_blank = new CobolString(256); // fallback
    private CobolString actssn3l = new CobolString(256); // fallback
    private CobolString flg_dt_of_birth_year_not_ok = new CobolString(256); // fallback
    private CobolString flg_dt_of_birth_year_blank = new CobolString(256); // fallback
    private CobolString dobyearl = new CobolString(256); // fallback
    private CobolString flg_dt_of_birth_month_not_ok = new CobolString(256); // fallback
    private CobolString flg_dt_of_birth_month_blank = new CobolString(256); // fallback
    private CobolString dobmonl = new CobolString(256); // fallback
    private CobolString flg_dt_of_birth_day_not_ok = new CobolString(256); // fallback
    private CobolString flg_dt_of_birth_day_blank = new CobolString(256); // fallback
    private CobolString dobdayl = new CobolString(256); // fallback
    private CobolString flg_fico_score_blank = new CobolString(256); // fallback
    private CobolString acstfcol = new CobolString(256); // fallback
    private CobolString flg_first_name_not_ok = new CobolString(256); // fallback
    private CobolString flg_first_name_blank = new CobolString(256); // fallback
    private CobolString acsfnaml = new CobolString(256); // fallback
    private CobolString flg_middle_name_not_ok = new CobolString(256); // fallback
    private CobolString acsmnaml = new CobolString(256); // fallback
    private CobolString flg_last_name_not_ok = new CobolString(256); // fallback
    private CobolString flg_last_name_blank = new CobolString(256); // fallback
    private CobolString acslnaml = new CobolString(256); // fallback
    private CobolString flg_address_line_1_not_ok = new CobolString(256); // fallback
    private CobolString flg_address_line_1_blank = new CobolString(256); // fallback
    private CobolString acsadl1l = new CobolString(256); // fallback
    private CobolString flg_state_blank = new CobolString(256); // fallback
    private CobolString acssttel = new CobolString(256); // fallback
    private CobolString flg_zipcode_blank = new CobolString(256); // fallback
    private CobolString acszipcl = new CobolString(256); // fallback
    private CobolString flg_city_not_ok = new CobolString(256); // fallback
    private CobolString flg_city_blank = new CobolString(256); // fallback
    private CobolString acscityl = new CobolString(256); // fallback
    private CobolString flg_country_not_ok = new CobolString(256); // fallback
    private CobolString flg_country_blank = new CobolString(256); // fallback
    private CobolString acsctryl = new CobolString(256); // fallback
    private CobolString flg_phone_num_1a_not_ok = new CobolString(256); // fallback
    private CobolString flg_phone_num_1a_blank = new CobolString(256); // fallback
    private CobolString acsph1al = new CobolString(256); // fallback
    private CobolString flg_phone_num_1b_not_ok = new CobolString(256); // fallback
    private CobolString flg_phone_num_1b_blank = new CobolString(256); // fallback
    private CobolString acsph1bl = new CobolString(256); // fallback
    private CobolString flg_phone_num_1c_not_ok = new CobolString(256); // fallback
    private CobolString flg_phone_num_1c_blank = new CobolString(256); // fallback
    private CobolString acsph1cl = new CobolString(256); // fallback
    private CobolString flg_phone_num_2a_not_ok = new CobolString(256); // fallback
    private CobolString flg_phone_num_2a_blank = new CobolString(256); // fallback
    private CobolString acsph2al = new CobolString(256); // fallback
    private CobolString flg_phone_num_2b_not_ok = new CobolString(256); // fallback
    private CobolString flg_phone_num_2b_blank = new CobolString(256); // fallback
    private CobolString acsph2bl = new CobolString(256); // fallback
    private CobolString flg_phone_num_2c_not_ok = new CobolString(256); // fallback
    private CobolString flg_phone_num_2c_blank = new CobolString(256); // fallback
    private CobolString acsph2cl = new CobolString(256); // fallback
    private CobolString flg_eft_account_id_not_ok = new CobolString(256); // fallback
    private CobolString flg_eft_account_id_blank = new CobolString(256); // fallback
    private CobolString acseftcl = new CobolString(256); // fallback
    private CobolString flg_pri_cardholder_not_ok = new CobolString(256); // fallback
    private CobolString flg_pri_cardholder_blank = new CobolString(256); // fallback
    private CobolString acspflgl = new CobolString(256); // fallback
    private CobolString lit_cclistmapset = new CobolString(256); // fallback
    private CobolString dfhdfcol = new CobolString(256); // fallback
    private CobolString acctsidc = new CobolString(256); // fallback
    private CobolString dfhred = new CobolString(256); // fallback
    private CobolString dfhbmprf = new CobolString(256); // fallback
    private CobolString acsttusa = new CobolString(256); // fallback
    private CobolString acrdlima = new CobolString(256); // fallback
    private CobolString acshlima = new CobolString(256); // fallback
    private CobolString acurbala = new CobolString(256); // fallback
    private CobolString acrcycra = new CobolString(256); // fallback
    private CobolString acrcydba = new CobolString(256); // fallback
    private CobolString opnyeara = new CobolString(256); // fallback
    private CobolString opnmona = new CobolString(256); // fallback
    private CobolString opndaya = new CobolString(256); // fallback
    private CobolString expyeara = new CobolString(256); // fallback
    private CobolString expmona = new CobolString(256); // fallback
    private CobolString expdaya = new CobolString(256); // fallback
    private CobolString risyeara = new CobolString(256); // fallback
    private CobolString rismona = new CobolString(256); // fallback
    private CobolString risdaya = new CobolString(256); // fallback
    private CobolString aaddgrpa = new CobolString(256); // fallback
    private CobolString acstnuma = new CobolString(256); // fallback
    private CobolString actssn1a = new CobolString(256); // fallback
    private CobolString actssn2a = new CobolString(256); // fallback
    private CobolString actssn3a = new CobolString(256); // fallback
    private CobolString acstfcoa = new CobolString(256); // fallback
    private CobolString dobyeara = new CobolString(256); // fallback
    private CobolString dobmona = new CobolString(256); // fallback
    private CobolString dobdaya = new CobolString(256); // fallback
    private CobolString acsfnama = new CobolString(256); // fallback
    private CobolString acsmnama = new CobolString(256); // fallback
    private CobolString acslnama = new CobolString(256); // fallback
    private CobolString acsadl1a = new CobolString(256); // fallback
    private CobolString acsadl2a = new CobolString(256); // fallback
    private CobolString acscitya = new CobolString(256); // fallback
    private CobolString acssttea = new CobolString(256); // fallback
    private CobolString acszipca = new CobolString(256); // fallback
    private CobolString acsctrya = new CobolString(256); // fallback
    private CobolString acsph1aa = new CobolString(256); // fallback
    private CobolString acsph1ba = new CobolString(256); // fallback
    private CobolString acsph1ca = new CobolString(256); // fallback
    private CobolString acsph2aa = new CobolString(256); // fallback
    private CobolString acsph2ba = new CobolString(256); // fallback
    private CobolString acsph2ca = new CobolString(256); // fallback
    private CobolString acsgovta = new CobolString(256); // fallback
    private CobolString acseftca = new CobolString(256); // fallback
    private CobolString acspflga = new CobolString(256); // fallback
    private CobolString infomsga = new CobolString(256); // fallback
    private CobolString dfhbmdar = new CobolString(256); // fallback
    private CobolString dfhbmasb = new CobolString(256); // fallback
    private CobolString fkey12a = new CobolString(256); // fallback
    private CobolString fkey05a = new CobolString(256); // fallback
    private CobolString ccard_next_map = new CobolString(256); // fallback
    private CobolString send = new CobolString(256); // fallback
    private CobolString[] map = new CobolString[100]; // fallback array
    private CobolString[] mapset = new CobolString[100]; // fallback array
    private CobolString[] from = new CobolString[100]; // fallback array
    private CobolString cursor = new CobolString(256); // fallback
    private CobolString erase = new CobolString(256); // fallback
    private CobolString freekb = new CobolString(256); // fallback
    private CobolString[] resp = new CobolString[100]; // fallback array
    private CobolString acup_old_details = new CobolString(256); // fallback
    private CobolString acup_old_acct_id = new CobolString(256); // fallback
    private CobolString ws_card_rid_acct_id = new CobolString(256); // fallback
    private CobolString did_not_find_acct_in_acctdat = new CobolString(256); // fallback
    private CobolString cdemo_cust_id = new CobolString(256); // fallback
    private CobolString ws_card_rid_cust_id = new CobolString(256); // fallback
    private CobolString did_not_find_cust_in_custdat = new CobolString(256); // fallback
    private CobolString error_opname = new CobolString(256); // fallback
    private CobolString lit_cardxrefname_acct_path = new CobolString(256); // fallback
    private CobolString error_file = new CobolString(256); // fallback
    private CobolString error_resp = new CobolString(256); // fallback
    private CobolString error_resp2 = new CobolString(256); // fallback
    private CobolString ws_file_error_message = new CobolString(256); // fallback
    private CobolString[] dfhresp = new CobolString[100]; // fallback array
    private CobolString normal = new CobolString(256); // fallback
    private CobolString xref_cust_id = new CobolString(256); // fallback
    private CobolString xref_card_num = new CobolString(256); // fallback
    private CobolString notfnd = new CobolString(256); // fallback
    private CobolString ws_card_rid_acct_id_x = new CobolString(256); // fallback
    private CobolString lit_acctfilename = new CobolString(256); // fallback
    private CobolString flg_custfilter_not_ok = new CobolString(256); // fallback
    private CobolString lit_custfilename = new CobolString(256); // fallback
    private CobolString ws_card_rid_cust_id_x = new CobolString(256); // fallback
    private CobolString acct_id = new CobolString(256); // fallback
    private CobolString cust_id = new CobolString(256); // fallback
    private CobolString cust_first_name = new CobolString(256); // fallback
    private CobolString cdemo_cust_fname = new CobolString(256); // fallback
    private CobolString cust_middle_name = new CobolString(256); // fallback
    private CobolString cdemo_cust_mname = new CobolString(256); // fallback
    private CobolString cust_last_name = new CobolString(256); // fallback
    private CobolString cdemo_cust_lname = new CobolString(256); // fallback
    private CobolString acct_active_status = new CobolString(256); // fallback
    private CobolString acct_curr_bal = new CobolString(256); // fallback
    private CobolString acct_credit_limit = new CobolString(256); // fallback
    private CobolString acct_cash_credit_limit = new CobolString(256); // fallback
    private CobolString acct_curr_cyc_credit = new CobolString(256); // fallback
    private CobolString acct_curr_cyc_debit = new CobolString(256); // fallback
    private CobolString acct_open_date = new CobolString(256); // fallback
    private CobolString acct_expiraion_date = new CobolString(256); // fallback
    private CobolString acct_reissue_date = new CobolString(256); // fallback
    private CobolString acct_group_id = new CobolString(256); // fallback
    private CobolString acup_old_cust_id = new CobolString(256); // fallback
    private CobolString cust_ssn = new CobolString(256); // fallback
    private CobolString acup_old_cust_ssn = new CobolString(256); // fallback
    private CobolString cust_dob_yyyy_mm_dd = new CobolString(256); // fallback
    private CobolString cust_fico_credit_score = new CobolString(256); // fallback
    private CobolString acup_old_cust_fico_score = new CobolString(256); // fallback
    private CobolString cust_addr_line_1 = new CobolString(256); // fallback
    private CobolString cust_addr_line_2 = new CobolString(256); // fallback
    private CobolString cust_addr_line_3 = new CobolString(256); // fallback
    private CobolString cust_addr_state_cd = new CobolString(256); // fallback
    private CobolString cust_addr_country_cd = new CobolString(256); // fallback
    private CobolString cust_addr_zip = new CobolString(256); // fallback
    private CobolString cust_phone_num_1 = new CobolString(256); // fallback
    private CobolString cust_phone_num_2 = new CobolString(256); // fallback
    private CobolString cust_govt_issued_id = new CobolString(256); // fallback
    private CobolString cust_eft_account_id = new CobolString(256); // fallback
    private CobolString cust_pri_card_holder_ind = new CobolString(256); // fallback
    private CobolString could_not_lock_cust_for_update = new CobolString(256); // fallback
    private CobolString acct_update_record = new CobolString(256); // fallback
    private CobolString acct_update_id = new CobolString(256); // fallback
    private CobolString acct_update_active_status = new CobolString(256); // fallback
    private CobolString acct_update_curr_bal = new CobolString(256); // fallback
    private CobolString acct_update_credit_limit = new CobolString(256); // fallback
    private CobolString acct_update_cash_credit_limit = new CobolString(256); // fallback
    private CobolString acct_update_curr_cyc_credit = new CobolString(256); // fallback
    private CobolString acct_update_curr_cyc_debit = new CobolString(256); // fallback
    private CobolString acct_update_open_date = new CobolString(256); // fallback
    private CobolString acct_update_expiraion_date = new CobolString(256); // fallback
    private CobolString acct_update_reissue_date = new CobolString(256); // fallback
    private CobolString acct_update_group_id = new CobolString(256); // fallback
    private CobolString cust_update_record = new CobolString(256); // fallback
    private CobolString acup_new_cust_id = new CobolString(256); // fallback
    private CobolString cust_update_id = new CobolString(256); // fallback
    private CobolString cust_update_first_name = new CobolString(256); // fallback
    private CobolString cust_update_middle_name = new CobolString(256); // fallback
    private CobolString cust_update_last_name = new CobolString(256); // fallback
    private CobolString cust_update_addr_line_1 = new CobolString(256); // fallback
    private CobolString cust_update_addr_line_2 = new CobolString(256); // fallback
    private CobolString cust_update_addr_line_3 = new CobolString(256); // fallback
    private CobolString cust_update_addr_state_cd = new CobolString(256); // fallback
    private CobolString cust_update_addr_country_cd = new CobolString(256); // fallback
    private CobolString cust_update_addr_zip = new CobolString(256); // fallback
    private CobolString _unnamed = new CobolString(256); // fallback
    private CobolString cust_update_phone_num_1 = new CobolString(256); // fallback
    private CobolString cust_update_phone_num_2 = new CobolString(256); // fallback
    private CobolString acup_new_cust_ssn = new CobolString(256); // fallback
    private CobolString cust_update_ssn = new CobolString(256); // fallback
    private CobolString cust_update_govt_issued_id = new CobolString(256); // fallback
    private CobolString cust_update_dob_yyyy_mm_dd = new CobolString(256); // fallback
    private CobolString cust_update_eft_account_id = new CobolString(256); // fallback
    private CobolString cust_update_pri_card_ind = new CobolString(256); // fallback
    private CobolString acup_new_cust_fico_score = new CobolString(256); // fallback
    private CobolString cust_update_fico_credit_score = new CobolString(256); // fallback
    private CobolString abend_data = new CobolString(256); // fallback
    private CobolString[] length = new CobolString[100]; // fallback array
    private CobolString nohandle = new CobolString(256); // fallback
    private CobolString handle = new CobolString(256); // fallback
    private CobolString abend = new CobolString(256); // fallback

    private void para_main() {
        /* RAW: 0000 - */
    }

    private void para_main_2() {
        /* RAW: EXEC CICS HANDLE ABEND LABEL ( */
        cc_work_area.set("");
        ws_misc_storage.set("");
        ws_commarea.set("");
        ws_tranid.set(String.valueOf(lit_thistranid));
        ws_return_msg_off.set(String.valueOf(cb_true));
        if ((String.valueOf(eibcalen).equals(String.valueOf(0)) || (String.valueOf(cdemo_from_program).equals(String.valueOf(lit_menupgm)) && !(!String.valueOf(cdemo_pgm_reenter).trim().isEmpty())))) {
            carddemo_commarea.set("");
            ws_this_progcommarea.set("");
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            acup_details_not_fetched.set(String.valueOf(cb_true));
        } else {
            carddemo_commarea.set(String.valueOf(CobolString.refMod(dfhcommarea, 1, CobolIntrinsics.length(carddemo_commarea))));
            ws_this_progcommarea.set(String.valueOf(CobolString.refMod(dfhcommarea, (CobolIntrinsics.length(carddemo_commarea) + 1), CobolIntrinsics.length(ws_this_progcommarea))));
        }
        yyyy_store_pfkey(); // THRU YYYY-STORE-PFKEY-EXIT
        pfk_invalid.set(String.valueOf(cb_true));
        if ((((!String.valueOf(ccard_aid_enter).trim().isEmpty() || !String.valueOf(ccard_aid_pfk03).trim().isEmpty()) || (!String.valueOf(ccard_aid_pfk05).trim().isEmpty() && !String.valueOf(acup_changes_ok_not_confirmed).trim().isEmpty())) || (!String.valueOf(ccard_aid_pfk12).trim().isEmpty() && !(!String.valueOf(acup_details_not_fetched).trim().isEmpty())))) {
            pfk_valid.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(pfk_invalid).trim().isEmpty()) {
            ccard_aid_enter.set(String.valueOf(cb_true));
        }
        if (!String.valueOf(ccard_aid_pfk03).trim().isEmpty()) {
            ccard_aid_pfk03.set(String.valueOf(cb_true));
            if ((String.valueOf(cdemo_from_tranid).equals(String.valueOf("\u0000")) || String.valueOf(cdemo_from_tranid).equals(String.valueOf(" ")))) {
                cdemo_to_tranid.set(String.valueOf(lit_menutranid));
            } else {
                cdemo_to_tranid.set(String.valueOf(cdemo_from_tranid));
            }
            if ((String.valueOf(cdemo_from_program).equals(String.valueOf("\u0000")) || String.valueOf(cdemo_from_program).equals(String.valueOf(" ")))) {
                cdemo_to_program.set(String.valueOf(lit_menupgm));
            } else {
                cdemo_to_program.set(String.valueOf(cdemo_from_program));
            }
            cdemo_from_tranid.set(String.valueOf(lit_thistranid));
            cdemo_from_program.set(String.valueOf(lit_thispgm));
            cdemo_usrtyp_user.set(String.valueOf(cb_true));
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            cdemo_last_mapset.set(String.valueOf(lit_thismapset));
            cdemo_last_map.set(String.valueOf(lit_thismap));
            exec.set(String.valueOf(lit_thismap));
            cics.set(String.valueOf(lit_thismap));
            syncpoint.set(String.valueOf(lit_thismap));
            end_exec.set(String.valueOf(lit_thismap));
            exec.set(String.valueOf(lit_thismap));
            cics.set(String.valueOf(lit_thismap));
            xctl.set(String.valueOf(lit_thismap));
            if (program[Integer.parseInt(String.valueOf(cdemo_to_program).trim()) - 1] == null) program[Integer.parseInt(String.valueOf(cdemo_to_program).trim()) - 1] = new CobolString(256);
            program[Integer.parseInt(String.valueOf(cdemo_to_program).trim()) - 1].set(String.valueOf(lit_thismap));
            if (commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] == null) commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1] = new CobolString(256);
            commarea[Integer.parseInt(String.valueOf(carddemo_commarea).trim()) - 1].set(String.valueOf(lit_thismap));
            end_exec.set(String.valueOf(lit_thismap));
        } else if (!String.valueOf(acup_details_not_fetched).trim().isEmpty()) {
            /* RAW: AND CDEMO-PGM-ENTER */
        } else if (!String.valueOf(cdemo_from_program).trim().isEmpty()) {
            /* RAW: EQUAL LIT-MENUPGM AND NOT CDEMO-PGM-REENTER */
            ws_this_progcommarea.set("");
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            cdemo_pgm_reenter.set(String.valueOf(cb_true));
            acup_details_not_fetched.set(String.valueOf(cb_true));
            common_return();
            return;
        } else if (!String.valueOf(acup_changes_okayed_and_done).trim().isEmpty()) {
        } else if (!String.valueOf(acup_changes_failed).trim().isEmpty()) {
            ws_this_progcommarea.set("");
            ws_misc_storage.set("");
            cdemo_acct_id.set("");
            cdemo_pgm_enter.set(String.valueOf(cb_true));
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            cdemo_pgm_reenter.set(String.valueOf(cb_true));
            acup_details_not_fetched.set(String.valueOf(cb_true));
            common_return();
            return;
        } else {
            _1000();
            /* RAW: - PROCESS-INPUTS THRU 1000 - PROCESS-INPUTS-EXIT */
            _2000();
            /* RAW: - DECIDE-ACTION THRU 2000 - DECIDE-ACTION-EXIT */
            _3000();
            /* RAW: - SEND-MAP THRU 3000 - SEND-MAP-EXIT */
            common_return();
            return;
        }
    }

    private void common_return() {
        ccard_error_msg.set(String.valueOf(ws_return_msg));
        ws_commarea.set(String.valueOf(carddemo_commarea));
        ws_commarea.setRefMod((CobolIntrinsics.length(carddemo_commarea) + 1), CobolIntrinsics.length(ws_this_progcommarea), String.valueOf(ws_this_progcommarea));
        exec.set(String.valueOf(ws_this_progcommarea));
        cics.set(String.valueOf(ws_this_progcommarea));
        /* RETURN TRANSID */
        /* RAW: ( LIT-THISTRANID ) COMMAREA ( WS-COMMAREA */
    }

    private void end_exec() {
        /* RAW: 0000 - */
    }

    private void main_exit() {
        return;
    }

    private void process_inputs() {
        _1100();
        /* RAW: - RECEIVE-MAP THRU 1100 - RECEIVE-MAP-EXIT */
        _1200();
        /* RAW: - EDIT-MAP-INPUTS THRU 1200 - EDIT-MAP-INPUTS-EXIT */
        ccard_error_msg.set(String.valueOf(ws_return_msg));
        ccard_next_prog.set(String.valueOf(lit_thispgm));
        ccard_next_mapset.set(String.valueOf(lit_thismapset));
    }

    private void ccard_next_map() {
        /* RAW: 1000 - */
    }

    private void process_inputs_exit() {
        return;
    }

    private void receive_map() {
        /* RAW: EXEC CICS RECEIVE MAP ( LIT-THISMAP */
        acup_new_details.set("");
        if ((String.valueOf(acctsidi).equals(String.valueOf("*")) || String.valueOf(acctsidi).equals(String.valueOf(" ")))) {
            cc_acct_id.set(String.valueOf("\u0000"));
            acup_new_acct_id_x.set(String.valueOf("\u0000"));
        } else {
            cc_acct_id.set(String.valueOf(acctsidi));
            acup_new_acct_id_x.set(String.valueOf(acctsidi));
        }
        if (!String.valueOf(acup_details_not_fetched).trim().isEmpty()) {
            _1100();
            return;
        }
        if ((String.valueOf(acsttusi).equals(String.valueOf("*")) || String.valueOf(acsttusi).equals(String.valueOf(" ")))) {
            acup_new_active_status.set(String.valueOf("\u0000"));
        } else {
            acup_new_active_status.set(String.valueOf(acsttusi));
        }
        if ((String.valueOf(acrdlimi).equals(String.valueOf("*")) || String.valueOf(acrdlimi).equals(String.valueOf(" ")))) {
            acup_new_credit_limit_x.set(String.valueOf("\u0000"));
        } else {
            acup_new_credit_limit_x.set(String.valueOf(acrdlimi));
            if (String.valueOf(CobolIntrinsics.test_numval_c(acup_new_credit_limit_x)).equals(String.valueOf(0))) {
                acup_new_credit_limit_n.set(String.valueOf(CobolIntrinsics.numval_c(acrdlimi)));
            } else {
                /* CONTINUE */
            }
        }
        if ((String.valueOf(acshlimi).equals(String.valueOf("*")) || String.valueOf(acshlimi).equals(String.valueOf(" ")))) {
            acup_new_cash_credit_limit_x.set(String.valueOf("\u0000"));
        } else {
            acup_new_cash_credit_limit_x.set(String.valueOf(acshlimi));
            if (String.valueOf(CobolIntrinsics.test_numval_c(acup_new_cash_credit_limit_x)).equals(String.valueOf(0))) {
                acup_new_cash_credit_limit_n.set(String.valueOf(CobolIntrinsics.numval_c(acshlimi)));
            } else {
                /* CONTINUE */
            }
        }
        if ((String.valueOf(acurbali).equals(String.valueOf("*")) || String.valueOf(acurbali).equals(String.valueOf(" ")))) {
            acup_new_curr_bal_x.set(String.valueOf("\u0000"));
        } else {
            acup_new_curr_bal_x.set(String.valueOf(acurbali));
            if (String.valueOf(CobolIntrinsics.test_numval_c(acup_new_curr_bal_x)).equals(String.valueOf(0))) {
                acup_new_curr_bal_n.set(String.valueOf(CobolIntrinsics.numval_c(acup_new_curr_bal_x)));
            } else {
                /* CONTINUE */
            }
        }
        if ((String.valueOf(acrcycri).equals(String.valueOf("*")) || String.valueOf(acrcycri).equals(String.valueOf(" ")))) {
            acup_new_curr_cyc_credit_x.set(String.valueOf("\u0000"));
        } else {
            acup_new_curr_cyc_credit_x.set(String.valueOf(acrcycri));
            if (String.valueOf(CobolIntrinsics.test_numval_c(acup_new_curr_cyc_credit_x)).equals(String.valueOf(0))) {
                acup_new_curr_cyc_credit_n.set(String.valueOf(CobolIntrinsics.numval_c(acrcycri)));
            } else {
                /* CONTINUE */
            }
        }
        if ((String.valueOf(acrcydbi).equals(String.valueOf("*")) || String.valueOf(acrcydbi).equals(String.valueOf(" ")))) {
            acup_new_curr_cyc_debit_x.set(String.valueOf("\u0000"));
        } else {
            acup_new_curr_cyc_debit_x.set(String.valueOf(acrcydbi));
            if (String.valueOf(CobolIntrinsics.test_numval_c(acup_new_curr_cyc_debit_x)).equals(String.valueOf(0))) {
                acup_new_curr_cyc_debit_n.set(String.valueOf(CobolIntrinsics.numval_c(acrcydbi)));
            } else {
                /* CONTINUE */
            }
        }
        if ((String.valueOf(opnyeari).equals(String.valueOf("*")) || String.valueOf(opnyeari).equals(String.valueOf(" ")))) {
            acup_new_open_year.set(String.valueOf("\u0000"));
        } else {
            acup_new_open_year.set(String.valueOf(opnyeari));
        }
        if ((String.valueOf(opnmoni).equals(String.valueOf("*")) || String.valueOf(opnmoni).equals(String.valueOf(" ")))) {
            acup_new_open_mon.set(String.valueOf("\u0000"));
        } else {
            acup_new_open_mon.set(String.valueOf(opnmoni));
        }
        if ((String.valueOf(opndayi).equals(String.valueOf("*")) || String.valueOf(opndayi).equals(String.valueOf(" ")))) {
            acup_new_open_day.set(String.valueOf("\u0000"));
        } else {
            acup_new_open_day.set(String.valueOf(opndayi));
        }
        if ((String.valueOf(expyeari).equals(String.valueOf("*")) || String.valueOf(expyeari).equals(String.valueOf(" ")))) {
            acup_new_exp_year.set(String.valueOf("\u0000"));
        } else {
            acup_new_exp_year.set(String.valueOf(expyeari));
        }
        if ((String.valueOf(expmoni).equals(String.valueOf("*")) || String.valueOf(expmoni).equals(String.valueOf(" ")))) {
            acup_new_exp_mon.set(String.valueOf("\u0000"));
        } else {
            acup_new_exp_mon.set(String.valueOf(expmoni));
        }
        if ((String.valueOf(expdayi).equals(String.valueOf("*")) || String.valueOf(expdayi).equals(String.valueOf(" ")))) {
            acup_new_exp_day.set(String.valueOf("\u0000"));
        } else {
            acup_new_exp_day.set(String.valueOf(expdayi));
        }
        if ((String.valueOf(risyeari).equals(String.valueOf("*")) || String.valueOf(risyeari).equals(String.valueOf(" ")))) {
            acup_new_reissue_year.set(String.valueOf("\u0000"));
        } else {
            acup_new_reissue_year.set(String.valueOf(risyeari));
        }
        if ((String.valueOf(rismoni).equals(String.valueOf("*")) || String.valueOf(rismoni).equals(String.valueOf(" ")))) {
            acup_new_reissue_mon.set(String.valueOf("\u0000"));
        } else {
            acup_new_reissue_mon.set(String.valueOf(rismoni));
        }
        if ((String.valueOf(risdayi).equals(String.valueOf("*")) || String.valueOf(risdayi).equals(String.valueOf(" ")))) {
            acup_new_reissue_day.set(String.valueOf("\u0000"));
        } else {
            acup_new_reissue_day.set(String.valueOf(risdayi));
        }
        if ((String.valueOf(aaddgrpi).equals(String.valueOf("*")) || String.valueOf(aaddgrpi).equals(String.valueOf(" ")))) {
            acup_new_group_id.set(String.valueOf("\u0000"));
        } else {
            acup_new_group_id.set(String.valueOf(aaddgrpi));
        }
        if ((String.valueOf(acstnumi).equals(String.valueOf("*")) || String.valueOf(acstnumi).equals(String.valueOf(" ")))) {
            acup_new_cust_id_x.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_id_x.set(String.valueOf(acstnumi));
        }
        if ((String.valueOf(actssn1i).equals(String.valueOf("*")) || String.valueOf(actssn1i).equals(String.valueOf(" ")))) {
            acup_new_cust_ssn_1.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_ssn_1.set(String.valueOf(actssn1i));
        }
        if ((String.valueOf(actssn2i).equals(String.valueOf("*")) || String.valueOf(actssn2i).equals(String.valueOf(" ")))) {
            acup_new_cust_ssn_2.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_ssn_2.set(String.valueOf(actssn2i));
        }
        if ((String.valueOf(actssn3i).equals(String.valueOf("*")) || String.valueOf(actssn3i).equals(String.valueOf(" ")))) {
            acup_new_cust_ssn_3.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_ssn_3.set(String.valueOf(actssn3i));
        }
        if ((String.valueOf(dobyeari).equals(String.valueOf("*")) || String.valueOf(dobyeari).equals(String.valueOf(" ")))) {
            acup_new_cust_dob_year.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_dob_year.set(String.valueOf(dobyeari));
        }
        if ((String.valueOf(dobmoni).equals(String.valueOf("*")) || String.valueOf(dobmoni).equals(String.valueOf(" ")))) {
            acup_new_cust_dob_mon.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_dob_mon.set(String.valueOf(dobmoni));
        }
        if ((String.valueOf(dobdayi).equals(String.valueOf("*")) || String.valueOf(dobdayi).equals(String.valueOf(" ")))) {
            acup_new_cust_dob_day.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_dob_day.set(String.valueOf(dobdayi));
        }
        if ((String.valueOf(acstfcoi).equals(String.valueOf("*")) || String.valueOf(acstfcoi).equals(String.valueOf(" ")))) {
            acup_new_cust_fico_score_x.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_fico_score_x.set(String.valueOf(acstfcoi));
        }
        if ((String.valueOf(acsfnami).equals(String.valueOf("*")) || String.valueOf(acsfnami).equals(String.valueOf(" ")))) {
            acup_new_cust_first_name.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_first_name.set(String.valueOf(acsfnami));
        }
        if ((String.valueOf(acsmnami).equals(String.valueOf("*")) || String.valueOf(acsmnami).equals(String.valueOf(" ")))) {
            acup_new_cust_middle_name.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_middle_name.set(String.valueOf(acsmnami));
        }
        if ((String.valueOf(acslnami).equals(String.valueOf("*")) || String.valueOf(acslnami).equals(String.valueOf(" ")))) {
            acup_new_cust_last_name.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_last_name.set(String.valueOf(acslnami));
        }
        if ((String.valueOf(acsadl1i).equals(String.valueOf("*")) || String.valueOf(acsadl1i).equals(String.valueOf(" ")))) {
            acup_new_cust_addr_line_1.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_addr_line_1.set(String.valueOf(acsadl1i));
        }
        if ((String.valueOf(acsadl2i).equals(String.valueOf("*")) || String.valueOf(acsadl2i).equals(String.valueOf(" ")))) {
            acup_new_cust_addr_line_2.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_addr_line_2.set(String.valueOf(acsadl2i));
        }
        if ((String.valueOf(acscityi).equals(String.valueOf("*")) || String.valueOf(acscityi).equals(String.valueOf(" ")))) {
            acup_new_cust_addr_line_3.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_addr_line_3.set(String.valueOf(acscityi));
        }
        if ((String.valueOf(acssttei).equals(String.valueOf("*")) || String.valueOf(acssttei).equals(String.valueOf(" ")))) {
            acup_new_cust_addr_state_cd.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_addr_state_cd.set(String.valueOf(acssttei));
        }
        if ((String.valueOf(acsctryi).equals(String.valueOf("*")) || String.valueOf(acsctryi).equals(String.valueOf(" ")))) {
            acup_new_cust_addr_country_cd.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_addr_country_cd.set(String.valueOf(acsctryi));
        }
        if ((String.valueOf(acszipci).equals(String.valueOf("*")) || String.valueOf(acszipci).equals(String.valueOf(" ")))) {
            acup_new_cust_addr_zip.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_addr_zip.set(String.valueOf(acszipci));
        }
        if ((String.valueOf(acsph1ai).equals(String.valueOf("*")) || String.valueOf(acsph1ai).equals(String.valueOf(" ")))) {
            acup_new_cust_phone_num_1a.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_phone_num_1a.set(String.valueOf(acsph1ai));
        }
        if ((String.valueOf(acsph1bi).equals(String.valueOf("*")) || String.valueOf(acsph1bi).equals(String.valueOf(" ")))) {
            acup_new_cust_phone_num_1b.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_phone_num_1b.set(String.valueOf(acsph1bi));
        }
        if ((String.valueOf(acsph1ci).equals(String.valueOf("*")) || String.valueOf(acsph1ci).equals(String.valueOf(" ")))) {
            acup_new_cust_phone_num_1c.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_phone_num_1c.set(String.valueOf(acsph1ci));
        }
        if ((String.valueOf(acsph2ai).equals(String.valueOf("*")) || String.valueOf(acsph2ai).equals(String.valueOf(" ")))) {
            acup_new_cust_phone_num_2a.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_phone_num_2a.set(String.valueOf(acsph2ai));
        }
        if ((String.valueOf(acsph2bi).equals(String.valueOf("*")) || String.valueOf(acsph2bi).equals(String.valueOf(" ")))) {
            acup_new_cust_phone_num_2b.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_phone_num_2b.set(String.valueOf(acsph2bi));
        }
        if ((String.valueOf(acsph2ci).equals(String.valueOf("*")) || String.valueOf(acsph2ci).equals(String.valueOf(" ")))) {
            acup_new_cust_phone_num_2c.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_phone_num_2c.set(String.valueOf(acsph2ci));
        }
        if ((String.valueOf(acsgovti).equals(String.valueOf("*")) || String.valueOf(acsgovti).equals(String.valueOf(" ")))) {
            acup_new_cust_govt_issued_id.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_govt_issued_id.set(String.valueOf(acsgovti));
        }
        if ((String.valueOf(acseftci).equals(String.valueOf("*")) || String.valueOf(acseftci).equals(String.valueOf(" ")))) {
            acup_new_cust_eft_account_id.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_eft_account_id.set(String.valueOf(acseftci));
        }
        if ((String.valueOf(acspflgi).equals(String.valueOf("*")) || String.valueOf(acspflgi).equals(String.valueOf(" ")))) {
            acup_new_cust_pri_holder_ind.set(String.valueOf("\u0000"));
        } else {
            acup_new_cust_pri_holder_ind.set(String.valueOf(acspflgi));
        }
        /* RAW: 1100 - */
    }

    private void receive_map_exit() {
        return;
    }

    private void edit_map_inputs() {
        input_ok.set(String.valueOf(cb_true));
        if (!String.valueOf(acup_details_not_fetched).trim().isEmpty()) {
            _1210();
            /* RAW: - EDIT-ACCOUNT THRU 1210 - EDIT-ACCOUNT-EXIT */
            acup_old_acct_data.set(String.valueOf("\u0000"));
            if (!String.valueOf(flg_acctfilter_blank).trim().isEmpty()) {
                no_search_criteria_received.set(String.valueOf(cb_true));
            }
            _1200();
            return;
        } else {
            /* CONTINUE */
        }
        found_account_data.set(String.valueOf(cb_true));
        found_acct_in_master.set(String.valueOf(cb_true));
        flg_acctfilter_isvalid.set(String.valueOf(cb_true));
        found_cust_in_master.set(String.valueOf(cb_true));
        flg_custfilter_isvalid.set(String.valueOf(cb_true));
        _1205();
        /* RAW: - COMPARE-OLD-NEW THRU 1205 - COMPARE-OLD-NEW-EXIT */
        if (((!String.valueOf(no_changes_found).trim().isEmpty() || !String.valueOf(acup_changes_ok_not_confirmed).trim().isEmpty()) || !String.valueOf(acup_changes_okayed_and_done).trim().isEmpty())) {
            ws_non_key_flags.set(String.valueOf("\u0000"));
            _1200();
            return;
        }
        acup_changes_not_ok.set(String.valueOf(cb_true));
        ws_edit_variable_name.set(String.valueOf("Account Status"));
        ws_edit_yes_no.set(String.valueOf(acup_new_active_status));
        _1220();
        /* RAW: - EDIT-YESNO THRU 1220 - EDIT-YESNO-EXIT */
        ws_edit_acct_status.set(String.valueOf(ws_edit_yes_no));
        ws_edit_variable_name.set(String.valueOf("Open Date"));
        ws_edit_date_ccyymmdd.set(String.valueOf(acup_new_open_date));
        edit_date_ccyymmdd(); // THRU EDIT-DATE-CCYYMMDD-EXIT
        ws_edit_open_date_flgs.set(String.valueOf(ws_edit_date_flgs));
        ws_edit_variable_name.set(String.valueOf("Credit Limit"));
        ws_edit_signed_number_9v2_x.set(String.valueOf(acup_new_credit_limit_x));
        _1250();
        /* RAW: - EDIT-SIGNED-9V2 THRU 1250 - EDIT-SIGNED-9V2-EXIT */
        ws_edit_credit_limit.set(String.valueOf(ws_flg_signed_number_edit));
        ws_edit_variable_name.set(String.valueOf("Expiry Date"));
        ws_edit_date_ccyymmdd.set(String.valueOf(acup_new_expiraion_date));
        edit_date_ccyymmdd(); // THRU EDIT-DATE-CCYYMMDD-EXIT
        ws_expiry_date_flgs.set(String.valueOf(ws_edit_date_flgs));
        ws_edit_variable_name.set(String.valueOf("Cash Credit Limit"));
        ws_edit_signed_number_9v2_x.set(String.valueOf(acup_new_cash_credit_limit_x));
        _1250();
        /* RAW: - EDIT-SIGNED-9V2 THRU 1250 - EDIT-SIGNED-9V2-EXIT */
        ws_edit_cash_credit_limit.set(String.valueOf(ws_flg_signed_number_edit));
        ws_edit_variable_name.set(String.valueOf("Reissue Date"));
        ws_edit_date_ccyymmdd.set(String.valueOf(acup_new_reissue_date));
        edit_date_ccyymmdd(); // THRU EDIT-DATE-CCYYMMDD-EXIT
        ws_edit_reissue_date_flgs.set(String.valueOf(ws_edit_date_flgs));
        ws_edit_variable_name.set(String.valueOf("Current Balance"));
        ws_edit_signed_number_9v2_x.set(String.valueOf(acup_new_curr_bal_x));
        _1250();
        /* RAW: - EDIT-SIGNED-9V2 THRU 1250 - EDIT-SIGNED-9V2-EXIT */
        ws_edit_curr_bal.set(String.valueOf(ws_flg_signed_number_edit));
        ws_edit_variable_name.set(String.valueOf("Current Cycle Credit Limit"));
        ws_edit_signed_number_9v2_x.set(String.valueOf(acup_new_curr_cyc_credit_x));
        _1250();
        /* RAW: - EDIT-SIGNED-9V2 THRU 1250 - EDIT-SIGNED-9V2-EXIT */
        ws_edit_curr_cyc_credit.set(String.valueOf(ws_flg_signed_number_edit));
        ws_edit_variable_name.set(String.valueOf("Current Cycle Debit Limit"));
        ws_edit_signed_number_9v2_x.set(String.valueOf(acup_new_curr_cyc_debit_x));
        _1250();
        /* RAW: - EDIT-SIGNED-9V2 THRU 1250 - EDIT-SIGNED-9V2-EXIT */
        ws_edit_curr_cyc_debit.set(String.valueOf(ws_flg_signed_number_edit));
        ws_edit_variable_name.set(String.valueOf("SSN"));
        _1265();
        /* RAW: - EDIT-US-SSN THRU 1265 - EDIT-US-SSN-EXIT */
        ws_edit_variable_name.set(String.valueOf("Date of Birth"));
        ws_edit_date_ccyymmdd.set(String.valueOf(acup_new_cust_dob_yyyy_mm_dd));
        edit_date_ccyymmdd(); // THRU EDIT-DATE-CCYYMMDD-EXIT
        ws_edit_dt_of_birth_flgs.set(String.valueOf(ws_edit_date_flgs));
        if (!String.valueOf(ws_edit_dt_of_birth_isvalid).trim().isEmpty()) {
            edit_date_of_birth(); // THRU EDIT-DATE-OF-BIRTH-EXIT
            ws_edit_dt_of_birth_flgs.set(String.valueOf(ws_edit_date_flgs));
        }
        ws_edit_variable_name.set(String.valueOf("FICO Score"));
        ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_fico_score_x));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(3).trim());
        _1245();
        /* RAW: - EDIT-NUM-REQD THRU 1245 - EDIT-NUM-REQD-EXIT */
        ws_edit_fico_score_flgs.set(String.valueOf(ws_edit_alphanum_only_flags));
        if (!String.valueOf(flg_fico_score_isvalid).trim().isEmpty()) {
            _1275();
            /* RAW: - EDIT-FICO-SCORE THRU 1275 - EDIT-FICO-SCORE-EXIT */
        }
        ws_edit_variable_name.set(String.valueOf("First Name"));
        ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_first_name));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(25).trim());
        _1225();
        /* RAW: - EDIT-ALPHA-REQD THRU 1225 - EDIT-ALPHA-REQD-EXIT */
        ws_edit_first_name_flgs.set(String.valueOf(ws_edit_alpha_only_flags));
        ws_edit_variable_name.set(String.valueOf("Middle Name"));
        ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_middle_name));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(25).trim());
        _1235();
        /* RAW: - EDIT-ALPHA-OPT THRU 1235 - EDIT-ALPHA-OPT-EXIT */
        ws_edit_middle_name_flgs.set(String.valueOf(ws_edit_alpha_only_flags));
        ws_edit_variable_name.set(String.valueOf("Last Name"));
        ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_last_name));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(25).trim());
        _1225();
        /* RAW: - EDIT-ALPHA-REQD THRU 1225 - EDIT-ALPHA-REQD-EXIT */
        ws_edit_last_name_flgs.set(String.valueOf(ws_edit_alpha_only_flags));
        ws_edit_variable_name.set(String.valueOf("Address Line 1"));
        ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_addr_line_1));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(50).trim());
        _1215();
        /* RAW: - EDIT-MANDATORY THRU 1215 - EDIT-MANDATORY-EXIT */
        ws_edit_address_line_1_flgs.set(String.valueOf(ws_edit_mandatory_flags));
        ws_edit_variable_name.set(String.valueOf("State"));
        ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_addr_state_cd));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(2).trim());
        _1225();
        /* RAW: - EDIT-ALPHA-REQD THRU 1225 - EDIT-ALPHA-REQD-EXIT */
        ws_edit_state_flgs.set(String.valueOf(ws_edit_alpha_only_flags));
        if (!String.valueOf(flg_alpha_isvalid).trim().isEmpty()) {
            _1270();
            /* RAW: - EDIT-US-STATE-CD THRU 1270 - EDIT-US-STATE-CD-EXIT */
        }
        ws_edit_variable_name.set(String.valueOf("Zip"));
        ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_addr_zip));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(5).trim());
        _1245();
        /* RAW: - EDIT-NUM-REQD THRU 1245 - EDIT-NUM-REQD-EXIT */
        ws_edit_zipcode_flgs.set(String.valueOf(ws_edit_alphanum_only_flags));
        ws_edit_variable_name.set(String.valueOf("City"));
        ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_addr_line_3));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(50).trim());
        _1225();
        /* RAW: - EDIT-ALPHA-REQD THRU 1225 - EDIT-ALPHA-REQD-EXIT */
        ws_edit_city_flgs.set(String.valueOf(ws_edit_alpha_only_flags));
        ws_edit_variable_name.set(String.valueOf("Country"));
        ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_addr_country_cd));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(3).trim());
        _1225();
        /* RAW: - EDIT-ALPHA-REQD THRU 1225 - EDIT-ALPHA-REQD-EXIT */
        ws_edit_country_flgs.set(String.valueOf(ws_edit_alpha_only_flags));
        ws_edit_variable_name.set(String.valueOf("Phone Number 1"));
        ws_edit_us_phone_num.set(String.valueOf(acup_new_cust_phone_num_1));
        _1260();
        /* RAW: - EDIT-US-PHONE-NUM THRU 1260 - EDIT-US-PHONE-NUM-EXIT */
        ws_edit_phone_num_1_flgs.set(String.valueOf(ws_edit_us_phone_num_flgs));
        ws_edit_variable_name.set(String.valueOf("Phone Number 2"));
        ws_edit_us_phone_num.set(String.valueOf(acup_new_cust_phone_num_2));
        _1260();
        /* RAW: - EDIT-US-PHONE-NUM THRU 1260 - EDIT-US-PHONE-NUM-EXIT */
        ws_edit_phone_num_2_flgs.set(String.valueOf(ws_edit_us_phone_num_flgs));
        ws_edit_variable_name.set(String.valueOf("EFT Account Id"));
        ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_eft_account_id));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(10).trim());
        _1245();
        /* RAW: - EDIT-NUM-REQD THRU 1245 - EDIT-NUM-REQD-EXIT */
        ws_eft_account_id_flgs.set(String.valueOf(ws_edit_alphanum_only_flags));
        ws_edit_variable_name.set(String.valueOf("Primary Card Holder"));
        ws_edit_yes_no.set(String.valueOf(acup_new_cust_pri_holder_ind));
        _1220();
        /* RAW: - EDIT-YESNO THRU 1220 - EDIT-YESNO-EXIT */
        ws_edit_pri_cardholder.set(String.valueOf(ws_edit_yes_no));
        if ((!String.valueOf(flg_state_isvalid).trim().isEmpty() && !String.valueOf(flg_zipcode_isvalid).trim().isEmpty())) {
            _1280();
            /* RAW: - EDIT-US-STATE-ZIP-CD THRU 1280 - EDIT-US-STATE-ZIP-CD-EXIT */
        }
        if (!String.valueOf(input_error).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            acup_changes_ok_not_confirmed.set(String.valueOf(cb_true));
        }
        /* RAW: 1200 - */
    }

    private void edit_map_inputs_exit() {
        return;
    }

    private void compare_old_new() {
        no_changes_found.set(String.valueOf(cb_true));
        if (((((((((((String.valueOf(acup_new_acct_id_x).equals(String.valueOf(acup_old_acct_id_x)) && String.valueOf(CobolIntrinsics.upper_case(acup_new_active_status)).equals(String.valueOf(CobolIntrinsics.upper_case(acup_old_active_status)))) && String.valueOf(acup_new_curr_bal).equals(String.valueOf(acup_old_curr_bal))) && String.valueOf(acup_new_credit_limit).equals(String.valueOf(acup_old_credit_limit))) && String.valueOf(acup_new_cash_credit_limit).equals(String.valueOf(acup_old_cash_credit_limit))) && String.valueOf(acup_new_open_date).equals(String.valueOf(acup_old_open_date))) && String.valueOf(acup_new_expiraion_date).equals(String.valueOf(acup_old_expiraion_date))) && String.valueOf(acup_new_reissue_date).equals(String.valueOf(acup_old_reissue_date))) && String.valueOf(acup_new_curr_cyc_credit).equals(String.valueOf(acup_old_curr_cyc_credit))) && String.valueOf(acup_new_curr_cyc_debit).equals(String.valueOf(acup_old_curr_cyc_debit))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_group_id))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_group_id)))))) {
            /* CONTINUE */
        } else {
            change_has_occurred.set(String.valueOf(cb_true));
            _1205();
            return;
        }
        if ((((((((((((((((((((((String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_cust_id_x))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_cust_id_x)))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_cust_first_name))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_cust_first_name))))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_cust_middle_name))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_cust_middle_name))))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_cust_last_name))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_cust_last_name))))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_cust_addr_line_1))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_cust_addr_line_1))))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_cust_addr_line_2))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_cust_addr_line_2))))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_cust_addr_line_3))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_cust_addr_line_3))))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_cust_addr_state_cd))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_cust_addr_state_cd))))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_cust_addr_country_cd))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_cust_addr_country_cd))))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_cust_addr_zip))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_cust_addr_zip))))) && String.valueOf(acup_new_cust_phone_num_1a).equals(String.valueOf(acup_old_cust_phone_num_1a))) && String.valueOf(acup_new_cust_phone_num_1b).equals(String.valueOf(acup_old_cust_phone_num_1b))) && String.valueOf(acup_new_cust_phone_num_1c).equals(String.valueOf(acup_old_cust_phone_num_1c))) && String.valueOf(acup_new_cust_phone_num_2a).equals(String.valueOf(acup_old_cust_phone_num_2a))) && String.valueOf(acup_new_cust_phone_num_2b).equals(String.valueOf(acup_old_cust_phone_num_2b))) && String.valueOf(acup_new_cust_phone_num_2c).equals(String.valueOf(acup_old_cust_phone_num_2c))) && String.valueOf(acup_new_cust_ssn_x).equals(String.valueOf(acup_old_cust_ssn_x))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_cust_govt_issued_id))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_cust_govt_issued_id))))) && String.valueOf(acup_new_cust_dob_yyyy_mm_dd).equals(String.valueOf(acup_old_cust_dob_yyyy_mm_dd))) && String.valueOf(acup_new_cust_eft_account_id).equals(String.valueOf(acup_old_cust_eft_account_id))) && String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_new_cust_pri_holder_ind))).equals(String.valueOf(CobolIntrinsics.upper_case(CobolIntrinsics.trim(acup_old_cust_pri_holder_ind))))) && String.valueOf(acup_new_cust_fico_score_x).equals(String.valueOf(acup_old_cust_fico_score_x)))) {
            no_changes_detected.set(String.valueOf(cb_true));
        } else {
            change_has_occurred.set(String.valueOf(cb_true));
            _1205();
            return;
        }
        /* RAW: 1205 - */
    }

    private void compare_old_new_exit() {
        return;
    }

    private void edit_account() {
        flg_acctfilter_not_ok.set(String.valueOf(cb_true));
        if ((String.valueOf(cc_acct_id).equals(String.valueOf("\u0000")) || String.valueOf(cc_acct_id).equals(String.valueOf(" ")))) {
            input_error.set(String.valueOf(cb_true));
            flg_acctfilter_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                ws_prompt_for_acct.set(String.valueOf(cb_true));
            }
            cdemo_acct_id.set(String.valueOf(0));
            acup_new_acct_id.set(String.valueOf(0));
            _1210();
            return;
        }
        acup_new_acct_id.set(String.valueOf(cc_acct_id));
        if ((!CobolIntrinsics.isNumeric(cc_acct_id) || String.valueOf(cc_acct_id_n).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append("Account Number if supplied must be a 11 digit");
                    _sb.append(" Non-Zero Number");
                    ws_return_msg.set(_sb.toString());
                }
            }
            cdemo_acct_id.set(String.valueOf(0));
            _1210();
            return;
        } else {
            cdemo_acct_id.set(String.valueOf(cc_acct_id));
            flg_acctfilter_isvalid.set(String.valueOf(cb_true));
        }
        /* RAW: 1210 - */
    }

    private void edit_account_exit() {
        return;
    }

    private void edit_mandatory() {
        flg_mandatory_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf("\u0000")) || String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf(" "))) || String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_mandatory_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must be supplied.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1215();
            return;
        }
        flg_mandatory_isvalid.set(String.valueOf(cb_true));
        /* RAW: 1215 - */
    }

    private void edit_mandatory_exit() {
        return;
    }

    private void edit_yesno() {
        if (((String.valueOf(ws_edit_yes_no).equals(String.valueOf("\u0000")) || String.valueOf(ws_edit_yes_no).equals(String.valueOf(" "))) || String.valueOf(ws_edit_yes_no).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_yes_no_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must be supplied.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1220();
            return;
        }
        if (!String.valueOf(flg_yes_no_isvalid).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_yes_no_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must be Y or N.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1220();
            return;
        }
        /* RAW: 1220 - */
    }

    private void edit_yesno_exit() {
        return;
    }

    private void edit_alpha_reqd() {
        flg_alpha_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf("\u0000")) || String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf(" "))) || String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_alpha_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must be supplied.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1225();
            return;
        }
        lit_all_alpha_from.set(String.valueOf(lit_all_alpha_from_x));
        /* INSPECT WS-EDIT-ALPHANUM-ONLY — 2 clause(s) */
        if (String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0))) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_alpha_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" can have alphabets only.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1225();
            return;
        }
        flg_alpha_isvalid.set(String.valueOf(cb_true));
        /* RAW: 1225 - */
    }

    private void edit_alpha_reqd_exit() {
        return;
    }

    private void edit_alphanum_reqd() {
        flg_alphnanum_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf("\u0000")) || String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf(" "))) || String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_alphnanum_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must be supplied.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1230();
            return;
        }
        lit_all_alphanum_from.set(String.valueOf(lit_all_alphanum_from_x));
        /* INSPECT WS-EDIT-ALPHANUM-ONLY — 2 clause(s) */
        if (String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0))) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_alphnanum_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" can have numbers or alphabets only.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1230();
            return;
        }
        flg_alphnanum_isvalid.set(String.valueOf(cb_true));
        /* RAW: 1230 - */
    }

    private void edit_alphanum_reqd_exit() {
        return;
    }

    private void edit_alpha_opt() {
        flg_alpha_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf("\u0000")) || String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf(" "))) || String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0)))) {
            flg_alpha_isvalid.set(String.valueOf(cb_true));
            _1235();
            return;
        } else {
            /* CONTINUE */
        }
        lit_all_alpha_from.set(String.valueOf(lit_all_alpha_from_x));
        /* INSPECT WS-EDIT-ALPHANUM-ONLY — 2 clause(s) */
        if (String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0))) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_alpha_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" can have alphabets only.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1235();
            return;
        }
        flg_alpha_isvalid.set(String.valueOf(cb_true));
        /* RAW: 1235 - */
    }

    private void edit_alpha_opt_exit() {
        return;
    }

    private void edit_alphanum_opt() {
        flg_alphnanum_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf("\u0000")) || String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf(" "))) || String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0)))) {
            flg_alphnanum_isvalid.set(String.valueOf(cb_true));
            _1240();
            return;
        } else {
            /* CONTINUE */
        }
        lit_all_alphanum_from.set(String.valueOf(lit_all_alphanum_from_x));
        /* INSPECT WS-EDIT-ALPHANUM-ONLY — 2 clause(s) */
        if (String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0))) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_alphnanum_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" can have numbers or alphabets only.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1240();
            return;
        }
        flg_alphnanum_isvalid.set(String.valueOf(cb_true));
        /* RAW: 1240 - */
    }

    private void edit_alphanum_opt_exit() {
        return;
    }

    private void edit_num_reqd() {
        flg_alphnanum_not_ok.set(String.valueOf(cb_true));
        if (((String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf("\u0000")) || String.valueOf(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).equals(String.valueOf(" "))) || String.valueOf(CobolIntrinsics.length(CobolIntrinsics.trim(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())))).equals(String.valueOf(0)))) {
            input_error.set(String.valueOf(cb_true));
            flg_alphnanum_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must be supplied.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1245();
            return;
        }
        if (CobolIntrinsics.isNumeric(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue()))) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_alphnanum_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must be all numeric.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1245();
            return;
        }
        if (CobolIntrinsics.numval(CobolString.refMod(ws_edit_alphanum_only, 1, ws_edit_alphanum_length.intValue())).compareTo(new BigDecimal(String.valueOf(0).trim())) == 0) {
            input_error.set(String.valueOf(cb_true));
            flg_alphnanum_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must not be zero.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1245();
            return;
        } else {
            /* CONTINUE */
        }
        flg_alphnanum_isvalid.set(String.valueOf(cb_true));
        /* RAW: 1245 - */
    }

    private void edit_num_reqd_exit() {
        return;
    }

    private void edit_signed_9v2() {
        flg_signed_number_not_ok.set(String.valueOf(cb_true));
        if ((String.valueOf(ws_edit_signed_number_9v2_x).equals(String.valueOf("\u0000")) || String.valueOf(ws_edit_signed_number_9v2_x).equals(String.valueOf(" ")))) {
            input_error.set(String.valueOf(cb_true));
            flg_signed_number_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" must be supplied.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1250();
            return;
        } else {
            /* CONTINUE */
        }
        if (String.valueOf(CobolIntrinsics.test_numval_c(ws_edit_signed_number_9v2_x)).equals(String.valueOf(0))) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_signed_number_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(" is not valid");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1250();
            return;
        }
        flg_signed_number_isvalid.set(String.valueOf(cb_true));
        /* RAW: 1250 - */
    }

    private void edit_signed_9v2_exit() {
        return;
    }

    private void edit_us_phone_num() {
        ws_edit_us_phone_is_invalid.set(String.valueOf(cb_true));
        if ((((String.valueOf(ws_edit_us_phone_numa).equals(String.valueOf(" ")) || String.valueOf(ws_edit_us_phone_numa).equals(String.valueOf("\u0000"))) && (String.valueOf(ws_edit_us_phone_numb).equals(String.valueOf(" ")) || String.valueOf(ws_edit_us_phone_numb).equals(String.valueOf("\u0000")))) && (String.valueOf(ws_edit_us_phone_numa).equals(String.valueOf(" ")) || String.valueOf(ws_edit_us_phone_numc).equals(String.valueOf("\u0000"))))) {
            ws_edit_us_phone_is_valid.set(String.valueOf(cb_true));
            edit_us_phone_exit();
            return;
        } else {
            /* CONTINUE */
        }
    }

    private void edit_area_code() {
        if ((String.valueOf(ws_edit_us_phone_numa).equals(String.valueOf(" ")) || String.valueOf(ws_edit_us_phone_numa).equals(String.valueOf("\u0000")))) {
            input_error.set(String.valueOf(cb_true));
            flg_edit_us_phonea_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(": Area code must be supplied.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            edit_us_phone_prefix();
            return;
        } else {
            /* CONTINUE */
        }
        if (CobolIntrinsics.isNumeric(ws_edit_us_phone_numa)) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_edit_us_phonea_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(": Area code must be A 3 digit number.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            edit_us_phone_prefix();
            return;
        }
        if (ws_edit_us_phone_numa_n == 0) {
            input_error.set(String.valueOf(cb_true));
            flg_edit_us_phonea_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(": Area code cannot be zero");
                    ws_return_msg.set(_sb.toString());
                }
            }
            edit_us_phone_prefix();
            return;
        } else {
            /* CONTINUE */
        }
        ws_us_phone_area_code_to_edit.set(String.valueOf(CobolIntrinsics.trim(ws_edit_us_phone_numa)));
        if (!String.valueOf(valid_general_purp_code).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_edit_us_phonea_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(": Not valid North America general purpose area code");
                    ws_return_msg.set(_sb.toString());
                }
            }
            edit_us_phone_prefix();
            return;
        }
        flg_edit_us_phonea_isvalid.set(String.valueOf(cb_true));
    }

    private void edit_us_phone_prefix() {
        if ((String.valueOf(ws_edit_us_phone_numb).equals(String.valueOf(" ")) || String.valueOf(ws_edit_us_phone_numb).equals(String.valueOf("\u0000")))) {
            input_error.set(String.valueOf(cb_true));
            flg_edit_us_phoneb_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(": Prefix code must be supplied.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            edit_us_phone_linenum();
            return;
        } else {
            /* CONTINUE */
        }
        if (CobolIntrinsics.isNumeric(ws_edit_us_phone_numb)) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_edit_us_phoneb_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(": Prefix code must be A 3 digit number.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            edit_us_phone_linenum();
            return;
        }
        if (ws_edit_us_phone_numb_n == 0) {
            input_error.set(String.valueOf(cb_true));
            flg_edit_us_phoneb_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(": Prefix code cannot be zero");
                    ws_return_msg.set(_sb.toString());
                }
            }
            edit_us_phone_linenum();
            return;
        } else {
            /* CONTINUE */
        }
        flg_edit_us_phoneb_isvalid.set(String.valueOf(cb_true));
    }

    private void edit_us_phone_linenum() {
        if ((String.valueOf(ws_edit_us_phone_numc).equals(String.valueOf(" ")) || String.valueOf(ws_edit_us_phone_numc).equals(String.valueOf("\u0000")))) {
            input_error.set(String.valueOf(cb_true));
            flg_edit_us_phonec_blank.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(": Line number code must be supplied.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            edit_us_phone_exit();
            return;
        } else {
            /* CONTINUE */
        }
        if (CobolIntrinsics.isNumeric(ws_edit_us_phone_numc)) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_edit_us_phonec_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(": Line number code must be A 4 digit number.");
                    ws_return_msg.set(_sb.toString());
                }
            }
            edit_us_phone_exit();
            return;
        }
        if (ws_edit_us_phone_numc_n == 0) {
            input_error.set(String.valueOf(cb_true));
            flg_edit_us_phonec_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(": Line number code cannot be zero");
                    ws_return_msg.set(_sb.toString());
                }
            }
            edit_us_phone_exit();
            return;
        } else {
            /* CONTINUE */
        }
        flg_edit_us_phonec_isvalid.set(String.valueOf(cb_true));
    }

    private void edit_us_phone_exit() {
        return;
    }

    private void edit_us_phone_num_exit() {
        return;
    }

    private void edit_us_ssn() {
        ws_edit_variable_name.set(String.valueOf("SSN: First 3 chars"));
        ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_ssn_1));
        ws_edit_alphanum_length = new BigDecimal(String.valueOf(3).trim());
        _1245();
        /* RAW: - EDIT-NUM-REQD THRU 1245 - EDIT-NUM-REQD-EXIT */
        ws_edit_us_ssn_part1_flgs.set(String.valueOf(ws_edit_alphanum_only_flags));
        if (!String.valueOf(flg_edit_us_ssn_part1_isvalid).trim().isEmpty()) {
            ws_edit_us_ssn_part1.set(String.valueOf(acup_new_cust_ssn_1));
            if (!String.valueOf(invalid_ssn_part1).trim().isEmpty()) {
                input_error.set(String.valueOf(cb_true));
                flg_edit_us_ssn_part1_not_ok.set(String.valueOf(cb_true));
                if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                    {
                        StringBuilder _sb = new StringBuilder();
                        _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                        _sb.append(": should not be 000, 666, or between 900 and 999");
                        ws_return_msg.set(_sb.toString());
                    }
                } else {
                    /* CONTINUE */
                }
            }
            ws_edit_variable_name.set(String.valueOf("SSN 4th & 5th chars"));
            ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_ssn_2));
            ws_edit_alphanum_length = new BigDecimal(String.valueOf(2).trim());
            _1245();
            /* RAW: - EDIT-NUM-REQD THRU 1245 - EDIT-NUM-REQD-EXIT */
            ws_edit_us_ssn_part2_flgs.set(String.valueOf(ws_edit_alphanum_only_flags));
            ws_edit_variable_name.set(String.valueOf("SSN Last 4 chars"));
            ws_edit_alphanum_only.set(String.valueOf(acup_new_cust_ssn_3));
            ws_edit_alphanum_length = new BigDecimal(String.valueOf(4).trim());
            _1245();
            /* RAW: - EDIT-NUM-REQD THRU 1245 - EDIT-NUM-REQD-EXIT */
            /* RAW: WS-EDIT-US-SSN-PART3-FLGS  */
        }
        /* RAW: 1265 - */
    }

    private void edit_us_ssn_exit() {
        return;
    }

    private void edit_us_state_cd() {
        us_state_code_to_edit.set(String.valueOf(acup_new_cust_addr_state_cd));
        if (!String.valueOf(valid_us_state_code).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_state_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(": is not a valid state code");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1270();
            return;
        }
        /* RAW: 1270 - */
    }

    private void edit_us_state_cd_exit() {
        return;
    }

    private void edit_fico_score() {
        if (!String.valueOf(fico_range_is_valid).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_fico_score_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append(String.valueOf(CobolIntrinsics.trim(ws_edit_variable_name)));
                    _sb.append(": should be between 300 and 850");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1275();
            return;
        }
        /* RAW: 1275 - */
    }

    private void edit_fico_score_exit() {
        return;
    }

    private void edit_us_state_zip_cd() {
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(acup_new_cust_addr_state_cd));
            _sb.append(String.valueOf(CobolString.refMod(acup_new_cust_addr_zip, 1, 2)));
            us_state_and_first_zip2.set(_sb.toString());
        }
        if (!String.valueOf(valid_us_state_zip_cd2_combo).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_state_not_ok.set(String.valueOf(cb_true));
            flg_zipcode_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append("Invalid zip code for state");
                    ws_return_msg.set(_sb.toString());
                }
            }
            _1280();
            return;
        }
        /* RAW: 1280 - */
    }

    private void edit_us_state_zip_cd_exit() {
        return;
    }

    private void decide_action() {
        if (!String.valueOf(acup_details_not_fetched).trim().isEmpty()) {
        } else if (!String.valueOf(ccard_aid_pfk12).trim().isEmpty()) {
            if (!String.valueOf(flg_acctfilter_isvalid).trim().isEmpty()) {
                ws_return_msg_off.set(String.valueOf(cb_true));
                _9000();
                /* RAW: - READ-ACCT THRU 9000 - READ-ACCT-EXIT */
                if (!String.valueOf(found_cust_in_master).trim().isEmpty()) {
                    acup_show_details.set(String.valueOf(cb_true));
                }
            }
        } else if (!String.valueOf(acup_show_details).trim().isEmpty()) {
            if ((!String.valueOf(input_error).trim().isEmpty() || !String.valueOf(no_changes_detected).trim().isEmpty())) {
                /* CONTINUE */
            } else {
                acup_changes_ok_not_confirmed.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(acup_changes_not_ok).trim().isEmpty()) {
            /* CONTINUE */
        } else if (!String.valueOf(acup_changes_ok_not_confirmed).trim().isEmpty()) {
            /* RAW: AND CCARD-AID-PFK05 */
            _9600();
            /* RAW: - WRITE-PROCESSING THRU 9600 - WRITE-PROCESSING-EXIT */
            if (!String.valueOf(could_not_lock_acct_for_update).trim().isEmpty()) {
                acup_changes_okayed_lock_error.set(String.valueOf(cb_true));
            } else if (!String.valueOf(locked_but_update_failed).trim().isEmpty()) {
                acup_changes_okayed_but_failed.set(String.valueOf(cb_true));
            } else if (!String.valueOf(data_was_changed_before_update).trim().isEmpty()) {
                acup_show_details.set(String.valueOf(cb_true));
            } else {
                acup_changes_okayed_and_done.set(String.valueOf(cb_true));
            }
        } else if (!String.valueOf(acup_changes_ok_not_confirmed).trim().isEmpty()) {
            /* CONTINUE */
        } else if (!String.valueOf(acup_changes_okayed_and_done).trim().isEmpty()) {
            acup_show_details.set(String.valueOf(cb_true));
            if ((String.valueOf(cdemo_from_tranid).equals(String.valueOf("\u0000")) || String.valueOf(cdemo_from_tranid).equals(String.valueOf(" ")))) {
                cdemo_acct_id.set(String.valueOf(0));
                cdemo_card_num.set(String.valueOf(0));
                cdemo_acct_status.set(String.valueOf("\u0000"));
            }
        } else {
            abend_culprit.set(String.valueOf(lit_thispgm));
            abend_code.set(String.valueOf("0001"));
            abend_reason.set(String.valueOf(" "));
            abend_msg.set(String.valueOf("UNEXPECTED DATA SCENARIO"));
            abend_routine(); // THRU ABEND-ROUTINE-EXIT
            end_exec();
            abend_routine_exit();
        }
        /* RAW: 2000 - */
    }

    private void decide_action_exit() {
        return;
    }

    private void send_map() {
        _3100();
        /* RAW: - SCREEN-INIT THRU 3100 - SCREEN-INIT-EXIT */
        _3200();
        /* RAW: - SETUP-SCREEN-VARS THRU 3200 - SETUP-SCREEN-VARS-EXIT */
        _3250();
        /* RAW: - SETUP-INFOMSG THRU 3250 - SETUP-INFOMSG-EXIT */
        _3300();
        /* RAW: - SETUP-SCREEN-ATTRS THRU 3300 - SETUP-SCREEN-ATTRS-EXIT */
        _3390();
        /* RAW: - SETUP-INFOMSG-ATTRS THRU 3390 - SETUP-INFOMSG-ATTRS-EXIT */
        _3400();
        /* RAW: - SEND-SCREEN THRU 3400 - */
    }

    private void send_screen_exit() {
        /* RAW: 3000 - */
    }

    private void send_map_exit() {
        return;
    }

    private void screen_init() {
        cactupao.set(String.valueOf("\u0000"));
        ws_curdate_data.set(String.valueOf(CobolIntrinsics.current_date()));
        title01o.set(String.valueOf(ccda_title01));
        title02o.set(String.valueOf(ccda_title02));
        trnnameo.set(String.valueOf(lit_thistranid));
        pgmnameo.set(String.valueOf(lit_thispgm));
        ws_curdate_data.set(String.valueOf(CobolIntrinsics.current_date()));
        ws_curdate_mm.set(String.valueOf(ws_curdate_month));
        ws_curdate_dd.set(String.valueOf(ws_curdate_day));
        ws_curdate_yy.set(String.valueOf(CobolString.refMod(ws_curdate_year, 3, 2)));
        curdateo.set(String.valueOf(ws_curdate_mm_dd_yy));
        ws_curtime_hh.set(String.valueOf(ws_curtime_hours));
        ws_curtime_mm.set(String.valueOf(ws_curtime_minute));
        ws_curtime_ss.set(String.valueOf(ws_curtime_second));
        curtimeo.set(String.valueOf(ws_curtime_hh_mm_ss));
        /* RAW: 3100 - */
    }

    private void screen_init_exit() {
        return;
    }

    private void setup_screen_vars() {
        if (!String.valueOf(cdemo_pgm_enter).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            if ((String.valueOf(cc_acct_id_n).equals(String.valueOf(0)) && !String.valueOf(flg_acctfilter_isvalid).trim().isEmpty())) {
                acctsido.set(String.valueOf("\u0000"));
            } else {
                acctsido.set(String.valueOf(cc_acct_id));
            }
            if (!String.valueOf(acup_details_not_fetched).trim().isEmpty()) {
            } else if (!String.valueOf(cc_acct_id_n).trim().isEmpty()) {
                /* RAW: = 0 */
                _3201();
                /* RAW: - SHOW-INITIAL-VALUES THRU 3201 - SHOW-INITIAL-VALUES-EXIT */
            } else if (!String.valueOf(acup_show_details).trim().isEmpty()) {
                _3202();
                /* RAW: - SHOW-ORIGINAL-VALUES THRU 3202 - SHOW-ORIGINAL-VALUES-EXIT */
            } else if (!String.valueOf(acup_changes_made).trim().isEmpty()) {
                _3203();
                /* RAW: - SHOW-UPDATED-VALUES THRU 3203 - SHOW-UPDATED-VALUES-EXIT */
            } else {
                _3202();
                /* RAW: - SHOW-ORIGINAL-VALUES THRU 3202 - SHOW-ORIGINAL-VALUES-EXIT */
            }
        }
        /* RAW: 3200 - */
    }

    private void setup_screen_vars_exit() {
        return;
    }

    private void show_initial_values() {
        acsttuso.set(String.valueOf("\u0000"));
        acrdlimo.set(String.valueOf("\u0000"));
        acurbalo.set(String.valueOf("\u0000"));
        acshlimo.set(String.valueOf("\u0000"));
        acrcycro.set(String.valueOf("\u0000"));
        acrcydbo.set(String.valueOf("\u0000"));
        opnyearo.set(String.valueOf("\u0000"));
        opnmono.set(String.valueOf("\u0000"));
        opndayo.set(String.valueOf("\u0000"));
        expyearo.set(String.valueOf("\u0000"));
        expmono.set(String.valueOf("\u0000"));
        expdayo.set(String.valueOf("\u0000"));
        risyearo.set(String.valueOf("\u0000"));
        rismono.set(String.valueOf("\u0000"));
        risdayo.set(String.valueOf("\u0000"));
        aaddgrpo.set(String.valueOf("\u0000"));
        acstnumo.set(String.valueOf("\u0000"));
        actssn1o.set(String.valueOf("\u0000"));
        actssn2o.set(String.valueOf("\u0000"));
        actssn3o.set(String.valueOf("\u0000"));
        acstfcoo.set(String.valueOf("\u0000"));
        dobyearo.set(String.valueOf("\u0000"));
        dobmono.set(String.valueOf("\u0000"));
        dobdayo.set(String.valueOf("\u0000"));
        acsfnamo.set(String.valueOf("\u0000"));
        acsmnamo.set(String.valueOf("\u0000"));
        acslnamo.set(String.valueOf("\u0000"));
        acsadl1o.set(String.valueOf("\u0000"));
        acsadl2o.set(String.valueOf("\u0000"));
        acscityo.set(String.valueOf("\u0000"));
        acsstteo.set(String.valueOf("\u0000"));
        acszipco.set(String.valueOf("\u0000"));
        acsctryo.set(String.valueOf("\u0000"));
        acsph1ao.set(String.valueOf("\u0000"));
        acsph1bo.set(String.valueOf("\u0000"));
        acsph1co.set(String.valueOf("\u0000"));
        acsph2ao.set(String.valueOf("\u0000"));
        acsph2bo.set(String.valueOf("\u0000"));
        acsph2co.set(String.valueOf("\u0000"));
        acsgovto.set(String.valueOf("\u0000"));
        acseftco.set(String.valueOf("\u0000"));
        acspflgo.set(String.valueOf("\u0000"));
        /* RAW: 3201 - */
    }

    private void show_initial_values_exit() {
        return;
    }

    private void show_original_values() {
        ws_non_key_flags.set(String.valueOf("\u0000"));
        prompt_for_changes.set(String.valueOf(cb_true));
        if ((!String.valueOf(found_acct_in_master).trim().isEmpty() || !String.valueOf(found_cust_in_master).trim().isEmpty())) {
            acsttuso.set(String.valueOf(acup_old_active_status));
            ws_edit_currency_9_2_f.set(String.valueOf(acup_old_curr_bal_n));
            acurbalo.set(String.valueOf(ws_edit_currency_9_2_f));
            ws_edit_currency_9_2_f.set(String.valueOf(acup_old_credit_limit_n));
            acrdlimo.set(String.valueOf(ws_edit_currency_9_2_f));
            ws_edit_currency_9_2_f.set(String.valueOf(acup_old_cash_credit_limit_n));
            acshlimo.set(String.valueOf(ws_edit_currency_9_2_f));
            ws_edit_currency_9_2_f.set(String.valueOf(acup_old_curr_cyc_credit_n));
            acrcycro.set(String.valueOf(ws_edit_currency_9_2_f));
            ws_edit_currency_9_2_f.set(String.valueOf(acup_old_curr_cyc_debit_n));
            acrcydbo.set(String.valueOf(ws_edit_currency_9_2_f));
            opnyearo.set(String.valueOf(acup_old_open_year));
            opnmono.set(String.valueOf(acup_old_open_mon));
            opndayo.set(String.valueOf(acup_old_open_day));
            expyearo.set(String.valueOf(acup_old_exp_year));
            expmono.set(String.valueOf(acup_old_exp_mon));
            expdayo.set(String.valueOf(acup_old_exp_day));
            risyearo.set(String.valueOf(acup_old_reissue_year));
            rismono.set(String.valueOf(acup_old_reissue_mon));
            risdayo.set(String.valueOf(acup_old_reissue_day));
            aaddgrpo.set(String.valueOf(acup_old_group_id));
        }
        if (!String.valueOf(found_cust_in_master).trim().isEmpty()) {
            acstnumo.set(String.valueOf(acup_old_cust_id_x));
            actssn1o.set(String.valueOf(CobolString.refMod(acup_old_cust_ssn_x, 1, 3)));
            actssn2o.set(String.valueOf(CobolString.refMod(acup_old_cust_ssn_x, 4, 2)));
            actssn3o.set(String.valueOf(CobolString.refMod(acup_old_cust_ssn_x, 6, 4)));
            acstfcoo.set(String.valueOf(acup_old_cust_fico_score_x));
            dobyearo.set(String.valueOf(acup_old_cust_dob_year));
            dobmono.set(String.valueOf(acup_old_cust_dob_mon));
            dobdayo.set(String.valueOf(acup_old_cust_dob_day));
            acsfnamo.set(String.valueOf(acup_old_cust_first_name));
            acsmnamo.set(String.valueOf(acup_old_cust_middle_name));
            acslnamo.set(String.valueOf(acup_old_cust_last_name));
            acsadl1o.set(String.valueOf(acup_old_cust_addr_line_1));
            acsadl2o.set(String.valueOf(acup_old_cust_addr_line_2));
            acscityo.set(String.valueOf(acup_old_cust_addr_line_3));
            acsstteo.set(String.valueOf(acup_old_cust_addr_state_cd));
            acszipco.set(String.valueOf(acup_old_cust_addr_zip));
            acsctryo.set(String.valueOf(acup_old_cust_addr_country_cd));
            acsph1ao.set(String.valueOf(CobolString.refMod(acup_old_cust_phone_num_1, 2, 3)));
            acsph1bo.set(String.valueOf(CobolString.refMod(acup_old_cust_phone_num_1, 6, 3)));
            acsph1co.set(String.valueOf(CobolString.refMod(acup_old_cust_phone_num_1, 10, 4)));
            acsph2ao.set(String.valueOf(CobolString.refMod(acup_old_cust_phone_num_2, 2, 3)));
            acsph2bo.set(String.valueOf(CobolString.refMod(acup_old_cust_phone_num_2, 6, 3)));
            acsph2co.set(String.valueOf(CobolString.refMod(acup_old_cust_phone_num_2, 10, 4)));
            acsgovto.set(String.valueOf(acup_old_cust_govt_issued_id));
            acseftco.set(String.valueOf(acup_old_cust_eft_account_id));
            acspflgo.set(String.valueOf(acup_old_cust_pri_holder_ind));
        }
        /* RAW: 3202 - */
    }

    private void show_original_values_exit() {
        return;
    }

    private void show_updated_values() {
        acsttuso.set(String.valueOf(acup_new_active_status));
        if (!String.valueOf(flg_cred_limit_isvalid).trim().isEmpty()) {
            ws_edit_currency_9_2_f.set(String.valueOf(acup_new_credit_limit_n));
            acrdlimo.set(String.valueOf(ws_edit_currency_9_2_f));
        } else {
            acrdlimo.set(String.valueOf(acup_new_credit_limit_x));
        }
        if (!String.valueOf(flg_cash_credit_limit_isvalid).trim().isEmpty()) {
            ws_edit_currency_9_2_f.set(String.valueOf(acup_new_cash_credit_limit_n));
            acshlimo.set(String.valueOf(ws_edit_currency_9_2_f));
        } else {
            acshlimo.set(String.valueOf(acup_new_cash_credit_limit_x));
        }
        if (!String.valueOf(flg_curr_bal_isvalid).trim().isEmpty()) {
            ws_edit_currency_9_2_f.set(String.valueOf(acup_new_curr_bal_n));
            acurbalo.set(String.valueOf(ws_edit_currency_9_2_f));
        } else {
            acurbalo.set(String.valueOf(acup_new_curr_bal_x));
        }
        if (!String.valueOf(flg_curr_cyc_credit_isvalid).trim().isEmpty()) {
            ws_edit_currency_9_2_f.set(String.valueOf(acup_new_curr_cyc_credit_n));
            acrcycro.set(String.valueOf(ws_edit_currency_9_2_f));
        } else {
            acrcycro.set(String.valueOf(acup_new_curr_cyc_credit_x));
        }
        if (!String.valueOf(flg_curr_cyc_debit_isvalid).trim().isEmpty()) {
            ws_edit_currency_9_2_f.set(String.valueOf(acup_new_curr_cyc_debit_n));
            acrcydbo.set(String.valueOf(ws_edit_currency_9_2_f));
        } else {
            acrcydbo.set(String.valueOf(acup_new_curr_cyc_debit_x));
        }
        opnyearo.set(String.valueOf(acup_new_open_year));
        opnmono.set(String.valueOf(acup_new_open_mon));
        opndayo.set(String.valueOf(acup_new_open_day));
        expyearo.set(String.valueOf(acup_new_exp_year));
        expmono.set(String.valueOf(acup_new_exp_mon));
        expdayo.set(String.valueOf(acup_new_exp_day));
        risyearo.set(String.valueOf(acup_new_reissue_year));
        rismono.set(String.valueOf(acup_new_reissue_mon));
        risdayo.set(String.valueOf(acup_new_reissue_day));
        aaddgrpo.set(String.valueOf(acup_new_group_id));
        acstnumo.set(String.valueOf(acup_new_cust_id_x));
        actssn1o.set(String.valueOf(acup_new_cust_ssn_1));
        actssn2o.set(String.valueOf(acup_new_cust_ssn_2));
        actssn3o.set(String.valueOf(acup_new_cust_ssn_3));
        acstfcoo.set(String.valueOf(acup_new_cust_fico_score_x));
        dobyearo.set(String.valueOf(acup_new_cust_dob_year));
        dobmono.set(String.valueOf(acup_new_cust_dob_mon));
        dobdayo.set(String.valueOf(acup_new_cust_dob_day));
        acsfnamo.set(String.valueOf(acup_new_cust_first_name));
        acsmnamo.set(String.valueOf(acup_new_cust_middle_name));
        acslnamo.set(String.valueOf(acup_new_cust_last_name));
        acsadl1o.set(String.valueOf(acup_new_cust_addr_line_1));
        acsadl2o.set(String.valueOf(acup_new_cust_addr_line_2));
        acscityo.set(String.valueOf(acup_new_cust_addr_line_3));
        acsstteo.set(String.valueOf(acup_new_cust_addr_state_cd));
        acszipco.set(String.valueOf(acup_new_cust_addr_zip));
        acsctryo.set(String.valueOf(acup_new_cust_addr_country_cd));
        acsph1ao.set(String.valueOf(acup_new_cust_phone_num_1a));
        acsph1bo.set(String.valueOf(acup_new_cust_phone_num_1b));
        acsph1co.set(String.valueOf(acup_new_cust_phone_num_1c));
        acsph2ao.set(String.valueOf(acup_new_cust_phone_num_2a));
        acsph2bo.set(String.valueOf(acup_new_cust_phone_num_2b));
        acsph2co.set(String.valueOf(acup_new_cust_phone_num_2c));
        acsgovto.set(String.valueOf(acup_new_cust_govt_issued_id));
        acseftco.set(String.valueOf(acup_new_cust_eft_account_id));
        acspflgo.set(String.valueOf(acup_new_cust_pri_holder_ind));
        /* RAW: 3203 - */
    }

    private void show_updated_values_exit() {
        return;
    }

    private void setup_infomsg() {
        if (!String.valueOf(cdemo_pgm_enter).trim().isEmpty()) {
            prompt_for_search_keys.set(String.valueOf(cb_true));
        } else if (!String.valueOf(acup_details_not_fetched).trim().isEmpty()) {
            prompt_for_search_keys.set(String.valueOf(cb_true));
        } else if (!String.valueOf(acup_show_details).trim().isEmpty()) {
            prompt_for_changes.set(String.valueOf(cb_true));
        } else if (!String.valueOf(acup_changes_not_ok).trim().isEmpty()) {
            prompt_for_changes.set(String.valueOf(cb_true));
        } else if (!String.valueOf(acup_changes_ok_not_confirmed).trim().isEmpty()) {
            prompt_for_confirmation.set(String.valueOf(cb_true));
        } else if (!String.valueOf(acup_changes_okayed_and_done).trim().isEmpty()) {
            confirm_update_success.set(String.valueOf(cb_true));
        } else if (!String.valueOf(acup_changes_okayed_lock_error).trim().isEmpty()) {
            inform_failure.set(String.valueOf(cb_true));
        } else if (!String.valueOf(acup_changes_okayed_but_failed).trim().isEmpty()) {
            inform_failure.set(String.valueOf(cb_true));
        } else if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
            prompt_for_search_keys.set(String.valueOf(cb_true));
        }
        infomsgo.set(String.valueOf(ws_info_msg));
        errmsgo.set(String.valueOf(ws_return_msg));
        /* RAW: 3250 - */
    }

    private void setup_infomsg_exit() {
        return;
    }

    private void setup_screen_attrs() {
        _3310();
        /* RAW: - PROTECT-ALL-ATTRS THRU 3310 - PROTECT-ALL-ATTRS-EXIT */
        if (!String.valueOf(acup_details_not_fetched).trim().isEmpty()) {
            acctsida.set(String.valueOf(dfhbmfse));
        } else if (!String.valueOf(acup_show_details).trim().isEmpty()) {
        } else if (!String.valueOf(acup_changes_not_ok).trim().isEmpty()) {
            _3320();
            /* RAW: - UNPROTECT-FEW-ATTRS THRU 3320 - UNPROTECT-FEW-ATTRS-EXIT */
        } else if (!String.valueOf(acup_changes_ok_not_confirmed).trim().isEmpty()) {
        } else if (!String.valueOf(acup_changes_okayed_and_done).trim().isEmpty()) {
            /* CONTINUE */
        } else {
            acctsida.set(String.valueOf(dfhbmfse));
        }
        if (!String.valueOf(found_account_data).trim().isEmpty()) {
        } else if (!String.valueOf(no_changes_detected).trim().isEmpty()) {
            acsttusl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_acctfilter_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_acctfilter_blank).trim().isEmpty()) {
            acctsidl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_acct_status_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_acct_status_blank).trim().isEmpty()) {
            acsttusl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_open_year_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_open_year_blank).trim().isEmpty()) {
            opnyearl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_open_month_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_open_month_blank).trim().isEmpty()) {
            opnmonl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_open_day_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_open_day_blank).trim().isEmpty()) {
            opndayl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_cred_limit_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_cred_limit_blank).trim().isEmpty()) {
            acrdliml.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_expiry_year_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_expiry_year_blank).trim().isEmpty()) {
            expyearl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_expiry_month_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_expiry_month_blank).trim().isEmpty()) {
            expmonl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_expiry_day_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_expiry_day_blank).trim().isEmpty()) {
            expdayl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_cash_credit_limit_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_cash_credit_limit_blank).trim().isEmpty()) {
            acshliml.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_reissue_year_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_reissue_year_blank).trim().isEmpty()) {
            risyearl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_reissue_month_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_reissue_month_blank).trim().isEmpty()) {
            rismonl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_reissue_day_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_reissue_day_blank).trim().isEmpty()) {
            risdayl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_curr_bal_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_curr_bal_blank).trim().isEmpty()) {
            acurball.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_curr_cyc_credit_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_curr_cyc_credit_blank).trim().isEmpty()) {
            acrcycrl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_curr_cyc_debit_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_curr_cyc_debit_blank).trim().isEmpty()) {
            acrcydbl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_edit_us_ssn_part1_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_edit_us_ssn_part1_blank).trim().isEmpty()) {
            actssn1l.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_edit_us_ssn_part2_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_edit_us_ssn_part2_blank).trim().isEmpty()) {
            actssn2l.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_edit_us_ssn_part3_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_edit_us_ssn_part3_blank).trim().isEmpty()) {
            actssn3l.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_dt_of_birth_year_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_dt_of_birth_year_blank).trim().isEmpty()) {
            dobyearl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_dt_of_birth_month_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_dt_of_birth_month_blank).trim().isEmpty()) {
            dobmonl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_dt_of_birth_day_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_dt_of_birth_day_blank).trim().isEmpty()) {
            dobdayl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_fico_score_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_fico_score_blank).trim().isEmpty()) {
            acstfcol.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_first_name_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_first_name_blank).trim().isEmpty()) {
            acsfnaml.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_middle_name_not_ok).trim().isEmpty()) {
            acsmnaml.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_last_name_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_last_name_blank).trim().isEmpty()) {
            acslnaml.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_address_line_1_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_address_line_1_blank).trim().isEmpty()) {
            acsadl1l.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_state_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_state_blank).trim().isEmpty()) {
            acssttel.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_zipcode_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_zipcode_blank).trim().isEmpty()) {
            acszipcl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_city_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_city_blank).trim().isEmpty()) {
            acscityl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_country_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_country_blank).trim().isEmpty()) {
            acsctryl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_phone_num_1a_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_phone_num_1a_blank).trim().isEmpty()) {
            acsph1al.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_phone_num_1b_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_phone_num_1b_blank).trim().isEmpty()) {
            acsph1bl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_phone_num_1c_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_phone_num_1c_blank).trim().isEmpty()) {
            acsph1cl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_phone_num_2a_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_phone_num_2a_blank).trim().isEmpty()) {
            acsph2al.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_phone_num_2b_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_phone_num_2b_blank).trim().isEmpty()) {
            acsph2bl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_phone_num_2c_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_phone_num_2c_blank).trim().isEmpty()) {
            acsph2cl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_eft_account_id_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_eft_account_id_blank).trim().isEmpty()) {
            acseftcl.set(String.valueOf(-1));
        } else if (!String.valueOf(flg_pri_cardholder_not_ok).trim().isEmpty()) {
        } else if (!String.valueOf(flg_pri_cardholder_blank).trim().isEmpty()) {
            acspflgl.set(String.valueOf(-1));
        } else {
            acctsidl.set(String.valueOf(-1));
        }
        if (String.valueOf(cdemo_last_mapset).equals(String.valueOf(lit_cclistmapset))) {
            acctsidc.set(String.valueOf(dfhdfcol));
        }
        if (!String.valueOf(flg_acctfilter_not_ok).trim().isEmpty()) {
            acctsidc.set(String.valueOf(dfhred));
        }
        if ((!String.valueOf(flg_acctfilter_blank).trim().isEmpty() && !String.valueOf(cdemo_pgm_reenter).trim().isEmpty())) {
            acctsido.set(String.valueOf("*"));
            acctsidc.set(String.valueOf(dfhred));
        }
        if (((!String.valueOf(acup_details_not_fetched).trim().isEmpty() || !String.valueOf(flg_acctfilter_blank).trim().isEmpty()) || !String.valueOf(flg_acctfilter_not_ok).trim().isEmpty())) {
            _3300();
            return;
        } else {
            /* CONTINUE */
        }
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: COPY CSSETATY REPLACING = = ( */
        /* RAW: 3300 - */
    }

    private void setup_screen_attrs_exit() {
        return;
    }

    private void protect_all_attrs() {
        acctsida.set(String.valueOf(dfhbmprf));
        acsttusa.set(String.valueOf(dfhbmprf));
        acrdlima.set(String.valueOf(dfhbmprf));
        acshlima.set(String.valueOf(dfhbmprf));
        acurbala.set(String.valueOf(dfhbmprf));
        acrcycra.set(String.valueOf(dfhbmprf));
        acrcydba.set(String.valueOf(dfhbmprf));
        opnyeara.set(String.valueOf(dfhbmprf));
        opnmona.set(String.valueOf(dfhbmprf));
        opndaya.set(String.valueOf(dfhbmprf));
        expyeara.set(String.valueOf(dfhbmprf));
        expmona.set(String.valueOf(dfhbmprf));
        expdaya.set(String.valueOf(dfhbmprf));
        risyeara.set(String.valueOf(dfhbmprf));
        rismona.set(String.valueOf(dfhbmprf));
        risdaya.set(String.valueOf(dfhbmprf));
        aaddgrpa.set(String.valueOf(dfhbmprf));
        acstnuma.set(String.valueOf(dfhbmprf));
        actssn1a.set(String.valueOf(dfhbmprf));
        actssn2a.set(String.valueOf(dfhbmprf));
        actssn3a.set(String.valueOf(dfhbmprf));
        acstfcoa.set(String.valueOf(dfhbmprf));
        dobyeara.set(String.valueOf(dfhbmprf));
        dobmona.set(String.valueOf(dfhbmprf));
        dobdaya.set(String.valueOf(dfhbmprf));
        acsfnama.set(String.valueOf(dfhbmprf));
        acsmnama.set(String.valueOf(dfhbmprf));
        acslnama.set(String.valueOf(dfhbmprf));
        acsadl1a.set(String.valueOf(dfhbmprf));
        acsadl2a.set(String.valueOf(dfhbmprf));
        acscitya.set(String.valueOf(dfhbmprf));
        acssttea.set(String.valueOf(dfhbmprf));
        acszipca.set(String.valueOf(dfhbmprf));
        acsctrya.set(String.valueOf(dfhbmprf));
        acsph1aa.set(String.valueOf(dfhbmprf));
        acsph1ba.set(String.valueOf(dfhbmprf));
        acsph1ca.set(String.valueOf(dfhbmprf));
        acsph2aa.set(String.valueOf(dfhbmprf));
        acsph2ba.set(String.valueOf(dfhbmprf));
        acsph2ca.set(String.valueOf(dfhbmprf));
        acsgovta.set(String.valueOf(dfhbmprf));
        acseftca.set(String.valueOf(dfhbmprf));
        acspflga.set(String.valueOf(dfhbmprf));
        infomsga.set(String.valueOf(dfhbmprf));
        /* RAW: 3310 - */
    }

    private void protect_all_attrs_exit() {
        return;
    }

    private void unprotect_few_attrs() {
        acsttusa.set(String.valueOf(dfhbmfse));
        acrdlima.set(String.valueOf(dfhbmfse));
        acshlima.set(String.valueOf(dfhbmfse));
        acurbala.set(String.valueOf(dfhbmfse));
        acrcycra.set(String.valueOf(dfhbmfse));
        acrcydba.set(String.valueOf(dfhbmfse));
        opnyeara.set(String.valueOf(dfhbmfse));
        opnmona.set(String.valueOf(dfhbmfse));
        opndaya.set(String.valueOf(dfhbmfse));
        expyeara.set(String.valueOf(dfhbmfse));
        expmona.set(String.valueOf(dfhbmfse));
        expdaya.set(String.valueOf(dfhbmfse));
        risyeara.set(String.valueOf(dfhbmfse));
        rismona.set(String.valueOf(dfhbmfse));
        risdaya.set(String.valueOf(dfhbmfse));
        dobyeara.set(String.valueOf(dfhbmfse));
        dobmona.set(String.valueOf(dfhbmfse));
        dobdaya.set(String.valueOf(dfhbmfse));
        aaddgrpa.set(String.valueOf(dfhbmfse));
        acstnuma.set(String.valueOf(dfhbmprf));
        actssn1a.set(String.valueOf(dfhbmfse));
        actssn2a.set(String.valueOf(dfhbmfse));
        actssn3a.set(String.valueOf(dfhbmfse));
        acstfcoa.set(String.valueOf(dfhbmfse));
        acsfnama.set(String.valueOf(dfhbmfse));
        acsmnama.set(String.valueOf(dfhbmfse));
        acslnama.set(String.valueOf(dfhbmfse));
        acsadl1a.set(String.valueOf(dfhbmfse));
        acsadl2a.set(String.valueOf(dfhbmfse));
        acscitya.set(String.valueOf(dfhbmfse));
        acssttea.set(String.valueOf(dfhbmfse));
        acszipca.set(String.valueOf(dfhbmfse));
        acsctrya.set(String.valueOf(dfhbmprf));
        acsph1aa.set(String.valueOf(dfhbmfse));
        acsph1ba.set(String.valueOf(dfhbmfse));
        acsph1ca.set(String.valueOf(dfhbmfse));
        acsph2aa.set(String.valueOf(dfhbmfse));
        acsph2ba.set(String.valueOf(dfhbmfse));
        acsph2ca.set(String.valueOf(dfhbmfse));
        acsgovta.set(String.valueOf(dfhbmfse));
        acseftca.set(String.valueOf(dfhbmfse));
        acspflga.set(String.valueOf(dfhbmfse));
        infomsga.set(String.valueOf(dfhbmprf));
        /* RAW: 3320 - */
    }

    private void unprotect_few_attrs_exit() {
        return;
    }

    private void setup_infomsg_attrs() {
        if (!String.valueOf(ws_no_info_message).trim().isEmpty()) {
            infomsga.set(String.valueOf(dfhbmdar));
        } else {
            infomsga.set(String.valueOf(dfhbmasb));
        }
        if ((!String.valueOf(acup_changes_made).trim().isEmpty() && !(!String.valueOf(acup_changes_okayed_and_done).trim().isEmpty()))) {
            fkey12a.set(String.valueOf(dfhbmasb));
        }
        if (!String.valueOf(prompt_for_confirmation).trim().isEmpty()) {
            fkey05a.set(String.valueOf(dfhbmasb));
            fkey12a.set(String.valueOf(dfhbmasb));
        }
        /* RAW: 3390 - */
    }

    private void setup_infomsg_attrs_exit() {
        return;
    }

    private void send_screen() {
        ccard_next_mapset.set(String.valueOf(lit_thismapset));
        ccard_next_map.set(String.valueOf(lit_thismap));
        exec.set(String.valueOf(lit_thismap));
        cics.set(String.valueOf(lit_thismap));
        send.set(String.valueOf(lit_thismap));
        if (map[Integer.parseInt(String.valueOf(ccard_next_map).trim()) - 1] == null) map[Integer.parseInt(String.valueOf(ccard_next_map).trim()) - 1] = new CobolString(256);
        map[Integer.parseInt(String.valueOf(ccard_next_map).trim()) - 1].set(String.valueOf(lit_thismap));
        if (mapset[Integer.parseInt(String.valueOf(ccard_next_mapset).trim()) - 1] == null) mapset[Integer.parseInt(String.valueOf(ccard_next_mapset).trim()) - 1] = new CobolString(256);
        mapset[Integer.parseInt(String.valueOf(ccard_next_mapset).trim()) - 1].set(String.valueOf(lit_thismap));
        if (from[Integer.parseInt(String.valueOf(cactupao).trim()) - 1] == null) from[Integer.parseInt(String.valueOf(cactupao).trim()) - 1] = new CobolString(256);
        from[Integer.parseInt(String.valueOf(cactupao).trim()) - 1].set(String.valueOf(lit_thismap));
        cursor.set(String.valueOf(lit_thismap));
        erase.set(String.valueOf(lit_thismap));
        freekb.set(String.valueOf(lit_thismap));
        if (resp[ws_resp_cd - 1] == null) resp[ws_resp_cd - 1] = new CobolString(256);
        resp[ws_resp_cd - 1].set(String.valueOf(lit_thismap));
    }

    private void end_exec_2() {
        /* RAW: 3400 - */
    }

    private void send_screen_exit_2() {
        return;
    }

    private void read_acct() {
        acup_old_details.set("");
        ws_no_info_message.set(String.valueOf(cb_true));
        acup_old_acct_id.set(String.valueOf(cc_acct_id));
        ws_card_rid_acct_id.set(String.valueOf(cc_acct_id));
        _9200();
        /* RAW: - GETCARDXREF-BYACCT THRU 9200 - GETCARDXREF-BYACCT-EXIT */
        if (!String.valueOf(flg_acctfilter_not_ok).trim().isEmpty()) {
            _9000();
            return;
        }
        _9300();
        /* RAW: - GETACCTDATA-BYACCT THRU 9300 - GETACCTDATA-BYACCT-EXIT */
        if (!String.valueOf(did_not_find_acct_in_acctdat).trim().isEmpty()) {
            _9000();
            return;
        }
        ws_card_rid_cust_id.set(String.valueOf(cdemo_cust_id));
        _9400();
        /* RAW: - GETCUSTDATA-BYCUST THRU 9400 - GETCUSTDATA-BYCUST-EXIT */
        if (!String.valueOf(did_not_find_cust_in_custdat).trim().isEmpty()) {
            _9000();
            return;
        }
        _9500();
        /* RAW: - STORE-FETCHED-DATA THRU 9500 - */
    }

    private void store_fetched_data_exit() {
        /* RAW: 9000 - */
    }

    private void read_acct_exit() {
        return;
    }

    private void getcardxref_byacct() {
        /* RAW: EXEC CICS */
        if (dataset.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( LIT-CARDXREFNAME-ACCT-PATH ) RIDFLD ( WS-CARD-RID-ACCT-ID-X */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            cdemo_cust_id.set(String.valueOf(xref_cust_id));
            cdemo_card_num.set(String.valueOf(xref_card_num));
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            input_error.set(String.valueOf(cb_true));
            flg_acctfilter_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                error_resp.set(String.valueOf(ws_resp_cd));
                error_resp2.set(String.valueOf(ws_reas_cd));
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append("Account:");
                    _sb.append(String.valueOf(ws_card_rid_acct_id_x));
                    _sb.append(" not found in");
                    _sb.append(" Cross ref file.  Resp:");
                    _sb.append(String.valueOf(error_resp));
                    _sb.append(" Reas:");
                    _sb.append(String.valueOf(error_resp2));
                    ws_return_msg.set(_sb.toString());
                }
            }
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_acctfilter_not_ok.set(String.valueOf(cb_true));
            error_opname.set(String.valueOf("READ"));
            error_file.set(String.valueOf(lit_cardxrefname_acct_path));
            error_resp.set(String.valueOf(ws_resp_cd));
            error_resp2.set(String.valueOf(ws_reas_cd));
            ws_return_msg.set(String.valueOf(ws_file_error_message));
        }
        /* RAW: 9200 - */
    }

    private void getcardxref_byacct_exit() {
        return;
    }

    private void getacctdata_byacct() {
        /* RAW: EXEC CICS */
        if (dataset.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( LIT-ACCTFILENAME ) RIDFLD ( WS-CARD-RID-ACCT-ID-X */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            found_acct_in_master.set(String.valueOf(cb_true));
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            input_error.set(String.valueOf(cb_true));
            flg_acctfilter_not_ok.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                error_resp.set(String.valueOf(ws_resp_cd));
                error_resp2.set(String.valueOf(ws_reas_cd));
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append("Account:");
                    _sb.append(String.valueOf(ws_card_rid_acct_id_x));
                    _sb.append(" not found in");
                    _sb.append(" Acct Master file.Resp:");
                    _sb.append(String.valueOf(error_resp));
                    _sb.append(" Reas:");
                    _sb.append(String.valueOf(error_resp2));
                    ws_return_msg.set(_sb.toString());
                }
            }
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_acctfilter_not_ok.set(String.valueOf(cb_true));
            error_opname.set(String.valueOf("READ"));
            error_file.set(String.valueOf(lit_acctfilename));
            error_resp.set(String.valueOf(ws_resp_cd));
            error_resp2.set(String.valueOf(ws_reas_cd));
            ws_return_msg.set(String.valueOf(ws_file_error_message));
        }
        /* RAW: 9300 - */
    }

    private void getacctdata_byacct_exit() {
        return;
    }

    private void getcustdata_bycust() {
        /* RAW: EXEC CICS */
        if (dataset.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( LIT-CUSTFILENAME ) RIDFLD ( WS-CARD-RID-CUST-ID-X */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            found_cust_in_master.set(String.valueOf(cb_true));
        } else if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(notfnd).trim()) - 1]))) {
            input_error.set(String.valueOf(cb_true));
            flg_custfilter_not_ok.set(String.valueOf(cb_true));
            error_resp.set(String.valueOf(ws_resp_cd));
            error_resp2.set(String.valueOf(ws_reas_cd));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                {
                    StringBuilder _sb = new StringBuilder();
                    _sb.append("CustId:");
                    _sb.append(String.valueOf(ws_card_rid_cust_id_x));
                    _sb.append(" not found");
                    _sb.append(" in customer master.Resp: ");
                    _sb.append(String.valueOf(error_resp));
                    _sb.append(" REAS:");
                    _sb.append(String.valueOf(error_resp2));
                    ws_return_msg.set(_sb.toString());
                }
            }
        } else {
            input_error.set(String.valueOf(cb_true));
            flg_custfilter_not_ok.set(String.valueOf(cb_true));
            error_opname.set(String.valueOf("READ"));
            error_file.set(String.valueOf(lit_custfilename));
            error_resp.set(String.valueOf(ws_resp_cd));
            error_resp2.set(String.valueOf(ws_reas_cd));
            ws_return_msg.set(String.valueOf(ws_file_error_message));
        }
        /* RAW: 9400 - */
    }

    private void getcustdata_bycust_exit() {
        return;
    }

    private void store_fetched_data() {
        cdemo_acct_id.set(String.valueOf(acct_id));
        cdemo_cust_id.set(String.valueOf(cust_id));
        cdemo_cust_fname.set(String.valueOf(cust_first_name));
        cdemo_cust_mname.set(String.valueOf(cust_middle_name));
        cdemo_cust_lname.set(String.valueOf(cust_last_name));
        cdemo_acct_status.set(String.valueOf(acct_active_status));
        cdemo_card_num.set(String.valueOf(xref_card_num));
        acup_old_details.set("");
        acup_old_acct_id.set(String.valueOf(acct_id));
        acup_old_active_status.set(String.valueOf(acct_active_status));
        acup_old_curr_bal_n.set(String.valueOf(acct_curr_bal));
        acup_old_credit_limit_n.set(String.valueOf(acct_credit_limit));
        acup_old_cash_credit_limit_n.set(String.valueOf(acct_cash_credit_limit));
        acup_old_curr_cyc_credit_n.set(String.valueOf(acct_curr_cyc_credit));
        acup_old_curr_cyc_debit_n.set(String.valueOf(acct_curr_cyc_debit));
        acup_old_open_year.set(String.valueOf(CobolString.refMod(acct_open_date, 1, 4)));
        acup_old_open_mon.set(String.valueOf(CobolString.refMod(acct_open_date, 6, 2)));
        acup_old_open_day.set(String.valueOf(CobolString.refMod(acct_open_date, 9, 2)));
        acup_old_exp_year.set(String.valueOf(CobolString.refMod(acct_expiraion_date, 1, 4)));
        acup_old_exp_mon.set(String.valueOf(CobolString.refMod(acct_expiraion_date, 6, 2)));
        acup_old_exp_day.set(String.valueOf(CobolString.refMod(acct_expiraion_date, 9, 2)));
        acup_old_reissue_year.set(String.valueOf(CobolString.refMod(acct_reissue_date, 1, 4)));
        acup_old_reissue_mon.set(String.valueOf(CobolString.refMod(acct_reissue_date, 6, 2)));
        acup_old_reissue_day.set(String.valueOf(CobolString.refMod(acct_reissue_date, 9, 2)));
        acup_old_group_id.set(String.valueOf(acct_group_id));
        acup_old_cust_id.set(String.valueOf(cust_id));
        acup_old_cust_ssn.set(String.valueOf(cust_ssn));
        acup_old_cust_dob_year.set(String.valueOf(CobolString.refMod(cust_dob_yyyy_mm_dd, 1, 4)));
        acup_old_cust_dob_mon.set(String.valueOf(CobolString.refMod(cust_dob_yyyy_mm_dd, 6, 2)));
        acup_old_cust_dob_day.set(String.valueOf(CobolString.refMod(cust_dob_yyyy_mm_dd, 9, 2)));
        acup_old_cust_fico_score.set(String.valueOf(cust_fico_credit_score));
        acup_old_cust_first_name.set(String.valueOf(cust_first_name));
        acup_old_cust_middle_name.set(String.valueOf(cust_middle_name));
        acup_old_cust_last_name.set(String.valueOf(cust_last_name));
        acup_old_cust_addr_line_1.set(String.valueOf(cust_addr_line_1));
        acup_old_cust_addr_line_2.set(String.valueOf(cust_addr_line_2));
        acup_old_cust_addr_line_3.set(String.valueOf(cust_addr_line_3));
        acup_old_cust_addr_state_cd.set(String.valueOf(cust_addr_state_cd));
        acup_old_cust_addr_country_cd.set(String.valueOf(cust_addr_country_cd));
        acup_old_cust_addr_zip.set(String.valueOf(cust_addr_zip));
        acup_old_cust_phone_num_1.set(String.valueOf(cust_phone_num_1));
        acup_old_cust_phone_num_2.set(String.valueOf(cust_phone_num_2));
        acup_old_cust_govt_issued_id.set(String.valueOf(cust_govt_issued_id));
        acup_old_cust_eft_account_id.set(String.valueOf(cust_eft_account_id));
    }

    private void acup_old_cust_pri_holder_ind() {
        /* RAW: 9500 - */
    }

    private void store_fetched_data_exit_2() {
        return;
    }

    private void write_processing() {
        ws_card_rid_acct_id.set(String.valueOf(cc_acct_id));
        exec.set(String.valueOf(cc_acct_id));
        cics.set(String.valueOf(cc_acct_id));
        if (file.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( LIT-ACCTFILENAME ) UPDATE RIDFLD ( */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                could_not_lock_acct_for_update.set(String.valueOf(cb_true));
            }
            _9600();
            return;
        }
        ws_card_rid_cust_id.set(String.valueOf(cdemo_cust_id));
        exec.set(String.valueOf(cdemo_cust_id));
        cics.set(String.valueOf(cdemo_cust_id));
        if (file.read(null) == FileStatus.AT_END) {
        }
        /* RAW: ( LIT-CUSTFILENAME ) UPDATE RIDFLD ( */
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else {
            input_error.set(String.valueOf(cb_true));
            if (!String.valueOf(ws_return_msg_off).trim().isEmpty()) {
                could_not_lock_cust_for_update.set(String.valueOf(cb_true));
            }
            _9600();
            return;
        }
        _9700();
        /* RAW: - CHECK-CHANGE-IN-REC THRU 9700 - CHECK-CHANGE-IN-REC-EXIT */
        if (!String.valueOf(data_was_changed_before_update).trim().isEmpty()) {
            _9600();
            return;
        }
        acct_update_record.set("");
        acct_update_id.set(String.valueOf(acup_new_acct_id));
        acct_update_active_status.set(String.valueOf(acup_new_active_status));
        acct_update_curr_bal.set(String.valueOf(acup_new_curr_bal_n));
        acct_update_credit_limit.set(String.valueOf(acup_new_credit_limit_n));
        acct_update_cash_credit_limit.set(String.valueOf(acup_new_cash_credit_limit_n));
        acct_update_curr_cyc_credit.set(String.valueOf(acup_new_curr_cyc_credit_n));
        acct_update_curr_cyc_debit.set(String.valueOf(acup_new_curr_cyc_debit_n));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(acup_new_open_year));
            _sb.append("-");
            _sb.append(String.valueOf(acup_new_open_mon));
            _sb.append("-");
            _sb.append(String.valueOf(acup_new_open_day));
            acct_update_open_date.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(acup_new_exp_year));
            _sb.append("-");
            _sb.append(String.valueOf(acup_new_exp_mon));
            _sb.append("-");
            _sb.append(String.valueOf(acup_new_exp_day));
            acct_update_expiraion_date.set(_sb.toString());
        }
        acct_update_reissue_date.set(String.valueOf(acct_reissue_date));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(acup_new_reissue_year));
            _sb.append("-");
            _sb.append(String.valueOf(acup_new_reissue_mon));
            _sb.append("-");
            _sb.append(String.valueOf(acup_new_reissue_day));
            acct_update_reissue_date.set(_sb.toString());
        }
        acct_update_group_id.set(String.valueOf(acup_new_group_id));
        cust_update_record.set("");
        cust_update_id.set(String.valueOf(acup_new_cust_id));
        cust_update_first_name.set(String.valueOf(acup_new_cust_first_name));
        cust_update_middle_name.set(String.valueOf(acup_new_cust_middle_name));
        cust_update_last_name.set(String.valueOf(acup_new_cust_last_name));
        cust_update_addr_line_1.set(String.valueOf(acup_new_cust_addr_line_1));
        cust_update_addr_line_2.set(String.valueOf(acup_new_cust_addr_line_2));
        cust_update_addr_line_3.set(String.valueOf(acup_new_cust_addr_line_3));
        cust_update_addr_state_cd.set(String.valueOf(acup_new_cust_addr_state_cd));
        cust_update_addr_country_cd.set(String.valueOf(acup_new_cust_addr_country_cd));
        cust_update_addr_zip.set(String.valueOf(acup_new_cust_addr_zip));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("(");
            _sb.append(String.valueOf(_unnamed));
            _sb.append(String.valueOf(acup_new_cust_phone_num_1a));
            _sb.append(String.valueOf(_unnamed));
            _sb.append(")");
            _sb.append(String.valueOf(_unnamed));
            _sb.append(String.valueOf(acup_new_cust_phone_num_1b));
            _sb.append(String.valueOf(_unnamed));
            _sb.append("-");
            _sb.append(String.valueOf(_unnamed));
            _sb.append(String.valueOf(acup_new_cust_phone_num_1c));
            cust_update_phone_num_1.set(_sb.toString());
        }
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append("(");
            _sb.append(String.valueOf(_unnamed));
            _sb.append(String.valueOf(acup_new_cust_phone_num_2a));
            _sb.append(String.valueOf(_unnamed));
            _sb.append(")");
            _sb.append(String.valueOf(_unnamed));
            _sb.append(String.valueOf(acup_new_cust_phone_num_2b));
            _sb.append(String.valueOf(_unnamed));
            _sb.append("-");
            _sb.append(String.valueOf(_unnamed));
            _sb.append(String.valueOf(acup_new_cust_phone_num_2c));
            cust_update_phone_num_2.set(_sb.toString());
        }
        cust_update_ssn.set(String.valueOf(acup_new_cust_ssn));
        cust_update_govt_issued_id.set(String.valueOf(acup_new_cust_govt_issued_id));
        {
            StringBuilder _sb = new StringBuilder();
            _sb.append(String.valueOf(acup_new_cust_dob_year));
            _sb.append("-");
            _sb.append(String.valueOf(acup_new_cust_dob_mon));
            _sb.append("-");
            _sb.append(String.valueOf(acup_new_cust_dob_day));
            cust_update_dob_yyyy_mm_dd.set(_sb.toString());
        }
        cust_update_eft_account_id.set(String.valueOf(acup_new_cust_eft_account_id));
        cust_update_pri_card_ind.set(String.valueOf(acup_new_cust_pri_holder_ind));
        cust_update_fico_credit_score.set(String.valueOf(acup_new_cust_fico_score));
        exec.set(String.valueOf(acup_new_cust_fico_score));
        cics.set(String.valueOf(acup_new_cust_fico_score));
        file.rewrite((acct_update_record));
        /* RAW: LENGTH ( LENGTH OF ACCT-UPDATE-RECORD ) */
    }

    private void end_exec_3() {
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else {
            locked_but_update_failed.set(String.valueOf(cb_true));
            _9600();
            return;
        }
        /* RAW: EXEC CICS */
        file.rewrite((cust_update_record));
        /* RAW: LENGTH ( LENGTH OF CUST-UPDATE-RECORD ) */
    }

    private void end_exec_4() {
        if (String.valueOf(ws_resp_cd).equals(String.valueOf(dfhresp[Integer.parseInt(String.valueOf(normal).trim()) - 1]))) {
            /* CONTINUE */
        } else {
            locked_but_update_failed.set(String.valueOf(cb_true));
            /* RAW: EXEC CICS SYNCPOINT ROLLBACK END-EXEC */
            _9600();
            return;
        }
        /* RAW: 9600 - */
    }

    private void write_processing_exit() {
        return;
    }

    private void check_change_in_rec() {
        if ((((((((((((((((String.valueOf(acct_active_status).equals(String.valueOf(acup_old_active_status)) && String.valueOf(acct_curr_bal).equals(String.valueOf(acup_old_curr_bal_n))) && String.valueOf(acct_credit_limit).equals(String.valueOf(acup_old_credit_limit_n))) && String.valueOf(acct_cash_credit_limit).equals(String.valueOf(acup_old_cash_credit_limit_n))) && String.valueOf(acct_curr_cyc_credit).equals(String.valueOf(acup_old_curr_cyc_credit_n))) && String.valueOf(acct_curr_cyc_debit).equals(String.valueOf(acup_old_curr_cyc_debit_n))) && String.valueOf(CobolString.refMod(acct_open_date, 1, 4)).equals(String.valueOf(acup_old_open_year))) && String.valueOf(CobolString.refMod(acct_open_date, 6, 2)).equals(String.valueOf(acup_old_open_mon))) && String.valueOf(CobolString.refMod(acct_open_date, 9, 2)).equals(String.valueOf(acup_old_open_day))) && String.valueOf(CobolString.refMod(acct_expiraion_date, 1, 4)).equals(String.valueOf(acup_old_exp_year))) && String.valueOf(CobolString.refMod(acct_expiraion_date, 6, 2)).equals(String.valueOf(acup_old_exp_mon))) && String.valueOf(CobolString.refMod(acct_expiraion_date, 9, 2)).equals(String.valueOf(acup_old_exp_day))) && String.valueOf(CobolString.refMod(acct_reissue_date, 1, 4)).equals(String.valueOf(acup_old_reissue_year))) && String.valueOf(CobolString.refMod(acct_reissue_date, 6, 2)).equals(String.valueOf(acup_old_reissue_mon))) && String.valueOf(CobolString.refMod(acct_reissue_date, 9, 2)).equals(String.valueOf(acup_old_reissue_day))) && String.valueOf(CobolIntrinsics.lower_case(acct_group_id)).equals(String.valueOf(CobolIntrinsics.lower_case(acup_old_group_id))))) {
            /* CONTINUE */
        } else {
            data_was_changed_before_update.set(String.valueOf(cb_true));
            _9600();
            return;
        }
        if (((((((((((((((((((String.valueOf(CobolIntrinsics.upper_case(cust_first_name)).equals(String.valueOf(CobolIntrinsics.upper_case(acup_old_cust_first_name))) && String.valueOf(CobolIntrinsics.upper_case(cust_middle_name)).equals(String.valueOf(CobolIntrinsics.upper_case(acup_old_cust_middle_name)))) && String.valueOf(CobolIntrinsics.upper_case(cust_last_name)).equals(String.valueOf(CobolIntrinsics.upper_case(acup_old_cust_last_name)))) && String.valueOf(CobolIntrinsics.upper_case(cust_addr_line_1)).equals(String.valueOf(CobolIntrinsics.upper_case(acup_old_cust_addr_line_1)))) && String.valueOf(CobolIntrinsics.upper_case(cust_addr_line_2)).equals(String.valueOf(CobolIntrinsics.upper_case(acup_old_cust_addr_line_2)))) && String.valueOf(CobolIntrinsics.upper_case(cust_addr_line_3)).equals(String.valueOf(CobolIntrinsics.upper_case(acup_old_cust_addr_line_3)))) && String.valueOf(CobolIntrinsics.upper_case(cust_addr_state_cd)).equals(String.valueOf(CobolIntrinsics.upper_case(acup_old_cust_addr_state_cd)))) && String.valueOf(CobolIntrinsics.upper_case(cust_addr_country_cd)).equals(String.valueOf(CobolIntrinsics.upper_case(acup_old_cust_addr_country_cd)))) && String.valueOf(cust_addr_zip).equals(String.valueOf(acup_old_cust_addr_zip))) && String.valueOf(cust_phone_num_1).equals(String.valueOf(acup_old_cust_phone_num_1))) && String.valueOf(cust_phone_num_2).equals(String.valueOf(acup_old_cust_phone_num_2))) && String.valueOf(cust_ssn).equals(String.valueOf(acup_old_cust_ssn))) && String.valueOf(CobolIntrinsics.upper_case(cust_govt_issued_id)).equals(String.valueOf(CobolIntrinsics.upper_case(acup_old_cust_govt_issued_id)))) && String.valueOf(CobolString.refMod(cust_dob_yyyy_mm_dd, 1, 4)).equals(String.valueOf(CobolString.refMod(acup_old_cust_dob_yyyy_mm_dd, 1, 4)))) && String.valueOf(CobolString.refMod(cust_dob_yyyy_mm_dd, 6, 2)).equals(String.valueOf(CobolString.refMod(acup_old_cust_dob_yyyy_mm_dd, 5, 2)))) && String.valueOf(CobolString.refMod(cust_dob_yyyy_mm_dd, 9, 2)).equals(String.valueOf(CobolString.refMod(acup_old_cust_dob_yyyy_mm_dd, 7, 2)))) && String.valueOf(cust_eft_account_id).equals(String.valueOf(acup_old_cust_eft_account_id))) && String.valueOf(cust_pri_card_holder_ind).equals(String.valueOf(acup_old_cust_pri_holder_ind))) && String.valueOf(cust_fico_credit_score).equals(String.valueOf(acup_old_cust_fico_score)))) {
            /* CONTINUE */
        } else {
            data_was_changed_before_update.set(String.valueOf(cb_true));
            _9600();
            return;
        }
        /* RAW: 9700 - */
    }

    private void check_change_in_rec_exit() {
        return;
    }

    private void abend_routine() {
        if (String.valueOf(abend_msg).equals(String.valueOf("\u0000"))) {
            abend_msg.set(String.valueOf("UNEXPECTED ABEND OCCURRED."));
        }
        abend_culprit.set(String.valueOf(lit_thispgm));
        exec.set(String.valueOf(lit_thispgm));
        cics.set(String.valueOf(lit_thispgm));
        send.set(String.valueOf(lit_thispgm));
        if (from[Integer.parseInt(String.valueOf(abend_data).trim()) - 1] == null) from[Integer.parseInt(String.valueOf(abend_data).trim()) - 1] = new CobolString(256);
        from[Integer.parseInt(String.valueOf(abend_data).trim()) - 1].set(String.valueOf(lit_thispgm));
        if (length[CobolIntrinsics.length(abend_data) - 1] == null) length[CobolIntrinsics.length(abend_data) - 1] = new CobolString(256);
        length[CobolIntrinsics.length(abend_data) - 1].set(String.valueOf(lit_thispgm));
        nohandle.set(String.valueOf(lit_thispgm));
        erase.set(String.valueOf(lit_thispgm));
        end_exec.set(String.valueOf(lit_thispgm));
        exec.set(String.valueOf(lit_thispgm));
        cics.set(String.valueOf(lit_thispgm));
        handle.set(String.valueOf(lit_thispgm));
        abend.set(String.valueOf(lit_thispgm));
        /* CANCEL end_exec */
        /* CANCEL exec */
        /* CANCEL cics */
        /* CANCEL abend */
        // CANCEL abcode[0  non-numeric literal: 9999  - 1]
    }

    private void end_exec_5() {
    }

    private void abend_routine_exit() {
        return;
    }

    private void csutldpy() {
    }

    private void yyyy_store_pfkey() { /* stub — external/COPY */ }

    private void yyyy_store_pfkey_exit() { /* stub — external/COPY */ }

    private void _3000() { /* stub — external/COPY */ }

    private void _1000() { /* stub — external/COPY */ }

    private void _2000() { /* stub — external/COPY */ }

    private void _1100() { /* stub — external/COPY */ }

    private void _1200() { /* stub — external/COPY */ }

    private void _1210() { /* stub — external/COPY */ }

    private void _1205() { /* stub — external/COPY */ }

    private void _1220() { /* stub — external/COPY */ }

    private void edit_date_ccyymmdd() { /* stub — external/COPY */ }

    private void edit_date_ccyymmdd_exit() { /* stub — external/COPY */ }

    private void _1250() { /* stub — external/COPY */ }

    private void _1265() { /* stub — external/COPY */ }

    private void edit_date_of_birth() { /* stub — external/COPY */ }

    private void edit_date_of_birth_exit() { /* stub — external/COPY */ }

    private void _1245() { /* stub — external/COPY */ }

    private void _1275() { /* stub — external/COPY */ }

    private void _1225() { /* stub — external/COPY */ }

    private void _1235() { /* stub — external/COPY */ }

    private void _1215() { /* stub — external/COPY */ }

    private void _1270() { /* stub — external/COPY */ }

    private void _1260() { /* stub — external/COPY */ }

    private void _1280() { /* stub — external/COPY */ }

    private void _1230() { /* stub — external/COPY */ }

    private void _1240() { /* stub — external/COPY */ }

    private void _9000() { /* stub — external/COPY */ }

    private void _9600() { /* stub — external/COPY */ }

    private void _3100() { /* stub — external/COPY */ }

    private void _3200() { /* stub — external/COPY */ }

    private void _3250() { /* stub — external/COPY */ }

    private void _3300() { /* stub — external/COPY */ }

    private void _3390() { /* stub — external/COPY */ }

    private void _3400() { /* stub — external/COPY */ }

    private void _3201() { /* stub — external/COPY */ }

    private void _3202() { /* stub — external/COPY */ }

    private void _3203() { /* stub — external/COPY */ }

    private void _3310() { /* stub — external/COPY */ }

    private void _3320() { /* stub — external/COPY */ }

    private void _9200() { /* stub — external/COPY */ }

    private void _9300() { /* stub — external/COPY */ }

    private void _9400() { /* stub — external/COPY */ }

    private void _9500() { /* stub — external/COPY */ }

    private void _9700() { /* stub — external/COPY */ }

    @Override
    public void run() {
        para_main();
    }

    public static void main(String[] args) {
        new Coactupc().run();
    }
}
