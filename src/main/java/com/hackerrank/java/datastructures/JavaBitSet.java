package com.hackerrank.java.datastructures;

import java.util.BitSet;
import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class JavaBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int N = sc.nextInt();
        BitSet[] bs = new BitSet[3];
        bs[1] = new BitSet(L);
        bs[2] = new BitSet(L);
        for (int i = 0; i < N; ++i) {
            String cmd = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (cmd) {
                case "AND" -> bs[a].and(bs[b]);
                case "SET" -> bs[a].set(b);
                case "FLIP" -> bs[a].flip(b);
                case "OR" -> bs[a].or(bs[b]);
                case "XOR" -> bs[a].xor(bs[b]);
            }
            System.out.print(bs[1].cardinality());
            System.out.print(" ");
            System.out.println(bs[2].cardinality());
        }
    }
}
