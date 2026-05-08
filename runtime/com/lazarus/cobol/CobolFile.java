package com.lazarus.cobol;

import java.io.*;

/**
 * COBOL file I/O — Sequential, Indexed, and Relative file support.
 */
public class CobolFile {
    private String fileName;
    private String organization;
    private String accessMode;
    private String selectName = "";
    private boolean optional = false;
    private int minRecordLength = -1;
    private int maxRecordLength = -1;
    private BufferedReader reader;
    private PrintWriter writer;
    private boolean isOpen = false;
    private boolean atEnd = false;
    private boolean openedAsOptionalMissing = false; // true when OPTIONAL file opened with status 05
    private String lastRecord;
    /**
     * For LINE SEQUENTIAL: when a line longer than the FD record buffer is
     * read, the overflow remainder is stashed here so the NEXT call to read()
     * returns it as a continuation record (status 00) instead of pulling a
     * new line from the underlying reader. Reset on open()/close().
     */
    private String pendingOverflow;
    private String fileStatus = "00";
    /** Optional bound CobolString that mirrors fileStatus (FILE STATUS IS clause).
     *  Set via {@link #setStatusField}. Each write to fileStatus also writes here.
     *  Critical for GLOBAL FD: a contained program's OPEN/READ on parent's file
     *  must update the parent's FILE STATUS variable. */
    private CobolString boundStatusField;
    private int lastRecordLength = 0;
    private int linageCounter = 0;  // LINAGE-COUNTER special register
    private int relativeKey = -1;   // RELATIVE KEY for random access
    private String openMode = "";   // Track the mode used in open()
    private int lastReadRecordIndex = -1;  // 0-based index of last record read (for sequential REWRITE)
    private int currentRecordIndex = -1;   // current record index tracking during reads

    // ── INDEXED file backend ────────────────────────────────────
    /** Real B-tree-style backend, only initialized for INDEXED organization. */
    private IndexedBackend indexed;
    /** Pending key-of-reference for the next READ (set by readByKey()/setReadKey()). */
    private String pendingReadKey;
    private byte[] pendingReadKeyValue;

    /** `>>TURN EC-I-O CHECKING ON` directive flag. When ON, an EOF on a file
     *  with no FILE STATUS variable becomes a fatal libcob-style abort (matches
     *  GnuCOBOL behavior — see run_file_090). */
    private static volatile boolean ecIoCheck = false;
    public static void setEcIoCheck(boolean on) { ecIoCheck = on; }
    public static boolean isEcIoCheckOn() { return ecIoCheck; }
    /** Triggered after a READ AT END when EC-I-O is ON and no FILE STATUS. */
    private void ecIoEofAbortIfNeeded() {
        if (ecIoCheck && boundStatusField == null) {
            try { System.out.flush(); } catch (Exception ignored) {}
            System.err.println("libcob: end of file on '" + selectName + "'");
            System.exit(1);
        }
    }
    /** Last record-length read (for variable-length INDEXED records). */
    private int indexedLastLen = 0;

    public CobolFile(String fileName, String organization, String accessMode) {
        this.fileName = fileName;
        this.organization = organization;
        this.accessMode = accessMode;
    }

    public CobolFile(String fileName, String organization, String accessMode, String selectName) {
        this.fileName = fileName;
        this.organization = organization;
        this.accessMode = accessMode;
        this.selectName = selectName != null ? selectName : "";
    }

    public CobolFile(String fileName, String organization, String accessMode, String selectName, boolean optional) {
        this.fileName = fileName;
        this.organization = organization;
        this.accessMode = accessMode;
        this.selectName = selectName != null ? selectName : "";
        this.optional = optional;
    }

    public CobolFile(String fileName, String organization, String accessMode, String selectName, boolean optional, int minRecLen, int maxRecLen) {
        this(fileName, organization, accessMode, selectName, optional);
        this.minRecordLength = minRecLen;
        this.maxRecordLength = maxRecLen;
    }

    public CobolFile(String fileName, String organization, String accessMode, String selectName, int minRecLen, int maxRecLen) {
        this(fileName, organization, accessMode, selectName, false);
        this.minRecordLength = minRecLen;
        this.maxRecordLength = maxRecLen;
    }

    public void setSelectName(String name) { this.selectName = name != null ? name : ""; }
    public String getSelectName() { return selectName; }
    public void setFileName(String name) { this.fileName = name; }
    public String getFileName() { return fileName; }

