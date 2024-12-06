package weekTen.abstractClasses;

public class TestLibraryItems {
    public static void main(String[] args) {
        LibraryItem book = new LibraryBook("The Hobbit", "J.R.R. Tolkien");
        LibraryItem dvd = new LibraryDVD("Inception", "Christopher Nolan");

        // Calling abstract method displayInfo
        book.displayInfo();
        dvd.displayInfo();
    }
}

