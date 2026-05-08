package com.lazarus.cobol.vmg;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * MemoryGrid — flat byte-array backing for a COBOL program's data division.
 *
 * Every 01/77/FD record corresponds to a contiguous span of bytes in this grid.
 * Sub-fields (children) reference their parent's grid via offset+size — no
 * separate object storage. This is the byte-level representation real COBOL
 * implementations use, and it's what enables byte-exact parity with GnuCOBOL
 * for HEX-OF, BIT-OF, REDEFINES, group MOVE, packed-decimal BCD, and POINTER
 * semantics.
 *
 * The grid is a single ByteBuffer per allocation request; an entire program's
 * working storage typically lives in one or two grids (one for working-storage,
 * one per FD record). Multiple grids may exist simultaneously (e.g. one per
 * 01-level item) — the MemoryGrid does not enforce a single-grid program layout.
 *
 * Default byte order is BIG_ENDIAN (mainframe and GnuCOBOL convention).
 * For COMP-5 / BINARY on USAGE NATIVE platforms, callers may set LITTLE_ENDIAN.
 */
public final class MemoryGrid {
    /** Initial fill byte for unallocated memory. COBOL convention: SPACE (0x20). */
    public static final byte INIT_FILL = 0x20;

    private final ByteBuffer buf;
    private final int size;

    public MemoryGrid(int size) {
        this(size, INIT_FILL);
    }

    public MemoryGrid(int size, byte initFill) {
        this.size = size;
        this.buf = ByteBuffer.allocate(size).order(ByteOrder.BIG_ENDIAN);
        if (initFill != 0) {
            byte[] backing = buf.array();
            int arrayOffset = buf.arrayOffset();
            Arrays.fill(backing, arrayOffset, arrayOffset + size, initFill);
        }
    }

    /** Wrap an existing byte array — used for FD records read from a file. */
    public static MemoryGrid wrap(byte[] bytes) {
        MemoryGrid g = new MemoryGrid(bytes.length, (byte) 0);
        System.arraycopy(bytes, 0, g.buf.array(), g.buf.arrayOffset(), bytes.length);
        return g;
    }

    public int size() { return size; }

    /** Underlying ByteBuffer — exposed so descriptors can do bulk slicing.
     *  Callers should respect offset/limit and not mutate position arbitrarily. */
    public ByteBuffer buffer() { return buf; }

    public byte get(int offset) { return buf.get(offset); }
    public void set(int offset, byte b) { buf.put(offset, b); }

    /** Read `length` bytes starting at `offset` (0-based) into a new byte[].
     *  Returns a fresh copy — callers may mutate without affecting the grid. */
    public byte[] getBytes(int offset, int length) {
        if (length <= 0) return new byte[0];
        byte[] out = new byte[length];
        // Bulk-get with absolute index doesn't exist in older Java; use slice.
        ByteBuffer dup = buf.duplicate();
        dup.position(offset);
        dup.get(out, 0, length);
        return out;
    }

    /** Write `bytes` at `offset`. If `bytes.length > length`, truncate. If shorter, pad with `padByte`. */
    public void setBytes(int offset, int length, byte[] bytes, byte padByte) {
        int copy = Math.min(length, bytes.length);
        ByteBuffer dup = buf.duplicate();
        dup.position(offset);
        dup.put(bytes, 0, copy);
        if (copy < length) {
            byte[] pad = new byte[length - copy];
            Arrays.fill(pad, padByte);
            dup.put(pad);
        }
    }

    /** Set `length` bytes at `offset` to `fill`. Used by SPACES, ZEROS, LOW-VALUES, INITIALIZE. */
    public void fill(int offset, int length, byte fill) {
        if (length <= 0) return;
        byte[] f = new byte[length];
        Arrays.fill(f, fill);
        ByteBuffer dup = buf.duplicate();
        dup.position(offset);
        dup.put(f);
    }

    /** Copy `length` bytes from `srcOffset` to `dstOffset` within the same grid.
     *  Handles overlapping ranges correctly (System.arraycopy semantics). */
    public void copyWithin(int srcOffset, int dstOffset, int length) {
        if (length <= 0 || srcOffset == dstOffset) return;
        // Use array form for arraycopy correctness with overlap
        byte[] backing = buf.array();
        int arrayOffset = buf.arrayOffset();
        System.arraycopy(backing, arrayOffset + srcOffset, backing, arrayOffset + dstOffset, length);
    }