    public void open(String mode) {
        try {
            openMode = mode.toUpperCase();
            // ASSIGN DYNAMIC with empty/blank filename: GnuCOBOL terminates the program with
            // an unhandled file-name exception. Match that behavior so tests don't proceed past
            // a clearly-bad SELECT-DYNAMIC.
            if (fileName == null || fileName.trim().isEmpty()) {
                setStatus("31"); // file-name conflict / not specified
                CobolIntrinsics.raiseFileException(fileStatus, selectName, "OPEN");
                CobolIntrinsics.programExit(1);
                return;
            }
            boolean fileActuallyMissing = !(new File(fileName).exists());
            boolean fileMissing = optional && fileActuallyMissing;

            // INDEXED files require a non-empty, initialized index for all non-OUTPUT modes.
            // GnuCOBOL returns 30 (permanent error) when the BDB/ISAM structure is absent or
            // uninitialized (zero-length file), UNLESS the SELECT clause has OPTIONAL and the
            // mode is EXTEND or I-O (in which case the file is auto-created with status 05).
            if (organization.equalsIgnoreCase("INDEXED") && !mode.equalsIgnoreCase("OUTPUT")) {
                File idxFile = new File(fileName);
                if (!idxFile.exists()) {
                    if (optional && mode.equalsIgnoreCase("I-O")) {
                        // OPTIONAL INDEXED I-O on missing: GnuCOBOL auto-creates the file
                        // and returns success status 00 (verified against run_file_005).
                        setStatus("00");
                        isOpen = true;
                        openedAsOptionalMissing = true;
                        // Initialize fresh backend so subsequent writes work
                        if (this.indexed != null) this.indexed.openFresh();
                        return;
                    }
                    if (optional && mode.equalsIgnoreCase("INPUT")) {
                        setStatus("05");
                        isOpen = true;
                        openedAsOptionalMissing = true;
                        if (this.indexed != null) this.indexed.openFresh();
                        return;
                    }
                    // EXTEND on INDEXED is a permanent error per cobc rules,
                    // even for OPTIONAL files. INPUT on non-OPTIONAL missing → 35.
                    setStatus(mode.equalsIgnoreCase("EXTEND") ? "30" : "35");
                    CobolIntrinsics.raiseFileException(fileStatus, selectName, "OPEN");
                    return;
                }
                // EXTEND on INDEXED is always a permanent error (status 30) — INDEXED
                // files must be OPEN OUTPUT/I-O to add records, not EXTEND.
                if (mode.equalsIgnoreCase("EXTEND")) {
                    setStatus("30");
                    CobolIntrinsics.raiseFileException(fileStatus, selectName, "OPEN");
                    return;
                }
                // File exists but is empty (length 0): uninitialized index → 30.
                // (A "valid empty index" gets a 1-byte header marker on OUTPUT close
                // so its length is 1, not 0.)
                if (idxFile.length() == 0) {
                    setStatus("30");
                    CobolIntrinsics.raiseFileException(fileStatus, selectName, "OPEN");
                    return;
                }
            }

            // For OPTIONAL sequential/relative files, check existence before opening
            if (fileMissing && (mode.equalsIgnoreCase("INPUT") || mode.equalsIgnoreCase("I-O"))) {
                setStatus("05"); // OPTIONAL file not present
                isOpen = true;
                openedAsOptionalMissing = true;
                return;
            }
            if (fileMissing && mode.equalsIgnoreCase("EXTEND")) {
                // EXTEND on missing OPTIONAL sequential: status 05, create writer for appending
                writer = new PrintWriter(new FileWriter(fileName, true));
                setStatus("05");
                isOpen = true;
                openedAsOptionalMissing = true;
                return;
            }
            // INDEXED files use a line-sequential fake backend (no real B-tree yet —
            // that's the bigger architectural task). For an EMPTY INDEXED file
            // (length == 1, just the header-marker byte written on prior CLOSE),
            // skip the reader so READ hits the `reader == null && INDEXED → AT END`
            // path in read(). Otherwise behave like LINE SEQUENTIAL.
            boolean indexed = organization.equalsIgnoreCase("INDEXED");
            boolean indexedEmpty = false;
            if (indexed && (mode.equalsIgnoreCase("INPUT") || mode.equalsIgnoreCase("I-O"))) {
                File idx = new File(fileName);
                if (idx.exists() && idx.length() == 1) {
                    try (java.io.FileInputStream in = new java.io.FileInputStream(idx)) {
                        int b = in.read();
                        if (b == 0) indexedEmpty = true;
                    }
                }
            }
            // INDEXED with real B-tree backend: route to IndexedBackend
            if (indexed && this.indexed != null) {
                openIndexed(mode);
                return;
            }
            switch (mode.toUpperCase()) {
                case "INPUT":
                    if (!indexedEmpty) reader = new BufferedReader(new FileReader(fileName));
                    break;
                case "OUTPUT":
                    writer = new PrintWriter(new FileWriter(fileName));
                    break;
                case "I-O":
                    if (!indexedEmpty) reader = new BufferedReader(new FileReader(fileName));
                    writer = new PrintWriter(new FileWriter(fileName, true));
                    break;
                case "EXTEND":
                    // EXTEND requires the file to already exist; creating is OUTPUT's job.
                    if (fileActuallyMissing) {
                        setStatus("30"); // permanent error — cannot extend non-existent file
                        CobolIntrinsics.raiseFileException(fileStatus, selectName, "OPEN");
                        return;
                    }
                    writer = new PrintWriter(new FileWriter(fileName, true));
                    break;
            }
            isOpen = true;
            atEnd = false;
            openedAsOptionalMissing = false;
            lastReadRecordIndex = -1;
            currentRecordIndex = -1;
            pendingOverflow = null;
            setStatus("00");
            CobolIntrinsics.clearException();
        } catch (IOException e) {
            // Concatenated-file syntax ("file1+file2" or "file1&file2") is valid only for
            // INPUT in GnuCOBOL — for OUTPUT/I-O/EXTEND, libcob returns 35 (file not found).
            boolean isConcatName = fileName != null && (fileName.contains("+") || fileName.contains("&"));
            if (optional && (mode.equalsIgnoreCase("INPUT") || mode.equalsIgnoreCase("I-O"))) {
                setStatus("05"); // OPTIONAL file not present
                isOpen = true;
                openedAsOptionalMissing = true;
            } else if (mode.equalsIgnoreCase("INPUT") && !new File(fileName).exists()) {
                // OPEN INPUT on non-optional missing file = status 35 (file not found).
                setStatus("35");
                CobolIntrinsics.raiseFileException(fileStatus, selectName, "OPEN");
            } else if (isConcatName) {
                // Concat separator present but mode is not INPUT — file-not-found, not perm error.
                setStatus("35");
                CobolIntrinsics.raiseFileException(fileStatus, selectName, "OPEN");
            } else {
                // Any other I/O failure (e.g. OUTPUT to missing directory, EXTEND errors) = 30.
                setStatus("30");
                CobolIntrinsics.raiseFileException(fileStatus, selectName, "OPEN");
            }
        }
    }

