package com.lazarus.cobol.env;

import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.*;

/**
 * Language Environment (LE) Callable Services for COBOL programs.
 *
 * Maps CEE* routines from IBM Language Environment:
 *   CEEDAYS  — Convert date string to Lilian day number
 *   CEESECS  — Convert timestamp string to Lilian seconds
 *   CEEDATM  — Convert Lilian seconds to formatted timestamp
 *   CEEFMDT  — Format date/time from Lilian days
 *   CEELOCT  — Get local date and time
 *   CEEUTC   — Get UTC date and time
 *   CEEGMT   — Get Greenwich Mean Time
 *   CEECBLDY — Convert date (COBOL-style, days since Jan 1, 1601)
 *   CEESECI  — Convert Lilian seconds to integers
 *   CEE3ABD  — Abnormal terminate
 *   CEEMSG   — Get condition message text
 *   CEEDYWK  — Day of week from Lilian day
 *
 * Lilian day number: days since October 14, 1582 (Gregorian calendar start).
 *   October 15, 1582 = Lilian day 1.
 *
 * Lilian seconds: seconds since 00:00:00 October 15, 1582.
 *
 * Feedback codes (fc):
 *   0 = Success
 *   1 = Warning (e.g., truncation)
 *   2 = Error (e.g., invalid date)
 *   3 = Severe (e.g., internal failure)
 */
public class CobolLE {

    // Lilian epoch: October 15, 1582
    private static final LocalDate LILIAN_EPOCH = LocalDate.of(1582, 10, 15);
    private static final LocalDateTime LILIAN_EPOCH_DT = LocalDateTime.of(1582, 10, 15, 0, 0, 0);

    // COBOL Integer Date epoch: January 1, 1601
    private static final LocalDate COBOL_EPOCH = LocalDate.of(1601, 1, 1);

    // Picture format mappings: IBM LE picture → Java DateTimeFormatter
    private static final Map<String, String> PICTURE_MAP = new LinkedHashMap<>();
    static {
        // Date pictures
        PICTURE_MAP.put("YYYYMMDD", "yyyyMMdd");
        PICTURE_MAP.put("YYYY-MM-DD", "yyyy-MM-dd");
        PICTURE_MAP.put("YYYY/MM/DD", "yyyy/MM/dd");
        PICTURE_MAP.put("MM/DD/YYYY", "MM/dd/yyyy");
        PICTURE_MAP.put("MM/DD/YY", "MM/dd/yy");
        PICTURE_MAP.put("DD/MM/YYYY", "dd/MM/yyyy");
        PICTURE_MAP.put("YYMMDD", "yyMMdd");
        PICTURE_MAP.put("YYDDD", "yyDDD");
        PICTURE_MAP.put("YYYYDDD", "yyyyDDD");
        PICTURE_MAP.put("MMDDYYYY", "MMddyyyy");
        PICTURE_MAP.put("DDMMYYYY", "ddMMyyyy");
        PICTURE_MAP.put("MMDDYY", "MMddyy");
        // Timestamp pictures
        PICTURE_MAP.put("YYYYMMDDHHMISS", "yyyyMMddHHmmss");
        PICTURE_MAP.put("YYYY-MM-DD HH:MI:SS", "yyyy-MM-dd HH:mm:ss");
        PICTURE_MAP.put("YYYY-MM-DD-HH.MI.SS", "yyyy-MM-dd-HH.mm.ss");
        PICTURE_MAP.put("MM/DD/YYYY HH:MI:SS", "MM/dd/yyyy HH:mm:ss");
    }

    // --- Feedback code holder ---

    private int lastFeedbackCode = 0;

    public int getLastFeedbackCode() { return lastFeedbackCode; }

    // --- CEEDAYS: Convert date string to Lilian day number ---

    public long ceedays(String dateString, String picture) {
        try {
            LocalDate date = parseDate(dateString.trim(), picture.trim().toUpperCase());
            if (date == null) {
                lastFeedbackCode = 2;
                return -1;
            }
            if (date.isBefore(LILIAN_EPOCH)) {
                lastFeedbackCode = 2;
                return -1;
            }
            long days = ChronoUnit.DAYS.between(LILIAN_EPOCH, date) + 1;
            lastFeedbackCode = 0;
            return days;
        } catch (Exception e) {
            lastFeedbackCode = 2;
            return -1;
        }
    }

    // --- CEESECS: Convert timestamp to Lilian seconds ---

