package com.vastik.stream.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
@Getter
@Setter
@NoArgsConstructor
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
}