    public String read(Object into) {
        try {
            // INDEXED with real backend: dispatch
            if (isIndexedActive()) {
                return readIndexed(into);
            }
            // For RELATIVE files with RANDOM access and a relativeKey set,
            // use random access to read the nth record
            if (organization.equalsIgnoreCase("RELATIVE") &&
                accessMode.equalsIgnoreCase("RANDOM") && relativeKey > 0) {
                return readRelativeRandom(into);
            }

            if (reader == null) {
                if (isOpen && (optional || atEnd || organization.equalsIgnoreCase("INDEXED"))) {
                    // OPTIONAL empty file, or INDEXED file opened with no records,
                    // or atEnd already set: READ returns AT END.
                    if (atEnd) {
                        setStatus("46"); // READ after AT END
                        ecIoEofAbortIfNeeded();
                        return fileStatus;
                    }
                    atEnd = true;
                    setStatus("10"); // AT END for empty file
                    ecIoEofAbortIfNeeded();
                    return FileStatus.AT_END;
                }
                setStatus("47");
                CobolIntrinsics.raiseFileException(fileStatus, selectName, "READ");
                return fileStatus;
            }
            if (atEnd) {
                setStatus("46"); // READ after AT END
                ecIoEofAbortIfNeeded();
                return fileStatus;
            }
            // LINE SEQUENTIAL overflow continuation: if the previous READ stashed
            // an unread suffix (line longer than FD record buffer), consume it
            // here as a fresh record instead of pulling a new line.
            boolean isContinuation = false;
            if (pendingOverflow != null) {
                lastRecord = pendingOverflow;
                pendingOverflow = null;
                isContinuation = true;
            } else {
                lastRecord = reader.readLine();
            }
            if (lastRecord == null) {
                atEnd = true;
                setStatus("10"); // AT END
                CobolIntrinsics.raiseFileException(fileStatus, selectName, "READ");
                ecIoEofAbortIfNeeded();
                return FileStatus.AT_END;
            }
            currentRecordIndex++;
            lastReadRecordIndex = currentRecordIndex;

            int actualLen = lastRecord.length();
            // Store the actual record length for DEPENDING ON clause
            lastRecordLength = actualLen;

            // Determine the FD record size (target buffer size)
            int fdRecordSize = -1;
            if (into instanceof CobolString) {
                fdRecordSize = ((CobolString) into).length();
            }

            // Handle record size adjustment and status codes
            String adjustedRecord = lastRecord;
            if (fdRecordSize > 0) {
                if (actualLen > fdRecordSize) {
                    // LINE SEQUENTIAL overflow: take first fdRecordSize chars
                    // as this record, stash the remainder for the next READ
                    // (continuation). Status 06 signals truncation/overflow.
                    adjustedRecord = lastRecord.substring(0, fdRecordSize);
                    pendingOverflow = lastRecord.substring(fdRecordSize);
                    setStatus("06"); // Record overflow
                } else if (actualLen < fdRecordSize) {
                    // Record shorter than FD: pad with spaces
                    StringBuilder sb = new StringBuilder(lastRecord);
                    while (sb.length() < fdRecordSize) {
                        sb.append(' ');
                    }
                    adjustedRecord = sb.toString();
                    // For variable-length files, status 04 if record is shorter than minimum
                    if (minRecordLength > 0 && actualLen < minRecordLength) {
                        setStatus("04"); // Record too short for variable-length constraints
                    } else {
                        setStatus("00"); // Normal read with padding
                    }
                } else {
                    // Exact fit — but for variable-length files, status 04 if
                    // record length equals maxRecordLength (possible truncation)
                    if (minRecordLength > 0 && maxRecordLength > 0 && actualLen >= maxRecordLength) {
                        setStatus("04"); // Record length at max — possible truncation
                    } else {
                        setStatus("00"); // Exact fit
                    }
                }
            } else {
                // No FD size constraint — validate variable-length constraints if present
                if (minRecordLength > 0) {
                    if (actualLen < minRecordLength) {
                        setStatus("04"); // Record too short
                    } else if (actualLen > maxRecordLength) {
                        setStatus("04"); // Record too long
                    } else {
                        setStatus("00");
                    }
                } else {
                    setStatus("00");
                }
            }

            // Populate the target record with the adjusted line
            if (into instanceof CobolString) {
                ((CobolString) into).set(adjustedRecord);
            }
            return fileStatus;
        } catch (IOException e) {
            setStatus("30");
            CobolIntrinsics.raiseFileException(fileStatus, selectName, "READ");
            return fileStatus;
        }
    }

