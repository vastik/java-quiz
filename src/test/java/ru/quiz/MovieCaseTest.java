package ru.quiz;

import ru.quiz.model.Movie;
import ru.quiz.service.MovieRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collection;

public class MovieCaseTest {
    private static MovieRepository movieRepository;

    @BeforeAll
    public static void beforeAll() throws IOException {
        movieRepository = new MovieRepository();
    }

    /**
     * Вывести количество фильмов, сгруппированных по имени режиссера
     */
    @Test
    public void printDirectorMoviesCountCase() {
        Collection<Movie> allMovies = movieRepository.findAllMovies();
    }

    /**
     * Вывести количество фильмов, снятых в жанрах "Drama" и "Comedy"
     */
    @Test
    public void printDramaAndComedyMovieCountCase() {
        Collection<Movie> allMovies = movieRepository.findAllMovies();
    }

    /**
     * Вывести количество фильмов, сгруппированных и отсортированных по году выпуска
     */
    @Test
    public void printMoviesInYearCountCase() {
        Collection<Movie> allMovies = movieRepository.findAllMovies();
    }
}
