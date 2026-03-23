package com.lazarus.cobol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * COBOL DISPLAY and ACCEPT verb implementations.
 */
public class CobolDisplay {

    public static void display(Object... items) {
        StringBuilder sb = new StringBuilder();
        for (Object item : items) {
            sb.append(String.valueOf(item));
        }
        System.out.println(sb.toString());
    }

    public static void displayNoAdvancing(Object... items) {
        StringBuilder sb = new StringBuilder();
        for (Object item : items) {
            sb.append(String.valueOf(item));
        }
        System.out.print(sb.toString());
    }

    public static String accept() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            return line != null ? line : "";
        } catch (IOException e) {
            return "";
        }
    }
}
