package library;

public class Library {

    private int numberOfBooks;

    private Borrower currentBorrower;

    private final Librarian librarian;

    public Library(Librarian librarian) {
        this.librarian = librarian;
        this.numberOfBooks = librarian.getNumberOfBooks();
        currentBorrower = new Borrower("None", null);
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public boolean isBookAvailable(String nameOfTheBook) {
        return librarian.isBookAvailable(nameOfTheBook);
    }

    public Borrower getCurrentBorrower() {
        return currentBorrower;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void addBook(Book book) {
        librarian.getBooks().put(book.getTitle(), book);
    }

    public void addBook(String nameOfTheBook, Book book) {
        librarian.getBooks().put(nameOfTheBook, book);
    }

}
