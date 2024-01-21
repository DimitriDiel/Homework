package lesson27.library.libraryVar2;

import java.util.*;

public class AuthorRepository {
    private Map<String, Set<Book>> authorsBooks = new HashMap<>();

    public void addAuthor(Book book) {
        String author = book.getAuthor();
        if (!authorsBooks.containsKey(author)) {
            authorsBooks.put(author, new HashSet<>());
        }
        authorsBooks.get(author).add(book);
    }

    public Set<Book> getBooksByAuthor(String author) {
        return authorsBooks.getOrDefault(author, new HashSet<>());
    }

    public void removeBook(Book book) {
        String author = book.getAuthor();
        if (authorsBooks.containsKey(author)) {
            authorsBooks.get(author).remove(book);
            if (authorsBooks.get(author).isEmpty()) {
                authorsBooks.remove(author);
            }
        }
    }
}
