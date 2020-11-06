package com.hackerrank.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class JavaPrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        System.out.println(n.isProbablePrime(100) ? "prime" : "not prime");
    }
}
