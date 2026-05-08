package com.lazarus.cobol.vmg;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 * FieldDescriptor — a typed view into a {@link MemoryGrid}.
 *
 * Each COBOL data item — alphanumeric, numeric DISPLAY, COMP/COMP-5/COMP-3/COMP-6,
 * POINTER, SCREEN field — is represented at runtime as a FieldDescriptor pointing
 * to a (grid, offset, size) span plus picture metadata. Reading/writing the
 * field's value goes through this descriptor, which encodes/decodes against the
 * grid's bytes.
 *
 * REDEFINES is two descriptors over the same span. Group↔child sync is automatic
 * because they share the same buffer slice. CALL "dump" walks the grid bytes
 * directly. This is the byte-exact representation needed for true GnuCOBOL parity.
 */
public final class FieldDescriptor {
    public enum Storage {
        ALPHANUMERIC,       // PIC X
        NUMERIC_DISPLAY,    // PIC 9(n)V9(m), zoned ASCII digits ('0'..'9'), optional sign
        SIGN_LEADING_SEPARATE,
        SIGN_TRAILING_SEPARATE,
        BINARY,             // COMP / COMP-4 / COMP-5 / BINARY-* — 2/4/8 byte int
        PACKED_BCD,         // COMP-3 — packed decimal nibbles, sign nibble at end
        PACKED_BCD_UNSIGNED,// COMP-6 — packed decimal, no sign nibble
        FLOAT_SHORT,        // COMP-1 — 4 bytes
        FLOAT_LONG,         // COMP-2 / FLOAT-LONG — 8 bytes
        POINTER,            // i64 — 0=NULL, otherwise grid-offset-key
        EDITED,             // PIC with $, comma, decimal, asterisk, etc.
        GROUP,              // not directly typed — read/write via children
    }

    public final MemoryGrid grid;
    public final int offset;
    public final int size;
    public final Storage storage;
    public final String name;

    /** PICTURE digit count (e.g. PIC 9(5)V99 → picDigits=7). 0 for non-numeric. */
    public final int picDigits;
    /** Decimal-point position, counted from the right.
     *  PIC 9(5)V99 → picScale = 2. PIC P99 → picScale = -1 (one implicit zero before).
     *  PIC 99P → picScale = +1 (one implicit zero after). */
    public final int picScale;
    /** True if PIC starts with S — sign character is meaningful. */
    public final boolean isSigned;
    /** True for JUSTIFIED RIGHT — MOVE right-aligns source. */
    public final boolean justifiedRight;
    /** True if SET ADDRESS OF is meaningful — POINTER fields. */
    public final boolean isPointer;
    /** Display width override for COMP-X / BINARY-* (e.g. COMP-X PIC X(2) shows 5 digits). */
    public final int displayWidth;
    /** OCCURS element count (1 = scalar, N = OCCURS N TIMES). 0 = not set / unknown. */
    public final int occursMax;
    /** Byte size of one OCCURS element. 0 = not an array. */
    public final int elemSize;

    private FieldDescriptor(Builder b) {
        this.grid = b.grid;
        this.offset = b.offset;
        this.size = b.size;
        this.storage = b.storage;
        this.name = b.name;
        this.picDigits = b.picDigits;
        this.picScale = b.picScale;
        this.isSigned = b.isSigned;
        this.justifiedRight = b.justifiedRight;
        this.isPointer = b.isPointer || b.storage == Storage.POINTER;
        this.displayWidth = b.displayWidth > 0 ? b.displayWidth : b.picDigits;
        this.occursMax = b.occursMax;
        this.elemSize = b.elemSize;
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        MemoryGrid grid;
        int offset;
        int size;
        Storage storage = Storage.ALPHANUMERIC;
        String name = "";
        int picDigits;
        int picScale;
        boolean isSigned;
        boolean justifiedRight;
        boolean isPointer;
        int displayWidth;
        int occursMax;
        int elemSize;

        public Builder grid(MemoryGrid g) { this.grid = g; return this; }
        public Builder at(int off, int sz) { this.offset = off; this.size = sz; return this; }
        public Builder storage(Storage s) { this.storage = s; return this; }
        public Builder name(String n) { this.name = n; return this; }
        public Builder picDigits(int d) { this.picDigits = d; return this; }
        public Builder picScale(int s) { this.picScale = s; return this; }
        public Builder signed(boolean v) { this.isSigned = v; return this; }
        public Builder justifiedRight(boolean v) { this.justifiedRight = v; return this; }
        public Builder pointer(boolean v) { this.isPointer = v; return this; }
        public Builder displayWidth(int w) { this.displayWidth = w; return this; }
        public Builder occursMax(int n) { this.occursMax = n; return this; }
        public Builder elemSize(int n) { this.elemSize = n; return this; }
        public FieldDescriptor build() {
            if (grid == null) throw new IllegalStateException("grid required");
            if (size <= 0 && storage != Storage.GROUP) throw new IllegalStateException("size required");
            return new FieldDescriptor(this);
        }
    }

