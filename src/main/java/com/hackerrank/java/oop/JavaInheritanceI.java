package com.hackerrank.java.oop;

/**
 * @author Zurbaevi Nika
 */
public class JavaInheritanceI {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }

    static class Animal {
        void walk() {
            System.out.println("I am walking");
        }
    }

    static class Bird extends Animal {
        void fly() {
            System.out.println("I am flying");
        }

        void sing() {
            System.out.println("I am singing");
        }
    }
}
