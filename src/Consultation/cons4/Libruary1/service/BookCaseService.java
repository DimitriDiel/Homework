package Consultation.cons4.Libruary1.service;

import Consultation.cons4.Libruary1.entiry.Book;
import Consultation.cons4.Libruary1.entiry.Bookcase;
import Consultation.cons4.Libruary1.entiry.Bookshelf;

public class BookCaseService {

    public Bookcase createBookCase(int totalNumberOfShelves, int numberOfBooks){
        Bookcase newBookCase = new Bookcase(totalNumberOfShelves, numberOfBooks);
        return newBookCase;
    }

    public boolean putBookOnTheShelf(Book book, int numberOfShelf, Bookcase bookcase) {
        Bookshelf[] bookshelves = bookcase.getBookshelves();
        Bookshelf ourTargetShelf = bookshelves[numberOfShelf - 1];
        Book[] booksOnTheShelf = ourTargetShelf.getBooks();

        Integer freePlace = findFreePlaceOnTheShelf(booksOnTheShelf);

        if (freePlace >= 0) {
            booksOnTheShelf[freePlace] = book;
            return true;
        } else {
            System.out.println("На полке нет свободного места для книги");
            return false;
        }
    }

    private Integer findFreePlaceOnTheShelf( Book[] booksOnTheShelf) {
        Integer quantityBooksOnTheShelf = booksOnTheShelf.length;
        for (int i = 0; i < quantityBooksOnTheShelf; i++) {
            if (booksOnTheShelf[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeBookFromShelf(Book book, Bookcase bookcase) {
        Bookshelf[] allShelves = bookcase.getBookshelves();

        Integer shelfWhereBookIs = findShelfWhereBookIs(book, allShelves);

        if (shelfWhereBookIs >= 0) {
            removeBook(book, shelfWhereBookIs, bookcase);
            return true;
        } else {
            System.out.println("Книга не найдена!");
            return false;
        }
    }

    private Integer findShelfWhereBookIs(Book book, Bookshelf[] allShelves) {
        for (int i = 0; i < allShelves.length; i++) {
            Book[] books = allShelves[i].getBooks();
            Integer bookIndexOnTheShelf = getBookIndexOnTheShelf(book, books);
            if (bookIndexOnTheShelf >= 0) return i;
        }
        return -1;
    }

    private Integer getBookIndexOnTheShelf(Book book, Book[] books) {
        for (int j = 0; j < books.length; j++) {
            if (books[j] != null && book.equals(books[j])) {
                return j;
            }
        }
        return -1;
    }

    private void removeBook(Book book, Integer shelfWhereBookIs, Bookcase bookcase){
        Book[] books = bookcase.getBookshelves()[shelfWhereBookIs].getBooks();
        Integer bookIndexOnTheShelf = getBookIndexOnTheShelf(book, books);
        books[bookIndexOnTheShelf] = null;
    }

    public boolean swapBooksOnSalves(Book book1, Book book2, Bookcase bookcase){
        int shelfForBook1 = findShelfWhereBookIs(book1, bookcase.getBookshelves());
        int shelfForBook2 = findShelfWhereBookIs(book2, bookcase.getBookshelves());
        int book1Index = getBookIndexOnTheShelf(book1, bookcase.getBookshelves()[shelfForBook1].getBooks());
        int book2Index = getBookIndexOnTheShelf(book2, bookcase.getBookshelves()[shelfForBook2].getBooks());

        bookcase.getBookshelves()[shelfForBook1].getBooks()[book1Index] = book2;
        bookcase.getBookshelves()[shelfForBook2].getBooks()[book2Index] = book1;

        return true;

    }

    public void printBC(Bookcase bc){
        System.out.println("Книжный шкаф:");
        for (int i = 0; i < bc.getBookshelves().length; i++) {
            System.out.println("Книжная полка № " + (i + 1));
            for (int j = 0; j < bc.getBookshelves()[i].getBooks().length; j++) {
                System.out.println("Книга: " + bc.getBookshelves()[i].getBooks()[j]);
            }
        }
    }
}
