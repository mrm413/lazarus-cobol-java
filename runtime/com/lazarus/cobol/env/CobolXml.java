package com.lazarus.cobol.env;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import java.io.StringReader;

/**
 * COBOL XML GENERATE / XML PARSE runtime support.
 * Maps COBOL XML statements to Java XML operations.
 */
public class CobolXml {

    /**
     * XML GENERATE — convert a data structure's string representation to XML.
     * In COBOL, this walks the group item and produces XML elements for each field.
     * Here we produce a simple XML wrapper around the string value.
     */
    public static String generate(Object data) {
        return generate(data, "data");
    }

    public static String generate(Object data, String fieldName) {
        if (data == null) return "<" + fieldName + "/>";
        String content = String.valueOf(data).stripTrailing();
        if (content.isEmpty()) content = " ";
        if (com.lazarus.cobol.CobolDisplay.dpicAppliesToXml() && isNumericLike(content)) {
            content = content.replace('.', ',');
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(fieldName).append(">");
        sb.append(escapeXml(content));
        sb.append("</").append(fieldName).append(">");
        return sb.toString();
    }

    /** XML GENERATE for JUSTIFIED RIGHT fields — strips leading spaces. */
    public static String generateJust(Object data, String fieldName) {
        if (data == null) return "<" + fieldName + "/>";
        String content = String.valueOf(data).stripLeading();
        if (content.isEmpty()) content = " ";
        return "<" + fieldName + ">" + escapeXml(content) + "</" + fieldName + ">";
    }

    /** XML GENERATE for numeric fields with decimal scaling — preserves trailing zeros. */
    public static String generateScaled(Object data, String fieldName, int scale) {
        if (data == null) return "<" + fieldName + "/>";
        String content = String.valueOf(data).strip();
        boolean negative = false;
        if (content.startsWith("-")) { negative = true; content = content.substring(1); }
        try {
            java.math.BigDecimal bd = new java.math.BigDecimal(content)
                    .setScale(scale, java.math.RoundingMode.HALF_UP);
            String result = bd.toPlainString();
            if (negative) result = "-" + result;
            if (com.lazarus.cobol.CobolDisplay.dpicAppliesToXml()) result = result.replace('.', ',');
            return "<" + fieldName + ">" + result + "</" + fieldName + ">";
        } catch (Exception e) {
            return "<" + fieldName + ">" + escapeXml(content) + "</" + fieldName + ">";
        }
    }

    /** XML GENERATE attribute fragment: returns ' name="value"' (with leading space). */
    public static String generateAttr(Object data, String attrName) {
        if (data == null) return " " + attrName + "=\"\"";
        String content = String.valueOf(data).stripTrailing();
        if (content.isEmpty()) content = " ";  // GnuCOBOL preserves at least one space
        return " " + attrName + "=\"" + escapeXmlAttr(content) + "\"";
    }

    /** XML GENERATE content fragment: returns the escaped text value without an element wrapper. */
    public static String generateContent(Object data) {
        if (data == null) return "";
        String content = String.valueOf(data).stripTrailing();
        return escapeXml(content);
    }

    private static boolean isNumericLike(String s) {
        if (s == null || s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c >= '0' && c <= '9') && c != '.' && c != ',' && c != '+' && c != '-') return false;
        }
        return true;
    }

    /**
     * XML PARSE — parse XML content and invoke processing procedure.
     * The processing procedure receives XML events via special registers.
     */
    public static void parse(String xml, Runnable processingProcedure) {
        if (xml == null || xml.isEmpty()) return;
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
            factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            SAXParser parser = factory.newSAXParser();
            parser.parse(new InputSource(new StringReader(xml)), new DefaultHandler() {
                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    if (processingProcedure != null) processingProcedure.run();
                }
                @Override
                public void characters(char[] ch, int start, int length) {
                    if (processingProcedure != null) processingProcedure.run();
                }
            });
        } catch (Exception e) {
            // XML parse error — COBOL would set XML-CODE special register
        }
    }

    private static String escapeXml(String s) {
        return s.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&apos;");
    }

    private static String escapeXmlAttr(String s) {
        return s.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;");
    }

    /**
     * Apply XML namespace prefix and xmlns declaration to generated XML.
     * Called when XML GENERATE uses NAMESPACE/NAMESPACE-PREFIX clauses.
     * If prefix and ns are both blank, returns xml unchanged.
     * Otherwise, prefixes all element tags and adds xmlns declaration to root.
     */
    public static String applyNamespace(String xml, String prefix, String ns) {
        if (prefix == null) prefix = "";
        if (ns == null) ns = "";
        prefix = prefix.strip();
        ns = ns.strip();
        if (ns.isEmpty() && prefix.isEmpty()) return xml;
        if (!prefix.isEmpty()) {
            // Add prefix to all opening tags (not closing tags starting with </)
            String pfx = prefix + ":";
            String result = xml.replaceAll("<(?!/)([A-Za-z0-9_.-]+)", "<" + pfx + "$1");
            // Add prefix to all closing tags
            result = result.replaceAll("</([A-Za-z0-9_.-]+)>", "</" + pfx + "$1>");
            // Add xmlns:prefix="ns" to the root element (first opening tag)
            if (!ns.isEmpty()) {
                result = result.replaceFirst(
                    "(<" + java.util.regex.Pattern.quote(pfx) + "[A-Za-z0-9_.-]+)",
                    "$1 xmlns:" + prefix + "=\"" + escapeXmlAttr(ns) + "\"");
            }
            return result;
        } else {
            // No prefix, just add default namespace xmlns="ns" to root
            return xml.replaceFirst("(<[A-Za-z0-9_.-]+)", "$1 xmlns=\"" + escapeXmlAttr(ns) + "\"");
        }
    }
}
