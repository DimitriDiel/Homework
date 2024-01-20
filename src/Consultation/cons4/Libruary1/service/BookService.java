package Consultation.cons4.Libruary1.service;

import Consultation.cons4.Libruary1.entiry.Book;
import Consultation.cons4.Libruary1.entiry.Books;
import Consultation.lotto.service.UserInput;

public class BookService {

    UserInput ui = new UserInput();
    private int totalNumberOfBooks;

    public BookService(int totalNumberOfBooks) {
        this.totalNumberOfBooks = totalNumberOfBooks;
    }

    private Book createBook(){

        int bookId = ui.uiInt("insert book id:");
        String bookAuthor = ui.uiText("insert book author: ");
        String bookName = ui.uiText("insert book name:");
        Book book = new Book(bookId,bookAuthor,bookName);
        return book;
    }
    private Books createBooksArray(){
        Books books = new Books(totalNumberOfBooks);
        return books;
    }

    public  Books fillBooksArrayFromUser(){
        Books books = createBooksArray();

        for (int i = 0; i < books.getBooks().length; i++) {
            books.getBooks()[i] = createBook();
        }
        return books;
    }

}
