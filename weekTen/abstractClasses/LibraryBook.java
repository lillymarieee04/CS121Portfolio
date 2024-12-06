package weekTen.abstractClasses;

public class LibraryBook extends LibraryItem {
    private String author;

    public LibraryBook(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + getTitle() + ", Author: " + author);
    }
}
