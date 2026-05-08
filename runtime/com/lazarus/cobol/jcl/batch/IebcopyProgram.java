package com.lazarus.cobol.jcl.batch;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

/**
 * IEBCOPY — IBM Partitioned Dataset (PDS) copy utility.
 *
 * Copies or merges members between partitioned datasets.
 * In Java context, a PDS is modeled as a directory, members as files.
 *
 * Control statements (from SYSIN):
 *   COPY INDD=ddname,OUTDD=ddname
 *   SELECT MEMBER=(name1,name2,...)
 *   SELECT MEMBER=((oldname,newname),...)
 *   EXCLUDE MEMBER=(name1,name2,...)
 *
 * DDs:
 *   SYSIN    — control statements
 *   SYSPRINT — messages
 *   SYSUT1   — default input PDS (directory)
 *   SYSUT2   — default output PDS (directory)
 *   user-defined DDs for INDD/OUTDD references
 */
public class IebcopyProgram extends BatchProgram {

    @Override
    public void run() {
        List<String> sysin = readSysin();

        // If no SYSIN, do simple SYSUT1→SYSUT2 copy
        if (sysin.isEmpty()) {
            copyDirectory(getDDPath("SYSUT1"), getDDPath("SYSUT2"), null, null, null);
            return;
        }

        // Parse control statements
        String joined = String.join(" ", sysin).trim();
        String inDD = "SYSUT1", outDD = "SYSUT2";

        // COPY INDD=,OUTDD=
        String inddVal = extractKeyword(joined, "INDD");
        String outddVal = extractKeyword(joined, "OUTDD");
        if (!inddVal.isEmpty()) inDD = inddVal;
        if (!outddVal.isEmpty()) outDD = outddVal;

        // SELECT MEMBER=
        List<MemberSpec> selectMembers = parseMemberList(joined, "SELECT");
        // EXCLUDE MEMBER=
        List<MemberSpec> excludeMembers = parseMemberList(joined, "EXCLUDE");

        String inPath = getDDPath(inDD);
        String outPath = getDDPath(outDD);

        copyDirectory(inPath, outPath,
            selectMembers.isEmpty() ? null : selectMembers,
            excludeMembers.isEmpty() ? null : excludeMembers,
            null);
    }

    /** Copy members from source directory to target directory */
    private void copyDirectory(String srcPath, String dstPath,
            List<MemberSpec> select, List<MemberSpec> exclude, String replace) {

        if (srcPath == null || srcPath.isEmpty()) {
            sysprint("IEBCOPY: No input directory specified");
            returnCode = Math.max(returnCode, 12);
            return;
        }

        File srcDir = new File(srcPath);
        File dstDir = new File(dstPath);

        if (!srcDir.exists() || !srcDir.isDirectory()) {
            // Treat as single file copy if not a directory
            if (srcDir.exists() && srcDir.isFile()) {
                copySingleFile(srcDir, dstDir, select);
                return;
            }
            sysprint("IEBCOPY: Source directory not found: " + srcPath);
            returnCode = Math.max(returnCode, 12);
            return;
        }

        dstDir.mkdirs();

        File[] members = srcDir.listFiles();
        if (members == null) {
            sysprint("IEBCOPY: Cannot list source directory");
            returnCode = Math.max(returnCode, 12);
            return;
        }

        int copied = 0;
        for (File member : members) {
            if (!member.isFile()) continue;
            String name = member.getName().toUpperCase();
            String baseName = name.contains(".") ? name.substring(0, name.indexOf('.')) : name;

            // Check SELECT
            if (select != null) {
                MemberSpec spec = findMember(select, baseName);
                if (spec == null) continue;
                // Rename if specified
                String outName = spec.newName != null ? spec.newName : member.getName();
                copyFile(member, new File(dstDir, outName));
                copied++;
                continue;
            }

            // Check EXCLUDE
            if (exclude != null && findMember(exclude, baseName) != null) continue;

            copyFile(member, new File(dstDir, member.getName()));
            copied++;
        }

        sysprint(String.format("IEBCOPY: %d members copied from %s to %s", copied, srcPath, dstPath));
    }

    /** Copy a single file, applying member rename if specified */
    private void copySingleFile(File src, File dst, List<MemberSpec> select) {
        if (dst.isDirectory()) {
            String outName = src.getName();
            if (select != null && !select.isEmpty() && select.get(0).newName != null) {
                outName = select.get(0).newName;
            }
            copyFile(src, new File(dst, outName));
        } else {
            dst.getParentFile().mkdirs();
            copyFile(src, dst);
        }
        sysprint("IEBCOPY: 1 file copied");
    }

    /** Copy one file */
    private void copyFile(File src, File dst) {
        try {
            Files.copy(src.toPath(), dst.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            sysprint("IEBCOPY ERROR: " + e.getMessage());
            returnCode = Math.max(returnCode, 8);
        }
    }

    /** Parse SELECT/EXCLUDE MEMBER=(name,...) or MEMBER=((old,new),...) */
    private List<MemberSpec> parseMemberList(String text, String keyword) {
        List<MemberSpec> result = new ArrayList<>();
        String upper = text.toUpperCase();
        int kIdx = upper.indexOf(keyword.toUpperCase());
        if (kIdx < 0) return result;

        String afterKw = text.substring(kIdx + keyword.length()).trim();
        int mIdx = afterKw.toUpperCase().indexOf("MEMBER=");
        if (mIdx < 0) return result;

        String memberSpec = afterKw.substring(mIdx + 7).trim();
        if (memberSpec.startsWith("(")) {
            String content = extractParenContent(memberSpec);
            // Check if contains rename pairs: ((old,new),...)
            if (content.startsWith("(")) {
                // Rename pairs
                int depth = 0;
                StringBuilder cur = new StringBuilder();
                for (char c : content.toCharArray()) {
                    if (c == '(') { depth++; if (depth == 1) continue; }
                    else if (c == ')') { depth--; if (depth == 0) { parseMemberPair(cur.toString(), result); cur = new StringBuilder(); continue; } }
                    else if (c == ',' && depth == 0) continue;
                    cur.append(c);
                }
                if (cur.length() > 0) parseMemberPair(cur.toString(), result);
            } else {
                // Simple list
                for (String name : content.split(",")) {
                    name = name.trim();
                    if (!name.isEmpty()) result.add(new MemberSpec(name.toUpperCase(), null));
                }
            }
        } else {
            // Single member
            String name = memberSpec.split("[,\\s]")[0].trim();
            if (!name.isEmpty()) result.add(new MemberSpec(name.toUpperCase(), null));
        }
        return result;
    }

    private void parseMemberPair(String spec, List<MemberSpec> result) {
        String[] parts = spec.split(",");
        String old = parts[0].trim().toUpperCase();
        String newN = parts.length > 1 ? parts[1].trim().toUpperCase() : null;
        if (!old.isEmpty()) result.add(new MemberSpec(old, newN));
    }

    private String extractParenContent(String text) {
        if (!text.startsWith("(")) return text;
        int depth = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') depth++;
            else if (text.charAt(i) == ')') {
                depth--;
                if (depth == 0) return text.substring(1, i);
            }
        }
        return text.substring(1);
    }

    private MemberSpec findMember(List<MemberSpec> list, String name) {
        for (MemberSpec m : list) {
            if (m.oldName.equals(name.toUpperCase())) return m;
        }
        return null;
    }

    private static class MemberSpec {
        final String oldName;
        final String newName;
        MemberSpec(String old, String newN) { this.oldName = old; this.newName = newN; }
    }
}
