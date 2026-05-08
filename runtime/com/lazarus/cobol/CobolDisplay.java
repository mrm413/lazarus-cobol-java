package com.lazarus.cobol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * COBOL DISPLAY and ACCEPT verb implementations.
 */
public class CobolDisplay {

    private static boolean decimalPointIsComma = false;
    /** Default mode: no $SET DPC-IN-DATA directive in source.
     *  GnuCOBOL semantics: XML honors DECIMAL-POINT IS COMMA by default; JSON does not. */
    private static String dpcInDataMode = "DEFAULT";

    public static void setDecimalPointIsComma(boolean value) {
        decimalPointIsComma = value;
    }

    public static boolean isDecimalPointIsComma() {
        return decimalPointIsComma;
    }

    /** $SET DPC-IN-DATA "MODE" — "DEFAULT"|"ALL"|"JSON"|"XML".
     *  "JSON": only JSON honors dpic (XML opts out).
     *  "XML": only XML honors dpic (JSON unchanged).
     *  "ALL": both honor dpic.
     *  "DEFAULT" (no directive): XML honors dpic; JSON does not. */
    public static void setDpcInDataMode(String mode) {
        dpcInDataMode = (mode == null || mode.isEmpty()) ? "DEFAULT" : mode.toUpperCase();
    }

    public static String getDpcInDataMode() { return dpcInDataMode; }

    /** True when XML GENERATE should swap '.' for ',' under DECIMAL-POINT IS COMMA. */
    public static boolean dpicAppliesToXml() {
        // XML always honors dpic when DECIMAL-POINT IS COMMA — DPC-IN-DATA only adds JSON
        return decimalPointIsComma && !dpcInDataMode.equals("NONE");
    }

    /** True when JSON GENERATE should swap '.' for ',' under DECIMAL-POINT IS COMMA. */
    public static boolean dpicAppliesToJson() {
        // JSON only honors dpic when explicitly enabled via DPC-IN-DATA "JSON" or "ALL"
        return decimalPointIsComma && (dpcInDataMode.equals("JSON") || dpcInDataMode.equals("ALL"));
    }

