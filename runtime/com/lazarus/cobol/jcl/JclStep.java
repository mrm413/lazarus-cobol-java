package com.lazarus.cobol.jcl;

import java.util.*;

/**
 * JCL Step — one EXEC statement with its DD definitions.
 *
 * Maps to: //STEPNAME EXEC PGM=program,PARM='parameters'
 * Followed by DD statements that define file allocations.
 */
public class JclStep {
    private final String stepName;
    private final String program;
    private String parm = "";
    private String cond = "";
    private String time = "";
    private String region = "";
    private boolean isProc = false;
    private final Map<String, JclDD> ddStatements = new LinkedHashMap<>();
    private int returnCode = 0;

    // IF/THEN/ELSE context
    private JclJob.JclIfBlock ifBlock = null;
    private boolean inElseBranch = false;

    // DD concatenation counters
    private final Map<String, Integer> concatCounts = new HashMap<>();

    public JclStep(String stepName, String program) {
        this.stepName = stepName;
        this.program = program;
    }

    public String getStepName() { return stepName; }
    public String getProgram() { return program; }
    public String getParm() { return parm; }
    public void setParm(String parm) { this.parm = parm; }
    public String getCond() { return cond; }
    public void setCond(String cond) { this.cond = cond; }
    public String getTime() { return time; }
    public void setTime(String t) { this.time = t; }
    public String getRegion() { return region; }
    public void setRegion(String r) { this.region = r; }
    public boolean isProc() { return isProc; }
    public void setIsProc(boolean p) { this.isProc = p; }
    public int getReturnCode() { return returnCode; }
    public void setReturnCode(int rc) { this.returnCode = rc; }
    public Map<String, JclDD> getDdStatements() { return ddStatements; }

    // IF block context
    public JclJob.JclIfBlock getIfBlock() { return ifBlock; }
    public void setIfBlock(JclJob.JclIfBlock b) { this.ifBlock = b; }
    public boolean isInElseBranch() { return inElseBranch; }
    public void setInElseBranch(boolean e) { this.inElseBranch = e; }

    /** Add a DD statement to this step */
    public JclDD addDD(String ddName) {
        JclDD dd = new JclDD(ddName);
        ddStatements.put(ddName.toUpperCase(), dd);
        return dd;
    }

    /** Get a DD statement by name */
    public JclDD getDD(String ddName) {
        return ddStatements.get(ddName.toUpperCase());
    }

    /** Get all DD statements concatenated to a base DD name */
    public List<JclDD> getConcatenatedDDs(String baseDDName) {
        List<JclDD> result = new ArrayList<>();
        JclDD base = getDD(baseDDName);
        if (base != null) result.add(base);
        for (JclDD dd : ddStatements.values()) {
            if (baseDDName.equalsIgnoreCase(dd.getConcatenatedTo())) {
                result.add(dd);
            }
        }
        return result;
    }

    /** Track DD concatenation count */
    public int getConcatCount(String ddName) {
        return concatCounts.getOrDefault(ddName.toUpperCase(), 0);
    }

    public void incrementConcatCount(String ddName) {
        String key = ddName.toUpperCase();
        concatCounts.put(key, concatCounts.getOrDefault(key, 0) + 1);
    }
}
