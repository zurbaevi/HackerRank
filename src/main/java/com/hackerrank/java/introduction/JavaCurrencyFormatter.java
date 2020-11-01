package com.hackerrank.java.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
        String us = US.format(payment);

        NumberFormat India = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = India.format(payment);

        NumberFormat China = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = China.format(payment);

        NumberFormat France = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = France.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
