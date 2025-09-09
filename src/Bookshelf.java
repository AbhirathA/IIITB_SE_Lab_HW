import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private String shelfID;
    private List<Book> books;

    public Bookshelf(String shelfID) {
        this.shelfID = shelfID;
        this.books = new ArrayList<>();
    }

    public String getShelfID() {
        return shelfID;
    }

    public Book findBook(String bookID) {
        System.out.println("Bookshelf.findBook() is called: Searching for book " + bookID);
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                return book;
            }
        }
        return null;
    }

    public void addBook(Book book) {
        System.out.println("Bookshelf.addBook() is called: Adding book " + book.getBookID());
        books.add(book);
    }

    public void removeBook(Book book) {
        System.out.println("Bookshelf.removeBook() is called: Removing book " + book.getBookID());
        books.remove(book);
    }
}
