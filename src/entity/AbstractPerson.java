package entity;

abstract public class AbstractPerson {
    private String name;

    public AbstractPerson(String name) {
        this.name = name;
    }



    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String whoYouAre() {
        return name;
    }

    @Override
    public String toString() {
        return "name= " + name;
    }
}
