package com.lazarus.cobol.jcl;

import java.util.*;
import java.util.regex.*;

/**
 * JCL Parser — parses IBM JCL into JclJob/JclStep/JclDD objects.
 *
 * Handles:
 *   - JOB statement with CLASS, MSGCLASS, NOTIFY, TIME, REGION, TYPRUN, RESTART
 *   - EXEC PGM= and EXEC PROC= with PARM and COND (single + compound)
 *   - DD DSN=, DISP=, DCB=, SPACE=, SYSOUT=, DUMMY, DD concatenation
 *   - Continuation lines (trailing comma joins next // line)
 *   - Inline data (DD * ... /* or DD DATA,DLM=xx ... xx)
 *   - Comments (//* lines)
 *   - SET symbolic=value
 *   - JCLLIB ORDER=(lib1,lib2,...)
 *   - INCLUDE MEMBER=name
 *   - PROC/PEND in-stream procedure definitions with symbolic defaults
 *   - Symbolic parameter substitution (&NAME and &NAME.)
 *   - IF/THEN/ELSE/ENDIF conditional blocks
 *   - GDG references: DSN=MY.FILE(+1), DSN=MY.FILE(-1), DSN=MY.FILE(0)
 */
public class JclParser {

    /**
     * Parse a JCL file into a JclJob.
     * Two-pass: first collects PROC/PEND, then parses the job stream.
     */
    public static JclJob parse(String jclText) {
        List<String> rawLines = Arrays.asList(jclText.split("\\r?\\n"));
        List<String> joined = joinContinuations(rawLines);

        // Pass 1: extract in-stream PROCs
        Map<String, JclJob.JclProc> procs = extractProcs(joined);

        // Pass 2: parse job stream
        return parseJobStream(joined, procs);
    }

    /** Pass 1 — extract PROC/PEND blocks */
    private static Map<String, JclJob.JclProc> extractProcs(List<String> lines) {
        Map<String, JclJob.JclProc> procs = new LinkedHashMap<>();
        JclJob.JclProc currentProc = null;

        for (String line : lines) {
            if (!line.startsWith("//") || line.startsWith("//*")) continue;
            String content = line.substring(2);

            // PROC statement: //name PROC [sym1=default1,sym2=default2]
            if (content.matches("^\\S+\\s+PROC\\b.*")) {
                String name = content.split("\\s+")[0].trim();
                currentProc = new JclJob.JclProc(name);
                // Parse symbolic defaults
                String rest = content.substring(content.toUpperCase().indexOf("PROC") + 4).trim();
                if (!rest.isEmpty()) {
                    for (String pair : rest.split(",")) {
                        String[] kv = pair.split("=", 2);
                        if (kv.length == 2) {
                            currentProc.getDefaults().put(kv[0].trim().toUpperCase(), kv[1].trim());
                        } else if (kv.length == 1 && !kv[0].trim().isEmpty()) {
                            currentProc.getDefaults().put(kv[0].trim().toUpperCase(), "");
                        }
                    }
                }
                procs.put(name.toUpperCase(), currentProc);
                continue;
            }

            // PEND statement ends current PROC
            if (currentProc != null && (content.matches("^\\S*\\s*PEND\\b.*") || content.trim().equals("PEND"))) {
                currentProc = null;
                continue;
            }

            // Collect lines inside PROC body
            if (currentProc != null) {
                currentProc.getBody().add(line);
            }
        }
        return procs;
    }

