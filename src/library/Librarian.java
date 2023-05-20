package library;

import java.util.HashMap;

public class Librarian extends NameAndContactInfo{

    private final HashMap<String, Book> books;

    public Librarian(String name, Contact contactInfo) {
        super.name = name;
        super.contactInfo = contactInfo;
        books = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo.toString();
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public Book takeOutBook(String nameOfBook) {
        return books.get(nameOfBook);
    }

    public void putBackBook(Book book) {
        if (book != null) {
            books.put(book.getTitle(), book);
        } else {
            throw new RuntimeException("There is no such book in Library list");
        }
    }

    public boolean isBookAvailable(String nameOfTheBook) {
        return books.containsKey(nameOfTheBook);
    }

    public HashMap<String, Book> getBooks() {
        return books;
    }

}
