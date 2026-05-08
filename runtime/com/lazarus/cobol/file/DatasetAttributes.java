package com.lazarus.cobol.file;

/**
 * Dataset attributes — DCB and space parameters for z/OS datasets.
 *
 * Key fields:
 *   RECFM:  F, FB, V, VB, FBA, VBA, U
 *   LRECL:  logical record length
 *   BLKSIZE: block size
 *   DSORG:  PS (sequential), PO (partitioned), DA (direct), IS (indexed)
 *   SPACE:  allocation in tracks/cylinders/blocks
 */
public class DatasetAttributes {

    /** Record format */
    public enum Recfm {
        F,    // Fixed
        FB,   // Fixed Blocked
        V,    // Variable
        VB,   // Variable Blocked
        FBA,  // Fixed Blocked ASA
        VBA,  // Variable Blocked ASA
        U     // Undefined
    }

    /** Dataset organization */
    public enum Dsorg {
        PS,   // Physical Sequential
        PO,   // Partitioned (PDS)
        DA,   // Direct Access
        IS    // Indexed Sequential (ISAM)
    }

    /** Space unit */
    public enum SpaceUnit {
        TRK,  // Tracks
        CYL,  // Cylinders
        BLK   // Blocks
    }

    private Recfm recfm = Recfm.FB;
    private int lrecl = 80;
    private int blksize = 0;
    private Dsorg dsorg = Dsorg.PS;
    private SpaceUnit spaceUnit = SpaceUnit.TRK;
    private int primarySpace = 0;
    private int secondarySpace = 0;
    private int dirBlocks = 0; // PDS directory blocks

    public DatasetAttributes() {}

    public DatasetAttributes(Recfm recfm, int lrecl, int blksize) {
        this.recfm = recfm;
        this.lrecl = lrecl;
        this.blksize = blksize;
    }

    // --- Accessors ---
    public Recfm getRecfm() { return recfm; }
    public void setRecfm(Recfm r) { this.recfm = r; }
    public int getLrecl() { return lrecl; }
    public void setLrecl(int n) { this.lrecl = n; }
    public int getBlksize() { return blksize; }
    public void setBlksize(int n) { this.blksize = n; }
    public Dsorg getDsorg() { return dsorg; }
    public void setDsorg(Dsorg d) { this.dsorg = d; }
    public SpaceUnit getSpaceUnit() { return spaceUnit; }
    public void setSpaceUnit(SpaceUnit u) { this.spaceUnit = u; }
    public int getPrimarySpace() { return primarySpace; }
    public void setPrimarySpace(int n) { this.primarySpace = n; }
    public int getSecondarySpace() { return secondarySpace; }
    public void setSecondarySpace(int n) { this.secondarySpace = n; }
    public int getDirBlocks() { return dirBlocks; }
    public void setDirBlocks(int n) { this.dirBlocks = n; }

    /** Compute effective block size if not set */
    public int getEffectiveBlksize() {
        if (blksize > 0) return blksize;
        if (recfm == Recfm.F || recfm == Recfm.FB || recfm == Recfm.FBA) {
            return lrecl; // Default: 1 record per block
        }
        return lrecl + 4; // Variable: add 4-byte RDW
    }

    /** Parse RECFM from string */
    public static Recfm parseRecfm(String s) {
        if (s == null) return Recfm.FB;
        switch (s.toUpperCase().trim()) {
            case "F":   return Recfm.F;
            case "FB":  return Recfm.FB;
            case "V":   return Recfm.V;
            case "VB":  return Recfm.VB;
            case "FBA": return Recfm.FBA;
            case "VBA": return Recfm.VBA;
            case "U":   return Recfm.U;
            default:    return Recfm.FB;
        }
    }

    /** Parse DSORG from string */
    public static Dsorg parseDsorg(String s) {
        if (s == null) return Dsorg.PS;
        switch (s.toUpperCase().trim()) {
            case "PS": return Dsorg.PS;
            case "PO": return Dsorg.PO;
            case "DA": return Dsorg.DA;
            case "IS": return Dsorg.IS;
            default:   return Dsorg.PS;
        }
    }

    @Override
    public String toString() {
        return "DCB(RECFM=" + recfm + ",LRECL=" + lrecl + ",BLKSIZE=" + getEffectiveBlksize() +
               ",DSORG=" + dsorg + ")";
    }
}
