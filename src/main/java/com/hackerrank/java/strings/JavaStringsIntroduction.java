package com.hackerrank.java.strings;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        System.out.println(A.length() > B.length() ? "No" : "Yes");
        System.out.println((A.toUpperCase()).charAt(0) + A.substring(1, A.length()) + " " + (B.toUpperCase()).charAt(0)
                + B.substring(1, B.length()));
    }
}
