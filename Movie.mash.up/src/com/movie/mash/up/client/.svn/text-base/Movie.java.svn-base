package com.movie.mash.up.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.datanucleus.util.MathUtils;

/**
 * This class would be the placeholder for the movie. To start with we can have
 * a title and a category like "to be watched" , we can make this field as Enum.
 * 
 * @author anil
 * 
 */

public class Movie implements Serializable {

	private String title;
	private String category;
	
	/**
	 * ####IMDB#####
	 */
	private String imdb_title;
	private String imdb_id;
	private String imdb_rating;
	private String imdb_Votes;
	private String imdb_poster;
	private Float imbd_avg = (float)0.0;
	private String imdb_total;
	
	private Map<String, Integer> imbd_positive;
	private Map<String, Integer> imdb_neutral;
	private Map<String, Integer> imdb_negative;
	private Map<Integer, Integer> imbd_rating_map;
	private Map<Integer,Float> imdb_rating_percentage_map;
	

	private Map<Integer,Integer> imdb_rating_perecnentage_hue_map;

	/**
	 * #####ROTTEN-TOMATOES######
	 */
	private String rt_id;
	private String rt_tomatoMeter;
	private String rt_tomatoRating;
	private String rt_tomatoFresh;
	private String rt_audience_rating;
	private String rt_critics_ratings;
	
	private Map<String, Integer> rt_positive;
	private Map<String, Integer> rt_neutral;
	private Map<String, Integer> rt_negative;
	
	private Map<Integer, Integer> rt_rating_map;
	private Float rt_avg = (float)0.0;
	private String rt_total ;
	private Map<Integer,Float> rt_rating_percentage_map;
	private Map<Integer,Integer> rt_rating_percentage_hue_map;

	private String RT_poster;
	
	/**
	 * ####AMAZON#####
	 */
	private Map<String, Integer> amazon_neutral;
	private Map<String, Integer> amazon_negative;
	private Map<Integer, Integer> amazon_rating_map;
	
	private Float amazon_avg = (float) 0.0;
	private String amazon_total;
	private Map<Integer,Float> amazon_rating_percentage_map;
	private Map<Integer,Integer> amazon_rating_percentage_hue_map;

	
	/**
	 * 
	 * ####OVERALL##### 
	 */
	
	private Float over_all_avg = (float)0.0;
	private String over_all_total;
	private Map<Integer, Integer> over_all_rating_map;
	private Map<Integer,Float> over_all_rating_percentage_map;
	private Map<Integer,Integer> over_all_rating_percentage_hue_map;
	private Map<String, Integer> amazon_positive;
	public Movie(){
		initialize();
	}
	
	private void initialize() {
		// TODO Auto-generated method stub
		imdb_rating_percentage_map = new  HashMap<Integer,Float>();
		rt_rating_percentage_map = new  HashMap<Integer,Float>();
		amazon_rating_percentage_map = new  HashMap<Integer,Float>();
		over_all_rating_percentage_map = new  HashMap<Integer,Float>();
		over_all_rating_map = new HashMap<Integer,Integer>();
		amazon_rating_percentage_hue_map = new HashMap<Integer,Integer>();
		imdb_rating_perecnentage_hue_map = new HashMap<Integer,Integer>();
		rt_rating_percentage_hue_map = new HashMap<Integer,Integer>();
		over_all_rating_percentage_hue_map = new HashMap<Integer,Integer>();



	}

	public Float getImbd_avg() {
		return imbd_avg;
	}

	public void setImbd_avg(Float imbd_avg) {
		this.imbd_avg = imbd_avg;
	}

	public String getImdb_total() {
		return imdb_total;
	}

	public void setImdb_total(String imdb_total) {
		this.imdb_total = imdb_total;
	}

	public Map<Integer, Integer> getImbd_rating_map() {
		return imbd_rating_map;
	}

	public void setImbd_rating_map(Map<Integer, Integer> imbd_rating_map) {
		this.imbd_rating_map = imbd_rating_map;
	}

	public Map<Integer, Float> getImdb_rating_percentage_map() {
		return imdb_rating_percentage_map;
	}

	public void setImdb_rating_percentage_map(
			Map<Integer, Float> imdb_rating_percentage_map) {
		this.imdb_rating_percentage_map = imdb_rating_percentage_map;
	}

	public Map<Integer, Integer> getRt_rating_map() {
		return rt_rating_map;
	}

	public void setRt_rating_map(Map<Integer, Integer> rt_rating_map) {
		this.rt_rating_map = rt_rating_map;
	}

	public Float getRt_avg() {
		return rt_avg;
	}

