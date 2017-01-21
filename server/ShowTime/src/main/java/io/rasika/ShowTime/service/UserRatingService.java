package io.rasika.ShowTime.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.rasika.ShowTime.entity.UserRating;
@Service
public interface UserRatingService {

	public List<UserRating> findAll();
	public UserRating create(UserRating UserRat);
	
}
