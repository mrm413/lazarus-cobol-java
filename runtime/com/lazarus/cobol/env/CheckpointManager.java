package com.lazarus.cobol.env;

import java.util.*;
import java.io.*;

/**
 * Batch Checkpoint/Restart facility for COBOL programs.
 *
 * Maps to IBM z/OS checkpoint/restart:
 *   EXEC CICS SYNCPOINT ... (CICS)
 *   CHKP  — Take a checkpoint (batch)
 *   XRST  — Restart from checkpoint (batch)
 *   SORT CHKPT — Sort checkpoint
 *
 * Provides:
 *   - Named checkpoints with serialized working storage state
 *   - Step-level restart capability
 *   - Automatic/deferred restart detection
 *   - Commit frequency control (every N records)
 *   - Step tracking and completion status
 *   - Checkpoint log for recovery analysis
 *
 * Checkpoint state includes:
 *   - All working storage variables (as name→value map)
 *   - Current file positions
 *   - Record counts (input read, output written)
 *   - Step name and sequence number
 */
public class CheckpointManager {

    public enum RestartMode { CLEAN_START, AUTOMATIC_RESTART, DEFERRED_RESTART }
    public enum StepStatus { NOT_STARTED, RUNNING, COMPLETED, FAILED, RESTARTED }

    // Active checkpoints: checkpoint-id → state
    private final Map<String, CheckpointState> checkpoints = new LinkedHashMap<>();

    // Step tracking
    private final Map<String, StepInfo> steps = new LinkedHashMap<>();

    // Checkpoint log
    private final List<String> checkpointLog = new ArrayList<>();

    // Configuration
    private int commitFrequency = 0; // 0 = no automatic checkpoints
    private int recordsSinceCheckpoint = 0;
    private int autoSequence = 0;
    private RestartMode restartMode = RestartMode.CLEAN_START;
    private String lastCheckpointId = null;
    private boolean restartPending = false;

    // --- Checkpoint State ---

    public static class CheckpointState implements Serializable {
        private static final long serialVersionUID = 1L;
        public final String checkpointId;
        public final String stepName;
        public final long timestamp;
        public final Map<String, String> workingStorage;
        public final Map<String, Long> filePositions;
        public final long inputCount;
        public final long outputCount;
        public final int sequenceNumber;

        public CheckpointState(String id, String step, Map<String, String> ws,
                               Map<String, Long> fp, long inCount, long outCount, int seq) {
            this.checkpointId = id;
            this.stepName = step;
            this.timestamp = System.currentTimeMillis();
            this.workingStorage = new LinkedHashMap<>(ws);
            this.filePositions = new LinkedHashMap<>(fp);
            this.inputCount = inCount;
            this.outputCount = outCount;
            this.sequenceNumber = seq;
        }
    }

    // --- Step Info ---

    public static class StepInfo {
        public final String stepName;
        public StepStatus status;
        public long startTime;
        public long endTime;
        public long recordsProcessed;
        public String lastCheckpointId;
        public int returnCode;

        public StepInfo(String name) {
            this.stepName = name;
            this.status = StepStatus.NOT_STARTED;
        }
    }

    // --- Configuration ---

    public void setCommitFrequency(int freq) { this.commitFrequency = freq; }
    public int getCommitFrequency() { return commitFrequency; }
    public void setRestartMode(RestartMode mode) { this.restartMode = mode; }
    public RestartMode getRestartMode() { return restartMode; }

    // --- CHKP: Take Checkpoint ---

    public boolean checkpoint(String checkpointId, String stepName,
                              Map<String, String> workingStorage,
                              Map<String, Long> filePositions,
                              long inputCount, long outputCount) {
        int seq = checkpoints.size() + 1;
        CheckpointState state = new CheckpointState(
            checkpointId, stepName, workingStorage, filePositions, inputCount, outputCount, seq);
        checkpoints.put(checkpointId, state);
        lastCheckpointId = checkpointId;
        recordsSinceCheckpoint = 0;

        // Update step info
        StepInfo si = steps.get(stepName);
        if (si != null) {
            si.lastCheckpointId = checkpointId;
            si.recordsProcessed = inputCount;
        }

        checkpointLog.add(String.format("[%tF %<tT] CHKP id=%s step=%s seq=%d in=%d out=%d",
            new Date(state.timestamp), checkpointId, stepName, seq, inputCount, outputCount));
        return true;
    }

