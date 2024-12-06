package weekTen.interfaces;

public class TestBorrowableItems {
    public static void main(String[] args) {
        Borrowable book = new LibraryBook("The Hobbit");
        Borrowable dvd = new LibraryDVD("Inception");

        // Borrow and return the book
        book.borrowItem();
        book.returnItem();

        // Borrow and return the DVD
        dvd.borrowItem();
        dvd.returnItem();
    }
}

