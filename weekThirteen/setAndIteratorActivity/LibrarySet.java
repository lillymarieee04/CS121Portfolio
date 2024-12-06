package weekThirteen.setAndIteratorActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LibrarySet {
    private Set<String> bookIDs = new HashSet<>();

    public void addBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book IDs to add (enter '0' to quit):");

        while (true) {
            String bookID = scanner.nextLine();
            if (bookID.equals("0")) {
                return; // Exit method
            }
            bookIDs.add(bookID);
        }
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        Iterator<String> iterator = bookIDs.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

