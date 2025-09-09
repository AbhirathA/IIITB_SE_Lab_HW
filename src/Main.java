public class Main {
    public static void main(String[] args) {
        System.out.println("Main: Start Driver Code\n");
        System.out.println("Main: Create first library and shelves\n");

        // First library
        PublicLibrary library1 = new PublicLibrary("001", "Downtown");

        // Create shelves
        Bookshelf shelf1 = new Bookshelf("S1");
        Bookshelf shelf2 = new Bookshelf("S2");

        System.out.println("--------- Main called library1.addShelf(shelf1) ----------------");
        library1.addShelf(shelf1);
        System.out.println("--------- ----------------End-------------------------");

        System.out.println("--------- Main called library1.addShelf(shelf2) ----------------");
        library1.addShelf(shelf2);
        System.out.println("--------- ----------------End-------------------------");

        // Create books
        Book book1 = new Book("Aisle 1", "B1", "Data Structures");
        Book book2 = new Book("Aisle 2", "B2", "Operating Systems");

        // Create employees and librarians
        Employee employee = new Employee("E2", "empPass");         // same employee for both libraries
        Librarian librarian1 = new Librarian("E1", "pass123", "master001");

        System.out.println("--------- Main called library1.addEmployee(employee) ------------");
        library1.addEmployee(employee);
        System.out.println("--------- ----------------End-------------------------");

        System.out.println("--------- Main called library1.addEmployee(librarian1) ----------");
        library1.addEmployee(librarian1);
        System.out.println("--------- ----------------End-------------------------");

        // Create customer
        Customer customer = new Customer("Alice", "123 Road", "C001");  // same customer for both libraries

        System.out.println("--------- Main called librarian1.addCustomer(library1, customer) --");
        librarian1.addCustomer(library1, customer);
        System.out.println("--------- ----------------End-------------------------");

        // Test employee and librarian methods
        System.out.println("--------- Main called employee.addBooks(shelf1, book1) ---------");
        employee.addBooks(shelf1, book1);
        System.out.println("--------- ----------------End-------------------------");

        System.out.println("--------- Main called librarian1.addBooks(shelf1, book2) --------");
        librarian1.addBooks(shelf1, book2);
        System.out.println("--------- ----------------End-------------------------");

        System.out.println("--------- Main called customer.borrow(book1) -------------------");
        customer.borrow(book1);
        System.out.println("--------- ----------------End-------------------------");

        System.out.println("--------- Main called customer.returnBook(book1) ---------------");
        customer.returnBook(book1);
        System.out.println("--------- ----------------End-------------------------");

        // -------------------- Second library --------------------
        System.out.println("\nMain: Create second library with different librarian\n");

        PublicLibrary library2 = new PublicLibrary("002", "Uptown");

        // Create shelves for second library
        Bookshelf shelf3 = new Bookshelf("S3");
        Bookshelf shelf4 = new Bookshelf("S4");

        System.out.println("--------- Main called library2.addShelf(shelf3) ----------------");
        library2.addShelf(shelf3);
        System.out.println("--------- ----------------End-------------------------");

        System.out.println("--------- Main called library2.addShelf(shelf4) ----------------");
        library2.addShelf(shelf4);
        System.out.println("--------- ----------------End-------------------------");

        // Different librarian for second library
        Librarian librarian2 = new Librarian("E3", "pass456", "master002");

        System.out.println("--------- Main called library2.addEmployee(employee) ------------");
        library2.addEmployee(employee);  // same employee
        System.out.println("--------- ----------------End-------------------------");

        System.out.println("--------- Main called library2.addEmployee(librarian2) ----------");
        library2.addEmployee(librarian2);  // different librarian
        System.out.println("--------- ----------------End-------------------------");

        System.out.println("--------- Main called librarian2.addCustomer(library2, customer) --");
        librarian2.addCustomer(library2, customer);  // same customer
        System.out.println("--------- ----------------End-------------------------");

        // Add books to second library shelves
        Book book3 = new Book("Aisle 3", "B3", "Algorithms");
        Book book4 = new Book("Aisle 4", "B4", "Databases");

        System.out.println("--------- Main called employee.addBooks(shelf3, book3) ---------");
        employee.addBooks(shelf3, book3);
        System.out.println("--------- ----------------End-------------------------");

        System.out.println("--------- Main called librarian2.addBooks(shelf4, book4) -------");
        librarian2.addBooks(shelf4, book4);
        System.out.println("--------- ----------------End-------------------------");

        // Customer borrowing books in second library
        System.out.println("--------- Main called customer.borrow(book3) -------------------");
        customer.borrow(book3);
        System.out.println("--------- ----------------End-------------------------");

        System.out.println("--------- Main called customer.returnBook(book3) ---------------");
        customer.returnBook(book3);
        System.out.println("--------- ----------------End-------------------------");
    }
}
