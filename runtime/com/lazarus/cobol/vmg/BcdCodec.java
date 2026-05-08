package com.lazarus.cobol.vmg;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * BcdCodec — encode/decode COBOL packed-decimal (COMP-3 / COMP-6) values.
 *
 * Packed-decimal layout: each byte holds two BCD nibbles (4 bits each).
 * - For COMP-3 (signed): the LAST nibble is the sign — 0xC = positive,
 *   0xD = negative, 0xF = unsigned (treat as positive). All preceding
 *   nibbles are decimal digits 0..9. Total digits = 2*size - 1.
 * - For COMP-6 (unsigned): every nibble is a digit. Total digits = 2*size.
 *
 * Examples (size = 3 bytes = 5 digits + sign for COMP-3):
 *   123     →  0x12 0x3C
 *   -123    →  0x12 0x3D
 *   12345   →  0x12 0x34 0x5C  (COMP-3, signed)
 *   123456  →  0x12 0x34 0x56  (COMP-6, unsigned)
 *
 * picScale: number of implicit decimal positions from the right (V or P factor).
 *   PIC S9(3)V99 COMP-3 → picDigits=5, picScale=2, size=3.
 */
public final class BcdCodec {
    private BcdCodec() {}

    /** Decode `size` bytes at `offset` from `grid` as a packed-decimal value.
     *  When `signed` is true, last nibble is interpreted as the sign. */
    public static BigDecimal decode(MemoryGrid grid, int offset, int size, int picScale, boolean signed) {
        if (size <= 0) return BigDecimal.ZERO;
        StringBuilder digits = new StringBuilder();
        int sign = 1;
        for (int i = 0; i < size; i++) {
            int b = grid.get(offset + i) & 0xff;
            int hi = (b >>> 4) & 0xf;
            int lo = b & 0xf;
            digits.append((char) ('0' + hi));
            if (i == size - 1 && signed) {
                if (lo == 0xD || lo == 0xB) sign = -1;
                // 0xC, 0xF, 0xE are positive
            } else {
                digits.append((char) ('0' + lo));
            }
        }
        if (digits.length() == 0) return BigDecimal.ZERO;
        BigInteger ival = new BigInteger(digits.toString());
        if (sign < 0) ival = ival.negate();
        return new BigDecimal(ival).movePointLeft(picScale);
    }

    /** Encode `value` as packed-decimal into `size` bytes at `offset` of `grid`.
     *  Truncates / pads to `picDigits` significant digits. picScale shifts the
     *  decimal point. signed=true emits 0xC (positive) or 0xD (negative). For
     *  COMP-3 with NO `S` in the picture (unsigned packed-decimal) the trailing
     *  sign nibble is 0xF — pass `signed=true, value≥0` to get that, OR pass
     *  via the unsigned encoder helper. PACKED_BCD_UNSIGNED (COMP-6) emits no
     *  sign nibble at all — pass `signed=false`. */
    public static void encode(MemoryGrid grid, int offset, int size, BigDecimal value,
                              int picDigits, int picScale, boolean signed) {
        encode(grid, offset, size, value, picDigits, picScale, signed, /*hasSignNibble=*/signed, /*unsignedSign=*/false);
    }

    /** COMP-3 with PIC 9(...) (no `S`) writes a 0xF sign nibble (libcob/cobc
     *  convention). Use this overload when the field is COMP-3 unsigned. */
    public static void encodeUnsignedComp3(MemoryGrid grid, int offset, int size, BigDecimal value,
                                           int picDigits, int picScale) {
        encode(grid, offset, size, value, picDigits, picScale, /*signed=*/false, /*hasSignNibble=*/true, /*unsignedSign=*/true);
    }

    private static void encode(MemoryGrid grid, int offset, int size, BigDecimal value,
                               int picDigits, int picScale, boolean signed,
                               boolean hasSignNibble, boolean unsignedSign) {
        if (value == null) value = BigDecimal.ZERO;
        BigInteger scaled = value.movePointRight(picScale).setScale(0, RoundingMode.DOWN).toBigInteger();
        boolean negative = scaled.signum() < 0;
        String digits = scaled.abs().toString();

        // Pad / truncate to `picDigits` digits (or 2*size or 2*size-1 if picDigits not set)
        int targetDigits = picDigits > 0 ? picDigits : (hasSignNibble ? 2 * size - 1 : 2 * size);
        while (digits.length() < targetDigits) digits = "0" + digits;
        if (digits.length() > targetDigits) {
            digits = digits.substring(digits.length() - targetDigits);
        }

        // For COMP-3: digits + 1 sign nibble = (digits+1) nibbles total (size always rounds up to whole bytes).
        // For COMP-6: digits = digits nibbles, must be even (=2*size).
        byte[] out = new byte[size];
        int nibblesNeeded = hasSignNibble ? targetDigits + 1 : targetDigits;
        int nibblesAvailable = 2 * size;
        int leadPadNibbles = Math.max(0, nibblesAvailable - nibblesNeeded);

        StringBuilder nibStr = new StringBuilder();
        for (int i = 0; i < leadPadNibbles; i++) nibStr.append('0');
        nibStr.append(digits);
        if (hasSignNibble) {
            // 0xC = positive (signed +), 0xD = negative (signed -), 0xF = unsigned
            char sign = unsignedSign ? 'f' : (negative ? 'd' : 'c');
            nibStr.append(sign);
        }
        // Should now have nibStr.length() == 2*size.
        for (int i = 0; i < size; i++) {
            char hiC = nibStr.charAt(2 * i);
            char loC = nibStr.charAt(2 * i + 1);
            int hi = nibFromChar(hiC);
            int lo = nibFromChar(loC);
            out[i] = (byte) ((hi << 4) | lo);
        }
        grid.setBytes(offset, size, out, (byte) 0);
    }

    private static int nibFromChar(char c) {
        if (c >= '0' && c <= '9') return c - '0';
        if (c == 'a' || c == 'A') return 0xA;
        if (c == 'b' || c == 'B') return 0xB;
        if (c == 'c' || c == 'C') return 0xC;
        if (c == 'd' || c == 'D') return 0xD;
        if (c == 'e' || c == 'E') return 0xE;
        if (c == 'f' || c == 'F') return 0xF;
        return 0;
    }

    /** Compute the byte size needed to hold a packed-decimal field with `picDigits` digits. */
    public static int byteSizeFor(int picDigits, boolean signed) {
        if (signed) return (picDigits / 2) + 1;     // (digits + 1 sign nibble) / 2 nibbles per byte, ceiling
        return (picDigits + 1) / 2;
    }
}
