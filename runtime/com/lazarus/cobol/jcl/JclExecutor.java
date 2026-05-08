package com.lazarus.cobol.jcl;

import java.io.*;
import java.util.*;
import java.util.function.Supplier;
import java.util.regex.*;

/**
 * JCL Batch Executor — runs translated COBOL programs in JCL-defined sequence.
 *
 * Maps JCL constructs to Java execution:
 *   EXEC PGM=MYPROG → look up registered Java class, invoke main()
 *   DD DSN=...      → map dataset name to local file path
 *   PARM='...'      → pass as program arguments
 *   COND=(4,LT)     → skip step if condition met (single or compound)
 *   IF cond THEN    → conditional step execution
 *   SYSOUT=*        → capture to stdout or file
 *   DUMMY           → /dev/null equivalent
 *
 * Dataset mapping:
 *   Mainframe DSN like PROD.ACCOUNTS.MASTER → local path /data/prod/accounts/master.dat
 *   Configurable via addDatasetMapping() or automatic (DSN dots → directory separators)
 */
public class JclExecutor {

    private final Map<String, Supplier<Runnable>> programs = new LinkedHashMap<>();
    private final Map<String, String> datasetMappings = new LinkedHashMap<>();
    private String baseDir = ".";
    private final List<String> executionLog = new ArrayList<>();
    private final Map<String, Integer> stepReturnCodes = new LinkedHashMap<>();

    // IF/THEN/ELSE evaluation results
    private final Map<JclJob.JclIfBlock, Boolean> ifResults = new HashMap<>();

    public void registerProgram(String name, Supplier<Runnable> factory) {
        programs.put(name.toUpperCase().trim(), factory);
    }

    public void addDatasetMapping(String dsn, String localPath) {
        datasetMappings.put(dsn.toUpperCase().trim(), localPath);
    }

    public void setBaseDir(String dir) { this.baseDir = dir; }
    public List<String> getExecutionLog() { return executionLog; }

    public int getStepReturnCode(String stepName) {
        return stepReturnCodes.getOrDefault(stepName.toUpperCase(), -1);
    }

    /**
     * Execute a JCL job.
     * @return overall job return code (max of all step return codes)
     */
    public int execute(JclJob job) {
        executionLog.clear();
        stepReturnCodes.clear();
        ifResults.clear();
        int maxRC = 0;

        log("JOB %s STARTED — CLASS=%s", job.getJobName(), job.getJobClass());

        for (JclStep step : job.getSteps()) {
            // Check IF/THEN/ELSE context
            if (step.getIfBlock() != null) {
                JclJob.JclIfBlock ifBlock = step.getIfBlock();
                // Evaluate IF condition on first encounter
                if (!ifResults.containsKey(ifBlock)) {
                    boolean result = evaluateIfCondition(ifBlock.getCondition());
                    ifResults.put(ifBlock, result);
                    log("IF %s → %s", ifBlock.getCondition(), result ? "TRUE" : "FALSE");
                }
                boolean ifTrue = ifResults.get(ifBlock);
                // Skip step if it's in the wrong branch
                if (step.isInElseBranch() && ifTrue) {
                    log("STEP %s SKIPPED — IF condition TRUE, ELSE branch", step.getStepName());
                    step.setReturnCode(0);
                    stepReturnCodes.put(step.getStepName().toUpperCase(), 0);
                    continue;
                }
                if (!step.isInElseBranch() && !ifTrue) {
                    log("STEP %s SKIPPED — IF condition FALSE, THEN branch", step.getStepName());
                    step.setReturnCode(0);
                    stepReturnCodes.put(step.getStepName().toUpperCase(), 0);
                    continue;
                }
            }

            // Check COND — skip step if condition met
            if (shouldSkip(step)) {
                log("STEP %s SKIPPED — COND=%s", step.getStepName(), step.getCond());
                step.setReturnCode(0);
                stepReturnCodes.put(step.getStepName().toUpperCase(), 0);
                continue;
            }

            log("STEP %s EXEC PGM=%s", step.getStepName(), step.getProgram());

            // Resolve DD file paths
            for (JclDD dd : step.getDdStatements().values()) {
                if (dd.isConcatenated()) {
                    log("  DD %s (concat → %s) DSN=%s", dd.getDdName(), dd.getConcatenatedTo(), dd.getDsn());
                    String resolved = resolveDataset(dd.getDsn());
                    dd.setFilePath(resolved);
                    continue;
                }
                if (dd.isDummy()) {
                    log("  DD %s DUMMY", dd.getDdName());
                    continue;
                }
                if (dd.getType() == JclDD.DdType.SYSOUT) {
                    log("  DD %s SYSOUT=%s", dd.getDdName(), dd.getSysout());
                    continue;
                }
                if (dd.getType() == JclDD.DdType.INLINE) {
                    log("  DD %s INLINE (%d bytes)", dd.getDdName(), dd.getInlineData().length());
                    continue;
                }
                if (dd.isReferback()) {
                    log("  DD %s REFERBACK=*.%s", dd.getDdName(), dd.getReferback());
                    resolveReferback(dd, step);
                    continue;
                }
                String resolved = resolveDataset(dd.getDsn());
                dd.setFilePath(resolved);
                if (dd.isGdg()) {
                    log("  DD %s GDG=%s(%+d) → %s", dd.getDdName(), dd.getGdgBase(), dd.getGdgGeneration(), resolved);
                } else {
                    log("  DD %s DSN=%s → %s", dd.getDdName(), dd.getDsn(), resolved);
                }
            }

            // Execute the program
            int rc = executeStep(step);
            step.setReturnCode(rc);
            stepReturnCodes.put(step.getStepName().toUpperCase(), rc);
            maxRC = Math.max(maxRC, rc);

            log("STEP %s RC=%d", step.getStepName(), rc);
        }

        log("JOB %s ENDED — MAX RC=%d", job.getJobName(), maxRC);
        return maxRC;
    }

