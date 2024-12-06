package weekTen.abstractClasses;

public abstract class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayInfo();
}

