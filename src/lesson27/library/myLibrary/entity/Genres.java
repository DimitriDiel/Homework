package lesson27.library.myLibrary.entity;

import java.util.HashMap;

public class Genres {

    private HashMap<Genre,Books> genres;

    public HashMap<Genre, Books> getGenres() {
        return genres;
    }

    public void setGenres(HashMap<Genre, Books> genres) {
        this.genres = genres;
    }
}
