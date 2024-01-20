package Consultation.cons4.Libruary1.entiry;

import java.util.Arrays;

public class Bookcase {
    Bookshelf[] bookshelves;

    public Bookcase(int totalNumberOfShelves, int numberOfBooks) {
        this.bookshelves = new Bookshelf[totalNumberOfShelves];
        for (int i = 0; i < totalNumberOfShelves; i++) {
            bookshelves[i] = new Bookshelf(i, new Book[numberOfBooks]);
        }
    }


    public Bookshelf[] getBookshelves() {
        return bookshelves;
    }

    @Override
    public String toString() {
        return "Bookcase{" +
                "bookshelves=" + Arrays.toString(bookshelves) +
                '}';
    }
}
