package lesson27.library.myLibrary.entity;

import java.util.LinkedList;

public class Author {

    private String authorName;

    private LinkedList<Book> booksOfAuthor;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LinkedList<Book> getBooksOfAuthor() {
        return booksOfAuthor;
    }

    public void setBooksOfAuthor(LinkedList<Book> booksOfAuthor) {
        this.booksOfAuthor = booksOfAuthor;
    }
}
