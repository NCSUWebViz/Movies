package com.movie.mash.up.client;

import com.google.gwt.core.client.JavaScriptObject;

public class RottenTomatoesMoviePoster extends JavaScriptObject {

	protected RottenTomatoesMoviePoster() {

	}

	public final native String getProfile() /*-{
		return this.profile;
	}-*/;
}
