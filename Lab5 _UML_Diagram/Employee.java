public class Employee {
    private String employeeID;
    private String passCode;

    public Employee(String employeeID, String passCode) {
        this.employeeID = employeeID;
        this.passCode = passCode;
    }

    public void addBooks(Bookshelf bookshelf, Book book) {
        System.out.println("Employee.addBooks() is called: [Employee " + employeeID + "] Adding Book " +
                book.getBookID() + " to Shelf " + bookshelf.getShelfID());
        bookshelf.addBook(book);
    }

    public void moveBooks(Bookshelf sourceShelf, Bookshelf targetShelf, Book book) {
        System.out.println("Employee.moveBooks() is called: [Employee " + employeeID + "] Moving Book " +
                book.getBookID() + " from " + sourceShelf.getShelfID() + " to " + targetShelf.getShelfID());
        sourceShelf.removeBook(book);
        targetShelf.addBook(book);
    }

    public void removeBooks(Bookshelf bookshelf, Book book) {
        System.out.println("Employee.removeBooks() is called: [Employee " + employeeID + "] Removing Book " +
                book.getBookID() + " from Shelf " + bookshelf.getShelfID());
        bookshelf.removeBook(book);
    }
}