    // ── Raw byte access ───────────────────────────────────────────────

    public byte[] getRawBytes() { return grid.getBytes(offset, size); }
    public void setRawBytes(byte[] bytes) { grid.setBytes(offset, size, bytes, (byte) 0x20); }
    public void fill(byte b) { grid.fill(offset, size, b); }

    /** OCCURS-aware element view. Returns this descriptor when this is a
     *  scalar (occursMax <= 1). For an OCCURS array:
     *  - 1 ≤ idx ≤ occursMax → element descriptor pointing at the right slice.
     *  - otherwise → a one-shot NUL-init descriptor (matches GnuCOBOL NOSSRANGE
     *    "no exception, read adjacent zero memory" semantics for tests like
     *    run_subscripts_000 and run_misc_154). */
    public FieldDescriptor elementSlice(int idx) {
        if (occursMax <= 1 || elemSize <= 0) return this;
        if (idx < 1 || idx > occursMax) {
            MemoryGrid zero = MemoryGrid.zeroOfSize(elemSize);
            return FieldDescriptor.builder()
                    .grid(zero)
                    .at(0, elemSize)
                    .storage(this.storage)
                    .name(this.name + "[OOR]")
                    .picDigits(this.picDigits)
                    .picScale(this.picScale)
                    .signed(this.isSigned)
                    .build();
        }
        int elemOffset = offset + (idx - 1) * elemSize;
        return FieldDescriptor.builder()
                .grid(grid)
                .at(elemOffset, elemSize)
                .storage(this.storage)
                .name(this.name + "[" + idx + "]")
                .picDigits(this.picDigits)
                .picScale(this.picScale)
                .signed(this.isSigned)
                .justifiedRight(this.justifiedRight)
                .build();
    }

    // ── Alphanumeric (PIC X) ──────────────────────────────────────────

    /** Read as an ASCII string. Trailing 0x20 (space) bytes are NOT trimmed —
     *  callers wanting trim should call .trim() on the returned String. */
    public String getString() {
        byte[] b = getRawBytes();
        return new String(b, java.nio.charset.StandardCharsets.ISO_8859_1);
    }

    /** Write a string as ASCII bytes, padded with SPACE (0x20) or truncated.
     *  When justifiedRight is set, source is right-aligned in the field. */
    public void setString(String s) {
        byte[] src = (s == null ? "" : s).getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
        if (justifiedRight) {
            byte[] out = new byte[size];
            Arrays.fill(out, (byte) 0x20);
            int copy = Math.min(src.length, size);
            // right-align: place last `copy` bytes of src at end of out
            int srcStart = src.length - copy;
            int dstStart = size - copy;
            System.arraycopy(src, srcStart, out, dstStart, copy);
            grid.setBytes(offset, size, out, (byte) 0x20);
        } else {
            grid.setBytes(offset, size, src, (byte) 0x20);
        }
    }

    // ── Numeric DISPLAY (zoned) ───────────────────────────────────────

