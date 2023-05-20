import library.*;

import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        //Librarian
        Librarian margo = new Librarian("Margo", new Contact("+37499454545", "margo@email.com"));
        Library library = new Library(margo);

        //Borrower
        Borrower saqo = new Borrower("Saqo", new Contact("+37477555666", "saqo@email.com"));

        //Books
        Book samvel = new Book("Samvel", "Raffi", new DateOfPublishing(1886));
        Book theLittlePrice = new Book("The Little Prince", "A. de sent Exupery", new DateOfPublishing(1943));

        System.out.println(library.isBookAvailable("Samvel"));

        library.addBook(samvel);
        library.addBook(theLittlePrice);

        System.out.println(library.isBookAvailable("Samvel"));
        System.out.println(library.isBookAvailable("The Little Prince"));

        //Borrower takes books
        saqo.takesBook("Samvel", margo);
        saqo.takesBook("The little prince", margo);

        saqo.booksList().forEach((Book book) -> {
            try {
                System.out.println(book.toString());
            } catch (NullPointerException e) {
                System.out.println("there are no longer any books out here for : " + saqo.getName());
            }
        });

        //Borrower returns the books
        Book bookToReturn = null;
        String returnBookName = "";
        do {
            System.out.print("Please enter the name of returnable book ");
            try (Scanner sc = new Scanner(System.in)) {
                returnBookName = sc.nextLine();
                System.out.println();
            }
        } while (returnBookName.equals(""));

        for (Book b : saqo.booksList()) {
            if (b != null) {
                if (b.getTitle().equals(returnBookName)) {
                    bookToReturn = b;
                    break;
                }
            }
        }
        saqo.returnBook(bookToReturn, margo);

        //
        System.out.println("The number of books is: " + library.getLibrarian().getNumberOfBooks());
    }
}