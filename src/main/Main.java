package main;

import entity.AbstractBook;
import entity.Abstract_member_Record;
import entity.concrete.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = Library.getInstance();

        boolean running = true;

        while (running) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1- Add book");
            System.out.println("2- Find book by id");
            System.out.println("3- Find book by name");
            System.out.println("4- List books by author");
            System.out.println("5- Lend book");
            System.out.println("6- Return book");
            System.out.println("7- Delete book");
            System.out.println("0- Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Book ID gir:");
                    Long id = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("Author gir:");
                    String author = scanner.nextLine();

                    System.out.println("Book name gir:");
                    String name = scanner.nextLine();

                    System.out.println("Price gir:");
                    Double price = scanner.nextDouble();

                    System.out.println("Edition gir:");
                    Double edition = scanner.nextDouble();

                    LocalDateTime timeNow = LocalDateTime.now();
                    library.newBook(new Journal(
                            id,
                            author,
                            name,
                            price,
                            edition,
                            timeNow
                    ));
                    System.out.println("Journal başarıyla eklendi!");
                    break;
                case 2:
                    // find by id
                    break;
                case 5:
                    // lend book
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

