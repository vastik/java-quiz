package ru.quiz.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.quiz.model.City;
import ru.quiz.model.Country;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public class CitiesRepository {
    private Map<String, Country> countries;
    private Map<Integer, City> cities;
    private Set<String> continents;

    public CitiesRepository() throws IOException {
        load();
    }

    private void load() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        countries = new ConcurrentHashMap<>();
        cities = new ConcurrentHashMap<>();

        countries.putAll(objectMapper.readValue(new File("workspace/streams/countries.json"),
                        new TypeReference<Map<String, Country>>() {
                        }
                )
        );

        cities.putAll(objectMapper.readValue(new File("workspace/streams/cities.json"),
                        new TypeReference<Map<Integer, City>>() {
                        }
                )
        );


        for (City city : cities.values()) {
            Country country = countries.get(city.getCountryCode());
            if (country == null) {
                System.out.println("No such countryCode: " + city.getCountryCode());
                continue;
            }
            country.getCities().add(city);
        }

        continents = new HashSet<>();

        for (Country country : countries.values())
            continents.add(country.getContinent());
    }


    public Country findCountryByCode(String code) {
        return countries.get(code);
    }


    public Country removeCountry(Country country) {
        return countries.remove(country.getCode());
    }


    public Country addCountry(Country country) {
        continents.add(country.getContinent());
        return countries.put(country.getCode(), country);
    }


    public Country updateCountry(Country country) {
        if (countries.get(country.getCode()) != null)
            return countries.put(country.getCode(), country);
        return null;
    }


    public Set<String> getAllContinents() {
        return continents;
    }


    public List<Country> findCountriesByContinent(String continent) {
        List<Country> result = new ArrayList<>();
        for (Country country : countries.values())
            if (continent.equals(country.getContinent()))
                result.add(country);
        return result;
    }


    public List<Country> findAllCountries() {
        return new ArrayList<>(countries.values());
    }


    public City findCityById(int id) {
        return cities.get(id);
    }


    public City removeCity(City city) {
        return cities.remove(city.getId());
    }


    public City addCity(City city) {
        if (!cities.containsKey(city.getId()))
            return cities.put(city.getId(), city);
        return null;
    }


    public City updateCity(City city) {
        if (cities.containsKey(city.getId()))
            return cities.put(city.getId(), city);
        return null;
    }


    public List<City> findAllCities() {
        return new ArrayList<>(cities.values());
    }


    public List<City> findCitiesByCountryCode(String countryCode) {
        return findCountryByCode(countryCode).getCities();
    }
}
