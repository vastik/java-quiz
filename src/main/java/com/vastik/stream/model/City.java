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
}
