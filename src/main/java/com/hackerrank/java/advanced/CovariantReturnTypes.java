package com.hackerrank.java.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Zurbaevi Nika
 */
public class CovariantReturnTypes {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = switch (s) {
            case "WestBengal" -> new WestBengal();
            case "AndhraPradesh" -> new AndhraPradesh();
            default -> null;
        };
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }

    static class Flower {
        public String whatsYourName() {
            return "I have many names and types.";
        }
    }

    static class Jasmine extends Flower {
        public String whatsYourName() {
            return "Jasmine";
        }
    }

    static class Lily extends Flower {
        public String whatsYourName() {
            return "Lily";
        }
    }

    static class Region {
        public Flower yourNationalFlower() {
            return new Flower();
        }
    }

    static class WestBengal extends Region {
        public Jasmine yourNationalFlower() {
            return new Jasmine();
        }
    }

    static class AndhraPradesh extends Region {
        public Lily yourNationalFlower() {
            return new Lily();
        }
    }
}
