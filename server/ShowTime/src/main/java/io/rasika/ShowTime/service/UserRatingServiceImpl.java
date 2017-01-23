package io.rasika.ShowTime.service;

import java.util.List;


import io.rasika.ShowTime.entity.Movie;
import io.rasika.ShowTime.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.rasika.ShowTime.entity.UserRating;
import io.rasika.ShowTime.exception.EntityNotFoundException;
import io.rasika.ShowTime.repository.UserRatingRepository;
@Service
@Transactional
public class UserRatingServiceImpl implements UserRatingService {

	@Autowired
	private UserRatingRepository repository;
	@Autowired
	private MovieService movieService;
	
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
		String movieId= UserRat.getMv().getMovieId();
		String userId=UserRat.getUr().getUserId();
		
		Movie movie=movieService.findOne(movieId);
		User user=userService.findOne(userId);
		
		if(movie==null){
			throw new EntityNotFoundException("Movie with id:"+movieId+" Not found");
		}
		
		if(user==null){
			throw new EntityNotFoundException("User with id:"+userId+" Not found");
		}
		
		UserRat.setMv(movie);
		UserRat.setUr(user);
		return repository.create(UserRat);
		
	}

	@Override
	public List<UserRating> findAllUserRatingsByMovieId(String id) {
		// TODO Auto-generated method stub
		Movie existing= movieService.findOne(id);
		if(existing==null){
			throw new EntityNotFoundException("User Ratings for movie Not Found");
		}
		
		return repository.findAllUserRatingsByMovieId(id);
		
	}

//	@Override
//	public double findAvgUserRatingsByMovieId(String id) {
//		// TODO Auto-generated method stub
//        List<UserRating> existing=repository.findAllUserRatingsByMovieId(id);
//		
//		if(existing.size()==0){
//
//			throw new EntityNotFoundException("User ratings for the id:"+id+" Not found");
//					}
//		
//		return repository.findAvgUserRatingsByMovieId(id);
// 	}

	@Override
	public UserRating findOne(String id) {
		// TODO Auto-generated method stub
		UserRating existing=repository.findOne(id);
		if(existing==null){
			throw new EntityNotFoundException("User Rating Not Found");
			
		}
		
		return repository.findOne(id);
	}

	

}
