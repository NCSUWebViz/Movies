/**
 * 
 */
package com.movie.mash.up.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author anil
 *
 */
@RemoteServiceRelativePath("movielist")
public interface MovieListService extends RemoteService {

	public void addMovieTolist(Movie movie);
	
	public Movie[] getMovieList();
}
