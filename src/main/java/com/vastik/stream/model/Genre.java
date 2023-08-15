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
public class Genre {
	private int id;
	private String name;

	public Genre(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
