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
        String str = "";
        for (int i = 0; i < Math.min(A.length(), B.length()); i++) {
            if ((int) (A.toLowerCase()).charAt(i) > (int) (B.toLowerCase()).charAt(i)) {
                str = "Yes";
                break;
            } else if ((A.toLowerCase()).charAt(i) < (B.toLowerCase()).charAt(i)) {
                str = "No";
                break;
            }
        }
        if (str.equals("")) {
            if (A.length() > B.length()) {
                str = "Yes";
            } else {
                str = "No";
            }
        }
        System.out.println(str);

        System.out.println((A.toUpperCase()).charAt(0) + A.substring(1, A.length()) + " " + (B.toUpperCase()).charAt(0)
                + B.substring(1, B.length()));
        sc.close();
    }
}
