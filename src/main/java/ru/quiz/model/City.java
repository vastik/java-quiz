package ru.quiz.model;

/**
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public class City {
    private int id;
    private String name;
    private int population;
    private String countryCode;

    public City(int id, String name, String countryCode, int population) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.countryCode = countryCode;
    }

    public City() {
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

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
