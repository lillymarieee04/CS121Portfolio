package weekTen.abstractClasses;

public class LibraryDVD extends LibraryItem {
    private String director;

    public LibraryDVD(String title, String director) {
        super(title);
        this.director = director;
    }

    @Override
    public void displayInfo() {
        System.out.println("DVD Title: " + getTitle() + ", Director: " + director);
    }
}
