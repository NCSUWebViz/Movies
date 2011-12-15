package com.movie.mash.up.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This is to consume the JSON returned by IMDB API.
 * Currently we just have Year and Genre, we have to add 
 * all the required attributes.
 * 
 * The main problem being Cross Domain Requests. We just cannot
 * make a call to other servers, hence this a kind of workaround that
 * GWT lately has introduced to get Cross Domain Request. 
 * 
 * We may have to replicate this to other Sites. 
 * 
 * The Idea is pretty simple to look at the JSON and Create the required 
 * attributes in this adapter class which actually maps the Object. 
 * 
 * @author anil
 *
 *		"Title":"Titanic",
   		"Year":"1997",
   		"Rated":"PG-13",
   		"Released":"19 Dec 1997",
   		"Genre":"Adventure, History, Romance",
   		"Director":"James Cameron",
   		"Writer":"James Cameron",
   		"Actors":"Leonardo DiCaprio, Kate Winslet, Billy Zane, Kathy Bates",
   		"Plot":"Fictional romantic tale of a rich girl and poor boy who meet on the ill-fated voyage of the 'unsinkable' ship.",
   		"Poster":"http://ia.media-imdb.com/images/M/MV5BMTY0NTQxNTUyNF5BMl5BanBnXkFtZTYwNzEwMjA5._V1._SX320.jpg",
   		"Runtime":"3 hrs 14 mins",
   		"Rating":"7.4",
   		"Votes":"254995",
   		"ID":"tt0120338",
   		"Response":"True"
 */
public class IMDBEntry extends JavaScriptObject {

	protected IMDBEntry() {
	}

	public final native String getTitle() /*-{
	return this.Title;
}-*/;

	public final native String getYear() /*-{
	return this.Year;
}-*/;

	public final native String getRated() /*-{
	return this.Rated;
}-*/;

	public final native String getReleased() /*-{
	return this.Released;
}-*/;

	public final native String getGenre() /*-{
	return this.Genre;
}-*/;

	public final native String getDirector() /*-{
	return this.Director;
}-*/;

	public final native String getWriter() /*-{
	return this.Writer;
}-*/;

	public final native String getActors() /*-{
	return this.Actors;
}-*/;

	public final native String getPlot() /*-{
	return this.Plot;
}-*/;

	public final native String getPoster() /*-{
	return this.Poster;
}-*/;

	public final native String getRating() /*-{
	return this.Rating;
}-*/;

	public final native String getVotes() /*-{
	return this.Votes;
}-*/;

}
