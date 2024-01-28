package lesson30.task7;

import java.util.Set;
import java.util.TreeSet;

public class BookDemo {
    public static void main(String[] args) {


    Set<Book> books = new TreeSet<>();

        books.add(new Book("ddd","fff",15.5));
        books.add(new Book("kkk","aaa",5.6));
        books.add(new Book("hhh","ccc",3.8));
        books.add(new Book("eee","www",7.8));

        System.out.println(books);


    }
}
