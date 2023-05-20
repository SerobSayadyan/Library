package library;

public class Book {

    private final String title;

    private final String nameOfAuthor;

    private final DateOfPublishing dateOfPublishing;

    public Book(String title, String nameOfAuthor, DateOfPublishing dateOfPublishing) {

        this.title = title;
        this.nameOfAuthor = nameOfAuthor;
        this.dateOfPublishing = dateOfPublishing;

    }

    public String getTitle() {
        return title;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public String getDateOfPublishing() {
        return dateOfPublishing.getDate();
    }

    @Override
    public String toString() {
        return "title: " + title + " | author: " + nameOfAuthor + " |  " + getDateOfPublishing();
    }

}
