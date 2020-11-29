package com.hackerrank.java.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class Day25RunningTimeAndComplexity {
    private static boolean isPrime(int number) {
        if (number == 2) return true;
        if (number < 2 || number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            if (isPrime(scanner.nextInt())) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
        scanner.close();
    }
}
