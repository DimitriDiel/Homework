package lesson04;

public class Book {
    String author;
    String title;
    int numberOfPages;
    int catalogNumber;
    boolean storage;

    public void AuthorTitle(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public void BookFull(String author, String title, int numberOfPages, int catalogNumber, boolean storage) {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.catalogNumber = catalogNumber;
        this.storage = storage;
    }
    public void BookEdit(int numberOfPages, int catalogNumber, boolean storage){
        this.numberOfPages = numberOfPages;
        this.catalogNumber = catalogNumber;
        this.storage = storage;

    }
    public void BookInfo(){
        System.out.println("Автор: " + author);
        System.out.println("Название книги: " + title);
        System.out.println("Кол-во страниц: " + numberOfPages);
        System.out.println("Номер в каталоге: " + catalogNumber);
        System.out.println("Находиться в хранилище: " + storage);

    }


}

