package entity.concrete;

import entity.AbstractBook;
import entity.AbstractPerson;
import entity.Abstract_member_Record;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Reader extends AbstractPerson {
    private Abstract_member_Record memberRecord;
    private Set<Bill> physicalBills;

    //Task-2
    public void borrowBook(AbstractBook book){
        memberRecord.addBookIssued(book);
    }
    //Task-3
    public void returnBook(AbstractBook book){
        memberRecord.removeBookIssued(book);
    }

    //Task-4
    public List<AbstractBook> showBooks(){
        return memberRecord.getBooks_issued();
    }

    //Additional Tasks

    public Set<Bill> addNewBill(Bill bill){
        physicalBills.add(bill);
        return physicalBills;
    }
    public Set<Bill> removeBill(Bill bill){
        physicalBills.remove(bill);
        return physicalBills;
    }

    //Getter Setter
    public Abstract_member_Record getMemberRecord() {
        return memberRecord;
    }

    public Set<Bill> getPhysicalBills() {
        return physicalBills;
    }

    public void setPhysicalBills(Set<Bill> physicalBills) {
        this.physicalBills = physicalBills;
    }

    public void setMemberRecord(Abstract_member_Record memberRecord) {
        this.memberRecord = memberRecord;
    }

    //Constructor
    public Reader(String name, Abstract_member_Record memberRecord ) {
        super(name);
        this.memberRecord = memberRecord;
    }
    //Task-5
    @Override
    public String whoYouAre(){
        return memberRecord.getType() + " " + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return Objects.equals(memberRecord, reader.memberRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberRecord);
    }

    @Override
    public String toString() {
        return  "Name= " + super.getName()+ ", " + "memberRecord= " + memberRecord;
    }
}
