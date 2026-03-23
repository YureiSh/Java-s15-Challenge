package entity.concrete;

import java.time.LocalDateTime;

public class Bill {
    private String name;
    private String bookName;
    private Double price;
    private LocalDateTime issueDate;


    //Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    //Constructor
    public Bill(String name, String bookName, Double price, LocalDateTime issueDate) {
        this.name = name;
        this.bookName = bookName;
        this.price = price;
        this.issueDate = issueDate;
    }

    @Override
    public String toString(){
        return "Item of " + bookName + "for " + name + "Purchased in details of: "+ "\n "
                + issueDate + "\n"
                + price + "TL";
    }
}
