package com.hackerrank.java.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class Day6LetsReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "", str2 = "";
        int noOf = sc.nextInt();
        for (int i = 0; i < noOf; i++) {
            String input = sc.next();
            for (int j = 0; j < input.length(); j++) {
                if (j % 2 == 0) {
                    str1 = str1 + input.charAt(j);
                } else {
                    str2 = str2 + input.charAt(j);

                }
            }
            System.out.println(str1 + " " + str2);
            str1 = str2 = "";
        }
        sc.close();
    }
}
