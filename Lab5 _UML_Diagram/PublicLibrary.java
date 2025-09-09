import java.util.ArrayList;
import java.util.List;

public class PublicLibrary {
    private String id;
    private String address;
    private List<Customer> customers;
    private List<Bookshelf> shelves;
    private List<Employee> employees;

    public PublicLibrary(String id, String address) {
        this.id = id;
        this.address = address;
        this.customers = new ArrayList<>();
        this.shelves = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        System.out.println("PublicLibrary.addCustomer() is called: Adding customer");
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        System.out.println("PublicLibrary.removeCustomer() is called: Removing customer");
        customers.remove(customer);
    }

    public void addShelf(Bookshelf shelf) {
        System.out.println("PublicLibrary.addShelf() is called: Adding shelf " + shelf.getShelfID());
        shelves.add(shelf);
    }

    public void removeShelf(Bookshelf shelf) {
        System.out.println("PublicLibrary.removeShelf() is called: Removing shelf " + shelf.getShelfID());
        shelves.remove(shelf);
    }

    public Book findBook(String bookID) {
        System.out.println("PublicLibrary.findBook() is called: Searching for book " + bookID);
        for (Bookshelf shelf : shelves) {
            Book book = shelf.findBook(bookID);
            if (book != null) {
                return book;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        System.out.println("PublicLibrary.addEmployee() is called: Adding employee");
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        System.out.println("PublicLibrary.removeEmployee() is called: Removing employee");
        employees.remove(employee);
    }
}
