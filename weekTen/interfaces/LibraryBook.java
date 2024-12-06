package weekTen.interfaces;

public class LibraryBook implements Borrowable {
    private String title;
    private boolean isBorrowed;

    public LibraryBook(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }
}
