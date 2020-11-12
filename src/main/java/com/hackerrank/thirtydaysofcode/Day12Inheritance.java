package com.hackerrank.thirtydaysofcode;

/**
 * @author Nika Zurbaevi
 */
public class Day12Inheritance {
    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + "\nID: " + idNumber);
        }

    }

    class Student extends Person {
        private final int[] testScores;

        Student(String firstName, String lastName, int id, int[] testScores) {
            super(firstName, lastName, id);
            this.testScores = testScores;
        }

        public char calculate() {
            int sum = 0;
            for (int testScore : testScores) {
                sum += testScore;
            }
            int avg = (sum) / testScores.length;

            if (90 <= avg && avg <= 100) {
                return 'O';
            } else if (80 <= avg && avg < 90) {
                return 'E';
            } else if (70 <= avg && avg < 80) {
                return 'A';
            } else if (55 <= avg && avg < 70) {
                return 'P';
            } else if (40 <= avg && avg < 55) {
                return 'D';
            } else {
                return 'T';
            }
        }
    }
}
