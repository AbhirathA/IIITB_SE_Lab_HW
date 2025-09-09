public class Book {
    private String location;
    private String bookID;
    private String bookInfo;
    private boolean reserved;

    public Book(String location, String bookID, String bookInfo) {
        this.location = location;
        this.bookID = bookID;
        this.bookInfo = bookInfo;
        this.reserved = false;
    }

    public String getBookID() {
        return bookID;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
        System.out.println("Book.reserve() is called: Reserving book " + bookID);
        if (!reserved) {
            reserved = true;
        }
    }

    public void unreserve() {
        System.out.println("Book.unreserve() is called: Unreserving book " + bookID);
        if (reserved) {
            reserved = false;
        }
    }
}
