package Consultation.cons24_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class BookService {

    Book createBook(BufferedReader reader, List<Book> books) throws IOException {

        String title = extract(reader.readLine());
        String author = extract(reader.readLine());
        int yearOfPublication = Integer.parseInt(extract(reader.readLine()).replaceAll("[^\\d]", ""));
        return new Book(title, author, yearOfPublication);
    }

    void addBook(List<Book> books, Book book)  {
        // Предполагаем, что book не может быть null; проверяем поля book на пустоту
        if (book.getBookName() == null || book.getBookName().isBlank()) {
            System.out.println("Книга не добавлена: отсутствует название.");
            return;
        }
        if (book.getAuthor() == null || book.getAuthor().isBlank()) {
            System.out.println("Книга не добавлена: отсутствует автор.");
            return;
        }
        if (book.getYearOfIssue() <= 1800) {
            System.out.println("Книга не добавлена: неверный год издания.");
            return;
        }
        books.add(book);
        System.out.println("Книга успешно добавлена: " + book);
    }

    public String extract(String line){
        String value = line.substring(line.indexOf(":") + 1);
        value = value.contains(",") ? value.substring(0, value.indexOf(",")) : value;
        value = value.contains("}") ? value.replace("}", "") : value;
        return value.replace("\"", "").trim();
    }
    Optional<Book> findBook(List<Book> books, String searchTitle) {
        Book foundBook = books.stream()
                .filter(book -> book.getBookName().equalsIgnoreCase(searchTitle))
                .findFirst()
                .orElse(null);
        return Optional.ofNullable(foundBook);
    }
    void printFindResult(Optional<Book> foundBook, String searchTitle) {
        if (foundBook.isPresent()) {
            System.out.println("Найденная книга: " + foundBook.get());
        } else {
            System.out.println("Книга с названием \"" + searchTitle + "\" не найдена.");
        }
    }
}
