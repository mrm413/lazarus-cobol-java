package com.lazarus.cobol.jcl;

import java.util.*;

/**
 * JCL DD Statement — Data Definition for file allocation.
 *
 * Maps mainframe datasets to Java file paths:
 *   //INFILE DD DSN=MY.DATA.FILE,DISP=SHR
 *     → maps to a local file path for the translated program
 *
 * DD types:
 *   - DSN: dataset name → file path mapping
 *   - SYSOUT: spooled output → stdout/file
 *   - DUMMY: /dev/null equivalent
 *   - INLINE (*): embedded data in JCL
 *   - TEMP: temporary dataset (&& prefix)
 */
public class JclDD {
    public enum DdType { DSN, SYSOUT, DUMMY, INLINE, TEMP }

    private final String ddName;
    private DdType type = DdType.DSN;
    private String dsn = "";        // Dataset name
    private String filePath = "";   // Resolved local file path
    private String disp = "SHR";   // Disposition: SHR, OLD, NEW, MOD
    private String dispNorm = "";   // Normal disposition: CATLG, DELETE, KEEP, PASS
    private String dispAbnd = "";   // Abnormal disposition: CATLG, DELETE, KEEP
    private String recfm = "FB";   // Record format: F, FB, V, VB, U
    private int lrecl = 80;        // Logical record length
    private int blksize = 0;       // Block size
    private String sysout = "";    // SYSOUT class
    private String inlineData = ""; // Inline data (DD *)
    private final Map<String, String> dcb = new LinkedHashMap<>();

    // GDG fields
    private String gdgBase = "";        // GDG base name (without generation)
    private int gdgGeneration = 0;      // +1, 0, -1, etc.

    // Referback: DSN=*.stepname.ddname
    private String referback = "";

    // DD concatenation
    private String concatenatedTo = ""; // base DD name this is concatenated to

    // Additional JCL parameters
    private String space = "";
    private String unit = "";
    private String volume = "";
    private String label = "";
    private String ussPath = "";        // PATH= (USS)
    private String dlm = "";            // DLM= custom delimiter

    public JclDD(String ddName) {
        this.ddName = ddName.toUpperCase();
    }

    // Core accessors
    public String getDdName() { return ddName; }
    public DdType getType() { return type; }
    public void setType(DdType type) { this.type = type; }
    public String getDsn() { return dsn; }
    public void setDsn(String dsn) { this.dsn = dsn; }
    public String getFilePath() { return filePath; }
    public void setFilePath(String path) { this.filePath = path; }
    public String getDisp() { return disp; }
    public void setDisp(String disp) { this.disp = disp; }
    public String getDispNorm() { return dispNorm; }
    public void setDispNorm(String d) { this.dispNorm = d; }
    public String getDispAbnd() { return dispAbnd; }
    public void setDispAbnd(String d) { this.dispAbnd = d; }
    public String getRecfm() { return recfm; }
    public void setRecfm(String recfm) { this.recfm = recfm; }
    public int getLrecl() { return lrecl; }
    public void setLrecl(int lrecl) { this.lrecl = lrecl; }
    public int getBlksize() { return blksize; }
    public void setBlksize(int blksize) { this.blksize = blksize; }
    public String getSysout() { return sysout; }
    public void setSysout(String cls) { this.sysout = cls; this.type = DdType.SYSOUT; }
    public String getInlineData() { return inlineData; }
    public void setInlineData(String data) { this.inlineData = data; this.type = DdType.INLINE; }
    public Map<String, String> getDcb() { return dcb; }

    // GDG accessors
    public String getGdgBase() { return gdgBase; }
    public void setGdgBase(String base) { this.gdgBase = base; }
    public int getGdgGeneration() { return gdgGeneration; }
    public void setGdgGeneration(int gen) { this.gdgGeneration = gen; }
    public boolean isGdg() { return !gdgBase.isEmpty(); }

    // Referback
    public String getReferback() { return referback; }
    public void setReferback(String ref) { this.referback = ref; }
    public boolean isReferback() { return !referback.isEmpty(); }

    // Concatenation
    public String getConcatenatedTo() { return concatenatedTo; }
    public void setConcatenatedTo(String base) { this.concatenatedTo = base; }
    public boolean isConcatenated() { return !concatenatedTo.isEmpty(); }

    // Additional parameters
    public String getSpace() { return space; }
    public void setSpace(String s) { this.space = s; }
    public String getUnit() { return unit; }
    public void setUnit(String u) { this.unit = u; }
    public String getVolume() { return volume; }
    public void setVolume(String v) { this.volume = v; }
    public String getLabel() { return label; }
    public void setLabel(String l) { this.label = l; }
    public String getUssPath() { return ussPath; }
    public void setUssPath(String p) { this.ussPath = p; }
    public String getDlm() { return dlm; }
    public void setDlm(String d) { this.dlm = d; }

    /** Check if this DD is a dummy (no actual I/O) */
    public boolean isDummy() { return type == DdType.DUMMY; }

    /** Check if this is a temporary dataset */
    public boolean isTemporary() { return dsn.startsWith("&&") || type == DdType.TEMP; }
}
