package io.rasika.ShowTime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.rasika.ShowTime.entity.UserRating;
import io.rasika.ShowTime.repository.UserRatingRepository;
@Service
@Transactional
public class UserRatingServiceImpl implements UserRatingService {

	@Autowired
	private UserRatingRepository repository;
	@Autowired
	private MovieService movieServcie;
	
	@Autowired
	private UserService userService;
	
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

	@Override
	public List<UserRating> findAllUserRatingsByMovieId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double findAvgUserRatingsByMovieId(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
