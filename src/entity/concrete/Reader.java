package entity.concrete;

import entity.AbstractPerson;
import entity.Abstract_member_Record;

import java.util.Objects;

public class Reader extends AbstractPerson {
    private Abstract_member_Record memberRecord;


    //Constructor
    public Reader(String name, Abstract_member_Record memberRecord ) {
        super(name);
        this.memberRecord = memberRecord;
    }


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