    /** Simplified checkpoint (no file positions) */
    public boolean checkpoint(String checkpointId, String stepName,
                              Map<String, String> workingStorage) {
        return checkpoint(checkpointId, stepName, workingStorage,
            Collections.<String, Long>emptyMap(), 0, 0);
    }

    // --- XRST: Restart from Checkpoint ---

    public CheckpointState restart(String checkpointId) {
        CheckpointState state = checkpoints.get(checkpointId);
        if (state == null) return null;

        restartMode = RestartMode.AUTOMATIC_RESTART;
        restartPending = false;

        // Update step status
        StepInfo si = steps.get(state.stepName);
        if (si != null) {
            si.status = StepStatus.RESTARTED;
        }

        checkpointLog.add(String.format("[%tF %<tT] XRST id=%s step=%s restoring from seq=%d",
            new Date(), checkpointId, state.stepName, state.sequenceNumber));
        return state;
    }

    /** Restart from the last checkpoint taken */
    public CheckpointState restartFromLast() {
        if (lastCheckpointId == null) return null;
        return restart(lastCheckpointId);
    }

    // --- Automatic Checkpoint (commit frequency) ---

    /** Call after each record processed; returns true if checkpoint was taken */
    public boolean recordProcessed(String stepName, Map<String, String> workingStorage,
                                   Map<String, Long> filePositions,
                                   long inputCount, long outputCount) {
        recordsSinceCheckpoint++;
        if (commitFrequency > 0 && recordsSinceCheckpoint >= commitFrequency) {
            String autoId = "AUTO_" + stepName + "_" + (++autoSequence);
            return checkpoint(autoId, stepName, workingStorage, filePositions, inputCount, outputCount);
        }
        return false;
    }

    // --- Step Management ---

    public StepInfo beginStep(String stepName) {
        StepInfo si = new StepInfo(stepName);
        si.status = StepStatus.RUNNING;
        si.startTime = System.currentTimeMillis();
        steps.put(stepName, si);
        checkpointLog.add(String.format("[%tF %<tT] STEP BEGIN %s", new Date(), stepName));
        return si;
    }

    public void endStep(String stepName, int returnCode) {
        StepInfo si = steps.get(stepName);
        if (si != null) {
            si.status = (returnCode <= 4) ? StepStatus.COMPLETED : StepStatus.FAILED;
            si.endTime = System.currentTimeMillis();
            si.returnCode = returnCode;
        }
        checkpointLog.add(String.format("[%tF %<tT] STEP END %s RC=%d", new Date(), stepName, returnCode));
    }

    public StepStatus getStepStatus(String stepName) {
        StepInfo si = steps.get(stepName);
        return si != null ? si.status : StepStatus.NOT_STARTED;
    }

    public StepInfo getStepInfo(String stepName) {
        return steps.get(stepName);
    }

    // --- Deferred Restart ---

    /** Mark that restart is needed (e.g., after ABEND) */
    public void markRestartPending(String checkpointId) {
        restartPending = true;
        lastCheckpointId = checkpointId;
        restartMode = RestartMode.DEFERRED_RESTART;
    }

    public boolean isRestartPending() { return restartPending; }

    /** Determine if a step needs restart (was RUNNING when failure occurred) */
    public boolean needsRestart(String stepName) {
        StepInfo si = steps.get(stepName);
        return si != null && (si.status == StepStatus.RUNNING || si.status == StepStatus.FAILED);
    }

    /** Get the checkpoint to restart from for a given step */
    public String getRestartCheckpoint(String stepName) {
        StepInfo si = steps.get(stepName);
        return si != null ? si.lastCheckpointId : null;
    }

    // --- Query ---

    public CheckpointState getCheckpoint(String id) { return checkpoints.get(id); }
    public String getLastCheckpointId() { return lastCheckpointId; }
    public int getCheckpointCount() { return checkpoints.size(); }
    public Set<String> getCheckpointIds() { return Collections.unmodifiableSet(checkpoints.keySet()); }
    public List<String> getCheckpointLog() { return Collections.unmodifiableList(checkpointLog); }
    public Map<String, StepInfo> getAllSteps() { return Collections.unmodifiableMap(steps); }