    /**
     * Read a specific record by relative key number from a RELATIVE RANDOM file.
     * Reads through lines sequentially to reach the target record number.
     */
    private String readRelativeRandom(Object into) {
        try {
            // Re-open the file and skip to the desired record
            BufferedReader randomReader = new BufferedReader(new FileReader(fileName));
            String line = null;
            for (int i = 1; i <= relativeKey; i++) {
                line = randomReader.readLine();
                if (line == null) {
                    randomReader.close();
                    setStatus("23"); // Record not found
                    return fileStatus;
                }
            }
            randomReader.close();

            lastRecord = line;
            int actualLen = lastRecord.length();
            lastRecordLength = actualLen;

            // Determine target buffer size
            int fdRecordSize = -1;
            if (into instanceof CobolString) {
                fdRecordSize = ((CobolString) into).length();
            }

            // Adjust record to fit buffer
            String adjustedRecord = lastRecord;
            if (fdRecordSize > 0) {
                if (actualLen > fdRecordSize) {
                    adjustedRecord = lastRecord.substring(0, fdRecordSize);
                } else if (actualLen < fdRecordSize) {
                    StringBuilder sb = new StringBuilder(lastRecord);
                    while (sb.length() < fdRecordSize) {
                        sb.append(' ');
                    }
                    adjustedRecord = sb.toString();
                }
            }

            if (into instanceof CobolString) {
                ((CobolString) into).set(adjustedRecord);
            }
            setStatus("00");
            return fileStatus;
        } catch (IOException e) {
            setStatus("30");
            return fileStatus;
        }
    }

    public void write(Object... record) {
        writeWithLength(-1, record);
    }

