package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

/**
 * @author Nika Zurbaevi
 */
public class Day19Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calc();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}

class Calc implements AdvancedArithmetic {
    public int divisorSum(int n) {
        if (n == 1) return 1;
        int sum = 1 + n, r = 0;
        for (int i = 2; i < n; i++) {
            r = n % i;
            if (r == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
