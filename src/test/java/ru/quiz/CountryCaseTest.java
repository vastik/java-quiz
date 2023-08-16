package ru.quiz;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.quiz.model.Country;
import ru.quiz.service.CitiesRepository;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

public class CountryCaseTest {
    private static CitiesRepository repository;

    @BeforeAll
    public static void beforeAll() throws IOException {
        repository = new CitiesRepository();
    }

    /**
     * Вывести среднее количество населения каждой страны. Дополнительно отсортировать по убыванию населения.
     */
    @Test
    public void printAvgMaxMinCountryPopulation() {
        List<Country> allCountries = repository.findAllCountries();
    }
}
