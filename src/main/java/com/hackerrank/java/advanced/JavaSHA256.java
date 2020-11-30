package com.hackerrank.java.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class JavaSHA256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(getSHAHEX(s));
        sc.close();
    }

    private static String getSHAHEX(String s) {
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] result = digest.digest(s.getBytes());
            for (byte b : result) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                    sb.append('0');
                sb.append(hex);
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