    /** Copy `length` bytes from `src` at `srcOffset` into this grid at `dstOffset`. */
    public void copyFrom(MemoryGrid src, int srcOffset, int dstOffset, int length) {
        if (length <= 0) return;
        if (src == this) { copyWithin(srcOffset, dstOffset, length); return; }
        byte[] tmp = src.getBytes(srcOffset, length);
        ByteBuffer dup = buf.duplicate();
        dup.position(dstOffset);
        dup.put(tmp);
    }

    /** A shared, immutable, zero-init grid of the requested size. Cached per
     *  size for cheap reuse — used by FieldDescriptor.elementSlice when an
     *  OCCURS subscript is out-of-range and we need to return a NUL-byte
     *  view (matches GnuCOBOL NOSSRANGE semantics).
     *
     *  The returned grid is a fresh allocation but its contents are all zeros;
     *  callers that need an independent buffer should still allocate their own.
     *  This helper exists so FieldDescriptor.elementSlice can construct a
     *  one-shot read view without leaking writes back into the real program. */
    public static MemoryGrid zeroOfSize(int size) {
        return new MemoryGrid(size, (byte) 0);
    }

    /** Pretty-print a hex dump of `length` bytes from `offset` for debugging. */
    public String hexDump(int offset, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i > 0 && i % 16 == 0) sb.append('\n');
            sb.append(String.format("%02x ", buf.get(offset + i) & 0xff));
        }
        return sb.toString();
    }

    /**
     * Phase A — typed MOVE between two field descriptors. Dispatches on the
     * storage class so packed-decimal, binary, and zoned-decimal moves all
     * route through the codec layer without losing precision.
     *
     * Semantics (COBOL MOVE):
     *   - alpha → alpha:    byte-copy with truncate/pad to dst.size
     *   - numeric → numeric: read src as BigDecimal (codec-decoded),
     *                        write dst as BigDecimal (codec-encoded with
     *                        dst's pic-scale and sign)
     *   - alpha → numeric:  parse src as decimal (best-effort)
     *   - numeric → alpha:  format src as plain string and pad/truncate
     *
     * This is purely additive — no existing call site uses it yet. Phase A
     * step 2 wires `emitMove` to call this for COMP-3 / COMP-6 fields where
     * the legacy String/BigDecimal roundtrip loses BCD precision.
     */
    public static void move(FieldDescriptor src, FieldDescriptor dst) {
        if (src == null || dst == null) return;
        if (src == dst) return;
        boolean srcAlpha = src.storage == FieldDescriptor.Storage.ALPHANUMERIC
                || src.storage == FieldDescriptor.Storage.GROUP;
        boolean dstAlpha = dst.storage == FieldDescriptor.Storage.ALPHANUMERIC
                || dst.storage == FieldDescriptor.Storage.GROUP;
        if (srcAlpha && dstAlpha) {
            // Pure byte-level copy, honoring dst.justifiedRight.
            dst.setString(src.getString());
            return;
        }
        if (!srcAlpha && !dstAlpha) {
            // Both numeric — route through BigDecimal so codec dispatch is
            // exact for COMP-3/COMP-6/binary/zoned/POINTER cross-products.
            dst.setDecimal(src.getDecimal());
            return;
        }
        if (dstAlpha) {
            // numeric → alphanumeric — emit the field's display digits.
            // Use plain string so we don't truncate the integer part; dst.size
            // pad/trunc happens inside setString.
            java.math.BigDecimal v = src.getDecimal();
            dst.setString(v.toPlainString());
            return;
        }
        // alphanumeric → numeric — try parsing.
        try {
            String s = src.getString().trim();
            if (s.isEmpty()) {
                dst.setDecimal(java.math.BigDecimal.ZERO);
            } else {
                dst.setDecimal(new java.math.BigDecimal(s));
            }
        } catch (NumberFormatException e) {
            dst.setDecimal(java.math.BigDecimal.ZERO);
        }
    }
}
