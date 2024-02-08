package Consultation.cons24_5;

public class Book {

    private String bookName;
    private String author;
    private int yearOfIssue;

    public Book(String bookName, String author, int yearOfIssue) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
