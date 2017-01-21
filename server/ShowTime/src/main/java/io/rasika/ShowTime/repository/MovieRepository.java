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
}
