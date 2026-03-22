package entity;

import java.time.LocalDateTime;
import java.util.Objects;

abstract public class Abstract_member_Record {
    private Long member_ID;
    private String type;
    private LocalDateTime date_of_membership;
    private Integer books_issued;
    private Integer max_book_limit;
    private String name;
    private String address;
    private String phone_number;

    public Abstract_member_Record(Long member_ID, String type, LocalDateTime date_of_membership,
                                  Integer books_issued, Integer max_book_limit, String name,
                                  String address, String phone_number) {
        this.member_ID = member_ID;
        this.type = type;
        this.date_of_membership = date_of_membership;
        this.books_issued = books_issued;
        this.max_book_limit = max_book_limit;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    //Setter
    public void setMember_ID(Long member_ID) {
        this.member_ID = member_ID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate_of_membership(LocalDateTime date_of_membership) {
        this.date_of_membership = date_of_membership;
    }

    public void setBooks_issued(Integer books_issued) {
        this.books_issued = books_issued;
    }

    public void setMax_book_limit(Integer max_book_limit) {
        this.max_book_limit = max_book_limit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    //Getter
    public Long getMember_ID() {
        return member_ID;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getDate_of_membership() {
        return date_of_membership;
    }

    public Integer getBooks_issued() {
        return books_issued;
    }

    public Integer getMax_book_limit() {
        return max_book_limit;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abstract_member_Record that = (Abstract_member_Record) o;
        return Objects.equals(member_ID, that.member_ID) && Objects.equals(type, that.type) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member_ID, type, name);
    }

    @Override
    public String toString() {
        return "member_Record{" +
                "member_ID=" + member_ID +
                ", type='" + type + '\'' +
                ", date_of_membership=" + date_of_membership +
                ", books_issued=" + books_issued +
                ", max_book_limit=" + max_book_limit +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
