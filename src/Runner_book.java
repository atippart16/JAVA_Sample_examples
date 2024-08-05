import java.time.LocalDate;

public class Runner_book{
    public static void main(String[] args) {
        Library library = new Library();

        // Add new books to the library
        library.addBook("Book One", "Author A", "ISBN001", LocalDate.now(), LocalDate.now().plusMonths(6));
        library.addBook("Book Two", "Author B", "ISBN002", LocalDate.now(), LocalDate.now().plusMonths(3));

        // Print all books
        library.printAllBooks();

        // Remove expired books
        System.out.println("\nRemoving expired books...");
        library.removeExpiredBooks();

        // Print all books again
        library.printAllBooks();

        // Update book details
        System.out.println("\nUpdating book details...");
        library.updateBookDetails("ISBN001", "Updated Book One", "Updated Author A", LocalDate.now().plusMonths(12));

        // Print all books again
        library.printAllBooks();
    }
}
