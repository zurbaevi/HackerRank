package com.hackerrank.java.strings;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s == null || s.length() == 0) {
            System.out.println(0);
            return;
        }
        String[] bufferString = s.split("[ !,?._'@]+");
        System.out.println(bufferString.length);
        for (String a : bufferString) {
            System.out.println(a);
        }
    }
}