	public void setRt_avg(Float rt_avg) {
		this.rt_avg = rt_avg;
	}

	public String getRt_total() {
		return rt_total;
	}

	public void setRt_total(String rt_total) {
		this.rt_total = rt_total;
	}

	public Map<Integer, Float> getRt_rating_percentage_map() {
		return rt_rating_percentage_map;
	}

	public void setRt_rating_percentage_map(
			Map<Integer, Float> rt_rating_percentage_map) {
		this.rt_rating_percentage_map = rt_rating_percentage_map;
	}

	public Map<String, Integer> getAmazon_positive() {
		return amazon_positive;
	}

	public void setAmazon_positive(Map<String, Integer> amazon_positive) {
		this.amazon_positive = amazon_positive;
	}

	public Map<String, Integer> getAmazon_neutral() {
		return amazon_neutral;
	}

	public void setAmazon_neutral(Map<String, Integer> amazon_neutral) {
		this.amazon_neutral = amazon_neutral;
	}

	public Map<String, Integer> getAmazon_negative() {
		return amazon_negative;
	}

	public void setAmazon_negative(Map<String, Integer> amazon_negative) {
		this.amazon_negative = amazon_negative;
	}

	public Map<Integer, Integer> getAmazon_rating_map() {
		return amazon_rating_map;
	}

	public void setAmazon_rating_map(Map<Integer, Integer> amazon_rating_map) {
		this.amazon_rating_map = amazon_rating_map;
	}

	public Float getAmazon_avg() {
		return amazon_avg;
	}

	public void setAmazon_avg(Float amazon_avg) {
		this.amazon_avg = amazon_avg;
	}

	public String getAmazon_total() {
		return amazon_total;
	}

	public void setAmazon_total(String amazon_total) {
		this.amazon_total = amazon_total;
	}

	public Map<Integer, Float> getAmazon_rating_percentage_map() {
		return amazon_rating_percentage_map;
	}

	public void setAmazon_rating_percentage_map(
			Map<Integer, Float> amazon_rating_percentage_map) {
		this.amazon_rating_percentage_map = amazon_rating_percentage_map;
	}

	public Float getOver_all_avg() {
		return over_all_avg;
	}

	public void setOver_all_avg(Float over_all_avg) {
		this.over_all_avg = over_all_avg;
	}

	public String getOver_all_total() {
		return over_all_total;
	}

	public void setOver_all_total(String over_all_total) {
		this.over_all_total = over_all_total;
	}

	public Map<Integer, Integer> getOver_all_rating_map() {
		return over_all_rating_map;
	}

	public void setOver_all_rating_map(Map<Integer, Integer> over_all_rating_map) {
		this.over_all_rating_map = over_all_rating_map;
	}

	public Map<Integer, Float> getOver_all_rating_percentage_map() {
		return over_all_rating_percentage_map;
	}

	public void setOver_all_rating_percentage_map(
			Map<Integer, Float> over_all_rating_percentage_map) {
		this.over_all_rating_percentage_map = over_all_rating_percentage_map;
	}

	
	public String getRt_tomatoMeter() {
		return rt_tomatoMeter;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}
	public String getImdb_poster() {
		return imdb_poster;
	}

