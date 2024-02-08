package Consultation.cons24_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository2 {

    public static void main(String[] args) throws IOException {

        String filePath = "src/Consultation/cons24_5/dataBook.txt";

        List<Book> books = new ArrayList<>();

        BookService bookService = new BookService();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        while (reader.ready()) {
            Book newBook = bookService.createBook(reader, books);
            bookService.addBook(books, newBook);
        }

        System.out.println(books);

        String searchBook = "Преступление и наказание";

        Optional<Book> foundBook = bookService.findBook(books,searchBook);

        bookService.printFindResult(foundBook,searchBook);

    }
}