package lesson27.library.libraryVar2;

import java.util.*;

public class GenreRepository {
    private Map<String, List<Book>> booksByGenre = new HashMap<>();
    public void addBookToGenre(Book book){
        if (!booksByGenre.containsKey(book.getGenre())) {
            booksByGenre.put(book.getGenre(), new ArrayList<>());
        }
        booksByGenre.get(book.getGenre()).add(book);
    }

    public List<Book> getBooksByGenre(String genre) {
        if (booksByGenre.containsKey(genre)) {
            return new ArrayList<>(booksByGenre.get(genre));
        }
        return new ArrayList<>();
    }

    public void removeBookFromGenre(Book book){
        if (booksByGenre.containsKey(book.getGenre())) {
            List<Book> booksInGenre = booksByGenre.get(book.getGenre());
            booksInGenre.remove(book);
            if (booksInGenre.isEmpty()) {
                booksByGenre.remove((book.getGenre()));
            }
        }
    }

}