    /** Pass 2 — parse the job stream */
    private static JclJob parseJobStream(List<String> lines, Map<String, JclJob.JclProc> procs) {
        JclJob job = null;
        JclStep currentStep = null;
        String lastDDName = null; // for DD concatenation
        boolean inInlineData = false;
        StringBuilder inlineBuffer = new StringBuilder();
        String inlineDDName = null;
        String customDelimiter = null;

        // IF/THEN/ELSE/ENDIF tracking
        JclJob.JclIfBlock currentIf = null;
        boolean inElse = false;
        boolean inProc = false; // skip PROC body lines (already extracted)

        for (String line : lines) {
            // Inline data mode
            if (inInlineData) {
                boolean endOfInline = false;
                if (customDelimiter != null) {
                    endOfInline = line.trim().equals(customDelimiter);
                } else {
                    endOfInline = line.startsWith("/*") || (line.startsWith("//") && !line.startsWith("//*"));
                }

                if (endOfInline) {
                    if (currentStep != null && inlineDDName != null) {
                        JclDD dd = currentStep.getDD(inlineDDName);
                        if (dd != null) dd.setInlineData(inlineBuffer.toString());
                    }
                    inInlineData = false;
                    inlineBuffer = new StringBuilder();
                    customDelimiter = null;
                    if (line.startsWith("/*") || (customDelimiter == null && !line.startsWith("//"))) continue;
                    // Fall through to process the // line
                } else {
                    if (inlineBuffer.length() > 0) inlineBuffer.append("\n");
                    inlineBuffer.append(line);
                    continue;
                }
            }

            // Skip non-JCL lines
            if (!line.startsWith("//")) continue;
            // Skip comments
            if (line.startsWith("//*")) continue;

            String content = line.substring(2); // strip //

            // Skip PROC/PEND body lines (already collected in pass 1)
            if (content.matches("^\\S+\\s+PROC\\b.*")) { inProc = true; continue; }
            if (inProc) {
                if (content.matches("^\\S*\\s*PEND\\b.*") || content.trim().equals("PEND")) {
                    inProc = false;
                }
                continue;
            }

            // Parse JOB statement
            if (content.contains(" JOB ") || content.matches("^\\S+\\s+JOB\\b.*")) {
                String jobName = content.split("\\s+")[0];
                job = new JclJob(jobName);
                job.getProcs().putAll(procs);
                parseJobParams(content, job);
                continue;
            }

            if (job == null) {
                job = new JclJob("UNNAMED");
                job.getProcs().putAll(procs);
            }

            String contentUpper = content.toUpperCase();

            // SET statement: // SET sym=value
            if (contentUpper.trim().startsWith("SET ") || contentUpper.matches("^\\S+\\s+SET\\b.*")) {
                String rest = content;
                if (rest.trim().toUpperCase().startsWith("SET ")) {
                    rest = rest.trim().substring(4).trim();
                } else {
                    rest = rest.substring(rest.toUpperCase().indexOf("SET") + 3).trim();
                }
                for (String pair : rest.split(",")) {
                    String[] kv = pair.split("=", 2);
                    if (kv.length == 2) {
                        job.getSetVariables().put(kv[0].trim().toUpperCase(), kv[1].trim());
                    }
                }
                continue;
            }

            // JCLLIB ORDER=(lib1,lib2,...)
            if (contentUpper.contains("JCLLIB")) {
                String order = extractParam(content, "ORDER");
                if (!order.isEmpty()) {
                    order = order.replace("(", "").replace(")", "");
                    for (String lib : order.split(",")) {
                        if (!lib.trim().isEmpty()) job.getJcllib().add(lib.trim());
                    }
                }
                continue;
            }

            // INCLUDE MEMBER=name
            if (contentUpper.contains("INCLUDE") && contentUpper.contains("MEMBER")) {
                String member = extractParam(content, "MEMBER");
                if (!member.isEmpty()) job.getIncludes().add(member);
                continue;
            }

            // IF/THEN/ELSE/ENDIF
            if (contentUpper.trim().startsWith("IF ") && contentUpper.contains(" THEN")) {
                String cond = content.trim();
                // Extract condition between IF and THEN
                int ifIdx = cond.toUpperCase().indexOf("IF ") + 3;
                int thenIdx = cond.toUpperCase().indexOf(" THEN");
                if (thenIdx > ifIdx) {
                    cond = cond.substring(ifIdx, thenIdx).trim();
                }
                currentIf = new JclJob.JclIfBlock(cond);
                job.getIfBlocks().add(currentIf);
                inElse = false;
                continue;
            }
            if (contentUpper.trim().equals("ELSE") || contentUpper.trim().startsWith("ELSE ")) {
                if (currentIf != null) inElse = true;
                continue;
            }
            if (contentUpper.trim().equals("ENDIF") || contentUpper.trim().startsWith("ENDIF ")) {
                currentIf = null;
                inElse = false;
                continue;
            }

            // Null statement (bare //)
            if (content.trim().isEmpty()) continue;

            // Parse EXEC statement
            if (contentUpper.contains(" EXEC ") || content.matches("^\\S+\\s+EXEC\\b.*")) {
                String stepName = content.split("\\s+")[0];
                String rest = content.substring(content.toUpperCase().indexOf("EXEC") + 4).trim();

                String pgm = extractParam(rest, "PGM");
                String procName = extractParam(rest, "PROC");
                boolean isProc = false;

                if (!pgm.isEmpty()) {
                    // EXEC PGM=xxx
                } else if (!procName.isEmpty()) {
                    // EXEC PROC=xxx — expand inline proc
                    pgm = procName;
                    isProc = true;
                } else {
                    // EXEC procname — bare name is a proc reference
                    pgm = rest.split("[,\\s]")[0].trim();
                    isProc = true;
                }

                // Apply symbolic substitution to PGM name
                pgm = substituteSymbolics(pgm, job.getSetVariables());

                currentStep = new JclStep(stepName, pgm);
                currentStep.setParm(extractParam(rest, "PARM"));
                currentStep.setCond(extractParam(rest, "COND"));
                currentStep.setIsProc(isProc);

                // Extract TIME and REGION at step level
                String stepTime = extractParam(rest, "TIME");
                if (!stepTime.isEmpty()) currentStep.setTime(stepTime);
                String stepRegion = extractParam(rest, "REGION");
                if (!stepRegion.isEmpty()) currentStep.setRegion(stepRegion);

                // If inside IF block, add to appropriate branch
                if (currentIf != null) {
                    if (inElse) {
                        currentIf.getElseSteps().add(currentStep);
                    } else {
                        currentIf.getThenSteps().add(currentStep);
                    }
                }

                // Always add to main step list for flat execution
                job.getSteps().add(currentStep);
                // Mark step with its IF context for executor
                currentStep.setIfBlock(currentIf);
                currentStep.setInElseBranch(inElse);

                lastDDName = null;
                continue;
            }

            // Parse DD statement (or DD concatenation)
            if (currentStep != null) {
                String trimmed = content.trim();
                String ddName = content.split("\\s+")[0];
                String rest = content.substring(ddName.length()).trim();

                // Detect DD concatenation: unnamed line starting with DD
                // e.g., "//      DD DSN=..." where ddName is empty
                if (ddName.isEmpty() && trimmed.toUpperCase().startsWith("DD ") && lastDDName != null) {
                    String concatRest = trimmed.substring(2).trim();
                    concatRest = substituteSymbolics(concatRest, job.getSetVariables());
                    String concatName = lastDDName + "_CONCAT_" + currentStep.getConcatCount(lastDDName);
                    JclDD dd = currentStep.addDD(concatName);
                    dd.setConcatenatedTo(lastDDName);
                    parseDDParams(concatRest, dd);
                    currentStep.incrementConcatCount(lastDDName);
                } else if (rest.toUpperCase().startsWith("DD")) {
                    rest = rest.substring(2).trim();

                    // Apply symbolic substitution
                    rest = substituteSymbolics(rest, job.getSetVariables());

                    JclDD dd = currentStep.addDD(ddName);
                    parseDDParams(rest, dd);
                    lastDDName = ddName;

                    // Check for inline data
                    if (rest.equals("*") || rest.startsWith("* ") || rest.toUpperCase().startsWith("DATA")) {
                        inInlineData = true;
                        inlineDDName = ddName;
                        dd.setType(JclDD.DdType.INLINE);
                        // Check DLM= for custom delimiter
                        String dlm = extractParam(rest, "DLM");
                        if (!dlm.isEmpty()) customDelimiter = dlm;
                    }
                }
            }
        }

        return job != null ? job : new JclJob("EMPTY");
    }

