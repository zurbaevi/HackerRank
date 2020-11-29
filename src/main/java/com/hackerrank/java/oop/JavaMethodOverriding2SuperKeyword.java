package com.hackerrank.java.oop;

/**
 * @author Zurbaevi Nika
 */
public class JavaMethodOverriding2SuperKeyword {
    public static void main(String[] args) {
        MotorCycle M = new MotorCycle();
    }

    static class BiCycle {
        String define_me() {
            return "a vehicle with pedals.";
        }
    }

    static class MotorCycle extends BiCycle {
        MotorCycle() {
            System.out.println("Hello I am a motorcycle, I am " + define_me());
            String temp = super.define_me();
            System.out.println("My ancestor is a cycle who is " + temp);
        }

        String define_me() {
            return "a cycle with an engine.";
        }
    }
}
