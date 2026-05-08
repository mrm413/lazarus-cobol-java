package com.lazarus.cobol.jcl;

import java.util.*;

/**
 * JCL Job — represents a parsed JCL job with steps, DD statements, and parameters.
 *
 * JCL structure:
 *   //JOBNAME JOB (acct),'programmer',CLASS=A,MSGCLASS=X
 *   //STEP1   EXEC PGM=MYPROG,PARM='param'
 *   //INFILE  DD DSN=MY.INPUT.FILE,DISP=SHR
 *   //OUTFILE DD DSN=MY.OUTPUT.FILE,DISP=(NEW,CATLG,DELETE),
 *   //           SPACE=(CYL,(10,5)),DCB=(RECFM=FB,LRECL=80,BLKSIZE=800)
 *   //SYSPRINT DD SYSOUT=*
 *   //STEP2   EXEC PGM=SORT,...
 *   //SYSIN   DD *
 *   [inline data]
 *   /*
 */
public class JclJob {
    private String jobName;
    private String jobClass = "A";
    private String msgClass = "X";
    private String programmer = "";
    private String notify = "";
    private String time = "";
    private String region = "";
    private String typrun = "";
    private String restart = "";
    private final List<JclStep> steps = new ArrayList<>();
    private final Map<String, String> jobParams = new LinkedHashMap<>();
    private final Map<String, String> setVariables = new LinkedHashMap<>();
    private final List<String> jcllib = new ArrayList<>();
    private final List<String> includes = new ArrayList<>();
    private final List<JclIfBlock> ifBlocks = new ArrayList<>();
    private final Map<String, JclProc> procs = new LinkedHashMap<>();

    public JclJob(String jobName) {
        this.jobName = jobName;
    }

    public String getJobName() { return jobName; }
    public String getJobClass() { return jobClass; }
    public void setJobClass(String cls) { this.jobClass = cls; }
    public String getMsgClass() { return msgClass; }
    public void setMsgClass(String cls) { this.msgClass = cls; }
    public String getProgrammer() { return programmer; }
    public void setProgrammer(String p) { this.programmer = p; }
    public String getNotify() { return notify; }
    public void setNotify(String n) { this.notify = n; }
    public String getTime() { return time; }
    public void setTime(String t) { this.time = t; }
    public String getRegion() { return region; }
    public void setRegion(String r) { this.region = r; }
    public String getTyprun() { return typrun; }
    public void setTyprun(String t) { this.typrun = t; }
    public String getRestart() { return restart; }
    public void setRestart(String r) { this.restart = r; }
    public List<JclStep> getSteps() { return steps; }
    public Map<String, String> getJobParams() { return jobParams; }
    public Map<String, String> getSetVariables() { return setVariables; }
    public List<String> getJcllib() { return jcllib; }
    public List<String> getIncludes() { return includes; }
    public List<JclIfBlock> getIfBlocks() { return ifBlocks; }
    public Map<String, JclProc> getProcs() { return procs; }

    public JclStep addStep(String stepName, String program) {
        JclStep step = new JclStep(stepName, program);
        steps.add(step);
        return step;
    }

    /** In-stream procedure definition */
    public static class JclProc {
        private final String name;
        private final Map<String, String> defaults = new LinkedHashMap<>();
        private final List<String> body = new ArrayList<>();

        public JclProc(String name) { this.name = name; }
        public String getName() { return name; }
        public Map<String, String> getDefaults() { return defaults; }
        public List<String> getBody() { return body; }
    }

    /** IF/THEN/ELSE/ENDIF block */
    public static class JclIfBlock {
        private final String condition;
        private final List<JclStep> thenSteps = new ArrayList<>();
        private final List<JclStep> elseSteps = new ArrayList<>();

        public JclIfBlock(String condition) { this.condition = condition; }
        public String getCondition() { return condition; }
        public List<JclStep> getThenSteps() { return thenSteps; }
        public List<JclStep> getElseSteps() { return elseSteps; }
    }
}
