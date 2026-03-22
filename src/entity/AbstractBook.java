package entity;

import entity.enums.BOOK_STATUS;
import utils.ValidationUtil;

import java.time.LocalDateTime;

abstract public class AbstractBook {
    private Long book_ID;
    private String author; //Polymorph People author?
    private String name;
    private Double price;
    private BOOK_STATUS status;
    private Double edition;
    private LocalDateTime date_of_purchase;



    //Constructor

    public AbstractBook(Long book_ID, String author, String name,
                        Double price, Double edition,
                        LocalDateTime date_of_purchase) {
        this.book_ID = book_ID;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = BOOK_STATUS.AVAILABLE;
        this.edition = edition;
        this.date_of_purchase = date_of_purchase;
    }

    //Setter
    public void setBook_ID(Long book_ID) {
        ValidationUtil.requireNonNull(book_ID, "'book_ID', argument cannot be null");
        ValidationUtil.requirePositive(book_ID, "'book_ID' argument cannot be negative ");

        this.book_ID = book_ID;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStatus(BOOK_STATUS status) {
        this.status = status;
    }

    public void setEdition(Double edition) {
        this.edition = edition;
    }

    public void setDate_of_purchase(LocalDateTime date_of_purchase) {
        this.date_of_purchase = date_of_purchase;
    }


    //Getter
    public Long getBook_ID() {
        return book_ID;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public BOOK_STATUS getStatus() {
        return status;
    }

    public Double getEdition() {
        return edition;
    }

    public Double getPrice() {
        return price;
    }

    public LocalDateTime getDate_of_purchase() {
        return date_of_purchase;
    }

    @Override
    public String toString() {
        return "Book= " +
                "book_ID=" + book_ID +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", edition=" + edition +
                ", date_of_purchase=" + date_of_purchase;
    }
}