    private int executeStep(JclStep step) {
        String pgmName = step.getProgram().toUpperCase().trim();
        Supplier<Runnable> factory = programs.get(pgmName);
        if (factory == null) {
            log("  ERROR: Program %s not found", pgmName);
            return 12; // JCL error
        }

        try {
            Runnable program = factory.get();
            // Set up environment via system properties
            for (JclDD dd : step.getDdStatements().values()) {
                if (dd.getFilePath() != null && !dd.getFilePath().isEmpty()) {
                    System.setProperty("DD." + dd.getDdName(), dd.getFilePath());
                }
                if (dd.getType() == JclDD.DdType.INLINE) {
                    System.setProperty("DD." + dd.getDdName() + ".INLINE", dd.getInlineData());
                }
            }
            if (!step.getParm().isEmpty()) {
                System.setProperty("PARM", step.getParm());
            }

            program.run();
            return 0;
        } catch (Exception e) {
            log("  ABEND: %s — %s", pgmName, e.getMessage());
            return 16; // ABEND
        } finally {
            for (JclDD dd : step.getDdStatements().values()) {
                System.clearProperty("DD." + dd.getDdName());
                System.clearProperty("DD." + dd.getDdName() + ".INLINE");
            }
            System.clearProperty("PARM");
        }
    }

    /** Resolve dataset name to local file path */
    private String resolveDataset(String dsn) {
        if (dsn == null || dsn.isEmpty()) return "";

        // Check explicit mapping first
        String mapped = datasetMappings.get(dsn.toUpperCase().trim());
        if (mapped != null) return mapped;

        // Strip GDG generation for path resolution
        String cleanDsn = dsn;
        Matcher gdg = Pattern.compile("(.+)\\([+-]?\\d+\\)$").matcher(dsn);
        if (gdg.matches()) cleanDsn = gdg.group(1);

        // Check mapping with cleaned DSN
        mapped = datasetMappings.get(cleanDsn.toUpperCase().trim());
        if (mapped != null) return mapped;

        // Automatic: dots → directory separators, lowercase
        String path = cleanDsn.toLowerCase().replace(".", File.separator);
        if (dsn.startsWith("&&")) {
            path = System.getProperty("java.io.tmpdir") + File.separator + "jcl_" + dsn.substring(2).toLowerCase();
        }
        return baseDir + File.separator + path + ".dat";
    }

    /** Resolve referback: DSN=*.STEP1.DDNAME → copy path from earlier step's DD */
    private void resolveReferback(JclDD dd, JclStep currentStep) {
        String ref = dd.getReferback(); // e.g., "STEP1.OUTFILE"
        String[] parts = ref.split("\\.", 2);
        if (parts.length == 2) {
            String stepName = parts[0].toUpperCase();
            String ddName = parts[1].toUpperCase();
            // Search previous steps (job is not directly accessible, but steps are processed in order)
            // The referback DD gets resolved path from the referenced step's DD file path
            // For now, mark it for resolution at execution time
            dd.setFilePath("referback:" + ref);
        }
    }

    /** Check COND — supports single and compound format */
    private boolean shouldSkip(JclStep step) {
        String cond = step.getCond();
        if (cond == null || cond.isEmpty()) return false;

        // Compound COND: ((4,LT,STEP1),(8,LT,STEP2)) — skip if ANY condition is true
        if (cond.startsWith("((")) {
            return evaluateCompoundCond(cond);
        }

        // Single COND: (4,LT) or (4,LT,STEP1)
        return evaluateSingleCond(cond);
    }

