package Consultation.Cons4.service;

import Consultation.Cons4.entiry.Book;
import Consultation.Cons4.entiry.Bookcase;

import java.util.Scanner;

public class BookService {

    public Book createBook(int id, String author, String bookName){
        Scanner scanner = new Scanner(System.in);

        Book newBook = new Book(id,author,bookName);

        return newBook;
    }

    public boolean addBookInCartotek(Book newBook, int sizeCartotek) {
        Book[] booksCartotek = new Book[sizeCartotek];
        Integer freePlace = findFreePlaceOnTheCartotek(booksCartotek);

        if (freePlace >= 0) {
            booksCartotek[freePlace] = newBook;
            return true;
        } else {
            System.out.println("На полке нет свободного места для книги");
            return false;

        }
    }

    private Integer findFreePlaceOnTheCartotek(Book[] booksOnTheCartotek) {
        Integer quantityBooksOnTheCartotek = booksOnTheCartotek.length;
        for (int i = 0; i < quantityBooksOnTheCartotek; i++) {
            if (booksOnTheCartotek[i] == null) {
                return i;
            }
        }
        return -1;
    }

}
