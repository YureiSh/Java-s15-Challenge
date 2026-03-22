package entity.concrete;

import entity.AbstractBook;
import entity.AbstractPerson;
import entity.Abstract_member_Record;

import java.util.Objects;


public class Author extends AbstractPerson {

    private Abstract_member_Record memberRecord;




    //Overloading, çünkü person olan herkes aslında üye olabilir.
    public Author(String name, Abstract_member_Record memberRecord) {
        super(name);
        this.memberRecord = memberRecord;
    }

    public Author(String name) {
        super(name);
    }

    //Getter and Setter for member Record of Author
    public void setMemberRecord(Abstract_member_Record memberRecord) {
        this.memberRecord = memberRecord;
    }

    public Abstract_member_Record getMemberRecord() {
        return memberRecord;
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
