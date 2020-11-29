package com.hackerrank.java.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class Day20Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int numberOfSwaps = 0;
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    numberOfSwaps++;
                }
            }
        }
        if (numberOfSwaps == 0) {
            System.out.println("Array is sorted in 0 swaps.");
        } else {
            System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        }
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
