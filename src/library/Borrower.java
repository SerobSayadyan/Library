package library;

import java.util.ArrayList;

public class Borrower extends NameAndContactInfo{

    private final ArrayList<Book> books;

    public Borrower(String name, Contact contactInfo) {

        super.name = name;
        super.contactInfo = contactInfo;
        books = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo.toString();
    }

    @Override
    public String toString() {
        return "name: " + name + " | contactInfo: " + getContactInfo();
    }

    public void takesBook(String nameOfTheBook, Librarian librarian) {
        if (librarian.isBookAvailable(nameOfTheBook)) {
            Book book = librarian.getBooks().get(nameOfTheBook);
            librarian.getBooks().remove(nameOfTheBook);
            this.books.add(book);
        }
    }

    public void returnBook(Book book, Librarian librarian) {
        if (book != null) {
            librarian.putBackBook(book);
            this.books.remove(book);
        }
    }

    public ArrayList<Book> booksList() {
        return books;
    }

}
