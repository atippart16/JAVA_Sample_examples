import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private LocalDate dateAdded;
    private LocalDate tenureExpiryDate;

    public Book(String title, String author, String isbn, LocalDate dateAdded, LocalDate tenureExpiryDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.dateAdded = dateAdded;
        this.tenureExpiryDate = tenureExpiryDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public LocalDate getTenureExpiryDate() {
        return tenureExpiryDate;
    }

    @Override
    public String toString() {
        return "Book [Title=" + title + ", Author=" + author + ", ISBN=" + isbn + ", Date Added=" + dateAdded
                + ", Tenure Expiry Date=" + tenureExpiryDate + "]";
    }
}