    public double ceesecs(String timestamp, String picture) {
        try {
            LocalDateTime dt = parseTimestamp(timestamp.trim(), picture.trim().toUpperCase());
            if (dt == null) {
                lastFeedbackCode = 2;
                return -1;
            }
            if (dt.isBefore(LILIAN_EPOCH_DT)) {
                lastFeedbackCode = 2;
                return -1;
            }
            long days = ChronoUnit.DAYS.between(LILIAN_EPOCH, dt.toLocalDate());
            long secondsInDay = dt.toLocalTime().toSecondOfDay();
            double totalSeconds = (days * 86400.0) + secondsInDay;
            lastFeedbackCode = 0;
            return totalSeconds;
        } catch (Exception e) {
            lastFeedbackCode = 2;
            return -1;
        }
    }

    // --- CEEDATM: Convert Lilian seconds to formatted timestamp ---

    public String ceedatm(double lilianSeconds, String picture) {
        try {
            long wholeSecs = (long) lilianSeconds;
            long days = wholeSecs / 86400;
            long secOfDay = wholeSecs % 86400;
            LocalDate date = LILIAN_EPOCH.plusDays(days);
            LocalTime time = LocalTime.ofSecondOfDay(secOfDay);
            LocalDateTime dt = LocalDateTime.of(date, time);
            String fmt = toJavaFormat(picture.trim().toUpperCase());
            lastFeedbackCode = 0;
            return dt.format(DateTimeFormatter.ofPattern(fmt));
        } catch (Exception e) {
            lastFeedbackCode = 2;
            return "";
        }
    }

    // --- CEEFMDT: Format date from Lilian day number ---

    public String ceefmdt(long lilianDay, String picture) {
        try {
            if (lilianDay < 1) {
                lastFeedbackCode = 2;
                return "";
            }
            LocalDate date = LILIAN_EPOCH.plusDays(lilianDay - 1);
            String fmt = toJavaFormat(picture.trim().toUpperCase());
            lastFeedbackCode = 0;
            return date.format(DateTimeFormatter.ofPattern(fmt));
        } catch (Exception e) {
            lastFeedbackCode = 2;
            return "";
        }
    }

    // --- CEELOCT: Get local date and time ---

    public long[] ceeloct() {
        LocalDateTime now = LocalDateTime.now();
        long lilianDay = ChronoUnit.DAYS.between(LILIAN_EPOCH, now.toLocalDate()) + 1;
        long days = ChronoUnit.DAYS.between(LILIAN_EPOCH, now.toLocalDate());
        long secOfDay = now.toLocalTime().toSecondOfDay();
        double lilianSeconds = (days * 86400.0) + secOfDay;
        // Returns: [lilian_day, lilian_seconds_whole, gregorian YYYYMMDD, HHMMSS00]
        int yyyymmdd = now.getYear() * 10000 + now.getMonthValue() * 100 + now.getDayOfMonth();
        int hhmmss = now.getHour() * 10000 + now.getMinute() * 100 + now.getSecond();
        lastFeedbackCode = 0;
        return new long[]{lilianDay, (long) lilianSeconds, yyyymmdd, hhmmss};
    }

    // --- CEEUTC / CEEGMT: Get UTC time ---

    public long[] ceeutc() {
        LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
        long lilianDay = ChronoUnit.DAYS.between(LILIAN_EPOCH, now.toLocalDate()) + 1;
        long days = ChronoUnit.DAYS.between(LILIAN_EPOCH, now.toLocalDate());
        double lilianSeconds = (days * 86400.0) + now.toLocalTime().toSecondOfDay();
        int yyyymmdd = now.getYear() * 10000 + now.getMonthValue() * 100 + now.getDayOfMonth();
        int hhmmss = now.getHour() * 10000 + now.getMinute() * 100 + now.getSecond();
        lastFeedbackCode = 0;
        return new long[]{lilianDay, (long) lilianSeconds, yyyymmdd, hhmmss};
    }

    public long[] ceegmt() { return ceeutc(); }

    // --- CEECBLDY: Convert date to COBOL integer date (days since Jan 1, 1601) ---

    public long ceecbldy(String dateString, String picture) {
        try {
            LocalDate date = parseDate(dateString.trim(), picture.trim().toUpperCase());
            if (date == null) {
                lastFeedbackCode = 2;
                return -1;
            }
            if (date.isBefore(COBOL_EPOCH)) {
                lastFeedbackCode = 2;
                return -1;
            }
            long days = ChronoUnit.DAYS.between(COBOL_EPOCH, date) + 1;
            lastFeedbackCode = 0;
            return days;
        } catch (Exception e) {
            lastFeedbackCode = 2;
            return -1;
        }
    }

