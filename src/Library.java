import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author, String isbn, LocalDate dateAdded, LocalDate tenureExpiryDate) {
        Book newBook = new Book(title, author, isbn, dateAdded, tenureExpiryDate);
        books.add(newBook);
        System.out.println("Added new book: " + newBook);
    }

    public void removeExpiredBooks() {
        Iterator<Book> iterator = books.iterator();
        LocalDate currentDate = LocalDate.now();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTenureExpiryDate().isBefore(currentDate)) {
                System.out.println("Removing expired book: " + book);
                iterator.remove();
            }
        }
    }

    public void updateBookDetails(String isbn, String newTitle, String newAuthor, LocalDate newTenureExpiryDate) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                books.add(new Book(newTitle, newAuthor, isbn, LocalDate.now(), newTenureExpiryDate));
                System.out.println("Updated book details: " + book);
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void printAllBooks() {
        System.out.println("Books available in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
