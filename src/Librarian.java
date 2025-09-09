public class Librarian extends Employee {
    private String masterCode;

    public Librarian(String employeeID, String passCode, String masterCode) {
        super(employeeID, passCode);
        this.masterCode = masterCode;
    }

    public void addCustomer(PublicLibrary library, Customer customer) {
        System.out.println("Librarian.addCustomer() is called: Adding customer");
        library.addCustomer(customer);
    }

    public void removeCustomer(PublicLibrary library, Customer customer) {
        System.out.println("Librarian.removeCustomer() is called: Removing customer");
        library.removeCustomer(customer);
    }

    public void addShelf(PublicLibrary library, Bookshelf shelf) {
        System.out.println("Librarian.addShelf() is called: Adding shelf " + shelf.getShelfID());
        library.addShelf(shelf);
    }

    public void removeShelf(PublicLibrary library, Bookshelf shelf) {
        System.out.println("Librarian.removeShelf() is called: Removing shelf " + shelf.getShelfID());
        library.removeShelf(shelf);
    }
}
