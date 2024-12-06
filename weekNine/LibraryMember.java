package weekNine;

public class LibraryMember {
    private String memberName;
    private String bookTitle;
    private String borrowDate;
    private String returnDate;

    public LibraryMember(String memberName) {
        this.memberName = memberName;
    }

    public LibraryMember(String memberName, String bookTitle, String borrowDate) {
        this.memberName = memberName;
        this.bookTitle = bookTitle;
        this.borrowDate = borrowDate;
    }

    public LibraryMember(String memberName, String bookTitle, String borrowDate, String returnDate) {
        this.memberName = memberName;
        this.bookTitle = bookTitle;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void reserveBook(String memberName, String bookTitle) {
        System.out.println("Reservation complete for priority member: " + memberName + ". Book Title: " + bookTitle);
    }

    public void reserveBook(String memberName, String bookTitle, String borrowDate) {
        System.out.println("Reservation complete for regular member: " + memberName + ". Book Title: " + bookTitle + ", Borrow Date: " + borrowDate);
    }

    public void reserveBook(String memberName, String bookTitle, String borrowDate, String returnDate) {
        System.out.println("Reservation complete for member: " + memberName + ". Book Title: " + bookTitle + ", Borrow Date: " + borrowDate + ", Return Date: " + returnDate);
    }
}
