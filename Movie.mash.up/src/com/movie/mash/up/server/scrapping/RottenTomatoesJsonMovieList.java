package com.movie.mash.up.server.scrapping;

import java.util.List;


public class RottenTomatoesJsonMovieList {

	public List<RottenTomatoesJsonMovie> getMovies() {
		return movies;
	}

	public void setMovies(List<RottenTomatoesJsonMovie> movies) {
		this.movies = movies;
	}

	private List<RottenTomatoesJsonMovie> movies ;
}
