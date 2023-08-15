package ru.quiz.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.quiz.model.Director;
import ru.quiz.model.Genre;
import ru.quiz.model.Movie;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public class MovieRepository {
    private final Map<Integer, Movie> movies = new HashMap<>();
    private final Map<Integer, Genre> genres = new HashMap<>();
    private final Map<Integer, Director> directors = new HashMap<>();

    public MovieRepository() throws IOException {
        load();
    }

    private void load() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        movies.putAll(objectMapper.readValue(new File("workspace/streams/movies.json"),
                new TypeReference<Map<? extends Integer, ? extends Movie>>() {
                })
        );

        genres.putAll(objectMapper.readValue(new File("workspace/streams/genres.json"),
                new TypeReference<Map<? extends Integer, ? extends Genre>>() {
                })
        );

        directors.putAll(objectMapper.readValue(new File("workspace/streams/directors.json"),
                new TypeReference<Map<? extends Integer, ? extends Director>>() {
                })
        );

        for (Movie movie : movies.values()) {
            List<Genre> genreList = movie.getGenres()
                    .stream()
                    .map(e -> genres.get(e.getId()))
                    .collect(Collectors.toList());

            movie.setGenres(genreList);

            List<Director> directorList = movie.getDirectors()
                    .stream()
                    .map(e -> directors.get(e.getId()))
                    .collect(Collectors.toList());

            movie.setDirectors(directorList);
        }
    }

    public Collection<Movie> findAllMovies() {
        return movies.values();
    }
}