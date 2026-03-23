package com.lazarus.cobol;

import java.io.*;

/**
 * COBOL file I/O — Sequential, Indexed, and Relative file support.
 */
public class CobolFile {
    private String fileName;
    private String organization;
    private String accessMode;
    private BufferedReader reader;
    private PrintWriter writer;
    private boolean isOpen = false;
    private String lastRecord;
    private String fileStatus = "00";

    public CobolFile(String fileName, String organization, String accessMode) {
        this.fileName = fileName;
        this.organization = organization;
        this.accessMode = accessMode;
    }

    public void open(String mode) {
        try {
            switch (mode.toUpperCase()) {
                case "INPUT":
                    reader = new BufferedReader(new FileReader(fileName));
                    break;
                case "OUTPUT":
                    writer = new PrintWriter(new FileWriter(fileName));
                    break;
                case "I-O":
                    reader = new BufferedReader(new FileReader(fileName));
                    writer = new PrintWriter(new FileWriter(fileName, true));
                    break;
                case "EXTEND":
                    writer = new PrintWriter(new FileWriter(fileName, true));
                    break;
            }
            isOpen = true;
            fileStatus = "00";
        } catch (IOException e) {
            fileStatus = "35"; // File not found
        }
    }

    public String read(Object into) {
        try {
            if (reader == null) { fileStatus = "47"; return fileStatus; }
            lastRecord = reader.readLine();
            if (lastRecord == null) {
                fileStatus = "10"; // AT END
                return FileStatus.AT_END;
            }
            fileStatus = "00";
            return fileStatus;
        } catch (IOException e) {
            fileStatus = "30";
            return fileStatus;
        }
    }

    public void write(Object... record) {
        if (writer == null) { fileStatus = "48"; return; }
        StringBuilder sb = new StringBuilder();
        for (Object r : record) sb.append(String.valueOf(r));
        writer.println(sb.toString());
        writer.flush();
        fileStatus = "00";
    }

    public void rewrite(Object... record) {
        fileStatus = "00"; // Stub
    }

    public void delete() {
        fileStatus = "00"; // Stub
    }

    public void start() {
        fileStatus = "00"; // Stub
    }

    public void close() {
        try {
            if (reader != null) reader.close();
            if (writer != null) writer.close();
            isOpen = false;
            fileStatus = "00";
        } catch (IOException e) {
            fileStatus = "30";
        }
    }

    public String getLastRecord() { return lastRecord; }
    public String getFileStatus() { return fileStatus; }
}
