package io.rasika.ShowTime.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.rasika.ShowTime.entity.UserRating;
@Repository
public interface UserRatingRepository {

	public List<UserRating> findAll();
	
	public UserRating create(UserRating UserRat);
	
	public UserRating findOne(String id);
	
	public List<UserRating> findAllUserRatingsByMovieId(String id);
	
	public UserRating update(UserRating UserRat);
	
	public double findAvgUserRatingsByMovieId(String id);
	
	public void delete(UserRating UserRat);
}
