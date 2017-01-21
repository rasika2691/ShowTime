package io.rasika.ShowTime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.rasika.ShowTime.entity.UserRating;
import io.rasika.ShowTime.repository.UserRatingRepository;
@Service
public class UserRatingServiceImpl implements UserRatingService {

	@Autowired
	private UserRatingRepository repository;
	@Override
	public List<UserRating> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public UserRating create(UserRating UserRat) {
		// TODO Auto-generated method stub
		return repository.create(UserRat);
	}

	

}
