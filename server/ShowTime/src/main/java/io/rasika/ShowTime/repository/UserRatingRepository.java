package io.rasika.ShowTime.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.rasika.ShowTime.entity.UserRating;
@Repository
public interface UserRatingRepository {

	public List<UserRating> findAll();
	public UserRating create(UserRating UserRat);
	public UserRating update(String UserRatId,  UserRating UserRat);
	public void delete(String UserRatId);
}