    public void writeWithLength(int recordLength, Object... record) {
        if (isIndexedActive()) {
            StringBuilder sb = new StringBuilder();
            for (Object r : record) sb.append(String.valueOf(r));
            writeIndexed(sb.toString());
            return;
        }
        if (writer == null) {
            setStatus("48");
            CobolIntrinsics.raiseFileException(fileStatus, selectName, "WRITE");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Object r : record) sb.append(String.valueOf(r));
        String recordStr = sb.toString();

        // For variable-length files with DEPENDING ON, use the specified length
        if (recordLength > 0 && minRecordLength > 0) {
            // Validate the specified length is within bounds
            if (recordLength < minRecordLength || recordLength > maxRecordLength) {
                setStatus("44"); // Record length mismatch (SIZE ERROR on write)
                CobolIntrinsics.raiseFileException(fileStatus, selectName, "WRITE");
                return;
            }
            // Truncate or pad the record to the specified length
            if (recordStr.length() > recordLength) {
                recordStr = recordStr.substring(0, recordLength);
            } else if (recordStr.length() < recordLength) {
                // Pad with spaces to reach the specified length
                while (recordStr.length() < recordLength) {
                    recordStr += " ";
                }
            }
        } else {
            // Validate record length for variable-length files (original behavior)
            if (minRecordLength > 0) {
                int actualLen = recordStr.length();
                if (actualLen < minRecordLength || actualLen > maxRecordLength) {
                    setStatus("44"); // Record length mismatch (SIZE ERROR on write)
                    CobolIntrinsics.raiseFileException(fileStatus, selectName, "WRITE");
                    return;
                }
            }
        }
        // LINE SEQUENTIAL: trim trailing spaces before writing
        if (organization.equalsIgnoreCase("LINE SEQUENTIAL")) {
            int end = recordStr.length();
            while (end > 0 && recordStr.charAt(end - 1) == ' ') end--;
            recordStr = recordStr.substring(0, end);
        }
        writer.println(recordStr);
        writer.flush();
        linageCounter++;
        setStatus("00");
    }

    public void rewrite(Object... record) {
        if (isIndexedActive()) {
            StringBuilder sb = new StringBuilder();
            for (Object r : record) sb.append(String.valueOf(r));
            rewriteIndexed(sb.toString());
            return;
        }
        // For relative files, rewrite the record at the current relative key position
        if (organization.equalsIgnoreCase("RELATIVE") && relativeKey > 0) {
            try {
                // Read all lines from the file
                java.util.List<String> lines = new java.util.ArrayList<>();
                try (BufferedReader rdr = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = rdr.readLine()) != null) {
                        lines.add(line);
                    }
                }
                // Build the new record content
                StringBuilder sb = new StringBuilder();
                for (Object r : record) sb.append(String.valueOf(r));
                String newRecord = sb.toString();

                // Replace the record at relativeKey position (1-based)
                int idx = relativeKey - 1;
                if (idx >= 0 && idx < lines.size()) {
                    lines.set(idx, newRecord);
                } else {
                    setStatus("23"); // Record not found
                    return;
                }

                // Write all lines back
                try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
                    for (String l : lines) {
                        pw.println(l);
                    }
                    pw.flush();
                }

                // Re-open reader/writer for continued I-O operations
                if (reader != null) {
                    reader.close();
                    reader = new BufferedReader(new FileReader(fileName));
                    // Skip to the record after the rewritten one for sequential reads
                    for (int i = 0; i < relativeKey; i++) {
                        reader.readLine();
                    }
                }

