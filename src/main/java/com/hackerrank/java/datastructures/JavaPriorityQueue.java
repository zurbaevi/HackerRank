package com.hackerrank.java.datastructures;

import java.util.*;

/**
 * @author Nika Zurbaevi
 */
public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        List<Student> students = priorities.getStudents(events);
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> queue = new PriorityQueue<>(
                Comparator.comparing(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getID));

        Scanner input = new Scanner(System.in);

        for (String event : events) {
            String[] eventData = event.split(" ");

            if (eventData[0].equals("ENTER")) {
                Student student = new Student(Integer.parseInt(eventData[3]),
                        eventData[1], Double.parseDouble(eventData[2]));
                queue.add(student);
            } else if (eventData[0].equals("SERVED")) {
                queue.poll();
            }
        }

        input.close();

        List<Student> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }

        return students;
    }
}

class Student {
    private int studentId = 0;
    private String studentName;
    private double studentCGPA = 0.0;

    public Student(int id, String name, double cgpa) {
        studentId = id;
        studentName = name;
        studentCGPA = cgpa;
    }

    public int getID() {
        return studentId;
    }

    public String getName() {
        return studentName;
    }

    public double getCGPA() {
        return studentCGPA;
    }
}
