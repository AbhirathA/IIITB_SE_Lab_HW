import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private String cardNumber;
    private List<Book> borrowedBooks;

    public Customer(String name, String address, String cardNumber) {
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrow(Book book) {
        System.out.println("Customer.borrow() is called: Trying to borrow book " + book.getBookID());
        if (book.isReserved()) {
            System.out.println("Customer.borrow() is called: Book " + book.getBookID() + " is already reserved.");
            return;
        }
        book.reserve();
        borrowedBooks.add(book);
        System.out.println("Customer.borrow() is called: [Customer " + name + "] Borrowed " + book.getBookID());
    }

    public void returnBook(Book book) {
        System.out.println("Customer.returnBook() is called: Trying to return book " + book.getBookID());
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.unreserve();
            System.out.println("Customer.returnBook() is called: [Customer " + name + "] Returned " + book.getBookID());
        }
    }
}
