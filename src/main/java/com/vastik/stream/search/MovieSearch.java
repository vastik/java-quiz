package com.vastik.stream.search;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
@Getter
@Setter
public class MovieSearch {
	private boolean yearRangeSelected;
	private int fromYear;
	private int toYear;
	private boolean genreSelected;
	private int genre;
	private boolean directorSelected;
	private int director;

	public MovieSearch() {
	}
}
