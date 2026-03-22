package entity.concrete;

import entity.AbstractBook;
import entity.AbstractPerson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library {
    private List<AbstractBook> books = new ArrayList<>();
    private Set<AbstractPerson> readers = new HashSet<>();

    public List<AbstractBook> getBooks() {
        return books;
    }

    public void newBook(AbstractBook book){
        books.add(book);
    }

    public Set<AbstractPerson> getReaders(){
        return this.readers;
    }
    public void addReader(AbstractPerson person){
        readers.add(person);
    }

    private Library(){}

    private static Library instance;

    public static Library getInstance(){

        if(instance == null)
            instance = new Library();

        return instance;
    }

}
