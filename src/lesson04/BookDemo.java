package lesson04;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.AuthorTitle("Tolkien","Hobbit");

        Book book2 = new Book();
        book2.BookFull("Berrouz","Tarzan",450,2,false);

        book1.BookInfo();

        book2.BookInfo();

        book1.BookEdit(350,1,true);

        book1.BookInfo();



    }
}
