package ru.quiz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.quiz.model.Country;
import ru.quiz.service.CitiesRepository;

import java.io.IOException;
import java.util.List;

public class CountryCaseTest {
    private static CitiesRepository repository;

    @BeforeAll
    public static void beforeAll() throws IOException {
        repository = new CitiesRepository();
    }

    /**
     * Вывести минимум, максимум и среднее количество населения каждой страны.
     * Дополнительно отсортировать по имени.
     */
    @Test
    public void printAvgMaxMinCountryPopulation() {
        List<Country> allCountries = repository.findAllCountries();
    }
}
