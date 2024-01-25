package Consultation.cons24_3.film;

import Consultation.cons24_3.film.entity.Film;
import Consultation.cons24_3.film.repository.FilmRepository;

public class FilmDemo {
    public static void main(String[] args) {

        Film film1 = new Film("Rembo","action","Stalone");
        Film film2 = new Film("Star Wars","fantastic","Lucas");
        Film film3 = new Film("Jaws","adventure","Spilberg");
        Film film4 = new Film("Lord of the Rings","fantasy","Jackson");

        FilmRepository filmRepository = new FilmRepository();

        filmRepository.addFilm(film1);
        filmRepository.addFilm(film2);
        filmRepository.addFilm(film3);
        filmRepository.addFilm(film4);

        System.out.println(filmRepository.findByGenre("adventure"));
        System.out.println(filmRepository.findByDirector("Jackson"));


    }
}
