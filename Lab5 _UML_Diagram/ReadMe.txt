========================
Library Management Demo
========================

This demo implements a small public library system in Java.
It includes Employees, Librarians, Customers, Books, Bookshelves, and Public Libraries.
The Main.java file demonstrates all functionality, ensuring each method is called at least once.

----------------------------------
Instructions to Run the Demo
----------------------------------

1. Ensure you have Java installed on your system (Java 8+ recommended).
2. Place all `.java` files (Main.java, Employee.java, Librarian.java, Customer.java, Book.java, Bookshelf.java, PublicLibrary.java) in the same directory.
3. Open a terminal/command prompt and navigate to the directory.
4. Compile all files using:
      javac *.java
5. Run the demo using:
      java Main
6. Observe the output in the console. It includes separators for each method call for clarity.

----------------------------------
Classes Overview
----------------------------------

1) Employee.java
   - Represents a library employee.
   - Methods: addBooks, moveBooks, removeBooks.

2) Librarian.java
   - Subclass of Employee with additional privileges.
   - Methods: addCustomer, removeCustomer, addShelf, removeShelf (in addition to Employee methods).

3) Customer.java
   - Represents a library customer.
   - Attributes: name, address, cardNumber, borrowedBooks.
   - Methods: borrow, returnBook.

4) Book.java
   - Represents a book in the library.
   - Attributes: location, bookID, bookInfo, reserved.
   - Methods: getBookID, isReserved, reserve, unreserve.

5) Bookshelf.java
   - Represents a shelf containing books.
   - Attributes: shelfID, list of books.
   - Methods: getShelfID, findBook, addBook, removeBook.

6) PublicLibrary.java
   - Represents the library itself.
   - Attributes: id, address, list of customers, employees, shelves.
   - Methods: addCustomer, removeCustomer, addShelf, removeShelf, findBook, addEmployee, removeEmployee.

7) Main.java
   - Demonstrates all functionality.
   - Creates two libraries, multiple bookshelves, books, employees, librarians, and customers.
   - Calls every method at least once and prints aligned separators for clarity.

----------------------------------
Notes
----------------------------------
- The demo ensures each method of all classes is executed at least once.
- Two libraries demonstrate that the same Employee and Customer can exist across multiple libraries.
- Different Librarians are assigned to each library to show independent control.

