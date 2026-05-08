package com.lazarus.cobol.generated;

import com.lazarus.cobol.CobolDisplay;
import com.lazarus.cobol.CobolFile;
import com.lazarus.cobol.CobolIntrinsics;
import com.lazarus.cobol.CobolProgram;
import com.lazarus.cobol.CobolString;
import com.lazarus.cobol.FileStatus;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RunMisc139StackAndDumpFeature extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "prog";
    private int sort_return = 0;
    private int json_code = 0;
    private int xml_code = 0;
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
    private CobolString stdin = new CobolString(256);
    private CobolString stdout = new CobolString(256);
    private CobolString stderr = new CobolString(256);
    private boolean _exitSection = false;
    // WORKING-STORAGE SECTION
    private short max_sub = (short) 6;
    private CobolString cust_stat = new CobolString(2);
    private int rec_num = 1;
    private int bin = 0;
    private CobolString test_data = new CobolString(270, "ALP00000BET00000DEL00000EPS00000FOR00000GAM00000ALPHA ELECTRICAL CO. LTD.BETA SHOE MFG. INC.      DELTA LUGGAGE REPAIRS    EPSILON EQUIPMENT SUPPLY FORTUNE COOKIE COMPANY   GAMMA X-RAY TECHNOLOGY   ATLANTA   CALGARY   NEW YORK  TORONTO   WASHINGTONWHITEPLAIN010013075010"); // Group: TEST-DATA
    private CobolString data_cust_num_tbl = new CobolString(48, "ALP00000BET00000DEL00000EPS00000FOR00000GAM00000"); // Group: DATA-CUST-NUM-TBL
    private CobolString filler_1 = new CobolString(8, "ALP00000");
    private CobolString filler_2 = new CobolString(8, "BET00000");
    private CobolString filler_3 = new CobolString(8, "DEL00000");
    private CobolString filler_4 = new CobolString(8, "EPS00000");
    private CobolString filler_5 = new CobolString(8, "FOR00000");
    private CobolString filler_6 = new CobolString(8, "GAM00000");
    private CobolString[] data_cust_num = new CobolString[6];
    {
        String _rdv = "ALP00000BET00000DEL00000EPS00000FOR00000GAM00000";
        for (int _i = 0; _i < 6 && _i * 8 < _rdv.length(); _i++) {
            data_cust_num[_i] = new CobolString(8, _rdv.substring(_i * 8, Math.min((_i + 1) * 8, _rdv.length())));
        }
    }
    private CobolString data_company_tbl = new CobolString(150, "ALPHA ELECTRICAL CO. LTD.BETA SHOE MFG. INC.      DELTA LUGGAGE REPAIRS    EPSILON EQUIPMENT SUPPLY FORTUNE COOKIE COMPANY   GAMMA X-RAY TECHNOLOGY   "); // Group: DATA-COMPANY-TBL
    private CobolString filler_7 = new CobolString(25, "ALPHA ELECTRICAL CO. LTD.");
    private CobolString filler_8 = new CobolString(25, "BETA SHOE MFG. INC.      ");
    private CobolString filler_9 = new CobolString(25, "DELTA LUGGAGE REPAIRS    ");
    private CobolString filler_10 = new CobolString(25, "EPSILON EQUIPMENT SUPPLY ");
    private CobolString filler_11 = new CobolString(25, "FORTUNE COOKIE COMPANY   ");
    private CobolString filler_12 = new CobolString(25, "GAMMA X-RAY TECHNOLOGY   ");
    private CobolString[] data_company = new CobolString[6];
    {
        String _rdv = "ALPHA ELECTRICAL CO. LTD.BETA SHOE MFG. INC.      DELTA LUGGAGE REPAIRS    EPSILON EQUIPMENT SUPPLY FORTUNE COOKIE COMPANY   GAMMA X-RAY TECHNOLOGY   ";
        for (int _i = 0; _i < 6 && _i * 25 < _rdv.length(); _i++) {
            data_company[_i] = new CobolString(25, _rdv.substring(_i * 25, Math.min((_i + 1) * 25, _rdv.length())));
        }
    }
    private CobolString data_address_2_tbl = new CobolString(60, "ATLANTA   CALGARY   NEW YORK  TORONTO   WASHINGTONWHITEPLAIN"); // Group: DATA-ADDRESS-2-TBL
    private CobolString filler_13 = new CobolString(10, "ATLANTA   ");
    private CobolString filler_14 = new CobolString(10, "CALGARY   ");
    private CobolString filler_15 = new CobolString(10, "NEW YORK  ");
    private CobolString filler_16 = new CobolString(10, "TORONTO   ");
    private CobolString filler_17 = new CobolString(10, "WASHINGTON");
    private CobolString filler_18 = new CobolString(10, "WHITEPLAIN");
    private CobolString[] data_address = new CobolString[6];
    {
        String _rdv = "ATLANTA   CALGARY   NEW YORK  TORONTO   WASHINGTONWHITEPLAIN";
        for (int _i = 0; _i < 6 && _i * 10 < _rdv.length(); _i++) {
            data_address[_i] = new CobolString(10, _rdv.substring(_i * 10, Math.min((_i + 1) * 10, _rdv.length())));
        }
    }
    private CobolString data_no_terminals_tbl = new CobolString(12, "010013075010090254"); // Group: DATA-NO-TERMINALS-TBL
    private BigDecimal filler_19 = new BigDecimal("10");
    private BigDecimal filler_20 = new BigDecimal("13");
    private BigDecimal filler_21 = new BigDecimal("75");
    private BigDecimal filler_22 = new BigDecimal("10");
    private BigDecimal filler_23 = new BigDecimal("90");
    private BigDecimal filler_24 = new BigDecimal("254");
    private BigDecimal[] data_no_terminals = new BigDecimal[6];
    {
        String _rdv = "010013075010090254";
        for (int _i = 0; _i < 6 && _i * 2 < _rdv.length(); _i++) {
            try { data_no_terminals[_i] = new BigDecimal(_rdv.substring(_i * 2, Math.min((_i + 1) * 2, _rdv.length())).trim()); } catch (NumberFormatException _nfe) {}
        }
    }
    private CobolString work_area = new CobolString(2); // Group: WORK-AREA
    private short sub = (short) 0;
    private BigDecimal[] sums_non_std_occurs = new BigDecimal[8];

    // FILE SECTION — FLATFILE
    private CobolString tspfl_record = new CobolString(45); // Group: TSPFL-RECORD
    private CobolString cm_cust_num = new CobolString(8);
    private CobolString cm_company = new CobolString(25);
    private CobolString cm_disk = new CobolString(8);
    private int cm_no_terminals = 0;

    
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(428);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_max_sub = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("MAX-SUB").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_cust_stat = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(2, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("CUST-STAT").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_rec_num = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("REC-NUM").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_bin = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(8, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("BIN").picDigits(9).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_data = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 270).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TEST-DATA").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_cust_num_tbl = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 48).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DATA-CUST-NUM-TBL").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_25 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_26 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(20, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_27 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(28, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_28 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(36, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_29 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(44, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_30 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(52, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_cust_num = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(12, 8).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DATA-CUST-NUM").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_company_tbl = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(60, 150).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DATA-COMPANY-TBL").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_31 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(60, 25).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_32 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(85, 25).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_33 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(110, 25).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_34 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(135, 25).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_35 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(160, 25).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_36 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(185, 25).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_company = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(60, 25).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DATA-COMPANY").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_address_2_tbl = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(210, 60).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DATA-ADDRESS-2-TBL").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_37 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(210, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_38 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(220, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_39 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(230, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_40 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(240, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_41 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(250, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_42 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(260, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("FILLER").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_address = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(210, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("DATA-ADDRESS").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_no_terminals_tbl = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(270, 12).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("DATA-NO-TERMINALS-TBL").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_43 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(270, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FILLER").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_44 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(272, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FILLER").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_45 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(274, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FILLER").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_46 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(276, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FILLER").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_47 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(278, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FILLER").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_filler_48 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(280, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("FILLER").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_data_no_terminals = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(270, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("DATA-NO-TERMINALS").picDigits(3).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_work_area = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(282, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("WORK-AREA").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_sub = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(282, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("SUB").picDigits(4).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_sums_non_std_occurs = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(284, 18).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("SUMS-NON-STD-OCCURS").picDigits(18).picScale(1).signed(true).build();

    // FILE DESCRIPTORS
    private CobolFile flatfile = new CobolFile("RELFIX", "RELATIVE", "SEQUENTIAL", "FLATFILE");

    private CobolString odd_record = new CobolString(256); // fallback
    private CobolString _filler_001 = new CobolString(256); // fallback
    private CobolString relfix = new CobolString(256, "RELFIX"); // fallback (implicit ASSIGN — initialized to name)

    // SECTION: CALL-SUB-1
    private CobolString _filler_002 = new CobolString(256); // fallback
    private CobolString _filler_004 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private CobolString _filler_010 = new CobolString(256); // fallback
    private CobolString _filler_014 = new CobolString(256); // fallback
    private void call_sub_1() {
        _exitSection = false;
        use_call_sub_1();
    }

    private void use_call_sub_1() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_CALL-SUB-1 OF CALL-SUB-1");
        { /* Pre-CALL: sync TSPFL-RECORD from children */
            String _gp = String.valueOf(tspfl_record);
            StringBuilder _sb = new StringBuilder(45);
            _sb.append(String.format("%-8s", String.valueOf(cm_cust_num)).substring(0, 8));
            _sb.append(String.format("%-25s", String.valueOf(cm_company)).substring(0, 25));
            _sb.append(String.format("%-8s", String.valueOf(cm_disk)).substring(0, 8));
            _sb.append(CobolDisplay.formatPic(cm_no_terminals, 4, 0, false));
            tspfl_record.set(_sb.toString());
        }
        CobolProgram.callNested("sub1", bin, _filler_002, tspfl_record);
    }

    // SECTION: CALL-SUB-2
    private void call_sub_2() {
        _exitSection = false;
        use_call_sub_2();
    }

    private void use_call_sub_2() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_CALL-SUB-2 OF CALL-SUB-2");
        bin = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(4096), 9));
        _filler_004.set(String.valueOf(4096));
        sums_non_std_occurs[2 - 1] = CobolIntrinsics.toBigDecimal(4096);
        { /* Pre-CALL: sync TSPFL-RECORD from children */
            String _gp = String.valueOf(tspfl_record);
            StringBuilder _sb = new StringBuilder(45);
            _sb.append(String.format("%-8s", String.valueOf(cm_cust_num)).substring(0, 8));
            _sb.append(String.format("%-25s", String.valueOf(cm_company)).substring(0, 25));
            _sb.append(String.format("%-8s", String.valueOf(cm_disk)).substring(0, 8));
            _sb.append(CobolDisplay.formatPic(cm_no_terminals, 4, 0, false));
            tspfl_record.set(_sb.toString());
        }
        CobolProgram.call("sub2", bin, _filler_008, tspfl_record);
    }

    // SECTION: CALL-IT-OMIT
    private void call_it_omit() {
        _exitSection = false;
        use_call_it_omit();
    }

    private void use_call_it_omit() {
        CobolIntrinsics.setCurrentLocation("prog; _USE_CALL-IT-OMIT OF CALL-IT-OMIT");
        bin = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(5440), 9));
        _filler_010.set(String.valueOf(5440));
        sums_non_std_occurs[3 - 1] = CobolIntrinsics.toBigDecimal(5440);
        { /* Pre-CALL: sync TSPFL-RECORD from children */
            String _gp = String.valueOf(tspfl_record);
            StringBuilder _sb = new StringBuilder(45);
            _sb.append(String.format("%-8s", String.valueOf(cm_cust_num)).substring(0, 8));
            _sb.append(String.format("%-25s", String.valueOf(cm_company)).substring(0, 25));
            _sb.append(String.format("%-8s", String.valueOf(cm_disk)).substring(0, 8));
            _sb.append(CobolDisplay.formatPic(cm_no_terminals, 4, 0, false));
            tspfl_record.set(_sb.toString());
        }
        CobolProgram.call("sub2", bin, _filler_014, tspfl_record);
    }

    private void para_main() {
        loadfile();
        { String _en = System.getenv("RELFIX"); if (_en != null) flatfile.setFileName(_en); else flatfile.setFileName(""); }
        flatfile.open("INPUT");
        cust_stat.set(flatfile.getFileStatus());
        flatfile.setRelativeKey((int) rec_num);
        flatfile.read(tspfl_record);
        cust_stat.set(flatfile.getFileStatus());
        cm_cust_num.set(CobolString.refMod(tspfl_record, 1, 8));
        cm_company.set(CobolString.refMod(tspfl_record, 9, 25));
        cm_disk.set(CobolString.refMod(tspfl_record, 34, 8));
        try { cm_no_terminals = Integer.parseInt(CobolString.refMod(tspfl_record, 42, 4).toString().trim()); } catch (NumberFormatException _nfe) {}
    }

    private void main_100() {
        call_sub_1();
        call_sub_2();
        call_it_omit();
        CobolIntrinsics.programExit(CobolProgram.return_code);
    }

    private void loadfile() {
        { String _en = System.getenv("RELFIX"); if (_en != null) flatfile.setFileName(_en); else flatfile.setFileName(""); }
        flatfile.open("OUTPUT");
        cust_stat.set(flatfile.getFileStatus());
        for (sub = 1; !(sub > max_sub); sub += 1) {
            load_record();
        }
        flatfile.close();
        cust_stat.set(flatfile.getFileStatus());
    }

    private void load_record() {
        tspfl_record.set(String.valueOf(" "));
        if (cm_cust_num != null) cm_cust_num.set(CobolString.refMod(tspfl_record, 1, 8));
        if (cm_company != null) cm_company.set(CobolString.refMod(tspfl_record, 9, 25));
        if (cm_disk != null) cm_disk.set(CobolString.refMod(tspfl_record, 34, 8));
        try { cm_no_terminals = Integer.parseInt(CobolString.refMod(tspfl_record, 42, 4).trim()); } catch (Exception _ge) {}
        cm_cust_num.set(String.valueOf(CobolString.safeIndex(data_cust_num, sub, 8, test_data, 48)));
        cm_company.set(String.valueOf(CobolString.safeIndex(data_company, sub, 25, test_data, 246)));
        cm_no_terminals = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(data_no_terminals[sub - 1]), 4));
        if ((sub == 1 || sub == 3 || sub == 5)) {
            cm_disk.set(String.valueOf("8417"));
        } else {
            cm_disk.set(String.valueOf("8470"));
        }
        tspfl_record.setRefMod(1, 8, String.valueOf(cm_cust_num));
        tspfl_record.setRefMod(9, 25, String.valueOf(cm_company));
        tspfl_record.setRefMod(34, 8, String.valueOf(cm_disk));
        tspfl_record.setRefMod(42, 4, CobolDisplay.formatPic(cm_no_terminals, 4, 0, false));
        flatfile.setRelativeKey((int) rec_num);
        flatfile.write(tspfl_record);
        cust_stat.set(flatfile.getFileStatus());
    }

    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("prog", "", "prog.cob");
        CobolProgram.pushActive("prog");
        try {
            CobolProgram.registerCallAlias("prog", "RunMisc139StackAndDumpFeature");
            CobolProgram.registerCallAlias("sub1", "RunMisc139StackAndDumpFeature_Sub1");
            CobolProgram.registerCallAlias("prog", "RunMisc139StackAndDumpFeature");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            if (flatfile != null && cust_stat != null) flatfile.setStatusField(cust_stat);
            para_main();
            main_100();
        } finally { CobolProgram.popActive(); }
    }

    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new RunMisc139StackAndDumpFeature().run();
    }
}

