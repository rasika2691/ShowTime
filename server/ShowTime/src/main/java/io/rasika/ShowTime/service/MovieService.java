package io.rasika.ShowTime.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.rasika.ShowTime.entity.Movie;
@Service
public interface MovieService {

	public List<Movie> findAll();
	
	public Movie findOne(String mId);
	
	public Movie create(Movie mv);
	
	public Movie update(String mId,  Movie mv);
	
	public void delete(String mId);
	
    public List<Movie> findByType(String type);
	
	public List<Movie> findByYear(int year);
	
	public List<Movie> findByGenre(String genre);
	
	public Movie findByTitle(String title);

	public List<Movie> sortByImdbRatings();
	
	public List<Movie> sortByYear();
	
	public List<Movie> sortByImdbVotes();
	
	public List<Movie> topRatedMovies();
	
	public List<Movie> topRatedSeries();
}