	public void setImdb_poster(String imdb_poster) {
		this.imdb_poster = imdb_poster;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getImdb_title() {
		return imdb_title;
	}

	public void setImdb_title(String imdb_title) {
		this.imdb_title = imdb_title;
	}

	public String getImdb_id() {
		return imdb_id;
	}

	public void setImdb_id(String imdb_id) {
		this.imdb_id = imdb_id;
	}

	public String getImdb_rating() {
		return imdb_rating;
	}

	public void setImdb_rating(String imdb_rating) {
		this.imdb_rating = imdb_rating;
	}

	public String getImdb_Votes() {
		return imdb_Votes;
	}

	public void setImdb_Votes(String imdb_Votes) {
		this.imdb_Votes = imdb_Votes;
	}

	public Map<String, Integer> getImbd_positive() {
		return imbd_positive;
	}

	public void setImbd_positive(Map<String, Integer> imbd_positive) {
		this.imbd_positive = imbd_positive;
	}

	public Map<String, Integer> getImdb_neutral() {
		return imdb_neutral;
	}

	public void setImdb_neutral(Map<String, Integer> imdb_neutral) {
		this.imdb_neutral = imdb_neutral;
	}

	public Map<String, Integer> getImdb_negative() {
		return imdb_negative;
	}

	public void setImdb_negative(Map<String, Integer> imdb_negative) {
		this.imdb_negative = imdb_negative;
	}

	public String getRt_id() {
		return rt_id;
	}
	public void setRt_tomatoMeter(String rt_tomatoMeter) {
		this.rt_tomatoMeter = rt_tomatoMeter;
	}

	public String getRt_tomatoRating() {
		return rt_tomatoRating;
	}

	public void setRt_tomatoRating(String rt_tomatoRating) {
		this.rt_tomatoRating = rt_tomatoRating;
	}

	public String getRt_tomatoFresh() {
		return rt_tomatoFresh;
	}

	public void setRt_tomatoFresh(String rt_tomatoFresh) {
		this.rt_tomatoFresh = rt_tomatoFresh;
	}

	public void setRt_id(String rt_id) {
		this.rt_id = rt_id;
	}

	public String getRt_audience_rating() {
		return rt_audience_rating;
	}

	public void setRt_audience_rating(String rt_audience_rating) {
		this.rt_audience_rating = rt_audience_rating;
	}

	public String getRt_critics_ratings() {
		return rt_critics_ratings;
	}

	public void setRt_critics_ratings(String rt_critics_ratings) {
		this.rt_critics_ratings = rt_critics_ratings;
	}

	public Map<String, Integer> getRt_positive() {
		return rt_positive;
	}

	public void setRt_positive(Map<String, Integer> rt_positive) {
		this.rt_positive = rt_positive;
	}

	public Map<String, Integer> getRt_neutral() {
		return rt_neutral;
	}

	public void setRt_neutral(Map<String, Integer> rt_neutral) {
		this.rt_neutral = rt_neutral;
	}

	public Map<String, Integer> getRt_negative() {
		return rt_negative;
	}

	public void setRt_negative(Map<String, Integer> rt_negative) {
		this.rt_negative = rt_negative;
	}
	public Map<Integer, Integer> getImdb_rating_perecnentage_hue_map() {
		return imdb_rating_perecnentage_hue_map;
	}

	public void setImdb_rating_perecnentage_hue_map(
			Map<Integer, Integer> imdb_rating_perecnentage_hue_map) {
		this.imdb_rating_perecnentage_hue_map = imdb_rating_perecnentage_hue_map;
	}

	public Map<Integer, Integer> getRt_rating_percentage_hue_map() {
		return rt_rating_percentage_hue_map;
	}

	public void setRt_rating_percentage_hue_map(
			Map<Integer, Integer> rt_rating_percentage_hue_map) {
		this.rt_rating_percentage_hue_map = rt_rating_percentage_hue_map;
	}

	public String getRT_poster() {
		return RT_poster;
	}

	public void setRT_poster(String RT_poster) {
		this.RT_poster = RT_poster;
	}
	
	public Map<Integer, Integer> getAmazon_rating_percentage_hue_map() {
		return amazon_rating_percentage_hue_map;
	}

	public void setAmazon_rating_percentage_hue_map(
			Map<Integer, Integer> amazon_rating_percentage_hue_map) {
		this.amazon_rating_percentage_hue_map = amazon_rating_percentage_hue_map;
	}

	public Map<Integer, Integer> getOver_all_rating_percentage_hue_map() {
		return over_all_rating_percentage_hue_map;
	}

	public void setOver_all_rating_percentage_hue_map(
			Map<Integer, Integer> over_all_rating_percentage_hue_map) {
		this.over_all_rating_percentage_hue_map = over_all_rating_percentage_hue_map;
	}
	
	public void buildCalculatedFields()
	{
		buildImbdFields();
		buildRTFields();
		buildAmazonFields();
		buildOverAllFields();
		
	}

	private void buildOverAllFields() {
		// TODO Auto-generated method stub
		if(rt_rating_map == null || imbd_rating_map == null || amazon_rating_map == null){
			return;
		}
		setOver_all_avg((getAmazon_avg() + getImbd_avg() + getRt_avg())/3);
		Integer total = 0;
		for(int i=1;i <= 5 ;i++){
		 over_all_rating_map.put(i, (rt_rating_map.get(i) + imbd_rating_map.get(i) + amazon_rating_map.get(i)));
		 total+= over_all_rating_map.get(i);
		}
		for(int i=1;i <= 5 ;i++){
			float percentageRounded = ((rt_rating_percentage_map.get(i) + imdb_rating_percentage_map.get(i) + amazon_rating_percentage_map.get(i)))/3;
			percentageRounded = (float) (Math.round(percentageRounded * 1.0)/1.0);
			System.out.println("percentageRounded "+percentageRounded);
			 over_all_rating_percentage_map.put(i, percentageRounded);
			}
		Collection<Float> valuesAsCollection = over_all_rating_percentage_map.values();
		List<Float> toBeSorted = new ArrayList<Float>(valuesAsCollection);
		Collections.sort(toBeSorted);
		
		for(int i=1;i <= 5 ;i++){
			int j = returnKeyFromValue(over_all_rating_percentage_map, toBeSorted.get(i -1));
			if(j!= -1){
			over_all_rating_percentage_hue_map.put(j,i *20);
			}
		}
		over_all_avg =  (float) (Math.round(over_all_avg * 100.0)/100.0);
		
		setOver_all_total(total.toString());
		
		
	}

	private Integer returnKeyFromValue(Map<Integer,Float> map, Float value)
	{
		
		for(int i =1; i<=5 ;i++){
			if(map.get(i).equals(value)){
				return i;
			}
		}
		return -1;
	}
	private void buildRTFields() {
		// TODO Auto-generated method stub
		if(rt_rating_map == null){
			return;
		}
		Integer total = 0;
		for(int i=1;i <= 5 ;i++){
			total+=rt_rating_map.get(i);
		}
		for(int i=1;i <= 5 ;i++){
			Float percentage = (float) 0;
			if(total != 0)
			{
			 percentage = (float) (((float)rt_rating_map.get(i)/(float)total)*100);
			}
			rt_rating_percentage_map.put(i, percentage);
		}
		Float rt_average = (float)0;
		if(getRt_audience_rating() != null){
		rt_average = (float) (Float.parseFloat(getRt_audience_rating())/20);
		}
		Collection<Float> valuesAsCollection = rt_rating_percentage_map.values();
		List<Float> toBeSorted = new ArrayList<Float>(valuesAsCollection);
		Collections.sort(toBeSorted);
		
		for(int i=1;i <= 5 ;i++){
			int j = returnKeyFromValue(rt_rating_percentage_map, toBeSorted.get(i -1));
			if(j!= -1){
			rt_rating_percentage_hue_map.put(j,i *20);
			}
		}
		setRt_avg(rt_average);
		rt_average = (float) (Math.round(rt_average * 100.0)/100.0);
		setRt_total(total.toString());
	}

	private void buildAmazonFields() {
		// TODO Auto-generated method stub
		if(amazon_rating_map == null){
			return;
		}
		Integer total = 0;
		for(int i=1;i <= 5 ;i++){
			total+=amazon_rating_map.get(i);
		}
		for(int i=1;i <= 5 ;i++){
			Float percentage = (float) 0;
			if(total != 0)
			{
			 percentage = (float) (((float)amazon_rating_map.get(i)/(float)total)*100);
			}
			amazon_rating_percentage_map.put(i, percentage);
		}
		Collection<Float> valuesAsCollection = amazon_rating_percentage_map.values();
		List<Float> toBeSorted = new ArrayList<Float>(valuesAsCollection);
		Collections.sort(toBeSorted);
		
		for(int i=1;i <= 5 ;i++){
			int j = returnKeyFromValue(amazon_rating_percentage_map, toBeSorted.get(i -1));
			if(j!= -1){
			amazon_rating_percentage_hue_map.put(j,i *20);
			}
		}
		Float amazon_average = (float)0;
		amazon_average = getAmazon_avg();
		setAmazon_avg(amazon_average);
		amazon_average = (float) (Math.round(amazon_average * 100.0)/100.0);
		setAmazon_total(total.toString());
	}

	private void buildImbdFields() {
		// TODO Auto-generated method stub
		
		if(imbd_rating_map == null){
			return;
		}
		Integer total = 0;
		for(int i=1;i <= 5 ;i++){
			total+=imbd_rating_map.get(i);
		}
		for(int i=1;i <= 5 ;i++){
			Float percentage = (float) 0;
			if(total != 0)
			{
			 percentage = (float) (((float)imbd_rating_map.get(i)/(float)total)*100);
			}
			imdb_rating_percentage_map.put(i, percentage);
		}
		Collection<Float> valuesAsCollection = imdb_rating_percentage_map.values();
		List<Float> toBeSorted = new ArrayList<Float>(valuesAsCollection);
		Collections.sort(toBeSorted);
		
		for(int i=1;i <= 5 ;i++){
			int j = returnKeyFromValue(imdb_rating_percentage_map, toBeSorted.get(i - 1));
			if(j!= -1){
			imdb_rating_perecnentage_hue_map.put(j,i*20);
			}
		}
		Float imdb_average = (float)0;
		imdb_average = (float) (Float.parseFloat(getImdb_rating())/2);
		setImbd_avg(imdb_average);
		imdb_average = (float) (Math.round(imdb_average * 100.0)/100.0);
		setImdb_total(total.toString());
	}
	
}
