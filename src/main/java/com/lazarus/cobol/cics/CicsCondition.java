package com.lazarus.cobol.cics;

/**
 * CICS condition exception — raised when a CICS command produces a non-NORMAL
 * response and no RESP option was specified (so the program didn't explicitly
 * check the response). Caught by HANDLE CONDITION handlers if registered.
 */
public class CicsCondition extends RuntimeException {
    private final int resp;
    private final int resp2;
    private final String conditionName;

    public CicsCondition(int resp, int resp2, String conditionName) {
        super("CICS condition: " + conditionName + " (RESP=" + resp + " RESP2=" + resp2 + ")");
        this.resp = resp;
        this.resp2 = resp2;
        this.conditionName = conditionName;
    }

    public int getResp() { return resp; }
    public int getResp2() { return resp2; }
    public String getConditionName() { return conditionName; }
}
