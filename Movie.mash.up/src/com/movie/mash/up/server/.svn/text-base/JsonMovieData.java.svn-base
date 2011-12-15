package com.movie.mash.up.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.movie.mash.up.client.Movie;

public class JsonMovieData extends  HttpServlet{
	
	

	  @Override
	  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	      throws ServletException, IOException {

	    PrintWriter out = resp.getWriter();
	    MovieListServiceImpl test = new MovieListServiceImpl();
	    Movie[] movieList = test.getMovieList();
	    Gson gson = new Gson();
	    String output = gson.toJson(movieList);
	    out.print(output);
	  }

}
