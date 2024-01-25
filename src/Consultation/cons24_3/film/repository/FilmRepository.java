package Consultation.cons24_3.film.repository;

import Consultation.cons24_3.film.entity.Film;

import java.util.ArrayList;
import java.util.List;

public class FilmRepository {

    private final List<Film> films;

    public FilmRepository() {
        this.films = new ArrayList<>();

    }
    public List<Film> getFilms() {
        return films;
    }
    public void addFilm(Film film){
        films.add(film);
    }
    public List<Film> findByGenre(String genre){

        List<Film> foundFilms = new ArrayList<>();

        for (Film currentFilm : films){
            if(currentFilm.getGenre().equals(genre)){
                foundFilms.add(currentFilm);
            }
        }
        return foundFilms;
    }

    public List<Film> findByDirector(String director){

        List<Film> foundFilms = new ArrayList<>();

        for (Film currentFilm : films){
            if(currentFilm.getDirector().equals(director)){
                foundFilms.add(currentFilm);
            }
        }
        return foundFilms;
    }

}
