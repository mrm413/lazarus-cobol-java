package com.lazarus.cobol;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * COBOL intrinsic functions and type-checking utilities.
 */
public class CobolIntrinsics {

    /**
     * PERFORM UNTIL guard — wraps the UNTIL condition so javac does not
     * constant-fold the while loop to {@code while(true)}, which would make
     * subsequent statements unreachable. The method is intentionally
     * non-final so the compiler cannot inline it.
     */
    public static boolean performUntil(boolean condition) {
        return condition;
    }

    // FUNCTION CURRENT-DATE
    public static String current_date() {
        // COBOL FUNCTION CURRENT-DATE returns 21 chars: YYYYMMDDHHMMSScc±HHMM
        // cc = centiseconds (1/100th second), ±HHMM = timezone offset
        java.time.ZonedDateTime now = java.time.ZonedDateTime.now();
        String datePart = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        int centiseconds = now.getNano() / 10_000_000; // nano → centiseconds
        int offsetMinutes = now.getOffset().getTotalSeconds() / 60;
        String sign = offsetMinutes >= 0 ? "+" : "-";
        int absOff = Math.abs(offsetMinutes);
        return String.format("%s%02d%s%02d%02d", datePart, centiseconds, sign, absOff / 60, absOff % 60);
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

    // GnuCOBOL compares FLOAT-SHORT values with 1-ULP tolerance.
    // Two adjacent float32 bit patterns (differing by 1 ULP) are considered equal.
    public static boolean floatEqUlp1(float a, float b) {
        if (a == b) return true;  // exact equality, handles ±0, ±Inf
        int ai = Float.floatToRawIntBits(a);
        int bi = Float.floatToRawIntBits(b);
        if (((ai ^ bi) & Integer.MIN_VALUE) != 0) return false;  // different signs
        return Math.abs(ai - bi) <= 1;
    }

    // Unsigned long → BigDecimal: treats the bit pattern as unsigned 64-bit
    // Needed because Java long is signed but COBOL PIC 9(18) COMP can hold 0..2^64-1
    public static BigDecimal toBigDecimalUnsigned(long val) {
        if (val >= 0) return new BigDecimal(val);
        return new BigDecimal(Long.toUnsignedString(val));
    }

    // Safe BigDecimal conversion — handles empty/space strings, non-numeric gracefully
    public static BigDecimal toBigDecimal(Object val) {
        if (val == null) return BigDecimal.ZERO;
        if (val instanceof BigDecimal) return (BigDecimal) val;
        if (val instanceof Integer) return new BigDecimal((Integer) val);
        if (val instanceof Long) return new BigDecimal((Long) val);
        if (val instanceof Double) return BigDecimal.valueOf((Double) val);
        String s = String.valueOf(val).trim();
        if (s.isEmpty()) return BigDecimal.ZERO;
        try {
            return new BigDecimal(s);
        } catch (NumberFormatException e) {
            // Handle SIGN TRAILING SEPARATE format: "22-", "22+", digits with trailing sign
            if (s.length() > 1) {
                char lastCh = s.charAt(s.length() - 1);
                if (lastCh == '-' || lastCh == '+') {
                    String digits = s.substring(0, s.length() - 1);
                    try {
                        BigDecimal bd = new BigDecimal(digits);
                        return lastCh == '-' ? bd.negate() : bd;
                    } catch (NumberFormatException e2) { /* fall through */ }
                }
            }
            return BigDecimal.ZERO;
        }
    }

    /**
     * Truncate a value to fit in a P-field (scaling position field).
     * Right scaling (PIC 99PPP, scalingLeft=false): value must be multiple of 10^sp,
     *   with at most totalDigits significant digits above the scaling.
     * Left scaling (PIC PPP99, scalingLeft=true): value must have digits only in the
     *   stored positions (last totalDigits of the fractional part at depth sp+td).
     */
    public static BigDecimal truncateToScaledField(BigDecimal value, int totalDigits, int scalingPositions, boolean scalingLeft) {
        if (scalingPositions <= 0) return value;
        boolean neg = value.signum() < 0;
        BigDecimal abs = value.abs();
        BigDecimal result;
        if (!scalingLeft) {
            // Right scaling (PIC 99PPP): truncate to multiples of 10^sp
            BigDecimal divisor = BigDecimal.TEN.pow(scalingPositions);
            BigDecimal stored = abs.divideToIntegralValue(divisor);
            // High-order truncation: keep only last totalDigits
            BigDecimal modulo = new BigDecimal(BigInteger.TEN.pow(totalDigits));
            stored = stored.remainder(modulo).abs();
            result = stored.multiply(divisor);
        } else {
            // Left scaling (PIC PPP99): keep only the stored digit positions
            int shift = scalingPositions + totalDigits;
            BigDecimal shifted = abs.movePointRight(shift);
            BigInteger intPart = shifted.toBigInteger();
            BigInteger modulo = BigInteger.TEN.pow(totalDigits);
            intPart = intPart.mod(modulo);
            result = new BigDecimal(intPart).movePointLeft(shift);
        }
        return neg ? result.negate() : result;
    }

    /**
     * Truncate a BigDecimal value to fit in a COBOL numeric field.
     * COBOL truncates high-order integer digits when the value exceeds the PIC capacity.
     * For PIC S99V99 (intDigits=2, decDigits=2), value 200.00 → 00.00
     */
    public static BigDecimal truncateToField(BigDecimal value, int totalDigits, int decimalDigits) {
        return truncateToField(value, totalDigits, decimalDigits, true);
    }
    public static BigDecimal truncateToField(BigDecimal value, int totalDigits, int decimalDigits, boolean signed) {
        return truncateToField(value, totalDigits, decimalDigits, signed, java.math.RoundingMode.DOWN);
    }
    public static BigDecimal truncateToField(BigDecimal value, int totalDigits, int decimalDigits, boolean signed, java.math.RoundingMode rm) {
        boolean neg = value.signum() < 0;
        // Round on the signed value first so directional modes (CEILING/FLOOR) work correctly
        // for negative values. E.g. TOWARD-GREATER on -2.99 should give -2.99, not -3.00.
        BigDecimal rounded = value.setScale(decimalDigits, rm);
        BigDecimal abs = rounded.abs();
        int intDigits = totalDigits - decimalDigits;
        if (intDigits > 0 && intDigits < 18) {
            BigDecimal modulo = BigDecimal.TEN.pow(intDigits);
            BigDecimal intPart = abs.setScale(0, java.math.RoundingMode.DOWN);
            BigDecimal fracPart = abs.subtract(intPart);
            intPart = intPart.remainder(modulo).abs();
            abs = intPart.add(fracPart);
        }
        // Unsigned field: drop the sign
        if (!signed) return abs;
        return neg ? abs.negate() : abs;
    }

    /**
     * Truncate an integer value to fit in a COBOL PIC with totalDigits digits.
     * COBOL high-order truncation: MOVE 200 TO PIC 99 → 0 (200 % 100 = 0).
     * Preserves sign.
     */
    public static long truncateInt(long value, int totalDigits) {
        if (totalDigits <= 0 || totalDigits >= 18) return value;
        long modulo = 1;
        for (int i = 0; i < totalDigits; i++) modulo *= 10;
        long abs = Math.abs(value) % modulo;
        return value < 0 ? -abs : abs;
    }

    /**
     * Truncate a BigDecimal to a COBOL integer field with `totalDigits` digits.
     * COBOL semantics drop high-order DECIMAL digits when the value exceeds
     * PIC capacity — NOT high-order BINARY bits as `BigDecimal.longValue()`
     * does. For 38-digit values, .longValue() gives bogus low-bit results
     * (e.g. for P-938 = 12345...678, longValue % 100 ≠ 78).
     *
     * Does decimal modulo against the integer part, then narrows to long.
     * Result fits safely in long when totalDigits ≤ 18.
     */
    public static long truncateBigDecimalInt(java.math.BigDecimal value, int totalDigits) {
        if (value == null) return 0L;
        if (totalDigits <= 0) return 0L;
        if (totalDigits >= 19) return value.toBigInteger().longValue();
        boolean neg = value.signum() < 0;
        java.math.BigInteger intPart = value.toBigInteger().abs();
        java.math.BigInteger modulo = java.math.BigInteger.TEN.pow(totalDigits);
        long result = intPart.mod(modulo).longValueExact();
        return neg ? -result : result;
    }

    // FUNCTION NUMVAL
    public static BigDecimal numval(Object val) {
        String s = String.valueOf(val).trim();
        // Handle CR/DB suffix (debit = negative) — case-insensitive
        boolean neg = false;
        String upper = s.toUpperCase();
        if (upper.endsWith("CR") || upper.endsWith("DB")) {
            neg = true;
            s = s.substring(0, s.length() - 2).trim();
        }
        // Handle leading/trailing sign
        if (s.endsWith("-")) { neg = !neg; s = s.substring(0, s.length() - 1).trim(); }
        else if (s.endsWith("+")) { s = s.substring(0, s.length() - 1).trim(); }
        if (s.startsWith("-")) { neg = !neg; s = s.substring(1).trim(); }
        else if (s.startsWith("+")) { s = s.substring(1).trim(); }
        // Remove internal spaces
        s = s.replaceAll("\\s+", "");
        // GnuCOBOL libcob is lenient — silently strip currency/percent symbols.
        // (Strictly NUMVAL does not handle these; libcob does, so we match.)
        s = s.replace("$", "").replace("%", "").replace("£", "").replace("€", "").replace("¥", "");
        // Under DECIMAL-POINT IS COMMA: comma is decimal, dot is thousands separator.
        // Otherwise: comma is thousands separator, dot is decimal.
        if (CobolDisplay.isDecimalPointIsComma()) {
            s = s.replace(".", "");      // strip thousands
            s = s.replace(",", ".");     // comma → decimal
        } else {
            s = s.replace(",", "");      // strip thousands
        }
        if (s.isEmpty()) return BigDecimal.ZERO;
        try {
            BigDecimal bd = new BigDecimal(s);
            return neg ? bd.negate() : bd;
        } catch (Exception e) { return BigDecimal.ZERO; }
    }

    // FUNCTION MOD
    public static int mod(int a, int b) {
        // COBOL MOD: a - (INTEGER(a/b) * b), where INTEGER = floor
        return Math.floorMod(a, b);
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
    public static double max(Object... values) {
        double m = Double.NEGATIVE_INFINITY;
        for (Object v : values) {
            double d = toBigDecimal(v).doubleValue();
            if (d > m) m = d;
        }
        return m;
    }

    // FUNCTION MIN
    public static double min(Object... values) {
        double m = Double.POSITIVE_INFINITY;
        for (Object v : values) {
            double d = toBigDecimal(v).doubleValue();
            if (d < m) m = d;
        }
        return m;
    }

    // FUNCTION CONCATENATE
    public static String concatenate(Object... parts) {
        StringBuilder sb = new StringBuilder();
        for (Object p : parts) sb.append(String.valueOf(p));
        return sb.toString();
    }

    // ── ENVIRONMENT VARIABLE HANDLING ───────────────────────

    /** Current environment variable name for DISPLAY UPON ENVIRONMENT-NAME / ACCEPT FROM ENVIRONMENT-VALUE */
    private static final ThreadLocal<String> _currentEnvName = ThreadLocal.withInitial(() -> "");

    // ── COMMAND-LINE ARGUMENT HANDLING ──────────────────────

    /** Command-line arguments passed to the program */
    private static String[] _commandLineArgs = new String[0];
    /** Current argument number index (1-based) for ACCEPT FROM ARGUMENT-VALUE */
    private static final ThreadLocal<Integer> _currentArgNumber = ThreadLocal.withInitial(() -> 1);

    /** Store command-line arguments (called from generated main()) */
    public static void setCommandLineArgs(String[] args) {
        _commandLineArgs = args != null ? args : new String[0];
    }

    /** DISPLAY value UPON ARGUMENT-NUMBER — sets the current argument index */
    public static void setArgumentNumber(String value) {
        try {
            _currentArgNumber.set(Integer.parseInt(value.trim()));
        } catch (NumberFormatException e) {
            _currentArgNumber.set(0);
        }
    }

    /** ACCEPT FROM ARGUMENT-VALUE — returns the argument at the current index */
    public static String getArgumentValue() {
        int idx = _currentArgNumber.get();
        if (idx >= 1 && idx <= _commandLineArgs.length) {
            return _commandLineArgs[idx - 1]; // 1-based to 0-based
        }
        return "";
    }

    /** ACCEPT FROM ARGUMENT-NUMBER — returns the number of command-line arguments */
    public static String getArgumentNumber() {
        return String.valueOf(_commandLineArgs.length);
    }

    /** DISPLAY value UPON ENVIRONMENT-NAME — stores the environment variable name to query/set */
    public static void setEnvironmentName(String name) {
        _currentEnvName.set(name != null ? name.trim() : "");
    }

    /** DISPLAY value UPON ENVIRONMENT-VALUE — sets the environment variable to the given value */
    public static void setEnvironmentValue(String value) {
        String name = _currentEnvName.get();
        if (name != null && !name.isEmpty()) {
            System.setProperty(name, value != null ? value.trim() : "");
        }
    }

    /** ACCEPT var FROM ENVIRONMENT-VALUE — retrieves the value of the stored environment variable */
    public static String getEnvironmentValue() {
        String name = _currentEnvName.get();
        if (name == null || name.isEmpty()) return "";
        // Try system property first, then environment variable
        String val = System.getProperty(name);
        if (val == null) val = System.getenv(name);
        if (val == null) val = "";
        return val;
    }

    // ACCEPT FROM
    public static String acceptFrom(String source) {
        switch (source.toUpperCase()) {
            case "DATE": return current_date().substring(2, 8);  // YYMMDD (6 digits)
            case "DATE YYYYMMDD": return current_date().substring(0, 8);  // YYYYMMDD (8 digits)
            case "DAY": {  // YYDDD (5 digits)
                java.time.LocalDate today = java.time.LocalDate.now();
                return String.format("%02d%03d", today.getYear() % 100, today.getDayOfYear());
            }
            case "DAY YYYYDDD": {  // YYYYDDD (7 digits)
                java.time.LocalDate today = java.time.LocalDate.now();
                return String.format("%04d%03d", today.getYear(), today.getDayOfYear());
            }
            case "TIME": return current_date().substring(8, 16);  // HHMMSScc (8 digits)
            case "DAY-OF-WEEK": return String.valueOf(java.time.LocalDate.now().getDayOfWeek().getValue());
            case "ENVIRONMENT-VALUE": case "ENVIRONMENT VALUE": return getEnvironmentValue();
            case "ARGUMENT-VALUE": case "ARGUMENT VALUE": return getArgumentValue();
            case "ARGUMENT-NUMBER": case "ARGUMENT NUMBER": return getArgumentNumber();
            default: return "";
        }
    }

    // Class condition checks
    public static boolean isNumeric(Object val) {
        try { new BigDecimal(String.valueOf(val).trim()); return true; }
        catch (Exception e) { return false; }
    }

    /** IS NUMERIC for a PACKED-DECIMAL / COMP-3 / COMP-6 field laid over
     *  alphanumeric bytes (REDEFINES). Reads the parent's bytes and validates
     *  that every digit nibble is 0–9 and that any leading PAD nibble plus the
     *  trailing sign nibble (PACKED only) match the storage class.
     *
     *  PACKED-DECIMAL / COMP-3 layout (totalDigits + 1 sign nibble):
     *    bytes = (totalDigits + 2) / 2
     *    leading pad nibble present iff totalDigits is even
     *    sign nibble (low nibble of last byte):
     *      unsigned PIC 999: must be 0xF
     *      signed   PIC S999: must be 0xC (positive) or 0xD (negative)
     *
     *  COMP-6 layout (totalDigits, no sign):
     *    bytes = (totalDigits + 1) / 2
     *    leading pad nibble present iff totalDigits is odd
     */
    public static boolean isNumericPacked(Object src, int totalDigits, boolean signed, boolean isComp6) {
        if (src == null || totalDigits <= 0) return false;
        byte[] bytes;
        if (src instanceof CobolString) bytes = ((CobolString) src).getBytes();
        else {
            String s = String.valueOf(src);
            bytes = new byte[s.length()];
            for (int i = 0; i < s.length(); i++) bytes[i] = (byte) s.charAt(i);
        }
        int totalNibbles, byteLen;
        boolean hasPad;
        if (isComp6) {
            totalNibbles = totalDigits;
            byteLen = (totalDigits + 1) / 2;
            hasPad = (totalDigits & 1) == 1;
        } else {
            totalNibbles = totalDigits + 1; // digits + sign nibble
            byteLen = (totalNibbles + 1) / 2;
            hasPad = (totalDigits & 1) == 0; // pad iff (digits+1) is odd, i.e. digits is even
        }
        if (bytes.length < byteLen) return false;
        // Walk nibbles MSB-first; the layout is right-aligned within byteLen bytes.
        int padNibbles = hasPad ? 1 : 0;
        int totalNibblesIncludingPad = padNibbles + totalNibbles;
        // Sanity: totalNibblesIncludingPad must equal byteLen*2.
        if (totalNibblesIncludingPad != byteLen * 2) return false;
        for (int i = 0; i < totalNibblesIncludingPad; i++) {
            int byteIdx = i / 2;
            int b = bytes[byteIdx] & 0xFF;
            int nibble = ((i & 1) == 0) ? (b >> 4) & 0xF : b & 0xF;
            if (i < padNibbles) {
                // PAD nibble: GnuCOBOL ignores its content (treats it as undefined storage).
                continue;
            }
            int posWithinDigits = i - padNibbles;
            if (!isComp6 && posWithinDigits == totalDigits) {
                // Sign nibble (last)
                if (signed) {
                    if (nibble != 0xC && nibble != 0xD) return false;
                } else {
                    if (nibble != 0xF) return false;
                }
            } else {
                if (nibble > 9) return false;
            }
        }
        return true;
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

    // COBOL epoch: Jan 1, 1601 = day 1
    private static final long COBOL_EPOCH_OFFSET = java.time.LocalDate.of(1601, 1, 1).toEpochDay();

    // FUNCTION INTEGER-OF-DATE
    public static int integer_of_date(int date) {
        int y = date / 10000, m = (date / 100) % 100, d = date % 100;
        return (int) (java.time.LocalDate.of(y, m, d).toEpochDay() - COBOL_EPOCH_OFFSET + 1);
    }

    // FUNCTION DATE-OF-INTEGER
    public static int date_of_integer(int days) {
        java.time.LocalDate d = java.time.LocalDate.ofEpochDay(days + COBOL_EPOCH_OFFSET - 1);
        return d.getYear() * 10000 + d.getMonthValue() * 100 + d.getDayOfMonth();
    }

    // FUNCTION INTEGER-OF-DAY
    public static int integer_of_day(int yyyyddd) {
        int y = yyyyddd / 1000, doy = yyyyddd % 1000;
        return (int) (java.time.LocalDate.ofYearDay(y, doy).toEpochDay() - COBOL_EPOCH_OFFSET + 1);
    }

    // FUNCTION DAY-OF-INTEGER
    /** FUNCTION DAY-OF-INTEGER: COBOL integer date (days since 1601-01-01 = day 1)
     *  → YYYYDDD format (year * 1000 + day-of-year). */
    public static int day_of_integer(int days) {
        java.time.LocalDate d = java.time.LocalDate.ofEpochDay(days + COBOL_EPOCH_OFFSET - 1);
        return d.getYear() * 1000 + d.getDayOfYear();
    }

    // FUNCTION NUMVAL-C
    public static BigDecimal numval_c(Object val) { return numval_c(val, "$"); }
    public static BigDecimal numval_c(Object val, Object currency) {
        String s = String.valueOf(val).trim();
        String curr = String.valueOf(currency).trim();
        // Remove currency symbol
        s = s.replace(curr, "");
        // Under DECIMAL-POINT IS COMMA: comma is decimal, dot is thousands separator
        if (CobolDisplay.isDecimalPointIsComma()) {
            s = s.replace(".", "");      // strip thousands
            s = s.replace(",", ".");     // comma → decimal
        } else {
            s = s.replace(",", "");      // strip thousands separators
        }
        // Check for CR/DB (debit = negative)
        boolean neg = false;
        String upper = s.trim().toUpperCase();
        if (upper.endsWith("CR") || upper.endsWith("DB")) {
            neg = true;
            s = s.trim();
            s = s.substring(0, s.length() - 2);
        }
        // Check for parentheses (negative)
        s = s.trim();
        if (s.startsWith("(") && s.endsWith(")")) {
            neg = true;
            s = s.substring(1, s.length() - 1);
        }
        // Check for leading sign
        s = s.trim();
        if (s.startsWith("-")) { neg = !neg; s = s.substring(1); }
        else if (s.startsWith("+")) { s = s.substring(1); }
        s = s.trim();
        // Strip embedded spaces (legal in NUMVAL-C input)
        s = s.replace(" ", "");
        // Strip trailing % if present (NUMVAL-C does NOT include % per spec, but
        // some MF dialects allow it — silently drop)
        if (s.startsWith("%")) s = s.substring(1).trim();
        try {
            BigDecimal bd = new BigDecimal(s);
            return neg ? bd.negate() : bd;
        } catch (Exception e) { return BigDecimal.ZERO; }
    }

    // FUNCTION INTEGER — returns floor(arg). Long, not int, because COBOL
    // callers can pass values up to ~10^18 (a 12-digit PIC like 600851475143
    // divided by 71 = 8462696833 already overflows int).
    public static long integer(Object val) {
        try {
            BigDecimal bd = toBigDecimal(val);
            return bd.setScale(0, java.math.RoundingMode.FLOOR).longValueExact();
        } catch (Exception e) {
            try { return (long) Math.floor(Double.parseDouble(String.valueOf(val).trim())); }
            catch (Exception e2) { return 0L; }
        }
    }
    /** FUNCTION INTEGER overload tolerating extra arguments — emit paths
     *  occasionally pass arithmetic expression terms as separate args; we
     *  treat the first one as the (already-evaluated) value and ignore rest. */
    public static long integer(Object val, Object... extras) {
        return integer(val);
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

    // High-precision (33-digit BigDecimal) replacements for the transcendental
    // intrinsics — matches GnuCOBOL libcob output. Backed by CobolBigMath which
    // does Taylor series at 50-digit working precision then rounds to 33.
    public static BigDecimal sqrt(Object val)  { try { return CobolBigMath.sqrt(toBigDecimal(val));  } catch (Exception e) { return BigDecimal.ZERO; } }
    public static BigDecimal log(Object val)   { try { return CobolBigMath.ln(toBigDecimal(val));    } catch (Exception e) { return BigDecimal.ZERO; } }
    public static BigDecimal log10(Object val) { try { return CobolBigMath.log10(toBigDecimal(val)); } catch (Exception e) { return BigDecimal.ZERO; } }
    public static BigDecimal sin(Object val)   { try { return CobolBigMath.sin(toBigDecimal(val));   } catch (Exception e) { return BigDecimal.ZERO; } }
    public static BigDecimal cos(Object val)   { try { return CobolBigMath.cos(toBigDecimal(val));   } catch (Exception e) { return BigDecimal.ZERO; } }
    public static BigDecimal tan(Object val)   { try { return CobolBigMath.tan(toBigDecimal(val));   } catch (Exception e) { return BigDecimal.ZERO; } }
    public static BigDecimal asin(Object val)  { try { return CobolBigMath.asin(toBigDecimal(val));  } catch (Exception e) { return BigDecimal.ZERO; } }
    public static BigDecimal acos(Object val)  { try { return CobolBigMath.acos(toBigDecimal(val));  } catch (Exception e) { return BigDecimal.ZERO; } }
    public static BigDecimal atan(Object val)  { try { return CobolBigMath.atan(toBigDecimal(val));  } catch (Exception e) { return BigDecimal.ZERO; } }
    public static BigDecimal exp(Object val)   { try { return CobolBigMath.exp(toBigDecimal(val));   } catch (Exception e) { return BigDecimal.ZERO; } }
    public static BigDecimal annuity(Object rate, Object periods) {
        try { return CobolBigMath.annuity(toBigDecimal(rate), toBigDecimal(periods)); }
        catch (Exception e) { return BigDecimal.ZERO; }
    }

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
    /** FUNCTION STORED-CHAR-LENGTH: length excluding trailing spaces (logical content). */
    public static int stored_char_length(Object val) {
        String s = String.valueOf(val);
        int end = s.length();
        while (end > 0 && (s.charAt(end - 1) == ' ' || s.charAt(end - 1) == '\0')) end--;
        return end;
    }
    public static int byte_length(Object val) {
        if (val instanceof CobolString) return ((CobolString) val).length();
        return String.valueOf(val).length();
    }

    // FUNCTION SUBSTITUTE / SUBSTITUTE-CASE
    public static String substitute(Object val, Object... pairs) {
        String s = String.valueOf(val);
        for (int i = 0; i + 1 < pairs.length; i += 2) {
            s = s.replace(String.valueOf(pairs[i]), String.valueOf(pairs[i + 1]));
        }
        return s;
    }
    public static String substitute_case(Object val, Object... pairs) {
        // Case-insensitive SUBSTITUTE — match patterns regardless of case
        String s = String.valueOf(val);
        for (int i = 0; i + 1 < pairs.length; i += 2) {
            String pattern = String.valueOf(pairs[i]);
            String replacement = String.valueOf(pairs[i + 1]);
            // Case-insensitive replace: find each occurrence using lowercase comparison
            StringBuilder result = new StringBuilder();
            String lower = s.toLowerCase();
            String patLower = pattern.toLowerCase();
            int fromIndex = 0;
            while (true) {
                int idx = lower.indexOf(patLower, fromIndex);
                if (idx < 0) { result.append(s.substring(fromIndex)); break; }
                result.append(s, fromIndex, idx);
                result.append(replacement);
                fromIndex = idx + pattern.length();
            }
            s = result.toString();
        }
        return s;
    }

    // FUNCTION NATIONAL-OF / DISPLAY-OF (identity for now)
    public static String national_of(Object val) { return String.valueOf(val); }
    public static String display_of(Object val) { return String.valueOf(val); }

    // FUNCTION FORMATTED-DATETIME
    public static String formatted_datetime(Object pattern, Object... args) {
        String fmt = String.valueOf(pattern).trim();
        try {
            if (args.length >= 2) {
                // args[0] = date integer (COBOL day number), args[1] = time in seconds
                int dateInt = toBigDecimal(args[0]).intValue();
                BigDecimal timeSec = toBigDecimal(args[1]);
                java.time.LocalDate date = java.time.LocalDate.ofEpochDay(dateInt + COBOL_EPOCH_OFFSET - 1);
                int totalSec = timeSec.intValue();
                int frac = timeSec.subtract(new BigDecimal(totalSec)).movePointRight(9).intValue();
                java.time.LocalTime time = java.time.LocalTime.of(totalSec / 3600, (totalSec % 3600) / 60, totalSec % 60, frac);
                java.time.LocalDateTime dt = java.time.LocalDateTime.of(date, time);
                // Handle optional UTC offset
                int offsetMins = args.length >= 3 ? toBigDecimal(args[2]).intValue() : 0;
                return formatCobolDateTime(fmt, dt, offsetMins);
            }
        } catch (Exception e) { /* fall through */ }
        return current_date();
    }

    // FUNCTION FORMATTED-DATE
    public static String formatted_date(Object pattern, Object... args) {
        String fmt = String.valueOf(pattern).trim();
        try {
            if (args.length >= 1) {
                int dateInt = toBigDecimal(args[0]).intValue();
                java.time.LocalDate date = java.time.LocalDate.ofEpochDay(dateInt + COBOL_EPOCH_OFFSET - 1);
                return formatCobolDate(fmt, date);
            }
        } catch (Exception e) { /* fall through */ }
        return current_date().substring(0, 8);
    }

    /**
     * FUNCTION FORMATTED-TIME — converts seconds past midnight to a formatted time string.
     * @param pattern  format string (e.g. "hhmmss", "hh:mm:ss", "hhmmss.ssZ", "hhmmss+hhmm")
     * @param args     args[0] = seconds past midnight (int or BigDecimal), args[1] = optional UTC offset in minutes
     */
    public static String formatted_time(Object pattern, Object... args) {
        String fmt = String.valueOf(pattern);
        if (args.length == 0) return " ";

        // Parse seconds (may be BigDecimal for fractional)
        BigDecimal totalSeconds;
        if (args[0] instanceof BigDecimal) {
            totalSeconds = (BigDecimal) args[0];
        } else {
            totalSeconds = new BigDecimal(String.valueOf(args[0]).trim());
        }

        // Parse optional offset in minutes
        boolean hasOffset = args.length >= 2;
        int offsetMinutes = 0;
        if (hasOffset) {
            offsetMinutes = Integer.parseInt(String.valueOf(args[1]).trim());
            // Validate offset range: must be between -1439 and +1439
            if (offsetMinutes > 1439 || offsetMinutes < -1439) {
                // Raise EC-ARGUMENT-FUNCTION exception
                setException("EC-ARGUMENT-FUNCTION");
                return " ";
            }
        }

        // Determine if format has Z suffix or +hhmm offset display
        boolean hasZ = fmt.contains("Z");
        boolean hasOffsetDisplay = fmt.contains("+hh");

        // If Z suffix and offset provided, convert local time to UTC
        BigDecimal displaySeconds = totalSeconds;
        int displayOffsetMinutes = offsetMinutes;
        if (hasZ && hasOffset) {
            // time is local, subtract offset to get UTC
            displaySeconds = totalSeconds.subtract(new BigDecimal(offsetMinutes * 60));
            // Wrap around midnight
            BigDecimal daySeconds = new BigDecimal(86400);
            displaySeconds = displaySeconds.remainder(daySeconds);
            if (displaySeconds.compareTo(BigDecimal.ZERO) < 0) {
                displaySeconds = displaySeconds.add(daySeconds);
            }
        }

        // Extract hours, minutes, seconds, fractional
        int wholeSec = displaySeconds.intValue();
        if (wholeSec < 0) wholeSec += 86400;
        if (wholeSec >= 86400) wholeSec %= 86400;
        int hh = wholeSec / 3600;
        int mm = (wholeSec % 3600) / 60;
        int ss = wholeSec % 60;

        // Fractional seconds
        BigDecimal frac = displaySeconds.subtract(new BigDecimal(displaySeconds.intValue()));
        if (frac.compareTo(BigDecimal.ZERO) < 0) frac = frac.add(BigDecimal.ONE);

        // Build result by parsing format pattern
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < fmt.length()) {
            if (i + 1 < fmt.length() && fmt.substring(i, i + 2).equals("hh")) {
                // Check if this is offset hours (after + or -)
                if (i > 0 && (fmt.charAt(i - 1) == '+' || fmt.charAt(i - 1) == '-')) {
                    // Already handled below in +hhmm or +hh:mm
                    i += 2;
                } else {
                    result.append(String.format("%02d", hh));
                    i += 2;
                }
            } else if (i + 1 < fmt.length() && fmt.substring(i, i + 2).equals("mm")) {
                // Check if this is offset minutes
                if (i >= 3 && hasOffsetDisplay && isOffsetMM(fmt, i)) {
                    i += 2;
                } else {
                    result.append(String.format("%02d", mm));
                    i += 2;
                }
            } else if (i + 1 < fmt.length() && fmt.substring(i, i + 2).equals("ss")) {
                // Check for .ss or ,ss (fractional). With DECIMAL-POINT IS COMMA the
                // format string uses ',' as the radix separator between whole and
                // fractional seconds (e.g. "hh:mm:ss,ss").
                if (i > 0 && (fmt.charAt(i - 1) == '.' || fmt.charAt(i - 1) == ',')) {
                    // Fractional part — count how many 's' chars
                    int fracDigits = 0;
                    int j = i;
                    while (j < fmt.length() && fmt.charAt(j) == 's') { fracDigits++; j++; }
                    String fracStr = frac.movePointRight(fracDigits).setScale(0, RoundingMode.FLOOR).toString();
                    while (fracStr.length() < fracDigits) fracStr = "0" + fracStr;
                    if (fracStr.length() > fracDigits) fracStr = fracStr.substring(0, fracDigits);
                    result.append(fracStr);
                    i = j;
                } else {
                    result.append(String.format("%02d", ss));
                    i += 2;
                }
            } else if (fmt.charAt(i) == 'Z') {
                result.append('Z');
                i++;
            } else if (fmt.charAt(i) == '+' && i + 4 <= fmt.length()) {
                // Offset display: +hhmm or +hh:mm
                int absOff = Math.abs(displayOffsetMinutes);
                int offH = absOff / 60;
                int offM = absOff % 60;
                char sign = displayOffsetMinutes >= 0 ? '+' : '-';
                // Check pattern length
                String remaining = fmt.substring(i);
                if (remaining.startsWith("+hh:mm")) {
                    result.append(sign);
                    result.append(String.format("%02d:%02d", offH, offM));
                    i += 6; // skip "+hh:mm"
                } else if (remaining.startsWith("+hhmm")) {
                    result.append(sign);
                    result.append(String.format("%02d%02d", offH, offM));
                    i += 5; // skip "+hhmm"
                } else {
                    result.append(fmt.charAt(i));
                    i++;
                }
            } else if (fmt.charAt(i) == ':' || fmt.charAt(i) == '.' || fmt.charAt(i) == ',') {
                result.append(fmt.charAt(i));
                i++;
            } else {
                result.append(fmt.charAt(i));
                i++;
            }
        }
        return result.toString();
    }

    /** Helper: check if 'mm' at position i in format is part of offset (after +hh or +hh:) */
    private static boolean isOffsetMM(String fmt, int i) {
        // Search backwards for '+' or pattern indicating offset
        for (int j = i - 1; j >= 0; j--) {
            if (fmt.charAt(j) == '+') return true;
            if (fmt.charAt(j) == ':' || fmt.charAt(j) == 'h') continue;
            break;
        }
        return false;
    }

    // FUNCTION TEST-NUMVAL / TEST-NUMVAL-C / TEST-NUMVAL-F
    //
    // Per COBOL spec, returns 0 if the argument is a valid NUMVAL operand,
    // else the 1-based position of the first invalid character (or len+1 if
    // the string ends prematurely / is all spaces / has no digits).
    //
    // Valid TEST-NUMVAL form (simplified):
    //   [spaces] [sign [spaces]] digits [. digits] [[spaces] sign] [spaces]
    //   OR
    //   [spaces] digits [. digits] [spaces]
    //
    // Sign may be leading or trailing but not both.
    public static int test_numval(Object val) {
        return testNumvalImpl(String.valueOf(val), '.', null);
    }
    public static int test_numval_c(Object val) {
        // TEST-NUMVAL-C accepts an optional currency symbol (default '$')
        // either before or after the sign.
        return testNumvalImpl(String.valueOf(val), '.', "$");
    }
    public static int test_numval_c(Object val, Object currency) {
        String cur = String.valueOf(currency);
        if (cur != null) cur = cur.trim();
        if (cur == null || cur.isEmpty()) cur = "$";
        return testNumvalImpl(String.valueOf(val), '.', cur);
    }
    public static int test_numval_f(Object val) {
        // TEST-NUMVAL-F accepts an optional 'E' exponent form: digits [E [sign] digits]
        return testNumvalFImpl(String.valueOf(val), '.');
    }

    /** Common TEST-NUMVAL state machine. Returns 0 if valid, else 1-based
     *  position of first invalid char (or len+1 if missing required pieces).
     *  When `currency` is non-null, accepts that string as an optional symbol
     *  either before or after the optional sign. */
    private static int testNumvalImpl(String s, char decimal, String currency) {
        int n = s.length();
        int i = 0;
        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') i++;
        boolean haveCurrency = false;
        // Optional currency BEFORE sign
        if (currency != null && currency.length() > 0 && s.regionMatches(i, currency, 0, currency.length())) {
            i += currency.length();
            haveCurrency = true;
            while (i < n && s.charAt(i) == ' ') i++;
        }
        // Optional leading sign
        boolean leadingSign = false;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            leadingSign = true;
            i++;
            while (i < n && s.charAt(i) == ' ') i++;
        }
        // Optional currency AFTER sign (if not already consumed)
        if (!haveCurrency && currency != null && currency.length() > 0 && s.regionMatches(i, currency, 0, currency.length())) {
            i += currency.length();
            while (i < n && s.charAt(i) == ' ') i++;
        }
        // Now we expect digits. If the next char isn't a digit or '.', return its
        // 1-based position as the first invalid char (this is the standard
        // GnuCOBOL behavior — TEST-NUMVAL("+ -1") returns 2 for the '-').
        boolean hasDigits = false;
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') { hasDigits = true; i++; }
        // Optional decimal + digits after
        if (i < n && s.charAt(i) == decimal) {
            i++;
            while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') { hasDigits = true; i++; }
        }
        if (!hasDigits) {
            // If we ended at a non-space, that's the first bad char.
            if (i < n) return i + 1;
            return n + 1;
        }
        // Optional trailing sign or CR/DB — only if no leading sign
        while (i < n && s.charAt(i) == ' ') i++;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (leadingSign) return i + 1;
            i++;
        } else if (i < n) {
            char c1 = Character.toUpperCase(s.charAt(i));
            // If we see a lone 'C' or 'D', GnuCOBOL advances assuming CR/DB started.
            // The mismatch position is where the second char fails (or n+1 at EOF).
            if (c1 == 'C' || c1 == 'D') {
                if (leadingSign) return i + 1;
                i++;
                if (i >= n) return n + 1; // ran out of input expecting R/B
                char c2 = Character.toUpperCase(s.charAt(i));
                if ((c1 == 'C' && c2 == 'R') || (c1 == 'D' && c2 == 'B')) {
                    i++;
                } else {
                    return i + 1; // position of mismatched second char
                }
            }
        }
        // Trailing spaces only
        while (i < n && s.charAt(i) == ' ') i++;
        if (i < n) return i + 1;
        return 0;
    }

    private static int testNumvalFImpl(String s, char decimal) {
        int n = s.length();
        int i = 0;
        while (i < n && s.charAt(i) == ' ') i++;
        boolean leadingSign = false;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            leadingSign = true;
            i++;
            // libcob is lenient — allow spaces between leading sign and digits.
            while (i < n && s.charAt(i) == ' ') i++;
        }
        boolean hasDigits = false;
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') { hasDigits = true; i++; }
        if (i < n && s.charAt(i) == decimal) {
            i++;
            while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') { hasDigits = true; i++; }
        }
        if (!hasDigits) {
            // If we ended at a non-space, that's the first invalid char (1-based).
            // Otherwise (all spaces/sign-only), return n+1.
            if (i < n) return i + 1;
            return n + 1;
        }
        // Optional E exponent — libcob accepts spaces before 'E' and between
        // 'E' and the exponent's sign / digits.
        int beforeESpaces = i;
        while (beforeESpaces < n && s.charAt(beforeESpaces) == ' ') beforeESpaces++;
        if (beforeESpaces < n && (s.charAt(beforeESpaces) == 'E' || s.charAt(beforeESpaces) == 'e')) {
            i = beforeESpaces + 1; // consume spaces + 'E'
            while (i < n && s.charAt(i) == ' ') i++;
            boolean expSigned = false;
            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                expSigned = true;
                i++;
                while (i < n && s.charAt(i) == ' ') i++;
            }
            // When the operand has a leading sign, the exponent must have its
            // own explicit sign (libcob convention: "+1.1 E001" → invalid at
            // first exponent digit).
            if (leadingSign && !expSigned) return i + 1;
            int expStart = i;
            boolean expDigits = false;
            while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') { expDigits = true; i++; }
            if (!expDigits) return expStart + 1;
        }
        // Optional trailing sign or CR/DB — only valid if no leading sign.
        // libcob accepts these in TEST-NUMVAL-F as well.
        while (i < n && s.charAt(i) == ' ') i++;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (leadingSign) return i + 1;
            i++;
        } else if (i < n) {
            char c1 = Character.toUpperCase(s.charAt(i));
            if (c1 == 'C' || c1 == 'D') {
                if (leadingSign) return i + 1;
                i++;
                if (i >= n) return n + 1;
                char c2 = Character.toUpperCase(s.charAt(i));
                if ((c1 == 'C' && c2 == 'R') || (c1 == 'D' && c2 == 'B')) {
                    i++;
                } else {
                    return i + 1;
                }
            }
        }
        while (i < n && s.charAt(i) == ' ') i++;
        if (i < n) return i + 1;
        return 0;
    }

    // FUNCTION COMBINED-DATETIME
    /** FUNCTION COMBINED-DATETIME: GnuCOBOL semantics — returns date + time/100000.
     *  date is an integer date, time is a numeric time-of-day (seconds-fraction since midnight). */
    public static BigDecimal combined_datetime(Object date, Object time) {
        BigDecimal d = toBigDecimal(date);
        BigDecimal t = toBigDecimal(time);
        return d.add(t.divide(new BigDecimal(100000), 8, RoundingMode.HALF_UP));
    }
    public static BigDecimal combined_datetime(int date, int time) {
        return combined_datetime((Object) date, (Object) time);
    }

    // FUNCTION SECONDS-FROM-FORMATTED-TIME
    public static BigDecimal seconds_from_formatted_time(Object format, Object time) {
        try {
            String fmt = String.valueOf(format).trim();
            String t = String.valueOf(time).trim();
            // Extract hh, mm, ss, fractional from time string based on format
            int hhIdx = fmt.indexOf("hh");
            int mmIdx = fmt.indexOf("mm");
            int ssIdx = fmt.indexOf("ss");
            int h = 0, m = 0, s = 0;
            BigDecimal frac = BigDecimal.ZERO;
            if (hhIdx >= 0 && hhIdx + 2 <= t.length()) h = Integer.parseInt(t.substring(hhIdx, hhIdx + 2).trim());
            if (mmIdx >= 0 && mmIdx + 2 <= t.length()) m = Integer.parseInt(t.substring(mmIdx, mmIdx + 2).trim());
            if (ssIdx >= 0 && ssIdx + 2 <= t.length()) {
                s = Integer.parseInt(t.substring(ssIdx, ssIdx + 2).trim());
                // Check for fractional seconds after ss
                int fracStart = ssIdx + 2;
                if (fracStart < t.length() && (t.charAt(fracStart) == '.' || t.charAt(fracStart) == ',')) {
                    StringBuilder fracStr = new StringBuilder("0.");
                    for (int i = fracStart + 1; i < t.length() && Character.isDigit(t.charAt(i)); i++) {
                        fracStr.append(t.charAt(i));
                    }
                    frac = new BigDecimal(fracStr.toString());
                }
            }
            return new BigDecimal(h * 3600 + m * 60 + s).add(frac);
        } catch (Exception e) { return BigDecimal.ZERO; }
    }

    // FUNCTION LOCALE-DATE / LOCALE-TIME
    public static String locale_date(Object date) { return String.valueOf(date); }
    public static String locale_time(Object time) { return String.valueOf(time); }

    // FUNCTION PRESENT-VALUE / ANNUITY
    public static double present_value(double rate, double... amounts) {
        double pv = 0; double factor = 1;
        for (double a : amounts) { factor /= (1 + rate); pv += a * factor; }
        return pv;
    }
    // ANNUITY(double, int) — superseded by ANNUITY(Object, Object) above which
    // routes through CobolBigMath for 33-digit libcob-matching precision.

    // FUNCTION EXCEPTION-FILE / EXCEPTION-LOCATION / EXCEPTION-STATEMENT / EXCEPTION-STATUS (ThreadLocal state)
    // EXCEPTION-FILE: initial = "00" (no exception); on error = fileStatus + selectName
    // EXCEPTION-LOCATION: initial = " " (space); on error = "program; paragraph OF section; line"
    // EXCEPTION-STATEMENT: initial = 31 spaces; on error = statement verb padded/truncated to 31 chars
    // EXCEPTION-STATUS: initial = 31 spaces; on error = EC condition padded/truncated to 31 chars
    private static final int EC_FIELD_SIZE = 31;
    private static final String SPACES_31 = "                               "; // 31 spaces

    private static final ThreadLocal<String> _exceptionFile = ThreadLocal.withInitial(() -> "00");
    private static final ThreadLocal<String> _exceptionLocation = ThreadLocal.withInitial(() -> " ");
    private static final ThreadLocal<String> _exceptionStatement = ThreadLocal.withInitial(() -> SPACES_31);
    private static final ThreadLocal<String> _exceptionStatus = ThreadLocal.withInitial(() -> SPACES_31);

    // Current execution location — updated by generated code before each statement
    private static final ThreadLocal<String> _currentLocation = ThreadLocal.withInitial(() -> "");
    // Current source line number — set by generated code before file I/O statements
    private static final ThreadLocal<Integer> _currentLine = ThreadLocal.withInitial(() -> 0);

    // Whether `>>TURN EC-* CHECKING ON WITH LOCATION` (or compiler -flocation-stack)
    // is in effect. When false, FUNCTION EXCEPTION-LOCATION returns " " per GnuCOBOL,
    // even after a file I/O exception. Default off (matches stock cobc behaviour).
    private static volatile boolean _locationEnabled = false;
    public static void setLocationEnabled(boolean on) { _locationEnabled = on; }
    public static boolean isLocationEnabled() { return _locationEnabled; }

    public static void setException(String file, String location, String statement, String status) {
        _exceptionFile.set(file); _exceptionLocation.set(location);
        _exceptionStatement.set(statement); _exceptionStatus.set(status);
    }

    /** Raise an exception with auto-filled location from module info */
    public static void setException(String ecName) {
        setException(ecName, 0);
    }

    /** Raise an exception with line number for location */
    public static void setException(String ecName, int lineNum) {
        if (_locationEnabled) {
            String loc;
            if (lineNum > 0) {
                String base = _currentLocation.get();
                if (base == null || base.isEmpty()) base = _moduleId.get();
                if (base.contains(";")) loc = base + "; " + lineNum;
                else loc = base + "; ; " + lineNum;
            } else {
                loc = _currentLocation.get();
                if (loc == null || loc.isEmpty()) loc = _moduleId.get();
            }
            _exceptionLocation.set(loc);
        } else {
            // Without location-tracking directive, GnuCOBOL still records the
            // module-id; FUNCTION EXCEPTION-LOCATION returns "prog; ; 0".
            String mod = _moduleId.get();
            _exceptionLocation.set((mod == null || mod.isEmpty() ? "" : mod) + "; ; 0");
        }
        _exceptionStatus.set(padRight(ecName, EC_FIELD_SIZE));
    }

    /** Check if a specific exception is currently raised */
    public static boolean checkException(String ecName) {
        String current = _exceptionStatus.get();
        if (current == null || current.trim().isEmpty()) return false;
        return current.trim().startsWith(ecName.trim());
    }

    /** Clear exception state (called on successful I/O) */
    public static void clearException() {
        _exceptionFile.set("00");
        _exceptionLocation.set(" ");
        _exceptionStatement.set(SPACES_31);
        _exceptionStatus.set(SPACES_31);
    }

    /** SET LAST EXCEPTION TO OFF — same effect as clearException, named to mirror
     *  the COBOL verb so the emitter call site reads naturally. */
    public static void setLastExceptionOff() { clearException(); }

    /**
     * Raise a file I/O exception — called by CobolFile on error.
     * @param fileStatus the 2-char file status code (e.g. "35")
     * @param selectName the SELECT file name (e.g. "TEST-FILE")
     * @param statement the COBOL verb (e.g. "OPEN", "READ", "WRITE")
     */
    public static void raiseFileException(String fileStatus, String selectName, String statement) {
        // EXCEPTION-FILE: status + select name
        _exceptionFile.set(fileStatus + (selectName != null ? selectName : ""));

        // EXCEPTION-LOCATION: when location-tracking directive is active, populate
        // with full "module; paragraph; line" form. Without the directive, GnuCOBOL
        // still records the module-id with empty paragraph/line — i.e. "prog; ; 0".
        if (_locationEnabled) {
            String loc = _currentLocation.get();
            if (loc == null || loc.isEmpty()) {
                loc = _moduleId.get();
            }
            Integer ln = _currentLine.get();
            if (ln != null && ln > 0) {
                if (loc.contains(";")) loc = loc + "; " + ln;
                else loc = loc + "; ; " + ln;
            }
            _exceptionLocation.set(loc);
        } else {
            String mod = _moduleId.get();
            _exceptionLocation.set((mod == null || mod.isEmpty() ? "" : mod) + "; ; 0");
        }

        // EXCEPTION-STATEMENT: only populate when location-tracking is enabled
        // (matches stock GnuCOBOL — defaults to 31 spaces unless `>>TURN ...
        // CHECKING ON WITH LOCATION` directive is in effect).
        if (_locationEnabled) {
            String stmt = statement != null ? statement : "";
            _exceptionStatement.set(padRight(stmt, EC_FIELD_SIZE));
        } else {
            _exceptionStatement.set(SPACES_31);
        }

        // EXCEPTION-STATUS: map file status to EC condition name
        String ecName = mapFileStatusToEC(fileStatus);
        _exceptionStatus.set(padRight(ecName, EC_FIELD_SIZE));
    }

    /** Set current execution location (called by generated code before statements) */
    public static void setCurrentLocation(String location) {
        _currentLocation.set(location != null ? location : "");
    }

    /** Set current source line number (called by generated code before file I/O statements) */
    public static void setCurrentLine(int lineNum) {
        _currentLine.set(lineNum);
    }

    // ─────────────────────────────────────────────────────────────────
    // Program exit (replaces direct System.exit calls in generated code)
    // In normal mode: delegates to System.exit, terminating the JVM.
    // In daemon mode (set via setDaemonMode(true)): throws ProgramExitException
    // so the in-process runner can capture exit code without killing the JVM.
    // ─────────────────────────────────────────────────────────────────
    private static volatile boolean _daemonMode = Boolean.getBoolean("lazarus.inproc");

    public static void setDaemonMode(boolean on) {
        _daemonMode = on;
    }

    public static boolean isDaemonMode() {
        return _daemonMode;
    }

    public static void programExit(int status) {
        System.out.flush();
        System.err.flush();
        if ("1".equals(System.getProperty("lazarus.inproc.trace"))) {
            System.err.println("[trace] programExit status=" + status + " daemonMode=" + _daemonMode);
        }
        if (_daemonMode) {
            throw new ProgramExitException(status);
        }
        System.exit(status);
    }

    /** Reset all per-test ThreadLocal state. Called by InProcessRunner between tests. */
    public static void resetThreadState() {
        _exceptionFile.remove();
        _exceptionLocation.remove();
        _exceptionStatement.remove();
        _exceptionStatus.remove();
        _currentLocation.remove();
        _currentLine.remove();
        _moduleId.remove();
    }

    /** Map COBOL file status to EC exception condition name */
    private static String mapFileStatusToEC(String fileStatus) {
        if (fileStatus == null) return "EC-I-O";
        switch (fileStatus) {
            case "35": return "EC-I-O-PERMANENT-ERROR";
            case "30": return "EC-I-O-PERMANENT-ERROR";
            case "10": return "EC-I-O-AT-END";
            case "21": return "EC-I-O-INVALID-KEY";
            case "22": return "EC-I-O-DUPLICATE-KEY";
            case "23": return "EC-I-O-INVALID-KEY";
            case "24": return "EC-I-O-PERMANENT-ERROR";
            case "34": return "EC-I-O-PERMANENT-ERROR";
            case "37": return "EC-I-O-PERMANENT-ERROR";
            case "38": return "EC-I-O-PERMANENT-ERROR";
            case "39": return "EC-I-O-PERMANENT-ERROR";
            case "41": return "EC-I-O-LOGIC-ERROR";
            case "42": return "EC-I-O-LOGIC-ERROR";
            case "43": return "EC-I-O-LOGIC-ERROR";
            case "44": return "EC-I-O-LOGIC-ERROR";
            case "46": return "EC-I-O-LOGIC-ERROR";
            case "47": return "EC-I-O-LOGIC-ERROR";
            case "48": return "EC-I-O-LOGIC-ERROR";
            case "49": return "EC-I-O-LOGIC-ERROR";
            default:
                if (fileStatus.startsWith("9")) return "EC-I-O-IMP";
                return "EC-I-O";
        }
    }

    /** Pad string with trailing spaces to exact width */
    private static String padRight(String s, int width) {
        if (s.length() >= width) return s.substring(0, width);
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < width) sb.append(' ');
        return sb.toString();
    }

    public static String exception_file() { return _exceptionFile.get(); }
    public static String exception_location() { return _exceptionLocation.get(); }
    public static String exception_statement() { return _exceptionStatement.get(); }
    public static String exception_status() { return _exceptionStatus.get(); }

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
            // Strip any time portion: "YYYY-MM-DDThh:mm:ss" -> "YYYY-MM-DD"
            int tIdx = fmt.indexOf('T');
            if (tIdx > 0) {
                fmt = fmt.substring(0, tIdx);
                int dtIdx = date.indexOf('T');
                if (dtIdx > 0) date = date.substring(0, dtIdx);
            }
            java.time.LocalDate d;
            if (fmt.contains("Www")) {
                // ISO week-based date: YYYY-Www-D or YYYYWwwD.
                // Parse ISO week year, week number, and day of week.
                java.util.regex.Matcher m;
                if (fmt.equals("YYYY-Www-D")) {
                    m = java.util.regex.Pattern.compile("(\\d{4})-W(\\d{2})-(\\d)").matcher(date);
                } else if (fmt.equals("YYYYWwwD")) {
                    m = java.util.regex.Pattern.compile("(\\d{4})W(\\d{2})(\\d)").matcher(date);
                } else {
                    return 0;
                }
                if (!m.matches()) return 0;
                int weekYear = Integer.parseInt(m.group(1));
                int week = Integer.parseInt(m.group(2));
                int dow = Integer.parseInt(m.group(3));
                java.time.temporal.WeekFields iso = java.time.temporal.WeekFields.ISO;
                d = java.time.LocalDate.now()
                        .with(iso.weekBasedYear(), weekYear)
                        .with(iso.weekOfWeekBasedYear(), week)
                        .with(iso.dayOfWeek(), dow);
            } else if (fmt.contains("DDD")) {
                // Ordinal date: YYYYDDD or YYYY-DDD
                java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern(
                        fmt.replace("YYYY", "yyyy").replace("DDD", "DDD"));
                d = java.time.LocalDate.parse(date, dtf);
            } else if (fmt.contains("MM") && fmt.contains("DD")) {
                // Gregorian: YYYYMMDD or YYYY-MM-DD
                java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern(
                        fmt.replace("YYYY", "yyyy").replace("DD", "dd"));
                d = java.time.LocalDate.parse(date, dtf);
            } else {
                d = java.time.LocalDate.parse(date, java.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
            }
            return (int) (d.toEpochDay() - COBOL_EPOCH_OFFSET + 1);
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

    // MODULE-ID / MODULE-CALLER-ID / MODULE-SOURCE / MODULE-PATH (ThreadLocal state)
    private static final ThreadLocal<String> _moduleId = ThreadLocal.withInitial(() -> "");
    private static final ThreadLocal<String> _moduleCallerId = ThreadLocal.withInitial(() -> "");
    private static final ThreadLocal<String> _moduleSource = ThreadLocal.withInitial(() -> "");

    public static void setModuleInfo(String id, String caller, String source) {
        _moduleId.set(id); if (caller != null && !caller.isEmpty()) _moduleCallerId.set(caller); _moduleSource.set(source);
    }
    public static void setModuleCallerId(String callerId) { _moduleCallerId.set(callerId); }
    public static String module_id() { return _moduleId.get(); }
    public static String module_caller_id() { return _moduleCallerId.get(); }
    public static String module_source() { return _moduleSource.get(); }
    public static String module_path() { return _moduleSource.get(); }

    /** Format a value for SIGN SEPARATE storage. Returns sign + digits (LEADING) or digits + sign (TRAILING). */
    public static String formatSignSeparate(Object value, int picSize, boolean isLeading) {
        java.math.BigDecimal bd = toBigDecimal(value);
        String sign = bd.signum() < 0 ? "-" : "+";
        String digits = bd.abs().toBigInteger().toString();
        if (digits.length() < picSize) digits = String.format("%" + picSize + "s", digits).replace(' ', '0');
        if (digits.length() > picSize) digits = digits.substring(digits.length() - picSize);
        return isLeading ? sign + digits : digits + sign;
    }

    /**
     * Format a signed DISPLAY numeric value with embedded sign encoding.
     * The sign is embedded in the leading or trailing digit using overpunch characters.
     *
     * ASCII encoding:
     *   positive: 0-9 → '0'-'9'
     *   negative: 0-9 → 'p'-'y'
     *
     * EBCDIC encoding:
     *   positive: 0-9 → '{', 'A'-'I'
     *   negative: 0-9 → '}', 'J'-'R'
     *
     * @param value the numeric value
     * @param picSize number of digit positions
     * @param isLeading true if sign is in the leading digit, false for trailing
     * @param isEbcdic true for EBCDIC encoding, false for ASCII encoding
     * @return the sign-encoded digit string of length picSize
     */
    public static String formatSignEmbedded(Object value, int picSize, boolean isLeading, boolean isEbcdic) {
        java.math.BigDecimal bd = toBigDecimal(value);
        boolean negative = bd.signum() < 0;
        String digits = bd.abs().toBigInteger().toString();
        if (digits.length() < picSize) digits = String.format("%" + picSize + "s", digits).replace(' ', '0');
        if (digits.length() > picSize) digits = digits.substring(digits.length() - picSize);

        // Determine which digit position gets the sign encoding
        int signPos = isLeading ? 0 : picSize - 1;
        char[] chars = digits.toCharArray();
        int d = chars[signPos] - '0';

        if (isEbcdic) {
            // EBCDIC overpunch: positive 0-9 �� {,A-I; negative 0-9 → },J-R
            if (negative) {
                chars[signPos] = d == 0 ? '}' : (char) ('J' + d - 1);
            } else {
                chars[signPos] = d == 0 ? '{' : (char) ('A' + d - 1);
            }
        } else {
            // ASCII overpunch: positive 0-9 → '0'-'9'; negative 0-9 → 'p'-'y'
            if (negative) {
                chars[signPos] = (char) ('p' + d);
            }
            // positive: digit stays as-is ('0'-'9')
        }
        return new String(chars);
    }

    /**
     * Format an unsigned DISPLAY numeric value as a zero-padded digit string.
     * Used for PIC 9(n) fields that REDEFINE alphanumeric fields.
     *
     * @param value the numeric value
     * @param picSize number of digit positions
     * @return the zero-padded digit string of length picSize
     */
    public static String formatUnsignedDisplay(Object value, int picSize) {
        java.math.BigDecimal bd = toBigDecimal(value);
        String digits = bd.abs().toBigInteger().toString();
        if (digits.length() < picSize) digits = String.format("%" + picSize + "s", digits).replace(' ', '0');
        if (digits.length() > picSize) digits = digits.substring(digits.length() - picSize);
        return digits;
    }

    // Overloaded MOD for Object
    public static BigDecimal mod(Object a, Object b) {
        // COBOL MOD: a - (INTEGER(a/b) * b), where INTEGER = floor
        BigDecimal ba = toBigDecimal(a);
        BigDecimal bb = toBigDecimal(b);
        if (bb.signum() == 0) return BigDecimal.ZERO;
        BigDecimal q = ba.divideToIntegralValue(bb);
        // For floor semantics with negative dividends, adjust if remainder has different sign
        BigDecimal rem = ba.subtract(q.multiply(bb));
        if (rem.signum() != 0 && rem.signum() != bb.signum()) {
            // Floor adjustment: subtract 1 from quotient, recompute remainder
            q = q.subtract(BigDecimal.ONE);
            rem = ba.subtract(q.multiply(bb));
        }
        return rem;
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

    // FUNCTION BIT-OF — bit-pattern of the field's RAW bytes (big-endian for binary).
    // PIC X / CobolString → bits of each char; numeric/BINARY → bits of the
    // native byte representation, NOT the decimal-string repr.
    /** FUNCTION BIT-OF — descriptor-aware overload. Writes the legacy value into
     *  the field's MemoryGrid slot via the descriptor's storage encoding, then
     *  reads the raw bytes. Gives byte-exact output for COMP-3 (BCD nibbles),
     *  COMP / COMP-5 (big-endian binary), POINTER (i64), etc. — matches GnuCOBOL. */
    public static String bit_of(com.lazarus.cobol.vmg.FieldDescriptor desc, Object legacyVal) {
        syncLegacyToDescriptor(desc, legacyVal);
        byte[] bytes = desc.getRawBytes();
        StringBuilder sb = new StringBuilder(bytes.length * 8);
        for (byte b : bytes) {
            for (int i = 7; i >= 0; i--) sb.append(((b >> i) & 1) == 1 ? '1' : '0');
        }
        return sb.toString();
    }

    public static String bit_of(Object val) {
        byte[] bytes = rawBytesOf(val);
        StringBuilder sb = new StringBuilder(bytes.length * 8);
        for (byte b : bytes) {
            for (int bit = 7; bit >= 0; bit--) sb.append(((b >> bit) & 1) == 1 ? '1' : '0');
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

    // FUNCTION HEX-OF — hex of the field's RAW bytes, uppercase per libcob.
    // Numeric/BINARY → bytes of native representation (big-endian); CobolString → bytes of chars.
    /** FUNCTION HEX-OF — descriptor-aware overload. See bit_of(FieldDescriptor) docs. */
    public static String hex_of(com.lazarus.cobol.vmg.FieldDescriptor desc, Object legacyVal) {
        syncLegacyToDescriptor(desc, legacyVal);
        byte[] bytes = desc.getRawBytes();
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) sb.append(String.format("%02X", b & 0xff));
        return sb.toString();
    }

    /** Push the legacy Java field value (BigDecimal / Integer / CobolString / etc.)
     *  into the descriptor's MemoryGrid slot, encoding per the descriptor's storage
     *  class. Used by HEX-OF / BIT-OF / CONTENT-OF so they read the byte-exact
     *  representation that GnuCOBOL would have in memory. */
    private static void syncLegacyToDescriptor(com.lazarus.cobol.vmg.FieldDescriptor desc, Object val) {
        if (desc == null) return;
        try {
            if (val == null) {
                desc.fill((byte) 0x20);
                return;
            }
            switch (desc.storage) {
                case ALPHANUMERIC:
                case GROUP:
                case EDITED: {
                    String s;
                    if (val instanceof CobolString cs) s = cs.toString();
                    else s = String.valueOf(val);
                    desc.setString(s);
                    break;
                }
                case NUMERIC_DISPLAY:
                case SIGN_LEADING_SEPARATE:
                case SIGN_TRAILING_SEPARATE:
                case BINARY:
                case PACKED_BCD:
                case PACKED_BCD_UNSIGNED:
                case FLOAT_SHORT:
                case FLOAT_LONG: {
                    java.math.BigDecimal bd;
                    if (val instanceof java.math.BigDecimal x) bd = x;
                    else if (val instanceof Number n) bd = new java.math.BigDecimal(n.toString());
                    else if (val instanceof CobolString cs) {
                        try { bd = new java.math.BigDecimal(cs.toString().trim()); } catch (Exception e) { bd = java.math.BigDecimal.ZERO; }
                    }
                    else {
                        try { bd = new java.math.BigDecimal(String.valueOf(val).trim()); } catch (Exception e) { bd = java.math.BigDecimal.ZERO; }
                    }
                    desc.setDecimal(bd);
                    break;
                }
                case POINTER: {
                    long p = (val instanceof Number n) ? n.longValue() : 0L;
                    desc.setPointer(p);
                    break;
                }
            }
        } catch (Exception e) { /* swallow — leave descriptor as-is */ }
    }

    public static String hex_of(Object val) {
        byte[] bytes = rawBytesOf(val);
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            int u = b & 0xFF;
            sb.append(Character.toUpperCase(Character.forDigit(u >>> 4, 16)));
            sb.append(Character.toUpperCase(Character.forDigit(u & 0xF, 16)));
        }
        return sb.toString();
    }

    /** Walk the underlying bytes of any COBOL value type for HEX-OF / BIT-OF.
     *  CobolString: char → byte (ASCII/EBCDIC pass-through, low 8 bits).
     *  Number: native big-endian bytes appropriate to the type.
     *  Other: fall back to the trimmed display string (legacy behaviour). */
    private static byte[] rawBytesOf(Object val) {
        if (val == null) return new byte[0];
        if (val instanceof CobolString cs) return cs.getBytes();
        if (val instanceof Byte b)    return new byte[]{ b };
        if (val instanceof Short s)   return new byte[]{ (byte)(s >>> 8), (byte)(s & 0xFF) };
        if (val instanceof Integer i) {
            int v = i;
            return new byte[]{
                (byte)((v >>> 24) & 0xFF),
                (byte)((v >>> 16) & 0xFF),
                (byte)((v >>> 8)  & 0xFF),
                (byte)( v         & 0xFF)
            };
        }
        if (val instanceof Long l) {
            long v = l;
            byte[] out = new byte[8];
            for (int k = 0; k < 8; k++) out[k] = (byte)((v >>> (56 - k * 8)) & 0xFF);
            return out;
        }
        if (val instanceof java.math.BigDecimal bd) {
            java.math.BigInteger ui = bd.unscaledValue();
            // Use a width matching the value's significant bytes, rounded to next power-friendly
            byte[] raw = ui.toByteArray();
            return raw;
        }
        // Fallback: legacy char-walk
        String s = String.valueOf(val);
        byte[] out = new byte[s.length()];
        for (int k = 0; k < s.length(); k++) out[k] = (byte)(s.charAt(k) & 0xFF);
        return out;
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

    // FUNCTION CONTENT-LENGTH — length of NUL-terminated content at pointer.
    // NULL pointer → 0. Non-NULL → length up to first \0 (excluding it).
    public static int content_length(Object val) {
        if (val == null) return 0;
        if (val instanceof Number) {
            long p = ((Number) val).longValue();
            return p == 0 ? 0 : 0; // pointer to actual memory not modeled — best we can do
        }
        String s = String.valueOf(val);
        int nul = s.indexOf('\0');
        return nul >= 0 ? nul : s.length();
    }

    // ADDRESS OF — returns a pointer to the field. In Java, we return the object itself
    // which can be used by pointer-based intrinsics like CONTENT-LENGTH/CONTENT-OF.
    public static Object addressOf(Object val) {
        return val;
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
            java.time.LocalDateTime now = java.time.LocalDateTime.now();
            // Detect timezone offset request
            int offsetMins = 0;
            if (fmt.contains("Z") || fmt.contains("+hhmm") || fmt.contains("-hhmm")) {
                offsetMins = java.time.ZonedDateTime.now().getOffset().getTotalSeconds() / 60;
            }
            return formatCobolDateTime(fmt, now, offsetMins);
        } catch (Exception e) { return current_date(); }
    }

    // FUNCTION TEST-FORMATTED-DATETIME — validate dt against COBOL format spec.
    // Returns 0 if valid, else 1-based char position of first invalid char in dt.
    // Uses progressive range validation: at each digit, returns the position
    // where any completion of the field becomes impossible.
    public static int test_formatted_datetime(Object format, Object dateTimeStr) {
        String fmt = String.valueOf(format);
        String dt = String.valueOf(dateTimeStr);
        // Strip trailing spaces — COBOL fields commonly pad with SPACE, but
        // libcob treats them as not part of the candidate timestamp.
        int end = dt.length();
        while (end > 0 && dt.charAt(end - 1) == ' ') end--;
        if (end < dt.length()) dt = dt.substring(0, end);
        return validateDateTime(fmt, dt);
    }

    private static int validateDateTime(String fmt, String dt) {
        int fi = 0, di = 0;
        int year = -1, month = -1;
        boolean secondsSeen = false;
        boolean isDate = fmt.contains("YYYY");
        while (fi < fmt.length()) {
            char fc = fmt.charAt(fi);
            if (di >= dt.length()) return dt.length() + 1;
            // YYYY
            if (fc == 'Y' && fmt.startsWith("YYYY", fi)) {
                int err = validateRangeProgressive(dt, di, 4, 1601, 9999);
                if (err != 0) return err;
                year = Integer.parseInt(dt.substring(di, di + 4));
                fi += 4; di += 4; continue;
            }
            // MM (month) — uppercase
            if (fc == 'M' && fmt.startsWith("MM", fi)) {
                int err = validateRangeProgressive(dt, di, 2, 1, 12);
                if (err != 0) return err;
                month = Integer.parseInt(dt.substring(di, di + 2));
                fi += 2; di += 2; continue;
            }
            // DDD (day of year)
            if (fc == 'D' && fmt.startsWith("DDD", fi)) {
                int maxDay = (year > 0 && isLeapYear(year)) ? 366 : 365;
                int err = validateRangeProgressive(dt, di, 3, 1, maxDay);
                if (err != 0) return err;
                fi += 3; di += 3; continue;
            }
            // DD (day of month)
            if (fc == 'D' && fmt.startsWith("DD", fi)) {
                int maxDay = daysInMonth(year > 0 ? year : 2000, month > 0 ? month : 1);
                int err = validateRangeProgressive(dt, di, 2, 1, maxDay);
                if (err != 0) return err;
                fi += 2; di += 2; continue;
            }
            // Www (ISO week)
            if (fc == 'W' && fmt.startsWith("Www", fi)) {
                if (dt.charAt(di) != 'W') return di + 1;
                fi++; di++;
                int maxWk = isoWeeksInYear(year > 0 ? year : 2000);
                int err = validateRangeProgressive(dt, di, 2, 1, maxWk);
                if (err != 0) return err;
                fi += 2; di += 2; continue;
            }
            // Single 'D' — ISO day of week 1-7 (only when not part of DD/DDD)
            if (fc == 'D') {
                int err = validateRangeProgressive(dt, di, 1, 1, 7);
                if (err != 0) return err;
                fi += 1; di += 1; continue;
            }
            // hh
            if (fc == 'h' && fmt.startsWith("hh", fi)) {
                int err = validateRangeProgressive(dt, di, 2, 0, 23);
                if (err != 0) return err;
                fi += 2; di += 2; continue;
            }
            // mm (minutes)
            if (fc == 'm' && fmt.startsWith("mm", fi)) {
                int err = validateRangeProgressive(dt, di, 2, 0, 59);
                if (err != 0) return err;
                fi += 2; di += 2; continue;
            }
            // ss / s+ (seconds + fractional seconds — each 's' is one digit 0-9).
            // Only the FIRST `ss…` group is primary seconds [0,59]; later `s` groups
            // (after a separator) are pure fractional digits with no range check.
            if (fc == 's') {
                int n = 0;
                while (fi + n < fmt.length() && fmt.charAt(fi + n) == 's') n++;
                if (n >= 2 && !secondsSeen) {
                    int err = validateRangeProgressive(dt, di, 2, 0, 59);
                    if (err != 0) return err;
                    fi += 2; di += 2;
                    secondsSeen = true;
                    int frac = n - 2;
                    for (int k = 0; k < frac; k++) {
                        if (di >= dt.length()) return dt.length() + 1;
                        char c = dt.charAt(di);
                        if (c < '0' || c > '9') return di + 1;
                        di++;
                    }
                    fi += frac;
                    continue;
                }
                // Pure fractional digits: each 's' must be 0-9.
                for (int k = 0; k < n; k++) {
                    if (di >= dt.length()) return dt.length() + 1;
                    char c = dt.charAt(di);
                    if (c < '0' || c > '9') return di + 1;
                    di++;
                }
                fi += n;
                continue;
            }
            // Timezone offset: '+hhmm' or '+hh:mm'.  GnuCOBOL accepts a literal
            // '0' in the sign position when the offset is zero — but then the
            // ENTIRE remaining offset field must also be all zeros (anything
            // non-zero requires an explicit sign).
            if (fc == '+' || fc == '-') {
                char dc = dt.charAt(di);
                if (dc == '0') {
                    // All remaining digit positions in the offset must also be '0'.
                    int rest = di + 1;
                    while (rest < dt.length()) {
                        char rc = dt.charAt(rest);
                        if (rc >= '0' && rc <= '9') {
                            if (rc != '0') return rest + 1;
                        } // skip ':'
                        rest++;
                    }
                    fi++; di++; continue;
                }
                if (dc != '+' && dc != '-') return di + 1;
                fi++; di++; continue;
            }
            // Literal character (T, Z, :, -, /, space, comma, period)
            if (dt.charAt(di) != fc) return di + 1;
            fi++; di++;
        }
        if (di < dt.length()) return di + 1;
        return 0;
    }

    /** Progressive range validation: returns 1-based position of first digit
     *  that makes any completion of the [min,max] range impossible.
     *  Returns 0 if the field validates. If input is shorter than width but
     *  the available digits are all valid prefixes, returns dt.length()+1. */
    private static int validateRangeProgressive(String dt, int start, int width, int min, int max) {
        long acc = 0;
        int avail = Math.min(width, dt.length() - start);
        for (int i = 0; i < avail; i++) {
            char c = dt.charAt(start + i);
            if (c < '0' || c > '9') return start + i + 1;
            acc = acc * 10 + (c - '0');
            int remaining = width - i - 1;
            long pow = 1;
            for (int k = 0; k < remaining; k++) pow *= 10;
            long possMin = acc * pow;
            long possMax = possMin + pow - 1;
            if (possMax < min || possMin > max) return start + i + 1;
        }
        if (avail < width) return dt.length() + 1;
        return 0;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static int daysInMonth(int year, int month) {
        if (month < 1 || month > 12) return 31;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month - 1];
    }

    private static int isoWeeksInYear(int year) {
        try {
            java.time.LocalDate jan1 = java.time.LocalDate.of(year, 1, 1);
            java.time.DayOfWeek dow = jan1.getDayOfWeek();
            if (dow == java.time.DayOfWeek.THURSDAY) return 53;
            if (dow == java.time.DayOfWeek.WEDNESDAY && isLeapYear(year)) return 53;
            return 52;
        } catch (Exception e) { return 52; }
    }

    // FUNCTION LOCALE-COMPARE
    /** FUNCTION LOCALE-COMPARE — returns "<", ">", or "=" per COBOL spec. */
    public static String locale_compare(Object a, Object b) {
        int cmp = String.valueOf(a).compareTo(String.valueOf(b));
        return cmp < 0 ? "<" : cmp > 0 ? ">" : "=";
    }
    public static String locale_compare(Object a, Object b, Object locale) {
        // Locale-aware compare: use Collator with the supplied locale tag.
        try {
            String tag = String.valueOf(locale).trim();
            java.util.Locale loc = java.util.Locale.forLanguageTag(tag.replace('_', '-'));
            int cmp = java.text.Collator.getInstance(loc).compare(String.valueOf(a), String.valueOf(b));
            return cmp < 0 ? "<" : cmp > 0 ? ">" : "=";
        } catch (Exception e) {
            return locale_compare(a, b);
        }
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
    // Returns: 0=valid, 1=invalid year, 2=invalid month, 3=invalid day
    public static int test_date_yyyymmdd(int date) {
        int y = date / 10000, m = (date / 100) % 100, d = date % 100;
        if (y < 1601 || y > 9999) return 1;
        if (m < 1 || m > 12) return 2;
        try {
            java.time.LocalDate.of(y, m, d);
            return 0;
        } catch (Exception e) { return 3; }
    }

    // FUNCTION TEST-DAY-YYYYDDD — validate a day in YYYYDDD format
    // Returns: 0=valid, 1=invalid year, 2=invalid day
    public static int test_day_yyyyddd(int yyyyddd) {
        int y = yyyyddd / 1000, doy = yyyyddd % 1000;
        if (y < 1601 || y > 9999) return 1;
        try {
            java.time.LocalDate.ofYearDay(y, doy);
            return 0;
        } catch (Exception e) { return 2; }
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
    public static BigDecimal standard_deviation(Object... values) {
        try { return CobolBigMath.sqrt(variance(values)); }
        catch (Exception e) { return BigDecimal.ZERO; }
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
    // Return high-precision string representations matching GnuCOBOL's 96-digit output
    // FUNCTION E and FUNCTION PI: kept at high precision (95 fractional digits).
    // The right comparison behavior comes from the parser preserving high-precision
    // literals via `rawNumericText`, so `Y = 3.14159...288` produces an exact-match
    // BigDecimal in the comparison rather than the JS-double-truncated 16 digits.
    public static String e()  { return "2.71828182845904523536028747135266249775724709369995957496696762772407663035354759457138217852517"; }
    public static String pi() { return "3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534212"; }
    public static String pi(Object... args) { return pi(); } // accept optional ignored args
    public static long factorial(int n) {
        long r = 1;
        for (int i = 2; i <= n; i++) r *= i;
        return r;
    }

    // FUNCTION DAY-TO-YYYYDDD — convert 2-digit year day to 4-digit year day
    public static int day_to_yyyyddd(int yyyyddd) {
        return day_to_yyyyddd(yyyyddd, 50, java.time.LocalDate.now().getYear());
    }
    public static int day_to_yyyyddd(int yyddd, int yearCutoff) {
        return day_to_yyyyddd(yyddd, yearCutoff, java.time.LocalDate.now().getYear());
    }
    public static int day_to_yyyyddd(int yyddd, int yearCutoff, int currentYear) {
        // Same window logic as DATE-TO-YYYYMMDD.
        int yy = yyddd / 1000;
        int doy = yyddd % 1000;
        int interim = currentYear + yearCutoff;
        int century = (interim / 100) * 100;
        int yyyy = (yy <= interim % 100) ? (yy + century) : (yy + century - 100);
        return yyyy * 1000 + doy;
    }

    // FUNCTION DATE-TO-YYYYMMDD
    public static int date_to_yyyymmdd(int date) {
        // 1-arg form: implicit window from current year
        return date_to_yyyymmdd(date, 50, java.time.LocalDate.now().getYear());
    }
    public static int date_to_yyyymmdd(int yymmdd, int yearCutoff) {
        // 2-arg: yearCutoff interpreted relative to current year
        return date_to_yyyymmdd(yymmdd, yearCutoff, java.time.LocalDate.now().getYear());
    }
    public static int date_to_yyyymmdd(int yymmdd, int yearCutoff, int currentYear) {
        // GnuCOBOL libcob algorithm (cob_intr_date_to_yyyymmdd):
        //   interim   = currentYear + maxYearShift   // top of representable window
        //   century   = (interim / 100) * 100
        //   if (yy <= interim % 100) yy += century
        //   else                     yy += century - 100
        // Window = [interim - 99, interim].
        int yy = yymmdd / 10000;
        int mmdd = yymmdd % 10000;
        int interim = currentYear + yearCutoff;
        int century = (interim / 100) * 100;
        int yyyy = (yy <= interim % 100) ? (yy + century) : (yy + century - 100);
        return yyyy * 10000 + mmdd;
    }

    // FUNCTION YEAR-TO-YYYY — uses same pivot algorithm as DATE/DAY-TO-YYYYxxx.
    public static int year_to_yyyy(int yy) {
        return year_to_yyyy(yy, 50, java.time.LocalDate.now().getYear());
    }
    public static int year_to_yyyy(int yy, int yearCutoff) {
        return year_to_yyyy(yy, yearCutoff, java.time.LocalDate.now().getYear());
    }
    public static int year_to_yyyy(int yy, int yearCutoff, int currentYear) {
        int interim = currentYear + yearCutoff;
        int century = (interim / 100) * 100;
        return (yy <= interim % 100) ? (yy + century) : (yy + century - 100);
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

    // ── INSPECT TALLYING ────────────────────────────────────────────

    /** INSPECT TALLYING ALL — count all occurrences of search in target */
    public static int inspectTallyAll(String target, String search) {
        if (target == null || search == null || search.isEmpty()) return 0;
        int count = 0, idx = 0;
        while ((idx = target.indexOf(search, idx)) >= 0) { count++; idx += search.length(); }
        return count;
    }

    /** INSPECT TALLYING ALL with BEFORE/AFTER delimiter */
    public static int inspectTallyAll(String target, String search, String delimiter, boolean isBefore) {
        return inspectTallyAll(inspectSubrange(target, delimiter, isBefore), search);
    }

    /** INSPECT TALLYING LEADING — count leading occurrences of search */
    public static int inspectTallyLeading(String target, String search) {
        if (target == null || search == null || search.isEmpty()) return 0;
        int count = 0, idx = 0;
        while (idx + search.length() <= target.length() &&
               target.substring(idx, idx + search.length()).equals(search)) {
            count++; idx += search.length();
        }
        return count;
    }

    /** INSPECT TALLYING LEADING with BEFORE/AFTER delimiter */
    public static int inspectTallyLeading(String target, String search, String delimiter, boolean isBefore) {
        return inspectTallyLeading(inspectSubrange(target, delimiter, isBefore), search);
    }

    /** INSPECT TALLYING TRAILING — count trailing occurrences of search */
    public static int inspectTallyTrailing(String target, String search) {
        if (target == null || search == null || search.isEmpty()) return 0;
        int count = 0, idx = target.length();
        while (idx - search.length() >= 0 &&
               target.substring(idx - search.length(), idx).equals(search)) {
            count++; idx -= search.length();
        }
        return count;
    }

    /** INSPECT TALLYING TRAILING with BEFORE/AFTER delimiter */
    public static int inspectTallyTrailing(String target, String search, String delimiter, boolean isBefore) {
        return inspectTallyTrailing(inspectSubrange(target, delimiter, isBefore), search);
    }

    /** INSPECT TALLYING CHARACTERS with BEFORE/AFTER delimiter */
    public static int inspectTallyCharacters(String target, String delimiter, boolean isBefore) {
        return inspectSubrange(target, delimiter, isBefore).length();
    }

    /** Helper: extract the subrange of target based on BEFORE/AFTER delimiter */
    private static String inspectSubrange(String target, String delimiter, boolean isBefore) {
        if (target == null) return "";
        if (delimiter == null || delimiter.isEmpty()) return target;
        int delimPos = target.indexOf(delimiter);
        if (delimPos < 0) {
            // Delimiter not found: BEFORE = entire string, AFTER = empty
            return isBefore ? target : "";
        }
        if (isBefore) {
            return target.substring(0, delimPos);
        } else {
            return target.substring(delimPos + delimiter.length());
        }
    }

    /** Helper: extract the subrange AFTER afterDelim AND BEFORE beforeDelim */
    public static String inspectBothSubrange(String target, String afterDelim, String beforeDelim) {
        String sub = inspectSubrange(target, afterDelim, false); // part after afterDelim
        return inspectSubrange(sub, beforeDelim, true);          // then part before beforeDelim
    }

    /** INSPECT TALLYING CHARACTERS with both AFTER and BEFORE delimiters */
    public static int inspectTallyCharactersBoth(String target, String afterDelim, String beforeDelim) {
        return inspectBothSubrange(target, afterDelim, beforeDelim).length();
    }

    /** INSPECT TALLYING multi-clause CHARACTERS with first-rule-wins per position.
     *  Returns int[] with the increment count for each clause.
     *  afters[i]/befores[i] may be null (meaning no AFTER/BEFORE delimiter).
     *  Each char position is counted by the FIRST clause whose window covers it,
     *  matching GnuCOBOL semantics for multi-clause TALLYING ... CHARACTERS. */
    public static int[] inspectTallyCharactersMulti(
            String target, String[] afters, String[] befores) {
        int[] counts = new int[afters.length];
        if (target == null || target.isEmpty()) return counts;
        int n = target.length();
        boolean[] taken = new boolean[n];
        // Pre-compute per-rule [start, end) window
        int[] starts = new int[afters.length];
        int[] ends = new int[afters.length];
        boolean[] active = new boolean[afters.length];
        for (int r = 0; r < afters.length; r++) {
            int start = 0;
            String after = afters[r];
            if (after != null && !after.isEmpty()) {
                int pos = target.indexOf(after);
                if (pos < 0) { active[r] = false; continue; }
                start = pos + after.length();
            }
            int end = n;
            String before = befores[r];
            if (before != null && !before.isEmpty()) {
                int pos = target.indexOf(before, start);
                end = pos >= 0 ? pos : start;
            }
            starts[r] = start;
            ends[r] = end;
            active[r] = true;
        }
        for (int i = 0; i < n; i++) {
            for (int r = 0; r < afters.length; r++) {
                if (!active[r]) continue;
                if (i >= starts[r] && i < ends[r] && !taken[i]) {
                    counts[r]++;
                    taken[i] = true;
                    break;
                }
            }
        }
        return counts;
    }

    // ── INSPECT REPLACING ───────────────────────────────────────────

    /** Pad/truncate replacement to match search pattern length (COBOL INSPECT requirement) */
    private static String padReplacement(String to, int fromLen) {
        String s = to != null ? to : "";
        if (s.length() == fromLen) return s;
        if (s.length() > fromLen) return s.substring(0, fromLen);
        // Pad by repeating the replacement character(s) to match from length
        if (s.isEmpty()) {
            char[] buf = new char[fromLen];
            java.util.Arrays.fill(buf, ' ');
            return new String(buf);
        }
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < fromLen) sb.append(s);
        return sb.toString().substring(0, fromLen);
    }

    /** INSPECT REPLACING ALL with multiple rules — single left-to-right pass.
     *  Each position matched by one rule is NOT eligible for subsequent rules. */
    public static String inspectReplaceAllMulti(String target, String[] froms, String[] tos) {
        if (target == null) return "";
        char[] buf = target.toCharArray();
        boolean[] used = new boolean[buf.length]; // track matched positions
        for (int r = 0; r < froms.length; r++) {
            String from = froms[r];
            String to = padReplacement(tos[r], from.length());
            int fLen = from.length();
            if (fLen == 0) continue;
            for (int i = 0; i <= buf.length - fLen; i++) {
                if (used[i]) continue;
                boolean match = true;
                for (int j = 0; j < fLen; j++) {
                    if (buf[i + j] != from.charAt(j) || used[i + j]) { match = false; break; }
                }
                if (match) {
                    for (int j = 0; j < fLen; j++) {
                        buf[i + j] = to.charAt(j);
                        used[i + j] = true;
                    }
                    i += fLen - 1; // skip past matched portion
                }
            }
        }
        return new String(buf);
    }

    /** INSPECT REPLACING ALL from BY to */
    public static String inspectReplaceAll(String target, String from, String to) {
        if (target == null) return "";
        if (from == null) {
            // CHARACTERS mode — replace every character with first char of 'to'
            char c = (to != null && !to.isEmpty()) ? to.charAt(0) : ' ';
            char[] buf = new char[target.length()];
            java.util.Arrays.fill(buf, c);
            return new String(buf);
        }
        return target.replace(from, padReplacement(to, from.length()));
    }

    /** INSPECT REPLACING LEADING from BY to */
    public static String inspectReplaceLeading(String target, String from, String to) {
        if (target == null || from == null || from.isEmpty()) return target != null ? target : "";
        String rep = padReplacement(to, from.length());
        StringBuilder sb = new StringBuilder(target);
        int idx = 0;
        while (idx + from.length() <= sb.length() &&
               sb.substring(idx, idx + from.length()).equals(from)) {
            sb.replace(idx, idx + from.length(), rep);
            idx += rep.length();
        }
        return sb.toString();
    }

    /** INSPECT REPLACING FIRST from BY to */
    public static String inspectReplaceFirst(String target, String from, String to) {
        if (target == null || from == null) return target != null ? target : "";
        int idx = target.indexOf(from);
        if (idx < 0) return target;
        String rep = padReplacement(to, from.length());
        return target.substring(0, idx) + rep + target.substring(idx + from.length());
    }

    /** INSPECT REPLACING TRAILING from BY to */
    public static String inspectReplaceTrailing(String target, String from, String to) {
        if (target == null || from == null || from.isEmpty()) return target != null ? target : "";
        String rep = padReplacement(to, from.length());
        StringBuilder sb = new StringBuilder(target);
        int idx = sb.length();
        while (idx - from.length() >= 0 &&
               sb.substring(idx - from.length(), idx).equals(from)) {
            int start = idx - from.length();
            sb.replace(start, idx, rep);
            idx = start;
        }
        return sb.toString();
    }

    /** INSPECT REPLACING CHARACTERS BY to BEFORE before — replace each char before delimiter */
    public static String inspectReplaceCharactersBefore(String target, String to, String before) {
        if (target == null) return "";
        int pos = (before != null) ? target.indexOf(before) : -1;
        if (pos < 0) pos = target.length(); // not found → replace all
        char c = (to != null && !to.isEmpty()) ? to.charAt(0) : ' ';
        char[] buf = target.toCharArray();
        for (int i = 0; i < pos && i < buf.length; i++) buf[i] = c;
        return new String(buf);
    }

    /** INSPECT REPLACING CHARACTERS BY to AFTER after BEFORE before — replace chars in range */
    public static String inspectReplaceCharactersBoth(String target, String to, String after, String before) {
        if (target == null) return "";
        int start = 0;
        if (after != null) {
            int pos = target.indexOf(after);
            if (pos < 0) return target; // AFTER not found → no replacement
            start = pos + after.length();
        }
        int end = target.length();
        if (before != null) {
            int pos = target.indexOf(before, start);
            if (pos >= 0) end = pos;
        }
        char c = (to != null && !to.isEmpty()) ? to.charAt(0) : ' ';
        char[] buf = target.toCharArray();
        for (int i = start; i < end && i < buf.length; i++) buf[i] = c;
        return new String(buf);
    }

    /** INSPECT REPLACING CHARACTERS BY to AFTER after — replace each char after delimiter */
    public static String inspectReplaceCharactersAfter(String target, String to, String after) {
        if (target == null) return "";
        int pos = (after != null) ? target.indexOf(after) : -1;
        if (pos < 0) return target; // not found → no replacement
        int start = pos + after.length();
        char c = (to != null && !to.isEmpty()) ? to.charAt(0) : ' ';
        char[] buf = target.toCharArray();
        for (int i = start; i < buf.length; i++) buf[i] = c;
        return new String(buf);
    }

    /** INSPECT REPLACING CHARACTERS BY ... — multi-rule single-pass with first-rule-wins.
     *  Each rule is (toChar, after, before). For every position in target, the first
     *  rule whose AFTER/BEFORE window covers that position writes its char; positions
     *  already written are skipped by later rules. Matches GnuCOBOL semantics for
     *  INSPECT REPLACING with multiple CHARACTERS clauses. */
    public static String inspectReplaceCharactersMulti(
            String target, String[] tos, String[] afters, String[] befores) {
        if (target == null) return "";
        int n = target.length();
        char[] buf = target.toCharArray();
        boolean[] written = new boolean[n];
        for (int r = 0; r < tos.length; r++) {
            String to = tos[r];
            char c = (to != null && !to.isEmpty()) ? to.charAt(0) : ' ';
            int start = 0;
            String after = afters[r];
            if (after != null && !after.isEmpty()) {
                int pos = target.indexOf(after);
                if (pos < 0) continue; // AFTER not found → skip this rule
                start = pos + after.length();
            }
            int end = n;
            String before = befores[r];
            if (before != null && !before.isEmpty()) {
                int pos = target.indexOf(before, start);
                if (pos >= 0) end = pos;
                else end = start; // BEFORE not found after AFTER → empty window
            }
            for (int i = start; i < end && i < n; i++) {
                if (!written[i]) {
                    buf[i] = c;
                    written[i] = true;
                }
            }
        }
        return new String(buf);
    }

    // ── INSPECT CONVERTING ──────────────────────────────────────────

    /** INSPECT CONVERTING from TO to — character-by-character translation */
    public static String inspectConverting(String target, String from, String to) {
        if (target == null || from == null || to == null) return target != null ? target : "";
        // Pad TO to match FROM length (COBOL figurative constant expansion)
        String toStr = padReplacement(to, from.length());
        char[] buf = target.toCharArray();
        if (from.length() == 256 && toStr.length() == 256) {
            for (int i = 0; i < buf.length; i++) {
                int ordinal = buf[i] & 0xFFFF;
                if (ordinal < 256) {
                    buf[i] = from.charAt(ordinal);
                }
            }
        } else {
            for (int i = 0; i < buf.length; i++) {
                int pos = from.indexOf(buf[i]);
                if (pos >= 0 && pos < toStr.length()) {
                    buf[i] = toStr.charAt(pos);
                }
            }
        }
        return new String(buf);
    }

    /** INSPECT CONVERTING with BEFORE/AFTER delimiters */
    public static String inspectConvertingDelim(String target, String from, String to, String afterDelim, String beforeDelim) {
        if (target == null || from == null || to == null) return target != null ? target : "";
        String toStr = padReplacement(to, from.length());
        char[] buf = target.toCharArray();
        // Determine the subrange to convert
        int startIdx = 0;
        int endIdx = buf.length;
        if (afterDelim != null) {
            int aPos = target.indexOf(afterDelim);
            if (aPos >= 0) startIdx = aPos + afterDelim.length();
            else return target; // AFTER delimiter not found — no conversion
        }
        if (beforeDelim != null) {
            int bPos = target.indexOf(beforeDelim, startIdx);
            if (bPos >= 0) endIdx = bPos;
            // If BEFORE delimiter not found, convert to end of string
        }
        for (int i = startIdx; i < endIdx; i++) {
            int pos = from.indexOf(buf[i]);
            if (pos >= 0 && pos < toStr.length()) {
                buf[i] = toStr.charAt(pos);
            }
        }
        return new String(buf);
    }

    // FUNCTION CURRENCY-SYMBOL
    public static String currency_symbol() {
        return java.util.Currency.getInstance(java.util.Locale.getDefault()).getSymbol();
    }

    // FUNCTION LOCALE-TIME-FROM-SECONDS
    public static String locale_time_from_seconds(int seconds) {
        int h = seconds / 3600, m = (seconds % 3600) / 60, s = seconds % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }

    // FUNCTION MODULE-DATE — returns compilation date as YYYYMMDD integer
    public static int module_date() {
        java.time.LocalDate now = java.time.LocalDate.now();
        return now.getYear() * 10000 + now.getMonthValue() * 100 + now.getDayOfMonth();
    }

    // FUNCTION MODULE-FORMATTED-DATE
    public static String module_formatted_date() {
        return java.time.LocalDate.now().toString();
    }

    // FUNCTION MODULE-TIME — returns current time as HHMMSS00 integer
    public static int module_time() {
        java.time.LocalTime now = java.time.LocalTime.now();
        return now.getHour() * 1000000 + now.getMinute() * 10000 + now.getSecond() * 100;
    }

    // FUNCTION MONETARY-DECIMAL-POINT
    public static String monetary_decimal_point() {
        return String.valueOf(java.text.DecimalFormatSymbols.getInstance().getMonetaryDecimalSeparator());
    }

    // FUNCTION MONETARY-THOUSANDS-SEPARATOR
    public static String monetary_thousands_separator() {
        return String.valueOf(java.text.DecimalFormatSymbols.getInstance().getGroupingSeparator());
    }

    // FUNCTION NUMERIC-DECIMAL-POINT
    public static String numeric_decimal_point() {
        return String.valueOf(java.text.DecimalFormatSymbols.getInstance().getDecimalSeparator());
    }

    // FUNCTION NUMERIC-THOUSANDS-SEPARATOR
    public static String numeric_thousands_separator() {
        return String.valueOf(java.text.DecimalFormatSymbols.getInstance().getGroupingSeparator());
    }

    /** Return ASCII alphabet as a 256-char string (chars 0-255 in ASCII order) */
    public static String alphabetAscii() {
        StringBuilder sb = new StringBuilder(256);
        for (int i = 0; i < 256; i++) sb.append((char) i);
        return sb.toString();
    }

    /** Return EBCDIC alphabet as a 256-char string (EBCDIC→ASCII mapping) */
    public static String alphabetEbcdic() {
        // Standard EBCDIC-to-ASCII code page 037 mapping (256 bytes)
        int[] e2a = {
            0x00,0x01,0x02,0x03,0x9C,0x09,0x86,0x7F,0x97,0x8D,0x8E,0x0B,0x0C,0x0D,0x0E,0x0F,
            0x10,0x11,0x12,0x13,0x9D,0x85,0x08,0x87,0x18,0x19,0x92,0x8F,0x1C,0x1D,0x1E,0x1F,
            0x80,0x81,0x82,0x83,0x84,0x0A,0x17,0x1B,0x88,0x89,0x8A,0x8B,0x8C,0x05,0x06,0x07,
            0x90,0x91,0x16,0x93,0x94,0x95,0x96,0x04,0x98,0x99,0x9A,0x9B,0x14,0x15,0x9E,0x1A,
            0x20,0xA0,0xE2,0xE4,0xE0,0xE1,0xE3,0xE5,0xE7,0xF1,0xA2,0x2E,0x3C,0x28,0x2B,0x7C,
            0x26,0xE9,0xEA,0xEB,0xE8,0xED,0xEE,0xEF,0xEC,0xDF,0x21,0x24,0x2A,0x29,0x3B,0xAC,
            0x2D,0x2F,0xC2,0xC4,0xC0,0xC1,0xC3,0xC5,0xC7,0xD1,0x7C,0x2C,0x25,0x5F,0x3E,0x3F,
            0xF8,0xC9,0xCA,0xCB,0xC8,0xCD,0xCE,0xCF,0xCC,0x60,0x3A,0x23,0x40,0x27,0x3D,0x22,
            0xD8,0x61,0x62,0x63,0x64,0x65,0x66,0x67,0x68,0x69,0xAB,0xBB,0xF0,0xFD,0xFE,0xB1,
            0xB0,0x6A,0x6B,0x6C,0x6D,0x6E,0x6F,0x70,0x71,0x72,0xAA,0xBA,0xE6,0xB8,0xC6,0xA4,
            0xB5,0x7E,0x73,0x74,0x75,0x76,0x77,0x78,0x79,0x7A,0xA1,0xBF,0xD0,0xDD,0xDE,0xAE,
            0x5E,0xA3,0xA5,0xB7,0xA9,0xA7,0xB6,0xBC,0xBD,0xBE,0x5B,0x5D,0xAF,0xA8,0xB4,0xD7,
            0x7B,0x41,0x42,0x43,0x44,0x45,0x46,0x47,0x48,0x49,0xAD,0xF4,0xF6,0xF2,0xF3,0xF5,
            0x7D,0x4A,0x4B,0x4C,0x4D,0x4E,0x4F,0x50,0x51,0x52,0xB9,0xFB,0xFC,0xF9,0xFA,0xFF,
            0x5C,0xF7,0x53,0x54,0x55,0x56,0x57,0x58,0x59,0x5A,0xB2,0xD4,0xD6,0xD2,0xD3,0xD5,
            0x30,0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38,0x39,0xB3,0xDB,0xDC,0xD9,0xDA,0x9F
        };
        StringBuilder sb = new StringBuilder(256);
        for (int i = 0; i < 256; i++) sb.append((char) e2a[i]);
        return sb.toString();
    }

    // ── Wave 5: missing intrinsic overloads ──

    // FUNCTION EXP(x) — handled by the Object overload above (BigDecimal-precision).
    // Old double-precision overloads removed to avoid Java picking the lower-precision
    // method via overload resolution.

    /** FUNCTION EXP10(x) — 10^x at high precision via exp(x*ln(10)). */
    public static BigDecimal exp10(Object x) {
        try {
            return CobolBigMath.exp(toBigDecimal(x).multiply(CobolBigMath.LN10, CobolBigMath.MC));
        } catch (Exception e) { return BigDecimal.ZERO; }
    }

    /** FUNCTION FRACTION-PART(x) - fractional portion with sign. */
    public static java.math.BigDecimal fraction_part(java.math.BigDecimal x) {
        if (x == null) return java.math.BigDecimal.ZERO;
        java.math.BigDecimal intPart = new java.math.BigDecimal(x.toBigInteger());
        return x.subtract(intPart);
    }
    public static double fraction_part(double x) { return x - (long) x; }

    /** FUNCTION SIGN(x) - returns -1, 0, or 1. */
    public static int sign(java.math.BigDecimal x) {
        if (x == null) return 0;
        return x.signum();
    }
    public static int sign(double x) { return Double.compare(x, 0.0); }
    public static int sign(int x) { return Integer.signum(x); }
    public static int sign(long x) { return Long.signum(x); }

    /** FUNCTION TEST-NUMVAL / CLASS HEXADECIMAL check: all chars are hex digits. */
    public static boolean isHexa(CobolString s) {
        if (s == null) return false;
        String str = s.toString();
        if (str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f'))) {
                return false;
            }
        }
        return true;
    }
    public static boolean isHexa(String s) { return s != null && isHexa(new CobolString(s)); }

    /** CALL with OMITTED parameter check — CobolString from OMITTED is null. */
    public static boolean isOmitted(CobolString s) { return s == null; }
    public static boolean isOmitted(Object s) { return s == null; }

    /** User-defined CLASS check (generic stub — returns true when non-null and non-empty). */
    public static boolean isCheck_valid(CobolString s) { return s != null && !s.toString().trim().isEmpty(); }

    /** ODD class test. */
    public static boolean isOdd(long n) { return (n & 1L) == 1L; }
    public static boolean isOdd(int n) { return (n & 1) == 1; }
    public static boolean isOdd(BigDecimal d) { return d != null && d.toBigInteger().testBit(0); }
    public static boolean isOdd(CobolString s) {
        try { return isOdd(Long.parseLong(s.toString().trim())); }
        catch (Exception e) { return false; }
    }
    public static boolean isOdd(Object o) {
        if (o == null) return false;
        if (o instanceof Number) return isOdd(((Number)o).longValue());
        if (o instanceof CobolString) return isOdd((CobolString)o);
        try { return isOdd(Long.parseLong(String.valueOf(o).trim())); }
        catch (Exception e) { return false; }
    }

    /** EVEN class test. */
    public static boolean isEven(long n) { return (n & 1L) == 0L; }
    public static boolean isEven(int n) { return (n & 1) == 0; }
    public static boolean isEven(BigDecimal d) { return d != null && !d.toBigInteger().testBit(0); }
    public static boolean isEven(CobolString s) {
        try { return isEven(Long.parseLong(s.toString().trim())); }
        catch (Exception e) { return false; }
    }

    /**
     * Format a COBOL date pattern.
     * COBOL patterns use YYYY, MM, DD with optional separators.
     */
    private static String formatCobolDate(String pattern, java.time.LocalDate date) {
        // ISO week-based fields use a different YEAR than the Gregorian one
        // (e.g. 2012-01-01 is in week 52 of 2011). Compute both up front.
        java.time.temporal.WeekFields iso = java.time.temporal.WeekFields.ISO;
        int isoWeekYear = date.get(iso.weekBasedYear());
        int isoWeek     = date.get(iso.weekOfWeekBasedYear());
        int isoDow      = date.get(iso.dayOfWeek()); // 1=Mon..7=Sun

        // Replacement order matters: replace longer tokens before shorter
        // overlapping ones (DDD before DD before D, Www, etc.). When `Www`
        // is present, YYYY refers to the ISO week-based year, not Gregorian.
        boolean hasIsoWeek = pattern.contains("Www");
        String result = pattern;
        result = result.replace("YYYY", String.format("%04d", hasIsoWeek ? isoWeekYear : date.getYear()));
        result = result.replace("MM", String.format("%02d", date.getMonthValue()));
        result = result.replace("DDD", String.format("%03d", date.getDayOfYear()));
        result = result.replace("DD", String.format("%02d", date.getDayOfMonth()));
        result = result.replace("Www", "W" + String.format("%02d", isoWeek));
        // Single-letter D last — and only if pattern was an ISO week format.
        if (hasIsoWeek) {
            result = result.replace("D", String.valueOf(isoDow));
        }
        return result;
    }

    /**
     * Format a COBOL datetime pattern.
     */
    private static String formatCobolDateTime(String pattern, java.time.LocalDateTime dt, int offsetMins) {
        // Z-marker means "emit UTC". Convert local-time + offset to UTC first.
        if (pattern.contains("Z") && offsetMins != 0) {
            dt = dt.minusMinutes(offsetMins);
        }
        // ISO week-based fields and order-dependent replacements (DDD before DD).
        java.time.temporal.WeekFields iso = java.time.temporal.WeekFields.ISO;
        boolean hasIsoWeek = pattern.contains("Www");
        int isoWeekYear = dt.toLocalDate().get(iso.weekBasedYear());
        int isoWeek     = dt.toLocalDate().get(iso.weekOfWeekBasedYear());
        int isoDow      = dt.toLocalDate().get(iso.dayOfWeek());

        // FIRST: substitute the timezone-offset placeholders `+hhmm` / `-hhmm`
        // with the resolved offset string. We do this before substituting bare
        // hh/mm so the offset's `hh`/`mm` aren't eaten by the hour/minute
        // replacements. Note: `+hh:mm` is also valid; handle both.
        String offStr;
        {
            String sign = offsetMins >= 0 ? "+" : "-";
            int absOff = Math.abs(offsetMins);
            offStr = sign + String.format("%02d%02d", absOff / 60, absOff % 60);
        }
        String result = pattern
                .replace("+hh:mm", offsetMins >= 0
                        ? String.format("+%02d:%02d", offsetMins / 60, offsetMins % 60)
                        : String.format("-%02d:%02d", -offsetMins / 60, -offsetMins % 60))
                .replace("+hhmm", offStr)
                .replace("-hhmm", offStr);

        result = result.replace("YYYY", String.format("%04d", hasIsoWeek ? isoWeekYear : dt.getYear()));
        result = result.replace("MM", String.format("%02d", dt.getMonthValue()));
        // DDD before DD (longer patterns first)
        result = result.replace("DDD", String.format("%03d", dt.getDayOfYear()));
        result = result.replace("DD", String.format("%02d", dt.getDayOfMonth()));
        result = result.replace("Www", "W" + String.format("%02d", isoWeek));
        if (hasIsoWeek) {
            // Single-D = ISO day-of-week, but only inside an ISO week pattern;
            // skip "DT" since T is the time separator.
            result = result.replace("D", String.valueOf(isoDow));
        }
        result = result.replace("hh", String.format("%02d", dt.getHour()));
        result = result.replace("mm", String.format("%02d", dt.getMinute()));
        // Handle fractional seconds (ss.ssssss or ss,ssssss)
        int nanoDigits = 0;
        int ssIdx = result.indexOf("ss");
        if (ssIdx >= 0) {
            String after = result.substring(ssIdx + 2);
            char sepChar = '.';
            if (after.startsWith(".") || after.startsWith(",")) {
                sepChar = after.charAt(0);
                String fracPart = "";
                for (int i = 1; i < after.length(); i++) {
                    if (after.charAt(i) == 's') { nanoDigits++; fracPart += "s"; }
                    else break;
                }
                String nanos = String.format("%09d", dt.getNano());
                String frac = nanos.substring(0, Math.min(nanoDigits, 9));
                while (frac.length() < nanoDigits) frac += "0";
                result = result.substring(0, ssIdx) + String.format("%02d", dt.getSecond()) + sepChar + frac + after.substring(1 + nanoDigits);
            } else {
                result = result.substring(0, ssIdx) + String.format("%02d", dt.getSecond()) + after;
            }
        }
        // Z marker stays as literal 'Z' — input was already converted to UTC above.
        return result;
    }
}