    /** Read this field's value as a {@link BigDecimal}. Honors picScale. */
    public BigDecimal getDecimal() {
        switch (storage) {
            case NUMERIC_DISPLAY:
            case EDITED: {
                String raw = getString();
                return parseZoned(raw);
            }
            case SIGN_LEADING_SEPARATE: {
                String raw = getString();
                if (raw.isEmpty()) return BigDecimal.ZERO;
                char sign = raw.charAt(0);
                String digits = raw.substring(1);
                BigDecimal v = parseZoned(digits.replace(' ', '0'));
                return sign == '-' ? v.negate() : v;
            }
            case SIGN_TRAILING_SEPARATE: {
                String raw = getString();
                if (raw.isEmpty()) return BigDecimal.ZERO;
                char sign = raw.charAt(raw.length() - 1);
                String digits = raw.substring(0, raw.length() - 1);
                BigDecimal v = parseZoned(digits.replace(' ', '0'));
                return sign == '-' ? v.negate() : v;
            }
            case BINARY:
                return BigDecimal.valueOf(getBinary()).movePointLeft(picScale);
            case PACKED_BCD:
            case PACKED_BCD_UNSIGNED:
                return BcdCodec.decode(grid, offset, size, picScale, storage == Storage.PACKED_BCD);
            case FLOAT_SHORT:
                return new BigDecimal(Float.toString(getFloatShort()));
            case FLOAT_LONG:
                return BigDecimal.valueOf(getFloatLong());
            case POINTER:
                return BigDecimal.valueOf(getPointer());
            default:
                return BigDecimal.ZERO;
        }
    }

    /** Write a {@link BigDecimal} into this field. Applies picScale and storage encoding. */
    public void setDecimal(BigDecimal v) {
        if (v == null) v = BigDecimal.ZERO;
        switch (storage) {
            case NUMERIC_DISPLAY:
                setString(formatZoned(v));
                break;
            case SIGN_LEADING_SEPARATE: {
                String body = formatZonedDigits(v.abs());
                String sign = v.signum() < 0 ? "-" : "+";
                setString(sign + body);
                break;
            }
            case SIGN_TRAILING_SEPARATE: {
                String body = formatZonedDigits(v.abs());
                String sign = v.signum() < 0 ? "-" : "+";
                setString(body + sign);
                break;
            }
            case BINARY:
                setBinary(v.movePointRight(picScale).setScale(0, RoundingMode.DOWN).toBigInteger());
                break;
            case PACKED_BCD:
                if (isSigned) {
                    // Signed COMP-3: 0xC for positive, 0xD for negative
                    BcdCodec.encode(grid, offset, size, v, picDigits, picScale, true);
                } else {
                    // Unsigned COMP-3 (PIC 9(...) without S): 0xF sign nibble
                    BcdCodec.encodeUnsignedComp3(grid, offset, size, v, picDigits, picScale);
                }
                break;
            case PACKED_BCD_UNSIGNED:
                // COMP-6: digits only, no sign nibble at all
                BcdCodec.encode(grid, offset, size, v, picDigits, picScale, false);
                break;
            case FLOAT_SHORT:
                setFloatShort(v.floatValue());
                break;
            case FLOAT_LONG:
                setFloatLong(v.doubleValue());
                break;
            case POINTER:
                setPointer(v.longValueExact());
                break;
            case EDITED:
                // EDITED writes go through CobolDisplay's editPic formatter, which
                // produces a string that is then setString'd. Defer to setString.
                setString(v.toPlainString());
                break;
            default:
                break;
        }
    }

    // ── BINARY (COMP / COMP-5 / BINARY-*) ─────────────────────────────

    /** Read the field as a signed integer of `size` bytes (1, 2, 4, or 8). */
    public long getBinary() {
        long v = 0;
        for (int i = 0; i < size; i++) {
            v = (v << 8) | (grid.get(offset + i) & 0xffL);
        }
        if (isSigned && size <= 8) {
            int shift = 64 - size * 8;
            v = (v << shift) >> shift;  // sign-extend
        }
        return v;
    }

    /** Write a signed integer (or BigInteger for size==8 with i64::MIN handling). */
    public void setBinary(BigInteger value) {
        // Mask to the field's bit width
        BigInteger v = value;
        if (size < 8) {
            BigInteger mask = BigInteger.ONE.shiftLeft(size * 8).subtract(BigInteger.ONE);
            v = v.and(mask);
        }
        long raw;
        if (size == 8) {
            // Long overflow possible for large unsigned writes; use BigInteger->byte[]
            byte[] bytes = v.toByteArray();
            byte fill = (value.signum() < 0) ? (byte) 0xff : 0;
            byte[] out = new byte[size];
            Arrays.fill(out, fill);
            int srcStart = Math.max(0, bytes.length - size);
            int dstStart = Math.max(0, size - bytes.length);
            int copy = Math.min(size, bytes.length);
            System.arraycopy(bytes, srcStart, out, dstStart, copy);
            grid.setBytes(offset, size, out, fill);
            return;
        }
        raw = v.longValueExact();
        for (int i = size - 1; i >= 0; i--) {
            grid.set(offset + i, (byte) (raw & 0xff));
            raw >>>= 8;
        }
    }

