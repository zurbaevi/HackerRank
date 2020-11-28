package com.hackerrank.java.oop;

/**
 * @author Zurbaevi Nika
 */
public class JavaInheritanceII {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
    }

    static class Arithmetic {
        int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {

    }
}