    static String applyDpic(String s) {
        if (!decimalPointIsComma) return s;
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '.') sb.append(',');
            else if (c == ',') sb.append('.');
            else sb.append(c);
        }
        return sb.toString();
    }

    public static void display(Object... items) {
        StringBuilder sb = new StringBuilder();
        for (Object item : items) {
            if (item instanceof CobolNational) {
                sb.append(((CobolNational) item).toDisplayString());
            } else {
                sb.append(String.valueOf(item));
            }
        }
        System.out.println(sb.toString());
    }

    public static void displayNoAdvancing(Object... items) {
        StringBuilder sb = new StringBuilder();
        for (Object item : items) {
            if (item instanceof CobolNational) {
                sb.append(((CobolNational) item).toDisplayString());
            } else {
                sb.append(String.valueOf(item));
            }
        }
        System.out.print(sb.toString());
    }

    // ── SCREEN SECTION rendering ────────────────────────────────────────
    //
    // Generated code accumulates a list of `ScreenItem` records (one per
    // SCREEN SECTION leaf with a VALUE/FROM expression) then calls
    // `displayScreen(items)` which writes ANSI cursor-positioning + literal
    // text to stdout. The Rust parity runner pipes that through a vt100
    // emulator and compares the captured screen against the existing pyte
    // goldens. CobolDisplay is the ONLY emit point so behavior stays
    // consistent across screen tests.

    /** One leaf of a SCREEN SECTION render — absolute (1-based) line/col + text. */
    public static record ScreenItem(int line, int col, String text) {}

    /** ANSI cursor-position escape: `ESC [ row ; col H` with 1-based coordinates. */
    private static String ansiPos(int line, int col) {
        return "[" + Math.max(1, line) + ";" + Math.max(1, col) + "H";
    }

    /**
     * Emit a SCREEN SECTION render: clear screen, then write each item at its
     * absolute position. Items are flushed via `System.out.print` (no newline)
     * so the terminal emulator sees one continuous escape stream.
     *
     * Note: leading clear-screen (`ESC [2J ESC [H`) ensures each `DISPLAY scr`
     * starts from a clean buffer, matching GnuCOBOL's screenio behavior.
     */
    /** Default screen bounds for SCREEN SECTION rendering. Items outside
     * these bounds are silently skipped (mirrors GnuCOBOL's
     * EC-SCREEN-LINE-NUMBER / EC-SCREEN-STARTING-COLUMN exceptions which
     * suppress the offending DISPLAY). */
    private static final int SCREEN_ROWS = 25;
    private static final int SCREEN_COLS = 80;

    private static boolean inBounds(int line, int col) {
        return line >= 1 && line <= SCREEN_ROWS && col >= 1 && col <= SCREEN_COLS;
    }

    /** Render an ACCEPT-input SCREEN field. When the field is empty/blank,
     *  GnuCOBOL displays a row of underscores (or asterisks for SECURE) so the
     *  user can see where to type. After input, the actual value displays.
     *  Used by the emitter for `PIC X(N) TO|USING field` SCREEN entries. */
    public static String inputFieldPlaceholder(Object value, int size, boolean secure) {
        String s = (value == null) ? "" : String.valueOf(value);
        if (s.trim().isEmpty()) {
            char fill = secure ? '*' : '_';
            char[] buf = new char[Math.max(size, 1)];
            java.util.Arrays.fill(buf, fill);
            return new String(buf);
        }
        return s;
    }

    public static void displayScreen(java.util.List<ScreenItem> items) {
        StringBuilder sb = new StringBuilder(256);
        sb.append("[2J").append("[H"); // clear + home
        for (ScreenItem it : items) {
            if (it.text() == null || it.text().isEmpty()) continue;
            if (!inBounds(it.line(), it.col())) continue;
            sb.append(ansiPos(it.line(), it.col())).append(it.text());
        }
        System.out.print(sb.toString());
        System.out.flush();
    }

    /**
     * Append-mode screen render: writes positioned items WITHOUT clearing
     * the screen first. Used for DISPLAY &lt;literal&gt; AT LINE N COL N calls
     * that come after a DISPLAY scr so the new items overlay the existing
     * screen rather than wiping it.
     */
    public static void displayScreenAppend(java.util.List<ScreenItem> items) {
        StringBuilder sb = new StringBuilder(64);
        for (ScreenItem it : items) {
            if (it.text() == null) continue;
            if (!inBounds(it.line(), it.col())) continue;
            sb.append(ansiPos(it.line(), it.col())).append(it.text());
        }
        System.out.print(sb.toString());
        System.out.flush();
    }

    /**
     * Format a numeric literal for DISPLAY, preserving COBOL conventions:
     * - Explicit sign prefix (+/-) when hasSign is true
     * - No leading zero for values with |v| < 1 (e.g., .123 not 0.123)
     * - Integer values display without decimal point
     */
    /** Overload for long literals (values exceeding int range) */
    public static String formatNumericLiteral(long value, boolean hasSign) {
        String s = String.valueOf(value);
        if (hasSign && value >= 0) s = "+" + s;
        return applyDpic(s);
    }

    public static String formatNumericLiteral(Object value, boolean hasSign) {
        if (value instanceof java.math.BigDecimal) {
            return formatNumericLiteral(((java.math.BigDecimal) value).doubleValue(), hasSign);
        }
        if (value instanceof Number) {
            return formatNumericLiteral(((Number) value).doubleValue(), hasSign);
        }
        return String.valueOf(value);
    }

    public static String formatNumericLiteral(double value, boolean hasSign) {
        String s;
        if (value == Math.floor(value) && !Double.isInfinite(value) && Math.abs(value) < 1e15) {
            s = String.valueOf((long) value);
        } else {
            s = String.valueOf(value);
            // Remove trailing zeros after decimal (but keep at least one digit)
            if (s.contains(".") && !s.contains("E")) {
                s = s.replaceAll("0+$", "");
                if (s.endsWith(".")) s = s.substring(0, s.length() - 1);
            }
        }
        // Remove leading zero for |value| < 1
        if (s.startsWith("0.")) s = s.substring(1);
        if (s.startsWith("-0.")) s = "-" + s.substring(2);
        // Add explicit sign
        if (hasSign && value >= 0) s = "+" + s;
        return applyDpic(s);
    }

    /**
     * Format COMP-1 (FLOAT-SHORT / single-precision) for DISPLAY.
     * GnuCOBOL uses FLT_DIG+1 = 8 significant digits with %G-style formatting:
     * - Exact integers displayed without decimal point
     * - Non-scientific notation when exponent is in range [-4, 8)
     * - Trailing zeros stripped from mantissa
     */
    public static String formatFloatShort(Object value) {
        float f;
        if (value instanceof Float) f = (Float) value;
        else if (value instanceof Number) f = ((Number) value).floatValue();
        else {
            try { f = Float.parseFloat(String.valueOf(value).trim()); }
            catch (Exception e) { return String.valueOf(value); }
        }
        if (Float.isNaN(f) || Float.isInfinite(f)) return String.valueOf(f);
        // GnuCOBOL COMP-1: exact integers within safe float range display as integer
        double d = (double) f;
        if (d == Math.floor(d) && Math.abs(d) < 1.0E8) {
            return String.valueOf((long) d);
        }
        // Use FLT_DIG+1 = 8 significant digits, G-style (no sci notation for exp < 8)
        String s = String.format("%.8G", d);
        int eIdx = s.indexOf('E');
        if (eIdx >= 0) {
            String mantissa = s.substring(0, eIdx);
            String exponent = s.substring(eIdx);
            mantissa = mantissa.replaceAll("0+$", "");
            if (mantissa.endsWith(".")) mantissa += "0"; // keep at least .0 like GnuCOBOL
            s = mantissa + exponent;
        } else if (s.contains(".")) {
            s = s.replaceAll("0+$", "");
            if (s.endsWith(".")) s = s.substring(0, s.length() - 1);
        }
        return s;
    }

    /**
     * Format COMP-2 (FLOAT-LONG / double-precision) for DISPLAY.
     * GnuCOBOL uses DBL_DIG=15 significant digits with E+XXX format.
     * Special handling for extreme IEEE 754 boundary values where Java's
     * printf rounding differs from C's glibc printf.
     */
    public static String formatFloatLong(Object value) {
        double d;
        if (value instanceof Double) d = (Double) value;
        else if (value instanceof Number) d = ((Number) value).doubleValue();
        else {
            try { d = Double.parseDouble(String.valueOf(value).trim()); }
            catch (Exception e) { return String.valueOf(value); }
        }
        // GnuCOBOL displays FLOAT-LONG values as plain integers when the value
        // is an exact integer within safe range, otherwise uses scientific notation.
        if (d == Math.floor(d) && !Double.isInfinite(d) && !Double.isNaN(d)
            && Math.abs(d) < 1.0E15) {
            long lv = (long) d;
            return String.valueOf(lv);
        }
        // GnuCOBOL's C runtime formats Double.MAX_VALUE with a specific string
        // that differs from Java's printf rounding. Match GnuCOBOL exactly.
        if (d == Double.MAX_VALUE) return "1.79769313486225E+308";
        if (d == -Double.MAX_VALUE) return "-1.79769313486225E+308";
        // Use %.16G: 16 significant digits with G-format (decimal notation for |exp| < 16)
        String s = String.format("%.16G", d);
        // %G uses uppercase E; strip trailing zeros after decimal
        int eIdx = s.indexOf('E');
        if (eIdx >= 0) {
            String mantissa = s.substring(0, eIdx);
            String exponent = s.substring(eIdx);
            if (mantissa.contains(".")) {
                mantissa = mantissa.replaceAll("0+$", "");
                if (mantissa.endsWith(".")) mantissa = mantissa.substring(0, mantissa.length() - 1);
            }
            // Normalize exponent: E+01 → E+01 (keep GnuCOBOL style)
            s = mantissa + exponent;
        } else if (s.contains(".")) {
            s = s.replaceAll("0+$", "");
            if (s.endsWith(".")) s = s.substring(0, s.length() - 1);
        }
        return s;
    }

    /**
     * Format a BigDecimal for DISPLAY as FLOAT-DECIMAL-16 or FLOAT-DECIMAL-34.
     * GnuCOBOL displays these with full significant digits, no trailing zeros,
     * in plain decimal notation (no scientific notation).
     * @param value  the BigDecimal value
     * @param sigDigits  significant digits (16 for FLOAT-DECIMAL-16, 34 for FLOAT-DECIMAL-34)
     */
    public static String formatFloatDecimal(Object value, int sigDigits) {
        java.math.BigDecimal bd;
        if (value instanceof java.math.BigDecimal) {
            bd = (java.math.BigDecimal) value;
        } else if (value instanceof Number) {
            try { bd = new java.math.BigDecimal(((Number) value).toString()); }
            catch (Exception e) { return String.valueOf(value); }
        } else {
            try { bd = new java.math.BigDecimal(String.valueOf(value).trim()); }
            catch (Exception e) { return String.valueOf(value); }
        }
        // Round to sigDigits significant figures with IEEE 754 HALF_EVEN (matches GnuCOBOL Decimal64/128)
        bd = bd.round(new java.math.MathContext(sigDigits, java.math.RoundingMode.HALF_EVEN));
        bd = bd.stripTrailingZeros();
        int scale = bd.scale();
        // Overflow: value is integer × 10^n (negative scale) → use GnuCOBOL's "99E369" format
        if (scale < 0) {
            return bd.unscaledValue().toString() + "E" + (-scale);
        }
        // Underflow: very small number needing many leading zeros → use "99E-398" format
        if (scale > sigDigits + 50) {
            return bd.unscaledValue().toString() + "E-" + scale;
        }
        return bd.toPlainString();
    }

    /**
     * Format a numeric value for DISPLAY using COBOL PIC clause rules.
     * @param value the numeric value
     * @param totalDigits total digits in PIC (integer + decimal)
     * @param decimalDigits digits after V (decimal places)
     * @param signed whether PIC is signed (S prefix)
     */
    public static String formatPic(Object value, int totalDigits, int decimalDigits, boolean signed) {
        return formatPic(value, totalDigits, decimalDigits, signed, null);
    }

    /** Unsigned absolute display for numeric-vs-alphanumeric comparisons.
     *  COBOL standard: numeric compared to non-numeric uses unsigned display. */
    public static String formatPicUnsigned(Object value, int totalDigits, int decimalDigits) {
        java.math.BigDecimal bd;
        try {
            bd = new java.math.BigDecimal(String.valueOf(value).trim()).abs();
        } catch (Exception e) {
            bd = java.math.BigDecimal.ZERO;
        }
        bd = bd.setScale(decimalDigits, java.math.RoundingMode.HALF_UP);
        String plain = bd.toPlainString();
        int dot = plain.indexOf('.');
        String intPart, decPart;
        if (dot >= 0) { intPart = plain.substring(0, dot); decPart = plain.substring(dot + 1); }
        else { intPart = plain; decPart = ""; }
        int intDigits = totalDigits - decimalDigits;
        if (intPart.length() > intDigits) intPart = intPart.substring(intPart.length() - intDigits);
        while (intPart.length() < intDigits) intPart = "0" + intPart;
        if (decPart.length() > decimalDigits) decPart = decPart.substring(0, decimalDigits);
        while (decPart.length() < decimalDigits) decPart = decPart + "0";
        return intPart + decPart;
    }

    /**
     * Format a numeric value for DISPLAY using COBOL PIC clause rules.
     * GnuCOBOL DISPLAY of numeric fields shows explicit sign and decimal point.
     * @param value the numeric value
     * @param totalDigits total digits in PIC (integer + decimal)
     * @param decimalDigits digits after V (decimal places)
     * @param signed whether PIC is signed (S prefix)
     * @param signPosition "LEADING" or "TRAILING" — where to place the sign character
     */
    public static String formatPic(Object value, int totalDigits, int decimalDigits, boolean signed, String signPosition) {
        java.math.BigDecimal bd;
        try {
            // For unsigned PIC, reinterpret negative values from signed Java
            // primitives as their unsigned bit pattern. byte→8-bit, short→16-bit,
            // int→32-bit, long→64-bit. Needed for COMP-X / COMP-5 / BINARY-CHAR
            // UNSIGNED where Java's signed primitives wrap on the high bit.
            if (!signed && value instanceof Byte && ((Byte) value) < 0) {
                bd = new java.math.BigDecimal(((Byte) value) & 0xFF);
            } else if (!signed && value instanceof Short && ((Short) value) < 0) {
                bd = new java.math.BigDecimal(((Short) value) & 0xFFFF);
            } else if (!signed && value instanceof Integer && ((Integer) value) < 0) {
                bd = new java.math.BigDecimal(((Integer) value) & 0xFFFFFFFFL);
            } else if (!signed && value instanceof Long && ((Long) value) < 0) {
                bd = new java.math.BigDecimal(Long.toUnsignedString((Long) value));
            } else {
                bd = new java.math.BigDecimal(String.valueOf(value).trim());
            }
        } catch (Exception e) {
            bd = java.math.BigDecimal.ZERO;
        }
        boolean neg = bd.signum() < 0;
        bd = bd.abs();
        // Scale to decimal digits
        bd = bd.setScale(decimalDigits, java.math.RoundingMode.HALF_UP);
        String plain = bd.toPlainString();
        // Split integer and decimal parts
        int dot = plain.indexOf('.');
        String intPart, decPart;
        if (dot >= 0) {
            intPart = plain.substring(0, dot);
            decPart = plain.substring(dot + 1);
        } else {
            intPart = plain;
            decPart = "";
        }
        int intDigits = totalDigits - decimalDigits;
        // Truncate integer part to PIC size (high-order truncation, COBOL standard)
        if (intPart.length() > intDigits) intPart = intPart.substring(intPart.length() - intDigits);
        // Pad integer part with leading zeros
        while (intPart.length() < intDigits) intPart = "0" + intPart;
        // Truncate decimal part to PIC scale (low-order truncation)
        if (decPart.length() > decimalDigits) decPart = decPart.substring(0, decimalDigits);
        // Pad decimal part with trailing zeros
        while (decPart.length() < decimalDigits) decPart = decPart + "0";
        String sp = signPosition != null ? signPosition.toUpperCase() : "";
        // DISPLAY verb always shows decimal point when PIC has V (decimalDigits > 0)
        boolean showDot = decimalDigits > 0;
        StringBuilder body = new StringBuilder();
        body.append(intPart);
        if (decimalDigits > 0) { if (showDot) body.append('.'); body.append(decPart); }
        // SEPARATE_LEADING / SEPARATE_TRAILING: explicit +/- for SIGN IS SEPARATE
        if (signed && sp.equals("SEPARATE_LEADING")) {
            return applyDpic((neg ? "-" : "+") + body);
        }
        if (signed && sp.equals("SEPARATE_TRAILING")) {
            return applyDpic(body.toString() + (neg ? "-" : "+"));
        }
        // LEADING / TRAILING: explicit +/- prefix/suffix (for COMP/PACKED/BINARY usage)
        if (signed && sp.equals("LEADING")) {
            return applyDpic((neg ? "-" : "+") + body);
        }
        if (signed && sp.equals("TRAILING")) {
            return applyDpic(body.toString() + (neg ? "-" : "+"));
        }
        // Default (no signPosition or empty): USAGE DISPLAY — sign embedded in last digit
        if (signed) {
            // ASCII overpunch encoding on LAST digit (GnuCOBOL ASCII default).
            // Positive: digits unchanged (no overpunch glyph)
            // Negative: 0='p', 1='q', 2='r', 3='s', 4='t', 5='u', 6='v', 7='w', 8='x', 9='y'
            // (EBCDIC overpunch uses {ABCDEFGHI / }JKLMNOPQR but is opt-in via codeset.)
            String digits = body.toString();
            // Find the last digit character in the body (skip decimal point)
            int lastDigitIdx = -1;
            for (int di = digits.length() - 1; di >= 0; di--) {
                if (digits.charAt(di) >= '0' && digits.charAt(di) <= '9') {
                    lastDigitIdx = di;
                    break;
                }
            }
            if (lastDigitIdx < 0) {
                return applyDpic((neg ? "-" : "+") + digits);
            }
            int lastDigit = digits.charAt(lastDigitIdx) - '0';
            if (neg) {
                char overpunch = "pqrstuvwxy".charAt(lastDigit);
                return applyDpic(digits.substring(0, lastDigitIdx) + overpunch + digits.substring(lastDigitIdx + 1));
            }
            // Positive: digits unchanged.
            return applyDpic(digits);
        }
        // Unsigned: digits with decimal point
        return applyDpic(body.toString());
    }

    /**
     * Format a numeric value with PPP scaling positions for DISPLAY.
     * 999PPP (scalingLeft=false): stored 091 displays as "091000" (implied trailing zeros)
     * PPP999 (scalingLeft=true): stored 091 displays as "000091" (the scaling shifts decimal)
     * @param value the stored numeric value
     * @param totalDigits stored digit positions (e.g. 3 for PIC 999PPP)
     * @param scalingPositions number of P positions
     * @param scalingLeft true if PPP is before digits
     * @param signed whether PIC has S
     */
    public static String formatPicScaled(Object value, int totalDigits, int scalingPositions, boolean scalingLeft, boolean signed) {
        java.math.BigDecimal bd;
        try {
            bd = new java.math.BigDecimal(String.valueOf(value).trim());
        } catch (Exception e) {
            bd = java.math.BigDecimal.ZERO;
        }
        boolean neg = bd.signum() < 0;
        bd = bd.abs();

        if (!scalingLeft) {
            // 999PPP = right scaling: BigDecimal holds actual value (e.g., 91000).
            // To display: divide by 10^scalingPositions → stored digits (091),
            // then display stored digits + P implied zeros = "091000"
            java.math.BigDecimal divisor = java.math.BigDecimal.TEN.pow(scalingPositions);
            java.math.BigDecimal storedVal = bd.divideToIntegralValue(divisor);
            String digits = storedVal.toBigInteger().toString();
            // Pad/truncate to totalDigits
            while (digits.length() < totalDigits) digits = "0" + digits;
            if (digits.length() > totalDigits) digits = digits.substring(digits.length() - totalDigits);
            // Append implied trailing zeros
            StringBuilder sb = new StringBuilder();
            if (signed) sb.append(neg ? '-' : '+');
            sb.append(digits);
            for (int i = 0; i < scalingPositions; i++) sb.append('0');
            return applyDpic(sb.toString());
        } else {
            // VPPP999 = left scaling: BigDecimal holds actual value (e.g., 0.000128).
            // Display as ".000128" — move decimal point right by (scalingPositions + totalDigits),
            // then format as: "." + scalingPositions zeros + totalDigits stored digits
            java.math.BigDecimal shifted = bd.movePointRight(scalingPositions + totalDigits);
            String digits = shifted.setScale(0, java.math.RoundingMode.HALF_UP).toBigInteger().toString();
            while (digits.length() < totalDigits) digits = "0" + digits;
            if (digits.length() > totalDigits) digits = digits.substring(digits.length() - totalDigits);
            StringBuilder sb = new StringBuilder();
            if (signed) sb.append(neg ? '-' : '+');
            sb.append('.');
            for (int i = 0; i < scalingPositions; i++) sb.append('0');
            sb.append(digits);
            return applyDpic(sb.toString());
        }
    }

    /**
     * Format a COMP-5 (native binary) P-field for DISPLAY.
     * COMP-5 displays the stored value (divided by scaling) padded to
     * the binary capacity digit width, NOT the PIC digit width.
     * @param value the actual numeric value (e.g., 91000 for PIC 999PPP COMP-5)
     * @param totalDigits stored digit positions from PIC (e.g., 3 for PIC 999PPP)
     * @param scalingPositions number of P positions
     * @param scalingLeft true if PPP is before digits
     * @param signed whether PIC has S
     */
    public static String formatPicScaledComp5(Object value, int totalDigits, int scalingPositions, boolean scalingLeft, boolean signed) {
        java.math.BigDecimal bd;
        try {
            bd = new java.math.BigDecimal(String.valueOf(value).trim());
        } catch (Exception e) {
            bd = java.math.BigDecimal.ZERO;
        }
        boolean neg = bd.signum() < 0;
        bd = bd.abs();

        // Determine binary capacity based on PIC digit count (just the 9s, not the Ps)
        int binaryCapacityDigits;
        if (totalDigits <= 2) binaryCapacityDigits = 3;       // 1 byte: 0-255
        else if (totalDigits <= 4) binaryCapacityDigits = 5;   // 2 bytes: 0-65535
        else if (totalDigits <= 9) binaryCapacityDigits = 10;  // 4 bytes: 0-4294967295
        else binaryCapacityDigits = 20;                         // 8 bytes

        String digits;
        if (!scalingLeft) {
            // Right scaling: divide by 10^sp to get stored value
            java.math.BigDecimal divisor = java.math.BigDecimal.TEN.pow(scalingPositions);
            java.math.BigDecimal storedVal = bd.divideToIntegralValue(divisor);
            digits = storedVal.toBigInteger().toString();
        } else {
            // Left scaling: shift right by sp+td to get stored digits
            java.math.BigDecimal shifted = bd.movePointRight(scalingPositions + totalDigits);
            digits = shifted.setScale(0, java.math.RoundingMode.HALF_UP).toBigInteger().toString();
        }
        // Pad to binary capacity width
        while (digits.length() < binaryCapacityDigits) digits = "0" + digits;
        if (digits.length() > binaryCapacityDigits) digits = digits.substring(digits.length() - binaryCapacityDigits);

        StringBuilder sb = new StringBuilder();
        if (signed) sb.append(neg ? '-' : '+');
        sb.append(digits);
        return applyDpic(sb.toString());
    }

    /**
     * Format a numeric value using a COBOL PIC edit pattern.
     * Handles: Z (zero suppress), * (check protect), + - CR DB (sign),
     * $ (currency), B (blank), 0 (zero insert), / (slash insert), , . (decimal/comma)
     */
    public static String formatEdited(Object value, String pic) {
        return formatEdited(value, pic, null);
    }

    public static String formatEdited(Object value, String pic, String currencySign) {
        // If custom currency sign, replace it with $ in the PIC for standard processing
        String effectivePic = pic;
        char csChar = '$';
        if (currencySign != null && !currencySign.isEmpty()) {
            csChar = currencySign.charAt(0);
            if (csChar != '$') {
                effectivePic = pic.replace(csChar, '$');
            }
        }
        // Expand PIC: convert (n) repetitions
        String expanded = expandPic(effectivePic);

        // Detect alpha-edited pattern: if PIC contains X or A as character positions,
        // use alpha-edited formatting (character-by-character placement)
        boolean hasAlphaPos = false;
        String expUpper = expanded.toUpperCase();
        for (int i = 0; i < expUpper.length(); i++) {
            char c = expUpper.charAt(i);
            if (c == 'X' || c == 'A') { hasAlphaPos = true; break; }
        }
        if (hasAlphaPos) {
            return formatAlphaEdited(value, expanded);
        }

        java.math.BigDecimal bd;
        try {
            bd = new java.math.BigDecimal(String.valueOf(value).trim());
        } catch (Exception e) {
            bd = java.math.BigDecimal.ZERO;
        }
        boolean neg = bd.signum() < 0;
        bd = bd.abs();

        // Count occurrences of +, -, $ to distinguish fixed (1x) vs floating (2+x)
        int plusCount = 0, minusCount = 0, dollarCount = 0;
        for (int i = 0; i < expanded.length(); i++) {
            char c = Character.toUpperCase(expanded.charAt(i));
            if (c == '+') plusCount++;
            else if (c == '-') minusCount++;
            else if (c == '$') dollarCount++;
        }
        // Fixed signs/currency are NOT digit positions
        boolean plusIsDigit = plusCount >= 2;
        boolean minusIsDigit = minusCount >= 2;
        boolean dollarIsDigit = dollarCount >= 2;

        // Count decimal digits (after V or .)
        int decPos = -1;
        int decDigits = 0;
        for (int i = 0; i < expanded.length(); i++) {
            char c = Character.toUpperCase(expanded.charAt(i));
            if (c == 'V' || c == '.') { decPos = i; }
            else if (decPos >= 0 && isRealDigitPos(c, plusIsDigit, minusIsDigit, dollarIsDigit)) decDigits++;
        }

        // Count integer digit positions
        int intDigits = 0;
        for (int i = 0; i < expanded.length(); i++) {
            char c = Character.toUpperCase(expanded.charAt(i));
            if (decPos >= 0 && i >= decPos) break;
            if (isRealDigitPos(c, plusIsDigit, minusIsDigit, dollarIsDigit)) intDigits++;
        }

        // Format the number to get digit string — COBOL uses truncation (DOWN) by default
        bd = bd.setScale(decDigits, java.math.RoundingMode.DOWN);
        // After rounding, zero is non-negative
        if (bd.signum() == 0) neg = false;
        String plain = bd.toPlainString();
        int dot = plain.indexOf('.');
        String intPart = dot >= 0 ? plain.substring(0, dot) : plain;
        String decPart = dot >= 0 ? plain.substring(dot + 1) : "";
        while (intPart.length() < intDigits) intPart = "0" + intPart;
        if (intPart.length() > intDigits) intPart = intPart.substring(intPart.length() - intDigits);
        while (decPart.length() < decDigits) decPart = decPart + "0";

        // Now fill the edit pattern
        String allDigits = intPart + decPart;
        int digitIdx = 0;
        StringBuilder result = new StringBuilder();
        boolean pastDecimal = false;
        boolean seenSignificant = false;
        boolean isAllZero = bd.signum() == 0;

        // Determine float character (first repeated sign/currency/suppress char)
        char floatChar = 0;
        if (plusIsDigit) floatChar = '+';
        else if (minusIsDigit) floatChar = '-';
        else if (dollarIsDigit) floatChar = '$';
        else {
            for (int i = 0; i < expanded.length(); i++) {
                char c = Character.toUpperCase(expanded.charAt(i));
                if ((c == 'Z' || c == '*') && isDigitPos(c)) { floatChar = c; break; }
            }
        }

        // Pre-analyze: does PIC have any '9' positions? (affects fixed sign behavior)
        boolean has9 = expanded.toUpperCase().indexOf('9') >= 0;
        boolean seenCheckProtect = false; // true after we've output a * for zero-suppress

        for (int i = 0; i < expanded.length(); i++) {
            char c = expanded.charAt(i);
            char uc = Character.toUpperCase(c);

            if (uc == 'V') {
                pastDecimal = true;
                continue; // V is implicit, no output
            }

            if (uc == '9') {
                char d = digitIdx < allDigits.length() ? allDigits.charAt(digitIdx++) : '0';
                result.append(d);
                if (d != '0') seenSignificant = true;
            } else if (uc == 'Z') {
                char d = digitIdx < allDigits.length() ? allDigits.charAt(digitIdx++) : '0';
                if (d != '0' || seenSignificant || pastDecimal) {
                    result.append(d);
                    seenSignificant = true;
                } else {
                    result.append(' ');
                }
            } else if (uc == '*') {
                char d = digitIdx < allDigits.length() ? allDigits.charAt(digitIdx++) : '0';
                if (d != '0' || seenSignificant || pastDecimal) {
                    result.append(d);
                    seenSignificant = true;
                } else {
                    result.append('*');
                    seenCheckProtect = true;
                }
            } else if (uc == '+') {
                if (!plusIsDigit) {
                    // Fixed sign: leading (before digits) always shows, trailing shows if significant or has 9
                    boolean isLeading = (digitIdx == 0);
                    if (isLeading || seenSignificant || has9) result.append(neg ? '-' : '+');
                    else result.append(' ');
                } else {
                    // Floating + digit position
                    char d = digitIdx < allDigits.length() ? allDigits.charAt(digitIdx++) : '0';
                    boolean lastFloat = (floatChar == '+') && isLastFloatPos(expanded, i);
                    if (d != '0' || seenSignificant || pastDecimal) {
                        if (!seenSignificant) {
                            // First significant: sign at previous pos, digit here
                            replaceLastSuppressed(result, neg ? '-' : '+');
                            result.append(d);
                        } else {
                            result.append(d);
                        }
                        seenSignificant = true;
                    } else if (lastFloat) {
                        result.append(neg ? '-' : '+');
                        seenSignificant = true;
                    } else {
                        result.append(' ');
                    }
                }
            } else if (uc == '-') {
                if (!minusIsDigit) {
                    // Fixed sign: leading always shows, trailing shows if significant or has 9
                    boolean isLeading = (digitIdx == 0);
                    if (isLeading || seenSignificant || has9) result.append(neg ? '-' : ' ');
                    else result.append(' ');
                } else {
                    // Floating - digit position
                    char d = digitIdx < allDigits.length() ? allDigits.charAt(digitIdx++) : '0';
                    boolean lastFloat = (floatChar == '-') && isLastFloatPos(expanded, i);
                    if (d != '0' || seenSignificant || pastDecimal) {
                        if (!seenSignificant) {
                            replaceLastSuppressed(result, neg ? '-' : ' ');
                            result.append(d);
                        } else {
                            result.append(d);
                        }
                        seenSignificant = true;
                    } else if (lastFloat) {
                        if (neg) result.append('-');
                        else result.append(' ');
                        seenSignificant = true;
                    } else {
                        result.append(' ');
                    }
                }
            } else if (uc == '$') {
                if (!dollarIsDigit) {
                    // Fixed currency symbol — always shows $
                    result.append('$');
                } else {
                    // Floating $ digit position
                    char d = digitIdx < allDigits.length() ? allDigits.charAt(digitIdx++) : '0';
                    boolean lastFloat = (floatChar == '$') && isLastFloatPos(expanded, i);
                    if (d != '0' || seenSignificant || pastDecimal) {
                        if (!seenSignificant) {
                            replaceLastSuppressed(result, '$');
                            result.append(d);
                        } else {
                            result.append(d);
                        }
                        seenSignificant = true;
                    } else if (lastFloat) {
                        result.append('$');
                        seenSignificant = true;
                    } else {
                        result.append(' ');
                    }
                }
            } else if (uc == '.') {
                pastDecimal = true;
                result.append('.');
                seenSignificant = true;
            } else if (uc == ',') {
                if (seenSignificant) result.append(',');
                else if (floatChar == '*') result.append('*');
                else result.append(' ');
            } else if (uc == 'B') {
                // B in check-protect zone shows * only after we've actually output * chars
                if (seenCheckProtect && !seenSignificant) result.append('*');
                else result.append(' ');
            } else if (uc == '0') {
                result.append('0');
            } else if (uc == '/') {
                result.append('/');
            } else {
                result.append(c); // CR, DB, etc.
            }
        }

        // Handle trailing sign indicators
        String res = result.toString();
        if (expanded.toUpperCase().endsWith("CR")) {
            res = res.substring(0, res.length() - 2) + (neg ? "CR" : "  ");
        } else if (expanded.toUpperCase().endsWith("DB")) {
            res = res.substring(0, res.length() - 2) + (neg ? "DB" : "  ");
        }

        // Restore custom currency sign in output (we replaced it with $ for processing)
        if (csChar != '$') {
            res = res.replace('$', csChar);
        }
        return applyDpic(res);
    }

    /**
     * Format alpha-edited pattern: X and A positions take one character each
     * from the source string (left-to-right). B inserts space, 0 inserts '0',
     * / inserts '/'. Source is first converted to its string representation.
     */
    private static String formatAlphaEdited(Object value, String expanded) {
        String src = String.valueOf(value);
        // For numeric sources, strip leading sign characters (+/-) before alpha editing.
        // COBOL MOVE numeric to alpha-edited uses the unsigned display representation.
        if (src.length() > 0 && (src.charAt(0) == '+' || src.charAt(0) == '-')) {
            // Check if remainder is numeric (indicating this is a signed numeric value)
            String rest = src.substring(1).trim();
            boolean isNumeric = !rest.isEmpty();
            for (int i = 0; i < rest.length() && isNumeric; i++) {
                char c = rest.charAt(i);
                if (c != '.' && (c < '0' || c > '9')) isNumeric = false;
            }
            if (isNumeric) {
                src = rest;
            }
        }
        // When source is a raw numeric type (Integer/Long — from numeric literals),
        // zero-pad to the number of character positions in the PIC.
        // Field values arrive as pre-formatted strings via moveNumericToAlpha.
        if (value instanceof Integer || value instanceof Long) {
            int charPositions = 0;
            for (int i = 0; i < expanded.length(); i++) {
                char uc = Character.toUpperCase(expanded.charAt(i));
                if (uc == 'X' || uc == 'A' || uc == '9') charPositions++;
            }
            while (src.length() < charPositions) src = "0" + src;
        }
        StringBuilder result = new StringBuilder();
        int srcIdx = 0;
        for (int i = 0; i < expanded.length(); i++) {
            char c = expanded.charAt(i);
            char uc = Character.toUpperCase(c);
            if (uc == 'X' || uc == 'A' || uc == '9') {
                // Character position: take next char from source
                if (srcIdx < src.length()) {
                    result.append(src.charAt(srcIdx++));
                } else {
                    result.append(' ');
                }
            } else if (uc == 'B') {
                result.append(' ');
            } else if (uc == '0') {
                result.append('0');
            } else if (uc == '/') {
                result.append('/');
            } else {
                // Other insertion characters
                result.append(c);
            }
        }
        return result.toString();
    }

    /** Replace the last suppressed (space) character with the sign/currency char */
    private static void replaceLastSuppressed(StringBuilder sb, char signChar) {
        for (int k = sb.length() - 1; k >= 0; k--) {
            if (sb.charAt(k) == ' ') {
                sb.setCharAt(k, signChar);
                return;
            }
        }
        // No space found — prepend (shouldn't happen with well-formed PIC)
    }

    /** Check if position i is the last floating edit position (next digit pos is 9 or different type) */
    private static boolean isLastFloatPos(String expanded, int i) {
        char uc = Character.toUpperCase(expanded.charAt(i));
        for (int j = i + 1; j < expanded.length(); j++) {
            char nc = Character.toUpperCase(expanded.charAt(j));
            if (nc == '9') return true;
            if (nc == uc) return false; // more of the same float char
            if (isDigitPos(nc) && nc != uc) return true; // different digit pos = end of float
        }
        return true; // last position in string
    }

    /** Check if char is a digit position considering fixed vs floating */
    private static boolean isRealDigitPos(char c, boolean plusIsDigit, boolean minusIsDigit, boolean dollarIsDigit) {
        c = Character.toUpperCase(c);
        if (c == '9' || c == 'Z' || c == '*') return true;
        if (c == '+') return plusIsDigit;
        if (c == '-') return minusIsDigit;
        if (c == '$') return dollarIsDigit;
        return false;
    }

    private static boolean isDigitPos(char c) {
        c = Character.toUpperCase(c);
        return c == '9' || c == 'Z' || c == '*' || c == '+' || c == '-' || c == '$';
    }

    static String expandPic(String pic) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pic.length(); i++) {
            char c = pic.charAt(i);
            if (i + 1 < pic.length() && pic.charAt(i + 1) == '(') {
                int close = pic.indexOf(')', i + 2);
                if (close > i + 2) {
                    int count = Integer.parseInt(pic.substring(i + 2, close));
                    for (int j = 0; j < count; j++) sb.append(c);
                    i = close;
                    continue;
                }
            }
            sb.append(c);
        }
        return applyDpic(sb.toString());
    }

    /**
     * Format a POINTER value for DISPLAY.
     * COBOL displays POINTERs as hexadecimal with 0x prefix.
     * Uses 8-digit (32-bit) hex format for compatibility.
     */
    public static String formatPointer(long ptr) {
        return String.format("0x%08x", ptr);
    }

    /**
     * BLANK WHEN ZERO: if all digit chars are zero, return spaces.
     */
    public static String blankWhenZero(String formatted, int size) {
        for (int i = 0; i < formatted.length(); i++) {
            char c = formatted.charAt(i);
            if (c >= '1' && c <= '9') return formatted;
        }
        char[] spaces = new char[size];
        java.util.Arrays.fill(spaces, ' ');
        return new String(spaces);
    }

    /**
     * MOVE numeric to alphanumeric: raw digit representation.
     * Strips sign, removes decimal point, zero-pads to totalDigits.
     */
    public static String moveNumericToAlpha(Object value, int totalDigits, int decimalDigits) {
        java.math.BigDecimal bd;
        if (value instanceof java.math.BigDecimal) bd = (java.math.BigDecimal) value;
        else if (value instanceof Number) bd = new java.math.BigDecimal(((Number) value).doubleValue());
        else return String.valueOf(value);

        bd = bd.abs();
        if (decimalDigits > 0) {
            bd = bd.movePointRight(decimalDigits);
        }
        long digits = bd.setScale(0, java.math.RoundingMode.DOWN).longValueExact();
        if (totalDigits > 0) {
            return String.format("%0" + totalDigits + "d", digits);
        }
        return String.valueOf(digits);
    }

    public static String accept() {
        try {
            // When stdin is a terminal (Console non-null) — i.e. running under
            // a PTY for screen-section parity — read via readPassword so the
            // typed bytes don't echo onto the screen and corrupt the captured
            // pyte buffer. For redirected stdin (no Console) fall back to
            // BufferedReader.readLine.
            java.io.Console console = System.console();
            if (console != null) {
                char[] chars = console.readPassword();
                return chars == null ? "" : new String(chars);
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            return line != null ? line : "";
        } catch (IOException e) {
            return "";
        }
    }

    /**
     * De-edit: extract the numeric value from an edited display string.
     * Used for MOVE edited-field TO numeric-field.
     * Strips all editing characters ($, B, /, commas, spaces) and detects sign
     * from CR, DB, or explicit +/- sign characters.
     */
    public static java.math.BigDecimal deEditValue(String editedStr) {
        return deEditValue(editedStr, 0, "");
    }

    public static java.math.BigDecimal deEditValue(String editedStr, int scale) {
        return deEditValue(editedStr, scale, "");
    }

    /**
     * De-edit with PIC scale and sign awareness.
     * @param editedStr  the formatted edited string
     * @param scale      number of decimal digits from V in the source PIC (e.g., V99 → scale=2)
     * @param pic        the source PIC clause string (used for sign detection rules)
     */
    public static java.math.BigDecimal deEditValue(String editedStr, int scale, String pic) {
        if (editedStr == null || editedStr.trim().isEmpty()) {
            return java.math.BigDecimal.ZERO;
        }

        // Determine sign policy from source PIC:
        // PIC '+' or 'DB' → de-edit produces unsigned (sign is informational)
        // PIC '-' or 'CR' → de-edit preserves sign from display
        // No PIC → detect sign from string characters (legacy behavior)
        String upperPic = pic != null ? pic.toUpperCase() : "";
        boolean hasPlusPic = false;
        boolean hasMinusPic = false;
        boolean hasCRPic = upperPic.contains("CR");
        boolean hasDBPic = upperPic.contains("DB");
        for (int i = 0; i < upperPic.length(); i++) {
            char pc = upperPic.charAt(i);
            if (pc == '+') hasPlusPic = true;
            else if (pc == '-') hasMinusPic = true;
        }
        // Sign policy: true = always positive, false = detect from string
        boolean forceUnsigned = (hasPlusPic && !hasMinusPic) || (hasDBPic && !hasCRPic);

        String s = editedStr;
        boolean negative = false;

        // Check for CR/DB at end (credit/debit = negative)
        String trimmed = s.trim();
        if (trimmed.endsWith("CR") || trimmed.endsWith("cr")) {
            if (!forceUnsigned) negative = true;
            s = s.substring(0, s.lastIndexOf(trimmed.substring(trimmed.length() - 2))) +
                s.substring(s.lastIndexOf(trimmed.substring(trimmed.length() - 2)) + 2);
        } else if (trimmed.endsWith("DB") || trimmed.endsWith("db")) {
            if (!forceUnsigned) negative = true;
            s = s.substring(0, s.lastIndexOf(trimmed.substring(trimmed.length() - 2))) +
                s.substring(s.lastIndexOf(trimmed.substring(trimmed.length() - 2)) + 2);
        }

        // Extract digits and decimal point, detect sign
        StringBuilder digits = new StringBuilder();
        boolean hasDecimal = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                digits.append(c);
            } else if (c == '.') {
                if (!hasDecimal) {
                    digits.append('.');
                    hasDecimal = true;
                }
            } else if (c == ',') {
                if (decimalPointIsComma && !hasDecimal) {
                    digits.append('.');
                    hasDecimal = true;
                }
            } else if (c == '-') {
                if (!forceUnsigned) negative = true;
            } else if (c == '+') {
                // explicit positive — no action needed
            }
            // Skip $, B, /, spaces, and other editing chars
        }

        String numStr = digits.toString();
        if (numStr.isEmpty() || numStr.equals(".")) {
            return java.math.BigDecimal.ZERO;
        }

        // If no actual decimal point was found in the string and the PIC has V (implied decimal),
        // insert the decimal point at the correct position based on scale
        if (!hasDecimal && scale > 0 && numStr.length() > 0) {
            int intDigits = numStr.length() - scale;
            if (intDigits <= 0) {
                StringBuilder pad = new StringBuilder("0.");
                for (int p = 0; p < -intDigits; p++) pad.append('0');
                pad.append(numStr);
                numStr = pad.toString();
            } else {
                numStr = numStr.substring(0, intDigits) + "." + numStr.substring(intDigits);
            }
        }

        java.math.BigDecimal result = new java.math.BigDecimal(numStr);
        if (negative) {
            result = result.negate();
        }
        return result;
    }

    /**
     * Read input for a single SCREEN SECTION input field. Positions the cursor
     * at (line, col) before reading so any PTY echo of the typed character
     * lands on top of whatever was previously displayed at that position.
     * Returns the captured value padded/truncated to `size`.
     *
     * Implementation: positions cursor → reads a line via standard accept
     * (PTY's own line-discipline echoes the typed chars at the positioned
     * spot, which mirrors GnuCOBOL's screenio mode). After read, the captured
     * string is sized to the field's PIC width.
     */
    public static String acceptScreenField(int line, int col, int size) {
        System.out.print(ansiPos(line, col));
        System.out.flush();
        String input;
        // Prefer Console.readPassword() — it disables echo without needing FFM
        // or JNI. When stdin is a real terminal (ConPTY child) console is
        // non-null. Fall back to plain accept() for redirected stdin.
        java.io.Console console = System.console();
        if (console != null) {
            char[] chars = console.readPassword();
            input = (chars == null) ? "" : new String(chars);
        } else {
            input = accept();
            if (input == null) input = "";
        }
        if (input.length() > size) {
            input = input.substring(0, size);
        } else if (input.length() < size) {
            StringBuilder pad = new StringBuilder(input);
            while (pad.length() < size) pad.append(' ');
            input = pad.toString();
        }
        return input;
    }
}