    /** Convenience: write a long. For i64::MIN see setBinary(BigInteger). */
    public void setBinary(long value) { setBinary(BigInteger.valueOf(value)); }

    // ── Float / Double ────────────────────────────────────────────────

    public float getFloatShort() {
        int bits = (int) (getBinary() & 0xffffffffL);
        return Float.intBitsToFloat(bits);
    }
    public void setFloatShort(float f) {
        int bits = Float.floatToRawIntBits(f);
        for (int i = size - 1; i >= 0; i--) {
            grid.set(offset + i, (byte) (bits & 0xff));
            bits >>>= 8;
        }
    }

    public double getFloatLong() {
        long bits = getBinary();
        return Double.longBitsToDouble(bits);
    }
    public void setFloatLong(double d) {
        long bits = Double.doubleToRawLongBits(d);
        for (int i = size - 1; i >= 0; i--) {
            grid.set(offset + i, (byte) (bits & 0xff));
            bits >>>= 8;
        }
    }

    // ── POINTER ──────────────────────────────────────────────────────

    public long getPointer() { return getBinary(); }
    public void setPointer(long v) { setBinary(BigInteger.valueOf(v)); }
    public boolean isNullPointer() { return getPointer() == 0L; }

    // ── Helpers ──────────────────────────────────────────────────────

    /** Parse zoned-decimal string (digits + maybe trailing sign overpunch) into BigDecimal. */
    private BigDecimal parseZoned(String raw) {
        if (raw == null) return BigDecimal.ZERO;
        String s = raw.trim();
        if (s.isEmpty()) return BigDecimal.ZERO;
        // Handle sign-overpunch in last char (zoned EBCDIC convention) — treat plain digits primarily.
        // Only the all-digits form is implemented here; EBCDIC overpunch is handled by a separate codec.
        int sign = 1;
        if (s.startsWith("+")) s = s.substring(1);
        else if (s.startsWith("-")) { sign = -1; s = s.substring(1); }
        s = s.replace(' ', '0');
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') digits.append(c);
            else if (c == '.') { /* ignore — we apply picScale below */ }
        }
        if (digits.length() == 0) return BigDecimal.ZERO;
        BigInteger ival = new BigInteger(digits.toString());
        if (sign < 0) ival = ival.negate();
        return new BigDecimal(ival).movePointLeft(picScale);
    }

    /** Format BigDecimal as zoned-decimal digits with implicit sign per picture. */
    private String formatZoned(BigDecimal v) {
        BigInteger scaled = v.movePointRight(picScale).setScale(0, RoundingMode.DOWN).toBigInteger();
        String digits = scaled.abs().toString();
        // Pad to picDigits with leading zeros
        int target = picDigits > 0 ? picDigits : size;
        while (digits.length() < target) digits = "0" + digits;
        if (digits.length() > target) digits = digits.substring(digits.length() - target);
        if (isSigned) {
            // Sign overpunch on last digit (EBCDIC convention) — for ASCII zoned we typically use
            // a separate sign byte. Here we emit unsigned digits; sign-handling lives in display path.
        }
        return digits;
    }

    private String formatZonedDigits(BigDecimal v) {
        BigInteger scaled = v.movePointRight(picScale).setScale(0, RoundingMode.DOWN).toBigInteger();
        String digits = scaled.toString();
        int target = picDigits > 0 ? picDigits : size - 1;
        while (digits.length() < target) digits = "0" + digits;
        if (digits.length() > target) digits = digits.substring(digits.length() - target);
        return digits;
    }

    @Override public String toString() {
        return "FieldDescriptor[" + name + " " + storage + " @" + offset + "+" + size +
                " pic9=" + picDigits + " scale=" + picScale + (isSigned ? " S" : "") + "]";
    }
}
