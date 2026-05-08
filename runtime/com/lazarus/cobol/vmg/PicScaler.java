package com.lazarus.cobol.vmg;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * PicScaler — apply COBOL PIC scaling (V and P-factor) to numeric values.
 *
 * COBOL PIC strings can encode an implicit decimal point with V or with
 * leading/trailing P digits:
 *
 *   PIC 9(5)V99    → 5 integer digits, 2 fractional. Stored value 12345.67.
 *                    picDigits = 7, picScale = 2.
 *   PIC P99        → an implicit zero before the stored digits. Value 0.0XX.
 *                    picDigits = 2, picScale = -2 (one P + 2 digits, all decimal).
 *                    Wait — actually: PIC P99 → picScale = +1 (one leading P, value
 *                    is .0XX where XX are stored digits and the implicit zero is on
 *                    the left). For storage: pretend the leading P is a digit when
 *                    counting; the value displays without the leading zero.
 *   PIC 99P        → trailing P, value scales up. PIC 9P with VALUE 1 = 10. picScale = -1.
 *   PIC PPP9       → three implicit zeros before the digit. Value 0.000X. picScale = +3.
 *   PIC 9PPP       → three implicit zeros after. Value X000. picScale = -3.
 *
 * Convention used here:
 *   picScale > 0 → divide stored value by 10^picScale to get the logical value (V/leading-P).
 *   picScale < 0 → multiply stored value by 10^(-picScale) to get the logical value (trailing-P).
 *   picScale = 0 → no scaling.
 *
 * Storage size is determined ONLY by the digits actually stored; P positions
 * don't consume bytes.
 */
public final class PicScaler {
    private PicScaler() {}

    /** Apply scaling to a stored integer value (raw digits) → logical BigDecimal. */
    public static BigDecimal toLogical(BigInteger storedDigits, int picScale) {
        if (picScale == 0) return new BigDecimal(storedDigits);
        return new BigDecimal(storedDigits).movePointLeft(picScale);
    }

    /** Apply scaling to a logical BigDecimal value → stored integer digits. */
    public static BigInteger toStored(BigDecimal logical, int picScale, int picDigits) {
        BigDecimal shifted = logical.movePointRight(picScale).setScale(0, RoundingMode.DOWN);
        BigInteger ival = shifted.toBigInteger().abs();
        if (picDigits > 0) {
            // Truncate to picDigits significant digits
            BigInteger mod = BigInteger.TEN.pow(picDigits);
            ival = ival.mod(mod);
        }
        return ival;
    }

    /** Determine picScale from a parsed PIC string description.
     *
     *  PIC parsers should pass:
     *   - `decimalPositions` = number of positions after V (or after the leading-P implicit zeros)
     *   - `leadingPCount`    = count of leading 'P' characters (e.g. PIC PPP99 → 3)
     *   - `trailingPCount`   = count of trailing 'P' characters (e.g. PIC 99PPP → 3)
     *
     *  Returns the effective picScale to store on the FieldDescriptor.
     */
    public static int computeScale(int decimalPositions, int leadingPCount, int trailingPCount) {
        // Leading P shifts value rightward (smaller): picScale increases.
        // Trailing P shifts value leftward (larger): picScale decreases.
        return decimalPositions + leadingPCount - trailingPCount;
    }
}
