package com.movie.mash.up.client.entry;

import com.movie.mash.up.client.util.MovieConstants;

public class MovieProcessor {

	/**
	 * This will be the common place to process the entries 
	 * and build the object of our need. 
	 * 
	 * In java 7 we can directly use strings in switch cases.
	 * TODO : Redundant code-string.
	 * @param entry
	 */
//	public void processMovieEntry(MovieEntry entry) {
//		if (entry != null) {
//			String entryOrigin = entry.getMyMovieOrigin();
//			int entryOriginCode = MovieConstants
//					.getMovieOriginCode(entryOrigin);
//			switch (entryOriginCode) {
//
//			case MovieConstants.IMDB_MOVIE_ORIGIN_CODE:
//				IMBD2Entry imdbEntry = (IMBD2Entry)entry;
//				//We have the object here to publish this if necessary
//				System.out.print("Processing .......");
//				System.out.print(imdbEntry.getTitle());
//				break;
//			case MovieConstants.NETFLIX_MOVIE_ORIGIN_CODE:
//				break;
//			case MovieConstants.ROTTEN_TOMATOES_MOVIE_ORIGIN_CODE:
//				break;
//			case MovieConstants.NYTIMES_MOVIE_ORIGIN_CODE:
//				break;
//			default:
//				break;
//			}
//		}
//	}

}
