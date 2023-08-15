package ru.quiz.model;

/**
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public class Director {
    private int id;
    private String name;
    private String imdb;

    public Director(int id, String name, String imdb) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }
}
