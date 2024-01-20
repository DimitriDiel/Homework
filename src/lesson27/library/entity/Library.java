package lesson27.library.entity;


import java.util.*;

public class Library {

    private List<Book> books;

    private Set<Author> authors;

    private Map<Genre,Books> genreBooksMap;

    public Library() {
        this.books = new ArrayList<>();
        this.authors = new HashSet<>();
        this.genreBooksMap = new HashMap<>();
    }

}
