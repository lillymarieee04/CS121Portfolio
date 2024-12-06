package weekThirteen.setAndIteratorActivity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibrarySet librarySet = new LibrarySet();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Library Book Management System");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a book ID");
            System.out.println("2. View all book IDs");
            System.out.println("3. Exit the system");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    librarySet.addBooks();
                    break;
                case 2:
                    librarySet.displayBooks();
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
