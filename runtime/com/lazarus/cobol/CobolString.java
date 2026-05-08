package com.lazarus.cobol;

/**
 * Fixed-length, space-padded COBOL string (PIC X / PIC A).
 * Wraps a char[] with COBOL move/compare semantics.
 */
public class CobolString {
    private char[] data;

    public CobolString(int length) {
        this.data = new char[length];
        java.util.Arrays.fill(this.data, ' ');
    }

    public CobolString(String initial) {
        this(initial.length());
        set(initial);
    }

    public CobolString(int length, String initial) {
        this(length);
        set(initial);
    }

    public int length() { return data.length; }

    /** Raw byte view of the field — each char is reinterpreted as a single byte
     *  (low 8 bits). Used by REDEFINES-aware nibble inspection in
     *  CobolIntrinsics.isNumericPacked. Caller must not mutate the returned array. */
    public byte[] getBytes() {
        byte[] b = new byte[data.length];
        for (int i = 0; i < data.length; i++) b[i] = (byte) data[i];
        return b;
    }

    /** Subscript-safe array access. COBOL's NOSSRANGE (default) lets out-of-range
     *  subscripts read whatever happens to be in adjacent memory; a real flat-memory
     *  model returns 0x00 bytes for the OOR slot. Mimics that here: when idx is in
     *  [1, arr.length], returns the element (allocating a default-init CobolString
     *  if it's null); otherwise returns a NUL-init CobolString of the requested size.
     *
     *  Matches GnuCOBOL behavior for `DISPLAY X(I)` when I=0 or I>OCCURS-max:
     *  the returned bytes are zeros, no exception. The caller emits this helper
     *  only for non-static (runtime-evaluated) subscripts; static literal
     *  subscripts that the parser proves in-range still use direct indexing. */
    public static CobolString safeIndex(CobolString[] arr, int idx, int size) {
        int i = idx - 1;
        if (i < 0 || i >= arr.length) {
            CobolString nul = new CobolString(size);
            char[] d = nul.data;
            for (int k = 0; k < d.length; k++) d[k] = '\0';
            return nul;
        }
        if (arr[i] == null) arr[i] = new CobolString(size);
        return arr[i];
    }

    /** NOSSRANGE overload: when OOB (above or below range), reads adjacent
     *  memory from the parent group at the computed byte offset. */
    public static CobolString safeIndex(CobolString[] arr, int idx, int size,
                                         CobolString parent, int elemOffsetInParent) {
        int i = idx - 1;
        if (i >= 0 && i < arr.length) {
            if (arr[i] == null) arr[i] = new CobolString(size);
            return arr[i];
        }
        // OOB: read from parent group at the computed flat-memory position
        int byteOffset = elemOffsetInParent + i * size;
        String parentStr = parent.toString();
        CobolString result = new CobolString(size);
        for (int k = 0; k < size; k++) {
            int absIdx = byteOffset + k;
            if (absIdx >= 0 && absIdx < parentStr.length()) {
                result.data[k] = parentStr.charAt(absIdx);
            } else {
                result.data[k] = '\0';
            }
        }
        return result;
    }

    /** Write-safe OOB subscript access: returns the array element if in-range,
     *  or null if OOB (caller should skip the write when null). */
    public static CobolString safeWriteIndex(CobolString[] arr, int idx, int size) {
        int i = idx - 1;
        if (i < 0 || i >= arr.length) return null;
        if (arr[i] == null) arr[i] = new CobolString(size);
        return arr[i];
    }

    /** SSRANGE/BOUND mode: abort with error on OOB subscript. */
    public static CobolString boundedIndex(CobolString[] arr, int idx, int size) {
        int i = idx - 1;
        if (i < 0 || i >= arr.length) {
            System.out.flush();
            System.err.println("libcob: subscript of '" + size + "' out of bounds: " + idx);
            System.exit(1);
        }
        if (arr[i] == null) arr[i] = new CobolString(size);
        return arr[i];
    }

    public void set(String value) {
        java.util.Arrays.fill(data, ' ');
        int len = Math.min(value.length(), data.length);
        for (int i = 0; i < len; i++) data[i] = value.charAt(i);
    }

    public void set(CobolString other) {
        set(other.toString());
    }

    public void setRight(String value) {
        java.util.Arrays.fill(data, ' ');
        int start = data.length - value.length();
        if (start < 0) start = 0;
        int srcStart = value.length() > data.length ? value.length() - data.length : 0;
        for (int i = srcStart; i < value.length() && (start + i - srcStart) < data.length; i++) {
            data[start + i - srcStart] = value.charAt(i);
        }
    }

    public String get() {
        return new String(data);
    }

