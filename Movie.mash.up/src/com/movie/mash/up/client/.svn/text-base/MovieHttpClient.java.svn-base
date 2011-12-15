package com.movie.mash.up.client;

import com.google.gwt.http.client.Request;
import com.google.gwt.jsonp.client.JsonpRequestBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import com.movie.mash.up.client.entry.MovieProcessor;
import com.movie.mash.up.client.util.MovieConstants;

/**
 * This is httpClient which will make the Get call and get the response in JSON.
 * Currently it is for IMDB and only getting Year / Genre.
 * 
 * TODO : Add other Stubs and also handle error.
 * 
 * @author anil
 * 
 */
public class MovieHttpClient {

	public Request request1 = null;
	private MovieProcessor movieProcessor = null;
	public String imgURL = "#";

	/**
	 * TODO We may have to add another @param may be Source :
	 * netflix/imdb/tomatoes as we have adapter classes to each one of them.
	 * Further Once the Publish/Subscribe is ready we can either pass the
	 * repsonse from here to the concerned tab or process from here.
	 * 
	 * @param movieUrl
	 * 
	 *            Sample Response , attributes which we might need to map
	 *            ################################
	 * 
	 *            "Title":"Titanic", "Year":"1997", "Rated":"PG-13",
	 *            "Released":"19 Dec 1997",
	 *            "Genre":"Adventure, History, Romance",
	 *            "Director":"James Cameron", "Writer":"James Cameron",
	 *            "Actors":
	 *            "Leonardo DiCaprio, Kate Winslet, Billy Zane, Kathy Bates",
	 *            "Plot":
	 *            "Fictional romantic tale of a rich girl and poor boy who meet on the ill-fated voyage of the 'unsinkable' ship."
	 *            , "Poster":
	 *            "http://ia.media-imdb.com/images/M/MV5BMTY0NTQxNTUyNF5BMl5BanBnXkFtZTYwNzEwMjA5._V1._SX320.jpg"
	 *            , "Runtime":"3 hrs 14 mins", "Rating":"7.4", "Votes":"254995",
	 *            "ID":"tt0120338", "Response":"True"
	 *            ####################################
	 * 
	 */
	public MovieHttpClient() {
		movieProcessor = new MovieProcessor();
	}

	public String movieImgHttpGet(String movieName) {
		// String url = "http://www.imdbapi.com/?t=Titanic&r=JSON";

		String url = "http://api.rottentomatoes.com/api/public/v1.0/movies.json?apikey=mzbkwvt9qwbsue6aqwnqu43x&q="
				+ movieName;
		final String movieTitle = movieName;
		JsonpRequestBuilder jsonp = new JsonpRequestBuilder();
		jsonp.requestObject(url, new AsyncCallback<RottenTomatoesMovies>() {
			public void onFailure(Throwable throwable) {
				System.out.print("Failure");

			}
			@Override
			public void onSuccess(RottenTomatoesMovies result) {
				// TODO Auto-generated method stub

				System.out.println("Success : ");
				RottenTomatoesMovieInfo info = result.getMovies().get(0);
				System.out.println("Title : "+info.getTitle());
			//System.out.println("Movie ID:"+ info.getMovieID());
				//String movieTitle = info.getTitle();
				RottenTomatoesMoviePoster poster = info.getPosters();
				System.out.println("Profile : "+poster.getProfile());
				imgURL = poster.getProfile();
				
				
				String MOVIE_IMAGE_LIST = "<img src=" + imgURL + " alt= '"
						+ movieTitle + " ' name= '"
								+ movieTitle
						+ "' width='140' height='140' />";
				
				System.out.println("MOVIE_IMAGE_LIST"+MOVIE_IMAGE_LIST);
				Image newImage = new Image(imgURL);
				newImage.setTitle(movieTitle);
				newImage.setAltText(movieTitle);
				
				RootPanel.get("foo1").add(newImage);
				
				
				
				// String img=
				// result.getMovies().get(0).getPosters().getProfile();
				// System.out.println("Image : "+img);
			}

		});
		 RootPanel.get("loading").setVisible(false);
		return imgURL;
	}
	public void movieHttpGet(String movieUrl, int movieOrigin) {
		String url = "http://www.imdbapi.com/?t=Titanic&r=JSON";
		JsonpRequestBuilder jsonp = new JsonpRequestBuilder();
		switch (movieOrigin) {

		case MovieConstants.IMDB_MOVIE_ORIGIN_CODE:

			jsonp.requestObject(movieUrl, new AsyncCallback<IMDBEntry>() {
				public void onFailure(Throwable throwable) {
					System.out.print("Failure");

				}

				public void onSuccess(IMDBEntry imbdEntry) {

					System.out.print(imbdEntry.getYear());
					imbdEntry.getGenre();
					imbdEntry.getYear();
				}

			});

			break;
		case MovieConstants.NETFLIX_MOVIE_ORIGIN_CODE:
			break;
		case MovieConstants.ROTTEN_TOMATOES_MOVIE_ORIGIN_CODE:
			url = MovieConstants.ROTTEN_TOMATOES_MOVIE_BASE_URI_1;
			jsonp.requestObject(url, new AsyncCallback<RottenTomatoesEntry>() {
				public void onFailure(Throwable throwable) {
					System.out.print("Failure");

				}

				public void onSuccess(RottenTomatoesEntry entry) {
					System.out.println("Total: " + entry.getTotal());
					// parse the reviews and extract the links to each
					// of the
					// reviews

					int length = entry.getReviews().length();
					for (int i = 0; i < length; i++) {
						RottenTomatoesReview r = entry.getReviews().get(i);
						System.out.println("Critic name: " + r.getCritic());
						RottenTomatoesReviewLinks rl = r.getLinks();
						System.out.println("Review Link: " + rl.getReviewLink());

					}

				}
			});

			break;
		case MovieConstants.NYTIMES_MOVIE_ORIGIN_CODE:
			break;
		default:
			break;
		}

	}

}
