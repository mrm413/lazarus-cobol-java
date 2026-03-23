package com.lazarus.cobol.cics;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * CICS Execute Interface Block (EIB).
 * Populated automatically by the CICS runtime at task start and updated
 * after each CICS command. Programs read EIB fields to check status,
 * determine transaction context, and inspect AID keys.
 */
public class CicsEIB {

    // --- Transaction context ---
    /** Transaction ID (4 chars) */
    public String eibtrnid = "    ";
    /** Task number */
    public int eibtaskn = 0;
    /** Terminal ID (4 chars) */
    public String eibtrmid = "    ";
    /** Length of COMMAREA passed to this program */
    public int eibcalen = 0;

    // --- Date/Time (populated at task start and by ASKTIME) ---
    /** Date in packed 0CYYDDD format (C=century, YY=year, DDD=day-of-year) */
    public int eibdate = 0;
    /** Time in packed 0HHMMSS format */
    public int eibtime = 0;

    // --- Response codes (set after each CICS command) ---
    /** Primary response code (DFHRESP values) */
    public int eibresp = 0;
    /** Secondary response code */
    public int eibresp2 = 0;

    // --- AID key (set by RECEIVE MAP) ---
    /** Attention Identifier — which key the user pressed */
    public byte eibaid = 0;
    /** Cursor position (offset in screen buffer) */
    public int eibcposn = 0;

    // --- Command tracking ---
    /** Function code of last CICS command */
    public int eibfn = 0;
    /** Resource type of last CICS command */
    public int eibrcode = 0;

    // --- DFHAID key constants ---
    public static final byte AID_ENTER  = (byte) 0x7D;  // DFHENTER
    public static final byte AID_CLEAR  = (byte) 0x6D;  // DFHCLEAR
    public static final byte AID_PA1    = (byte) 0x6C;
    public static final byte AID_PA2    = (byte) 0x6E;
    public static final byte AID_PA3    = (byte) 0x6B;
    public static final byte AID_PF1    = (byte) 0xF1;
    public static final byte AID_PF2    = (byte) 0xF2;
    public static final byte AID_PF3    = (byte) 0xF3;
    public static final byte AID_PF4    = (byte) 0xF4;
    public static final byte AID_PF5    = (byte) 0xF5;
    public static final byte AID_PF6    = (byte) 0xF6;
    public static final byte AID_PF7    = (byte) 0xF7;
    public static final byte AID_PF8    = (byte) 0xF8;
    public static final byte AID_PF9    = (byte) 0xF9;
    public static final byte AID_PF10   = (byte) 0x7A;
    public static final byte AID_PF11   = (byte) 0x7B;
    public static final byte AID_PF12   = (byte) 0x7C;
    public static final byte AID_PF13   = (byte) 0xC1;
    public static final byte AID_PF14   = (byte) 0xC2;
    public static final byte AID_PF15   = (byte) 0xC3;
    public static final byte AID_PF16   = (byte) 0xC4;
    public static final byte AID_PF17   = (byte) 0xC5;
    public static final byte AID_PF18   = (byte) 0xC6;
    public static final byte AID_PF19   = (byte) 0xC7;
    public static final byte AID_PF20   = (byte) 0xC8;
    public static final byte AID_PF21   = (byte) 0xC9;
    public static final byte AID_PF22   = (byte) 0x4A;
    public static final byte AID_PF23   = (byte) 0x4B;
    public static final byte AID_PF24   = (byte) 0x4C;

    // --- DFHRESP response code constants ---
    public static final int RESP_NORMAL    = 0;
    public static final int RESP_ERROR     = 1;
    public static final int RESP_NOTFND    = 13;
    public static final int RESP_DUPREC    = 14;
    public static final int RESP_DUPKEY    = 15;
    public static final int RESP_ENDFILE   = 20;
    public static final int RESP_INVREQ    = 16;
    public static final int RESP_IOERR     = 17;
    public static final int RESP_NOSPACE   = 18;
    public static final int RESP_NOTOPEN   = 19;
    public static final int RESP_LENGERR   = 22;
    public static final int RESP_PGMIDERR  = 27;
    public static final int RESP_DISABLED  = 84;
    public static final int RESP_ITEMERR   = 26;
    public static final int RESP_QIDERR    = 44;
    public static final int RESP_MAPFAIL   = 36;
    public static final int RESP_EXPIRED   = 31;
    public static final int RESP_TERMERR   = 81;

    /** Populate date/time fields from system clock. Called at task start and by ASKTIME. */
    public void refreshDateTime() {
        LocalDate d = LocalDate.now();
        int century = (d.getYear() >= 2000) ? 1 : 0;
        int yy = d.getYear() % 100;
        int ddd = d.getDayOfYear();
        eibdate = century * 1000000 + yy * 1000 + ddd;

        LocalTime t = LocalTime.now();
        eibtime = t.getHour() * 10000 + t.getMinute() * 100 + t.getSecond();
    }

    /** Set response codes after a CICS command. */
    public void setResponse(int resp, int resp2) {
        this.eibresp = resp;
        this.eibresp2 = resp2;
    }

    /** Reset response to NORMAL. */
    public void clearResponse() {
        this.eibresp = RESP_NORMAL;
        this.eibresp2 = 0;
    }
}
