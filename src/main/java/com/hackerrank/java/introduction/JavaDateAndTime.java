package com.hackerrank.java.introduction;

import java.time.LocalDate;

/**
 * @author Nika Zurbaevi
 */
public class JavaDateAndTime {
    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }
}
