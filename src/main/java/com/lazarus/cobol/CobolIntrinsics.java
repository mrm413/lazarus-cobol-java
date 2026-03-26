package com.lazarus.cobol;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * COBOL intrinsic functions and type-checking utilities.
 */
public class CobolIntrinsics {

    // FUNCTION CURRENT-DATE
    public static String current_date() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSSSSSSSS")).substring(0, 21);
    }

    // FUNCTION LENGTH
    public static int length(Object val) {
        if (val instanceof CobolString) return ((CobolString) val).length();
        return String.valueOf(val).length();
    }

    // FUNCTION UPPER-CASE
    public static String upper_case(Object val) {
        return String.valueOf(val).toUpperCase();
    }

    // FUNCTION LOWER-CASE
    public static String lower_case(Object val) {
        return String.valueOf(val).toLowerCase();
    }

    // FUNCTION TRIM
    public static String trim(Object val) {
        return String.valueOf(val).trim();
    }
    public static String trim(Object val, Object mode) {
        String s = String.valueOf(val);
        String m = String.valueOf(mode).toUpperCase().trim();
        if (m.startsWith("LEAD")) return s.replaceAll("^\\s+", "");
        if (m.startsWith("TRAIL")) return s.replaceAll("\\s+$", "");
        return s.trim();
    }

    // FUNCTION REVERSE
    public static String reverse(Object val) {
        return new StringBuilder(String.valueOf(val)).reverse().toString();
    }

    // FUNCTION NUMVAL
    public static BigDecimal numval(Object val) {
        try {
            return new BigDecimal(String.valueOf(val).trim());
        } catch (NumberFormatException e) {
            return BigDecimal.ZERO;
        }
    }

    // FUNCTION MOD
    public static int mod(int a, int b) {
        return a % b;
    }

    // FUNCTION ORD
    public static int ord(Object val) {
        String s = String.valueOf(val);
        return s.isEmpty() ? 0 : (int) s.charAt(0) + 1;
    }

    // FUNCTION CHAR
    public static String char_(int ordinal) {
        return String.valueOf((char) (ordinal - 1));
    }

    // FUNCTION MAX
    public static int max(int... values) {
        int m = values[0];
        for (int v : values) if (v > m) m = v;
        return m;
    }

    // FUNCTION MIN
    public static int min(int... values) {
        int m = values[0];
        for (int v : values) if (v < m) m = v;
        return m;
    }

    // FUNCTION CONCATENATE
    public static String concatenate(Object... parts) {
        StringBuilder sb = new StringBuilder();
        for (Object p : parts) sb.append(String.valueOf(p));
        return sb.toString();
    }

    // ACCEPT FROM
    public static String acceptFrom(String source) {
        switch (source.toUpperCase()) {
            case "DATE": case "DATE YYYYMMDD": return current_date().substring(0, 8);
            case "DAY": case "DAY YYYYDDD": return current_date().substring(0, 7);
            case "TIME": return current_date().substring(8, 14);
            case "DAY-OF-WEEK": return String.valueOf(java.time.LocalDate.now().getDayOfWeek().getValue());
            default: return "";
        }
    }

    // Class condition checks
    public static boolean isNumeric(Object val) {
        try { new BigDecimal(String.valueOf(val).trim()); return true; }
        catch (Exception e) { return false; }
    }

    public static boolean isAlphabetic(Object val) {
        String s = String.valueOf(val);
        for (char c : s.toCharArray()) if (c != ' ' && !Character.isLetter(c)) return false;
        return true;
    }

    public static boolean isAlphabetic_lower(Object val) {
        String s = String.valueOf(val);
        for (char c : s.toCharArray()) if (c != ' ' && !Character.isLowerCase(c)) return false;
        return true;
    }

    public static boolean isAlphabetic_upper(Object val) {
        String s = String.valueOf(val);
        for (char c : s.toCharArray()) if (c != ' ' && !Character.isUpperCase(c)) return false;
        return true;
    }

    // FUNCTION WHEN-COMPILED
    public static String when_compiled() {
        return current_date();
    }

    // FUNCTION INTEGER-OF-DATE
    public static int integer_of_date(int date) {
        int y = date / 10000, m = (date / 100) % 100, d = date % 100;
        return (int) java.time.LocalDate.of(y, m, d).toEpochDay();
    }

    // FUNCTION DATE-OF-INTEGER
    public static int date_of_integer(int days) {
        java.time.LocalDate d = java.time.LocalDate.ofEpochDay(days);
        return d.getYear() * 10000 + d.getMonthValue() * 100 + d.getDayOfMonth();
    }

    // FUNCTION INTEGER-OF-DAY
    public static int integer_of_day(int yyyyddd) {
        int y = yyyyddd / 1000, doy = yyyyddd % 1000;
        return (int) java.time.LocalDate.ofYearDay(y, doy).toEpochDay();
    }

    // FUNCTION DAY-OF-INTEGER
    public static int day_of_integer(int days) {
        java.time.LocalDate d = java.time.LocalDate.ofEpochDay(days);
        return d.getYear() * 1000 + d.getDayOfYear();
    }

    // FUNCTION NUMVAL-C
    public static BigDecimal numval_c(Object val) {
        String s = String.valueOf(val).trim().replaceAll("[,$]", "").replaceAll("[()]", "-");
        try { return new BigDecimal(s); } catch (Exception e) { return BigDecimal.ZERO; }
    }

    // FUNCTION INTEGER
    public static int integer(Object val) {
        try { return (int) Math.floor(Double.parseDouble(String.valueOf(val).trim())); }
        catch (Exception e) { return 0; }
    }

    // FUNCTION INTEGER-PART
    public static int integer_part(Object val) {
        try { return (int) Double.parseDouble(String.valueOf(val).trim()); }
        catch (Exception e) { return 0; }
    }

    // FUNCTION ABS
    public static BigDecimal abs(Object val) {
        try { return new BigDecimal(String.valueOf(val).trim()).abs(); }
        catch (Exception e) { return BigDecimal.ZERO; }
    }

    // FUNCTION SQRT
    public static double sqrt(Object val) {
        try { return Math.sqrt(Double.parseDouble(String.valueOf(val).trim())); }
        catch (Exception e) { return 0; }
    }

    // FUNCTION LOG
    public static double log(Object val) {
        try { return Math.log(Double.parseDouble(String.valueOf(val).trim())); }
        catch (Exception e) { return 0; }
    }

    // FUNCTION LOG10
    public static double log10(Object val) {
        try { return Math.log10(Double.parseDouble(String.valueOf(val).trim())); }
        catch (Exception e) { return 0; }
    }

    // FUNCTION SIN/COS/TAN/ASIN/ACOS/ATAN
    public static double sin(Object val) { try { return Math.sin(Double.parseDouble(String.valueOf(val).trim())); } catch (Exception e) { return 0; } }
    public static double cos(Object val) { try { return Math.cos(Double.parseDouble(String.valueOf(val).trim())); } catch (Exception e) { return 0; } }
    public static double tan(Object val) { try { return Math.tan(Double.parseDouble(String.valueOf(val).trim())); } catch (Exception e) { return 0; } }
    public static double asin(Object val) { try { return Math.asin(Double.parseDouble(String.valueOf(val).trim())); } catch (Exception e) { return 0; } }
    public static double acos(Object val) { try { return Math.acos(Double.parseDouble(String.valueOf(val).trim())); } catch (Exception e) { return 0; } }
    public static double atan(Object val) { try { return Math.atan(Double.parseDouble(String.valueOf(val).trim())); } catch (Exception e) { return 0; } }

    // FUNCTION MEDIAN
    public static BigDecimal median(Object... values) {
        BigDecimal[] arr = new BigDecimal[values.length];
        for (int i = 0; i < values.length; i++) arr[i] = new BigDecimal(String.valueOf(values[i]).trim());
        java.util.Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 1) return arr[n / 2];
        return arr[n / 2 - 1].add(arr[n / 2]).divide(new BigDecimal("2"), 18, java.math.RoundingMode.HALF_UP);
    }

    // FUNCTION MIDRANGE
    public static BigDecimal midrange(Object... values) {
        BigDecimal mn = new BigDecimal(String.valueOf(values[0]).trim());
        BigDecimal mx = mn;
        for (Object v : values) {
            BigDecimal b = new BigDecimal(String.valueOf(v).trim());
            if (b.compareTo(mn) < 0) mn = b;
            if (b.compareTo(mx) > 0) mx = b;
        }
        return mn.add(mx).divide(new BigDecimal("2"), 18, java.math.RoundingMode.HALF_UP);
    }

    // FUNCTION RANDOM
    public static double random(Object... args) {
        return Math.random();
    }

    // FUNCTION STORED-CHAR-LENGTH / BYTE-LENGTH
    public static int stored_char_length(Object val) { return String.valueOf(val).length(); }
    public static int byte_length(Object val) { return String.valueOf(val).getBytes().length; }

    // FUNCTION SUBSTITUTE / SUBSTITUTE-CASE
    public static String substitute(Object val, Object... pairs) {
        String s = String.valueOf(val);
        for (int i = 0; i + 1 < pairs.length; i += 2) {
            s = s.replace(String.valueOf(pairs[i]), String.valueOf(pairs[i + 1]));
        }
        return s;
    }
    public static String substitute_case(Object val, Object... pairs) { return substitute(val, pairs); }

    // FUNCTION NATIONAL-OF / DISPLAY-OF (identity for now)
    public static String national_of(Object val) { return String.valueOf(val); }
    public static String display_of(Object val) { return String.valueOf(val); }

    // FUNCTION FORMATTED-DATETIME / FORMATTED-DATE / FORMATTED-TIME
    public static String formatted_datetime(Object pattern, Object... args) { return current_date(); }
    public static String formatted_date(Object pattern, Object... args) { return current_date().substring(0, 8); }
    public static String formatted_time(Object pattern, Object... args) { return current_date().substring(8, 14); }

    // FUNCTION TEST-NUMVAL / TEST-NUMVAL-C / TEST-NUMVAL-F
    public static int test_numval(Object val) { try { new BigDecimal(String.valueOf(val).trim()); return 0; } catch (Exception e) { return 1; } }
    public static int test_numval_c(Object val) { return test_numval(val); }
    public static int test_numval_f(Object val) { return test_numval(val); }

    // FUNCTION COMBINED-DATETIME
    public static int combined_datetime(int date, int time) { return date * 1000000 + time; }

    // FUNCTION SECONDS-FROM-FORMATTED-TIME
    public static int seconds_from_formatted_time(Object format, Object time) { return 0; }

    // FUNCTION LOCALE-DATE / LOCALE-TIME
    public static String locale_date(Object date) { return String.valueOf(date); }
    public static String locale_time(Object time) { return String.valueOf(time); }

    // FUNCTION PRESENT-VALUE / ANNUITY
    public static double present_value(double rate, double... amounts) {
        double pv = 0; double factor = 1;
        for (double a : amounts) { factor /= (1 + rate); pv += a * factor; }
        return pv;
    }
    public static double annuity(double rate, int periods) {
        if (rate == 0) return 1.0 / periods;
        return rate / (1 - Math.pow(1 + rate, -periods));
    }

    // FUNCTION EXCEPTION-STATUS / EXCEPTION-LOCATION / EXCEPTION-STATEMENT / EXCEPTION-FILE
    public static String exception_status() { return ""; }
    public static String exception_location() { return ""; }
    public static String exception_statement() { return ""; }
    public static String exception_file() { return ""; }

    // FUNCTION REM (remainder)
    public static int rem(int a, int b) { return a % b; }
    public static int rem(Object a, Object b) {
        return Integer.parseInt(String.valueOf(a).trim()) % Integer.parseInt(String.valueOf(b).trim());
    }

    // FUNCTION INTEGER-OF-FORMATTED-DATE
    public static int integer_of_formatted_date(Object format, Object dateStr) {
        try {
            String fmt = String.valueOf(format).trim();
            String date = String.valueOf(dateStr).trim();
            // Try common COBOL date formats
            java.time.format.DateTimeFormatter dtf;
            if (fmt.contains("YYYY") && fmt.contains("MM") && fmt.contains("DD")) {
                dtf = java.time.format.DateTimeFormatter.ofPattern(fmt.replace("YYYY", "yyyy").replace("DD", "dd"));
            } else {
                dtf = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
            }
            java.time.LocalDate d = java.time.LocalDate.parse(date, dtf);
            return (int) d.toEpochDay();
        } catch (Exception e) { return 0; }
    }

    // Sign check functions
    public static boolean isPositive(Object val) {
        try { return Double.parseDouble(String.valueOf(val).trim()) > 0; }
        catch (Exception e) { return false; }
    }
    public static boolean isNegative(Object val) {
        try { return Double.parseDouble(String.valueOf(val).trim()) < 0; }
        catch (Exception e) { return false; }
    }
    public static boolean isZero(Object val) {
        try { return Double.parseDouble(String.valueOf(val).trim()) == 0; }
        catch (Exception e) { return false; }
    }

    // MODULE-ID / MODULE-SOURCE
    public static String module_id() { return ""; }
    public static String module_source() { return ""; }
    public static String module_path() { return ""; }
    public static String module_caller_id() { return ""; }

    // Overloaded MOD for Object
    public static int mod(Object a, Object b) {
        return Integer.parseInt(String.valueOf(a).trim()) % Integer.parseInt(String.valueOf(b).trim());
    }

    // MAX/MIN for strings — use distinct names to avoid ambiguity with int... versions
    public static String maxStr(Object... values) {
        String m = String.valueOf(values[0]);
        for (Object v : values) { String s = String.valueOf(v); if (s.compareTo(m) > 0) m = s; }
        return m;
    }
    public static String minStr(Object... values) {
        String m = String.valueOf(values[0]);
        for (Object v : values) { String s = String.valueOf(v); if (s.compareTo(m) < 0) m = s; }
        return m;
    }

    // FUNCTION BIT-OF — convert value to binary string representation
    public static String bit_of(Object val) {
        String s = String.valueOf(val).trim();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            String bits = Integer.toBinaryString(c);
            while (bits.length() < 8) bits = "0" + bits;
            sb.append(bits);
        }
        return sb.toString();
    }

    // FUNCTION BIT-TO-CHAR — binary string to character string
    public static String bit_to_char(Object val) {
        String bits = String.valueOf(val).trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i + 7 < bits.length(); i += 8) {
            int ch = Integer.parseInt(bits.substring(i, i + 8), 2);
            sb.append((char) ch);
        }
        return sb.toString();
    }

    // FUNCTION HEX-OF — convert value to hexadecimal string
    public static String hex_of(Object val) {
        String s = String.valueOf(val).trim();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            String hex = Integer.toHexString(c).toUpperCase();
            if (hex.length() < 2) sb.append('0');
            sb.append(hex);
        }
        return sb.toString();
    }

    // FUNCTION HEX-TO-CHAR — hex string to character string
    public static String hex_to_char(Object val) {
        String hex = String.valueOf(val).trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i + 1 < hex.length(); i += 2) {
            int ch = Integer.parseInt(hex.substring(i, i + 2), 16);
            sb.append((char) ch);
        }
        return sb.toString();
    }

    // FUNCTION CONTENT-LENGTH — length of content at pointer (stub for COBOL pointer semantics)
    public static int content_length(Object val) {
        return String.valueOf(val).length();
    }

    // FUNCTION CONTENT-OF — content at pointer (stub)
    public static String content_of(Object val) {
        return String.valueOf(val);
    }
    public static String content_of(Object val, int length) {
        String s = String.valueOf(val);
        return s.length() > length ? s.substring(0, length) : s;
    }

    // FUNCTION FORMATTED-CURRENT-DATE
    public static String formatted_current_date(Object pattern) {
        try {
            String fmt = String.valueOf(pattern).trim();
            fmt = fmt.replace("YYYY", "yyyy").replace("DD", "dd").replace("hh", "HH");
            return LocalDateTime.now().format(DateTimeFormatter.ofPattern(fmt));
        } catch (Exception e) { return current_date(); }
    }

    // FUNCTION TEST-FORMATTED-DATETIME
    public static int test_formatted_datetime(Object format, Object dateTimeStr) {
        try {
            String fmt = String.valueOf(format).trim()
                .replace("YYYY", "yyyy").replace("DD", "dd").replace("hh", "HH");
            String dt = String.valueOf(dateTimeStr).trim();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(fmt);
            java.time.LocalDateTime.parse(dt, dtf);
            return 0; // valid
        } catch (Exception e) { return 1; } // invalid
    }

    // FUNCTION LOCALE-COMPARE
    public static int locale_compare(Object a, Object b) {
        return String.valueOf(a).compareTo(String.valueOf(b));
    }

    // FUNCTION LOWEST-ALGEBRAIC — lowest possible value for a type
    public static Object lowest_algebraic(Object val) {
        if (val instanceof Integer) return Integer.MIN_VALUE;
        if (val instanceof Short) return Short.MIN_VALUE;
        if (val instanceof Long) return Long.MIN_VALUE;
        if (val instanceof BigDecimal) return new BigDecimal("-9999999999999999999");
        if (val instanceof Double) return -Double.MAX_VALUE;
        if (val instanceof Float) return -Float.MAX_VALUE;
        // CobolString: return all '0' or spaces
        return "";
    }

    // FUNCTION HIGHEST-ALGEBRAIC — highest possible value for a type
    public static Object highest_algebraic(Object val) {
        if (val instanceof Integer) return Integer.MAX_VALUE;
        if (val instanceof Short) return Short.MAX_VALUE;
        if (val instanceof Long) return Long.MAX_VALUE;
        if (val instanceof BigDecimal) return new BigDecimal("9999999999999999999");
        if (val instanceof Double) return Double.MAX_VALUE;
        if (val instanceof Float) return Float.MAX_VALUE;
        return "";
    }

    // FUNCTION MEAN — statistical mean
    public static BigDecimal mean(Object... values) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Object v : values) sum = sum.add(new BigDecimal(String.valueOf(v).trim()));
        return sum.divide(new BigDecimal(values.length), 18, java.math.RoundingMode.HALF_UP);
    }

    // FUNCTION NUMVAL-F — numeric value floating-point
    public static BigDecimal numval_f(Object val) {
        try {
            String s = String.valueOf(val).trim().replaceAll("[,$]", "");
            // Handle COBOL E-notation
            return new BigDecimal(s);
        } catch (Exception e) { return BigDecimal.ZERO; }
    }

    // FUNCTION ORD-MAX — position (1-based) of the maximum argument
    public static int ord_max(Object... values) {
        int maxIdx = 0;
        String maxVal = String.valueOf(values[0]).trim();
        for (int i = 1; i < values.length; i++) {
            String s = String.valueOf(values[i]).trim();
            try {
                if (new BigDecimal(s).compareTo(new BigDecimal(maxVal)) > 0) { maxVal = s; maxIdx = i; }
            } catch (Exception e) {
                if (s.compareTo(maxVal) > 0) { maxVal = s; maxIdx = i; }
            }
        }
        return maxIdx + 1;
    }

    // FUNCTION ORD-MIN — position (1-based) of the minimum argument
    public static int ord_min(Object... values) {
        int minIdx = 0;
        String minVal = String.valueOf(values[0]).trim();
        for (int i = 1; i < values.length; i++) {
            String s = String.valueOf(values[i]).trim();
            try {
                if (new BigDecimal(s).compareTo(new BigDecimal(minVal)) < 0) { minVal = s; minIdx = i; }
            } catch (Exception e) {
                if (s.compareTo(minVal) < 0) { minVal = s; minIdx = i; }
            }
        }
        return minIdx + 1;
    }

    // FUNCTION TEST-DATE-YYYYMMDD — validate a date in YYYYMMDD format
    public static int test_date_yyyymmdd(int date) {
        try {
            int y = date / 10000, m = (date / 100) % 100, d = date % 100;
            java.time.LocalDate.of(y, m, d);
            return 0; // valid
        } catch (Exception e) { return 1; } // invalid
    }

    // FUNCTION TEST-DAY-YYYYDDD — validate a day in YYYYDDD format
    public static int test_day_yyyyddd(int yyyyddd) {
        try {
            int y = yyyyddd / 1000, doy = yyyyddd % 1000;
            java.time.LocalDate.ofYearDay(y, doy);
            return 0;
        } catch (Exception e) { return 1; }
    }

    // FUNCTION VARIANCE — statistical variance
    public static BigDecimal variance(Object... values) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Object v : values) sum = sum.add(new BigDecimal(String.valueOf(v).trim()));
        BigDecimal mean = sum.divide(new BigDecimal(values.length), 18, java.math.RoundingMode.HALF_UP);
        BigDecimal sumSq = BigDecimal.ZERO;
        for (Object v : values) {
            BigDecimal diff = new BigDecimal(String.valueOf(v).trim()).subtract(mean);
            sumSq = sumSq.add(diff.multiply(diff));
        }
        return sumSq.divide(new BigDecimal(values.length), 18, java.math.RoundingMode.HALF_UP);
    }

    // FUNCTION STANDARD-DEVIATION
    public static double standard_deviation(Object... values) {
        return Math.sqrt(variance(values).doubleValue());
    }

    // FUNCTION RANGE
    public static BigDecimal range(Object... values) {
        BigDecimal mn = new BigDecimal(String.valueOf(values[0]).trim());
        BigDecimal mx = mn;
        for (Object v : values) {
            BigDecimal b = new BigDecimal(String.valueOf(v).trim());
            if (b.compareTo(mn) < 0) mn = b;
            if (b.compareTo(mx) > 0) mx = b;
        }
        return mx.subtract(mn);
    }

    // FUNCTION SUM
    public static BigDecimal sum(Object... values) {
        BigDecimal s = BigDecimal.ZERO;
        for (Object v : values) s = s.add(new BigDecimal(String.valueOf(v).trim()));
        return s;
    }

    // FUNCTION E / PI / FACTORIAL
    public static double e() { return Math.E; }
    public static double pi() { return Math.PI; }
    public static long factorial(int n) {
        long r = 1;
        for (int i = 2; i <= n; i++) r *= i;
        return r;
    }

    // FUNCTION DAY-TO-YYYYDDD — convert 2-digit year day to 4-digit year day
    public static int day_to_yyyyddd(int yyyyddd) { return yyyyddd; }
    public static int day_to_yyyyddd(int yyddd, int windowStart) {
        int yy = yyddd / 1000, doy = yyddd % 1000;
        int century = (yy >= windowStart % 100) ? (windowStart / 100) * 100 : ((windowStart / 100) + 1) * 100;
        return (century + yy) * 1000 + doy;
    }
    public static int day_to_yyyyddd(int yyddd, int windowStart, int currentYear) {
        return day_to_yyyyddd(yyddd, windowStart);
    }

    // FUNCTION DATE-TO-YYYYMMDD
    public static int date_to_yyyymmdd(int date) { return date; }
    public static int date_to_yyyymmdd(int yymmdd, int windowStart) {
        int yy = yymmdd / 10000, mmdd = yymmdd % 10000;
        int century = (yy >= windowStart % 100) ? (windowStart / 100) * 100 : ((windowStart / 100) + 1) * 100;
        return (century + yy) * 10000 + mmdd;
    }
    public static int date_to_yyyymmdd(int yymmdd, int windowStart, int currentYear) {
        return date_to_yyyymmdd(yymmdd, windowStart);
    }

    // FUNCTION YEAR-TO-YYYY
    public static int year_to_yyyy(int yy) { return yy < 100 ? 2000 + yy : yy; }
    public static int year_to_yyyy(int yy, int windowStart) {
        int century = (yy >= windowStart % 100) ? (windowStart / 100) * 100 : ((windowStart / 100) + 1) * 100;
        return century + yy;
    }
    public static int year_to_yyyy(int yy, int windowStart, int currentYear) {
        return year_to_yyyy(yy, windowStart);
    }

    // FUNCTION SECONDS-PAST-MIDNIGHT
    public static int seconds_past_midnight() {
        java.time.LocalTime now = java.time.LocalTime.now();
        return now.toSecondOfDay();
    }

    // FUNCTION SECONDS-FROM-FORMATTED-TIME (additional overload)
    public static int seconds_from_formatted_time(Object time) {
        try {
            String t = String.valueOf(time).trim();
            int h = Integer.parseInt(t.substring(0, 2));
            int m = Integer.parseInt(t.substring(2, 4));
            int s = Integer.parseInt(t.substring(4, 6));
            return h * 3600 + m * 60 + s;
        } catch (Exception e) { return 0; }
    }

    // FUNCTION CHAR — overload accepting Object for BigDecimal etc.
    public static String char_(Object ordinal) {
        try {
            int ord = new BigDecimal(String.valueOf(ordinal).trim()).intValue();
            return String.valueOf((char) (ord - 1));
        } catch (Exception e) { return " "; }
    }

    // FUNCTION SIGN — returns -1, 0, or 1
    public static int sign(Object val) {
        try {
            double d = Double.parseDouble(String.valueOf(val).trim());
            return d > 0 ? 1 : (d < 0 ? -1 : 0);
        } catch (Exception e) { return 0; }
    }
    public static int sign(double val) { return val > 0 ? 1 : (val < 0 ? -1 : 0); }
    public static int sign(int val) { return val > 0 ? 1 : (val < 0 ? -1 : 0); }

    // FUNCTION EXP — e^x
    public static double exp(Object val) {
        try { return Math.exp(Double.parseDouble(String.valueOf(val).trim())); }
        catch (Exception e) { return 0; }
    }
    public static double exp(double val) { return Math.exp(val); }
    public static double exp(int val) { return Math.exp(val); }

    // FUNCTION EXP10 — 10^x
    public static double exp10(Object val) {
        try { return Math.pow(10, Double.parseDouble(String.valueOf(val).trim())); }
        catch (Exception e) { return 0; }
    }
    public static double exp10(double val) { return Math.pow(10, val); }
    public static double exp10(int val) { return Math.pow(10, val); }

    // FUNCTION FRACTION-PART — fractional part of a number
    public static double fraction_part(Object val) {
        try {
            double d = Double.parseDouble(String.valueOf(val).trim());
            return d - (int) d;
        } catch (Exception e) { return 0; }
    }

    // FUNCTION LOCALE-TIME-FROM-SECONDS
    public static String locale_time_from_seconds(Object seconds) {
        try {
            int secs = (int) Double.parseDouble(String.valueOf(seconds).trim());
            int h = secs / 3600, m = (secs % 3600) / 60, s = secs % 60;
            return String.format("%02d%02d%02d", h, m, s);
        } catch (Exception e) { return "000000"; }
    }

    // FUNCTION MODULE-DATE / MODULE-FORMATTED-DATE / MODULE-TIME
    public static int module_date() {
        java.time.LocalDate d = java.time.LocalDate.now();
        return d.getYear() * 10000 + d.getMonthValue() * 100 + d.getDayOfMonth();
    }
    public static String module_formatted_date() {
        return String.valueOf(module_date());
    }
    public static int module_time() {
        java.time.LocalTime t = java.time.LocalTime.now();
        return t.getHour() * 10000 + t.getMinute() * 100 + t.getSecond();
    }

    // FUNCTION MONETARY-DECIMAL-POINT / MONETARY-THOUSANDS-SEPARATOR
    public static String monetary_decimal_point() { return "."; }
    public static String monetary_thousands_separator() { return ","; }

    // FUNCTION NUMERIC-DECIMAL-POINT / NUMERIC-THOUSANDS-SEPARATOR
    public static String numeric_decimal_point() { return "."; }
    public static String numeric_thousands_separator() { return ","; }

    // FUNCTION CURRENCY-SYMBOL
    public static String currency_symbol() { return "$"; }

    // FUNCTION NUMVAL — additional overloads
    public static BigDecimal numval(Object val, Object mode) {
        return numval(val);
    }

    // FUNCTION NUMVAL-C — additional overloads
    public static BigDecimal numval_c(Object val, Object currency) {
        String s = String.valueOf(val).trim()
            .replace(String.valueOf(currency).trim(), "")
            .replaceAll("[,]", "").replaceAll("[()]", "-");
        try { return new BigDecimal(s.trim()); } catch (Exception e) { return BigDecimal.ZERO; }
    }

    // FUNCTION COMBINED-DATETIME — overloads for various types
    public static double combined_datetime(Object date, Object time) {
        try {
            double d = Double.parseDouble(String.valueOf(date).trim());
            double t = Double.parseDouble(String.valueOf(time).trim());
            return d * 1000000 + t;
        } catch (Exception e) { return 0; }
    }

    // FUNCTION MAX/MIN — overloads for BigDecimal and Object types
    public static BigDecimal max(BigDecimal... values) {
        BigDecimal m = values[0];
        for (BigDecimal v : values) if (v.compareTo(m) > 0) m = v;
        return m;
    }
    public static BigDecimal min(BigDecimal... values) {
        BigDecimal m = values[0];
        for (BigDecimal v : values) if (v.compareTo(m) < 0) m = v;
        return m;
    }
    public static double max(double... values) {
        double m = values[0];
        for (double v : values) if (v > m) m = v;
        return m;
    }
    public static double min(double... values) {
        double m = values[0];
        for (double v : values) if (v < m) m = v;
        return m;
    }

    // FUNCTION LENGTH — overloads
    public static int length(String val) { return val.length(); }
    public static int length(CobolString val) { return val.length(); }

    // FUNCTION PI — no-arg already exists but ensure callable as pi(0) too
    public static double pi(Object... args) { return Math.PI; }
}
