package com.lazarus.cobol;

/**
 * EXTERNAL data items — global storage shared by every program that declares
 * a field with the same name. The first declaration wins on length / initial
 * value; subsequent declarations get the same backing instance.
 *
 * Generated programs declare an EXTERNAL field as:
 *   private CobolString ext_var = CobolExternal.shared("EXT-VAR", 5);
 * which returns a singleton CobolString — every Java class that asks for
 * "EXT-VAR" gets the same instance, so a MOVE in one program is observable
 * from another.
 */
public final class CobolExternal {
    private CobolExternal() {}

    private static final java.util.Map<String, CobolString> _strings = new java.util.concurrent.ConcurrentHashMap<>();
    private static final java.util.Map<String, java.math.BigDecimal[]> _decimals = new java.util.concurrent.ConcurrentHashMap<>();
    private static final java.util.Map<String, long[]> _longs = new java.util.concurrent.ConcurrentHashMap<>();

    /** Get or create a shared CobolString for an EXTERNAL alphanumeric field.
     *  All programs declaring EXTERNAL X PIC X(N) under the same upper-cased
     *  name share one CobolString. */
    public static CobolString shared(String name, int length) {
        String key = name == null ? "" : name.toUpperCase().trim();
        return _strings.computeIfAbsent(key, k -> new CobolString(length));
    }

    /** Same as shared(name, length) but seeds the initial value when first allocated. */
    public static CobolString shared(String name, int length, String initial) {
        String key = name == null ? "" : name.toUpperCase().trim();
        return _strings.computeIfAbsent(key, k -> new CobolString(length, initial));
    }

    /** Get or create a shared 1-element BigDecimal cell for EXTERNAL numeric. */
    public static java.math.BigDecimal[] sharedDecimal(String name) {
        String key = name == null ? "" : name.toUpperCase().trim();
        return _decimals.computeIfAbsent(key, k -> new java.math.BigDecimal[]{ java.math.BigDecimal.ZERO });
    }

    /** Get or create a shared 1-element long cell for EXTERNAL integer. */
    public static long[] sharedLong(String name) {
        String key = name == null ? "" : name.toUpperCase().trim();
        return _longs.computeIfAbsent(key, k -> new long[]{ 0L });
    }

    /** Mutable int box for EXTERNAL int fields — acts as a shared lvalue. */
    public static final class IntRef {
        public int value;
        IntRef() {}
    }
    private static final java.util.Map<String, IntRef> _intRefs = new java.util.concurrent.ConcurrentHashMap<>();
    /** Get or create a shared IntRef for an EXTERNAL BINARY-LONG/int field. */
    public static IntRef sharedIntRef(String name) {
        String key = name == null ? "" : name.toUpperCase().trim();
        return _intRefs.computeIfAbsent(key, k -> new IntRef());
    }

    /** Reset all EXTERNAL state — for the daemon runner between tests. */
    public static void resetAll() {
        _strings.clear();
        _decimals.clear();
        _longs.clear();
        _intRefs.clear();
    }
}