class RunMisc139StackAndDumpFeature_Sub1 extends CobolProgram {
    public static final String COBOL_PROGRAM_ID = "sub1";
    private int sort_return = 0;
    private int json_code = 0;
    private int xml_code = 0;
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
    private CobolString stdin = new CobolString(256);
    private CobolString stdout = new CobolString(256);
    private CobolString stderr = new CobolString(256);
    private boolean _exitSection = false;
    // WORKING-STORAGE SECTION
    private int zro = 0;
    private byte hexv = (byte) 0;
    private CobolString hexc = new CobolString(1);
    private CobolString test_based = new CobolString(100000); // Group: TEST-BASED
    private CobolString test_based_sub = new CobolString(100000);
    private CobolString test_alloced = new CobolString(16); // Group: TEST-ALLOCED
    private CobolString test_alloced_sub1 = new CobolString(10);
    private int test_alloced_sub2 = 0;
    private int idx = 0;
    private CobolString tstrec = new CobolString(388); // Group: TSTREC
    private CobolString tstdep = new CobolString(3);
    private CobolString[] tstx = new CobolString[4]; // Group: TSTX
    private int[] tstg_1 = new int[4];
    private CobolString[][] tstx_2 = new CobolString[4][4];
    {
        for (int _d0 = 0; _d0 < 4; _d0++) {
            for (int _d1 = 0; _d1 < 4; _d1++) {
                tstx_2[_d0][_d1] = new CobolString(2);
            }
        }
    }
    private int tsttail1 = 0;
    private BigDecimal tstcomp3 = BigDecimal.ZERO;
    private CobolString tstlong = new CobolString(100);
    private CobolString tsthex = new CobolString(100);
    private CobolString tsthex2 = new CobolString(60);
    private CobolString tsttailx = new CobolString(80);
    // LINKAGE SECTION
    private int x = 0;
    private CobolString tspfl_record = new CobolString(45); // Group: TSPFL-RECORD
    private CobolString cm_cust_num = new CobolString(8);
    private CobolString cm_company = new CobolString(25);
    private CobolString cm_disk = new CobolString(8);
    private int cm_no_terminals = 0;
    // VMG: flat-memory layout (Phase 1.5b — declarations only, not yet wired into MOVE/DISPLAY)
    private final com.lazarus.cobol.vmg.MemoryGrid _vmg_grid = new com.lazarus.cobol.vmg.MemoryGrid(100414);
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_zro = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(0, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("ZRO").picDigits(9).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_hexv = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(4, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("HEXV").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_hexc = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(5, 1).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("HEXC").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_based = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 100000).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TEST-BASED").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_based_sub = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(6, 100000).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TEST-BASED-SUB").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_alloced = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100006, 16).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TEST-ALLOCED").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_alloced_sub1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100006, 10).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TEST-ALLOCED-SUB1").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_test_alloced_sub2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100016, 6).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.EDITED).name("TEST-ALLOCED-SUB2").picDigits(6).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_idx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100022, 4).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.BINARY).name("IDX").picDigits(9).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tstrec = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100026, 388).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TSTREC").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tstdep = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100026, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TSTDEP").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tstx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100029, 40).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.GROUP).name("TSTX").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tstg_1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100029, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TSTG-1").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tstx_2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100031, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TSTX-2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tsttail1 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100069, 2).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.NUMERIC_DISPLAY).name("TSTTAIL1").picDigits(2).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tstcomp3 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100071, 3).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.PACKED_BCD).name("TSTCOMP3").picDigits(5).build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tstlong = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100074, 100).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TSTLONG").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tsthex = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100174, 100).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TSTHEX").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tsthex2 = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100274, 60).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TSTHEX2").build();
    @SuppressWarnings("unused") private final com.lazarus.cobol.vmg.FieldDescriptor _vmgfd_tsttailx = com.lazarus.cobol.vmg.FieldDescriptor.builder().grid(_vmg_grid).at(100334, 80).storage(com.lazarus.cobol.vmg.FieldDescriptor.Storage.ALPHANUMERIC).name("TSTTAILX").build();
    private CobolString _filler_001 = new CobolString(256); // fallback
    // SECTION: MAIN-1
    private CobolString _filler_003 = new CobolString(256); // fallback
    private CobolString _filler_008 = new CobolString(256); // fallback
    private void main_1() {
        _exitSection = false;
        use_main_1();
        if (_exitSection) return;
        main_2();
    }
    private void use_main_1() {
        CobolIntrinsics.setCurrentLocation("sub1; _USE_MAIN-1 OF MAIN-1");
        tstrec.set("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        { /* Sync OCCURS children of TSTREC after group MOVE */
            String _grp = tstrec.get();
            int _grpLen = _grp.length();
            for (int _gi = 0; _gi < 4; _gi++) {
                int _base = 3 + _gi * 10;
                if (_base + 0 < _grpLen) { try { tstg_1[_gi] = Integer.parseInt(_grp.substring(_base + 0, Math.min(_base + 0 + 2, _grpLen)).trim()); } catch (Exception _e) { tstg_1[_gi] = 0; } }
                for (int _gj = 0; _gj < 4; _gj++) {
                    if (_base + 2 + _gj * 2 + 0 < _grpLen) { if (tstx_2[_gi][_gj] == null) tstx_2[_gi][_gj] = new CobolString(2); tstx_2[_gi][_gj].set(_grp.substring(_base + 2 + _gj * 2 + 0, Math.min(_base + 2 + _gj * 2 + 0 + 2, _grpLen))); }
                }
                { int _gstart = _base; int _gend = Math.min(_base + 10, _grpLen); if (tstx[_gi] == null) tstx[_gi] = new CobolString(10); tstx[_gi].set(_grp.substring(Math.min(_gstart, _grpLen), _gend)); }
            }
        }
        if (tstdep != null) tstdep.set(CobolString.refMod(tstrec, 1, 3));
        try { tsttail1 = Integer.parseInt(CobolString.refMod(tstrec, 44, 2).trim()); } catch (Exception _ge) {}
        try { tstcomp3 = new java.math.BigDecimal(CobolString.refMod(tstrec, 46, 5).trim()); } catch (Exception _ge) {}
        if (tstlong != null) tstlong.set(CobolString.refMod(tstrec, 51, 100));
        if (tsthex != null) tsthex.set(CobolString.refMod(tstrec, 151, 100));
        if (tsthex2 != null) tsthex2.set(CobolString.refMod(tstrec, 251, 60));
        if (tsttailx != null) tsttailx.set(CobolString.refMod(tstrec, 311, 80));
        tstg_1[1 - 1] = CobolIntrinsics.toBigDecimal(1).intValue();
        if (tstx[1 - 1] != null) tstx[1 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tstg_1[1 - 1], 2, 0, false));
        tstg_1[2 - 1] = CobolIntrinsics.toBigDecimal(2).intValue();
        if (tstx[2 - 1] != null) tstx[2 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tstg_1[2 - 1], 2, 0, false));
        tstg_1[3 - 1] = CobolIntrinsics.toBigDecimal(3).intValue();
        if (tstx[3 - 1] != null) tstx[3 - 1].setRefMod(1, 2, CobolDisplay.formatPic(tstg_1[3 - 1], 2, 0, false));
        if (tstx_2[1 - 1] == null) tstx_2[1 - 1] = new CobolString[4];
        if (tstx_2[1 - 1][1 - 1] == null) tstx_2[1 - 1][1 - 1] = new CobolString(2);
        tstx_2[1 - 1][1 - 1].set(String.valueOf("A"));
        if (tstx_2[2 - 1] == null) tstx_2[2 - 1] = new CobolString[4];
        if (tstx_2[2 - 1][1 - 1] == null) tstx_2[2 - 1][1 - 1] = new CobolString(2);
        tstx_2[2 - 1][1 - 1].set(String.valueOf("B"));
        if (tstx_2[3 - 1] == null) tstx_2[3 - 1] = new CobolString[4];
        if (tstx_2[3 - 1][1 - 1] == null) tstx_2[3 - 1][1 - 1] = new CobolString(2);
        tstx_2[3 - 1][1 - 1].set(String.valueOf("C"));
        if (tstx_2[1 - 1] == null) tstx_2[1 - 1] = new CobolString[4];
        if (tstx_2[1 - 1][4 - 1] == null) tstx_2[1 - 1][4 - 1] = new CobolString(2);
        tstx_2[1 - 1][4 - 1].set(String.valueOf("xx"));
        if (tstx_2[2 - 1] == null) tstx_2[2 - 1] = new CobolString[4];
        if (tstx_2[2 - 1][4 - 1] == null) tstx_2[2 - 1][4 - 1] = new CobolString(2);
        tstx_2[2 - 1][4 - 1].set(String.valueOf("yy"));
        if (tstx_2[3 - 1] == null) tstx_2[3 - 1] = new CobolString[4];
        if (tstx_2[3 - 1][4 - 1] == null) tstx_2[3 - 1][4 - 1] = new CobolString(2);
        tstx_2[3 - 1][4 - 1].set(String.valueOf("zz"));
        if (tstx_2[1 - 1] == null) tstx_2[1 - 1] = new CobolString[4];
        if (tstx_2[1 - 1][3 - 1] == null) tstx_2[1 - 1][3 - 1] = new CobolString(2);
        tstx_2[1 - 1][3 - 1].set(String.valueOf(" "));
        if (tstx[4 - 1] == null) tstx[4 - 1] = new CobolString(10);
        tstx[4 - 1].set(String.valueOf("\uFFFF"));
        if (tstx_2[2 - 1] == null) tstx_2[2 - 1] = new CobolString[4];
        if (tstx_2[2 - 1][3 - 1] == null) tstx_2[2 - 1][3 - 1] = new CobolString(2);
        tstx_2[2 - 1][3 - 1].set(String.valueOf("\u0000"));
        if (tstx_2[3 - 1] == null) tstx_2[3 - 1] = new CobolString[4];
        if (tstx_2[3 - 1][3 - 1] == null) tstx_2[3 - 1][3 - 1] = new CobolString(2);
        tstx_2[3 - 1][3 - 1].set(String.valueOf("\uFFFF"));
        tstlong.set(String.valueOf("Quick brown fox jumped over the dog"));
        _filler_003.set(String.valueOf("Quick brown fox jumped over the dog"));
        tstlong.setRefMod(50, 36, String.valueOf("Quick brown fox jumped over the dog"));
        tsthex.setRefMod(1, 35, String.valueOf("Quicker grey fox jumped the cougar"));
        main_2();
    }
    private void main_2() {
        CobolIntrinsics.setCurrentLocation("sub1; MAIN-2 OF MAIN-1");
        hexv = (byte) CobolIntrinsics.toBigDecimal(17).byteValue();
        tsthex.setRefMod(39, 1, String.valueOf(hexc));
        { String _rs = String.format("%02d", Math.abs(tsttail1)); StringBuilder _rb = new StringBuilder(_rs); try { _rb.replace(2 - 1, 2 - 1 + 1, String.valueOf(hexc)); tsttail1 = Integer.parseInt(_rb.toString().trim()); } catch (Exception _e) {} }
        hexv = (byte) CobolIntrinsics.toBigDecimal(7).byteValue();
        tsthex.setRefMod(47, 1, String.valueOf(hexc));
        hexv = (byte) CobolIntrinsics.toBigDecimal(13).byteValue();
        tsthex.setRefMod(59, 1, String.valueOf(hexc));
        hexv = (byte) CobolIntrinsics.toBigDecimal(0).byteValue();
        tsthex2.setRefMod(39, 1, String.valueOf(hexc));
        _filler_008.set(String.valueOf(hexc));
        tsthex2.setRefMod(10, 1, String.valueOf(hexc));
        hexv = (byte) CobolIntrinsics.toBigDecimal(9).byteValue();
        tsthex2.setRefMod(47, 1, String.valueOf(hexc));
        tsthex2.setRefMod(32, 1, String.valueOf("\\"));
        hexv = (byte) CobolIntrinsics.toBigDecimal(13).byteValue();
        tsthex2.setRefMod(59, 1, String.valueOf(hexc));
        tsthex2.setRefMod(54, 1, String.valueOf("A"));
        tsttailx.set("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        x = (int) Math.abs(CobolIntrinsics.truncateBigDecimalInt(CobolIntrinsics.toBigDecimal(CobolIntrinsics.toBigDecimal(x).add(CobolIntrinsics.toBigDecimal(1))), 9));
        CobolDisplay.display("X is " + CobolDisplay.formatPic(x, 9, 0, false));
        /* ALLOCATE — dynamic memory, not typical in Java */
        if (!CobolString.cobolEquals(String.valueOf(test_based), String.valueOf("\u0000".repeat(100000)))) {
            CobolDisplay.display(String.valueOf(test_based_sub));
        }
        return;
    }
    @Override
    public void run() {
        CobolIntrinsics.setModuleInfo("sub1", "", "sub1.cob");
        CobolProgram.pushActive("sub1");
        try {
            CobolProgram.registerCallAlias("sub1", "RunMisc139StackAndDumpFeature_Sub1");
            CobolProgram.registerCallAlias("sub1", "RunMisc139StackAndDumpFeature_Sub1");
            CobolProgram.registerCallAlias("prog", "RunMisc139StackAndDumpFeature");
            CobolDisplay.setDecimalPointIsComma(false);
            CobolDisplay.setDpcInDataMode("DEFAULT");
            CobolIntrinsics.setLocationEnabled(false);
            main_1();
        } finally { CobolProgram.popActive(); }
    }
    public void setLinkageArgs(Object[] args) {
        if (args.length > 0 && args[0] != null) {
            x = CobolIntrinsics.toBigDecimal(args[0]).intValue();
        }
        if (args.length > 2 && args[2] != null) {
            if (args[2] instanceof CobolString) tspfl_record = (CobolString) args[2]; else tspfl_record.set(String.valueOf(args[2]));
            { /* Decompose TSPFL-RECORD linkage group into children */
                String _lnk = tspfl_record.get();
                int _lnkLen = _lnk.length();
                if (0 < _lnkLen) cm_cust_num.set(_lnk.substring(0, Math.min(8, _lnkLen)));
                if (8 < _lnkLen) cm_company.set(_lnk.substring(8, Math.min(33, _lnkLen)));
                if (33 < _lnkLen) cm_disk.set(_lnk.substring(33, Math.min(41, _lnkLen)));
                if (41 < _lnkLen) { try { cm_no_terminals = Integer.parseInt(_lnk.substring(41, Math.min(45, _lnkLen)).trim()); } catch (Exception _e) { cm_no_terminals = 0; } }
            }
        }
    }
    public static void main(String[] args) {
        if (args.length > 0 && "--cobol-child".equals(args[0])) {
            CobolProgram.markIsCobolChild(true);
            String[] _rest = new String[args.length - 1];
            System.arraycopy(args, 1, _rest, 0, _rest.length);
            args = _rest;
        }
        CobolIntrinsics.setCommandLineArgs(args);
        new RunMisc139StackAndDumpFeature_Sub1().run();
    }
}