                setStatus("00");
            } catch (IOException e) {
                setStatus("30");
            }
        } else {
            // Sequential file REWRITE: replace the last record read
            if (lastReadRecordIndex < 0) {
                setStatus("43"); // No prior READ
                return;
            }
            try {
                // Read all lines from the file
                java.util.List<String> lines = new java.util.ArrayList<>();
                try (BufferedReader rdr = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = rdr.readLine()) != null) {
                        lines.add(line);
                    }
                }
                // Build the new record content
                StringBuilder sb = new StringBuilder();
                for (Object r : record) sb.append(String.valueOf(r));
                String newRecord = sb.toString();

                int idx = lastReadRecordIndex;
                if (idx >= 0 && idx < lines.size()) {
                    // For LINE SEQUENTIAL, check record length compatibility
                    if (organization.toUpperCase().contains("LINE")) {
                        String oldRecord = lines.get(idx);
                        // Trim trailing spaces for comparison (LINE SEQUENTIAL trims on write)
                        String newTrimmed = newRecord.replaceAll("\\s+$", "");
                        String oldTrimmed = oldRecord.replaceAll("\\s+$", "");
                        if (newTrimmed.length() != oldTrimmed.length()) {
                            setStatus("44"); // Record length mismatch on LINE SEQUENTIAL
                            return;
                        }
                    }
                    lines.set(idx, newRecord);
                } else {
                    setStatus("43"); // Invalid record position
                    return;
                }

                // Write all lines back
                try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
                    for (String l : lines) {
                        pw.println(l);
                    }
                    pw.flush();
                }

                // Re-open reader for continued I-O operations, repositioned after the rewritten record
                if (reader != null) {
                    reader.close();
                    reader = new BufferedReader(new FileReader(fileName));
                    for (int i = 0; i <= idx; i++) {
                        reader.readLine();
                    }
                    currentRecordIndex = idx;
                }

                // Invalidate lastReadRecordIndex (one REWRITE per READ)
                lastReadRecordIndex = -1;
                setStatus("00");
            } catch (IOException e) {
                setStatus("30");
            }
        }
    }

    public void delete() {
        if (isOpen) {
            // DELETE FILE while file is open → status 41
            setStatus("41");
            return;
        }
        // DELETE FILE when closed → actually delete the file from disk
        try {
            File f = new File(fileName);
            if (f.exists()) {
                f.delete();
            }
            setStatus("00");
        } catch (Exception e) {
            setStatus("30");
        }
    }

    public void start() {
        // INDEXED with real backend: position at first key
        if (isIndexedActive()) {
            if (indexed.isEmpty()) { setStatus("23"); return; }
            // Default: position at first record (subsequent READ NEXT will pick it up)
            indexed.start("primary", new byte[0], "GE");
            setStatus("00");
            return;
        }
        // Minimal START: on an empty INDEXED/RELATIVE file, no record matches
        // any key — status 23 (record not found). On non-empty files we can't
        // do real key-positioning yet, so return 00 (success). Better than a
        // blanket 00 because run_file_029 etc. depend on the empty-file 23.
        if (!isOpen) {
            setStatus("47"); // file not open for input/I-O
            return;
        }
        File f = new File(fileName);
        if (!f.exists() || f.length() == 0) {
            setStatus("23"); // record not found
            return;
        }
        // INDEXED file with just the header marker (length == 1, content 0x00)
        // is a valid but empty index — START finds no record → 23.
        if (organization.equalsIgnoreCase("INDEXED") && f.length() == 1) {
            try (java.io.FileInputStream in = new java.io.FileInputStream(f)) {
                if (in.read() == 0) {
                    setStatus("23");
                    return;
                }
            } catch (Exception e) { /* fall through */ }
        }
        setStatus("00");
    }

    public void close() {
        if (!isOpen) {
            setStatus("42"); // CLOSE attempted on file not open
            return;
        }
        // INDEXED with real backend: persist and close
        if (isIndexedActive()) {
            try {
                indexed.close();
                isOpen = false;
                setStatus("00");
            } catch (IOException e) {
                setStatus("30");
            }
            return;
        }
        try {
            if (reader != null) reader.close();
            if (writer != null) writer.close();
            // When closing an OPTIONAL file that was opened with status 05 (not present),
            // create the file on disk for I-O, OUTPUT, and EXTEND modes.
            // INPUT-only opens of missing OPTIONAL files should NOT create the file on close.
            if (openedAsOptionalMissing && !openMode.equals("INPUT")) {
                File f = new File(fileName);
                if (!f.exists()) {
                    f.createNewFile();
                }
            }
            // INDEXED files closed after OUTPUT/I-O/EXTEND need a valid-index marker so a
            // subsequent OPEN INPUT/I-O succeeds with status 00 (empty but initialized)
            // rather than 30 (uninitialized — zero-length file looks unformatted).
            if (organization.equalsIgnoreCase("INDEXED") &&
                !openMode.equalsIgnoreCase("INPUT")) {
                File f = new File(fileName);
                if (f.exists() && f.length() == 0) {
                    // Write a 1-byte index header so length > 0 signals "valid empty index".
                    try (java.io.FileOutputStream out = new java.io.FileOutputStream(f)) {
                        out.write(0); // BDB-style empty header byte
                    }
                }
            }
            openedAsOptionalMissing = false;
            isOpen = false;
            pendingOverflow = null;
            setStatus("00");
        } catch (IOException e) {
            setStatus("30");
        }
    }

    public String readNext(Object into) {
        if (isIndexedActive()) return readNextIndexed(into);
        return read(into);
    }
    public String readPrevious(Object into) {
        if (isIndexedActive()) return readPreviousIndexed(into);
        setStatus("21"); return fileStatus;
    }
    public void unlock() { /* no-op in batch */ }
    public void setSortKeys(String[] keys) { /* sort key metadata */ }

    public String getLastRecord() { return lastRecord; }
    public String getFileStatus() { return fileStatus; }
    public int getLastRecordLength() { return lastRecordLength; }

    /** Bind a CobolString to mirror fileStatus on every state change.
     *  Called by generated code when SELECT has a FILE STATUS clause.
     *  Idempotent: calling again with the same field is a no-op. */
    public void setStatusField(CobolString field) {
        this.boundStatusField = field;
        if (field != null) field.set(fileStatus);
    }

    /** Internal helper: update fileStatus and propagate to bound CobolString.
     *  All paths that mutate fileStatus should route through this so the
     *  FILE STATUS variable stays in sync — especially across nested-program
     *  boundaries via GLOBAL FD aliasing. */
    void setStatus(String code) {
        this.fileStatus = (code != null) ? code : "00";
        if (this.boundStatusField != null) this.boundStatusField.set(this.fileStatus);
    }

    /** Get the LINAGE-COUNTER special register value */
    public int getLinageCounter() { return linageCounter; }
    /** Set the LINAGE-COUNTER (incremented on WRITE for LINAGE files) */
    public void setLinageCounter(int value) { this.linageCounter = value; }

    /** Set the RELATIVE KEY for random access reads on RELATIVE files */
    public void setRelativeKey(int key) { this.relativeKey = key; }
    /** Get the current RELATIVE KEY */
    public int getRelativeKey() { return relativeKey; }

    // ── INDEXED file API ────────────────────────────────────────

    /** Register the primary key for an INDEXED file. Call before open(). */
    public void registerIndexedPrimaryKey(String name, int offset, int length) {
        if (indexed == null) indexed = new IndexedBackend(fileName);
        indexed.registerPrimaryKey(new IndexedBackend.KeyDef(name, offset, length, false));
    }

    /** Register an alternate record key for an INDEXED file. */
    public void registerIndexedAltKey(String name, int offset, int length, boolean duplicates) {
        if (indexed == null) indexed = new IndexedBackend(fileName);
        indexed.registerAltKey(new IndexedBackend.KeyDef(name, offset, length, duplicates));
    }

    /** Set the next READ's key-of-reference (for `READ file KEY IS k`). */
    public void setReadKey(String keyName, Object keyValue) {
        this.pendingReadKey = keyName;
        this.pendingReadKeyValue = String.valueOf(keyValue).getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
    }

    /** Set READ key by name; extract key value from the FD record buffer using
     *  the registered (offset, length) for that key. */
    public void setReadKeyByName(String keyName, Object fdRecord) {
        this.pendingReadKey = keyName;
        this.pendingReadKeyValue = extractKeyFromRecord(keyName, fdRecord);
    }

    /** START by extracting the key value from the FD record buffer. */
    public String startByName(String keyName, Object fdRecord, String op) {
        if (indexed == null) { start(); return fileStatus; }
        if (!isOpen) { setStatus("47"); return fileStatus; }
        byte[] kv = extractKeyFromRecord(keyName, fdRecord);
        if (kv == null) { setStatus("23"); return fileStatus; }
        boolean ok = indexed.start(keyName, kv, op);
        setStatus(ok ? "00" : "23");
        return fileStatus;
    }

    /** Extract the bytes for the named key from the given FD record's buffer.
     *  Returns null if the key isn't registered. */
    private byte[] extractKeyFromRecord(String keyName, Object fdRecord) {
        if (indexed == null || fdRecord == null) return new byte[0];
        IndexedBackend.KeyDef def = null;
        // Try primary first
        if (indexed.primaryKeyDef() != null && indexed.primaryKeyDef().name.equalsIgnoreCase(keyName)) {
            def = indexed.primaryKeyDef();
        } else {
            def = indexed.altKeyDef(keyName);
        }
        if (def == null) return new byte[0];
        String s = String.valueOf(fdRecord);
        byte[] bytes = s.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
        if (def.offset >= bytes.length) return new byte[0];
        int end = Math.min(bytes.length, def.offset + def.length);
        byte[] out = new byte[end - def.offset];
        System.arraycopy(bytes, def.offset, out, 0, out.length);
        return out;
    }

    /** START a positioning operation: KEY IS [op] keyName / value. */
    public String start(String keyName, Object keyValue, String op) {
        if (indexed == null) {
            // Non-INDEXED START: fall back to legacy minimal behavior
            start();
            return fileStatus;
        }
        if (!isOpen) { setStatus("47"); return fileStatus; }
        byte[] kv = String.valueOf(keyValue).getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
        boolean ok = indexed.start(keyName, kv, op);
        setStatus(ok ? "00" : "23");
        return fileStatus;
    }

    /** Hook for indexed open — call after register*Key() calls. */
    private void openIndexed(String mode) {
        if (indexed == null) return;
        try {
            if (mode.equalsIgnoreCase("OUTPUT")) {
                // Verify the parent directory exists; if not, that's a permanent error (status 30).
                File f = new File(fileName);
                File parent = f.getParentFile();
                if (parent != null && !parent.exists()) {
                    setStatus("30");
                    CobolIntrinsics.raiseFileException(fileStatus, selectName, "OPEN");
                    return;
                }
                indexed.openFresh();
                if (f.exists()) f.delete();
            } else {
                indexed.load();
            }
            isOpen = true;
            atEnd = false;
            setStatus("00");
        } catch (IOException e) {
            setStatus("30");
        }
    }

    private boolean isIndexedActive() {
        return indexed != null && organization != null && organization.equalsIgnoreCase("INDEXED");
    }

    /** Read a record into the destination CobolString from the INDEXED backend. */
    String readIndexed(Object into) {
        if (indexed == null || !isOpen) { setStatus("47"); return fileStatus; }
        byte[] rec;
        boolean hadKey = pendingReadKey != null;
        if (hadKey) {
            rec = indexed.readByKey(pendingReadKey, pendingReadKeyValue);
            pendingReadKey = null;
            pendingReadKeyValue = null;
        } else {
            // No KEY clause: read the current record (after START) or first record
            rec = indexed.readCurrent();
            if (rec == null) rec = indexed.readNext();
        }
        if (rec == null) {
            // Sequential reads with no record left: AT END (status 10).
            // Random reads with KEY clause and no match: INVALID KEY (status 23).
            if (hadKey) {
                setStatus("23");
                return fileStatus;
            }
            atEnd = true;
            setStatus("10");
            return FileStatus.AT_END;
        }
        if (into instanceof CobolString) {
            ((CobolString) into).set(new String(rec, java.nio.charset.StandardCharsets.ISO_8859_1));
        }
        indexedLastLen = rec.length;
        setStatus("00");
        return fileStatus;
    }

    String readNextIndexed(Object into) {
        if (indexed == null || !isOpen) { setStatus("47"); return fileStatus; }
        byte[] rec = indexed.readNext();
        if (rec == null) {
            atEnd = true;
            setStatus("10");
            return FileStatus.AT_END;
        }
        if (into instanceof CobolString) {
            ((CobolString) into).set(new String(rec, java.nio.charset.StandardCharsets.ISO_8859_1));
        }
        indexedLastLen = rec.length;
        setStatus("00");
        return fileStatus;
    }

    String readPreviousIndexed(Object into) {
        if (indexed == null || !isOpen) { setStatus("47"); return fileStatus; }
        byte[] rec = indexed.readPrevious();
        if (rec == null) {
            atEnd = true;
            setStatus("10");
            return FileStatus.AT_END;
        }
        if (into instanceof CobolString) {
            ((CobolString) into).set(new String(rec, java.nio.charset.StandardCharsets.ISO_8859_1));
        }
        indexedLastLen = rec.length;
        setStatus("00");
        return fileStatus;
    }

    String writeIndexed(Object record) {
        if (indexed == null || !isOpen) { setStatus("48"); return fileStatus; }
        byte[] rec = String.valueOf(record).getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
        String st = indexed.write(rec);
        setStatus(st);
        return fileStatus;
    }

    String rewriteIndexed(Object record) {
        if (indexed == null || !isOpen) { setStatus("49"); return fileStatus; }
        byte[] rec = String.valueOf(record).getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
        String st = indexed.rewrite(rec);
        setStatus(st);
        return fileStatus;
    }

    String deleteIndexed() {
        if (indexed == null || !isOpen) { setStatus("49"); return fileStatus; }
        String st = indexed.delete();
        setStatus(st);
        return fileStatus;
    }

    String deleteIndexedByKey(Object keyValue) {
        if (indexed == null || !isOpen) { setStatus("49"); return fileStatus; }
        byte[] kv = String.valueOf(keyValue).getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
        String st = indexed.deleteByKey(kv);
        setStatus(st);
        return fileStatus;
    }
}
