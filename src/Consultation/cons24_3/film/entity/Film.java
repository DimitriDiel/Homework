package Consultation.cons24_3.film.entity;

import java.util.Objects;

public class Film {

    private String title;
    private String genre;
    private String director;

    public Film(String title, String genre, String director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(title, film.title) && Objects.equals(genre, film.genre) && Objects.equals(director, film.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, director);
    }
}
