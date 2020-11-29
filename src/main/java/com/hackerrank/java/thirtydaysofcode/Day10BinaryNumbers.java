package com.hackerrank.java.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class Day10BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int r = n, counter = 0, maxOne = 0;
        String s = "";
        while (n > 0) {
            r = n % 2;
            if (r == 1) {
                counter++;
                if (counter > maxOne) {
                    maxOne = counter;
                }
            } else {
                counter = 0;
            }
            s = r + s;
            n = n / 2;

        }
        System.out.println(maxOne);
        scanner.close();
    }
}
