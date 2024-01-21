package lesson27.library.libraryVar2;

public class LibraryService {
    /*
    addBook

    getBooksByAuthor

    getBooksByGenre

    removeBook

     */

    public void addBook(Book book){
        BookRepository bookRepository = new BookRepository();
        AuthorRepository authorRepository = new AuthorRepository();
        GenreRepository genreRepository = new GenreRepository();

        bookRepository.addBook(book);
        authorRepository.addAuthor(book);
        genreRepository.addBookToGenre(book);
    }

    public void removeBook(Book book){
        BookRepository bookRepository = new BookRepository();
        AuthorRepository authorRepository = new AuthorRepository();
        GenreRepository genreRepository = new GenreRepository();

        bookRepository.removeBook(book);
        authorRepository.removeBook(book);
        genreRepository.removeBookFromGenre(book);

    }

}
