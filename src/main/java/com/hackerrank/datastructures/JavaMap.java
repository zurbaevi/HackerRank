package com.hackerrank.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class JavaMap {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
