package weekEleven.linkedListActivity;

import java.util.LinkedList;

public class LibraryMember {
    private String name;
    private String email;
    private String phoneNumber;
    private double lateFee;
    private LinkedList<String> borrowedBookList;

    public LibraryMember(String name, String email, String phoneNumber, double lateFee) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lateFee = lateFee;
        this.borrowedBookList = new LinkedList<>();
    }

    public void addBorrowedBook(String bookTitle) {
        borrowedBookList.add(bookTitle);
    }

    public void returnBook(String bookTitle) {
        borrowedBookList.remove(bookTitle);
    }

    public String getMemberInfo() {
        return "Name: " + name + "\nEmail: " + email + "\nPhone Number: " + phoneNumber + "\nLate Fee: $" + lateFee;
    }

    public void displayBorrowedBooks() {
        System.out.println("Books borrowed by " + name + ":");
        for (String book : borrowedBookList) {
            System.out.println("- " + book);
        }
    }
}

