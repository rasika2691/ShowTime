package io.rasika.ShowTime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.rasika.ShowTime.entity.UserRating;
import io.rasika.ShowTime.service.UserRatingService;

@RestController
@RequestMapping(value= "/UserRatings")
public class UserRatingController {
	
	@Autowired
	private UserRatingService service;
	
	@RequestMapping (method = RequestMethod.GET)
	public List<UserRating> findAll(){
		return service.findAll();
	}
	
		
	@RequestMapping (method = RequestMethod.POST)
	public UserRating create(@RequestBody UserRating UserRat){
		return service.create(UserRat);
	}
	
	
}
