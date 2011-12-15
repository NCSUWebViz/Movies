package com.movie.mash.up.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.movie.mash.up.client.Movie;
import com.movie.mash.up.client.MovieListService;
import com.movie.mash.up.client.util.MovieConstants;
import com.movie.mash.up.server.scrapping.MovieMap;
import com.movie.mash.up.server.scrapping.MovieScrapper;
import com.movie.mash.up.server.util.CommonUtils;

/**
 * RPC communication between Client & Server. This is one of the ways of
 * communication. Serializing Object Movie and passing it as a Array back. TODO
 * : Reading from a file TODO : There is no support for writing to a file , we
 * have to get rid of appEngine if we want to write to files. Alternatively they
 * are providing datastore, another task to discover more abt that.
 * 
 * @author anil
 * 
 */
@SuppressWarnings("serial")
public class MovieListServiceImpl extends RemoteServiceServlet implements
		MovieListService {

	public final String MOVIE_GOD_FATHER = "God Father";
	public final String MOVIE_CAST_AWAY = "Cast Away";
	public final String MOVIE_BABEL = "Babel";
	public final String MOVIE_MATRIX = "Matrix";
	public final String SEPERATOR_COMMA = ",";

	public final String CATEGORY_WATCHED = "Watched";
	public final String CATEGORY_WISHLIST = "WishList";
	public final String MOVIE_TITLE = "title";
	public final String MOVIE_CATEGORY = "category";

	public final String FILE_NAME = "movielist.txt";

	public final int QUERY_PAGE_SIZE = 100;
	private Key movieListKey = null;
	private DatastoreService datastore = null;
	private MovieScrapper movieScrapper = null;

	public MovieListServiceImpl() {
		datastore = DatastoreServiceFactory.getDatastoreService();
		movieScrapper = new MovieScrapper();
	}

	/**
	 * When user wants to add a movie to the list Now using App Engine data
	 * store. Mapping Movie to an Entity . Currently just having 'title' &
	 * 'category'. We could possible extend this as our base schema.
	 */
	@Override
	public void addMovieTolist(Movie movie) {
		// TODO Auto-generated method stub
		// addToFile();
		movieListKey = KeyFactory.createKey("MovieList", "myMovieList");
		System.out.println(movieListKey);
		Entity myMovie = new Entity("Movie", movieListKey);
		myMovie.setProperty(MOVIE_TITLE, movie.getTitle());
		myMovie.setProperty(MOVIE_CATEGORY, movie.getCategory());

		datastore.put(myMovie);
	}

	/**
	 * TODO : ********** FIX ROTTEN TOMATOES ********** 
	 * It is just picking from IMDB time being.
	 * @param movie
	 */
	public void addMovieToListByScrapping(Movie movie){
		movieListKey = KeyFactory.createKey("MovieList", "myMovieList");
		Entity myMovie = new Entity("Movie", movieListKey);
		myMovie.setProperty(MOVIE_TITLE, movie.getTitle());
		// ############### IMDB ####################
		myMovie.setProperty(MovieConstants.IMDB_TITLE, movie.getImdb_title());
		myMovie.setProperty(MovieConstants.IMDB_ID, movie.getImdb_id());
		myMovie.setProperty(MovieConstants.IMDB_VOTES, movie.getImdb_Votes());
		myMovie.setProperty(MovieConstants.IMDB_RATING, movie.getImdb_rating());
		myMovie.setProperty(MovieConstants.IMDB_POSTER, movie.getImdb_poster());
		myMovie.setProperty(MovieConstants.IMDB_POSITIVE, movie.getImbd_positive().toString());
		//myMovie.setProperty(MovieConstants.IMDB_NEUTRAL, movie.getImdb_neutral().toString());
		myMovie.setProperty(MovieConstants.IMDB_NEGATIVBE, movie.getImdb_negative().toString());
		myMovie.setProperty(MovieConstants.IMDB_RATING_MAP, movie.getImbd_rating_map().toString());
		// ############### ROTTEN-TOMATOES ####################
		myMovie.setProperty(MovieConstants.RT_ID, movie.getRt_id());
		myMovie.setProperty(MovieConstants.RT_TOMATOMETER, movie.getRt_tomatoFresh());
		myMovie.setProperty(MovieConstants.RT_POSITIVE, movie.getRt_positive().toString());
		//myMovie.setProperty(MovieConstants.RT_NEUTRAL, movie.getRt_neutral().toString());
		myMovie.setProperty(MovieConstants.RT_NEGATIVBE, movie.getRt_negative().toString());
		myMovie.setProperty(MovieConstants.RT_RATING_MAP,movie.getRt_rating_map().toString());
		myMovie.setProperty(MovieConstants.RT_AUDIENCE_RATING, movie.getRt_audience_rating());
		myMovie.setProperty(MovieConstants.RT_CRITICS_RATING, movie.getRt_critics_ratings());

		// ############### AMAZON  ####################
		myMovie.setProperty(MovieConstants.AMAZON_AVG_RATING, movie.getAmazon_avg());
		myMovie.setProperty(MovieConstants.AMAZON_POSITIVE, movie.getAmazon_positive().toString());
		//myMovie.setProperty(MovieConstants.AMAZON_NEUTRAL, movie.getAmazon_neutral().toString());
		myMovie.setProperty(MovieConstants.AMAZON_NEGATIVBE, movie.getAmazon_negative().toString());
		myMovie.setProperty(MovieConstants.AMAZON_RATING_MAP,movie.getAmazon_rating_map().toString());
//		// ############### OVERALL  ####################
//		myMovie.setProperty(MovieConstants.OVER_ALL_RATING, movie.getOver_all_avg().toString());
//		myMovie.setProperty(MovieConstants.OVER_ALL_TOTAL, movie.getOver_all_total().toString());
//		myMovie.setProperty(MovieConstants.OVER_ALL_RATING_MAP, movie.getOver_all_rating_map().toString());
//		myMovie.setProperty(MovieConstants.OVER_ALL_RATING_PERCENTAGE, movie.getOver_all_rating_percentage_map().toString());

		datastore.put(myMovie);

	}
	/**
	 * Get all the movies from list. Using App Engine to make a query to get all
	 * the movie lists. TODO : Have to discover more ways to make good queries.
	 * We can check the console to see what it is returning, we take out the
	 * system.out later on.
	 */
	@Override
	public Movie[] getMovieList() {
		// TODO Auto-generated method stub
		Movie[] movieList = null;
		List<Entity> myMovieList = null;
		int movieListSize = 0;
		Movie movie = null;

		Query query = new Query("Movie", null);
		myMovieList = datastore.prepare(query).asList(
				FetchOptions.Builder.withLimit(QUERY_PAGE_SIZE));
		movieListSize = myMovieList.size();
		System.out.println(myMovieList);
		movieList = new Movie[movieListSize];
		int i = 0;
		initializeWithAvailableMovies();
		for (Entity entity : myMovieList) {
			movie = new Movie();
			if (entity != null )
			{
				movieList[i] = buildMovieFromEntity(entity,movie);
				i++;
			}
		}

		return movieList;
	}
	
	public void initializeWithAvailableMovies(){
		MovieMap movieMap = new MovieMap();
		int i = 0;
		for(String s : movieMap.map.keySet()){
			i++;
			addMovieToListByScrapping(movieScrapper.htmlScrapperFromMovieTitle(s));
		 //  movieScrapper.htmlScrapperFromMovieTitle(s);	
		}
	}

	private Movie buildMovieFromEntity(Entity entity, Movie myMovie) {
		// TODO Auto-generated method stub

		try {
			if (checkIfEntityHasProperty(entity, MOVIE_TITLE)) {
				myMovie.setTitle(entity.getProperty(MOVIE_TITLE).toString());
			}
			// ############### IMDB ####################
			if (checkIfEntityHasProperty(entity, MovieConstants.IMDB_TITLE)) {
				myMovie.setImdb_title(entity.getProperty(
						MovieConstants.IMDB_TITLE).toString());
			}
			if (checkIfEntityHasProperty(entity, MovieConstants.IMDB_ID)) {
				myMovie.setImdb_id(entity.getProperty(MovieConstants.IMDB_ID)
						.toString());
			}
			if (checkIfEntityHasProperty(entity, MovieConstants.IMDB_VOTES)) {
				myMovie.setImdb_Votes(entity.getProperty(
						MovieConstants.IMDB_VOTES).toString());
			}
			if (checkIfEntityHasProperty(entity, MovieConstants.IMDB_RATING)) {
				myMovie.setImdb_rating(entity.getProperty(
						MovieConstants.IMDB_RATING).toString());
			}
			if (checkIfEntityHasProperty(entity, MovieConstants.IMDB_POSTER)) {
				myMovie.setImdb_poster(entity.getProperty(
						MovieConstants.IMDB_POSTER).toString());
			}
			if (checkIfEntityHasProperty(entity, MovieConstants.IMDB_POSITIVE)) {
				String map = entity.getProperty(MovieConstants.IMDB_POSITIVE)
						.toString();
				myMovie.setImbd_positive(CommonUtils.stringToMap(map));
			}
			if (checkIfEntityHasProperty(entity, MovieConstants.IMDB_NEUTRAL)) {
				String map = entity.getProperty(MovieConstants.IMDB_NEUTRAL)
						.toString();

				myMovie.setImdb_neutral(CommonUtils.stringToMap(map));
			}
			if (checkIfEntityHasProperty(entity, MovieConstants.IMDB_NEGATIVBE)) {
				String map = entity.getProperty(MovieConstants.IMDB_NEGATIVBE)
						.toString();

				myMovie.setImdb_negative(CommonUtils.stringToMap(map));
			}
			if (checkIfEntityHasProperty(entity, MovieConstants.IMDB_RATING_MAP)) {
				String map = entity.getProperty(MovieConstants.IMDB_RATING_MAP)
						.toString();

				myMovie.setImbd_rating_map(CommonUtils.stringToMapIntInt(map));
			}
			// ############### Rotten Tomatoes ####################

			if (checkIfEntityHasProperty(entity, MovieConstants.RT_POSITIVE)) {
				String map = entity.getProperty(MovieConstants.RT_POSITIVE)
						.toString();
				myMovie.setRt_positive(CommonUtils.stringToMap(map));
			}
			if (checkIfEntityHasProperty(entity, MovieConstants.RT_NEUTRAL)) {
				String map = entity.getProperty(MovieConstants.RT_NEUTRAL)
						.toString();

				myMovie.setRt_neutral(CommonUtils.stringToMap(map));
			}
			if (checkIfEntityHasProperty(entity, MovieConstants.RT_NEGATIVBE)) {
				String map = entity.getProperty(MovieConstants.RT_NEGATIVBE)
						.toString();

				myMovie.setRt_negative(CommonUtils.stringToMap(map));
			}
			if (checkIfEntityHasProperty(entity, MovieConstants.RT_RATING_MAP)) {
				String map = entity.getProperty(MovieConstants.RT_RATING_MAP)
						.toString();

				myMovie.setRt_rating_map(CommonUtils.stringToMapIntInt(map));
			}
			
			if (checkIfEntityHasProperty(entity, MovieConstants.RT_AUDIENCE_RATING)) {
				
				myMovie.setRt_audience_rating(entity.getProperty(MovieConstants.RT_AUDIENCE_RATING)
						.toString());

			}
		
			// #################AMAZON#######################

			if (checkIfEntityHasProperty(entity, MovieConstants.AMAZON_POSITIVE)) {
				String map = entity.getProperty(MovieConstants.AMAZON_POSITIVE)
						.toString();
				myMovie.setAmazon_positive(CommonUtils.stringToMap(map));
			}
			if (checkIfEntityHasProperty(entity, MovieConstants.AMAZON_NEUTRAL)) {
				String map = entity.getProperty(MovieConstants.AMAZON_NEUTRAL)
						.toString();

				myMovie.setAmazon_neutral(CommonUtils.stringToMap(map));
			}
			if (checkIfEntityHasProperty(entity,
					MovieConstants.AMAZON_NEGATIVBE)) {
				String map = entity
						.getProperty(MovieConstants.AMAZON_NEGATIVBE)
						.toString();

				myMovie.setAmazon_negative(CommonUtils.stringToMap(map));
			}
			if (checkIfEntityHasProperty(entity,
					MovieConstants.AMAZON_RATING_MAP)) {
				String map = entity.getProperty(
						MovieConstants.AMAZON_RATING_MAP).toString();

				myMovie.setAmazon_rating_map(CommonUtils.stringToMapIntInt(map));
			}
if (checkIfEntityHasProperty(entity, MovieConstants.AMAZON_AVG_RATING)) {
				try{
				myMovie.setAmazon_avg(Float.parseFloat(entity.getProperty(MovieConstants.AMAZON_AVG_RATING)
						.toString()));
				}catch(NumberFormatException e){
					e.printStackTrace();
				}

			}
			// ###################COMMON FIELDS######################
			myMovie.buildCalculatedFields();

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return myMovie;
	}

	/**
	 * Check if the property Exists in the Entity
	 * 
	 * @param entity
	 * @param propertyName
	 * @return
	 */
	private boolean checkIfEntityHasProperty(Entity entity, String propertyName) {
		// TODO Auto-generated method stub

		if (entity != null && entity.hasProperty(propertyName)) {
			return true;
		}

		return false;
	}
	
	
		

}
