package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 * @author Nika Zurbaevi
 */
public class Day13AbstractClasses {
    abstract static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    static class MyBook extends Book {
        int price;

        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        public void display() {
            System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
