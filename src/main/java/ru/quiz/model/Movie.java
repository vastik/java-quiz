package ru.quiz.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public class Movie {
    private int id;
    private String title;
    private int year;
    private String imdb;
    private List<Genre> genres = new ArrayList<>();
    private List<Director> directors = new ArrayList<>();

    public Movie(int id, String title, int year, String imdb) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imdb = imdb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }
}