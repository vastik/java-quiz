package com.vastik.stream.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
@Getter
@Setter
@NoArgsConstructor
public class Director {
	private int id;
	private String name;
	private String imdb;

	public Director(int id, String name, String imdb) {
		this.id = id;
		this.name = name;
	}
}
