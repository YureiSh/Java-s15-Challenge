package main;

import entity.Abstract_member_Record;
import entity.concrete.Library;
import entity.concrete.Magazine;
import entity.concrete.Reader;
import entity.concrete.StudentRecord;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Library library = Library.getInstance();

        LocalDateTime timeNow = LocalDateTime.now();

        Reader reader1 = new Reader("enis", new StudentRecord(
                1L,
                timeNow,
                0,
                "enis",
                "Yenimah",
                "110"));

        Reader reader2 = new Reader("Gamze", new StudentRecord(
                2L,
                timeNow,
                0,
                "Gamze",
                "Zeytinlik",
                "111"));

        Magazine book1 = new Magazine(1L, "unknown", "kitap", 12.99, 1.0, timeNow);

        library.addReader(reader2);
        library.addReader(reader1);
        library.newBook(book1);

        System.out.println(library.getReaders());
        System.out.println(library.getBooks());

    }
}