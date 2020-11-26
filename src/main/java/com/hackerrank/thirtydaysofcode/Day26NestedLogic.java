package com.hackerrank.thirtydaysofcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class Day26NestedLogic {
    private final static int YEAR = 2;
    private final static int MONTH = 1;
    private final static int DAY = 0;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int[] dateReturned = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dateExpected = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        scanner.close();
        int monthDifference = dateReturned[MONTH] - dateExpected[MONTH];
        int dayDifference = dateReturned[DAY] - dateExpected[DAY];
        int fee = 0;

        if (dateReturned[YEAR] > dateExpected[YEAR]) {
            fee = 10000;
        } else if (monthDifference > 0) {
            fee = 500 * monthDifference;
        } else if (dayDifference > 0) {
            fee = 15 * dayDifference;
        }
        System.out.println(fee);
    }
}