    /** Get checkpoints for a specific step */
    public List<CheckpointState> getCheckpointsForStep(String stepName) {
        List<CheckpointState> result = new ArrayList<>();
        for (CheckpointState cs : checkpoints.values()) {
            if (stepName.equals(cs.stepName)) result.add(cs);
        }
        return result;
    }

    // --- Serialization (persist checkpoints to byte array) ---

    public byte[] serialize() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(new ArrayList<>(checkpoints.values()));
        oos.close();
        return baos.toByteArray();
    }

    @SuppressWarnings("unchecked")
    public void deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        ObjectInputStream ois = new ObjectInputStream(bais);
        List<CheckpointState> states = (List<CheckpointState>) ois.readObject();
        ois.close();
        checkpoints.clear();
        for (CheckpointState cs : states) {
            checkpoints.put(cs.checkpointId, cs);
            lastCheckpointId = cs.checkpointId;
        }
    }

    // --- JSON File Persistence ---

    private String checkpointDirectory = System.getProperty("java.io.tmpdir");

    /** Set directory for JSON checkpoint files */
    public void setCheckpointDirectory(String dir) {
        this.checkpointDirectory = dir;
        File d = new File(dir);
        if (!d.exists()) d.mkdirs();
    }

    /** Get checkpoint directory */
    public String getCheckpointDirectory() { return checkpointDirectory; }

    /**
     * Write a checkpoint to a JSON file.
     * Persists the checkpoint state to disk for restart after failure.
     */
    public boolean writeCheckpoint(String stepName, long recordCount, Map<String, Object> state) {
        String checkpointId = "FILE_" + stepName + "_" + System.currentTimeMillis();

        // Convert state to string map for internal storage
        Map<String, String> wsMap = new LinkedHashMap<>();
        Map<String, Long> fpMap = new LinkedHashMap<>();
        if (state != null) {
            for (Map.Entry<String, Object> entry : state.entrySet()) {
                if (entry.getValue() instanceof Long && entry.getKey().startsWith("FILEPOS_")) {
                    fpMap.put(entry.getKey().substring(8), (Long) entry.getValue());
                } else {
                    wsMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }

        // Take internal checkpoint
        checkpoint(checkpointId, stepName, wsMap, fpMap, recordCount, 0);

        // Write JSON file
        String filename = "checkpoint_" + stepName + ".json";
        File file = new File(checkpointDirectory, filename);
        try {
            StringBuilder json = new StringBuilder();
            json.append("{\n");
            json.append("  \"checkpointId\": \"").append(checkpointId).append("\",\n");
            json.append("  \"stepName\": \"").append(stepName).append("\",\n");
            json.append("  \"recordCount\": ").append(recordCount).append(",\n");
            json.append("  \"timestamp\": ").append(System.currentTimeMillis()).append(",\n");
            json.append("  \"state\": {\n");
            boolean first = true;
            if (state != null) {
                for (Map.Entry<String, Object> entry : state.entrySet()) {
                    if (!first) json.append(",\n");
                    json.append("    \"").append(escapeJsonStr(entry.getKey())).append("\": \"")
                        .append(escapeJsonStr(String.valueOf(entry.getValue()))).append("\"");
                    first = false;
                }
            }
            json.append("\n  }\n");
            json.append("}\n");

            if (file.getParentFile() != null) file.getParentFile().mkdirs();
            java.nio.file.Files.write(file.toPath(),
                Collections.singletonList(json.toString()),
                java.nio.charset.StandardCharsets.UTF_8);

            checkpointLog.add(String.format("[%tF %<tT] WRITE_FILE step=%s file=%s records=%d",
                new Date(), stepName, filename, recordCount));
            return true;
        } catch (IOException e) {
            checkpointLog.add(String.format("[%tF %<tT] WRITE_FILE FAILED step=%s error=%s",
                new Date(), stepName, e.getMessage()));
            return false;
        }
    }

    /**
     * Read a checkpoint from a JSON file.
     * @return map of state key-value pairs, or null if not found
     */
    public Map<String, String> readCheckpoint(String stepName) {
        String filename = "checkpoint_" + stepName + ".json";
        File file = new File(checkpointDirectory, filename);
        if (!file.exists()) return null;

        try {
            String content = new String(
                java.nio.file.Files.readAllBytes(file.toPath()),
                java.nio.charset.StandardCharsets.UTF_8);
            return parseJsonState(content);
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * Delete a checkpoint file (after successful completion).
     */
    public boolean deleteCheckpoint(String stepName) {
        String filename = "checkpoint_" + stepName + ".json";
        File file = new File(checkpointDirectory, filename);
        boolean deleted = file.delete();
        if (deleted) {
            checkpointLog.add(String.format("[%tF %<tT] DELETE_FILE step=%s file=%s",
                new Date(), stepName, filename));
        }
        return deleted;
    }

    /**
     * Check if a checkpoint file exists for a step.
     */
    public boolean hasCheckpointFile(String stepName) {
        String filename = "checkpoint_" + stepName + ".json";
        return new File(checkpointDirectory, filename).exists();
    }

    /**
     * Read the record count from a checkpoint file.
     * Used for repositioning during restart.
     */
    public long readCheckpointRecordCount(String stepName) {
        String filename = "checkpoint_" + stepName + ".json";
        File file = new File(checkpointDirectory, filename);
        if (!file.exists()) return 0;

        try {
            String content = new String(
                java.nio.file.Files.readAllBytes(file.toPath()),
                java.nio.charset.StandardCharsets.UTF_8);
            // Extract recordCount from JSON
            int idx = content.indexOf("\"recordCount\"");
            if (idx < 0) return 0;
            int colon = content.indexOf(':', idx);
            if (colon < 0) return 0;
            int end = content.indexOf(',', colon);
            if (end < 0) end = content.indexOf('}', colon);
            if (end < 0) return 0;
            return Long.parseLong(content.substring(colon + 1, end).trim());
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * Determine if a step should be skipped (already completed in previous run).
     * Used for step-level restart.
     */
    public boolean shouldSkipStep(String stepName) {
        StepInfo si = steps.get(stepName);
        return si != null && si.status == StepStatus.COMPLETED;
    }

    /** Parse JSON state from checkpoint file content */
    private Map<String, String> parseJsonState(String json) {
        Map<String, String> result = new LinkedHashMap<>();
        int stateIdx = json.indexOf("\"state\"");
        if (stateIdx < 0) return result;
        int braceStart = json.indexOf('{', stateIdx);
        if (braceStart < 0) return result;
        int depth = 0;
        int braceEnd = -1;
        for (int i = braceStart; i < json.length(); i++) {
            if (json.charAt(i) == '{') depth++;
            else if (json.charAt(i) == '}') {
                depth--;
                if (depth == 0) { braceEnd = i; break; }
            }
        }
        if (braceEnd < 0) return result;
        String stateJson = json.substring(braceStart + 1, braceEnd);
        // Simple key-value parsing
        int pos = 0;
        while (pos < stateJson.length()) {
            int kStart = stateJson.indexOf('"', pos);
            if (kStart < 0) break;
            int kEnd = stateJson.indexOf('"', kStart + 1);
            if (kEnd < 0) break;
            String key = stateJson.substring(kStart + 1, kEnd);
            int vStart = stateJson.indexOf('"', kEnd + 1);
            if (vStart < 0) break;
            int vEnd = stateJson.indexOf('"', vStart + 1);
            if (vEnd < 0) break;
            result.put(key, stateJson.substring(vStart + 1, vEnd));
            pos = vEnd + 1;
        }
        return result;
    }

    private static String escapeJsonStr(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\").replace("\"", "\\\"")
                .replace("\n", "\\n").replace("\r", "\\r");
    }

    // --- Reset ---

    public void reset() {
        checkpoints.clear();
        steps.clear();
        checkpointLog.clear();
        lastCheckpointId = null;
        restartPending = false;
        restartMode = RestartMode.CLEAN_START;
        recordsSinceCheckpoint = 0;
    }
}
