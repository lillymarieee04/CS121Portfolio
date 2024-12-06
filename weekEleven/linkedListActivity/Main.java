package weekEleven.linkedListActivity;

public class Main {
    public static void main(String[] args) {
        LibraryMember member1 = new LibraryMember("Alice", "alice@example.com", "123-456-7890", 5.0);
        LibraryMember member2 = new LibraryMember("Bob", "bob@example.com", "098-765-4321", 2.5);

        member1.addBorrowedBook("The Great Gatsby");
        member1.addBorrowedBook("1984");
        member1.addBorrowedBook("To Kill a Mockingbird");
        member1.addBorrowedBook("Pride and Prejudice");

        member2.addBorrowedBook("The Hobbit");
        member2.addBorrowedBook("Moby Dick");
        member2.addBorrowedBook("Hamlet");

        System.out.println(member1.getMemberInfo());
        member1.displayBorrowedBooks();

        System.out.println("\n" + member2.getMemberInfo());
        member2.displayBorrowedBooks();

        member1.returnBook("1984");
        member2.returnBook("Hamlet");

        System.out.println("\nAfter returning a book:");
        member1.displayBorrowedBooks();
        member2.displayBorrowedBooks();
    }
}

