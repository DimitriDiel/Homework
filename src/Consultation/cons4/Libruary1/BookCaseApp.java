package Consultation.cons4.Libruary1;

import Consultation.cons4.Libruary1.entiry.Book;
import Consultation.cons4.Libruary1.entiry.Bookcase;
import Consultation.cons4.Libruary1.service.BookCaseService;
import Consultation.cons4.Libruary1.service.BookService;

public class BookCaseApp {
    public static void main(String[] args) {
        BookService bookService = new BookService(12);
        BookCaseService bookCaseService = new BookCaseService();

        Book book1 = new Book(1, "Дюма", "Три мушкетера");
        Book book2 = new Book(2, "Жуль Верн", "80 тысяч лье под водой");
        Book book3 = new Book(3, "Булгаков", "Белая гвардия");
        Book book4 = new Book(4, "Пушкин", "Руслан и Людмила");
        Book book5 = new Book(5, "Гоголь", "Вечера на хуторе близ Диканьки");
        Book book6 = new Book(6, "Джек Лондон", "Белый клык");
        Book book7 = new Book(7, "Голсуорси", "Сага о Форсайтах");
        Book book8 = new Book(8, "Т. Драйзер", "Финасист");
        Book book9 = new Book(9, "Автор1", "Книга1");
        Book book10 = new Book(10, "Автор2", "Книга2");
        Book book11 = new Book(11, "Автор3", "Книга3");
        Book book12 = new Book(12, "Автор4", "Книга4");


        Bookcase bc = bookCaseService.createBookCase(3,4);
        bookCaseService.putBookOnTheShelf(book1,1,bc);
        bookCaseService.putBookOnTheShelf(book2,1,bc);
        bookCaseService.putBookOnTheShelf(book3,1,bc);
        bookCaseService.putBookOnTheShelf(book4,1,bc);
        bookCaseService.putBookOnTheShelf(book5,2,bc);
        bookCaseService.putBookOnTheShelf(book6,2,bc);
        bookCaseService.putBookOnTheShelf(book7,2,bc);
        bookCaseService.putBookOnTheShelf(book8,2,bc);
        bookCaseService.putBookOnTheShelf(book9,3,bc);
        bookCaseService.putBookOnTheShelf(book10,3,bc);
        bookCaseService.putBookOnTheShelf(book11,3,bc);
        bookCaseService.putBookOnTheShelf(book12,3,bc);

        bookCaseService.printBC(bc);


        System.out.println("==========================");
        bookCaseService.removeBookFromShelf(book7,bc);
        bookCaseService.removeBookFromShelf(book9,bc);
        bookCaseService.removeBookFromShelf(book10,bc);

        bookCaseService.printBC(bc);

        bookCaseService.swapBooksOnSalves(book3,book6,bc);
        System.out.println("==========================");

        bookCaseService.printBC(bc);

        bookCaseService.putBookOnTheShelf(book7,3,bc);


        bookCaseService.printBC(bc);

    }
}