    // --- CEESECI: Decompose Lilian seconds to year, month, day, hour, minute, second ---

    public int[] ceeseci(double lilianSeconds) {
        try {
            long wholeSecs = (long) lilianSeconds;
            long days = wholeSecs / 86400;
            long secOfDay = wholeSecs % 86400;
            LocalDate date = LILIAN_EPOCH.plusDays(days);
            LocalTime time = LocalTime.ofSecondOfDay(secOfDay);
            int millis = (int) ((lilianSeconds - wholeSecs) * 1000);
            lastFeedbackCode = 0;
            return new int[]{
                date.getYear(), date.getMonthValue(), date.getDayOfMonth(),
                time.getHour(), time.getMinute(), time.getSecond(), millis
            };
        } catch (Exception e) {
            lastFeedbackCode = 2;
            return new int[]{0, 0, 0, 0, 0, 0, 0};
        }
    }

    // --- CEEDYWK: Day of week from Lilian day (1=Sunday .. 7=Saturday) ---

    public int ceedywk(long lilianDay) {
        try {
            if (lilianDay < 1) {
                lastFeedbackCode = 2;
                return 0;
            }
            LocalDate date = LILIAN_EPOCH.plusDays(lilianDay - 1);
            DayOfWeek dow = date.getDayOfWeek();
            // IBM: 1=Sun, 2=Mon, ..., 7=Sat
            // Java DayOfWeek: 1=Mon, ..., 7=Sun
            int ibmDow = (dow.getValue() % 7) + 1;
            lastFeedbackCode = 0;
            return ibmDow;
        } catch (Exception e) {
            lastFeedbackCode = 2;
            return 0;
        }
    }

    // --- CEE3ABD: Abnormal terminate ---

    public void cee3abd(int abendCode, int timing) {
        // timing: 0=immediate, 1=allow cleanup
        throw new RuntimeException("CEE3ABD: ABEND code=" + abendCode + " timing=" + timing);
    }

    // --- CEEMSG: Get condition message ---

    public String ceemsg(int conditionCode) {
        switch (conditionCode) {
            case 0: return "CEE000I Operation successful.";
            case 1: return "CEE001W Warning condition.";
            case 2: return "CEE002E Error condition — invalid input.";
            case 3: return "CEE003S Severe error — operation failed.";
            default: return "CEE999I Unknown condition code " + conditionCode + ".";
        }
    }

    // --- Date math utilities ---

    /** Add days to Lilian day number */
    public long addDays(long lilianDay, long daysToAdd) {
        lastFeedbackCode = 0;
        return lilianDay + daysToAdd;
    }

    /** Difference between two Lilian day numbers */
    public long diffDays(long lilianDay1, long lilianDay2) {
        lastFeedbackCode = 0;
        return lilianDay2 - lilianDay1;
    }

    /** Convert Lilian day to LocalDate */
    public LocalDate lilianToDate(long lilianDay) {
        if (lilianDay < 1) return null;
        return LILIAN_EPOCH.plusDays(lilianDay - 1);
    }

    /** Convert LocalDate to Lilian day */
    public long dateToLilian(LocalDate date) {
        if (date.isBefore(LILIAN_EPOCH)) return -1;
        return ChronoUnit.DAYS.between(LILIAN_EPOCH, date) + 1;
    }

    // --- Internal helpers ---

    private LocalDate parseDate(String dateStr, String picture) {
        String fmt = toJavaFormat(picture);
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(fmt);
            LocalDate date = LocalDate.parse(dateStr, formatter);
            // Validate round-trip to catch SMART resolver leniency (e.g., Feb 29 on non-leap year)
            if (!date.format(formatter).equals(dateStr)) return null;
            return date;
        } catch (Exception e) {
            return null;
        }
    }

    private LocalDateTime parseTimestamp(String tsStr, String picture) {
        String fmt = toJavaFormat(picture);
        try {
            return LocalDateTime.parse(tsStr, DateTimeFormatter.ofPattern(fmt));
        } catch (Exception e) {
            return null;
        }
    }

    private String toJavaFormat(String picture) {
        String mapped = PICTURE_MAP.get(picture);
        if (mapped != null) return mapped;
        // Manual conversion: YYYY→yyyy, MM→MM, DD→dd, HH→HH, MI→mm, SS→ss, DDD→DDD
        return picture
            .replace("YYYY", "yyyy")
            .replace("YY", "yy")
            .replace("DDD", "DDD")
            .replace("DD", "dd")
            .replace("MI", "mm")
            .replace("SS", "ss");
        // MM and HH stay the same
    }
}
