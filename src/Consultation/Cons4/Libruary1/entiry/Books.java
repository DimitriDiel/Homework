package Consultation.Cons4.Libruary1.entiry;

import java.util.Arrays;

public class Books {
    private Book[] books;

    public Books(Integer totalNumberOfBooks) {
        this.books = new Book[totalNumberOfBooks];
    }

    public Book[] getBooks() {
        return books;
    }
    @Override
    public String toString() {
        return "Books{" +
                "books=" + Arrays.toString(books) +

                '}';
    }
}