    /** Reference modification: COBOL 1-based start, length.
     *  Underflow (start ≤ 0): GnuCOBOL fills with NUL bytes for the requested length.
     *  Overflow (length > available bytes from start): clip to the available span;
     *    GnuCOBOL prints what it can and stops, no trailing pad.
     *  Source exhausted (start > field length): empty. */
    public static String refMod(Object target, int start, int length) {
        String s = String.valueOf(target);
        if (length <= 0) return "";
        if (start <= 0) {
            char[] pad = new char[length];
            return new String(pad);
        }
        int from = start - 1;
        if (from >= s.length()) {
            char[] pad = new char[length];
            return new String(pad);
        }
        int avail = s.length() - from;
        int take = Math.min(length, avail);
        String result = s.substring(from, from + take);
        if (take < length) {
            char[] pad = new char[length - take];
            result = result + new String(pad);
        }
        return result;
    }

    /** Reference modification with parent-group fallback for SSRANGE-off semantics.
     *  When start/length goes past the field boundary, reads continue into adjacent
     *  storage within the parent group (matches libcob behaviour with NOSSRANGE).
     *  parent: the containing group's CobolString, or null to disable overflow.
     *  fieldOffsetInParent: 0-based byte offset of `target` inside `parent`. */
    public static String refMod(Object target, int start, int length,
                                 Object parent, int fieldOffsetInParent) {
        String s = String.valueOf(target);
        if (length <= 0) return "";
        if (start <= 0) {
            char[] pad = new char[length];
            return new String(pad);
        }
        int from = start - 1;
        int fieldLen = s.length();
        // If we can satisfy entirely within the field, defer to the simple path
        if (from < fieldLen && from + length <= fieldLen) {
            return s.substring(from, from + length);
        }
        // Need to overflow into parent (or pad with spaces if no parent)
        String parentStr = (parent != null) ? String.valueOf(parent) : null;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int idxInField = from + i;
            if (idxInField < fieldLen) {
                sb.append(s.charAt(idxInField));
            } else if (parentStr != null) {
                int absIdx = fieldOffsetInParent + idxInField;
                if (absIdx < parentStr.length()) {
                    sb.append(parentStr.charAt(absIdx));
                } else {
                    sb.append(' '); // past parent end → space
                }
            } else {
                sb.append(' '); // no parent → space
            }
        }
        return sb.toString();
    }

    public static String refMod(Object target, int start) {
        String s = String.valueOf(target);
        int from = start - 1;
        if (from < 0) from = 0;
        if (from >= s.length()) return "";
        return s.substring(from);
    }

    /**
     * Reference modification for COMP-3 / COMP-6 packed-BCD BigDecimal fields.
     * Converts the BigDecimal to its in-memory BCD byte representation, then
     * applies COBOL reference modification (1-based, to end of field).
     *
     * @param bd        BigDecimal value of the packed field
     * @param numDigits Total digit count (integer + fractional digits)
     * @param scale     Number of fractional (decimal) digits
     * @param comp6     true = COMP-6 (no sign nibble); false = COMP-3 (sign nibble at end)
     * @param hasSPrefix true = signed PIC S9... (C/D nibble); false = unsigned (F nibble)
     * @param start     1-based start byte position
     */
    public static String refModPacked(java.math.BigDecimal bd, int numDigits, int scale,
                                      boolean comp6, boolean hasSPrefix, int start) {
        String bcdStr = packedBcdBytes(bd, numDigits, scale, comp6, hasSPrefix);
        int from = start - 1;
        if (from < 0) from = 0;
        if (from >= bcdStr.length()) return "";
        return bcdStr.substring(from);
    }

    /**
     * Reference modification for COMP-3 / COMP-6 packed-BCD BigDecimal fields with length.
     */
    public static String refModPacked(java.math.BigDecimal bd, int numDigits, int scale,
                                      boolean comp6, boolean hasSPrefix, int start, int length) {
        String bcdStr = packedBcdBytes(bd, numDigits, scale, comp6, hasSPrefix);
        if (length <= 0) return "";
        int from = start - 1;
        if (from < 0) from = 0;
        if (from >= bcdStr.length()) return "";
        int to = Math.min(from + length, bcdStr.length());
        return bcdStr.substring(from, to);
    }

    /**
     * Convert a BigDecimal to packed BCD bytes (returned as a Java String,
     * where each char == raw byte value 0x00-0xFF via ISO-8859-1 mapping).
     *
     * COMP-6: ceil(numDigits/2) bytes, digit nibbles only (no sign nibble).
     * COMP-3: ceil((numDigits+1)/2) bytes, sign nibble in last nibble.
     *   Sign nibble: C=positive(signed), D=negative(signed), F=unsigned
     */
    private static String packedBcdBytes(java.math.BigDecimal bd, int numDigits, int scale,
                                         boolean comp6, boolean hasSPrefix) {
        if (bd == null) bd = java.math.BigDecimal.ZERO;
        // Get absolute digit string, scaled to 'scale' decimal places
        java.math.BigDecimal abs = bd.abs().setScale(scale, java.math.RoundingMode.DOWN);
        String digits = abs.unscaledValue().toString();
        // Pad or truncate to exactly numDigits
        while (digits.length() < numDigits) digits = "0" + digits;
        if (digits.length() > numDigits) digits = digits.substring(digits.length() - numDigits);

        byte[] bcd;
        if (comp6) {
            // COMP-6: ceil(numDigits/2) bytes, no sign nibble
            int byteCount = (numDigits + 1) / 2;
            // Pad to even digit count (2 nibbles per byte)
            String evenDigits = digits;
            while (evenDigits.length() < 2 * byteCount) evenDigits = "0" + evenDigits;
            bcd = new byte[byteCount];
            for (int i = 0; i < byteCount; i++) {
                int hi = Character.digit(evenDigits.charAt(2 * i), 10);
                int lo = Character.digit(evenDigits.charAt(2 * i + 1), 10);
                bcd[i] = (byte) ((hi << 4) | lo);
            }
        } else {
            // COMP-3: ceil((numDigits+1)/2) bytes, sign nibble at end
            int signNibble;
            if (!hasSPrefix) {
                signNibble = 0xF; // unsigned: F nibble
            } else if (bd.signum() < 0) {
                signNibble = 0xD; // negative: D nibble
            } else {
                signNibble = 0xC; // positive: C nibble
            }
            // byteCount = ceil((numDigits+1)/2) = (numDigits+2)/2 (integer division)
            int byteCount = (numDigits + 2) / 2;
            int totalNibbles = byteCount * 2;
            // Leading padding nibbles = totalNibbles - numDigits - 1 (sign nibble slot)
            int padding = totalNibbles - numDigits - 1;
            // Build nibbles array: [padding 0s][digit nibbles][sign nibble]
            int[] nibbles = new int[totalNibbles];
            for (int i = 0; i < padding; i++) nibbles[i] = 0;
            for (int i = 0; i < numDigits; i++) {
                nibbles[padding + i] = Character.digit(digits.charAt(i), 10);
            }
            nibbles[totalNibbles - 1] = signNibble;
            bcd = new byte[byteCount];
            for (int i = 0; i < byteCount; i++) {
                bcd[i] = (byte) ((nibbles[2 * i] << 4) | nibbles[2 * i + 1]);
            }
        }
        // Encode as Java String where char[i] = bcd[i] & 0xFF (ISO-8859-1 semantics)
        char[] chars = new char[bcd.length];
        for (int i = 0; i < bcd.length; i++) chars[i] = (char) (bcd[i] & 0xFF);
        return new String(chars);
    }


    public void setRefMod(int start, int length, String value) {
        int from = start - 1;
        if (from < 0) from = 0;
        int to = Math.min(from + length, data.length);
        String padded = value;
        while (padded.length() < length) padded += " ";
        for (int i = from; i < to; i++) {
            data[i] = padded.charAt(i - from);
        }
    }
    public void setRefMod(int start, String value) {
        setRefMod(start, data.length - start + 1, value);
    }

    /** STRING verb DELIMITED BY support */
    public static String delimitedBy(String value, String delimiter) {
        int idx = value.indexOf(delimiter);
        return idx >= 0 ? value.substring(0, idx) : value;
    }

    /** TRANSFORM verb — character-by-character replacement */
    public static String transform(Object target, String from, String to) {
        String s = String.valueOf(target);
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            int idx = from.indexOf(s.charAt(i));
            sb.append(idx >= 0 && idx < to.length() ? to.charAt(idx) : s.charAt(i));
        }
        return sb.toString();
    }

    /** Static setRefMod for array elements — write substring at refmod position */
    public static void setRefMod(CobolString[] arr, int index, int start, int length, String value) {
        if (index >= 0 && index < arr.length && arr[index] != null) {
            arr[index].setRefMod(start, length, value);
        }
    }
    public static void setRefMod(CobolString[] arr, int index, int start, String value) {
        if (index >= 0 && index < arr.length && arr[index] != null) {
            arr[index].setRefMod(start, value);
        }
    }

    @Override
    public String toString() {
        return new String(data);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof CobolString) return java.util.Arrays.equals(data, ((CobolString) o).data);
        if (o instanceof String) return get().equals(o);
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Arrays.hashCode(data);
    }

    /**
     * COBOL-style string comparison: pad shorter string with spaces to match longer.
     * "AB" compared to "AB      " → equal (COBOL standard).
     */
    public static boolean cobolEquals(String a, String b) {
        int la = a.length(), lb = b.length();
        if (la == lb) return a.equals(b);
        int maxLen = Math.max(la, lb);
        for (int i = 0; i < maxLen; i++) {
            char ca = i < la ? a.charAt(i) : ' ';
            char cb = i < lb ? b.charAt(i) : ' ';
            if (ca != cb) return false;
        }
        return true;
    }

    /**
     * COBOL-style string comparison for ordering.
     * Returns negative, zero, or positive like compareTo.
     */
    public static int cobolCompare(String a, String b) {
        int maxLen = Math.max(a.length(), b.length());
        for (int i = 0; i < maxLen; i++) {
            char ca = i < a.length() ? a.charAt(i) : ' ';
            char cb = i < b.length() ? b.charAt(i) : ' ';
            if (ca != cb) return ca - cb;
        }
        return 0;
    }
}
