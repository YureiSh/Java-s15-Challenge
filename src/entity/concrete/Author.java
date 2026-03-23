package entity.concrete;

import entity.AbstractBook;
import entity.AbstractPerson;
import entity.Abstract_member_Record;

import java.time.LocalDateTime;
import java.util.Objects;


public class Author extends AbstractPerson {

    public Author(String name) {
        super(name);
    }


    public AbstractBook newMagazine(Long book_ID, String book_Name, Double price, Double edition){
        LocalDateTime timeNow = LocalDateTime.now();
        AbstractBook magazine = new Magazine(book_ID,
                getName(),
                book_Name,
                price,
                edition,
                timeNow);
        return magazine;
    }

    public AbstractBook newJournal(Long book_ID, String book_Name, Double price, Double edition){
        LocalDateTime timeNow = LocalDateTime.now();
        AbstractBook journal = new Journal(book_ID,
                getName(),
                book_Name,
                price,
                edition,
                timeNow);
        return journal;
    }

    public AbstractBook newStudyBook(Long book_ID, String book_Name, Double price, Double edition){
        LocalDateTime timeNow = LocalDateTime.now();
        AbstractBook studyBook = new StudyBook(book_ID,
                getName(),
                book_Name,
                price,
                edition,
                timeNow);
        return studyBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(getName(), author.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