    /** Evaluate compound COND=((rc,op,step),(rc,op,step),...) */
    private boolean evaluateCompoundCond(String cond) {
        // Strip outer parens: ((4,LT,S1),(8,EQ,S2)) → (4,LT,S1),(8,EQ,S2)
        String inner = cond.substring(1, cond.length() - 1);
        // Split by ),( keeping individual conditions
        Matcher m = Pattern.compile("\\(([^)]+)\\)").matcher(inner);
        while (m.find()) {
            String singleCond = "(" + m.group(1) + ")";
            if (evaluateSingleCond(singleCond)) return true; // ANY true → skip
        }
        return false;
    }

    /** Evaluate single COND=(rc,op) or COND=(rc,op,stepname) */
    private boolean evaluateSingleCond(String cond) {
        cond = cond.replace("(", "").replace(")", "").trim();
        String[] parts = cond.split(",");
        if (parts.length < 2) return false;

        try {
            int condCode = Integer.parseInt(parts[0].trim());
            String op = parts[1].trim().toUpperCase();
            int prevRC;
            if (parts.length >= 3) {
                prevRC = stepReturnCodes.getOrDefault(parts[2].trim().toUpperCase(), 0);
            } else {
                prevRC = stepReturnCodes.values().stream().mapToInt(Integer::intValue).max().orElse(0);
            }

            switch (op) {
                case "LT": return condCode < prevRC;
                case "LE": return condCode <= prevRC;
                case "EQ": return condCode == prevRC;
                case "NE": return condCode != prevRC;
                case "GT": return condCode > prevRC;
                case "GE": return condCode >= prevRC;
                default: return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /** Evaluate IF condition: STEP1.RC = 0, STEP2.RC > 4, etc. */
    private boolean evaluateIfCondition(String condition) {
        // Patterns: STEP1.RC = 0, STEP1.RC > 4, RC < 8, STEP1.RC = 0 & STEP2.RC = 0
        // For now, handle the common STEP.RC OP VALUE pattern
        condition = condition.trim();

        // Handle AND (&) / OR (|) — IBM JCL uses & and |
        if (condition.contains(" & ") || condition.contains(" AND ")) {
            String[] parts = condition.split("\\s+(&|AND)\\s+");
            for (String part : parts) {
                if (!evaluateSingleIfCondition(part.trim())) return false;
            }
            return true;
        }
        if (condition.contains(" | ") || condition.contains(" OR ")) {
            String[] parts = condition.split("\\s+(\\||OR)\\s+");
            for (String part : parts) {
                if (evaluateSingleIfCondition(part.trim())) return true;
            }
            return false;
        }

        return evaluateSingleIfCondition(condition);
    }

    /** Evaluate: STEP1.RC = 0, STEP1.RC > 4, LASTCC = 0, MAXCC < 8 */
    private boolean evaluateSingleIfCondition(String cond) {
        // Remove parens
        cond = cond.replace("(", "").replace(")", "").trim();
        // Pattern: STEP.RC OP VALUE  or  LASTCC OP VALUE  or  MAXCC OP VALUE
        Matcher m = Pattern.compile("(\\w+(?:\\.RC)?|\\.RC)\\s*(=|!=|<>|<|>|<=|>=|EQ|NE|LT|GT|LE|GE)\\s*(\\d+)", Pattern.CASE_INSENSITIVE).matcher(cond);
        if (!m.find()) return false;

        String lhs = m.group(1).toUpperCase();
        String op = m.group(2).toUpperCase();
        int rhs = Integer.parseInt(m.group(3));

        int lhsValue;
        if (lhs.equals("LASTCC")) {
            // Last step's RC
            lhsValue = stepReturnCodes.values().stream().reduce(0, (a, b) -> b); // last value
        } else if (lhs.equals("MAXCC")) {
            lhsValue = stepReturnCodes.values().stream().mapToInt(Integer::intValue).max().orElse(0);
        } else if (lhs.endsWith(".RC")) {
            String stepName = lhs.substring(0, lhs.length() - 3);
            lhsValue = stepReturnCodes.getOrDefault(stepName, 0);
        } else {
            // Bare step name — treat as STEP.RC
            lhsValue = stepReturnCodes.getOrDefault(lhs, 0);
        }

        switch (op) {
            case "=": case "EQ": return lhsValue == rhs;
            case "!=": case "<>": case "NE": return lhsValue != rhs;
            case "<": case "LT": return lhsValue < rhs;
            case ">": case "GT": return lhsValue > rhs;
            case "<=": case "LE": return lhsValue <= rhs;
            case ">=": case "GE": return lhsValue >= rhs;
            default: return false;
        }
    }

    private void log(String fmt, Object... args) {
        executionLog.add(String.format(fmt, args));
    }
}
