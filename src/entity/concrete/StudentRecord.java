package entity.concrete;

import entity.Abstract_member_Record;

import java.time.LocalDateTime;

public class StudentRecord extends Abstract_member_Record {

    private static final int MAX_LIMIT = 5;
    public StudentRecord(Long member_ID,
                         LocalDateTime date_of_membership,
                         Integer books_issued,
                         String name,
                         String address,
                         String phone_number) {

        super(member_ID, "Student", date_of_membership, books_issued,
                MAX_LIMIT, name, address, phone_number);
    }
}
