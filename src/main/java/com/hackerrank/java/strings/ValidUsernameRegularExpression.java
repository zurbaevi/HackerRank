package com.hackerrank.java.strings;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class ValidUsernameRegularExpression {
    private static final Scanner scan = new Scanner(System.in);

    class UsernameValidator {
        public static final String regularExpression = "^[[A-Z]|[a-z]][[A-Z]|[a-z]|\\d|[_]]{7,29}$";
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
