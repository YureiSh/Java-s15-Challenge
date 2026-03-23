package entity;

import entity.concrete.Reader;
import entity.enums.BOOK_STATUS;
import utils.ValidationUtil;

import java.time.LocalDateTime;
import java.util.Objects;

abstract public class AbstractBook {
    private Long book_ID;
    private String author; //Polymorph People author?
    private String name;
    private Double price;
    private BOOK_STATUS status;
    private Double edition;
    private LocalDateTime date_of_purchase;
    private Reader owner;

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

    //Task-6
    public void setStatus(BOOK_STATUS status) {
        this.status = status;
    }

    public void setEdition(Double edition) {
        this.edition = edition;
    }

    public void setDate_of_purchase(LocalDateTime date_of_purchase) {
        this.date_of_purchase = date_of_purchase;
    }

    //Task-3
    public void setOwner(Reader owner) {
        this.owner = owner;
    }

    //Getter
    public Long getBook_ID() {
        return book_ID;
    }

    //Task-2
    public String getAuthor() {
        return author;
    }

    //Task-1
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

    //Task-4
    public Reader getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        AbstractBook that = (AbstractBook) object;
        return Objects.equals(book_ID, that.book_ID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(book_ID);
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
                ", date_of_purchase=" + date_of_purchase +
                ", owner=" + (owner != null ? owner.getName() : "library");
    }
}
