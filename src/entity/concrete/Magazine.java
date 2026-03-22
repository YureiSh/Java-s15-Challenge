package entity.concrete;

import entity.AbstractBook;

import java.time.LocalDateTime;

public class Magazine extends AbstractBook {

    public Magazine(Long book_ID, String author, String name, Double price, Double edition, LocalDateTime date_of_purchase) {
        super(book_ID, author, name, price, edition, date_of_purchase);
    }


}
