package Consultation.cons24_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookRepository {


    public static void main(String[] args) throws IOException {

        String filePath = "src/Consultation/cons24_5/dataBook.txt";

        List<Book> books = new ArrayList<>();

        BufferedReader reader =new BufferedReader(new FileReader(filePath));

        String line;

        while ((line = reader.readLine()) != null) {
                String bookName = line;
                bookName = bookName.trim();
                bookName = bookName.split(": ")[1];
                bookName = bookName.replaceAll(",","");
                bookName = bookName.trim();

                String author = reader.readLine();
                author = author.trim();
                author = author.split(": ")[1];
                author = author.replaceAll(",","");
                author = author.trim();

                String yearOfIssue = reader.readLine();
                yearOfIssue = yearOfIssue.trim();
                yearOfIssue = yearOfIssue.split(": ")[1];
                yearOfIssue = yearOfIssue.replaceAll(",","");
                yearOfIssue = yearOfIssue.replaceAll("}","");
                yearOfIssue = yearOfIssue.trim();
                int yearOfIssueInt = Integer.parseInt(yearOfIssue);

                Book item = new Book(bookName,author,yearOfIssueInt);
                books.add(item);
        }

        reader.close();

        System.out.println(books);

        String searchValue = "Book1";
        boolean isContains = false;
        Book findedItem = null;

        for (Book item : books) {
            if (item.getBookName().equals(searchValue)) {
                findedItem = item;
                isContains = true;
            }
        }

        if (isContains) {
            System.out.println("Find element: " + findedItem);
        } else {
            System.out.println("Not found!");
        }
    }
}
