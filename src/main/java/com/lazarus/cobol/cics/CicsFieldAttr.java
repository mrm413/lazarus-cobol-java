package com.lazarus.cobol.cics;

/**
 * CICS BMS field attribute byte — maps DFHBMSCA copybook values
 * to screen field properties (protect, numeric, bright, dark, etc.).
 *
 * In mainframe BMS, the attribute byte is a single byte that controls:
 * - Protection (protected vs unprotected)
 * - Intensity (normal, bright, dark/hidden)
 * - MDT (Modified Data Tag — whether field was modified)
 * - Numeric-only input
 * - Autoskip (cursor skips to next unprotected field)
 */
public class CicsFieldAttr {

    // --- DFHBMSCA attribute byte constants ---
    // These match the actual mainframe hex values

    /** Unprotected, normal intensity */
    public static final byte DFHBMPRO  = (byte) 0xF0;  // Protected
    public static final byte DFHBMUNP  = (byte) 0x40;  // Unprotected
    public static final byte DFHBMUNN  = (byte) 0x50;  // Unprotected, numeric
    public static final byte DFHBMBRY  = (byte) 0xF8;  // Protected, bright
    public static final byte DFHBMDAR  = (byte) 0xFC;  // Protected, dark (hidden)
    public static final byte DFHBMASK  = (byte) 0xF1;  // Autoskip (protected + skip)
    public static final byte DFHBMFSE  = (byte) 0xC1;  // Unprotected + MDT set
    public static final byte DFHBMASF  = (byte) 0x71;  // Autoskip + modified

    // Individual attribute flags
    public static final int FLAG_PROTECTED = 0x01;
    public static final int FLAG_NUMERIC   = 0x02;
    public static final int FLAG_BRIGHT    = 0x04;
    public static final int FLAG_DARK      = 0x08;
    public static final int FLAG_MDT       = 0x10;
    public static final int FLAG_AUTOSKIP  = 0x20;

    private int flags;

    public CicsFieldAttr() {
        this.flags = 0; // Unprotected, normal, no MDT
    }

    public CicsFieldAttr(int flags) {
        this.flags = flags;
    }

    // --- Setters ---
    public CicsFieldAttr protect()    { flags |= FLAG_PROTECTED; return this; }
    public CicsFieldAttr unprotect()  { flags &= ~FLAG_PROTECTED; return this; }
    public CicsFieldAttr numeric()    { flags |= FLAG_NUMERIC; return this; }
    public CicsFieldAttr bright()     { flags |= FLAG_BRIGHT; flags &= ~FLAG_DARK; return this; }
    public CicsFieldAttr dark()       { flags |= FLAG_DARK; flags &= ~FLAG_BRIGHT; return this; }
    public CicsFieldAttr normal()     { flags &= ~(FLAG_BRIGHT | FLAG_DARK); return this; }
    public CicsFieldAttr setMdt()     { flags |= FLAG_MDT; return this; }
    public CicsFieldAttr resetMdt()   { flags &= ~FLAG_MDT; return this; }
    public CicsFieldAttr autoskip()   { flags |= FLAG_AUTOSKIP | FLAG_PROTECTED; return this; }

    // --- Getters ---
    public boolean isProtected()  { return (flags & FLAG_PROTECTED) != 0; }
    public boolean isNumeric()    { return (flags & FLAG_NUMERIC) != 0; }
    public boolean isBright()     { return (flags & FLAG_BRIGHT) != 0; }
    public boolean isDark()       { return (flags & FLAG_DARK) != 0; }
    public boolean isMdtSet()     { return (flags & FLAG_MDT) != 0; }
    public boolean isAutoskip()   { return (flags & FLAG_AUTOSKIP) != 0; }
    public int getFlags()         { return flags; }

    /** Convert DFHBMSCA byte to CicsFieldAttr */
    public static CicsFieldAttr fromBmsca(byte bmsca) {
        int f = 0;
        // Protection: bits 4-5 of attribute byte
        if ((bmsca & 0x20) != 0) f |= FLAG_PROTECTED;
        if ((bmsca & 0x10) != 0) f |= FLAG_NUMERIC;
        // Intensity: bits 2-3
        int intensity = (bmsca >> 2) & 0x03;
        if (intensity == 2) f |= FLAG_BRIGHT;
        if (intensity == 3) f |= FLAG_DARK;
        // MDT: bit 0
        if ((bmsca & 0x01) != 0) f |= FLAG_MDT;
        return new CicsFieldAttr(f);
    }

    /** Convert to JSON-friendly string */
    public String toAttrString() {
        StringBuilder sb = new StringBuilder();
        if (isProtected()) sb.append("PROT ");
        else sb.append("UNPROT ");
        if (isNumeric()) sb.append("NUM ");
        if (isBright()) sb.append("BRT ");
        if (isDark()) sb.append("DRK ");
        if (isMdtSet()) sb.append("MDT ");
        if (isAutoskip()) sb.append("ASKIP ");
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return "CicsFieldAttr[" + toAttrString() + "]";
    }
}
