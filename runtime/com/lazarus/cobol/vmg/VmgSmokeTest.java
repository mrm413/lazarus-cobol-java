package com.lazarus.cobol.vmg;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * VmgSmokeTest — minimal in-process exercise of VMG primitives.
 *
 * Run via: java -cp runtime.jar com.lazarus.cobol.vmg.VmgSmokeTest
 *
 * Validates: alphanumeric round-trip, BINARY signed/unsigned, i64::MIN, BCD packed,
 * P-factor scaling, REDEFINES via shared offsets, group→child sync.
 */
public class VmgSmokeTest {
    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        testAlphanumeric();
        testBinarySigned();
        testI64Min();
        testBcdSigned();
        testBcdUnsigned();
        testPFactorLeading();
        testPFactorTrailing();
        testRedefines();
        testGroupChildSync();
        testHexLiteral();
        testMoveBcdToBcd();
        testMoveBcdToZoned();
        testMoveZonedToBcd();
        testMoveBinaryToBcd();
        testMoveAlphaToAlphaTruncate();
        testMoveAlphaToAlphaPad();
        testMoveBcdScaleConvert();
        System.out.println();
        System.out.println("VMG smoke: " + passed + " pass / " + failed + " fail");
        if (failed > 0) System.exit(1);
    }

    private static void check(String label, boolean cond, String detail) {
        if (cond) {
            passed++;
            System.out.println("  PASS  " + label);
        } else {
            failed++;
            System.out.println("  FAIL  " + label + " — " + detail);
        }
    }

    private static void testAlphanumeric() {
        MemoryGrid g = new MemoryGrid(20);
        FieldDescriptor fd = FieldDescriptor.builder()
            .grid(g).at(0, 10).storage(FieldDescriptor.Storage.ALPHANUMERIC)
            .name("X").build();
        fd.setString("HELLO");
        String got = fd.getString();
        check("alphanumeric MOVE pads with space",
            got.equals("HELLO     "), "got '" + got + "'");
    }

    private static void testBinarySigned() {
        MemoryGrid g = new MemoryGrid(8);
        FieldDescriptor fd = FieldDescriptor.builder()
            .grid(g).at(0, 4).storage(FieldDescriptor.Storage.BINARY)
            .picDigits(9).picScale(0).signed(true).name("X").build();
        fd.setBinary(BigInteger.valueOf(-12345));
        long got = fd.getBinary();
        check("BINARY signed -12345 round-trip", got == -12345L, "got " + got);
    }

    private static void testI64Min() {
        MemoryGrid g = new MemoryGrid(8);
        FieldDescriptor fd = FieldDescriptor.builder()
            .grid(g).at(0, 8).storage(FieldDescriptor.Storage.BINARY)
            .picDigits(18).picScale(0).signed(true).name("X").build();
        BigInteger min = new BigInteger("-9223372036854775808");
        fd.setBinary(min);
        long got = fd.getBinary();
        check("BINARY i64::MIN round-trip", got == Long.MIN_VALUE, "got " + got);
    }

    private static void testBcdSigned() {
        MemoryGrid g = new MemoryGrid(4);
        // PIC S9(5) COMP-3 → 5 digits + sign nibble = 6 nibbles = 3 bytes.
        FieldDescriptor fd = FieldDescriptor.builder()
            .grid(g).at(0, 3).storage(FieldDescriptor.Storage.PACKED_BCD)
            .picDigits(5).picScale(0).signed(true).name("X").build();
        fd.setDecimal(new BigDecimal("-12345"));
        BigDecimal got = fd.getDecimal();
        check("PACKED_BCD signed -12345 round-trip",
            got.compareTo(new BigDecimal("-12345")) == 0, "got " + got);
        // Verify bytes: 0x12 0x34 0x5D
        byte[] raw = fd.getRawBytes();
        check("PACKED_BCD bytes 0x12 0x34 0x5D",
            (raw[0] & 0xff) == 0x12 && (raw[1] & 0xff) == 0x34 && (raw[2] & 0xff) == 0x5D,
            String.format("got %02x %02x %02x", raw[0]&0xff, raw[1]&0xff, raw[2]&0xff));
    }

    private static void testBcdUnsigned() {
        MemoryGrid g = new MemoryGrid(4);
        // PIC 9(6) COMP-6 → 6 digits = 6 nibbles = 3 bytes
        FieldDescriptor fd = FieldDescriptor.builder()
            .grid(g).at(0, 3).storage(FieldDescriptor.Storage.PACKED_BCD_UNSIGNED)
            .picDigits(6).picScale(0).signed(false).name("X").build();
        fd.setDecimal(new BigDecimal("123456"));
        BigDecimal got = fd.getDecimal();
        check("PACKED_BCD_UNSIGNED 123456 round-trip",
            got.compareTo(new BigDecimal("123456")) == 0, "got " + got);
    }

    private static void testPFactorLeading() {
        // PIC PP9 COMP-3 → 1 stored digit, but value is 0.00X. picDigits=1, picScale=3 (PP + 9 = 2 leading zeros + 1 digit).
        MemoryGrid g = new MemoryGrid(2);
        FieldDescriptor fd = FieldDescriptor.builder()
            .grid(g).at(0, 1).storage(FieldDescriptor.Storage.PACKED_BCD_UNSIGNED)
            .picDigits(1).picScale(3).signed(false).name("X").build();
        fd.setDecimal(new BigDecimal("0.005"));
        BigDecimal got = fd.getDecimal();
        check("PIC PP9 leading P (picScale=3) round-trip 0.005",
            got.compareTo(new BigDecimal("0.005")) == 0, "got " + got);
    }

    private static void testPFactorTrailing() {
        // PIC 9PP → 1 stored digit, value scales x100. picDigits=1, picScale=-2.
        MemoryGrid g = new MemoryGrid(2);
        FieldDescriptor fd = FieldDescriptor.builder()
            .grid(g).at(0, 1).storage(FieldDescriptor.Storage.PACKED_BCD_UNSIGNED)
            .picDigits(1).picScale(-2).signed(false).name("X").build();
        fd.setDecimal(new BigDecimal("500"));
        BigDecimal got = fd.getDecimal();
        check("PIC 9PP trailing P (picScale=-2) round-trip 500",
            got.compareTo(new BigDecimal("500")) == 0, "got " + got);
    }

    private static void testRedefines() {
        // Two descriptors over the same span — write via one, read via other.
        MemoryGrid g = new MemoryGrid(8);
        FieldDescriptor a = FieldDescriptor.builder()
            .grid(g).at(0, 4).storage(FieldDescriptor.Storage.ALPHANUMERIC).name("A").build();
        FieldDescriptor b = FieldDescriptor.builder()
            .grid(g).at(0, 4).storage(FieldDescriptor.Storage.ALPHANUMERIC).name("B-redefines-A").build();
        a.setString("ABCD");
        check("REDEFINES: write A, read B (shared bytes)",
            b.getString().equals("ABCD"), "got '" + b.getString() + "'");
    }

    private static void testGroupChildSync() {
        // Group at offset 0, size 6. Two children: c1 (X(3)) at offset 0, c2 (X(3)) at offset 3.
        MemoryGrid g = new MemoryGrid(8);
        FieldDescriptor group = FieldDescriptor.builder()
            .grid(g).at(0, 6).storage(FieldDescriptor.Storage.GROUP).name("GRP").build();
        FieldDescriptor c1 = FieldDescriptor.builder()
            .grid(g).at(0, 3).storage(FieldDescriptor.Storage.ALPHANUMERIC).name("C1").build();
        FieldDescriptor c2 = FieldDescriptor.builder()
            .grid(g).at(3, 3).storage(FieldDescriptor.Storage.ALPHANUMERIC).name("C2").build();
        c1.setString("ABC");
        c2.setString("DEF");
        check("group child sync: write children, read group",
            group.getString().equals("ABCDEF"), "got '" + group.getString() + "'");
        // And the reverse: write group, children see updated bytes
        group.setString("XY12ZQ");
        check("group child sync: write group, c1 reads new bytes",
            c1.getString().equals("XY1"), "c1='" + c1.getString() + "'");
        check("group child sync: write group, c2 reads new bytes",
            c2.getString().equals("2ZQ"), "c2='" + c2.getString() + "'");
    }

    /** Phase A — MemoryGrid.move() between FieldDescriptors. */
    private static void testMoveBcdToBcd() {
        MemoryGrid g = new MemoryGrid(8);
        FieldDescriptor src = FieldDescriptor.builder().grid(g).at(0, 3)
            .storage(FieldDescriptor.Storage.PACKED_BCD).picDigits(5).picScale(0).signed(true).name("S").build();
        FieldDescriptor dst = FieldDescriptor.builder().grid(g).at(4, 3)
            .storage(FieldDescriptor.Storage.PACKED_BCD).picDigits(5).picScale(0).signed(true).name("D").build();
        src.setDecimal(new BigDecimal("-12345"));
        MemoryGrid.move(src, dst);
        BigDecimal got = dst.getDecimal();
        check("move BCD -> BCD same scale",
            got.compareTo(new BigDecimal("-12345")) == 0, "got " + got);
    }

    private static void testMoveBcdToZoned() {
        MemoryGrid g = new MemoryGrid(16);
        FieldDescriptor src = FieldDescriptor.builder().grid(g).at(0, 3)
            .storage(FieldDescriptor.Storage.PACKED_BCD).picDigits(5).picScale(0).signed(true).name("S").build();
        FieldDescriptor dst = FieldDescriptor.builder().grid(g).at(4, 5)
            .storage(FieldDescriptor.Storage.NUMERIC_DISPLAY).picDigits(5).picScale(0).signed(false).name("D").build();
        src.setDecimal(new BigDecimal("12345"));
        MemoryGrid.move(src, dst);
        BigDecimal got = dst.getDecimal();
        check("move BCD -> NUMERIC_DISPLAY", got.compareTo(new BigDecimal("12345")) == 0, "got " + got);
    }

    private static void testMoveZonedToBcd() {
        MemoryGrid g = new MemoryGrid(16);
        FieldDescriptor src = FieldDescriptor.builder().grid(g).at(0, 5)
            .storage(FieldDescriptor.Storage.NUMERIC_DISPLAY).picDigits(5).picScale(0).signed(false).name("S").build();
        FieldDescriptor dst = FieldDescriptor.builder().grid(g).at(8, 3)
            .storage(FieldDescriptor.Storage.PACKED_BCD).picDigits(5).picScale(0).signed(true).name("D").build();
        src.setDecimal(new BigDecimal("99999"));
        MemoryGrid.move(src, dst);
        BigDecimal got = dst.getDecimal();
        check("move NUMERIC_DISPLAY -> BCD", got.compareTo(new BigDecimal("99999")) == 0, "got " + got);
    }

    private static void testMoveBinaryToBcd() {
        MemoryGrid g = new MemoryGrid(16);
        FieldDescriptor src = FieldDescriptor.builder().grid(g).at(0, 4)
            .storage(FieldDescriptor.Storage.BINARY).picDigits(9).picScale(0).signed(true).name("S").build();
        FieldDescriptor dst = FieldDescriptor.builder().grid(g).at(8, 5)
            .storage(FieldDescriptor.Storage.PACKED_BCD).picDigits(9).picScale(0).signed(true).name("D").build();
        src.setBinary(BigInteger.valueOf(-987654));
        MemoryGrid.move(src, dst);
        BigDecimal got = dst.getDecimal();
        check("move BINARY -> BCD signed", got.compareTo(new BigDecimal("-987654")) == 0, "got " + got);
    }

    private static void testMoveAlphaToAlphaTruncate() {
        MemoryGrid g = new MemoryGrid(20);
        FieldDescriptor src = FieldDescriptor.builder().grid(g).at(0, 10)
            .storage(FieldDescriptor.Storage.ALPHANUMERIC).name("S").build();
        FieldDescriptor dst = FieldDescriptor.builder().grid(g).at(12, 5)
            .storage(FieldDescriptor.Storage.ALPHANUMERIC).name("D").build();
        src.setString("HELLO WORLD");
        MemoryGrid.move(src, dst);
        check("move alpha -> alpha truncates to dst.size",
            dst.getString().equals("HELLO"), "got '" + dst.getString() + "'");
    }

    private static void testMoveAlphaToAlphaPad() {
        MemoryGrid g = new MemoryGrid(20);
        FieldDescriptor src = FieldDescriptor.builder().grid(g).at(0, 3)
            .storage(FieldDescriptor.Storage.ALPHANUMERIC).name("S").build();
        FieldDescriptor dst = FieldDescriptor.builder().grid(g).at(8, 8)
            .storage(FieldDescriptor.Storage.ALPHANUMERIC).name("D").build();
        src.setString("HI");
        MemoryGrid.move(src, dst);
        check("move alpha -> alpha pads with space",
            dst.getString().equals("HI      "), "got '" + dst.getString() + "'");
    }

    private static void testMoveBcdScaleConvert() {
        // Source has picScale=2 (e.g. 1234.56), dst has picScale=0 (truncates).
        MemoryGrid g = new MemoryGrid(16);
        FieldDescriptor src = FieldDescriptor.builder().grid(g).at(0, 4)
            .storage(FieldDescriptor.Storage.PACKED_BCD).picDigits(7).picScale(2).signed(false).name("S").build();
        FieldDescriptor dst = FieldDescriptor.builder().grid(g).at(8, 3)
            .storage(FieldDescriptor.Storage.PACKED_BCD).picDigits(5).picScale(0).signed(false).name("D").build();
        src.setDecimal(new BigDecimal("1234.56"));
        MemoryGrid.move(src, dst);
        BigDecimal got = dst.getDecimal();
        // dst has scale 0, so truncates to 1234
        check("move BCD scale 2 -> scale 0 truncates fraction",
            got.compareTo(new BigDecimal("1234")) == 0, "got " + got);
    }

    private static void testHexLiteral() {
        // MOVE X"000102" — write raw bytes, ensure they survive.
        MemoryGrid g = new MemoryGrid(8);
        FieldDescriptor fd = FieldDescriptor.builder()
            .grid(g).at(0, 3).storage(FieldDescriptor.Storage.ALPHANUMERIC).name("X").build();
        fd.setRawBytes(new byte[] { 0x00, 0x01, 0x02 });
        byte[] got = fd.getRawBytes();
        check("hex literal X\"000102\" stored as raw bytes",
            got[0] == 0x00 && got[1] == 0x01 && got[2] == 0x02,
            String.format("got %02x %02x %02x", got[0]&0xff, got[1]&0xff, got[2]&0xff));
    }
}
