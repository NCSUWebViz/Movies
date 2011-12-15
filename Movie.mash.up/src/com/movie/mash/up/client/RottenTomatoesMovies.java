package com.movie.mash.up.client;

import com.google.gwt.core.client.JavaScriptObject;

public class RottenTomatoesMovies extends JavaScriptObject {

	protected RottenTomatoesMovies() {

	}

	public final native RottenTomatoesMovieInfoList<RottenTomatoesMovieInfo> getMovies() /*-{

		return this.movies;
	}-*/;
}
