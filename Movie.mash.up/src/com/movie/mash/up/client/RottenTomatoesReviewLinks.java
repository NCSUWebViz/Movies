package com.movie.mash.up.client;

import com.google.gwt.core.client.JavaScriptObject;


public class RottenTomatoesReviewLinks extends JavaScriptObject {

	protected RottenTomatoesReviewLinks(){
		
	}
	
	public final native String getReviewLink()/*-{
		
		return this.review;
	}-*/;
}
