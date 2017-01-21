package io.rasika.ShowTime.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.rasika.ShowTime.entity.Movie;
@Repository
public interface MovieRepository {

	public List<Movie> findAll();
	
	public Movie findOne(String mId);
	
	public Movie findByTitle(String title);
	
	public Movie create(Movie mv);
	
	public Movie update(Movie mv);
	
	public void delete(Movie mv);
	
    public List<Movie> findByType(String type);
	
	public List<Movie> findByYear(int year);
	
	public List<Movie> findByGenre(String genre);
	
	public List<Movie> sortByImdbRatings();
	
	public List<Movie> sortByYear();
	
	public List<Movie> sortByImdbVotes();
	
	public List<Movie> topRatedMovies();
	
	public List<Movie> topRatedSeries();
}
