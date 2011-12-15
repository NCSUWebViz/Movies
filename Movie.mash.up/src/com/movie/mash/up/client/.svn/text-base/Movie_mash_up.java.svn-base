package com.movie.mash.up.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.w3c.dom.html.HTMLElement;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.movie.mash.up.client.util.MovieConstants;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Movie_mash_up implements EntryPoint {

	private MovieListServiceAsync movieListService = GWT
			.create(MovieListService.class);

	/**
	 * Create all the panels / widgets here :
	 */
	private List<String> movieTitleList = new ArrayList<String>();
	private VerticalPanel verticalPanel = new VerticalPanel();
	private SplitLayoutPanel splitLayoutPanel = new SplitLayoutPanel();
	private TabLayoutPanel tabLayoutPanel = new TabLayoutPanel(3, Unit.EM);
	private FlexTable movieFlexTable = new FlexTable();
	private HorizontalPanel horizontalPanel = new HorizontalPanel();
	private ListBox listBox = new ListBox();
	private TextBox textBox = new TextBox();
	MultiWordSuggestOracle oracle = new MultiWordSuggestOracle();
	private Button addMovieButton = new Button("Add Movie");
	private Button showVizButton = new Button("Show Viz");
	private int rowIndex = 1;
	private MovieHttpClient movieHttpClient = null;
	public int COLUMN_INDEX_ZERO = 0;
	public int COLUMN_INDEX_ONE = 1;
	public int COLUMN_INDEX_THREE = 2;
	public String DOT = ".";
	public String DEFAULT_CATEGORY = "wishlist";
	public String MOVIE_IMAGE_LIST = "";
	public SuggestBox suggestBox;
	Movie[]  movieObject;
	public String imgURL = "#";
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		// updateMovieList();
		 updateMovieSlider();
		
		  // Listen for mouse events on the Add button.
		  addMovieButton.addClickHandler(new ClickHandler() { public void
		  onClick(ClickEvent event) { addMovieToList();updateMovieSlider(); } });
		  
		  // Listen for keyboard events in the input box.
//		  textBox.addKeyPressHandler(new KeyPressHandler() { public void
//		  onKeyPress(KeyPressEvent event) { if (event.getCharCode() ==
//		  KeyCodes.KEY_ENTER) { addMovieToList();updateMovieSlider(); } } });
//		 
		 // RootPanel.get("addButton").add(addMovieButton);
		 // RootPanel.get("textBox").add(textBox);
		
		  suggestBox = new SuggestBox(oracle);
		  suggestBox.ensureDebugId("cwSuggestBox");
		  suggestBox.setText("   Search Movie Name Here ....");
		  RootPanel.get("textBox").add(suggestBox);
		  suggestBox.addValueChangeHandler(new ValueChangeHandler<String>() {
		  
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				// TODO Auto-generated method stub
				//Window.alert("Here be the new value:" + event.getValue());
			}
		    });	
		  
		  
		  showVizButton.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					// TODO Auto-generated method stub
					
					//Window.alert(suggestBox.getText());
					updateMovieBubbles(suggestBox.getText());
					//updateMovieSlider();
				}
			});
			
		  RootPanel.get("addButton").add(showVizButton);
		  
		 

		
		//final Button button = new Button("Click me");
		// movieFlexTable.setHTML(0, 1, "<h2>My Movie List</h2>");

		//System.out.println("MOVIE_IMAGE_LIST before setting html" +MOVIE_IMAGE_LIST);
		//RootPanel.get("foo2").add(new HTML(MOVIE_IMAGE_LIST));
		/*
		 * final Button button = new Button("Click me");
		 * 
		 * RootPanel.get("slot1").add(button);
		 *//**
		 * Add elements to Horizontal Panel
		 */
		/*
		 * horizontalPanel.add(textBox); horizontalPanel.add(addMovieButton);
		 *//**
		 * Set the Movie list panel TODO This is just mock up: We need to
		 * actually either get data from file or database. Also need to add
		 * actions/events to add/delete/ etc It should be scrollable panel
		 */
		/*
		 * movieFlexTable.setHTML(0, 1, "<h2>My Movie List</h2>");
		 *//**
		 * Add Horizontal and Flextable to vertical
		 */
		/*
		 * verticalPanel.add(movieFlexTable);
		 * verticalPanel.add(horizontalPanel);
		 *//**
		 * Build the TAB Panel Just creating place holders Idea is to have
		 * the widget in each of the Tabs upon selection/clicking/hovering on
		 * the Movie in the List on the left panel.
		 */
		/*
		 * tabLayoutPanel.add(new HTML("Widget1 "), "Netflix");
		 * tabLayoutPanel.add(new HTML("Widget2 "), "IBMDB");
		 * tabLayoutPanel.add(new HTML("Widget3 "), "Rotten-Tomatoes");
		 * tabLayoutPanel.add(new HTML("Widget4 "), "Customized");
		 * tabLayoutPanel.add(new HTML("Widget5 "), "Details");
		 *//**
		 * This is the Slit Panel which will have a flexible left panel and
		 * we can add the TAB panel in the North of Split panel. Also add the
		 * vertical panel.
		 */
		/*
		 * splitLayoutPanel.addWest(verticalPanel, 128);
		 * splitLayoutPanel.addNorth(tabLayoutPanel, 350);
		 *//**
		 * Get Root Panel If we need more point for attachment , create <div>
		 * with Id in Movie_mash_up.html we can directly reference them
		 */
		/*
		 * RootLayoutPanel rp = RootLayoutPanel.get(); rp.add(splitLayoutPanel);
		 * updateMovieList();
		 *//**
		 * This is the client that can be used to make http Get calls and
		 * consume the Response. For now it is only JSON. F
		 */
		  
		  movieHttpClient = new MovieHttpClient();
		/*
		 * 
		 * movieHttpClient.movieHttpGet(null);
		 *//**
		 * This is just for testing. TODO : when we add listeners to "add" we
		 * can call this API.
		 */
		/*
		 * // Listen for mouse events on the Add button.
		 * addMovieButton.addClickHandler(new ClickHandler() { public void
		 * onClick(ClickEvent event) { addMovieToList(); } });
		 * 
		 * // Listen for keyboard events in the input box.
		 * textBox.addKeyPressHandler(new KeyPressHandler() { public void
		 * onKeyPress(KeyPressEvent event) { if (event.getCharCode() ==
		 * KeyCodes.KEY_ENTER) { addMovieToList(); } } });
		 */

	}

	/**
	 * Add Movie to the list TODO When the user enters the name of the movie and
	 * selects the category , build the Movie Object and pass it to this API.
	 */
	private void addMovieToList() {

		final String movieTitle = textBox.getText().toUpperCase().trim();
		textBox.setFocus(true);
		movieHttpClient.movieHttpGet("http://www.imdb.com/title/tt0120338/reviews", MovieConstants.IMDB_MOVIE_ORIGIN_CODE);

		/**
		 * Only if User has Entered the Text & the movie is not already present
		 */
		if (movieTitle == null || movieTitle.isEmpty()
				|| movieTitle.length() < 1
				|| movieTitleList.contains(movieTitle)) {
			return;
		}

		textBox.setText("");
		Movie movie = new Movie();
		movie.setTitle(movieTitle);
		movie.setCategory(DEFAULT_CATEGORY); // TODO Context menu / pop up to
												// let user choose his category
		// Initialize the service proxy.
		if (movieListService == null) {
			movieListService = GWT.create(MovieListService.class);
		}

		// Set up the callback object.
		AsyncCallback<Void> callback = new AsyncCallback<Void>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				updateMovieList();
			}

			@Override
			public void onSuccess(Void result) {
				// TODO Auto-generated method stub
				updateMovieList();

			}
		};
		movieListService.addMovieTolist(movie, callback);
	}
	
	
	
	private void updateMovieBubbles(final String movieName) {

		 RootPanel.get("loading").setVisible(true);

		 
		 
		 
				for (Movie movie : movieObject) {

					if (movie != null) {

						/**
						 * compare movie title
						 */
						if (movieName.equals(movie.getTitle())) {
							//Window.alert(movieName);
							RootPanel.get("imdb_star").getElement().setInnerHTML(movie.getImbd_avg().toString());
							RootPanel.get("amazon_star").getElement().setInnerHTML(movie.getAmazon_avg().toString());
							RootPanel.get("rt_star").getElement().setInnerHTML(movie.getRt_avg().toString());
							RootPanel.get("star_big").getElement().setInnerHTML(movie.getOver_all_avg().toString());
							
							RootPanel.get("overall_rating").getElement().setInnerHTML(movie.getOver_all_avg().toString()+" / 5");
							RootPanel.get("total_votes").getElement().setInnerHTML(movie.getOver_all_total());
							RootPanel.get("movie_name").getElement().setInnerHTML(movie.getTitle());
							
						
							Map<Integer, Float> overAllRatingPercentageMap = movie.getOver_all_rating_percentage_map();
							
							
							System.out.println("star_5 map : "+overAllRatingPercentageMap.get(5));
							System.out.println("star_4 map : "+overAllRatingPercentageMap.get(4));
							System.out.println("star_3 map : "+overAllRatingPercentageMap.get(3));
							System.out.println("star_2 map : "+overAllRatingPercentageMap.get(2));
							System.out.println("star_1 map : "+overAllRatingPercentageMap.get(1));
							
							
							
							RootPanel.get("star_5").getElement().setInnerHTML(overAllRatingPercentageMap.get(5).toString().replace(".0", "%"));
							RootPanel.get("star_4").getElement().setInnerHTML(overAllRatingPercentageMap.get(4).toString().replace(".0", "%"));
							RootPanel.get("star_3").getElement().setInnerHTML(overAllRatingPercentageMap.get(3).toString().replace(".0", "%"));
							RootPanel.get("star_2").getElement().setInnerHTML(overAllRatingPercentageMap.get(2).toString().replace(".0", "%"));
							RootPanel.get("star_1").getElement().setInnerHTML(overAllRatingPercentageMap.get(1).toString().replace(".0", "%"));
							
							RootPanel.get("amazon_total").getElement().setInnerHTML(movie.getAmazon_total().toString());
							RootPanel.get("rt_total").getElement().setInnerHTML(movie.getRt_total().toString());
							RootPanel.get("imdb_total").getElement().setInnerHTML(movie.getImdb_total().toString());
							
							
							Map<Integer, Integer> overAllRatingMap = movie.getOver_all_rating_map();
							RootPanel.get("star_5_votes").getElement().setInnerHTML(overAllRatingMap.get(5).toString()+" Votes");
							RootPanel.get("star_4_votes").getElement().setInnerHTML(overAllRatingMap.get(4).toString()+" Votes");
							RootPanel.get("star_3_votes").getElement().setInnerHTML(overAllRatingMap.get(3).toString()+" Votes");
							RootPanel.get("star_2_votes").getElement().setInnerHTML(overAllRatingMap.get(2).toString()+" Votes");
							RootPanel.get("star_1_votes").getElement().setInnerHTML(overAllRatingMap.get(1).toString()+" Votes");
							
							
							/* IMDB Percentage Mapping */
							Map<Integer, Float> imdbRatingPercentageMap = movie.getImdb_rating_percentage_map();
							RootPanel.get("imdb_5").getElement().setInnerHTML(imdbRatingPercentageMap.get(5).toString());
							RootPanel.get("imdb_4").getElement().setInnerHTML(imdbRatingPercentageMap.get(4).toString());
							RootPanel.get("imdb_3").getElement().setInnerHTML(imdbRatingPercentageMap.get(3).toString());
							RootPanel.get("imdb_2").getElement().setInnerHTML(imdbRatingPercentageMap.get(2).toString());
							RootPanel.get("imdb_1").getElement().setInnerHTML(imdbRatingPercentageMap.get(1).toString());
							
							Map<Integer, Integer> imdbRatingPercentageHueMap = movie.getImdb_rating_perecnentage_hue_map();

							RootPanel.get("imdb_5_h").getElement().setInnerHTML(imdbRatingPercentageHueMap.get(5).toString());
							RootPanel.get("imdb_4_h").getElement().setInnerHTML(imdbRatingPercentageHueMap.get(4).toString());
							RootPanel.get("imdb_3_h").getElement().setInnerHTML(imdbRatingPercentageHueMap.get(3).toString());
							RootPanel.get("imdb_2_h").getElement().setInnerHTML(imdbRatingPercentageHueMap.get(2).toString());
							RootPanel.get("imdb_1_h").getElement().setInnerHTML(imdbRatingPercentageHueMap.get(1).toString());

							/*Amazon Percentage Mapping */
							Map<Integer, Float> amazonRatingPercentageMap = movie.getAmazon_rating_percentage_map();
							RootPanel.get("amazon_5").getElement().setInnerHTML(amazonRatingPercentageMap.get(5).toString());
							RootPanel.get("amazon_4").getElement().setInnerHTML(amazonRatingPercentageMap.get(4).toString());
							RootPanel.get("amazon_3").getElement().setInnerHTML(amazonRatingPercentageMap.get(3).toString());
							RootPanel.get("amazon_2").getElement().setInnerHTML(amazonRatingPercentageMap.get(2).toString());
							RootPanel.get("amazon_1").getElement().setInnerHTML(amazonRatingPercentageMap.get(1).toString());
							
							Map<Integer, Integer> amazonRatingPercentageHueMap = movie.getAmazon_rating_percentage_hue_map();
							RootPanel.get("amazon_5_h").getElement().setInnerHTML(amazonRatingPercentageHueMap.get(5).toString());
							RootPanel.get("amazon_4_h").getElement().setInnerHTML(amazonRatingPercentageHueMap.get(4).toString());
							RootPanel.get("amazon_3_h").getElement().setInnerHTML(amazonRatingPercentageHueMap.get(3).toString());
							RootPanel.get("amazon_2_h").getElement().setInnerHTML(amazonRatingPercentageHueMap.get(2).toString());
							RootPanel.get("amazon_1_h").getElement().setInnerHTML(amazonRatingPercentageHueMap.get(1).toString());

							/*Rotten Percentage Mapping */
							Map<Integer, Float> rottenRatingPercentageMap = movie.getRt_rating_percentage_map();
							RootPanel.get("rt_5").getElement().setInnerHTML(rottenRatingPercentageMap.get(5).toString());
							RootPanel.get("rt_4").getElement().setInnerHTML(rottenRatingPercentageMap.get(4).toString());
							RootPanel.get("rt_3").getElement().setInnerHTML(rottenRatingPercentageMap.get(3).toString());
							RootPanel.get("rt_2").getElement().setInnerHTML(rottenRatingPercentageMap.get(2).toString());
							RootPanel.get("rt_1").getElement().setInnerHTML(rottenRatingPercentageMap.get(1).toString());

							Map<Integer, Integer> rottenRatingPercentageHueMap = movie.getAmazon_rating_percentage_hue_map();
							RootPanel.get("rt_5_h").getElement().setInnerHTML(rottenRatingPercentageHueMap.get(5).toString());
							RootPanel.get("rt_4_h").getElement().setInnerHTML(rottenRatingPercentageHueMap.get(4).toString());
							RootPanel.get("rt_3_h").getElement().setInnerHTML(rottenRatingPercentageHueMap.get(3).toString());
							RootPanel.get("rt_2_h").getElement().setInnerHTML(rottenRatingPercentageHueMap.get(2).toString());
							RootPanel.get("rt_1_h").getElement().setInnerHTML(rottenRatingPercentageHueMap.get(1).toString());

							Map <String,Integer> imdbWordPosMap = movie.getImbd_positive();
							Iterator<String> iterator = imdbWordPosMap.keySet().iterator();
							
							
							
							
							int imdbPosSum = 0;
							while (iterator.hasNext()) {
								String key = iterator.next().toString();
								imdbPosSum += imdbWordPosMap.get(key);
								 
							}
							System.out.println(" imdbPosSum: "+imdbPosSum);
							iterator = imdbWordPosMap.keySet().iterator();
							int imdbPosCount = 0;
							while (iterator.hasNext()) {
								String key = iterator.next().toString();
								Integer value = imdbWordPosMap.get(key);
								System.out.println("value  : "+value);
								float value1 = value * 100 / imdbPosSum;
								
								switch(imdbPosCount){
									case 0 : 
											 RootPanel.get("imdb_p_word_1").getElement().setInnerHTML(key);
											 
											 
											 RootPanel.get("imdb_p_word_1_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
											 break;
									case 1 : 
										 RootPanel.get("imdb_p_word_2").getElement().setInnerHTML(key);
										 
										 RootPanel.get("imdb_p_word_2_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 2 : 
										 RootPanel.get("imdb_p_word_3").getElement().setInnerHTML(key);
										 
										 RootPanel.get("imdb_p_word_3_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 3 : 
										 RootPanel.get("imdb_p_word_4").getElement().setInnerHTML(key);
										 
										 RootPanel.get("imdb_p_word_4_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 4 : 
										 RootPanel.get("imdb_p_word_5").getElement().setInnerHTML(key);
										 
										 RootPanel.get("imdb_p_word_5_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									 
								    default:
								    		break;
									
										
								}
								imdbPosCount++;
								System.out.println(key + " : " + value);
							}
							
							System.out.println("Reaching HERE ! ");
							Map <String,Integer> imdbWordNegMap = movie.getImdb_negative();
							Iterator<String> iterator2 = imdbWordNegMap.keySet().iterator();
							int imdbNegSum = 0;
							while (iterator2.hasNext()) {
								System.out.println(" inside loop imdbNegSum: "+imdbNegSum);
								String key = iterator2.next().toString();
								imdbNegSum += imdbWordNegMap.get(key);
								 
							}
							System.out.println(" imdbNegSum: "+imdbNegSum);
							iterator2 = imdbWordNegMap.keySet().iterator();
							int imdbNegCount = 0;
							while (iterator2.hasNext()) {
								String key = iterator2.next().toString();
								Integer value = imdbWordNegMap.get(key);
								float value1 = value * 100 / imdbNegSum;
								System.out.println("$$$$$$$### value1: "+value1);
								switch(imdbNegCount){
									case 0 : 
											 RootPanel.get("imdb_n_word_1").getElement().setInnerHTML(key);
											 System.out.println("$$$$$$$ value1: "+Float.valueOf(value1).toString());
											 RootPanel.get("imdb_n_word_1_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
											 break;
									case 1 : 
										 RootPanel.get("imdb_n_word_2").getElement().setInnerHTML(key);
										 
										 RootPanel.get("imdb_n_word_2_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 2 : 
										 RootPanel.get("imdb_n_word_3").getElement().setInnerHTML(key);
										 
										 RootPanel.get("imdb_n_word_3_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 3 : 
										 RootPanel.get("imdb_n_word_4").getElement().setInnerHTML(key);
										 
										 RootPanel.get("imdb_n_word_4_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 4 : 
										 RootPanel.get("imdb_n_word_5").getElement().setInnerHTML(key);
										 
										 RootPanel.get("imdb_n_word_5_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									 
								    default:
								    		break;
									
										
								}
								imdbNegCount++;
								System.out.println(key + " : " + value1);
							}
							
							Map <String,Integer> rtWordPosMap = movie.getRt_positive();
							iterator = rtWordPosMap.keySet().iterator();
							
							
							int rtPosSum = 0;
							while (iterator.hasNext()) {
								String key = iterator.next().toString();
								rtPosSum += rtWordPosMap.get(key);
								 
							}
							iterator = rtWordPosMap.keySet().iterator();
							
							
							int rtPosCount = 0;
							while (iterator.hasNext()) {
								String key = iterator.next().toString();
								Integer value = rtWordPosMap.get(key);
								float value1 = value * 100 / rtPosSum;
								
								switch(rtPosCount){
									case 0 : 
											 RootPanel.get("rt_p_word_1").getElement().setInnerHTML(key);
											 
											 RootPanel.get("rt_p_word_1_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
											 break;
									case 1 : 
										 RootPanel.get("rt_p_word_2").getElement().setInnerHTML(key);
										 
										 RootPanel.get("rt_p_word_2_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 2 : 
										 RootPanel.get("rt_p_word_3").getElement().setInnerHTML(key);
										 
										 RootPanel.get("rt_p_word_3_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 3 : 
										 RootPanel.get("rt_p_word_4").getElement().setInnerHTML(key);
										 
										 RootPanel.get("rt_p_word_4_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 4 : 
										 RootPanel.get("rt_p_word_5").getElement().setInnerHTML(key);
										 
										 RootPanel.get("rt_p_word_5_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									 
								    default:
								    		break;
									
										
								}
								rtPosCount++;
								System.out.println(key + " : " + value1);
							}
							
							
							Map <String,Integer> rtWordNegMap = movie.getRt_negative();
							
							iterator = rtWordNegMap.keySet().iterator();
							int rtNegSum = 0;
							while (iterator.hasNext()) {
								String key = iterator.next().toString();
								rtNegSum += rtWordNegMap.get(key);
								 
							}
							
							
							iterator = rtWordNegMap.keySet().iterator();
							int rtNegCount = 0;
							while (iterator.hasNext()) {
								String key = iterator.next().toString();
								Integer value = rtWordNegMap.get(key);
								float value1 = value * 100 / rtNegSum;
								
								
								
								switch(rtNegCount){
									case 0 : 
											 RootPanel.get("rt_n_word_1").getElement().setInnerHTML(key);
											 
											 RootPanel.get("rt_n_word_1_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
											 break;
									case 1 : 
										 RootPanel.get("rt_n_word_2").getElement().setInnerHTML(key);
										 
										 RootPanel.get("rt_n_word_2_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 2 : 
										 RootPanel.get("rt_n_word_3").getElement().setInnerHTML(key);
										 
										 RootPanel.get("rt_n_word_3_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 3 : 
										 RootPanel.get("rt_n_word_4").getElement().setInnerHTML(key);
										 
										 RootPanel.get("rt_n_word_4_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 4 : 
										 RootPanel.get("rt_n_word_5").getElement().setInnerHTML(key);
										 
										 RootPanel.get("rt_n_word_5_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									 
								    default:
								    		break;
									
										
								}
								rtNegCount++;
								System.out.println(key + " : " + value);
							}
							
							
							
							Map <String,Integer> amazonWordPosMap = movie.getAmazon_positive();
							iterator = amazonWordPosMap.keySet().iterator();
							
							int amzonPosSum = 0;
							while (iterator.hasNext()) {
								String key = iterator.next().toString();
								amzonPosSum += amazonWordPosMap.get(key);
								 
							}
							iterator = amazonWordPosMap.keySet().iterator();
							int amazonPosCount = 0;
							while (iterator.hasNext()) {
								String key = iterator.next().toString();
								Integer value = amazonWordPosMap.get(key);
								float value1 = value * 100 / amzonPosSum;
								
								
								
								switch(amazonPosCount){
									case 0 : 
											 RootPanel.get("amazon_p_word_1").getElement().setInnerHTML(key);

											 RootPanel.get("amazon_p_word_1_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
											 break;
									case 1 : 
										 RootPanel.get("amazon_p_word_2").getElement().setInnerHTML(key);
										 RootPanel.get("amazon_p_word_2_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 2 : 
										 RootPanel.get("amazon_p_word_3").getElement().setInnerHTML(key);
										 RootPanel.get("amazon_p_word_3_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 3 : 
										 RootPanel.get("amazon_p_word_4").getElement().setInnerHTML(key);
										 RootPanel.get("amazon_p_word_4_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 4 : 
										 RootPanel.get("amazon_p_word_5").getElement().setInnerHTML(key);
										 RootPanel.get("amazon_p_word_5_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									 
								    default:
								    		break;
									
										
								}
								amazonPosCount++;
								System.out.println(key + " : " + value);
							}
							
							
							Map <String,Integer> amazonWordNegMap = movie.getAmazon_negative();
							iterator = amazonWordNegMap.keySet().iterator();
							int amzonNegSum = 0;
							while (iterator.hasNext()) {
								String key = iterator.next().toString();
								amzonNegSum += amazonWordNegMap.get(key);
								 
							}
							int amazonNegCount = 0;
							while (iterator.hasNext()) {
								String key = iterator.next().toString();
								Integer value = amazonWordNegMap.get(key);
								float value1 = value * 100 / amzonNegSum;
								
								
								
								switch(amazonNegCount){
									case 0 : 
											 RootPanel.get("amazon_n_word_1").getElement().setInnerHTML(key);
											 RootPanel.get("amazon_n_word_1_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
											 break;
									case 1 : 
										 RootPanel.get("amazon_n_word_2").getElement().setInnerHTML(key);
										 RootPanel.get("amazon_n_word_2_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 2 : 
										 RootPanel.get("amazon_n_word_3").getElement().setInnerHTML(key);
										 RootPanel.get("amazon_n_word_3_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 3 : 
										 RootPanel.get("amazon_n_word_4").getElement().setInnerHTML(key);
										 RootPanel.get("amazon_n_word_4_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									case 4 : 
										 RootPanel.get("amazon_n_word_5").getElement().setInnerHTML(key);
										 RootPanel.get("amazon_n_word_5_f").getElement().setInnerHTML(Float.valueOf(value1).toString());
										 break;
									 
								    default:
								    		break;
									
										
								}
								amazonNegCount++;
								System.out.println(key + " : " + value);
							}
							
							
							 RootPanel.get("loading").setVisible(false);

							
//							System.out.println("imdb_5 map : "+imdbRatingPercentageMap.get(5));
//							System.out.println("imdb_4 map : "+imdbRatingPercentageMap.get(4));
//							System.out.println("imdb_3 map : "+imdbRatingPercentageMap.get(3));
//							System.out.println("imdb_2 map : "+imdbRatingPercentageMap.get(2));
//							System.out.println("imdb_1 map : "+imdbRatingPercentageMap.get(1));
//							
						}
					}
				}
				
		
		
		
	}

	private void updateMovieSlider() {

		// Initialize the service proxy.
		if (movieListService == null) {
			movieListService = GWT.create(MovieListService.class);
		}

		// Set up the callback object.
		AsyncCallback<Movie[]> callback = new AsyncCallback<Movie[]>() {
			public void onFailure(Throwable caught) {
				// TODO: Do something with errors.

			}

			@Override
			public void onSuccess(Movie[] result) {
				movieObject = result;
				// TODO Auto-generated method stub
				for (Movie movie : result) {

					if (movie != null) {

						/**
						 * No Duplicates (ID by Title)
						 */
						if (!movieTitleList.contains(movie.getTitle())) {
							movieTitleList.add(movie.getTitle());
							oracle.add(movie.getTitle());
							
							
							
							imgURL = movie.getImdb_poster();
							
							
							String MOVIE_IMAGE_LIST = "<img src=" + imgURL.toString() + " alt= '"
									+ movie.getTitle() + " ' name= '"
											+ movie.getTitle()
									+ "' width='140' height='140' />";
							
							//System.out.println("MOVIE_IMAGE_LIST"+MOVIE_IMAGE_LIST);
							imgURL = imgURL.replace('"', ' ');
							//System.out.println("\n img URL : "+imgURL);
							//System.out.println("\n img URL to String  : "+imgURL.toString());
							Image newImage = new Image(imgURL);
							newImage.setTitle(movie.getTitle());
							newImage.setAltText(movie.getTitle());
							
							/*newImage.addClickHandler(new ClickHandler() {
								
								@Override
								public void onClick(ClickEvent event) {
									// TODO Auto-generated method stub
									
									//Window.alert(suggestBox.getText());
									updateMovieBubbles(suggestBox.getText());
									//updateMovieSlider();
								}
							});
							*/
							
							RootPanel.get("foo1").add(newImage);
							
							
//							System.out.println("movie title :"+movie.getTitle());
//							listBox.addItem(movie.getTitle());
//							RootPanel.get("imdb_star").getElement().setInnerHTML(movie.getImbd_avg().toString());
//							RootPanel.get("amazon_star").getElement().setInnerHTML(movie.getAmazon_avg().toString());
//
//							//RootPanel.get("imdb_5").getElement().setInnerHTML(movie.getImdb_rating_percentage_map().get(5).toString());
//							
//							//RootPanel.get("amazon_4").getElement().setInnerHTML(movie.getAmazon_avg().toString());
//							RootPanel.get("amazon_4").getElement().setInnerText("33.333");
//							RootPanel.get("amazon_4_h").getElement().setInnerText("100");
//								
//							RootPanel.get("star_5").getElement().setInnerText("90%");
							
							
							  
							  
							
							
							
							
					/*		movieHttpClient = new MovieHttpClient();
							String movieTitle = movie.getTitle();
							String imgURL = movieHttpClient
									.movieImgHttpGet(movie.getTitle());
							System.out.println("imgURL"+imgURL);
//							MOVIE_IMAGE_LIST = "<img src=" + imgURL + " alt="
//									+ movieTitle
//									+ " width='140' height='140' />";
//							
//							System.out.println("MOVIE_IMAGE_LIST"+MOVIE_IMAGE_LIST);
//							RootPanel.get("imdb_star").add(new HTML(MOVIE_IMAGE_LIST));
							
							movieFlexTable.setHTML(rowIndex, COLUMN_INDEX_ZERO,
									rowIndex + DOT);
							movieFlexTable.setHTML(rowIndex, COLUMN_INDEX_ONE,
									"<h4>" + movie.getTitle() + "<h4>");
							movieFlexTable.setHTML(rowIndex,
									COLUMN_INDEX_THREE,
									"<h4>" + movie.getCategory() + "<h4>");

							rowIndex++;
							
							*/
						}
					}
				}

			}
		};

		RootPanel.get("loading").setVisible(false);
		
		// Make the call to the movie list service.
		movieListService.getMovieList(callback);

	}

	/**
	 * To Get Movie list from server & also to refresh in future. TODO : Now we
	 * hard coding the index of the movie, we can use variable to keep track of
	 * the list of movies. We are now actually loading data from server , the
	 * fourth entry is read from the result of aysnc call made to getMovieList()
	 */
	private void updateMovieList() {
		// Initialize the service proxy.
		if (movieListService == null) {
			movieListService = GWT.create(MovieListService.class);
		}

		// Set up the callback object.
		AsyncCallback<Movie[]> callback = new AsyncCallback<Movie[]>() {
			public void onFailure(Throwable caught) {
				// TODO: Do something with errors.
				movieFlexTable.setHTML(rowIndex, COLUMN_INDEX_ONE,
						"Loading ...");
				movieFlexTable.setHTML(rowIndex, COLUMN_INDEX_ZERO, "");
			}

			@Override
			public void onSuccess(Movie[] result) {
				// TODO Auto-generated method stub
				for (Movie movie : result) {

					if (movie != null) {

						/**
						 * No Duplicates (ID by Title)
						 */
						if (!movieTitleList.contains(movie.getTitle())) {
							movieTitleList.add(movie.getTitle());

							movieFlexTable.setHTML(rowIndex, COLUMN_INDEX_ZERO,
									rowIndex + DOT);
							movieFlexTable.setHTML(rowIndex, COLUMN_INDEX_ONE,
									"<h4>" + movie.getTitle() + "<h4>");
							movieFlexTable.setHTML(rowIndex,
									COLUMN_INDEX_THREE,
									"<h4>" + movie.getCategory() + "<h4>");

							rowIndex++;
						}
					}
				}

			}
		};

		// Make the call to the movie list service.
		movieListService.getMovieList(callback);
	}
}
