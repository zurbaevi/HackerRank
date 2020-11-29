package com.hackerrank.java.oop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class JavaInstanceofKeyword {
    static String count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;
        for (Object element : mylist) {
            if (element instanceof Student)
                a++;
            if (element instanceof Rockstar)
                b++;
            if (element instanceof Hacker)
                c++;
        }
        String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
        return ret;
    }

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) myList.add(new Student());
            if (s.equals("Rockstar")) myList.add(new Rockstar());
            if (s.equals("Hacker")) myList.add(new Hacker());
        }
        System.out.println(count(myList));
    }

    static class Student {
    }

    static class Rockstar {
    }

    static class Hacker {
    }
}