    /** Join continuation lines (lines where previous ends with comma) */
    static List<String> joinContinuations(List<String> rawLines) {
        List<String> result = new ArrayList<>();
        StringBuilder current = null;

        for (String line : rawLines) {
            if (line.startsWith("//") && !line.startsWith("//*")) {
                String content = line.substring(2);
                if (current != null && current.toString().trim().endsWith(",")) {
                    current.append(" ").append(content.trim());
                } else {
                    if (current != null) result.add(current.toString());
                    current = new StringBuilder(line);
                }
            } else {
                if (current != null) {
                    result.add(current.toString());
                    current = null;
                }
                result.add(line);
            }
        }
        if (current != null) result.add(current.toString());
        return result;
    }

    /** Substitute &SYMBOL and &SYMBOL. references with values from SET variables / PROC defaults */
    static String substituteSymbolics(String text, Map<String, String> vars) {
        if (text == null || vars.isEmpty()) return text;
        // Replace &SYM. (with dot terminator) and &SYM (without dot, at word boundary)
        for (Map.Entry<String, String> entry : vars.entrySet()) {
            String sym = entry.getKey();
            String val = entry.getValue();
            // &SYM. — dot is consumed as part of the symbol reference
            text = text.replace("&" + sym + ".", val);
            // &SYM at end of string or followed by non-alphanumeric
            text = text.replaceAll("&" + sym + "(?![A-Za-z0-9])", val);
            // Case-insensitive variants
            text = text.replace("&" + sym.toLowerCase() + ".", val);
            text = text.replaceAll("(?i)&" + sym + "(?![A-Za-z0-9])", val);
        }
        return text;
    }

