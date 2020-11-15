package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class Day14Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private final int[] elements;

    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    void computeDifference() {
        int maxNum = elements[0];
        int minNum = maxNum;
        for (int i = 1; i < elements.length; i++) {

            maxNum = Math.max(elements[i], maxNum);
            minNum = Math.min(elements[i], minNum);

        }
        maximumDifference = Math.abs(maxNum - minNum);
    }

}
