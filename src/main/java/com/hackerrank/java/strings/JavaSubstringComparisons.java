package com.hackerrank.java.strings;

/**
 * @author Nika Zurbaevi
 */
public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for (int i = 0; i + k <= s.length(); i++) {
            String word = s.substring(i, i + k);
            if (smallest.isEmpty() && largest.isEmpty()) {
                smallest = word;
                largest = word;
            }
            if (word.compareTo(smallest) < 0) {
                smallest = word;
            }
            if (word.compareTo(largest) > 0) {
                largest = word;
            }
        }
        return smallest + "\n" + largest;
    }
}
