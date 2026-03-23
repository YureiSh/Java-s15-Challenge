package entity.concrete;

import entity.AbstractBook;
import utils.ValidationUtil;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Librarian {
    private final String name = "enis";
    private final String password = "enis";
    private Boolean access = false;

    //Task-1
    public AbstractBook searchBook(Library library, Long book_id){
        ValidationUtil.accessRequired(access, "You need to acquire access first");
        return library.showBookById(book_id);
    }
    //Task-2
    public Boolean verifyMember(Library library, Long member_id, String phone ){
        ValidationUtil.accessRequired(access, "You need to acquire access first");
        return library.getReaders().stream()
                .anyMatch(reader ->
                        reader.getMemberRecord().getMember_ID().equals(member_id) &&
                                reader.getMemberRecord().getPhone_number().equals(phone)
                );
    }
    public Boolean verifyMember(Library library, Long member_id, LocalDateTime dateOfMembership){
        ValidationUtil.accessRequired(access, "You need to acquire access first");
        return library.getReaders().stream()
                .anyMatch(reader ->
                        reader.getMemberRecord().getMember_ID().equals(member_id) &&
                                reader.getMemberRecord().getDate_of_membership().equals(dateOfMembership)
                );
    }

    //Task-3
    public Set<Bill> issueBook(Library library, Long reader_id, Long book_id ){
        ValidationUtil.accessRequired(access, "You need to acquire access first");
        AbstractBook requestedBook = searchBook(library, book_id);
        Reader reader = library.getReaderById(reader_id);

        reader.borrowBook(requestedBook);
        return reader.addNewBill(createBill(reader, requestedBook));
    }

    //Task-4
    public Double calculateFine(AbstractBook book){
        return book.getPrice() * 0.15 + book.getPrice();
    }

    //Task-5
    public Bill createBill(Reader reader, AbstractBook requestedBook ){
        return new Bill(reader.getName(), requestedBook.getName(), calculateFine(requestedBook), LocalDateTime.now());
    }

    //Task-6
    public void returnBook(Library library, Bill bill, Long reader_id, Long book_id ){
        ValidationUtil.accessRequired(access, "You need to acquire access first");
        AbstractBook requestedBook = searchBook(library, book_id);
        Reader reader = library.getReaderById(reader_id);

        reader.returnBook(requestedBook);
        reader.removeBill(bill);
    }

    //Additional Tasks
    public void login(String name, String password){
        if(name.equals(this.name) && password.equals(this.password))
            setAccess(true);
    }

    private Librarian(){}

    private static Librarian instance;

    public static Librarian getInstance(){

        if(instance == null)
            instance = new Librarian();

        return instance;
    }

    //Getter and Setter
    public Boolean getAccess() {
        return access;
    }

    public void setAccess(Boolean access) {
        this.access = access;
    }
}
