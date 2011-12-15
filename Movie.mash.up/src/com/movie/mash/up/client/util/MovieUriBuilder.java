package com.movie.mash.up.client.util;


/**
 * Instead of hard coding , we can build the required URI's here. For now it is
 * only IMDB and default is also returning imdb.
 * 
 * @author anil
 * 
 */
public class MovieUriBuilder {

	public static String buildGetUri(String title, int movieOrigin) {
		switch (movieOrigin) {

		case MovieConstants.IMDB_MOVIE_ORIGIN_CODE:
			return MovieConstants.IMBD_MOVIE_BASE_URI_1 + title
					+ MovieConstants.IMDB_MOVIE_BASE_URI_2_JSON;

		case MovieConstants.NETFLIX_MOVIE_ORIGIN_CODE:
			break;
		case MovieConstants.ROTTEN_TOMATOES_MOVIE_ORIGIN_CODE:
			break;
		case MovieConstants.NYTIMES_MOVIE_ORIGIN_CODE:
			break;
		default:
			return MovieConstants.IMBD_MOVIE_BASE_URI_1 + title
					+ MovieConstants.IMDB_MOVIE_BASE_URI_2_JSON;

		}
		return MovieConstants.IMBD_MOVIE_BASE_URI_1 + title
				+ MovieConstants.IMDB_MOVIE_BASE_URI_2_JSON;

	}

}
