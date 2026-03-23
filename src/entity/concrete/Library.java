package entity.concrete;

import entity.AbstractBook;
import entity.AbstractPerson;
import entity.enums.BOOK_STATUS;

import java.util.*;

public class Library {
    private Map<Long, AbstractBook> books = new HashMap<>();
    private Set<Reader> readers = new HashSet<>();


    //1-Task
    public Map<Long, AbstractBook> getBooks() {
        return books;
    }
    //2-Task
    public Set<Reader> getReaders(){
        return readers;
    }
    //3-Task
    public void newBook(AbstractBook book){
        books.put(book.getBook_ID(),book);
    }
    //4-Task
    public void lendBook(AbstractBook book, Reader reader){

        if(books.containsKey(book.getBook_ID()) && book.getStatus().equals(BOOK_STATUS.AVAILABLE) ){
            book.setStatus(BOOK_STATUS.GRANTED);
            book.setOwner(reader);

            reader.borrowBook(book);
        }else{
            System.out.println("This book is not in the system / is granted to our readers");
        }
    }
    //5-Task
    public void takeBackBook(AbstractBook book, Reader reader){

        if(books.containsKey(book.getBook_ID()) && book.getStatus().equals(BOOK_STATUS.GRANTED)){

            book.setStatus(BOOK_STATUS.AVAILABLE);
            book.setOwner(null);

            reader.returnBook(book);
        }else {
            System.out.println("This book is not in the system / is already in the library");
        }
    }
    //6-Task
    public AbstractBook showBook(AbstractBook book){
        if(books.containsKey(book.getBook_ID())){
            System.out.println("Here it is: ");
            return books.get(book.getBook_ID());
        }
        System.out.println("This book is not found");
        return book;
    }

    //Additional tasks
    public List<AbstractBook> booksByAuthor(String author){
        return books.values().stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();
    }
    public Map<Long, AbstractBook> removeBookById(Long id){
        books.remove(id);
        return books;
    }
    public Map<Long, AbstractBook> updateBookById(Long Id, AbstractBook book){
        if(books.containsKey(Id)){books.put(Id, book);}
        return books;
    }
    public AbstractBook showBookByName(String name){
        return books.values().stream()
                .filter(book -> book.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
    public AbstractBook showBookByAuthor(String author){
        return books.values().stream()
                .filter(book -> book.getAuthor().equals(author))
                .findFirst()
                .orElse(null);
    }

    public Reader getReaderById(Long id){
        return readers.stream()
                .filter(reader -> Objects.equals(reader.getMemberRecord().getMember_ID(), id))
                .findFirst()
                .orElse(null);
    }

    public AbstractBook showBookById(Long id){
        return books.get(id);
    }

    public void addReader(Reader person){
        readers.add(person);
    }



    private Library(){}

    private static Library instance;

    public static Library getInstance(){

        if(instance == null)
            instance = new Library();

        return instance;
    }

    @Override
    public String toString() {
        return "books=" + books +
                ", readers=" + readers;
    }
}