    private static void parseJobParams(String line, JclJob job) {
        String cls = extractParam(line, "CLASS");
        if (!cls.isEmpty()) job.setJobClass(cls);
        String msg = extractParam(line, "MSGCLASS");
        if (!msg.isEmpty()) job.setMsgClass(msg);
        String notify = extractParam(line, "NOTIFY");
        if (!notify.isEmpty()) job.setNotify(notify);
        String time = extractParam(line, "TIME");
        if (!time.isEmpty()) job.setTime(time);
        String region = extractParam(line, "REGION");
        if (!region.isEmpty()) job.setRegion(region);
        String typrun = extractParam(line, "TYPRUN");
        if (!typrun.isEmpty()) job.setTyprun(typrun);
        String restart = extractParam(line, "RESTART");
        if (!restart.isEmpty()) job.setRestart(restart);
        // Extract programmer name from quoted string after JOB
        Matcher m = Pattern.compile("'([^']*)'").matcher(line);
        if (m.find()) job.setProgrammer(m.group(1));
    }

    static void parseDDParams(String params, JclDD dd) {
        if (params.equalsIgnoreCase("DUMMY")) {
            dd.setType(JclDD.DdType.DUMMY);
            return;
        }

        // DSN / DSNAME
        String dsn = extractParam(params, "DSN");
        if (dsn.isEmpty()) dsn = extractParam(params, "DSNAME");
        if (!dsn.isEmpty()) {
            dd.setDsn(dsn);
            if (dsn.startsWith("&&")) {
                dd.setType(JclDD.DdType.TEMP);
            }
            // Detect GDG reference: DSN=BASE(+1) or DSN=BASE(-1) or DSN=BASE(0)
            Matcher gdg = Pattern.compile("(.+)\\(([+-]?\\d+)\\)$").matcher(dsn);
            if (gdg.matches()) {
                dd.setGdgBase(gdg.group(1));
                dd.setGdgGeneration(Integer.parseInt(gdg.group(2)));
            }
            // Detect referback: DSN=*.stepname.ddname
            if (dsn.startsWith("*.")) {
                dd.setReferback(dsn.substring(2));
            }
        }

        // SYSOUT
        String sysout = extractParam(params, "SYSOUT");
        if (!sysout.isEmpty()) dd.setSysout(sysout);

        // DISP
        String disp = extractParam(params, "DISP");
        if (!disp.isEmpty()) {
            disp = disp.replace("(", "").replace(")", "");
            String[] parts = disp.split(",");
            if (parts.length > 0) dd.setDisp(parts[0].trim());
            if (parts.length > 1) dd.setDispNorm(parts[1].trim());
            if (parts.length > 2) dd.setDispAbnd(parts[2].trim());
        }

        // DCB sub-parameters
        String dcb = extractParam(params, "DCB");
        if (!dcb.isEmpty()) {
            dcb = dcb.replace("(", "").replace(")", "");
            for (String kv : dcb.split(",")) {
                String[] pair = kv.split("=", 2);
                if (pair.length == 2) {
                    String key = pair[0].trim().toUpperCase();
                    String val = pair[1].trim();
                    dd.getDcb().put(key, val);
                    if ("RECFM".equals(key)) dd.setRecfm(val);
                    if ("LRECL".equals(key)) {
                        try { dd.setLrecl(Integer.parseInt(val)); } catch (NumberFormatException e) {}
                    }
                    if ("BLKSIZE".equals(key)) {
                        try { dd.setBlksize(Integer.parseInt(val)); } catch (NumberFormatException e) {}
                    }
                }
            }
        }

        // Direct RECFM/LRECL/BLKSIZE outside DCB
        String recfm = extractParam(params, "RECFM");
        if (!recfm.isEmpty()) dd.setRecfm(recfm);
        String lrecl = extractParam(params, "LRECL");
        if (!lrecl.isEmpty()) try { dd.setLrecl(Integer.parseInt(lrecl)); } catch (NumberFormatException e) {}
        String blksize = extractParam(params, "BLKSIZE");
        if (!blksize.isEmpty()) try { dd.setBlksize(Integer.parseInt(blksize)); } catch (NumberFormatException e) {}

        // SPACE
        String space = extractParam(params, "SPACE");
        if (!space.isEmpty()) dd.setSpace(space);

        // UNIT
        String unit = extractParam(params, "UNIT");
        if (!unit.isEmpty()) dd.setUnit(unit);

        // VOL=SER=
        String vol = extractParam(params, "VOL");
        if (!vol.isEmpty()) dd.setVolume(vol);

        // LABEL
        String label = extractParam(params, "LABEL");
        if (!label.isEmpty()) dd.setLabel(label);

        // PATH (USS)
        String path = extractParam(params, "PATH");
        if (!path.isEmpty()) dd.setUssPath(path);

        // DLM
        String dlm = extractParam(params, "DLM");
        if (!dlm.isEmpty()) dd.setDlm(dlm);
    }

    /** Extract a named parameter value: NAME=value or NAME=(value,...) */
    static String extractParam(String text, String param) {
        // Try nested parens first: NAME=((a,b),(c,d)) — compound COND
        Pattern nested = Pattern.compile("\\b" + param + "=(\\(\\([^)]*\\)(?:,\\([^)]*\\))*\\))", Pattern.CASE_INSENSITIVE);
        Matcher mn = nested.matcher(text);
        if (mn.find()) {
            return mn.group(1);
        }
        // Try parenthesized value: NAME=(value,...)
        Pattern paren = Pattern.compile("\\b" + param + "=(\\([^)]*\\))", Pattern.CASE_INSENSITIVE);
        Matcher mp = paren.matcher(text);
        if (mp.find()) {
            return mp.group(1);
        }
        // Try value with embedded parens: NAME=text(stuff) e.g. DSN=MY.GDG(+1)
        Pattern embedded = Pattern.compile("\\b" + param + "=([^,\\s]+\\([^)]*\\))", Pattern.CASE_INSENSITIVE);
        Matcher me = embedded.matcher(text);
        if (me.find()) {
            String val = me.group(1);
            if (val.startsWith("'") && val.endsWith("'")) val = val.substring(1, val.length() - 1);
            return val;
        }
        // Fall back to simple value (no commas, spaces, or closing parens)
        Pattern simple = Pattern.compile("\\b" + param + "=([^,\\s)]+)", Pattern.CASE_INSENSITIVE);
        Matcher ms = simple.matcher(text);
        if (ms.find()) {
            String val = ms.group(1);
            if (val.startsWith("'") && val.endsWith("'")) val = val.substring(1, val.length() - 1);
            return val;
        }
        return "";
    }
}
